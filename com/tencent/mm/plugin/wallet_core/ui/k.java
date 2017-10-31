package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.pluginsdk.ui.d.l;
import com.tencent.mm.sdk.platformtools.ab;

public final class k
  extends l
{
  private a rWc;
  
  public k(int paramInt, a parama)
  {
    super(paramInt, null);
    GMTrace.i(6944827899904L, 51743);
    this.rWc = parama;
    GMTrace.o(6944827899904L, 51743);
  }
  
  public k(a parama)
  {
    this(2, parama);
    GMTrace.i(6944693682176L, 51742);
    GMTrace.o(6944693682176L, 51742);
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(6944962117632L, 51744);
    if (this.rWc != null) {
      this.rWc.anY();
    }
    GMTrace.o(6944962117632L, 51744);
  }
  
  protected final void wG(int paramInt)
  {
    GMTrace.i(6945096335360L, 51745);
    Context localContext = ab.getContext();
    super.wG(paramInt);
    if (paramInt == 5) {
      dR(localContext.getResources().getColor(R.e.white), localContext.getResources().getColor(R.e.aQm));
    }
    GMTrace.o(6945096335360L, 51745);
  }
  
  public static abstract interface a
  {
    public abstract void anY();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */