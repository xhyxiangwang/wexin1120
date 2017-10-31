package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class pu
  extends com.tencent.mm.bl.a
{
  public boolean tLw;
  public boolean tLx;
  public String tLy;
  
  public pu()
  {
    GMTrace.i(18812762062848L, 140166);
    GMTrace.o(18812762062848L, 140166);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18812896280576L, 140167);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.af(1, this.tLw);
      paramVarArgs.af(2, this.tLx);
      if (this.tLy != null) {
        paramVarArgs.e(3, this.tLy);
      }
      GMTrace.o(18812896280576L, 140167);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.b.b.a.cK(1) + 1 + 0 + (b.a.a.b.b.a.cK(2) + 1);
      paramInt = i;
      if (this.tLy != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.tLy);
      }
      GMTrace.o(18812896280576L, 140167);
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
      GMTrace.o(18812896280576L, 140167);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      pu localpu = (pu)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(18812896280576L, 140167);
        return -1;
      case 1: 
        localpu.tLw = locala.cpH();
        GMTrace.o(18812896280576L, 140167);
        return 0;
      case 2: 
        localpu.tLx = locala.cpH();
        GMTrace.o(18812896280576L, 140167);
        return 0;
      }
      localpu.tLy = locala.xSv.readString();
      GMTrace.o(18812896280576L, 140167);
      return 0;
    }
    GMTrace.o(18812896280576L, 140167);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/pu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */