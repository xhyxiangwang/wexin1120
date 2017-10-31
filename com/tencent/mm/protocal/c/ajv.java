package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ajv
  extends com.tencent.mm.bl.a
{
  public String tZT;
  public int tsx;
  public String ueO;
  public boolean ueP;
  public String ueQ;
  
  public ajv()
  {
    GMTrace.i(15352360599552L, 114384);
    GMTrace.o(15352360599552L, 114384);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15352494817280L, 114385);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.tsx);
      if (this.ueO != null) {
        paramVarArgs.e(2, this.ueO);
      }
      paramVarArgs.af(3, this.ueP);
      if (this.ueQ != null) {
        paramVarArgs.e(4, this.ueQ);
      }
      if (this.tZT != null) {
        paramVarArgs.e(5, this.tZT);
      }
      GMTrace.o(15352494817280L, 114385);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.tsx) + 0;
      paramInt = i;
      if (this.ueO != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ueO);
      }
      i = paramInt + (b.a.a.b.b.a.cK(3) + 1);
      paramInt = i;
      if (this.ueQ != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ueQ);
      }
      i = paramInt;
      if (this.tZT != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tZT);
      }
      GMTrace.o(15352494817280L, 114385);
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
      GMTrace.o(15352494817280L, 114385);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ajv localajv = (ajv)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(15352494817280L, 114385);
        return -1;
      case 1: 
        localajv.tsx = locala.xSv.nm();
        GMTrace.o(15352494817280L, 114385);
        return 0;
      case 2: 
        localajv.ueO = locala.xSv.readString();
        GMTrace.o(15352494817280L, 114385);
        return 0;
      case 3: 
        localajv.ueP = locala.cpH();
        GMTrace.o(15352494817280L, 114385);
        return 0;
      case 4: 
        localajv.ueQ = locala.xSv.readString();
        GMTrace.o(15352494817280L, 114385);
        return 0;
      }
      localajv.tZT = locala.xSv.readString();
      GMTrace.o(15352494817280L, 114385);
      return 0;
    }
    GMTrace.o(15352494817280L, 114385);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ajv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */