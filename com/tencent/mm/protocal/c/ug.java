package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ug
  extends com.tencent.mm.bl.a
{
  public String fuw;
  public LinkedList<ua> tSn;
  public LinkedList<ui> tSo;
  public String tSp;
  public String tSq;
  public LinkedList<uh> tSr;
  public int tSs;
  public boolean tSt;
  public int type;
  
  public ug()
  {
    GMTrace.i(3940364058624L, 29358);
    this.tSn = new LinkedList();
    this.tSo = new LinkedList();
    this.tSr = new LinkedList();
    GMTrace.o(3940364058624L, 29358);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3940498276352L, 29359);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fuw != null) {
        paramVarArgs.e(1, this.fuw);
      }
      paramVarArgs.fd(2, this.type);
      paramVarArgs.d(3, 8, this.tSn);
      paramVarArgs.d(4, 8, this.tSo);
      if (this.tSp != null) {
        paramVarArgs.e(5, this.tSp);
      }
      if (this.tSq != null) {
        paramVarArgs.e(6, this.tSq);
      }
      paramVarArgs.d(7, 8, this.tSr);
      paramVarArgs.fd(8, this.tSs);
      paramVarArgs.af(9, this.tSt);
      GMTrace.o(3940498276352L, 29359);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.fuw != null) {
        paramInt = b.a.a.b.b.a.f(1, this.fuw) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.type) + b.a.a.a.c(3, 8, this.tSn) + b.a.a.a.c(4, 8, this.tSo);
      paramInt = i;
      if (this.tSp != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tSp);
      }
      i = paramInt;
      if (this.tSq != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.tSq);
      }
      paramInt = b.a.a.a.c(7, 8, this.tSr);
      int j = b.a.a.a.fa(8, this.tSs);
      int k = b.a.a.b.b.a.cK(9);
      GMTrace.o(3940498276352L, 29359);
      return i + paramInt + j + (k + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tSn.clear();
      this.tSo.clear();
      this.tSr.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3940498276352L, 29359);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ug localug = (ug)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3940498276352L, 29359);
        return -1;
      case 1: 
        localug.fuw = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3940498276352L, 29359);
        return 0;
      case 2: 
        localug.type = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3940498276352L, 29359);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ua();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ua)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localug.tSn.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3940498276352L, 29359);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ui();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ui)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localug.tSo.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3940498276352L, 29359);
        return 0;
      case 5: 
        localug.tSp = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3940498276352L, 29359);
        return 0;
      case 6: 
        localug.tSq = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3940498276352L, 29359);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new uh();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((uh)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localug.tSr.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3940498276352L, 29359);
        return 0;
      case 8: 
        localug.tSs = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3940498276352L, 29359);
        return 0;
      }
      localug.tSt = ((b.a.a.a.a)localObject1).cpH();
      GMTrace.o(3940498276352L, 29359);
      return 0;
    }
    GMTrace.o(3940498276352L, 29359);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ug.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */