package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.b;
import java.util.LinkedList;

public final class jx
  extends axc
{
  public int bhM;
  public String kKZ;
  public b tGg;
  public b tGh;
  public int tGi;
  
  public jx()
  {
    GMTrace.i(16872107933696L, 125707);
    GMTrace.o(16872107933696L, 125707);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16872242151424L, 125708);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.bhM);
      if (this.tGg != null) {
        paramVarArgs.b(3, this.tGg);
      }
      if (this.tGh != null) {
        paramVarArgs.b(4, this.tGh);
      }
      if (this.kKZ != null) {
        paramVarArgs.e(5, this.kKZ);
      }
      paramVarArgs.fd(6, this.tGi);
      GMTrace.o(16872242151424L, 125708);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.bhM);
      paramInt = i;
      if (this.tGg != null) {
        paramInt = i + b.a.a.a.a(3, this.tGg);
      }
      i = paramInt;
      if (this.tGh != null) {
        i = paramInt + b.a.a.a.a(4, this.tGh);
      }
      paramInt = i;
      if (this.kKZ != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.kKZ);
      }
      i = b.a.a.a.fa(6, this.tGi);
      GMTrace.o(16872242151424L, 125708);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(16872242151424L, 125708);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      jx localjx = (jx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(16872242151424L, 125708);
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
          localjx.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(16872242151424L, 125708);
        return 0;
      case 2: 
        localjx.bhM = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(16872242151424L, 125708);
        return 0;
      case 3: 
        localjx.tGg = ((b.a.a.a.a)localObject1).cpI();
        GMTrace.o(16872242151424L, 125708);
        return 0;
      case 4: 
        localjx.tGh = ((b.a.a.a.a)localObject1).cpI();
        GMTrace.o(16872242151424L, 125708);
        return 0;
      case 5: 
        localjx.kKZ = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(16872242151424L, 125708);
        return 0;
      }
      localjx.tGi = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(16872242151424L, 125708);
      return 0;
    }
    GMTrace.o(16872242151424L, 125708);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/jx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */