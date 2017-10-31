package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class amo
  extends com.tencent.mm.bl.a
{
  public String fMh;
  public int fQZ;
  public String fwy;
  public int hkI;
  public String tLD;
  public String token;
  public String tvh;
  public int uhC;
  public int uhW;
  public int uhX;
  public LinkedList<aku> uhY;
  public LinkedList<bes> uhZ;
  public int uia;
  public long uib;
  public int uic;
  public LinkedList<Long> uie;
  public int uif;
  public int uig;
  public String uih;
  public int uii;
  public LinkedList<axt> uij;
  public bdu uik;
  public LinkedList<bea> uil;
  public String uim;
  public long uio;
  public String uip;
  public boolean uiq;
  public bcv uir;
  
  public amo()
  {
    GMTrace.i(3699443236864L, 27563);
    this.uhY = new LinkedList();
    this.uhZ = new LinkedList();
    this.uie = new LinkedList();
    this.uij = new LinkedList();
    this.uil = new LinkedList();
    GMTrace.o(3699443236864L, 27563);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3699577454592L, 27564);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.uhW);
      paramVarArgs.fd(2, this.uhX);
      paramVarArgs.fd(3, this.uhC);
      if (this.tvh != null) {
        paramVarArgs.e(4, this.tvh);
      }
      paramVarArgs.d(5, 8, this.uhY);
      paramVarArgs.d(6, 8, this.uhZ);
      paramVarArgs.fd(7, this.uia);
      paramVarArgs.fd(8, this.hkI);
      paramVarArgs.R(9, this.uib);
      paramVarArgs.fd(10, this.uic);
      paramVarArgs.d(11, 3, this.uie);
      paramVarArgs.fd(12, this.uif);
      paramVarArgs.fd(13, this.uig);
      if (this.token != null) {
        paramVarArgs.e(14, this.token);
      }
      if (this.uih != null) {
        paramVarArgs.e(15, this.uih);
      }
      paramVarArgs.fd(16, this.uii);
      paramVarArgs.d(17, 8, this.uij);
      if (this.uik != null)
      {
        paramVarArgs.ff(18, this.uik.aWM());
        this.uik.a(paramVarArgs);
      }
      if (this.fMh != null) {
        paramVarArgs.e(19, this.fMh);
      }
      paramVarArgs.d(20, 8, this.uil);
      if (this.fwy != null) {
        paramVarArgs.e(21, this.fwy);
      }
      if (this.uim != null) {
        paramVarArgs.e(22, this.uim);
      }
      if (this.tLD != null) {
        paramVarArgs.e(23, this.tLD);
      }
      paramVarArgs.fd(24, this.fQZ);
      paramVarArgs.R(25, this.uio);
      if (this.uip != null) {
        paramVarArgs.e(26, this.uip);
      }
      paramVarArgs.af(27, this.uiq);
      if (this.uir != null)
      {
        paramVarArgs.ff(28, this.uir.aWM());
        this.uir.a(paramVarArgs);
      }
      GMTrace.o(3699577454592L, 27564);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fa(1, this.uhW) + 0 + b.a.a.a.fa(2, this.uhX) + b.a.a.a.fa(3, this.uhC);
      paramInt = i;
      if (this.tvh != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tvh);
      }
      i = paramInt + b.a.a.a.c(5, 8, this.uhY) + b.a.a.a.c(6, 8, this.uhZ) + b.a.a.a.fa(7, this.uia) + b.a.a.a.fa(8, this.hkI) + b.a.a.a.Q(9, this.uib) + b.a.a.a.fa(10, this.uic) + b.a.a.a.c(11, 3, this.uie) + b.a.a.a.fa(12, this.uif) + b.a.a.a.fa(13, this.uig);
      paramInt = i;
      if (this.token != null) {
        paramInt = i + b.a.a.b.b.a.f(14, this.token);
      }
      i = paramInt;
      if (this.uih != null) {
        i = paramInt + b.a.a.b.b.a.f(15, this.uih);
      }
      i = i + b.a.a.a.fa(16, this.uii) + b.a.a.a.c(17, 8, this.uij);
      paramInt = i;
      if (this.uik != null) {
        paramInt = i + b.a.a.a.fc(18, this.uik.aWM());
      }
      i = paramInt;
      if (this.fMh != null) {
        i = paramInt + b.a.a.b.b.a.f(19, this.fMh);
      }
      i += b.a.a.a.c(20, 8, this.uil);
      paramInt = i;
      if (this.fwy != null) {
        paramInt = i + b.a.a.b.b.a.f(21, this.fwy);
      }
      i = paramInt;
      if (this.uim != null) {
        i = paramInt + b.a.a.b.b.a.f(22, this.uim);
      }
      paramInt = i;
      if (this.tLD != null) {
        paramInt = i + b.a.a.b.b.a.f(23, this.tLD);
      }
      i = paramInt + b.a.a.a.fa(24, this.fQZ) + b.a.a.a.Q(25, this.uio);
      paramInt = i;
      if (this.uip != null) {
        paramInt = i + b.a.a.b.b.a.f(26, this.uip);
      }
      i = paramInt + (b.a.a.b.b.a.cK(27) + 1);
      paramInt = i;
      if (this.uir != null) {
        paramInt = i + b.a.a.a.fc(28, this.uir.aWM());
      }
      GMTrace.o(3699577454592L, 27564);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uhY.clear();
      this.uhZ.clear();
      this.uie.clear();
      this.uij.clear();
      this.uil.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3699577454592L, 27564);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      amo localamo = (amo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3699577454592L, 27564);
        return -1;
      case 1: 
        localamo.uhW = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 2: 
        localamo.uhX = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 3: 
        localamo.uhC = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 4: 
        localamo.tvh = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aku();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aku)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localamo.uhY.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bes();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bes)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localamo.uhZ.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 7: 
        localamo.uia = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 8: 
        localamo.hkI = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 9: 
        localamo.uib = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 10: 
        localamo.uic = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 11: 
        localamo.uie.add(Long.valueOf(((b.a.a.a.a)localObject1).xSv.nn()));
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 12: 
        localamo.uif = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 13: 
        localamo.uig = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 14: 
        localamo.token = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 15: 
        localamo.uih = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 16: 
        localamo.uii = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 17: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axt();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localamo.uij.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 18: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bdu();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bdu)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localamo.uik = ((bdu)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 19: 
        localamo.fMh = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 20: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bea();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bea)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localamo.uil.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 21: 
        localamo.fwy = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 22: 
        localamo.uim = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 23: 
        localamo.tLD = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 24: 
        localamo.fQZ = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 25: 
        localamo.uio = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 26: 
        localamo.uip = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 27: 
        localamo.uiq = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bcv();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bcv)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localamo.uir = ((bcv)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3699577454592L, 27564);
      return 0;
    }
    GMTrace.o(3699577454592L, 27564);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/amo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */