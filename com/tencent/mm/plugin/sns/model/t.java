package com.tencent.mm.plugin.sns.model;

import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k.b;
import com.tencent.mm.g.a.pi;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.sns.g.c;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.protocal.ad;
import com.tencent.mm.protocal.c.agb;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.protocal.c.bct;
import com.tencent.mm.protocal.c.bcu;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.bec;
import com.tencent.mm.protocal.c.bed;
import com.tencent.mm.protocal.c.mx;
import com.tencent.mm.protocal.c.my;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ak;
import com.tencent.mm.x.m;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class t
  extends com.tencent.mm.ac.k
  implements com.tencent.mm.network.j
{
  public static List<ak> qbJ;
  private static c qbL;
  private static boolean qbM;
  public String gCs;
  com.tencent.mm.ac.b gMC;
  com.tencent.mm.ac.e gMF;
  private a qbK;
  
  static
  {
    GMTrace.i(8116146012160L, 60470);
    qbJ = new LinkedList();
    qbM = true;
    GMTrace.o(8116146012160L, 60470);
  }
  
  public t()
  {
    GMTrace.i(8113059004416L, 60447);
    this.gCs = "";
    this.qbK = new a();
    localObject = new b.a();
    ((b.a)localObject).hlX = new bec();
    ((b.a)localObject).hlY = new bed();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnssync";
    ((b.a)localObject).hlW = 214;
    ((b.a)localObject).hlZ = 102;
    ((b.a)localObject).hma = 1000000102;
    this.gMC = ((b.a)localObject).DA();
    ((bec)this.gMC.hlU.hmc).tEN = 256;
    this.gCs = m.zF();
    long l;
    byte[] arrayOfByte;
    if (qbM)
    {
      l = System.currentTimeMillis();
      localObject = new StringBuilder();
      h.xA();
      localObject = h.xz().cachePath + "ad_1100007";
      w.i("MicroMsg.NetSceneNewSyncAlbum", "filepath to list  " + (String)localObject);
      arrayOfByte = FileOp.c((String)localObject, 0, -1);
      if (arrayOfByte == null) {}
    }
    try
    {
      qbL = (c)new c().aC(arrayOfByte);
      w.i("MicroMsg.NetSceneNewSyncAlbum", "fileToList " + (System.currentTimeMillis() - l));
      if (qbL != null) {
        break label286;
      }
      w.i("MicroMsg.NetSceneNewSyncAlbum", "igNoreAbTestId parser error");
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", localIOException, "", new Object[0]);
        FileOp.deleteFile((String)localObject);
        continue;
        w.i("MicroMsg.NetSceneNewSyncAlbum", "igNoreAbTestId size " + qbL.qhX.size());
      }
    }
    qbM = false;
    GMTrace.o(8113059004416L, 60447);
  }
  
  private static void AH()
  {
    GMTrace.i(8115474923520L, 60465);
    Iterator localIterator = qbJ.iterator();
    while (localIterator.hasNext())
    {
      ak localak = (ak)localIterator.next();
      if (localak != null) {
        localak.AH();
      }
    }
    GMTrace.o(8115474923520L, 60465);
  }
  
  public static void a(ak paramak)
  {
    GMTrace.i(8115609141248L, 60466);
    if (!qbJ.contains(paramak)) {
      qbJ.add(paramak);
    }
    GMTrace.o(8115609141248L, 60466);
  }
  
  private static boolean a(bcu parambcu, bct parambct, long paramLong1, long paramLong2, String paramString)
  {
    GMTrace.i(8114938052608L, 60461);
    try
    {
      int i = bg.getInt(com.tencent.mm.k.g.uz().getValue("SnsAdNotifyLimit"), 0);
      int j = bg.getInt(com.tencent.mm.k.g.uz().getValue("SnsAdNotifyLikeTimeLimit"), 0);
      int k = bg.getInt(com.tencent.mm.k.g.uz().getValue("SnsAdNotifyCommentTimeLimit"), 0);
      boolean bool;
      if (((i > 0) || (j > 0) || (k > 0)) && ((parambct.jXP == 8) || (parambct.jXP == 7)))
      {
        bool = a.a(paramLong1, parambcu, i, j, k, true);
        if (dx(paramLong1)) {
          w.i("MicroMsg.NetSceneNewSyncAlbum", "user open notify off");
        }
        if (!bool)
        {
          w.i("MicroMsg.NetSceneNewSyncAlbum", "pass the comment clientId " + paramString + " snsId: " + paramLong1 + " " + parambct.uuH + " " + parambct.uuE + " actionLimit:" + i + " actionLikeTimeLimit:" + j + " actionCommentTimeLimit:" + k);
          if (!a.a(paramLong1, parambcu))
          {
            w.i("MicroMsg.NetSceneNewSyncAlbum", "pass comment ID  " + parambcu.uuL.uuH);
            GMTrace.o(8114938052608L, 60461);
            return false;
          }
          GMTrace.o(8114938052608L, 60461);
          return false;
        }
      }
      w.i("MicroMsg.NetSceneNewSyncAlbum", "processNormalAction clientId " + paramString + " snsId: " + paramLong1 + " " + parambct.uuH + " " + parambct.uuE + " actionLimit: " + i);
      if (!ae.bht().a(paramLong1, parambct.upg, parambct.orU, paramString))
      {
        bct localbct = parambcu.uuM;
        com.tencent.mm.plugin.sns.storage.i locali = new com.tencent.mm.plugin.sns.storage.i();
        locali.field_snsID = paramLong1;
        locali.field_parentID = paramLong2;
        locali.field_createTime = parambct.orU;
        locali.field_talker = parambct.upg;
        locali.field_type = parambct.jXP;
        locali.field_curActionBuf = parambct.toByteArray();
        locali.field_refActionBuf = localbct.toByteArray();
        locali.field_clientId = paramString;
        if ((parambct.uuJ & 0x2) == 0) {}
        for (i = 0;; i = 1)
        {
          locali.field_isSilence = i;
          if ((parambct.jXP != 8) && (parambct.jXP != 7)) {
            break;
          }
          locali.field_commentSvrID = parambct.uuH;
          if (a.a(paramLong1, parambcu)) {
            break label586;
          }
          w.i("MicroMsg.NetSceneNewSyncAlbum", "pass comment ID " + locali.field_snsID + " " + locali.field_commentSvrID);
          GMTrace.o(8114938052608L, 60461);
          return false;
        }
        locali.field_commentSvrID = parambct.uuE;
        bool = ai.a(paramLong1, parambcu);
        if (!bool)
        {
          GMTrace.o(8114938052608L, 60461);
          return false;
        }
        label586:
        ae.bht().b(locali);
        parambcu = ae.bht();
        if ((parambct.uuJ & 0x2) != 0) {}
        for (bool = true;; bool = false)
        {
          parambcu.l(paramLong1, bool);
          GMTrace.o(8114938052608L, 60461);
          return true;
        }
      }
      GMTrace.o(8114938052608L, 60461);
      return false;
    }
    catch (Exception parambcu)
    {
      w.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", parambcu, "", new Object[0]);
      GMTrace.o(8114938052608L, 60461);
    }
    return false;
  }
  
  public static void b(ak paramak)
  {
    GMTrace.i(8115743358976L, 60467);
    qbJ.remove(paramak);
    GMTrace.o(8115743358976L, 60467);
  }
  
  private static boolean b(bcu parambcu, bct parambct, long paramLong1, long paramLong2, String paramString)
  {
    GMTrace.i(8115072270336L, 60462);
    try
    {
      w.i("MicroMsg.NetSceneNewSyncAlbum", "processHbAction clientId " + paramString + " snsId: " + paramLong1 + " " + parambct.uuH + " " + parambct.uuE);
      if (!com.tencent.mm.plugin.sns.lucky.a.g.bgj())
      {
        w.i("MicroMsg.NetSceneNewSyncAlbum", "passed because close lucky");
        GMTrace.o(8115072270336L, 60462);
        return false;
      }
      if (!ae.bht().a(paramLong1, parambct.upg, parambct.orU, paramString))
      {
        bct localbct = parambcu.uuM;
        com.tencent.mm.plugin.sns.storage.i locali = new com.tencent.mm.plugin.sns.storage.i();
        locali.field_snsID = paramLong1;
        locali.field_parentID = paramLong2;
        locali.field_createTime = parambct.orU;
        locali.field_talker = parambct.upg;
        locali.field_type = parambct.jXP;
        locali.field_curActionBuf = parambct.toByteArray();
        locali.field_refActionBuf = localbct.toByteArray();
        locali.field_clientId = paramString;
        locali.field_commentSvrID = parambct.uuE;
        w.i("MicroMsg.NetSceneNewSyncAlbum", "curAction.HBBuffer " + parambct.uuI);
        ai.c(paramLong1, parambcu);
        AH();
        ae.bht().b(locali);
        GMTrace.o(8115072270336L, 60462);
        return true;
      }
      GMTrace.o(8115072270336L, 60462);
      return false;
    }
    catch (Exception parambcu)
    {
      w.e("MicroMsg.NetSceneNewSyncAlbum", "error processHbAction " + parambcu.getMessage());
      w.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", parambcu, "", new Object[0]);
      GMTrace.o(8115072270336L, 60462);
    }
    return false;
  }
  
  public static void bgJ()
  {
    GMTrace.i(8113998528512L, 60454);
    if (qbL == null)
    {
      GMTrace.o(8113998528512L, 60454);
      return;
    }
    long l = System.currentTimeMillis();
    Object localObject = new StringBuilder();
    h.xA();
    localObject = h.xz().cachePath + "ad_1100007";
    w.i("MicroMsg.NetSceneNewSyncAlbum", "listToFile to list  " + (String)localObject);
    try
    {
      byte[] arrayOfByte = qbL.toByteArray();
      com.tencent.mm.a.e.b((String)localObject, arrayOfByte, arrayOfByte.length);
      w.i("MicroMsg.NetSceneNewSyncAlbum", "listTofile " + (System.currentTimeMillis() - l) + " igNoreAbTestId " + qbL.qhX.size());
      GMTrace.o(8113998528512L, 60454);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", localException, "listToFile failed: " + (String)localObject, new Object[0]);
      GMTrace.o(8113998528512L, 60454);
    }
  }
  
  public static void bgK()
  {
    GMTrace.i(8115340705792L, 60464);
    Iterator localIterator = qbJ.iterator();
    while (localIterator.hasNext())
    {
      ak localak = (ak)localIterator.next();
      if (localak != null) {
        localak.AI();
      }
    }
    GMTrace.o(8115340705792L, 60464);
  }
  
  private static boolean c(bcu parambcu, bct parambct, long paramLong1, long paramLong2, String paramString)
  {
    GMTrace.i(8115206488064L, 60463);
    try
    {
      w.i("MicroMsg.NetSceneNewSyncAlbum", "processGrabHbAction clientId " + paramString + " snsId: " + paramLong1 + " " + parambct.uuH + " " + parambct.uuE);
      if (!ae.bht().a(paramLong1, parambct.upg, parambct.orU, paramString))
      {
        bct localbct = parambcu.uuM;
        parambcu = new com.tencent.mm.plugin.sns.storage.i();
        parambcu.field_snsID = paramLong1;
        parambcu.field_parentID = paramLong2;
        parambcu.field_createTime = parambct.orU;
        parambcu.field_talker = parambct.upg;
        parambcu.field_type = parambct.jXP;
        parambcu.field_curActionBuf = parambct.toByteArray();
        parambcu.field_refActionBuf = localbct.toByteArray();
        parambcu.field_clientId = paramString;
        parambcu.field_commentSvrID = parambct.uuE;
        paramString = new agb();
        w.i("MicroMsg.NetSceneNewSyncAlbum", "curAction.HBBuffer " + parambct.uuI);
        paramString.aC(com.tencent.mm.platformtools.n.a(parambct.uuI));
        w.i("MicroMsg.NetSceneNewSyncAlbum", "hbbuffer  " + paramString.fRn);
        ae.bht().b(parambcu);
        GMTrace.o(8115206488064L, 60463);
        return true;
      }
      GMTrace.o(8115206488064L, 60463);
      return false;
    }
    catch (Exception parambcu)
    {
      w.e("MicroMsg.NetSceneNewSyncAlbum", "error processHbAction " + parambcu.getMessage());
      w.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", parambcu, "", new Object[0]);
      GMTrace.o(8115206488064L, 60463);
    }
    return false;
  }
  
  public static void dv(long paramLong)
  {
    GMTrace.i(8113595875328L, 60451);
    if (qbL == null) {
      qbL = new c();
    }
    qbL.qhX.add(Long.valueOf(paramLong));
    GMTrace.o(8113595875328L, 60451);
  }
  
  public static void dw(long paramLong)
  {
    GMTrace.i(8113730093056L, 60452);
    if (qbL != null) {
      qbL.qhX.remove(Long.valueOf(paramLong));
    }
    GMTrace.o(8113730093056L, 60452);
  }
  
  public static boolean dx(long paramLong)
  {
    GMTrace.i(8113864310784L, 60453);
    if (qbL == null)
    {
      GMTrace.o(8113864310784L, 60453);
      return false;
    }
    if (qbL.qhX.contains(Long.valueOf(paramLong)))
    {
      GMTrace.o(8113864310784L, 60453);
      return true;
    }
    GMTrace.o(8113864310784L, 60453);
    return false;
  }
  
  public static boolean dy(long paramLong)
  {
    GMTrace.i(8114803834880L, 60460);
    try
    {
      boolean bool = a.a(paramLong, null, bg.getInt(com.tencent.mm.k.g.uz().getValue("SnsAdNotifyLimit"), 0), bg.getInt(com.tencent.mm.k.g.uz().getValue("SnsAdNotifyLikeTimeLimit"), 0), bg.getInt(com.tencent.mm.k.g.uz().getValue("SnsAdNotifyCommentTimeLimit"), 0), false);
      GMTrace.o(8114803834880L, 60460);
      return bool;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", localException, "", new Object[0]);
      GMTrace.o(8114803834880L, 60460);
    }
    return true;
  }
  
  public final boolean DE()
  {
    GMTrace.i(8114132746240L, 60455);
    GMTrace.o(8114132746240L, 60455);
    return true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(8113461657600L, 60450);
    h.xA();
    byte[] arrayOfByte = bg.RA(bg.mY((String)h.xz().xi().get(8195, null)));
    axs localaxs = new axs();
    localaxs.bd(arrayOfByte);
    ((bec)this.gMC.hlU.hmc).tEO = localaxs;
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(8113461657600L, 60450);
    return i;
  }
  
  protected final int a(p paramp)
  {
    GMTrace.i(8113327439872L, 60449);
    int i = k.b.hmE;
    GMTrace.o(8113327439872L, 60449);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(8114401181696L, 60457);
    w.d("MicroMsg.NetSceneNewSyncAlbum", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8114401181696L, 60457);
      return;
    }
    bed localbed = (bed)((com.tencent.mm.ac.b)paramp).hlV.hmc;
    paramArrayOfByte = localbed.tER.jWR;
    if ((paramArrayOfByte != null) && (paramArrayOfByte.size() > 0))
    {
      w.d("MicroMsg.NetSceneNewSyncAlbum", "cmlList size:" + paramArrayOfByte.size());
      paramString = this.qbK;
      paramString.lPV = paramArrayOfByte;
      paramString.lPW.sendEmptyMessage(0);
      GMTrace.o(8114401181696L, 60457);
      return;
    }
    if ((localbed.tEO != null) && (localbed.tEO.ush != null))
    {
      paramArrayOfByte = localbed.tEO.ush.toByteArray();
      paramp = ad.g(((bec)((com.tencent.mm.ac.b)paramp).hlU.hmc).tEO.ush.toByteArray(), paramArrayOfByte);
      if ((paramp != null) && (paramp.length > 0))
      {
        h.xA();
        h.xz().xi().set(8195, bg.br(paramp));
      }
    }
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(8114401181696L, 60457);
  }
  
  public final boolean a(mx parammx, final com.tencent.mm.sdk.platformtools.ae paramae)
  {
    GMTrace.i(8114535399424L, 60458);
    final bdk localbdk;
    boolean bool;
    try
    {
      localbdk = (bdk)new bdk().aC(parammx.tJq.ush.toByteArray());
      parammx = new String(localbdk.uve.ush.toByteArray());
      if (parammx.indexOf("<contentStyle><![CDATA[1]]></contentStyle>") >= 0) {
        break label464;
      }
      if (parammx.indexOf("<contentStyle>1</contentStyle>") < 0) {
        break label479;
      }
    }
    catch (Exception parammx)
    {
      com.tencent.mm.plugin.sns.storage.k localk;
      String[] arrayOfString;
      int i;
      w.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", parammx, "", new Object[0]);
      GMTrace.o(8114535399424L, 60458);
      return false;
    }
    w.i("MicroMsg.NetSceneNewSyncAlbum", "snsSync " + localbdk.tDg + " " + com.tencent.mm.plugin.sns.data.i.jdMethod_do(localbdk.tDg) + " isPhoto " + bool);
    String str;
    int j;
    if (bool)
    {
      str = com.tencent.mm.plugin.sns.data.i.jdMethod_do(localbdk.tDg);
      localk = ae.bhs().HE(localbdk.twR);
      if (bg.mZ(localk.field_newerIds)) {
        break label380;
      }
      arrayOfString = localk.field_newerIds.split(",");
      i = 1;
      j = 0;
      label187:
      if (j >= arrayOfString.length) {
        break label485;
      }
      if (!str.equals(arrayOfString[j])) {
        break label470;
      }
      i = 0;
      break label470;
    }
    for (;;)
    {
      if ((j < 2) && (j < arrayOfString.length) && (i != 0))
      {
        parammx = parammx + "," + arrayOfString[j];
        j += 1;
      }
      else
      {
        w.d("MicroMsg.NetSceneNewSyncAlbum", "snsync newerIds " + localbdk.tDg + " S: " + str + " list " + localk.field_newerIds + " newer " + parammx);
        if (i != 0) {
          ae.bhs().dC(localbdk.twR, parammx);
        }
        while (ae.bhp().dJ(localbdk.tDg))
        {
          w.i("MicroMsg.NetSceneNewSyncAlbum", "this item has in your sns pass it");
          GMTrace.o(8114535399424L, 60458);
          return false;
          label380:
          ae.bhs().dC(localbdk.twR, str);
        }
        com.tencent.mm.sdk.b.a.uLm.m(new pi());
        ae.aCa().post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8046218575872L, 59949);
            if (!localbdk.twR.equals(t.this.gCs))
            {
              h.xA();
              if (!h.xx().wM())
              {
                w.e("MicroMsg.NetSceneNewSyncAlbum", "mmcore has not set uin!!");
                GMTrace.o(8046218575872L, 59949);
                return;
              }
              h.xA();
              Object localObject = (String)h.xz().xi().get(68377, null);
              h.xA();
              if ((bg.a((Integer)h.xz().xi().get(68400, null), 0) != localbdk.orU) || ((!bg.mZ((String)localObject)) && (!((String)localObject).equals(localbdk.twR))))
              {
                h.xA();
                h.xz().xi().set(68377, localbdk.twR);
                h.xA();
                h.xz().xi().set(68400, Integer.valueOf(localbdk.orU));
                h.xA();
                h.xz().xi().set(68418, com.tencent.mm.plugin.sns.data.i.jdMethod_do(localbdk.tDg));
              }
              localObject = t.qbJ.iterator();
              while (((Iterator)localObject).hasNext()) {
                ((ak)((Iterator)localObject).next()).AG();
              }
            }
            paramae.sendEmptyMessage(0);
            GMTrace.o(8046218575872L, 59949);
          }
        });
        GMTrace.o(8114535399424L, 60458);
        return true;
        label464:
        bool = true;
        break;
        label470:
        j += 1;
        break label187;
        label479:
        bool = false;
        break;
        label485:
        j = 0;
        parammx = str;
      }
    }
  }
  
  public final boolean b(mx parammx, final com.tencent.mm.sdk.platformtools.ae paramae)
  {
    GMTrace.i(8114669617152L, 60459);
    for (;;)
    {
      bcu localbcu;
      long l1;
      long l2;
      final bct localbct;
      String str;
      final boolean bool;
      try
      {
        localbcu = (bcu)new bcu().aC(parammx.tJq.ush.toByteArray());
        l1 = localbcu.tDg;
        l2 = localbcu.uuK;
        localbct = localbcu.uuL;
        str = localbcu.tvh;
        parammx = str;
        if (str == null) {
          parammx = "";
        }
        w.i("MicroMsg.NetSceneNewSyncAlbum", "process action " + localbct.jXP + " " + l1 + " " + parammx);
        switch (localbct.jXP)
        {
        case 9: 
          a(localbcu, localbct, l1, l2, parammx);
          if ((localbct.uuJ & 0x2) != 0) {
            break label608;
          }
          bool = true;
          ae.aCa().post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(8123393769472L, 60524);
              if (bool)
              {
                Iterator localIterator = t.qbJ.iterator();
                while (localIterator.hasNext())
                {
                  ak localak = (ak)localIterator.next();
                  w.i("MicroMsg.NetSceneNewSyncAlbum", "notify list ");
                  localak.AF();
                }
              }
              paramae.sendEmptyMessage(0);
              GMTrace.o(8123393769472L, 60524);
            }
          });
          GMTrace.o(8114669617152L, 60459);
          return true;
        }
      }
      catch (Exception parammx)
      {
        w.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", parammx, "", new Object[0]);
        GMTrace.o(8114669617152L, 60459);
        return false;
      }
      parammx = ae.bht().d(l1, localbct.uuE, localbct.jXP);
      if (parammx != null)
      {
        parammx.bjP();
        bool = ae.bht().a(parammx.uQF, parammx);
        ai.b(l1, localbcu);
        w.i("MicroMsg.NetSceneNewSyncAlbum", " setdel flag  " + bool);
        continue;
        parammx = ae.bht().d(l1, localbct.uuH, localbct.jXP);
        if (parammx != null)
        {
          parammx.bjP();
          bool = ae.bht().a(parammx.uQF, parammx);
          ai.b(l1, localbcu);
          w.i("MicroMsg.NetSceneNewSyncAlbum", " setdel ad flag  " + bool);
          continue;
          parammx = ae.bht();
          str = " update SnsComment set commentflag = commentflag | 2 where snsID = " + l1;
          w.i("MicroMsg.SnsCommentStorage", "set sns del " + str);
          bool = parammx.hhi.eL("SnsComment", str);
          w.i("MicroMsg.NetSceneNewSyncAlbum", "processSnsDelAction " + bool);
          continue;
          parammx = ae.bht();
          str = localbct.upg;
          str = " update SnsComment set commentflag = commentflag | 2 where snsID = " + l1 + " and talker = " + bg.mX(str);
          w.i("MicroMsg.SnsCommentStorage", "set sns del  by username " + str);
          bool = parammx.hhi.eL("SnsComment", str);
          w.i("MicroMsg.NetSceneNewSyncAlbum", "processSnsDelAction " + bool);
          continue;
          b(localbcu, localbct, l1, l2, parammx);
          continue;
          c(localbcu, localbct, l1, l2, parammx);
          continue;
          label608:
          bool = false;
        }
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(8114266963968L, 60456);
    GMTrace.o(8114266963968L, 60456);
    return 214;
  }
  
  protected final int vG()
  {
    GMTrace.i(8113193222144L, 60448);
    GMTrace.o(8113193222144L, 60448);
    return 10;
  }
  
  final class a
  {
    LinkedList<mx> lPV;
    com.tencent.mm.sdk.platformtools.ae lPW;
    
    a()
    {
      GMTrace.i(8049842454528L, 59976);
      this.lPW = new com.tencent.mm.sdk.platformtools.ae()
      {
        public final void handleMessage(final Message paramAnonymousMessage)
        {
          GMTrace.i(8088765595648L, 60266);
          if ((t.a.this.lPV == null) || (t.a.this.lPV.isEmpty()))
          {
            paramAnonymousMessage = t.this;
            bed localbed = (bed)paramAnonymousMessage.gMC.hlV.hmc;
            bec localbec = (bec)paramAnonymousMessage.gMC.hlU.hmc;
            byte[] arrayOfByte = localbed.tEO.ush.toByteArray();
            arrayOfByte = ad.g(localbec.tEO.ush.toByteArray(), arrayOfByte);
            if ((arrayOfByte != null) && (arrayOfByte.length > 0))
            {
              h.xA();
              h.xz().xi().set(8195, bg.br(arrayOfByte));
            }
            localbec.tEO.bd(arrayOfByte);
            if ((localbed.tCI & localbec.tEN) == 0)
            {
              paramAnonymousMessage.gMF.a(0, 0, "", paramAnonymousMessage);
              GMTrace.o(8088765595648L, 60266);
              return;
            }
            paramAnonymousMessage.a(paramAnonymousMessage.hmo, paramAnonymousMessage.gMF);
            GMTrace.o(8088765595648L, 60266);
            return;
          }
          paramAnonymousMessage = (mx)t.a.this.lPV.getFirst();
          w.d("MicroMsg.NetSceneNewSyncAlbum", "cmdId = " + paramAnonymousMessage.tJp);
          t.a.this.lPV.removeFirst();
          switch (paramAnonymousMessage.tJp)
          {
          }
          for (;;)
          {
            GMTrace.o(8088765595648L, 60266);
            return;
            ae.bgZ().post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(8090107772928L, 60276);
                if (!t.this.a(paramAnonymousMessage, t.a.this.lPW)) {
                  t.a.this.lPW.sendEmptyMessage(0);
                }
                GMTrace.o(8090107772928L, 60276);
              }
            });
            GMTrace.o(8088765595648L, 60266);
            return;
            ae.bgZ().post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(8107421859840L, 60405);
                if (!t.this.b(paramAnonymousMessage, t.a.this.lPW)) {
                  t.a.this.lPW.sendEmptyMessage(0);
                }
                GMTrace.o(8107421859840L, 60405);
              }
            });
          }
        }
      };
      GMTrace.o(8049842454528L, 59976);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */