package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import org.json.JSONObject;

public final class aq
  extends a
{
  public static final int CTRL_INDEX = 102;
  public static final String NAME = "makePhoneCall";
  
  public aq()
  {
    GMTrace.i(10326577774592L, 76939);
    GMTrace.o(10326577774592L, 76939);
  }
  
  public final void a(final k paramk, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(10326711992320L, 76940);
    paramJSONObject = paramJSONObject.optString("phoneNumber");
    if (bg.mZ(paramJSONObject))
    {
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(10326711992320L, 76940);
      return;
    }
    MMActivity localMMActivity = a(paramk);
    if (localMMActivity == null)
    {
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(10326711992320L, 76940);
      return;
    }
    localMMActivity.vow = new MMActivity.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        GMTrace.i(20349957701632L, 151619);
        if (paramAnonymousInt1 != (aq.this.hashCode() & 0xFFFF))
        {
          GMTrace.o(20349957701632L, 151619);
          return;
        }
        paramk.v(paramInt, aq.this.d("ok", null));
        GMTrace.o(20349957701632L, 151619);
      }
    };
    Intent localIntent = new Intent("android.intent.action.DIAL");
    localIntent.setData(Uri.parse("tel:" + Uri.encode(paramJSONObject)));
    try
    {
      localMMActivity.startActivityForResult(localIntent, hashCode() & 0xFFFF);
      GMTrace.o(10326711992320L, 76940);
      return;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiMakePhoneCall", "startActivity failed");
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(10326711992320L, 76940);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */