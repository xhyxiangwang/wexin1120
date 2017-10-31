package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aes
  extends axc
{
  public String fKY;
  public int tCg;
  public int type;
  public String uap;
  public int uaq;
  public int uar;
  
  public aes()
  {
    GMTrace.i(15350481551360L, 114370);
    GMTrace.o(15350481551360L, 114370);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15350615769088L, 114371);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.type);
      if (this.fKY != null) {
        paramVarArgs.e(3, this.fKY);
      }
      paramVarArgs.fd(4, this.tCg);
      if (this.uap != null) {
        paramVarArgs.e(5, this.uap);
      }
      paramVarArgs.fd(6, this.uaq);
      paramVarArgs.fd(7, this.uar);
      GMTrace.o(15350615769088L, 114371);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.type);
      paramInt = i;
      if (this.fKY != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.fKY);
      }
      i = paramInt + b.a.a.a.fa(4, this.tCg);
      paramInt = i;
      if (this.uap != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uap);
      }
      i = b.a.a.a.fa(6, this.uaq);
      int j = b.a.a.a.fa(7, this.uar);
      GMTrace.o(15350615769088L, 114371);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(15350615769088L, 114371);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aes localaes = (aes)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(15350615769088L, 114371);
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
          localaes.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15350615769088L, 114371);
        return 0;
      case 2: 
        localaes.type = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(15350615769088L, 114371);
        return 0;
      case 3: 
        localaes.fKY = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(15350615769088L, 114371);
        return 0;
      case 4: 
        localaes.tCg = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(15350615769088L, 114371);
        return 0;
      case 5: 
        localaes.uap = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(15350615769088L, 114371);
        return 0;
      case 6: 
        localaes.uaq = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(15350615769088L, 114371);
        return 0;
      }
      localaes.uar = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(15350615769088L, 114371);
      return 0;
    }
    GMTrace.o(15350615769088L, 114371);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */