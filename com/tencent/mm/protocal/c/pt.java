package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.b;
import java.util.LinkedList;

public final class pt
  extends axk
{
  public int hWK;
  public b tLv;
  
  public pt()
  {
    GMTrace.i(17616076800000L, 131250);
    GMTrace.o(17616076800000L, 131250);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17616211017728L, 131251);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urV != null)
      {
        paramVarArgs.ff(1, this.urV.aWM());
        this.urV.a(paramVarArgs);
      }
      if (this.tLv != null) {
        paramVarArgs.b(2, this.tLv);
      }
      paramVarArgs.fd(3, this.hWK);
      GMTrace.o(17616211017728L, 131251);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt;
      if (this.tLv != null) {
        i = paramInt + b.a.a.a.a(2, this.tLv);
      }
      paramInt = b.a.a.a.fa(3, this.hWK);
      GMTrace.o(17616211017728L, 131251);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(17616211017728L, 131251);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      pt localpt = (pt)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(17616211017728L, 131251);
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
          localpt.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17616211017728L, 131251);
        return 0;
      case 2: 
        localpt.tLv = ((b.a.a.a.a)localObject1).cpI();
        GMTrace.o(17616211017728L, 131251);
        return 0;
      }
      localpt.hWK = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(17616211017728L, 131251);
      return 0;
    }
    GMTrace.o(17616211017728L, 131251);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/pt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */