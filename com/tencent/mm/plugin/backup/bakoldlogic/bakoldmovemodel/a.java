package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel;

import com.tencent.gmtrace.GMTrace;

public final class a
  extends com.tencent.mm.plugin.backup.a.e
{
  private static a jTs;
  private com.tencent.mm.plugin.backup.b.a jNk;
  private f jTt;
  private e jTu;
  private g jTv;
  String jTw;
  
  public a()
  {
    GMTrace.i(14744085856256L, 109852);
    this.jTw = "tickit";
    GMTrace.o(14744085856256L, 109852);
  }
  
  public static a aft()
  {
    GMTrace.i(14744220073984L, 109853);
    if (jTs == null)
    {
      locala = new a();
      jTs = locala;
      a(locala);
    }
    a locala = jTs;
    GMTrace.o(14744220073984L, 109853);
    return locala;
  }
  
  public final void adA()
  {
    GMTrace.i(14744354291712L, 109854);
    jTs = null;
    GMTrace.o(14744354291712L, 109854);
  }
  
  public final void adH()
  {
    GMTrace.i(14745159598080L, 109860);
    GMTrace.o(14745159598080L, 109860);
  }
  
  public final void adI()
  {
    GMTrace.i(14745293815808L, 109861);
    GMTrace.o(14745293815808L, 109861);
  }
  
  public final com.tencent.mm.plugin.backup.b.a aeg()
  {
    GMTrace.i(14744622727168L, 109856);
    if (this.jNk == null) {
      this.jNk = new com.tencent.mm.plugin.backup.b.a();
    }
    com.tencent.mm.plugin.backup.b.a locala = this.jNk;
    GMTrace.o(14744622727168L, 109856);
    return locala;
  }
  
  public final f afu()
  {
    GMTrace.i(14744756944896L, 109857);
    if (this.jTt == null) {
      this.jTt = new f();
    }
    f localf = this.jTt;
    GMTrace.o(14744756944896L, 109857);
    return localf;
  }
  
  public final e afv()
  {
    GMTrace.i(14744891162624L, 109858);
    if (this.jTu == null) {
      this.jTu = new e();
    }
    e locale = this.jTu;
    GMTrace.o(14744891162624L, 109858);
    return locale;
  }
  
  public final g afw()
  {
    GMTrace.i(14745025380352L, 109859);
    if (this.jTv == null) {
      this.jTv = new g();
    }
    g localg = this.jTv;
    GMTrace.o(14745025380352L, 109859);
    return localg;
  }
  
  public final void i(Object... paramVarArgs)
  {
    GMTrace.i(14744488509440L, 109855);
    GMTrace.o(14744488509440L, 109855);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */