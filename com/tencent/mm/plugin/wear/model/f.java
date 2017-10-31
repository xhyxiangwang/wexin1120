package com.tencent.mm.plugin.wear.model;

import com.tencent.gmtrace.GMTrace;

public final class f
{
  public String fAJ;
  public String fwU;
  public int id;
  public int shP;
  a shQ;
  
  public f()
  {
    GMTrace.i(9187203481600L, 68450);
    this.fAJ = "";
    this.id = 0;
    this.fwU = "";
    this.shP = 0;
    GMTrace.o(9187203481600L, 68450);
  }
  
  protected final Object clone()
  {
    GMTrace.i(9187337699328L, 68451);
    f localf = new f();
    localf.id = this.id;
    localf.fAJ = this.fAJ;
    localf.fwU = this.fwU;
    localf.shP = this.shP;
    localf.shQ = this.shQ;
    GMTrace.o(9187337699328L, 68451);
    return localf;
  }
  
  public final String toString()
  {
    GMTrace.i(9187471917056L, 68452);
    String str = "WearNotification [talker=" + this.fAJ + ", id=" + this.id + ", md5=" + this.fwU + ", ignoreInWatch=" + this.shP + ", status=" + this.shQ + "]";
    GMTrace.o(9187471917056L, 68452);
    return str;
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(9186800828416L, 68447);
      shR = new a("INIT", 0);
      shS = new a("SHOWING", 1);
      shT = new a("IGNORE", 2);
      shU = new a("REPLY", 3);
      shV = new a[] { shR, shS, shT, shU };
      GMTrace.o(9186800828416L, 68447);
    }
    
    private a()
    {
      GMTrace.i(9186666610688L, 68446);
      GMTrace.o(9186666610688L, 68446);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */