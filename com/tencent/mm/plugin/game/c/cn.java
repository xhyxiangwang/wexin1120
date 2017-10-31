package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class cn
  extends com.tencent.mm.bl.a
{
  public String fuw;
  public String mDf;
  public String mDg;
  public String mFB;
  public String mFF;
  public String mFu;
  public String mGD;
  public String mGE;
  public int mGF;
  public String mGG;
  public String mGH;
  public String mGI;
  public String mGJ;
  
  public cn()
  {
    GMTrace.i(19276350095360L, 143620);
    GMTrace.o(19276350095360L, 143620);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19276484313088L, 143621);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fuw == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.fuw != null) {
        paramVarArgs.e(1, this.fuw);
      }
      if (this.mFF != null) {
        paramVarArgs.e(2, this.mFF);
      }
      if (this.mGD != null) {
        paramVarArgs.e(3, this.mGD);
      }
      if (this.mGE != null) {
        paramVarArgs.e(4, this.mGE);
      }
      if (this.mDf != null) {
        paramVarArgs.e(5, this.mDf);
      }
      if (this.mFu != null) {
        paramVarArgs.e(6, this.mFu);
      }
      paramVarArgs.fd(7, this.mGF);
      if (this.mDg != null) {
        paramVarArgs.e(8, this.mDg);
      }
      if (this.mGG != null) {
        paramVarArgs.e(9, this.mGG);
      }
      if (this.mGH != null) {
        paramVarArgs.e(10, this.mGH);
      }
      if (this.mGI != null) {
        paramVarArgs.e(11, this.mGI);
      }
      if (this.mFB != null) {
        paramVarArgs.e(12, this.mFB);
      }
      if (this.mGJ != null) {
        paramVarArgs.e(13, this.mGJ);
      }
      GMTrace.o(19276484313088L, 143621);
      return 0;
    }
    if (paramInt == 1) {
      if (this.fuw == null) {
        break label1027;
      }
    }
    label1027:
    for (int i = b.a.a.b.b.a.f(1, this.fuw) + 0;; i = 0)
    {
      paramInt = i;
      if (this.mFF != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mFF);
      }
      i = paramInt;
      if (this.mGD != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.mGD);
      }
      paramInt = i;
      if (this.mGE != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mGE);
      }
      i = paramInt;
      if (this.mDf != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.mDf);
      }
      paramInt = i;
      if (this.mFu != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.mFu);
      }
      i = paramInt + b.a.a.a.fa(7, this.mGF);
      paramInt = i;
      if (this.mDg != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.mDg);
      }
      i = paramInt;
      if (this.mGG != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.mGG);
      }
      paramInt = i;
      if (this.mGH != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.mGH);
      }
      i = paramInt;
      if (this.mGI != null) {
        i = paramInt + b.a.a.b.b.a.f(11, this.mGI);
      }
      paramInt = i;
      if (this.mFB != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.mFB);
      }
      i = paramInt;
      if (this.mGJ != null) {
        i = paramInt + b.a.a.b.b.a.f(13, this.mGJ);
      }
      GMTrace.o(19276484313088L, 143621);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.fuw == null) {
          throw new b("Not all required fields were included: Title");
        }
        GMTrace.o(19276484313088L, 143621);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        cn localcn = (cn)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(19276484313088L, 143621);
          return -1;
        case 1: 
          localcn.fuw = locala.xSv.readString();
          GMTrace.o(19276484313088L, 143621);
          return 0;
        case 2: 
          localcn.mFF = locala.xSv.readString();
          GMTrace.o(19276484313088L, 143621);
          return 0;
        case 3: 
          localcn.mGD = locala.xSv.readString();
          GMTrace.o(19276484313088L, 143621);
          return 0;
        case 4: 
          localcn.mGE = locala.xSv.readString();
          GMTrace.o(19276484313088L, 143621);
          return 0;
        case 5: 
          localcn.mDf = locala.xSv.readString();
          GMTrace.o(19276484313088L, 143621);
          return 0;
        case 6: 
          localcn.mFu = locala.xSv.readString();
          GMTrace.o(19276484313088L, 143621);
          return 0;
        case 7: 
          localcn.mGF = locala.xSv.nm();
          GMTrace.o(19276484313088L, 143621);
          return 0;
        case 8: 
          localcn.mDg = locala.xSv.readString();
          GMTrace.o(19276484313088L, 143621);
          return 0;
        case 9: 
          localcn.mGG = locala.xSv.readString();
          GMTrace.o(19276484313088L, 143621);
          return 0;
        case 10: 
          localcn.mGH = locala.xSv.readString();
          GMTrace.o(19276484313088L, 143621);
          return 0;
        case 11: 
          localcn.mGI = locala.xSv.readString();
          GMTrace.o(19276484313088L, 143621);
          return 0;
        case 12: 
          localcn.mFB = locala.xSv.readString();
          GMTrace.o(19276484313088L, 143621);
          return 0;
        }
        localcn.mGJ = locala.xSv.readString();
        GMTrace.o(19276484313088L, 143621);
        return 0;
      }
      GMTrace.o(19276484313088L, 143621);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/cn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */