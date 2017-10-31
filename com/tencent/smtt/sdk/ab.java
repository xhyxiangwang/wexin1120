package com.tencent.smtt.sdk;

import android.content.Context;
import android.util.Log;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.utils.TbsLog;
import java.nio.channels.FileLock;

public class ab
{
  private static ab xzh;
  private static FileLock xzk = null;
  boolean xvM;
  ac xzi;
  private boolean xzj;
  
  public static FileLock clH()
  {
    return xzk;
  }
  
  public static ab clI()
  {
    if (xzh == null) {}
    try
    {
      if (xzh == null) {
        xzh = new ab();
      }
      return xzh;
    }
    finally {}
  }
  
  public final void b(Context paramContext, o paramo)
  {
    Object localObject4 = null;
    if (paramo != null) {}
    for (;;)
    {
      d locald;
      StringBuilder localStringBuilder;
      w localw;
      try
      {
        paramo.a("x5_core_engine_init_sync", (byte)2);
        locald = d.mI(true);
        locald.a(paramContext, paramo);
        localStringBuilder = new StringBuilder();
        if (paramo != null) {
          paramo.a("init_x5_core", (byte)1);
        }
        localw = locald.ckB();
        if ((locald.xvL) && (localw != null))
        {
          if (this.xvM) {
            break label604;
          }
          if (paramo != null) {
            paramo.xxd = true;
          }
          this.xzi = new ac(localw.xyA);
          try
          {
            this.xzj = this.xzi.clL();
            if (!this.xzj) {
              localStringBuilder.append("can not use X5 by x5corewizard return false");
            }
            localObject1 = null;
          }
          catch (NoSuchMethodException localNoSuchMethodException)
          {
            Object localObject1;
            boolean bool;
            this.xzj = true;
            Object localObject2 = null;
            continue;
          }
          catch (Throwable localThrowable1)
          {
            this.xzj = false;
            localStringBuilder.append("can not use x5 by throwable " + Log.getStackTraceString(localThrowable1));
            continue;
          }
          localObject3 = localObject1;
          if (this.xzj)
          {
            CookieManager.getInstance().o(paramContext, true);
            CookieManager.getInstance().ckx();
            localObject3 = localObject1;
          }
          if (this.xzj) {
            break label584;
          }
          TbsLog.e("X5CoreEngine", "mCanUseX5 is false --> report");
          bool = locald.xvL;
          if ((!bool) || (localw == null) || (localObject3 != null)) {
            break label502;
          }
        }
      }
      finally {}
      try
      {
        localObject3 = localw.xyA;
        localObject1 = localObject4;
        if (localObject3 != null) {
          localObject1 = ((DexLoader)localObject3).invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "getLoadFailureDetails", new Class[0], new Object[0]);
        }
        if ((localObject1 instanceof Throwable))
        {
          localObject3 = (Throwable)localObject1;
          localStringBuilder.append("#" + ((Throwable)localObject3).getMessage() + "; cause: " + ((Throwable)localObject3).getCause() + "; th: " + localObject3);
        }
        if ((localObject1 instanceof String)) {
          localStringBuilder.append("failure detail:" + localObject1);
        }
      }
      catch (Throwable localThrowable2)
      {
        label502:
        label584:
        continue;
      }
      if (localStringBuilder.toString().contains("isPreloadX5Disabled:-10000"))
      {
        i.ckL().a(paramContext, 408, new Throwable("X5CoreEngine::init, mCanUseX5=false, available true, details: " + localStringBuilder.toString()));
        this.xvM = true;
        if (paramo != null) {
          paramo.a("init_x5_core", (byte)2);
        }
        return;
        this.xzj = false;
        localStringBuilder.append("can not use X5 by !tbs available");
      }
      else
      {
        i.ckL().a(paramContext, 407, new Throwable("X5CoreEngine::init, mCanUseX5=false, available true, details: " + localStringBuilder.toString()));
        continue;
        if (locald.xvL)
        {
          i.ckL().a(paramContext, 409, new Throwable("mCanUseX5=false, available true, reason: " + localObject3));
          continue;
        }
        i.ckL().a(paramContext, 410, new Throwable("mCanUseX5=false, available false, reason: " + localObject3));
        continue;
        if (xzk != null) {
          continue;
        }
        he(paramContext);
        continue;
      }
      label604:
      Object localObject3 = null;
    }
  }
  
  public final boolean clJ()
  {
    if (QbSdk.xvj) {
      return false;
    }
    return this.xzj;
  }
  
  public final ac clK()
  {
    if (QbSdk.xvj) {
      return null;
    }
    return this.xzi;
  }
  
  /* Error */
  public final FileLock he(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 17	com/tencent/smtt/sdk/ab:xzk	Ljava/nio/channels/FileLock;
    //   5: ifnull +11 -> 16
    //   8: getstatic 17	com/tencent/smtt/sdk/ab:xzk	Ljava/nio/channels/FileLock;
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: areturn
    //   16: aload_1
    //   17: iconst_1
    //   18: ldc -56
    //   20: invokestatic 206	com/tencent/smtt/utils/f:c	(Landroid/content/Context;ZLjava/lang/String;)Ljava/io/FileOutputStream;
    //   23: astore_1
    //   24: aload_1
    //   25: ifnull +10 -> 35
    //   28: aload_1
    //   29: invokestatic 209	com/tencent/smtt/utils/f:a	(Ljava/io/FileOutputStream;)Ljava/nio/channels/FileLock;
    //   32: putstatic 17	com/tencent/smtt/sdk/ab:xzk	Ljava/nio/channels/FileLock;
    //   35: getstatic 17	com/tencent/smtt/sdk/ab:xzk	Ljava/nio/channels/FileLock;
    //   38: astore_1
    //   39: goto -27 -> 12
    //   42: astore_1
    //   43: aload_0
    //   44: monitorexit
    //   45: aload_1
    //   46: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	47	0	this	ab
    //   0	47	1	paramContext	Context
    // Exception table:
    //   from	to	target	type
    //   2	12	42	finally
    //   16	24	42	finally
    //   28	35	42	finally
    //   35	39	42	finally
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/smtt/sdk/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */