package com.tencent.mm.plugin.card.sharecard.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.base.a;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.base.c;
import java.util.List;

public final class h
  implements a
{
  private g ksq;
  
  public h(g paramg)
  {
    GMTrace.i(5091012640768L, 37931);
    this.ksq = paramg;
    GMTrace.o(5091012640768L, 37931);
  }
  
  public final void Bg()
  {
    GMTrace.i(5091415293952L, 37934);
    if (this.ksq != null) {
      this.ksq.notifyDataSetChanged();
    }
    GMTrace.o(5091415293952L, 37934);
  }
  
  public final b lr(int paramInt)
  {
    GMTrace.i(5091549511680L, 37935);
    if (this.ksq != null)
    {
      b localb = this.ksq.lr(paramInt);
      GMTrace.o(5091549511680L, 37935);
      return localb;
    }
    GMTrace.o(5091549511680L, 37935);
    return null;
  }
  
  public final void onCreate()
  {
    GMTrace.i(5091146858496L, 37932);
    this.ksq.notifyDataSetChanged();
    GMTrace.o(5091146858496L, 37932);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(5091281076224L, 37933);
    if (this.ksq != null)
    {
      g localg = this.ksq;
      localg.kse.release();
      localg.kse = null;
      localg.ksp.clear();
      localg.mContext = null;
      this.ksq = null;
    }
    GMTrace.o(5091281076224L, 37933);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/ui/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */