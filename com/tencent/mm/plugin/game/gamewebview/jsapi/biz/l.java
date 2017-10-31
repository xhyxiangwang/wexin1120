package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.a.d;
import com.tencent.mm.plugin.game.gamewebview.jsapi.GameJsApiMMTask.a;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.webview.d.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONArray;
import org.json.JSONObject;

public final class l
  extends a
{
  public static final int CTRL_BYTE = 300;
  public static final int DO_IN_ENV = 1;
  public static final String NAME = "clearGameData";
  
  public l()
  {
    GMTrace.i(19310575616000L, 143875);
    GMTrace.o(19310575616000L, 143875);
  }
  
  public final void a(Context paramContext, String paramString, GameJsApiMMTask.a parama)
  {
    GMTrace.i(19310709833728L, 143876);
    w.i("MicroMsg.GameJsApiSetGameData", "invoke");
    paramContext = d.pQ(paramString);
    if (paramContext == null)
    {
      w.e("MicroMsg.GameJsApiSetGameData", "data is null");
      parama.qb(a.d("clearGameData:fail_null_data", null));
      GMTrace.o(19310709833728L, 143876);
      return;
    }
    paramString = paramContext.optString("current_appid");
    if (bg.mZ(paramString))
    {
      w.i("MicroMsg.GameJsApiSetGameData", "appId is null");
      parama.qb(a.d("clearGameData:fail_appid_null", null));
      GMTrace.o(19310709833728L, 143876);
      return;
    }
    JSONArray localJSONArray = paramContext.optJSONArray("keys");
    boolean bool = paramContext.optBoolean("clearAllData", false);
    if ((localJSONArray != null) && (localJSONArray.length() > 0))
    {
      b.bDP().b(paramString, localJSONArray);
      parama.qb(a.d("clearGameData:ok", null));
      GMTrace.o(19310709833728L, 143876);
      return;
    }
    if (bool)
    {
      b.bDP().LM(paramString);
      parama.qb(a.d("clearGameData:ok", null));
      GMTrace.o(19310709833728L, 143876);
      return;
    }
    w.i("MicroMsg.GameJsApiSetGameData", "keys is null");
    parama.qb(a.d("clearGameData:fail", null));
    GMTrace.o(19310709833728L, 143876);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */