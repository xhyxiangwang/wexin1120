package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.axk;
import com.tencent.mm.protocal.c.eo;
import java.util.LinkedList;

public final class ak
  extends axk
{
  public boolean mEo;
  public z mEp;
  public String mEq;
  public d mEr;
  public v mEs;
  public e mEt;
  public ce mEu;
  
  public ak()
  {
    GMTrace.i(16561796546560L, 123395);
    GMTrace.o(16561796546560L, 123395);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16561930764288L, 123396);
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
      paramVarArgs.af(2, this.mEo);
      if (this.mEp != null)
      {
        paramVarArgs.ff(3, this.mEp.aWM());
        this.mEp.a(paramVarArgs);
      }
      if (this.mEq != null) {
        paramVarArgs.e(4, this.mEq);
      }
      if (this.mEr != null)
      {
        paramVarArgs.ff(5, this.mEr.aWM());
        this.mEr.a(paramVarArgs);
      }
      if (this.mEs != null)
      {
        paramVarArgs.ff(6, this.mEs.aWM());
        this.mEs.a(paramVarArgs);
      }
      if (this.mEt != null)
      {
        paramVarArgs.ff(7, this.mEt.aWM());
        this.mEt.a(paramVarArgs);
      }
      if (this.mEu != null)
      {
        paramVarArgs.ff(8, this.mEu.aWM());
        this.mEu.a(paramVarArgs);
      }
      GMTrace.o(16561930764288L, 123396);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt + (b.a.a.b.b.a.cK(2) + 1);
      paramInt = i;
      if (this.mEp != null) {
        paramInt = i + b.a.a.a.fc(3, this.mEp.aWM());
      }
      i = paramInt;
      if (this.mEq != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.mEq);
      }
      paramInt = i;
      if (this.mEr != null) {
        paramInt = i + b.a.a.a.fc(5, this.mEr.aWM());
      }
      i = paramInt;
      if (this.mEs != null) {
        i = paramInt + b.a.a.a.fc(6, this.mEs.aWM());
      }
      paramInt = i;
      if (this.mEt != null) {
        paramInt = i + b.a.a.a.fc(7, this.mEt.aWM());
      }
      i = paramInt;
      if (this.mEu != null) {
        i = paramInt + b.a.a.a.fc(8, this.mEu.aWM());
      }
      GMTrace.o(16561930764288L, 123396);
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
      GMTrace.o(16561930764288L, 123396);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ak localak = (ak)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(16561930764288L, 123396);
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
          localak.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(16561930764288L, 123396);
        return 0;
      case 2: 
        localak.mEo = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(16561930764288L, 123396);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new z();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((z)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localak.mEp = ((z)localObject1);
          paramInt += 1;
        }
        GMTrace.o(16561930764288L, 123396);
        return 0;
      case 4: 
        localak.mEq = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(16561930764288L, 123396);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new d();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((d)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localak.mEr = ((d)localObject1);
          paramInt += 1;
        }
        GMTrace.o(16561930764288L, 123396);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new v();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((v)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localak.mEs = ((v)localObject1);
          paramInt += 1;
        }
        GMTrace.o(16561930764288L, 123396);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new e();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((e)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localak.mEt = ((e)localObject1);
          paramInt += 1;
        }
        GMTrace.o(16561930764288L, 123396);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ce();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((ce)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
        localak.mEu = ((ce)localObject1);
        paramInt += 1;
      }
      GMTrace.o(16561930764288L, 123396);
      return 0;
    }
    GMTrace.o(16561930764288L, 123396);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */