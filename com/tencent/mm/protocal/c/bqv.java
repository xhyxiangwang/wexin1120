package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bqv
  extends com.tencent.mm.bl.a
{
  public String tCS;
  public String tLN;
  public int ttY;
  public String uFL;
  
  public bqv()
  {
    GMTrace.i(3711791267840L, 27655);
    GMTrace.o(3711791267840L, 27655);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3711925485568L, 27656);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uFL == null) {
        throw new b("Not all required fields were included: Talker");
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
      if (this.tLN != null) {
        paramVarArgs.e(2, this.tLN);
      }
      if (this.tCS != null) {
        paramVarArgs.e(3, this.tCS);
      }
      paramVarArgs.fd(4, this.ttY);
      GMTrace.o(3711925485568L, 27656);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uFL == null) {
        break label522;
      }
    }
    label522:
    for (int i = b.a.a.b.b.a.f(1, this.uFL) + 0;; i = 0)
    {
      paramInt = i;
      if (this.tLN != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tLN);
      }
      i = paramInt;
      if (this.tCS != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tCS);
      }
      paramInt = b.a.a.a.fa(4, this.ttY);
      GMTrace.o(3711925485568L, 27656);
      return i + paramInt;
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
        if (this.tLN == null) {
          throw new b("Not all required fields were included: MD5");
        }
        if (this.tCS == null) {
          throw new b("Not all required fields were included: ProductId");
        }
        GMTrace.o(3711925485568L, 27656);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bqv localbqv = (bqv)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3711925485568L, 27656);
          return -1;
        case 1: 
          localbqv.uFL = locala.xSv.readString();
          GMTrace.o(3711925485568L, 27656);
          return 0;
        case 2: 
          localbqv.tLN = locala.xSv.readString();
          GMTrace.o(3711925485568L, 27656);
          return 0;
        case 3: 
          localbqv.tCS = locala.xSv.readString();
          GMTrace.o(3711925485568L, 27656);
          return 0;
        }
        localbqv.ttY = locala.xSv.nm();
        GMTrace.o(3711925485568L, 27656);
        return 0;
      }
      GMTrace.o(3711925485568L, 27656);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bqv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */