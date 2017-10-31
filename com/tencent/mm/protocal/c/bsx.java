package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bsx
  extends com.tencent.mm.bl.a
{
  public com.tencent.mm.bl.b tAZ;
  public LinkedList<bsu> tBa;
  public String uHG;
  
  public bsx()
  {
    GMTrace.i(15348334067712L, 114354);
    this.tBa = new LinkedList();
    GMTrace.o(15348334067712L, 114354);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15348468285440L, 114355);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uHG == null) {
        throw new b.a.a.b("Not all required fields were included: WxaUserName");
      }
      if (this.uHG != null) {
        paramVarArgs.e(1, this.uHG);
      }
      if (this.tAZ != null) {
        paramVarArgs.b(2, this.tAZ);
      }
      paramVarArgs.d(3, 8, this.tBa);
      GMTrace.o(15348468285440L, 114355);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uHG != null) {
        paramInt = b.a.a.b.b.a.f(1, this.uHG) + 0;
      }
      i = paramInt;
      if (this.tAZ != null) {
        i = paramInt + b.a.a.a.a(2, this.tAZ);
      }
      paramInt = b.a.a.a.c(3, 8, this.tBa);
      GMTrace.o(15348468285440L, 114355);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tBa.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.uHG == null) {
        throw new b.a.a.b("Not all required fields were included: WxaUserName");
      }
      GMTrace.o(15348468285440L, 114355);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bsx localbsx = (bsx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(15348468285440L, 114355);
        return -1;
      case 1: 
        localbsx.uHG = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(15348468285440L, 114355);
        return 0;
      case 2: 
        localbsx.tAZ = ((b.a.a.a.a)localObject1).cpI();
        GMTrace.o(15348468285440L, 114355);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bsu();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((bsu)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localbsx.tBa.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(15348468285440L, 114355);
      return 0;
    }
    GMTrace.o(15348468285440L, 114355);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bsx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */