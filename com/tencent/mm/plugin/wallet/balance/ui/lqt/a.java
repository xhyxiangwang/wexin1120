package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.ui.d.l;

public final class a
  extends l
{
  private a rDe;
  
  public a(a parama)
  {
    super(2, null);
    GMTrace.i(18398297718784L, 137078);
    this.rDe = parama;
    GMTrace.o(18398297718784L, 137078);
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(18398431936512L, 137079);
    if (this.rDe != null) {
      this.rDe.PP();
    }
    GMTrace.o(18398431936512L, 137079);
  }
  
  public static abstract interface a
  {
    public abstract void PP();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/ui/lqt/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */