package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class c
  extends axk
{
  public int kKx;
  public String kKy;
  public String tru;
  
  public c()
  {
    GMTrace.i(3653809209344L, 27223);
    this.kKx = 268513600;
    this.kKy = "请求不成功，请稍候再试";
    GMTrace.o(3653809209344L, 27223);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3653943427072L, 27224);
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
      paramVarArgs.fd(2, this.kKx);
      if (this.kKy != null) {
        paramVarArgs.e(3, this.kKy);
      }
      if (this.tru != null) {
        paramVarArgs.e(4, this.tru);
      }
      GMTrace.o(3653943427072L, 27224);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.kKx);
      paramInt = i;
      if (this.kKy != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.kKy);
      }
      i = paramInt;
      if (this.tru != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.tru);
      }
      GMTrace.o(3653943427072L, 27224);
      return i;
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
      GMTrace.o(3653943427072L, 27224);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      c localc = (c)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3653943427072L, 27224);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new eo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((eo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localc.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3653943427072L, 27224);
        return 0;
      case 2: 
        localc.kKx = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3653943427072L, 27224);
        return 0;
      case 3: 
        localc.kKy = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3653943427072L, 27224);
        return 0;
      }
      localc.tru = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3653943427072L, 27224);
      return 0;
    }
    GMTrace.o(3653943427072L, 27224);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */