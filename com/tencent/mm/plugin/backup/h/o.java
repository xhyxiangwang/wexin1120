package com.tencent.mm.plugin.backup.h;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class o
  extends com.tencent.mm.bl.a
{
  public String ID;
  public long jXg;
  public m jXj;
  public int jXl;
  public long jXm;
  public long jXn;
  public int jXo;
  public int jXp;
  
  public o()
  {
    GMTrace.i(14831730032640L, 110505);
    GMTrace.o(14831730032640L, 110505);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14831864250368L, 110506);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ID == null) {
        throw new b("Not all required fields were included: ID");
      }
      if (this.ID != null) {
        paramVarArgs.e(1, this.ID);
      }
      paramVarArgs.R(2, this.jXm);
      paramVarArgs.R(3, this.jXn);
      paramVarArgs.fd(4, this.jXo);
      paramVarArgs.fd(5, this.jXp);
      paramVarArgs.R(6, this.jXg);
      if (this.jXj != null)
      {
        paramVarArgs.ff(7, this.jXj.aWM());
        this.jXj.a(paramVarArgs);
      }
      paramVarArgs.fd(8, this.jXl);
      GMTrace.o(14831864250368L, 110506);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.ID != null) {
        paramInt = b.a.a.b.b.a.f(1, this.ID) + 0;
      }
      i = paramInt + b.a.a.a.Q(2, this.jXm) + b.a.a.a.Q(3, this.jXn) + b.a.a.a.fa(4, this.jXo) + b.a.a.a.fa(5, this.jXp) + b.a.a.a.Q(6, this.jXg);
      paramInt = i;
      if (this.jXj != null) {
        paramInt = i + b.a.a.a.fc(7, this.jXj.aWM());
      }
      i = b.a.a.a.fa(8, this.jXl);
      GMTrace.o(14831864250368L, 110506);
      return paramInt + i;
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
      GMTrace.o(14831864250368L, 110506);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      o localo = (o)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(14831864250368L, 110506);
        return -1;
      case 1: 
        localo.ID = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(14831864250368L, 110506);
        return 0;
      case 2: 
        localo.jXm = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(14831864250368L, 110506);
        return 0;
      case 3: 
        localo.jXn = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(14831864250368L, 110506);
        return 0;
      case 4: 
        localo.jXo = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(14831864250368L, 110506);
        return 0;
      case 5: 
        localo.jXp = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(14831864250368L, 110506);
        return 0;
      case 6: 
        localo.jXg = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(14831864250368L, 110506);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new m();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((m)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localo.jXj = ((m)localObject1);
          paramInt += 1;
        }
        GMTrace.o(14831864250368L, 110506);
        return 0;
      }
      localo.jXl = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(14831864250368L, 110506);
      return 0;
    }
    GMTrace.o(14831864250368L, 110506);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/h/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */