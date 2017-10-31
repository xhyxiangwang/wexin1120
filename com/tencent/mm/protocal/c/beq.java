package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class beq
  extends axc
{
  public String twR;
  public int twh;
  public String uuR;
  public long uuS;
  public long uwo;
  public int uwp;
  
  public beq()
  {
    GMTrace.i(3950296170496L, 29432);
    GMTrace.o(3950296170496L, 29432);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3950430388224L, 29433);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.uuR != null) {
        paramVarArgs.e(2, this.uuR);
      }
      if (this.twR != null) {
        paramVarArgs.e(3, this.twR);
      }
      paramVarArgs.R(4, this.uuS);
      paramVarArgs.fd(5, this.twh);
      paramVarArgs.R(6, this.uwo);
      paramVarArgs.fd(7, this.uwp);
      GMTrace.o(3950430388224L, 29433);
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
      if (this.uuR != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uuR);
      }
      i = paramInt;
      if (this.twR != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.twR);
      }
      paramInt = b.a.a.a.Q(4, this.uuS);
      int j = b.a.a.a.fa(5, this.twh);
      int k = b.a.a.a.Q(6, this.uwo);
      int m = b.a.a.a.fa(7, this.uwp);
      GMTrace.o(3950430388224L, 29433);
      return i + paramInt + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3950430388224L, 29433);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      beq localbeq = (beq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3950430388224L, 29433);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new en();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((en)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localbeq.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3950430388224L, 29433);
        return 0;
      case 2: 
        localbeq.uuR = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3950430388224L, 29433);
        return 0;
      case 3: 
        localbeq.twR = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3950430388224L, 29433);
        return 0;
      case 4: 
        localbeq.uuS = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3950430388224L, 29433);
        return 0;
      case 5: 
        localbeq.twh = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3950430388224L, 29433);
        return 0;
      case 6: 
        localbeq.uwo = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3950430388224L, 29433);
        return 0;
      }
      localbeq.uwp = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3950430388224L, 29433);
      return 0;
    }
    GMTrace.o(3950430388224L, 29433);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/beq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */