package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bqa
  extends com.tencent.mm.bl.a
{
  public int mGz;
  public String uDd;
  
  public bqa()
  {
    GMTrace.i(4034316468224L, 30058);
    GMTrace.o(4034316468224L, 30058);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4034450685952L, 30059);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uDd == null) {
        throw new b("Not all required fields were included: Data");
      }
      paramVarArgs.fd(1, this.mGz);
      if (this.uDd != null) {
        paramVarArgs.e(2, this.uDd);
      }
      GMTrace.o(4034450685952L, 30059);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.mGz) + 0;
      paramInt = i;
      if (this.uDd != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uDd);
      }
      GMTrace.o(4034450685952L, 30059);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.uDd == null) {
        throw new b("Not all required fields were included: Data");
      }
      GMTrace.o(4034450685952L, 30059);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bqa localbqa = (bqa)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4034450685952L, 30059);
        return -1;
      case 1: 
        localbqa.mGz = locala.xSv.nm();
        GMTrace.o(4034450685952L, 30059);
        return 0;
      }
      localbqa.uDd = locala.xSv.readString();
      GMTrace.o(4034450685952L, 30059);
      return 0;
    }
    GMTrace.o(4034450685952L, 30059);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bqa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */