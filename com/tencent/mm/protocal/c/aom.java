package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aom
  extends com.tencent.mm.bl.a
{
  public String path;
  public int tCg;
  public String uky;
  public String ukz;
  public String username;
  
  public aom()
  {
    GMTrace.i(3796751089664L, 28288);
    GMTrace.o(3796751089664L, 28288);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3796885307392L, 28289);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.username != null) {
        paramVarArgs.e(1, this.username);
      }
      if (this.uky != null) {
        paramVarArgs.e(2, this.uky);
      }
      if (this.ukz != null) {
        paramVarArgs.e(3, this.ukz);
      }
      if (this.path != null) {
        paramVarArgs.e(4, this.path);
      }
      paramVarArgs.fd(5, this.tCg);
      GMTrace.o(3796885307392L, 28289);
      return 0;
    }
    if (paramInt == 1) {
      if (this.username == null) {
        break label482;
      }
    }
    label482:
    for (int i = b.a.a.b.b.a.f(1, this.username) + 0;; i = 0)
    {
      paramInt = i;
      if (this.uky != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uky);
      }
      i = paramInt;
      if (this.ukz != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ukz);
      }
      paramInt = i;
      if (this.path != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.path);
      }
      i = b.a.a.a.fa(5, this.tCg);
      GMTrace.o(3796885307392L, 28289);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3796885307392L, 28289);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        aom localaom = (aom)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3796885307392L, 28289);
          return -1;
        case 1: 
          localaom.username = locala.xSv.readString();
          GMTrace.o(3796885307392L, 28289);
          return 0;
        case 2: 
          localaom.uky = locala.xSv.readString();
          GMTrace.o(3796885307392L, 28289);
          return 0;
        case 3: 
          localaom.ukz = locala.xSv.readString();
          GMTrace.o(3796885307392L, 28289);
          return 0;
        case 4: 
          localaom.path = locala.xSv.readString();
          GMTrace.o(3796885307392L, 28289);
          return 0;
        }
        localaom.tCg = locala.xSv.nm();
        GMTrace.o(3796885307392L, 28289);
        return 0;
      }
      GMTrace.o(3796885307392L, 28289);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aom.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */