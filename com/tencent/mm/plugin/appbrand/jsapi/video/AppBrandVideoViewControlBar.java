package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.d;
import com.tencent.mm.plugin.appbrand.p.f;
import com.tencent.mm.plugin.appbrand.p.g;
import com.tencent.mm.plugin.appbrand.p.h;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;

public class AppBrandVideoViewControlBar
  extends VideoPlayerSeekBar
{
  private static int jcR;
  ImageView jcG;
  ImageView jcH;
  private RelativeLayout jcI;
  private ImageView jcJ;
  private TextView jcK;
  private FrameLayout jcL;
  b jcM;
  aj jcN;
  aj jcO;
  boolean jcP;
  boolean jcQ;
  
  static
  {
    GMTrace.i(17379048292352L, 129484);
    jcR = -1;
    GMTrace.o(17379048292352L, 129484);
  }
  
  public AppBrandVideoViewControlBar(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(17376766590976L, 129467);
    GMTrace.o(17376766590976L, 129467);
  }
  
  public AppBrandVideoViewControlBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(17376900808704L, 129468);
    GMTrace.o(17376900808704L, 129468);
  }
  
  public AppBrandVideoViewControlBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(17377035026432L, 129469);
    GMTrace.o(17377035026432L, 129469);
  }
  
  private void Xj()
  {
    GMTrace.i(17377571897344L, 129473);
    if (!this.jcP)
    {
      if (this.fBB)
      {
        this.pCb.setImageResource(p.h.iwc);
        GMTrace.o(17377571897344L, 129473);
        return;
      }
      this.pCb.setImageResource(p.h.iwb);
      GMTrace.o(17377571897344L, 129473);
      return;
    }
    if (this.fBB)
    {
      this.pCb.setImageResource(p.h.ivZ);
      GMTrace.o(17377571897344L, 129473);
      return;
    }
    this.pCb.setImageResource(p.h.ivY);
    GMTrace.o(17377571897344L, 129473);
  }
  
  public final void Xi()
  {
    GMTrace.i(17378108768256L, 129477);
    this.jcP = false;
    Xn();
    GMTrace.o(17378108768256L, 129477);
  }
  
  final void Xk()
  {
    GMTrace.i(17377706115072L, 129474);
    if (!this.jcP)
    {
      if (this.jcQ)
      {
        this.jcH.setImageResource(p.h.ivU);
        GMTrace.o(17377706115072L, 129474);
        return;
      }
      this.jcH.setImageResource(p.h.ivT);
      GMTrace.o(17377706115072L, 129474);
      return;
    }
    if (this.jcQ)
    {
      this.jcH.setImageResource(p.h.ivW);
      GMTrace.o(17377706115072L, 129474);
      return;
    }
    this.jcH.setImageResource(p.h.ivV);
    GMTrace.o(17377706115072L, 129474);
  }
  
  public final void Xl()
  {
    GMTrace.i(17377840332800L, 129475);
    setVisibility(0);
    if (this.jcN == null) {
      this.jcN = new aj(new aj.a()
      {
        public final boolean pO()
        {
          GMTrace.i(17356365496320L, 129315);
          AppBrandVideoViewControlBar.this.setVisibility(8);
          AppBrandVideoViewControlBar.c(AppBrandVideoViewControlBar.this).MM();
          GMTrace.o(17356365496320L, 129315);
          return false;
        }
      }, false);
    }
    this.jcN.MM();
    this.jcN.w(7000L, 7000L);
    GMTrace.o(17377840332800L, 129475);
  }
  
  public final void Xm()
  {
    GMTrace.i(17377974550528L, 129476);
    if (getVisibility() == 0) {}
    for (int i = 1; i != 0; i = 0)
    {
      setVisibility(8);
      GMTrace.o(17377974550528L, 129476);
      return;
    }
    Xl();
    GMTrace.o(17377974550528L, 129476);
  }
  
  final void Xn()
  {
    GMTrace.i(17378242985984L, 129478);
    ViewGroup.LayoutParams localLayoutParams = this.jcI.getLayoutParams();
    if (this.jcP)
    {
      localLayoutParams.height = getResources().getDimensionPixelSize(p.d.ist);
      this.jcI.setLayoutParams(localLayoutParams);
      Xk();
      if (!this.jcP) {
        break label133;
      }
      this.jcG.setImageResource(p.h.ivX);
      label66:
      Xj();
      if (!this.jcP) {
        break label146;
      }
    }
    label133:
    label146:
    for (float f = getResources().getDimensionPixelSize(p.d.isu);; f = getResources().getDimensionPixelSize(p.d.iss))
    {
      this.pCc.setTextSize(0, f);
      this.pCd.setTextSize(0, f);
      GMTrace.o(17378242985984L, 129478);
      return;
      localLayoutParams.height = getResources().getDimensionPixelSize(p.d.isr);
      break;
      this.jcG.setImageResource(p.h.iwa);
      break label66;
    }
  }
  
  final boolean Xo()
  {
    GMTrace.i(17378377203712L, 129479);
    if (this.jcM == null)
    {
      w.i("MicroMsg.AppBrandVideoViewControlBar", "updateMiddleBar mStatePorter null");
      GMTrace.o(17378377203712L, 129479);
      return false;
    }
    int j = this.jcM.WW();
    int k = this.jcM.WX();
    if ((j < 0) || (k < 0))
    {
      GMTrace.o(17378377203712L, 129479);
      return false;
    }
    int i = this.jcL.getWidth();
    if (i <= 0)
    {
      GMTrace.o(17378377203712L, 129479);
      return true;
    }
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.jcJ.getLayoutParams();
    if (k == 0) {
      if (i <= 0) {
        break label172;
      }
    }
    for (;;)
    {
      localLayoutParams.rightMargin = (i + jcR);
      this.jcJ.setLayoutParams(localLayoutParams);
      if ((j < k) || (k == 0)) {
        break label177;
      }
      GMTrace.o(17378377203712L, 129479);
      return false;
      i = (int)(i * (1.0F - j / k));
      break;
      label172:
      i = 0;
    }
    label177:
    GMTrace.o(17378377203712L, 129479);
    return true;
  }
  
  public final void cr(boolean paramBoolean)
  {
    GMTrace.i(17377437679616L, 129472);
    this.fBB = paramBoolean;
    Xj();
    GMTrace.o(17377437679616L, 129472);
  }
  
  public final void cs(boolean paramBoolean)
  {
    GMTrace.i(20369553489920L, 151765);
    if (paramBoolean)
    {
      this.jcL.setVisibility(8);
      this.pCc.setVisibility(8);
      this.pCd.setVisibility(8);
      this.jcK.setVisibility(0);
      GMTrace.o(20369553489920L, 151765);
      return;
    }
    this.jcL.setVisibility(0);
    this.pCc.setVisibility(0);
    this.pCd.setVisibility(0);
    this.jcK.setVisibility(8);
    GMTrace.o(20369553489920L, 151765);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(17377169244160L, 129470);
    int i = p.g.ivC;
    GMTrace.o(17377169244160L, 129470);
    return i;
  }
  
  protected final void init()
  {
    GMTrace.i(17377303461888L, 129471);
    super.init();
    this.jcG = ((ImageView)this.iiK.findViewById(p.f.iua));
    this.jcH = ((ImageView)this.iiK.findViewById(p.f.itU));
    this.jcJ = ((ImageView)this.iiK.findViewById(p.f.iur));
    this.jcL = ((FrameLayout)this.iiK.findViewById(p.f.ius));
    this.jcK = ((TextView)findViewById(p.f.iue));
    this.jcI = ((RelativeLayout)findViewById(p.f.cse));
    if (jcR < 0) {
      jcR = getResources().getDimensionPixelSize(p.d.isv);
    }
    GMTrace.o(17377303461888L, 129471);
  }
  
  public static abstract interface a
  {
    public abstract void cp(boolean paramBoolean);
  }
  
  public static abstract interface b
  {
    public abstract int WW();
    
    public abstract int WX();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoViewControlBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */