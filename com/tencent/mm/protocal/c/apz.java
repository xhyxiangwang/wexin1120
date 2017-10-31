package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class apz
  extends axk
{
  public int tLt;
  public nl ump;
  public nl umq;
  
  public apz()
  {
    GMTrace.i(3624415526912L, 27004);
    GMTrace.o(3624415526912L, 27004);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3624549744640L, 27005);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.ump == null) {
        throw new b("Not all required fields were included: SmallContentBuff");
      }
      if (this.umq == null) {
        throw new b("Not all required fields were included: BigContentBuff");
      }
      if (this.urV != null)
      {
        paramVarArgs.ff(1, this.urV.aWM());
        this.urV.a(paramVarArgs);
      }
      if (this.ump != null)
      {
        paramVarArgs.ff(2, this.ump.aWM());
        this.ump.a(paramVarArgs);
      }
      if (this.umq != null)
      {
        paramVarArgs.ff(3, this.umq.aWM());
        this.umq.a(paramVarArgs);
      }
      paramVarArgs.fd(4, this.tLt);
      GMTrace.o(3624549744640L, 27005);
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
      if (this.ump != null) {
        paramInt = i + b.a.a.a.fc(2, this.ump.aWM());
      }
      i = paramInt;
      if (this.umq != null) {
        i = paramInt + b.a.a.a.fc(3, this.umq.aWM());
      }
      paramInt = b.a.a.a.fa(4, this.tLt);
      GMTrace.o(3624549744640L, 27005);
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
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.ump == null) {
        throw new b("Not all required fields were included: SmallContentBuff");
      }
      if (this.umq == null) {
        throw new b("Not all required fields were included: BigContentBuff");
      }
      GMTrace.o(3624549744640L, 27005);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      apz localapz = (apz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3624549744640L, 27005);
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
          localapz.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3624549744640L, 27005);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new nl();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((nl)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localapz.ump = ((nl)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3624549744640L, 27005);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new nl();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((nl)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localapz.umq = ((nl)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3624549744640L, 27005);
        return 0;
      }
      localapz.tLt = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3624549744640L, 27005);
      return 0;
    }
    GMTrace.o(3624549744640L, 27005);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/apz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */