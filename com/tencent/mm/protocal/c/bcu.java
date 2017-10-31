package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bcu
  extends com.tencent.mm.bl.a
{
  public long tDg;
  public String tvh;
  public long uuK;
  public bct uuL;
  public bct uuM;
  
  public bcu()
  {
    GMTrace.i(3638911041536L, 27112);
    GMTrace.o(3638911041536L, 27112);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3639045259264L, 27113);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uuL == null) {
        throw new b("Not all required fields were included: CurrentAction");
      }
      paramVarArgs.R(1, this.tDg);
      paramVarArgs.R(2, this.uuK);
      if (this.uuL != null)
      {
        paramVarArgs.ff(3, this.uuL.aWM());
        this.uuL.a(paramVarArgs);
      }
      if (this.uuM != null)
      {
        paramVarArgs.ff(4, this.uuM.aWM());
        this.uuM.a(paramVarArgs);
      }
      if (this.tvh != null) {
        paramVarArgs.e(5, this.tvh);
      }
      GMTrace.o(3639045259264L, 27113);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.Q(1, this.tDg) + 0 + b.a.a.a.Q(2, this.uuK);
      paramInt = i;
      if (this.uuL != null) {
        paramInt = i + b.a.a.a.fc(3, this.uuL.aWM());
      }
      i = paramInt;
      if (this.uuM != null) {
        i = paramInt + b.a.a.a.fc(4, this.uuM.aWM());
      }
      paramInt = i;
      if (this.tvh != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tvh);
      }
      GMTrace.o(3639045259264L, 27113);
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
      if (this.uuL == null) {
        throw new b("Not all required fields were included: CurrentAction");
      }
      GMTrace.o(3639045259264L, 27113);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bcu localbcu = (bcu)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3639045259264L, 27113);
        return -1;
      case 1: 
        localbcu.tDg = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3639045259264L, 27113);
        return 0;
      case 2: 
        localbcu.uuK = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3639045259264L, 27113);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bct();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bct)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbcu.uuL = ((bct)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3639045259264L, 27113);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bct();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bct)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbcu.uuM = ((bct)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3639045259264L, 27113);
        return 0;
      }
      localbcu.tvh = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3639045259264L, 27113);
      return 0;
    }
    GMTrace.o(3639045259264L, 27113);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bcu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */