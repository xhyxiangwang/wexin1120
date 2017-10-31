package com.tencent.mm.plugin.bottle;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.bottle.a.i;
import com.tencent.mm.plugin.bottle.ui.e;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.k;
import com.tencent.mm.x.am;

public final class Plugin
  implements c
{
  private b keH;
  
  public Plugin()
  {
    GMTrace.i(7655779205120L, 57040);
    this.keH = new b()
    {
      public final com.tencent.mm.pluginsdk.d.a N(Context paramAnonymousContext, String paramAnonymousString)
      {
        GMTrace.i(7592428437504L, 56568);
        paramAnonymousContext = new e(paramAnonymousContext);
        GMTrace.o(7592428437504L, 56568);
        return paramAnonymousContext;
      }
    };
    GMTrace.o(7655779205120L, 57040);
  }
  
  public final k createApplication()
  {
    GMTrace.i(7655913422848L, 57041);
    a locala = new a();
    GMTrace.o(7655913422848L, 57041);
    return locala;
  }
  
  public final am createSubCore()
  {
    GMTrace.i(7656047640576L, 57042);
    i locali = new i();
    GMTrace.o(7656047640576L, 57042);
    return locali;
  }
  
  public final b getContactWidgetFactory()
  {
    GMTrace.i(7656181858304L, 57043);
    b localb = this.keH;
    GMTrace.o(7656181858304L, 57043);
    return localb;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/bottle/Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */