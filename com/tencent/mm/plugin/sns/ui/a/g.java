package com.tencent.mm.plugin.sns.ui.a;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sight.decode.a.b.e;
import com.tencent.mm.plugin.sight.decode.a.b.f;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.am;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.AsyncNormalTextView;
import com.tencent.mm.plugin.sns.ui.ak;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.plugin.sns.ui.ay;
import com.tencent.mm.plugin.sns.ui.j;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.amp;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import java.util.HashMap;
import java.util.LinkedList;

public final class g
  extends a
{
  private int mScreenHeight;
  private int mScreenWidth;
  private b.e qUT;
  
  public g()
  {
    GMTrace.i(8522825728000L, 63500);
    this.qUT = new b.e()
    {
      public final void a(com.tencent.mm.plugin.sight.decode.a.b paramAnonymousb, int paramAnonymousInt)
      {
        GMTrace.i(8517993889792L, 63464);
        GMTrace.o(8517993889792L, 63464);
      }
    };
    GMTrace.o(8522825728000L, 63500);
  }
  
  public final void a(a.c paramc, int paramInt1, ay paramay, bhc parambhc, int paramInt2, final av paramav)
  {
    GMTrace.i(8523094163456L, 63502);
    amn localamn;
    m localm;
    label160:
    com.tencent.mm.plugin.sns.model.g localg;
    boolean bool;
    label308:
    Object localObject1;
    Object localObject2;
    if ((parambhc.uyu != null) && (parambhc.uyu.tKd.size() > 0))
    {
      localamn = (amn)parambhc.uyu.tKd.get(0);
      w.v("MicroMsg.VideoTimeLineItem", "videoTImeline %d ", new Object[] { Integer.valueOf(paramInt1) });
      localm = ae.bhp().Hz(paramc.fMT);
      if ((!paramay.qxx) || (localamn == null)) {
        break label819;
      }
      final long l = paramay.qQa;
      paramc.qUD.pDA.a(new b.e()
      {
        public final void a(com.tencent.mm.plugin.sight.decode.a.b paramAnonymousb, int paramAnonymousInt)
        {
          GMTrace.i(8518664978432L, 63469);
          if (paramAnonymousInt != -1)
          {
            if ((paramav == null) || (paramav.qPi == null) || (paramav.qPi.qxK == null))
            {
              GMTrace.o(8518664978432L, 63469);
              return;
            }
            paramav.qPi.qxK.di(l);
          }
          GMTrace.o(8518664978432L, 63469);
        }
      });
      if (!paramav.qPi.qxK.dj(l)) {
        paramc.qUD.pDA.a(new b.f()
        {
          public final void a(com.tencent.mm.plugin.sight.decode.a.b paramAnonymousb, long paramAnonymousLong)
          {
            GMTrace.i(8519872937984L, 63478);
            if ((paramav == null) || (paramav.qPi == null) || (paramav.qPi.qxK == null))
            {
              GMTrace.o(8519872937984L, 63478);
              return;
            }
            int i = (int)paramAnonymousb.beI();
            paramav.qPi.qxK.p(l, bg.Pq());
            paramav.qPi.qxK.u(l, i);
            paramav.qPi.qxK.o(l, l);
            this.qUX.qUD.pDA.a(null);
            GMTrace.o(8519872937984L, 63478);
          }
        });
      }
      paramc.qUD.a(parambhc, paramInt1, paramay.qAX, paramay.qxx);
      paramc.qUD.qrk.setVisibility(8);
      localg = ae.bhm();
      if ((parambhc.uyu == null) || (parambhc.uyu.tKd.size() <= 0)) {
        break label1983;
      }
      l = System.nanoTime();
      bool = com.tencent.mm.plugin.sns.model.g.t(localamn);
      w.i("MicroMsg.VideoTimeLineItem", "isMediaSightExist %b duration %s", new Object[] { Boolean.valueOf(bool), Long.valueOf(System.nanoTime() - l) });
      if (bool) {
        break label1162;
      }
      if (!localg.w(localamn)) {
        break label872;
      }
      paramc.qUD.qrh.setVisibility(8);
      paramc.qUD.qFp.setVisibility(0);
      paramc.qUD.qFp.cgd();
      localObject1 = com.tencent.mm.modelsns.e.a(paramc.qUE, paramc.qUD.pDA.bey(), paramay.qxx);
      if (!paramay.qxx) {
        break label2066;
      }
      localObject2 = paramay.pFU.bjH();
      paramInt2 = ((WindowManager)this.mActivity.getSystemService("window")).getDefaultDisplay().getWidth();
      if ((localObject2 == null) || (((com.tencent.mm.plugin.sns.storage.b)localObject2).qmi != 1) || (!paramc.qUC)) {
        break label1543;
      }
      paramInt2 = paramInt2 - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 28);
      localObject1 = Pair.create(Integer.valueOf(paramInt2), Integer.valueOf((int)(paramInt2 * localamn.uhD.uit / localamn.uhD.uis)));
    }
    label471:
    label720:
    label743:
    label819:
    label872:
    label1026:
    label1162:
    label1541:
    label1543:
    label1952:
    label1958:
    label1983:
    label2026:
    label2066:
    for (;;)
    {
      paramInt2 = ((Integer)((Pair)localObject1).first).intValue();
      int i = ((Integer)((Pair)localObject1).second).intValue();
      paramc.qUD.pDA.cT(paramInt2, i);
      localObject1 = paramc.qUD.qFq.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject1).width = paramInt2;
      ((ViewGroup.LayoutParams)localObject1).height = i;
      paramc.qUD.qFq.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      paramc.qUD.pDA.bn(paramc.qUD);
      localObject1 = paramc.qUD.pDA;
      paramInt2 = this.mActivity.hashCode();
      localObject2 = an.bQu();
      ((an)localObject2).time = parambhc.orU;
      localg.a(localm, localamn, (com.tencent.mm.plugin.sight.decode.a.a)localObject1, paramInt2, paramInt1, (an)localObject2, paramay.qxx);
      paramc.qUD.qFo.setTag(paramc.qUD);
      paramc.qUP.setTag(paramc.qUD);
      paramc.qUQ.setTag(paramc.qUD);
      parambhc = am.dt(ae.getAccSnsPath(), localamn.nas);
      localObject1 = i.j(localamn);
      if (FileOp.aZ(parambhc + (String)localObject1))
      {
        paramav.qPi.qxK.d(paramay.qQa, 0, true);
        if (!paramay.qxx) {
          break label1958;
        }
        if (ae.bhm().b(localm, null) != 5) {
          break label1952;
        }
        bool = true;
        paramav.qPi.qxK.k(paramay.qQa, bool);
      }
      for (;;)
      {
        if ((localm == null) || (localm.bin())) {
          break label2026;
        }
        paramav.kkG.c(paramc.qUD.qFo, paramav.qgD.qVs, paramav.qgD.qVc);
        GMTrace.o(8523094163456L, 63502);
        return;
        localamn = null;
        break;
        paramc.qUD.qFq.setVisibility(8);
        paramc.qUD.pDA.beB();
        paramc.qUD.pDA.a(null);
        paramc.qUD.pDA.a(null);
        break label160;
        if ((paramay.qxx) && (localg.b(localm, null) == 5))
        {
          localg.z(localamn);
          paramc.qUD.qrh.setVisibility(8);
          paramc.qUD.qFp.setVisibility(0);
          paramc.qUD.qFp.cgd();
          break label308;
        }
        if ((localg.qar.containsKey(localamn.nas)) && (((Integer)localg.qar.get(localamn.nas)).intValue() == 4)) {}
        for (paramInt2 = 1;; paramInt2 = 0)
        {
          if (paramInt2 == 0) {
            break label1026;
          }
          paramc.qUD.qFp.setVisibility(8);
          paramc.qUD.qrh.setImageResource(i.e.bdr);
          paramc.qUD.qrh.setVisibility(0);
          break;
        }
        localg.x(localamn);
        paramc.qUD.qrh.setVisibility(0);
        paramc.qUD.qFp.setVisibility(8);
        paramc.qUD.qrh.setImageDrawable(com.tencent.mm.bq.a.b(this.mActivity, i.i.dqL));
        paramc.qUD.qrh.setContentDescription(this.mActivity.getString(i.j.pRk));
        if ((!paramay.qxx) && (localg.a(localm, null) == 4))
        {
          paramc.qUD.qrk.setVisibility(0);
          break label308;
        }
        if ((!paramay.qxx) || (localg.b(localm, null) != 4)) {
          break label308;
        }
        paramc.qUD.qrk.setVisibility(0);
        break label308;
        if (localg.u(localamn))
        {
          paramc.qUD.qrh.setVisibility(0);
          paramc.qUD.qFp.setVisibility(8);
          paramc.qUD.qrh.setImageDrawable(com.tencent.mm.bq.a.b(this.mActivity, i.i.dqL));
          paramc.qUD.qrh.setContentDescription(this.mActivity.getString(i.j.pRk));
        }
        for (;;)
        {
          if (!paramc.qUD.pDA.bez()) {
            break label1541;
          }
          w.d("MicroMsg.VideoTimeLineItem", "play video error " + localamn.nas + " " + localamn.mDo + " " + localamn.uhA + " " + paramInt1);
          localg.x(localamn);
          paramc.qUD.qrh.setVisibility(0);
          paramc.qUD.qFp.setVisibility(8);
          paramc.qUD.qrh.setImageDrawable(com.tencent.mm.bq.a.b(this.mActivity, i.i.dqL));
          paramc.qUD.qrh.setContentDescription(this.mActivity.getString(i.j.pRk));
          break;
          if (localg.v(localamn))
          {
            paramc.qUD.qrh.setVisibility(8);
            paramc.qUD.qFp.setVisibility(8);
          }
          else if ((paramay.qxx) && (localg.b(localm, null) <= 5))
          {
            paramc.qUD.qrh.setVisibility(8);
            paramc.qUD.qFp.setVisibility(8);
          }
          else
          {
            localg.x(localamn);
            paramc.qUD.qrh.setVisibility(0);
            paramc.qUD.qFp.setVisibility(8);
            paramc.qUD.qrh.setImageDrawable(com.tencent.mm.bq.a.b(this.mActivity, i.i.dqL));
            paramc.qUD.qrh.setContentDescription(this.mActivity.getString(i.j.pRk));
          }
        }
        break label308;
        if ((localObject2 == null) || (((com.tencent.mm.plugin.sns.storage.b)localObject2).qlY <= 0.0F) || (((com.tencent.mm.plugin.sns.storage.b)localObject2).qlZ <= 0.0F)) {
          break label2066;
        }
        float f3 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(((com.tencent.mm.plugin.sns.storage.b)localObject2).qlY, 1, ((com.tencent.mm.plugin.sns.storage.b)localObject2).qma, ((com.tencent.mm.plugin.sns.storage.b)localObject2).qmb);
        float f2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(((com.tencent.mm.plugin.sns.storage.b)localObject2).qlZ, 1, ((com.tencent.mm.plugin.sns.storage.b)localObject2).qma, ((com.tencent.mm.plugin.sns.storage.b)localObject2).qmb);
        if (((com.tencent.mm.plugin.sns.storage.b)localObject2).qlX == 0)
        {
          float f1 = f3;
          if (f3 >= paramInt2 - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 12))
          {
            f1 = paramInt2 - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 12);
            f2 = (int)(((com.tencent.mm.plugin.sns.storage.b)localObject2).qlZ * f1 / ((com.tencent.mm.plugin.sns.storage.b)localObject2).qlY);
          }
          localObject1 = Pair.create(Integer.valueOf((int)f1), Integer.valueOf((int)f2));
          break label471;
        }
        if (((com.tencent.mm.plugin.sns.storage.b)localObject2).qlX == 1)
        {
          paramInt2 = paramInt2 - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 12);
          localObject1 = Pair.create(Integer.valueOf(paramInt2), Integer.valueOf((int)(paramInt2 * ((com.tencent.mm.plugin.sns.storage.b)localObject2).qlZ / ((com.tencent.mm.plugin.sns.storage.b)localObject2).qlY)));
          paramc.qTH.setLayoutParams(new LinearLayout.LayoutParams(paramInt2, -2));
          break label471;
        }
        if (((com.tencent.mm.plugin.sns.storage.b)localObject2).qlX != 2) {
          break label2066;
        }
        paramInt2 = paramInt2 - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 12);
        localObject1 = Pair.create(Integer.valueOf(paramInt2), Integer.valueOf((int)(paramInt2 * ((com.tencent.mm.plugin.sns.storage.b)localObject2).qlZ / ((com.tencent.mm.plugin.sns.storage.b)localObject2).qlY)));
        paramc.qTH.setLayoutParams(new LinearLayout.LayoutParams(paramInt2, -2));
        break label471;
        paramav.qPi.qxK.d(paramay.qQa, 0, false);
        break label720;
        bool = false;
        break label743;
        if (ae.bhm().a(localm, null) == 5)
        {
          bool = true;
          break label743;
        }
        bool = false;
        break label743;
        paramay = paramc.qUD.pDA;
        localg.a(paramay, "", -1, this.mActivity.hashCode());
        paramay.D(null);
        paramay.an(null, false);
      }
      paramav.kkG.c(paramc.qUD.qFo, paramav.qgD.qVt, paramav.qgD.qVc);
      GMTrace.o(8523094163456L, 63502);
      return;
    }
  }
  
  public final void d(a.c paramc)
  {
    GMTrace.i(8522959945728L, 63501);
    Object localObject = new DisplayMetrics();
    this.mActivity.getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject);
    this.mScreenWidth = ((DisplayMetrics)localObject).widthPixels;
    this.mScreenHeight = ((DisplayMetrics)localObject).heightPixels;
    if (paramc.qTM != null)
    {
      paramc.qTM.setLayoutResource(i.g.pMs);
      paramc.qUB = ((ViewStub)paramc.msJ.findViewById(i.f.pJZ));
      if (!paramc.qUC) {
        paramc.qUD.qFn = paramc.qUB.inflate();
      }
    }
    for (paramc.qUC = true;; paramc.qUC = true)
    {
      paramc.qUD.qFo = paramc.qUD.qFn.findViewById(i.f.bsQ);
      paramc.qUD.pDA = ((com.tencent.mm.plugin.sight.decode.a.a)paramc.qUD.qFn.findViewById(i.f.image));
      paramc.qUD.qFo.setOnClickListener(this.qhj.qgD.qVz);
      paramc.qUD.qrh = ((ImageView)paramc.qUD.qFn.findViewById(i.f.cyW));
      paramc.qUD.qFp = ((MMPinProgressBtn)paramc.qUD.qFn.findViewById(i.f.progress));
      paramc.qUD.qFq = ((TextView)paramc.qUD.qFn.findViewById(i.f.pJJ));
      paramc.qUD.qrk = ((TextView)paramc.qUD.qFn.findViewById(i.f.pJK));
      h.xA();
      if (((Boolean)h.xz().xi().get(344065, Boolean.valueOf(false))).booleanValue())
      {
        localObject = (TextView)((ViewStub)paramc.qUD.qFn.findViewById(i.f.pLe)).inflate();
        paramc.qUD.pDA.h((TextView)localObject);
      }
      GMTrace.o(8522959945728L, 63501);
      return;
      paramc.qUD.qFn = paramc.msJ.findViewById(i.f.pMs);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */