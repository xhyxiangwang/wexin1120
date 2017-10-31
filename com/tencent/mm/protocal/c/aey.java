package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aey
  extends axc
{
  public String fMv;
  public String uaJ;
  public int uaK;
  
  public aey()
  {
    GMTrace.i(3642669137920L, 27140);
    GMTrace.o(3642669137920L, 27140);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3642803355648L, 27141);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fMv == null) {
        throw new b("Not all required fields were included: card_id");
      }
      if (this.uaJ == null) {
        throw new b("Not all required fields were included: to_username");
      }
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.fMv != null) {
        paramVarArgs.e(2, this.fMv);
      }
      if (this.uaJ != null) {
        paramVarArgs.e(3, this.uaJ);
      }
      paramVarArgs.fd(4, this.uaK);
      GMTrace.o(3642803355648L, 27141);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.urE != null) {
        i = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      paramInt = i;
      if (this.fMv != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.fMv);
      }
      i = paramInt;
      if (this.uaJ != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uaJ);
      }
      paramInt = b.a.a.a.fa(4, this.uaK);
      GMTrace.o(3642803355648L, 27141);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.fMv == null) {
        throw new b("Not all required fields were included: card_id");
      }
      if (this.uaJ == null) {
        throw new b("Not all required fields were included: to_username");
      }
      GMTrace.o(3642803355648L, 27141);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aey localaey = (aey)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3642803355648L, 27141);
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
          localaey.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3642803355648L, 27141);
        return 0;
      case 2: 
        localaey.fMv = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3642803355648L, 27141);
        return 0;
      case 3: 
        localaey.uaJ = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3642803355648L, 27141);
        return 0;
      }
      localaey.uaK = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3642803355648L, 27141);
      return 0;
    }
    GMTrace.o(3642803355648L, 27141);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */