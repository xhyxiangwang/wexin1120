package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class u
{
  public static String TAG;
  public List<a> fIU;
  
  static
  {
    GMTrace.i(16596693155840L, 123655);
    TAG = "MicroMsg.WalletIndexPayMenu";
    GMTrace.o(16596693155840L, 123655);
  }
  
  public u()
  {
    GMTrace.i(16596424720384L, 123653);
    this.fIU = new LinkedList();
    ap.AS();
    Object localObject = (String)c.xi().get(w.a.vcL, "");
    this.fIU.clear();
    if (bg.mZ((String)localObject))
    {
      GMTrace.o(16596424720384L, 123653);
      return;
    }
    try
    {
      localObject = new JSONArray((String)localObject);
      int i = 0;
      while (i < ((JSONArray)localObject).length())
      {
        JSONObject localJSONObject = ((JSONArray)localObject).getJSONObject(i);
        a locala = new a();
        locala.rQN = localJSONObject.optInt("paymenu_jump_type");
        locala.rQO = localJSONObject.optString("paymenu_jump_url");
        locala.rQP = localJSONObject.optString("paymenu_path");
        locala.rQQ = localJSONObject.optString("paymenu_title");
        locala.rQR = localJSONObject.optString("paymenu_username");
        this.fIU.add(locala);
        i += 1;
      }
      GMTrace.o(16596424720384L, 123653);
      return;
    }
    catch (JSONException localJSONException)
    {
      GMTrace.o(16596424720384L, 123653);
    }
  }
  
  public static void Jp(String paramString)
  {
    GMTrace.i(16596558938112L, 123654);
    ap.AS();
    c.xi().a(w.a.vcL, paramString);
    GMTrace.o(16596558938112L, 123654);
  }
  
  public static final class a
  {
    public int rQN;
    public String rQO;
    public String rQP;
    public String rQQ;
    public String rQR;
    
    public a()
    {
      GMTrace.i(16596290502656L, 123652);
      GMTrace.o(16596290502656L, 123652);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */