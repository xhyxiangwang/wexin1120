package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class eh
  extends com.tencent.mm.bl.a
{
  public int jXP;
  public int tvn;
  public axt tvo;
  public axt tvp;
  public axt tvq;
  public String tvt;
  public long tvv;
  public String twf;
  public int tyo;
  public int typ;
  public int tyq;
  public LinkedList<axt> tyr;
  public LinkedList<axu> tys;
  public axs tyt;
  public int tyu;
  public int tyv;
  public int tyw;
  public long tyx;
  public int tyy;
  
  public eh()
  {
    GMTrace.i(3841177157632L, 28619);
    this.tyr = new LinkedList();
    this.tys = new LinkedList();
    GMTrace.o(3841177157632L, 28619);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3841311375360L, 28620);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tvo == null) {
        throw new b("Not all required fields were included: FromUserName");
      }
      if (this.tvp == null) {
        throw new b("Not all required fields were included: ToUserName");
      }
      if (this.tvq == null) {
        throw new b("Not all required fields were included: Content");
      }
      paramVarArgs.fd(1, this.jXP);
      if (this.twf != null) {
        paramVarArgs.e(2, this.twf);
      }
      if (this.tvo != null)
      {
        paramVarArgs.ff(3, this.tvo.aWM());
        this.tvo.a(paramVarArgs);
      }
      if (this.tvp != null)
      {
        paramVarArgs.ff(4, this.tvp.aWM());
        this.tvp.a(paramVarArgs);
      }
      if (this.tvq != null)
      {
        paramVarArgs.ff(5, this.tvq.aWM());
        this.tvq.a(paramVarArgs);
      }
      paramVarArgs.fd(6, this.tyo);
      paramVarArgs.fd(7, this.typ);
      if (this.tvt != null) {
        paramVarArgs.e(8, this.tvt);
      }
      paramVarArgs.fd(9, this.tvn);
      paramVarArgs.fd(10, this.tyq);
      paramVarArgs.d(11, 8, this.tyr);
      paramVarArgs.d(12, 8, this.tys);
      if (this.tyt != null)
      {
        paramVarArgs.ff(13, this.tyt.aWM());
        this.tyt.a(paramVarArgs);
      }
      paramVarArgs.fd(14, this.tyu);
      paramVarArgs.fd(15, this.tyv);
      paramVarArgs.R(16, this.tvv);
      paramVarArgs.fd(17, this.tyw);
      paramVarArgs.R(18, this.tyx);
      paramVarArgs.fd(19, this.tyy);
      GMTrace.o(3841311375360L, 28620);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fa(1, this.jXP) + 0;
      paramInt = i;
      if (this.twf != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.twf);
      }
      i = paramInt;
      if (this.tvo != null) {
        i = paramInt + b.a.a.a.fc(3, this.tvo.aWM());
      }
      paramInt = i;
      if (this.tvp != null) {
        paramInt = i + b.a.a.a.fc(4, this.tvp.aWM());
      }
      i = paramInt;
      if (this.tvq != null) {
        i = paramInt + b.a.a.a.fc(5, this.tvq.aWM());
      }
      i = i + b.a.a.a.fa(6, this.tyo) + b.a.a.a.fa(7, this.typ);
      paramInt = i;
      if (this.tvt != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tvt);
      }
      i = paramInt + b.a.a.a.fa(9, this.tvn) + b.a.a.a.fa(10, this.tyq) + b.a.a.a.c(11, 8, this.tyr) + b.a.a.a.c(12, 8, this.tys);
      paramInt = i;
      if (this.tyt != null) {
        paramInt = i + b.a.a.a.fc(13, this.tyt.aWM());
      }
      i = b.a.a.a.fa(14, this.tyu);
      int j = b.a.a.a.fa(15, this.tyv);
      int k = b.a.a.a.Q(16, this.tvv);
      int m = b.a.a.a.fa(17, this.tyw);
      int n = b.a.a.a.Q(18, this.tyx);
      int i1 = b.a.a.a.fa(19, this.tyy);
      GMTrace.o(3841311375360L, 28620);
      return paramInt + i + j + k + m + n + i1;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tyr.clear();
      this.tys.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.tvo == null) {
        throw new b("Not all required fields were included: FromUserName");
      }
      if (this.tvp == null) {
        throw new b("Not all required fields were included: ToUserName");
      }
      if (this.tvq == null) {
        throw new b("Not all required fields were included: Content");
      }
      GMTrace.o(3841311375360L, 28620);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      eh localeh = (eh)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3841311375360L, 28620);
        return -1;
      case 1: 
        localeh.jXP = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 2: 
        localeh.twf = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3841311375360L, 28620);
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
          for (bool = true; bool; bool = ((axt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localeh.tvo = ((axt)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3841311375360L, 28620);
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
          for (bool = true; bool; bool = ((axt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localeh.tvp = ((axt)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axt();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localeh.tvq = ((axt)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 6: 
        localeh.tyo = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 7: 
        localeh.typ = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 8: 
        localeh.tvt = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 9: 
        localeh.tvn = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 10: 
        localeh.tyq = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 11: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axt();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localeh.tyr.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 12: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axu();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axu)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localeh.tys.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 13: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localeh.tyt = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 14: 
        localeh.tyu = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 15: 
        localeh.tyv = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 16: 
        localeh.tvv = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 17: 
        localeh.tyw = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 18: 
        localeh.tyx = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3841311375360L, 28620);
        return 0;
      }
      localeh.tyy = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3841311375360L, 28620);
      return 0;
    }
    GMTrace.o(3841311375360L, 28620);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/eh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */