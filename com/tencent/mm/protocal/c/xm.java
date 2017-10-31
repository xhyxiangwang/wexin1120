package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class xm
  extends axc
{
  public String kqI;
  public double latitude;
  public double longitude;
  public String tUs;
  public String tUt;
  
  public xm()
  {
    GMTrace.i(3757425295360L, 27995);
    GMTrace.o(3757425295360L, 27995);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3757559513088L, 27996);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.a(2, this.latitude);
      paramVarArgs.a(3, this.longitude);
      if (this.kqI != null) {
        paramVarArgs.e(4, this.kqI);
      }
      if (this.tUs != null) {
        paramVarArgs.e(5, this.tUs);
      }
      if (this.tUt != null) {
        paramVarArgs.e(6, this.tUt);
      }
      GMTrace.o(3757559513088L, 27996);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + (b.a.a.b.b.a.cK(2) + 8) + (b.a.a.b.b.a.cK(3) + 8);
      paramInt = i;
      if (this.kqI != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.kqI);
      }
      i = paramInt;
      if (this.tUs != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tUs);
      }
      paramInt = i;
      if (this.tUt != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tUt);
      }
      GMTrace.o(3757559513088L, 27996);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3757559513088L, 27996);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      xm localxm = (xm)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3757559513088L, 27996);
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
          localxm.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3757559513088L, 27996);
        return 0;
      case 2: 
        localxm.latitude = ((b.a.a.a.a)localObject1).xSv.readDouble();
        GMTrace.o(3757559513088L, 27996);
        return 0;
      case 3: 
        localxm.longitude = ((b.a.a.a.a)localObject1).xSv.readDouble();
        GMTrace.o(3757559513088L, 27996);
        return 0;
      case 4: 
        localxm.kqI = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3757559513088L, 27996);
        return 0;
      case 5: 
        localxm.tUs = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3757559513088L, 27996);
        return 0;
      }
      localxm.tUt = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3757559513088L, 27996);
      return 0;
    }
    GMTrace.o(3757559513088L, 27996);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/xm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */