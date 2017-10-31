package com.tencent.mm.jsapi.core;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.HashMap;
import java.util.Map;

public final class f
{
  private final Map<String, com.tencent.mm.jsapi.b.f> gQm;
  
  public f()
  {
    GMTrace.i(20021526921216L, 149172);
    this.gQm = new HashMap();
    GMTrace.o(20021526921216L, 149172);
  }
  
  public final void a(com.tencent.mm.jsapi.b.f paramf)
  {
    GMTrace.i(20021661138944L, 149173);
    this.gQm.put(paramf.getName(), paramf);
    GMTrace.o(20021661138944L, 149173);
  }
  
  public final com.tencent.mm.jsapi.b.f er(String paramString)
  {
    GMTrace.i(20021795356672L, 149174);
    if (bg.mZ(paramString))
    {
      GMTrace.o(20021795356672L, 149174);
      return null;
    }
    paramString = (com.tencent.mm.jsapi.b.f)this.gQm.get(paramString);
    GMTrace.o(20021795356672L, 149174);
    return paramString;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/jsapi/core/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */