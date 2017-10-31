package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.widget.input.autofill.b;

public abstract interface x
{
  public abstract void a(View.OnFocusChangeListener paramOnFocusChangeListener);
  
  public abstract void a(a parama);
  
  public abstract void a(b paramb);
  
  public abstract String abA();
  
  public abstract View abI();
  
  public abstract void acA();
  
  public abstract void acB();
  
  public abstract void acC();
  
  public abstract boolean acF();
  
  public abstract boolean aci();
  
  public abstract boolean acj();
  
  public abstract b acy();
  
  public abstract void addTextChangedListener(TextWatcher paramTextWatcher);
  
  public abstract void b(View.OnFocusChangeListener paramOnFocusChangeListener);
  
  public abstract void cV(boolean paramBoolean);
  
  public abstract void destroy();
  
  public abstract Context getContext();
  
  public abstract CharSequence getText();
  
  public abstract View getView();
  
  public abstract int jY(int paramInt);
  
  public abstract void n(AppBrandPageView paramAppBrandPageView);
  
  public abstract void o(AppBrandPageView paramAppBrandPageView);
  
  public abstract void p(float paramFloat1, float paramFloat2);
  
  public abstract void sz(String paramString);
  
  public static abstract interface a
  {
    public abstract void acG();
  }
  
  public static abstract interface b
  {
    public abstract void acl();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */