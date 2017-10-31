package com.tencent.mm.plugin.appbrand.jsapi.auth;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.util.Queue;
import org.json.JSONObject;

abstract class b
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  b()
  {
    GMTrace.i(18223143583744L, 135773);
    GMTrace.o(18223143583744L, 135773);
  }
  
  protected final MMActivity a(k paramk)
  {
    GMTrace.i(18223680454656L, 135777);
    paramk = super.a(paramk);
    GMTrace.o(18223680454656L, 135777);
    return paramk;
  }
  
  final void a(k paramk, int paramInt, String paramString)
  {
    GMTrace.i(18223546236928L, 135776);
    paramk.v(paramInt, d(paramString, null));
    GMTrace.o(18223546236928L, 135776);
  }
  
  public void a(k arg1, final JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(18223412019200L, 135775);
    final a locala = a.d(???.irS);
    paramJSONObject = new a.a()
    {
      public final void VX()
      {
        GMTrace.i(18228512292864L, 135813);
        w.i("MicroMsg.AppBrand.BaseAuthJsApi", "about to call AuthInvoke, api[%s]", new Object[] { b.this.getName() });
        b.this.a(paramk, paramJSONObject, paramInt, locala);
        GMTrace.o(18228512292864L, 135813);
      }
      
      public final String toString()
      {
        GMTrace.i(18228646510592L, 135814);
        String str = hashCode() + "|" + b.this.getName();
        GMTrace.o(18228646510592L, 135814);
        return str;
      }
    };
    if (!locala.VW()) {}
    synchronized (locala.jwp)
    {
      locala.jwp.offer(paramJSONObject);
      locala.zG(1);
      GMTrace.o(18223412019200L, 135775);
      return;
    }
  }
  
  protected abstract void a(k paramk, JSONObject paramJSONObject, int paramInt, a parama);
  
  static abstract interface a
  {
    public abstract void VU();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/auth/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */