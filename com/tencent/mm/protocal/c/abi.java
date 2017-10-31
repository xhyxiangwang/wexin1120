package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class abi
  extends axc
{
  public String fvF;
  public String fxT;
  public String mdJ;
  public String mdK;
  public String mdL;
  public String tss;
  
  public abi()
  {
    GMTrace.i(3746151006208L, 27911);
    GMTrace.o(3746151006208L, 27911);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3746285223936L, 27912);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.fvF != null) {
        paramVarArgs.e(2, this.fvF);
      }
      if (this.mdJ != null) {
        paramVarArgs.e(3, this.mdJ);
      }
      if (this.mdK != null) {
        paramVarArgs.e(4, this.mdK);
      }
      if (this.mdL != null) {
        paramVarArgs.e(5, this.mdL);
      }
      if (this.fxT != null) {
        paramVarArgs.e(6, this.fxT);
      }
      if (this.tss != null) {
        paramVarArgs.e(7, this.tss);
      }
      GMTrace.o(3746285223936L, 27912);
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
      if (this.fvF != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.fvF);
      }
      i = paramInt;
      if (this.mdJ != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.mdJ);
      }
      paramInt = i;
      if (this.mdK != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mdK);
      }
      i = paramInt;
      if (this.mdL != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.mdL);
      }
      paramInt = i;
      if (this.fxT != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.fxT);
      }
      i = paramInt;
      if (this.tss != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.tss);
      }
      GMTrace.o(3746285223936L, 27912);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3746285223936L, 27912);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      abi localabi = (abi)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3746285223936L, 27912);
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
          localabi.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3746285223936L, 27912);
        return 0;
      case 2: 
        localabi.fvF = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3746285223936L, 27912);
        return 0;
      case 3: 
        localabi.mdJ = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3746285223936L, 27912);
        return 0;
      case 4: 
        localabi.mdK = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3746285223936L, 27912);
        return 0;
      case 5: 
        localabi.mdL = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3746285223936L, 27912);
        return 0;
      case 6: 
        localabi.fxT = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3746285223936L, 27912);
        return 0;
      }
      localabi.tss = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3746285223936L, 27912);
      return 0;
    }
    GMTrace.o(3746285223936L, 27912);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/abi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */