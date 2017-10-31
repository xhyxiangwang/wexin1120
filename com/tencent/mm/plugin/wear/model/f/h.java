package com.tencent.mm.plugin.wear.model.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.protocal.c.bqe;
import com.tencent.mm.protocal.c.bqf;
import com.tencent.mm.x.n;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class h
  extends b
{
  private long fRn;
  private String fRo;
  private List<String> fRp;
  private long fxK;
  
  public h(long paramLong1, long paramLong2, String paramString, List<String> paramList)
  {
    GMTrace.i(9190424707072L, 68474);
    this.fxK = paramLong1;
    this.fRn = paramLong2;
    this.fRo = paramString;
    this.fRp = paramList;
    GMTrace.o(9190424707072L, 68474);
  }
  
  public final String getName()
  {
    GMTrace.i(9190693142528L, 68476);
    GMTrace.o(9190693142528L, 68476);
    return "WearLuckyReceiveTask";
  }
  
  protected final void send()
  {
    GMTrace.i(9190558924800L, 68475);
    bqe localbqe = new bqe();
    localbqe.uFN = this.fRn;
    localbqe.uFM = this.fxK;
    localbqe.uFO = this.fRo;
    try
    {
      if (this.fRp != null)
      {
        Iterator localIterator = this.fRp.iterator();
        while (localIterator.hasNext())
        {
          String[] arrayOfString = ((String)localIterator.next()).split("=");
          bqf localbqf = new bqf();
          localbqf.uFL = arrayOfString[0];
          localbqf.jYc = arrayOfString[1];
          if (localbqf.jYc.startsWith("wxid")) {
            localbqf.jYc = n.fc(localbqf.jYc);
          }
          localbqf.uFN = Long.valueOf(arrayOfString[2]).longValue();
          localbqe.uFP.add(localbqf);
        }
      }
      return;
    }
    catch (Exception localException)
    {
      while (this.fRn > 0L)
      {
        com.tencent.mm.plugin.wear.model.c.a.jl(true);
        GMTrace.o(9190558924800L, 68475);
        return;
        com.tencent.mm.plugin.wear.model.a.bzo();
        r.a(20015, localException.toByteArray(), true);
      }
      com.tencent.mm.plugin.wear.model.c.a.jl(false);
      GMTrace.o(9190558924800L, 68475);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/f/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */