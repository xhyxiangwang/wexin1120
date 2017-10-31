package com.tencent.mm.plugin.favorite;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.g.a.fr;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.sdk.b.c;
import java.io.File;

public final class f
  extends c<fr>
{
  public f()
  {
    GMTrace.i(6468623400960L, 48195);
    this.uLu = fr.class.getName().hashCode();
    GMTrace.o(6468623400960L, 48195);
  }
  
  private static String a(sp paramsp)
  {
    GMTrace.i(6468757618688L, 48196);
    File localFile = new File(x.h(paramsp));
    if (!localFile.exists()) {
      if (paramsp.fwl == null) {
        paramsp = "";
      }
    }
    for (;;)
    {
      GMTrace.o(6468757618688L, 48196);
      return paramsp;
      paramsp = new File(x.axa() + g.n(paramsp.fwl.getBytes()));
      if (paramsp.exists())
      {
        paramsp = paramsp.getAbsolutePath();
      }
      else
      {
        paramsp = "";
        continue;
        paramsp = localFile.getAbsolutePath();
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */