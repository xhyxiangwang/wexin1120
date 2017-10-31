package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bjc
  extends axc
{
  public int fFs;
  public int scene;
  public int tCf;
  public String username;
  public int uzD;
  public int uzE;
  public int uzF;
  public String uzG;
  
  public bjc()
  {
    GMTrace.i(3853793624064L, 28713);
    GMTrace.o(3853793624064L, 28713);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3853927841792L, 28714);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.scene);
      paramVarArgs.fd(3, this.uzD);
      paramVarArgs.fd(4, this.tCf);
      paramVarArgs.fd(5, this.uzE);
      paramVarArgs.fd(6, this.uzF);
      if (this.username != null) {
        paramVarArgs.e(7, this.username);
      }
      paramVarArgs.fd(8, this.fFs);
      if (this.uzG != null) {
        paramVarArgs.e(9, this.uzG);
      }
      GMTrace.o(3853927841792L, 28714);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.scene) + b.a.a.a.fa(3, this.uzD) + b.a.a.a.fa(4, this.tCf) + b.a.a.a.fa(5, this.uzE) + b.a.a.a.fa(6, this.uzF);
      paramInt = i;
      if (this.username != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.username);
      }
      i = paramInt + b.a.a.a.fa(8, this.fFs);
      paramInt = i;
      if (this.uzG != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.uzG);
      }
      GMTrace.o(3853927841792L, 28714);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3853927841792L, 28714);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bjc localbjc = (bjc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3853927841792L, 28714);
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
          localbjc.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3853927841792L, 28714);
        return 0;
      case 2: 
        localbjc.scene = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3853927841792L, 28714);
        return 0;
      case 3: 
        localbjc.uzD = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3853927841792L, 28714);
        return 0;
      case 4: 
        localbjc.tCf = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3853927841792L, 28714);
        return 0;
      case 5: 
        localbjc.uzE = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3853927841792L, 28714);
        return 0;
      case 6: 
        localbjc.uzF = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3853927841792L, 28714);
        return 0;
      case 7: 
        localbjc.username = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3853927841792L, 28714);
        return 0;
      case 8: 
        localbjc.fFs = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3853927841792L, 28714);
        return 0;
      }
      localbjc.uzG = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3853927841792L, 28714);
      return 0;
    }
    GMTrace.o(3853927841792L, 28714);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bjc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */