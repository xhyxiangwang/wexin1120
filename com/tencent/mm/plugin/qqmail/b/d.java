package com.tencent.mm.plugin.qqmail.b;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class d
  extends com.tencent.mm.bl.a
{
  public String content;
  public int oEN;
  public String oEO;
  public LinkedList<i> oEP;
  public LinkedList<i> oEQ;
  public LinkedList<i> oER;
  public LinkedList<y> oES;
  public String oET;
  public int oEU;
  
  public d()
  {
    GMTrace.i(5475949084672L, 40799);
    this.oEP = new LinkedList();
    this.oEQ = new LinkedList();
    this.oER = new LinkedList();
    this.oES = new LinkedList();
    this.oEU = 5;
    GMTrace.o(5475949084672L, 40799);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(5476083302400L, 40800);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.content == null) {
        throw new b("Not all required fields were included: content");
      }
      paramVarArgs.fd(1, this.oEN);
      if (this.oEO != null) {
        paramVarArgs.e(2, this.oEO);
      }
      paramVarArgs.d(3, 8, this.oEP);
      paramVarArgs.d(4, 8, this.oEQ);
      paramVarArgs.d(5, 8, this.oER);
      paramVarArgs.d(6, 8, this.oES);
      if (this.oET != null) {
        paramVarArgs.e(7, this.oET);
      }
      if (this.content != null) {
        paramVarArgs.e(8, this.content);
      }
      paramVarArgs.fd(9, this.oEU);
      GMTrace.o(5476083302400L, 40800);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fa(1, this.oEN) + 0;
      paramInt = i;
      if (this.oEO != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.oEO);
      }
      i = paramInt + b.a.a.a.c(3, 8, this.oEP) + b.a.a.a.c(4, 8, this.oEQ) + b.a.a.a.c(5, 8, this.oER) + b.a.a.a.c(6, 8, this.oES);
      paramInt = i;
      if (this.oET != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.oET);
      }
      i = paramInt;
      if (this.content != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.content);
      }
      paramInt = b.a.a.a.fa(9, this.oEU);
      GMTrace.o(5476083302400L, 40800);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.oEP.clear();
      this.oEQ.clear();
      this.oER.clear();
      this.oES.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.content == null) {
        throw new b("Not all required fields were included: content");
      }
      GMTrace.o(5476083302400L, 40800);
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
        GMTrace.o(5476083302400L, 40800);
        return -1;
      case 1: 
        locald.oEN = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(5476083302400L, 40800);
        return 0;
      case 2: 
        locald.oEO = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(5476083302400L, 40800);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new i();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((i)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          locald.oEP.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(5476083302400L, 40800);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new i();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((i)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          locald.oEQ.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(5476083302400L, 40800);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new i();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((i)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          locald.oER.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(5476083302400L, 40800);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new y();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((y)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          locald.oES.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(5476083302400L, 40800);
        return 0;
      case 7: 
        locald.oET = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(5476083302400L, 40800);
        return 0;
      case 8: 
        locald.content = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(5476083302400L, 40800);
        return 0;
      }
      locald.oEU = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(5476083302400L, 40800);
      return 0;
    }
    GMTrace.o(5476083302400L, 40800);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */