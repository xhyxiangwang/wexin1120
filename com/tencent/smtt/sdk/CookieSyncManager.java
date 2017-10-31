package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.export.external.DexLoader;
import java.lang.reflect.Field;

public class CookieSyncManager
{
  private static android.webkit.CookieSyncManager xuT;
  private static CookieSyncManager xuU;
  private static boolean xuV = false;
  
  private CookieSyncManager(Context paramContext)
  {
    ab localab = ab.clI();
    if ((localab != null) && (localab.clJ()))
    {
      localab.clK().xyA.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieSyncManager_createInstance", new Class[] { Context.class }, new Object[] { paramContext });
      xuV = true;
    }
  }
  
  public static CookieSyncManager createInstance(Context paramContext)
  {
    try
    {
      xuT = android.webkit.CookieSyncManager.createInstance(paramContext);
      if ((xuU == null) || (!xuV)) {
        xuU = new CookieSyncManager(paramContext.getApplicationContext());
      }
      paramContext = xuU;
      return paramContext;
    }
    finally {}
  }
  
  public static CookieSyncManager getInstance()
  {
    try
    {
      if (xuU == null) {
        throw new IllegalStateException("CookieSyncManager::createInstance() needs to be called before CookieSyncManager::getInstance()");
      }
    }
    finally {}
    CookieSyncManager localCookieSyncManager = xuU;
    return localCookieSyncManager;
  }
  
  public void startSync()
  {
    Object localObject = ab.clI();
    if ((localObject != null) && (((ab)localObject).clJ()))
    {
      ((ab)localObject).clK().xyA.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieSyncManager_startSync", new Class[0], new Object[0]);
      return;
    }
    xuT.startSync();
    try
    {
      localObject = Class.forName("android.webkit.WebSyncManager").getDeclaredField("mSyncThread");
      ((Field)localObject).setAccessible(true);
      ((Thread)((Field)localObject).get(xuT)).setUncaughtExceptionHandler(new SQLiteUncaughtExceptionHandler());
      return;
    }
    catch (Exception localException) {}
  }
  
  public void stopSync()
  {
    ab localab = ab.clI();
    if ((localab != null) && (localab.clJ()))
    {
      localab.clK().xyA.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieSyncManager_stopSync", new Class[0], new Object[0]);
      return;
    }
    xuT.stopSync();
  }
  
  public void sync()
  {
    ab localab = ab.clI();
    if ((localab != null) && (localab.clJ()))
    {
      localab.clK().xyA.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieSyncManager_Sync", new Class[0], new Object[0]);
      return;
    }
    xuT.sync();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/smtt/sdk/CookieSyncManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */