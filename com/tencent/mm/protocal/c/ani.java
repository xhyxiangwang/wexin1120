package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ani
  extends com.tencent.mm.bl.a
{
  public int jXo;
  public axt tuX;
  
  public ani()
  {
    GMTrace.i(4015928639488L, 29921);
    GMTrace.o(4015928639488L, 29921);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4016062857216L, 29922);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tuX == null) {
        throw new b("Not all required fields were included: ChatRoomName");
      }
      if (this.tuX != null)
      {
        paramVarArgs.ff(1, this.tuX.aWM());
        this.tuX.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.jXo);
      GMTrace.o(4016062857216L, 29922);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.tuX != null) {
        paramInt = b.a.a.a.fc(1, this.tuX.aWM()) + 0;
      }
      i = b.a.a.a.fa(2, this.jXo);
      GMTrace.o(4016062857216L, 29922);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.tuX == null) {
        throw new b("Not all required fields were included: ChatRoomName");
      }
      GMTrace.o(4016062857216L, 29922);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ani localani = (ani)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4016062857216L, 29922);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axt();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((axt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localani.tuX = ((axt)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4016062857216L, 29922);
        return 0;
      }
      localani.jXo = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(4016062857216L, 29922);
      return 0;
    }
    GMTrace.o(4016062857216L, 29922);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ani.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */