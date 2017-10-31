package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bcm
  extends axc
{
  public String tvh;
  public int twh;
  public axt uus;
  public bcu uut;
  public axt uuu;
  
  public bcm()
  {
    GMTrace.i(4046127628288L, 30146);
    GMTrace.o(4046127628288L, 30146);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4046261846016L, 30147);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uut == null) {
        throw new b("Not all required fields were included: Action");
      }
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.uut != null)
      {
        paramVarArgs.ff(2, this.uut.aWM());
        this.uut.a(paramVarArgs);
      }
      if (this.tvh != null) {
        paramVarArgs.e(3, this.tvh);
      }
      if (this.uus != null)
      {
        paramVarArgs.ff(4, this.uus.aWM());
        this.uus.a(paramVarArgs);
      }
      paramVarArgs.fd(5, this.twh);
      if (this.uuu != null)
      {
        paramVarArgs.ff(6, this.uuu.aWM());
        this.uuu.a(paramVarArgs);
      }
      GMTrace.o(4046261846016L, 30147);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.urE != null) {
        i = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      paramInt = i;
      if (this.uut != null) {
        paramInt = i + b.a.a.a.fc(2, this.uut.aWM());
      }
      i = paramInt;
      if (this.tvh != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tvh);
      }
      paramInt = i;
      if (this.uus != null) {
        paramInt = i + b.a.a.a.fc(4, this.uus.aWM());
      }
      i = paramInt + b.a.a.a.fa(5, this.twh);
      paramInt = i;
      if (this.uuu != null) {
        paramInt = i + b.a.a.a.fc(6, this.uuu.aWM());
      }
      GMTrace.o(4046261846016L, 30147);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.uut == null) {
        throw new b("Not all required fields were included: Action");
      }
      GMTrace.o(4046261846016L, 30147);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bcm localbcm = (bcm)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4046261846016L, 30147);
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
          localbcm.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4046261846016L, 30147);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bcu();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bcu)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localbcm.uut = ((bcu)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4046261846016L, 30147);
        return 0;
      case 3: 
        localbcm.tvh = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(4046261846016L, 30147);
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
          localbcm.uus = ((axt)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4046261846016L, 30147);
        return 0;
      case 5: 
        localbcm.twh = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4046261846016L, 30147);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new axt();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((axt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
        localbcm.uuu = ((axt)localObject1);
        paramInt += 1;
      }
      GMTrace.o(4046261846016L, 30147);
      return 0;
    }
    GMTrace.o(4046261846016L, 30147);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bcm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */