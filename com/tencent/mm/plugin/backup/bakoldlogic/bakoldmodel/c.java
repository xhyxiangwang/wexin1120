package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bt.g;
import com.tencent.mm.plugin.backup.g.a;
import com.tencent.mm.sdk.platformtools.w;

public final class c
{
  private long hhu;
  private long jMv;
  boolean jMw;
  
  public c()
  {
    GMTrace.i(14732677349376L, 109767);
    this.jMv = -1L;
    this.hhu = 0L;
    this.jMw = false;
    GMTrace.o(14732677349376L, 109767);
  }
  
  public final void afs()
  {
    GMTrace.i(14733080002560L, 109770);
    long l = System.currentTimeMillis();
    if (l - this.hhu > 10000L)
    {
      end();
      begin();
      this.hhu = l;
    }
    GMTrace.o(14733080002560L, 109770);
  }
  
  public final void begin()
  {
    GMTrace.i(14732811567104L, 109768);
    w.d("MicroMsg.Recoverfaster", "begin");
    if (a.afe().aff().gRs != null)
    {
      this.jMv = a.afe().aff().gRs.cA(Thread.currentThread().getId());
      this.jMw = true;
    }
    this.hhu = System.currentTimeMillis();
    GMTrace.o(14732811567104L, 109768);
  }
  
  public final void end()
  {
    GMTrace.i(14732945784832L, 109769);
    if ((this.jMw) && (a.afe().aff().gRs != null))
    {
      a.afe().aff().gRs.aJ(this.jMv);
      this.jMw = false;
    }
    GMTrace.o(14732945784832L, 109769);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/bakoldmodel/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */