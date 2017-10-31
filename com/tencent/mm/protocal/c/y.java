package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class y
  extends com.tencent.mm.bl.a
{
  public String nxi;
  public String nxj;
  public String nxk;
  public String nxl;
  public int tsl;
  
  public y()
  {
    GMTrace.i(3629247365120L, 27040);
    GMTrace.o(3629247365120L, 27040);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3629381582848L, 27041);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.tsl);
      if (this.nxi != null) {
        paramVarArgs.e(2, this.nxi);
      }
      if (this.nxj != null) {
        paramVarArgs.e(3, this.nxj);
      }
      if (this.nxk != null) {
        paramVarArgs.e(4, this.nxk);
      }
      if (this.nxl != null) {
        paramVarArgs.e(5, this.nxl);
      }
      GMTrace.o(3629381582848L, 27041);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.tsl) + 0;
      paramInt = i;
      if (this.nxi != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.nxi);
      }
      i = paramInt;
      if (this.nxj != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.nxj);
      }
      paramInt = i;
      if (this.nxk != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.nxk);
      }
      i = paramInt;
      if (this.nxl != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.nxl);
      }
      GMTrace.o(3629381582848L, 27041);
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
      GMTrace.o(3629381582848L, 27041);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      y localy = (y)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3629381582848L, 27041);
        return -1;
      case 1: 
        localy.tsl = locala.xSv.nm();
        GMTrace.o(3629381582848L, 27041);
        return 0;
      case 2: 
        localy.nxi = locala.xSv.readString();
        GMTrace.o(3629381582848L, 27041);
        return 0;
      case 3: 
        localy.nxj = locala.xSv.readString();
        GMTrace.o(3629381582848L, 27041);
        return 0;
      case 4: 
        localy.nxk = locala.xSv.readString();
        GMTrace.o(3629381582848L, 27041);
        return 0;
      }
      localy.nxl = locala.xSv.readString();
      GMTrace.o(3629381582848L, 27041);
      return 0;
    }
    GMTrace.o(3629381582848L, 27041);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */