package com.tencent.mm.plugin.appbrand.widget;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;

public final class m
  extends i<n>
{
  public static final String iJo;
  
  static
  {
    GMTrace.i(19991730585600L, 148950);
    iJo = i.a(n.iAU, "LaunchWxaWidgetRespData");
    GMTrace.o(19991730585600L, 148950);
  }
  
  public m(e parame)
  {
    super(parame, n.iAU, "LaunchWxaWidgetRespData", n.fSf);
    GMTrace.i(19990656843776L, 148942);
    GMTrace.o(19990656843776L, 148942);
  }
  
  public final boolean a(n paramn, boolean paramBoolean)
  {
    GMTrace.i(19990925279232L, 148944);
    paramn.field_appIdHash = paramn.field_appId.hashCode();
    super.a(paramn, paramBoolean);
    paramBoolean = a(paramn, new String[] { "appId" });
    GMTrace.o(19990925279232L, 148944);
    return paramBoolean;
  }
  
  public final boolean a(n paramn, boolean paramBoolean, String... paramVarArgs)
  {
    GMTrace.i(19991059496960L, 148945);
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
          paramn.field_appIdHash = paramn.field_appId.hashCode();
        }
      }
      else
      {
        paramBoolean = super.a(paramn, paramBoolean, paramVarArgs);
        GMTrace.o(19991059496960L, 148945);
        return paramBoolean;
      }
      i += 1;
    }
  }
  
  public final boolean a(n paramn, String... paramVarArgs)
  {
    GMTrace.i(19990791061504L, 148943);
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
          paramn.field_appIdHash = paramn.field_appId.hashCode();
        }
      }
      else
      {
        boolean bool = super.b(paramn, paramVarArgs);
        GMTrace.o(19990791061504L, 148943);
        return bool;
      }
      i += 1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */