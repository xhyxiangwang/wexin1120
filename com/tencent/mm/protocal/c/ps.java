package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ps
  extends axc
{
  public String amo;
  public String fIW;
  public String fKY;
  public int scene;
  public String url;
  
  public ps()
  {
    GMTrace.i(17615808364544L, 131248);
    GMTrace.o(17615808364544L, 131248);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17615942582272L, 131249);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.amo != null) {
        paramVarArgs.e(2, this.amo);
      }
      if (this.fKY != null) {
        paramVarArgs.e(3, this.fKY);
      }
      if (this.fIW != null) {
        paramVarArgs.e(4, this.fIW);
      }
      paramVarArgs.fd(5, this.scene);
      if (this.url != null) {
        paramVarArgs.e(6, this.url);
      }
      GMTrace.o(17615942582272L, 131249);
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
      if (this.amo != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.amo);
      }
      i = paramInt;
      if (this.fKY != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.fKY);
      }
      paramInt = i;
      if (this.fIW != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.fIW);
      }
      i = paramInt + b.a.a.a.fa(5, this.scene);
      paramInt = i;
      if (this.url != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.url);
      }
      GMTrace.o(17615942582272L, 131249);
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
      GMTrace.o(17615942582272L, 131249);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ps localps = (ps)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(17615942582272L, 131249);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new en();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((en)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localps.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17615942582272L, 131249);
        return 0;
      case 2: 
        localps.amo = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(17615942582272L, 131249);
        return 0;
      case 3: 
        localps.fKY = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(17615942582272L, 131249);
        return 0;
      case 4: 
        localps.fIW = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(17615942582272L, 131249);
        return 0;
      case 5: 
        localps.scene = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(17615942582272L, 131249);
        return 0;
      }
      localps.url = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(17615942582272L, 131249);
      return 0;
    }
    GMTrace.o(17615942582272L, 131249);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ps.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */