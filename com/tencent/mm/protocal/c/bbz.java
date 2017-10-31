package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bbz
  extends com.tencent.mm.bl.a
{
  public LinkedList<String> uud;
  public LinkedList<String> uue;
  public LinkedList<Integer> uuf;
  public LinkedList<Integer> uug;
  
  public bbz()
  {
    GMTrace.i(3865873219584L, 28803);
    this.uud = new LinkedList();
    this.uue = new LinkedList();
    this.uuf = new LinkedList();
    this.uug = new LinkedList();
    GMTrace.o(3865873219584L, 28803);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3866007437312L, 28804);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 1, this.uud);
      paramVarArgs.d(2, 1, this.uue);
      paramVarArgs.d(3, 2, this.uuf);
      paramVarArgs.d(4, 2, this.uug);
      GMTrace.o(3866007437312L, 28804);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(1, 1, this.uud);
      int i = b.a.a.a.c(2, 1, this.uue);
      int j = b.a.a.a.c(3, 2, this.uuf);
      int k = b.a.a.a.c(4, 2, this.uug);
      GMTrace.o(3866007437312L, 28804);
      return paramInt + 0 + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uud.clear();
      this.uue.clear();
      this.uuf.clear();
      this.uug.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3866007437312L, 28804);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bbz localbbz = (bbz)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3866007437312L, 28804);
        return -1;
      case 1: 
        localbbz.uud.add(locala.xSv.readString());
        GMTrace.o(3866007437312L, 28804);
        return 0;
      case 2: 
        localbbz.uue.add(locala.xSv.readString());
        GMTrace.o(3866007437312L, 28804);
        return 0;
      case 3: 
        localbbz.uuf.add(Integer.valueOf(locala.xSv.nm()));
        GMTrace.o(3866007437312L, 28804);
        return 0;
      }
      localbbz.uug.add(Integer.valueOf(locala.xSv.nm()));
      GMTrace.o(3866007437312L, 28804);
      return 0;
    }
    GMTrace.o(3866007437312L, 28804);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bbz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */