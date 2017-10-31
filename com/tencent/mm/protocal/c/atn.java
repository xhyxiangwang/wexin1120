package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class atn
  extends axk
{
  public int tNa;
  public long tNb;
  public LinkedList<atc> tyd;
  public LinkedList<atc> uoX;
  
  public atn()
  {
    GMTrace.i(3718770589696L, 27707);
    this.tyd = new LinkedList();
    this.uoX = new LinkedList();
    GMTrace.o(3718770589696L, 27707);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3718904807424L, 27708);
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
      paramVarArgs.fd(2, this.tNa);
      paramVarArgs.R(3, this.tNb);
      paramVarArgs.d(4, 8, this.tyd);
      paramVarArgs.d(5, 8, this.uoX);
      GMTrace.o(3718904807424L, 27708);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = b.a.a.a.fa(2, this.tNa);
      int j = b.a.a.a.Q(3, this.tNb);
      int k = b.a.a.a.c(4, 8, this.tyd);
      int m = b.a.a.a.c(5, 8, this.uoX);
      GMTrace.o(3718904807424L, 27708);
      return paramInt + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tyd.clear();
      this.uoX.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3718904807424L, 27708);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      atn localatn = (atn)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3718904807424L, 27708);
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
          localatn.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3718904807424L, 27708);
        return 0;
      case 2: 
        localatn.tNa = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3718904807424L, 27708);
        return 0;
      case 3: 
        localatn.tNb = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3718904807424L, 27708);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new atc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((atc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localatn.tyd.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3718904807424L, 27708);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new atc();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((atc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
        localatn.uoX.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3718904807424L, 27708);
      return 0;
    }
    GMTrace.o(3718904807424L, 27708);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/atn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */