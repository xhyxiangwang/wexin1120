package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.axk;
import com.tencent.mm.protocal.c.eo;
import java.util.LinkedList;

public final class am
  extends axk
{
  public c mCC;
  public bm mEA;
  public az mEB;
  public aw mEC;
  public bx mED;
  public LinkedList<r> mEE;
  public cc mEF;
  public ay mEG;
  public av mEH;
  public String mEy;
  public LinkedList<q> mEz;
  
  public am()
  {
    GMTrace.i(12635928002560L, 94145);
    this.mEz = new LinkedList();
    this.mEE = new LinkedList();
    GMTrace.o(12635928002560L, 94145);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12636062220288L, 94146);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.mCC == null) {
        throw new b("Not all required fields were included: AppItem");
      }
      if (this.mEy == null) {
        throw new b("Not all required fields were included: BackGroundURL");
      }
      if (this.urV != null)
      {
        paramVarArgs.ff(1, this.urV.aWM());
        this.urV.a(paramVarArgs);
      }
      if (this.mCC != null)
      {
        paramVarArgs.ff(2, this.mCC.aWM());
        this.mCC.a(paramVarArgs);
      }
      if (this.mEy != null) {
        paramVarArgs.e(3, this.mEy);
      }
      paramVarArgs.d(4, 8, this.mEz);
      if (this.mEA != null)
      {
        paramVarArgs.ff(5, this.mEA.aWM());
        this.mEA.a(paramVarArgs);
      }
      if (this.mEB != null)
      {
        paramVarArgs.ff(7, this.mEB.aWM());
        this.mEB.a(paramVarArgs);
      }
      if (this.mEC != null)
      {
        paramVarArgs.ff(8, this.mEC.aWM());
        this.mEC.a(paramVarArgs);
      }
      if (this.mED != null)
      {
        paramVarArgs.ff(9, this.mED.aWM());
        this.mED.a(paramVarArgs);
      }
      paramVarArgs.d(10, 8, this.mEE);
      if (this.mEF != null)
      {
        paramVarArgs.ff(11, this.mEF.aWM());
        this.mEF.a(paramVarArgs);
      }
      if (this.mEG != null)
      {
        paramVarArgs.ff(12, this.mEG.aWM());
        this.mEG.a(paramVarArgs);
      }
      if (this.mEH != null)
      {
        paramVarArgs.ff(13, this.mEH.aWM());
        this.mEH.a(paramVarArgs);
      }
      GMTrace.o(12636062220288L, 94146);
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
      if (this.mCC != null) {
        paramInt = i + b.a.a.a.fc(2, this.mCC.aWM());
      }
      i = paramInt;
      if (this.mEy != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.mEy);
      }
      i += b.a.a.a.c(4, 8, this.mEz);
      paramInt = i;
      if (this.mEA != null) {
        paramInt = i + b.a.a.a.fc(5, this.mEA.aWM());
      }
      i = paramInt;
      if (this.mEB != null) {
        i = paramInt + b.a.a.a.fc(7, this.mEB.aWM());
      }
      paramInt = i;
      if (this.mEC != null) {
        paramInt = i + b.a.a.a.fc(8, this.mEC.aWM());
      }
      i = paramInt;
      if (this.mED != null) {
        i = paramInt + b.a.a.a.fc(9, this.mED.aWM());
      }
      i += b.a.a.a.c(10, 8, this.mEE);
      paramInt = i;
      if (this.mEF != null) {
        paramInt = i + b.a.a.a.fc(11, this.mEF.aWM());
      }
      i = paramInt;
      if (this.mEG != null) {
        i = paramInt + b.a.a.a.fc(12, this.mEG.aWM());
      }
      paramInt = i;
      if (this.mEH != null) {
        paramInt = i + b.a.a.a.fc(13, this.mEH.aWM());
      }
      GMTrace.o(12636062220288L, 94146);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.mEz.clear();
      this.mEE.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.mCC == null) {
        throw new b("Not all required fields were included: AppItem");
      }
      if (this.mEy == null) {
        throw new b("Not all required fields were included: BackGroundURL");
      }
      GMTrace.o(12636062220288L, 94146);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      am localam = (am)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 6: 
      default: 
        GMTrace.o(12636062220288L, 94146);
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
          localam.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12636062220288L, 94146);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new c();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((c)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localam.mCC = ((c)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12636062220288L, 94146);
        return 0;
      case 3: 
        localam.mEy = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12636062220288L, 94146);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new q();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((q)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localam.mEz.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(12636062220288L, 94146);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bm();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bm)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localam.mEA = ((bm)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12636062220288L, 94146);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new az();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((az)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localam.mEB = ((az)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12636062220288L, 94146);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aw();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localam.mEC = ((aw)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12636062220288L, 94146);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bx();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localam.mED = ((bx)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12636062220288L, 94146);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new r();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((r)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localam.mEE.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(12636062220288L, 94146);
        return 0;
      case 11: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new cc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((cc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localam.mEF = ((cc)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12636062220288L, 94146);
        return 0;
      case 12: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ay();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ay)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localam.mEG = ((ay)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12636062220288L, 94146);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new av();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((av)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
        localam.mEH = ((av)localObject1);
        paramInt += 1;
      }
      GMTrace.o(12636062220288L, 94146);
      return 0;
    }
    GMTrace.o(12636062220288L, 94146);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */