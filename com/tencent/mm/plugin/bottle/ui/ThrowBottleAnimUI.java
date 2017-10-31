package com.tencent.mm.plugin.bottle.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.widget.AbsoluteLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.bq.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

@SuppressLint({"HandlerLeak"})
public class ThrowBottleAnimUI
  extends FrameLayout
{
  int Qu;
  int Qv;
  BottleBeachUI kgS;
  private SprayLayout khW;
  private BottleImageView khX;
  private TextView khY;
  private AnimationSet khZ;
  private int kia;
  private int kib;
  private int kic;
  private int kid;
  int kie;
  a kif;
  boolean kig;
  private ae kih;
  
  public ThrowBottleAnimUI(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7640075730944L, 56923);
    this.kih = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(7628935659520L, 56840);
        super.handleMessage(paramAnonymousMessage);
        if ((ThrowBottleAnimUI.i(ThrowBottleAnimUI.this) == null) && (ThrowBottleAnimUI.a(ThrowBottleAnimUI.this) != null)) {
          ThrowBottleAnimUI.a(ThrowBottleAnimUI.this, (SprayLayout)ThrowBottleAnimUI.a(ThrowBottleAnimUI.this).findViewById(R.h.bng));
        }
        if (ThrowBottleAnimUI.i(ThrowBottleAnimUI.this) != null) {
          ThrowBottleAnimUI.i(ThrowBottleAnimUI.this).stop();
        }
        if (ThrowBottleAnimUI.m(ThrowBottleAnimUI.this) != null) {
          ThrowBottleAnimUI.m(ThrowBottleAnimUI.this).aho();
        }
        GMTrace.o(7628935659520L, 56840);
      }
    };
    this.kgS = ((BottleBeachUI)paramContext);
    MH();
    GMTrace.o(7640075730944L, 56923);
  }
  
  public ThrowBottleAnimUI(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(7640209948672L, 56924);
    this.kih = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(7628935659520L, 56840);
        super.handleMessage(paramAnonymousMessage);
        if ((ThrowBottleAnimUI.i(ThrowBottleAnimUI.this) == null) && (ThrowBottleAnimUI.a(ThrowBottleAnimUI.this) != null)) {
          ThrowBottleAnimUI.a(ThrowBottleAnimUI.this, (SprayLayout)ThrowBottleAnimUI.a(ThrowBottleAnimUI.this).findViewById(R.h.bng));
        }
        if (ThrowBottleAnimUI.i(ThrowBottleAnimUI.this) != null) {
          ThrowBottleAnimUI.i(ThrowBottleAnimUI.this).stop();
        }
        if (ThrowBottleAnimUI.m(ThrowBottleAnimUI.this) != null) {
          ThrowBottleAnimUI.m(ThrowBottleAnimUI.this).aho();
        }
        GMTrace.o(7628935659520L, 56840);
      }
    };
    this.kgS = ((BottleBeachUI)paramContext);
    MH();
    GMTrace.o(7640209948672L, 56924);
  }
  
  private void MH()
  {
    GMTrace.i(7640612601856L, 56927);
    inflate(this.kgS, R.i.cNF, this);
    this.khX = ((BottleImageView)findViewById(R.h.bnn));
    this.khY = ((TextView)findViewById(R.h.bnq));
    DisplayMetrics localDisplayMetrics = this.kgS.getResources().getDisplayMetrics();
    this.kic = localDisplayMetrics.widthPixels;
    this.kid = localDisplayMetrics.heightPixels;
    GMTrace.o(7640612601856L, 56927);
  }
  
  private int ahp()
  {
    GMTrace.i(7640746819584L, 56928);
    int i = Math.abs(getWidth());
    if (i <= 0)
    {
      i = this.kic;
      GMTrace.o(7640746819584L, 56928);
      return i;
    }
    GMTrace.o(7640746819584L, 56928);
    return i;
  }
  
  private int ahq()
  {
    GMTrace.i(7640881037312L, 56929);
    int i = Math.abs(getHeight());
    if (i <= 0)
    {
      i = this.kid;
      GMTrace.o(7640881037312L, 56929);
      return i;
    }
    GMTrace.o(7640881037312L, 56929);
    return i;
  }
  
  final void ahr()
  {
    GMTrace.i(7641015255040L, 56930);
    this.khX.setImageDrawable(null);
    int i = this.khX.getBackground().getIntrinsicWidth();
    int j = this.khX.getBackground().getIntrinsicHeight();
    this.khX.setVisibility(0);
    int k = BackwardSupportUtil.b.a(this.kgS, 40.0F);
    this.khX.setLayoutParams(new AbsoluteLayout.LayoutParams(-2, -2, ahp() - (i + k), ahq() - (j + k)));
    GMTrace.o(7641015255040L, 56930);
  }
  
  final void ahs()
  {
    GMTrace.i(7641149472768L, 56931);
    int j = this.khX.getBackground().getIntrinsicWidth();
    int k = this.khX.getBackground().getIntrinsicHeight();
    this.khX.setVisibility(0);
    int m = BackwardSupportUtil.b.a(this.kgS, 40.0F);
    Object localObject = this.kgS;
    int i;
    if (bg.bNV())
    {
      i = R.g.aWA;
      setBackgroundDrawable(a.b((Context)localObject, i));
      if (!this.kig) {
        break label296;
      }
      this.khX.setImageDrawable(a.b(this.kgS, R.g.aWI));
    }
    for (;;)
    {
      this.khX.setLayoutParams(new AbsoluteLayout.LayoutParams(-2, -2, 0, 0));
      localObject = this.khX;
      i = ahp();
      int n = this.kia;
      int i1 = j / 2;
      int i2 = ahq();
      int i3 = this.kib;
      int i4 = k / 2;
      Animation.AnimationListener local3 = new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          GMTrace.i(7624238039040L, 56805);
          ThrowBottleAnimUI.b(ThrowBottleAnimUI.this).setVisibility(8);
          if (ThrowBottleAnimUI.i(ThrowBottleAnimUI.this) == null) {
            ThrowBottleAnimUI.a(ThrowBottleAnimUI.this, (SprayLayout)ThrowBottleAnimUI.a(ThrowBottleAnimUI.this).findViewById(R.h.bng));
          }
          ThrowBottleAnimUI.i(ThrowBottleAnimUI.this).z(1, ThrowBottleAnimUI.j(ThrowBottleAnimUI.this), ThrowBottleAnimUI.k(ThrowBottleAnimUI.this));
          ThrowBottleAnimUI.l(ThrowBottleAnimUI.this).sendEmptyMessageDelayed(0, 2000L);
          GMTrace.o(7624238039040L, 56805);
        }
        
        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
          GMTrace.i(7624103821312L, 56804);
          GMTrace.o(7624103821312L, 56804);
        }
        
        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
          GMTrace.i(7623969603584L, 56803);
          GMTrace.o(7623969603584L, 56803);
        }
      };
      ((BottleImageView)localObject).Qu = (i - (j + m));
      ((BottleImageView)localObject).Qw = (n - i1);
      ((BottleImageView)localObject).Qv = (i2 - (m + k));
      ((BottleImageView)localObject).Qx = (i3 - i4);
      ((BottleImageView)localObject).kgk.setAnimationListener(local3);
      ((BottleImageView)localObject).kgk.setDuration(2000L);
      ((BottleImageView)localObject).kgk.setRepeatCount(0);
      ((BottleImageView)localObject).kgk.setStartOffset(500L);
      ((BottleImageView)localObject).kgk.setInterpolator(((BottleImageView)localObject).context, 17432582);
      ((BottleImageView)localObject).startAnimation(((BottleImageView)localObject).kgk);
      GMTrace.o(7641149472768L, 56931);
      return;
      i = R.g.aWB;
      break;
      label296:
      this.khX.setImageDrawable(a.b(this.kgS, R.g.aWH));
    }
  }
  
  final void aht()
  {
    GMTrace.i(7641283690496L, 56932);
    this.kia = (ahp() / 2);
    this.kib = (ahq() * 460 / 800);
    w.v("MicroMsg.ThrowBottleAnimView", "to (" + this.kia + "," + this.kib + ")  bottle (" + this.khX.getDrawable().getIntrinsicWidth() + "," + this.khX.getDrawable().getIntrinsicHeight() + ")");
    GMTrace.o(7641283690496L, 56932);
  }
  
  public boolean isInEditMode()
  {
    GMTrace.i(7640478384128L, 56926);
    GMTrace.o(7640478384128L, 56926);
    return false;
  }
  
  public final void release()
  {
    GMTrace.i(7640344166400L, 56925);
    this.kgS = null;
    this.khZ = null;
    this.khW = null;
    if (this.khX != null)
    {
      BottleImageView localBottleImageView = this.khX;
      localBottleImageView.context = null;
      localBottleImageView.kgk = null;
    }
    this.khX = null;
    this.kif = null;
    GMTrace.o(7640344166400L, 56925);
  }
  
  public static abstract interface a
  {
    public abstract void aho();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/ThrowBottleAnimUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */