package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class asn
  extends com.tencent.mm.bl.a
{
  public int tWt;
  public String tWu;
  public String tWv;
  public bib uob;
  
  public asn()
  {
    GMTrace.i(3826547425280L, 28510);
    GMTrace.o(3826547425280L, 28510);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3826681643008L, 28511);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.tWt);
      if (this.tWu != null) {
        paramVarArgs.e(2, this.tWu);
      }
      if (this.tWv != null) {
        paramVarArgs.e(3, this.tWv);
      }
      if (this.uob != null)
      {
        paramVarArgs.ff(4, this.uob.aWM());
        this.uob.a(paramVarArgs);
      }
      GMTrace.o(3826681643008L, 28511);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fa(1, this.tWt) + 0;
      paramInt = i;
      if (this.tWu != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tWu);
      }
      i = paramInt;
      if (this.tWv != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tWv);
      }
      paramInt = i;
      if (this.uob != null) {
        paramInt = i + b.a.a.a.fc(4, this.uob.aWM());
      }
      GMTrace.o(3826681643008L, 28511);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3826681643008L, 28511);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      asn localasn = (asn)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3826681643008L, 28511);
        return -1;
      case 1: 
        localasn.tWt = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3826681643008L, 28511);
        return 0;
      case 2: 
        localasn.tWu = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3826681643008L, 28511);
        return 0;
      case 3: 
        localasn.tWv = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3826681643008L, 28511);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bib();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((bib)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localasn.uob = ((bib)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3826681643008L, 28511);
      return 0;
    }
    GMTrace.o(3826681643008L, 28511);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/asn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */