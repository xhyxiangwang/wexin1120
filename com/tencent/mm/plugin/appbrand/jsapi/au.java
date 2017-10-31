package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class au
  extends a
{
  public static final int CTRL_INDEX = 62;
  public static final String NAME = "openAddress";
  
  public au()
  {
    GMTrace.i(10333422878720L, 76990);
    GMTrace.o(10333422878720L, 76990);
  }
  
  public final void a(final k paramk, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(10333557096448L, 76991);
    paramJSONObject = new Intent();
    paramJSONObject.putExtra("req_app_id", paramk.iqL);
    paramJSONObject.putExtra("launch_from_appbrand", true);
    MMActivity localMMActivity = a(paramk);
    if (localMMActivity == null)
    {
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(10333557096448L, 76991);
      return;
    }
    localMMActivity.vow = new MMActivity.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        GMTrace.i(10300942188544L, 76748);
        if (paramAnonymousInt1 != (au.this.hashCode() & 0xFFFF))
        {
          GMTrace.o(10300942188544L, 76748);
          return;
        }
        if ((paramAnonymousInt2 == -1) && (paramAnonymousIntent != null))
        {
          String str1 = bg.ap(paramAnonymousIntent.getStringExtra("nationalCode"), "");
          String str2 = bg.ap(paramAnonymousIntent.getStringExtra("userName"), "");
          String str3 = bg.ap(paramAnonymousIntent.getStringExtra("telNumber"), "");
          String str4 = bg.ap(paramAnonymousIntent.getStringExtra("addressPostalCode"), "");
          String str5 = bg.ap(paramAnonymousIntent.getStringExtra("proviceFirstStageName"), "");
          String str6 = bg.ap(paramAnonymousIntent.getStringExtra("addressCitySecondStageName"), "");
          String str7 = bg.ap(paramAnonymousIntent.getStringExtra("addressCountiesThirdStageName"), "");
          paramAnonymousIntent = bg.ap(paramAnonymousIntent.getStringExtra("addressDetailInfo"), "");
          w.i("MicroMsg.JsApiOpenAddress", "first =  " + str5 + " ; detail =" + paramAnonymousIntent + "; second = " + str6 + " ; tel = " + str3 + "; third = " + str7);
          if (!bg.mZ(str2))
          {
            HashMap localHashMap = new HashMap();
            localHashMap.put("nationalCode", str1);
            localHashMap.put("userName", str2);
            localHashMap.put("telNumber", str3);
            localHashMap.put("addressPostalCode", str4);
            localHashMap.put("proviceFirstStageName", str5);
            localHashMap.put("addressCitySecondStageName", str6);
            localHashMap.put("addressCountiesThirdStageName", str7);
            localHashMap.put("addressDetailInfo", paramAnonymousIntent);
            paramk.v(paramInt, au.this.d("ok", localHashMap));
            GMTrace.o(10300942188544L, 76748);
            return;
          }
        }
        if (paramAnonymousInt2 == 0)
        {
          paramk.v(paramInt, au.this.d("cancel", null));
          GMTrace.o(10300942188544L, 76748);
          return;
        }
        paramk.v(paramInt, au.this.d("fail", null));
        GMTrace.o(10300942188544L, 76748);
      }
    };
    com.tencent.mm.bi.d.a(localMMActivity, "address", ".ui.WalletSelectAddrUI", paramJSONObject, hashCode() & 0xFFFF, false);
    GMTrace.o(10333557096448L, 76991);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */