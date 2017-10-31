package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ue
  extends axc
{
  public String huS;
  public String mEm;
  public LinkedList<String> tSd;
  public LinkedList<String> tSk;
  public int tSl;
  
  public ue()
  {
    GMTrace.i(3683068674048L, 27441);
    this.tSk = new LinkedList();
    this.tSd = new LinkedList();
    GMTrace.o(3683068674048L, 27441);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3683202891776L, 27442);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.d(2, 1, this.tSk);
      paramVarArgs.d(3, 1, this.tSd);
      if (this.mEm != null) {
        paramVarArgs.e(4, this.mEm);
      }
      if (this.huS != null) {
        paramVarArgs.e(5, this.huS);
      }
      paramVarArgs.fd(6, this.tSl);
      GMTrace.o(3683202891776L, 27442);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 1, this.tSk) + b.a.a.a.c(3, 1, this.tSd);
      paramInt = i;
      if (this.mEm != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mEm);
      }
      i = paramInt;
      if (this.huS != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.huS);
      }
      paramInt = b.a.a.a.fa(6, this.tSl);
      GMTrace.o(3683202891776L, 27442);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tSk.clear();
      this.tSd.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3683202891776L, 27442);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ue localue = (ue)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3683202891776L, 27442);
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
          localue.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3683202891776L, 27442);
        return 0;
      case 2: 
        localue.tSk.add(((b.a.a.a.a)localObject1).xSv.readString());
        GMTrace.o(3683202891776L, 27442);
        return 0;
      case 3: 
        localue.tSd.add(((b.a.a.a.a)localObject1).xSv.readString());
        GMTrace.o(3683202891776L, 27442);
        return 0;
      case 4: 
        localue.mEm = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3683202891776L, 27442);
        return 0;
      case 5: 
        localue.huS = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3683202891776L, 27442);
        return 0;
      }
      localue.tSl = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3683202891776L, 27442);
      return 0;
    }
    GMTrace.o(3683202891776L, 27442);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */