package com.tencent.mm.plugin.sns.ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;

public final class b
{
  public int LM;
  public int Uo;
  private int VC;
  public final Context context;
  private ae mHandler;
  private int qvO;
  public int qvP;
  public int qvQ;
  int qvR;
  int qvS;
  private float qvT;
  private float qvU;
  public float qvV;
  float qvW;
  public int qvX;
  public int qvY;
  public int qvZ;
  public int qwa;
  public int qwb;
  public int qwc;
  public int qwd;
  public int qwe;
  public int qwf;
  public int qwg;
  public int qwh;
  public int qwi;
  
  public b(Context paramContext)
  {
    GMTrace.i(8489808166912L, 63254);
    this.VC = 0;
    this.qvO = 0;
    this.Uo = 0;
    this.LM = 0;
    this.qvP = 0;
    this.qvQ = 0;
    this.qvR = 0;
    this.qvS = 0;
    this.qvT = 0.0F;
    this.qvU = 0.0F;
    this.qvV = 0.0F;
    this.qvW = 1.0F;
    this.qvX = 0;
    this.qvY = 0;
    this.qvZ = 0;
    this.qwa = 0;
    this.qwb = 0;
    this.qwc = 300;
    this.qwd = 0;
    this.qwe = 1;
    this.qwf = 2;
    this.qwg = 3;
    this.qwh = 4;
    this.qwi = this.qwd;
    this.mHandler = new ae();
    this.context = paramContext;
    GMTrace.o(8489808166912L, 63254);
  }
  
  @TargetApi(16)
  public final void a(final View paramView1, final LinkedList<View> paramLinkedList, View paramView2, final b paramb)
  {
    GMTrace.i(20054812917760L, 149420);
    if ((Build.VERSION.SDK_INT < 12) || (paramView1 == null) || (this.qwi == this.qwf) || (this.qwi == this.qwh) || (this.qwi == this.qwg))
    {
      GMTrace.o(20054812917760L, 149420);
      return;
    }
    k(paramView1, false);
    e.dH(this.context);
    paramView1.setPivotX(0.0F);
    paramView1.setPivotY(0.0F);
    paramView1.setScaleX(this.qvV);
    paramView1.setScaleY(this.qvV);
    paramView1.setTranslationX(this.qvR);
    paramView1.setTranslationY(this.qvS);
    if (paramView2 != null)
    {
      paramView2.setAlpha(0.0F);
      paramView2.animate().setDuration(this.qwc).setInterpolator(new DecelerateInterpolator(1.2F)).alpha(1.0F);
    }
    paramView2 = paramLinkedList.iterator();
    while (paramView2.hasNext()) {
      ((View)paramView2.next()).setAlpha(0.0F);
    }
    paramView1.animate().setDuration(this.qwc).setInterpolator(new DecelerateInterpolator(1.2F)).scaleX(1.0F).scaleY(1.0F).translationX(0.0F).translationY(0.0F).setListener(new Animator.AnimatorListener()
    {
      public final void onAnimationCancel(Animator paramAnonymousAnimator)
      {
        GMTrace.i(8717978304512L, 64954);
        b.this.qwi = b.this.qwg;
        GMTrace.o(8717978304512L, 64954);
      }
      
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        GMTrace.i(8717844086784L, 64953);
        if (paramb != null) {
          paramb.onAnimationEnd();
        }
        b.this.qwi = b.this.qwg;
        ((WindowManager)b.this.context.getSystemService("window")).getDefaultDisplay().getHeight();
        paramView1.setTranslationY(0.0F);
        paramAnonymousAnimator = paramLinkedList.iterator();
        while (paramAnonymousAnimator.hasNext())
        {
          View localView = (View)paramAnonymousAnimator.next();
          localView.setVisibility(0);
          localView.setTranslationY(100.0F);
          localView.setAlpha(0.0F);
          localView.animate().setDuration(b.this.qwc / 2).setInterpolator(new DecelerateInterpolator(1.2F)).translationY(0.0F).alpha(1.0F).setListener(new Animator.AnimatorListener()
          {
            public final void onAnimationCancel(Animator paramAnonymous2Animator)
            {
              GMTrace.i(8471420338176L, 63117);
              b.this.qwi = b.this.qwg;
              GMTrace.o(8471420338176L, 63117);
            }
            
            public final void onAnimationEnd(Animator paramAnonymous2Animator)
            {
              GMTrace.i(8471286120448L, 63116);
              if (b.1.this.qwj != null) {
                b.1.this.qwj.onAnimationEnd();
              }
              b.this.qwi = b.this.qwg;
              GMTrace.o(8471286120448L, 63116);
            }
            
            public final void onAnimationRepeat(Animator paramAnonymous2Animator)
            {
              GMTrace.i(8471554555904L, 63118);
              GMTrace.o(8471554555904L, 63118);
            }
            
            public final void onAnimationStart(Animator paramAnonymous2Animator)
            {
              GMTrace.i(8471151902720L, 63115);
              if (b.1.this.qwj != null) {
                b.1.this.qwj.onAnimationStart();
              }
              b.this.qwi = b.this.qwf;
              GMTrace.o(8471151902720L, 63115);
            }
          });
        }
        GMTrace.o(8717844086784L, 64953);
      }
      
      public final void onAnimationRepeat(Animator paramAnonymousAnimator)
      {
        GMTrace.i(8718112522240L, 64955);
        GMTrace.o(8718112522240L, 64955);
      }
      
      public final void onAnimationStart(Animator paramAnonymousAnimator)
      {
        GMTrace.i(8717709869056L, 64952);
        if (paramb != null) {
          paramb.onAnimationStart();
        }
        b.this.qwi = b.this.qwf;
        GMTrace.o(8717709869056L, 64952);
      }
    });
    this.mHandler.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8502156197888L, 63346);
        if (b.this.qwi == b.this.qwd)
        {
          w.i("MicroMsg.ImagePreviewAnimation", "dancy enter Animation not Start!");
          paramView1.requestLayout();
          Iterator localIterator = paramLinkedList.iterator();
          while (localIterator.hasNext()) {
            ((View)localIterator.next()).requestLayout();
          }
        }
        GMTrace.o(8502156197888L, 63346);
      }
    }, this.qwc);
    GMTrace.o(20054812917760L, 149420);
  }
  
  final void k(View paramView, boolean paramBoolean)
  {
    GMTrace.i(8490076602368L, 63256);
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    if ((this.VC == 0) && (this.qvO == 0))
    {
      this.VC = (paramView.getWidth() / 2);
      this.qvO = (paramView.getHeight() / 2);
    }
    this.qvR = (this.VC - arrayOfInt[0]);
    this.qvS = (this.qvO - arrayOfInt[1]);
    int j = paramView.getWidth();
    int i = paramView.getHeight();
    int k;
    if ((j == 0) || (i == 0))
    {
      i = this.qvP;
      k = this.qvQ;
      j = i;
    }
    for (;;)
    {
      if ((j != 0) && (k != 0))
      {
        this.qvT = (this.Uo / j);
        this.qvU = (this.LM / k);
      }
      if ((this.qvY != 0) || (this.qvZ != 0) || (this.qwa != 0) || (this.qwb != 0)) {}
      for (float f1 = 1.1F;; f1 = 1.0F)
      {
        if (paramBoolean)
        {
          if ((this.qvP != 0) && (this.qvQ != 0))
          {
            this.qvT = (this.Uo / this.qvP);
            this.qvU = (this.LM / this.qvQ);
          }
          f1 = 1.0F;
        }
        float f2;
        if (this.qvT > this.qvU)
        {
          this.qvV = (this.qvT * f1);
          this.qvS = ((int)(this.qvS - (k * this.qvV - this.LM * f1) / 2.0F));
          this.qvS = ((int)(this.qvS - this.LM * (f1 - 1.0F) / 2.0F - this.qvX * this.qvV / 2.0F));
          this.qvR = ((int)(this.qvR - this.Uo * (f1 - 1.0F) / 2.0F));
          if ((this.qvQ == 0) || (this.qvO >= (k - this.qvQ) / 2)) {
            break label567;
          }
          f2 = this.qvS;
        }
        for (this.qvS = ((int)((f1 - 1.0F) * this.LM / 2.0F + f2));; this.qvS = ((int)(this.qvS - (f1 - 1.0F) * this.LM / 2.0F))) {
          label567:
          do
          {
            if ((this.Uo == 0) && (this.LM == 0))
            {
              this.qvV = 0.5F;
              this.qvW = 0.0F;
              this.qvR = ((int)(this.qvR - j * this.qvV / 2.0F));
              this.qvS = ((int)(this.qvS - k * this.qvV / 2.0F - this.qvX * this.qvV / 2.0F));
            }
            GMTrace.o(8490076602368L, 63256);
            return;
            this.qvV = (this.qvU * f1);
            this.qvR = ((int)(this.qvR - (j * this.qvV - this.Uo * f1) / 2.0F));
            if ((this.qvQ == 0) || (this.qvQ >= k)) {
              break;
            }
            this.qvS = ((int)(this.qvS - (k * this.qvV - this.LM * f1) / 2.0F));
            break;
          } while ((this.qvQ == 0) || (this.qvO + this.LM <= (this.qvQ + k) / 2));
        }
      }
      k = i;
    }
  }
  
  public final void p(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(8489942384640L, 63255);
    this.VC = paramInt1;
    this.qvO = paramInt2;
    this.Uo = paramInt3;
    this.LM = paramInt4;
    GMTrace.o(8489942384640L, 63255);
  }
  
  @TargetApi(18)
  public static abstract interface a {}
  
  public static abstract interface b
  {
    public abstract void onAnimationEnd();
    
    public abstract void onAnimationStart();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */