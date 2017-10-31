package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bj
  extends axc
{
  public int kCJ;
  public LinkedList<amr> tuW;
  public axt tuX;
  public int tuY;
  public String tuZ;
  
  public bj()
  {
    GMTrace.i(3620925865984L, 26978);
    this.tuW = new LinkedList();
    GMTrace.o(3620925865984L, 26978);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3621060083712L, 26979);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tuX == null) {
        throw new b("Not all required fields were included: ChatRoomName");
      }
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.kCJ);
      paramVarArgs.d(3, 8, this.tuW);
      if (this.tuX != null)
      {
        paramVarArgs.ff(4, this.tuX.aWM());
        this.tuX.a(paramVarArgs);
      }
      paramVarArgs.fd(5, this.tuY);
      if (this.tuZ != null) {
        paramVarArgs.e(6, this.tuZ);
      }
      GMTrace.o(3621060083712L, 26979);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.kCJ) + b.a.a.a.c(3, 8, this.tuW);
      paramInt = i;
      if (this.tuX != null) {
        paramInt = i + b.a.a.a.fc(4, this.tuX.aWM());
      }
      i = paramInt + b.a.a.a.fa(5, this.tuY);
      paramInt = i;
      if (this.tuZ != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tuZ);
      }
      GMTrace.o(3621060083712L, 26979);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tuW.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.tuX == null) {
        throw new b("Not all required fields were included: ChatRoomName");
      }
      GMTrace.o(3621060083712L, 26979);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bj localbj = (bj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3621060083712L, 26979);
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
          localbj.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3621060083712L, 26979);
        return 0;
      case 2: 
        localbj.kCJ = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3621060083712L, 26979);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new amr();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((amr)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localbj.tuW.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3621060083712L, 26979);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axt();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localbj.tuX = ((axt)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3621060083712L, 26979);
        return 0;
      case 5: 
        localbj.tuY = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3621060083712L, 26979);
        return 0;
      }
      localbj.tuZ = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3621060083712L, 26979);
      return 0;
    }
    GMTrace.o(3621060083712L, 26979);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */