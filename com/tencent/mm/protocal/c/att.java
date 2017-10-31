package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class att
  extends axk
{
  public int lpk;
  public String lpl;
  public int mXB;
  public int mXm;
  public String mXn;
  public int tNa;
  public long tNb;
  public int uph;
  public int upj;
  public int upk;
  
  public att()
  {
    GMTrace.i(3794872041472L, 28274);
    GMTrace.o(3794872041472L, 28274);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3795006259200L, 28275);
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
      paramVarArgs.fd(3, this.tNa);
      paramVarArgs.R(4, this.tNb);
      paramVarArgs.fd(5, this.upj);
      paramVarArgs.fd(6, this.uph);
      paramVarArgs.fd(7, this.mXB);
      paramVarArgs.fd(8, this.upk);
      paramVarArgs.fd(9, this.lpk);
      if (this.lpl != null) {
        paramVarArgs.e(10, this.lpl);
      }
      paramVarArgs.fd(11, this.mXm);
      if (this.mXn != null) {
        paramVarArgs.e(12, this.mXn);
      }
      GMTrace.o(3795006259200L, 28275);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(3, this.tNa) + b.a.a.a.Q(4, this.tNb) + b.a.a.a.fa(5, this.upj) + b.a.a.a.fa(6, this.uph) + b.a.a.a.fa(7, this.mXB) + b.a.a.a.fa(8, this.upk) + b.a.a.a.fa(9, this.lpk);
      paramInt = i;
      if (this.lpl != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.lpl);
      }
      i = paramInt + b.a.a.a.fa(11, this.mXm);
      paramInt = i;
      if (this.mXn != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.mXn);
      }
      GMTrace.o(3795006259200L, 28275);
      return paramInt;
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
      GMTrace.o(3795006259200L, 28275);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      att localatt = (att)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      case 2: 
      default: 
        GMTrace.o(3795006259200L, 28275);
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
          localatt.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3795006259200L, 28275);
        return 0;
      case 3: 
        localatt.tNa = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3795006259200L, 28275);
        return 0;
      case 4: 
        localatt.tNb = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3795006259200L, 28275);
        return 0;
      case 5: 
        localatt.upj = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3795006259200L, 28275);
        return 0;
      case 6: 
        localatt.uph = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3795006259200L, 28275);
        return 0;
      case 7: 
        localatt.mXB = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3795006259200L, 28275);
        return 0;
      case 8: 
        localatt.upk = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3795006259200L, 28275);
        return 0;
      case 9: 
        localatt.lpk = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3795006259200L, 28275);
        return 0;
      case 10: 
        localatt.lpl = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3795006259200L, 28275);
        return 0;
      case 11: 
        localatt.mXm = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3795006259200L, 28275);
        return 0;
      }
      localatt.mXn = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3795006259200L, 28275);
      return 0;
    }
    GMTrace.o(3795006259200L, 28275);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/att.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */