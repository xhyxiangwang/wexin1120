package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bdv
  extends axc
{
  public String tvh;
  public axs uft;
  public int uhX;
  public LinkedList<bdf> uie;
  public LinkedList<axt> uij;
  public bdu uik;
  public int ukL;
  public bib uob;
  public int uvM;
  public int uvN;
  public int uvO;
  public bdt uvP;
  public axs uvQ;
  public String uvR;
  public jc uvS;
  public int uvT;
  public LinkedList<aml> uvU;
  public bcv uvV;
  public axs uve;
  public int uvn;
  public LinkedList<axt> uvo;
  public long uvr;
  public int uvs;
  public LinkedList<axt> uvt;
  public int uvu;
  public bdz uvw;
  
  public bdv()
  {
    GMTrace.i(3949759299584L, 29428);
    this.uvo = new LinkedList();
    this.uie = new LinkedList();
    this.uvt = new LinkedList();
    this.uij = new LinkedList();
    this.uvU = new LinkedList();
    GMTrace.o(3949759299584L, 29428);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3949893517312L, 29429);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uve == null) {
        throw new b("Not all required fields were included: ObjectDesc");
      }
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.uve != null)
      {
        paramVarArgs.ff(2, this.uve.aWM());
        this.uve.a(paramVarArgs);
      }
      paramVarArgs.fd(3, this.uvn);
      paramVarArgs.d(4, 8, this.uvo);
      paramVarArgs.fd(5, this.uvM);
      paramVarArgs.fd(6, this.uhX);
      if (this.tvh != null) {
        paramVarArgs.e(7, this.tvh);
      }
      paramVarArgs.fd(8, this.uvN);
      paramVarArgs.fd(9, this.ukL);
      paramVarArgs.d(10, 8, this.uie);
      paramVarArgs.fd(11, this.uvO);
      paramVarArgs.R(12, this.uvr);
      paramVarArgs.fd(13, this.uvs);
      paramVarArgs.d(14, 8, this.uvt);
      if (this.uob != null)
      {
        paramVarArgs.ff(15, this.uob.aWM());
        this.uob.a(paramVarArgs);
      }
      paramVarArgs.fd(16, this.uvu);
      paramVarArgs.d(17, 8, this.uij);
      if (this.uvP != null)
      {
        paramVarArgs.ff(18, this.uvP.aWM());
        this.uvP.a(paramVarArgs);
      }
      if (this.uik != null)
      {
        paramVarArgs.ff(19, this.uik.aWM());
        this.uik.a(paramVarArgs);
      }
      if (this.uvw != null)
      {
        paramVarArgs.ff(20, this.uvw.aWM());
        this.uvw.a(paramVarArgs);
      }
      if (this.uvQ != null)
      {
        paramVarArgs.ff(21, this.uvQ.aWM());
        this.uvQ.a(paramVarArgs);
      }
      if (this.uvR != null) {
        paramVarArgs.e(22, this.uvR);
      }
      if (this.uvS != null)
      {
        paramVarArgs.ff(23, this.uvS.aWM());
        this.uvS.a(paramVarArgs);
      }
      paramVarArgs.fd(24, this.uvT);
      paramVarArgs.d(25, 8, this.uvU);
      if (this.uvV != null)
      {
        paramVarArgs.ff(26, this.uvV.aWM());
        this.uvV.a(paramVarArgs);
      }
      if (this.uft != null)
      {
        paramVarArgs.ff(27, this.uft.aWM());
        this.uft.a(paramVarArgs);
      }
      GMTrace.o(3949893517312L, 29429);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt;
      if (this.uve != null) {
        i = paramInt + b.a.a.a.fc(2, this.uve.aWM());
      }
      i = i + b.a.a.a.fa(3, this.uvn) + b.a.a.a.c(4, 8, this.uvo) + b.a.a.a.fa(5, this.uvM) + b.a.a.a.fa(6, this.uhX);
      paramInt = i;
      if (this.tvh != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.tvh);
      }
      i = paramInt + b.a.a.a.fa(8, this.uvN) + b.a.a.a.fa(9, this.ukL) + b.a.a.a.c(10, 8, this.uie) + b.a.a.a.fa(11, this.uvO) + b.a.a.a.Q(12, this.uvr) + b.a.a.a.fa(13, this.uvs) + b.a.a.a.c(14, 8, this.uvt);
      paramInt = i;
      if (this.uob != null) {
        paramInt = i + b.a.a.a.fc(15, this.uob.aWM());
      }
      i = paramInt + b.a.a.a.fa(16, this.uvu) + b.a.a.a.c(17, 8, this.uij);
      paramInt = i;
      if (this.uvP != null) {
        paramInt = i + b.a.a.a.fc(18, this.uvP.aWM());
      }
      i = paramInt;
      if (this.uik != null) {
        i = paramInt + b.a.a.a.fc(19, this.uik.aWM());
      }
      paramInt = i;
      if (this.uvw != null) {
        paramInt = i + b.a.a.a.fc(20, this.uvw.aWM());
      }
      i = paramInt;
      if (this.uvQ != null) {
        i = paramInt + b.a.a.a.fc(21, this.uvQ.aWM());
      }
      paramInt = i;
      if (this.uvR != null) {
        paramInt = i + b.a.a.b.b.a.f(22, this.uvR);
      }
      i = paramInt;
      if (this.uvS != null) {
        i = paramInt + b.a.a.a.fc(23, this.uvS.aWM());
      }
      i = i + b.a.a.a.fa(24, this.uvT) + b.a.a.a.c(25, 8, this.uvU);
      paramInt = i;
      if (this.uvV != null) {
        paramInt = i + b.a.a.a.fc(26, this.uvV.aWM());
      }
      i = paramInt;
      if (this.uft != null) {
        i = paramInt + b.a.a.a.fc(27, this.uft.aWM());
      }
      GMTrace.o(3949893517312L, 29429);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uvo.clear();
      this.uie.clear();
      this.uvt.clear();
      this.uij.clear();
      this.uvU.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.uve == null) {
        throw new b("Not all required fields were included: ObjectDesc");
      }
      GMTrace.o(3949893517312L, 29429);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bdv localbdv = (bdv)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3949893517312L, 29429);
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
          localbdv.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localbdv.uve = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 3: 
        localbdv.uvn = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axt();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localbdv.uvo.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 5: 
        localbdv.uvM = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 6: 
        localbdv.uhX = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 7: 
        localbdv.tvh = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 8: 
        localbdv.uvN = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 9: 
        localbdv.ukL = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bdf();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bdf)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localbdv.uie.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 11: 
        localbdv.uvO = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 12: 
        localbdv.uvr = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 13: 
        localbdv.uvs = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 14: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axt();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localbdv.uvt.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 15: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bib();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bib)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localbdv.uob = ((bib)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 16: 
        localbdv.uvu = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3949893517312L, 29429);
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
          for (bool = true; bool; bool = ((axt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localbdv.uij.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 18: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bdt();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bdt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localbdv.uvP = ((bdt)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 19: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bdu();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bdu)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localbdv.uik = ((bdu)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 20: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bdz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bdz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localbdv.uvw = ((bdz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 21: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localbdv.uvQ = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 22: 
        localbdv.uvR = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 23: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new jc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((jc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localbdv.uvS = ((jc)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 24: 
        localbdv.uvT = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 25: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aml();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aml)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localbdv.uvU.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 26: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bcv();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bcv)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localbdv.uvV = ((bcv)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949893517312L, 29429);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new axs();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
        localbdv.uft = ((axs)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3949893517312L, 29429);
      return 0;
    }
    GMTrace.o(3949893517312L, 29429);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bdv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */