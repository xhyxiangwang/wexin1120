package com.tencent.mm.g.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.sdk.b.b;

public final class cr
  extends b
{
  public a fxa;
  public b fxb;
  
  public cr()
  {
    this((byte)0);
    GMTrace.i(4196585701376L, 31267);
    GMTrace.o(4196585701376L, 31267);
  }
  
  private cr(byte paramByte)
  {
    GMTrace.i(4196719919104L, 31268);
    this.fxa = new a();
    this.fxb = new b();
    this.uLs = false;
    this.fwM = null;
    GMTrace.o(4196719919104L, 31268);
  }
  
  public static final class a
  {
    public String fxc;
    public int fxd;
    public k fxe;
    public int opType;
    
    public a()
    {
      GMTrace.i(4236179931136L, 31562);
      this.fxd = 0;
      this.opType = 0;
      GMTrace.o(4236179931136L, 31562);
    }
  }
  
  public static final class b
  {
    public k fxe;
    
    public b()
    {
      GMTrace.i(4287182667776L, 31942);
      GMTrace.o(4287182667776L, 31942);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/a/cr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */