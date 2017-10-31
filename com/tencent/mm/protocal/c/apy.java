package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class apy
  extends axc
{
  public int mDF;
  public String umm;
  public nm umn;
  public nm umo;
  
  public apy()
  {
    GMTrace.i(3923452624896L, 29232);
    GMTrace.o(3923452624896L, 29232);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3923586842624L, 29233);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.umn == null) {
        throw new b("Not all required fields were included: BigContentInfo");
      }
      if (this.umo == null) {
        throw new b("Not all required fields were included: SmallContentInfo");
      }
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.umm != null) {
        paramVarArgs.e(2, this.umm);
      }
      if (this.umn != null)
      {
        paramVarArgs.ff(3, this.umn.aWM());
        this.umn.a(paramVarArgs);
      }
      if (this.umo != null)
      {
        paramVarArgs.ff(4, this.umo.aWM());
        this.umo.a(paramVarArgs);
      }
      paramVarArgs.fd(5, this.mDF);
      GMTrace.o(3923586842624L, 29233);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.urE != null) {
        i = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      paramInt = i;
      if (this.umm != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.umm);
      }
      i = paramInt;
      if (this.umn != null) {
        i = paramInt + b.a.a.a.fc(3, this.umn.aWM());
      }
      paramInt = i;
      if (this.umo != null) {
        paramInt = i + b.a.a.a.fc(4, this.umo.aWM());
      }
      i = b.a.a.a.fa(5, this.mDF);
      GMTrace.o(3923586842624L, 29233);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.umn == null) {
        throw new b("Not all required fields were included: BigContentInfo");
      }
      if (this.umo == null) {
        throw new b("Not all required fields were included: SmallContentInfo");
      }
      GMTrace.o(3923586842624L, 29233);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      apy localapy = (apy)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3923586842624L, 29233);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new en();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((en)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localapy.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3923586842624L, 29233);
        return 0;
      case 2: 
        localapy.umm = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3923586842624L, 29233);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new nm();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((nm)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localapy.umn = ((nm)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3923586842624L, 29233);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new nm();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((nm)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localapy.umo = ((nm)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3923586842624L, 29233);
        return 0;
      }
      localapy.mDF = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3923586842624L, 29233);
      return 0;
    }
    GMTrace.o(3923586842624L, 29233);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/apy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */