package com.tencent.mm.pluginsdk.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.it;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;

public abstract class d
  implements j.a
{
  public int sRF;
  
  public d()
  {
    GMTrace.i(903151091712L, 6729);
    this.sRF = 0;
    GMTrace.o(903151091712L, 6729);
  }
  
  public final void Tu()
  {
    GMTrace.i(903553744896L, 6732);
    if (this.sRF == 0)
    {
      j localj = aFm();
      if (localj != null) {
        localj.c(this);
      }
    }
    this.sRF += 1;
    GMTrace.o(903553744896L, 6732);
  }
  
  public final void a(String paramString, l paraml)
  {
    GMTrace.i(903822180352L, 6734);
    paraml = new it();
    paraml.fFx.fFy = zj(paramString);
    a.uLm.m(paraml);
    GMTrace.o(903822180352L, 6734);
  }
  
  public abstract j aFm();
  
  public final void unregister()
  {
    GMTrace.i(903687962624L, 6733);
    if (this.sRF == 0)
    {
      GMTrace.o(903687962624L, 6733);
      return;
    }
    this.sRF -= 1;
    if (this.sRF == 0)
    {
      j localj = aFm();
      if (localj != null) {
        localj.j(this);
      }
    }
    GMTrace.o(903687962624L, 6733);
  }
  
  public abstract b zj(String paramString);
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */