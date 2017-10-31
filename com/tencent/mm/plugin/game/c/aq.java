package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.axk;
import com.tencent.mm.protocal.c.eo;
import java.util.LinkedList;

public final class aq
  extends axk
{
  public bo mFe;
  public LinkedList<b> mFf;
  public boolean mFg;
  public int mFh;
  
  public aq()
  {
    GMTrace.i(12645860114432L, 94219);
    this.mFf = new LinkedList();
    GMTrace.o(12645860114432L, 94219);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12645994332160L, 94220);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urV == null) {
        throw new b.a.a.b("Not all required fields were included: BaseResponse");
      }
      if (this.urV != null)
      {
        paramVarArgs.ff(1, this.urV.aWM());
        this.urV.a(paramVarArgs);
      }
      if (this.mFe != null)
      {
        paramVarArgs.ff(2, this.mFe.aWM());
        this.mFe.a(paramVarArgs);
      }
      paramVarArgs.d(3, 8, this.mFf);
      paramVarArgs.af(4, this.mFg);
      paramVarArgs.fd(5, this.mFh);
      GMTrace.o(12645994332160L, 94220);
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
      if (this.mFe != null) {
        i = paramInt + b.a.a.a.fc(2, this.mFe.aWM());
      }
      paramInt = b.a.a.a.c(3, 8, this.mFf);
      int j = b.a.a.b.b.a.cK(4);
      int k = b.a.a.a.fa(5, this.mFh);
      GMTrace.o(12645994332160L, 94220);
      return i + paramInt + (j + 1) + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.mFf.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b.a.a.b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(12645994332160L, 94220);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aq localaq = (aq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(12645994332160L, 94220);
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
          localaq.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12645994332160L, 94220);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localaq.mFe = ((bo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12645994332160L, 94220);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new b();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((b)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localaq.mFf.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(12645994332160L, 94220);
        return 0;
      case 4: 
        localaq.mFg = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(12645994332160L, 94220);
        return 0;
      }
      localaq.mFh = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(12645994332160L, 94220);
      return 0;
    }
    GMTrace.o(12645994332160L, 94220);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */