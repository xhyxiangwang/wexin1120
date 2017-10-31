package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class sx
  extends com.tencent.mm.bl.a
{
  public int jXo;
  public int tvd;
  public int tve;
  public int tvf;
  public int tvg;
  public String tvk;
  
  public sx()
  {
    GMTrace.i(3931505688576L, 29292);
    GMTrace.o(3931505688576L, 29292);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3931639906304L, 29293);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.tvd);
      paramVarArgs.fd(2, this.jXo);
      if (this.tvk != null) {
        paramVarArgs.e(3, this.tvk);
      }
      paramVarArgs.fd(4, this.tve);
      paramVarArgs.fd(5, this.tvf);
      paramVarArgs.fd(6, this.tvg);
      GMTrace.o(3931639906304L, 29293);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.tvd) + 0 + b.a.a.a.fa(2, this.jXo);
      paramInt = i;
      if (this.tvk != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.tvk);
      }
      i = b.a.a.a.fa(4, this.tve);
      int j = b.a.a.a.fa(5, this.tvf);
      int k = b.a.a.a.fa(6, this.tvg);
      GMTrace.o(3931639906304L, 29293);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3931639906304L, 29293);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      sx localsx = (sx)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3931639906304L, 29293);
        return -1;
      case 1: 
        localsx.tvd = locala.xSv.nm();
        GMTrace.o(3931639906304L, 29293);
        return 0;
      case 2: 
        localsx.jXo = locala.xSv.nm();
        GMTrace.o(3931639906304L, 29293);
        return 0;
      case 3: 
        localsx.tvk = locala.xSv.readString();
        GMTrace.o(3931639906304L, 29293);
        return 0;
      case 4: 
        localsx.tve = locala.xSv.nm();
        GMTrace.o(3931639906304L, 29293);
        return 0;
      case 5: 
        localsx.tvf = locala.xSv.nm();
        GMTrace.o(3931639906304L, 29293);
        return 0;
      }
      localsx.tvg = locala.xSv.nm();
      GMTrace.o(3931639906304L, 29293);
      return 0;
    }
    GMTrace.o(3931639906304L, 29293);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/sx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */