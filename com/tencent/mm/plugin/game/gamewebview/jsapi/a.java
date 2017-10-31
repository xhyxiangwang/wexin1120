package com.tencent.mm.plugin.game.gamewebview.jsapi;

import android.content.Context;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class a
  extends c
{
  public Bundle mtY;
  
  public a()
  {
    GMTrace.i(17025116143616L, 126847);
    GMTrace.o(17025116143616L, 126847);
  }
  
  public static String d(String paramString, Map<String, ? extends Object> paramMap)
  {
    GMTrace.i(17025518796800L, 126850);
    HashMap localHashMap = new HashMap();
    localHashMap.put("err_msg", paramString);
    if (paramMap != null) {
      localHashMap.putAll(paramMap);
    }
    com.tencent.mm.plugin.game.gamewebview.a.d.k(localHashMap);
    paramString = new JSONObject(localHashMap).toString();
    GMTrace.o(17025518796800L, 126850);
    return paramString;
  }
  
  public void a(Context paramContext, String paramString, GameJsApiMMTask.a parama)
  {
    GMTrace.i(17025384579072L, 126849);
    GMTrace.o(17025384579072L, 126849);
  }
  
  public void a(com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17025250361344L, 126848);
    GMTrace.o(17025250361344L, 126848);
  }
  
  public static final class a
  {
    private int iQC;
    private com.tencent.mm.plugin.game.gamewebview.ui.d mtZ;
    
    public a(com.tencent.mm.plugin.game.gamewebview.ui.d paramd, int paramInt)
    {
      GMTrace.i(20360560902144L, 151698);
      this.mtZ = paramd;
      this.iQC = paramInt;
      GMTrace.o(20360560902144L, 151698);
    }
    
    public final void qb(String paramString)
    {
      GMTrace.i(20360695119872L, 151699);
      if (this.mtZ != null) {
        this.mtZ.v(this.iQC, paramString);
      }
      this.mtZ = null;
      GMTrace.o(20360695119872L, 151699);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */