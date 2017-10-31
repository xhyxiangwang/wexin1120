package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.b;
import java.util.LinkedList;

public final class ail
  extends axc
{
  public b jWD;
  public String mDD;
  public int udd;
  public int ude;
  public bta udf;
  public String udm;
  
  public ail()
  {
    GMTrace.i(3793529864192L, 28264);
    GMTrace.o(3793529864192L, 28264);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3793664081920L, 28265);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.mDD != null) {
        paramVarArgs.e(2, this.mDD);
      }
      if (this.jWD != null) {
        paramVarArgs.b(3, this.jWD);
      }
      if (this.udm != null) {
        paramVarArgs.e(4, this.udm);
      }
      paramVarArgs.fd(5, this.udd);
      paramVarArgs.fd(6, this.ude);
      if (this.udf != null)
      {
        paramVarArgs.ff(7, this.udf.aWM());
        this.udf.a(paramVarArgs);
      }
      GMTrace.o(3793664081920L, 28265);
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
      if (this.mDD != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mDD);
      }
      i = paramInt;
      if (this.jWD != null) {
        i = paramInt + b.a.a.a.a(3, this.jWD);
      }
      paramInt = i;
      if (this.udm != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.udm);
      }
      i = paramInt + b.a.a.a.fa(5, this.udd) + b.a.a.a.fa(6, this.ude);
      paramInt = i;
      if (this.udf != null) {
        paramInt = i + b.a.a.a.fc(7, this.udf.aWM());
      }
      GMTrace.o(3793664081920L, 28265);
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
      GMTrace.o(3793664081920L, 28265);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ail localail = (ail)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3793664081920L, 28265);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new en();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((en)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localail.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3793664081920L, 28265);
        return 0;
      case 2: 
        localail.mDD = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3793664081920L, 28265);
        return 0;
      case 3: 
        localail.jWD = ((b.a.a.a.a)localObject1).cpI();
        GMTrace.o(3793664081920L, 28265);
        return 0;
      case 4: 
        localail.udm = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3793664081920L, 28265);
        return 0;
      case 5: 
        localail.udd = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3793664081920L, 28265);
        return 0;
      case 6: 
        localail.ude = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3793664081920L, 28265);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bta();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bta)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
        localail.udf = ((bta)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3793664081920L, 28265);
      return 0;
    }
    GMTrace.o(3793664081920L, 28265);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ail.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */