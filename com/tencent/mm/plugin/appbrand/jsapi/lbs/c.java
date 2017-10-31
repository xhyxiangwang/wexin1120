package com.tencent.mm.plugin.appbrand.jsapi.lbs;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.compat.a.e.b;
import com.tencent.mm.plugin.appbrand.d.b;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 340;
  private static final String NAME = "enableLocationUpdate";
  public int iWF;
  
  public c()
  {
    GMTrace.i(19707860090880L, 146835);
    this.iWF = 0;
    GMTrace.o(19707860090880L, 146835);
  }
  
  public final void a(final k paramk, final JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19707994308608L, 146836);
    if (paramJSONObject.optBoolean("enable"))
    {
      af.u(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19709604921344L, 146848);
          c.this.iWF = com.tencent.mm.plugin.appbrand.page.a.e(paramk.irS).iY(p.i.ixs);
          GMTrace.o(19709604921344L, 146848);
        }
      });
      a.a(String.valueOf(paramk.hashCode()), new a(paramk));
      paramJSONObject = paramk.iqL;
      com.tencent.mm.plugin.appbrand.d.a(paramJSONObject, new d.b()
      {
        public final void onDestroy()
        {
          GMTrace.i(19708799614976L, 146842);
          com.tencent.mm.plugin.appbrand.d.b(paramJSONObject, this);
          a.pU(String.valueOf(paramk.hashCode()));
          GMTrace.o(19708799614976L, 146842);
        }
      });
    }
    for (;;)
    {
      paramk.v(paramInt, d("ok", null));
      GMTrace.o(19707994308608L, 146836);
      return;
      af.u(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19709068050432L, 146844);
          com.tencent.mm.plugin.appbrand.page.a.e(paramk.irS).iZ(c.this.iWF);
          GMTrace.o(19709068050432L, 146844);
        }
      });
      a.pU(String.valueOf(paramk.hashCode()));
    }
  }
  
  private static final class a
    extends e
    implements a.a
  {
    private static final int CTRL_INDEX = 341;
    private static final String NAME = "onLocationChange";
    private final k iQB;
    
    a(k paramk)
    {
      GMTrace.i(19704504647680L, 146810);
      this.iQB = paramk;
      GMTrace.o(19704504647680L, 146810);
    }
    
    public final void a(double paramDouble1, double paramDouble2, e.b paramb, double paramDouble3, double paramDouble4, double paramDouble5)
    {
      GMTrace.i(19704638865408L, 146811);
      Object localObject = new HashMap(7);
      ((Map)localObject).put("longitude", Double.valueOf(paramDouble2));
      ((Map)localObject).put("latitude", Double.valueOf(paramDouble1));
      ((Map)localObject).put("speed", Double.valueOf(paramDouble3));
      ((Map)localObject).put("accuracy", Double.valueOf(paramDouble4));
      ((Map)localObject).put("altitude", Double.valueOf(paramDouble5));
      ((Map)localObject).put("verticalAccuracy", Float.valueOf(0.0F));
      ((Map)localObject).put("horizontalAccuracy", Double.valueOf(paramDouble4));
      localObject = new JSONObject((Map)localObject).toString();
      w.v("MicroMsg.AppBrand.EventOnLocationChange", "onLocationChanged %s, %s, %s", new Object[] { this.iQB.iqL, paramb.name(), localObject });
      try
      {
        paramb = a(this.iQB);
        paramb.mData = ((String)localObject);
        paramb.VI();
        GMTrace.o(19704638865408L, 146811);
        return;
      }
      finally {}
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/lbs/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */