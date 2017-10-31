package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.g.a.pp;
import com.tencent.mm.modelsfs.FileOp;
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
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class s
  extends com.tencent.mm.ac.k
  implements j
{
  public int Oh;
  final int fwj;
  private com.tencent.mm.ac.b gMC;
  public com.tencent.mm.ac.e gMF;
  private long qbH;
  private String qbI;
  private long qbi;
  public int qbk;
  public int qbl;
  
  public s()
  {
    GMTrace.i(17150609719296L, 127782);
    this.qbi = 0L;
    this.qbH = 0L;
    this.qbI = "";
    this.qbk = 0;
    this.qbl = 0;
    this.Oh = 0;
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new bel();
    ((b.a)localObject).hlY = new bem();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnspreloadingtimeline";
    ((b.a)localObject).hlW = 718;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    int i;
    if (com.tencent.mm.sdk.platformtools.am.isWifi(ab.getContext())) {
      i = 1;
    }
    for (;;)
    {
      this.fwj = 2;
      bel localbel = (bel)this.gMC.hlU.hmc;
      localbel.uwr = i;
      localbel.uuS = 0L;
      int j = ae.bhf().bhN();
      this.qbi = ae.bhp().e(0L, j, true);
      localbel.uwo = this.qbi;
      int k = c.a(this.qbi, 0L, "@__weixintimtline");
      localbel.uwp = k;
      this.qbH = ae.bhp().e(0L, 1, true);
      w.i("MicroMsg.NetSceneSnsPreTimeLine", "newerid " + this.qbH);
      localbel.uwq = this.qbH;
      com.tencent.mm.plugin.sns.storage.k localk = ae.bhs().HE("@__weixintimtline");
      if (localk == null)
      {
        localObject = "";
        label266:
        this.qbI = ((String)localObject);
        if (this.qbI == null) {
          this.qbI = "";
        }
        localbel.uuR = this.qbI;
        if ((localk != null) && (localk.field_adsession != null)) {
          break label469;
        }
      }
      for (localbel.uuy = new axs().bd(new byte[0]);; localbel.uuy = new axs().bd(localk.field_adsession))
      {
        w.i("MicroMsg.NetSceneSnsPreTimeLine", " This req nextCount: " + j + " min:" + this.qbi + " ReqTime:" + localbel.uwp + " nettype: " + i);
        w.d("MicroMsg.NetSceneSnsPreTimeLine", "minId: %s lastReqTime: %s", new Object[] { i.jdMethod_do(this.qbi), Integer.valueOf(k) });
        GMTrace.o(17150609719296L, 127782);
        return;
        if (com.tencent.mm.sdk.platformtools.am.is3G(ab.getContext()))
        {
          i = 3;
          break;
        }
        if (com.tencent.mm.sdk.platformtools.am.is4G(ab.getContext()))
        {
          i = 4;
          break;
        }
        if (!com.tencent.mm.sdk.platformtools.am.is2G(ab.getContext())) {
          break label512;
        }
        i = 2;
        break;
        localObject = localk.field_md5;
        break label266;
        label469:
        w.d("MicroMsg.NetSceneSnsPreTimeLine", "request adsession %s", new Object[] { localk.field_adsession });
      }
      label512:
      i = 0;
    }
  }
  
  private void a(bem parambem, String paramString)
  {
    GMTrace.i(17150743937024L, 127783);
    ai.a("@__weixintimtline", this.fwj, parambem.tze, paramString);
    this.qbi = ((bdk)parambem.tze.getLast()).tDg;
    c.c("@__weixintimtline", ((bdk)parambem.tze.getFirst()).tDg, this.qbi, parambem.uws);
    parambem = parambem.tze.iterator();
    while (parambem.hasNext())
    {
      paramString = (bdk)parambem.next();
      if (paramString.uvp == 0)
      {
        Object localObject1 = ae.bhp().dP(paramString.tDg);
        if ((localObject1 != null) && (((m)localObject1).bjL() != null))
        {
          ??? = ((m)localObject1).bjL().uyu.tKd;
          Object localObject2 = ???.iterator();
          while (((Iterator)localObject2).hasNext())
          {
            amn localamn = (amn)((Iterator)localObject2).next();
            if (???.size() <= 1)
            {
              i = 1;
              label182:
              if (localamn == null) {
                break label323;
              }
              localObject3 = i.e(localamn);
              if (i == 0) {
                break label325;
              }
            }
            label323:
            label325:
            for (int i = 1;; i = 0)
            {
              String str = am.dt(ae.getAccSnsPath(), localamn.nas);
              if ((!FileOp.aZ(str + (String)localObject3)) && (!FileOp.aZ(str + i.l(localamn))) && (!FileOp.aZ(str + i.m(localamn)))) {
                break label330;
              }
              w.i("MicroMsg.NetSceneSnsPreTimeLine", "dealwithMedia exist:%s", new Object[] { localamn.nas });
              break;
              i = 0;
              break label182;
              break;
            }
            label330:
            w.i("MicroMsg.NetSceneSnsPreTimeLine", "dealwithMedia ready to download:%s", new Object[] { localamn.nas });
            Object localObject3 = new com.tencent.mm.plugin.sns.data.e(localamn);
            ((com.tencent.mm.plugin.sns.data.e)localObject3).pYl = i;
            ((com.tencent.mm.plugin.sns.data.e)localObject3).nry = localamn.nas;
            ae.bhk().a(localamn, 1, (com.tencent.mm.plugin.sns.data.e)localObject3, an.veT);
          }
          if (((m)localObject1).field_type == 15)
          {
            localObject2 = ae.bhn();
            if (localObject1 != null) {
              w.i("MicroMsg.SnsVideoService", "%d add preload video[%s]", new Object[] { Integer.valueOf(localObject2.hashCode()), ((m)localObject1).bkg() });
            }
            synchronized (((aq)localObject2).qeW)
            {
              ((aq)localObject2).qeW.addFirst(localObject1);
              try
              {
                localObject1 = ((amn)((m)localObject1).bjL().uyu.tKd.get(0)).mDo;
                g.paX.i(14388, new Object[] { Long.valueOf(paramString.tDg), Integer.valueOf(4), localObject1, Integer.valueOf(0) });
              }
              catch (Exception paramString) {}
            }
          }
        }
      }
    }
    ae.bhn().bhS();
    GMTrace.o(17150743937024L, 127783);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(17151146590208L, 127786);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(17151146590208L, 127786);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(17150878154752L, 127784);
    w.i("MicroMsg.NetSceneSnsPreTimeLine", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramArrayOfByte = (bem)((com.tencent.mm.ac.b)paramp).hlV.hmc;
    if ((paramp.Ba().tpN != 207) && (paramp.Ba().tpN != 0))
    {
      x.Gv("@__weixintimtline");
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(17150878154752L, 127784);
      return;
    }
    if (paramArrayOfByte.uuX != null)
    {
      w.d("MicroMsg.NetSceneSnsPreTimeLine", "serverConfig  " + paramArrayOfByte.uuX.uwk + " " + paramArrayOfByte.uuX.uwj);
      paramInt1 = paramArrayOfByte.uuX.uwk;
      com.tencent.mm.plugin.sns.c.a.pXZ = paramInt1;
      if (paramInt1 <= 0) {
        com.tencent.mm.plugin.sns.c.a.pXZ = Integer.MAX_VALUE;
      }
      com.tencent.mm.storage.v.uTO = paramArrayOfByte.uuX.uwj;
    }
    this.qbk = paramArrayOfByte.uuV;
    this.qbl = paramArrayOfByte.uuW;
    w.i("MicroMsg.NetSceneSnsPreTimeLine", "for same md5 count: " + paramArrayOfByte.uuV + " , objCount:  " + paramArrayOfByte.ujC + " cflag : " + paramArrayOfByte.uuW);
    this.Oh = paramArrayOfByte.ujC;
    String str = i.dp(0L);
    if (!paramArrayOfByte.tze.isEmpty()) {
      w.i("MicroMsg.NetSceneSnsPreTimeLine", "respone size " + paramArrayOfByte.tze.size() + " Max " + ((bdk)paramArrayOfByte.tze.getFirst()).tDg + " " + i.jdMethod_do(((bdk)paramArrayOfByte.tze.getFirst()).tDg) + "  respone min  " + ((bdk)paramArrayOfByte.tze.getLast()).tDg + " " + i.jdMethod_do(((bdk)paramArrayOfByte.tze.getLast()).tDg));
    }
    for (;;)
    {
      this.Oh = paramArrayOfByte.ujC;
      if (!this.qbI.equals(paramArrayOfByte.uuR)) {
        break;
      }
      this.qbi = ae.bhp().e(0L, this.qbk, true);
      w.i("MicroMsg.NetSceneSnsPreTimeLine", "md5 is no change!! the new minid %s", new Object[] { Long.valueOf(this.qbi) });
      x.Gv("@__weixintimtline");
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(17150878154752L, 127784);
      return;
      w.i("MicroMsg.NetSceneSnsPreTimeLine", " respone is Empty");
    }
    w.d("MicroMsg.NetSceneSnsPreTimeLine", "fp resp list size " + paramArrayOfByte.tze.size() + " adsize : " + paramArrayOfByte.uwt);
    ae.bhs().e("@__weixintimtline", paramArrayOfByte.uuR, com.tencent.mm.platformtools.n.a(paramArrayOfByte.uuy));
    paramInt1 = 0;
    while (paramInt1 < paramArrayOfByte.uwu.size())
    {
      Object localObject3 = (ca)paramArrayOfByte.uwu.get(paramInt1);
      localObject1 = com.tencent.mm.platformtools.n.a(((ca)localObject3).tvG);
      localObject2 = com.tencent.mm.platformtools.n.a(((ca)localObject3).tvF.uux);
      localObject3 = com.tencent.mm.platformtools.n.b(((ca)localObject3).tvF.uuw.uve);
      w.i("MicroMsg.NetSceneSnsPreTimeLine", "skXml " + (String)localObject1);
      w.i("MicroMsg.NetSceneSnsPreTimeLine", "adXml " + (String)localObject2);
      w.i("MicroMsg.NetSceneSnsPreTimeLine", "snsXml " + (String)localObject3 + "\r\n");
      paramInt1 += 1;
    }
    a.e(paramArrayOfByte.uwu, paramArrayOfByte.tze);
    a.ah(paramArrayOfByte.uwu);
    if (paramArrayOfByte.uwt == 0)
    {
      w.i("MicroMsg.NetSceneSnsPreTimeLine", "recv %d recommend", new Object[] { Integer.valueOf(paramArrayOfByte.uwv) });
      a.d(paramArrayOfByte.uww, paramArrayOfByte.tze);
      a.ag(paramArrayOfByte.uww);
    }
    Object localObject1 = new LinkedList();
    Object localObject2 = paramArrayOfByte.tze.iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((LinkedList)localObject1).add(Long.valueOf(((bdk)((Iterator)localObject2).next()).tDg));
    }
    localObject2 = new pp();
    ((pp)localObject2).fNv.fNw = ((LinkedList)localObject1);
    com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject2);
    if (paramp.Ba().tpN == 207)
    {
      if (paramArrayOfByte.tze.isEmpty()) {
        ae.bhp().bkx();
      }
      for (;;)
      {
        x.Gv("@__weixintimtline");
        this.gMF.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(17150878154752L, 127784);
        return;
        ae.bhp().HG(i.dp(((bdk)paramArrayOfByte.tze.getFirst()).tDg));
        ae.bhp().HF(i.dp(((bdk)paramArrayOfByte.tze.getLast()).tDg));
        a(paramArrayOfByte, str);
        a.ai(paramArrayOfByte.tze);
      }
    }
    if (paramArrayOfByte.tze.isEmpty()) {
      ae.bhp().bkx();
    }
    for (;;)
    {
      x.Gv("@__weixintimtline");
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(17150878154752L, 127784);
      return;
      a(paramArrayOfByte, str);
      a.ai(paramArrayOfByte.tze);
    }
  }
  
  public final int getType()
  {
    GMTrace.i(17151012372480L, 127785);
    GMTrace.o(17151012372480L, 127785);
    return 718;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */