package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bsm
  extends com.tencent.mm.bl.a
{
  public String mDh;
  public String mGI;
  public int uHi;
  public bch uHj;
  public cx uHk;
  public aoo uHl;
  public cm uHm;
  public cw uHn;
  public cq uHo;
  public LinkedList<jq> uHp;
  public String uHq;
  public String uHr;
  
  public bsm()
  {
    GMTrace.i(3795140476928L, 28276);
    this.uHp = new LinkedList();
    GMTrace.o(3795140476928L, 28276);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3795274694656L, 28277);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mGI != null) {
        paramVarArgs.e(1, this.mGI);
      }
      paramVarArgs.fd(2, this.uHi);
      if (this.mDh != null) {
        paramVarArgs.e(3, this.mDh);
      }
      if (this.uHj != null)
      {
        paramVarArgs.ff(4, this.uHj.aWM());
        this.uHj.a(paramVarArgs);
      }
      if (this.uHk != null)
      {
        paramVarArgs.ff(5, this.uHk.aWM());
        this.uHk.a(paramVarArgs);
      }
      if (this.uHl != null)
      {
        paramVarArgs.ff(6, this.uHl.aWM());
        this.uHl.a(paramVarArgs);
      }
      if (this.uHm != null)
      {
        paramVarArgs.ff(7, this.uHm.aWM());
        this.uHm.a(paramVarArgs);
      }
      if (this.uHn != null)
      {
        paramVarArgs.ff(8, this.uHn.aWM());
        this.uHn.a(paramVarArgs);
      }
      if (this.uHo != null)
      {
        paramVarArgs.ff(11, this.uHo.aWM());
        this.uHo.a(paramVarArgs);
      }
      paramVarArgs.d(12, 8, this.uHp);
      if (this.uHq != null) {
        paramVarArgs.e(13, this.uHq);
      }
      if (this.uHr != null) {
        paramVarArgs.e(14, this.uHr);
      }
      GMTrace.o(3795274694656L, 28277);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.mGI != null) {
        paramInt = b.a.a.b.b.a.f(1, this.mGI) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.uHi);
      paramInt = i;
      if (this.mDh != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.mDh);
      }
      i = paramInt;
      if (this.uHj != null) {
        i = paramInt + b.a.a.a.fc(4, this.uHj.aWM());
      }
      paramInt = i;
      if (this.uHk != null) {
        paramInt = i + b.a.a.a.fc(5, this.uHk.aWM());
      }
      i = paramInt;
      if (this.uHl != null) {
        i = paramInt + b.a.a.a.fc(6, this.uHl.aWM());
      }
      paramInt = i;
      if (this.uHm != null) {
        paramInt = i + b.a.a.a.fc(7, this.uHm.aWM());
      }
      i = paramInt;
      if (this.uHn != null) {
        i = paramInt + b.a.a.a.fc(8, this.uHn.aWM());
      }
      paramInt = i;
      if (this.uHo != null) {
        paramInt = i + b.a.a.a.fc(11, this.uHo.aWM());
      }
      i = paramInt + b.a.a.a.c(12, 8, this.uHp);
      paramInt = i;
      if (this.uHq != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.uHq);
      }
      i = paramInt;
      if (this.uHr != null) {
        i = paramInt + b.a.a.b.b.a.f(14, this.uHr);
      }
      GMTrace.o(3795274694656L, 28277);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uHp.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3795274694656L, 28277);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bsm localbsm = (bsm)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 9: 
      case 10: 
      default: 
        GMTrace.o(3795274694656L, 28277);
        return -1;
      case 1: 
        localbsm.mGI = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3795274694656L, 28277);
        return 0;
      case 2: 
        localbsm.uHi = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3795274694656L, 28277);
        return 0;
      case 3: 
        localbsm.mDh = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3795274694656L, 28277);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bch();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bch)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbsm.uHj = ((bch)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3795274694656L, 28277);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new cx();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((cx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbsm.uHk = ((cx)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3795274694656L, 28277);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aoo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aoo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbsm.uHl = ((aoo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3795274694656L, 28277);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new cm();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((cm)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbsm.uHm = ((cm)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3795274694656L, 28277);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new cw();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((cw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbsm.uHn = ((cw)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3795274694656L, 28277);
        return 0;
      case 11: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new cq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((cq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbsm.uHo = ((cq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3795274694656L, 28277);
        return 0;
      case 12: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new jq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((jq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbsm.uHp.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3795274694656L, 28277);
        return 0;
      case 13: 
        localbsm.uHq = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3795274694656L, 28277);
        return 0;
      }
      localbsm.uHr = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3795274694656L, 28277);
      return 0;
    }
    GMTrace.o(3795274694656L, 28277);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bsm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */