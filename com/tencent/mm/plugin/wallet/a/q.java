package com.tencent.mm.plugin.wallet.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.b;
import java.util.LinkedList;

public final class q
  extends com.tencent.mm.bl.a
{
  public String org;
  public String rFL;
  public String rFM;
  public String rFN;
  public int rGA;
  public long rGB;
  public String rGC;
  public String rGD;
  public String rGE;
  public double rGF;
  public double rGG;
  public int rGH;
  public String rGI;
  public String rGJ;
  public LinkedList<b> rGK;
  public int rGz;
  
  public q()
  {
    GMTrace.i(7698997313536L, 57362);
    this.rGK = new LinkedList();
    GMTrace.o(7698997313536L, 57362);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(7699131531264L, 57363);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.rGz);
      paramVarArgs.fd(2, this.rGA);
      paramVarArgs.R(3, this.rGB);
      if (this.rGC != null) {
        paramVarArgs.e(4, this.rGC);
      }
      if (this.rFL != null) {
        paramVarArgs.e(5, this.rFL);
      }
      if (this.rGD != null) {
        paramVarArgs.e(6, this.rGD);
      }
      if (this.rGE != null) {
        paramVarArgs.e(7, this.rGE);
      }
      if (this.rFM != null) {
        paramVarArgs.e(8, this.rFM);
      }
      if (this.rFN != null) {
        paramVarArgs.e(9, this.rFN);
      }
      paramVarArgs.a(10, this.rGF);
      paramVarArgs.a(11, this.rGG);
      paramVarArgs.fd(12, this.rGH);
      if (this.rGI != null) {
        paramVarArgs.e(13, this.rGI);
      }
      if (this.org != null) {
        paramVarArgs.e(14, this.org);
      }
      if (this.rGJ != null) {
        paramVarArgs.e(16, this.rGJ);
      }
      paramVarArgs.d(17, 6, this.rGK);
      GMTrace.o(7699131531264L, 57363);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.rGz) + 0 + b.a.a.a.fa(2, this.rGA) + b.a.a.a.Q(3, this.rGB);
      paramInt = i;
      if (this.rGC != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.rGC);
      }
      i = paramInt;
      if (this.rFL != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.rFL);
      }
      paramInt = i;
      if (this.rGD != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.rGD);
      }
      i = paramInt;
      if (this.rGE != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.rGE);
      }
      paramInt = i;
      if (this.rFM != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.rFM);
      }
      i = paramInt;
      if (this.rFN != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.rFN);
      }
      i = i + (b.a.a.b.b.a.cK(10) + 8) + (b.a.a.b.b.a.cK(11) + 8) + b.a.a.a.fa(12, this.rGH);
      paramInt = i;
      if (this.rGI != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.rGI);
      }
      i = paramInt;
      if (this.org != null) {
        i = paramInt + b.a.a.b.b.a.f(14, this.org);
      }
      paramInt = i;
      if (this.rGJ != null) {
        paramInt = i + b.a.a.b.b.a.f(16, this.rGJ);
      }
      i = b.a.a.a.c(17, 6, this.rGK);
      GMTrace.o(7699131531264L, 57363);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.rGK.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(7699131531264L, 57363);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      q localq = (q)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      case 15: 
      default: 
        GMTrace.o(7699131531264L, 57363);
        return -1;
      case 1: 
        localq.rGz = locala.xSv.nm();
        GMTrace.o(7699131531264L, 57363);
        return 0;
      case 2: 
        localq.rGA = locala.xSv.nm();
        GMTrace.o(7699131531264L, 57363);
        return 0;
      case 3: 
        localq.rGB = locala.xSv.nn();
        GMTrace.o(7699131531264L, 57363);
        return 0;
      case 4: 
        localq.rGC = locala.xSv.readString();
        GMTrace.o(7699131531264L, 57363);
        return 0;
      case 5: 
        localq.rFL = locala.xSv.readString();
        GMTrace.o(7699131531264L, 57363);
        return 0;
      case 6: 
        localq.rGD = locala.xSv.readString();
        GMTrace.o(7699131531264L, 57363);
        return 0;
      case 7: 
        localq.rGE = locala.xSv.readString();
        GMTrace.o(7699131531264L, 57363);
        return 0;
      case 8: 
        localq.rFM = locala.xSv.readString();
        GMTrace.o(7699131531264L, 57363);
        return 0;
      case 9: 
        localq.rFN = locala.xSv.readString();
        GMTrace.o(7699131531264L, 57363);
        return 0;
      case 10: 
        localq.rGF = locala.xSv.readDouble();
        GMTrace.o(7699131531264L, 57363);
        return 0;
      case 11: 
        localq.rGG = locala.xSv.readDouble();
        GMTrace.o(7699131531264L, 57363);
        return 0;
      case 12: 
        localq.rGH = locala.xSv.nm();
        GMTrace.o(7699131531264L, 57363);
        return 0;
      case 13: 
        localq.rGI = locala.xSv.readString();
        GMTrace.o(7699131531264L, 57363);
        return 0;
      case 14: 
        localq.org = locala.xSv.readString();
        GMTrace.o(7699131531264L, 57363);
        return 0;
      case 16: 
        localq.rGJ = locala.xSv.readString();
        GMTrace.o(7699131531264L, 57363);
        return 0;
      }
      localq.rGK.add(locala.cpI());
      GMTrace.o(7699131531264L, 57363);
      return 0;
    }
    GMTrace.o(7699131531264L, 57363);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/a/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */