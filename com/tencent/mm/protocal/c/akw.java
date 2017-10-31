package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class akw
  extends com.tencent.mm.bl.a
{
  public String loX;
  public double tBA;
  public double tBB;
  public String ufN;
  public String ufO;
  public String ufP;
  
  public akw()
  {
    GMTrace.i(3807488507904L, 28368);
    GMTrace.o(3807488507904L, 28368);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3807622725632L, 28369);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.a(1, this.tBB);
      paramVarArgs.a(2, this.tBA);
      if (this.loX != null) {
        paramVarArgs.e(3, this.loX);
      }
      if (this.ufN != null) {
        paramVarArgs.e(4, this.ufN);
      }
      if (this.ufO != null) {
        paramVarArgs.e(5, this.ufO);
      }
      if (this.ufP != null) {
        paramVarArgs.e(6, this.ufP);
      }
      GMTrace.o(3807622725632L, 28369);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.b.b.a.cK(1) + 8 + 0 + (b.a.a.b.b.a.cK(2) + 8);
      paramInt = i;
      if (this.loX != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.loX);
      }
      i = paramInt;
      if (this.ufN != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.ufN);
      }
      paramInt = i;
      if (this.ufO != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.ufO);
      }
      i = paramInt;
      if (this.ufP != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.ufP);
      }
      GMTrace.o(3807622725632L, 28369);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3807622725632L, 28369);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      akw localakw = (akw)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3807622725632L, 28369);
        return -1;
      case 1: 
        localakw.tBB = locala.xSv.readDouble();
        GMTrace.o(3807622725632L, 28369);
        return 0;
      case 2: 
        localakw.tBA = locala.xSv.readDouble();
        GMTrace.o(3807622725632L, 28369);
        return 0;
      case 3: 
        localakw.loX = locala.xSv.readString();
        GMTrace.o(3807622725632L, 28369);
        return 0;
      case 4: 
        localakw.ufN = locala.xSv.readString();
        GMTrace.o(3807622725632L, 28369);
        return 0;
      case 5: 
        localakw.ufO = locala.xSv.readString();
        GMTrace.o(3807622725632L, 28369);
        return 0;
      }
      localakw.ufP = locala.xSv.readString();
      GMTrace.o(3807622725632L, 28369);
      return 0;
    }
    GMTrace.o(3807622725632L, 28369);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/akw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */