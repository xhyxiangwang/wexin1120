package com.tencent.mm.plugin.sns.data;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.amn;
import java.util.LinkedList;
import java.util.List;

public final class e
{
  public List<amn> fIU;
  public String nry;
  public int pYl;
  
  public e()
  {
    GMTrace.i(8793945538560L, 65520);
    this.fIU = new LinkedList();
    GMTrace.o(8793945538560L, 65520);
  }
  
  public e(amn paramamn)
  {
    GMTrace.i(8794079756288L, 65521);
    this.fIU = new LinkedList();
    this.fIU.add(paramamn);
    GMTrace.o(8794079756288L, 65521);
  }
  
  public e(List<amn> paramList)
  {
    GMTrace.i(8794213974016L, 65522);
    this.fIU = new LinkedList();
    this.fIU = paramList;
    GMTrace.o(8794213974016L, 65522);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/data/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */