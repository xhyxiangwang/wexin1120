package com.tencent.mm.jsapi.b;

import com.tencent.gmtrace.GMTrace;
import org.json.JSONObject;

public abstract class a
  extends b
{
  public a(String paramString, int paramInt)
  {
    super(paramString, paramInt);
    GMTrace.i(20016158212096L, 149132);
    GMTrace.o(20016158212096L, 149132);
  }
  
  public final void a(com.tencent.mm.jsapi.core.a parama, JSONObject paramJSONObject, b.a parama1)
  {
    GMTrace.i(20016292429824L, 149133);
    b(parama, paramJSONObject, parama1);
    GMTrace.o(20016292429824L, 149133);
  }
  
  public abstract void b(com.tencent.mm.jsapi.core.a parama, JSONObject paramJSONObject, b.a parama1);
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/jsapi/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */