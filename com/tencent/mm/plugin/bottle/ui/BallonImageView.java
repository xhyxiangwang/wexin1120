package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.a;

public class BallonImageView
  extends ImageView
{
  private Animation kfc;
  
  public BallonImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7610816266240L, 56705);
    this.kfc = new Animation()
    {
      private int kfd;
      private int kfe;
      private float kff;
      private float kfg;
      private float kfh;
      private float kfi;
      private float kfj;
      private float kfk;
      private float kfl;
      private float kfm;
      private float kfn;
      private float kfo;
      
      private void agZ()
      {
        GMTrace.i(7643833827328L, 56951);
        this.kfl = (this.kff * this.kfd);
        this.kfm = (this.kfg * this.kfd);
        this.kfn = (this.kfh * this.kfe);
        this.kfo = (this.kfi * this.kfe);
        GMTrace.o(7643833827328L, 56951);
      }
      
      private static float q(float paramAnonymousFloat1, float paramAnonymousFloat2)
      {
        GMTrace.i(7643968045056L, 56952);
        float f = (float)Math.random();
        GMTrace.o(7643968045056L, 56952);
        return f * (paramAnonymousFloat2 - paramAnonymousFloat1) + paramAnonymousFloat1;
      }
      
      protected final void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
      {
        GMTrace.i(7643565391872L, 56949);
        float f1 = this.kfl;
        float f2 = this.kfn;
        if (this.kfl != this.kfm) {
          f1 = this.kfl + (this.kfm - this.kfl) * paramAnonymousFloat;
        }
        if (this.kfn != this.kfo) {
          f2 = this.kfn + (this.kfo - this.kfn) * paramAnonymousFloat;
        }
        paramAnonymousTransformation.getMatrix().setTranslate(f1, f2);
        f1 = this.kfj + (this.kfk - this.kfj) * paramAnonymousFloat;
        paramAnonymousTransformation.getMatrix().postScale(f1, f1);
        if (paramAnonymousFloat == 1.0F)
        {
          this.kff = this.kfg;
          this.kfh = this.kfi;
          this.kfg = q(0.1F, 0.8F);
          this.kfi = q(0.1F, 0.3F);
          this.kfj = this.kfk;
          this.kfk = q(0.7F, 1.0F);
          agZ();
        }
        GMTrace.o(7643565391872L, 56949);
      }
      
      public final void initialize(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4)
      {
        GMTrace.i(7643699609600L, 56950);
        super.initialize(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4);
        this.kfd = paramAnonymousInt3;
        this.kfe = paramAnonymousInt4;
        agZ();
        GMTrace.o(7643699609600L, 56950);
      }
    };
    this.kfc.setRepeatCount(-1);
    this.kfc.setDuration(15000L);
    this.kfc.setFillAfter(true);
    GMTrace.o(7610816266240L, 56705);
  }
  
  public BallonImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(7610950483968L, 56706);
    this.kfc = new Animation()
    {
      private int kfd;
      private int kfe;
      private float kff;
      private float kfg;
      private float kfh;
      private float kfi;
      private float kfj;
      private float kfk;
      private float kfl;
      private float kfm;
      private float kfn;
      private float kfo;
      
      private void agZ()
      {
        GMTrace.i(7643833827328L, 56951);
        this.kfl = (this.kff * this.kfd);
        this.kfm = (this.kfg * this.kfd);
        this.kfn = (this.kfh * this.kfe);
        this.kfo = (this.kfi * this.kfe);
        GMTrace.o(7643833827328L, 56951);
      }
      
      private static float q(float paramAnonymousFloat1, float paramAnonymousFloat2)
      {
        GMTrace.i(7643968045056L, 56952);
        float f = (float)Math.random();
        GMTrace.o(7643968045056L, 56952);
        return f * (paramAnonymousFloat2 - paramAnonymousFloat1) + paramAnonymousFloat1;
      }
      
      protected final void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
      {
        GMTrace.i(7643565391872L, 56949);
        float f1 = this.kfl;
        float f2 = this.kfn;
        if (this.kfl != this.kfm) {
          f1 = this.kfl + (this.kfm - this.kfl) * paramAnonymousFloat;
        }
        if (this.kfn != this.kfo) {
          f2 = this.kfn + (this.kfo - this.kfn) * paramAnonymousFloat;
        }
        paramAnonymousTransformation.getMatrix().setTranslate(f1, f2);
        f1 = this.kfj + (this.kfk - this.kfj) * paramAnonymousFloat;
        paramAnonymousTransformation.getMatrix().postScale(f1, f1);
        if (paramAnonymousFloat == 1.0F)
        {
          this.kff = this.kfg;
          this.kfh = this.kfi;
          this.kfg = q(0.1F, 0.8F);
          this.kfi = q(0.1F, 0.3F);
          this.kfj = this.kfk;
          this.kfk = q(0.7F, 1.0F);
          agZ();
        }
        GMTrace.o(7643565391872L, 56949);
      }
      
      public final void initialize(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4)
      {
        GMTrace.i(7643699609600L, 56950);
        super.initialize(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4);
        this.kfd = paramAnonymousInt3;
        this.kfe = paramAnonymousInt4;
        agZ();
        GMTrace.o(7643699609600L, 56950);
      }
    };
    this.kfc.setRepeatCount(-1);
    this.kfc.setDuration(15000L);
    this.kfc.setFillAfter(true);
    GMTrace.o(7610950483968L, 56706);
  }
  
  public void setVisibility(int paramInt)
  {
    GMTrace.i(7611084701696L, 56707);
    if (paramInt == 0) {
      setAnimation(this.kfc);
    }
    for (;;)
    {
      super.setVisibility(paramInt);
      GMTrace.o(7611084701696L, 56707);
      return;
      BackwardSupportUtil.a.c(this, this.kfc);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/BallonImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */