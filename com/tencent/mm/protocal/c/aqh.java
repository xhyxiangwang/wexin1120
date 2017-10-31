package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aqh
  extends com.tencent.mm.bl.a
{
  public String fMv;
  public String kpf;
  public int umy;
  public int umz;
  
  public aqh()
  {
    GMTrace.i(18813030498304L, 140168);
    GMTrace.o(18813030498304L, 140168);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18813164716032L, 140169);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fMv != null) {
        paramVarArgs.e(1, this.fMv);
      }
      if (this.kpf != null) {
        paramVarArgs.e(2, this.kpf);
      }
      paramVarArgs.fd(3, this.umy);
      paramVarArgs.fd(4, this.umz);
      GMTrace.o(18813164716032L, 140169);
      return 0;
    }
    if (paramInt == 1) {
      if (this.fMv == null) {
        break label396;
      }
    }
    label396:
    for (paramInt = b.a.a.b.b.a.f(1, this.fMv) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.kpf != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.kpf);
      }
      paramInt = b.a.a.a.fa(3, this.umy);
      int j = b.a.a.a.fa(4, this.umz);
      GMTrace.o(18813164716032L, 140169);
      return i + paramInt + j;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(18813164716032L, 140169);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        aqh localaqh = (aqh)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(18813164716032L, 140169);
          return -1;
        case 1: 
          localaqh.fMv = locala.xSv.readString();
          GMTrace.o(18813164716032L, 140169);
          return 0;
        case 2: 
          localaqh.kpf = locala.xSv.readString();
          GMTrace.o(18813164716032L, 140169);
          return 0;
        case 3: 
          localaqh.umy = locala.xSv.nm();
          GMTrace.o(18813164716032L, 140169);
          return 0;
        }
        localaqh.umz = locala.xSv.nm();
        GMTrace.o(18813164716032L, 140169);
        return 0;
      }
      GMTrace.o(18813164716032L, 140169);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aqh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */