package com.tencent.mm.plugin.webview.ui.tools;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.z;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.WebView;

public class LogoWebViewWrapper
  extends LinearLayout
{
  private Context context;
  private int hR;
  WebView kEC;
  private int lzW;
  FrameLayout soU;
  private boolean soV;
  private int soW;
  private int soX;
  private c soY;
  private int soZ;
  boolean spa;
  boolean spb;
  int spc;
  a spd;
  b spe;
  private boolean spf;
  private boolean spg;
  private boolean sph;
  private int spi;
  
  public LogoWebViewWrapper(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12287498780672L, 91549);
    this.soV = false;
    this.soZ = 0;
    this.spa = false;
    this.spb = false;
    this.spc = 0;
    this.spf = false;
    this.spg = false;
    this.sph = false;
    this.spi = -1;
    this.context = paramContext;
    init();
    GMTrace.o(12287498780672L, 91549);
  }
  
  @TargetApi(11)
  public LogoWebViewWrapper(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(12287632998400L, 91550);
    this.soV = false;
    this.soZ = 0;
    this.spa = false;
    this.spb = false;
    this.spc = 0;
    this.spf = false;
    this.spg = false;
    this.sph = false;
    this.spi = -1;
    this.context = paramContext;
    init();
    GMTrace.o(12287632998400L, 91550);
  }
  
  private void init()
  {
    GMTrace.i(12287767216128L, 91551);
    setOrientation(1);
    this.hR = ViewConfiguration.get(this.context).getScaledTouchSlop();
    GMTrace.o(12287767216128L, 91551);
  }
  
  public final void M(int paramInt, long paramLong)
  {
    GMTrace.i(12288706740224L, 91558);
    if (this.soY != null)
    {
      c localc = this.soY;
      localc.spn = false;
      localc.spj.removeCallbacks(localc);
    }
    int i = getScrollY();
    w.i("MicroMsg.LogoWebViewWrapper", "smoothScrollTo oldScrollValue = %s, newScrollValue = %s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt) });
    if (i != paramInt)
    {
      this.soY = new c(i, paramInt, paramLong);
      post(this.soY);
    }
    GMTrace.o(12288706740224L, 91558);
  }
  
  public final FrameLayout bBo()
  {
    GMTrace.i(12287901433856L, 91552);
    int j;
    int i;
    if (this.soU == null)
    {
      j = getChildCount();
      i = 0;
    }
    for (;;)
    {
      Object localObject;
      if (i < j)
      {
        localObject = getChildAt(i);
        if (((localObject instanceof FrameLayout)) && (((View)localObject).getId() == R.h.bVh)) {
          this.soU = ((FrameLayout)localObject);
        }
      }
      else
      {
        localObject = this.soU;
        GMTrace.o(12287901433856L, 91552);
        return (FrameLayout)localObject;
      }
      i += 1;
    }
  }
  
  public final void jp(boolean paramBoolean)
  {
    GMTrace.i(12288035651584L, 91553);
    this.spa = paramBoolean;
    if (this.spa)
    {
      this.soV = false;
      this.soZ = 0;
    }
    GMTrace.o(12288035651584L, 91553);
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(12288169869312L, 91554);
    if ((this.spa) && (!this.spf))
    {
      GMTrace.o(12288169869312L, 91554);
      return false;
    }
    int i = paramMotionEvent.getAction();
    if ((i == 3) || (i == 1))
    {
      this.soV = false;
      this.soZ = 0;
      this.spg = false;
      GMTrace.o(12288169869312L, 91554);
      return false;
    }
    if ((i == 2) && (this.soV))
    {
      GMTrace.o(12288169869312L, 91554);
      return true;
    }
    switch (i)
    {
    }
    for (;;)
    {
      boolean bool = this.soV;
      GMTrace.o(12288169869312L, 91554);
      return bool;
      if (this.kEC.isOverScrollStart())
      {
        this.soW = ((int)paramMotionEvent.getY());
        this.lzW = ((int)paramMotionEvent.getY());
        this.soX = ((int)paramMotionEvent.getX());
        this.soV = false;
        this.soZ = 0;
        this.spf = true;
        this.spg = true;
        continue;
        if (this.kEC.isOverScrollStart())
        {
          if (!this.spg)
          {
            this.soW = ((int)paramMotionEvent.getY());
            this.lzW = ((int)paramMotionEvent.getY());
            this.soX = ((int)paramMotionEvent.getX());
            this.soV = false;
            this.soZ = 0;
            this.spf = true;
            this.spg = true;
            bool = this.soV;
            GMTrace.o(12288169869312L, 91554);
            return bool;
          }
          i = (int)paramMotionEvent.getY();
          int j = (int)paramMotionEvent.getX();
          int k = i - this.soW;
          int m = this.soX;
          if ((Math.abs(k) > this.hR) && (Math.abs(k) > Math.abs(j - m)) && (k > 0))
          {
            this.soW = i;
            this.soX = j;
            if (this.soZ == 1)
            {
              this.soV = true;
              this.spg = false;
              w.i("MicroMsg.LogoWebViewWrapper", "Competitor wins in onTouchEvent");
              if (this.spd != null) {
                this.spd.bBp();
              }
            }
            else
            {
              this.soZ += 1;
            }
          }
        }
      }
    }
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(12288304087040L, 91555);
    if ((this.spa) && (!this.spf))
    {
      GMTrace.o(12288304087040L, 91555);
      return false;
    }
    if ((paramMotionEvent.getAction() == 0) && (paramMotionEvent.getEdgeFlags() != 0))
    {
      GMTrace.o(12288304087040L, 91555);
      return false;
    }
    switch (paramMotionEvent.getAction())
    {
    }
    do
    {
      do
      {
        do
        {
          GMTrace.o(12288304087040L, 91555);
          return false;
          this.spf = true;
        } while (!this.kEC.isOverScrollStart());
        this.soW = ((int)paramMotionEvent.getY());
        this.lzW = ((int)paramMotionEvent.getY());
        this.soX = ((int)paramMotionEvent.getX());
        this.sph = true;
        GMTrace.o(12288304087040L, 91555);
        return true;
      } while (!this.soV);
      if (!this.sph)
      {
        this.soW = ((int)paramMotionEvent.getY());
        this.lzW = ((int)paramMotionEvent.getY());
        this.soX = ((int)paramMotionEvent.getX());
        this.sph = true;
        GMTrace.o(12288304087040L, 91555);
        return true;
      }
      this.soW = ((int)paramMotionEvent.getY());
      this.soX = ((int)paramMotionEvent.getX());
      int j = Math.min(this.lzW - this.soW, 0) >> 1;
      int k = getHeight();
      if (this.spi < 0) {
        this.spi = ((int)TypedValue.applyDimension(1, 60.0F, this.context.getResources().getDisplayMetrics()));
      }
      i = (int)Math.sqrt((this.spi >> 1) * Math.abs(j)) << 1;
      if (i > Math.abs(j))
      {
        i = j;
        if (Math.abs(j) <= k) {}
      }
      for (i = -k;; i = -i)
      {
        xq(i);
        if (this.spe != null) {
          this.spe.O(i, true);
        }
        GMTrace.o(12288304087040L, 91555);
        return true;
      }
      this.sph = false;
    } while ((!this.soV) && (!this.spf));
    this.soV = false;
    int i = -this.spc;
    long l1 = Math.abs(getScrollY());
    long l2 = Math.abs(l1 - Math.abs(this.spc));
    if (l2 >= l1) {}
    for (l1 = 300L;; l1 = ((float)l2 / (float)l1 * 300.0F))
    {
      M(i, l1);
      post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12127108595712L, 90354);
          LogoWebViewWrapper.a(LogoWebViewWrapper.this);
          GMTrace.o(12127108595712L, 90354);
        }
      });
      GMTrace.o(12288304087040L, 91555);
      return true;
    }
  }
  
  public final void xq(int paramInt)
  {
    GMTrace.i(12288572522496L, 91557);
    int i = getHeight();
    scrollTo(0, Math.min(i, Math.max(-i, paramInt)));
    GMTrace.o(12288572522496L, 91557);
  }
  
  public static abstract interface a
  {
    public abstract void bBp();
  }
  
  public static abstract interface b
  {
    public abstract void O(int paramInt, boolean paramBoolean);
  }
  
  final class c
    implements Runnable
  {
    private final long duration;
    private final Interpolator spk;
    private final int spl;
    private final int spm;
    boolean spn;
    private int spo;
    private long startTime;
    
    public c(int paramInt1, int paramInt2, long paramLong)
    {
      GMTrace.i(12322395389952L, 91809);
      this.spn = true;
      this.startTime = -1L;
      this.spo = -1;
      this.spm = paramInt1;
      this.spl = paramInt2;
      if (LogoWebViewWrapper.b(LogoWebViewWrapper.this)) {}
      for (this$1 = new AccelerateInterpolator();; this$1 = new DecelerateInterpolator())
      {
        this.spk = LogoWebViewWrapper.this;
        this.duration = paramLong;
        GMTrace.o(12322395389952L, 91809);
        return;
      }
    }
    
    public final void run()
    {
      GMTrace.i(12322529607680L, 91810);
      if (this.startTime == -1L) {
        this.startTime = System.currentTimeMillis();
      }
      for (;;)
      {
        if ((this.spn) && (this.spl != this.spo)) {
          z.a(LogoWebViewWrapper.this, this);
        }
        GMTrace.o(12322529607680L, 91810);
        return;
        long l = 500L;
        if (this.duration > 0L) {
          l = Math.max(Math.min((System.currentTimeMillis() - this.startTime) * 1000L / this.duration, 1000L), 0L);
        }
        float f = this.spm - this.spl;
        int i = Math.round(this.spk.getInterpolation((float)l / 1000.0F) * f);
        this.spo = (this.spm - i);
        LogoWebViewWrapper.this.xq(this.spo);
        if (LogoWebViewWrapper.c(LogoWebViewWrapper.this) != null) {
          LogoWebViewWrapper.c(LogoWebViewWrapper.this).O(this.spo, false);
        }
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/LogoWebViewWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */