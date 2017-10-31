package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bsg
  extends axk
{
  public String fwU;
  public int uHa;
  public int upn;
  public String url;
  public int version;
  
  public bsg()
  {
    GMTrace.i(3755814682624L, 27983);
    GMTrace.o(3755814682624L, 27983);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3755948900352L, 27984);
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
      if (this.url != null) {
        paramVarArgs.e(2, this.url);
      }
      if (this.fwU != null) {
        paramVarArgs.e(3, this.fwU);
      }
      paramVarArgs.fd(4, this.version);
      paramVarArgs.fd(5, this.uHa);
      paramVarArgs.fd(6, this.upn);
      GMTrace.o(3755948900352L, 27984);
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
      if (this.url != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.url);
      }
      i = paramInt;
      if (this.fwU != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.fwU);
      }
      paramInt = b.a.a.a.fa(4, this.version);
      int j = b.a.a.a.fa(5, this.uHa);
      int k = b.a.a.a.fa(6, this.upn);
      GMTrace.o(3755948900352L, 27984);
      return i + paramInt + j + k;
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
      GMTrace.o(3755948900352L, 27984);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bsg localbsg = (bsg)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3755948900352L, 27984);
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
          localbsg.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3755948900352L, 27984);
        return 0;
      case 2: 
        localbsg.url = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3755948900352L, 27984);
        return 0;
      case 3: 
        localbsg.fwU = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3755948900352L, 27984);
        return 0;
      case 4: 
        localbsg.version = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3755948900352L, 27984);
        return 0;
      case 5: 
        localbsg.uHa = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3755948900352L, 27984);
        return 0;
      }
      localbsg.upn = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3755948900352L, 27984);
      return 0;
    }
    GMTrace.o(3755948900352L, 27984);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */