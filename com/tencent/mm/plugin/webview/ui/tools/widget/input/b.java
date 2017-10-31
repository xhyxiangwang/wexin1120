package com.tencent.mm.plugin.webview.ui.tools.widget.input;

import android.content.Context;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.bs.e;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
  extends a
{
  private static final int jFe;
  private static final int jFf;
  
  static
  {
    GMTrace.i(12076642729984L, 89978);
    jFe = com.tencent.mm.bq.a.fromDPToPix(ab.getContext(), 48);
    jFf = com.tencent.mm.bq.a.fromDPToPix(ab.getContext(), 43);
    GMTrace.o(12076642729984L, 89978);
  }
  
  public b()
  {
    GMTrace.i(12075568988160L, 89970);
    GMTrace.o(12075568988160L, 89970);
  }
  
  public final int acR()
  {
    GMTrace.i(12075837423616L, 89972);
    int i = e.bOH().acL();
    GMTrace.o(12075837423616L, 89972);
    return i;
  }
  
  public final int acS()
  {
    GMTrace.i(12075971641344L, 89973);
    int i = acT();
    int j = getRowCount();
    GMTrace.o(12075971641344L, 89973);
    return i * j;
  }
  
  public final int acT()
  {
    GMTrace.i(12076240076800L, 89975);
    if (this.sCN.jFs)
    {
      GMTrace.o(12076240076800L, 89975);
      return 7;
    }
    c localc = this.sCN;
    if (localc.jFx <= 1)
    {
      Display localDisplay = ((WindowManager)ab.getContext().getSystemService("window")).getDefaultDisplay();
      localc.jFx = new int[] { localDisplay.getWidth(), localDisplay.getHeight() }[0];
    }
    int i = localc.jFx / jFf;
    GMTrace.o(12076240076800L, 89975);
    return i;
  }
  
  public final int acU()
  {
    GMTrace.i(12076374294528L, 89976);
    int i = (this.sCN.jFw - jFe * getRowCount()) / (getRowCount() + 1);
    GMTrace.o(12076374294528L, 89976);
    return i;
  }
  
  public final int getPageCount()
  {
    GMTrace.i(12076105859072L, 89974);
    if (acS() <= 0)
    {
      GMTrace.o(12076105859072L, 89974);
      return 0;
    }
    int i = e.bOH().acL();
    int j = acS();
    i = (int)Math.ceil(i / j);
    GMTrace.o(12076105859072L, 89974);
    return i;
  }
  
  public final int getRowCount()
  {
    int i = 3;
    GMTrace.i(12076508512256L, 89977);
    int j = this.sCN.jFw / jFe;
    if (j > 3) {}
    while (i <= 0)
    {
      GMTrace.o(12076508512256L, 89977);
      return 1;
      i = j;
    }
    GMTrace.o(12076508512256L, 89977);
    return i;
  }
  
  public final View kd(int paramInt)
  {
    GMTrace.i(12075703205888L, 89971);
    Object localObject1 = this.jFb;
    Object localObject2 = this.sCN;
    d locald = new d();
    locald.mIndex = paramInt;
    locald.sCV = this;
    locald.mContext = ((Context)localObject1);
    locald.sCN = ((c)localObject2);
    if ((locald.mContext == null) || (locald.sCV == null))
    {
      GMTrace.o(12075703205888L, 89971);
      return null;
    }
    localObject1 = View.inflate(locald.mContext, R.i.djO, null);
    if ((localObject1 instanceof WebViewSmileyGrid))
    {
      ((WebViewSmileyGrid)localObject1).sCN = locald.sCN;
      localObject2 = (WebViewSmileyGrid)localObject1;
      paramInt = locald.mIndex;
      int i = locald.sCV.acR();
      int j = locald.sCV.acS();
      int k = locald.sCV.acT();
      int m = locald.sCV.getRowCount();
      int n = locald.sCV.acU();
      ((WebViewSmileyGrid)localObject2).setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
      ((WebViewSmileyGrid)localObject2).setBackgroundResource(0);
      ((WebViewSmileyGrid)localObject2).setStretchMode(2);
      ((WebViewSmileyGrid)localObject2).setOnItemClickListener(((WebViewSmileyGrid)localObject2).WK);
      ((WebViewSmileyGrid)localObject2).jFj = paramInt;
      ((WebViewSmileyGrid)localObject2).jFh = i;
      ((WebViewSmileyGrid)localObject2).jFi = j;
      ((WebViewSmileyGrid)localObject2).jFk = n;
      ((WebViewSmileyGrid)localObject2).jFl = k;
      ((WebViewSmileyGrid)localObject2).jFm = m;
      ((WebViewSmileyGrid)localObject2).setNumColumns(k);
      i = ((WebViewSmileyGrid)localObject2).jFk;
      j = com.tencent.mm.bq.a.fromDPToPix(((WebViewSmileyGrid)localObject2).getContext(), 6);
      k = com.tencent.mm.bq.a.fromDPToPix(((WebViewSmileyGrid)localObject2).getContext(), 6);
      paramInt = i;
      if (i == 0) {
        paramInt = com.tencent.mm.bq.a.fromDPToPix(((WebViewSmileyGrid)localObject2).getContext(), 6);
      }
      ((WebViewSmileyGrid)localObject2).setPadding(j, paramInt, k, 0);
      ((WebViewSmileyGrid)localObject2).sCO = new WebViewSmileyGrid.a((WebViewSmileyGrid)localObject2, (byte)0);
      ((WebViewSmileyGrid)localObject2).setAdapter(((WebViewSmileyGrid)localObject2).sCO);
      ((WebViewSmileyGrid)localObject2).sCO.notifyDataSetChanged();
    }
    GMTrace.o(12075703205888L, 89971);
    return (View)localObject1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/widget/input/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */