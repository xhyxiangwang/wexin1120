package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bea
  extends com.tencent.mm.bl.a
{
  public float aFP;
  public int qCz;
  public float uwc;
  public float uwd;
  public float uwe;
  public float uwf;
  public int uwg;
  public long uwh;
  public long uwi;
  
  public bea()
  {
    GMTrace.i(3926673850368L, 29256);
    GMTrace.o(3926673850368L, 29256);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3926808068096L, 29257);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.n(1, this.uwc);
      paramVarArgs.n(2, this.uwd);
      paramVarArgs.n(3, this.uwe);
      paramVarArgs.n(4, this.uwf);
      paramVarArgs.fd(5, this.uwg);
      paramVarArgs.R(6, this.uwh);
      paramVarArgs.R(7, this.uwi);
      paramVarArgs.n(8, this.aFP);
      paramVarArgs.fd(9, this.qCz);
      GMTrace.o(3926808068096L, 29257);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.b.b.a.cK(1);
      int i = b.a.a.b.b.a.cK(2);
      int j = b.a.a.b.b.a.cK(3);
      int k = b.a.a.b.b.a.cK(4);
      int m = b.a.a.a.fa(5, this.uwg);
      int n = b.a.a.a.Q(6, this.uwh);
      int i1 = b.a.a.a.Q(7, this.uwi);
      int i2 = b.a.a.b.b.a.cK(8);
      int i3 = b.a.a.a.fa(9, this.qCz);
      GMTrace.o(3926808068096L, 29257);
      return paramInt + 4 + 0 + (i + 4) + (j + 4) + (k + 4) + m + n + i1 + (i2 + 4) + i3;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3926808068096L, 29257);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bea localbea = (bea)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3926808068096L, 29257);
        return -1;
      case 1: 
        localbea.uwc = locala.xSv.readFloat();
        GMTrace.o(3926808068096L, 29257);
        return 0;
      case 2: 
        localbea.uwd = locala.xSv.readFloat();
        GMTrace.o(3926808068096L, 29257);
        return 0;
      case 3: 
        localbea.uwe = locala.xSv.readFloat();
        GMTrace.o(3926808068096L, 29257);
        return 0;
      case 4: 
        localbea.uwf = locala.xSv.readFloat();
        GMTrace.o(3926808068096L, 29257);
        return 0;
      case 5: 
        localbea.uwg = locala.xSv.nm();
        GMTrace.o(3926808068096L, 29257);
        return 0;
      case 6: 
        localbea.uwh = locala.xSv.nn();
        GMTrace.o(3926808068096L, 29257);
        return 0;
      case 7: 
        localbea.uwi = locala.xSv.nn();
        GMTrace.o(3926808068096L, 29257);
        return 0;
      case 8: 
        localbea.aFP = locala.xSv.readFloat();
        GMTrace.o(3926808068096L, 29257);
        return 0;
      }
      localbea.qCz = locala.xSv.nm();
      GMTrace.o(3926808068096L, 29257);
      return 0;
    }
    GMTrace.o(3926808068096L, 29257);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */