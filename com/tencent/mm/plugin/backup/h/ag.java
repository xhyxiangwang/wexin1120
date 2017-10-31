package com.tencent.mm.plugin.backup.h;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ag
  extends com.tencent.mm.bl.a
{
  public String jWO;
  public LinkedList<Long> jYk;
  public LinkedList<String> jYl;
  public LinkedList<String> jYm;
  
  public ag()
  {
    GMTrace.i(14833072209920L, 110515);
    this.jYk = new LinkedList();
    this.jYl = new LinkedList();
    this.jYm = new LinkedList();
    GMTrace.o(14833072209920L, 110515);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14833206427648L, 110516);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jWO == null) {
        throw new b("Not all required fields were included: BakChatName");
      }
      paramVarArgs.d(1, 3, this.jYk);
      paramVarArgs.d(2, 1, this.jYl);
      paramVarArgs.d(3, 1, this.jYm);
      if (this.jWO != null) {
        paramVarArgs.e(4, this.jWO);
      }
      GMTrace.o(14833206427648L, 110516);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.c(1, 3, this.jYk) + 0 + b.a.a.a.c(2, 1, this.jYl) + b.a.a.a.c(3, 1, this.jYm);
      paramInt = i;
      if (this.jWO != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.jWO);
      }
      GMTrace.o(14833206427648L, 110516);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.jYk.clear();
      this.jYl.clear();
      this.jYm.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.jWO == null) {
        throw new b("Not all required fields were included: BakChatName");
      }
      GMTrace.o(14833206427648L, 110516);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ag localag = (ag)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(14833206427648L, 110516);
        return -1;
      case 1: 
        localag.jYk.add(Long.valueOf(locala.xSv.nn()));
        GMTrace.o(14833206427648L, 110516);
        return 0;
      case 2: 
        localag.jYl.add(locala.xSv.readString());
        GMTrace.o(14833206427648L, 110516);
        return 0;
      case 3: 
        localag.jYm.add(locala.xSv.readString());
        GMTrace.o(14833206427648L, 110516);
        return 0;
      }
      localag.jWO = locala.xSv.readString();
      GMTrace.o(14833206427648L, 110516);
      return 0;
    }
    GMTrace.o(14833206427648L, 110516);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/h/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */