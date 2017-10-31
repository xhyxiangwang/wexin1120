package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class cj
  extends com.tencent.mm.bl.a
{
  public String mac;
  public String ssid;
  public int tvM;
  
  public cj()
  {
    GMTrace.i(4033779597312L, 30054);
    GMTrace.o(4033779597312L, 30054);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4033913815040L, 30055);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mac != null) {
        paramVarArgs.e(1, this.mac);
      }
      paramVarArgs.fd(2, this.tvM);
      if (this.ssid != null) {
        paramVarArgs.e(3, this.ssid);
      }
      GMTrace.o(4033913815040L, 30055);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mac == null) {
        break label354;
      }
    }
    label354:
    for (paramInt = b.a.a.b.b.a.f(1, this.mac) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fa(2, this.tvM);
      paramInt = i;
      if (this.ssid != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.ssid);
      }
      GMTrace.o(4033913815040L, 30055);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(4033913815040L, 30055);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        cj localcj = (cj)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(4033913815040L, 30055);
          return -1;
        case 1: 
          localcj.mac = locala.xSv.readString();
          GMTrace.o(4033913815040L, 30055);
          return 0;
        case 2: 
          localcj.tvM = locala.xSv.nm();
          GMTrace.o(4033913815040L, 30055);
          return 0;
        }
        localcj.ssid = locala.xSv.readString();
        GMTrace.o(4033913815040L, 30055);
        return 0;
      }
      GMTrace.o(4033913815040L, 30055);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/cj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */