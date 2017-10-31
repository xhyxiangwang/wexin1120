package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class eg
  extends com.tencent.mm.bl.a
  implements bcg
{
  public String ID;
  public axs txQ;
  public String tyh;
  public int tyi;
  public axs tyj;
  public String tyk;
  public int tyl;
  public String tym;
  public String tyn;
  
  public eg()
  {
    GMTrace.i(4021028913152L, 29959);
    GMTrace.o(4021028913152L, 29959);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4021297348608L, 29961);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tyj == null) {
        throw new b("Not all required fields were included: QRCodeBuffer");
      }
      if (this.txQ == null) {
        throw new b("Not all required fields were included: Key");
      }
      paramVarArgs.fd(1, this.tyi);
      if (this.tyj != null)
      {
        paramVarArgs.ff(2, this.tyj.aWM());
        this.tyj.a(paramVarArgs);
      }
      if (this.tyk != null) {
        paramVarArgs.e(3, this.tyk);
      }
      if (this.txQ != null)
      {
        paramVarArgs.ff(4, this.txQ.aWM());
        this.txQ.a(paramVarArgs);
      }
      if (this.tym != null) {
        paramVarArgs.e(5, this.tym);
      }
      if (this.tyn != null) {
        paramVarArgs.e(6, this.tyn);
      }
      paramVarArgs.fd(7, this.tyl);
      if (this.ID != null) {
        paramVarArgs.e(8, this.ID);
      }
      if (this.tyh != null) {
        paramVarArgs.e(9, this.tyh);
      }
      GMTrace.o(4021297348608L, 29961);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fa(1, this.tyi) + 0;
      paramInt = i;
      if (this.tyj != null) {
        paramInt = i + b.a.a.a.fc(2, this.tyj.aWM());
      }
      i = paramInt;
      if (this.tyk != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tyk);
      }
      paramInt = i;
      if (this.txQ != null) {
        paramInt = i + b.a.a.a.fc(4, this.txQ.aWM());
      }
      i = paramInt;
      if (this.tym != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tym);
      }
      paramInt = i;
      if (this.tyn != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tyn);
      }
      i = paramInt + b.a.a.a.fa(7, this.tyl);
      paramInt = i;
      if (this.ID != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.ID);
      }
      i = paramInt;
      if (this.tyh != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.tyh);
      }
      GMTrace.o(4021297348608L, 29961);
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
      if (this.tyj == null) {
        throw new b("Not all required fields were included: QRCodeBuffer");
      }
      if (this.txQ == null) {
        throw new b("Not all required fields were included: Key");
      }
      GMTrace.o(4021297348608L, 29961);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      eg localeg = (eg)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4021297348608L, 29961);
        return -1;
      case 1: 
        localeg.tyi = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4021297348608L, 29961);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localeg.tyj = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4021297348608L, 29961);
        return 0;
      case 3: 
        localeg.tyk = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(4021297348608L, 29961);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localeg.txQ = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4021297348608L, 29961);
        return 0;
      case 5: 
        localeg.tym = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(4021297348608L, 29961);
        return 0;
      case 6: 
        localeg.tyn = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(4021297348608L, 29961);
        return 0;
      case 7: 
        localeg.tyl = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4021297348608L, 29961);
        return 0;
      case 8: 
        localeg.ID = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(4021297348608L, 29961);
        return 0;
      }
      localeg.tyh = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(4021297348608L, 29961);
      return 0;
    }
    GMTrace.o(4021297348608L, 29961);
    return -1;
  }
  
  public final int getRet()
  {
    GMTrace.i(4021163130880L, 29960);
    int i = this.tyi;
    GMTrace.o(4021163130880L, 29960);
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/eg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */