package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class g
  extends i<h>
{
  public static final String iJo;
  
  static
  {
    GMTrace.i(15443897090048L, 115066);
    iJo = i.a(h.iAU, "LaunchWxaAppRespTable");
    GMTrace.o(15443897090048L, 115066);
  }
  
  public g(e parame)
  {
    super(parame, h.iAU, "LaunchWxaAppRespTable", h.fSf);
    GMTrace.i(15442823348224L, 115058);
    GMTrace.o(15442823348224L, 115058);
  }
  
  public final boolean a(h paramh, boolean paramBoolean)
  {
    GMTrace.i(15443091783680L, 115060);
    paramh.field_appIdHash = paramh.field_appId.hashCode();
    super.a(paramh, paramBoolean);
    paramBoolean = a(paramh, new String[] { "appId" });
    w.i("MicroMsg.LaunchWxaAppCacheStorage", "insertNotify appId %s ret %B", new Object[] { paramh.field_appId, Boolean.valueOf(paramBoolean) });
    GMTrace.o(15443091783680L, 115060);
    return paramBoolean;
  }
  
  public final boolean a(h paramh, boolean paramBoolean, String... paramVarArgs)
  {
    GMTrace.i(18830344585216L, 140297);
    int i;
    if (!bg.D(paramVarArgs)) {
      i = 0;
    }
    for (;;)
    {
      if (i < paramVarArgs.length)
      {
        if (paramVarArgs[i].equals("appId"))
        {
          paramVarArgs[i] = "appIdHash";
          paramh.field_appIdHash = paramh.field_appId.hashCode();
        }
      }
      else
      {
        paramBoolean = super.b(paramh, paramBoolean, paramVarArgs);
        GMTrace.o(18830344585216L, 140297);
        return paramBoolean;
      }
      i += 1;
    }
  }
  
  public final boolean a(h paramh, String... paramVarArgs)
  {
    GMTrace.i(15442957565952L, 115059);
    int i;
    if (!bg.D(paramVarArgs)) {
      i = 0;
    }
    for (;;)
    {
      if (i < paramVarArgs.length)
      {
        if (paramVarArgs[i].equals("appId"))
        {
          paramVarArgs[i] = "appIdHash";
          paramh.field_appIdHash = paramh.field_appId.hashCode();
        }
      }
      else
      {
        boolean bool = super.b(paramh, paramVarArgs);
        GMTrace.o(15442957565952L, 115059);
        return bool;
      }
      i += 1;
    }
  }
  
  public final boolean b(h paramh, boolean paramBoolean, String... paramVarArgs)
  {
    GMTrace.i(15443226001408L, 115061);
    int i;
    if (!bg.D(paramVarArgs)) {
      i = 0;
    }
    for (;;)
    {
      if (i < paramVarArgs.length)
      {
        if (paramVarArgs[i].equals("appId"))
        {
          paramVarArgs[i] = "appIdHash";
          paramh.field_appIdHash = paramh.field_appId.hashCode();
        }
      }
      else
      {
        paramBoolean = super.a(paramh, paramBoolean, paramVarArgs);
        w.i("MicroMsg.LaunchWxaAppCacheStorage", "updateNotify appId %s, ret %B", new Object[] { paramh.field_appId, Boolean.valueOf(paramBoolean) });
        GMTrace.o(15443226001408L, 115061);
        return paramBoolean;
      }
      i += 1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */