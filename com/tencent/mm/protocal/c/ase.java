package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ase
  extends axk
{
  public String jYc;
  public int mDF;
  public int tUi;
  public int tUj;
  public String tWf;
  public String umm;
  public int unO;
  public int unP;
  public int unQ;
  
  public ase()
  {
    GMTrace.i(3959422976000L, 29500);
    GMTrace.o(3959422976000L, 29500);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3959557193728L, 29501);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.urV != null)
      {
        paramVarArgs.ff(1, this.urV.aWM());
        this.urV.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.unO);
      paramVarArgs.fd(3, this.mDF);
      if (this.umm != null) {
        paramVarArgs.e(4, this.umm);
      }
      if (this.tWf != null) {
        paramVarArgs.e(5, this.tWf);
      }
      if (this.jYc != null) {
        paramVarArgs.e(6, this.jYc);
      }
      paramVarArgs.fd(7, this.unP);
      paramVarArgs.fd(8, this.tUi);
      paramVarArgs.fd(9, this.tUj);
      paramVarArgs.fd(10, this.unQ);
      GMTrace.o(3959557193728L, 29501);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.unO) + b.a.a.a.fa(3, this.mDF);
      paramInt = i;
      if (this.umm != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.umm);
      }
      i = paramInt;
      if (this.tWf != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tWf);
      }
      paramInt = i;
      if (this.jYc != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.jYc);
      }
      i = b.a.a.a.fa(7, this.unP);
      int j = b.a.a.a.fa(8, this.tUi);
      int k = b.a.a.a.fa(9, this.tUj);
      int m = b.a.a.a.fa(10, this.unQ);
      GMTrace.o(3959557193728L, 29501);
      return paramInt + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3959557193728L, 29501);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ase localase = (ase)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3959557193728L, 29501);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new eo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((eo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localase.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3959557193728L, 29501);
        return 0;
      case 2: 
        localase.unO = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3959557193728L, 29501);
        return 0;
      case 3: 
        localase.mDF = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3959557193728L, 29501);
        return 0;
      case 4: 
        localase.umm = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3959557193728L, 29501);
        return 0;
      case 5: 
        localase.tWf = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3959557193728L, 29501);
        return 0;
      case 6: 
        localase.jYc = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3959557193728L, 29501);
        return 0;
      case 7: 
        localase.unP = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3959557193728L, 29501);
        return 0;
      case 8: 
        localase.tUi = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3959557193728L, 29501);
        return 0;
      case 9: 
        localase.tUj = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3959557193728L, 29501);
        return 0;
      }
      localase.unQ = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3959557193728L, 29501);
      return 0;
    }
    GMTrace.o(3959557193728L, 29501);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */