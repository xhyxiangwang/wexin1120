package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class amu
  extends com.tencent.mm.bl.a
{
  public String fuw;
  public String osy;
  public int tSa;
  public String tSb;
  public int uiM;
  public int uiN;
  
  public amu()
  {
    GMTrace.i(17877532934144L, 133198);
    GMTrace.o(17877532934144L, 133198);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17877667151872L, 133199);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fuw == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.osy == null) {
        throw new b("Not all required fields were included: ThumbUrl");
      }
      paramVarArgs.fd(1, this.uiM);
      if (this.fuw != null) {
        paramVarArgs.e(2, this.fuw);
      }
      if (this.osy != null) {
        paramVarArgs.e(3, this.osy);
      }
      paramVarArgs.fd(4, this.tSa);
      if (this.tSb != null) {
        paramVarArgs.e(5, this.tSb);
      }
      paramVarArgs.fd(6, this.uiN);
      GMTrace.o(17877667151872L, 133199);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.uiM) + 0;
      paramInt = i;
      if (this.fuw != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.fuw);
      }
      i = paramInt;
      if (this.osy != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.osy);
      }
      i += b.a.a.a.fa(4, this.tSa);
      paramInt = i;
      if (this.tSb != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tSb);
      }
      i = b.a.a.a.fa(6, this.uiN);
      GMTrace.o(17877667151872L, 133199);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.fuw == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.osy == null) {
        throw new b("Not all required fields were included: ThumbUrl");
      }
      GMTrace.o(17877667151872L, 133199);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      amu localamu = (amu)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(17877667151872L, 133199);
        return -1;
      case 1: 
        localamu.uiM = locala.xSv.nm();
        GMTrace.o(17877667151872L, 133199);
        return 0;
      case 2: 
        localamu.fuw = locala.xSv.readString();
        GMTrace.o(17877667151872L, 133199);
        return 0;
      case 3: 
        localamu.osy = locala.xSv.readString();
        GMTrace.o(17877667151872L, 133199);
        return 0;
      case 4: 
        localamu.tSa = locala.xSv.nm();
        GMTrace.o(17877667151872L, 133199);
        return 0;
      case 5: 
        localamu.tSb = locala.xSv.readString();
        GMTrace.o(17877667151872L, 133199);
        return 0;
      }
      localamu.uiN = locala.xSv.nm();
      GMTrace.o(17877667151872L, 133199);
      return 0;
    }
    GMTrace.o(17877667151872L, 133199);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/amu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */