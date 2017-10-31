package com.tencent.mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.e;
import com.tencent.mm.plugin.appbrand.p.f;

public final class d
  extends FrameLayout
  implements i<int[]>
{
  private boolean Tl;
  private boolean Tm;
  private final Drawable jHr;
  public LinearLayout jHs;
  private g jHt;
  public final YANumberPicker.a jHu;
  
  @android.support.a.a
  public d(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(17650973409280L, 131510);
    this.jHu = new YANumberPicker.a()
    {
      public final void a(YANumberPicker paramAnonymousYANumberPicker, int paramAnonymousInt)
      {
        GMTrace.i(17649094361088L, 131496);
        if (d.a(d.this) != null)
        {
          int i = ((Integer)paramAnonymousYANumberPicker.getTag(p.f.itn)).intValue();
          paramAnonymousYANumberPicker = d.a(d.this);
          if (paramAnonymousYANumberPicker.jHH != null) {
            paramAnonymousYANumberPicker.jHH.aN(new int[] { i, paramAnonymousInt });
          }
        }
        GMTrace.o(17649094361088L, 131496);
      }
    };
    this.jHr = paramContext.getResources().getDrawable(p.e.isB);
    this.jHs = new LinearLayout(paramContext);
    this.jHs.setPadding(com.tencent.mm.bq.a.fromDPToPix(paramContext, 2), 0, com.tencent.mm.bq.a.fromDPToPix(paramContext, 2), 0);
    this.jHs.setOrientation(0);
    addView(this.jHs, new FrameLayout.LayoutParams(-1, -1, 17));
    this.jHs.setDividerDrawable(this.jHr);
    this.jHs.setShowDividers(2);
    GMTrace.o(17650973409280L, 131510);
  }
  
  public final void S(boolean paramBoolean)
  {
    GMTrace.i(17286438060032L, 128794);
    if (this.Tm != paramBoolean)
    {
      this.Tm = paramBoolean;
      if (paramBoolean)
      {
        long l = SystemClock.uptimeMillis();
        onTouchEvent(MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0));
        GMTrace.o(17286438060032L, 128794);
        return;
      }
      if (this.Tl) {
        requestLayout();
      }
    }
    GMTrace.o(17286438060032L, 128794);
  }
  
  public final void a(g paramg)
  {
    GMTrace.i(17651241844736L, 131512);
    this.jHt = paramg;
    GMTrace.o(17651241844736L, 131512);
  }
  
  public final void adf()
  {
    GMTrace.i(17651376062464L, 131513);
    int j = adi();
    int i = 0;
    while (i < j)
    {
      f localf = kf(i);
      if (localf != null) {
        localf.ads();
      }
      i += 1;
    }
    GMTrace.o(17651376062464L, 131513);
  }
  
  public final void adg()
  {
    GMTrace.i(17651644497920L, 131515);
    this.jHt = null;
    GMTrace.o(17651644497920L, 131515);
  }
  
  public final int adi()
  {
    GMTrace.i(17287109148672L, 128799);
    if (this.jHs == null)
    {
      GMTrace.o(17287109148672L, 128799);
      return 0;
    }
    int i = this.jHs.getChildCount();
    GMTrace.o(17287109148672L, 128799);
    return i;
  }
  
  public final void b(g paramg)
  {
    GMTrace.i(17651510280192L, 131514);
    this.jHt = paramg;
    GMTrace.o(17651510280192L, 131514);
  }
  
  public final View getView()
  {
    GMTrace.i(17287377584128L, 128801);
    GMTrace.o(17287377584128L, 128801);
    return this;
  }
  
  public final f kf(int paramInt)
  {
    GMTrace.i(17651107627008L, 131511);
    if (paramInt < 0)
    {
      GMTrace.o(17651107627008L, 131511);
      return null;
    }
    if (this.jHs == null)
    {
      GMTrace.o(17651107627008L, 131511);
      return null;
    }
    f localf = (f)this.jHs.getChildAt(paramInt);
    GMTrace.o(17651107627008L, 131511);
    return localf;
  }
  
  public final void kg(int paramInt)
  {
    GMTrace.i(17287243366400L, 128800);
    if (paramInt <= 0)
    {
      GMTrace.o(17287243366400L, 128800);
      return;
    }
    int i = adi() - 1;
    while (paramInt > 0)
    {
      this.jHs.removeViewAt(i);
      i -= 1;
      paramInt -= 1;
    }
    GMTrace.o(17287243366400L, 128800);
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(17286706495488L, 128796);
    if (this.Tm)
    {
      GMTrace.o(17286706495488L, 128796);
      return false;
    }
    boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
    GMTrace.o(17286706495488L, 128796);
    return bool;
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(17286840713216L, 128797);
    if (this.Tm)
    {
      GMTrace.o(17286840713216L, 128797);
      return false;
    }
    boolean bool = super.onTouchEvent(paramMotionEvent);
    GMTrace.o(17286840713216L, 128797);
    return bool;
  }
  
  public final void requestLayout()
  {
    GMTrace.i(17286572277760L, 128795);
    if (this.Tm)
    {
      this.Tl = true;
      GMTrace.o(17286572277760L, 128795);
      return;
    }
    super.requestLayout();
    GMTrace.o(17286572277760L, 128795);
  }
  
  public static final class a
  {
    public final String[] jHw;
    public final int jHx;
    
    public a(String[] paramArrayOfString, int paramInt)
    {
      GMTrace.i(17285364318208L, 128786);
      this.jHw = paramArrayOfString;
      this.jHx = Math.max(0, Math.min(paramInt, paramArrayOfString.length - 1));
      GMTrace.o(17285364318208L, 128786);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/picker/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */