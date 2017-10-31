package com.tencent.mm.plugin.appbrand.config;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.l;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

@Deprecated
final class m
  extends l
{
  public static final c.a iBQ;
  
  static
  {
    GMTrace.i(17270063497216L, 128672);
    c.a locala = new c.a();
    locala.hRR = new Field[16];
    locala.columns = new String[17];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "appIdHashCode";
    locala.uQH.put("appIdHashCode", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" appIdHashCode INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.uQG = "appIdHashCode";
    locala.columns[1] = "appId";
    locala.uQH.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "appIcon";
    locala.uQH.put("appIcon", "TEXT");
    localStringBuilder.append(" appIcon TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "appName";
    locala.uQH.put("appName", "TEXT");
    localStringBuilder.append(" appName TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "BigHeadImgUrl";
    locala.uQH.put("BigHeadImgUrl", "TEXT");
    localStringBuilder.append(" BigHeadImgUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "appInfo";
    locala.uQH.put("appInfo", "BLOB");
    localStringBuilder.append(" appInfo BLOB");
    localStringBuilder.append(", ");
    locala.columns[6] = "versionInfo";
    locala.uQH.put("versionInfo", "BLOB");
    localStringBuilder.append(" versionInfo BLOB");
    localStringBuilder.append(", ");
    locala.columns[7] = "bindInfo";
    locala.uQH.put("bindInfo", "BLOB");
    localStringBuilder.append(" bindInfo BLOB");
    localStringBuilder.append(", ");
    locala.columns[8] = "brandId";
    locala.uQH.put("brandId", "TEXT");
    localStringBuilder.append(" brandId TEXT");
    localStringBuilder.append(", ");
    locala.columns[9] = "brandFlag";
    locala.uQH.put("brandFlag", "INTEGER default '0' ");
    localStringBuilder.append(" brandFlag INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[10] = "signature";
    locala.uQH.put("signature", "TEXT");
    localStringBuilder.append(" signature TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "AppOpt";
    locala.uQH.put("AppOpt", "INTEGER default '0' ");
    localStringBuilder.append(" AppOpt INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[12] = "syncAttrVersion";
    locala.uQH.put("syncAttrVersion", "TEXT");
    localStringBuilder.append(" syncAttrVersion TEXT");
    localStringBuilder.append(", ");
    locala.columns[13] = "lastSyncAttrTimeInSecond";
    locala.uQH.put("lastSyncAttrTimeInSecond", "LONG default '0' ");
    localStringBuilder.append(" lastSyncAttrTimeInSecond LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[14] = "debugEnabled";
    locala.uQH.put("debugEnabled", "INTEGER default 'false' ");
    localStringBuilder.append(" debugEnabled INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[15] = "roundedSquareIcon";
    locala.uQH.put("roundedSquareIcon", "TEXT");
    localStringBuilder.append(" roundedSquareIcon TEXT");
    locala.columns[16] = "rowid";
    locala.uQI = localStringBuilder.toString();
    iBQ = locala;
    GMTrace.o(17270063497216L, 128672);
  }
  
  m()
  {
    GMTrace.i(17269795061760L, 128670);
    GMTrace.o(17269795061760L, 128670);
  }
  
  protected final c.a uC()
  {
    GMTrace.i(17269929279488L, 128671);
    c.a locala = iBQ;
    GMTrace.o(17269929279488L, 128671);
    return locala;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */