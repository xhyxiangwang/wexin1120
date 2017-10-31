package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class vz
  extends axk
{
  public int kKx;
  public String kKy;
  public LinkedList<String> tTL;
  public String tTM;
  
  public vz()
  {
    GMTrace.i(3776215777280L, 28135);
    this.tTL = new LinkedList();
    GMTrace.o(3776215777280L, 28135);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3776349995008L, 28136);
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
      paramVarArgs.d(2, 1, this.tTL);
      paramVarArgs.fd(3, this.kKx);
      if (this.kKy != null) {
        paramVarArgs.e(4, this.kKy);
      }
      if (this.tTM != null) {
        paramVarArgs.e(5, this.tTM);
      }
      GMTrace.o(3776349995008L, 28136);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 1, this.tTL) + b.a.a.a.fa(3, this.kKx);
      paramInt = i;
      if (this.kKy != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.kKy);
      }
      i = paramInt;
      if (this.tTM != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tTM);
      }
      GMTrace.o(3776349995008L, 28136);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tTL.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3776349995008L, 28136);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      vz localvz = (vz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3776349995008L, 28136);
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
          localvz.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3776349995008L, 28136);
        return 0;
      case 2: 
        localvz.tTL.add(((b.a.a.a.a)localObject1).xSv.readString());
        GMTrace.o(3776349995008L, 28136);
        return 0;
      case 3: 
        localvz.kKx = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3776349995008L, 28136);
        return 0;
      case 4: 
        localvz.kKy = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3776349995008L, 28136);
        return 0;
      }
      localvz.tTM = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3776349995008L, 28136);
      return 0;
    }
    GMTrace.o(3776349995008L, 28136);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/vz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */