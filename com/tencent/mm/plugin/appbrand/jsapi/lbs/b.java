package com.tencent.mm.plugin.appbrand.jsapi.lbs;

import android.content.Intent;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends a
{
  public static final int CTRL_INDEX = 103;
  public static final String NAME = "chooseLocation";
  public int iPM;
  
  public b()
  {
    GMTrace.i(19707323219968L, 146831);
    this.iPM = 0;
    GMTrace.o(19707323219968L, 146831);
  }
  
  public final void a(final k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19707457437696L, 146832);
    paramJSONObject = new Intent();
    paramJSONObject.putExtra("map_view_type", 8);
    MMActivity localMMActivity = a(paramk);
    if (localMMActivity == null)
    {
      paramk.v(paramInt, d("fail", null));
      w.e("MicroMsg.JsApiChooseLocation", "mmActivity is null, invoke fail!");
      GMTrace.o(19707457437696L, 146832);
      return;
    }
    this.iPM = paramInt;
    localMMActivity.vow = new MMActivity.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        GMTrace.i(19707725873152L, 146834);
        if (paramAnonymousInt1 == 1)
        {
          if (paramAnonymousInt2 == -1)
          {
            if (paramAnonymousIntent == null)
            {
              paramk.v(b.this.iPM, b.this.d("fail", null));
              w.e("MicroMsg.JsApiChooseLocation", "location result is empty!");
              GMTrace.o(19707725873152L, 146834);
              return;
            }
            paramAnonymousIntent = (Addr)paramAnonymousIntent.getParcelableExtra("key_pick_addr");
            HashMap localHashMap = new HashMap();
            if (paramAnonymousIntent != null)
            {
              w.i("MicroMsg.JsApiChooseLocation", "addr: " + paramAnonymousIntent.toString());
              StringBuilder localStringBuilder = new StringBuilder();
              if (!TextUtils.isEmpty(paramAnonymousIntent.hwK))
              {
                localStringBuilder.append(paramAnonymousIntent.hwK);
                localHashMap.put("address", localStringBuilder.toString());
                if (TextUtils.isEmpty(paramAnonymousIntent.hwT)) {
                  break label271;
                }
                localHashMap.put("name", paramAnonymousIntent.hwT);
              }
              for (;;)
              {
                localHashMap.put("latitude", Float.valueOf(paramAnonymousIntent.hwV));
                localHashMap.put("longitude", Float.valueOf(paramAnonymousIntent.hwW));
                paramk.v(b.this.iPM, b.this.d("ok", localHashMap));
                GMTrace.o(19707725873152L, 146834);
                return;
                localStringBuilder.append(paramAnonymousIntent.Il());
                break;
                label271:
                localHashMap.put("name", localStringBuilder.toString());
              }
            }
            paramk.v(b.this.iPM, b.this.d("fail", null));
            w.e("MicroMsg.JsApiChooseLocation", "location result is empty!");
            GMTrace.o(19707725873152L, 146834);
            return;
          }
          if (paramAnonymousInt2 == 0)
          {
            paramk.v(b.this.iPM, b.this.d("cancel", null));
            w.e("MicroMsg.JsApiChooseLocation", "location result is cancel!");
            GMTrace.o(19707725873152L, 146834);
            return;
          }
          paramk.v(b.this.iPM, b.this.d("fail", null));
          w.e("MicroMsg.JsApiChooseLocation", "location result is fail!");
        }
        GMTrace.o(19707725873152L, 146834);
      }
    };
    com.tencent.mm.bi.d.b(localMMActivity, "location", ".ui.RedirectUI", paramJSONObject, 1);
    GMTrace.o(19707457437696L, 146832);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/lbs/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */