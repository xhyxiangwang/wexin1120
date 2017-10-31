package com.tencent.mm.plugin.sns.ui.a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.ui.MaskImageView;
import com.tencent.mm.plugin.sns.ui.PhotosContent;
import com.tencent.mm.plugin.sns.ui.TagImageView;
import com.tencent.mm.plugin.sns.ui.ar;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.plugin.sns.ui.ay;
import com.tencent.mm.pluginsdk.h;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.amp;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.cr;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.ui.widget.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public final class e
  extends a
{
  private int qHE;
  private int qHF;
  public MaskImageView qUR;
  
  public e()
  {
    GMTrace.i(8523765252096L, 63507);
    this.qHF = 103;
    GMTrace.o(8523765252096L, 63507);
  }
  
  @TargetApi(16)
  public final void a(a.c paramc, int paramInt1, ay paramay, bhc parambhc, int paramInt2, av paramav)
  {
    GMTrace.i(8524033687552L, 63509);
    paramc.qUe.setVisibility(0);
    boolean bool;
    label66:
    LinkedList localLinkedList;
    int i;
    final Object localObject2;
    if (parambhc.uyt == null)
    {
      localObject1 = null;
      if (!bg.mZ((String)localObject1))
      {
        if (!paramav.qPu.containsKey(localObject1)) {
          break label421;
        }
        bool = ((Boolean)paramav.qPu.get(localObject1)).booleanValue();
        if (bool) {
          com.tencent.mm.plugin.sns.c.a.ifN.a(this.mActivity, (String)localObject1, parambhc.jWW, parambhc.uyy, paramay.qQa);
        }
      }
      localLinkedList = new LinkedList();
      i = ((WindowManager)this.mActivity.getSystemService("window")).getDefaultDisplay().getWidth();
      if ((!paramay.qxx) || (paramInt2 != 2)) {
        break label742;
      }
      localObject2 = paramay.pFU.bjH();
      if ((localObject2 == null) || (((com.tencent.mm.plugin.sns.storage.b)localObject2).qmi != 1) || (paramc.qUe.uS(0) == null)) {
        break label461;
      }
      if ((parambhc.uyu == null) || (parambhc.uyu.tKd.size() <= 0)) {
        break label455;
      }
    }
    float f1;
    float f2;
    int j;
    label421:
    label455:
    for (final Object localObject1 = (amn)parambhc.uyu.tKd.get(0);; localObject1 = null)
    {
      f1 = ((amn)localObject1).uhD.uis;
      f2 = ((amn)localObject1).uhD.uit;
      i = i - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 28);
      j = (int)(f2 * i / f1);
      localObject1 = new amp();
      ((amp)localObject1).uis = i;
      ((amp)localObject1).uit = j;
      ((amp)localObject1).uiu = (((amp)localObject1).uis * ((amp)localObject1).uit);
      localLinkedList.add(localObject1);
      i = 0;
      while (i < ar.qLx[paramInt2])
      {
        localObject1 = (TagImageView)paramc.qUe.findViewById(ar.qLB[i]);
        paramav.kkG.c((View)localObject1, paramav.qgD.qVt, paramav.qgD.qVc);
        i += 1;
      }
      localObject1 = parambhc.uyt.nas;
      break;
      bool = com.tencent.mm.plugin.sns.c.a.ifN.bE((String)localObject1);
      paramav.qPu.put(localObject1, Boolean.valueOf(bool));
      bool = true;
      break label66;
    }
    label461:
    if ((localObject2 != null) && (((com.tencent.mm.plugin.sns.storage.b)localObject2).qlY > 0.0F) && (((com.tencent.mm.plugin.sns.storage.b)localObject2).qlZ > 0.0F))
    {
      f2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(((com.tencent.mm.plugin.sns.storage.b)localObject2).qlY, 1, ((com.tencent.mm.plugin.sns.storage.b)localObject2).qma, ((com.tencent.mm.plugin.sns.storage.b)localObject2).qmb);
      f1 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(((com.tencent.mm.plugin.sns.storage.b)localObject2).qlZ, 1, ((com.tencent.mm.plugin.sns.storage.b)localObject2).qma, ((com.tencent.mm.plugin.sns.storage.b)localObject2).qmb);
      if (((com.tencent.mm.plugin.sns.storage.b)localObject2).qlX != 0) {
        break label850;
      }
      localObject1 = new amp();
      ((amp)localObject1).uis = f2;
      ((amp)localObject1).uit = f1;
      if (f2 >= i - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 12))
      {
        ((amp)localObject1).uis = (i - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 12));
        ((amp)localObject1).uit = ((int)(((amp)localObject1).uis * ((com.tencent.mm.plugin.sns.storage.b)localObject2).qlZ / ((com.tencent.mm.plugin.sns.storage.b)localObject2).qlY));
      }
      ((amp)localObject1).uiu = (((amp)localObject1).uis * ((amp)localObject1).uit);
      localLinkedList.add(localObject1);
    }
    for (;;)
    {
      if (!bg.mZ(((com.tencent.mm.plugin.sns.storage.b)localObject2).qmd))
      {
        localObject1 = paramc.qUe;
        final TagImageView localTagImageView = paramc.qUe.uS(0);
        d.a("adId", ((com.tencent.mm.plugin.sns.storage.b)localObject2).qmd, false, 41, 0, new d.a()
        {
          public final void Hp(String paramAnonymousString)
          {
            GMTrace.i(8519604502528L, 63476);
            e.this.qUR = ((MaskImageView)localObject1.findViewById(i.f.pKC));
            if (e.this.qUR != null)
            {
              e.this.qUR.setVisibility(0);
              paramAnonymousString = BitmapFactory.decodeFile(paramAnonymousString);
              e.this.qUR.setImageBitmap(paramAnonymousString);
              float f1 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(localObject2.qme, 1, localObject2.qma, localObject2.qmb);
              float f2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(localObject2.qmf, 1, localObject2.qma, localObject2.qmb);
              float f3 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(localObject2.qmg, 1, localObject2.qma, localObject2.qmb);
              float f4 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(localObject2.qmh, 1, localObject2.qma, localObject2.qmb);
              paramAnonymousString = new FrameLayout.LayoutParams((int)f1, (int)f2);
              paramAnonymousString.setMargins((int)(localTagImageView.getRight() - f3 - f1), (int)(localTagImageView.getBottom() - f4 - f2), 0, 0);
              e.this.qUR.setLayoutParams(paramAnonymousString);
            }
            GMTrace.o(8519604502528L, 63476);
          }
          
          public final void biT()
          {
            GMTrace.i(8519336067072L, 63474);
            GMTrace.o(8519336067072L, 63474);
          }
          
          public final void biU()
          {
            GMTrace.i(8519470284800L, 63475);
            GMTrace.o(8519470284800L, 63475);
          }
        });
      }
      label742:
      paramav = paramav.qHu;
      localObject1 = paramc.qUe;
      paramay = paramay.qAX;
      i = this.mActivity.hashCode();
      bool = this.qGP;
      localObject2 = an.bQu();
      ((an)localObject2).time = parambhc.orU;
      paramav.a((PhotosContent)localObject1, parambhc, paramay, i, paramInt2, paramInt1, bool, (an)localObject2, localLinkedList);
      paramc.qUP.setTag(paramc.qUe.uS(0));
      paramc.qUQ.setTag(paramc.qUe.uS(0));
      GMTrace.o(8524033687552L, 63509);
      return;
      label850:
      if (((com.tencent.mm.plugin.sns.storage.b)localObject2).qlX == 1)
      {
        i = i - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 12);
        j = (int)(i * ((com.tencent.mm.plugin.sns.storage.b)localObject2).qlZ / ((com.tencent.mm.plugin.sns.storage.b)localObject2).qlY);
        localObject1 = new amp();
        if (i > 0) {
          f2 = i;
        }
        ((amp)localObject1).uis = f2;
        if (j > 0) {
          f1 = j;
        }
        for (;;)
        {
          ((amp)localObject1).uit = f1;
          ((amp)localObject1).uiu = (((amp)localObject1).uis * ((amp)localObject1).uit);
          localLinkedList.add(localObject1);
          break;
        }
      }
      if (((com.tencent.mm.plugin.sns.storage.b)localObject2).qlX == 2)
      {
        i = i - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 12);
        j = (int)(i * ((com.tencent.mm.plugin.sns.storage.b)localObject2).qlZ / ((com.tencent.mm.plugin.sns.storage.b)localObject2).qlY);
        localObject1 = new amp();
        if (i > 0) {
          f2 = i;
        }
        ((amp)localObject1).uis = f2;
        if (j > 0) {
          f1 = j;
        }
        ((amp)localObject1).uit = f1;
        ((amp)localObject1).uiu = (((amp)localObject1).uis * ((amp)localObject1).uit);
        localLinkedList.add(localObject1);
      }
    }
  }
  
  public final void d(a.c paramc)
  {
    GMTrace.i(8523899469824L, 63508);
    Object localObject = new DisplayMetrics();
    this.mActivity.getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject);
    w.i("MiroMsg.PhotoTimeLineItem", "viewtype " + this.kxh);
    this.qHE = ae.bhw();
    if (paramc.qTM != null) {
      if (this.kxh == 2)
      {
        paramc.qTM.setLayoutResource(i.g.pPF);
        if (!paramc.qTN) {
          paramc.qUe = ((PhotosContent)paramc.qTM.inflate());
        }
      }
    }
    for (paramc.qTN = true;; paramc.qTN = true)
    {
      paramc.qUe.qDR.clear();
      int i = 0;
      while (i < ar.qLx[this.kxh])
      {
        localObject = (TagImageView)paramc.qUe.findViewById(ar.qLB[i]);
        paramc.qUe.a((TagImageView)localObject);
        ((TagImageView)localObject).setOnClickListener(this.qhj.qgD.qBP);
        this.qhj.kkG.c((View)localObject, this.qhj.qgD.qVq, this.qhj.qgD.qVc);
        i += 1;
      }
      if (this.kxh == 3)
      {
        paramc.qTM.setLayoutResource(i.g.pPC);
        break;
      }
      if (this.kxh == 4)
      {
        paramc.qTM.setLayoutResource(i.g.pPD);
        break;
      }
      if (this.kxh == 5)
      {
        paramc.qTM.setLayoutResource(i.g.pPE);
        break;
      }
      w.e("MiroMsg.PhotoTimeLineItem", "error viewtyoe in photo item  " + this.kxh);
      break;
      paramc.qUe = ((PhotosContent)paramc.msJ.findViewById(i.f.pKG));
    }
    paramc.qUe.uR(this.qHE);
    GMTrace.o(8523899469824L, 63508);
  }
  
  public static final class a
    extends a.c
  {
    public a()
    {
      GMTrace.i(8523631034368L, 63506);
      GMTrace.o(8523631034368L, 63506);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */