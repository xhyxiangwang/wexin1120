package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class apj
  extends com.tencent.mm.bl.a
{
  public String desc;
  public String iTH;
  public String scope;
  public int ulL;
  
  public apj()
  {
    GMTrace.i(17878338240512L, 133204);
    GMTrace.o(17878338240512L, 133204);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17878472458240L, 133205);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.scope != null) {
        paramVarArgs.e(1, this.scope);
      }
      if (this.desc != null) {
        paramVarArgs.e(2, this.desc);
      }
      paramVarArgs.fd(3, this.ulL);
      if (this.iTH != null) {
        paramVarArgs.e(4, this.iTH);
      }
      GMTrace.o(17878472458240L, 133205);
      return 0;
    }
    if (paramInt == 1) {
      if (this.scope == null) {
        break label408;
      }
    }
    label408:
    for (paramInt = b.a.a.b.b.a.f(1, this.scope) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.desc != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.desc);
      }
      i += b.a.a.a.fa(3, this.ulL);
      paramInt = i;
      if (this.iTH != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.iTH);
      }
      GMTrace.o(17878472458240L, 133205);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(17878472458240L, 133205);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        apj localapj = (apj)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(17878472458240L, 133205);
          return -1;
        case 1: 
          localapj.scope = locala.xSv.readString();
          GMTrace.o(17878472458240L, 133205);
          return 0;
        case 2: 
          localapj.desc = locala.xSv.readString();
          GMTrace.o(17878472458240L, 133205);
          return 0;
        case 3: 
          localapj.ulL = locala.xSv.nm();
          GMTrace.o(17878472458240L, 133205);
          return 0;
        }
        localapj.iTH = locala.xSv.readString();
        GMTrace.o(17878472458240L, 133205);
        return 0;
      }
      GMTrace.o(17878472458240L, 133205);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/apj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */