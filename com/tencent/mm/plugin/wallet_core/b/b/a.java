package com.tencent.mm.plugin.wallet_core.b.b;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ad;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.wallet_core.e.a.a
{
  private boolean rLe;
  
  public a()
  {
    this("");
    GMTrace.i(7035827519488L, 52421);
    GMTrace.o(7035827519488L, 52421);
  }
  
  public a(String paramString)
  {
    this(paramString, true);
    GMTrace.i(7035961737216L, 52422);
    GMTrace.o(7035961737216L, 52422);
  }
  
  public a(String paramString, boolean paramBoolean)
  {
    GMTrace.i(7036095954944L, 52423);
    HashMap localHashMap = new HashMap();
    localHashMap.put("req_key", paramString);
    x(localHashMap);
    this.rLe = paramBoolean;
    GMTrace.o(7036095954944L, 52423);
  }
  
  private static ArrayList<Bankcard> t(JSONArray paramJSONArray)
  {
    GMTrace.i(16593740365824L, 123633);
    ArrayList localArrayList = new ArrayList();
    if ((paramJSONArray != null) && (paramJSONArray.length() > 0))
    {
      int j = paramJSONArray.length();
      int i = 0;
      while (i < j)
      {
        Object localObject = paramJSONArray.getJSONObject(i);
        ((JSONObject)localObject).put("extra_bind_flag", "NORMAL");
        localObject = com.tencent.mm.plugin.wallet_core.model.a.a.bxt().N((JSONObject)localObject);
        if (localObject != null) {
          localArrayList.add(localObject);
        }
        i += 1;
      }
    }
    GMTrace.o(16593740365824L, 123633);
    return localArrayList;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(7036364390400L, 52425);
    int i = super.a(parame, parame1);
    GMTrace.o(7036364390400L, 52425);
    return i;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7036498608128L, 52426);
    w.i("MicroMsg.NetScenePayUQueryBoundBankcard", "hy: payu query bind on gy net end. errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    if (paramInt != 0)
    {
      GMTrace.o(7036498608128L, 52426);
      return;
    }
    for (;;)
    {
      try
      {
        long l = paramJSONObject.optLong("time_stamp");
        if (l <= 0L) {
          continue;
        }
        com.tencent.mm.wallet_core.c.m.setTimeStamp(String.valueOf(l));
        localObject = paramJSONObject.getJSONObject("user_info");
        paramString = new ad();
        if ((localObject == null) || (((JSONObject)localObject).length() <= 0)) {
          continue;
        }
        paramString.field_is_reg = bg.getInt(((JSONObject)localObject).optString("is_reg"), 0);
        paramString.field_true_name = ((JSONObject)localObject).optString("true_name");
        paramString.field_main_card_bind_serialno = ((JSONObject)localObject).optString("main_card_bind_serialno");
        paramString.field_ftf_pay_url = ((JSONObject)localObject).optString("transfer_url");
        com.tencent.mm.plugin.wallet_core.model.m.bwE();
        ae.Js(paramString.field_main_card_bind_serialno);
      }
      catch (Exception paramString)
      {
        Object localObject;
        JSONObject localJSONObject;
        w.printErrStackTrace("MicroMsg.NetScenePayUQueryBoundBankcard", paramString, "", new Object[0]);
        continue;
        paramString = null;
        continue;
        paramJSONObject = null;
        continue;
      }
      paramString.field_switchConfig = paramJSONObject.getJSONObject("switch_info").getInt("switch_bit");
      localObject = t(paramJSONObject.optJSONArray("Array"));
      localJSONObject = paramJSONObject.optJSONObject("balance_info");
      if ((localJSONObject == null) || (localJSONObject.length() <= 0)) {
        continue;
      }
      paramJSONObject = new Bankcard((byte)0);
      paramJSONObject.rNa = (localJSONObject.optInt("avail_balance") / 100.0D);
      paramJSONObject.rNc = (localJSONObject.optInt("fetch_balance") / 100.0D);
      paramJSONObject.field_bankcardType = localJSONObject.optString("balance_bank_type");
      paramJSONObject.field_bindSerial = localJSONObject.optString("balance_bind_serial");
      paramJSONObject.field_forbidWord = localJSONObject.optString("balance_forbid_word");
      paramJSONObject.field_desc = ab.getContext().getString(R.l.eUM);
      paramJSONObject.field_cardType |= Bankcard.rMR;
      com.tencent.mm.plugin.wallet_core.model.m.bwE().a(paramString, (ArrayList)localObject, null, paramJSONObject, null, null, null, null, 0, 0, null);
      if ((this.rLe) && (!com.tencent.mm.plugin.wallet_core.model.m.bwE().bwY()))
      {
        this.gMF.a(1000, -100869, "", this);
        this.xgb = true;
      }
      GMTrace.o(7036498608128L, 52426);
      return;
      w.w("MicroMsg.NetScenePayUQueryBoundBankcard", "no time_stamp in bindquerynew.");
    }
  }
  
  public final int bwi()
  {
    GMTrace.i(7036230172672L, 52424);
    GMTrace.o(7036230172672L, 52424);
    return 1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/b/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */