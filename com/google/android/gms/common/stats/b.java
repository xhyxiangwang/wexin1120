package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.gms.c.aa;
import com.google.android.gms.c.j;
import com.google.android.gms.c.u;
import com.google.android.gms.common.internal.f;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class b
{
  private static final Object alA = new Object();
  private static b amN;
  private static final ComponentName amS = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
  private static Integer amU;
  private final List<String> amO;
  private final List<String> amP;
  private final List<String> amQ;
  private final List<String> amR;
  private e amT;
  
  private b()
  {
    if (getLogLevel() == d.LOG_LEVEL_OFF)
    {
      this.amO = Collections.EMPTY_LIST;
      this.amP = Collections.EMPTY_LIST;
      this.amQ = Collections.EMPTY_LIST;
      this.amR = Collections.EMPTY_LIST;
      return;
    }
    Object localObject = (String)c.a.amX.get();
    if (localObject == null)
    {
      localObject = Collections.EMPTY_LIST;
      this.amO = ((List)localObject);
      localObject = (String)c.a.amY.get();
      if (localObject != null) {
        break label171;
      }
      localObject = Collections.EMPTY_LIST;
      label83:
      this.amP = ((List)localObject);
      localObject = (String)c.a.amZ.get();
      if (localObject != null) {
        break label184;
      }
      localObject = Collections.EMPTY_LIST;
      label106:
      this.amQ = ((List)localObject);
      localObject = (String)c.a.ana.get();
      if (localObject != null) {
        break label197;
      }
    }
    label171:
    label184:
    label197:
    for (localObject = Collections.EMPTY_LIST;; localObject = Arrays.asList(((String)localObject).split(",")))
    {
      this.amR = ((List)localObject);
      this.amT = new e(((Long)c.a.anb.get()).longValue());
      return;
      localObject = Arrays.asList(((String)localObject).split(","));
      break;
      localObject = Arrays.asList(((String)localObject).split(","));
      break label83;
      localObject = Arrays.asList(((String)localObject).split(","));
      break label106;
    }
  }
  
  private static ServiceInfo b(Context paramContext, Intent paramIntent)
  {
    paramContext = paramContext.getPackageManager().queryIntentServices(paramIntent, 128);
    if ((paramContext == null) || (paramContext.size() == 0))
    {
      String.format("There are no handler of this intent: %s\n Stack trace: %s", new Object[] { paramIntent.toUri(0), aa.cg(20) });
      return null;
    }
    if (paramContext.size() > 1)
    {
      String.format("Multiple handlers found for this intent: %s\n Stack trace: %s", new Object[] { paramIntent.toUri(0), aa.cg(20) });
      paramIntent = paramContext.iterator();
      if (paramIntent.hasNext())
      {
        paramContext = ((ResolveInfo)paramIntent.next()).serviceInfo.name;
        return null;
      }
    }
    return ((ResolveInfo)paramContext.get(0)).serviceInfo;
  }
  
  private static int getLogLevel()
  {
    if (amU == null) {}
    for (;;)
    {
      try
      {
        if (!u.lv()) {
          continue;
        }
        i = ((Integer)c.a.amW.get()).intValue();
        amU = Integer.valueOf(i);
      }
      catch (SecurityException localSecurityException)
      {
        int i;
        amU = Integer.valueOf(d.LOG_LEVEL_OFF);
        continue;
      }
      return amU.intValue();
      i = d.LOG_LEVEL_OFF;
    }
  }
  
  public static b kX()
  {
    synchronized (alA)
    {
      if (amN == null) {
        amN = new b();
      }
      return amN;
    }
  }
  
  public final void a(Context paramContext, ServiceConnection paramServiceConnection)
  {
    paramContext.unbindService(paramServiceConnection);
    a(paramContext, paramServiceConnection, null, null, 1);
  }
  
  public final void a(Context paramContext, ServiceConnection paramServiceConnection, String paramString, Intent paramIntent, int paramInt)
  {
    if (!f.akw) {
      return;
    }
    String str1 = String.valueOf(Process.myPid() << 32 | System.identityHashCode(paramServiceConnection));
    int i = getLogLevel();
    label46:
    long l2;
    long l1;
    if ((i == d.LOG_LEVEL_OFF) || (this.amT == null))
    {
      i = 0;
      if (i == 0) {
        break label343;
      }
      l2 = System.currentTimeMillis();
      paramServiceConnection = null;
      if ((getLogLevel() & d.anf) != 0) {
        paramServiceConnection = aa.cg(5);
      }
      l1 = 0L;
      if ((getLogLevel() & d.anh) != 0) {
        l1 = Debug.getNativeHeapAllocatedSize();
      }
      if ((paramInt != 1) && (paramInt != 4)) {
        break label345;
      }
    }
    for (paramServiceConnection = new ConnectionEvent(l2, paramInt, null, null, null, null, paramServiceConnection, str1, SystemClock.elapsedRealtime(), l1);; paramServiceConnection = new ConnectionEvent(l2, paramInt, aa.L(paramContext), paramString, paramIntent.processName, paramIntent.name, paramServiceConnection, str1, SystemClock.elapsedRealtime(), l1))
    {
      paramContext.startService(new Intent().setComponent(amS).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", paramServiceConnection));
      return;
      if ((paramInt == 4) || (paramInt == 1))
      {
        if (this.amT.ak(str1))
        {
          i = 1;
          break label46;
        }
        i = 0;
        break label46;
      }
      Object localObject = b(paramContext, paramIntent);
      if (localObject == null)
      {
        String.format("Client %s made an invalid request %s", new Object[] { paramString, paramIntent.toUri(0) });
        i = 0;
        break label46;
      }
      paramServiceConnection = aa.L(paramContext);
      String str2 = ((ServiceInfo)localObject).processName;
      localObject = ((ServiceInfo)localObject).name;
      if ((this.amO.contains(paramServiceConnection)) || (this.amP.contains(paramString)) || (this.amQ.contains(str2)) || (this.amR.contains(localObject)) || ((str2.equals(paramServiceConnection)) && ((i & d.ang) != 0)))
      {
        i = 0;
        break label46;
      }
      this.amT.aj(str1);
      i = 1;
      break label46;
      label343:
      break;
      label345:
      paramIntent = b(paramContext, paramIntent);
    }
  }
  
  public final boolean a(Context paramContext, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt)
  {
    return a(paramContext, paramContext.getClass().getName(), paramIntent, paramServiceConnection, paramInt);
  }
  
  public final boolean a(Context paramContext, String paramString, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt)
  {
    ComponentName localComponentName = paramIntent.getComponent();
    if ((localComponentName == null) || ((f.akw) && ("com.google.android.gms".equals(localComponentName.getPackageName())))) {}
    for (boolean bool = false; bool; bool = u.h(paramContext, localComponentName.getPackageName())) {
      return false;
    }
    bool = paramContext.bindService(paramIntent, paramServiceConnection, paramInt);
    if (bool) {
      a(paramContext, paramServiceConnection, paramString, paramIntent, 2);
    }
    return bool;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/common/stats/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */