package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class bm
  extends a
{
  public static final int CTRL_INDEX = 168;
  public static final String NAME = "setClipboardData";
  
  public bm()
  {
    GMTrace.i(10348455264256L, 77102);
    GMTrace.o(10348455264256L, 77102);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10348589481984L, 77103);
    paramJSONObject = paramJSONObject.optString("data");
    if (bg.mZ(paramJSONObject))
    {
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(10348589481984L, 77103);
      return;
    }
    w.d("MicroMsg.JsApiSetClipboardData", "stevyang dataStr %s", new Object[] { paramJSONObject });
    ClipboardManager localClipboardManager = (ClipboardManager)paramk.mContext.getSystemService("clipboard");
    if (localClipboardManager == null)
    {
      w.i("MicroMsg.JsApiSetClipboardData", "getSystemService(CLIPBOARD_SERVICE) failed.");
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(10348589481984L, 77103);
      return;
    }
    localClipboardManager.setPrimaryClip(ClipData.newPlainText("text", paramJSONObject));
    paramk.v(paramInt, d("ok", null));
    GMTrace.o(10348589481984L, 77103);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */