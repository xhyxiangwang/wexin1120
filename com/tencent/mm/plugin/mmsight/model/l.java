package com.tencent.mm.plugin.mmsight.model;

import android.media.MediaMetadataRetriever;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.sight.base.b;
import com.tencent.mm.protocal.c.aly;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;

public final class l
{
  public static boolean a(String paramString, VideoTransPara paramVideoTransPara, aly paramaly, d paramd)
  {
    GMTrace.i(18678812770304L, 139168);
    Object localObject = paramaly;
    try
    {
      boolean bool = bg.mZ(paramString);
      if ((bool) || (paramVideoTransPara == null))
      {
        GMTrace.o(18678812770304L, 139168);
        return false;
      }
      aly localaly = paramaly;
      if (paramaly == null)
      {
        localObject = paramaly;
        localaly = new aly();
      }
      localObject = localaly;
      w.i("MicroMsg.SightSendVideoLogic", "check localCaptureVideo %s videoPath %s videoParams %s, finishPreSendProcess: %s", new Object[] { Boolean.valueOf(localaly.ugK), paramString, paramVideoTransPara, Boolean.valueOf(localaly.ugO) });
      localObject = localaly;
      if (localaly.ugO)
      {
        localObject = localaly;
        w.i("MicroMsg.SightSendVideoLogic", "checkShouldRemuxing, already finish preSendProcess, videoPath: %s", new Object[] { paramString });
        GMTrace.o(18678812770304L, 139168);
        return false;
      }
      localObject = localaly;
      if (localaly.ugK)
      {
        localObject = localaly;
        if (!bg.mZ(paramString))
        {
          localObject = localaly;
          SightVideoJNI.tagMP4Dscp(paramString, com.tencent.mm.modelcontrol.d.Gs().getWeixinMeta());
          localObject = localaly;
          if (!bg.mZ(localaly.ugN))
          {
            localObject = localaly;
            SightVideoJNI.tagMp4RecordInfo(paramString, localaly.ugN);
          }
          localObject = localaly;
          long l = bg.Pq();
          localObject = localaly;
          SightVideoJNI.optimizeMP4(paramString);
          localObject = localaly;
          w.i("MicroMsg.SightSendVideoLogic", "optimizeMP4 used %sms", new Object[] { Long.valueOf(bg.aG(l)) });
          localObject = localaly;
          paramd.aMV();
          localObject = localaly;
          paramaly = new MediaMetadataRetriever();
          localObject = localaly;
          paramaly.setDataSource(paramString);
          localObject = localaly;
          int i = bg.getInt(paramaly.extractMetadata(18), 0);
          localObject = localaly;
          int j = bg.getInt(paramaly.extractMetadata(19), 0);
          localObject = localaly;
          paramaly.release();
          localObject = localaly;
          w.i("MicroMsg.SightSendVideoLogic", "videopath %d %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          localObject = localaly;
          i = Math.min(i, j);
          localObject = localaly;
          if (i > paramVideoTransPara.width)
          {
            localObject = localaly;
            if ((i <= paramVideoTransPara.width) || (i % 16 != 0)) {
              break label474;
            }
            localObject = localaly;
            if (Math.abs(i - paramVideoTransPara.width) >= 16) {
              break label474;
            }
          }
          localObject = localaly;
          bool = localaly.ugJ;
          if (!bool) {
            break label454;
          }
          GMTrace.o(18678812770304L, 139168);
          return true;
        }
      }
      GMTrace.o(18678812770304L, 139168);
      return false;
      label454:
      localObject = localaly;
      localaly.ugO = true;
      GMTrace.o(18678812770304L, 139168);
      return false;
      label474:
      GMTrace.o(18678812770304L, 139168);
      return true;
    }
    catch (Exception paramVideoTransPara)
    {
      w.e("MicroMsg.SightSendVideoLogic", "checkShouldRemuxing error: %s %s", new Object[] { paramVideoTransPara.getMessage(), paramString });
      if (localObject != null) {
        ((aly)localObject).ugO = true;
      }
      GMTrace.o(18678812770304L, 139168);
    }
    return false;
  }
  
  public static int b(String paramString, VideoTransPara paramVideoTransPara, aly paramaly, d paramd)
  {
    GMTrace.i(18678946988032L, 139169);
    if ((paramaly == null) || (!paramaly.ugK) || (!FileOp.aZ(paramString)))
    {
      GMTrace.o(18678946988032L, 139169);
      return -1;
    }
    if (paramaly.ugO) {
      w.i("MicroMsg.SightSendVideoLogic", "doRemuxingSendVideoMsg, already finish preSendProcess, videoPath: %s", new Object[] { paramString });
    }
    for (;;)
    {
      int i;
      int n;
      int i1;
      try
      {
        Object localObject = FileOp.kK(paramString);
        if (((String)localObject).endsWith("/")) {
          break label746;
        }
        localObject = (String)localObject + "/";
        String str1 = new File(paramString).getName();
        i = str1.lastIndexOf('.');
        if (i > 0)
        {
          str1 = str1.substring(0, i);
          String str3 = (String)localObject + str1 + "_hd";
          String str2 = str3;
          if (paramString.endsWith(".mp4")) {
            str2 = str3 + ".mp4";
          }
          str3 = (String)localObject + str1 + "tempRemuxing.mp4";
          FileOp.o(paramString, str2);
          w.i("MicroMsg.SightSendVideoLogic", "doRemuxingSendVideoMsg, dir: %s, oldFileName: %s, hdFilePath: %s, remuxingOutputFile: %s extInfotrycount %d", new Object[] { localObject, str1, str2, str3, Integer.valueOf(paramaly.ugL) });
          localObject = new MediaMetadataRetriever();
          ((MediaMetadataRetriever)localObject).setDataSource(str2);
          n = bg.getInt(((MediaMetadataRetriever)localObject).extractMetadata(18), 0);
          i1 = bg.getInt(((MediaMetadataRetriever)localObject).extractMetadata(19), 0);
          i = Math.min(n, i1);
          j = paramVideoTransPara.width;
          if (i < j)
          {
            GMTrace.o(18678946988032L, 139169);
            return 0;
          }
          i = Math.min(n, i1);
          if (i <= paramVideoTransPara.width) {
            break label749;
          }
          if ((i > paramVideoTransPara.width) && (i % 16 == 0) && (Math.abs(i - paramVideoTransPara.width) < 16))
          {
            break label749;
            w.i("MicroMsg.SightSendVideoLogic", "start remuxing %s,  rawwith %s, rawheight %s, outputWidth: %s, outputHeight: %s videoParams: %s", new Object[] { paramString, Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(j), Integer.valueOf(m), paramVideoTransPara });
            long l = bg.Pq();
            i = SightVideoJNI.remuxing(str2, str3, j, m, paramVideoTransPara.htI, paramVideoTransPara.hty, 8, paramVideoTransPara.htx, 25.0F, 30.0F, null, 0, b.pAJ);
            w.i("MicroMsg.SightSendVideoLogic", "doremuxing finish %s,  rawwith %s, rawheight %s, outputWidth: %s, outputHeight: %s duration: %s, used %sms", new Object[] { paramString, Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(j), Integer.valueOf(m), Integer.valueOf(i), Long.valueOf(bg.aG(l)) });
            FileOp.ak(str3, paramString);
            l = bg.Pq();
            if (paramaly.ugK)
            {
              SightVideoJNI.tagMP4Dscp(paramString, com.tencent.mm.modelcontrol.d.Gs().getWeixinMeta());
              if (!bg.mZ(paramaly.ugN)) {
                SightVideoJNI.tagMp4RecordInfo(paramString, paramaly.ugN);
              }
              SightVideoJNI.optimizeMP4(paramString);
            }
            paramd.aMV();
            w.i("MicroMsg.SightSendVideoLogic", "tagMP4Dscp used %sms", new Object[] { Long.valueOf(bg.aG(l)) });
            GMTrace.o(18678946988032L, 139169);
            return i;
          }
          double d;
          if (n < i1)
          {
            i = paramVideoTransPara.width;
            d = 1.0D * n / i;
            j = (int)(i1 / d);
          }
          else
          {
            j = paramVideoTransPara.width;
            d = 1.0D * i1 / j;
            i = (int)(n / d);
          }
        }
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.SightSendVideoLogic", "doRemuxingSendVideoMsg error: %s", new Object[] { paramString.getMessage() });
        GMTrace.o(18678946988032L, 139169);
        return -1;
      }
      continue;
      label746:
      continue;
      label749:
      int m = i1;
      int j = n;
      continue;
      int k = j;
      if (j % 2 != 0) {
        k = j + 1;
      }
      j = i;
      m = k;
      if (i % 2 != 0)
      {
        j = i + 1;
        m = k;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/mmsight/model/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */