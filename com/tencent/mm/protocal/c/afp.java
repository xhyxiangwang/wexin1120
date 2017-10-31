package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class afp
  extends axc
{
  public String huS;
  public String mDD;
  public String mEm;
  
  public afp()
  {
    GMTrace.i(17871627354112L, 133154);
    GMTrace.o(17871627354112L, 133154);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17871761571840L, 133155);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mDD == null) {
        throw new b("Not all required fields were included: AppId");
      }
      if (this.mEm == null) {
        throw new b("Not all required fields were included: Lang");
      }
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.mDD != null) {
        paramVarArgs.e(2, this.mDD);
      }
      if (this.mEm != null) {
        paramVarArgs.e(3, this.mEm);
      }
      if (this.huS != null) {
        paramVarArgs.e(4, this.huS);
      }
      GMTrace.o(17871761571840L, 133155);
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
      if (this.mDD != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mDD);
      }
      i = paramInt;
      if (this.mEm != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.mEm);
      }
      paramInt = i;
      if (this.huS != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.huS);
      }
      GMTrace.o(17871761571840L, 133155);
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
      if (this.mDD == null) {
        throw new b("Not all required fields were included: AppId");
      }
      if (this.mEm == null) {
        throw new b("Not all required fields were included: Lang");
      }
      GMTrace.o(17871761571840L, 133155);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      afp localafp = (afp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(17871761571840L, 133155);
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
          localafp.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17871761571840L, 133155);
        return 0;
      case 2: 
        localafp.mDD = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(17871761571840L, 133155);
        return 0;
      case 3: 
        localafp.mEm = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(17871761571840L, 133155);
        return 0;
      }
      localafp.huS = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(17871761571840L, 133155);
      return 0;
    }
    GMTrace.o(17871761571840L, 133155);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/afp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */