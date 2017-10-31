package com.tencent.mm.plugin.webview.ui.tools.widget.input;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.inputmethod.InputConnection;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.a.c.a;
import com.tencent.mm.ui.tools.h.a;
import com.tencent.mm.ui.widget.MMEditText;

public final class WebViewInputFooter
  extends LinearLayout
{
  private MMActivity fsU;
  private ImageButton jCU;
  private boolean nEo;
  public c sCA;
  public a sCB;
  public b sCC;
  private WebViewSmileyPanel sCD;
  private View sCE;
  private View sCF;
  private View sCG;
  MMEditText sCH;
  private LinearLayout sCI;
  private boolean sCJ;
  private int sCK;
  private int state;
  
  public WebViewInputFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12084427358208L, 90036);
    this.state = 0;
    this.sCK = Integer.MAX_VALUE;
    this.nEo = true;
    this.fsU = ((MMActivity)paramContext);
    paramContext = (ViewGroup)View.inflate(this.fsU, R.i.cKQ, this);
    this.sCI = ((LinearLayout)paramContext.findViewById(R.h.cKO));
    this.sCF = paramContext.findViewById(R.h.cKS);
    this.sCG = paramContext.findViewById(R.h.cKR);
    this.sCE = paramContext.findViewById(R.h.cKT);
    this.sCH = ((MMEditText)paramContext.findViewById(R.h.cKP));
    this.jCU = ((ImageButton)paramContext.findViewById(R.h.cKU));
    this.jCU.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12087514365952L, 90059);
        if (WebViewInputFooter.a(WebViewInputFooter.this) == 0)
        {
          WebViewInputFooter.b(WebViewInputFooter.this).aKl();
          if (!WebViewInputFooter.c(WebViewInputFooter.this)) {
            WebViewInputFooter.d(WebViewInputFooter.this).requestFocus();
          }
          WebViewInputFooter.e(WebViewInputFooter.this);
          WebViewInputFooter.f(WebViewInputFooter.this).setImageResource(R.k.drc);
          WebViewInputFooter.a(WebViewInputFooter.this, 1);
          WebViewInputFooter.g(WebViewInputFooter.this);
          GMTrace.o(12087514365952L, 90059);
          return;
        }
        WebViewInputFooter.g(WebViewInputFooter.this);
        WebViewInputFooter.d(WebViewInputFooter.this).requestFocus();
        WebViewInputFooter.b(WebViewInputFooter.this).aKp();
        WebViewInputFooter.h(WebViewInputFooter.this);
        WebViewInputFooter.a(WebViewInputFooter.this, 0);
        GMTrace.o(12087514365952L, 90059);
      }
    });
    this.sCH.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(12084158922752L, 90034);
        WebViewInputFooter.g(WebViewInputFooter.this);
        WebViewInputFooter.i(WebViewInputFooter.this).setVisibility(8);
        WebViewInputFooter.f(WebViewInputFooter.this).setImageResource(R.g.aXR);
        WebViewInputFooter.a(WebViewInputFooter.this, 0);
        GMTrace.o(12084158922752L, 90034);
        return false;
      }
    });
    this.sCD = new WebViewSmileyPanel(getContext());
    this.sCD.setVisibility(8);
    this.sCD.setBackgroundResource(R.g.aWJ);
    paramContext = this.sCD;
    paramContext.sCQ = new WebViewSmileyPanel.a()
    {
      public final void acx()
      {
        GMTrace.i(12072481980416L, 89947);
        if ((WebViewInputFooter.c(WebViewInputFooter.this)) && (WebViewInputFooter.j(WebViewInputFooter.this) != null))
        {
          WebViewInputFooter.j(WebViewInputFooter.this).sv("[DELETE_EMOTION]");
          GMTrace.o(12072481980416L, 89947);
          return;
        }
        if (WebViewInputFooter.d(WebViewInputFooter.this) != null)
        {
          MMEditText localMMEditText = WebViewInputFooter.d(WebViewInputFooter.this);
          if (localMMEditText.wTn != null)
          {
            localMMEditText.wTn.sendKeyEvent(new KeyEvent(0, 67));
            localMMEditText.wTn.sendKeyEvent(new KeyEvent(1, 67));
            GMTrace.o(12072481980416L, 89947);
            return;
          }
          localMMEditText.dispatchKeyEvent(new KeyEvent(0, 67));
          localMMEditText.dispatchKeyEvent(new KeyEvent(1, 67));
        }
        GMTrace.o(12072481980416L, 89947);
      }
      
      public final void append(String paramAnonymousString)
      {
        GMTrace.i(12072347762688L, 89946);
        try
        {
          if (WebViewInputFooter.c(WebViewInputFooter.this))
          {
            WebViewInputFooter.j(WebViewInputFooter.this).sv(paramAnonymousString);
            GMTrace.o(12072347762688L, 89946);
            return;
          }
          WebViewInputFooter.this.sCH.Wn(paramAnonymousString);
          GMTrace.o(12072347762688L, 89946);
          return;
        }
        catch (Exception paramAnonymousString)
        {
          w.e("MicroMsg.WebViewInputFooter", "appendText, exp = %s", new Object[] { paramAnonymousString });
          GMTrace.o(12072347762688L, 89946);
        }
      }
    };
    paramContext.sCN.sCU = paramContext.sCQ;
    ((LinearLayout)findViewById(R.h.cse)).addView(this.sCD, -1, 0);
    this.sCG.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12072750415872L, 89949);
        paramAnonymousView = com.tencent.mm.ui.tools.a.c.d(WebViewInputFooter.d(WebViewInputFooter.this)).Dr(WebViewInputFooter.l(WebViewInputFooter.this));
        paramAnonymousView.jCo = h.a.wKw;
        paramAnonymousView.wNo = true;
        paramAnonymousView.a(new c.a()
        {
          public final void abH()
          {
            GMTrace.i(12082145656832L, 90019);
            if (WebViewInputFooter.b(WebViewInputFooter.this) != null) {
              Toast.makeText(WebViewInputFooter.b(WebViewInputFooter.this), "exceed max-length", 0).show();
            }
            GMTrace.o(12082145656832L, 90019);
          }
          
          public final void acg()
          {
            GMTrace.i(12082011439104L, 90018);
            GMTrace.o(12082011439104L, 90018);
          }
          
          public final void sy(String paramAnonymous2String)
          {
            GMTrace.i(12081877221376L, 90017);
            if (WebViewInputFooter.k(WebViewInputFooter.this) != null) {
              WebViewInputFooter.k(WebViewInputFooter.this).yX(WebViewInputFooter.d(WebViewInputFooter.this).getText().toString());
            }
            paramAnonymous2String = WebViewInputFooter.this;
            paramAnonymous2String.sCH.clearComposingText();
            paramAnonymous2String.sCH.setText("");
            GMTrace.o(12081877221376L, 90017);
          }
        });
        GMTrace.o(12072750415872L, 89949);
      }
    });
    this.sCH.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(12078119124992L, 89989);
        if (WebViewInputFooter.d(WebViewInputFooter.this).getText() == null)
        {
          GMTrace.o(12078119124992L, 89989);
          return;
        }
        WebViewInputFooter.d(WebViewInputFooter.this).requestFocus();
        if ((paramAnonymousEditable.length() > 0) && (paramAnonymousEditable.toString().trim().length() > 0)) {}
        for (boolean bool = true;; bool = false)
        {
          WebViewInputFooter.a(WebViewInputFooter.this, bool);
          GMTrace.o(12078119124992L, 89989);
          return;
        }
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(12077850689536L, 89987);
        GMTrace.o(12077850689536L, 89987);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(12077984907264L, 89988);
        GMTrace.o(12077984907264L, 89988);
      }
    });
    GMTrace.o(12084427358208L, 90036);
  }
  
  private void abV()
  {
    GMTrace.i(12084695793664L, 90038);
    if (this.sCC != null) {
      this.sCC.aDy();
    }
    this.sCD.setVisibility(8);
    this.jCU.setImageResource(R.k.drb);
    this.state = 0;
    GMTrace.o(12084695793664L, 90038);
  }
  
  private int bBR()
  {
    GMTrace.i(12084561575936L, 90037);
    if (this.sCC != null) {
      this.sCC.aDx();
    }
    if (this.sCH != null) {
      this.fsU.da(this.sCH);
    }
    this.sCD.setVisibility(0);
    Object localObject = this.sCD;
    if (((WebViewSmileyPanel)localObject).HB != null) {
      ((WebViewSmileyPanel)localObject).HB.setVisibility(0);
    }
    localObject = this.sCD.getLayoutParams();
    if ((localObject != null) && (this.nEo))
    {
      ((ViewGroup.LayoutParams)localObject).height = j.aK(getContext());
      this.sCD.setLayoutParams((ViewGroup.LayoutParams)localObject);
    }
    if (localObject != null)
    {
      int i = ((ViewGroup.LayoutParams)localObject).height;
      GMTrace.o(12084561575936L, 90037);
      return i;
    }
    GMTrace.o(12084561575936L, 90037);
    return 0;
  }
  
  private void bDL()
  {
    GMTrace.i(12084964229120L, 90040);
    if (this.sCH != null)
    {
      this.sCH.clearFocus();
      this.sCH.setFocusable(false);
      this.sCH.setFocusableInTouchMode(false);
    }
    GMTrace.o(12084964229120L, 90040);
  }
  
  public final int bDM()
  {
    GMTrace.i(16914118082560L, 126020);
    setVisibility(0);
    if (this.sCI != null) {
      this.sCI.setVisibility(8);
    }
    this.sCJ = true;
    this.state = 1;
    int i = bBR();
    GMTrace.o(16914118082560L, 126020);
    return i;
  }
  
  public final void bDN()
  {
    GMTrace.i(16914252300288L, 126021);
    if (this.sCJ) {
      setVisibility(8);
    }
    this.state = 0;
    abV();
    GMTrace.o(16914252300288L, 126021);
  }
  
  public final void hide()
  {
    GMTrace.i(12085098446848L, 90041);
    setVisibility(8);
    if (this.fsU != null)
    {
      if (this.sCH != null) {
        this.fsU.da(this.sCH);
      }
      this.fsU.aKl();
    }
    this.state = 0;
    abV();
    bDL();
    GMTrace.o(12085098446848L, 90041);
  }
  
  public final boolean isShown()
  {
    GMTrace.i(12085232664576L, 90042);
    if (getVisibility() == 0)
    {
      GMTrace.o(12085232664576L, 90042);
      return true;
    }
    GMTrace.o(12085232664576L, 90042);
    return false;
  }
  
  protected final void onDetachedFromWindow()
  {
    GMTrace.i(12084830011392L, 90039);
    super.onDetachedFromWindow();
    bDL();
    if ((this.sCH != null) && (this.fsU != null)) {
      this.fsU.da(this.sCH);
    }
    this.sCH = null;
    WebViewSmileyPanel localWebViewSmileyPanel = this.sCD;
    c localc = localWebViewSmileyPanel.sCN;
    localc.sCT = null;
    localc.jFb = null;
    if (localWebViewSmileyPanel.HB != null)
    {
      ((ViewGroup)localWebViewSmileyPanel.HB.getParent()).removeView(localWebViewSmileyPanel.HB);
      ((ViewGroup)localWebViewSmileyPanel.HB).removeAllViews();
      localWebViewSmileyPanel.HB = null;
    }
    localWebViewSmileyPanel.jFp = null;
    removeAllViews();
    this.fsU = null;
    this.sCA = null;
    GMTrace.o(12084830011392L, 90039);
  }
  
  public final void setText(String paramString)
  {
    GMTrace.i(16913715429376L, 126017);
    this.sCH.setText("");
    if (bg.mZ(paramString))
    {
      GMTrace.o(16913715429376L, 126017);
      return;
    }
    try
    {
      this.sCH.append(paramString);
      w.d("MicroMsg.WebViewInputFooter", "after setText, editText.getText() = %s", new Object[] { this.sCH.getText() });
      GMTrace.o(16913715429376L, 126017);
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.d("MicroMsg.WebViewInputFooter", "appendText, exp = %s", new Object[] { paramString });
      }
    }
  }
  
  public final void show()
  {
    GMTrace.i(16913983864832L, 126019);
    setVisibility(0);
    if (this.sCI != null) {
      this.sCI.setVisibility(0);
    }
    if (this.sCH != null)
    {
      this.sCH.setEnabled(true);
      this.sCH.setBackgroundResource(R.g.aZB);
    }
    if (this.sCE != null) {
      this.sCE.setVisibility(0);
    }
    this.sCJ = false;
    if (this.sCH != null)
    {
      this.sCH.setFocusable(true);
      this.sCH.setFocusableInTouchMode(true);
      this.sCH.requestFocus();
    }
    if (this.fsU != null) {
      this.fsU.aKp();
    }
    this.state = 0;
    GMTrace.o(16913983864832L, 126019);
  }
  
  public final void xS(int paramInt)
  {
    GMTrace.i(16913849647104L, 126018);
    if (paramInt > 0) {
      this.sCK = paramInt;
    }
    GMTrace.o(16913849647104L, 126018);
  }
  
  public static abstract interface a
  {
    public abstract boolean sv(String paramString);
  }
  
  public static abstract interface b
  {
    public abstract void aDx();
    
    public abstract void aDy();
  }
  
  public static abstract interface c
  {
    public abstract void yX(String paramString);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */