package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bqq
  extends com.tencent.mm.bl.a
{
  public String uEM;
  public com.tencent.mm.bl.b uGb;
  public com.tencent.mm.bl.b uGc;
  public String uGd;
  public String uGe;
  public int uxA;
  
  public bqq()
  {
    GMTrace.i(3846814302208L, 28661);
    GMTrace.o(3846814302208L, 28661);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3846948519936L, 28662);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uEM == null) {
        throw new b.a.a.b("Not all required fields were included: Msg");
      }
      paramVarArgs.fd(1, this.uxA);
      if (this.uEM != null) {
        paramVarArgs.e(2, this.uEM);
      }
      if (this.uGb != null) {
        paramVarArgs.b(3, this.uGb);
      }
      if (this.uGc != null) {
        paramVarArgs.b(4, this.uGc);
      }
      if (this.uGd != null) {
        paramVarArgs.e(5, this.uGd);
      }
      if (this.uGe != null) {
        paramVarArgs.e(6, this.uGe);
      }
      GMTrace.o(3846948519936L, 28662);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.uxA) + 0;
      paramInt = i;
      if (this.uEM != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uEM);
      }
      i = paramInt;
      if (this.uGb != null) {
        i = paramInt + b.a.a.a.a(3, this.uGb);
      }
      paramInt = i;
      if (this.uGc != null) {
        paramInt = i + b.a.a.a.a(4, this.uGc);
      }
      i = paramInt;
      if (this.uGd != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uGd);
      }
      paramInt = i;
      if (this.uGe != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.uGe);
      }
      GMTrace.o(3846948519936L, 28662);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.uEM == null) {
        throw new b.a.a.b("Not all required fields were included: Msg");
      }
      GMTrace.o(3846948519936L, 28662);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bqq localbqq = (bqq)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3846948519936L, 28662);
        return -1;
      case 1: 
        localbqq.uxA = locala.xSv.nm();
        GMTrace.o(3846948519936L, 28662);
        return 0;
      case 2: 
        localbqq.uEM = locala.xSv.readString();
        GMTrace.o(3846948519936L, 28662);
        return 0;
      case 3: 
        localbqq.uGb = locala.cpI();
        GMTrace.o(3846948519936L, 28662);
        return 0;
      case 4: 
        localbqq.uGc = locala.cpI();
        GMTrace.o(3846948519936L, 28662);
        return 0;
      case 5: 
        localbqq.uGd = locala.xSv.readString();
        GMTrace.o(3846948519936L, 28662);
        return 0;
      }
      localbqq.uGe = locala.xSv.readString();
      GMTrace.o(3846948519936L, 28662);
      return 0;
    }
    GMTrace.o(3846948519936L, 28662);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bqq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */