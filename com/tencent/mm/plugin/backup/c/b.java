package com.tencent.mm.plugin.backup.c;

import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;

public final class b
  extends com.tencent.mm.plugin.backup.a.e
{
  private static b jNg;
  private d jNh;
  private c jNi;
  private a jNj;
  private com.tencent.mm.plugin.backup.b.a jNk;
  String jNl;
  public PowerManager.WakeLock wakeLock;
  
  public b()
  {
    GMTrace.i(14823811186688L, 110446);
    this.jNl = "tickit";
    this.wakeLock = null;
    GMTrace.o(14823811186688L, 110446);
  }
  
  public static b aef()
  {
    GMTrace.i(14823945404416L, 110447);
    if (jNg == null)
    {
      localb = new b();
      jNg = localb;
      a(localb);
    }
    b localb = jNg;
    GMTrace.o(14823945404416L, 110447);
    return localb;
  }
  
  public final void adA()
  {
    GMTrace.i(14824079622144L, 110448);
    jNg = null;
    GMTrace.o(14824079622144L, 110448);
  }
  
  public final void adH()
  {
    GMTrace.i(14824884928512L, 110454);
    af.u(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14823274315776L, 110442);
        try
        {
          if (b.this.wakeLock == null)
          {
            PowerManager localPowerManager = (PowerManager)ab.getContext().getSystemService("power");
            b.this.wakeLock = localPowerManager.newWakeLock(26, "BackupMove Lock");
          }
          if (!b.this.wakeLock.isHeld()) {
            b.this.wakeLock.acquire();
          }
          GMTrace.o(14823274315776L, 110442);
          return;
        }
        catch (Throwable localThrowable)
        {
          GMTrace.o(14823274315776L, 110442);
        }
      }
    });
    GMTrace.o(14824884928512L, 110454);
  }
  
  public final void adI()
  {
    GMTrace.i(14825019146240L, 110455);
    af.u(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14828911460352L, 110484);
        try
        {
          if ((b.this.wakeLock != null) && (b.this.wakeLock.isHeld())) {
            b.this.wakeLock.release();
          }
          GMTrace.o(14828911460352L, 110484);
          return;
        }
        catch (Throwable localThrowable)
        {
          GMTrace.o(14828911460352L, 110484);
        }
      }
    });
    GMTrace.o(14825019146240L, 110455);
  }
  
  public final com.tencent.mm.plugin.backup.b.a aeg()
  {
    GMTrace.i(14824348057600L, 110450);
    if (this.jNk == null) {
      this.jNk = new com.tencent.mm.plugin.backup.b.a();
    }
    com.tencent.mm.plugin.backup.b.a locala = this.jNk;
    GMTrace.o(14824348057600L, 110450);
    return locala;
  }
  
  public final d aeh()
  {
    GMTrace.i(14824482275328L, 110451);
    if (this.jNh == null) {
      this.jNh = new d();
    }
    d locald = this.jNh;
    GMTrace.o(14824482275328L, 110451);
    return locald;
  }
  
  public final c aei()
  {
    GMTrace.i(14824616493056L, 110452);
    if (this.jNi == null) {
      this.jNi = new c();
    }
    c localc = this.jNi;
    GMTrace.o(14824616493056L, 110452);
    return localc;
  }
  
  public final a aej()
  {
    GMTrace.i(14824750710784L, 110453);
    if (this.jNj == null) {
      this.jNj = new a();
    }
    a locala = this.jNj;
    GMTrace.o(14824750710784L, 110453);
    return locala;
  }
  
  public final void i(Object... paramVarArgs)
  {
    GMTrace.i(14824213839872L, 110449);
    af.u(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14823676968960L, 110445);
        Object localObject = b.aef().aei();
        String str = this.val$url;
        w.w("MicroMsg.BackupMoveRecoverServer", "~~~~~~~~~~~~  start by url:%s", new Object[] { str });
        ap.wT().a(595, ((c)localObject).jNO);
        localObject = new com.tencent.mm.plugin.backup.f.e(str);
        ap.wT().a((k)localObject, 0);
        GMTrace.o(14823676968960L, 110445);
      }
    });
    GMTrace.o(14824213839872L, 110449);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */