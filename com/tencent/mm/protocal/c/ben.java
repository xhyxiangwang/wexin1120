package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ben
  extends axc
{
  public int jXP;
  public String mDD;
  public int tIM;
  public String tLN;
  public String tvh;
  public int twU;
  public int twV;
  public String txe;
  public axs tyt;
  public int uhW;
  public int uhX;
  public int ujv;
  public bib uob;
  public int uwx;
  public int uwy;
  
  public ben()
  {
    GMTrace.i(3818762797056L, 28452);
    GMTrace.o(3818762797056L, 28452);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3818897014784L, 28453);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tyt == null) {
        throw new b("Not all required fields were included: Buffer");
      }
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.jXP);
      paramVarArgs.fd(3, this.twV);
      paramVarArgs.fd(4, this.twU);
      if (this.tyt != null)
      {
        paramVarArgs.ff(5, this.tyt.aWM());
        this.tyt.a(paramVarArgs);
      }
      if (this.tvh != null) {
        paramVarArgs.e(6, this.tvh);
      }
      paramVarArgs.fd(7, this.uhW);
      paramVarArgs.fd(8, this.uhX);
      if (this.txe != null) {
        paramVarArgs.e(9, this.txe);
      }
      paramVarArgs.fd(10, this.uwx);
      paramVarArgs.fd(11, this.tIM);
      if (this.uob != null)
      {
        paramVarArgs.ff(12, this.uob.aWM());
        this.uob.a(paramVarArgs);
      }
      if (this.mDD != null) {
        paramVarArgs.e(13, this.mDD);
      }
      paramVarArgs.fd(14, this.ujv);
      if (this.tLN != null) {
        paramVarArgs.e(15, this.tLN);
      }
      paramVarArgs.fd(16, this.uwy);
      GMTrace.o(3818897014784L, 28453);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.jXP) + b.a.a.a.fa(3, this.twV) + b.a.a.a.fa(4, this.twU);
      paramInt = i;
      if (this.tyt != null) {
        paramInt = i + b.a.a.a.fc(5, this.tyt.aWM());
      }
      i = paramInt;
      if (this.tvh != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.tvh);
      }
      i = i + b.a.a.a.fa(7, this.uhW) + b.a.a.a.fa(8, this.uhX);
      paramInt = i;
      if (this.txe != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.txe);
      }
      i = paramInt + b.a.a.a.fa(10, this.uwx) + b.a.a.a.fa(11, this.tIM);
      paramInt = i;
      if (this.uob != null) {
        paramInt = i + b.a.a.a.fc(12, this.uob.aWM());
      }
      i = paramInt;
      if (this.mDD != null) {
        i = paramInt + b.a.a.b.b.a.f(13, this.mDD);
      }
      i += b.a.a.a.fa(14, this.ujv);
      paramInt = i;
      if (this.tLN != null) {
        paramInt = i + b.a.a.b.b.a.f(15, this.tLN);
      }
      i = b.a.a.a.fa(16, this.uwy);
      GMTrace.o(3818897014784L, 28453);
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
      if (this.tyt == null) {
        throw new b("Not all required fields were included: Buffer");
      }
      GMTrace.o(3818897014784L, 28453);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ben localben = (ben)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3818897014784L, 28453);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new en();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((en)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localben.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3818897014784L, 28453);
        return 0;
      case 2: 
        localben.jXP = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3818897014784L, 28453);
        return 0;
      case 3: 
        localben.twV = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3818897014784L, 28453);
        return 0;
      case 4: 
        localben.twU = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3818897014784L, 28453);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localben.tyt = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3818897014784L, 28453);
        return 0;
      case 6: 
        localben.tvh = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3818897014784L, 28453);
        return 0;
      case 7: 
        localben.uhW = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3818897014784L, 28453);
        return 0;
      case 8: 
        localben.uhX = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3818897014784L, 28453);
        return 0;
      case 9: 
        localben.txe = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3818897014784L, 28453);
        return 0;
      case 10: 
        localben.uwx = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3818897014784L, 28453);
        return 0;
      case 11: 
        localben.tIM = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3818897014784L, 28453);
        return 0;
      case 12: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bib();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bib)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localben.uob = ((bib)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3818897014784L, 28453);
        return 0;
      case 13: 
        localben.mDD = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3818897014784L, 28453);
        return 0;
      case 14: 
        localben.ujv = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3818897014784L, 28453);
        return 0;
      case 15: 
        localben.tLN = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3818897014784L, 28453);
        return 0;
      }
      localben.uwy = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3818897014784L, 28453);
      return 0;
    }
    GMTrace.o(3818897014784L, 28453);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ben.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */