package com.tencent.mm.plugin.qqmail.b;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class y
  extends com.tencent.mm.bl.a
{
  public String name;
  public long oGJ;
  public String oGK;
  public String path;
  public long size;
  public int state;
  
  public y()
  {
    GMTrace.i(5477157044224L, 40808);
    GMTrace.o(5477157044224L, 40808);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(5477291261952L, 40809);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.path == null) {
        throw new b("Not all required fields were included: path");
      }
      if (this.name == null) {
        throw new b("Not all required fields were included: name");
      }
      if (this.path != null) {
        paramVarArgs.e(1, this.path);
      }
      if (this.name != null) {
        paramVarArgs.e(2, this.name);
      }
      paramVarArgs.R(3, this.size);
      paramVarArgs.fd(4, this.state);
      paramVarArgs.R(5, this.oGJ);
      if (this.oGK != null) {
        paramVarArgs.e(6, this.oGK);
      }
      GMTrace.o(5477291261952L, 40809);
      return 0;
    }
    if (paramInt == 1) {
      if (this.path == null) {
        break label570;
      }
    }
    label570:
    for (paramInt = b.a.a.b.b.a.f(1, this.path) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.name != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.name);
      }
      i = i + b.a.a.a.Q(3, this.size) + b.a.a.a.fa(4, this.state) + b.a.a.a.Q(5, this.oGJ);
      paramInt = i;
      if (this.oGK != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.oGK);
      }
      GMTrace.o(5477291261952L, 40809);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.path == null) {
          throw new b("Not all required fields were included: path");
        }
        if (this.name == null) {
          throw new b("Not all required fields were included: name");
        }
        GMTrace.o(5477291261952L, 40809);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        y localy = (y)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(5477291261952L, 40809);
          return -1;
        case 1: 
          localy.path = locala.xSv.readString();
          GMTrace.o(5477291261952L, 40809);
          return 0;
        case 2: 
          localy.name = locala.xSv.readString();
          GMTrace.o(5477291261952L, 40809);
          return 0;
        case 3: 
          localy.size = locala.xSv.nn();
          GMTrace.o(5477291261952L, 40809);
          return 0;
        case 4: 
          localy.state = locala.xSv.nm();
          GMTrace.o(5477291261952L, 40809);
          return 0;
        case 5: 
          localy.oGJ = locala.xSv.nn();
          GMTrace.o(5477291261952L, 40809);
          return 0;
        }
        localy.oGK = locala.xSv.readString();
        GMTrace.o(5477291261952L, 40809);
        return 0;
      }
      GMTrace.o(5477291261952L, 40809);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */