package com.tencent.mm.plugin.backup.f;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.Queue;

public final class j
{
  public a jNV;
  public long jRH;
  public long jRI;
  public long jRJ;
  public long jRK;
  public Queue<Long> jRL;
  private aj jRM;
  
  public j(a parama)
  {
    GMTrace.i(9501004529664L, 70788);
    this.jRH = 0L;
    this.jRL = new LinkedList();
    this.jRM = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(9512815689728L, 70876);
        long l = System.currentTimeMillis() - j.this.jRK;
        j localj;
        if (l != 0L)
        {
          j.this.jRI = (j.this.jRJ / l * 1000L);
          j.this.jRL.offer(Long.valueOf(j.this.jRI));
          l = ((Long)j.this.jRL.poll()).longValue();
          j.this.jRI = ((j.this.jRH * 10L - l + j.this.jRI) / 10L);
          localj = j.this;
          if (j.this.jRI <= 0L) {
            break label204;
          }
        }
        label204:
        for (l = j.this.jRI;; l = 0L)
        {
          localj.jRI = l;
          j.this.jRH = j.this.jRI;
          j.this.jRJ = 0L;
          j.this.jRK = System.currentTimeMillis();
          j.this.jNV.aep();
          GMTrace.o(9512815689728L, 70876);
          return true;
        }
      }
    }, true);
    this.jNV = parama;
    GMTrace.o(9501004529664L, 70788);
  }
  
  public final String afd()
  {
    GMTrace.i(9501138747392L, 70789);
    long l = this.jRI;
    String str;
    if (l >> 30 > 0L) {
      str = bg.b(l, 100.0D);
    }
    for (;;)
    {
      w.i("MicroMsg.SpeedCalculator", "getBackupPcSpeed :%s", new Object[] { str });
      GMTrace.o(9501138747392L, 70789);
      return str;
      if (l >> 20 > 0L)
      {
        str = bg.a(l, 100.0D);
      }
      else if (l >> 9 > 0L)
      {
        int i = Math.round((float)(l / 1024L));
        str = i + " KB";
      }
      else
      {
        str = l + " B";
      }
    }
  }
  
  public final void start()
  {
    GMTrace.i(9501272965120L, 70790);
    w.i("MicroMsg.SpeedCalculator", "start backup get speed handler.");
    this.jRK = System.currentTimeMillis();
    this.jRJ = 0L;
    this.jRH = 0L;
    this.jRL.clear();
    int i = 0;
    while (i < 10)
    {
      this.jRL.offer(Long.valueOf(0L));
      i += 1;
    }
    this.jRM.w(1000L, 1000L);
    GMTrace.o(9501272965120L, 70790);
  }
  
  public final void stop()
  {
    GMTrace.i(9501407182848L, 70791);
    w.i("MicroMsg.SpeedCalculator", "stop backup get speed handler.");
    this.jRM.MM();
    GMTrace.o(9501407182848L, 70791);
  }
  
  public static abstract interface a
  {
    public abstract void aep();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/f/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */