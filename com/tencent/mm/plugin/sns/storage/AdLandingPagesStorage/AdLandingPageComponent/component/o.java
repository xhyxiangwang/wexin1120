package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.s;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.mm.ui.widget.MMWebView.a;
import com.tencent.xweb.l;

public final class o
  extends i
{
  MMWebView jeA;
  FrameLayout qqH;
  
  public o(Context paramContext, s params, ViewGroup paramViewGroup)
  {
    super(paramContext, params, paramViewGroup);
    GMTrace.i(8237747273728L, 61376);
    GMTrace.o(8237747273728L, 61376);
  }
  
  protected final int aWs()
  {
    GMTrace.i(8238149926912L, 61379);
    GMTrace.o(8238149926912L, 61379);
    return Integer.MAX_VALUE;
  }
  
  public final View biL()
  {
    GMTrace.i(8238015709184L, 61378);
    this.qqH = ((FrameLayout)this.iiK);
    this.jeA = MMWebView.a.cb(this.context);
    this.qqH.addView(this.jeA);
    FrameLayout localFrameLayout = this.qqH;
    GMTrace.o(8238015709184L, 61378);
    return localFrameLayout;
  }
  
  protected final void biR()
  {
    GMTrace.i(8237881491456L, 61377);
    WindowManager localWindowManager = (WindowManager)this.context.getSystemService("window");
    int i = localWindowManager.getDefaultDisplay().getWidth();
    int j = localWindowManager.getDefaultDisplay().getHeight();
    this.jeA.setVerticalScrollBarEnabled(false);
    this.jeA.setHorizontalScrollBarEnabled(false);
    this.jeA.getSettings().setJavaScriptEnabled(true);
    this.jeA.loadUrl(((s)this.qpH).mPK);
    this.jeA.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    this.jeA.setVisibility(0);
    this.qqH.setPadding(this.qqH.getPaddingLeft(), (int)((s)this.qpH).qnq, this.qqH.getPaddingRight(), (int)((s)this.qpH).qnr);
    this.qqH.setLayoutParams(new LinearLayout.LayoutParams(i, j));
    GMTrace.o(8237881491456L, 61377);
  }
  
  protected final View biS()
  {
    GMTrace.i(8238284144640L, 61380);
    FrameLayout localFrameLayout = new FrameLayout(this.context);
    GMTrace.o(8238284144640L, 61380);
    return localFrameLayout;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */