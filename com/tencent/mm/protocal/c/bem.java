package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bem
  extends axk
{
  public LinkedList<bdk> tze;
  public int ujC;
  public String uuR;
  public int uuV;
  public int uuW;
  public beb uuX;
  public axs uuy;
  public int uws;
  public int uwt;
  public LinkedList<ca> uwu;
  public int uwv;
  public LinkedList<avx> uww;
  
  public bem()
  {
    GMTrace.i(3977408151552L, 29634);
    this.tze = new LinkedList();
    this.uwu = new LinkedList();
    this.uww = new LinkedList();
    GMTrace.o(3977408151552L, 29634);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3977542369280L, 29635);
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
      if (this.uuR != null) {
        paramVarArgs.e(2, this.uuR);
      }
      paramVarArgs.fd(3, this.ujC);
      paramVarArgs.d(4, 8, this.tze);
      paramVarArgs.fd(5, this.uws);
      paramVarArgs.fd(6, this.uuV);
      paramVarArgs.fd(7, this.uuW);
      if (this.uuX != null)
      {
        paramVarArgs.ff(8, this.uuX.aWM());
        this.uuX.a(paramVarArgs);
      }
      paramVarArgs.fd(9, this.uwt);
      paramVarArgs.d(10, 8, this.uwu);
      if (this.uuy != null)
      {
        paramVarArgs.ff(11, this.uuy.aWM());
        this.uuy.a(paramVarArgs);
      }
      paramVarArgs.fd(12, this.uwv);
      paramVarArgs.d(13, 8, this.uww);
      GMTrace.o(3977542369280L, 29635);
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
      if (this.uuR != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uuR);
      }
      i = i + b.a.a.a.fa(3, this.ujC) + b.a.a.a.c(4, 8, this.tze) + b.a.a.a.fa(5, this.uws) + b.a.a.a.fa(6, this.uuV) + b.a.a.a.fa(7, this.uuW);
      paramInt = i;
      if (this.uuX != null) {
        paramInt = i + b.a.a.a.fc(8, this.uuX.aWM());
      }
      i = paramInt + b.a.a.a.fa(9, this.uwt) + b.a.a.a.c(10, 8, this.uwu);
      paramInt = i;
      if (this.uuy != null) {
        paramInt = i + b.a.a.a.fc(11, this.uuy.aWM());
      }
      i = b.a.a.a.fa(12, this.uwv);
      int j = b.a.a.a.c(13, 8, this.uww);
      GMTrace.o(3977542369280L, 29635);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tze.clear();
      this.uwu.clear();
      this.uww.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3977542369280L, 29635);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bem localbem = (bem)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3977542369280L, 29635);
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
          localbem.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3977542369280L, 29635);
        return 0;
      case 2: 
        localbem.uuR = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3977542369280L, 29635);
        return 0;
      case 3: 
        localbem.ujC = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3977542369280L, 29635);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bdk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bdk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localbem.tze.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3977542369280L, 29635);
        return 0;
      case 5: 
        localbem.uws = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3977542369280L, 29635);
        return 0;
      case 6: 
        localbem.uuV = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3977542369280L, 29635);
        return 0;
      case 7: 
        localbem.uuW = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3977542369280L, 29635);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new beb();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((beb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localbem.uuX = ((beb)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3977542369280L, 29635);
        return 0;
      case 9: 
        localbem.uwt = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3977542369280L, 29635);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ca();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ca)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localbem.uwu.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3977542369280L, 29635);
        return 0;
      case 11: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localbem.uuy = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3977542369280L, 29635);
        return 0;
      case 12: 
        localbem.uwv = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3977542369280L, 29635);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new avx();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((avx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
        localbem.uww.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3977542369280L, 29635);
      return 0;
    }
    GMTrace.o(3977542369280L, 29635);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */