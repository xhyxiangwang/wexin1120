package com.tencent.mm.plugin.backup.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bt.g;
import com.tencent.mm.plugin.backup.g.a;
import com.tencent.mm.plugin.backup.g.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class d
{
  long hhu;
  private long jMv;
  boolean jMw;
  
  public d()
  {
    GMTrace.i(14730127212544L, 109748);
    this.jMv = -1L;
    this.hhu = 0L;
    this.jMw = false;
    GMTrace.o(14730127212544L, 109748);
  }
  
  public final void begin()
  {
    GMTrace.i(14730261430272L, 109749);
    w.d("MicroMsg.BackupRecoverFaster", "begin");
    if (a.afe().aff().gRs != null)
    {
      this.jMv = a.afe().aff().gRs.cA(Thread.currentThread().getId());
      this.jMw = true;
    }
    this.hhu = bg.Pp();
    GMTrace.o(14730261430272L, 109749);
  }
  
  public final void end()
  {
    GMTrace.i(14730395648000L, 109750);
    if ((this.jMw) && (a.afe().aff().gRs != null))
    {
      a.afe().aff().gRs.aJ(this.jMv);
      this.jMw = false;
    }
    GMTrace.o(14730395648000L, 109750);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */