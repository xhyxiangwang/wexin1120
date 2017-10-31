package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.g.a.px;
import com.tencent.mm.g.a.px.a;
import com.tencent.mm.g.a.px.b;
import com.tencent.mm.plugin.game.gamewebview.a.d;
import com.tencent.mm.plugin.game.gamewebview.jsapi.GameJsApiMMTask.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class ag
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 250;
  public static final int DO_IN_ENV = 2;
  public static final String NAME = "openWeApp";
  
  public ag()
  {
    GMTrace.i(17069676429312L, 127179);
    GMTrace.o(17069676429312L, 127179);
  }
  
  public final void a(Context paramContext, String paramString, GameJsApiMMTask.a parama)
  {
    GMTrace.i(17069810647040L, 127180);
    w.i("MicroMsg.GameJsApiOpenWeApp", "invoke");
    paramString = d.pQ(paramString);
    if (paramString == null)
    {
      w.e("MicroMsg.GameJsApiOpenWeApp", "data is null");
      parama.qb(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("openWeApp:fail_null_data", null));
      GMTrace.o(17069810647040L, 127180);
      return;
    }
    px localpx = new px();
    localpx.fNL.context = paramContext;
    localpx.fNL.userName = paramString.optString("userName");
    localpx.fNL.appId = paramString.optString("appId");
    localpx.fNL.fNN = paramString.optString("relativeURL");
    localpx.fNL.fNP = paramString.optInt("appVersion", 0);
    localpx.fNL.scene = paramString.optInt("scene", 1018);
    localpx.fNL.fty = paramString.optString("sceneNote");
    if (bg.mZ(localpx.fNL.fty)) {
      localpx.fNL.fty = p.encode(bg.mY(paramString.optString("current_url")));
    }
    localpx.fNL.fBO = paramString.optString("downloadURL");
    localpx.fNL.fNO = paramString.optInt("openType", 0);
    localpx.fNL.fNQ = paramString.optString("checkSumMd5");
    localpx.fNL.fNS = false;
    com.tencent.mm.sdk.b.a.uLm.m(localpx);
    if (localpx.fNM.fNX)
    {
      parama.qb(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("openWeApp:ok", null));
      GMTrace.o(17069810647040L, 127180);
      return;
    }
    parama.qb(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("openWeApp:fail:" + bg.mY(localpx.fNM.fNY), null));
    GMTrace.o(17069810647040L, 127180);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */