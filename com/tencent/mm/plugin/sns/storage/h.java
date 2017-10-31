package com.tencent.mm.plugin.sns.storage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.model.ae;

public final class h
{
  public static m HA(String paramString)
  {
    GMTrace.i(8186341883904L, 60993);
    if (u.FN(paramString))
    {
      paramString = ae.bhp().uI(u.HV(paramString));
      GMTrace.o(8186341883904L, 60993);
      return paramString;
    }
    paramString = ae.bhr().uE(u.HV(paramString));
    if (paramString != null)
    {
      paramString = paramString.bjN();
      GMTrace.o(8186341883904L, 60993);
      return paramString;
    }
    GMTrace.o(8186341883904L, 60993);
    return null;
  }
  
  public static m Hz(String paramString)
  {
    GMTrace.i(8186073448448L, 60991);
    if (u.FN(paramString))
    {
      paramString = ae.bhp().dP(u.HU(paramString));
      GMTrace.o(8186073448448L, 60991);
      return paramString;
    }
    paramString = ae.bhr().dI(u.HU(paramString));
    if (paramString != null)
    {
      paramString = paramString.bjN();
      GMTrace.o(8186073448448L, 60991);
      return paramString;
    }
    GMTrace.o(8186073448448L, 60991);
    return null;
  }
  
  public static boolean a(String paramString, m paramm)
  {
    GMTrace.i(8186207666176L, 60992);
    if (u.FN(paramString))
    {
      bool = ae.bhp().b(u.HU(paramString), paramm);
      GMTrace.o(8186207666176L, 60992);
      return bool;
    }
    boolean bool = ae.bhr().b(u.HU(paramString), paramm.bkr());
    GMTrace.o(8186207666176L, 60992);
    return bool;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */