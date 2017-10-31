package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class at
  extends com.tencent.mm.bl.a
{
  public String gbW;
  public String gbX;
  public double latitude;
  public double longitude;
  public long tui;
  public String tuj;
  public String tuk;
  public String tul;
  public String tum;
  
  public at()
  {
    GMTrace.i(3956201750528L, 29476);
    GMTrace.o(3956201750528L, 29476);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3956335968256L, 29477);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.gbW != null) {
        paramVarArgs.e(1, this.gbW);
      }
      if (this.gbX != null) {
        paramVarArgs.e(2, this.gbX);
      }
      paramVarArgs.a(3, this.latitude);
      paramVarArgs.a(4, this.longitude);
      paramVarArgs.R(5, this.tui);
      if (this.tuj != null) {
        paramVarArgs.e(6, this.tuj);
      }
      if (this.tuk != null) {
        paramVarArgs.e(7, this.tuk);
      }
      if (this.tul != null) {
        paramVarArgs.e(8, this.tul);
      }
      if (this.tum != null) {
        paramVarArgs.e(9, this.tum);
      }
      GMTrace.o(3956335968256L, 29477);
      return 0;
    }
    if (paramInt == 1) {
      if (this.gbW == null) {
        break label710;
      }
    }
    label710:
    for (paramInt = b.a.a.b.b.a.f(1, this.gbW) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.gbX != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.gbX);
      }
      i = i + (b.a.a.b.b.a.cK(3) + 8) + (b.a.a.b.b.a.cK(4) + 8) + b.a.a.a.Q(5, this.tui);
      paramInt = i;
      if (this.tuj != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tuj);
      }
      i = paramInt;
      if (this.tuk != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.tuk);
      }
      paramInt = i;
      if (this.tul != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tul);
      }
      i = paramInt;
      if (this.tum != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.tum);
      }
      GMTrace.o(3956335968256L, 29477);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3956335968256L, 29477);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        at localat = (at)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3956335968256L, 29477);
          return -1;
        case 1: 
          localat.gbW = locala.xSv.readString();
          GMTrace.o(3956335968256L, 29477);
          return 0;
        case 2: 
          localat.gbX = locala.xSv.readString();
          GMTrace.o(3956335968256L, 29477);
          return 0;
        case 3: 
          localat.latitude = locala.xSv.readDouble();
          GMTrace.o(3956335968256L, 29477);
          return 0;
        case 4: 
          localat.longitude = locala.xSv.readDouble();
          GMTrace.o(3956335968256L, 29477);
          return 0;
        case 5: 
          localat.tui = locala.xSv.nn();
          GMTrace.o(3956335968256L, 29477);
          return 0;
        case 6: 
          localat.tuj = locala.xSv.readString();
          GMTrace.o(3956335968256L, 29477);
          return 0;
        case 7: 
          localat.tuk = locala.xSv.readString();
          GMTrace.o(3956335968256L, 29477);
          return 0;
        case 8: 
          localat.tul = locala.xSv.readString();
          GMTrace.o(3956335968256L, 29477);
          return 0;
        }
        localat.tum = locala.xSv.readString();
        GMTrace.o(3956335968256L, 29477);
        return 0;
      }
      GMTrace.o(3956335968256L, 29477);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */