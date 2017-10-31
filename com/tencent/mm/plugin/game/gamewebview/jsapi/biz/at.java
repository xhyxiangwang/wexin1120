package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.a.d;
import com.tencent.mm.plugin.game.gamewebview.jsapi.GameJsApiMMTask.a;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.webview.d.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class at
  extends a
{
  public static final int CTRL_BYTE = 298;
  public static final int DO_IN_ENV = 1;
  public static final String NAME = "setGameData";
  
  public at()
  {
    GMTrace.i(19310307180544L, 143873);
    GMTrace.o(19310307180544L, 143873);
  }
  
  public final void a(Context paramContext, String paramString, GameJsApiMMTask.a parama)
  {
    GMTrace.i(19310441398272L, 143874);
    w.i("MicroMsg.GameJsApiSetGameData", "invoke");
    paramContext = d.pQ(paramString);
    if (paramContext == null)
    {
      w.e("MicroMsg.GameJsApiSetGameData", "data is null");
      parama.qb(a.d("setGameData:fail_null_data", null));
      GMTrace.o(19310441398272L, 143874);
      return;
    }
    paramString = paramContext.optString("current_appid");
    if (bg.mZ(paramString))
    {
      w.i("MicroMsg.GameJsApiSetGameData", "appId is null");
      parama.qb(a.d("setGameData:fail_appid_null", null));
      GMTrace.o(19310441398272L, 143874);
      return;
    }
    String str1 = paramContext.optString("key");
    String str2 = paramContext.optString("value");
    String str3 = paramContext.optString("weight", "1");
    String str4 = paramContext.optString("expireTime");
    boolean bool = paramContext.optBoolean("autoClean", true);
    if ((bg.mZ(str1)) || (bg.mZ(str2)))
    {
      w.i("MicroMsg.GameJsApiSetGameData", "key or value is null");
      parama.qb(a.d("setGameData:fail_null_key", null));
      GMTrace.o(19310441398272L, 143874);
      return;
    }
    if (b.bDP().a(paramString, str1, str2, str3, str4, bool))
    {
      parama.qb(a.d("setGameData:ok", null));
      GMTrace.o(19310441398272L, 143874);
      return;
    }
    parama.qb(a.d("setGameData:fail_exceed_size", null));
    GMTrace.o(19310441398272L, 143874);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */