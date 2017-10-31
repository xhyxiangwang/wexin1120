package com.tencent.mm.ui.tools;

import android.content.Context;
import android.content.res.ColorStateList;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bq.a;
import com.tencent.mm.u.a.d;
import junit.framework.Assert;

public final class r
{
  private static r wMP;
  private ColorStateList[] vSt;
  private boolean wMQ;
  
  static
  {
    GMTrace.i(1945620185088L, 14496);
    wMP = null;
    GMTrace.o(1945620185088L, 14496);
  }
  
  private r(Context paramContext)
  {
    GMTrace.i(1945083314176L, 14492);
    this.vSt = new ColorStateList[2];
    this.wMQ = false;
    this.vSt[0] = a.T(paramContext, a.d.gUL);
    this.vSt[1] = a.T(paramContext, a.d.gUM);
    GMTrace.o(1945083314176L, 14492);
  }
  
  private static r fD(Context paramContext)
  {
    GMTrace.i(1945217531904L, 14493);
    if (paramContext != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      if ((wMP == null) || (!wMP.wMQ)) {
        wMP = new r(paramContext);
      }
      paramContext = wMP;
      GMTrace.o(1945217531904L, 14493);
      return paramContext;
    }
  }
  
  public static ColorStateList fE(Context paramContext)
  {
    GMTrace.i(1945351749632L, 14494);
    paramContext = fD(paramContext).vSt[0];
    GMTrace.o(1945351749632L, 14494);
    return paramContext;
  }
  
  public static ColorStateList fF(Context paramContext)
  {
    GMTrace.i(1945485967360L, 14495);
    paramContext = fD(paramContext).vSt[1];
    GMTrace.o(1945485967360L, 14495);
    return paramContext;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/ui/tools/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */