package com.tencent.mm.plugin.offline.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.p;
import org.json.JSONObject;

public final class l
  extends h
{
  public String omV;
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(6199919509504L, 46193);
    super.a(paramInt1, paramInt2, paramInt3, paramString, paramp, paramArrayOfByte);
    GMTrace.o(6199919509504L, 46193);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(6199785291776L, 46192);
    this.omV = paramJSONObject.optString("barcode");
    GMTrace.o(6199785291776L, 46192);
  }
  
  public final int anK()
  {
    GMTrace.i(6199651074048L, 46191);
    GMTrace.o(6199651074048L, 46191);
    return 78;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/offline/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */