package com.tencent.mm.plugin.sns.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kiss.widget.textview.a.b;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public final class c
{
  private static c qXp;
  public int qXl;
  private com.tencent.mm.kiss.widget.textview.a.a qXq;
  private com.tencent.mm.kiss.widget.textview.a.a qXr;
  
  static
  {
    GMTrace.i(8330894376960L, 62070);
    qXp = new c();
    GMTrace.o(8330894376960L, 62070);
  }
  
  public c()
  {
    GMTrace.i(8330089070592L, 62064);
    this.qXl = 0;
    this.qXq = null;
    this.qXr = null;
    GMTrace.o(8330089070592L, 62064);
  }
  
  public static c bov()
  {
    GMTrace.i(8330223288320L, 62065);
    c localc = qXp;
    GMTrace.o(8330223288320L, 62065);
    return localc;
  }
  
  public static float getTextSize()
  {
    GMTrace.i(8330760159232L, 62069);
    float f = com.tencent.mm.bq.a.fromDPToPix(ab.getContext(), (int)(15.0F * com.tencent.mm.bq.a.dZ(ab.getContext())));
    GMTrace.o(8330760159232L, 62069);
    return f;
  }
  
  public final com.tencent.mm.kiss.widget.textview.a.a bou()
  {
    GMTrace.i(8330357506048L, 62066);
    int i = com.tencent.mm.bq.a.fromDPToPix(ab.getContext(), (int)(15.0F * com.tencent.mm.bq.a.dZ(ab.getContext())));
    if ((this.qXq == null) || ((int)this.qXq.gUs != i)) {
      this.qXq = b.xX().eY(19).eZ(ab.getContext().getResources().getColor(i.c.aPH)).K(i).gUb;
    }
    com.tencent.mm.kiss.widget.textview.a.a locala = this.qXq;
    GMTrace.o(8330357506048L, 62066);
    return locala;
  }
  
  public final com.tencent.mm.kiss.widget.textview.a.a bow()
  {
    GMTrace.i(8330491723776L, 62067);
    int i = com.tencent.mm.bq.a.fromDPToPix(ab.getContext(), (int)(15.0F * com.tencent.mm.bq.a.dZ(ab.getContext())));
    if ((this.qXr == null) || ((int)this.qXr.gUs != i))
    {
      localObject = b.xX().eY(19).eZ(ab.getContext().getResources().getColor(i.c.aPH)).K(i);
      ((b)localObject).gUb.maxLines = 6;
      this.qXr = ((b)localObject).gUb;
    }
    Object localObject = this.qXr;
    GMTrace.o(8330491723776L, 62067);
    return (com.tencent.mm.kiss.widget.textview.a.a)localObject;
  }
  
  public final int box()
  {
    GMTrace.i(8330625941504L, 62068);
    if (this.qXl <= 0)
    {
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      ((WindowManager)ab.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
      i = localDisplayMetrics.widthPixels;
      int j = (int)(ab.getResources().getDimension(i.d.aSg) + ab.getResources().getDimension(i.d.aSg));
      int k = (int)ab.getResources().getDimension(i.d.pGz);
      int m = (int)ab.getResources().getDimension(i.d.aSg);
      this.qXl = (i - k - j);
      w.i("MicroMsg.SnsPostDescPreloadTextViewConfig", "screenWidth " + i + " textViewWidth " + this.qXl + " padding: " + j + " marginLeft: " + k + " thisviewPadding: " + m);
    }
    int i = this.qXl;
    GMTrace.o(8330625941504L, 62068);
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/widget/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */