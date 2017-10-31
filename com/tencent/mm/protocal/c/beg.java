package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class beg
  extends axk
{
  public int jWQ;
  public LinkedList<bee> jWR;
  public int qbW;
  public int tsp;
  public String uwm;
  
  public beg()
  {
    GMTrace.i(3680921190400L, 27425);
    this.jWR = new LinkedList();
    GMTrace.o(3680921190400L, 27425);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3681055408128L, 27426);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.urV != null)
      {
        paramVarArgs.ff(1, this.urV.aWM());
        this.urV.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.tsp);
      if (this.uwm != null) {
        paramVarArgs.e(3, this.uwm);
      }
      paramVarArgs.fd(4, this.jWQ);
      paramVarArgs.d(5, 8, this.jWR);
      paramVarArgs.fd(6, this.qbW);
      GMTrace.o(3681055408128L, 27426);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.tsp);
      paramInt = i;
      if (this.uwm != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.uwm);
      }
      i = b.a.a.a.fa(4, this.jWQ);
      int j = b.a.a.a.c(5, 8, this.jWR);
      int k = b.a.a.a.fa(6, this.qbW);
      GMTrace.o(3681055408128L, 27426);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.jWR.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3681055408128L, 27426);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      beg localbeg = (beg)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3681055408128L, 27426);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new eo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((eo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localbeg.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3681055408128L, 27426);
        return 0;
      case 2: 
        localbeg.tsp = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3681055408128L, 27426);
        return 0;
      case 3: 
        localbeg.uwm = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3681055408128L, 27426);
        return 0;
      case 4: 
        localbeg.jWQ = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3681055408128L, 27426);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bee();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bee)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localbeg.jWR.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3681055408128L, 27426);
        return 0;
      }
      localbeg.qbW = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3681055408128L, 27426);
      return 0;
    }
    GMTrace.o(3681055408128L, 27426);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/beg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */