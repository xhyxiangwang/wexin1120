package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.gm;
import com.tencent.mm.g.a.gm.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class v
{
  static void a(gm paramgm)
  {
    GMTrace.i(12624519495680L, 94060);
    paramgm = paramgm.fCF.fCA;
    w.d("MicroMsg.GameJsapiProcessor", "writeMsg param=%s", new Object[] { paramgm });
    if (paramgm != null)
    {
      try
      {
        paramgm = new JSONObject(paramgm);
        if ((paramgm.isNull("type")) || (bg.getInt(paramgm.optString("type"), 0) == 0))
        {
          new JSONArray();
          paramgm = paramgm.getJSONArray("localIdList");
          int j = paramgm.length();
          long[] arrayOfLong = new long[j];
          int i = 0;
          while (i < j)
          {
            arrayOfLong[i] = paramgm.getLong(i);
            i += 1;
          }
          SubCoreGameCenter.aFe().e(arrayOfLong);
          GMTrace.o(12624519495680L, 94060);
          return;
        }
        if (bg.getInt(paramgm.optString("type"), 0) == 65536)
        {
          SubCoreGameCenter.aFe().eL("GameRawMessage", "update GameRawMessage set isRead=1 where 1=1");
          GMTrace.o(12624519495680L, 94060);
          return;
        }
      }
      catch (JSONException paramgm)
      {
        w.w("MicroMsg.GameJsapiProcessor", "JSONException : %s", new Object[] { paramgm.getMessage() });
        GMTrace.o(12624519495680L, 94060);
        return;
      }
      GMTrace.o(12624519495680L, 94060);
      return;
    }
    GMTrace.o(12624519495680L, 94060);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */