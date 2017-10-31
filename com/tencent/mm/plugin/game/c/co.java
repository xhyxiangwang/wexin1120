package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class co
  extends com.tencent.mm.bl.a
{
  public String mDt;
  public String mGK;
  public String mGL;
  public String mGM;
  public String mGN;
  public int mGO;
  public String mGP;
  public String mGQ;
  
  public co()
  {
    GMTrace.i(12656329097216L, 94297);
    GMTrace.o(12656329097216L, 94297);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12656463314944L, 94298);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mDt != null) {
        paramVarArgs.e(1, this.mDt);
      }
      if (this.mGK != null) {
        paramVarArgs.e(2, this.mGK);
      }
      if (this.mGL != null) {
        paramVarArgs.e(3, this.mGL);
      }
      if (this.mGM != null) {
        paramVarArgs.e(4, this.mGM);
      }
      if (this.mGN != null) {
        paramVarArgs.e(5, this.mGN);
      }
      paramVarArgs.fd(6, this.mGO);
      if (this.mGP != null) {
        paramVarArgs.e(7, this.mGP);
      }
      if (this.mGQ != null) {
        paramVarArgs.e(8, this.mGQ);
      }
      GMTrace.o(12656463314944L, 94298);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mDt == null) {
        break label668;
      }
    }
    label668:
    for (int i = b.a.a.b.b.a.f(1, this.mDt) + 0;; i = 0)
    {
      paramInt = i;
      if (this.mGK != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mGK);
      }
      i = paramInt;
      if (this.mGL != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.mGL);
      }
      paramInt = i;
      if (this.mGM != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mGM);
      }
      i = paramInt;
      if (this.mGN != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.mGN);
      }
      i += b.a.a.a.fa(6, this.mGO);
      paramInt = i;
      if (this.mGP != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.mGP);
      }
      i = paramInt;
      if (this.mGQ != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.mGQ);
      }
      GMTrace.o(12656463314944L, 94298);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(12656463314944L, 94298);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        co localco = (co)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12656463314944L, 94298);
          return -1;
        case 1: 
          localco.mDt = locala.xSv.readString();
          GMTrace.o(12656463314944L, 94298);
          return 0;
        case 2: 
          localco.mGK = locala.xSv.readString();
          GMTrace.o(12656463314944L, 94298);
          return 0;
        case 3: 
          localco.mGL = locala.xSv.readString();
          GMTrace.o(12656463314944L, 94298);
          return 0;
        case 4: 
          localco.mGM = locala.xSv.readString();
          GMTrace.o(12656463314944L, 94298);
          return 0;
        case 5: 
          localco.mGN = locala.xSv.readString();
          GMTrace.o(12656463314944L, 94298);
          return 0;
        case 6: 
          localco.mGO = locala.xSv.nm();
          GMTrace.o(12656463314944L, 94298);
          return 0;
        case 7: 
          localco.mGP = locala.xSv.readString();
          GMTrace.o(12656463314944L, 94298);
          return 0;
        }
        localco.mGQ = locala.xSv.readString();
        GMTrace.o(12656463314944L, 94298);
        return 0;
      }
      GMTrace.o(12656463314944L, 94298);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/co.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */