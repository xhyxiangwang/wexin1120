package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bcx
  extends axc
{
  public String uuR;
  public long uuS;
  public String uuT;
  public int uuU;
  
  public bcx()
  {
    GMTrace.i(3731655491584L, 27803);
    GMTrace.o(3731655491584L, 27803);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3731789709312L, 27804);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.uuR != null) {
        paramVarArgs.e(2, this.uuR);
      }
      paramVarArgs.R(3, this.uuS);
      if (this.uuT != null) {
        paramVarArgs.e(4, this.uuT);
      }
      paramVarArgs.fd(5, this.uuU);
      GMTrace.o(3731789709312L, 27804);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt;
      if (this.uuR != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uuR);
      }
      i += b.a.a.a.Q(3, this.uuS);
      paramInt = i;
      if (this.uuT != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uuT);
      }
      i = b.a.a.a.fa(5, this.uuU);
      GMTrace.o(3731789709312L, 27804);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3731789709312L, 27804);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bcx localbcx = (bcx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3731789709312L, 27804);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new en();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((en)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localbcx.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3731789709312L, 27804);
        return 0;
      case 2: 
        localbcx.uuR = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3731789709312L, 27804);
        return 0;
      case 3: 
        localbcx.uuS = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3731789709312L, 27804);
        return 0;
      case 4: 
        localbcx.uuT = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3731789709312L, 27804);
        return 0;
      }
      localbcx.uuU = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3731789709312L, 27804);
      return 0;
    }
    GMTrace.o(3731789709312L, 27804);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bcx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */