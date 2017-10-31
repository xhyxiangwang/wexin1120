package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.dq;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class x
  extends dq
{
  public static c.a gLR;
  
  static
  {
    GMTrace.i(6902280880128L, 51426);
    c.a locala = new c.a();
    locala.hRR = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "pref_key";
    locala.uQH.put("pref_key", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" pref_key TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.uQG = "pref_key";
    locala.columns[1] = "pref_title";
    locala.uQH.put("pref_title", "TEXT");
    localStringBuilder.append(" pref_title TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "pref_url";
    locala.uQH.put("pref_url", "TEXT");
    localStringBuilder.append(" pref_url TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "is_show";
    locala.uQH.put("is_show", "INTEGER default '1' ");
    localStringBuilder.append(" is_show INTEGER default '1' ");
    locala.columns[4] = "rowid";
    locala.uQI = localStringBuilder.toString();
    gLR = locala;
    GMTrace.o(6902280880128L, 51426);
  }
  
  public x()
  {
    GMTrace.i(6902012444672L, 51424);
    GMTrace.o(6902012444672L, 51424);
  }
  
  protected final c.a uC()
  {
    GMTrace.i(6902146662400L, 51425);
    c.a locala = gLR;
    GMTrace.o(6902146662400L, 51425);
    return locala;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */