package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ao
  extends com.tencent.mm.bl.a
{
  public String kor;
  public String kos;
  public String kot;
  public String kou;
  
  public ao()
  {
    GMTrace.i(16868484055040L, 125680);
    GMTrace.o(16868484055040L, 125680);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16868618272768L, 125681);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.kor != null) {
        paramVarArgs.e(1, this.kor);
      }
      if (this.kos != null) {
        paramVarArgs.e(2, this.kos);
      }
      if (this.kot != null) {
        paramVarArgs.e(3, this.kot);
      }
      if (this.kou != null) {
        paramVarArgs.e(4, this.kou);
      }
      GMTrace.o(16868618272768L, 125681);
      return 0;
    }
    if (paramInt == 1) {
      if (this.kor == null) {
        break label424;
      }
    }
    label424:
    for (int i = b.a.a.b.b.a.f(1, this.kor) + 0;; i = 0)
    {
      paramInt = i;
      if (this.kos != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.kos);
      }
      i = paramInt;
      if (this.kot != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.kot);
      }
      paramInt = i;
      if (this.kou != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.kou);
      }
      GMTrace.o(16868618272768L, 125681);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(16868618272768L, 125681);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ao localao = (ao)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(16868618272768L, 125681);
          return -1;
        case 1: 
          localao.kor = locala.xSv.readString();
          GMTrace.o(16868618272768L, 125681);
          return 0;
        case 2: 
          localao.kos = locala.xSv.readString();
          GMTrace.o(16868618272768L, 125681);
          return 0;
        case 3: 
          localao.kot = locala.xSv.readString();
          GMTrace.o(16868618272768L, 125681);
          return 0;
        }
        localao.kou = locala.xSv.readString();
        GMTrace.o(16868618272768L, 125681);
        return 0;
      }
      GMTrace.o(16868618272768L, 125681);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */