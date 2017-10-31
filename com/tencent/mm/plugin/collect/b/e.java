package com.tencent.mm.plugin.collect.b;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class e
{
  public static String a(Context paramContext, long paramLong, int paramInt)
  {
    GMTrace.i(5401726681088L, 40246);
    paramLong = 1000L * paramLong;
    if (paramInt == 0)
    {
      paramContext = new SimpleDateFormat(paramContext.getString(R.l.dKK)).format(new Date(paramLong));
      GMTrace.o(5401726681088L, 40246);
      return paramContext;
    }
    if (paramInt == 1)
    {
      paramContext = new SimpleDateFormat(paramContext.getString(R.l.dKL)).format(new Date(paramLong));
      GMTrace.o(5401726681088L, 40246);
      return paramContext;
    }
    paramContext = new SimpleDateFormat(paramContext.getString(R.l.dKM)).format(new Date(paramLong));
    GMTrace.o(5401726681088L, 40246);
    return paramContext;
  }
  
  public static String mb(int paramInt)
  {
    GMTrace.i(5401860898816L, 40247);
    String str = String.format("%.2f", new Object[] { Double.valueOf(paramInt / 100.0D) });
    GMTrace.o(5401860898816L, 40247);
    return str;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */