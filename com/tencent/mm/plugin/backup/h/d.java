package com.tencent.mm.plugin.backup.h;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class d
  extends com.tencent.mm.bl.a
{
  public String ID;
  public h jWE;
  public int jWF;
  public int jWG;
  public int jWH;
  public int jWI;
  public int jWJ;
  public int jWK;
  public int jWL;
  public int jWM;
  public int jWN;
  
  public d()
  {
    GMTrace.i(14837367177216L, 110547);
    GMTrace.o(14837367177216L, 110547);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14837501394944L, 110548);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ID == null) {
        throw new b("Not all required fields were included: ID");
      }
      if (this.ID != null) {
        paramVarArgs.e(1, this.ID);
      }
      if (this.jWE != null)
      {
        paramVarArgs.ff(2, this.jWE.aWM());
        this.jWE.a(paramVarArgs);
      }
      paramVarArgs.fd(3, this.jWF);
      paramVarArgs.fd(4, this.jWG);
      paramVarArgs.fd(5, this.jWH);
      paramVarArgs.fd(6, this.jWI);
      paramVarArgs.fd(7, this.jWJ);
      paramVarArgs.fd(8, this.jWK);
      paramVarArgs.fd(9, this.jWL);
      paramVarArgs.fd(10, this.jWM);
      paramVarArgs.fd(11, this.jWN);
      GMTrace.o(14837501394944L, 110548);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.ID != null) {
        paramInt = b.a.a.b.b.a.f(1, this.ID) + 0;
      }
      i = paramInt;
      if (this.jWE != null) {
        i = paramInt + b.a.a.a.fc(2, this.jWE.aWM());
      }
      paramInt = b.a.a.a.fa(3, this.jWF);
      int j = b.a.a.a.fa(4, this.jWG);
      int k = b.a.a.a.fa(5, this.jWH);
      int m = b.a.a.a.fa(6, this.jWI);
      int n = b.a.a.a.fa(7, this.jWJ);
      int i1 = b.a.a.a.fa(8, this.jWK);
      int i2 = b.a.a.a.fa(9, this.jWL);
      int i3 = b.a.a.a.fa(10, this.jWM);
      int i4 = b.a.a.a.fa(11, this.jWN);
      GMTrace.o(14837501394944L, 110548);
      return i + paramInt + j + k + m + n + i1 + i2 + i3 + i4;
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
      GMTrace.o(14837501394944L, 110548);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      d locald = (d)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(14837501394944L, 110548);
        return -1;
      case 1: 
        locald.ID = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(14837501394944L, 110548);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new h();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((h)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          locald.jWE = ((h)localObject1);
          paramInt += 1;
        }
        GMTrace.o(14837501394944L, 110548);
        return 0;
      case 3: 
        locald.jWF = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(14837501394944L, 110548);
        return 0;
      case 4: 
        locald.jWG = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(14837501394944L, 110548);
        return 0;
      case 5: 
        locald.jWH = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(14837501394944L, 110548);
        return 0;
      case 6: 
        locald.jWI = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(14837501394944L, 110548);
        return 0;
      case 7: 
        locald.jWJ = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(14837501394944L, 110548);
        return 0;
      case 8: 
        locald.jWK = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(14837501394944L, 110548);
        return 0;
      case 9: 
        locald.jWL = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(14837501394944L, 110548);
        return 0;
      case 10: 
        locald.jWM = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(14837501394944L, 110548);
        return 0;
      }
      locald.jWN = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(14837501394944L, 110548);
      return 0;
    }
    GMTrace.o(14837501394944L, 110548);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/h/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */