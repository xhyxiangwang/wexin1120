package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class uf
  extends axk
{
  public String tSf;
  public LinkedList<ug> tSm;
  
  public uf()
  {
    GMTrace.i(3940632494080L, 29360);
    this.tSm = new LinkedList();
    GMTrace.o(3940632494080L, 29360);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3940766711808L, 29361);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.tSf == null) {
        throw new b("Not all required fields were included: JsonData");
      }
      if (this.urV != null)
      {
        paramVarArgs.ff(1, this.urV.aWM());
        this.urV.a(paramVarArgs);
      }
      paramVarArgs.d(2, 8, this.tSm);
      if (this.tSf != null) {
        paramVarArgs.e(3, this.tSf);
      }
      GMTrace.o(3940766711808L, 29361);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 8, this.tSm);
      paramInt = i;
      if (this.tSf != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.tSf);
      }
      GMTrace.o(3940766711808L, 29361);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tSm.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.tSf == null) {
        throw new b("Not all required fields were included: JsonData");
      }
      GMTrace.o(3940766711808L, 29361);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      uf localuf = (uf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3940766711808L, 29361);
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
          localuf.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3940766711808L, 29361);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ug();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ug)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localuf.tSm.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3940766711808L, 29361);
        return 0;
      }
      localuf.tSf = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3940766711808L, 29361);
      return 0;
    }
    GMTrace.o(3940766711808L, 29361);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/uf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */