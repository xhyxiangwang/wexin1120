package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ShapeDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.card.b.m;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public abstract class a
  implements g
{
  protected LayoutInflater CO;
  private final String TAG;
  protected View.OnClickListener iom;
  protected View kBi;
  protected ImageView kBj;
  protected TextView kBk;
  protected b kmJ;
  protected Context mContext;
  
  public a(Context paramContext)
  {
    GMTrace.i(4884317339648L, 36391);
    this.TAG = "MicroMsg.CardWidgetCouponBase";
    this.mContext = paramContext;
    GMTrace.o(4884317339648L, 36391);
  }
  
  private void amr()
  {
    GMTrace.i(4884719992832L, 36394);
    if ((this.kmJ == null) || (this.kmJ.aiK() == null))
    {
      w.e("MicroMsg.CardWidgetCouponBase", "mCardInfo == null or mCardInfo.getCardTpInfo() == null");
      GMTrace.o(4884719992832L, 36394);
      return;
    }
    int i;
    if (!bg.mZ(this.kmJ.aiK().knr))
    {
      i = this.mContext.getResources().getDimensionPixelSize(R.f.aSP);
      if ((!this.kmJ.aip()) || (!this.kmJ.ais())) {
        break label191;
      }
      i = this.mContext.getResources().getDimensionPixelSize(R.f.aSN);
    }
    for (;;)
    {
      if (i > 0) {
        m.a(this.kBj, this.kmJ.aiK().knr, i, R.g.baR, true);
      }
      if (!bg.mZ(this.kmJ.aiK().koD)) {
        this.kBk.setText(this.kmJ.aiK().koD);
      }
      amu();
      GMTrace.o(4884719992832L, 36394);
      return;
      label191:
      if ((this.kmJ.aip()) && (this.kmJ.air())) {
        i = this.mContext.getResources().getDimensionPixelSize(R.f.aTc);
      } else if ((this.kmJ.aip()) && (this.kmJ.ait())) {
        i = this.mContext.getResources().getDimensionPixelSize(R.f.aTi);
      } else if (this.kmJ.aiv()) {
        i = 0;
      }
    }
  }
  
  public void a(ShapeDrawable paramShapeDrawable)
  {
    GMTrace.i(4885793734656L, 36402);
    GMTrace.o(4885793734656L, 36402);
  }
  
  public final View amq()
  {
    GMTrace.i(4884585775104L, 36393);
    if ((this.kmJ == null) || (this.kmJ.aiK() == null))
    {
      w.e("MicroMsg.CardWidgetCouponBase", "mCardInfo == null or mCardInfo.getCardTpInfo() == null");
      GMTrace.o(4884585775104L, 36393);
      return null;
    }
    this.CO = ((LayoutInflater)this.mContext.getSystemService("layout_inflater"));
    Object localObject = this.CO;
    int i;
    if (!this.kmJ.ais()) {
      if (this.kmJ.ait()) {
        i = R.i.cOO;
      }
    }
    for (;;)
    {
      this.kBi = ((LayoutInflater)localObject).inflate(i, null);
      this.kBj = ((ImageView)this.kBi.findViewById(R.h.bip));
      this.kBk = ((TextView)this.kBi.findViewById(R.h.bis));
      amt();
      amr();
      localObject = this.kBi;
      GMTrace.o(4884585775104L, 36393);
      return (View)localObject;
      if (this.kmJ.air()) {
        i = R.i.cOu;
      } else if (this.kmJ.aiu()) {
        i = R.i.cOd;
      } else if (this.kmJ.aiv()) {
        i = R.i.cOo;
      } else {
        i = R.i.cOa;
      }
    }
  }
  
  protected final View ams()
  {
    GMTrace.i(4884854210560L, 36395);
    View localView = this.kBi;
    GMTrace.o(4884854210560L, 36395);
    return localView;
  }
  
  protected abstract void amt();
  
  protected abstract void amu();
  
  public void dB(boolean paramBoolean)
  {
    GMTrace.i(4885256863744L, 36398);
    GMTrace.o(4885256863744L, 36398);
  }
  
  public void dC(boolean paramBoolean)
  {
    GMTrace.i(4885927952384L, 36403);
    GMTrace.o(4885927952384L, 36403);
  }
  
  public final void f(b paramb)
  {
    GMTrace.i(4885659516928L, 36401);
    this.kmJ = paramb;
    amr();
    GMTrace.o(4885659516928L, 36401);
  }
  
  public final void k(b paramb)
  {
    GMTrace.i(4884451557376L, 36392);
    this.kmJ = paramb;
    GMTrace.o(4884451557376L, 36392);
  }
  
  public void l(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(4886062170112L, 36404);
    GMTrace.o(4886062170112L, 36404);
  }
  
  public void lO(int paramInt)
  {
    GMTrace.i(4885122646016L, 36397);
    GMTrace.o(4885122646016L, 36397);
  }
  
  public final void release()
  {
    GMTrace.i(4884988428288L, 36396);
    this.iom = null;
    this.mContext = null;
    GMTrace.o(4884988428288L, 36396);
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(4886196387840L, 36405);
    this.iom = paramOnClickListener;
    GMTrace.o(4886196387840L, 36405);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/widget/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */