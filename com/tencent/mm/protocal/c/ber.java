package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ber
  extends axk
{
  public LinkedList<bdk> tze;
  public bep ufm;
  public int ujC;
  public String uuR;
  public int uuV;
  public beb uuX;
  public int uwB;
  public long uwC;
  public int uws;
  
  public ber()
  {
    GMTrace.i(3999822512128L, 29801);
    this.tze = new LinkedList();
    GMTrace.o(3999822512128L, 29801);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3999956729856L, 29802);
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
      if (this.uuR != null) {
        paramVarArgs.e(2, this.uuR);
      }
      paramVarArgs.fd(3, this.ujC);
      paramVarArgs.d(4, 8, this.tze);
      paramVarArgs.fd(5, this.uwB);
      if (this.ufm != null)
      {
        paramVarArgs.ff(6, this.ufm.aWM());
        this.ufm.a(paramVarArgs);
      }
      paramVarArgs.fd(7, this.uws);
      paramVarArgs.fd(8, this.uuV);
      if (this.uuX != null)
      {
        paramVarArgs.ff(9, this.uuX.aWM());
        this.uuX.a(paramVarArgs);
      }
      paramVarArgs.R(10, this.uwC);
      GMTrace.o(3999956729856L, 29802);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt;
      if (this.uuR != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uuR);
      }
      i = i + b.a.a.a.fa(3, this.ujC) + b.a.a.a.c(4, 8, this.tze) + b.a.a.a.fa(5, this.uwB);
      paramInt = i;
      if (this.ufm != null) {
        paramInt = i + b.a.a.a.fc(6, this.ufm.aWM());
      }
      i = paramInt + b.a.a.a.fa(7, this.uws) + b.a.a.a.fa(8, this.uuV);
      paramInt = i;
      if (this.uuX != null) {
        paramInt = i + b.a.a.a.fc(9, this.uuX.aWM());
      }
      i = b.a.a.a.Q(10, this.uwC);
      GMTrace.o(3999956729856L, 29802);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tze.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3999956729856L, 29802);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ber localber = (ber)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3999956729856L, 29802);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new eo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((eo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localber.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3999956729856L, 29802);
        return 0;
      case 2: 
        localber.uuR = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3999956729856L, 29802);
        return 0;
      case 3: 
        localber.ujC = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3999956729856L, 29802);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bdk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bdk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localber.tze.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3999956729856L, 29802);
        return 0;
      case 5: 
        localber.uwB = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3999956729856L, 29802);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bep();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bep)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localber.ufm = ((bep)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3999956729856L, 29802);
        return 0;
      case 7: 
        localber.uws = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3999956729856L, 29802);
        return 0;
      case 8: 
        localber.uuV = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3999956729856L, 29802);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new beb();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((beb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localber.uuX = ((beb)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3999956729856L, 29802);
        return 0;
      }
      localber.uwC = ((b.a.a.a.a)localObject1).xSv.nn();
      GMTrace.o(3999956729856L, 29802);
      return 0;
    }
    GMTrace.o(3999956729856L, 29802);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ber.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */