package com.tencent.mm.plugin.appbrand.debugger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.HashMap;
import java.util.Map;

public final class DebuggerShell
  extends BroadcastReceiver
  implements com.tencent.mm.kernel.c.a, com.tencent.mm.kernel.c.b
{
  private static boolean iKd;
  private final Map<String, a> iKc;
  
  static
  {
    GMTrace.i(19697927979008L, 146761);
    iKd = false;
    GMTrace.o(19697927979008L, 146761);
  }
  
  public DebuggerShell()
  {
    GMTrace.i(19696988454912L, 146754);
    this.iKc = new HashMap();
    GMTrace.o(19696988454912L, 146754);
  }
  
  public static boolean Ux()
  {
    GMTrace.i(19697659543552L, 146759);
    boolean bool = iKd;
    GMTrace.o(19697659543552L, 146759);
    return bool;
  }
  
  public static boolean Uy()
  {
    GMTrace.i(19697793761280L, 146760);
    if (iKd)
    {
      GMTrace.o(19697793761280L, 146760);
      return true;
    }
    GMTrace.o(19697793761280L, 146760);
    return false;
  }
  
  private void a(a parama)
  {
    GMTrace.i(19697525325824L, 146758);
    if (bg.mZ(parama.name()))
    {
      GMTrace.o(19697525325824L, 146758);
      return;
    }
    this.iKc.put(parama.name(), parama);
    GMTrace.o(19697525325824L, 146758);
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(19697122672640L, 146755);
    paramContext = paramIntent.getStringExtra("action");
    if ((!bg.mZ(paramContext)) && (this.iKc.containsKey(paramContext))) {
      ((a)this.iKc.get(paramContext)).t(paramIntent);
    }
    GMTrace.o(19697122672640L, 146755);
  }
  
  public final void xG()
  {
    GMTrace.i(19697256890368L, 146756);
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("com.tencent.mm.appbrand.debugger");
    ab.getContext().registerReceiver(this, localIntentFilter);
    a(new a());
    a(new b());
    a(new c());
    GMTrace.o(19697256890368L, 146756);
  }
  
  public final void xH()
  {
    GMTrace.i(19697391108096L, 146757);
    ab.getContext().unregisterReceiver(this);
    this.iKc.clear();
    GMTrace.o(19697391108096L, 146757);
  }
  
  public static abstract interface a
  {
    public abstract String name();
    
    public abstract void t(Intent paramIntent);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/debugger/DebuggerShell.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */