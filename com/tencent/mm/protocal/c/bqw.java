package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bqw
  extends com.tencent.mm.bl.a
{
  public String tCS;
  public String tLN;
  public String tXq;
  public int ttY;
  public String uFL;
  
  public bqw()
  {
    GMTrace.i(3891508805632L, 28994);
    GMTrace.o(3891508805632L, 28994);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3891643023360L, 28995);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uFL == null) {
        throw new b("Not all required fields were included: Talker");
      }
      if (this.tXq == null) {
        throw new b("Not all required fields were included: Text");
      }
      if (this.tLN == null) {
        throw new b("Not all required fields were included: MD5");
      }
      if (this.tCS == null) {
        throw new b("Not all required fields were included: ProductId");
      }
      if (this.uFL != null) {
        paramVarArgs.e(1, this.uFL);
      }
      if (this.tXq != null) {
        paramVarArgs.e(2, this.tXq);
      }
      if (this.tLN != null) {
        paramVarArgs.e(3, this.tLN);
      }
      if (this.tCS != null) {
        paramVarArgs.e(4, this.tCS);
      }
      paramVarArgs.fd(5, this.ttY);
      GMTrace.o(3891643023360L, 28995);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uFL == null) {
        break label618;
      }
    }
    label618:
    for (int i = b.a.a.b.b.a.f(1, this.uFL) + 0;; i = 0)
    {
      paramInt = i;
      if (this.tXq != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tXq);
      }
      i = paramInt;
      if (this.tLN != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tLN);
      }
      paramInt = i;
      if (this.tCS != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tCS);
      }
      i = b.a.a.a.fa(5, this.ttY);
      GMTrace.o(3891643023360L, 28995);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.uFL == null) {
          throw new b("Not all required fields were included: Talker");
        }
        if (this.tXq == null) {
          throw new b("Not all required fields were included: Text");
        }
        if (this.tLN == null) {
          throw new b("Not all required fields were included: MD5");
        }
        if (this.tCS == null) {
          throw new b("Not all required fields were included: ProductId");
        }
        GMTrace.o(3891643023360L, 28995);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bqw localbqw = (bqw)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3891643023360L, 28995);
          return -1;
        case 1: 
          localbqw.uFL = locala.xSv.readString();
          GMTrace.o(3891643023360L, 28995);
          return 0;
        case 2: 
          localbqw.tXq = locala.xSv.readString();
          GMTrace.o(3891643023360L, 28995);
          return 0;
        case 3: 
          localbqw.tLN = locala.xSv.readString();
          GMTrace.o(3891643023360L, 28995);
          return 0;
        case 4: 
          localbqw.tCS = locala.xSv.readString();
          GMTrace.o(3891643023360L, 28995);
          return 0;
        }
        localbqw.ttY = locala.xSv.nm();
        GMTrace.o(3891643023360L, 28995);
        return 0;
      }
      GMTrace.o(3891643023360L, 28995);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bqw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */