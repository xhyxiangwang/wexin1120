package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.do;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.util.Map;
import org.json.JSONObject;

public final class v
  extends do
{
  public static c.a gLR;
  
  static
  {
    GMTrace.i(6872350326784L, 51203);
    c.a locala = new c.a();
    locala.hRR = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "wallet_tpa_country";
    locala.uQH.put("wallet_tpa_country", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" wallet_tpa_country TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.uQG = "wallet_tpa_country";
    locala.columns[1] = "wallet_type";
    locala.uQH.put("wallet_type", "INTEGER");
    localStringBuilder.append(" wallet_type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "wallet_name";
    locala.uQH.put("wallet_name", "TEXT");
    localStringBuilder.append(" wallet_name TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "wallet_selected";
    locala.uQH.put("wallet_selected", "INTEGER");
    localStringBuilder.append(" wallet_selected INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "wallet_balance";
    locala.uQH.put("wallet_balance", "INTEGER");
    localStringBuilder.append(" wallet_balance INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "wallet_tpa_country_mask";
    locala.uQH.put("wallet_tpa_country_mask", "INTEGER");
    localStringBuilder.append(" wallet_tpa_country_mask INTEGER");
    locala.columns[6] = "rowid";
    locala.uQI = localStringBuilder.toString();
    gLR = locala;
    GMTrace.o(6872350326784L, 51203);
  }
  
  public v()
  {
    GMTrace.i(6871947673600L, 51200);
    GMTrace.o(6871947673600L, 51200);
  }
  
  public static v R(JSONObject paramJSONObject)
  {
    GMTrace.i(6872216109056L, 51202);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.WalletKindInfo", "json is null");
      GMTrace.o(6872216109056L, 51202);
      return null;
    }
    v localv = new v();
    localv.field_wallet_tpa_country = paramJSONObject.optString("wallet_tpa_country");
    localv.field_wallet_name = paramJSONObject.optString("wallet_name");
    localv.field_wallet_selected = paramJSONObject.optInt("wallet_selected");
    localv.field_wallet_type = paramJSONObject.optInt("wallet_type");
    localv.field_wallet_balance = paramJSONObject.optInt("wallet_balance");
    localv.field_wallet_tpa_country_mask = paramJSONObject.optInt("wallet_tpa_country_mask");
    if (bg.mZ(localv.field_wallet_tpa_country))
    {
      w.e("MicroMsg.WalletKindInfo", "wallet_id is illegal");
      GMTrace.o(6872216109056L, 51202);
      return null;
    }
    GMTrace.o(6872216109056L, 51202);
    return localv;
  }
  
  protected final c.a uC()
  {
    GMTrace.i(6872081891328L, 51201);
    c.a locala = gLR;
    GMTrace.o(6872081891328L, 51201);
    return locala;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */