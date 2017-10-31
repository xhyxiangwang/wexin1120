package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class adi
  extends axk
{
  public String tZc;
  public String tZd;
  public LinkedList<String> tZe;
  public int txI;
  
  public adi()
  {
    GMTrace.i(14997757362176L, 111742);
    this.tZe = new LinkedList();
    GMTrace.o(14997757362176L, 111742);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14997891579904L, 111743);
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
      if (this.tZc != null) {
        paramVarArgs.e(2, this.tZc);
      }
      paramVarArgs.fd(3, this.txI);
      if (this.tZd != null) {
        paramVarArgs.e(4, this.tZd);
      }
      paramVarArgs.d(5, 1, this.tZe);
      GMTrace.o(14997891579904L, 111743);
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
      if (this.tZc != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.tZc);
      }
      i += b.a.a.a.fa(3, this.txI);
      paramInt = i;
      if (this.tZd != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tZd);
      }
      i = b.a.a.a.c(5, 1, this.tZe);
      GMTrace.o(14997891579904L, 111743);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tZe.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(14997891579904L, 111743);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      adi localadi = (adi)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(14997891579904L, 111743);
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
          localadi.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(14997891579904L, 111743);
        return 0;
      case 2: 
        localadi.tZc = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(14997891579904L, 111743);
        return 0;
      case 3: 
        localadi.txI = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(14997891579904L, 111743);
        return 0;
      case 4: 
        localadi.tZd = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(14997891579904L, 111743);
        return 0;
      }
      localadi.tZe.add(((b.a.a.a.a)localObject1).xSv.readString());
      GMTrace.o(14997891579904L, 111743);
      return 0;
    }
    GMTrace.o(14997891579904L, 111743);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/adi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */