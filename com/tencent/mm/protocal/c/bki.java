package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bki
  extends axc
{
  public int aGu;
  public double altitude;
  public double latitude;
  public double longitude;
  public double uAv;
  public double uAw;
  
  public bki()
  {
    GMTrace.i(3638374170624L, 27108);
    GMTrace.o(3638374170624L, 27108);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3638508388352L, 27109);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.a(2, this.latitude);
      paramVarArgs.a(3, this.longitude);
      paramVarArgs.a(4, this.altitude);
      paramVarArgs.a(5, this.uAv);
      paramVarArgs.a(6, this.uAw);
      paramVarArgs.fd(7, this.aGu);
      GMTrace.o(3638508388352L, 27109);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = b.a.a.b.b.a.cK(2);
      int j = b.a.a.b.b.a.cK(3);
      int k = b.a.a.b.b.a.cK(4);
      int m = b.a.a.b.b.a.cK(5);
      int n = b.a.a.b.b.a.cK(6);
      int i1 = b.a.a.a.fa(7, this.aGu);
      GMTrace.o(3638508388352L, 27109);
      return paramInt + (i + 8) + (j + 8) + (k + 8) + (m + 8) + (n + 8) + i1;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3638508388352L, 27109);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bki localbki = (bki)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3638508388352L, 27109);
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
          localbki.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3638508388352L, 27109);
        return 0;
      case 2: 
        localbki.latitude = ((b.a.a.a.a)localObject1).xSv.readDouble();
        GMTrace.o(3638508388352L, 27109);
        return 0;
      case 3: 
        localbki.longitude = ((b.a.a.a.a)localObject1).xSv.readDouble();
        GMTrace.o(3638508388352L, 27109);
        return 0;
      case 4: 
        localbki.altitude = ((b.a.a.a.a)localObject1).xSv.readDouble();
        GMTrace.o(3638508388352L, 27109);
        return 0;
      case 5: 
        localbki.uAv = ((b.a.a.a.a)localObject1).xSv.readDouble();
        GMTrace.o(3638508388352L, 27109);
        return 0;
      case 6: 
        localbki.uAw = ((b.a.a.a.a)localObject1).xSv.readDouble();
        GMTrace.o(3638508388352L, 27109);
        return 0;
      }
      localbki.aGu = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3638508388352L, 27109);
      return 0;
    }
    GMTrace.o(3638508388352L, 27109);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bki.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */