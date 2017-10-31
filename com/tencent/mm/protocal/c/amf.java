package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class amf
  extends com.tencent.mm.bl.a
{
  public String bssid;
  public String fvF;
  public int fzv;
  public int mbY;
  public String ssid;
  public int ugZ;
  public String uha;
  
  public amf()
  {
    GMTrace.i(3886140096512L, 28954);
    GMTrace.o(3886140096512L, 28954);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3886274314240L, 28955);
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
      paramVarArgs.fd(4, this.ugZ);
      if (this.uha != null) {
        paramVarArgs.e(5, this.uha);
      }
      if (this.fvF != null) {
        paramVarArgs.e(6, this.fvF);
      }
      paramVarArgs.fd(7, this.mbY);
      GMTrace.o(3886274314240L, 28955);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ssid == null) {
        break label582;
      }
    }
    label582:
    for (paramInt = b.a.a.b.b.a.f(1, this.ssid) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.bssid != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.bssid);
      }
      i = i + b.a.a.a.fa(3, this.fzv) + b.a.a.a.fa(4, this.ugZ);
      paramInt = i;
      if (this.uha != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uha);
      }
      i = paramInt;
      if (this.fvF != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.fvF);
      }
      paramInt = b.a.a.a.fa(7, this.mbY);
      GMTrace.o(3886274314240L, 28955);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3886274314240L, 28955);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        amf localamf = (amf)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3886274314240L, 28955);
          return -1;
        case 1: 
          localamf.ssid = locala.xSv.readString();
          GMTrace.o(3886274314240L, 28955);
          return 0;
        case 2: 
          localamf.bssid = locala.xSv.readString();
          GMTrace.o(3886274314240L, 28955);
          return 0;
        case 3: 
          localamf.fzv = locala.xSv.nm();
          GMTrace.o(3886274314240L, 28955);
          return 0;
        case 4: 
          localamf.ugZ = locala.xSv.nm();
          GMTrace.o(3886274314240L, 28955);
          return 0;
        case 5: 
          localamf.uha = locala.xSv.readString();
          GMTrace.o(3886274314240L, 28955);
          return 0;
        case 6: 
          localamf.fvF = locala.xSv.readString();
          GMTrace.o(3886274314240L, 28955);
          return 0;
        }
        localamf.mbY = locala.xSv.nm();
        GMTrace.o(3886274314240L, 28955);
        return 0;
      }
      GMTrace.o(3886274314240L, 28955);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/amf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */