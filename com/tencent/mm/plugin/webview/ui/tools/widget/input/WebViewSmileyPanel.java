package com.tencent.mm.plugin.webview.ui.tools.widget.input;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ViewPager.e;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMDotView;
import com.tencent.mm.ui.mogic.WxViewPager;

public class WebViewSmileyPanel
  extends LinearLayout
  implements ViewPager.e, WebViewSmileyViewPager.a
{
  View HB;
  private boolean jDe;
  MMActivity jFp;
  private MMDotView jFr;
  private boolean jFs;
  c sCN;
  a sCQ;
  private WebViewSmileyViewPager sCR;
  
  public WebViewSmileyPanel(Context paramContext)
  {
    super(paramContext, null);
    GMTrace.i(12079998173184L, 90003);
    this.jDe = false;
    this.HB = null;
    this.sCR = null;
    this.jFs = true;
    init();
    GMTrace.o(12079998173184L, 90003);
  }
  
  public WebViewSmileyPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12080132390912L, 90004);
    this.jDe = false;
    this.HB = null;
    this.sCR = null;
    this.jFs = true;
    init();
    GMTrace.o(12080132390912L, 90004);
  }
  
  private void acX()
  {
    GMTrace.i(12081474568192L, 90014);
    if (this.jFr == null)
    {
      GMTrace.o(12081474568192L, 90014);
      return;
    }
    boolean bool = j.aM(getContext());
    RelativeLayout.LayoutParams localLayoutParams;
    if (bool != this.jFs)
    {
      if (!bool) {
        break label117;
      }
      this.jFr.setPadding(0, 0, 0, getContext().getResources().getDimensionPixelSize(R.f.aRY));
      localLayoutParams = (RelativeLayout.LayoutParams)this.jFr.getLayoutParams();
      localLayoutParams.bottomMargin = getContext().getResources().getDimensionPixelSize(R.f.aTO);
      this.jFr.setLayoutParams(localLayoutParams);
    }
    for (;;)
    {
      this.jFs = bool;
      GMTrace.o(12081474568192L, 90014);
      return;
      label117:
      this.jFr.setPadding(0, 0, 0, getContext().getResources().getDimensionPixelSize(R.f.aRW));
      localLayoutParams = (RelativeLayout.LayoutParams)this.jFr.getLayoutParams();
      localLayoutParams.bottomMargin = 0;
      this.jFr.setLayoutParams(localLayoutParams);
    }
  }
  
  private void init()
  {
    GMTrace.i(12080803479552L, 90009);
    this.jFp = ((MMActivity)getContext());
    this.sCN = new c();
    this.sCN.jFb = getContext();
    this.sCN.sCU = this.sCQ;
    GMTrace.o(12080803479552L, 90009);
  }
  
  public final void V(int paramInt)
  {
    GMTrace.i(12079192866816L, 89997);
    a locala = this.sCN.bDO();
    int i = locala.getPageCount();
    int j = locala.jFd;
    if (i <= 1)
    {
      this.jFr.setVisibility(4);
      GMTrace.o(12079192866816L, 89997);
      return;
    }
    this.jFr.setVisibility(0);
    this.jFr.Bn(i);
    this.jFr.Bo(paramInt - j);
    GMTrace.o(12079192866816L, 89997);
  }
  
  public final void W(int paramInt)
  {
    GMTrace.i(12079327084544L, 89998);
    GMTrace.o(12079327084544L, 89998);
  }
  
  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    GMTrace.i(12079058649088L, 89996);
    GMTrace.o(12079058649088L, 89996);
  }
  
  public final void acV()
  {
    GMTrace.i(12079461302272L, 89999);
    if (this.sCR == null)
    {
      GMTrace.o(12079461302272L, 89999);
      return;
    }
    this.sCN.jFs = j.aM(getContext());
    WebViewSmileyViewPager.b localb = (WebViewSmileyViewPager.b)this.sCR.xM;
    if (localb != null)
    {
      localb.jFC.clear();
      localb.sCN = this.sCN;
      localb.notifyDataSetChanged();
    }
    for (;;)
    {
      this.sCR.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12074495246336L, 89962);
          WebViewSmileyPanel.this.V(WebViewSmileyPanel.a(WebViewSmileyPanel.this).xN);
          GMTrace.o(12074495246336L, 89962);
        }
      });
      GMTrace.o(12079461302272L, 89999);
      return;
      localb = new WebViewSmileyViewPager.b();
      localb.sCN = this.sCN;
      this.sCR.a(localb);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(12079729737728L, 90001);
    if (this.jDe)
    {
      super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
      GMTrace.o(12079729737728L, 90001);
      return;
    }
    j.aM(getContext());
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(12079729737728L, 90001);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(12079595520000L, 90000);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    acX();
    GMTrace.o(12079595520000L, 90000);
  }
  
  public void setVisibility(int paramInt)
  {
    GMTrace.i(12081071915008L, 90011);
    if (paramInt == 0) {}
    for (this.jDe = false;; this.jDe = true)
    {
      super.setVisibility(paramInt);
      if (this.jDe) {
        break label186;
      }
      this.jFp.aKl();
      if ((this.HB == null) || (getChildCount() <= 0)) {
        break;
      }
      this.HB.setVisibility(0);
      GMTrace.o(12081071915008L, 90011);
      return;
    }
    if (this.HB == null) {
      this.HB = View.inflate(ab.getContext(), R.i.djN, null);
    }
    for (;;)
    {
      this.sCR = ((WebViewSmileyViewPager)this.HB.findViewById(R.h.cyA));
      this.sCR.b(this);
      this.sCR.sCN = this.sCN;
      this.sCR.sCW = this;
      this.jFr = ((MMDotView)this.HB.findViewById(R.h.cyz));
      this.jFr.Bn(1);
      acX();
      addView(this.HB, new LinearLayout.LayoutParams(-1, -1));
      label186:
      GMTrace.o(12081071915008L, 90011);
      return;
      if (this.HB.getParent() != null) {
        ((ViewGroup)this.HB.getParent()).removeView(this.HB);
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void acx();
    
    public abstract void append(String paramString);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewSmileyPanel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */