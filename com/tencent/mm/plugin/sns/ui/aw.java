package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.text.StaticLayout;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.model.al.a;
import com.tencent.mm.protocal.c.akv;
import com.tencent.mm.protocal.c.amo;
import com.tencent.mm.protocal.c.bcz;
import com.tencent.mm.protocal.c.bdg;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.bdz;
import com.tencent.mm.protocal.c.bf;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.cr;
import com.tencent.mm.protocal.c.sn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.vending.d.b.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class aw
  extends com.tencent.mm.vending.a.b<ay, com.tencent.mm.plugin.sns.storage.m>
{
  private boolean DEBUG;
  ar hhr;
  volatile String lBB;
  Context mContext;
  volatile String qEP;
  av qPA;
  private int qPB;
  private com.tencent.mm.l.a qPC;
  private boolean qPD;
  volatile boolean qPE;
  byte[] qPF;
  protected HashMap<String, String> qPG;
  public HashMap<String, Boolean> qPH;
  private String qPI;
  private String qPJ;
  String qyX;
  
  public aw()
  {
    super(new com.tencent.mm.plugin.sns.storage.m());
    GMTrace.i(8661069987840L, 64530);
    this.DEBUG = false;
    this.qPB = ((int)(System.currentTimeMillis() / 1000L));
    this.qPD = false;
    this.qPE = false;
    this.lBB = "";
    this.qEP = "";
    this.qPF = new byte[0];
    this.qPG = new HashMap();
    this.qPH = new HashMap();
    this.qPI = "";
    this.qPJ = "";
    cgS();
    GMTrace.o(8661069987840L, 64530);
  }
  
  private void a(int paramInt, ay paramay)
  {
    GMTrace.i(8661875294208L, 64536);
    Object localObject1 = paramay.pFT.uvl;
    com.tencent.mm.kiss.widget.textview.a.a locala = com.tencent.mm.plugin.sns.ui.widget.a.bot().bou();
    paramay.qPW = new com.tencent.mm.plugin.sns.data.d();
    if (this.DEBUG) {
      w.d("MicroMsg.SnsTimeLineVendingSide", "debug:renderSnsComment position " + paramInt + " commentInfoList: " + ((List)localObject1).size() + " commentData:" + paramay.qPW.pYk.size());
    }
    Iterator localIterator = ((List)localObject1).iterator();
    bcz localbcz;
    com.tencent.mm.kiss.widget.textview.c localc;
    Context localContext;
    Object localObject3;
    Object localObject2;
    String str;
    if (localIterator.hasNext())
    {
      localbcz = (bcz)localIterator.next();
      localc = com.tencent.mm.kiss.widget.textview.c.gTt;
      localContext = this.mContext;
      localObject3 = paramay.pFU.field_userName;
      localObject2 = com.tencent.mm.plugin.sns.ui.widget.b.a(localbcz);
      str = localbcz.ovi;
      localObject1 = null;
      if (!bg.mZ((String)localObject3))
      {
        com.tencent.mm.kernel.h.xA();
        localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yL().SJ((String)localObject3);
      }
      if (localbcz.uuJ == 1)
      {
        if (localObject1 == null) {
          break label818;
        }
        if (localObject1 == null)
        {
          localObject1 = localObject3;
          label222:
          localObject2 = (String)localObject2 + localContext.getString(i.j.pRJ);
          localObject1 = (String)localObject2 + (String)localObject1;
        }
      }
    }
    for (;;)
    {
      localObject1 = "" + (String)localObject1 + ": ";
      localObject1 = (String)localObject1 + str;
      if (locala != null)
      {
        localObject2 = (com.tencent.mm.kiss.widget.textview.b)localc.gTu.get(Integer.valueOf(com.tencent.mm.kiss.widget.textview.c.a(locala)));
        if (localObject2 != null)
        {
          localObject1 = (LinkedList)((com.tencent.mm.kiss.widget.textview.b)localObject2).gTs.get(((CharSequence)localObject1).toString());
          if ((localObject1 == null) || (((LinkedList)localObject1).size() == 0)) {
            paramInt = 0;
          }
        }
      }
      for (;;)
      {
        if (paramInt == 0) {
          break label555;
        }
        localObject1 = com.tencent.mm.plugin.sns.ui.widget.b.a(this.mContext, localbcz, this.qPA, paramay.pFU.field_type, paramay.pFU.field_userName);
        paramay.qPW.a(localbcz, (CharSequence)localObject1);
        break;
        localObject1 = ((x)localObject1).vq();
        break label222;
        if (bg.mZ(localbcz.uuY)) {
          break label818;
        }
        localObject1 = ae.bhd().SK(localbcz.uuY);
        if (localObject1 == null) {}
        for (localObject1 = localbcz.uuY;; localObject1 = ((com.tencent.mm.l.a)localObject1).vq())
        {
          localObject2 = (String)localObject2 + localContext.getString(i.j.pTz);
          localObject1 = (String)localObject2 + (String)localObject1;
          break;
        }
        paramInt = 1;
        continue;
        paramInt = 0;
      }
      label555:
      localObject1 = com.tencent.mm.plugin.sns.ui.widget.b.a(this.mContext, localbcz, this.qPA, paramay.pFU.field_type, paramay.pFU.field_userName);
      paramay.qPW.a(localbcz, (CharSequence)localObject1);
      localObject2 = com.tencent.mm.plugin.sns.ui.widget.a.bot();
      if (((com.tencent.mm.plugin.sns.ui.widget.a)localObject2).qXl <= 0)
      {
        localObject3 = new DisplayMetrics();
        ((WindowManager)ab.getContext().getSystemService("window")).getDefaultDisplay().getMetrics((DisplayMetrics)localObject3);
        paramInt = ((DisplayMetrics)localObject3).widthPixels;
        int i = (int)(ab.getResources().getDimension(i.d.aSg) + ab.getResources().getDimension(i.d.aSg));
        int j = (int)ab.getResources().getDimension(i.d.pGz);
        int k = (int)ab.getResources().getDimension(i.d.aSg);
        ((com.tencent.mm.plugin.sns.ui.widget.a)localObject2).qXl = (paramInt - j - i - k);
        w.i("MicroMsg.SnsCommentPreloadTextViewConfig", "screenWidth " + paramInt + " textViewWidth " + ((com.tencent.mm.plugin.sns.ui.widget.a)localObject2).qXl + " padding: " + i + " marginLeft: " + j + " thisviewPadding: " + k);
      }
      paramInt = ((com.tencent.mm.plugin.sns.ui.widget.a)localObject2).qXl;
      if (paramInt <= 0) {
        break;
      }
      localObject1 = com.tencent.mm.kiss.widget.textview.d.a((CharSequence)localObject1, paramInt, locala).xP();
      com.tencent.mm.kiss.widget.textview.c.gTt.a(locala, (com.tencent.mm.kiss.widget.textview.f)localObject1);
      break;
      GMTrace.o(8661875294208L, 64536);
      return;
      label818:
      localObject1 = localObject2;
    }
  }
  
  private String f(bhc parambhc)
  {
    GMTrace.i(8661606858752L, 64534);
    if (parambhc.uyt == null)
    {
      GMTrace.o(8661606858752L, 64534);
      return "";
    }
    if (bg.mZ(parambhc.uyt.nas))
    {
      GMTrace.o(8661606858752L, 64534);
      return "";
    }
    if (this.qPG.containsKey(parambhc.uyt.nas))
    {
      parambhc = (String)this.qPG.get(parambhc.uyt.nas);
      GMTrace.o(8661606858752L, 64534);
      return parambhc;
    }
    int i = bg.getInt(parambhc.uyt.jXC, 0);
    String str = com.tencent.mm.pluginsdk.model.app.g.a(this.mContext, com.tencent.mm.pluginsdk.model.app.g.cA(parambhc.uyt.nas, i), null);
    if (bg.mZ(str))
    {
      GMTrace.o(8661606858752L, 64534);
      return str;
    }
    this.qPG.put(parambhc.uyt.nas, str);
    GMTrace.o(8661606858752L, 64534);
    return str;
  }
  
  private static boolean g(bhc parambhc)
  {
    GMTrace.i(8661741076480L, 64535);
    if (bg.mZ(parambhc.uyv))
    {
      GMTrace.o(8661741076480L, 64535);
      return true;
    }
    if ((al.a.bhO() & 0x2) <= 0)
    {
      GMTrace.o(8661741076480L, 64535);
      return true;
    }
    GMTrace.o(8661741076480L, 64535);
    return false;
  }
  
  private ay vg(int paramInt)
  {
    GMTrace.i(8661472641024L, 64533);
    if (paramInt < 0)
    {
      GMTrace.o(8661472641024L, 64533);
      return null;
    }
    w.i("MicroMsg.SnsTimeLineVendingSide", "resolveAsynchronous %s", new Object[] { Integer.valueOf(paramInt) });
    long l2 = System.currentTimeMillis();
    ay localay = new ay();
    com.tencent.mm.plugin.sns.storage.m localm = (com.tencent.mm.plugin.sns.storage.m)super.getItem(paramInt);
    if (localm == null)
    {
      w.printErrStackTrace("MicroMsg.SnsTimeLineVendingSide", new Throwable(), "mSnsInfo is null, index %s, count %s, why?", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.mCount) });
      GMTrace.o(8661472641024L, 64533);
      return localay;
    }
    bhc localbhc = localm.bjL();
    bdk localbdk = ai.n(localm);
    int j = av.d(localbhc);
    localay.Zk = j;
    localay.qQa = localm.field_snsId;
    localay.qQe = localm.field_likeFlag;
    localay.qQf = localm.bkc();
    localay.qQg = localm.bkp();
    localay.pFU = localm;
    localay.pFY = localbhc;
    localay.pFT = localbdk;
    Object localObject1 = localay.pFY.uyr;
    Object localObject2 = this.mContext;
    com.tencent.mm.plugin.sns.ui.widget.c.bov();
    localObject2 = com.tencent.mm.plugin.sns.ui.widget.d.a((Context)localObject2, (String)localObject1, com.tencent.mm.plugin.sns.ui.widget.c.getTextSize());
    localay.qPX = ((CharSequence)localObject2);
    int i = com.tencent.mm.plugin.sns.ui.widget.c.bov().box();
    Object localObject3;
    if (paramInt < this.qPA.getCount())
    {
      localObject3 = (com.tencent.mm.plugin.sns.storage.m)super.getItem(paramInt);
      if ((localObject3 != null) && (((com.tencent.mm.plugin.sns.storage.m)localObject3).uF(32)))
      {
        localObject3 = ((com.tencent.mm.plugin.sns.storage.m)localObject3).bjH();
        if ((localObject3 != null) && (((com.tencent.mm.plugin.sns.storage.b)localObject3).qlX == 1)) {
          i = ((WindowManager)this.mContext.getSystemService("window")).getDefaultDisplay().getWidth() - com.tencent.mm.bq.a.fromDPToPix(this.mContext, 50) - com.tencent.mm.bq.a.fromDPToPix(this.mContext, 50) - com.tencent.mm.bq.a.fromDPToPix(this.mContext, 12) - com.tencent.mm.bq.a.fromDPToPix(this.mContext, 12);
        }
      }
    }
    for (;;)
    {
      if (this.DEBUG) {
        w.d("MicroMsg.SnsTimeLineVendingSide", "debug:renderSnsPostDesc position " + paramInt + " viewWidth: " + i + " desc:" + (String)localObject1);
      }
      localObject1 = com.tencent.mm.kiss.widget.textview.d.a((CharSequence)localObject2, i, com.tencent.mm.plugin.sns.ui.widget.c.bov().bou()).xP();
      com.tencent.mm.kiss.widget.textview.c.gTt.a(com.tencent.mm.plugin.sns.ui.widget.c.bov().bou(), (com.tencent.mm.kiss.widget.textview.f)localObject1);
      if (((com.tencent.mm.kiss.widget.textview.f)localObject1).gTY.getLineCount() > 6)
      {
        localObject1 = com.tencent.mm.kiss.widget.textview.d.a((CharSequence)localObject2, i, com.tencent.mm.plugin.sns.ui.widget.c.bov().bow()).xP();
        com.tencent.mm.kiss.widget.textview.c.gTt.a(com.tencent.mm.plugin.sns.ui.widget.c.bov().bow(), (com.tencent.mm.kiss.widget.textview.f)localObject1);
      }
      a(paramInt, localay);
      Object localObject4;
      if (localay.pFU.uF(32))
      {
        ae.bhm().b(localm, null);
        f(localay.pFY);
        localObject4 = localm.field_userName;
        localObject1 = this.hhr.SK((String)localObject4);
        if (localObject4 != null)
        {
          if (!((String)localObject4).equals(this.qyX)) {
            break label2849;
          }
          if (this.qPC != null) {
            break label1261;
          }
          this.qPC = ((com.tencent.mm.l.a)localObject1);
        }
      }
      label587:
      label596:
      label704:
      label888:
      label895:
      label947:
      label961:
      label987:
      label1079:
      label1080:
      label1169:
      label1261:
      label1280:
      label1301:
      label1307:
      label1318:
      label1329:
      label1408:
      label1421:
      label1431:
      label1447:
      label1551:
      label1595:
      label1665:
      label1671:
      label1784:
      label1856:
      label1908:
      label1921:
      label1931:
      label2131:
      label2182:
      label2340:
      label2349:
      label2368:
      label2406:
      label2612:
      label2849:
      for (;;)
      {
        Object localObject5;
        boolean bool1;
        boolean bool2;
        if (localObject1 == null)
        {
          localObject2 = localObject4;
          localObject3 = localObject2;
          if (localm.uF(32))
          {
            localObject3 = localObject2;
            if (bg.mZ((String)localObject2))
            {
              localObject5 = localm.bjH();
              localObject3 = localObject2;
              if (localObject5 != null)
              {
                localObject3 = localObject2;
                if (!bg.mZ(((com.tencent.mm.plugin.sns.storage.b)localObject5).fvS)) {
                  localObject3 = ((com.tencent.mm.plugin.sns.storage.b)localObject5).fvS;
                }
              }
            }
          }
          localay.jqc = ((String)localObject4);
          localay.qQo = ((String)localObject3);
          localay.qxx = localm.uF(32);
          localay.qAX = localm.bkg();
          if (localObject1 != null) {
            break label1280;
          }
          bool1 = true;
          localay.qQp = bool1;
          localay.qPY = ((com.tencent.mm.l.a)localObject1);
          localay.qPZ = localm.bjM();
          localay.qQb = localbhc.uyr;
          localay.qQc = localbhc.uyw;
          localay.qQd = localm.field_createTime;
          localay.qQh = az.f(this.mContext, localay.qQd * 1000L);
          localay.qQr = false;
          if ((j == 11) && (!com.tencent.mm.x.m.zF().equals(localbhc.jWW)) && (localbdk.uvw != null) && (localbdk.uvw.uvY != 0))
          {
            localay.qQs = localbdk.uvw.uvY;
            localay.qQr = true;
          }
          if (!localay.qxx) {
            break label1307;
          }
          localObject1 = localm.bjJ();
          if (localObject1 != null)
          {
            localay.qQu = ((com.tencent.mm.plugin.sns.storage.a)localObject1).qlh;
            if (bg.mZ(((com.tencent.mm.plugin.sns.storage.a)localObject1).qli)) {
              break label1301;
            }
            bool1 = true;
            localay.qQv = bool1;
          }
          localObject1 = f(localbhc);
          if ((!com.tencent.mm.plugin.sns.c.a.ifN.bD((String)localObject1)) || (!g(localbhc))) {
            break label1595;
          }
          localay.qQw = true;
          bool2 = true;
          bool1 = true;
          if (localbhc.uyt != null) {
            break label1447;
          }
          bool1 = false;
          localay.iTg = ((String)localObject1);
          localay.qQy = bool1;
          if ((localay.jqc == null) || (!localay.jqc.equals(this.qyX))) {
            break label1665;
          }
          bool1 = true;
          localay.qQq = bool1;
          localay.qQC = localm.bki();
          localay.qQD = localm.bjY().uig;
          localay.qQE = false;
          if ((localbdk != null) && (localay.qQq))
          {
            i = localbdk.ujv;
            if ((i == 3) || (i == 5)) {
              localay.qQE = true;
            }
          }
          if (localbdk == null) {
            break label2406;
          }
          if (localbdk.uvo.size() > 0) {
            break label1671;
          }
          localay.qQF = false;
          break label1856;
          if ((localbdk.uvw == null) || (!com.tencent.mm.x.m.zF().equals(localbhc.jWW)) || (localbdk.uvw.uvY <= 0)) {
            break label1931;
          }
          localay.qQK = (com.tencent.mm.plugin.sns.lucky.a.m.b(localm, localbdk) * 1.0D);
          localay.qQJ = localbdk.uvw.uvY;
          localay.qQI = true;
          localObject2 = new b.a();
          localObject3 = localbdk.uvw.uvZ.iterator();
          if (!((Iterator)localObject3).hasNext()) {
            break label1921;
          }
          localObject4 = (bdg)((Iterator)localObject3).next();
          localObject1 = this.hhr.SK(((bdg)localObject4).twR);
          if (localObject1 == null) {
            break label1908;
          }
        }
        for (localObject1 = bg.mY(((com.tencent.mm.l.a)localObject1).vq());; localObject1 = bg.mY(((bdg)localObject4).twR))
        {
          ((b.a)localObject2).s(new com.tencent.mm.vending.j.a[] { com.tencent.mm.vending.j.a.u(((bdg)localObject4).twR, localObject1) });
          break label1169;
          ae.bhm().a(localm, null);
          break;
          localObject1 = this.qPC;
          break label587;
          localObject2 = ((com.tencent.mm.l.a)localObject1).vq();
          break label596;
          if ((int)((com.tencent.mm.l.a)localObject1).gLS == 0)
          {
            bool1 = true;
            break label704;
          }
          bool1 = false;
          break label704;
          bool1 = false;
          break label888;
          if (localbhc.uys == null)
          {
            localObject1 = null;
            if (localbhc.uys != null) {
              break label1408;
            }
            localObject2 = null;
            if (bg.mZ((String)localObject2)) {
              break label1431;
            }
            if ((localm.field_snsId != 0L) || (bg.mZ((String)localObject1))) {
              break label1421;
            }
          }
          for (localay.qQu = ((String)localObject1 + "·" + (String)localObject2);; localay.qQu = ((String)localObject2))
          {
            localay.qQv = true;
            break;
            localObject1 = localbhc.uys.huL;
            break label1318;
            localObject2 = localbhc.uys.nmP;
            break label1329;
          }
          localay.qQu = ((String)localObject1);
          localay.qQv = false;
          break label895;
          if (this.qPH.containsKey(localbhc.uyt.nas))
          {
            bool1 = bool2;
            if (((Boolean)this.qPH.get(localbhc.uyt.nas)).booleanValue()) {
              break label1551;
            }
            bool1 = false;
            break label947;
          }
          if (com.tencent.mm.pluginsdk.model.app.g.bE(localbhc.uyt.nas)) {
            if (localbhc.uyt.tvY == 0)
            {
              bool2 = false;
              bool1 = false;
            }
          }
          for (;;)
          {
            this.qPH.put(localbhc.uyt.nas, Boolean.valueOf(bool2));
            break;
            bool2 = true;
            bool1 = true;
            continue;
            boolean bool3 = com.tencent.mm.pluginsdk.model.app.g.Nz(localbhc.uyt.nas);
            bool2 = bool3;
            if (!bool3)
            {
              bool1 = false;
              bool2 = bool3;
            }
          }
          if ((!bg.mZ(localbhc.uyv)) && (g(localbhc)))
          {
            localay.iTg = ((String)localObject1);
            localay.qQx = true;
            localay.qQA = localbhc.tbI;
            localay.qQz = localbhc.uyv;
            break label961;
          }
          localay.qQw = false;
          localay.qQx = false;
          break label961;
          bool1 = false;
          break label987;
          if (this.qyX.equals(localbdk.twR))
          {
            localay.qQF = true;
            localObject2 = new StringBuffer();
            localObject3 = localbdk.uvo.iterator();
            i = 0;
            if (((Iterator)localObject3).hasNext())
            {
              localObject1 = (bcz)((Iterator)localObject3).next();
              if (i == 0)
              {
                i = 1;
                ((StringBuffer)localObject2).append("  ");
              }
              for (;;)
              {
                if (((bcz)localObject1).ufQ == null) {
                  break label1784;
                }
                ((StringBuffer)localObject2).append(((bcz)localObject1).ufQ);
                break;
                ((StringBuffer)localObject2).append(",  ");
              }
              localObject4 = this.hhr.SK(((bcz)localObject1).twR);
              if (localObject4 == null) {}
              for (localObject1 = ((bcz)localObject1).twR;; localObject1 = ((com.tencent.mm.l.a)localObject4).vq())
              {
                ((StringBuffer)localObject2).append((String)localObject1);
                break;
              }
            }
            localay.qQG = ((StringBuffer)localObject2).toString();
            break label1080;
          }
          localObject1 = localbdk.uvo.iterator();
          if (!((Iterator)localObject1).hasNext()) {
            break label1080;
          }
          localObject2 = (bcz)((Iterator)localObject1).next();
          if (!this.qyX.equals(((bcz)localObject2).twR)) {
            break label1079;
          }
          localay.qQF = true;
          localay.qQH = true;
          break label1080;
        }
        localay.qQL = ((b.a)localObject2).chd();
        if (localbdk.uvi.size() > 0)
        {
          localObject2 = new b.a();
          localObject3 = localbdk.uvi.iterator();
          if (((Iterator)localObject3).hasNext())
          {
            localObject4 = (bcz)((Iterator)localObject3).next();
            localObject1 = this.hhr.SK(((bcz)localObject4).twR);
            if (localObject1 != null) {}
            for (localObject1 = bg.mY(((com.tencent.mm.l.a)localObject1).vq());; localObject1 = bg.mY(((bcz)localObject4).twR))
            {
              ((b.a)localObject2).s(new com.tencent.mm.vending.j.a[] { com.tencent.mm.vending.j.a.u(((bcz)localObject4).twR, localObject1) });
              break;
            }
          }
          localay.qQM = ((b.a)localObject2).chd();
        }
        if (localbdk.uvl.size() > 0)
        {
          localObject2 = new b.a();
          localObject3 = localbdk.uvl.iterator();
          if (((Iterator)localObject3).hasNext())
          {
            localObject5 = (bcz)((Iterator)localObject3).next();
            long l1;
            if (((bcz)localObject5).uuE != 0)
            {
              l1 = ((bcz)localObject5).uuE;
              localObject4 = ((bcz)localObject5).twR;
              if (!((bcz)localObject5).twR.equals(this.qyX)) {
                break label2349;
              }
              if (this.qPC != null) {
                break label2340;
              }
              localObject1 = this.hhr.SK(((bcz)localObject5).twR);
              this.qPC = ((com.tencent.mm.l.a)localObject1);
              if (localObject1 == null) {
                break label2368;
              }
              localObject1 = ((com.tencent.mm.l.a)localObject1).vq();
            }
            for (;;)
            {
              String str = ((bcz)localObject5).ovi;
              localObject5 = (CharSequence)localay.qPW.pYk.get(((bcz)localObject5).uuE + "-" + ((bcz)localObject5).uuH + "-" + ((bcz)localObject5).ovi);
              com.tencent.mm.vending.j.f localf = new com.tencent.mm.vending.j.f();
              localf.xbK = new Object[] { Long.valueOf(l1), localObject4, localObject1, str, localObject5 };
              ((b.a)localObject2).s(new com.tencent.mm.vending.j.a[] { (com.tencent.mm.vending.j.f)localf });
              break;
              l1 = ((bcz)localObject5).uuH;
              break label2131;
              localObject1 = this.qPC;
              break label2182;
              localObject1 = this.hhr.SK(((bcz)localObject5).twR);
              break label2182;
              if (((bcz)localObject5).ufQ != null) {
                localObject1 = ((bcz)localObject5).ufQ;
              } else {
                localObject1 = ((bcz)localObject5).twR;
              }
            }
          }
          localay.qQN = ((b.a)localObject2).chd();
        }
        ag.a(this.mContext, localay, localbhc.qfM);
        if (localay.qxx)
        {
          localay.qQi = localm.bjJ();
          localay.qQj = localm.bjH();
          localObject1 = localm.bjH();
          if (localObject1 != null)
          {
            localObject1 = ((com.tencent.mm.plugin.sns.storage.b)localObject1).qls;
            localay.qQk = ((String)localObject1);
          }
        }
        else if (localay.qxx)
        {
          localObject3 = localay.qQi;
          if (localay.qQi.qlj != com.tencent.mm.plugin.sns.storage.a.qkV) {
            break label2612;
          }
          localay.qQl = ((com.tencent.mm.plugin.sns.storage.a)localObject3).qlk;
        }
        for (;;)
        {
          localObject1 = localm.bjY();
          localay.qQQ = ((amo)localObject1);
          if ((localObject1 != null) && (!com.tencent.mm.x.m.zF().equals(localbhc.jWW)) && (com.tencent.mm.plugin.sns.lucky.a.m.a(localm, localbdk))) {
            localay.qQt = true;
          }
          w.d("MicroMsg.SnsTimeLineVendingSide", "SnsTimeLineVendingStruct resolve %s %s ms", new Object[] { Integer.valueOf(paramInt), Long.valueOf(System.currentTimeMillis() - l2) });
          GMTrace.o(8661472641024L, 64533);
          return localay;
          localObject1 = "";
          break;
          if ((((com.tencent.mm.plugin.sns.storage.a)localObject3).qlj == com.tencent.mm.plugin.sns.storage.a.qkW) && (!bg.mZ(((com.tencent.mm.plugin.sns.storage.a)localObject3).qlk)))
          {
            localObject2 = "";
            localObject4 = ((com.tencent.mm.plugin.sns.storage.a)localObject3).qlm.iterator();
            if (((Iterator)localObject4).hasNext())
            {
              localObject5 = (String)((Iterator)localObject4).next();
              localObject1 = ae.bhd().SK((String)localObject5);
              if (localObject1 != null)
              {
                localObject1 = ((com.tencent.mm.l.a)localObject1).vq();
                if (!bg.mZ((String)localObject1)) {
                  localObject1 = (String)localObject2 + (String)localObject1;
                }
              }
              for (;;)
              {
                localObject2 = localObject1;
                if (((com.tencent.mm.plugin.sns.storage.a)localObject3).qlm.getLast() == localObject5) {
                  break;
                }
                localObject2 = (String)localObject1 + ",";
                break;
                localObject1 = (String)localObject2 + (String)localObject5;
                continue;
                localObject1 = (String)localObject2 + (String)localObject5;
              }
            }
            localay.qQn = ((String)localObject2);
            localay.qQm = String.format(((com.tencent.mm.plugin.sns.storage.a)localObject3).qlk, new Object[] { localObject2 });
          }
        }
      }
    }
  }
  
  protected final Cursor bnJ()
  {
    GMTrace.i(8662009511936L, 64537);
    if (!this.qPD) {}
    label858:
    label878:
    label883:
    label953:
    label977:
    label1017:
    label1101:
    label1191:
    for (;;)
    {
      int k;
      Object localObject4;
      Object localObject5;
      Object localObject6;
      synchronized (this.qPF)
      {
        this.lBB = q(0L, this.lBB);
        this.qPD = true;
        k = ae.bhp().HN(this.lBB);
        w.i("MicroMsg.SnsTimeLineVendingSide", "create time sql %s to %s getLimitSeq() %s", new Object[] { Integer.valueOf(this.qPB), Integer.valueOf(k), this.lBB });
        if (this.qPB == k) {
          break label1017;
        }
        ??? = ae.bhr();
        i = this.qPB;
        Object localObject2 = "select *,rowid from AdSnsInfo  where createTime > " + k + " and createTime <= " + i;
        localObject2 = (String)localObject2 + " order by  createTime desc";
        w.d("MicroMsg.AdSnsInfoStorage", "getAdInTime " + (String)localObject2);
        ??? = ((com.tencent.mm.plugin.sns.storage.f)???).gMB.rawQuery((String)localObject2, null);
        if ((??? == null) || (!((Cursor)???).moveToFirst())) {
          break label977;
        }
        localObject2 = new LinkedList();
        localObject4 = new com.tencent.mm.plugin.sns.storage.e();
        ((com.tencent.mm.plugin.sns.storage.e)localObject4).b((Cursor)???);
        localObject5 = ((com.tencent.mm.plugin.sns.storage.e)localObject4).bjN();
        localObject6 = new StringBuilder("ad xml ");
        Object localObject7 = ((com.tencent.mm.plugin.sns.storage.m)localObject5).bkr();
        StringBuffer localStringBuffer = new StringBuffer();
        localStringBuffer.append(((com.tencent.mm.plugin.sns.storage.m)localObject5).field_stringSeq);
        localStringBuffer.append(((com.tencent.mm.plugin.sns.storage.e)localObject7).field_adxml);
        localStringBuffer.append(" <createtime " + ((com.tencent.mm.plugin.sns.storage.m)localObject5).field_createTime + ">");
        localStringBuffer.append(" <exposuretime " + ((com.tencent.mm.plugin.sns.storage.e)localObject7).field_exposureTime + ">");
        localStringBuffer.append(" <adcreatetime " + ((com.tencent.mm.plugin.sns.storage.e)localObject7).field_createAdTime + "> ");
        localStringBuffer.append(((com.tencent.mm.plugin.sns.storage.e)localObject7).bjL().uyr);
        w.d("MicroMsg.SnsTimeLineVendingSide", localStringBuffer.toString());
        l1 = 21600L;
        localObject6 = ((com.tencent.mm.plugin.sns.storage.m)localObject5).bjJ();
        i = ((com.tencent.mm.plugin.sns.storage.m)localObject5).field_createTime;
        if ((((com.tencent.mm.plugin.sns.storage.e)localObject4).field_localFlag & 0x80) > 0)
        {
          bool = true;
          if (localObject6 == null) {
            break label1191;
          }
          if (!bool) {
            break label858;
          }
          l1 = 60L * ((com.tencent.mm.plugin.sns.storage.a)localObject6).qkZ;
          i = ((com.tencent.mm.plugin.sns.storage.e)localObject4).field_exposureTime;
          long l2 = bg.aE(i);
          if (l2 < l1) {
            break label883;
          }
          localObject6 = ai.n((com.tencent.mm.plugin.sns.storage.m)localObject5);
          if (((com.tencent.mm.plugin.sns.storage.m)localObject5).field_likeFlag == 0)
          {
            localObject6 = ((bdk)localObject6).uvl.iterator();
            if (!((Iterator)localObject6).hasNext()) {
              break label878;
            }
            localObject7 = (bcz)((Iterator)localObject6).next();
            if ((localObject7 == null) || (bg.mZ(((bcz)localObject7).twR)) || (!((bcz)localObject7).twR.equals(this.qyX))) {
              continue;
            }
          }
          j = 1;
          if (j != 0) {
            break label883;
          }
          ae.bhr().delete(((com.tencent.mm.plugin.sns.storage.m)localObject5).field_snsId);
          w.i("MicroMsg.SnsTimeLineVendingSide", "~~addelete the item " + ((com.tencent.mm.plugin.sns.storage.m)localObject5).field_snsId + " exposureTime: " + l1 + " field_createTime: " + ((com.tencent.mm.plugin.sns.storage.m)localObject5).field_createTime + " checktime: " + l2 + " gettime: " + i + " isexposure " + bool + " exposureTime " + ((com.tencent.mm.plugin.sns.storage.e)localObject4).field_exposureTime + " adCreateTIme:" + ((com.tencent.mm.plugin.sns.storage.e)localObject4).field_createAdTime);
          if (!bool) {
            ((LinkedList)localObject2).add(localObject4);
          }
          if (((Cursor)???).moveToNext()) {
            continue;
          }
          if (((LinkedList)localObject2).size() <= 0) {
            break label977;
          }
          localObject4 = new LinkedList();
          localObject2 = ((LinkedList)localObject2).iterator();
          if (!((Iterator)localObject2).hasNext()) {
            break label953;
          }
          localObject5 = (com.tencent.mm.plugin.sns.storage.e)((Iterator)localObject2).next();
          localObject6 = new bf();
          ((bf)localObject6).tuP = 13298;
          ((bf)localObject6).tuQ = new com.tencent.mm.bl.b(((com.tencent.mm.plugin.sns.storage.e)localObject5).bjJ().qhb.getBytes());
          ((bf)localObject6).tuR = (System.currentTimeMillis() / 1000L);
          ((LinkedList)localObject4).add(localObject6);
        }
      }
      boolean bool = false;
      continue;
      long l1 = 60L * ((com.tencent.mm.plugin.sns.storage.a)localObject6).qkY;
      int i = ((com.tencent.mm.plugin.sns.storage.e)localObject4).field_createAdTime;
      continue;
      int j = 0;
      continue;
      l1 = ((com.tencent.mm.plugin.sns.storage.m)localObject5).field_snsId;
      w.i("MicroMsg.SnsTimeLineVendingSide", "try to update snsid " + l1);
      if (com.tencent.mm.plugin.sns.model.l.dt(l1))
      {
        localObject4 = new com.tencent.mm.plugin.sns.model.l(l1, 1);
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.a((com.tencent.mm.ac.k)localObject4, 0);
        continue;
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.a(new com.tencent.mm.plugin.sns.model.k((LinkedList)localObject4), 0);
        if (??? != null)
        {
          w.d("MicroMsg.SnsTimeLineVendingSide", "test for adcount " + ((Cursor)???).getCount());
          ((Cursor)???).close();
        }
        this.qPB = k;
        ??? = ae.bhp().bT(this.lBB, k);
        w.d("MicroMsg.SnsTimeLineVendingSide", "onCursorResetFinish");
        com.tencent.mm.modelsns.b localb = com.tencent.mm.modelsns.b.gM(500);
        if (localb.LF())
        {
          i = this.mCount;
          if (i != 0) {
            break label1101;
          }
          localb.gP(0).gP(0).gP(0);
          localb.LJ();
        }
        for (;;)
        {
          GMTrace.o(8662009511936L, 64537);
          return (Cursor)???;
          localObject4 = i.g((com.tencent.mm.plugin.sns.storage.m)getItem(1));
          localObject5 = i.g((com.tencent.mm.plugin.sns.storage.m)getItem(i - 1));
          if ((!((String)localObject4).equals(this.qPI)) || (!((String)localObject5).equals(this.qPJ)))
          {
            this.qPI = ((String)localObject4);
            this.qPJ = ((String)localObject5);
            localb.gP(i).lh((String)localObject4).lh((String)localObject5);
            localb.LJ();
          }
        }
      }
    }
  }
  
  public final void bnt()
  {
    GMTrace.i(8661204205568L, 64531);
    looperCheckForVending();
    long l;
    if (this.mCount == 0)
    {
      l = 0L;
      this.qPE = true;
    }
    for (;;)
    {
      synchronized (this.qPF)
      {
        this.lBB = q(l, this.lBB);
        GMTrace.o(8661204205568L, 64531);
        return;
        int i = this.mCount - 1;
        int j = 0;
        ??? = (com.tencent.mm.plugin.sns.storage.m)getItem(i);
        if ((??? != null) && (!((com.tencent.mm.plugin.sns.storage.m)???).uF(32)) && (((com.tencent.mm.plugin.sns.storage.m)???).field_snsId != 0L))
        {
          l = ((com.tencent.mm.plugin.sns.storage.m)???).field_snsId;
          w.i("MicroMsg.SnsTimeLineVendingSide", "get list last not ad item %s %s", new Object[] { Long.valueOf(l), ((com.tencent.mm.plugin.sns.storage.m)???).field_stringSeq });
          break;
        }
        j += 1;
        i -= 1;
        if ((i < 0) || (j > 500)) {
          l = 0L;
        }
      }
    }
  }
  
  public final void destroyAsynchronous()
  {
    GMTrace.i(8662143729664L, 64538);
    super.destroyAsynchronous();
    com.tencent.mm.kiss.widget.textview.c.gTt.xO();
    this.qPH.clear();
    GMTrace.o(8662143729664L, 64538);
  }
  
  String q(long paramLong, String paramString)
  {
    GMTrace.i(8661338423296L, 64532);
    w.d("MicroMsg.SnsTimeLineVendingSide", "updateLitmitSeq %s %s", new Object[] { Integer.valueOf(ae.bhf().bhN()), paramString });
    Object localObject = ae.bhp();
    int i;
    String str;
    if (paramString.equals(""))
    {
      i = ae.bhf().bhN() / 2;
      localObject = i.dp(((com.tencent.mm.plugin.sns.storage.n)localObject).e(paramLong, i, false));
      str = this.qEP;
      if (!str.equals("")) {
        break label140;
      }
      paramString = (String)localObject;
    }
    for (;;)
    {
      localObject = ae.bhs().HE("@__weixintimtline").bjX();
      if (((sn)localObject).tOl != 0L) {
        break label159;
      }
      GMTrace.o(8661338423296L, 64532);
      return paramString;
      i = ae.bhf().bhN();
      break;
      label140:
      paramString = (String)localObject;
      if (((String)localObject).compareTo(str) >= 0) {
        paramString = str;
      }
    }
    label159:
    localObject = i.dp(((sn)localObject).tOl);
    if (paramString.equals(""))
    {
      GMTrace.o(8661338423296L, 64532);
      return (String)localObject;
    }
    if (((String)localObject).compareTo(paramString) > 0)
    {
      GMTrace.o(8661338423296L, 64532);
      return (String)localObject;
    }
    GMTrace.o(8661338423296L, 64532);
    return paramString;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */