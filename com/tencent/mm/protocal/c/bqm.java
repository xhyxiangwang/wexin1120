package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bqm
  extends com.tencent.mm.bl.a
{
  public String fuw;
  public int mGz;
  public String ovi;
  public com.tencent.mm.bl.b uFD;
  public String uFL;
  public int uFX;
  public boolean uFY;
  public boolean uFZ;
  public boolean uGa;
  
  public bqm()
  {
    GMTrace.i(3686826770432L, 27469);
    GMTrace.o(3686826770432L, 27469);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3686960988160L, 27470);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uFL == null) {
        throw new b.a.a.b("Not all required fields were included: Talker");
      }
      if (this.fuw == null) {
        throw new b.a.a.b("Not all required fields were included: Title");
      }
      if (this.ovi == null) {
        throw new b.a.a.b("Not all required fields were included: Content");
      }
      paramVarArgs.fd(1, this.mGz);
      if (this.uFL != null) {
        paramVarArgs.e(2, this.uFL);
      }
      if (this.fuw != null) {
        paramVarArgs.e(3, this.fuw);
      }
      if (this.ovi != null) {
        paramVarArgs.e(4, this.ovi);
      }
      paramVarArgs.fd(5, this.uFX);
      if (this.uFD != null) {
        paramVarArgs.b(6, this.uFD);
      }
      paramVarArgs.af(7, this.uFY);
      paramVarArgs.af(8, this.uFZ);
      paramVarArgs.af(9, this.uGa);
      GMTrace.o(3686960988160L, 27470);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.mGz) + 0;
      paramInt = i;
      if (this.uFL != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uFL);
      }
      i = paramInt;
      if (this.fuw != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.fuw);
      }
      paramInt = i;
      if (this.ovi != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ovi);
      }
      i = paramInt + b.a.a.a.fa(5, this.uFX);
      paramInt = i;
      if (this.uFD != null) {
        paramInt = i + b.a.a.a.a(6, this.uFD);
      }
      i = b.a.a.b.b.a.cK(7);
      int j = b.a.a.b.b.a.cK(8);
      int k = b.a.a.b.b.a.cK(9);
      GMTrace.o(3686960988160L, 27470);
      return paramInt + (i + 1) + (j + 1) + (k + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.uFL == null) {
        throw new b.a.a.b("Not all required fields were included: Talker");
      }
      if (this.fuw == null) {
        throw new b.a.a.b("Not all required fields were included: Title");
      }
      if (this.ovi == null) {
        throw new b.a.a.b("Not all required fields were included: Content");
      }
      GMTrace.o(3686960988160L, 27470);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bqm localbqm = (bqm)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3686960988160L, 27470);
        return -1;
      case 1: 
        localbqm.mGz = locala.xSv.nm();
        GMTrace.o(3686960988160L, 27470);
        return 0;
      case 2: 
        localbqm.uFL = locala.xSv.readString();
        GMTrace.o(3686960988160L, 27470);
        return 0;
      case 3: 
        localbqm.fuw = locala.xSv.readString();
        GMTrace.o(3686960988160L, 27470);
        return 0;
      case 4: 
        localbqm.ovi = locala.xSv.readString();
        GMTrace.o(3686960988160L, 27470);
        return 0;
      case 5: 
        localbqm.uFX = locala.xSv.nm();
        GMTrace.o(3686960988160L, 27470);
        return 0;
      case 6: 
        localbqm.uFD = locala.cpI();
        GMTrace.o(3686960988160L, 27470);
        return 0;
      case 7: 
        localbqm.uFY = locala.cpH();
        GMTrace.o(3686960988160L, 27470);
        return 0;
      case 8: 
        localbqm.uFZ = locala.cpH();
        GMTrace.o(3686960988160L, 27470);
        return 0;
      }
      localbqm.uGa = locala.cpH();
      GMTrace.o(3686960988160L, 27470);
      return 0;
    }
    GMTrace.o(3686960988160L, 27470);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bqm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */