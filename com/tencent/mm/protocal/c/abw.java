package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class abw
  extends axc
{
  public int Height;
  public String URL;
  public int Width;
  public String tXV;
  
  public abw()
  {
    GMTrace.i(3985058562048L, 29691);
    GMTrace.o(3985058562048L, 29691);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3985192779776L, 29692);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.URL == null) {
        throw new b("Not all required fields were included: URL");
      }
      if (this.tXV == null) {
        throw new b("Not all required fields were included: UserAgent");
      }
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.URL != null) {
        paramVarArgs.e(2, this.URL);
      }
      if (this.tXV != null) {
        paramVarArgs.e(3, this.tXV);
      }
      paramVarArgs.fd(4, this.Width);
      paramVarArgs.fd(5, this.Height);
      GMTrace.o(3985192779776L, 29692);
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
      if (this.URL != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.URL);
      }
      i = paramInt;
      if (this.tXV != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tXV);
      }
      paramInt = b.a.a.a.fa(4, this.Width);
      int j = b.a.a.a.fa(5, this.Height);
      GMTrace.o(3985192779776L, 29692);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.URL == null) {
        throw new b("Not all required fields were included: URL");
      }
      if (this.tXV == null) {
        throw new b("Not all required fields were included: UserAgent");
      }
      GMTrace.o(3985192779776L, 29692);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      abw localabw = (abw)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3985192779776L, 29692);
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
          localabw.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3985192779776L, 29692);
        return 0;
      case 2: 
        localabw.URL = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3985192779776L, 29692);
        return 0;
      case 3: 
        localabw.tXV = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3985192779776L, 29692);
        return 0;
      case 4: 
        localabw.Width = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3985192779776L, 29692);
        return 0;
      }
      localabw.Height = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3985192779776L, 29692);
      return 0;
    }
    GMTrace.o(3985192779776L, 29692);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/abw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */