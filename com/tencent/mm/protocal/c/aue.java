package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aue
  extends com.tencent.mm.bl.a
{
  public String fMv;
  public int upA;
  public boolean upB;
  public String upC;
  public int upD;
  public int upE;
  public LinkedList<aud> upF;
  
  public aue()
  {
    GMTrace.i(18812225191936L, 140162);
    this.upF = new LinkedList();
    GMTrace.o(18812225191936L, 140162);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18812359409664L, 140163);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fMv != null) {
        paramVarArgs.e(1, this.fMv);
      }
      paramVarArgs.fd(2, this.upA);
      paramVarArgs.af(3, this.upB);
      if (this.upC != null) {
        paramVarArgs.e(4, this.upC);
      }
      paramVarArgs.fd(5, this.upD);
      paramVarArgs.fd(6, this.upE);
      paramVarArgs.d(7, 8, this.upF);
      GMTrace.o(18812359409664L, 140163);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.fMv != null) {
        paramInt = b.a.a.b.b.a.f(1, this.fMv) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.upA) + (b.a.a.b.b.a.cK(3) + 1);
      paramInt = i;
      if (this.upC != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.upC);
      }
      i = b.a.a.a.fa(5, this.upD);
      int j = b.a.a.a.fa(6, this.upE);
      int k = b.a.a.a.c(7, 8, this.upF);
      GMTrace.o(18812359409664L, 140163);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.upF.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(18812359409664L, 140163);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aue localaue = (aue)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(18812359409664L, 140163);
        return -1;
      case 1: 
        localaue.fMv = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(18812359409664L, 140163);
        return 0;
      case 2: 
        localaue.upA = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(18812359409664L, 140163);
        return 0;
      case 3: 
        localaue.upB = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(18812359409664L, 140163);
        return 0;
      case 4: 
        localaue.upC = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(18812359409664L, 140163);
        return 0;
      case 5: 
        localaue.upD = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(18812359409664L, 140163);
        return 0;
      case 6: 
        localaue.upE = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(18812359409664L, 140163);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new aud();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((aud)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localaue.upF.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(18812359409664L, 140163);
      return 0;
    }
    GMTrace.o(18812359409664L, 140163);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */