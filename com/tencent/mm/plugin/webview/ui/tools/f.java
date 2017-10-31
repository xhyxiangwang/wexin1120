package com.tencent.mm.plugin.webview.ui.tools;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.MMWebView;

public final class f
  implements LogoWebViewWrapper.b
{
  static final int sqM;
  public boolean iHU;
  a sqI;
  ImageView sqJ;
  LogoWebViewWrapper sqK;
  int sqL;
  private boolean sqN;
  private boolean sqO;
  private int sqP;
  private float sqQ;
  private ValueAnimator sqR;
  public ViewPropertyAnimator sqS;
  private float sqT;
  private View sqU;
  View sqV;
  private TextView sqW;
  private boolean sqX;
  public boolean sqY;
  
  static
  {
    GMTrace.i(12126840160256L, 90352);
    sqM = R.g.bft;
    GMTrace.o(12126840160256L, 90352);
  }
  
  public f()
  {
    GMTrace.i(12125229547520L, 90340);
    this.sqL = 0;
    this.iHU = false;
    this.sqN = false;
    this.sqO = false;
    this.sqP = 0;
    this.sqQ = 0.0F;
    this.sqX = true;
    this.sqY = false;
    GMTrace.o(12125229547520L, 90340);
  }
  
  public final void O(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(12126034853888L, 90346);
    Object localObject;
    String str1;
    if (this.sqJ == null)
    {
      localObject = "null";
      if (this.sqJ != null) {
        break label112;
      }
      str1 = "null";
      label30:
      if (this.sqJ != null) {
        break label127;
      }
    }
    label112:
    label127:
    for (String str2 = "null";; str2 = String.valueOf(this.sqJ.getAlpha()))
    {
      w.v("MicroMsg.WebViewPullDownLogoDelegate", "onOverScrollOffset, offset = %d, pointerDown = %b, refreshImage.visibility = %s, refreshImage.drawable = %s, refreshImage.alpha = %s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean), localObject, str1, str2 });
      if (this.iHU) {
        break label142;
      }
      GMTrace.o(12126034853888L, 90346);
      return;
      localObject = String.valueOf(this.sqJ.getVisibility());
      break;
      str1 = this.sqJ.getDrawable().toString();
      break label30;
    }
    label142:
    if (paramInt == 0) {
      this.sqO = false;
    }
    if (this.sqJ == null)
    {
      GMTrace.o(12126034853888L, 90346);
      return;
    }
    if (!paramBoolean)
    {
      if ((Math.abs(paramInt) > this.sqL) && (!this.sqN))
      {
        w.d("MicroMsg.WebViewPullDownLogoDelegate", "startLoading()");
        startLoading();
        GMTrace.o(12126034853888L, 90346);
        return;
      }
      if (this.sqN) {
        GMTrace.o(12126034853888L, 90346);
      }
    }
    else
    {
      if (Math.abs(paramInt) < this.sqL) {
        break label476;
      }
      if (this.sqK != null) {
        this.sqK.spc = this.sqL;
      }
    }
    if ((this.sqJ != null) && (this.sqJ.getAlpha() < 1.0F) && (this.sqS == null) && (paramBoolean))
    {
      w.d("MicroMsg.WebViewPullDownLogoDelegate", "refreshImage alpha to 1.0f");
      this.sqS = this.sqJ.animate().alpha(1.0F).setDuration(500L);
      this.sqS.setListener(new AnimatorListenerAdapter()
      {
        public final void onAnimationCancel(Animator paramAnonymousAnimator)
        {
          GMTrace.i(12123484717056L, 90327);
          super.onAnimationCancel(paramAnonymousAnimator);
          f.this.sqS = null;
          GMTrace.o(12123484717056L, 90327);
        }
        
        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          GMTrace.i(12123618934784L, 90328);
          super.onAnimationEnd(paramAnonymousAnimator);
          f.this.sqS = null;
          GMTrace.o(12123618934784L, 90328);
        }
      });
      this.sqS.start();
    }
    int i;
    if (!this.sqO)
    {
      i = -paramInt - this.sqP;
      if (Math.abs(paramInt) < this.sqL) {
        break label494;
      }
      i *= 5;
    }
    for (;;)
    {
      this.sqP = (-paramInt);
      float f1 = this.sqJ.getHeight() / 2.0F;
      float f2 = this.sqJ.getWidth() / 2.0F;
      this.sqQ -= i;
      this.sqJ.setScaleType(ImageView.ScaleType.MATRIX);
      localObject = this.sqJ.getImageMatrix();
      ((Matrix)localObject).postRotate(-i, f2, f1);
      this.sqJ.setImageMatrix((Matrix)localObject);
      this.sqJ.setImageResource(sqM);
      this.sqJ.invalidate();
      GMTrace.o(12126034853888L, 90346);
      return;
      label476:
      if (this.sqK == null) {
        break;
      }
      this.sqK.spc = 0;
      break;
      label494:
      i *= 2;
    }
  }
  
  public final void a(MMWebView paramMMWebView)
  {
    GMTrace.i(16926331895808L, 126111);
    paramMMWebView.wUU = this.sqK;
    paramMMWebView.cgk();
    if (Build.VERSION.SDK_INT <= 10) {
      this.sqK.bBo().setBackgroundColor(this.sqK.getResources().getColor(R.e.aQQ));
    }
    LogoWebViewWrapper localLogoWebViewWrapper = this.sqK;
    localLogoWebViewWrapper.bBo();
    if (localLogoWebViewWrapper.soU != null)
    {
      localLogoWebViewWrapper.kEC = paramMMWebView;
      localLogoWebViewWrapper.soU.addView(localLogoWebViewWrapper.kEC);
    }
    boolean bool = paramMMWebView.isX5Kernel;
    if ((this.sqV != null) && (!bool))
    {
      ((ImageView)this.sqV.findViewById(R.h.cLM)).setVisibility(8);
      ((TextView)this.sqV.findViewById(R.h.bQb)).setText("");
    }
    if ((this.sqX) && (!this.sqY))
    {
      jp(false);
      if (this.sqV != null)
      {
        this.sqV.setVisibility(0);
        GMTrace.o(16926331895808L, 126111);
      }
    }
    else
    {
      jp(true);
    }
    GMTrace.o(16926331895808L, 126111);
  }
  
  public final void bBC()
  {
    GMTrace.i(12125363765248L, 90341);
    this.iHU = false;
    stopLoading();
    if ((this.sqX) && (this.sqV != null) && (!this.sqY))
    {
      jp(false);
      this.sqK.spc = 0;
      this.sqV.setVisibility(0);
    }
    GMTrace.o(12125363765248L, 90341);
  }
  
  public final void bBD()
  {
    GMTrace.i(16926466113536L, 126112);
    if (this.sqV != null) {
      this.sqV.setVisibility(8);
    }
    GMTrace.o(16926466113536L, 126112);
  }
  
  public final void cO(View paramView)
  {
    GMTrace.i(16926197678080L, 126110);
    this.sqK = ((LogoWebViewWrapper)paramView.findViewById(R.h.bVg));
    this.sqJ = ((ImageView)paramView.findViewById(R.h.cKX));
    this.sqU = paramView.findViewById(R.h.cKW);
    if (this.sqU != null)
    {
      this.sqV = this.sqU.findViewById(R.h.cLL);
      this.sqW = ((TextView)this.sqV.findViewById(R.h.cLN));
    }
    this.sqL = BackwardSupportUtil.b.a(this.sqK.getContext(), 72.0F);
    if (this.sqJ == null)
    {
      paramView = "null";
      if (this.sqK != null) {
        break label189;
      }
    }
    label189:
    for (String str = "null";; str = String.valueOf(this.sqK.getId()))
    {
      w.d("MicroMsg.WebViewPullDownLogoDelegate", "refreshImage.id = %s, logoWrapper.id = %s", new Object[] { paramView, str });
      w.d("MicroMsg.WebViewPullDownLogoDelegate", "LOADING_LOGO_HEIGHT = %d", new Object[] { Integer.valueOf(this.sqL) });
      GMTrace.o(16926197678080L, 126110);
      return;
      paramView = String.valueOf(this.sqJ.getId());
      break;
    }
  }
  
  public final float getStartLoadingStep()
  {
    GMTrace.i(12126169071616L, 90347);
    float f = this.sqT;
    GMTrace.o(12126169071616L, 90347);
    return f;
  }
  
  public final void jp(boolean paramBoolean)
  {
    GMTrace.i(12126437507072L, 90349);
    if ((this.sqK != null) && (this.sqK.spa != paramBoolean))
    {
      this.sqK.jp(paramBoolean);
      if (this.sqV != null) {
        this.sqV.setVisibility(8);
      }
      this.sqY = paramBoolean;
    }
    GMTrace.o(12126437507072L, 90349);
  }
  
  public final void qB(String paramString)
  {
    GMTrace.i(12126571724800L, 90350);
    if ((!this.sqX) || (this.sqY))
    {
      jp(true);
      if ((this.sqV != null) && (this.sqV.getVisibility() == 0)) {
        this.sqV.setVisibility(8);
      }
      GMTrace.o(12126571724800L, 90350);
      return;
    }
    if (this.sqW != null)
    {
      if (!bg.mZ(paramString))
      {
        paramString = Uri.parse(paramString).getHost();
        if (!bg.mZ(paramString))
        {
          paramString = this.sqW.getContext().getString(R.l.fbt, new Object[] { paramString });
          this.sqW.setVisibility(0);
          this.sqW.setText(paramString);
          jp(false);
          GMTrace.o(12126571724800L, 90350);
          return;
        }
      }
      this.sqW.setVisibility(8);
    }
    GMTrace.o(12126571724800L, 90350);
  }
  
  public final void release()
  {
    GMTrace.i(12125766418432L, 90344);
    if (this.sqK != null)
    {
      LogoWebViewWrapper localLogoWebViewWrapper = this.sqK;
      if (localLogoWebViewWrapper.soU != null)
      {
        localLogoWebViewWrapper.soU.removeView(localLogoWebViewWrapper.kEC);
        localLogoWebViewWrapper.kEC = null;
      }
      localLogoWebViewWrapper = this.sqK;
      localLogoWebViewWrapper.spe = null;
      localLogoWebViewWrapper.spd = null;
    }
    if (this.sqU != null) {
      ((ViewGroup)this.sqU).removeAllViews();
    }
    this.sqK = null;
    this.sqJ = null;
    this.sqP = 0;
    if (this.sqR != null)
    {
      this.sqR.cancel();
      this.sqR = null;
    }
    GMTrace.o(12125766418432L, 90344);
  }
  
  public final void setStartLoadingStep(float paramFloat)
  {
    float f2 = 0.0F;
    GMTrace.i(12126303289344L, 90348);
    this.sqT = paramFloat;
    this.sqJ.setScaleType(ImageView.ScaleType.MATRIX);
    Matrix localMatrix = this.sqJ.getImageMatrix();
    float f1;
    if (this.sqJ == null)
    {
      f1 = 0.0F;
      if (this.sqJ != null) {
        break label95;
      }
    }
    for (;;)
    {
      localMatrix.setRotate(paramFloat, f1, f2);
      this.sqQ = paramFloat;
      this.sqJ.invalidate();
      GMTrace.o(12126303289344L, 90348);
      return;
      f1 = this.sqJ.getWidth() / 2.0F;
      break;
      label95:
      f2 = this.sqJ.getHeight() / 2.0F;
    }
  }
  
  public final void startLoading()
  {
    GMTrace.i(12125497982976L, 90342);
    if (this.sqN)
    {
      GMTrace.o(12125497982976L, 90342);
      return;
    }
    if ((this.sqJ == null) || (this.sqK == null))
    {
      GMTrace.o(12125497982976L, 90342);
      return;
    }
    this.sqN = true;
    this.sqK.jp(true);
    this.sqJ.clearAnimation();
    if (this.sqR != null) {
      this.sqR.cancel();
    }
    this.sqR = ObjectAnimator.ofFloat(this, "startLoadingStep", new float[] { this.sqQ + 0.0F, this.sqQ + 354.0F });
    this.sqR.setDuration(960L);
    this.sqR.setRepeatMode(1);
    this.sqR.setRepeatCount(-1);
    this.sqR.setInterpolator(new LinearInterpolator());
    this.sqR.start();
    if (this.sqI != null) {
      this.sqI.bBE();
    }
    GMTrace.o(12125497982976L, 90342);
  }
  
  public final void stopLoading()
  {
    GMTrace.i(12125632200704L, 90343);
    if (!this.sqN)
    {
      GMTrace.o(12125632200704L, 90343);
      return;
    }
    w.d("MicroMsg.WebViewPullDownLogoDelegate", "stopLoading()");
    this.sqO = true;
    this.sqN = false;
    if ((this.sqK != null) && (this.iHU)) {
      this.sqK.jp(false);
    }
    if (this.sqR != null) {
      this.sqR.cancel();
    }
    if (this.sqK != null) {
      this.sqK.M(0, 250L);
    }
    if (this.sqJ != null)
    {
      w.d("MicroMsg.WebViewPullDownLogoDelegate", "refreshImage, alpha to 0f");
      this.sqJ.animate().alpha(0.0F).setDuration(500L).start();
    }
    GMTrace.o(12125632200704L, 90343);
  }
  
  public final void xv(int paramInt)
  {
    GMTrace.i(12125900636160L, 90345);
    if (this.sqU != null) {
      this.sqU.setBackgroundColor(paramInt);
    }
    GMTrace.o(12125900636160L, 90345);
  }
  
  public static abstract interface a
  {
    public abstract void bBE();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */