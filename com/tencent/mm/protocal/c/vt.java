package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class vt
  extends axk
{
  public dy mhb;
  public int tsH;
  public int tst;
  public int tsx;
  public String tsy;
  public bcd tsz;
  
  public vt()
  {
    GMTrace.i(3955128008704L, 29468);
    GMTrace.o(3955128008704L, 29468);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3955262226432L, 29469);
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
      paramVarArgs.fd(2, this.tsx);
      paramVarArgs.fd(3, this.tsH);
      if (this.tsy != null) {
        paramVarArgs.e(4, this.tsy);
      }
      if (this.tsz != null)
      {
        paramVarArgs.ff(5, this.tsz.aWM());
        this.tsz.a(paramVarArgs);
      }
      if (this.mhb != null)
      {
        paramVarArgs.ff(6, this.mhb.aWM());
        this.mhb.a(paramVarArgs);
      }
      paramVarArgs.fd(7, this.tst);
      GMTrace.o(3955262226432L, 29469);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.tsx) + b.a.a.a.fa(3, this.tsH);
      paramInt = i;
      if (this.tsy != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tsy);
      }
      i = paramInt;
      if (this.tsz != null) {
        i = paramInt + b.a.a.a.fc(5, this.tsz.aWM());
      }
      paramInt = i;
      if (this.mhb != null) {
        paramInt = i + b.a.a.a.fc(6, this.mhb.aWM());
      }
      i = b.a.a.a.fa(7, this.tst);
      GMTrace.o(3955262226432L, 29469);
      return paramInt + i;
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
      GMTrace.o(3955262226432L, 29469);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      vt localvt = (vt)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3955262226432L, 29469);
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
          localvt.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3955262226432L, 29469);
        return 0;
      case 2: 
        localvt.tsx = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3955262226432L, 29469);
        return 0;
      case 3: 
        localvt.tsH = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3955262226432L, 29469);
        return 0;
      case 4: 
        localvt.tsy = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3955262226432L, 29469);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bcd();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bcd)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localvt.tsz = ((bcd)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3955262226432L, 29469);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new dy();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((dy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localvt.mhb = ((dy)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3955262226432L, 29469);
        return 0;
      }
      localvt.tst = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3955262226432L, 29469);
      return 0;
    }
    GMTrace.o(3955262226432L, 29469);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/vt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */