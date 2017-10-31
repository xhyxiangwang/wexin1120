package com.tencent.mm.plugin.card.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.base.a;
import com.tencent.mm.plugin.card.base.c;
import java.util.List;

public final class h
  implements a
{
  private g kxo;
  
  public h(g paramg)
  {
    GMTrace.i(5037459767296L, 37532);
    this.kxo = paramg;
    GMTrace.o(5037459767296L, 37532);
  }
  
  public final void Bg()
  {
    GMTrace.i(5037862420480L, 37535);
    if (this.kxo != null) {
      this.kxo.notifyDataSetChanged();
    }
    GMTrace.o(5037862420480L, 37535);
  }
  
  public final void onCreate()
  {
    GMTrace.i(5037593985024L, 37533);
    this.kxo.notifyDataSetChanged();
    GMTrace.o(5037593985024L, 37533);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(5037728202752L, 37534);
    if (this.kxo != null)
    {
      g localg = this.kxo;
      localg.kse.release();
      localg.kse = null;
      localg.ksp.clear();
      localg.mContext = null;
      localg.kxm = null;
      this.kxo = null;
    }
    GMTrace.o(5037728202752L, 37534);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */