package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class atv
  extends com.tencent.mm.bl.a
{
  public String fwU;
  public boolean upm;
  public int upn;
  public String url;
  public int version;
  
  public atv()
  {
    GMTrace.i(15351555293184L, 114378);
    GMTrace.o(15351555293184L, 114378);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15351689510912L, 114379);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.af(1, this.upm);
      if (this.url != null) {
        paramVarArgs.e(2, this.url);
      }
      if (this.fwU != null) {
        paramVarArgs.e(3, this.fwU);
      }
      paramVarArgs.fd(4, this.version);
      paramVarArgs.fd(5, this.upn);
      GMTrace.o(15351689510912L, 114379);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.b.b.a.cK(1) + 1 + 0;
      paramInt = i;
      if (this.url != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.url);
      }
      i = paramInt;
      if (this.fwU != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.fwU);
      }
      paramInt = b.a.a.a.fa(4, this.version);
      int j = b.a.a.a.fa(5, this.upn);
      GMTrace.o(15351689510912L, 114379);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(15351689510912L, 114379);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      atv localatv = (atv)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(15351689510912L, 114379);
        return -1;
      case 1: 
        localatv.upm = locala.cpH();
        GMTrace.o(15351689510912L, 114379);
        return 0;
      case 2: 
        localatv.url = locala.xSv.readString();
        GMTrace.o(15351689510912L, 114379);
        return 0;
      case 3: 
        localatv.fwU = locala.xSv.readString();
        GMTrace.o(15351689510912L, 114379);
        return 0;
      case 4: 
        localatv.version = locala.xSv.nm();
        GMTrace.o(15351689510912L, 114379);
        return 0;
      }
      localatv.upn = locala.xSv.nm();
      GMTrace.o(15351689510912L, 114379);
      return 0;
    }
    GMTrace.o(15351689510912L, 114379);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/atv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */