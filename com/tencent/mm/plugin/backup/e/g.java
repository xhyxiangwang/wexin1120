package com.tencent.mm.plugin.backup.e;

import android.graphics.Bitmap.CompressFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.lq;
import com.tencent.mm.g.a.lq.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.backup.h.u;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.protocal.c.axt;
import com.tencent.mm.protocal.c.eh;
import com.tencent.mm.sdk.platformtools.aw;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aj;
import com.tencent.mm.storage.au;
import com.tencent.mm.w.f.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class g
  implements e
{
  public g()
  {
    GMTrace.i(14817234518016L, 110397);
    GMTrace.o(14817234518016L, 110397);
  }
  
  private static int b(eh parameh, boolean paramBoolean1, au paramau, String paramString, LinkedList<u> paramLinkedList, HashMap<Long, a.c> paramHashMap, boolean paramBoolean2, long paramLong)
  {
    GMTrace.i(14817502953472L, 110399);
    int j;
    String str;
    int i;
    if (bg.mZ(paramau.field_content))
    {
      j = 0;
      str = paramau.field_content;
      localObject1 = str;
      if (paramau.field_isSend != 1)
      {
        localObject1 = str;
        if (com.tencent.mm.plugin.backup.g.d.dW(paramau.field_talker))
        {
          i = paramau.field_content.indexOf(':');
          localObject1 = str;
          if (i != -1) {
            localObject1 = paramau.field_content.substring(i + 1);
          }
        }
      }
      localObject1 = bg.RE((String)localObject1);
      if (localObject1 == null) {
        break label1210;
      }
    }
    label1210:
    for (Object localObject1 = f.a.eC((String)localObject1);; localObject1 = null)
    {
      if (localObject1 == null)
      {
        w.e("MicroMsg.MMBakItemAppMsg", "content is null");
        GMTrace.o(14817502953472L, 110399);
        return 0;
        j = paramau.field_content.getBytes().length;
        break;
      }
      w.d("MicroMsg.MMBakItemAppMsg", "content type " + ((f.a)localObject1).type);
      str = com.tencent.mm.plugin.backup.g.a.afe().aff().IW().v(paramau.field_imgPath, true);
      if (com.tencent.mm.a.e.aZ(str))
      {
        j += b.a(new b.a(str, parameh, paramLinkedList, 6, paramBoolean1, "_thumb", paramBoolean2));
        i = j;
        switch (((f.a)localObject1).type)
        {
        default: 
          i = j;
        }
      }
      for (;;)
      {
        GMTrace.o(14817502953472L, 110399);
        return i;
        if (((f.a)localObject1).type != 2) {
          break;
        }
        GMTrace.o(14817502953472L, 110399);
        return -1;
        i = j;
        if (!bg.mZ(((f.a)localObject1).ftH))
        {
          paramString = com.tencent.mm.plugin.backup.g.a.afe().aff().afn().Nx(((f.a)localObject1).ftH);
          if ((paramString == null) || (!paramString.aCI()))
          {
            i = j;
            if (paramau.field_isSend == 1)
            {
              i = j;
              if (paramString != null)
              {
                i = j;
                if (!paramString.field_isUpload) {}
              }
            }
          }
          else
          {
            paramau = paramString.field_fileFullPath;
            i = j;
            if (com.tencent.mm.a.e.aZ(paramau))
            {
              w.d("MicroMsg.MMBakItemAppMsg", "image " + paramau);
              i = j + b.a(new b.a(paramau, parameh, paramLinkedList, 8, paramBoolean1, paramBoolean2, null));
              continue;
              com.tencent.mm.pluginsdk.model.app.b localb = com.tencent.mm.plugin.backup.g.a.afe().aff().afn().Nx(((f.a)localObject1).ftH);
              if ((localb == null) || (!localb.aCI()))
              {
                i = j;
                if (paramau.field_isSend == 1)
                {
                  i = j;
                  if (localb != null)
                  {
                    i = j;
                    if (!localb.field_isUpload) {}
                  }
                }
              }
              else
              {
                w.d("MicroMsg.MMBakItemAppMsg", "full path " + localb.field_fileFullPath);
                i = j;
                if (com.tencent.mm.a.e.aZ(localb.field_fileFullPath)) {
                  if (paramBoolean1)
                  {
                    i = j + b.a(new b.a(localb.field_fileFullPath, parameh, paramLinkedList, 7, paramBoolean1, paramBoolean2, null));
                  }
                  else
                  {
                    if ((com.tencent.mm.plugin.backup.a.e.adJ() == 1) && (((f.a)localObject1).haP / 1024 >= paramLong) && (((f.a)localObject1).filemd5 != null))
                    {
                      Object localObject2;
                      if (paramau.field_isSend == 1)
                      {
                        localObject2 = paramau.field_talker;
                        str = paramString;
                        paramString = (String)localObject2;
                      }
                      for (;;)
                      {
                        localObject2 = new u();
                        j += b.a(new b.a(localb.field_fileFullPath, parameh, paramLinkedList, 7, paramBoolean1, true, (u)localObject2));
                        i = j;
                        if (paramHashMap == null) {
                          break;
                        }
                        parameh = new a.c();
                        parameh.jPt = ((u)localObject2);
                        parameh.fwU = ((f.a)localObject1).filemd5;
                        parameh.jPv = (str + "_" + paramString + "_" + paramau.field_msgSvrId + "_backup");
                        parameh.jPu = paramau.field_msgSvrId;
                        paramHashMap.put(Long.valueOf(paramau.field_msgSvrId), parameh);
                        i = j;
                        break;
                        str = paramau.field_talker;
                      }
                    }
                    i = j + b.a(new b.a(localb.field_fileFullPath, parameh, paramLinkedList, 7, paramBoolean1, paramBoolean2, null));
                    continue;
                    paramString = com.tencent.mm.plugin.backup.g.a.afe().aff().afn().Nx(((f.a)localObject1).ftH);
                    if ((paramString == null) || (!paramString.aCI()))
                    {
                      i = j;
                      if (paramau.field_isSend == 1)
                      {
                        i = j;
                        if (paramString != null)
                        {
                          i = j;
                          if (!paramString.field_isUpload) {}
                        }
                      }
                    }
                    else
                    {
                      w.d("MicroMsg.MMBakItemAppMsg", "full path " + paramString.field_fileFullPath);
                      i = j;
                      if (com.tencent.mm.a.e.aZ(paramString.field_fileFullPath))
                      {
                        i = j + b.a(new b.a(paramString.field_fileFullPath, parameh, paramLinkedList, 7, paramBoolean1, paramBoolean2, null));
                        continue;
                        paramString = new lq();
                        paramString.fJx.fId = ((f.a)localObject1).hbp;
                        paramString.fJx.fvM = paramau.field_msgId;
                        com.tencent.mm.sdk.b.a.uLm.m(paramString);
                        w.i("MicroMsg.MMBakItemAppMsg", "pathList:%s", new Object[] { paramString.fJy.fJz });
                        paramau = paramString.fJy.fJz.split(":");
                        i = j;
                        j = 0;
                        if (j < paramau.length)
                        {
                          if (com.tencent.mm.a.e.aZ(paramau[j]))
                          {
                            w.i("MicroMsg.MMBakItemAppMsg", "record file exit:%s, index:%d", new Object[] { paramau[j], Integer.valueOf(j) });
                            i += b.a(new b.a(paramau[j], parameh, paramLinkedList, 7, paramBoolean1, "_fav." + j, paramBoolean2));
                          }
                          for (;;)
                          {
                            j += 1;
                            break;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public final int a(eh parameh, boolean paramBoolean1, au paramau, String paramString, LinkedList<u> paramLinkedList, HashMap<Long, a.c> paramHashMap, boolean paramBoolean2, long paramLong)
  {
    GMTrace.i(14817368735744L, 110398);
    switch (paramau.field_type)
    {
    default: 
      i = b(parameh, paramBoolean1, paramau, paramString, paramLinkedList, paramHashMap, paramBoolean2, paramLong);
      GMTrace.o(14817368735744L, 110398);
      return i;
    case 285212721: 
    case 486539313: 
      if (bg.mZ(paramau.field_content)) {}
      for (i = 0; paramBoolean1; i = paramau.field_content.getBytes().length)
      {
        GMTrace.o(14817368735744L, 110398);
        return i;
      }
      paramau = a.sS(paramau.field_content);
      if (bg.mZ(paramau))
      {
        GMTrace.o(14817368735744L, 110398);
        return 0;
      }
      paramString = new axt();
      paramString.Qx(bg.ap(paramau, ""));
      parameh.tvq = paramString;
      GMTrace.o(14817368735744L, 110398);
      return i;
    }
    if (bg.mZ(paramau.field_content)) {}
    for (int i = 0; paramau.field_content == null; i = paramau.field_content.getBytes().length)
    {
      GMTrace.o(14817368735744L, 110398);
      return -1;
    }
    paramHashMap = aj.Tm(paramau.field_content).veD.trim();
    paramString = paramHashMap;
    if (!com.tencent.mm.plugin.backup.a.h.sL(paramHashMap))
    {
      paramHashMap = paramau.field_content;
      paramString = paramHashMap;
      if (!com.tencent.mm.plugin.backup.a.h.sL(paramHashMap))
      {
        w.e("MicroMsg.MMBakItemAppMsg", "get xml error " + paramHashMap);
        GMTrace.o(14817368735744L, 110398);
        return 0;
      }
    }
    int j = i;
    if (!bg.mZ(paramString))
    {
      paramHashMap = new axt();
      paramHashMap.Qx(bg.ap(paramString, ""));
      parameh.tvq = paramHashMap;
      paramString = f.a.eC(paramString);
      paramHashMap = com.tencent.mm.plugin.backup.g.a.afe().aff().zc();
      paramau = com.tencent.mm.plugin.backup.g.a.afe().aff().IW().v(paramau.field_imgPath, true);
      paramString = paramHashMap + paramString.haR;
      if (com.tencent.mm.a.e.aY(paramau) <= 0)
      {
        GMTrace.o(14817368735744L, 110398);
        return -1;
      }
      j = b.a(new b.a(paramau, parameh, paramLinkedList, 6, paramBoolean1, "_thumb", paramBoolean2));
      paramau = aj.Tm(n.a(parameh.tvq));
      j = i + j + b.a(new b.a(paramString, parameh, paramLinkedList, paramBoolean1, paramBoolean2, com.tencent.mm.plugin.backup.g.a.afe().aff().afm().TQ(paramau.fwU)));
    }
    GMTrace.o(14817368735744L, 110398);
    return j;
  }
  
  public final int a(String paramString, eh parameh, au paramau)
  {
    GMTrace.i(14817637171200L, 110400);
    Object localObject3 = parameh.tvo.usj;
    Object localObject2 = parameh.tvq.usj;
    if (localObject2 == null)
    {
      GMTrace.o(14817637171200L, 110400);
      return 0;
    }
    paramau.setContent((String)localObject2);
    Object localObject1 = localObject2;
    int i;
    if (paramau.field_isSend != 1)
    {
      localObject1 = localObject2;
      if (com.tencent.mm.plugin.backup.g.d.dW((String)localObject3))
      {
        i = com.tencent.mm.plugin.backup.g.d.gy(parameh.tvq.usj);
        localObject1 = localObject2;
        if (i != -1) {
          localObject1 = (parameh.tvq.usj + " ").substring(i + 2).trim();
        }
      }
    }
    Object localObject4 = bg.RE((String)localObject1);
    localObject3 = f.a.eC((String)localObject4);
    if (localObject3 == null)
    {
      w.e("MicroMsg.MMBakItemAppMsg", "parse app message failed, insert failed");
      GMTrace.o(14817637171200L, 110400);
      return 0;
    }
    if (((f.a)localObject3).type == 2000)
    {
      paramau.setType(419430449);
      com.tencent.mm.plugin.backup.g.d.i(paramau);
      GMTrace.o(14817637171200L, 110400);
      return 0;
    }
    if ((((f.a)localObject3).type == 19) || (((f.a)localObject3).type == 24))
    {
      paramau.setType(com.tencent.mm.pluginsdk.model.app.l.d((f.a)localObject3));
      com.tencent.mm.plugin.backup.g.d.i(paramau);
      paramString = new lq();
      paramString.fJx.fId = ((f.a)localObject3).hbp;
      paramString.fJx.fvM = paramau.field_msgId;
      com.tencent.mm.sdk.b.a.uLm.m(paramString);
      w.i("MicroMsg.MMBakItemAppMsg", "pathList:%s", new Object[] { paramString.fJy.fJz });
      paramString = paramString.fJy.fJz.split(":");
      i = 0;
      while (i < paramString.length)
      {
        paramau = com.tencent.mm.plugin.backup.a.h.a(parameh, 7, "." + i);
        if (!bg.mZ(paramau))
        {
          w.i("MicroMsg.MMBakItemAppMsg", "record media exit:%s, index:%d", new Object[] { paramau, Integer.valueOf(i) });
          j.r(com.tencent.mm.plugin.backup.a.h.sM(paramau), paramString[i], false);
        }
        i += 1;
      }
      GMTrace.o(14817637171200L, 110400);
      return 0;
    }
    localObject1 = new com.tencent.mm.pluginsdk.model.app.f();
    ((com.tencent.mm.pluginsdk.model.app.f)localObject1).field_appId = ((f.a)localObject3).appId;
    localObject2 = com.tencent.mm.plugin.backup.g.a.afe().aff();
    if (((com.tencent.mm.plugin.backup.g.c)localObject2).uin == 0) {
      throw new com.tencent.mm.x.b();
    }
    if ((((com.tencent.mm.plugin.backup.g.c)localObject2).jSu.b((com.tencent.mm.sdk.e.c)localObject1, new String[0])) && (((com.tencent.mm.pluginsdk.model.app.f)localObject1).field_appVersion < ((f.a)localObject3).fNP)) {
      com.tencent.mm.plugin.backup.g.a.afe().afg().c(1, ((f.a)localObject3).appId);
    }
    paramau.setType(com.tencent.mm.pluginsdk.model.app.l.d((f.a)localObject3));
    localObject1 = com.tencent.mm.plugin.backup.a.h.b(parameh, 6);
    if ((localObject1 != null) && (paramau.field_msgId == 0L)) {
      if (((f.a)localObject3).type != 2) {
        break label740;
      }
    }
    com.tencent.mm.w.f localf;
    com.tencent.mm.plugin.backup.g.c localc;
    label740:
    for (boolean bool = true;; bool = false)
    {
      localObject1 = com.tencent.mm.plugin.backup.g.a.afe().aff().IW().a((byte[])localObject1, bool, Bitmap.CompressFormat.PNG);
      w.d("MicroMsg.MMBakItemAppMsg", com.tencent.mm.compatible.util.g.tH() + " thumbData MsgInfo path:" + (String)localObject1);
      if (!bg.mZ((String)localObject1))
      {
        paramau.cX((String)localObject1);
        w.d("MicroMsg.MMBakItemAppMsg", "new thumbnail saved, path:" + (String)localObject1);
      }
      localObject2 = com.tencent.mm.plugin.backup.a.h.a(parameh, 8);
      i = com.tencent.mm.plugin.backup.a.h.c(parameh, 8);
      localObject1 = localObject2;
      if (bg.mZ((String)localObject2))
      {
        localObject1 = com.tencent.mm.plugin.backup.a.h.a(parameh, 7);
        i = com.tencent.mm.plugin.backup.a.h.c(parameh, 7);
      }
      localObject2 = com.tencent.mm.plugin.backup.a.h.sM((String)localObject1);
      com.tencent.mm.plugin.backup.g.d.i(paramau);
      localf = new com.tencent.mm.w.f();
      ((f.a)localObject3).a(localf);
      localf.field_msgId = paramau.field_msgId;
      localc = com.tencent.mm.plugin.backup.g.a.afe().aff();
      if (localc.uin != 0) {
        break;
      }
      throw new com.tencent.mm.x.b();
    }
    localc.jSt.b(localf);
    long l;
    if (!bg.mZ((String)localObject1))
    {
      localObject1 = com.tencent.mm.plugin.backup.g.a.afe().aff().yN();
      if (paramString.equals(parameh.tvo.usj)) {}
      for (paramString = parameh.tvp.usj;; paramString = parameh.tvo.usj)
      {
        localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.a.c)localObject1).A(paramString, parameh.tvv);
        parameh = com.tencent.mm.plugin.backup.g.a.afe().aff().afn().Nx(((f.a)localObject3).ftH);
        paramString = parameh;
        if (parameh != null) {
          break label1138;
        }
        w.i("MicroMsg.MMBakItemAppMsg", "recover AppAttachInfo is null.");
        l = ((ce)localObject1).field_msgId;
        localObject4 = f.a.eC((String)localObject4);
        if (localObject4 != null)
        {
          paramString = com.tencent.mm.pluginsdk.model.app.l.Z(com.tencent.mm.compatible.util.e.gKy, ((f.a)localObject4).title, ((f.a)localObject4).haQ);
          int j = ((f.a)localObject4).sdkVer;
          parameh = ((f.a)localObject4).appId;
          localObject1 = ((f.a)localObject4).ftH;
          int k = ((f.a)localObject4).haP;
          localObject4 = new com.tencent.mm.pluginsdk.model.app.b();
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_fileFullPath = paramString;
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_appId = parameh;
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_sdkVer = j;
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_mediaSvrId = ((String)localObject1);
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_totalLen = k;
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_status = 101L;
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_isUpload = false;
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_createTime = bg.Pp();
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_lastModifyTime = bg.Po();
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_msgInfoId = l;
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_netTimes = 0L;
          com.tencent.mm.plugin.backup.g.a.afe().aff().afn().b((com.tencent.mm.sdk.e.c)localObject4);
          w.e("MicroMsg.TempStorageLogic", "initDownloadAttach insert error, msgLocalId[%d]", new Object[] { Long.valueOf(l) });
        }
        parameh = com.tencent.mm.plugin.backup.g.a.afe().aff().afn().Nx(((f.a)localObject3).ftH);
        if (parameh != null) {
          break;
        }
        w.e("MicroMsg.MMBakItemAppMsg", "getAppAttachInfoStg().getByMediaId is null! attachid[%s]", new Object[] { ((f.a)localObject3).ftH });
        GMTrace.o(14817637171200L, 110400);
        return 0;
      }
      paramString = parameh;
      if (((f.a)localObject3).haP != 0)
      {
        paramString = parameh;
        if (i != 0)
        {
          if (i >= ((f.a)localObject3).haP) {
            break label1207;
          }
          if (paramau.field_isSend != 1) {
            break label1195;
          }
          parameh.field_status = 105L;
          paramString = parameh;
        }
      }
    }
    for (;;)
    {
      label1138:
      l = i;
      paramString.field_offset = l;
      paramString.field_totalLen = l;
      j.r((String)localObject2, paramString.field_fileFullPath, false);
      com.tencent.mm.plugin.backup.g.a.afe().aff().afn().c(paramString, new String[0]);
      GMTrace.o(14817637171200L, 110400);
      return 0;
      label1195:
      parameh.field_status = 102L;
      paramString = parameh;
      continue;
      label1207:
      parameh.field_status = 199L;
      paramString = parameh;
    }
  }
  
  private static final class a
  {
    public static String jPN;
    public static String jPO;
    public static String jPP;
    
    static
    {
      GMTrace.i(14813476421632L, 110369);
      jPP = "]]>";
      jPN = "<msg>";
      jPO = "</msg>";
      GMTrace.o(14813476421632L, 110369);
    }
    
    public static String sS(String paramString)
    {
      GMTrace.i(14813342203904L, 110368);
      com.tencent.mm.w.k localk = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.biz.a.a.class)).tf(paramString);
      a locala = new a(paramString);
      if (!locala.jPR)
      {
        w.e("MicroMsg.AppmsgConvert", "buffer error");
        GMTrace.o(14813342203904L, 110368);
        return "";
      }
      b localb = new b();
      Object localObject1 = localk.hdL;
      Object localObject3 = new HashMap();
      localb.sT("msg");
      ((Map)localObject3).put("appid", (String)locala.jPQ.get(".msg.appmsg.$appid"));
      ((Map)localObject3).put("sdkver", (String)locala.jPQ.get(".msg.appmsg.$sdkver"));
      localb.f("appmsg", (Map)localObject3);
      paramString = (String)localObject1;
      if (localObject1 == null) {
        paramString = new LinkedList();
      }
      Object localObject2;
      String str1;
      int i;
      if (paramString.size() == 0)
      {
        localObject2 = "";
        localObject1 = "";
        str1 = "";
        localb.bm("title", (String)localObject2);
        localb.bm("des", (String)locala.jPQ.get(".msg.appmsg.des"));
        localb.bm("action", (String)locala.jPQ.get(".msg.appmsg.action"));
        localb.aD("type", locala.getInt(".msg.appmsg.type"));
        localb.aD("showtype", locala.getInt(".msg.appmsg.showtype"));
        localb.bm("content", (String)locala.jPQ.get(".msg.appmsg.content"));
        localb.bm("url", (String)localObject1);
        localb.bm("lowurl", (String)locala.jPQ.get(".msg.appmsg.lowurl"));
        localb.sT("appattach");
        localb.aD("totallen", locala.getInt(".msg.appmsg.appattach.totallen"));
        localb.bm("attachid", (String)locala.jPQ.get(".msg.appmsg.appattach.attachid"));
        localb.bm("fileext", (String)locala.jPQ.get(".msg.appmsg.appattach.fileext"));
        localb.sU("appattach");
        localb.sT("mmreader");
        ((Map)localObject3).put("type", localk.type);
        ((Map)localObject3).put("convMsgCount", paramString.size());
        localb.f("category", (Map)localObject3);
        localb.bm("name", localk.fMc);
        localb.sT("topnew");
        localb.bm("cover", (String)locala.jPQ.get(".msg.appmsg.mmreader.category.topnew.cover"));
        localb.bm("width", (String)locala.jPQ.get(".msg.appmsg.mmreader.category.topnew.width"));
        localb.bm("height", (String)locala.jPQ.get(".msg.appmsg.mmreader.category.topnew.height"));
        localb.bm("digest", str1);
        localb.sU("topnew");
        i = 0;
        label563:
        if (i >= paramString.size()) {
          break label990;
        }
        localb.sT("item");
        if (paramString.get(i) != null)
        {
          localObject1 = ((com.tencent.mm.w.l)paramString.get(i)).title;
          localObject2 = ((com.tencent.mm.w.l)paramString.get(i)).url;
          str1 = ((com.tencent.mm.w.l)paramString.get(i)).hdP;
          localObject3 = ((com.tencent.mm.w.l)paramString.get(i)).hdQ;
          String str2 = ((com.tencent.mm.w.l)paramString.get(i)).time;
          String str3 = ((com.tencent.mm.w.l)paramString.get(i)).hdR;
          String str4 = ((com.tencent.mm.w.l)paramString.get(i)).hdS;
          String str5 = ((com.tencent.mm.w.l)paramString.get(i)).hdT;
          localb.bm("title", (String)localObject1);
          localb.bm("url", (String)localObject2);
          localb.bm("shorturl", str1);
          localb.bm("longurl", (String)localObject3);
          localb.bm("pub_time", str2);
          localb.bm("cover", str3);
          localb.bm("tweetid", str4);
          localb.bm("digest", str5);
          localObject2 = new StringBuilder(".msg.appmsg.mmreader.category.item");
          if (i != 0) {
            break label982;
          }
        }
      }
      label982:
      for (localObject1 = "";; localObject1 = String.valueOf(i))
      {
        localObject1 = (String)localObject1;
        localb.bm("fileid", (String)locala.jPQ.get((String)localObject1 + ".fileid"));
        localb.sT("source");
        localb.sT("source");
        localb.bm("name", localk.fMc);
        localb.sU("source");
        localb.sU("source");
        localb.sU("item");
        i += 1;
        break label563;
        localObject2 = ((com.tencent.mm.w.l)paramString.get(0)).title;
        localObject1 = ((com.tencent.mm.w.l)paramString.get(0)).url;
        str1 = ((com.tencent.mm.w.l)paramString.get(0)).hdR;
        str1 = ((com.tencent.mm.w.l)paramString.get(0)).hdT;
        break;
      }
      label990:
      localb.sU("category");
      localb.sT("publisher");
      localb.bm("convName", localk.fMb);
      localb.bm("nickname", localk.fMc);
      localb.sU("publisher");
      localb.sU("mmreader");
      localb.sU("appmsg");
      localb.bm("fromusername", localk.fMb);
      localb.aD("scene", locala.getInt(".msg.scene"));
      localb.sT("appinfo");
      localb.bm("version", (String)locala.jPQ.get(".msg.appinfo.appname"));
      localb.bm("appname", (String)locala.jPQ.get(".msg.appinfo.version"));
      localb.sU("appinfo");
      localb.bm("commenturl", localk.gpe);
      localb.sU("msg");
      w.d("MicroMsg.AppmsgConvert", "xml " + localb.jPS.toString());
      paramString = localb.jPS.toString();
      GMTrace.o(14813342203904L, 110368);
      return paramString;
    }
    
    static final class a
    {
      Map<String, String> jPQ;
      boolean jPR;
      
      public a(String paramString)
      {
        GMTrace.i(14812268462080L, 110360);
        this.jPQ = null;
        this.jPR = true;
        this.jPQ = aw.Rl(paramString);
        if (this.jPQ == null)
        {
          this.jPR = false;
          this.jPQ = new HashMap();
        }
        GMTrace.o(14812268462080L, 110360);
      }
      
      final int getInt(String paramString)
      {
        GMTrace.i(14812402679808L, 110361);
        if (!this.jPQ.containsKey(paramString))
        {
          GMTrace.o(14812402679808L, 110361);
          return 0;
        }
        int i = bg.getInt((String)this.jPQ.get(paramString), 0);
        GMTrace.o(14812402679808L, 110361);
        return i;
      }
    }
    
    static final class b
    {
      StringBuffer jPS;
      
      b()
      {
        GMTrace.i(14817771388928L, 110401);
        this.jPS = new StringBuffer();
        GMTrace.o(14817771388928L, 110401);
      }
      
      public final void aD(String paramString, int paramInt)
      {
        GMTrace.i(14818308259840L, 110405);
        sT(paramString);
        this.jPS.append(paramInt);
        sU(paramString);
        GMTrace.o(14818308259840L, 110405);
      }
      
      public final void bm(String paramString1, String paramString2)
      {
        GMTrace.i(14818174042112L, 110404);
        sT(paramString1);
        if (!bg.mZ(paramString2))
        {
          if (!paramString2.contains(g.a.jPP)) {
            break label76;
          }
          this.jPS.append("<![CDATA[" + bg.RD(paramString2) + "]]>");
        }
        for (;;)
        {
          sU(paramString1);
          GMTrace.o(14818174042112L, 110404);
          return;
          label76:
          this.jPS.append("<![CDATA[" + paramString2 + "]]>");
        }
      }
      
      public final void f(String paramString, Map<String, String> paramMap)
      {
        GMTrace.i(14818442477568L, 110406);
        this.jPS.append("<" + paramString);
        paramString = paramMap.keySet().iterator();
        while (paramString.hasNext())
        {
          String str1 = (String)paramString.next();
          String str2 = (String)paramMap.get(str1);
          this.jPS.append(" " + str1 + " =  \"" + str2 + "\" ");
        }
        this.jPS.append(">");
        paramMap.clear();
        GMTrace.o(14818442477568L, 110406);
      }
      
      public final void sT(String paramString)
      {
        GMTrace.i(14817905606656L, 110402);
        this.jPS.append("<" + paramString + ">");
        GMTrace.o(14817905606656L, 110402);
      }
      
      public final void sU(String paramString)
      {
        GMTrace.i(14818039824384L, 110403);
        this.jPS.append("</" + paramString + ">");
        GMTrace.o(14818039824384L, 110403);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/e/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */