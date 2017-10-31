package com.tencent.mm.plugin.backup.h;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class n
  extends com.tencent.mm.bl.a
{
  public String ID;
  public long jXg;
  public long jXh;
  public long jXi;
  public m jXj;
  public long jXk;
  public int jXl;
  
  public n()
  {
    GMTrace.i(14838709354496L, 110557);
    GMTrace.o(14838709354496L, 110557);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14838843572224L, 110558);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ID == null) {
        throw new b("Not all required fields were included: ID");
      }
      if (this.ID != null) {
        paramVarArgs.e(1, this.ID);
      }
      paramVarArgs.R(2, this.jXg);
      paramVarArgs.R(3, this.jXh);
      paramVarArgs.R(4, this.jXi);
      if (this.jXj != null)
      {
        paramVarArgs.ff(5, this.jXj.aWM());
        this.jXj.a(paramVarArgs);
      }
      paramVarArgs.R(6, this.jXk);
      paramVarArgs.fd(7, this.jXl);
      GMTrace.o(14838843572224L, 110558);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.ID != null) {
        paramInt = b.a.a.b.b.a.f(1, this.ID) + 0;
      }
      i = paramInt + b.a.a.a.Q(2, this.jXg) + b.a.a.a.Q(3, this.jXh) + b.a.a.a.Q(4, this.jXi);
      paramInt = i;
      if (this.jXj != null) {
        paramInt = i + b.a.a.a.fc(5, this.jXj.aWM());
      }
      i = b.a.a.a.Q(6, this.jXk);
      int j = b.a.a.a.fa(7, this.jXl);
      GMTrace.o(14838843572224L, 110558);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.ID == null) {
        throw new b("Not all required fields were included: ID");
      }
      GMTrace.o(14838843572224L, 110558);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      n localn = (n)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(14838843572224L, 110558);
        return -1;
      case 1: 
        localn.ID = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(14838843572224L, 110558);
        return 0;
      case 2: 
        localn.jXg = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(14838843572224L, 110558);
        return 0;
      case 3: 
        localn.jXh = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(14838843572224L, 110558);
        return 0;
      case 4: 
        localn.jXi = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(14838843572224L, 110558);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new m();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((m)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localn.jXj = ((m)localObject1);
          paramInt += 1;
        }
        GMTrace.o(14838843572224L, 110558);
        return 0;
      case 6: 
        localn.jXk = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(14838843572224L, 110558);
        return 0;
      }
      localn.jXl = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(14838843572224L, 110558);
      return 0;
    }
    GMTrace.o(14838843572224L, 110558);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/h/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */