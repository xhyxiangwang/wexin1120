package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bc
  extends axc
{
  public String bssid;
  public int cyK;
  public String hNw;
  public int scene;
  public String ssid;
  public String tuB;
  public int tuK;
  public bb tuL;
  public be tuM;
  public int tuN;
  public String tuw;
  public long tux;
  public int tuz;
  public int type;
  
  public bc()
  {
    GMTrace.i(3795408912384L, 28278);
    GMTrace.o(3795408912384L, 28278);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3795543130112L, 28279);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.hNw != null) {
        paramVarArgs.e(2, this.hNw);
      }
      paramVarArgs.fd(3, this.scene);
      paramVarArgs.fd(4, this.type);
      paramVarArgs.fd(5, this.tuK);
      if (this.ssid != null) {
        paramVarArgs.e(6, this.ssid);
      }
      if (this.bssid != null) {
        paramVarArgs.e(7, this.bssid);
      }
      paramVarArgs.R(8, this.tux);
      if (this.tuL != null)
      {
        paramVarArgs.ff(9, this.tuL.aWM());
        this.tuL.a(paramVarArgs);
      }
      if (this.tuM != null)
      {
        paramVarArgs.ff(10, this.tuM.aWM());
        this.tuM.a(paramVarArgs);
      }
      paramVarArgs.fd(11, this.tuz);
      if (this.tuw != null) {
        paramVarArgs.e(12, this.tuw);
      }
      paramVarArgs.fd(13, this.cyK);
      if (this.tuB != null) {
        paramVarArgs.e(14, this.tuB);
      }
      paramVarArgs.fd(15, this.tuN);
      GMTrace.o(3795543130112L, 28279);
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
      if (this.hNw != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.hNw);
      }
      i = i + b.a.a.a.fa(3, this.scene) + b.a.a.a.fa(4, this.type) + b.a.a.a.fa(5, this.tuK);
      paramInt = i;
      if (this.ssid != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.ssid);
      }
      i = paramInt;
      if (this.bssid != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.bssid);
      }
      i += b.a.a.a.Q(8, this.tux);
      paramInt = i;
      if (this.tuL != null) {
        paramInt = i + b.a.a.a.fc(9, this.tuL.aWM());
      }
      i = paramInt;
      if (this.tuM != null) {
        i = paramInt + b.a.a.a.fc(10, this.tuM.aWM());
      }
      i += b.a.a.a.fa(11, this.tuz);
      paramInt = i;
      if (this.tuw != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.tuw);
      }
      i = paramInt + b.a.a.a.fa(13, this.cyK);
      paramInt = i;
      if (this.tuB != null) {
        paramInt = i + b.a.a.b.b.a.f(14, this.tuB);
      }
      i = b.a.a.a.fa(15, this.tuN);
      GMTrace.o(3795543130112L, 28279);
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
      GMTrace.o(3795543130112L, 28279);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bc localbc = (bc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3795543130112L, 28279);
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
          localbc.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3795543130112L, 28279);
        return 0;
      case 2: 
        localbc.hNw = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3795543130112L, 28279);
        return 0;
      case 3: 
        localbc.scene = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3795543130112L, 28279);
        return 0;
      case 4: 
        localbc.type = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3795543130112L, 28279);
        return 0;
      case 5: 
        localbc.tuK = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3795543130112L, 28279);
        return 0;
      case 6: 
        localbc.ssid = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3795543130112L, 28279);
        return 0;
      case 7: 
        localbc.bssid = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3795543130112L, 28279);
        return 0;
      case 8: 
        localbc.tux = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3795543130112L, 28279);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bb();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localbc.tuL = ((bb)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3795543130112L, 28279);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new be();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((be)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localbc.tuM = ((be)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3795543130112L, 28279);
        return 0;
      case 11: 
        localbc.tuz = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3795543130112L, 28279);
        return 0;
      case 12: 
        localbc.tuw = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3795543130112L, 28279);
        return 0;
      case 13: 
        localbc.cyK = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3795543130112L, 28279);
        return 0;
      case 14: 
        localbc.tuB = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3795543130112L, 28279);
        return 0;
      }
      localbc.tuN = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3795543130112L, 28279);
      return 0;
    }
    GMTrace.o(3795543130112L, 28279);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */