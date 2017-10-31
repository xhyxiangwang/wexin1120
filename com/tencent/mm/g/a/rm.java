package com.tencent.mm.g.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.sdk.b.b;
import java.util.List;

public final class rm
  extends b
{
  public a fPt;
  public b fPu;
  
  public rm()
  {
    this((byte)0);
    GMTrace.i(18644587249664L, 138913);
    GMTrace.o(18644587249664L, 138913);
  }
  
  private rm(byte paramByte)
  {
    GMTrace.i(18644721467392L, 138914);
    this.fPt = new a();
    this.fPu = new b();
    this.uLs = false;
    this.fwM = null;
    GMTrace.o(18644721467392L, 138914);
  }
  
  public static final class a
  {
    public k fPv;
    
    public a()
    {
      GMTrace.i(18644453031936L, 138912);
      GMTrace.o(18644453031936L, 138912);
    }
  }
  
  public static final class b
  {
    public List fPw;
    public int state;
    
    public b()
    {
      GMTrace.i(18645258338304L, 138918);
      this.state = 0;
      GMTrace.o(18645258338304L, 138918);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/a/rm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */