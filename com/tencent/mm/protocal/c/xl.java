package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class xl
  extends axk
{
  public int kmA;
  public LinkedList<String> kmw;
  public int kmy;
  public int kmz;
  
  public xl()
  {
    GMTrace.i(3908151803904L, 29118);
    this.kmw = new LinkedList();
    GMTrace.o(3908151803904L, 29118);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3908286021632L, 29119);
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
      paramVarArgs.d(2, 1, this.kmw);
      paramVarArgs.fd(3, this.kmy);
      paramVarArgs.fd(4, this.kmz);
      paramVarArgs.fd(5, this.kmA);
      GMTrace.o(3908286021632L, 29119);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = b.a.a.a.c(2, 1, this.kmw);
      int j = b.a.a.a.fa(3, this.kmy);
      int k = b.a.a.a.fa(4, this.kmz);
      int m = b.a.a.a.fa(5, this.kmA);
      GMTrace.o(3908286021632L, 29119);
      return paramInt + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.kmw.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3908286021632L, 29119);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      xl localxl = (xl)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3908286021632L, 29119);
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
          localxl.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3908286021632L, 29119);
        return 0;
      case 2: 
        localxl.kmw.add(((b.a.a.a.a)localObject1).xSv.readString());
        GMTrace.o(3908286021632L, 29119);
        return 0;
      case 3: 
        localxl.kmy = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3908286021632L, 29119);
        return 0;
      case 4: 
        localxl.kmz = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3908286021632L, 29119);
        return 0;
      }
      localxl.kmA = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3908286021632L, 29119);
      return 0;
    }
    GMTrace.o(3908286021632L, 29119);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/xl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */