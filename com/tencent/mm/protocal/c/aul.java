package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aul
  extends com.tencent.mm.bl.a
{
  public String loX;
  public String tOe;
  public int upZ;
  
  public aul()
  {
    GMTrace.i(4014049591296L, 29907);
    GMTrace.o(4014049591296L, 29907);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4014183809024L, 29908);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.loX != null) {
        paramVarArgs.e(1, this.loX);
      }
      paramVarArgs.fd(2, this.upZ);
      if (this.tOe != null) {
        paramVarArgs.e(3, this.tOe);
      }
      GMTrace.o(4014183809024L, 29908);
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
      int i = paramInt + b.a.a.a.fa(2, this.upZ);
      paramInt = i;
      if (this.tOe != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.tOe);
      }
      GMTrace.o(4014183809024L, 29908);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(4014183809024L, 29908);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        aul localaul = (aul)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(4014183809024L, 29908);
          return -1;
        case 1: 
          localaul.loX = locala.xSv.readString();
          GMTrace.o(4014183809024L, 29908);
          return 0;
        case 2: 
          localaul.upZ = locala.xSv.nm();
          GMTrace.o(4014183809024L, 29908);
          return 0;
        }
        localaul.tOe = locala.xSv.readString();
        GMTrace.o(4014183809024L, 29908);
        return 0;
      }
      GMTrace.o(4014183809024L, 29908);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aul.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */