package com.tencent.mm.plugin.appbrand.widget.input.panel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bs.e;
import com.tencent.mm.plugin.appbrand.p.g;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
  extends a
{
  private static final int jFe;
  private static final int jFf;
  
  static
  {
    GMTrace.i(19875900686336L, 148087);
    jFe = com.tencent.mm.bq.a.fromDPToPix(ab.getContext(), 48);
    jFf = com.tencent.mm.bq.a.fromDPToPix(ab.getContext(), 43);
    GMTrace.o(19875900686336L, 148087);
  }
  
  public b()
  {
    GMTrace.i(19874826944512L, 148079);
    GMTrace.o(19874826944512L, 148079);
  }
  
  public final int acR()
  {
    GMTrace.i(19875095379968L, 148081);
    int i = this.jFc.acJ().acL();
    GMTrace.o(19875095379968L, 148081);
    return i;
  }
  
  public final int acS()
  {
    GMTrace.i(19875229597696L, 148082);
    int i = acT();
    int j = getRowCount();
    GMTrace.o(19875229597696L, 148082);
    return i * j;
  }
  
  public final int acT()
  {
    GMTrace.i(19875498033152L, 148084);
    if (this.jFc.jFs)
    {
      GMTrace.o(19875498033152L, 148084);
      return 7;
    }
    c localc = this.jFc;
    if (localc.jFx <= 1) {
      localc.jFx = c.aat()[0];
    }
    int i = localc.jFx / jFf;
    GMTrace.o(19875498033152L, 148084);
    return i;
  }
  
  public final int acU()
  {
    GMTrace.i(19875632250880L, 148085);
    int i = (this.jFc.jFw - jFe * getRowCount()) / (getRowCount() + 1);
    GMTrace.o(19875632250880L, 148085);
    return i;
  }
  
  public final int getPageCount()
  {
    GMTrace.i(19875363815424L, 148083);
    if (acS() <= 0)
    {
      GMTrace.o(19875363815424L, 148083);
      return 0;
    }
    int i = acR();
    int j = acS();
    i = (int)Math.ceil(i / j);
    GMTrace.o(19875363815424L, 148083);
    return i;
  }
  
  public final int getRowCount()
  {
    int i = 3;
    GMTrace.i(19875766468608L, 148086);
    int j = this.jFc.jFw / jFe;
    if (j > 3) {}
    while (i <= 0)
    {
      GMTrace.o(19875766468608L, 148086);
      return 1;
      i = j;
    }
    GMTrace.o(19875766468608L, 148086);
    return i;
  }
  
  public final View kd(int paramInt)
  {
    GMTrace.i(19874961162240L, 148080);
    Object localObject1 = this.jFb;
    Object localObject2 = this.jFc;
    d locald = new d();
    locald.mIndex = paramInt;
    locald.jFy = this;
    locald.mContext = ((Context)localObject1);
    locald.jFc = ((c)localObject2);
    if ((locald.mContext == null) || (locald.jFy == null))
    {
      GMTrace.o(19874961162240L, 148080);
      return null;
    }
    localObject1 = View.inflate(locald.mContext, p.g.ivG, null);
    if ((localObject1 instanceof AppBrandSmileyGrid))
    {
      ((AppBrandSmileyGrid)localObject1).jFc = locald.jFc;
      localObject2 = (AppBrandSmileyGrid)localObject1;
      paramInt = locald.mIndex;
      int i = locald.jFy.acR();
      int j = locald.jFy.acS();
      int k = locald.jFy.acT();
      int m = locald.jFy.getRowCount();
      int n = locald.jFy.acU();
      ((AppBrandSmileyGrid)localObject2).setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
      ((AppBrandSmileyGrid)localObject2).setBackgroundResource(0);
      ((AppBrandSmileyGrid)localObject2).setStretchMode(2);
      ((AppBrandSmileyGrid)localObject2).setOnItemClickListener(((AppBrandSmileyGrid)localObject2).WK);
      ((AppBrandSmileyGrid)localObject2).jFj = paramInt;
      ((AppBrandSmileyGrid)localObject2).jFh = i;
      ((AppBrandSmileyGrid)localObject2).jFi = j;
      ((AppBrandSmileyGrid)localObject2).jFk = n;
      ((AppBrandSmileyGrid)localObject2).jFl = k;
      ((AppBrandSmileyGrid)localObject2).jFm = m;
      ((AppBrandSmileyGrid)localObject2).setNumColumns(k);
      i = ((AppBrandSmileyGrid)localObject2).jFk;
      j = com.tencent.mm.bq.a.fromDPToPix(((AppBrandSmileyGrid)localObject2).getContext(), 6);
      k = com.tencent.mm.bq.a.fromDPToPix(((AppBrandSmileyGrid)localObject2).getContext(), 6);
      paramInt = i;
      if (i == 0) {
        paramInt = com.tencent.mm.bq.a.fromDPToPix(((AppBrandSmileyGrid)localObject2).getContext(), 6);
      }
      ((AppBrandSmileyGrid)localObject2).setPadding(j, paramInt, k, 0);
      ((AppBrandSmileyGrid)localObject2).jFg = new AppBrandSmileyGrid.a((AppBrandSmileyGrid)localObject2, (byte)0);
      ((AppBrandSmileyGrid)localObject2).setAdapter(((AppBrandSmileyGrid)localObject2).jFg);
      ((AppBrandSmileyGrid)localObject2).jFg.notifyDataSetChanged();
    }
    GMTrace.o(19874961162240L, 148080);
    return (View)localObject1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/panel/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */