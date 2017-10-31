package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class cm
  extends com.tencent.mm.bl.a
{
  public String mFw;
  public String mFy;
  
  public cm()
  {
    GMTrace.i(3810978168832L, 28394);
    GMTrace.o(3810978168832L, 28394);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3811112386560L, 28395);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mFw != null) {
        paramVarArgs.e(1, this.mFw);
      }
      if (this.mFy != null) {
        paramVarArgs.e(2, this.mFy);
      }
      GMTrace.o(3811112386560L, 28395);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mFw == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(1, this.mFw) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.mFy != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.mFy);
      }
      GMTrace.o(3811112386560L, 28395);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3811112386560L, 28395);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        cm localcm = (cm)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3811112386560L, 28395);
          return -1;
        case 1: 
          localcm.mFw = locala.xSv.readString();
          GMTrace.o(3811112386560L, 28395);
          return 0;
        }
        localcm.mFy = locala.xSv.readString();
        GMTrace.o(3811112386560L, 28395);
        return 0;
      }
      GMTrace.o(3811112386560L, 28395);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/cm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */