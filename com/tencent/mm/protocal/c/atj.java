package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class atj
  extends axc
{
  public String mGA;
  public String mGB;
  public int tIM;
  public long uoJ;
  public int uoK;
  public String uoL;
  public int uoS;
  public int uoT;
  public int uoU;
  
  public atj()
  {
    GMTrace.i(3864799477760L, 28795);
    GMTrace.o(3864799477760L, 28795);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3864933695488L, 28796);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.mGB != null) {
        paramVarArgs.e(2, this.mGB);
      }
      if (this.uoL != null) {
        paramVarArgs.e(3, this.uoL);
      }
      paramVarArgs.fd(4, this.tIM);
      paramVarArgs.R(5, this.uoJ);
      paramVarArgs.fd(6, this.uoK);
      if (this.mGA != null) {
        paramVarArgs.e(7, this.mGA);
      }
      paramVarArgs.fd(8, this.uoT);
      paramVarArgs.fd(9, this.uoS);
      paramVarArgs.fd(10, this.uoU);
      GMTrace.o(3864933695488L, 28796);
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
      if (this.mGB != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mGB);
      }
      i = paramInt;
      if (this.uoL != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uoL);
      }
      i = i + b.a.a.a.fa(4, this.tIM) + b.a.a.a.Q(5, this.uoJ) + b.a.a.a.fa(6, this.uoK);
      paramInt = i;
      if (this.mGA != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.mGA);
      }
      i = b.a.a.a.fa(8, this.uoT);
      int j = b.a.a.a.fa(9, this.uoS);
      int k = b.a.a.a.fa(10, this.uoU);
      GMTrace.o(3864933695488L, 28796);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3864933695488L, 28796);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      atj localatj = (atj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3864933695488L, 28796);
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
          localatj.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3864933695488L, 28796);
        return 0;
      case 2: 
        localatj.mGB = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3864933695488L, 28796);
        return 0;
      case 3: 
        localatj.uoL = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3864933695488L, 28796);
        return 0;
      case 4: 
        localatj.tIM = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3864933695488L, 28796);
        return 0;
      case 5: 
        localatj.uoJ = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3864933695488L, 28796);
        return 0;
      case 6: 
        localatj.uoK = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3864933695488L, 28796);
        return 0;
      case 7: 
        localatj.mGA = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3864933695488L, 28796);
        return 0;
      case 8: 
        localatj.uoT = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3864933695488L, 28796);
        return 0;
      case 9: 
        localatj.uoS = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3864933695488L, 28796);
        return 0;
      }
      localatj.uoU = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3864933695488L, 28796);
      return 0;
    }
    GMTrace.o(3864933695488L, 28796);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/atj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */