package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ame
  extends com.tencent.mm.bl.a
{
  public String bssid;
  public int fzv;
  public String ssid;
  
  public ame()
  {
    GMTrace.i(3764136181760L, 28045);
    GMTrace.o(3764136181760L, 28045);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3764270399488L, 28046);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ssid != null) {
        paramVarArgs.e(1, this.ssid);
      }
      if (this.bssid != null) {
        paramVarArgs.e(2, this.bssid);
      }
      paramVarArgs.fd(3, this.fzv);
      GMTrace.o(3764270399488L, 28046);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ssid == null) {
        break label354;
      }
    }
    label354:
    for (paramInt = b.a.a.b.b.a.f(1, this.ssid) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.bssid != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.bssid);
      }
      paramInt = b.a.a.a.fa(3, this.fzv);
      GMTrace.o(3764270399488L, 28046);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3764270399488L, 28046);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ame localame = (ame)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3764270399488L, 28046);
          return -1;
        case 1: 
          localame.ssid = locala.xSv.readString();
          GMTrace.o(3764270399488L, 28046);
          return 0;
        case 2: 
          localame.bssid = locala.xSv.readString();
          GMTrace.o(3764270399488L, 28046);
          return 0;
        }
        localame.fzv = locala.xSv.nm();
        GMTrace.o(3764270399488L, 28046);
        return 0;
      }
      GMTrace.o(3764270399488L, 28046);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */