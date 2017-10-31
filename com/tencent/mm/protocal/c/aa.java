package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aa
  extends axk
{
  public awf tsA;
  public bcd tsB;
  public aul tsC;
  public tv tsD;
  public dy tsE;
  public String tsF;
  public String tsG;
  public int tsH;
  public int tsp;
  public String tsv;
  public int tsw;
  public int tsx;
  public String tsy;
  public bcd tsz;
  
  public aa()
  {
    GMTrace.i(3748030054400L, 27925);
    GMTrace.o(3748030054400L, 27925);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3748164272128L, 27926);
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
      if (this.tsv != null) {
        paramVarArgs.e(2, this.tsv);
      }
      paramVarArgs.fd(3, this.tsw);
      paramVarArgs.fd(4, this.tsx);
      if (this.tsy != null) {
        paramVarArgs.e(5, this.tsy);
      }
      if (this.tsz != null)
      {
        paramVarArgs.ff(6, this.tsz.aWM());
        this.tsz.a(paramVarArgs);
      }
      paramVarArgs.fd(7, this.tsp);
      if (this.tsA != null)
      {
        paramVarArgs.ff(8, this.tsA.aWM());
        this.tsA.a(paramVarArgs);
      }
      if (this.tsB != null)
      {
        paramVarArgs.ff(9, this.tsB.aWM());
        this.tsB.a(paramVarArgs);
      }
      if (this.tsC != null)
      {
        paramVarArgs.ff(10, this.tsC.aWM());
        this.tsC.a(paramVarArgs);
      }
      if (this.tsD != null)
      {
        paramVarArgs.ff(11, this.tsD.aWM());
        this.tsD.a(paramVarArgs);
      }
      if (this.tsE != null)
      {
        paramVarArgs.ff(12, this.tsE.aWM());
        this.tsE.a(paramVarArgs);
      }
      if (this.tsF != null) {
        paramVarArgs.e(13, this.tsF);
      }
      if (this.tsG != null) {
        paramVarArgs.e(14, this.tsG);
      }
      paramVarArgs.fd(15, this.tsH);
      GMTrace.o(3748164272128L, 27926);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt;
      if (this.tsv != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.tsv);
      }
      i = i + b.a.a.a.fa(3, this.tsw) + b.a.a.a.fa(4, this.tsx);
      paramInt = i;
      if (this.tsy != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tsy);
      }
      i = paramInt;
      if (this.tsz != null) {
        i = paramInt + b.a.a.a.fc(6, this.tsz.aWM());
      }
      i += b.a.a.a.fa(7, this.tsp);
      paramInt = i;
      if (this.tsA != null) {
        paramInt = i + b.a.a.a.fc(8, this.tsA.aWM());
      }
      i = paramInt;
      if (this.tsB != null) {
        i = paramInt + b.a.a.a.fc(9, this.tsB.aWM());
      }
      paramInt = i;
      if (this.tsC != null) {
        paramInt = i + b.a.a.a.fc(10, this.tsC.aWM());
      }
      i = paramInt;
      if (this.tsD != null) {
        i = paramInt + b.a.a.a.fc(11, this.tsD.aWM());
      }
      paramInt = i;
      if (this.tsE != null) {
        paramInt = i + b.a.a.a.fc(12, this.tsE.aWM());
      }
      i = paramInt;
      if (this.tsF != null) {
        i = paramInt + b.a.a.b.b.a.f(13, this.tsF);
      }
      paramInt = i;
      if (this.tsG != null) {
        paramInt = i + b.a.a.b.b.a.f(14, this.tsG);
      }
      i = b.a.a.a.fa(15, this.tsH);
      GMTrace.o(3748164272128L, 27926);
      return paramInt + i;
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
      GMTrace.o(3748164272128L, 27926);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aa localaa = (aa)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3748164272128L, 27926);
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
          localaa.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3748164272128L, 27926);
        return 0;
      case 2: 
        localaa.tsv = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3748164272128L, 27926);
        return 0;
      case 3: 
        localaa.tsw = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3748164272128L, 27926);
        return 0;
      case 4: 
        localaa.tsx = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3748164272128L, 27926);
        return 0;
      case 5: 
        localaa.tsy = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3748164272128L, 27926);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bcd();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bcd)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localaa.tsz = ((bcd)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3748164272128L, 27926);
        return 0;
      case 7: 
        localaa.tsp = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3748164272128L, 27926);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new awf();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((awf)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localaa.tsA = ((awf)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3748164272128L, 27926);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bcd();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bcd)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localaa.tsB = ((bcd)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3748164272128L, 27926);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aul();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aul)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localaa.tsC = ((aul)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3748164272128L, 27926);
        return 0;
      case 11: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new tv();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((tv)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localaa.tsD = ((tv)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3748164272128L, 27926);
        return 0;
      case 12: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new dy();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((dy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localaa.tsE = ((dy)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3748164272128L, 27926);
        return 0;
      case 13: 
        localaa.tsF = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3748164272128L, 27926);
        return 0;
      case 14: 
        localaa.tsG = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3748164272128L, 27926);
        return 0;
      }
      localaa.tsH = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3748164272128L, 27926);
      return 0;
    }
    GMTrace.o(3748164272128L, 27926);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */