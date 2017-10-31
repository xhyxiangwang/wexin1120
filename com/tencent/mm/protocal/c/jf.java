package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class jf
  extends com.tencent.mm.bl.a
{
  public String code;
  public int status;
  public nc tEA;
  public nc tEB;
  public nc tEC;
  public pe tED;
  public String tEE;
  public nc tEF;
  public String tEG;
  public nc tEH;
  public boolean tEI;
  public int tEm;
  public int tEn;
  public LinkedList<js> tEo;
  public LinkedList<js> tEp;
  public LinkedList<js> tEq;
  public LinkedList<String> tEr;
  public int tEs;
  public int tEt;
  public LinkedList<nc> tEu;
  public long tEv;
  public int tEw;
  public String tEx;
  public nc tEy;
  public LinkedList<au> tEz;
  
  public jf()
  {
    GMTrace.i(3619583688704L, 26968);
    this.tEo = new LinkedList();
    this.tEp = new LinkedList();
    this.tEq = new LinkedList();
    this.tEr = new LinkedList();
    this.tEu = new LinkedList();
    this.tEz = new LinkedList();
    GMTrace.o(3619583688704L, 26968);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3619717906432L, 26969);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.status);
      paramVarArgs.fd(2, this.tEm);
      paramVarArgs.fd(3, this.tEn);
      paramVarArgs.d(4, 8, this.tEo);
      paramVarArgs.d(5, 8, this.tEp);
      paramVarArgs.d(6, 8, this.tEq);
      paramVarArgs.d(7, 1, this.tEr);
      paramVarArgs.fd(8, this.tEs);
      if (this.code != null) {
        paramVarArgs.e(9, this.code);
      }
      paramVarArgs.fd(10, this.tEt);
      paramVarArgs.d(11, 8, this.tEu);
      paramVarArgs.R(12, this.tEv);
      paramVarArgs.fd(13, this.tEw);
      if (this.tEx != null) {
        paramVarArgs.e(14, this.tEx);
      }
      if (this.tEy != null)
      {
        paramVarArgs.ff(15, this.tEy.aWM());
        this.tEy.a(paramVarArgs);
      }
      paramVarArgs.d(16, 8, this.tEz);
      if (this.tEA != null)
      {
        paramVarArgs.ff(17, this.tEA.aWM());
        this.tEA.a(paramVarArgs);
      }
      if (this.tEB != null)
      {
        paramVarArgs.ff(18, this.tEB.aWM());
        this.tEB.a(paramVarArgs);
      }
      if (this.tEC != null)
      {
        paramVarArgs.ff(19, this.tEC.aWM());
        this.tEC.a(paramVarArgs);
      }
      if (this.tED != null)
      {
        paramVarArgs.ff(20, this.tED.aWM());
        this.tED.a(paramVarArgs);
      }
      if (this.tEE != null) {
        paramVarArgs.e(21, this.tEE);
      }
      if (this.tEF != null)
      {
        paramVarArgs.ff(22, this.tEF.aWM());
        this.tEF.a(paramVarArgs);
      }
      if (this.tEG != null) {
        paramVarArgs.e(23, this.tEG);
      }
      if (this.tEH != null)
      {
        paramVarArgs.ff(24, this.tEH.aWM());
        this.tEH.a(paramVarArgs);
      }
      paramVarArgs.af(25, this.tEI);
      GMTrace.o(3619717906432L, 26969);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fa(1, this.status) + 0 + b.a.a.a.fa(2, this.tEm) + b.a.a.a.fa(3, this.tEn) + b.a.a.a.c(4, 8, this.tEo) + b.a.a.a.c(5, 8, this.tEp) + b.a.a.a.c(6, 8, this.tEq) + b.a.a.a.c(7, 1, this.tEr) + b.a.a.a.fa(8, this.tEs);
      paramInt = i;
      if (this.code != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.code);
      }
      i = paramInt + b.a.a.a.fa(10, this.tEt) + b.a.a.a.c(11, 8, this.tEu) + b.a.a.a.Q(12, this.tEv) + b.a.a.a.fa(13, this.tEw);
      paramInt = i;
      if (this.tEx != null) {
        paramInt = i + b.a.a.b.b.a.f(14, this.tEx);
      }
      i = paramInt;
      if (this.tEy != null) {
        i = paramInt + b.a.a.a.fc(15, this.tEy.aWM());
      }
      i += b.a.a.a.c(16, 8, this.tEz);
      paramInt = i;
      if (this.tEA != null) {
        paramInt = i + b.a.a.a.fc(17, this.tEA.aWM());
      }
      i = paramInt;
      if (this.tEB != null) {
        i = paramInt + b.a.a.a.fc(18, this.tEB.aWM());
      }
      paramInt = i;
      if (this.tEC != null) {
        paramInt = i + b.a.a.a.fc(19, this.tEC.aWM());
      }
      i = paramInt;
      if (this.tED != null) {
        i = paramInt + b.a.a.a.fc(20, this.tED.aWM());
      }
      paramInt = i;
      if (this.tEE != null) {
        paramInt = i + b.a.a.b.b.a.f(21, this.tEE);
      }
      i = paramInt;
      if (this.tEF != null) {
        i = paramInt + b.a.a.a.fc(22, this.tEF.aWM());
      }
      paramInt = i;
      if (this.tEG != null) {
        paramInt = i + b.a.a.b.b.a.f(23, this.tEG);
      }
      i = paramInt;
      if (this.tEH != null) {
        i = paramInt + b.a.a.a.fc(24, this.tEH.aWM());
      }
      paramInt = b.a.a.b.b.a.cK(25);
      GMTrace.o(3619717906432L, 26969);
      return i + (paramInt + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tEo.clear();
      this.tEp.clear();
      this.tEq.clear();
      this.tEr.clear();
      this.tEu.clear();
      this.tEz.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3619717906432L, 26969);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      jf localjf = (jf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3619717906432L, 26969);
        return -1;
      case 1: 
        localjf.status = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 2: 
        localjf.tEm = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 3: 
        localjf.tEn = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new js();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((js)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localjf.tEo.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new js();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((js)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localjf.tEp.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new js();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((js)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localjf.tEq.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 7: 
        localjf.tEr.add(((b.a.a.a.a)localObject1).xSv.readString());
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 8: 
        localjf.tEs = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 9: 
        localjf.code = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 10: 
        localjf.tEt = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 11: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new nc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((nc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localjf.tEu.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 12: 
        localjf.tEv = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 13: 
        localjf.tEw = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 14: 
        localjf.tEx = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 15: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new nc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((nc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localjf.tEy = ((nc)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 16: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new au();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((au)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localjf.tEz.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 17: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new nc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((nc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localjf.tEA = ((nc)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 18: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new nc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((nc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localjf.tEB = ((nc)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 19: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new nc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((nc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localjf.tEC = ((nc)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 20: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new pe();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((pe)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localjf.tED = ((pe)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 21: 
        localjf.tEE = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 22: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new nc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((nc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localjf.tEF = ((nc)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 23: 
        localjf.tEG = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 24: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new nc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((nc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localjf.tEH = ((nc)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3619717906432L, 26969);
        return 0;
      }
      localjf.tEI = ((b.a.a.a.a)localObject1).cpH();
      GMTrace.o(3619717906432L, 26969);
      return 0;
    }
    GMTrace.o(3619717906432L, 26969);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/jf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */