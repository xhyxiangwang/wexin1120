package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class dq
  extends com.tencent.mm.bl.a
{
  public String scope;
  public int state;
  public String txn;
  
  public dq()
  {
    GMTrace.i(4014318026752L, 29909);
    GMTrace.o(4014318026752L, 29909);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4014452244480L, 29910);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.scope != null) {
        paramVarArgs.e(1, this.scope);
      }
      if (this.txn != null) {
        paramVarArgs.e(2, this.txn);
      }
      paramVarArgs.fd(3, this.state);
      GMTrace.o(4014452244480L, 29910);
      return 0;
    }
    if (paramInt == 1) {
      if (this.scope == null) {
        break label354;
      }
    }
    label354:
    for (paramInt = b.a.a.b.b.a.f(1, this.scope) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.txn != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.txn);
      }
      paramInt = b.a.a.a.fa(3, this.state);
      GMTrace.o(4014452244480L, 29910);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(4014452244480L, 29910);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        dq localdq = (dq)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(4014452244480L, 29910);
          return -1;
        case 1: 
          localdq.scope = locala.xSv.readString();
          GMTrace.o(4014452244480L, 29910);
          return 0;
        case 2: 
          localdq.txn = locala.xSv.readString();
          GMTrace.o(4014452244480L, 29910);
          return 0;
        }
        localdq.state = locala.xSv.nm();
        GMTrace.o(4014452244480L, 29910);
        return 0;
      }
      GMTrace.o(4014452244480L, 29910);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/dq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */