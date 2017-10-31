package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.text.Editable;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.Filter;
import android.widget.Filter.FilterListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.widget.input.x;
import com.tencent.mm.plugin.appbrand.widget.input.x.a;
import com.tencent.mm.plugin.appbrand.widget.input.x.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.p;

public final class b
{
  public final x jEr;
  public final e jEs;
  private final Filter.FilterListener jEt;
  public final c jEu;
  final a jEv;
  int jEw;
  public a jEx;
  private int jEy;
  private int jEz;
  
  public b(x paramx)
  {
    GMTrace.i(18266093256704L, 136093);
    this.jEw = f.jET;
    this.jEr = paramx;
    this.jEs = new e(paramx.getContext());
    this.jEu = new c(paramx, this.jEs);
    this.jEr.a(new x.a()
    {
      public final void acG()
      {
        GMTrace.i(18256966451200L, 136025);
        b.this.acN();
        GMTrace.o(18256966451200L, 136025);
      }
    });
    this.jEr.a(new x.b()
    {
      public final void acl()
      {
        GMTrace.i(18261664071680L, 136060);
        b.this.acN();
        GMTrace.o(18261664071680L, 136060);
      }
    });
    this.jEr.a(new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        GMTrace.i(18268643393536L, 136112);
        if (paramAnonymousBoolean)
        {
          b.this.acO();
          GMTrace.o(18268643393536L, 136112);
          return;
        }
        paramAnonymousView = b.this;
        if (paramAnonymousView.jEs.ioi.isShowing())
        {
          g localg = (g)paramAnonymousView.jEs.jEL.getAdapter();
          paramAnonymousView.jEs.dismiss();
          localg.acM();
        }
        GMTrace.o(18268643393536L, 136112);
      }
    });
    this.jEr.addTextChangedListener(new com.tencent.mm.ui.widget.h()
    {
      private boolean jEB;
      
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(18262335160320L, 136065);
        if ((this.jEB) && (!b.this.jEs.ioi.isShowing()))
        {
          GMTrace.o(18262335160320L, 136065);
          return;
        }
        if (!b.this.jEs.ioi.isShowing()) {
          b.this.acO();
        }
        b.this.u(paramAnonymousEditable);
        GMTrace.o(18262335160320L, 136065);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(18262200942592L, 136064);
        this.jEB = b.this.jEs.ioi.isShowing();
        GMTrace.o(18262200942592L, 136064);
      }
    });
    this.jEt = new Filter.FilterListener()
    {
      public final void onFilterComplete(int paramAnonymousInt)
      {
        GMTrace.i(18265959038976L, 136092);
        if (paramAnonymousInt <= 0)
        {
          b.this.jEs.dismiss();
          GMTrace.o(18265959038976L, 136092);
          return;
        }
        if (b.this.jEs.ioi.isShowing()) {
          b.this.jEs.show();
        }
        GMTrace.o(18265959038976L, 136092);
      }
    };
    this.jEv = new a()
    {
      public final void a(String paramAnonymousString, h.a paramAnonymousa)
      {
        GMTrace.i(18267972304896L, 136107);
        if (paramAnonymousa == h.a.jEW) {
          b.this.u(b.this.jEr.getText());
        }
        super.a(paramAnonymousString, paramAnonymousa);
        GMTrace.o(18267972304896L, 136107);
      }
    };
    GMTrace.o(18266093256704L, 136093);
  }
  
  public final void acN()
  {
    GMTrace.i(18266361692160L, 136095);
    switch (7.jEC[(this.jEw - 1)])
    {
    }
    for (;;)
    {
      if (this.jEy != 0)
      {
        this.jEs.RU = this.jEy;
        this.jEs.Pc -= this.jEy;
      }
      if (this.jEz != 0) {
        this.jEs.Pc -= this.jEz;
      }
      GMTrace.o(18266361692160L, 136095);
      return;
      this.jEs.Pc = com.tencent.mm.plugin.appbrand.ui.g.aat()[0];
      continue;
      this.jEs.Pc = this.jEr.getView().getMeasuredWidth();
    }
  }
  
  final void acO()
  {
    GMTrace.i(18266630127616L, 136097);
    if (this.jEx == null)
    {
      GMTrace.o(18266630127616L, 136097);
      return;
    }
    Object localObject = this.jEr.getText();
    if (!bg.L((CharSequence)localObject)) {
      u((CharSequence)localObject);
    }
    this.jEs.Sd = this.jEr.getView();
    this.jEs.show();
    ((g)this.jEs.jEL.getAdapter()).a(this);
    c localc = this.jEu;
    localc.kc(2);
    localc.jEG = Integer.MIN_VALUE;
    if (!bg.L((CharSequence)localObject)) {
      localc.jEH = true;
    }
    localObject = localc.jEs.jEL;
    if (localObject != null) {
      ((ListView)localObject).getAdapter().registerDataSetObserver(new c.2(localc));
    }
    GMTrace.o(18266630127616L, 136097);
  }
  
  public final void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    GMTrace.i(18266495909888L, 136096);
    this.jEs.ioi.setOnDismissListener(paramOnDismissListener);
    GMTrace.o(18266495909888L, 136096);
  }
  
  public final void u(CharSequence paramCharSequence)
  {
    GMTrace.i(18266227474432L, 136094);
    if (this.jEx == null)
    {
      GMTrace.o(18266227474432L, 136094);
      return;
    }
    this.jEx.getFilter().filter(paramCharSequence, this.jEt);
    GMTrace.o(18266227474432L, 136094);
  }
  
  private static class a
    implements h
  {
    public h jED;
    
    public a()
    {
      GMTrace.i(18256563798016L, 136022);
      GMTrace.o(18256563798016L, 136022);
    }
    
    public void a(String paramString, h.a parama)
    {
      GMTrace.i(18256698015744L, 136023);
      if (this.jED != null) {
        this.jED.a(paramString, parama);
      }
      GMTrace.o(18256698015744L, 136023);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/autofill/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */