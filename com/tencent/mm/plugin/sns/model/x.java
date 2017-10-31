package com.tencent.mm.plugin.sns.model;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.g.a.pp;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.protocal.c.bcp;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.beb;
import com.tencent.mm.protocal.c.bel;
import com.tencent.mm.protocal.c.bem;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.ca;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public final class x
  extends com.tencent.mm.ac.k
  implements j, d
{
  private static Vector<String> qbj;
  public int Oh;
  final int fwj;
  private com.tencent.mm.ac.b gMC;
  public com.tencent.mm.ac.e gMF;
  private boolean hLi;
  private long qbH;
  private String qbI;
  private long qbZ;
  public boolean qbg;
  private long qbh;
  long qbi;
  public int qbk;
  public int qbl;
  private boolean qca;
  private boolean qcb;
  
  static
  {
    GMTrace.i(8103529545728L, 60376);
    qbj = new Vector();
    GMTrace.o(8103529545728L, 60376);
  }
  
  public x(long paramLong)
  {
    GMTrace.i(8101516279808L, 60361);
    this.hLi = false;
    this.qbZ = 0L;
    this.qbh = 0L;
    this.qbi = 0L;
    this.qbH = 0L;
    this.qbI = "";
    this.qca = false;
    this.qcb = false;
    this.qbk = 0;
    this.qbl = 0;
    this.Oh = 0;
    long l2 = System.currentTimeMillis();
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new bel();
    ((b.a)localObject).hlY = new bem();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnstimeline";
    ((b.a)localObject).hlW = 211;
    ((b.a)localObject).hlZ = 98;
    ((b.a)localObject).hma = 1000000098;
    this.gMC = ((b.a)localObject).DA();
    int i;
    if (am.isWifi(ab.getContext())) {
      i = 1;
    }
    for (;;)
    {
      this.qbh = paramLong;
      boolean bool;
      label169:
      bel localbel;
      int j;
      long l1;
      label230:
      int k;
      com.tencent.mm.plugin.sns.storage.k localk;
      if (paramLong == 0L)
      {
        bool = true;
        this.qbg = bool;
        this.fwj = 2;
        localbel = (bel)this.gMC.hlU.hmc;
        localbel.uwr = i;
        localbel.uuS = paramLong;
        j = ae.bhf().bhN();
        localObject = ae.bhp();
        if (!this.qbg) {
          break label595;
        }
        l1 = 0L;
        this.qbi = ((com.tencent.mm.plugin.sns.storage.n)localObject).e(l1, j, true);
        localbel.uwo = this.qbi;
        k = c.a(this.qbi, paramLong, "@__weixintimtline");
        localbel.uwp = k;
        if (this.qbg)
        {
          this.qbH = ae.bhp().e(0L, 1, true);
          w.i("MicroMsg.NetSceneSnsTimeLine", "newerid " + this.qbH);
          localbel.uwq = this.qbH;
          localk = ae.bhs().HE("@__weixintimtline");
          if (localk != null) {
            break label601;
          }
          localObject = "";
          label344:
          this.qbI = ((String)localObject);
          if (this.qbI == null) {
            this.qbI = "";
          }
          localbel.uuR = this.qbI;
          if ((localk != null) && (localk.field_adsession != null)) {
            break label611;
          }
        }
      }
      for (localbel.uuy = new axs().bd(new byte[0]);; localbel.uuy = new axs().bd(localk.field_adsession))
      {
        this.qbZ = paramLong;
        w.i("MicroMsg.NetSceneSnsTimeLine", " This req nextCount: " + j + " max:" + paramLong + " min:" + this.qbi + " ReqTime:" + localbel.uwp + " nettype: " + i);
        w.d("MicroMsg.NetSceneSnsTimeLine", "maxId: %s minId: %s lastReqTime: %s", new Object[] { i.jdMethod_do(paramLong), i.jdMethod_do(this.qbi), Integer.valueOf(k) });
        w.d("MicroMsg.NetSceneSnsTimeLine", "NetSceneSnsTimeLine %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
        GMTrace.o(8101516279808L, 60361);
        return;
        if (am.is3G(ab.getContext()))
        {
          i = 3;
          break;
        }
        if (am.is4G(ab.getContext()))
        {
          i = 4;
          break;
        }
        if (!am.is2G(ab.getContext())) {
          break label654;
        }
        i = 2;
        break;
        bool = false;
        break label169;
        label595:
        l1 = paramLong;
        break label230;
        label601:
        localObject = localk.field_md5;
        break label344;
        label611:
        w.d("MicroMsg.NetSceneSnsTimeLine", "request adsession %s", new Object[] { localk.field_adsession });
      }
      label654:
      i = 0;
    }
  }
  
  /* Error */
  public static boolean Gu(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 310
    //   6: ldc_w 312
    //   9: invokestatic 43	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: getstatic 50	com/tencent/mm/plugin/sns/model/x:qbj	Ljava/util/Vector;
    //   15: aload_0
    //   16: invokevirtual 316	java/util/Vector:contains	(Ljava/lang/Object;)Z
    //   19: ifeq +19 -> 38
    //   22: iconst_0
    //   23: istore_1
    //   24: ldc2_w 310
    //   27: ldc_w 312
    //   30: invokestatic 53	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   33: ldc 2
    //   35: monitorexit
    //   36: iload_1
    //   37: ireturn
    //   38: getstatic 50	com/tencent/mm/plugin/sns/model/x:qbj	Ljava/util/Vector;
    //   41: aload_0
    //   42: invokevirtual 319	java/util/Vector:add	(Ljava/lang/Object;)Z
    //   45: pop
    //   46: iconst_1
    //   47: istore_1
    //   48: ldc2_w 310
    //   51: ldc_w 312
    //   54: invokestatic 53	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   57: goto -24 -> 33
    //   60: astore_0
    //   61: ldc 2
    //   63: monitorexit
    //   64: aload_0
    //   65: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	paramString	String
    //   23	25	1	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   3	22	60	finally
    //   24	33	60	finally
    //   38	46	60	finally
    //   48	57	60	finally
  }
  
  public static boolean Gv(String paramString)
  {
    try
    {
      GMTrace.i(8101382062080L, 60360);
      qbj.remove(paramString);
      GMTrace.o(8101382062080L, 60360);
      return true;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  private void a(bem parambem, String paramString)
  {
    GMTrace.i(8101784715264L, 60363);
    ai.a("@__weixintimtline", this.fwj, parambem.tze, paramString);
    this.qbi = ((bdk)parambem.tze.getLast()).tDg;
    if (this.qbh == 0L) {
      this.qbh = ((bdk)parambem.tze.getFirst()).tDg;
    }
    for (;;)
    {
      c.c("@__weixintimtline", this.qbh, this.qbi, parambem.uws);
      try
      {
        parambem = parambem.tze.iterator();
        for (;;)
        {
          if (parambem.hasNext())
          {
            paramString = (bdk)parambem.next();
            if (paramString.uvp == 0)
            {
              Object localObject = ae.bhp().dP(paramString.tDg);
              if ((localObject != null) && (((m)localObject).bjL() != null))
              {
                int i = ((m)localObject).field_type;
                if (i == 15)
                {
                  try
                  {
                    localObject = ((amn)((m)localObject).bjL().uyu.tKd.get(0)).mDo;
                    g.paX.i(14388, new Object[] { Long.valueOf(paramString.tDg), Integer.valueOf(4), localObject, Integer.valueOf(0) });
                  }
                  catch (Exception paramString) {}
                  continue;
                  this.qbh = c.ds(this.qbh);
                  break;
                }
              }
            }
          }
        }
        GMTrace.o(8101784715264L, 60363);
        return;
      }
      catch (Exception parambem)
      {
        GMTrace.o(8101784715264L, 60363);
      }
    }
  }
  
  private static boolean b(ca paramca)
  {
    GMTrace.i(8102053150720L, 60365);
    if (!am.isWifi(ab.getContext()))
    {
      GMTrace.o(8102053150720L, 60365);
      return false;
    }
    try
    {
      com.tencent.mm.modelsns.e.lm(com.tencent.mm.platformtools.n.b(paramca.tvF.uuw.uve));
      ae.bhk();
      b.bgt();
      GMTrace.o(8102053150720L, 60365);
      return true;
    }
    catch (Exception paramca)
    {
      GMTrace.o(8102053150720L, 60365);
    }
    return false;
  }
  
  private void bgL()
  {
    GMTrace.i(8101650497536L, 60362);
    Object localObject = ae.bhp();
    String str = com.tencent.mm.plugin.sns.storage.n.uH(3);
    localObject = ((com.tencent.mm.plugin.sns.storage.n)localObject).gMB.a(str, null, 2);
    int i = 0;
    while (((Cursor)localObject).moveToNext()) {
      i += 1;
    }
    ((Cursor)localObject).close();
    if ((i < 3) && (i > 0))
    {
      this.qcb = true;
      GMTrace.o(8101650497536L, 60362);
      return;
    }
    if (i == 0) {
      this.qca = true;
    }
    GMTrace.o(8101650497536L, 60362);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(8102321586176L, 60367);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(8102321586176L, 60367);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(8101918932992L, 60364);
    w.i("MicroMsg.NetSceneSnsTimeLine", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramArrayOfByte = (bem)((com.tencent.mm.ac.b)paramp).hlV.hmc;
    if ((paramp.Ba().tpN != 207) && (paramp.Ba().tpN != 0))
    {
      Gv("@__weixintimtline");
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8101918932992L, 60364);
      return;
    }
    if (paramArrayOfByte.uuX != null)
    {
      w.d("MicroMsg.NetSceneSnsTimeLine", "serverConfig  " + paramArrayOfByte.uuX.uwk + " " + paramArrayOfByte.uuX.uwj);
      paramInt1 = paramArrayOfByte.uuX.uwk;
      com.tencent.mm.plugin.sns.c.a.pXZ = paramInt1;
      if (paramInt1 <= 0) {
        com.tencent.mm.plugin.sns.c.a.pXZ = Integer.MAX_VALUE;
      }
      com.tencent.mm.storage.v.uTO = paramArrayOfByte.uuX.uwj;
    }
    this.qbk = paramArrayOfByte.uuV;
    this.qbl = paramArrayOfByte.uuW;
    w.i("MicroMsg.NetSceneSnsTimeLine", "for same md5 count: " + paramArrayOfByte.uuV + " , objCount:  " + paramArrayOfByte.ujC + " cflag : " + paramArrayOfByte.uuW);
    this.Oh = paramArrayOfByte.ujC;
    String str1 = i.dp(this.qbh);
    if (!paramArrayOfByte.tze.isEmpty())
    {
      w.i("MicroMsg.NetSceneSnsTimeLine", "respone size " + paramArrayOfByte.tze.size() + " Max " + ((bdk)paramArrayOfByte.tze.getFirst()).tDg + " " + i.jdMethod_do(((bdk)paramArrayOfByte.tze.getFirst()).tDg) + "  respone min  " + ((bdk)paramArrayOfByte.tze.getLast()).tDg + " " + i.jdMethod_do(((bdk)paramArrayOfByte.tze.getLast()).tDg));
      if (this.qbg) {
        break label573;
      }
      w.d("MicroMsg.NetSceneSnsTimeLine", "np resp list size " + paramArrayOfByte.tze.size());
      if (!paramArrayOfByte.tze.isEmpty()) {
        break label562;
      }
      ae.bhp().HF(str1);
      this.qca = true;
      this.qbi = this.qbh;
    }
    for (;;)
    {
      Gv("@__weixintimtline");
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8101918932992L, 60364);
      return;
      w.i("MicroMsg.NetSceneSnsTimeLine", " respone is Empty");
      break;
      label562:
      a(paramArrayOfByte, str1);
    }
    label573:
    this.Oh = paramArrayOfByte.ujC;
    if (this.qbI.equals(paramArrayOfByte.uuR))
    {
      paramp = ae.bhp();
      if (this.qbg) {}
      for (long l = 0L;; l = this.qbZ)
      {
        this.qbi = paramp.e(l, this.qbk, true);
        w.i("MicroMsg.NetSceneSnsTimeLine", "md5 is no change!! the new minid %s", new Object[] { Long.valueOf(this.qbi) });
        bgL();
        Gv("@__weixintimtline");
        this.gMF.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(8101918932992L, 60364);
        return;
      }
    }
    w.d("MicroMsg.NetSceneSnsTimeLine", "fp resp list size " + paramArrayOfByte.tze.size() + " adsize : " + paramArrayOfByte.uwt);
    ae.bhs().e("@__weixintimtline", paramArrayOfByte.uuR, com.tencent.mm.platformtools.n.a(paramArrayOfByte.uuy));
    paramInt1 = 0;
    Object localObject1;
    Object localObject3;
    for (;;)
    {
      if (paramInt1 < paramArrayOfByte.uwu.size())
      {
        localObject1 = (ca)paramArrayOfByte.uwu.get(paramInt1);
        String str2;
        if (this.hLi) {
          str2 = ae.zp() + "ad.proto";
        }
        try
        {
          localObject3 = ((ca)localObject1).toByteArray();
          com.tencent.mm.a.e.b(str2, (byte[])localObject3, localObject3.length);
          str2 = com.tencent.mm.platformtools.n.a(((ca)localObject1).tvG);
          localObject3 = com.tencent.mm.platformtools.n.a(((ca)localObject1).tvF.uux);
          localObject1 = com.tencent.mm.platformtools.n.b(((ca)localObject1).tvF.uuw.uve);
          w.i("MicroMsg.NetSceneSnsTimeLine", "skXml " + str2);
          w.i("MicroMsg.NetSceneSnsTimeLine", "adXml " + (String)localObject3);
          w.i("MicroMsg.NetSceneSnsTimeLine", "snsXml " + (String)localObject1 + "\r\n");
          paramInt1 += 1;
        }
        catch (Exception localException2)
        {
          for (;;)
          {
            w.e("MicroMsg.NetSceneSnsTimeLine", "save error " + localException2.getMessage());
          }
        }
      }
    }
    if ((this.hLi) && (paramArrayOfByte.uwu.size() == 0)) {}
    try
    {
      localObject1 = com.tencent.mm.a.e.d(ae.zp() + "ad.proto", 0, -1);
      localObject2 = new ca();
      ((ca)localObject2).aC((byte[])localObject1);
      paramArrayOfByte.uwu.add(localObject2);
      paramArrayOfByte.uwt = paramArrayOfByte.uwu.size();
      w.d("MicroMsg.NetSceneSnsTimeLine", "read from path " + paramArrayOfByte.uwt);
      if (paramArrayOfByte.uwu.size() > 0)
      {
        localObject1 = (ca)paramArrayOfByte.uwu.get(0);
        localObject2 = com.tencent.mm.platformtools.n.a(((ca)localObject1).tvG);
        localObject3 = com.tencent.mm.platformtools.n.a(((ca)localObject1).tvF.uux);
        String str3 = com.tencent.mm.platformtools.n.b(((ca)localObject1).tvF.uuw.uve);
        w.i("MicroMsg.NetSceneSnsTimeLine", "skXml " + (String)localObject2);
        w.i("MicroMsg.NetSceneSnsTimeLine", "adXml " + (String)localObject3);
        w.i("MicroMsg.NetSceneSnsTimeLine", "snsXml " + str3 + "\r\n");
        b((ca)localObject1);
      }
      a.e(paramArrayOfByte.uwu, paramArrayOfByte.tze);
      a.ah(paramArrayOfByte.uwu);
      if (paramArrayOfByte.uwt == 0)
      {
        w.i("MicroMsg.NetSceneSnsTimeLine", "recv %d recommend", new Object[] { Integer.valueOf(paramArrayOfByte.uwv) });
        a.d(paramArrayOfByte.uww, paramArrayOfByte.tze);
        a.ag(paramArrayOfByte.uww);
      }
      localObject1 = new LinkedList();
      localObject2 = paramArrayOfByte.tze.iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((LinkedList)localObject1).add(Long.valueOf(((bdk)((Iterator)localObject2).next()).tDg));
      }
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        w.e("MicroMsg.NetSceneSnsTimeLine", "read error " + localException1.getMessage());
      }
      Object localObject2 = new pp();
      ((pp)localObject2).fNv.fNw = localException1;
      com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject2);
      if (paramp.Ba().tpN == 207)
      {
        if (paramArrayOfByte.tze.isEmpty())
        {
          ae.bhp().bkx();
          this.qbi = this.qbh;
        }
        for (;;)
        {
          this.qca = true;
          Gv("@__weixintimtline");
          this.gMF.a(paramInt2, paramInt3, paramString, this);
          GMTrace.o(8101918932992L, 60364);
          return;
          ae.bhp().HG(i.dp(((bdk)paramArrayOfByte.tze.getFirst()).tDg));
          ae.bhp().HF(i.dp(((bdk)paramArrayOfByte.tze.getLast()).tDg));
          a(paramArrayOfByte, str1);
          a.ai(paramArrayOfByte.tze);
        }
      }
      if (!paramArrayOfByte.tze.isEmpty()) {
        break label1633;
      }
    }
    ae.bhp().bkx();
    this.qbi = this.qbh;
    this.qca = true;
    for (;;)
    {
      Gv("@__weixintimtline");
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8101918932992L, 60364);
      return;
      label1633:
      a(paramArrayOfByte, str1);
      a.ai(paramArrayOfByte.tze);
    }
  }
  
  public final long bgA()
  {
    GMTrace.i(8103126892544L, 60373);
    long l = this.qbi;
    GMTrace.o(8103126892544L, 60373);
    return l;
  }
  
  public final boolean bgB()
  {
    GMTrace.i(8103261110272L, 60374);
    GMTrace.o(8103261110272L, 60374);
    return false;
  }
  
  public final long bgC()
  {
    GMTrace.i(8103395328000L, 60375);
    GMTrace.o(8103395328000L, 60375);
    return 0L;
  }
  
  public final boolean bgw()
  {
    GMTrace.i(8102590021632L, 60369);
    boolean bool = this.qbg;
    GMTrace.o(8102590021632L, 60369);
    return bool;
  }
  
  public final boolean bgx()
  {
    GMTrace.i(8102724239360L, 60370);
    boolean bool = this.qca;
    GMTrace.o(8102724239360L, 60370);
    return bool;
  }
  
  public final boolean bgy()
  {
    GMTrace.i(8102858457088L, 60371);
    boolean bool = this.qcb;
    GMTrace.o(8102858457088L, 60371);
    return bool;
  }
  
  public final boolean bgz()
  {
    GMTrace.i(8102992674816L, 60372);
    GMTrace.o(8102992674816L, 60372);
    return false;
  }
  
  public final int getType()
  {
    GMTrace.i(8102187368448L, 60366);
    GMTrace.o(8102187368448L, 60366);
    return 211;
  }
  
  public final String getUserName()
  {
    GMTrace.i(8102455803904L, 60368);
    GMTrace.o(8102455803904L, 60368);
    return "@__weixintimtline";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */