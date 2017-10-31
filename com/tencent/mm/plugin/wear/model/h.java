package com.tencent.mm.plugin.wear.model;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.rx;
import com.tencent.mm.g.a.rx.b;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.j.a;
import com.tencent.mm.protocal.c.bpr;
import com.tencent.mm.protocal.c.bqi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.au.a;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.x;
import com.tencent.mm.w.f.a;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.ay;
import com.tencent.mm.x.m;
import com.tencent.mm.x.o;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public final class h
{
  public static final Bitmap Ke(String paramString)
  {
    GMTrace.i(9172036878336L, 68337);
    Bitmap localBitmap = a.b.bHN().bs(paramString);
    if (localBitmap == null)
    {
      com.tencent.mm.ab.n.Dh();
      paramString = com.tencent.mm.ab.d.r(paramString, false);
      w.d("MicroMsg.Wear.WearUtil", "avatar fullpath: %s", new Object[] { paramString });
    }
    for (paramString = com.tencent.mm.ab.d.hL(paramString);; paramString = localBitmap)
    {
      GMTrace.o(9172036878336L, 68337);
      return paramString;
      w.d("MicroMsg.Wear.WearUtil", "get wear avatar from cache: %s", new Object[] { paramString });
    }
  }
  
  public static String Kf(String paramString)
  {
    GMTrace.i(9172171096064L, 68338);
    ap.AS();
    x localx = com.tencent.mm.x.c.yL().SL(paramString);
    String str;
    if (o.dW(paramString))
    {
      str = ab.getContext().getString(R.l.dJL);
      paramString = com.tencent.mm.x.n.a(localx, paramString);
      if ((localx.field_username.equals(paramString)) || (bg.mZ(paramString))) {
        break label82;
      }
    }
    for (;;)
    {
      GMTrace.o(9172171096064L, 68338);
      return paramString;
      paramString = com.tencent.mm.x.n.a(localx, paramString);
      continue;
      label82:
      paramString = str;
    }
  }
  
  public static byte[] Kg(String paramString)
  {
    GMTrace.i(9172842184704L, 68343);
    paramString = "lib" + paramString + ".so";
    paramString = FileOp.c(new File(new File(com.tencent.mm.loader.stub.a.gZO, "lib"), paramString).getAbsolutePath(), 0, -1);
    GMTrace.o(9172842184704L, 68343);
    return paramString;
  }
  
  public static byte[] L(Bitmap paramBitmap)
  {
    GMTrace.i(9172439531520L, 68340);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
    paramBitmap = localByteArrayOutputStream.toByteArray();
    GMTrace.o(9172439531520L, 68340);
    return paramBitmap;
  }
  
  public static bqi Q(au paramau)
  {
    GMTrace.i(9172305313792L, 68339);
    bqi localbqi = new bqi();
    localbqi.uFM = paramau.field_msgId;
    localbqi.uFR = paramau.field_createTime;
    localbqi.mDF = 1;
    localbqi.uFS = true;
    Object localObject2;
    Object localObject1;
    label100:
    int i;
    if (paramau.field_isSend == 1)
    {
      localbqi.ufQ = Kf(m.zF());
      localbqi.uFL = m.zF();
      localObject2 = null;
      if (paramau.isSystem())
      {
        localObject1 = ab.getContext().getString(R.l.esQ);
        localbqi.mDF = 3;
        paramau = (au)localObject1;
        if (localObject1 == null) {
          paramau = ab.getContext().getString(R.l.esP);
        }
        localbqi.ovi = paramau;
        GMTrace.o(9172305313792L, 68339);
        return localbqi;
      }
    }
    else if (o.dW(paramau.field_talker))
    {
      localObject1 = paramau.field_talker;
      i = ay.gy(paramau.field_content);
      if (i == -1) {
        break label1550;
      }
      localObject2 = paramau.field_content.substring(0, i).trim();
      if ((localObject2 == null) || (((String)localObject2).length() <= 0)) {
        break label1550;
      }
      localObject1 = localObject2;
    }
    label1199:
    label1305:
    label1359:
    label1448:
    label1453:
    label1466:
    label1547:
    label1550:
    for (;;)
    {
      localbqi.ufQ = Kf((String)localObject1);
      localbqi.uFL = ((String)localObject1);
      break;
      localbqi.ufQ = Kf(paramau.field_talker);
      localbqi.uFL = paramau.field_talker;
      break;
      if (paramau.bQK())
      {
        localObject1 = ab.getContext().getString(R.l.esw);
        localbqi.mDF = 4;
        break label100;
      }
      if (paramau.bQN())
      {
        if ((o.dW(paramau.field_talker)) && (paramau.field_isSend != 1))
        {
          i = ay.gy(paramau.field_content);
          if (i != -1)
          {
            localObject1 = paramau.field_content.substring(i + 1).trim();
            break label100;
          }
          localObject1 = paramau.field_content;
          break label100;
        }
        localObject1 = paramau.field_content;
        break label100;
      }
      if (paramau.bQC())
      {
        localObject1 = ab.getContext().getString(R.l.esS);
        localbqi.mDF = 6;
        localbqi.uFS = q.B(paramau);
        float f = q.aB(new com.tencent.mm.modelvoice.n(paramau.field_content).time);
        localbqi.uFT = new com.tencent.mm.bl.b(ab.getContext().getString(R.l.eaA, new Object[] { Integer.valueOf((int)f) }).getBytes());
        break label100;
      }
      if (paramau.bQO())
      {
        localObject1 = ab.getContext().getString(R.l.esR);
        break label100;
      }
      if (paramau.bQP())
      {
        localObject1 = ab.getContext().getString(R.l.esO);
        break label100;
      }
      if (paramau.bQD())
      {
        f.a locala = f.a.eC(paramau.field_content);
        localObject1 = localObject2;
        if (locala == null) {
          break label100;
        }
        if (locala.hcv.startsWith("wxpay://c2cbizmessagehandler/hongbao/receivehongbao"))
        {
          localbqi.mDF = 5;
          if (paramau.field_isSend == 1)
          {
            localObject1 = locala.hcp;
            break label100;
          }
          localObject1 = locala.hco;
          break label100;
        }
        if (paramau.field_isSend == 1) {}
        for (paramau = locala.hcp;; paramau = locala.hco)
        {
          localObject1 = ab.getContext().getString(R.l.esq, new Object[] { paramau });
          break;
        }
      }
      if (paramau.bQE())
      {
        localObject1 = ab.getContext().getString(R.l.esp);
        localbqi.mDF = 5;
        break label100;
      }
      if (paramau.aBp())
      {
        paramau = f.a.eC(paramau.field_content);
        localObject1 = localObject2;
        if (paramau == null) {
          break label100;
        }
        switch (paramau.type)
        {
        case 7: 
        case 9: 
        case 11: 
        case 12: 
        case 14: 
        case 17: 
        case 18: 
        default: 
          localObject1 = localObject2;
          break;
        case 2: 
          localObject1 = String.format(ab.getContext().getString(R.l.esw), new Object[0]);
          break;
        case 5: 
          localObject1 = String.format(ab.getContext().getString(R.l.esh), new Object[] { bg.ap(paramau.title, "") });
          break;
        case 3: 
          localObject1 = String.format(ab.getContext().getString(R.l.esk), new Object[] { bg.ap(paramau.title, "") });
          break;
        case 6: 
          localObject1 = String.format(ab.getContext().getString(R.l.esg), new Object[] { bg.ap(paramau.title, "") });
          break;
        case 4: 
          localObject1 = String.format(ab.getContext().getString(R.l.eso), new Object[] { bg.ap(paramau.title, "") });
          break;
        case 19: 
          localObject1 = String.format(ab.getContext().getString(R.l.esm), new Object[] { bg.ap(paramau.title, "") });
          break;
        case 15: 
          localObject1 = String.format(ab.getContext().getString(R.l.esf), new Object[] { bg.ap(paramau.title, "") });
          break;
        case 10: 
          localObject1 = String.format(ab.getContext().getString(R.l.esl), new Object[] { bg.ap(paramau.title, "") });
          break;
        case 13: 
          localObject1 = String.format(ab.getContext().getString(R.l.esj), new Object[] { bg.ap(paramau.title, "") });
          break;
        case 20: 
          localObject1 = String.format(ab.getContext().getString(R.l.esn), new Object[] { bg.ap(paramau.title, "") });
          break;
        case 16: 
          localObject1 = String.format(ab.getContext().getString(R.l.esr), new Object[] { bg.ap(paramau.title, "") });
          break;
        case 8: 
          localObject1 = ab.getContext().getString(R.l.ess, new Object[] { bg.ap(paramau.title, "") });
          break;
        }
      }
      if (paramau.bQQ())
      {
        localObject1 = ab.getContext().getString(R.l.est);
        if (((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr() == null) {
          break label1547;
        }
        paramau = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vr(paramau.field_imgPath);
        if (bg.mZ(((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vo(paramau.GP())))
        {
          localObject1 = ab.getContext().getString(R.l.est);
          localObject2 = new bpr();
          ((bpr)localObject2).tLN = paramau.GP();
          if (!paramau.isGif()) {
            break label1305;
          }
          ((bpr)localObject2).jXP = 1;
        }
      }
      try
      {
        for (;;)
        {
          localbqi.uFT = new com.tencent.mm.bl.b(((bpr)localObject2).toByteArray());
          localbqi.mDF = 2;
          break;
          localObject1 = "[" + ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vo(paramau.GP()) + "]";
          break label1199;
          ((bpr)localObject2).jXP = 2;
        }
        if (paramau.bQM())
        {
          localObject1 = ab.getContext().getString(R.l.esx);
          break label100;
        }
        if ((!paramau.bQG()) && (!paramau.bQH()))
        {
          if (paramau.field_type == 64)
          {
            i = 1;
            if (i == 0) {
              break label1466;
            }
          }
        }
        else if (!paramau.field_content.equals(au.vff))
        {
          paramau = paramau.field_content;
          localObject1 = new rx();
          ((rx)localObject1).fPS.fAI = 1;
          ((rx)localObject1).fPS.content = paramau;
          com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject1);
          if (((rx)localObject1).fPT.type != 3) {
            break label1448;
          }
        }
        for (i = 1;; i = 0)
        {
          if (i == 0) {
            break label1453;
          }
          localObject1 = ab.getContext().getString(R.l.esU);
          break;
          i = 0;
          break label1359;
        }
        localObject1 = ab.getContext().getString(R.l.esT);
        break label100;
        if (paramau.bQL())
        {
          ap.AS();
          paramau = com.tencent.mm.x.c.yN().BH(paramau.field_content);
          localObject1 = String.format(ab.getContext().getString(R.l.esr), new Object[] { paramau.getDisplayName() });
          break label100;
        }
        localObject1 = localObject2;
        if (paramau.field_type != -1879048186) {
          break label100;
        }
        localObject1 = ab.getContext().getString(R.l.esi);
      }
      catch (IOException paramau)
      {
        for (;;) {}
      }
      break label100;
    }
  }
  
  public static boolean aqf()
  {
    boolean bool = true;
    GMTrace.i(9172573749248L, 68341);
    PackageManager localPackageManager = ab.getContext().getPackageManager();
    try
    {
      localPackageManager.getPackageInfo("com.google.android.wearable.app.cn", 1);
      GMTrace.o(9172573749248L, 68341);
      return bool;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        bool = false;
      }
    }
  }
  
  public static boolean aqg()
  {
    boolean bool = true;
    GMTrace.i(9172707966976L, 68342);
    PackageManager localPackageManager = ab.getContext().getPackageManager();
    try
    {
      localPackageManager.getPackageInfo("com.google.android.wearable.app", 1);
      GMTrace.o(9172707966976L, 68342);
      return bool;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        bool = false;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */