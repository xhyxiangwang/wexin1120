package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class api
  extends axk
{
  public String hcd;
  public String tHd;
  public LinkedList<apj> ulG;
  public String ulH;
  public boolean ulI;
  public boolean ulJ;
  public boolean ulK;
  
  public api()
  {
    GMTrace.i(17871358918656L, 133152);
    this.ulG = new LinkedList();
    GMTrace.o(17871358918656L, 133152);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17871493136384L, 133153);
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
      paramVarArgs.d(3, 8, this.ulG);
      if (this.hcd != null) {
        paramVarArgs.e(4, this.hcd);
      }
      if (this.ulH != null) {
        paramVarArgs.e(5, this.ulH);
      }
      if (this.tHd != null) {
        paramVarArgs.e(6, this.tHd);
      }
      paramVarArgs.af(8, this.ulI);
      paramVarArgs.af(9, this.ulJ);
      paramVarArgs.af(10, this.ulK);
      GMTrace.o(17871493136384L, 133153);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.c(3, 8, this.ulG);
      paramInt = i;
      if (this.hcd != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.hcd);
      }
      i = paramInt;
      if (this.ulH != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.ulH);
      }
      paramInt = i;
      if (this.tHd != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tHd);
      }
      i = b.a.a.b.b.a.cK(8);
      int j = b.a.a.b.b.a.cK(9);
      int k = b.a.a.b.b.a.cK(10);
      GMTrace.o(17871493136384L, 133153);
      return paramInt + (i + 1) + (j + 1) + (k + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.ulG.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(17871493136384L, 133153);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      api localapi = (api)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 2: 
      case 7: 
      default: 
        GMTrace.o(17871493136384L, 133153);
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
          localapi.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17871493136384L, 133153);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new apj();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((apj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localapi.ulG.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(17871493136384L, 133153);
        return 0;
      case 4: 
        localapi.hcd = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(17871493136384L, 133153);
        return 0;
      case 5: 
        localapi.ulH = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(17871493136384L, 133153);
        return 0;
      case 6: 
        localapi.tHd = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(17871493136384L, 133153);
        return 0;
      case 8: 
        localapi.ulI = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(17871493136384L, 133153);
        return 0;
      case 9: 
        localapi.ulJ = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(17871493136384L, 133153);
        return 0;
      }
      localapi.ulK = ((b.a.a.a.a)localObject1).cpH();
      GMTrace.o(17871493136384L, 133153);
      return 0;
    }
    GMTrace.o(17871493136384L, 133153);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/api.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */