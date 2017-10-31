package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public class ace
  extends axk
{
  public String nat;
  public LinkedList<bcb> tYn;
  public int tYo;
  public int tYp;
  
  public ace()
  {
    GMTrace.i(20072395440128L, 149551);
    this.tYn = new LinkedList();
    GMTrace.o(20072395440128L, 149551);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20072529657856L, 149552);
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
      paramVarArgs.d(2, 8, this.tYn);
      if (this.nat != null) {
        paramVarArgs.e(3, this.nat);
      }
      paramVarArgs.fd(4, this.tYo);
      paramVarArgs.fd(5, this.tYp);
      GMTrace.o(20072529657856L, 149552);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 8, this.tYn);
      paramInt = i;
      if (this.nat != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.nat);
      }
      i = b.a.a.a.fa(4, this.tYo);
      int j = b.a.a.a.fa(5, this.tYp);
      GMTrace.o(20072529657856L, 149552);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tYn.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(20072529657856L, 149552);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ace localace = (ace)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(20072529657856L, 149552);
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
          localace.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(20072529657856L, 149552);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bcb();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bcb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localace.tYn.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(20072529657856L, 149552);
        return 0;
      case 3: 
        localace.nat = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(20072529657856L, 149552);
        return 0;
      case 4: 
        localace.tYo = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(20072529657856L, 149552);
        return 0;
      }
      localace.tYp = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(20072529657856L, 149552);
      return 0;
    }
    GMTrace.o(20072529657856L, 149552);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */