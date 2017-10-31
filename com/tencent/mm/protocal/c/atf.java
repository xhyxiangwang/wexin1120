package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class atf
  extends axc
{
  public String uoN;
  public String uoO;
  public String uoP;
  public String uoQ;
  public String uoR;
  public int uoS;
  
  public atf()
  {
    GMTrace.i(3986400739328L, 29701);
    GMTrace.o(3986400739328L, 29701);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3986534957056L, 29702);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.uoN != null) {
        paramVarArgs.e(2, this.uoN);
      }
      if (this.uoO != null) {
        paramVarArgs.e(3, this.uoO);
      }
      if (this.uoP != null) {
        paramVarArgs.e(4, this.uoP);
      }
      if (this.uoQ != null) {
        paramVarArgs.e(5, this.uoQ);
      }
      if (this.uoR != null) {
        paramVarArgs.e(6, this.uoR);
      }
      paramVarArgs.fd(7, this.uoS);
      GMTrace.o(3986534957056L, 29702);
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
      if (this.uoN != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uoN);
      }
      i = paramInt;
      if (this.uoO != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uoO);
      }
      paramInt = i;
      if (this.uoP != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uoP);
      }
      i = paramInt;
      if (this.uoQ != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uoQ);
      }
      paramInt = i;
      if (this.uoR != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.uoR);
      }
      i = b.a.a.a.fa(7, this.uoS);
      GMTrace.o(3986534957056L, 29702);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3986534957056L, 29702);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      atf localatf = (atf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3986534957056L, 29702);
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
          localatf.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3986534957056L, 29702);
        return 0;
      case 2: 
        localatf.uoN = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3986534957056L, 29702);
        return 0;
      case 3: 
        localatf.uoO = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3986534957056L, 29702);
        return 0;
      case 4: 
        localatf.uoP = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3986534957056L, 29702);
        return 0;
      case 5: 
        localatf.uoQ = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3986534957056L, 29702);
        return 0;
      case 6: 
        localatf.uoR = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3986534957056L, 29702);
        return 0;
      }
      localatf.uoS = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3986534957056L, 29702);
      return 0;
    }
    GMTrace.o(3986534957056L, 29702);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/atf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */