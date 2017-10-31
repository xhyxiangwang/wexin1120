package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.axk;
import com.tencent.mm.protocal.c.eo;
import java.util.LinkedList;

public final class ao
  extends axk
{
  public y mEM;
  public ae mEN;
  public h mEO;
  public ca mEP;
  public cj mEQ;
  public w mER;
  public bj mES;
  public bi mET;
  public bp mEU;
  public k mEV;
  public n mEW;
  public String mEX;
  public int mEY;
  public boolean mEZ;
  public String mEq;
  
  public ao()
  {
    GMTrace.i(12646396985344L, 94223);
    GMTrace.o(12646396985344L, 94223);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12646531203072L, 94224);
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
      if (this.mEM != null)
      {
        paramVarArgs.ff(2, this.mEM.aWM());
        this.mEM.a(paramVarArgs);
      }
      if (this.mEN != null)
      {
        paramVarArgs.ff(3, this.mEN.aWM());
        this.mEN.a(paramVarArgs);
      }
      if (this.mEq != null) {
        paramVarArgs.e(4, this.mEq);
      }
      if (this.mEO != null)
      {
        paramVarArgs.ff(5, this.mEO.aWM());
        this.mEO.a(paramVarArgs);
      }
      if (this.mEP != null)
      {
        paramVarArgs.ff(6, this.mEP.aWM());
        this.mEP.a(paramVarArgs);
      }
      if (this.mEQ != null)
      {
        paramVarArgs.ff(7, this.mEQ.aWM());
        this.mEQ.a(paramVarArgs);
      }
      if (this.mER != null)
      {
        paramVarArgs.ff(8, this.mER.aWM());
        this.mER.a(paramVarArgs);
      }
      if (this.mES != null)
      {
        paramVarArgs.ff(9, this.mES.aWM());
        this.mES.a(paramVarArgs);
      }
      if (this.mET != null)
      {
        paramVarArgs.ff(10, this.mET.aWM());
        this.mET.a(paramVarArgs);
      }
      if (this.mEU != null)
      {
        paramVarArgs.ff(11, this.mEU.aWM());
        this.mEU.a(paramVarArgs);
      }
      if (this.mEV != null)
      {
        paramVarArgs.ff(12, this.mEV.aWM());
        this.mEV.a(paramVarArgs);
      }
      if (this.mEW != null)
      {
        paramVarArgs.ff(13, this.mEW.aWM());
        this.mEW.a(paramVarArgs);
      }
      if (this.mEX != null) {
        paramVarArgs.e(14, this.mEX);
      }
      paramVarArgs.fd(15, this.mEY);
      paramVarArgs.af(16, this.mEZ);
      GMTrace.o(12646531203072L, 94224);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.urV != null) {
        i = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      paramInt = i;
      if (this.mEM != null) {
        paramInt = i + b.a.a.a.fc(2, this.mEM.aWM());
      }
      i = paramInt;
      if (this.mEN != null) {
        i = paramInt + b.a.a.a.fc(3, this.mEN.aWM());
      }
      paramInt = i;
      if (this.mEq != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mEq);
      }
      i = paramInt;
      if (this.mEO != null) {
        i = paramInt + b.a.a.a.fc(5, this.mEO.aWM());
      }
      paramInt = i;
      if (this.mEP != null) {
        paramInt = i + b.a.a.a.fc(6, this.mEP.aWM());
      }
      i = paramInt;
      if (this.mEQ != null) {
        i = paramInt + b.a.a.a.fc(7, this.mEQ.aWM());
      }
      paramInt = i;
      if (this.mER != null) {
        paramInt = i + b.a.a.a.fc(8, this.mER.aWM());
      }
      i = paramInt;
      if (this.mES != null) {
        i = paramInt + b.a.a.a.fc(9, this.mES.aWM());
      }
      paramInt = i;
      if (this.mET != null) {
        paramInt = i + b.a.a.a.fc(10, this.mET.aWM());
      }
      i = paramInt;
      if (this.mEU != null) {
        i = paramInt + b.a.a.a.fc(11, this.mEU.aWM());
      }
      paramInt = i;
      if (this.mEV != null) {
        paramInt = i + b.a.a.a.fc(12, this.mEV.aWM());
      }
      i = paramInt;
      if (this.mEW != null) {
        i = paramInt + b.a.a.a.fc(13, this.mEW.aWM());
      }
      paramInt = i;
      if (this.mEX != null) {
        paramInt = i + b.a.a.b.b.a.f(14, this.mEX);
      }
      i = b.a.a.a.fa(15, this.mEY);
      int j = b.a.a.b.b.a.cK(16);
      GMTrace.o(12646531203072L, 94224);
      return paramInt + i + (j + 1);
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
      GMTrace.o(12646531203072L, 94224);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ao localao = (ao)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(12646531203072L, 94224);
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
          localao.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12646531203072L, 94224);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new y();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((y)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localao.mEM = ((y)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12646531203072L, 94224);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ae();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ae)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localao.mEN = ((ae)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12646531203072L, 94224);
        return 0;
      case 4: 
        localao.mEq = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12646531203072L, 94224);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new h();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((h)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localao.mEO = ((h)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12646531203072L, 94224);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ca();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ca)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localao.mEP = ((ca)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12646531203072L, 94224);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new cj();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((cj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localao.mEQ = ((cj)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12646531203072L, 94224);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new w();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((w)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localao.mER = ((w)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12646531203072L, 94224);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bj();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localao.mES = ((bj)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12646531203072L, 94224);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bi();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bi)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localao.mET = ((bi)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12646531203072L, 94224);
        return 0;
      case 11: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localao.mEU = ((bp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12646531203072L, 94224);
        return 0;
      case 12: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new k();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((k)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localao.mEV = ((k)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12646531203072L, 94224);
        return 0;
      case 13: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new n();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((n)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localao.mEW = ((n)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12646531203072L, 94224);
        return 0;
      case 14: 
        localao.mEX = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12646531203072L, 94224);
        return 0;
      case 15: 
        localao.mEY = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(12646531203072L, 94224);
        return 0;
      }
      localao.mEZ = ((b.a.a.a.a)localObject1).cpH();
      GMTrace.o(12646531203072L, 94224);
      return 0;
    }
    GMTrace.o(12646531203072L, 94224);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */