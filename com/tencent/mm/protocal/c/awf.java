package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class awf
  extends com.tencent.mm.bl.a
{
  public String loX;
  public String tzi;
  public int upZ;
  
  public awf()
  {
    GMTrace.i(3978213457920L, 29640);
    GMTrace.o(3978213457920L, 29640);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3978347675648L, 29641);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.loX != null) {
        paramVarArgs.e(1, this.loX);
      }
      if (this.tzi != null) {
        paramVarArgs.e(2, this.tzi);
      }
      paramVarArgs.fd(3, this.upZ);
      GMTrace.o(3978347675648L, 29641);
      return 0;
    }
    if (paramInt == 1) {
      if (this.loX == null) {
        break label354;
      }
    }
    label354:
    for (paramInt = b.a.a.b.b.a.f(1, this.loX) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.tzi != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.tzi);
      }
      paramInt = b.a.a.a.fa(3, this.upZ);
      GMTrace.o(3978347675648L, 29641);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3978347675648L, 29641);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        awf localawf = (awf)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3978347675648L, 29641);
          return -1;
        case 1: 
          localawf.loX = locala.xSv.readString();
          GMTrace.o(3978347675648L, 29641);
          return 0;
        case 2: 
          localawf.tzi = locala.xSv.readString();
          GMTrace.o(3978347675648L, 29641);
          return 0;
        }
        localawf.upZ = locala.xSv.nm();
        GMTrace.o(3978347675648L, 29641);
        return 0;
      }
      GMTrace.o(3978347675648L, 29641);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/awf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */