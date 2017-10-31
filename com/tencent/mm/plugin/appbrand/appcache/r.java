package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.m;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class r
  extends m
{
  public static final String[] iBP;
  static final c.a iBQ;
  
  static
  {
    int i = 0;
    GMTrace.i(10611119357952L, 79059);
    iBP = new String[] { "appId", "version", "debugType" };
    Object localObject1 = new c.a();
    ((c.a)localObject1).hRR = new Field[11];
    ((c.a)localObject1).columns = new String[12];
    Object localObject2 = new StringBuilder();
    ((c.a)localObject1).columns[0] = "appId";
    ((c.a)localObject1).uQH.put("appId", "TEXT");
    ((StringBuilder)localObject2).append(" appId TEXT");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[1] = "version";
    ((c.a)localObject1).uQH.put("version", "INTEGER");
    ((StringBuilder)localObject2).append(" version INTEGER");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[2] = "versionMd5";
    ((c.a)localObject1).uQH.put("versionMd5", "TEXT");
    ((StringBuilder)localObject2).append(" versionMd5 TEXT");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[3] = "versionState";
    ((c.a)localObject1).uQH.put("versionState", "INTEGER");
    ((StringBuilder)localObject2).append(" versionState INTEGER");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[4] = "pkgPath";
    ((c.a)localObject1).uQH.put("pkgPath", "TEXT");
    ((StringBuilder)localObject2).append(" pkgPath TEXT");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[5] = "createTime";
    ((c.a)localObject1).uQH.put("createTime", "LONG");
    ((StringBuilder)localObject2).append(" createTime LONG");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[6] = "resourceCount";
    ((c.a)localObject1).uQH.put("resourceCount", "INTEGER");
    ((StringBuilder)localObject2).append(" resourceCount INTEGER");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[7] = "debugType";
    ((c.a)localObject1).uQH.put("debugType", "INTEGER default '0' ");
    ((StringBuilder)localObject2).append(" debugType INTEGER default '0' ");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[8] = "downloadURL";
    ((c.a)localObject1).uQH.put("downloadURL", "TEXT");
    ((StringBuilder)localObject2).append(" downloadURL TEXT");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[9] = "startTime";
    ((c.a)localObject1).uQH.put("startTime", "LONG");
    ((StringBuilder)localObject2).append(" startTime LONG");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[10] = "endTime";
    ((c.a)localObject1).uQH.put("endTime", "LONG");
    ((StringBuilder)localObject2).append(" endTime LONG");
    ((c.a)localObject1).columns[11] = "rowid";
    ((c.a)localObject1).uQI = ((StringBuilder)localObject2).toString();
    iBQ = (c.a)localObject1;
    localObject1 = " PRIMARY KEY (";
    localObject2 = iBP;
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
    Object localObject3 = iBQ;
    ((c.a)localObject3).uQI = (((c.a)localObject3).uQI + "," + (String)localObject1);
    GMTrace.o(10611119357952L, 79059);
  }
  
  public r()
  {
    GMTrace.i(10610850922496L, 79057);
    GMTrace.o(10610850922496L, 79057);
  }
  
  protected final c.a uC()
  {
    GMTrace.i(10610985140224L, 79058);
    c.a locala = iBQ;
    GMTrace.o(10610985140224L, 79058);
    return locala;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */