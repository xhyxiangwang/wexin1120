package com.tencent.mm.plugin.sns.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import java.util.List;

public final class g
  implements e
{
  h qhS;
  
  public g()
  {
    GMTrace.i(8769786347520L, 65340);
    GMTrace.o(8769786347520L, 65340);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8770189000704L, 65343);
    GMTrace.o(8770189000704L, 65343);
  }
  
  public final boolean big()
  {
    GMTrace.i(8769920565248L, 65341);
    if ((this.qhS == null) || (this.qhS.qhH.size() == 0))
    {
      GMTrace.o(8769920565248L, 65341);
      return false;
    }
    GMTrace.o(8769920565248L, 65341);
    return true;
  }
  
  public final h bih()
  {
    GMTrace.i(8770054782976L, 65342);
    if ((this.qhS == null) || (this.qhS.qhH.size() == 0))
    {
      GMTrace.o(8770054782976L, 65342);
      return null;
    }
    h localh = this.qhS;
    GMTrace.o(8770054782976L, 65342);
    return localh;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/f/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */