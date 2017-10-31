package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ajx
  extends axk
{
  public ajv ueW;
  public lq ueX;
  public bsj ueY;
  public atv ueZ;
  public av ufa;
  
  public ajx()
  {
    GMTrace.i(15348065632256L, 114352);
    GMTrace.o(15348065632256L, 114352);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15348199849984L, 114353);
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
      if (this.ueW != null)
      {
        paramVarArgs.ff(2, this.ueW.aWM());
        this.ueW.a(paramVarArgs);
      }
      if (this.ueX != null)
      {
        paramVarArgs.ff(3, this.ueX.aWM());
        this.ueX.a(paramVarArgs);
      }
      if (this.ueY != null)
      {
        paramVarArgs.ff(4, this.ueY.aWM());
        this.ueY.a(paramVarArgs);
      }
      if (this.ueZ != null)
      {
        paramVarArgs.ff(5, this.ueZ.aWM());
        this.ueZ.a(paramVarArgs);
      }
      if (this.ufa != null)
      {
        paramVarArgs.ff(6, this.ufa.aWM());
        this.ufa.a(paramVarArgs);
      }
      GMTrace.o(15348199849984L, 114353);
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
      if (this.ueW != null) {
        paramInt = i + b.a.a.a.fc(2, this.ueW.aWM());
      }
      i = paramInt;
      if (this.ueX != null) {
        i = paramInt + b.a.a.a.fc(3, this.ueX.aWM());
      }
      paramInt = i;
      if (this.ueY != null) {
        paramInt = i + b.a.a.a.fc(4, this.ueY.aWM());
      }
      i = paramInt;
      if (this.ueZ != null) {
        i = paramInt + b.a.a.a.fc(5, this.ueZ.aWM());
      }
      paramInt = i;
      if (this.ufa != null) {
        paramInt = i + b.a.a.a.fc(6, this.ufa.aWM());
      }
      GMTrace.o(15348199849984L, 114353);
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
      GMTrace.o(15348199849984L, 114353);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ajx localajx = (ajx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(15348199849984L, 114353);
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
          localajx.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15348199849984L, 114353);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ajv();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ajv)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localajx.ueW = ((ajv)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15348199849984L, 114353);
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
          localajx.ueX = ((lq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15348199849984L, 114353);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bsj();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bsj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localajx.ueY = ((bsj)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15348199849984L, 114353);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new atv();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((atv)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localajx.ueZ = ((atv)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15348199849984L, 114353);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new av();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((av)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
        localajx.ufa = ((av)localObject1);
        paramInt += 1;
      }
      GMTrace.o(15348199849984L, 114353);
      return 0;
    }
    GMTrace.o(15348199849984L, 114353);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ajx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */