package com.tencent.mm.plugin.collect.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.amv;
import com.tencent.mm.protocal.c.jv;
import com.tencent.mm.protocal.c.jw;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class k
  extends com.tencent.mm.ac.k
  implements j
{
  private final String TAG;
  private b gMC;
  private com.tencent.mm.ac.e gMF;
  public jw kKw;
  
  public k()
  {
    GMTrace.i(18063558705152L, 134584);
    this.TAG = "MicroMsg.NetSceneF2fQrcode";
    b.a locala = new b.a();
    locala.hlX = new jv();
    locala.hlY = new jw();
    locala.hlW = 1588;
    locala.uri = "/cgi-bin/mmpay-bin/f2fqrcode";
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    GMTrace.o(18063558705152L, 134584);
  }
  
  private static JSONObject a(amv paramamv)
  {
    GMTrace.i(18064229793792L, 134589);
    if ((paramamv != null) && (!bg.mZ(paramamv.fEM))) {}
    for (int i = 1; i == 0; i = 0)
    {
      w.w("MicroMsg.NetSceneF2fQrcode", "empty menu item");
      GMTrace.o(18064229793792L, 134589);
      return null;
    }
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("type", paramamv.type);
      localJSONObject.put("wording", paramamv.fEM);
      localJSONObject.put("url", paramamv.url);
      localJSONObject.put("waapp_username", paramamv.uiO);
      localJSONObject.put("waapp_path", paramamv.uiP);
      GMTrace.o(18064229793792L, 134589);
      return localJSONObject;
    }
    catch (JSONException paramamv)
    {
      w.printErrStackTrace("MicroMsg.NetSceneF2fQrcode", paramamv, "", new Object[0]);
      GMTrace.o(18064229793792L, 134589);
    }
    return null;
  }
  
  private JSONArray ai(List<amv> paramList)
  {
    GMTrace.i(18064095576064L, 134588);
    JSONArray localJSONArray = new JSONArray();
    if ((paramList == null) || (paramList.size() == 0))
    {
      w.w("MicroMsg.NetSceneF2fQrcode", "empty menu items");
      GMTrace.o(18064095576064L, 134588);
      return null;
    }
    int i = 0;
    try
    {
      while (i < paramList.size())
      {
        JSONObject localJSONObject = a((amv)paramList.get(i));
        if (localJSONObject != null) {
          localJSONArray.put(i, localJSONObject);
        }
        i += 1;
      }
      GMTrace.o(18064095576064L, 134588);
      return localJSONArray;
    }
    catch (JSONException paramList)
    {
      w.printErrStackTrace("MicroMsg.NetSceneF2fQrcode", paramList, "", new Object[0]);
      GMTrace.o(18064095576064L, 134588);
    }
    return null;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(18063827140608L, 134586);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(18063827140608L, 134586);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(18063961358336L, 134587);
    this.kKw = ((jw)((b)paramp).hlV.hmc);
    w.i("MicroMsg.NetSceneF2fQrcode", "errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    w.d("MicroMsg.NetSceneF2fQrcode", "payurl: %s, true_name: %s, bottom_icon_url: %s", new Object[] { this.kKw.url, this.kKw.rMv, this.kKw.tGd });
    if (!bg.mZ(this.kKw.url))
    {
      ap.AS();
      c.xi().a(w.a.vdf, this.kKw.url);
    }
    if (!bg.mZ(this.kKw.rMv))
    {
      ap.AS();
      c.xi().a(w.a.vdg, this.kKw.rMv);
    }
    ap.AS();
    c.xi().a(w.a.vdi, this.kKw.tGd);
    paramp = a(this.kKw.tGc);
    paramArrayOfByte = ai(this.kKw.tGb);
    if (paramp != null)
    {
      w.d("MicroMsg.NetSceneF2fQrcode", "bottom: %s", new Object[] { paramp.toString() });
      ap.AS();
      c.xi().a(w.a.vdh, paramp.toString());
    }
    if (paramArrayOfByte != null)
    {
      w.d("MicroMsg.NetSceneF2fQrcode", "upright: %s", new Object[] { paramArrayOfByte.toString() });
      ap.AS();
      c.xi().a(w.a.vdj, paramArrayOfByte.toString());
    }
    if (this.gMF != null) {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(18063961358336L, 134587);
  }
  
  public final int getType()
  {
    GMTrace.i(18063692922880L, 134585);
    GMTrace.o(18063692922880L, 134585);
    return 1588;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/b/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */