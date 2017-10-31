package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class te
  extends com.tencent.mm.bl.a
{
  public int aHC;
  public String svi;
  public String tQH;
  
  public te()
  {
    GMTrace.i(3943585284096L, 29382);
    GMTrace.o(3943585284096L, 29382);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3943719501824L, 29383);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.svi == null) {
        throw new b("Not all required fields were included: tagName");
      }
      if (this.tQH == null) {
        throw new b("Not all required fields were included: tagPinYin");
      }
      if (this.svi != null) {
        paramVarArgs.e(1, this.svi);
      }
      if (this.tQH != null) {
        paramVarArgs.e(2, this.tQH);
      }
      paramVarArgs.fd(3, this.aHC);
      GMTrace.o(3943719501824L, 29383);
      return 0;
    }
    if (paramInt == 1) {
      if (this.svi == null) {
        break label422;
      }
    }
    label422:
    for (paramInt = b.a.a.b.b.a.f(1, this.svi) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.tQH != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.tQH);
      }
      paramInt = b.a.a.a.fa(3, this.aHC);
      GMTrace.o(3943719501824L, 29383);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.svi == null) {
          throw new b("Not all required fields were included: tagName");
        }
        if (this.tQH == null) {
          throw new b("Not all required fields were included: tagPinYin");
        }
        GMTrace.o(3943719501824L, 29383);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        te localte = (te)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3943719501824L, 29383);
          return -1;
        case 1: 
          localte.svi = locala.xSv.readString();
          GMTrace.o(3943719501824L, 29383);
          return 0;
        case 2: 
          localte.tQH = locala.xSv.readString();
          GMTrace.o(3943719501824L, 29383);
          return 0;
        }
        localte.aHC = locala.xSv.nm();
        GMTrace.o(3943719501824L, 29383);
        return 0;
      }
      GMTrace.o(3943719501824L, 29383);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/te.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */