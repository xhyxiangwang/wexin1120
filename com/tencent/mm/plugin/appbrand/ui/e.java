package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bq.a;
import com.tencent.mm.plugin.appbrand.d.b;
import com.tencent.mm.plugin.appbrand.d.c;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.mm.plugin.appbrand.widget.b;
import com.tencent.mm.plugin.appbrand.widget.p;
import com.tencent.mm.plugin.appbrand.widget.p.a;

public final class e
  extends LinearLayout
  implements p.a
{
  public final String iqL;
  private final a[] jsT;
  private final SparseArray<b> jsU;
  private final SparseArray<b> jsV;
  private int jsW;
  public d.b jsX;
  
  public e(Context paramContext, String paramString)
  {
    super(paramContext);
    GMTrace.i(15513019219968L, 115581);
    this.jsX = new d.b()
    {
      public final void a(d.c paramAnonymousc)
      {
        GMTrace.i(15511677042688L, 115571);
        super.a(paramAnonymousc);
        AppBrandPerformanceManager.rE(e.a(e.this));
        GMTrace.o(15511677042688L, 115571);
      }
      
      public final void onDestroy()
      {
        GMTrace.i(17309657726976L, 128967);
        super.onDestroy();
        AppBrandPerformanceManager.rE(e.a(e.this));
        GMTrace.o(17309657726976L, 128967);
      }
      
      public final void onResume()
      {
        GMTrace.i(15511811260416L, 115572);
        super.onResume();
        AppBrandPerformanceManager.rD(e.a(e.this));
        GMTrace.o(15511811260416L, 115572);
      }
    };
    this.iqL = paramString;
    this.jsU = new SparseArray();
    this.jsV = new SparseArray();
    this.jsT = new a[4];
    setClickable(false);
    int i = getContext().getResources().getDisplayMetrics().widthPixels;
    int j = a.fromDPToPix(getContext(), 10);
    int k = a.fromDPToPix(getContext(), 4);
    paramContext = new FrameLayout.LayoutParams(i * 3 / 5, -2);
    paramContext.gravity = 53;
    setLayoutParams(paramContext);
    aar();
    setPadding(j, j, j, j);
    setOrientation(1);
    paramContext = new GradientDrawable();
    paramContext.setCornerRadius(k);
    paramContext.setColor(-652403418);
    setBackground(paramContext);
    paramContext = new LinearLayout.LayoutParams(-1, -2);
    paramString = new LinearLayout.LayoutParams(-1, 2);
    TextView localTextView = new TextView(getContext());
    View localView = new View(getContext());
    localTextView.setTextColor(-1);
    localTextView.setLayoutParams(paramContext);
    localTextView.setTextSize(1, 14.0F);
    localTextView.setText(getContext().getString(p.i.iyd));
    addView(localTextView);
    paramString.setMargins(0, a.fromDPToPix(getContext(), 10), 0, 0);
    localView.setLayoutParams(paramString);
    localView.setBackgroundColor(1728053247);
    addView(localView);
    aas();
    p.j((Activity)getContext()).a(this);
    GMTrace.o(15513019219968L, 115581);
  }
  
  private void aar()
  {
    GMTrace.i(18193749901312L, 135554);
    if ((getLayoutParams() != null) && ((getLayoutParams() instanceof ViewGroup.MarginLayoutParams)))
    {
      ((ViewGroup.MarginLayoutParams)getLayoutParams()).topMargin = (b.bX(getContext()) + this.jsW);
      requestLayout();
    }
    GMTrace.o(18193749901312L, 135554);
  }
  
  private void aas()
  {
    GMTrace.i(15513153437696L, 115582);
    int i = 0;
    while (i < 4)
    {
      a locala = new a(getContext());
      locala.setText(getContext().getString(com.tencent.mm.plugin.appbrand.performance.b.jmU[i]));
      this.jsT[i] = locala;
      addView(locala);
      i += 1;
    }
    GMTrace.o(15513153437696L, 115582);
  }
  
  public final void C(final int paramInt, final String paramString)
  {
    GMTrace.i(15513287655424L, 115583);
    d.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(15504831938560L, 115520);
        e.a(e.this, paramInt, paramString);
        GMTrace.o(15504831938560L, 115520);
      }
    });
    GMTrace.o(15513287655424L, 115583);
  }
  
  public final void bi(final String paramString1, final String paramString2)
  {
    GMTrace.i(15513421873152L, 115584);
    d.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(15524427726848L, 115666);
        e.a(e.this, paramString1, paramString2);
        GMTrace.o(15524427726848L, 115666);
      }
    });
    GMTrace.o(15513421873152L, 115584);
  }
  
  public final void jx(int paramInt)
  {
    GMTrace.i(18193884119040L, 135555);
    this.jsW = paramInt;
    aar();
    GMTrace.o(18193884119040L, 135555);
  }
  
  private final class a
    extends TextView
  {
    public a(Context paramContext)
    {
      super();
      GMTrace.i(15527917387776L, 115692);
      this$1 = new LinearLayout.LayoutParams(-1, -2);
      int i = a.fromDPToPix(getContext(), 5);
      e.this.setMargins(0, i, 0, i);
      setLayoutParams(e.this);
      setTextSize(1, 12.0F);
      setTextColor(-7171438);
      GMTrace.o(15527917387776L, 115692);
    }
  }
  
  private final class b
    extends TextView
  {
    private String mTitle;
    private String mValue;
    
    public b(Context paramContext)
    {
      super();
      GMTrace.i(15514227179520L, 115590);
      setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
      setTextSize(1, 12.0F);
      setTextColor(-419430401);
      GMTrace.o(15514227179520L, 115590);
    }
    
    private void update()
    {
      GMTrace.i(15514361397248L, 115591);
      setText(String.format("%s: %s", new Object[] { this.mTitle, this.mValue }));
      GMTrace.o(15514361397248L, 115591);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */