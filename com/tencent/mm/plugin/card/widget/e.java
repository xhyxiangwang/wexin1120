package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.an.a.a.c;
import com.tencent.mm.an.a.a.c.a;
import com.tencent.mm.an.n;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.protocal.c.jf;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.protocal.c.nc;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class e
  extends a
{
  protected TextView iiM;
  private RelativeLayout kBE;
  private TextView kBF;
  private View kBG;
  private ImageView kBH;
  private ImageView kBI;
  private ImageView kBJ;
  private ImageView kBK;
  private ImageView kBL;
  private LinearLayout krE;
  
  public e(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(4892101967872L, 36449);
    GMTrace.o(4892101967872L, 36449);
  }
  
  private void amy()
  {
    GMTrace.i(4893175709696L, 36457);
    Object localObject = new c.a();
    ((c.a)localObject).hCS = com.tencent.mm.compatible.util.e.gZT;
    n.Jb();
    ((c.a)localObject).hDk = null;
    ((c.a)localObject).hCR = com.tencent.mm.plugin.card.model.m.tG(this.kmJ.aiL().tEE);
    ((c.a)localObject).hCP = true;
    ((c.a)localObject).hDm = true;
    ((c.a)localObject).hDn = this.mContext.getResources().getDimensionPixelSize(R.f.aTa);
    ((c.a)localObject).hDo = true;
    ((c.a)localObject).hCN = true;
    ((c.a)localObject).hDe = R.g.aXr;
    localObject = ((c.a)localObject).Jk();
    n.Ja().a(this.kmJ.aiL().tEE, this.kBK, (c)localObject);
    w.i("MicroMsg.CardWidgetMembership", "the member back ground url is " + this.kmJ.aiL().tEE);
    GMTrace.o(4893175709696L, 36457);
  }
  
  public final void a(ShapeDrawable paramShapeDrawable)
  {
    GMTrace.i(4892907274240L, 36455);
    if (!TextUtils.isEmpty(this.kmJ.aiL().tEE))
    {
      this.kBK.setBackgroundDrawable(null);
      this.kBL.setVisibility(0);
      amy();
      GMTrace.o(4892907274240L, 36455);
      return;
    }
    if (this.kBi != null)
    {
      this.kBK.setBackgroundDrawable(paramShapeDrawable);
      this.kBL.setVisibility(8);
    }
    GMTrace.o(4892907274240L, 36455);
  }
  
  protected final void amt()
  {
    GMTrace.i(4892236185600L, 36450);
    this.iiM = ((TextView)ams().findViewById(R.h.brq));
    this.kBE = ((RelativeLayout)ams().findViewById(R.h.bqw));
    this.krE = ((LinearLayout)ams().findViewById(R.h.bpk));
    this.kBF = ((TextView)ams().findViewById(R.h.bvG));
    this.kBG = ams().findViewById(R.h.bpi);
    this.kBH = ((ImageView)ams().findViewById(R.h.bpj));
    this.kBI = ((ImageView)this.kBi.findViewById(R.h.cbV));
    this.kBJ = ((ImageView)this.kBi.findViewById(R.h.cbU));
    this.kBK = ((ImageView)this.kBi.findViewById(R.h.bqt));
    this.kBL = ((ImageView)this.kBi.findViewById(R.h.bqv));
    GMTrace.o(4892236185600L, 36450);
  }
  
  protected final void amu()
  {
    GMTrace.i(4892370403328L, 36451);
    if (this.kBk != null) {
      this.kBk.setText(this.kmJ.aiK().koD);
    }
    Object localObject;
    if ((this.kmJ.aiK().tEW != null) && (this.kmJ.aiK().tEW.size() > 0))
    {
      localObject = (nc)this.kmJ.aiK().tEW.get(0);
      if (!TextUtils.isEmpty(((nc)localObject).title)) {
        this.iiM.setText(((nc)localObject).title);
      }
    }
    else
    {
      if (!this.kmJ.aiG()) {
        break label492;
      }
      dB(true);
      this.kBK.setAlpha(255);
      if (this.kBK.getBackground() != null) {
        this.kBK.getBackground().setAlpha(255);
      }
      localObject = this.kmJ.aiL().code;
      if (!TextUtils.isEmpty((CharSequence)localObject)) {
        break label315;
      }
      w.e("MicroMsg.CardWidgetMembership", "don't updateCodeLayout, code is empty!");
      dB(false);
    }
    for (;;)
    {
      localObject = this.kBE.getLayoutParams();
      int i = this.mContext.getResources().getDimensionPixelSize(R.f.aRT);
      int j = this.mContext.getResources().getDisplayMetrics().widthPixels - i * 2;
      int k = j * 3 / 5;
      ((ViewGroup.LayoutParams)localObject).height = k;
      w.d("MicroMsg.CardWidgetMembership", "padding:%d,originWidth:%d,targetWidth:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
      this.kBE.setLayoutParams((ViewGroup.LayoutParams)localObject);
      GMTrace.o(4892370403328L, 36451);
      return;
      this.iiM.setText("");
      break;
      label315:
      this.kBG.setOnClickListener(this.iom);
      this.kBH.setOnClickListener(this.iom);
      this.kBF.setOnClickListener(this.iom);
      switch (this.kmJ.aiL().tEt)
      {
      default: 
        break;
      case 0: 
        if (((String)localObject).length() <= 40) {
          this.kBF.setText(com.tencent.mm.plugin.card.b.m.us((String)localObject));
        }
        break;
      case 1: 
      case 2: 
        if (((String)localObject).length() <= 40)
        {
          if (this.kmJ.aiz()) {
            this.kBF.setText(com.tencent.mm.plugin.card.b.m.us((String)localObject));
          } else {
            this.kBF.setText("");
          }
        }
        else
        {
          this.kBF.setText("");
          continue;
          this.kBF.setText("");
          continue;
          label492:
          this.kBF.setText("");
          this.kBH.setVisibility(8);
          this.kBG.setVisibility(8);
          this.kBK.setAlpha(90);
          if (this.kBK.getBackground() != null) {
            this.kBK.getBackground().setAlpha(90);
          }
        }
        break;
      }
    }
  }
  
  public final void dB(boolean paramBoolean)
  {
    GMTrace.i(4892638838784L, 36453);
    if ((!TextUtils.isEmpty(this.kmJ.aiL().code)) && (paramBoolean) && (this.kmJ.aiL().tEt != 0) && (!this.kmJ.aiK().tFE))
    {
      this.kBH.setVisibility(0);
      this.kBG.setVisibility(0);
      GMTrace.o(4892638838784L, 36453);
      return;
    }
    this.kBH.setVisibility(8);
    this.kBG.setVisibility(8);
    GMTrace.o(4892638838784L, 36453);
  }
  
  public final void dC(boolean paramBoolean)
  {
    GMTrace.i(4893041491968L, 36456);
    if (!TextUtils.isEmpty(this.kmJ.aiL().tEE))
    {
      this.kBJ.setVisibility(8);
      this.kBI.setVisibility(8);
      GMTrace.o(4893041491968L, 36456);
      return;
    }
    this.kBJ.setVisibility(0);
    this.kBI.setVisibility(0);
    GMTrace.o(4893041491968L, 36456);
  }
  
  public final void l(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(4892504621056L, 36452);
    GMTrace.o(4892504621056L, 36452);
  }
  
  public final void lO(int paramInt)
  {
    GMTrace.i(4892773056512L, 36454);
    if (!TextUtils.isEmpty(this.kmJ.aiL().tEE))
    {
      this.kBK.setBackgroundDrawable(null);
      this.kBL.setVisibility(0);
      amy();
      GMTrace.o(4892773056512L, 36454);
      return;
    }
    if (this.kBi != null)
    {
      this.kBK.setBackgroundResource(paramInt);
      this.kBL.setVisibility(8);
    }
    GMTrace.o(4892773056512L, 36454);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/widget/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */