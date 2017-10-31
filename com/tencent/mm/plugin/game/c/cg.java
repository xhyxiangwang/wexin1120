package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.axk;
import com.tencent.mm.protocal.c.eo;
import java.util.LinkedList;

public final class cg
  extends axk
{
  public String fuw;
  public boolean mCQ;
  public String mDl;
  public i mGy;
  
  public cg()
  {
    GMTrace.i(12637270179840L, 94155);
    GMTrace.o(12637270179840L, 94155);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12637404397568L, 94156);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.fuw == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.mDl == null) {
        throw new b("Not all required fields were included: Message");
      }
      if (this.urV != null)
      {
        paramVarArgs.ff(1, this.urV.aWM());
        this.urV.a(paramVarArgs);
      }
      paramVarArgs.af(2, this.mCQ);
      if (this.fuw != null) {
        paramVarArgs.e(3, this.fuw);
      }
      if (this.mDl != null) {
        paramVarArgs.e(4, this.mDl);
      }
      if (this.mGy != null)
      {
        paramVarArgs.ff(5, this.mGy.aWM());
        this.mGy.a(paramVarArgs);
      }
      GMTrace.o(12637404397568L, 94156);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt + (b.a.a.b.b.a.cK(2) + 1);
      paramInt = i;
      if (this.fuw != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.fuw);
      }
      i = paramInt;
      if (this.mDl != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.mDl);
      }
      paramInt = i;
      if (this.mGy != null) {
        paramInt = i + b.a.a.a.fc(5, this.mGy.aWM());
      }
      GMTrace.o(12637404397568L, 94156);
      return paramInt;
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
      if (this.fuw == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.mDl == null) {
        throw new b("Not all required fields were included: Message");
      }
      GMTrace.o(12637404397568L, 94156);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      cg localcg = (cg)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(12637404397568L, 94156);
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
          localcg.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12637404397568L, 94156);
        return 0;
      case 2: 
        localcg.mCQ = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(12637404397568L, 94156);
        return 0;
      case 3: 
        localcg.fuw = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12637404397568L, 94156);
        return 0;
      case 4: 
        localcg.mDl = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12637404397568L, 94156);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new i();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((i)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
        localcg.mGy = ((i)localObject1);
        paramInt += 1;
      }
      GMTrace.o(12637404397568L, 94156);
      return 0;
    }
    GMTrace.o(12637404397568L, 94156);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/cg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */