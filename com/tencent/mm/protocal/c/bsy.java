package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bsy
  extends com.tencent.mm.bl.a
{
  public int tvf;
  public int uHI;
  public int ugy;
  
  public bsy()
  {
    GMTrace.i(15350749986816L, 114372);
    GMTrace.o(15350749986816L, 114372);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15350884204544L, 114373);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.ugy);
      paramVarArgs.fd(2, this.tvf);
      paramVarArgs.fd(3, this.uHI);
      GMTrace.o(15350884204544L, 114373);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fa(1, this.ugy);
      int i = b.a.a.a.fa(2, this.tvf);
      int j = b.a.a.a.fa(3, this.uHI);
      GMTrace.o(15350884204544L, 114373);
      return paramInt + 0 + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(15350884204544L, 114373);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bsy localbsy = (bsy)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(15350884204544L, 114373);
        return -1;
      case 1: 
        localbsy.ugy = locala.xSv.nm();
        GMTrace.o(15350884204544L, 114373);
        return 0;
      case 2: 
        localbsy.tvf = locala.xSv.nm();
        GMTrace.o(15350884204544L, 114373);
        return 0;
      }
      localbsy.uHI = locala.xSv.nm();
      GMTrace.o(15350884204544L, 114373);
      return 0;
    }
    GMTrace.o(15350884204544L, 114373);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bsy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */