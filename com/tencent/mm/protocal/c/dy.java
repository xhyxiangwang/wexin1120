package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class dy
  extends com.tencent.mm.bl.a
{
  public String huM;
  public String jWW;
  public String jYc;
  public String mGI;
  public int mib;
  public int txV;
  public String txW;
  public String txX;
  
  public dy()
  {
    GMTrace.i(3778363260928L, 28151);
    GMTrace.o(3778363260928L, 28151);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3778497478656L, 28152);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mGI != null) {
        paramVarArgs.e(1, this.mGI);
      }
      if (this.jYc != null) {
        paramVarArgs.e(2, this.jYc);
      }
      if (this.jWW != null) {
        paramVarArgs.e(3, this.jWW);
      }
      paramVarArgs.fd(4, this.txV);
      if (this.txW != null) {
        paramVarArgs.e(5, this.txW);
      }
      if (this.huM != null) {
        paramVarArgs.e(6, this.huM);
      }
      if (this.txX != null) {
        paramVarArgs.e(7, this.txX);
      }
      paramVarArgs.fd(8, this.mib);
      GMTrace.o(3778497478656L, 28152);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mGI == null) {
        break label666;
      }
    }
    label666:
    for (int i = b.a.a.b.b.a.f(1, this.mGI) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jYc != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jYc);
      }
      i = paramInt;
      if (this.jWW != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.jWW);
      }
      i += b.a.a.a.fa(4, this.txV);
      paramInt = i;
      if (this.txW != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.txW);
      }
      i = paramInt;
      if (this.huM != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.huM);
      }
      paramInt = i;
      if (this.txX != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.txX);
      }
      i = b.a.a.a.fa(8, this.mib);
      GMTrace.o(3778497478656L, 28152);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3778497478656L, 28152);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        dy localdy = (dy)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3778497478656L, 28152);
          return -1;
        case 1: 
          localdy.mGI = locala.xSv.readString();
          GMTrace.o(3778497478656L, 28152);
          return 0;
        case 2: 
          localdy.jYc = locala.xSv.readString();
          GMTrace.o(3778497478656L, 28152);
          return 0;
        case 3: 
          localdy.jWW = locala.xSv.readString();
          GMTrace.o(3778497478656L, 28152);
          return 0;
        case 4: 
          localdy.txV = locala.xSv.nm();
          GMTrace.o(3778497478656L, 28152);
          return 0;
        case 5: 
          localdy.txW = locala.xSv.readString();
          GMTrace.o(3778497478656L, 28152);
          return 0;
        case 6: 
          localdy.huM = locala.xSv.readString();
          GMTrace.o(3778497478656L, 28152);
          return 0;
        case 7: 
          localdy.txX = locala.xSv.readString();
          GMTrace.o(3778497478656L, 28152);
          return 0;
        }
        localdy.mib = locala.xSv.nm();
        GMTrace.o(3778497478656L, 28152);
        return 0;
      }
      GMTrace.o(3778497478656L, 28152);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/dy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */