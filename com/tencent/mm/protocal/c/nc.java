package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class nc
  extends com.tencent.mm.bl.a
{
  public String kns;
  public String knt;
  public String oqo;
  public String tEL;
  public String tEM;
  public long tFX;
  public String tFY;
  public String tFZ;
  public afc tJw;
  public String title;
  public String url;
  
  public nc()
  {
    GMTrace.i(3766552100864L, 28063);
    GMTrace.o(3766552100864L, 28063);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3766686318592L, 28064);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.e(1, this.title);
      }
      if (this.kns != null) {
        paramVarArgs.e(2, this.kns);
      }
      if (this.knt != null) {
        paramVarArgs.e(3, this.knt);
      }
      if (this.url != null) {
        paramVarArgs.e(4, this.url);
      }
      paramVarArgs.R(5, this.tFX);
      if (this.tFY != null) {
        paramVarArgs.e(6, this.tFY);
      }
      if (this.tFZ != null) {
        paramVarArgs.e(7, this.tFZ);
      }
      if (this.oqo != null) {
        paramVarArgs.e(8, this.oqo);
      }
      if (this.tJw != null)
      {
        paramVarArgs.ff(9, this.tJw.aWM());
        this.tJw.a(paramVarArgs);
      }
      if (this.tEL != null) {
        paramVarArgs.e(10, this.tEL);
      }
      if (this.tEM != null) {
        paramVarArgs.e(11, this.tEM);
      }
      GMTrace.o(3766686318592L, 28064);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.title != null) {
        i = b.a.a.b.b.a.f(1, this.title) + 0;
      }
      paramInt = i;
      if (this.kns != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.kns);
      }
      i = paramInt;
      if (this.knt != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.knt);
      }
      paramInt = i;
      if (this.url != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.url);
      }
      i = paramInt + b.a.a.a.Q(5, this.tFX);
      paramInt = i;
      if (this.tFY != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tFY);
      }
      i = paramInt;
      if (this.tFZ != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.tFZ);
      }
      paramInt = i;
      if (this.oqo != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.oqo);
      }
      i = paramInt;
      if (this.tJw != null) {
        i = paramInt + b.a.a.a.fc(9, this.tJw.aWM());
      }
      paramInt = i;
      if (this.tEL != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.tEL);
      }
      i = paramInt;
      if (this.tEM != null) {
        i = paramInt + b.a.a.b.b.a.f(11, this.tEM);
      }
      GMTrace.o(3766686318592L, 28064);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3766686318592L, 28064);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      nc localnc = (nc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3766686318592L, 28064);
        return -1;
      case 1: 
        localnc.title = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3766686318592L, 28064);
        return 0;
      case 2: 
        localnc.kns = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3766686318592L, 28064);
        return 0;
      case 3: 
        localnc.knt = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3766686318592L, 28064);
        return 0;
      case 4: 
        localnc.url = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3766686318592L, 28064);
        return 0;
      case 5: 
        localnc.tFX = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3766686318592L, 28064);
        return 0;
      case 6: 
        localnc.tFY = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3766686318592L, 28064);
        return 0;
      case 7: 
        localnc.tFZ = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3766686318592L, 28064);
        return 0;
      case 8: 
        localnc.oqo = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3766686318592L, 28064);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new afc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((afc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localnc.tJw = ((afc)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3766686318592L, 28064);
        return 0;
      case 10: 
        localnc.tEL = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3766686318592L, 28064);
        return 0;
      }
      localnc.tEM = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3766686318592L, 28064);
      return 0;
    }
    GMTrace.o(3766686318592L, 28064);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/nc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */