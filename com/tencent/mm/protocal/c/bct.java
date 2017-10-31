package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bct
  extends com.tencent.mm.bl.a
{
  public int jXP;
  public int orU;
  public String ovi;
  public String tMZ;
  public int twh;
  public String upg;
  public String uuB;
  public String uuC;
  public int uuD;
  public int uuE;
  public int uuF;
  public long uuG;
  public long uuH;
  public axs uuI;
  public int uuJ;
  
  public bct()
  {
    GMTrace.i(3673539215360L, 27370);
    GMTrace.o(3673539215360L, 27370);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3673673433088L, 27371);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.upg != null) {
        paramVarArgs.e(1, this.upg);
      }
      if (this.tMZ != null) {
        paramVarArgs.e(2, this.tMZ);
      }
      if (this.uuB != null) {
        paramVarArgs.e(3, this.uuB);
      }
      if (this.uuC != null) {
        paramVarArgs.e(4, this.uuC);
      }
      paramVarArgs.fd(5, this.jXP);
      paramVarArgs.fd(6, this.twh);
      paramVarArgs.fd(7, this.orU);
      if (this.ovi != null) {
        paramVarArgs.e(8, this.ovi);
      }
      paramVarArgs.fd(9, this.uuD);
      paramVarArgs.fd(10, this.uuE);
      paramVarArgs.fd(11, this.uuF);
      paramVarArgs.R(12, this.uuG);
      paramVarArgs.R(13, this.uuH);
      if (this.uuI != null)
      {
        paramVarArgs.ff(14, this.uuI.aWM());
        this.uuI.a(paramVarArgs);
      }
      paramVarArgs.fd(15, this.uuJ);
      GMTrace.o(3673673433088L, 27371);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.upg != null) {
        i = b.a.a.b.b.a.f(1, this.upg) + 0;
      }
      paramInt = i;
      if (this.tMZ != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tMZ);
      }
      i = paramInt;
      if (this.uuB != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uuB);
      }
      paramInt = i;
      if (this.uuC != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uuC);
      }
      i = paramInt + b.a.a.a.fa(5, this.jXP) + b.a.a.a.fa(6, this.twh) + b.a.a.a.fa(7, this.orU);
      paramInt = i;
      if (this.ovi != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.ovi);
      }
      i = paramInt + b.a.a.a.fa(9, this.uuD) + b.a.a.a.fa(10, this.uuE) + b.a.a.a.fa(11, this.uuF) + b.a.a.a.Q(12, this.uuG) + b.a.a.a.Q(13, this.uuH);
      paramInt = i;
      if (this.uuI != null) {
        paramInt = i + b.a.a.a.fc(14, this.uuI.aWM());
      }
      i = b.a.a.a.fa(15, this.uuJ);
      GMTrace.o(3673673433088L, 27371);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3673673433088L, 27371);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bct localbct = (bct)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3673673433088L, 27371);
        return -1;
      case 1: 
        localbct.upg = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3673673433088L, 27371);
        return 0;
      case 2: 
        localbct.tMZ = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3673673433088L, 27371);
        return 0;
      case 3: 
        localbct.uuB = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3673673433088L, 27371);
        return 0;
      case 4: 
        localbct.uuC = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3673673433088L, 27371);
        return 0;
      case 5: 
        localbct.jXP = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3673673433088L, 27371);
        return 0;
      case 6: 
        localbct.twh = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3673673433088L, 27371);
        return 0;
      case 7: 
        localbct.orU = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3673673433088L, 27371);
        return 0;
      case 8: 
        localbct.ovi = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3673673433088L, 27371);
        return 0;
      case 9: 
        localbct.uuD = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3673673433088L, 27371);
        return 0;
      case 10: 
        localbct.uuE = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3673673433088L, 27371);
        return 0;
      case 11: 
        localbct.uuF = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3673673433088L, 27371);
        return 0;
      case 12: 
        localbct.uuG = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3673673433088L, 27371);
        return 0;
      case 13: 
        localbct.uuH = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3673673433088L, 27371);
        return 0;
      case 14: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbct.uuI = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3673673433088L, 27371);
        return 0;
      }
      localbct.uuJ = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3673673433088L, 27371);
      return 0;
    }
    GMTrace.o(3673673433088L, 27371);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */