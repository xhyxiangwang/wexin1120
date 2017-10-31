package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bed
  extends axk
{
  public int tCI;
  public axs tEO;
  public my tER;
  
  public bed()
  {
    GMTrace.i(3868557574144L, 28823);
    GMTrace.o(3868557574144L, 28823);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3868691791872L, 28824);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.tER == null) {
        throw new b("Not all required fields were included: CmdList");
      }
      if (this.tEO == null) {
        throw new b("Not all required fields were included: KeyBuf");
      }
      if (this.urV != null)
      {
        paramVarArgs.ff(1, this.urV.aWM());
        this.urV.a(paramVarArgs);
      }
      if (this.tER != null)
      {
        paramVarArgs.ff(2, this.tER.aWM());
        this.tER.a(paramVarArgs);
      }
      paramVarArgs.fd(3, this.tCI);
      if (this.tEO != null)
      {
        paramVarArgs.ff(4, this.tEO.aWM());
        this.tEO.a(paramVarArgs);
      }
      GMTrace.o(3868691791872L, 28824);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt;
      if (this.tER != null) {
        i = paramInt + b.a.a.a.fc(2, this.tER.aWM());
      }
      i += b.a.a.a.fa(3, this.tCI);
      paramInt = i;
      if (this.tEO != null) {
        paramInt = i + b.a.a.a.fc(4, this.tEO.aWM());
      }
      GMTrace.o(3868691791872L, 28824);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.tER == null) {
        throw new b("Not all required fields were included: CmdList");
      }
      if (this.tEO == null) {
        throw new b("Not all required fields were included: KeyBuf");
      }
      GMTrace.o(3868691791872L, 28824);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bed localbed = (bed)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3868691791872L, 28824);
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
          localbed.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3868691791872L, 28824);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new my();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((my)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localbed.tER = ((my)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3868691791872L, 28824);
        return 0;
      case 3: 
        localbed.tCI = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3868691791872L, 28824);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new axs();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
        localbed.tEO = ((axs)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3868691791872L, 28824);
      return 0;
    }
    GMTrace.o(3868691791872L, 28824);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bed.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */