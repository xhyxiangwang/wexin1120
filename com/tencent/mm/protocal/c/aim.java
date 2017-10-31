package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aim
  extends axk
{
  public com.tencent.mm.bl.b jWD;
  public String mFw;
  public String tuq;
  public ahr udg;
  public ayd udn;
  
  public aim()
  {
    GMTrace.i(3619852124160L, 26970);
    GMTrace.o(3619852124160L, 26970);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3619986341888L, 26971);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urV == null) {
        throw new b.a.a.b("Not all required fields were included: BaseResponse");
      }
      if (this.urV != null)
      {
        paramVarArgs.ff(1, this.urV.aWM());
        this.urV.a(paramVarArgs);
      }
      if (this.udg != null)
      {
        paramVarArgs.ff(2, this.udg.aWM());
        this.udg.a(paramVarArgs);
      }
      if (this.jWD != null) {
        paramVarArgs.b(3, this.jWD);
      }
      if (this.udn != null)
      {
        paramVarArgs.ff(4, this.udn.aWM());
        this.udn.a(paramVarArgs);
      }
      if (this.mFw != null) {
        paramVarArgs.e(5, this.mFw);
      }
      if (this.tuq != null) {
        paramVarArgs.e(6, this.tuq);
      }
      GMTrace.o(3619986341888L, 26971);
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
      if (this.udg != null) {
        paramInt = i + b.a.a.a.fc(2, this.udg.aWM());
      }
      i = paramInt;
      if (this.jWD != null) {
        i = paramInt + b.a.a.a.a(3, this.jWD);
      }
      paramInt = i;
      if (this.udn != null) {
        paramInt = i + b.a.a.a.fc(4, this.udn.aWM());
      }
      i = paramInt;
      if (this.mFw != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.mFw);
      }
      paramInt = i;
      if (this.tuq != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tuq);
      }
      GMTrace.o(3619986341888L, 26971);
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
        throw new b.a.a.b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3619986341888L, 26971);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aim localaim = (aim)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3619986341888L, 26971);
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
          localaim.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3619986341888L, 26971);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ahr();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ahr)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localaim.udg = ((ahr)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3619986341888L, 26971);
        return 0;
      case 3: 
        localaim.jWD = ((b.a.a.a.a)localObject1).cpI();
        GMTrace.o(3619986341888L, 26971);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ayd();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ayd)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localaim.udn = ((ayd)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3619986341888L, 26971);
        return 0;
      case 5: 
        localaim.mFw = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3619986341888L, 26971);
        return 0;
      }
      localaim.tuq = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3619986341888L, 26971);
      return 0;
    }
    GMTrace.o(3619986341888L, 26971);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aim.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */