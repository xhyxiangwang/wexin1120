package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class jm
  extends axk
{
  public int tCI;
  public axs tEO;
  public my tER;
  public int tES;
  
  public jm()
  {
    GMTrace.i(3993648496640L, 29755);
    GMTrace.o(3993648496640L, 29755);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3993782714368L, 29756);
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
      if (this.tER != null)
      {
        paramVarArgs.ff(2, this.tER.aWM());
        this.tER.a(paramVarArgs);
      }
      if (this.tEO != null)
      {
        paramVarArgs.ff(3, this.tEO.aWM());
        this.tEO.a(paramVarArgs);
      }
      paramVarArgs.fd(4, this.tCI);
      paramVarArgs.fd(5, this.tES);
      GMTrace.o(3993782714368L, 29756);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.urV != null) {
        i = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      paramInt = i;
      if (this.tER != null) {
        paramInt = i + b.a.a.a.fc(2, this.tER.aWM());
      }
      i = paramInt;
      if (this.tEO != null) {
        i = paramInt + b.a.a.a.fc(3, this.tEO.aWM());
      }
      paramInt = b.a.a.a.fa(4, this.tCI);
      int j = b.a.a.a.fa(5, this.tES);
      GMTrace.o(3993782714368L, 29756);
      return i + paramInt + j;
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
      GMTrace.o(3993782714368L, 29756);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      jm localjm = (jm)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3993782714368L, 29756);
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
          localjm.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3993782714368L, 29756);
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
          localjm.tER = ((my)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3993782714368L, 29756);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localjm.tEO = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3993782714368L, 29756);
        return 0;
      case 4: 
        localjm.tCI = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3993782714368L, 29756);
        return 0;
      }
      localjm.tES = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3993782714368L, 29756);
      return 0;
    }
    GMTrace.o(3993782714368L, 29756);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/jm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */