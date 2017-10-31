package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bdy
  extends com.tencent.mm.bl.a
{
  public bdk uuw;
  public axt uvX;
  
  public bdy()
  {
    GMTrace.i(3883724177408L, 28936);
    GMTrace.o(3883724177408L, 28936);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3883858395136L, 28937);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uuw == null) {
        throw new b("Not all required fields were included: SnsObject");
      }
      if (this.uuw != null)
      {
        paramVarArgs.ff(1, this.uuw.aWM());
        this.uuw.a(paramVarArgs);
      }
      if (this.uvX != null)
      {
        paramVarArgs.ff(2, this.uvX.aWM());
        this.uvX.a(paramVarArgs);
      }
      GMTrace.o(3883858395136L, 28937);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uuw != null) {
        paramInt = b.a.a.a.fc(1, this.uuw.aWM()) + 0;
      }
      i = paramInt;
      if (this.uvX != null) {
        i = paramInt + b.a.a.a.fc(2, this.uvX.aWM());
      }
      GMTrace.o(3883858395136L, 28937);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.uuw == null) {
        throw new b("Not all required fields were included: SnsObject");
      }
      GMTrace.o(3883858395136L, 28937);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bdy localbdy = (bdy)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3883858395136L, 28937);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bdk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bdk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbdy.uuw = ((bdk)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3883858395136L, 28937);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new axt();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((axt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localbdy.uvX = ((axt)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3883858395136L, 28937);
      return 0;
    }
    GMTrace.o(3883858395136L, 28937);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bdy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */