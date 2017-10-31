package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ds
  extends axc
{
  public String fKY;
  public LinkedList<String> txG;
  public boolean txH;
  public int txI;
  
  public ds()
  {
    GMTrace.i(15345649713152L, 114334);
    this.txG = new LinkedList();
    GMTrace.o(15345649713152L, 114334);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15345783930880L, 114335);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.fKY != null) {
        paramVarArgs.e(2, this.fKY);
      }
      paramVarArgs.d(3, 1, this.txG);
      paramVarArgs.af(4, this.txH);
      paramVarArgs.fd(5, this.txI);
      GMTrace.o(15345783930880L, 114335);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt;
      if (this.fKY != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.fKY);
      }
      paramInt = b.a.a.a.c(3, 1, this.txG);
      int j = b.a.a.b.b.a.cK(4);
      int k = b.a.a.a.fa(5, this.txI);
      GMTrace.o(15345783930880L, 114335);
      return i + paramInt + (j + 1) + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.txG.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(15345783930880L, 114335);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ds localds = (ds)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(15345783930880L, 114335);
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
          localds.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15345783930880L, 114335);
        return 0;
      case 2: 
        localds.fKY = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(15345783930880L, 114335);
        return 0;
      case 3: 
        localds.txG.add(((b.a.a.a.a)localObject1).xSv.readString());
        GMTrace.o(15345783930880L, 114335);
        return 0;
      case 4: 
        localds.txH = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(15345783930880L, 114335);
        return 0;
      }
      localds.txI = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(15345783930880L, 114335);
      return 0;
    }
    GMTrace.o(15345783930880L, 114335);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */