package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ye
  extends axk
{
  public String ID;
  public int jXP;
  public long jXk;
  public String tUZ;
  public int ttY;
  public axs txQ;
  public int tyc;
  public LinkedList<nh> tyd;
  public String tye;
  public String tyf;
  public String tyg;
  public int tyl;
  public String tym;
  public String tyn;
  
  public ye()
  {
    GMTrace.i(4027337146368L, 30006);
    this.tyd = new LinkedList();
    GMTrace.o(4027337146368L, 30006);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4027471364096L, 30007);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.txQ == null) {
        throw new b("Not all required fields were included: Key");
      }
      if (this.urV != null)
      {
        paramVarArgs.ff(1, this.urV.aWM());
        this.urV.a(paramVarArgs);
      }
      if (this.ID != null) {
        paramVarArgs.e(2, this.ID);
      }
      if (this.txQ != null)
      {
        paramVarArgs.ff(3, this.txQ.aWM());
        this.txQ.a(paramVarArgs);
      }
      if (this.tym != null) {
        paramVarArgs.e(4, this.tym);
      }
      if (this.tyn != null) {
        paramVarArgs.e(5, this.tyn);
      }
      paramVarArgs.fd(6, this.jXP);
      paramVarArgs.fd(7, this.tyc);
      paramVarArgs.d(8, 8, this.tyd);
      if (this.tUZ != null) {
        paramVarArgs.e(9, this.tUZ);
      }
      if (this.tye != null) {
        paramVarArgs.e(10, this.tye);
      }
      if (this.tyf != null) {
        paramVarArgs.e(11, this.tyf);
      }
      paramVarArgs.fd(12, this.tyl);
      paramVarArgs.fd(13, this.ttY);
      paramVarArgs.R(14, this.jXk);
      if (this.tyg != null) {
        paramVarArgs.e(15, this.tyg);
      }
      GMTrace.o(4027471364096L, 30007);
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
      if (this.ID != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ID);
      }
      i = paramInt;
      if (this.txQ != null) {
        i = paramInt + b.a.a.a.fc(3, this.txQ.aWM());
      }
      paramInt = i;
      if (this.tym != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tym);
      }
      i = paramInt;
      if (this.tyn != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tyn);
      }
      i = i + b.a.a.a.fa(6, this.jXP) + b.a.a.a.fa(7, this.tyc) + b.a.a.a.c(8, 8, this.tyd);
      paramInt = i;
      if (this.tUZ != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.tUZ);
      }
      i = paramInt;
      if (this.tye != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.tye);
      }
      paramInt = i;
      if (this.tyf != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.tyf);
      }
      i = paramInt + b.a.a.a.fa(12, this.tyl) + b.a.a.a.fa(13, this.ttY) + b.a.a.a.Q(14, this.jXk);
      paramInt = i;
      if (this.tyg != null) {
        paramInt = i + b.a.a.b.b.a.f(15, this.tyg);
      }
      GMTrace.o(4027471364096L, 30007);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tyd.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.txQ == null) {
        throw new b("Not all required fields were included: Key");
      }
      GMTrace.o(4027471364096L, 30007);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ye localye = (ye)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4027471364096L, 30007);
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
          localye.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4027471364096L, 30007);
        return 0;
      case 2: 
        localye.ID = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(4027471364096L, 30007);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localye.txQ = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4027471364096L, 30007);
        return 0;
      case 4: 
        localye.tym = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(4027471364096L, 30007);
        return 0;
      case 5: 
        localye.tyn = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(4027471364096L, 30007);
        return 0;
      case 6: 
        localye.jXP = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4027471364096L, 30007);
        return 0;
      case 7: 
        localye.tyc = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4027471364096L, 30007);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new nh();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((nh)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localye.tyd.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4027471364096L, 30007);
        return 0;
      case 9: 
        localye.tUZ = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(4027471364096L, 30007);
        return 0;
      case 10: 
        localye.tye = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(4027471364096L, 30007);
        return 0;
      case 11: 
        localye.tyf = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(4027471364096L, 30007);
        return 0;
      case 12: 
        localye.tyl = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4027471364096L, 30007);
        return 0;
      case 13: 
        localye.ttY = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4027471364096L, 30007);
        return 0;
      case 14: 
        localye.jXk = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(4027471364096L, 30007);
        return 0;
      }
      localye.tyg = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(4027471364096L, 30007);
      return 0;
    }
    GMTrace.o(4027471364096L, 30007);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ye.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */