package com.tencent.mm.plugin.sns.g;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.bcu;
import java.util.LinkedList;

public final class e
  extends com.tencent.mm.bl.a
{
  public bcu qbd;
  public String qie;
  public int qif;
  public String qig;
  
  public e()
  {
    GMTrace.i(8866154676224L, 66058);
    GMTrace.o(8866154676224L, 66058);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(8866288893952L, 66059);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.qie == null) {
        throw new b("Not all required fields were included: clientID");
      }
      if (this.qbd == null) {
        throw new b("Not all required fields were included: actionGroup");
      }
      if (this.qie != null) {
        paramVarArgs.e(1, this.qie);
      }
      if (this.qbd != null)
      {
        paramVarArgs.ff(2, this.qbd.aWM());
        this.qbd.a(paramVarArgs);
      }
      paramVarArgs.fd(3, this.qif);
      if (this.qig != null) {
        paramVarArgs.e(4, this.qig);
      }
      GMTrace.o(8866288893952L, 66059);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.qie != null) {
        paramInt = b.a.a.b.b.a.f(1, this.qie) + 0;
      }
      i = paramInt;
      if (this.qbd != null) {
        i = paramInt + b.a.a.a.fc(2, this.qbd.aWM());
      }
      i += b.a.a.a.fa(3, this.qif);
      paramInt = i;
      if (this.qig != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.qig);
      }
      GMTrace.o(8866288893952L, 66059);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.qie == null) {
        throw new b("Not all required fields were included: clientID");
      }
      if (this.qbd == null) {
        throw new b("Not all required fields were included: actionGroup");
      }
      GMTrace.o(8866288893952L, 66059);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      e locale = (e)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(8866288893952L, 66059);
        return -1;
      case 1: 
        locale.qie = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(8866288893952L, 66059);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bcu();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((bcu)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          locale.qbd = ((bcu)localObject1);
          paramInt += 1;
        }
        GMTrace.o(8866288893952L, 66059);
        return 0;
      case 3: 
        locale.qif = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(8866288893952L, 66059);
        return 0;
      }
      locale.qig = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(8866288893952L, 66059);
      return 0;
    }
    GMTrace.o(8866288893952L, 66059);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/g/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */