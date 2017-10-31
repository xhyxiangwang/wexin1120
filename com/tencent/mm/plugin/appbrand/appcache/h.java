package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.cn;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class h
  extends cn
{
  static final String[] iAT;
  static final c.a iAU;
  
  static
  {
    int i = 0;
    GMTrace.i(19686519472128L, 146676);
    iAT = new String[] { "key", "version" };
    Object localObject1 = new c.a();
    ((c.a)localObject1).hRR = new Field[4];
    ((c.a)localObject1).columns = new String[5];
    Object localObject2 = new StringBuilder();
    ((c.a)localObject1).columns[0] = "key";
    ((c.a)localObject1).uQH.put("key", "TEXT");
    ((StringBuilder)localObject2).append(" key TEXT");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[1] = "version";
    ((c.a)localObject1).uQH.put("version", "INTEGER");
    ((StringBuilder)localObject2).append(" version INTEGER");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[2] = "scene";
    ((c.a)localObject1).uQH.put("scene", "INTEGER");
    ((StringBuilder)localObject2).append(" scene INTEGER");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[3] = "updateTime";
    ((c.a)localObject1).uQH.put("updateTime", "LONG");
    ((StringBuilder)localObject2).append(" updateTime LONG");
    ((c.a)localObject1).columns[4] = "rowid";
    ((c.a)localObject1).uQI = ((StringBuilder)localObject2).toString();
    iAU = (c.a)localObject1;
    localObject1 = " PRIMARY KEY (";
    localObject2 = iAT;
    int j = localObject2.length;
    while (i < j)
    {
      localObject3 = localObject2[i];
      localObject1 = (String)localObject1 + ", " + (String)localObject3;
      i += 1;
    }
    localObject1 = ((String)localObject1).replaceFirst(",", "");
    localObject1 = (String)localObject1 + " )";
    localObject2 = new StringBuilder();
    Object localObject3 = iAU;
    ((c.a)localObject3).uQI = (((c.a)localObject3).uQI + "," + (String)localObject1);
    GMTrace.o(19686519472128L, 146676);
  }
  
  public h()
  {
    GMTrace.i(19686251036672L, 146674);
    GMTrace.o(19686251036672L, 146674);
  }
  
  protected final c.a uC()
  {
    GMTrace.i(19686385254400L, 146675);
    c.a locala = iAU;
    GMTrace.o(19686385254400L, 146675);
    return locala;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */