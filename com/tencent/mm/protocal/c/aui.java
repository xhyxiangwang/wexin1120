package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aui
  extends axk
{
  public int kpr;
  public String kps;
  public int upJ;
  public String upK;
  public String upL;
  
  public aui()
  {
    GMTrace.i(17875653885952L, 133184);
    GMTrace.o(17875653885952L, 133184);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17875788103680L, 133185);
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
      paramVarArgs.fd(2, this.kpr);
      if (this.kps != null) {
        paramVarArgs.e(3, this.kps);
      }
      paramVarArgs.fd(4, this.upJ);
      if (this.upK != null) {
        paramVarArgs.e(5, this.upK);
      }
      if (this.upL != null) {
        paramVarArgs.e(6, this.upL);
      }
      GMTrace.o(17875788103680L, 133185);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.kpr);
      paramInt = i;
      if (this.kps != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.kps);
      }
      i = paramInt + b.a.a.a.fa(4, this.upJ);
      paramInt = i;
      if (this.upK != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.upK);
      }
      i = paramInt;
      if (this.upL != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.upL);
      }
      GMTrace.o(17875788103680L, 133185);
      return i;
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
      GMTrace.o(17875788103680L, 133185);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aui localaui = (aui)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(17875788103680L, 133185);
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
          localaui.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17875788103680L, 133185);
        return 0;
      case 2: 
        localaui.kpr = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(17875788103680L, 133185);
        return 0;
      case 3: 
        localaui.kps = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(17875788103680L, 133185);
        return 0;
      case 4: 
        localaui.upJ = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(17875788103680L, 133185);
        return 0;
      case 5: 
        localaui.upK = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(17875788103680L, 133185);
        return 0;
      }
      localaui.upL = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(17875788103680L, 133185);
      return 0;
    }
    GMTrace.o(17875788103680L, 133185);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aui.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */