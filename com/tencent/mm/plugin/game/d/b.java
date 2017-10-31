package com.tencent.mm.plugin.game.d;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.j;
import com.tencent.mm.R.l;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class b
{
  private static Map<String, List<String>> mRm;
  private static Map<String, List<String>> mRn;
  public static HashMap<Long, Long> mRo;
  public static HashMap<Long, String> mRp;
  
  static
  {
    GMTrace.i(12572979888128L, 93676);
    mRm = new HashMap();
    mRn = new HashMap();
    mRo = new HashMap();
    mRp = new HashMap();
    GMTrace.o(12572979888128L, 93676);
  }
  
  public static String f(Context paramContext, long paramLong)
  {
    GMTrace.i(12572845670400L, 93675);
    GregorianCalendar localGregorianCalendar = new GregorianCalendar();
    if (paramLong < 3600000L)
    {
      GMTrace.o(12572845670400L, 93675);
      return "";
    }
    long l1 = localGregorianCalendar.getTimeInMillis();
    if (mRo.containsKey(Long.valueOf(paramLong))) {
      if (l1 - ((Long)mRo.get(Long.valueOf(paramLong))).longValue() < 60000L)
      {
        if (mRp.containsKey(Long.valueOf(paramLong)))
        {
          paramContext = (String)mRp.get(Long.valueOf(paramLong));
          GMTrace.o(12572845670400L, 93675);
          return paramContext;
        }
      }
      else {
        mRo.remove(Long.valueOf(paramLong));
      }
    }
    if ((l1 - paramLong) / 3600000L == 0L)
    {
      j = (int)((l1 - paramLong) / 60000L);
      i = j;
      if (j <= 0) {
        i = 1;
      }
      paramContext = paramContext.getResources().getQuantityString(R.j.dke, i, new Object[] { Integer.valueOf(i) });
      mRp.put(Long.valueOf(paramLong), paramContext);
      mRo.put(Long.valueOf(paramLong), Long.valueOf(l1));
      GMTrace.o(12572845670400L, 93675);
      return paramContext;
    }
    localGregorianCalendar = new GregorianCalendar(localGregorianCalendar.get(1), localGregorianCalendar.get(2), localGregorianCalendar.get(5));
    long l2 = paramLong - localGregorianCalendar.getTimeInMillis();
    if ((l2 > 0L) && (l2 <= 86400000L))
    {
      j = (int)((l1 - paramLong) / 3600000L);
      i = j;
      if (j <= 0) {
        i = 1;
      }
      paramContext = paramContext.getResources().getQuantityString(R.j.dkd, i, new Object[] { Integer.valueOf(i) });
      mRp.put(Long.valueOf(paramLong), paramContext);
      mRo.put(Long.valueOf(paramLong), Long.valueOf(l1));
      GMTrace.o(12572845670400L, 93675);
      return paramContext;
    }
    l2 = paramLong - localGregorianCalendar.getTimeInMillis() + 86400000L;
    if ((l2 > 0L) && (l2 <= 86400000L))
    {
      paramContext = paramContext.getString(R.l.eah);
      mRp.put(Long.valueOf(paramLong), paramContext);
      mRo.put(Long.valueOf(paramLong), Long.valueOf(l1));
      GMTrace.o(12572845670400L, 93675);
      return paramContext;
    }
    int j = (int)((localGregorianCalendar.getTimeInMillis() + 86400000L - paramLong) / 86400000L);
    int i = j;
    if (j <= 0) {
      i = 1;
    }
    paramContext = paramContext.getResources().getQuantityString(R.j.dkf, i, new Object[] { Integer.valueOf(i) });
    mRp.put(Long.valueOf(paramLong), paramContext);
    mRo.put(Long.valueOf(paramLong), Long.valueOf(l1));
    GMTrace.o(12572845670400L, 93675);
    return paramContext;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */