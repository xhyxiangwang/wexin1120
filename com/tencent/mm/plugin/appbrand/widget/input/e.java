package com.tencent.mm.plugin.appbrand.widget.input;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsoluteLayout;
import android.widget.AbsoluteLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.f;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.q.b;
import com.tencent.mm.plugin.appbrand.page.s;
import com.tencent.mm.plugin.appbrand.page.v;
import com.tencent.mm.plugin.appbrand.widget.b.a;
import com.tencent.mm.plugin.appbrand.widget.b.f;
import com.tencent.mm.plugin.appbrand.widget.b.f.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.WebView;

@SuppressLint({"ViewConstructor"})
public final class e
  extends FrameLayout
  implements q.b, v
{
  private final AppBrandPageView iTB;
  public final f jAZ;
  private final AbsoluteLayout jBa;
  private final float jBb;
  
  public e(Context paramContext, AppBrandPageView paramAppBrandPageView)
  {
    super(paramContext);
    GMTrace.i(18286360133632L, 136244);
    super.setId(p.f.itp);
    this.iTB = paramAppBrandPageView;
    this.jBb = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    paramAppBrandPageView.jlc.jlX = this;
    this.jBa = new a(paramContext);
    this.jAZ = new f(this.jBa);
    addView(this.jBa);
    GMTrace.o(18286360133632L, 136244);
  }
  
  private <Input extends View,  extends x> boolean a(s params, Input paramInput, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    GMTrace.i(18286494351360L, 136245);
    if ((params == null) || (params.getView() == null) || (paramInput == null))
    {
      GMTrace.o(18286494351360L, 136245);
      return false;
    }
    n(params);
    if (((x)paramInput).acF())
    {
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(paramInt1, paramInt2);
      localLayoutParams.leftMargin = (paramInt3 - params.getScrollX());
      localLayoutParams.topMargin = (paramInt4 - params.getScrollY());
      localLayoutParams.bottomMargin = 0;
      localLayoutParams.rightMargin = 0;
      addView(paramInput, localLayoutParams);
      if (paramBoolean) {
        ((x)paramInput).n(this.iTB);
      }
      GMTrace.o(18286494351360L, 136245);
      return true;
    }
    params = new AbsoluteLayout.LayoutParams(paramInt1, paramInt2, paramInt3, paramInt4);
    this.jBa.addView(paramInput, params);
    if (paramBoolean) {
      ((x)paramInput).n(this.iTB);
    }
    GMTrace.o(18286494351360L, 136245);
    return true;
  }
  
  private <Input extends View,  extends x> boolean bO(Input paramInput)
  {
    GMTrace.i(10066866470912L, 75004);
    int i = 1;
    while (i < getChildCount())
    {
      if (paramInput == getChildAt(i))
      {
        GMTrace.o(10066866470912L, 75004);
        return true;
      }
      i += 1;
    }
    GMTrace.o(10066866470912L, 75004);
    return false;
  }
  
  private void n(s params)
  {
    GMTrace.i(10066598035456L, 75002);
    if ((this.jBa.getWidth() != params.getWidth()) || (this.jBa.getHeight() != params.getHeight()))
    {
      ViewGroup.LayoutParams localLayoutParams = this.jBa.getLayoutParams();
      localLayoutParams.width = params.getWidth();
      localLayoutParams.height = params.getHeight();
      this.jBa.setLayoutParams(localLayoutParams);
    }
    if ((this.jBa.getScrollX() != params.getWebScrollX()) || (this.jBa.getScrollY() != params.getWebScrollY())) {
      this.jBa.scrollTo(params.getWebScrollX(), params.getWebScrollY());
    }
    GMTrace.o(10066598035456L, 75002);
  }
  
  public final <Input extends View,  extends x> boolean a(s params, Input paramInput, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(10066463817728L, 75001);
    boolean bool = a(params, paramInput, paramInt1, paramInt2, paramInt3, paramInt4, true);
    GMTrace.o(10066463817728L, 75001);
    return bool;
  }
  
  public final <Input extends View,  extends x> boolean b(s params, Input paramInput, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(10066732253184L, 75003);
    if ((params == null) || (params.getView() == null) || (paramInput == null))
    {
      GMTrace.o(10066732253184L, 75003);
      return false;
    }
    int i;
    if (paramInput != null) {
      if (bO(paramInput)) {
        i = 1;
      }
    }
    while (i == 0)
    {
      GMTrace.o(10066732253184L, 75003);
      return false;
      if (this.jBa != null)
      {
        i = 0;
        for (;;)
        {
          if (i >= this.jBa.getChildCount()) {
            break label113;
          }
          if (paramInput == this.jBa.getChildAt(i))
          {
            i = 1;
            break;
          }
          i += 1;
        }
      }
      label113:
      i = 0;
    }
    n(params);
    if (bO(paramInput))
    {
      if (((x)paramInput).acF()) {
        if (paramInput.getLayoutParams() != null)
        {
          FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)paramInput.getLayoutParams();
          localLayoutParams.leftMargin = (paramInt3 - params.getScrollX());
          localLayoutParams.topMargin = (paramInt4 - params.getScrollY());
          localLayoutParams.width = paramInt1;
          localLayoutParams.height = paramInt2;
          paramInput.setLayoutParams(localLayoutParams);
        }
      }
      for (;;)
      {
        GMTrace.o(10066732253184L, 75003);
        return true;
        removeView(paramInput);
        a(params, paramInput, paramInt1, paramInt2, paramInt3, paramInt4, false);
      }
    }
    if ((paramInput.getLayoutParams() == null) || (!(paramInput.getLayoutParams() instanceof AbsoluteLayout.LayoutParams)))
    {
      GMTrace.o(10066732253184L, 75003);
      return false;
    }
    if ((paramInput.getWidth() != paramInt1) || (paramInput.getHeight() != paramInt2) || (paramInput.getLeft() != paramInt3) || (paramInput.getTop() != paramInt4))
    {
      params = (AbsoluteLayout.LayoutParams)paramInput.getLayoutParams();
      params.x = paramInt3;
      params.y = paramInt4;
      params.width = paramInt1;
      params.height = paramInt2;
      paramInput.setLayoutParams(params);
    }
    GMTrace.o(10066732253184L, 75003);
    return true;
  }
  
  public final <Input extends View,  extends x> void bP(Input paramInput)
  {
    GMTrace.i(10067000688640L, 75005);
    if (paramInput == null)
    {
      GMTrace.o(10067000688640L, 75005);
      return;
    }
    paramInput.setVisibility(8);
    this.jBa.removeView(paramInput);
    removeView(paramInput);
    ((x)paramInput).o(this.iTB);
    GMTrace.o(10067000688640L, 75005);
  }
  
  public final void jc(int paramInt)
  {
    GMTrace.i(10067269124096L, 75007);
    setTranslationY(paramInt);
    GMTrace.o(10067269124096L, 75007);
  }
  
  public final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4, View paramView)
  {
    GMTrace.i(10067134906368L, 75006);
    w.v("MicroMsg.AppBrandInputContainer", "onScrollChanged, left = %d, top = %d, oldLeft = %d, oldTop = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    if (this.jBa != null)
    {
      ViewGroup.LayoutParams localLayoutParams2 = this.jBa.getLayoutParams();
      ViewGroup.LayoutParams localLayoutParams1 = localLayoutParams2;
      if (localLayoutParams2 == null)
      {
        localLayoutParams1 = new ViewGroup.LayoutParams(paramView.getWidth(), paramView.getHeight());
        this.jBa.setLayoutParams(localLayoutParams1);
      }
      if ((paramView.getWidth() != localLayoutParams1.width) || (paramView.getHeight() != localLayoutParams1.height))
      {
        localLayoutParams1.width = paramView.getWidth();
        localLayoutParams1.height = paramView.getHeight();
        this.jBa.setLayoutParams(localLayoutParams1);
      }
      this.jBa.scrollTo(paramInt1, paramInt2);
    }
    GMTrace.o(10067134906368L, 75006);
  }
  
  public final void setId(int paramInt)
  {
    GMTrace.i(18846719148032L, 140419);
    GMTrace.o(18846719148032L, 140419);
  }
  
  public final boolean shouldDelayChildPressedState()
  {
    GMTrace.i(18846853365760L, 140420);
    GMTrace.o(18846853365760L, 140420);
    return false;
  }
  
  private final class a
    extends AbsoluteLayout
    implements com.tencent.mm.plugin.appbrand.widget.b.e
  {
    public a(Context paramContext)
    {
      super();
      GMTrace.i(19864626397184L, 148003);
      GMTrace.o(19864626397184L, 148003);
    }
    
    public final boolean C(MotionEvent paramMotionEvent)
    {
      GMTrace.i(19864894832640L, 148005);
      if ((paramMotionEvent == null) || (paramMotionEvent.getActionMasked() != 0))
      {
        GMTrace.o(19864894832640L, 148005);
        return false;
      }
      f localf = e.this.jAZ;
      if ((paramMotionEvent == null) || (paramMotionEvent.getActionMasked() != 0) || (localf.jAo == null))
      {
        GMTrace.o(19864894832640L, 148005);
        return false;
      }
      if ((paramMotionEvent.getDownTime() == localf.jAo.jAp) && (paramMotionEvent.getEventTime() == localf.jAo.jAq))
      {
        GMTrace.o(19864894832640L, 148005);
        return true;
      }
      GMTrace.o(19864894832640L, 148005);
      return false;
    }
    
    public final boolean abz()
    {
      GMTrace.i(19864760614912L, 148004);
      if (getChildCount() <= 0)
      {
        GMTrace.o(19864760614912L, 148004);
        return false;
      }
      int i = 0;
      while (i <= getChildCount())
      {
        if (a.bM(getChildAt(i)))
        {
          GMTrace.o(19864760614912L, 148004);
          return true;
        }
        i += 1;
      }
      GMTrace.o(19864760614912L, 148004);
      return false;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */