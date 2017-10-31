package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bsb
  extends com.tencent.mm.bl.a
{
  public int tAS;
  public int ttY;
  public int ude;
  public int ugv;
  public int ugw;
  public String ugx;
  
  public bsb()
  {
    GMTrace.i(15349407809536L, 114362);
    GMTrace.o(15349407809536L, 114362);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15349542027264L, 114363);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.ude);
      paramVarArgs.fd(2, this.tAS);
      paramVarArgs.fd(3, this.ttY);
      if (this.ugx != null) {
        paramVarArgs.e(4, this.ugx);
      }
      paramVarArgs.fd(5, this.ugw);
      paramVarArgs.fd(6, this.ugv);
      GMTrace.o(15349542027264L, 114363);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.ude) + 0 + b.a.a.a.fa(2, this.tAS) + b.a.a.a.fa(3, this.ttY);
      paramInt = i;
      if (this.ugx != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ugx);
      }
      i = b.a.a.a.fa(5, this.ugw);
      int j = b.a.a.a.fa(6, this.ugv);
      GMTrace.o(15349542027264L, 114363);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(15349542027264L, 114363);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bsb localbsb = (bsb)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(15349542027264L, 114363);
        return -1;
      case 1: 
        localbsb.ude = locala.xSv.nm();
        GMTrace.o(15349542027264L, 114363);
        return 0;
      case 2: 
        localbsb.tAS = locala.xSv.nm();
        GMTrace.o(15349542027264L, 114363);
        return 0;
      case 3: 
        localbsb.ttY = locala.xSv.nm();
        GMTrace.o(15349542027264L, 114363);
        return 0;
      case 4: 
        localbsb.ugx = locala.xSv.readString();
        GMTrace.o(15349542027264L, 114363);
        return 0;
      case 5: 
        localbsb.ugw = locala.xSv.nm();
        GMTrace.o(15349542027264L, 114363);
        return 0;
      }
      localbsb.ugv = locala.xSv.nm();
      GMTrace.o(15349542027264L, 114363);
      return 0;
    }
    GMTrace.o(15349542027264L, 114363);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bsb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */