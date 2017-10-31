package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class beo
  extends axk
{
  public int jXP;
  public long tDg;
  public String tvh;
  public int twU;
  public int twV;
  public int uiw;
  public LinkedList<bcw> uix;
  public bcw uwz;
  
  public beo()
  {
    GMTrace.i(3764404617216L, 28047);
    this.uix = new LinkedList();
    GMTrace.o(3764404617216L, 28047);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3764538834944L, 28048);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uwz == null) {
        throw new b("Not all required fields were included: BufferUrl");
      }
      if (this.urV != null)
      {
        paramVarArgs.ff(1, this.urV.aWM());
        this.urV.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.twV);
      paramVarArgs.fd(3, this.twU);
      if (this.tvh != null) {
        paramVarArgs.e(4, this.tvh);
      }
      if (this.uwz != null)
      {
        paramVarArgs.ff(5, this.uwz.aWM());
        this.uwz.a(paramVarArgs);
      }
      paramVarArgs.fd(6, this.uiw);
      paramVarArgs.d(7, 8, this.uix);
      paramVarArgs.R(8, this.tDg);
      paramVarArgs.fd(9, this.jXP);
      GMTrace.o(3764538834944L, 28048);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.twV) + b.a.a.a.fa(3, this.twU);
      paramInt = i;
      if (this.tvh != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tvh);
      }
      i = paramInt;
      if (this.uwz != null) {
        i = paramInt + b.a.a.a.fc(5, this.uwz.aWM());
      }
      paramInt = b.a.a.a.fa(6, this.uiw);
      int j = b.a.a.a.c(7, 8, this.uix);
      int k = b.a.a.a.Q(8, this.tDg);
      int m = b.a.a.a.fa(9, this.jXP);
      GMTrace.o(3764538834944L, 28048);
      return i + paramInt + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uix.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uwz == null) {
        throw new b("Not all required fields were included: BufferUrl");
      }
      GMTrace.o(3764538834944L, 28048);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      beo localbeo = (beo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3764538834944L, 28048);
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
          localbeo.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3764538834944L, 28048);
        return 0;
      case 2: 
        localbeo.twV = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3764538834944L, 28048);
        return 0;
      case 3: 
        localbeo.twU = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3764538834944L, 28048);
        return 0;
      case 4: 
        localbeo.tvh = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3764538834944L, 28048);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bcw();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bcw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localbeo.uwz = ((bcw)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3764538834944L, 28048);
        return 0;
      case 6: 
        localbeo.uiw = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3764538834944L, 28048);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bcw();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bcw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localbeo.uix.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3764538834944L, 28048);
        return 0;
      case 8: 
        localbeo.tDg = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3764538834944L, 28048);
        return 0;
      }
      localbeo.jXP = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3764538834944L, 28048);
      return 0;
    }
    GMTrace.o(3764538834944L, 28048);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/beo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */