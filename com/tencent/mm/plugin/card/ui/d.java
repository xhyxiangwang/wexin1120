package com.tencent.mm.plugin.card.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.base.a;
import com.tencent.mm.plugin.card.model.al;

public final class d
  implements a
{
  private c ktP;
  
  public d(c paramc)
  {
    GMTrace.i(5028601397248L, 37466);
    this.ktP = paramc;
    GMTrace.o(5028601397248L, 37466);
  }
  
  public final void Bg()
  {
    GMTrace.i(5029004050432L, 37469);
    if (this.ktP != null) {
      this.ktP.a(null, null);
    }
    GMTrace.o(5029004050432L, 37469);
  }
  
  public final void onCreate()
  {
    GMTrace.i(5028735614976L, 37467);
    if (this.ktP != null) {
      al.ajC().c(this.ktP);
    }
    GMTrace.o(5028735614976L, 37467);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(5028869832704L, 37468);
    if (this.ktP != null)
    {
      al.ajC().j(this.ktP);
      c localc = this.ktP;
      localc.aIb();
      localc.kse.release();
      localc.kse = null;
      this.ktP = null;
    }
    GMTrace.o(5028869832704L, 37468);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */