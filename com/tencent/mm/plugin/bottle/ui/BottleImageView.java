package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;

public class BottleImageView
  extends ImageView
{
  int Qu;
  int Qv;
  int Qw;
  int Qx;
  Context context;
  private int kgi;
  private int kgj;
  Animation kgk;
  
  public BottleImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7651484237824L, 57008);
    this.kgk = new Animation()
    {
      private float kff;
      private float kfg;
      private float kfh;
      private float kfi;
      private float kfj;
      private float kfk;
      private float kgl;
      private float kgm;
      private float kgn;
      private float kgo;
      private float kgp;
      private boolean kgq;
      private float kgr;
      private float kgs;
      private float kgt;
      private float kgu;
      
      protected final void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
      {
        GMTrace.i(7645310222336L, 56962);
        if (this.kff == -1.0F)
        {
          this.kff = BottleImageView.c(BottleImageView.this);
          this.kfg = BottleImageView.d(BottleImageView.this);
          this.kfh = BottleImageView.e(BottleImageView.this);
          this.kfi = BottleImageView.f(BottleImageView.this);
          this.kgl = (this.kff + (this.kfg - this.kff) / 5.0F);
          this.kgm = (this.kff + (this.kfg - this.kff) * 3.0F / 5.0F);
          this.kgn = ((this.kgl - this.kff) / (this.kfg - this.kff) * (this.kfi - this.kfh) + this.kfh - BackwardSupportUtil.b.a(BottleImageView.g(BottleImageView.this), 67.0F));
          this.kgo = ((this.kgm - this.kff) / (this.kfg - this.kff) * (this.kfi - this.kfh) + this.kfh - BackwardSupportUtil.b.a(BottleImageView.g(BottleImageView.this), 53.0F));
        }
        paramAnonymousTransformation.setAlpha(this.kgt + (this.kgu - this.kgt) * paramAnonymousFloat);
        float f1 = this.kfj + (this.kfk - this.kfj) * paramAnonymousFloat;
        paramAnonymousTransformation.getMatrix().setScale(f1, f1, BottleImageView.a(BottleImageView.this) / 2, BottleImageView.b(BottleImageView.this) / 2);
        f1 = this.kgr;
        float f2 = this.kgs;
        float f3 = this.kgr;
        paramAnonymousTransformation.getMatrix().postRotate(f1 + (f2 - f3) * paramAnonymousFloat, BottleImageView.a(BottleImageView.this) / 2, BottleImageView.b(BottleImageView.this) / 2);
        f1 = this.kff;
        f2 = (this.kfg - this.kff) * paramAnonymousFloat + f1;
        if (f2 >= this.kgl) {
          f1 = (f2 - this.kff) / (this.kgl - this.kff) * (this.kgn - this.kfh) + this.kfh;
        }
        for (;;)
        {
          this.kgp = f1;
          paramAnonymousTransformation.getMatrix().postTranslate(f2, f1);
          if (paramAnonymousFloat == 1.0F)
          {
            this.kff = -1.0F;
            this.kfg = -1.0F;
            this.kfh = -1.0F;
            this.kfi = -1.0F;
            this.kgq = false;
          }
          GMTrace.o(7645310222336L, 56962);
          return;
          if (f2 >= this.kgm)
          {
            if (!this.kgq)
            {
              this.kgq = true;
              this.kgn = this.kgp;
            }
            f1 = (f2 - this.kgl) / (this.kgm - this.kgl) * (this.kgo - this.kgn) + this.kgn;
          }
          else
          {
            f1 = (f2 - this.kgm) / (this.kfg - this.kgm) * (this.kfi - this.kgo) + this.kgo;
          }
        }
      }
    };
    this.context = paramContext;
    ahc();
    GMTrace.o(7651484237824L, 57008);
  }
  
  public BottleImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(7651350020096L, 57007);
    this.kgk = new Animation()
    {
      private float kff;
      private float kfg;
      private float kfh;
      private float kfi;
      private float kfj;
      private float kfk;
      private float kgl;
      private float kgm;
      private float kgn;
      private float kgo;
      private float kgp;
      private boolean kgq;
      private float kgr;
      private float kgs;
      private float kgt;
      private float kgu;
      
      protected final void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
      {
        GMTrace.i(7645310222336L, 56962);
        if (this.kff == -1.0F)
        {
          this.kff = BottleImageView.c(BottleImageView.this);
          this.kfg = BottleImageView.d(BottleImageView.this);
          this.kfh = BottleImageView.e(BottleImageView.this);
          this.kfi = BottleImageView.f(BottleImageView.this);
          this.kgl = (this.kff + (this.kfg - this.kff) / 5.0F);
          this.kgm = (this.kff + (this.kfg - this.kff) * 3.0F / 5.0F);
          this.kgn = ((this.kgl - this.kff) / (this.kfg - this.kff) * (this.kfi - this.kfh) + this.kfh - BackwardSupportUtil.b.a(BottleImageView.g(BottleImageView.this), 67.0F));
          this.kgo = ((this.kgm - this.kff) / (this.kfg - this.kff) * (this.kfi - this.kfh) + this.kfh - BackwardSupportUtil.b.a(BottleImageView.g(BottleImageView.this), 53.0F));
        }
        paramAnonymousTransformation.setAlpha(this.kgt + (this.kgu - this.kgt) * paramAnonymousFloat);
        float f1 = this.kfj + (this.kfk - this.kfj) * paramAnonymousFloat;
        paramAnonymousTransformation.getMatrix().setScale(f1, f1, BottleImageView.a(BottleImageView.this) / 2, BottleImageView.b(BottleImageView.this) / 2);
        f1 = this.kgr;
        float f2 = this.kgs;
        float f3 = this.kgr;
        paramAnonymousTransformation.getMatrix().postRotate(f1 + (f2 - f3) * paramAnonymousFloat, BottleImageView.a(BottleImageView.this) / 2, BottleImageView.b(BottleImageView.this) / 2);
        f1 = this.kff;
        f2 = (this.kfg - this.kff) * paramAnonymousFloat + f1;
        if (f2 >= this.kgl) {
          f1 = (f2 - this.kff) / (this.kgl - this.kff) * (this.kgn - this.kfh) + this.kfh;
        }
        for (;;)
        {
          this.kgp = f1;
          paramAnonymousTransformation.getMatrix().postTranslate(f2, f1);
          if (paramAnonymousFloat == 1.0F)
          {
            this.kff = -1.0F;
            this.kfg = -1.0F;
            this.kfh = -1.0F;
            this.kfi = -1.0F;
            this.kgq = false;
          }
          GMTrace.o(7645310222336L, 56962);
          return;
          if (f2 >= this.kgm)
          {
            if (!this.kgq)
            {
              this.kgq = true;
              this.kgn = this.kgp;
            }
            f1 = (f2 - this.kgl) / (this.kgm - this.kgl) * (this.kgo - this.kgn) + this.kgn;
          }
          else
          {
            f1 = (f2 - this.kgm) / (this.kfg - this.kgm) * (this.kfi - this.kgo) + this.kgo;
          }
        }
      }
    };
    this.context = paramContext;
    ahc();
    GMTrace.o(7651350020096L, 57007);
  }
  
  private void ahc()
  {
    GMTrace.i(7651618455552L, 57009);
    Drawable localDrawable = getBackground();
    if (localDrawable != null)
    {
      this.kgi = localDrawable.getIntrinsicWidth();
      this.kgj = localDrawable.getIntrinsicHeight();
    }
    GMTrace.o(7651618455552L, 57009);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/BottleImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */