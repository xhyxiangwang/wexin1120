package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ks
  extends com.tencent.mm.bl.a
{
  public String oqo;
  public int tGQ;
  public String tGR;
  public String tGS;
  public String tGT;
  public int tGU;
  public String tGV;
  public int tGW;
  public String tGX;
  public int tGY;
  public String tGZ;
  
  public ks()
  {
    GMTrace.i(3716891541504L, 27693);
    GMTrace.o(3716891541504L, 27693);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3717025759232L, 27694);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.tGQ);
      if (this.tGR != null) {
        paramVarArgs.e(2, this.tGR);
      }
      if (this.tGS != null) {
        paramVarArgs.e(3, this.tGS);
      }
      if (this.tGT != null) {
        paramVarArgs.e(4, this.tGT);
      }
      paramVarArgs.fd(5, this.tGU);
      if (this.tGV != null) {
        paramVarArgs.e(6, this.tGV);
      }
      paramVarArgs.fd(7, this.tGW);
      if (this.oqo != null) {
        paramVarArgs.e(8, this.oqo);
      }
      if (this.tGX != null) {
        paramVarArgs.e(9, this.tGX);
      }
      paramVarArgs.fd(10, this.tGY);
      if (this.tGZ != null) {
        paramVarArgs.e(11, this.tGZ);
      }
      GMTrace.o(3717025759232L, 27694);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.tGQ) + 0;
      paramInt = i;
      if (this.tGR != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tGR);
      }
      i = paramInt;
      if (this.tGS != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tGS);
      }
      paramInt = i;
      if (this.tGT != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tGT);
      }
      i = paramInt + b.a.a.a.fa(5, this.tGU);
      paramInt = i;
      if (this.tGV != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tGV);
      }
      i = paramInt + b.a.a.a.fa(7, this.tGW);
      paramInt = i;
      if (this.oqo != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.oqo);
      }
      i = paramInt;
      if (this.tGX != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.tGX);
      }
      i += b.a.a.a.fa(10, this.tGY);
      paramInt = i;
      if (this.tGZ != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.tGZ);
      }
      GMTrace.o(3717025759232L, 27694);
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
      GMTrace.o(3717025759232L, 27694);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ks localks = (ks)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3717025759232L, 27694);
        return -1;
      case 1: 
        localks.tGQ = locala.xSv.nm();
        GMTrace.o(3717025759232L, 27694);
        return 0;
      case 2: 
        localks.tGR = locala.xSv.readString();
        GMTrace.o(3717025759232L, 27694);
        return 0;
      case 3: 
        localks.tGS = locala.xSv.readString();
        GMTrace.o(3717025759232L, 27694);
        return 0;
      case 4: 
        localks.tGT = locala.xSv.readString();
        GMTrace.o(3717025759232L, 27694);
        return 0;
      case 5: 
        localks.tGU = locala.xSv.nm();
        GMTrace.o(3717025759232L, 27694);
        return 0;
      case 6: 
        localks.tGV = locala.xSv.readString();
        GMTrace.o(3717025759232L, 27694);
        return 0;
      case 7: 
        localks.tGW = locala.xSv.nm();
        GMTrace.o(3717025759232L, 27694);
        return 0;
      case 8: 
        localks.oqo = locala.xSv.readString();
        GMTrace.o(3717025759232L, 27694);
        return 0;
      case 9: 
        localks.tGX = locala.xSv.readString();
        GMTrace.o(3717025759232L, 27694);
        return 0;
      case 10: 
        localks.tGY = locala.xSv.nm();
        GMTrace.o(3717025759232L, 27694);
        return 0;
      }
      localks.tGZ = locala.xSv.readString();
      GMTrace.o(3717025759232L, 27694);
      return 0;
    }
    GMTrace.o(3717025759232L, 27694);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */