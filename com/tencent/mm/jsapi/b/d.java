package com.tencent.mm.jsapi.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.jsapi.core.a;
import org.json.JSONObject;

public abstract class d
  extends b
{
  public d(String paramString, int paramInt)
  {
    super(paramString, paramInt);
    GMTrace.i(20017500389376L, 149142);
    GMTrace.o(20017500389376L, 149142);
  }
  
  public abstract JSONObject a(a parama);
  
  public final void a(a parama, JSONObject paramJSONObject, b.a parama1)
  {
    GMTrace.i(20017634607104L, 149143);
    parama1.c(a(parama));
    GMTrace.o(20017634607104L, 149143);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/jsapi/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */