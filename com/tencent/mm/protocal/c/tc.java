package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class tc
  extends com.tencent.mm.bl.a
  implements bcg
{
  public int tCI;
  public axs tEO;
  public my tER;
  public int tyi;
  
  public tc()
  {
    GMTrace.i(3662399143936L, 27287);
    GMTrace.o(3662399143936L, 27287);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3662667579392L, 27289);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tER == null) {
        throw new b("Not all required fields were included: CmdList");
      }
      if (this.tEO == null) {
        throw new b("Not all required fields were included: KeyBuf");
      }
      paramVarArgs.fd(1, this.tyi);
      if (this.tER != null)
      {
        paramVarArgs.ff(2, this.tER.aWM());
        this.tER.a(paramVarArgs);
      }
      if (this.tEO != null)
      {
        paramVarArgs.ff(3, this.tEO.aWM());
        this.tEO.a(paramVarArgs);
      }
      paramVarArgs.fd(4, this.tCI);
      GMTrace.o(3662667579392L, 27289);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fa(1, this.tyi) + 0;
      paramInt = i;
      if (this.tER != null) {
        paramInt = i + b.a.a.a.fc(2, this.tER.aWM());
      }
      i = paramInt;
      if (this.tEO != null) {
        i = paramInt + b.a.a.a.fc(3, this.tEO.aWM());
      }
      paramInt = b.a.a.a.fa(4, this.tCI);
      GMTrace.o(3662667579392L, 27289);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.tER == null) {
        throw new b("Not all required fields were included: CmdList");
      }
      if (this.tEO == null) {
        throw new b("Not all required fields were included: KeyBuf");
      }
      GMTrace.o(3662667579392L, 27289);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      tc localtc = (tc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3662667579392L, 27289);
        return -1;
      case 1: 
        localtc.tyi = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3662667579392L, 27289);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new my();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((my)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localtc.tER = ((my)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3662667579392L, 27289);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localtc.tEO = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3662667579392L, 27289);
        return 0;
      }
      localtc.tCI = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3662667579392L, 27289);
      return 0;
    }
    GMTrace.o(3662667579392L, 27289);
    return -1;
  }
  
  public final int getRet()
  {
    GMTrace.i(3662533361664L, 27288);
    int i = this.tyi;
    GMTrace.o(3662533361664L, 27288);
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/tc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */