package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ajz
  extends axk
{
  public lq ueX;
  public brv ufc;
  public brw ufd;
  public btj ufe;
  
  public ajz()
  {
    GMTrace.i(17616613670912L, 131254);
    GMTrace.o(17616613670912L, 131254);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17616747888640L, 131255);
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
      if (this.ufc != null)
      {
        paramVarArgs.ff(2, this.ufc.aWM());
        this.ufc.a(paramVarArgs);
      }
      if (this.ueX != null)
      {
        paramVarArgs.ff(3, this.ueX.aWM());
        this.ueX.a(paramVarArgs);
      }
      if (this.ufd != null)
      {
        paramVarArgs.ff(4, this.ufd.aWM());
        this.ufd.a(paramVarArgs);
      }
      if (this.ufe != null)
      {
        paramVarArgs.ff(5, this.ufe.aWM());
        this.ufe.a(paramVarArgs);
      }
      GMTrace.o(17616747888640L, 131255);
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
      if (this.ufc != null) {
        paramInt = i + b.a.a.a.fc(2, this.ufc.aWM());
      }
      i = paramInt;
      if (this.ueX != null) {
        i = paramInt + b.a.a.a.fc(3, this.ueX.aWM());
      }
      paramInt = i;
      if (this.ufd != null) {
        paramInt = i + b.a.a.a.fc(4, this.ufd.aWM());
      }
      i = paramInt;
      if (this.ufe != null) {
        i = paramInt + b.a.a.a.fc(5, this.ufe.aWM());
      }
      GMTrace.o(17616747888640L, 131255);
      return i;
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
      GMTrace.o(17616747888640L, 131255);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ajz localajz = (ajz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(17616747888640L, 131255);
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
          localajz.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17616747888640L, 131255);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new brv();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((brv)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localajz.ufc = ((brv)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17616747888640L, 131255);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new lq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((lq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localajz.ueX = ((lq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17616747888640L, 131255);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new brw();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((brw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localajz.ufd = ((brw)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17616747888640L, 131255);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new btj();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((btj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
        localajz.ufe = ((btj)localObject1);
        paramInt += 1;
      }
      GMTrace.o(17616747888640L, 131255);
      return 0;
    }
    GMTrace.o(17616747888640L, 131255);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ajz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */