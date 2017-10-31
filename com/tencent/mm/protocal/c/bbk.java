package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bbk
  extends axk
{
  public axs tXN;
  public axs tXO;
  public axs tXP;
  public int tyZ;
  public float uke;
  public int utH;
  public axs utI;
  public axs utJ;
  public axs utK;
  public axs utL;
  public axs utM;
  public int utN;
  public int utO;
  public String utP;
  
  public bbk()
  {
    GMTrace.i(3777021083648L, 28141);
    GMTrace.o(3777021083648L, 28141);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3777155301376L, 28142);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.utI == null) {
        throw new b("Not all required fields were included: SongName");
      }
      if (this.utJ == null) {
        throw new b("Not all required fields were included: SongSinger");
      }
      if (this.tXO == null) {
        throw new b("Not all required fields were included: SongAlbum");
      }
      if (this.tXP == null) {
        throw new b("Not all required fields were included: SongAlbumUrl");
      }
      if (this.utK == null) {
        throw new b("Not all required fields were included: SongWifiUrl");
      }
      if (this.utL == null) {
        throw new b("Not all required fields were included: SongWapLinkUrl");
      }
      if (this.utM == null) {
        throw new b("Not all required fields were included: SongWebUrl");
      }
      if (this.tXN == null) {
        throw new b("Not all required fields were included: SongLyric");
      }
      if (this.urV != null)
      {
        paramVarArgs.ff(1, this.urV.aWM());
        this.urV.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.tyZ);
      paramVarArgs.fd(3, this.utH);
      paramVarArgs.n(4, this.uke);
      if (this.utI != null)
      {
        paramVarArgs.ff(5, this.utI.aWM());
        this.utI.a(paramVarArgs);
      }
      if (this.utJ != null)
      {
        paramVarArgs.ff(6, this.utJ.aWM());
        this.utJ.a(paramVarArgs);
      }
      if (this.tXO != null)
      {
        paramVarArgs.ff(7, this.tXO.aWM());
        this.tXO.a(paramVarArgs);
      }
      if (this.tXP != null)
      {
        paramVarArgs.ff(8, this.tXP.aWM());
        this.tXP.a(paramVarArgs);
      }
      if (this.utK != null)
      {
        paramVarArgs.ff(9, this.utK.aWM());
        this.utK.a(paramVarArgs);
      }
      if (this.utL != null)
      {
        paramVarArgs.ff(10, this.utL.aWM());
        this.utL.a(paramVarArgs);
      }
      if (this.utM != null)
      {
        paramVarArgs.ff(11, this.utM.aWM());
        this.utM.a(paramVarArgs);
      }
      if (this.tXN != null)
      {
        paramVarArgs.ff(12, this.tXN.aWM());
        this.tXN.a(paramVarArgs);
      }
      paramVarArgs.fd(13, this.utN);
      paramVarArgs.fd(14, this.utO);
      if (this.utP != null) {
        paramVarArgs.e(15, this.utP);
      }
      GMTrace.o(3777155301376L, 28142);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.tyZ) + b.a.a.a.fa(3, this.utH) + (b.a.a.b.b.a.cK(4) + 4);
      paramInt = i;
      if (this.utI != null) {
        paramInt = i + b.a.a.a.fc(5, this.utI.aWM());
      }
      i = paramInt;
      if (this.utJ != null) {
        i = paramInt + b.a.a.a.fc(6, this.utJ.aWM());
      }
      paramInt = i;
      if (this.tXO != null) {
        paramInt = i + b.a.a.a.fc(7, this.tXO.aWM());
      }
      i = paramInt;
      if (this.tXP != null) {
        i = paramInt + b.a.a.a.fc(8, this.tXP.aWM());
      }
      paramInt = i;
      if (this.utK != null) {
        paramInt = i + b.a.a.a.fc(9, this.utK.aWM());
      }
      i = paramInt;
      if (this.utL != null) {
        i = paramInt + b.a.a.a.fc(10, this.utL.aWM());
      }
      paramInt = i;
      if (this.utM != null) {
        paramInt = i + b.a.a.a.fc(11, this.utM.aWM());
      }
      i = paramInt;
      if (this.tXN != null) {
        i = paramInt + b.a.a.a.fc(12, this.tXN.aWM());
      }
      i = i + b.a.a.a.fa(13, this.utN) + b.a.a.a.fa(14, this.utO);
      paramInt = i;
      if (this.utP != null) {
        paramInt = i + b.a.a.b.b.a.f(15, this.utP);
      }
      GMTrace.o(3777155301376L, 28142);
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
      if (this.utI == null) {
        throw new b("Not all required fields were included: SongName");
      }
      if (this.utJ == null) {
        throw new b("Not all required fields were included: SongSinger");
      }
      if (this.tXO == null) {
        throw new b("Not all required fields were included: SongAlbum");
      }
      if (this.tXP == null) {
        throw new b("Not all required fields were included: SongAlbumUrl");
      }
      if (this.utK == null) {
        throw new b("Not all required fields were included: SongWifiUrl");
      }
      if (this.utL == null) {
        throw new b("Not all required fields were included: SongWapLinkUrl");
      }
      if (this.utM == null) {
        throw new b("Not all required fields were included: SongWebUrl");
      }
      if (this.tXN == null) {
        throw new b("Not all required fields were included: SongLyric");
      }
      GMTrace.o(3777155301376L, 28142);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bbk localbbk = (bbk)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3777155301376L, 28142);
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
          localbbk.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3777155301376L, 28142);
        return 0;
      case 2: 
        localbbk.tyZ = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3777155301376L, 28142);
        return 0;
      case 3: 
        localbbk.utH = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3777155301376L, 28142);
        return 0;
      case 4: 
        localbbk.uke = ((b.a.a.a.a)localObject1).xSv.readFloat();
        GMTrace.o(3777155301376L, 28142);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localbbk.utI = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3777155301376L, 28142);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localbbk.utJ = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3777155301376L, 28142);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localbbk.tXO = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3777155301376L, 28142);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localbbk.tXP = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3777155301376L, 28142);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localbbk.utK = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3777155301376L, 28142);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localbbk.utL = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3777155301376L, 28142);
        return 0;
      case 11: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localbbk.utM = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3777155301376L, 28142);
        return 0;
      case 12: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localbbk.tXN = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3777155301376L, 28142);
        return 0;
      case 13: 
        localbbk.utN = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3777155301376L, 28142);
        return 0;
      case 14: 
        localbbk.utO = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3777155301376L, 28142);
        return 0;
      }
      localbbk.utP = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3777155301376L, 28142);
      return 0;
    }
    GMTrace.o(3777155301376L, 28142);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bbk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */