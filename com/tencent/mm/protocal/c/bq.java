package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bq
  extends axc
{
  public int jXP;
  public String tvh;
  public int tvi;
  public String tvj;
  public String tvk;
  
  public bq()
  {
    GMTrace.i(3835540013056L, 28577);
    GMTrace.o(3835540013056L, 28577);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3835674230784L, 28578);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.tvh != null) {
        paramVarArgs.e(2, this.tvh);
      }
      paramVarArgs.fd(3, this.jXP);
      paramVarArgs.fd(4, this.tvi);
      if (this.tvj != null) {
        paramVarArgs.e(5, this.tvj);
      }
      if (this.tvk != null) {
        paramVarArgs.e(6, this.tvk);
      }
      GMTrace.o(3835674230784L, 28578);
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
      if (this.tvh != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.tvh);
      }
      i = i + b.a.a.a.fa(3, this.jXP) + b.a.a.a.fa(4, this.tvi);
      paramInt = i;
      if (this.tvj != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tvj);
      }
      i = paramInt;
      if (this.tvk != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.tvk);
      }
      GMTrace.o(3835674230784L, 28578);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3835674230784L, 28578);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bq localbq = (bq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3835674230784L, 28578);
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
          localbq.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3835674230784L, 28578);
        return 0;
      case 2: 
        localbq.tvh = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3835674230784L, 28578);
        return 0;
      case 3: 
        localbq.jXP = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3835674230784L, 28578);
        return 0;
      case 4: 
        localbq.tvi = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3835674230784L, 28578);
        return 0;
      case 5: 
        localbq.tvj = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3835674230784L, 28578);
        return 0;
      }
      localbq.tvk = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3835674230784L, 28578);
      return 0;
    }
    GMTrace.o(3835674230784L, 28578);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */