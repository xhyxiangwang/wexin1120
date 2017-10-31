package com.tencent.smtt.sdk;

import android.content.Context;
import android.util.Log;
import com.tencent.smtt.utils.TbsLog;

public final class i
{
  public static volatile int xwD = -1;
  private static i xwE = null;
  a xwA = null;
  boolean xwB = false;
  private final int xwC = 3;
  
  public static i ckL()
  {
    if (xwE == null) {
      xwE = new i();
    }
    return xwE;
  }
  
  final void a(Context paramContext, int paramInt, Throwable paramThrowable)
  {
    for (;;)
    {
      try
      {
        if (xwD == -1)
        {
          xwD = paramInt;
          TbsLog.addLog(998, "code=%d,desc=%s", new Object[] { Integer.valueOf(paramInt), String.valueOf(paramThrowable) });
          if (paramThrowable != null)
          {
            r localr = r.gP(paramContext);
            paramContext = "NULL";
            if (paramThrowable != null)
            {
              paramThrowable = "msg: " + paramThrowable.getMessage() + "; err: " + paramThrowable + "; cause: " + Log.getStackTraceString(paramThrowable.getCause());
              paramContext = paramThrowable;
              if (paramThrowable.length() > 1024) {
                paramContext = paramThrowable.substring(0, 1024);
              }
            }
            localr.aQ(paramInt, paramContext);
          }
        }
        else
        {
          paramContext = new StringBuilder("setLoadErrorCode :: error(");
          paramContext.append(xwD);
          paramContext.append(") was already reported; ");
          paramContext.append(paramInt);
          paramContext.append(" is duplicated. Try to remove it!");
          TbsLog.w("TbsCoreLoadStat", paramContext.toString());
          continue;
        }
        TbsLog.e("TbsCoreLoadStat", "setLoadErrorCode :: error is null with errorCode: " + paramInt + "; Check & correct it!");
      }
      finally {}
    }
  }
  
  final void aj(Context paramContext, int paramInt)
  {
    a(paramContext, paramInt, null);
    TbsLog.e("loaderror", String.valueOf(paramInt));
  }
  
  public final class a
  {
    int[] xwF;
    int xwG;
    int xwH;
    
    public final String toString()
    {
      if (this.xwH == this.xwG) {}
      for (int i = 1; i != 0; i = 0) {
        return "";
      }
      StringBuilder localStringBuilder = new StringBuilder("[");
      i = this.xwG;
      while (i < this.xwH)
      {
        localStringBuilder.append(String.valueOf(this.xwF[i]) + ",");
        i += 1;
      }
      i = localStringBuilder.length();
      return "]";
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/smtt/sdk/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */