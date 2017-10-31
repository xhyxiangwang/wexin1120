package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class cc
  extends com.tencent.mm.bl.a
{
  public String mEm;
  public dl tvJ;
  public LinkedList<afk> tvK;
  
  public cc()
  {
    GMTrace.i(4015123333120L, 29915);
    this.tvK = new LinkedList();
    GMTrace.o(4015123333120L, 29915);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4015257550848L, 29916);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tvJ == null) {
        throw new b("Not all required fields were included: ArtisAuthor");
      }
      if (this.tvJ != null)
      {
        paramVarArgs.ff(1, this.tvJ.aWM());
        this.tvJ.a(paramVarArgs);
      }
      paramVarArgs.d(2, 8, this.tvK);
      if (this.mEm != null) {
        paramVarArgs.e(3, this.mEm);
      }
      GMTrace.o(4015257550848L, 29916);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.tvJ != null) {
        paramInt = b.a.a.a.fc(1, this.tvJ.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 8, this.tvK);
      paramInt = i;
      if (this.mEm != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.mEm);
      }
      GMTrace.o(4015257550848L, 29916);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tvK.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.tvJ == null) {
        throw new b("Not all required fields were included: ArtisAuthor");
      }
      GMTrace.o(4015257550848L, 29916);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      cc localcc = (cc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4015257550848L, 29916);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new dl();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((dl)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localcc.tvJ = ((dl)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4015257550848L, 29916);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new afk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((afk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localcc.tvK.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4015257550848L, 29916);
        return 0;
      }
      localcc.mEm = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(4015257550848L, 29916);
      return 0;
    }
    GMTrace.o(4015257550848L, 29916);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/cc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */