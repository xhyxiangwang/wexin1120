package com.tencent.mm.plugin.offline.a;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.aar;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.k;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  extends k
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  private ArrayList<String> jaC;
  private String onr;
  private String ons;
  
  private void F(JSONObject paramJSONObject)
  {
    GMTrace.i(6194550800384L, 46153);
    this.onr = paramJSONObject.optString("micropay_tips");
    try
    {
      paramJSONObject = paramJSONObject.getJSONArray("head_url_list");
      if (paramJSONObject != null)
      {
        i = paramJSONObject.length();
        if (i != 0) {}
      }
      else
      {
        GMTrace.o(6194550800384L, 46153);
        return;
      }
      int i = 0;
      while (i < paramJSONObject.length())
      {
        String str = (String)paramJSONObject.get(i);
        this.jaC.add(str);
        i += 1;
      }
      GMTrace.o(6194550800384L, 46153);
      return;
    }
    catch (JSONException paramJSONObject)
    {
      w.printErrStackTrace("MicroMsg.NetSceneGetOffLineInfo", paramJSONObject, "", new Object[0]);
      GMTrace.o(6194550800384L, 46153);
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(6194282364928L, 46151);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(6194282364928L, 46151);
    return i;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, p paramp)
  {
    GMTrace.i(6194416582656L, 46152);
    if (paramInt1 != 0) {
      w.e("MicroMsg.NetSceneGetOffLineInfo", "Cmd : 606" + ", errType = " + paramInt1 + ", errCode = " + paramInt2 + ", errMsg = " + paramString);
    }
    aar localaar = (aar)((b)paramp).hlV.hmc;
    i = paramInt1;
    j = paramInt2;
    paramp = paramString;
    if (paramInt1 == 0)
    {
      i = paramInt1;
      j = paramInt2;
      paramp = paramString;
      if (paramInt2 != 0) {}
    }
    try
    {
      if (!TextUtils.isEmpty(localaar.tXf))
      {
        paramp = new JSONObject(localaar.tXf);
        i = paramp.optInt("InitValue");
        j = paramp.optInt("FastChangedLimit");
        this.ons = paramp.optString("guide_tips");
        com.tencent.mm.plugin.offline.c.a.rV(i);
        com.tencent.mm.plugin.offline.c.a.rW(j);
        w.v("MicroMsg.NetSceneGetOffLineInfo", "initValue:" + i + " fastChangeValue:" + j);
      }
      i = paramInt1;
      j = paramInt2;
      paramp = paramString;
      if (!TextUtils.isEmpty(localaar.tXg))
      {
        F(new JSONObject(localaar.tXg));
        paramp = paramString;
        j = paramInt2;
        i = paramInt1;
      }
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.NetSceneGetOffLineInfo", paramString, "", new Object[0]);
        i = 1000;
        j = 2;
        paramp = ab.getContext().getString(R.l.eUe);
      }
    }
    if (this.gMF != null) {
      this.gMF.a(i, j, paramp, this);
    }
    GMTrace.o(6194416582656L, 46152);
  }
  
  public final int getType()
  {
    GMTrace.i(6194148147200L, 46150);
    GMTrace.o(6194148147200L, 46150);
    return 606;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/offline/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */