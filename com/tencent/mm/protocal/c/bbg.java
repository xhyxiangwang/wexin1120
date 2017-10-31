package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bbg
  extends com.tencent.mm.bl.a
{
  public int huJ;
  public String huK;
  public String huL;
  public String huM;
  public String huS;
  public String huT;
  public String jWW;
  public String jYc;
  public String tHi;
  public String tHj;
  public String tTc;
  public String tYz;
  public int tvr;
  public String uff;
  public int ufg;
  public String ufh;
  public String ufi;
  public String ufj;
  public int ufk;
  public int ufl;
  public bep ufm;
  public ob ufn;
  public int utA;
  public int uty;
  public axs utz;
  
  public bbg()
  {
    GMTrace.i(3953785831424L, 29458);
    GMTrace.o(3953785831424L, 29458);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3953920049152L, 29459);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.utz == null) {
        throw new b("Not all required fields were included: ImgBuffer");
      }
      if (this.jWW != null) {
        paramVarArgs.e(1, this.jWW);
      }
      if (this.jYc != null) {
        paramVarArgs.e(2, this.jYc);
      }
      if (this.huK != null) {
        paramVarArgs.e(3, this.huK);
      }
      if (this.huL != null) {
        paramVarArgs.e(4, this.huL);
      }
      if (this.huM != null) {
        paramVarArgs.e(5, this.huM);
      }
      if (this.uff != null) {
        paramVarArgs.e(6, this.uff);
      }
      paramVarArgs.fd(7, this.huJ);
      paramVarArgs.fd(8, this.tvr);
      paramVarArgs.fd(9, this.uty);
      if (this.utz != null)
      {
        paramVarArgs.ff(10, this.utz.aWM());
        this.utz.a(paramVarArgs);
      }
      paramVarArgs.fd(11, this.utA);
      if (this.ufi != null) {
        paramVarArgs.e(12, this.ufi);
      }
      if (this.ufj != null) {
        paramVarArgs.e(13, this.ufj);
      }
      paramVarArgs.fd(14, this.ufk);
      paramVarArgs.fd(15, this.ufg);
      if (this.ufh != null) {
        paramVarArgs.e(16, this.ufh);
      }
      if (this.tYz != null) {
        paramVarArgs.e(17, this.tYz);
      }
      paramVarArgs.fd(21, this.ufl);
      if (this.ufm != null)
      {
        paramVarArgs.ff(22, this.ufm.aWM());
        this.ufm.a(paramVarArgs);
      }
      if (this.huS != null) {
        paramVarArgs.e(23, this.huS);
      }
      if (this.tHi != null) {
        paramVarArgs.e(24, this.tHi);
      }
      if (this.tHj != null) {
        paramVarArgs.e(25, this.tHj);
      }
      if (this.huT != null) {
        paramVarArgs.e(26, this.huT);
      }
      if (this.ufn != null)
      {
        paramVarArgs.ff(27, this.ufn.aWM());
        this.ufn.a(paramVarArgs);
      }
      if (this.tTc != null) {
        paramVarArgs.e(28, this.tTc);
      }
      GMTrace.o(3953920049152L, 29459);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.jWW != null) {
        i = b.a.a.b.b.a.f(1, this.jWW) + 0;
      }
      paramInt = i;
      if (this.jYc != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jYc);
      }
      i = paramInt;
      if (this.huK != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.huK);
      }
      paramInt = i;
      if (this.huL != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.huL);
      }
      i = paramInt;
      if (this.huM != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.huM);
      }
      paramInt = i;
      if (this.uff != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.uff);
      }
      i = paramInt + b.a.a.a.fa(7, this.huJ) + b.a.a.a.fa(8, this.tvr) + b.a.a.a.fa(9, this.uty);
      paramInt = i;
      if (this.utz != null) {
        paramInt = i + b.a.a.a.fc(10, this.utz.aWM());
      }
      i = paramInt + b.a.a.a.fa(11, this.utA);
      paramInt = i;
      if (this.ufi != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.ufi);
      }
      i = paramInt;
      if (this.ufj != null) {
        i = paramInt + b.a.a.b.b.a.f(13, this.ufj);
      }
      i = i + b.a.a.a.fa(14, this.ufk) + b.a.a.a.fa(15, this.ufg);
      paramInt = i;
      if (this.ufh != null) {
        paramInt = i + b.a.a.b.b.a.f(16, this.ufh);
      }
      i = paramInt;
      if (this.tYz != null) {
        i = paramInt + b.a.a.b.b.a.f(17, this.tYz);
      }
      i += b.a.a.a.fa(21, this.ufl);
      paramInt = i;
      if (this.ufm != null) {
        paramInt = i + b.a.a.a.fc(22, this.ufm.aWM());
      }
      i = paramInt;
      if (this.huS != null) {
        i = paramInt + b.a.a.b.b.a.f(23, this.huS);
      }
      paramInt = i;
      if (this.tHi != null) {
        paramInt = i + b.a.a.b.b.a.f(24, this.tHi);
      }
      i = paramInt;
      if (this.tHj != null) {
        i = paramInt + b.a.a.b.b.a.f(25, this.tHj);
      }
      paramInt = i;
      if (this.huT != null) {
        paramInt = i + b.a.a.b.b.a.f(26, this.huT);
      }
      i = paramInt;
      if (this.ufn != null) {
        i = paramInt + b.a.a.a.fc(27, this.ufn.aWM());
      }
      paramInt = i;
      if (this.tTc != null) {
        paramInt = i + b.a.a.b.b.a.f(28, this.tTc);
      }
      GMTrace.o(3953920049152L, 29459);
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
      if (this.utz == null) {
        throw new b("Not all required fields were included: ImgBuffer");
      }
      GMTrace.o(3953920049152L, 29459);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bbg localbbg = (bbg)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 18: 
      case 19: 
      case 20: 
      default: 
        GMTrace.o(3953920049152L, 29459);
        return -1;
      case 1: 
        localbbg.jWW = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 2: 
        localbbg.jYc = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 3: 
        localbbg.huK = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 4: 
        localbbg.huL = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 5: 
        localbbg.huM = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 6: 
        localbbg.uff = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 7: 
        localbbg.huJ = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 8: 
        localbbg.tvr = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 9: 
        localbbg.uty = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbbg.utz = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 11: 
        localbbg.utA = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 12: 
        localbbg.ufi = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 13: 
        localbbg.ufj = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 14: 
        localbbg.ufk = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 15: 
        localbbg.ufg = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 16: 
        localbbg.ufh = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 17: 
        localbbg.tYz = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 21: 
        localbbg.ufl = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 22: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bep();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bep)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbbg.ufm = ((bep)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 23: 
        localbbg.huS = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 24: 
        localbbg.tHi = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 25: 
        localbbg.tHj = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 26: 
        localbbg.huT = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 27: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ob();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ob)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbbg.ufn = ((ob)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3953920049152L, 29459);
        return 0;
      }
      localbbg.tTc = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3953920049152L, 29459);
      return 0;
    }
    GMTrace.o(3953920049152L, 29459);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bbg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */