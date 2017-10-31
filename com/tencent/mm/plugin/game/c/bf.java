package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class bf
  extends com.tencent.mm.bl.a
{
  public String fuw;
  public String mCK;
  public String mDf;
  public String mDg;
  public int mFA;
  public String mFB;
  public boolean mFC;
  
  public bf()
  {
    GMTrace.i(12634585825280L, 94135);
    GMTrace.o(12634585825280L, 94135);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12634720043008L, 94136);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fuw != null) {
        paramVarArgs.e(1, this.fuw);
      }
      if (this.mCK != null) {
        paramVarArgs.e(2, this.mCK);
      }
      if (this.mDf != null) {
        paramVarArgs.e(3, this.mDf);
      }
      paramVarArgs.fd(4, this.mFA);
      if (this.mDg != null) {
        paramVarArgs.e(6, this.mDg);
      }
      if (this.mFB != null) {
        paramVarArgs.e(7, this.mFB);
      }
      paramVarArgs.af(8, this.mFC);
      GMTrace.o(12634720043008L, 94136);
      return 0;
    }
    if (paramInt == 1) {
      if (this.fuw == null) {
        break label586;
      }
    }
    label586:
    for (int i = b.a.a.b.b.a.f(1, this.fuw) + 0;; i = 0)
    {
      paramInt = i;
      if (this.mCK != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mCK);
      }
      i = paramInt;
      if (this.mDf != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.mDf);
      }
      i += b.a.a.a.fa(4, this.mFA);
      paramInt = i;
      if (this.mDg != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.mDg);
      }
      i = paramInt;
      if (this.mFB != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.mFB);
      }
      paramInt = b.a.a.b.b.a.cK(8);
      GMTrace.o(12634720043008L, 94136);
      return i + (paramInt + 1);
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(12634720043008L, 94136);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bf localbf = (bf)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        case 5: 
        default: 
          GMTrace.o(12634720043008L, 94136);
          return -1;
        case 1: 
          localbf.fuw = locala.xSv.readString();
          GMTrace.o(12634720043008L, 94136);
          return 0;
        case 2: 
          localbf.mCK = locala.xSv.readString();
          GMTrace.o(12634720043008L, 94136);
          return 0;
        case 3: 
          localbf.mDf = locala.xSv.readString();
          GMTrace.o(12634720043008L, 94136);
          return 0;
        case 4: 
          localbf.mFA = locala.xSv.nm();
          GMTrace.o(12634720043008L, 94136);
          return 0;
        case 6: 
          localbf.mDg = locala.xSv.readString();
          GMTrace.o(12634720043008L, 94136);
          return 0;
        case 7: 
          localbf.mFB = locala.xSv.readString();
          GMTrace.o(12634720043008L, 94136);
          return 0;
        }
        localbf.mFC = locala.cpH();
        GMTrace.o(12634720043008L, 94136);
        return 0;
      }
      GMTrace.o(12634720043008L, 94136);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */