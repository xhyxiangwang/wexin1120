package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class uc
  extends axk
{
  public String fuw;
  public LinkedList<String> tSe;
  public String tSf;
  public LinkedList<String> tSg;
  public LinkedList<String> tSh;
  public LinkedList<ud> tSi;
  
  public uc()
  {
    GMTrace.i(3969355087872L, 29574);
    this.tSe = new LinkedList();
    this.tSg = new LinkedList();
    this.tSh = new LinkedList();
    this.tSi = new LinkedList();
    GMTrace.o(3969355087872L, 29574);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3969489305600L, 29575);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.fuw == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.tSf == null) {
        throw new b("Not all required fields were included: JsonData");
      }
      if (this.urV != null)
      {
        paramVarArgs.ff(1, this.urV.aWM());
        this.urV.a(paramVarArgs);
      }
      if (this.fuw != null) {
        paramVarArgs.e(2, this.fuw);
      }
      paramVarArgs.d(3, 1, this.tSe);
      if (this.tSf != null) {
        paramVarArgs.e(4, this.tSf);
      }
      paramVarArgs.d(5, 1, this.tSg);
      paramVarArgs.d(6, 1, this.tSh);
      paramVarArgs.d(7, 8, this.tSi);
      GMTrace.o(3969489305600L, 29575);
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
      if (this.fuw != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.fuw);
      }
      i += b.a.a.a.c(3, 1, this.tSe);
      paramInt = i;
      if (this.tSf != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tSf);
      }
      i = b.a.a.a.c(5, 1, this.tSg);
      int j = b.a.a.a.c(6, 1, this.tSh);
      int k = b.a.a.a.c(7, 8, this.tSi);
      GMTrace.o(3969489305600L, 29575);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tSe.clear();
      this.tSg.clear();
      this.tSh.clear();
      this.tSi.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.fuw == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.tSf == null) {
        throw new b("Not all required fields were included: JsonData");
      }
      GMTrace.o(3969489305600L, 29575);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      uc localuc = (uc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3969489305600L, 29575);
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
          localuc.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3969489305600L, 29575);
        return 0;
      case 2: 
        localuc.fuw = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3969489305600L, 29575);
        return 0;
      case 3: 
        localuc.tSe.add(((b.a.a.a.a)localObject1).xSv.readString());
        GMTrace.o(3969489305600L, 29575);
        return 0;
      case 4: 
        localuc.tSf = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3969489305600L, 29575);
        return 0;
      case 5: 
        localuc.tSg.add(((b.a.a.a.a)localObject1).xSv.readString());
        GMTrace.o(3969489305600L, 29575);
        return 0;
      case 6: 
        localuc.tSh.add(((b.a.a.a.a)localObject1).xSv.readString());
        GMTrace.o(3969489305600L, 29575);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ud();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((ud)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
        localuc.tSi.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3969489305600L, 29575);
      return 0;
    }
    GMTrace.o(3969489305600L, 29575);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/uc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */