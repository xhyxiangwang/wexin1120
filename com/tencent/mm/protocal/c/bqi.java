package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bqi
  extends com.tencent.mm.bl.a
{
  public int mDF;
  public String ovi;
  public String uFL;
  public long uFM;
  public long uFR;
  public boolean uFS;
  public com.tencent.mm.bl.b uFT;
  public String ufQ;
  
  public bqi()
  {
    GMTrace.i(3864262606848L, 28791);
    GMTrace.o(3864262606848L, 28791);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3864396824576L, 28792);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ufQ == null) {
        throw new b.a.a.b("Not all required fields were included: Nickname");
      }
      if (this.ovi == null) {
        throw new b.a.a.b("Not all required fields were included: Content");
      }
      if (this.uFL == null) {
        throw new b.a.a.b("Not all required fields were included: Talker");
      }
      paramVarArgs.R(1, this.uFM);
      if (this.ufQ != null) {
        paramVarArgs.e(2, this.ufQ);
      }
      if (this.ovi != null) {
        paramVarArgs.e(3, this.ovi);
      }
      paramVarArgs.fd(4, this.mDF);
      if (this.uFL != null) {
        paramVarArgs.e(5, this.uFL);
      }
      paramVarArgs.R(6, this.uFR);
      paramVarArgs.af(7, this.uFS);
      if (this.uFT != null) {
        paramVarArgs.b(8, this.uFT);
      }
      GMTrace.o(3864396824576L, 28792);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.Q(1, this.uFM) + 0;
      paramInt = i;
      if (this.ufQ != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ufQ);
      }
      i = paramInt;
      if (this.ovi != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ovi);
      }
      i += b.a.a.a.fa(4, this.mDF);
      paramInt = i;
      if (this.uFL != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uFL);
      }
      i = paramInt + b.a.a.a.Q(6, this.uFR) + (b.a.a.b.b.a.cK(7) + 1);
      paramInt = i;
      if (this.uFT != null) {
        paramInt = i + b.a.a.a.a(8, this.uFT);
      }
      GMTrace.o(3864396824576L, 28792);
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
      if (this.ufQ == null) {
        throw new b.a.a.b("Not all required fields were included: Nickname");
      }
      if (this.ovi == null) {
        throw new b.a.a.b("Not all required fields were included: Content");
      }
      if (this.uFL == null) {
        throw new b.a.a.b("Not all required fields were included: Talker");
      }
      GMTrace.o(3864396824576L, 28792);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bqi localbqi = (bqi)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3864396824576L, 28792);
        return -1;
      case 1: 
        localbqi.uFM = locala.xSv.nn();
        GMTrace.o(3864396824576L, 28792);
        return 0;
      case 2: 
        localbqi.ufQ = locala.xSv.readString();
        GMTrace.o(3864396824576L, 28792);
        return 0;
      case 3: 
        localbqi.ovi = locala.xSv.readString();
        GMTrace.o(3864396824576L, 28792);
        return 0;
      case 4: 
        localbqi.mDF = locala.xSv.nm();
        GMTrace.o(3864396824576L, 28792);
        return 0;
      case 5: 
        localbqi.uFL = locala.xSv.readString();
        GMTrace.o(3864396824576L, 28792);
        return 0;
      case 6: 
        localbqi.uFR = locala.xSv.nn();
        GMTrace.o(3864396824576L, 28792);
        return 0;
      case 7: 
        localbqi.uFS = locala.cpH();
        GMTrace.o(3864396824576L, 28792);
        return 0;
      }
      localbqi.uFT = locala.cpI();
      GMTrace.o(3864396824576L, 28792);
      return 0;
    }
    GMTrace.o(3864396824576L, 28792);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bqi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */