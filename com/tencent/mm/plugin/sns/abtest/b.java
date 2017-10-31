package com.tencent.mm.plugin.sns.abtest;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.AbsoluteLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;

public final class b
{
  int LW;
  int jsW;
  int mScreenHeight;
  NotInterestMenu.c pVd;
  public NotInterestMenu pVi;
  ViewGroup pVj;
  NotInterestMenu.b pVk;
  Animation pVl;
  Animation pVm;
  private Animation pVn;
  private Animation pVo;
  int pVp;
  int pVq;
  int pVr;
  int pVs;
  int pVt;
  public boolean pVu;
  AbsoluteLayout pVv;
  public boolean pVw;
  boolean pVx;
  
  public b(ViewGroup paramViewGroup)
  {
    GMTrace.i(8875147264000L, 66125);
    this.pVk = new NotInterestMenu.b()
    {
      public final void bfM()
      {
        GMTrace.i(8878771142656L, 66152);
        b.this.bfN();
        GMTrace.o(8878771142656L, 66152);
      }
    };
    this.pVl = null;
    this.pVm = null;
    this.pVn = null;
    this.pVo = null;
    this.jsW = 0;
    this.LW = 0;
    this.pVp = 0;
    this.pVq = 0;
    this.pVr = 0;
    this.mScreenHeight = 0;
    this.pVs = 0;
    this.pVt = 0;
    this.pVu = false;
    this.pVv = null;
    this.pVw = false;
    this.pVx = false;
    this.pVj = paramViewGroup;
    this.pVl = AnimationUtils.loadAnimation(ab.getContext(), i.a.pGd);
    this.pVl.setFillAfter(true);
    this.pVl.setDuration(100L);
    this.pVl.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8873670868992L, 66114);
        if (b.this.pVi != null) {
          b.this.pVi.setVisibility(0);
        }
        b.this.pVw = false;
        b.this.pVu = true;
        GMTrace.o(8873670868992L, 66114);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8873805086720L, 66115);
        GMTrace.o(8873805086720L, 66115);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8873536651264L, 66113);
        b.this.pVw = true;
        GMTrace.o(8873536651264L, 66113);
      }
    });
    this.pVm = AnimationUtils.loadAnimation(ab.getContext(), i.a.pGg);
    this.pVm.setFillAfter(true);
    this.pVm.setDuration(100L);
    this.pVm.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8879173795840L, 66155);
        if (b.this.pVi != null) {
          b.this.pVi.setVisibility(0);
        }
        b.this.pVw = false;
        b.this.pVu = true;
        GMTrace.o(8879173795840L, 66155);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8879308013568L, 66156);
        GMTrace.o(8879308013568L, 66156);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8879039578112L, 66154);
        b.this.pVw = true;
        GMTrace.o(8879039578112L, 66154);
      }
    });
    this.pVn = AnimationUtils.loadAnimation(ab.getContext(), i.a.pGe);
    this.pVn.setFillAfter(true);
    this.pVn.setDuration(100L);
    this.pVn.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8879979102208L, 66161);
        af.u(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8879576449024L, 66158);
            b.this.bfN();
            GMTrace.o(8879576449024L, 66158);
          }
        });
        b.this.pVw = false;
        GMTrace.o(8879979102208L, 66161);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8880113319936L, 66162);
        GMTrace.o(8880113319936L, 66162);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8879844884480L, 66160);
        b.this.pVw = true;
        GMTrace.o(8879844884480L, 66160);
      }
    });
    this.pVo = AnimationUtils.loadAnimation(ab.getContext(), i.a.pGf);
    this.pVo.setFillAfter(true);
    this.pVo.setDuration(100L);
    this.pVo.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8870852296704L, 66093);
        af.u(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8877965836288L, 66146);
            b.this.bfN();
            GMTrace.o(8877965836288L, 66146);
          }
        });
        b.this.pVw = false;
        GMTrace.o(8870852296704L, 66093);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8870986514432L, 66094);
        GMTrace.o(8870986514432L, 66094);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8870718078976L, 66092);
        b.this.pVw = true;
        GMTrace.o(8870718078976L, 66092);
      }
    });
    GMTrace.o(8875147264000L, 66125);
  }
  
  public final void bfN()
  {
    GMTrace.i(8875281481728L, 66126);
    if ((this.pVv != null) && (this.pVj != null) && (this.pVi != null))
    {
      this.pVv.removeView(this.pVi);
      this.pVj.removeView(this.pVv);
      this.pVv = null;
      this.pVi = null;
      this.pVu = false;
    }
    GMTrace.o(8875281481728L, 66126);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/abtest/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */