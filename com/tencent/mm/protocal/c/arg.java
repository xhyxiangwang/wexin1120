package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class arg
  extends axk
{
  public int fzx;
  public String fzy;
  public int nEE;
  public String rRk;
  public bow uni;
  public bot unj;
  public bor unk;
  public bou unl;
  public boolean unm;
  public LinkedList<String> unn;
  
  public arg()
  {
    GMTrace.i(3910299287552L, 29134);
    this.unn = new LinkedList();
    GMTrace.o(3910299287552L, 29134);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3910433505280L, 29135);
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
      paramVarArgs.fd(2, this.fzx);
      if (this.fzy != null) {
        paramVarArgs.e(3, this.fzy);
      }
      if (this.uni != null)
      {
        paramVarArgs.ff(4, this.uni.aWM());
        this.uni.a(paramVarArgs);
      }
      if (this.unj != null)
      {
        paramVarArgs.ff(5, this.unj.aWM());
        this.unj.a(paramVarArgs);
      }
      if (this.unk != null)
      {
        paramVarArgs.ff(6, this.unk.aWM());
        this.unk.a(paramVarArgs);
      }
      if (this.unl != null)
      {
        paramVarArgs.ff(7, this.unl.aWM());
        this.unl.a(paramVarArgs);
      }
      paramVarArgs.fd(8, this.nEE);
      paramVarArgs.af(9, this.unm);
      if (this.rRk != null) {
        paramVarArgs.e(10, this.rRk);
      }
      paramVarArgs.d(11, 1, this.unn);
      GMTrace.o(3910433505280L, 29135);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.fzx);
      paramInt = i;
      if (this.fzy != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.fzy);
      }
      i = paramInt;
      if (this.uni != null) {
        i = paramInt + b.a.a.a.fc(4, this.uni.aWM());
      }
      paramInt = i;
      if (this.unj != null) {
        paramInt = i + b.a.a.a.fc(5, this.unj.aWM());
      }
      i = paramInt;
      if (this.unk != null) {
        i = paramInt + b.a.a.a.fc(6, this.unk.aWM());
      }
      paramInt = i;
      if (this.unl != null) {
        paramInt = i + b.a.a.a.fc(7, this.unl.aWM());
      }
      i = paramInt + b.a.a.a.fa(8, this.nEE) + (b.a.a.b.b.a.cK(9) + 1);
      paramInt = i;
      if (this.rRk != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.rRk);
      }
      i = b.a.a.a.c(11, 1, this.unn);
      GMTrace.o(3910433505280L, 29135);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.unn.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3910433505280L, 29135);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      arg localarg = (arg)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3910433505280L, 29135);
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
          localarg.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3910433505280L, 29135);
        return 0;
      case 2: 
        localarg.fzx = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3910433505280L, 29135);
        return 0;
      case 3: 
        localarg.fzy = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3910433505280L, 29135);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bow();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bow)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localarg.uni = ((bow)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3910433505280L, 29135);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bot();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bot)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localarg.unj = ((bot)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3910433505280L, 29135);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bor();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bor)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localarg.unk = ((bor)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3910433505280L, 29135);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bou();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bou)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localarg.unl = ((bou)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3910433505280L, 29135);
        return 0;
      case 8: 
        localarg.nEE = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3910433505280L, 29135);
        return 0;
      case 9: 
        localarg.unm = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(3910433505280L, 29135);
        return 0;
      case 10: 
        localarg.rRk = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3910433505280L, 29135);
        return 0;
      }
      localarg.unn.add(((b.a.a.a.a)localObject1).xSv.readString());
      GMTrace.o(3910433505280L, 29135);
      return 0;
    }
    GMTrace.o(3910433505280L, 29135);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/arg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */