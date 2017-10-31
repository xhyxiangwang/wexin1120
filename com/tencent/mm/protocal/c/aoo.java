package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aoo
  extends com.tencent.mm.bl.a
{
  public LinkedList<String> ukG;
  public LinkedList<String> ukH;
  public LinkedList<String> ukI;
  public LinkedList<String> ukJ;
  
  public aoo()
  {
    GMTrace.i(3803730411520L, 28340);
    this.ukG = new LinkedList();
    this.ukH = new LinkedList();
    this.ukI = new LinkedList();
    this.ukJ = new LinkedList();
    GMTrace.o(3803730411520L, 28340);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3803864629248L, 28341);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(5, 1, this.ukG);
      paramVarArgs.d(6, 1, this.ukH);
      paramVarArgs.d(7, 1, this.ukI);
      paramVarArgs.d(8, 1, this.ukJ);
      GMTrace.o(3803864629248L, 28341);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(5, 1, this.ukG);
      int i = b.a.a.a.c(6, 1, this.ukH);
      int j = b.a.a.a.c(7, 1, this.ukI);
      int k = b.a.a.a.c(8, 1, this.ukJ);
      GMTrace.o(3803864629248L, 28341);
      return paramInt + 0 + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.ukG.clear();
      this.ukH.clear();
      this.ukI.clear();
      this.ukJ.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3803864629248L, 28341);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      aoo localaoo = (aoo)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3803864629248L, 28341);
        return -1;
      case 5: 
        localaoo.ukG.add(locala.xSv.readString());
        GMTrace.o(3803864629248L, 28341);
        return 0;
      case 6: 
        localaoo.ukH.add(locala.xSv.readString());
        GMTrace.o(3803864629248L, 28341);
        return 0;
      case 7: 
        localaoo.ukI.add(locala.xSv.readString());
        GMTrace.o(3803864629248L, 28341);
        return 0;
      }
      localaoo.ukJ.add(locala.xSv.readString());
      GMTrace.o(3803864629248L, 28341);
      return 0;
    }
    GMTrace.o(3803864629248L, 28341);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aoo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */