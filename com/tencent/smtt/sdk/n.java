package com.tencent.smtt.sdk;

import android.os.HandlerThread;

final class n
  extends HandlerThread
{
  private static n xxc;
  
  private n(String paramString)
  {
    super(paramString);
  }
  
  public static n clg()
  {
    try
    {
      if (xxc == null)
      {
        localn = new n("TbsHandlerThread");
        xxc = localn;
        localn.start();
      }
      n localn = xxc;
      return localn;
    }
    finally {}
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/smtt/sdk/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */