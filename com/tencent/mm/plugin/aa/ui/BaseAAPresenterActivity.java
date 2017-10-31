package com.tencent.mm.plugin.aa.ui;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.ac.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.vending.c.b;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.x.m;
import com.tenpay.android.wechat.MyKeyboardWindow;

public abstract class BaseAAPresenterActivity
  extends WalletBaseUI
{
  private static final int ije;
  private com.tencent.mm.vending.app.c gST;
  protected View ijd;
  
  static
  {
    GMTrace.i(5615803957248L, 41841);
    ije = com.tencent.mm.bq.a.fromDPToPix(ab.getContext(), 300);
    GMTrace.o(5615803957248L, 41841);
  }
  
  public BaseAAPresenterActivity()
  {
    GMTrace.i(5612582731776L, 41817);
    this.gST = new com.tencent.mm.vending.app.c();
    GMTrace.o(5612582731776L, 41817);
  }
  
  protected final void Qc()
  {
    GMTrace.i(5613790691328L, 41826);
    super.Qc();
    if (this.ijd != null) {
      this.ijd.scrollTo(0, 0);
    }
    GMTrace.o(5613790691328L, 41826);
  }
  
  protected final void a(final View paramView, final int paramInt, final boolean paramBoolean1, final boolean paramBoolean2)
  {
    GMTrace.i(5613656473600L, 41825);
    this.mKeyboard = ((MyKeyboardWindow)findViewById(R.h.cAi));
    this.nzg = findViewById(R.h.cAh);
    View localView = findViewById(R.h.cAj);
    final EditText localEditText = (EditText)paramView.findViewById(R.h.cIF);
    if ((this.mKeyboard == null) || (localEditText == null) || (this.nzg == null))
    {
      GMTrace.o(5613656473600L, 41825);
      return;
    }
    this.nzg.setVisibility(8);
    e.setNoSystemInputOnEditText(localEditText);
    localEditText.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public final void onFocusChange(final View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        GMTrace.i(5612180078592L, 41814);
        if ((paramAnonymousView.isFocused()) && (!paramBoolean1))
        {
          ((InputMethodManager)BaseAAPresenterActivity.this.vov.voR.getSystemService("input_method")).hideSoftInputFromWindow(paramAnonymousView.getWindowToken(), 0);
          new ae().postDelayed(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(5622649061376L, 41892);
              Object localObject;
              if ((!BaseAAPresenterActivity.a(BaseAAPresenterActivity.this).isShown()) && (paramAnonymousView.isShown()))
              {
                if (BaseAAPresenterActivity.1.this.ijg)
                {
                  BaseAAPresenterActivity.b(BaseAAPresenterActivity.this);
                  BaseAAPresenterActivity.e(BaseAAPresenterActivity.this);
                  BaseAAPresenterActivity.a(BaseAAPresenterActivity.this, BaseAAPresenterActivity.1.this.ijh);
                }
              }
              else if (((BaseAAPresenterActivity.1.this.iji instanceof WalletFormView)) && (Build.VERSION.SDK_INT >= 14))
              {
                localObject = (WalletFormView)BaseAAPresenterActivity.1.this.iji;
                if (((m.zS()) || (((WalletFormView)localObject).xih == 100)) && ((!m.zS()) || (((WalletFormView)localObject).xih == 0))) {
                  break label334;
                }
                localObject = new com.tencent.mm.ui.a.c();
                BaseAAPresenterActivity.f(BaseAAPresenterActivity.this).setSecureAccessibility((View.AccessibilityDelegate)localObject);
                BaseAAPresenterActivity.1.this.ijh.setAccessibilityDelegate((View.AccessibilityDelegate)localObject);
              }
              for (;;)
              {
                if (((BaseAAPresenterActivity.1.this.iji instanceof EditHintPasswdView)) && (Build.VERSION.SDK_INT >= 14))
                {
                  localObject = new com.tencent.mm.ui.a.c();
                  BaseAAPresenterActivity.h(BaseAAPresenterActivity.this).setSecureAccessibility((View.AccessibilityDelegate)localObject);
                  BaseAAPresenterActivity.1.this.ijh.setAccessibilityDelegate((View.AccessibilityDelegate)localObject);
                }
                BaseAAPresenterActivity.a(BaseAAPresenterActivity.this, BaseAAPresenterActivity.1.this.ijj);
                BaseAAPresenterActivity.i(BaseAAPresenterActivity.this).setInputEditText((EditText)paramAnonymousView);
                ((InputMethodManager)BaseAAPresenterActivity.this.vov.voR.getSystemService("input_method")).hideSoftInputFromWindow(paramAnonymousView.getWindowToken(), 0);
                GMTrace.o(5622649061376L, 41892);
                return;
                if (BaseAAPresenterActivity.c(BaseAAPresenterActivity.this)) {
                  break;
                }
                BaseAAPresenterActivity.d(BaseAAPresenterActivity.this);
                break;
                label334:
                BaseAAPresenterActivity.g(BaseAAPresenterActivity.this).resetSecureAccessibility();
                BaseAAPresenterActivity.1.this.ijh.setAccessibilityDelegate(null);
              }
            }
          }, 300L);
          GMTrace.o(5612180078592L, 41814);
          return;
        }
        new ae().postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(5637413011456L, 42002);
            BaseAAPresenterActivity.this.Qc();
            ((InputMethodManager)BaseAAPresenterActivity.this.vov.voR.getSystemService("input_method")).showSoftInput(BaseAAPresenterActivity.1.this.ijh, 0);
            GMTrace.o(5637413011456L, 42002);
          }
        }, 200L);
        GMTrace.o(5612180078592L, 41814);
      }
    });
    localEditText.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5652982267904L, 42118);
        if ((!BaseAAPresenterActivity.j(BaseAAPresenterActivity.this).isShown()) && (!paramBoolean1))
        {
          BaseAAPresenterActivity.k(BaseAAPresenterActivity.this);
          BaseAAPresenterActivity.a(BaseAAPresenterActivity.this, localEditText);
          BaseAAPresenterActivity.b(BaseAAPresenterActivity.this, paramInt);
          GMTrace.o(5652982267904L, 42118);
          return;
        }
        if (paramBoolean1)
        {
          BaseAAPresenterActivity.this.Qc();
          ((InputMethodManager)BaseAAPresenterActivity.this.vov.voR.getSystemService("input_method")).showSoftInput(localEditText, 0);
        }
        GMTrace.o(5652982267904L, 42118);
      }
    });
    localView.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5652176961536L, 42112);
        BaseAAPresenterActivity.this.Qc();
        GMTrace.o(5652176961536L, 42112);
      }
    });
    GMTrace.o(5613656473600L, 41825);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5613522255872L, 41824);
    GMTrace.o(5613522255872L, 41824);
    return false;
  }
  
  public final <T extends b<? extends com.tencent.mm.vending.app.a>> T m(Class<? extends b<? extends com.tencent.mm.vending.app.a>> paramClass)
  {
    GMTrace.i(5613253820416L, 41822);
    paramClass = this.gST.a(this, paramClass);
    GMTrace.o(5613253820416L, 41822);
    return paramClass;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5612716949504L, 41818);
    super.onCreate(paramBundle);
    this.gST.B(getIntent(), this);
    this.xhA = true;
    GMTrace.o(5612716949504L, 41818);
  }
  
  public void onDestroy()
  {
    GMTrace.i(5613119602688L, 41821);
    super.onDestroy();
    this.gST.onDestroy();
    GMTrace.o(5613119602688L, 41821);
  }
  
  public void onPause()
  {
    GMTrace.i(5612985384960L, 41820);
    super.onPause();
    this.gST.DQ(3);
    GMTrace.o(5612985384960L, 41820);
  }
  
  public void onResume()
  {
    GMTrace.i(5612851167232L, 41819);
    super.onResume();
    this.gST.DQ(2);
    GMTrace.o(5612851167232L, 41819);
  }
  
  public final <T extends com.tencent.mm.vending.app.a> T p(Class<? extends com.tencent.mm.vending.app.a> paramClass)
  {
    GMTrace.i(5613388038144L, 41823);
    paramClass = this.gST.b(this, paramClass);
    GMTrace.o(5613388038144L, 41823);
    return paramClass;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/aa/ui/BaseAAPresenterActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */