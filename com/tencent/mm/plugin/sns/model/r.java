package com.tencent.mm.plugin.sns.model;

import android.text.TextUtils;
import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.g.a.mc;
import com.tencent.mm.g.a.md;
import com.tencent.mm.g.a.md.a;
import com.tencent.mm.g.a.me;
import com.tencent.mm.g.a.me.a;
import com.tencent.mm.g.a.pk;
import com.tencent.mm.g.a.pl;
import com.tencent.mm.g.a.tb;
import com.tencent.mm.g.a.tb.a;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvideo.n.a;
import com.tencent.mm.network.j;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.h.f;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.protocal.c.aku;
import com.tencent.mm.protocal.c.aml;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.amo;
import com.tencent.mm.protocal.c.amq;
import com.tencent.mm.protocal.c.aq;
import com.tencent.mm.protocal.c.as;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.protocal.c.axt;
import com.tencent.mm.protocal.c.bcv;
import com.tencent.mm.protocal.c.bdf;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.bdu;
import com.tencent.mm.protocal.c.bdv;
import com.tencent.mm.protocal.c.bdw;
import com.tencent.mm.protocal.c.bdz;
import com.tencent.mm.protocal.c.bfg;
import com.tencent.mm.protocal.c.bfi;
import com.tencent.mm.protocal.c.bft;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.bib;
import com.tencent.mm.protocal.c.cr;
import com.tencent.mm.protocal.c.jc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.q.b;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class r
  extends k
  implements j
{
  private com.tencent.mm.ac.b gMC;
  public com.tencent.mm.ac.e gMF;
  public int gNq;
  private com.tencent.mm.sdk.b.c gNt;
  private com.tencent.mm.sdk.b.c gNu;
  boolean kFb;
  int pYt;
  private tb qbA;
  public int qbB;
  public String qbC;
  public HashMap<String, amn> qbD;
  public HashMap<String, Integer> qbE;
  public String qbF;
  private bhc qbw;
  private bhc qbx;
  long qby;
  private int qbz;
  
  public r(String paramString1, int paramInt1, int paramInt2, List<String> paramList, bhc parambhc, int paramInt3, String paramString2, int paramInt4, LinkedList<Long> paramLinkedList, int paramInt5, amo paramamo, boolean paramBoolean, LinkedList<axt> paramLinkedList1, bdu parambdu, com.tencent.mm.bl.b paramb, String paramString3)
  {
    GMTrace.i(8149297790976L, 60717);
    this.qby = 0L;
    this.kFb = false;
    this.qbz = 0;
    this.gNq = 0;
    this.qbC = "";
    this.qbD = new HashMap();
    this.qbE = new HashMap();
    this.qbF = "";
    this.gNt = new com.tencent.mm.sdk.b.c()
    {
      private boolean a(me paramAnonymousme)
      {
        GMTrace.i(8069706678272L, 60124);
        if (!r.this.qbE.containsKey(paramAnonymousme.fKo.filePath))
        {
          GMTrace.o(8069706678272L, 60124);
          return false;
        }
        int i = ((Integer)r.this.qbE.remove(paramAnonymousme.fKo.filePath)).intValue();
        try
        {
          str1 = URLEncoder.encode(paramAnonymousme.fKo.result, "UTF-8");
          if (r.this.gNq != 0)
          {
            paramAnonymousme = (amn)r.this.qbD.get(paramAnonymousme.fKo.filePath);
            r.this.qbC += String.format("position=%d&qrUrl=%s&md5=%s&imgUrl=%s|", new Object[] { Integer.valueOf(i), str1, paramAnonymousme.uhO, paramAnonymousme.mDo });
          }
          if (r.this.qbB == 12)
          {
            str1 = "2,3,," + str1;
            paramAnonymousme = str1;
            if (i != 0) {}
          }
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          try
          {
            String str1;
            paramAnonymousme = str1 + "," + URLEncoder.encode(r.this.qbF, "UTF-8");
            w.i("MicroMsg.NetSceneSnsPost", "androidSystemShareFixed(13717) fileToIndex:%d,  %s", new Object[] { Integer.valueOf(i), paramAnonymousme });
            com.tencent.mm.plugin.report.service.g.paX.z(13717, paramAnonymousme);
            r.this.bgI();
            GMTrace.o(8069706678272L, 60124);
            return false;
            localUnsupportedEncodingException = localUnsupportedEncodingException;
            w.printErrStackTrace("MicroMsg.NetSceneSnsPost", localUnsupportedEncodingException, "", new Object[0]);
            str2 = "";
          }
          catch (UnsupportedEncodingException paramAnonymousme)
          {
            for (;;)
            {
              String str2;
              paramAnonymousme = str2;
            }
          }
        }
      }
    };
    this.gNu = new com.tencent.mm.sdk.b.c()
    {
      private boolean a(md paramAnonymousmd)
      {
        GMTrace.i(18585665667072L, 138474);
        if (!r.this.qbE.containsKey(paramAnonymousmd.fKn.filePath))
        {
          GMTrace.o(18585665667072L, 138474);
          return false;
        }
        int i = ((Integer)r.this.qbE.remove(paramAnonymousmd.fKn.filePath)).intValue();
        String str;
        if (r.this.qbB == 12)
        {
          str = "2,3,,";
          paramAnonymousmd = str;
          if (i != 0) {}
        }
        try
        {
          paramAnonymousmd = "2,3,," + "," + URLEncoder.encode(r.this.qbF, "UTF-8");
          w.i("MicroMsg.NetSceneSnsPost", "androidSystemShareFixed(13717) fileToIndex:%d,  %s", new Object[] { Integer.valueOf(i), paramAnonymousmd });
          com.tencent.mm.plugin.report.service.g.paX.z(13717, paramAnonymousmd);
          r.this.bgI();
          GMTrace.o(18585665667072L, 138474);
          return false;
        }
        catch (UnsupportedEncodingException paramAnonymousmd)
        {
          for (;;)
          {
            paramAnonymousmd = str;
          }
        }
      }
    };
    this.qbw = parambhc;
    this.pYt = paramInt3;
    this.qbB = paramInt5;
    localObject1 = new b.a();
    ((b.a)localObject1).hlX = new bdv();
    ((b.a)localObject1).hlY = new bdw();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/mmsnspost";
    ((b.a)localObject1).hlW = 209;
    ((b.a)localObject1).hlZ = 97;
    ((b.a)localObject1).hma = 1000000097;
    this.gMC = ((b.a)localObject1).DA();
    bdv localbdv = (bdv)this.gMC.hlU.hmc;
    if (!TextUtils.isEmpty(parambhc.qfM.tuc.ttW))
    {
      localObject1 = new jc();
      ((jc)localObject1).tEi = parambhc.qfM.tuc.ttW;
      localbdv.uvS = ((jc)localObject1);
    }
    localObject1 = com.tencent.mm.x.q.Aw().gh(paramamo.fwy);
    Object localObject2;
    if (localObject1 != null)
    {
      this.qbA = new tb();
      this.qbA.fRM.fRN = ((q.b)localObject1).getString("prePublishId", "");
      this.qbA.fRM.url = ((q.b)localObject1).getString("url", "");
      this.qbA.fRM.fRP = ((q.b)localObject1).getString("preUsername", "");
      this.qbA.fRM.fRQ = ((q.b)localObject1).getString("preChatName", "");
      this.qbA.fRM.fRR = ((q.b)localObject1).getInt("preMsgIndex", 0);
      this.qbA.fRM.fRV = ((q.b)localObject1).getInt("sendAppMsgScene", 0);
      this.qbA.fRM.fRW = ((q.b)localObject1).getInt("getA8KeyScene", 0);
      this.qbA.fRM.fRX = ((q.b)localObject1).getString("referUrl", null);
      this.qbA.fRM.fRY = ((q.b)localObject1).getString("adExtStr", null);
      this.qbA.fRM.fRZ = paramString3;
      localObject1 = "";
      paramString3 = (String)localObject1;
      if (parambhc.qBT != null)
      {
        localObject2 = new bfi();
        paramString3 = Base64.decode(parambhc.qBT, 0);
      }
    }
    try
    {
      ((bfi)localObject2).aC(paramString3);
      paramString3 = (String)localObject1;
      if (((bfi)localObject2).uxv != null) {
        paramString3 = ((bfi)localObject2).uxv.mzX;
      }
    }
    catch (Exception paramString3)
    {
      for (;;)
      {
        int i;
        int j;
        paramString3 = (String)localObject1;
      }
    }
    localObject1 = paramString3;
    if (bg.mZ(paramString3))
    {
      localObject1 = paramString3;
      if (parambhc.uyt != null) {
        localObject1 = parambhc.uyt.nas;
      }
    }
    localbdv.uvR = String.format(Locale.US, "prePublishId=%s&preUserName=%s&preChatName=%s&preChatType=%d&getA8KeyScene=%d&sourceAppId=%s", new Object[] { this.qbA.fRM.fRN, this.qbA.fRM.fRP, this.qbA.fRM.fRQ, Integer.valueOf(com.tencent.mm.x.p.G(this.qbA.fRM.fRP, this.qbA.fRM.fRQ)), Integer.valueOf(this.qbA.fRM.fRW), localObject1 });
    paramString3 = new axs();
    paramString3.bd(paramString1.getBytes());
    i = paramString1.length();
    j = paramString3.usf;
    if (paramb == null) {}
    for (paramInt3 = 0;; paramInt3 = paramb.toK.length)
    {
      w.i("MicroMsg.NetSceneSnsPost", "len:%d   skb:%d ctx.len:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramInt3) });
      localbdv.uve = paramString3;
      localbdv.uvM = paramInt1;
      localbdv.uhX = paramInt2;
      localbdv.tvh = paramString2;
      this.qbz = paramInt1;
      if (com.tencent.mm.platformtools.r.ibQ)
      {
        localbdv.uve = new axs();
        w.e("MicroMsg.NetSceneSnsPost", "post error setObjectDesc is null!");
      }
      paramString3 = new LinkedList();
      if ((paramList == null) || (paramList.size() <= 0)) {
        break label939;
      }
      paramList = paramList.iterator();
      for (paramString1 = ""; paramList.hasNext(); paramString1 = paramString1 + "; + " + (String)localObject1)
      {
        localObject1 = (String)paramList.next();
        localObject2 = new axt();
        ((axt)localObject2).Qx((String)localObject1);
        paramString3.add(localObject2);
      }
    }
    w.d("MicroMsg.NetSceneSnsPost", "post with list : " + paramString1);
    label939:
    localbdv.uvo = paramString3;
    localbdv.uvn = paramString3.size();
    localbdv.uvN = paramInt4;
    paramString1 = localbdv.uvR;
    if (paramamo.uir != null)
    {
      paramInt1 = paramamo.uir.uuQ;
      w.d("MicroMsg.NetSceneSnsPost", "setObjectSource: %d, clientid:%s fromScene:%s, score:%d", new Object[] { Integer.valueOf(paramInt5), paramString2, paramString1, Integer.valueOf(paramInt1) });
      if ((paramLinkedList1 != null) && (paramLinkedList1.size() > 0))
      {
        if (!paramBoolean) {
          break label1219;
        }
        localbdv.uvt = paramLinkedList1;
        localbdv.uvs = paramLinkedList1.size();
      }
    }
    for (;;)
    {
      w.d("MicroMsg.NetSceneSnsPost", "setObjectSource " + paramInt5);
      localbdv.uvO = paramInt5;
      paramString1 = new bib();
      if (!bg.mZ(paramamo.token))
      {
        paramString1.uzi = paramamo.token;
        paramString1.uzj = paramamo.uih;
        localbdv.uob = paramString1;
      }
      if ((paramLinkedList == null) || (paramLinkedList.isEmpty())) {
        break label1283;
      }
      localbdv.ukL = paramLinkedList.size();
      paramString1 = paramLinkedList.iterator();
      while (paramString1.hasNext())
      {
        paramList = (Long)paramString1.next();
        paramString2 = new bdf();
        paramString2.uvc = paramList.longValue();
        localbdv.uie.add(paramString2);
      }
      paramInt1 = 0;
      break;
      label1219:
      localbdv.uij = paramLinkedList1;
      localbdv.uvu = paramLinkedList1.size();
    }
    w.d("MicroMsg.NetSceneSnsPost", "tagid " + paramLinkedList.size() + " " + localbdv.uie.toString());
    label1283:
    localbdv.uik = parambdu;
    if (!bg.mZ(paramamo.uim)) {
      localbdv.uvw = new bdz();
    }
    if (parambdu != null) {
      w.d("MicroMsg.NetSceneSnsPost", "SnsPostOperationFields: ShareUrlOriginal=%s, ShareUrlOpen=%s, JsAppId=%s", new Object[] { parambdu.twj, parambdu.twk, parambdu.twl });
    }
    if (paramb != null) {
      localbdv.uvQ = new axs().b(paramb);
    }
    localbdv.uvV = paramamo.uir;
    paramString1 = ae.bhp().uI(this.pYt);
    if ((paramString1 != null) && ((paramString1.field_type == 1) || (paramString1.field_type == 15)) && (parambhc.uyu != null) && (parambhc.uyu.tKd != null) && (parambhc.uyu.tKd.size() > 0) && (paramamo.uhY != null) && (paramamo.uhY.size() == parambhc.uyu.tKd.size()))
    {
      paramString1 = ae.getAccSnsPath();
      paramList = parambhc.uyu.tKd.iterator();
      paramInt1 = 0;
    }
    for (;;)
    {
      if (paramList.hasNext())
      {
        paramLinkedList = (amn)paramList.next();
        if ((paramLinkedList.jXP == 2) || (paramLinkedList.jXP == 6))
        {
          parambhc = new aml();
          if (paramLinkedList.jXP != 2) {
            break label1763;
          }
          paramInt2 = 2;
          label1562:
          parambhc.mFT = paramInt2;
          if (paramLinkedList.jXP == 6)
          {
            paramString2 = am.dt(paramString1, paramLinkedList.nas);
            paramLinkedList = i.p(paramLinkedList);
            paramString2 = com.tencent.mm.plugin.sight.base.d.FK(paramString2 + paramLinkedList);
            if (paramString2 != null) {
              parambhc.uhw = ((int)Math.round(paramString2.lWB / 1000.0D));
            }
          }
          paramString2 = (aku)paramamo.uhY.get(paramInt1);
          paramString2 = ae.bhe().dQ(paramString2.ufH);
        }
      }
      try
      {
        parambhc.twh = ((amq)new amq().aC(paramString2.qvA)).uiD;
        w.i("MicroMsg.NetSceneSnsPost", "post add mediaInfo, Source: %s, videoPlayLength: %s, MediaType: %s", new Object[] { Integer.valueOf(parambhc.twh), Integer.valueOf(parambhc.uhw), Integer.valueOf(parambhc.mFT) });
        localbdv.uvU.add(parambhc);
        paramInt1 += 1;
        continue;
        label1763:
        paramInt2 = 1;
        break label1562;
        localbdv.uvT = localbdv.uvU.size();
        w.i("MicroMsg.NetSceneSnsPost", "post mediaCount: %s", new Object[] { Integer.valueOf(localbdv.uvT) });
        localbdv.uft = new axs().bd(com.tencent.mm.plugin.normsg.a.d.okG.aSN());
        GMTrace.o(8149297790976L, 60717);
        return;
      }
      catch (Exception paramString2)
      {
        for (;;) {}
      }
    }
  }
  
  private void Gw(String paramString)
  {
    GMTrace.i(18585934102528L, 138476);
    this.qbF = paramString;
    paramString = com.tencent.mm.x.c.c.Cu().em("100132");
    if (paramString.isValid()) {
      this.gNq = bg.getInt((String)paramString.bPn().get("needUploadData"), 1);
    }
    if ((this.qbB != 12) && (this.gNq == 0))
    {
      GMTrace.o(18585934102528L, 138476);
      return;
    }
    if ((this.qbx != null) && (this.qbx.uyu != null) && (this.qbx.uyu.tKd != null) && (this.qbx.uyu.tKd.size() > 0))
    {
      paramString = this.qbx.uyu.tKd;
      com.tencent.mm.sdk.b.a.uLm.b(this.gNt);
      com.tencent.mm.sdk.b.a.uLm.b(this.gNu);
      paramString = paramString.iterator();
      int i = 0;
      while (paramString.hasNext())
      {
        Object localObject = (amn)paramString.next();
        if (((amn)localObject).jXP == 2)
        {
          String str = g.B((amn)localObject);
          if (!bg.mZ(str))
          {
            this.qbE.put(str, Integer.valueOf(i));
            this.qbD.put(str, localObject);
            localObject = new mc();
            ((mc)localObject).fKl.filePath = str;
            com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
            i += 1;
          }
        }
      }
    }
    GMTrace.o(18585934102528L, 138476);
  }
  
  private static boolean a(bhc parambhc1, bhc parambhc2)
  {
    GMTrace.i(8149834661888L, 60721);
    if ((parambhc1 == null) || (parambhc2 == null) || (parambhc1.uyu == null) || (parambhc2.uyu == null))
    {
      GMTrace.o(8149834661888L, 60721);
      return false;
    }
    String str1 = ae.getAccSnsPath();
    int i = 0;
    while ((i < parambhc1.uyu.tKd.size()) && (i < parambhc2.uyu.tKd.size()))
    {
      Object localObject2 = (amn)parambhc1.uyu.tKd.get(i);
      Object localObject1 = (amn)parambhc2.uyu.tKd.get(i);
      String str2 = i.m((amn)localObject2);
      String str3 = i.n((amn)localObject2);
      String str4 = i.o((amn)localObject2);
      String str5 = i.p((amn)localObject2);
      String str6 = i.l((amn)localObject1);
      String str7 = i.e((amn)localObject1);
      String str8 = i.f((amn)localObject1);
      String str9 = i.j((amn)localObject1);
      w.d("MicroMsg.NetSceneSnsPost", "updateMediaFileName " + str2 + "  - " + str6);
      localObject2 = am.dt(str1, ((amn)localObject2).nas);
      localObject1 = am.dt(str1, ((amn)localObject1).nas);
      FileOp.kL((String)localObject1);
      FileOp.ak((String)localObject2 + str2, (String)localObject1 + str6);
      FileOp.ak((String)localObject2 + str3, (String)localObject1 + str7);
      FileOp.ak((String)localObject2 + str4, (String)localObject1 + str8);
      if (FileOp.aZ((String)localObject2 + str5))
      {
        w.i("MicroMsg.NetSceneSnsPost", "post done copy file %s", new Object[] { (String)localObject1 + str9 });
        FileOp.ak((String)localObject2 + str5, (String)localObject1 + str9);
      }
      i += 1;
    }
    GMTrace.o(8149834661888L, 60721);
    return true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(8149432008704L, 60718);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(8149432008704L, 60718);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(8149566226432L, 60719);
    w.i("MicroMsg.NetSceneSnsPost", "post netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    Object localObject1 = (bdw)((com.tencent.mm.ac.b)paramp).hlV.hmc;
    if (paramInt2 == 4) {
      paramp = ae.bhp().uI(this.pYt);
    }
    try
    {
      paramArrayOfByte = (amo)new amo().aC(paramp.field_postBuf);
      paramArrayOfByte.uig = paramInt3;
      paramArrayOfByte.uip = ((bdw)localObject1).uip;
      paramArrayOfByte.uiq = false;
      paramp.field_postBuf = paramArrayOfByte.toByteArray();
      if (paramp != null)
      {
        paramp.bkk();
        ae.bhp().b(this.pYt, paramp);
        ae.bho().tZ(this.pYt);
        w.d("MicroMsg.NetSceneSnsPost", "onErrorServer, publish SnsPostFailEvent, snsInfoLocalId: " + paramp.bkg());
        paramp = new pk();
        paramp.fNn.fNo = this.pYt;
        com.tencent.mm.sdk.b.a.uLm.m(paramp);
      }
      if ((this.qbw != null) && (this.qbw.uyu != null) && (this.qbw.uyu.tKc == 21))
      {
        com.tencent.mm.plugin.sns.lucky.a.b.nK(8);
        switch (paramInt3)
        {
        default: 
          com.tencent.mm.plugin.sns.lucky.a.b.nK(20);
        }
      }
      for (;;)
      {
        this.gMF.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(8149566226432L, 60719);
        return;
        com.tencent.mm.plugin.sns.lucky.a.b.nK(17);
        continue;
        com.tencent.mm.plugin.sns.lucky.a.b.nK(19);
        continue;
        com.tencent.mm.plugin.sns.lucky.a.b.nK(18);
      }
      if (paramInt3 != 0)
      {
        ae.bho().tZ(this.pYt);
        if ((this.qbw != null) && (this.qbw.uyu != null) && (this.qbw.uyu.tKc == 21))
        {
          com.tencent.mm.plugin.sns.lucky.a.b.nK(8);
          com.tencent.mm.plugin.sns.lucky.a.b.nK(16);
        }
        this.gMF.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(8149566226432L, 60719);
        return;
      }
      if ((((bdw)localObject1).uuw == null) || (((bdw)localObject1).uuw.uve == null) || (((bdw)localObject1).uuw.uve.ush == null))
      {
        w.e("MicroMsg.NetSceneSnsPost", "err respone buffer is null ignore");
        ae.bho().tZ(this.pYt);
        paramp = ae.bhp().uI(this.pYt);
        paramp.bkj();
        ae.bhp().b(this.pYt, paramp);
        paramp = new pl();
        paramp.fNp.fNo = this.pYt;
        com.tencent.mm.sdk.b.a.uLm.m(paramp);
        this.gMF.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(8149566226432L, 60719);
        return;
      }
      Object localObject2 = new String(((bdw)localObject1).uuw.uve.ush.toByteArray());
      if (this.qbz == 0) {
        w.d("MicroMsg.NetSceneSnsPost", "resp " + (String)localObject2 + "  ");
      }
      this.qbx = com.tencent.mm.modelsns.e.lm((String)localObject2);
      if (this.qbx.uyz != null)
      {
        paramp = this.qbx.nas;
        paramArrayOfByte = this.qbx.uyz.hdj;
        String str = this.qbx.uyz.hdi;
        com.tencent.mm.modelsns.d locald = new com.tencent.mm.modelsns.d();
        locald.m("20CurrPublishId", paramp + ",");
        locald.m("20SourcePublishId", paramArrayOfByte + ",");
        locald.m("20SourceAdUxInfo", str + ",");
        w.i("MicroMsg.SnsVideoStatistic", "report snsad_shareReport: " + locald.LL());
        com.tencent.mm.plugin.report.service.g.paX.i(13004, new Object[] { locald });
      }
      paramArrayOfByte = ae.bhp().uI(this.pYt);
      paramp = paramArrayOfByte;
      if (paramArrayOfByte == null)
      {
        w.e("MicroMsg.NetSceneSnsPost", "the item has delete");
        paramp = new m();
      }
      paramp.fZ(((bdw)localObject1).uuw.orU);
      paramp.Hy((String)localObject2);
      paramp.field_localFlag &= 0xFFFFFFEF;
      paramp.dL(((bdw)localObject1).uuw.tDg);
      paramp.dN(((bdw)localObject1).uuw.tDg);
      if ((((bdw)localObject1).uuw.ujv & 0x1) > 0) {
        paramp.bkd();
      }
      this.qby = ((bdw)localObject1).uuw.tDg;
      if (this.qbA != null)
      {
        this.qbA.fRM.fRO = ("sns_" + i.jdMethod_do(this.qby));
        com.tencent.mm.sdk.b.a.uLm.m(this.qbA);
      }
      localObject2 = ((bdw)localObject1).uuw;
      ((bdk)localObject2).uve.bd(new byte[0]);
      try
      {
        if ((((bdk)localObject2).uvk == 0) && (((bdk)localObject2).uvh == 0) && (((bdk)localObject2).uvn == 0) && (((bdk)localObject2).ukL == 0)) {
          w.d("MicroMsg.NetSceneSnsPost", "no use! this buf");
        }
        for (;;)
        {
          paramp.bkj();
          ae.bhp().b(this.pYt, paramp);
          ae.bho().tZ(this.pYt);
          paramArrayOfByte = com.tencent.mm.plugin.sns.h.e.qkT.bq(Integer.valueOf(this.pYt));
          if ((paramArrayOfByte != null) && (this.qbx != null))
          {
            paramArrayOfByte.LG();
            paramArrayOfByte.LH();
            paramArrayOfByte.lj(this.qbx.nas);
            paramArrayOfByte.gP(this.qbx.uyu.tKc);
            paramArrayOfByte.LJ();
          }
          paramArrayOfByte = f.qkT.bq(Integer.valueOf(this.pYt));
          if ((paramArrayOfByte != null) && (this.qbx != null))
          {
            paramArrayOfByte.LG();
            paramArrayOfByte.LH();
            paramArrayOfByte.lj(this.qbx.nas);
            paramArrayOfByte.gP(this.qbx.uyu.tKc);
            paramArrayOfByte.LJ();
          }
          paramArrayOfByte = new pl();
          paramArrayOfByte.fNp.fNo = this.pYt;
          com.tencent.mm.sdk.b.a.uLm.m(paramArrayOfByte);
          if (paramp.field_type == 21)
          {
            if (paramp.field_pravited != 1) {
              paramInt1 = ((bdw)localObject1).uuw.ujv;
            }
            com.tencent.mm.plugin.sns.lucky.a.b.nK(7);
            paramArrayOfByte = this.qbx.nas;
            System.currentTimeMillis();
          }
          a(this.qbw, this.qbx);
          if (this.qbx != null) {
            break;
          }
          paramArrayOfByte = "";
          Gw(paramArrayOfByte);
          if (ae.bhl() != null) {
            ae.bhl().bgd();
          }
          try
          {
            if (paramp.field_type == 15)
            {
              localObject1 = (amn)this.qbx.uyu.tKd.get(0);
              if (localObject1 != null)
              {
                paramp = am.dt(ae.getAccSnsPath(), ((amn)localObject1).nas) + i.j((amn)localObject1);
                paramArrayOfByte = com.tencent.mm.modelvideo.n.MY();
                localObject1 = ((amn)localObject1).mDo;
                l = ((bdk)localObject2).tDg;
                if (!bg.mZ((String)localObject1))
                {
                  boolean bool = bg.mZ(paramp);
                  if (!bool) {
                    break label1547;
                  }
                }
              }
            }
          }
          catch (Exception paramp)
          {
            long l;
            for (;;) {}
          }
          this.gMF.a(paramInt2, paramInt3, paramString, this);
          GMTrace.o(8149566226432L, 60719);
          return;
          paramp.aE(((bdk)localObject2).toByteArray());
        }
      }
      catch (IOException paramArrayOfByte)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.NetSceneSnsPost", paramArrayOfByte, "", new Object[0]);
          continue;
          paramArrayOfByte = this.qbx.uyr;
          continue;
          label1547:
          localObject2 = ((String)localObject1).hashCode();
          w.d("MicroMsg.SubCoreMediaRpt", "rpt sns video upload info snsKey[%s] url[%s] snsId[%d] path[%s]", new Object[] { localObject2, localObject1, Long.valueOf(l), paramp });
          localObject1 = (n.a)paramArrayOfByte.hTM.get(localObject2);
          if (localObject1 != null)
          {
            ((n.a)localObject1).hUa = String.valueOf(l);
            ((n.a)localObject1).hTZ = paramp;
            paramArrayOfByte.a(((n.a)localObject1).hTq, (String)localObject2);
          }
        }
      }
    }
    catch (Exception paramArrayOfByte)
    {
      for (;;) {}
    }
  }
  
  public final void bgI()
  {
    GMTrace.i(16042239721472L, 119524);
    if (this.qbE.isEmpty())
    {
      com.tencent.mm.sdk.b.a.uLm.c(this.gNt);
      com.tencent.mm.sdk.b.a.uLm.c(this.gNu);
      if ((this.gNq != 0) && (!bg.mZ(this.qbC))) {
        if (this.qbx.uyt != null) {
          break label183;
        }
      }
    }
    label183:
    for (String str = "";; str = this.qbx.uyt.nas)
    {
      int i = this.qbx.uyu.tKd.size();
      w.i("MicroMsg.NetSceneSnsPost", "report qrCodeImgSns(13627), snsId:%s, size:%d, info:%s, appId:%s", new Object[] { this.qbx.nas, Integer.valueOf(i), this.qbC, str });
      com.tencent.mm.modelstat.n.r(13627, String.format(Locale.US, "%s,%d,%s,%s", new Object[] { this.qbx.nas, Integer.valueOf(i), this.qbC, str }));
      GMTrace.o(16042239721472L, 119524);
      return;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(8149968879616L, 60722);
    GMTrace.o(8149968879616L, 60722);
    return 209;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */