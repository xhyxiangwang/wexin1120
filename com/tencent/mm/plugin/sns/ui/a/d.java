package com.tencent.mm.plugin.sns.ui.a;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.al.a;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.ui.TagImageView;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.plugin.sns.ui.ay;
import com.tencent.mm.plugin.sns.ui.r;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.storage.an;
import java.util.LinkedList;

public final class d
  extends a
{
  public d()
  {
    GMTrace.i(8518128107520L, 63465);
    GMTrace.o(8518128107520L, 63465);
  }
  
  public final void a(a.c paramc, int paramInt1, ay paramay, bhc parambhc, int paramInt2, av paramav)
  {
    GMTrace.i(8518396542976L, 63467);
    paramc.qTP.position = paramInt1;
    Object localObject1 = paramay.qAX;
    Object localObject2 = paramay.pFU;
    paramInt1 = 0;
    int i;
    if (paramay.qxx)
    {
      if (((m)localObject2).bjH().qmi == 2)
      {
        paramInt1 = 1;
        paramc.qNb.setTag(paramc);
        paramc.qNb.setOnClickListener(paramav.qgD.qVK);
      }
      i = 0;
    }
    for (;;)
    {
      label109:
      int j;
      if (paramInt1 != 0)
      {
        paramav.kkG.c(paramc.qNb, paramav.qgD.qVu, paramav.qgD.qVc);
        if (parambhc.uyu.tKc != 9) {
          break label1236;
        }
        j = 1;
        label125:
        if (j == 0) {
          break label1256;
        }
        paramay = av.Ix(parambhc.uyu.mDo);
        label142:
        if ((parambhc.uyu.tKc != 9) && (parambhc.uyu.tKc != 14) && (parambhc.uyu.tKc != 12) && (parambhc.uyu.tKc != 13) && (paramInt1 == 0)) {
          break label1710;
        }
        paramay = parambhc.uyu.mCK;
      }
      label392:
      label443:
      label1236:
      label1256:
      label1594:
      label1606:
      label1630:
      label1648:
      label1710:
      for (;;)
      {
        paramav = parambhc.uyu.fuw;
        if ((paramav != null) && (paramav.length() > 40)) {
          paramav = paramav.substring(0, 40) + "...";
        }
        for (;;)
        {
          paramc.qxB.setVisibility(8);
          TagImageView localTagImageView;
          an localan;
          if (!parambhc.uyu.tKd.isEmpty())
          {
            paramc.qTP.setVisibility(0);
            localObject1 = (amn)parambhc.uyu.tKd.get(0);
            if (parambhc.uyu.tKc == 15)
            {
              paramc.qxB.setImageResource(i.e.baQ);
              paramc.qxB.setVisibility(0);
              localObject2 = ae.bhm();
              localTagImageView = paramc.qTP;
              paramInt1 = i.i.dlh;
              j = this.mActivity.hashCode();
              localan = an.bQu();
              localan.time = parambhc.orU;
              ((com.tencent.mm.plugin.sns.model.g)localObject2).b((amn)localObject1, localTagImageView, paramInt1, j, localan);
              if (parambhc.uyu.tKc == 15)
              {
                paramay = "";
                paramav = this.mActivity.getString(i.j.pSo);
              }
              if (com.tencent.mm.sdk.platformtools.bg.mZ(paramay)) {
                break label1594;
              }
              paramc.qTQ.setVisibility(0);
              paramc.qTQ.setText(paramay);
              if (com.tencent.mm.sdk.platformtools.bg.mZ(paramav)) {
                break label1648;
              }
              if (paramc.qTQ.getVisibility() != 8) {
                break label1606;
              }
              if (paramc.qTR != 2) {
                paramc.iin.setMaxLines(2);
              }
            }
          }
          for (paramc.qTR = 2;; paramc.qTR = 1)
          {
            paramc.iin.setVisibility(0);
            if (i == 0) {
              break label1630;
            }
            paramc.iin.setText(i.a(paramav, this.mActivity, paramc.iin));
            GMTrace.o(8518396542976L, 63467);
            return;
            if (parambhc.uyu.tKc == 9)
            {
              if (parambhc.uyu.tKd.size() <= 0) {
                break label1713;
              }
              paramc.qNb.setTag(new r(parambhc, (String)localObject1));
              paramc.qNb.setOnClickListener(paramav.qHC.qSv);
              i = 0;
              paramInt1 = 0;
              break;
            }
            if (parambhc.uyu.tKc == 10)
            {
              if (parambhc.uyu.tKd.size() <= 0) {
                break label1713;
              }
              paramc.qNb.setTag(new r(parambhc, (String)localObject1));
              paramc.qNb.setOnClickListener(paramav.qHC.qSx);
              i = 0;
              paramInt1 = 0;
              break;
            }
            if (parambhc.uyu.tKc == 17)
            {
              if (parambhc.uyu.tKd.size() <= 0) {
                break label1713;
              }
              paramc.qNb.setTag(new r(parambhc, (String)localObject1));
              paramc.qNb.setOnClickListener(paramav.qHC.qSy);
              i = 0;
              paramInt1 = 0;
              break;
            }
            if (parambhc.uyu.tKc == 22)
            {
              if (parambhc.uyu.tKd.size() <= 0) {
                break label1713;
              }
              paramc.qNb.setTag(new r(parambhc, (String)localObject1));
              paramc.qNb.setOnClickListener(paramav.qHC.qSz);
              i = 0;
              paramInt1 = 0;
              break;
            }
            if (parambhc.uyu.tKc == 23)
            {
              if (parambhc.uyu.tKd.size() <= 0) {
                break label1713;
              }
              paramc.qNb.setTag(new r(parambhc, (String)localObject1));
              paramc.qNb.setOnClickListener(paramav.qHC.qSA);
              i = 0;
              paramInt1 = 0;
              break;
            }
            if (parambhc.uyu.tKc == 14)
            {
              if (parambhc.uyu.tKd.size() <= 0) {
                break label1713;
              }
              paramc.qNb.setTag(new r(parambhc, (String)localObject1));
              paramc.qNb.setOnClickListener(paramav.qHC.qSw);
              i = 0;
              paramInt1 = 0;
              break;
            }
            if (parambhc.uyu.tKc == 12)
            {
              if (parambhc.uyu.tKd.size() <= 0) {
                break label1713;
              }
              paramc.qNb.setTag(new r(parambhc, (String)localObject1));
              paramc.qNb.setOnClickListener(paramav.qHC.qSE);
              i = 0;
              paramInt1 = 0;
              break;
            }
            if (parambhc.uyu.tKc == 13)
            {
              if (parambhc.uyu.tKd.size() > 0)
              {
                paramc.qNb.setTag(new r(parambhc, (String)localObject1));
                paramc.qNb.setOnClickListener(paramav.qHC.qSF);
                i = 0;
                paramInt1 = 0;
                break;
              }
              paramc.qNb.setOnClickListener(null);
              i = 0;
              paramInt1 = 0;
              break;
            }
            if (parambhc.uyu.tKc == 15)
            {
              if (parambhc.uyu.tKd.size() <= 0) {
                break label1713;
              }
              paramc.qNb.setTag(new r(parambhc, (String)localObject1));
              paramc.qNb.setOnClickListener(paramav.qgD.qVA);
              i = 0;
              paramInt1 = 0;
              break;
            }
            paramc.qNb.setTag(new r(parambhc, (String)localObject1));
            paramc.qNb.setOnClickListener(paramav.qHC.qMO);
            if ((parambhc.haU & 0x1) <= 0) {
              break label1713;
            }
            i = 1;
            paramInt1 = 0;
            break;
            paramav.kkG.c(paramc.qNb, paramav.qgD.qVr, paramav.qgD.qVc);
            break label109;
            if ((al.a.bhO() & 0x1) <= 0)
            {
              j = 1;
              break label125;
            }
            j = 0;
            break label125;
            paramay = "";
            break label142;
            if (parambhc.uyu.tKc == 5)
            {
              paramav = ((amn)localObject1).fuw;
              paramc.qxB.setImageResource(i.e.bet);
              paramc.qxB.setVisibility(0);
              localObject2 = ae.bhm();
              localTagImageView = paramc.qTP;
              paramInt1 = i.i.dlh;
              j = this.mActivity.hashCode();
              localan = an.bQu();
              localan.time = parambhc.orU;
              ((com.tencent.mm.plugin.sns.model.g)localObject2).b((amn)localObject1, localTagImageView, paramInt1, j, localan);
              break label392;
            }
            if (parambhc.uyu.tKc == 18)
            {
              paramc.qxB.setVisibility(0);
              paramc.qxB.setImageResource(i.e.bet);
              paramc.qTP.setVisibility(0);
              localObject2 = ae.bhm();
              localTagImageView = paramc.qTP;
              paramInt1 = i.i.dlh;
              j = this.mActivity.hashCode();
              localan = an.bQu();
              localan.time = parambhc.orU;
              ((com.tencent.mm.plugin.sns.model.g)localObject2).b((amn)localObject1, localTagImageView, paramInt1, j, localan);
              break label392;
            }
            localObject2 = ae.bhm();
            localTagImageView = paramc.qTP;
            paramInt1 = this.mActivity.hashCode();
            localan = an.bQu();
            localan.time = parambhc.orU;
            ((com.tencent.mm.plugin.sns.model.g)localObject2).b((amn)localObject1, localTagImageView, paramInt1, localan);
            break label392;
            if (parambhc.uyu.tKc == 18)
            {
              paramc.qxB.setVisibility(0);
              paramc.qxB.setImageResource(i.e.bet);
              paramc.qTP.setVisibility(0);
              ae.bhm().b(paramc.qTP, -1, i.i.dlh, this.mActivity.hashCode());
              break label392;
            }
            paramc.qTP.setVisibility(0);
            ae.bhm().b(paramc.qTP, -1, i.i.dlk, this.mActivity.hashCode());
            break label392;
            paramc.qTQ.setVisibility(8);
            break label443;
            if (paramc.qTR != 1) {
              paramc.iin.setMaxLines(1);
            }
          }
          paramc.iin.setText(paramav);
          GMTrace.o(8518396542976L, 63467);
          return;
          if (paramInt2 == 1)
          {
            paramc.iin.setText(av.Ix(parambhc.uyu.mDo));
            paramc.iin.setVisibility(0);
            GMTrace.o(8518396542976L, 63467);
            return;
          }
          paramc.iin.setVisibility(8);
          GMTrace.o(8518396542976L, 63467);
          return;
        }
      }
      label1713:
      i = 0;
      paramInt1 = 0;
    }
  }
  
  public final void d(a.c paramc)
  {
    GMTrace.i(8518262325248L, 63466);
    if ((paramc.qTM != null) && (paramc.qTM.getParent() != null))
    {
      paramc.qTM.setLayoutResource(i.g.pPb);
      if (!paramc.qUx) {
        paramc.qUy = paramc.qTM.inflate();
      }
    }
    for (paramc.qUx = true;; paramc.qUx = true)
    {
      paramc.qNb = paramc.qUy;
      paramc.qTP = ((TagImageView)paramc.qNb.findViewById(i.f.pJY));
      paramc.qxB = ((ImageView)paramc.qNb.findViewById(i.f.state));
      paramc.qTQ = ((TextView)paramc.qNb.findViewById(i.f.pKS));
      paramc.iin = ((TextView)paramc.qNb.findViewById(i.f.pNx));
      paramc.iin.setTextColor(this.mActivity.getResources().getColor(i.c.black));
      i.b(paramc.qTP, this.mActivity);
      GMTrace.o(8518262325248L, 63466);
      return;
      paramc.qUy = paramc.msJ.findViewById(i.f.pKB);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */