package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bhb
  extends axk
{
  public int tUi;
  public int tUj;
  public int twU;
  public int twV;
  public int unQ;
  public int uyp;
  public LinkedList<axt> uyq;
  
  public bhb()
  {
    GMTrace.i(4032705855488L, 30046);
    this.uyq = new LinkedList();
    GMTrace.o(4032705855488L, 30046);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4032840073216L, 30047);
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
      paramVarArgs.fd(2, this.twV);
      paramVarArgs.fd(3, this.twU);
      paramVarArgs.fd(4, this.tUi);
      paramVarArgs.fd(5, this.tUj);
      paramVarArgs.fd(6, this.uyp);
      paramVarArgs.d(7, 8, this.uyq);
      paramVarArgs.fd(8, this.unQ);
      GMTrace.o(4032840073216L, 30047);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = b.a.a.a.fa(2, this.twV);
      int j = b.a.a.a.fa(3, this.twU);
      int k = b.a.a.a.fa(4, this.tUi);
      int m = b.a.a.a.fa(5, this.tUj);
      int n = b.a.a.a.fa(6, this.uyp);
      int i1 = b.a.a.a.c(7, 8, this.uyq);
      int i2 = b.a.a.a.fa(8, this.unQ);
      GMTrace.o(4032840073216L, 30047);
      return paramInt + i + j + k + m + n + i1 + i2;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uyq.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(4032840073216L, 30047);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bhb localbhb = (bhb)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4032840073216L, 30047);
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
          localbhb.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4032840073216L, 30047);
        return 0;
      case 2: 
        localbhb.twV = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4032840073216L, 30047);
        return 0;
      case 3: 
        localbhb.twU = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4032840073216L, 30047);
        return 0;
      case 4: 
        localbhb.tUi = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4032840073216L, 30047);
        return 0;
      case 5: 
        localbhb.tUj = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4032840073216L, 30047);
        return 0;
      case 6: 
        localbhb.uyp = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4032840073216L, 30047);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axt();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localbhb.uyq.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4032840073216L, 30047);
        return 0;
      }
      localbhb.unQ = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(4032840073216L, 30047);
      return 0;
    }
    GMTrace.o(4032840073216L, 30047);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bhb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */