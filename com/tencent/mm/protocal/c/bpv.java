package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bpv
  extends com.tencent.mm.bl.a
{
  public String fuw;
  public int mGz;
  public String ovi;
  
  public bpv()
  {
    GMTrace.i(3870436622336L, 28837);
    GMTrace.o(3870436622336L, 28837);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3870570840064L, 28838);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fuw == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.ovi == null) {
        throw new b("Not all required fields were included: Content");
      }
      paramVarArgs.fd(1, this.mGz);
      if (this.fuw != null) {
        paramVarArgs.e(2, this.fuw);
      }
      if (this.ovi != null) {
        paramVarArgs.e(3, this.ovi);
      }
      GMTrace.o(3870570840064L, 28838);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.mGz) + 0;
      paramInt = i;
      if (this.fuw != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.fuw);
      }
      i = paramInt;
      if (this.ovi != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ovi);
      }
      GMTrace.o(3870570840064L, 28838);
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
      if (this.fuw == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.ovi == null) {
        throw new b("Not all required fields were included: Content");
      }
      GMTrace.o(3870570840064L, 28838);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bpv localbpv = (bpv)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3870570840064L, 28838);
        return -1;
      case 1: 
        localbpv.mGz = locala.xSv.nm();
        GMTrace.o(3870570840064L, 28838);
        return 0;
      case 2: 
        localbpv.fuw = locala.xSv.readString();
        GMTrace.o(3870570840064L, 28838);
        return 0;
      }
      localbpv.ovi = locala.xSv.readString();
      GMTrace.o(3870570840064L, 28838);
      return 0;
    }
    GMTrace.o(3870570840064L, 28838);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bpv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */