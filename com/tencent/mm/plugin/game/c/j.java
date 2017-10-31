package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class j
  extends com.tencent.mm.bl.a
{
  public String mCE;
  public String mCI;
  public String mCJ;
  public int mDp;
  
  public j()
  {
    GMTrace.i(12636196438016L, 94147);
    GMTrace.o(12636196438016L, 94147);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12636330655744L, 94148);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mCJ == null) {
        throw new b("Not all required fields were included: Name");
      }
      if (this.mCI == null) {
        throw new b("Not all required fields were included: IconURL");
      }
      paramVarArgs.fd(1, this.mDp);
      if (this.mCJ != null) {
        paramVarArgs.e(2, this.mCJ);
      }
      if (this.mCI != null) {
        paramVarArgs.e(3, this.mCI);
      }
      if (this.mCE != null) {
        paramVarArgs.e(4, this.mCE);
      }
      GMTrace.o(12636330655744L, 94148);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.mDp) + 0;
      paramInt = i;
      if (this.mCJ != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mCJ);
      }
      i = paramInt;
      if (this.mCI != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.mCI);
      }
      paramInt = i;
      if (this.mCE != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mCE);
      }
      GMTrace.o(12636330655744L, 94148);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.mCJ == null) {
        throw new b("Not all required fields were included: Name");
      }
      if (this.mCI == null) {
        throw new b("Not all required fields were included: IconURL");
      }
      GMTrace.o(12636330655744L, 94148);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      j localj = (j)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(12636330655744L, 94148);
        return -1;
      case 1: 
        localj.mDp = locala.xSv.nm();
        GMTrace.o(12636330655744L, 94148);
        return 0;
      case 2: 
        localj.mCJ = locala.xSv.readString();
        GMTrace.o(12636330655744L, 94148);
        return 0;
      case 3: 
        localj.mCI = locala.xSv.readString();
        GMTrace.o(12636330655744L, 94148);
        return 0;
      }
      localj.mCE = locala.xSv.readString();
      GMTrace.o(12636330655744L, 94148);
      return 0;
    }
    GMTrace.o(12636330655744L, 94148);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */