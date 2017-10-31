package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.b;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class aw
  extends a
{
  public static final int CTRL_BYTE = 270;
  public static final String NAME = "setScreenOrientation";
  
  public aw()
  {
    GMTrace.i(17033169207296L, 126907);
    GMTrace.o(17033169207296L, 126907);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    int i = 0;
    GMTrace.i(17033303425024L, 126908);
    w.i("MicroMsg.GameJsApiSetScreenOrientation", "invoke");
    if (paramJSONObject != null)
    {
      paramJSONObject = paramJSONObject.optString("orientation");
      if (!bg.mZ(paramJSONObject)) {}
    }
    else
    {
      w.e("MicroMsg.GameJsApiSetScreenOrientation", "data is null");
      paramd.v(paramInt, a.d("setScreenOrientation:fail_invalid_data", null));
      GMTrace.o(17033303425024L, 126908);
      return;
    }
    if (paramJSONObject.equals("horizontal")) {}
    for (;;)
    {
      paramd.mwN.or(i);
      paramd.v(paramInt, a.d("setScreenOrientation:ok", null));
      GMTrace.o(17033303425024L, 126908);
      return;
      if (paramJSONObject.equals("vertical")) {
        i = 1;
      } else if (paramJSONObject.equals("sensor")) {
        i = 4;
      } else if (!paramJSONObject.equals("horizontal_unforced")) {
        if (paramJSONObject.equals("vertical_unforced")) {
          i = 1;
        } else {
          i = -1;
        }
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */