package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class ch
  extends com.tencent.mm.bl.a
{
  public String mDf;
  public String mDg;
  public String mDh;
  public int mGz;
  
  public ch()
  {
    GMTrace.i(12650960388096L, 94257);
    GMTrace.o(12650960388096L, 94257);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12651094605824L, 94258);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mDf != null) {
        paramVarArgs.e(1, this.mDf);
      }
      if (this.mDg != null) {
        paramVarArgs.e(2, this.mDg);
      }
      paramVarArgs.fd(3, this.mGz);
      if (this.mDh != null) {
        paramVarArgs.e(4, this.mDh);
      }
      GMTrace.o(12651094605824L, 94258);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mDf == null) {
        break label408;
      }
    }
    label408:
    for (paramInt = b.a.a.b.b.a.f(1, this.mDf) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.mDg != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.mDg);
      }
      i += b.a.a.a.fa(3, this.mGz);
      paramInt = i;
      if (this.mDh != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mDh);
      }
      GMTrace.o(12651094605824L, 94258);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(12651094605824L, 94258);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ch localch = (ch)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12651094605824L, 94258);
          return -1;
        case 1: 
          localch.mDf = locala.xSv.readString();
          GMTrace.o(12651094605824L, 94258);
          return 0;
        case 2: 
          localch.mDg = locala.xSv.readString();
          GMTrace.o(12651094605824L, 94258);
          return 0;
        case 3: 
          localch.mGz = locala.xSv.nm();
          GMTrace.o(12651094605824L, 94258);
          return 0;
        }
        localch.mDh = locala.xSv.readString();
        GMTrace.o(12651094605824L, 94258);
        return 0;
      }
      GMTrace.o(12651094605824L, 94258);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/ch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */