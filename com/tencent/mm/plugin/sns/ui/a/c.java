package com.tencent.mm.plugin.sns.ui.a;

import android.app.Activity;
import android.content.res.Resources;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.ui.TagImageView;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.plugin.sns.ui.ay;
import com.tencent.mm.plugin.sns.ui.r;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.aol;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.storage.an;
import java.util.LinkedList;

public final class c
  extends a
{
  public c()
  {
    GMTrace.i(8522020421632L, 63494);
    GMTrace.o(8522020421632L, 63494);
  }
  
  public final void a(a.c paramc, int paramInt1, ay paramay, bhc parambhc, int paramInt2, av paramav)
  {
    GMTrace.i(8522288857088L, 63496);
    String str = paramay.qAX;
    if (!parambhc.uyu.tKd.isEmpty())
    {
      paramc.qTP.position = paramInt1;
      paramc.qNb.setVisibility(0);
      paramay = (amn)parambhc.uyu.tKd.get(0);
      Object localObject1 = ae.bhm();
      Object localObject2 = paramc.qTP;
      paramInt1 = i.i.dkW;
      paramInt2 = this.mActivity.hashCode();
      an localan = an.bQu();
      localan.time = parambhc.orU;
      ((com.tencent.mm.plugin.sns.model.g)localObject1).b(paramay, (View)localObject2, paramInt1, paramInt2, localan);
      paramc.qxB.setPressed(false);
      localObject1 = parambhc.nas;
      if (com.tencent.mm.as.b.JN())
      {
        localObject2 = com.tencent.mm.as.b.JP();
        if ((localObject2 != null) && (com.tencent.mm.as.b.d((aol)localObject2)) && (((String)localObject1).equals(((aol)localObject2).tIh)))
        {
          paramInt1 = 1;
          if (paramInt1 == 0) {
            break label359;
          }
          paramc.qxB.setImageResource(i.e.baP);
          label180:
          paramc.qTP.setTag(new r(parambhc, str));
          paramc.qTP.setOnClickListener(paramav.qHC.qSB);
          paramc.qNb.setTag(new r(parambhc, str));
          paramav.kkG.c(paramc.qNb, paramav.qgD.qVr, paramav.qgD.qVc);
          paramc.qNb.setOnClickListener(paramav.qHC.qMO);
          parambhc = paramay.mCK;
          if (com.tencent.mm.sdk.platformtools.bg.mZ(parambhc)) {
            break label372;
          }
          paramc.qTQ.setVisibility(0);
          paramc.qTQ.setText(parambhc);
        }
      }
      for (;;)
      {
        paramay = paramay.fuw;
        if (com.tencent.mm.sdk.platformtools.bg.mZ(paramay)) {
          break label383;
        }
        paramc.iin.setVisibility(0);
        paramay = new SpannableString(paramay);
        paramc.iin.setText(paramay, TextView.BufferType.SPANNABLE);
        GMTrace.o(8522288857088L, 63496);
        return;
        paramInt1 = 0;
        break;
        label359:
        paramc.qxB.setImageResource(i.e.baQ);
        break label180;
        label372:
        paramc.qTQ.setVisibility(4);
      }
      label383:
      paramc.iin.setVisibility(8);
      GMTrace.o(8522288857088L, 63496);
      return;
    }
    paramc.qNb.setVisibility(8);
    GMTrace.o(8522288857088L, 63496);
  }
  
  public final void d(a.c paramc)
  {
    GMTrace.i(8522154639360L, 63495);
    if (paramc.qTM != null)
    {
      paramc.qTM.setLayoutResource(i.g.pPb);
      paramc.qUw = ((ViewStub)paramc.msJ.findViewById(i.f.pJZ));
      if ((!paramc.qUx) && (paramc.qUw != null)) {
        paramc.qUy = paramc.qUw.inflate();
      }
    }
    for (paramc.qUx = true;; paramc.qUx = true)
    {
      paramc.qNb = paramc.qUy;
      paramc.qNb.findViewById(i.f.state).setOnTouchListener(this.qhj.qBi);
      paramc.qTP = ((TagImageView)paramc.qNb.findViewById(i.f.pJY));
      paramc.qxB = ((ImageView)paramc.qNb.findViewById(i.f.state));
      paramc.qTQ = ((TextView)paramc.qNb.findViewById(i.f.pKS));
      paramc.iin = ((TextView)paramc.qNb.findViewById(i.f.pNx));
      paramc.iin.setTextColor(this.mActivity.getResources().getColor(i.c.aQn));
      paramc.iin.setMaxLines(1);
      i.b(paramc.qTP, this.mActivity);
      GMTrace.o(8522154639360L, 63495);
      return;
      paramc.qUy = paramc.msJ.findViewById(i.f.pKB);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */