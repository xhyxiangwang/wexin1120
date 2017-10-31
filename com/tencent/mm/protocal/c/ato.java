package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ato
  extends axc
{
  public int tNa;
  public long uoM;
  public axt upc;
  public axt upd;
  public axt upe;
  public int upf;
  
  public ato()
  {
    GMTrace.i(3847888044032L, 28669);
    GMTrace.o(3847888044032L, 28669);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3848022261760L, 28670);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.upc == null) {
        throw new b("Not all required fields were included: ClientReport");
      }
      if (this.upd == null) {
        throw new b("Not all required fields were included: ChannelReport");
      }
      if (this.upe == null) {
        throw new b("Not all required fields were included: EngineReport");
      }
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.upc != null)
      {
        paramVarArgs.ff(2, this.upc.aWM());
        this.upc.a(paramVarArgs);
      }
      if (this.upd != null)
      {
        paramVarArgs.ff(3, this.upd.aWM());
        this.upd.a(paramVarArgs);
      }
      if (this.upe != null)
      {
        paramVarArgs.ff(4, this.upe.aWM());
        this.upe.a(paramVarArgs);
      }
      paramVarArgs.fd(5, this.tNa);
      paramVarArgs.R(6, this.uoM);
      paramVarArgs.fd(7, this.upf);
      GMTrace.o(3848022261760L, 28670);
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
      if (this.upc != null) {
        paramInt = i + b.a.a.a.fc(2, this.upc.aWM());
      }
      i = paramInt;
      if (this.upd != null) {
        i = paramInt + b.a.a.a.fc(3, this.upd.aWM());
      }
      paramInt = i;
      if (this.upe != null) {
        paramInt = i + b.a.a.a.fc(4, this.upe.aWM());
      }
      i = b.a.a.a.fa(5, this.tNa);
      int j = b.a.a.a.Q(6, this.uoM);
      int k = b.a.a.a.fa(7, this.upf);
      GMTrace.o(3848022261760L, 28670);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.upc == null) {
        throw new b("Not all required fields were included: ClientReport");
      }
      if (this.upd == null) {
        throw new b("Not all required fields were included: ChannelReport");
      }
      if (this.upe == null) {
        throw new b("Not all required fields were included: EngineReport");
      }
      GMTrace.o(3848022261760L, 28670);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ato localato = (ato)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3848022261760L, 28670);
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
          localato.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3848022261760L, 28670);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axt();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localato.upc = ((axt)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3848022261760L, 28670);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axt();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localato.upd = ((axt)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3848022261760L, 28670);
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
          localato.upe = ((axt)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3848022261760L, 28670);
        return 0;
      case 5: 
        localato.tNa = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3848022261760L, 28670);
        return 0;
      case 6: 
        localato.uoM = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3848022261760L, 28670);
        return 0;
      }
      localato.upf = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3848022261760L, 28670);
      return 0;
    }
    GMTrace.o(3848022261760L, 28670);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ato.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */