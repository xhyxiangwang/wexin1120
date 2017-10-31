package com.tencent.mm.plugin.sns.g;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class d
  extends com.tencent.mm.bl.a
{
  public LinkedList<e> qhY;
  public LinkedList<e> qhZ;
  public LinkedList<e> qia;
  public LinkedList<e> qib;
  public LinkedList<f> qic;
  public LinkedList<f> qid;
  
  public d()
  {
    GMTrace.i(8865349369856L, 66052);
    this.qhY = new LinkedList();
    this.qhZ = new LinkedList();
    this.qia = new LinkedList();
    this.qib = new LinkedList();
    this.qic = new LinkedList();
    this.qid = new LinkedList();
    GMTrace.o(8865349369856L, 66052);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(8865483587584L, 66053);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.qhY);
      paramVarArgs.d(2, 8, this.qhZ);
      paramVarArgs.d(3, 8, this.qia);
      paramVarArgs.d(4, 8, this.qib);
      paramVarArgs.d(5, 8, this.qic);
      paramVarArgs.d(6, 8, this.qid);
      GMTrace.o(8865483587584L, 66053);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(1, 8, this.qhY);
      i = b.a.a.a.c(2, 8, this.qhZ);
      int j = b.a.a.a.c(3, 8, this.qia);
      int k = b.a.a.a.c(4, 8, this.qib);
      int m = b.a.a.a.c(5, 8, this.qic);
      int n = b.a.a.a.c(6, 8, this.qid);
      GMTrace.o(8865483587584L, 66053);
      return paramInt + 0 + i + j + k + m + n;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.qhY.clear();
      this.qhZ.clear();
      this.qia.clear();
      this.qib.clear();
      this.qic.clear();
      this.qid.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(8865483587584L, 66053);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      d locald = (d)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(8865483587584L, 66053);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new e();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((e)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          locald.qhY.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(8865483587584L, 66053);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new e();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((e)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          locald.qhZ.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(8865483587584L, 66053);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new e();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((e)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          locald.qia.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(8865483587584L, 66053);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new e();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((e)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          locald.qib.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(8865483587584L, 66053);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new f();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((f)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          locald.qic.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(8865483587584L, 66053);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new f();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((f)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        locald.qid.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(8865483587584L, 66053);
      return 0;
    }
    GMTrace.o(8865483587584L, 66053);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/g/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */