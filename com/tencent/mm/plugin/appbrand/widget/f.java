package com.tencent.mm.plugin.appbrand.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.f;
import com.tencent.mm.plugin.appbrand.p.g;
import com.tencent.mm.sdk.platformtools.ae;
import java.util.concurrent.TimeUnit;

public final class f
  extends FrameLayout
  implements View.OnClickListener
{
  private static final long jzq;
  public TextView jzc;
  public int jzp;
  private final Runnable jzr;
  private ImageView jzs;
  public ViewPropertyAnimator jzt;
  private ViewPropertyAnimator jzu;
  private final ae mHandler;
  
  static
  {
    GMTrace.i(17277177036800L, 128725);
    jzq = TimeUnit.SECONDS.toMillis(4L);
    GMTrace.o(17277177036800L, 128725);
  }
  
  public f(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(17275969077248L, 128716);
    this.jzp = a.jzx;
    this.jzr = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18246094815232L, 135944);
        f.this.dismiss();
        GMTrace.o(18246094815232L, 135944);
      }
    };
    this.mHandler = new ae(Looper.getMainLooper());
    LayoutInflater.from(paramContext).inflate(p.g.ivk, this);
    setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    paramContext = (ImageView)findViewById(p.f.itC);
    this.jzs = paramContext;
    paramContext.setOnClickListener(this);
    this.jzc = ((TextView)findViewById(p.f.message));
    setOnClickListener(this);
    GMTrace.o(17275969077248L, 128716);
  }
  
  public final void dismiss()
  {
    GMTrace.i(17276103294976L, 128717);
    if ((getTranslationY() == -getHeight()) || (this.jzu != null))
    {
      GMTrace.o(17276103294976L, 128717);
      return;
    }
    this.jzp = a.jzw;
    this.mHandler.removeCallbacks(this.jzr);
    this.jzu = animate().translationY(-getHeight());
    this.jzu.setListener(new AnimatorListenerAdapter()
    {
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        GMTrace.i(17274626899968L, 128706);
        f.d(f.this);
        f.this.setVisibility(8);
        f.a(f.this, f.a.jzx);
        GMTrace.o(17274626899968L, 128706);
      }
    });
    this.jzu.start();
    GMTrace.o(17276103294976L, 128717);
  }
  
  protected final void onAttachedToWindow()
  {
    GMTrace.i(17633256669184L, 131378);
    super.onAttachedToWindow();
    if (a.jzx == this.jzp) {
      post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18247168557056L, 135952);
          f.this.setTranslationY(-f.this.getHeight());
          f.e(f.this);
          f.this.setVisibility(8);
          GMTrace.o(18247168557056L, 135952);
        }
      });
    }
    GMTrace.o(17633256669184L, 131378);
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(17276237512704L, 128718);
    if (paramView.getId() == p.f.itC) {
      dismiss();
    }
    GMTrace.o(17276237512704L, 128718);
  }
  
  protected final void onDetachedFromWindow()
  {
    GMTrace.i(17633390886912L, 131379);
    super.onDetachedFromWindow();
    if (a.jzw == this.jzp)
    {
      setTranslationY(-getHeight());
      setVisibility(8);
      this.jzp = a.jzx;
    }
    GMTrace.o(17633390886912L, 131379);
  }
  
  private static enum a
  {
    static
    {
      GMTrace.i(17632048709632L, 131369);
      jzw = 1;
      jzx = 2;
      jzy = 3;
      jzz = 4;
      jzA = new int[] { jzw, jzx, jzy, jzz };
      GMTrace.o(17632048709632L, 131369);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */