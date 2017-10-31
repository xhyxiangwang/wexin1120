package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bay
  extends axc
{
  public String appId;
  public String fxT;
  public int mhK;
  
  public bay()
  {
    GMTrace.i(3862920429568L, 28781);
    GMTrace.o(3862920429568L, 28781);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3863054647296L, 28782);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.appId != null) {
        paramVarArgs.e(2, this.appId);
      }
      paramVarArgs.fd(3, this.mhK);
      if (this.fxT != null) {
        paramVarArgs.e(4, this.fxT);
      }
      GMTrace.o(3863054647296L, 28782);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt;
      if (this.appId != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.appId);
      }
      i += b.a.a.a.fa(3, this.mhK);
      paramInt = i;
      if (this.fxT != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.fxT);
      }
      GMTrace.o(3863054647296L, 28782);
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
      GMTrace.o(3863054647296L, 28782);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bay localbay = (bay)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3863054647296L, 28782);
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
          localbay.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3863054647296L, 28782);
        return 0;
      case 2: 
        localbay.appId = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3863054647296L, 28782);
        return 0;
      case 3: 
        localbay.mhK = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3863054647296L, 28782);
        return 0;
      }
      localbay.fxT = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3863054647296L, 28782);
      return 0;
    }
    GMTrace.o(3863054647296L, 28782);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */