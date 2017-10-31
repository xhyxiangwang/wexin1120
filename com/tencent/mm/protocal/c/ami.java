package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ami
  extends axc
{
  public int mDF;
  public String osy;
  public int tDJ;
  public int tDK;
  public int tXe;
  public String uhd;
  public String uhe;
  public String uhf;
  public int uhg;
  public axs uhh;
  public int uhi;
  public int uhj;
  public int uhk;
  public int uhl;
  public axs uhm;
  public int uhn;
  public int uho;
  public int uhp;
  public int uhq;
  public int uhr;
  public String uhs;
  public String uht;
  public String uhu;
  
  public ami()
  {
    GMTrace.i(4016733945856L, 29927);
    GMTrace.o(4016733945856L, 29927);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4016868163584L, 29928);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uhh == null) {
        throw new b("Not all required fields were included: DataBuffer");
      }
      if (this.uhm == null) {
        throw new b("Not all required fields were included: ThumbData");
      }
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.uhd != null) {
        paramVarArgs.e(2, this.uhd);
      }
      if (this.uhe != null) {
        paramVarArgs.e(3, this.uhe);
      }
      if (this.uhf != null) {
        paramVarArgs.e(4, this.uhf);
      }
      paramVarArgs.fd(5, this.mDF);
      paramVarArgs.fd(6, this.uhg);
      if (this.uhh != null)
      {
        paramVarArgs.ff(7, this.uhh.aWM());
        this.uhh.a(paramVarArgs);
      }
      paramVarArgs.fd(8, this.uhi);
      paramVarArgs.fd(9, this.uhj);
      paramVarArgs.fd(10, this.uhk);
      paramVarArgs.fd(11, this.uhl);
      if (this.uhm != null)
      {
        paramVarArgs.ff(12, this.uhm.aWM());
        this.uhm.a(paramVarArgs);
      }
      paramVarArgs.fd(13, this.uhn);
      paramVarArgs.fd(14, this.uho);
      paramVarArgs.fd(15, this.uhp);
      paramVarArgs.fd(16, this.uhq);
      paramVarArgs.fd(17, this.tXe);
      paramVarArgs.fd(18, this.uhr);
      if (this.uhs != null) {
        paramVarArgs.e(19, this.uhs);
      }
      if (this.osy != null) {
        paramVarArgs.e(20, this.osy);
      }
      paramVarArgs.fd(21, this.tDK);
      paramVarArgs.fd(22, this.tDJ);
      if (this.uht != null) {
        paramVarArgs.e(23, this.uht);
      }
      if (this.uhu != null) {
        paramVarArgs.e(24, this.uhu);
      }
      GMTrace.o(4016868163584L, 29928);
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
      if (this.uhd != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uhd);
      }
      i = paramInt;
      if (this.uhe != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uhe);
      }
      paramInt = i;
      if (this.uhf != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uhf);
      }
      i = paramInt + b.a.a.a.fa(5, this.mDF) + b.a.a.a.fa(6, this.uhg);
      paramInt = i;
      if (this.uhh != null) {
        paramInt = i + b.a.a.a.fc(7, this.uhh.aWM());
      }
      i = paramInt + b.a.a.a.fa(8, this.uhi) + b.a.a.a.fa(9, this.uhj) + b.a.a.a.fa(10, this.uhk) + b.a.a.a.fa(11, this.uhl);
      paramInt = i;
      if (this.uhm != null) {
        paramInt = i + b.a.a.a.fc(12, this.uhm.aWM());
      }
      i = paramInt + b.a.a.a.fa(13, this.uhn) + b.a.a.a.fa(14, this.uho) + b.a.a.a.fa(15, this.uhp) + b.a.a.a.fa(16, this.uhq) + b.a.a.a.fa(17, this.tXe) + b.a.a.a.fa(18, this.uhr);
      paramInt = i;
      if (this.uhs != null) {
        paramInt = i + b.a.a.b.b.a.f(19, this.uhs);
      }
      i = paramInt;
      if (this.osy != null) {
        i = paramInt + b.a.a.b.b.a.f(20, this.osy);
      }
      i = i + b.a.a.a.fa(21, this.tDK) + b.a.a.a.fa(22, this.tDJ);
      paramInt = i;
      if (this.uht != null) {
        paramInt = i + b.a.a.b.b.a.f(23, this.uht);
      }
      i = paramInt;
      if (this.uhu != null) {
        i = paramInt + b.a.a.b.b.a.f(24, this.uhu);
      }
      GMTrace.o(4016868163584L, 29928);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.uhh == null) {
        throw new b("Not all required fields were included: DataBuffer");
      }
      if (this.uhm == null) {
        throw new b("Not all required fields were included: ThumbData");
      }
      GMTrace.o(4016868163584L, 29928);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ami localami = (ami)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4016868163584L, 29928);
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
          localami.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 2: 
        localami.uhd = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 3: 
        localami.uhe = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 4: 
        localami.uhf = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 5: 
        localami.mDF = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 6: 
        localami.uhg = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4016868163584L, 29928);
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
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localami.uhh = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 8: 
        localami.uhi = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 9: 
        localami.uhj = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 10: 
        localami.uhk = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 11: 
        localami.uhl = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4016868163584L, 29928);
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
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localami.uhm = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 13: 
        localami.uhn = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 14: 
        localami.uho = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 15: 
        localami.uhp = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 16: 
        localami.uhq = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 17: 
        localami.tXe = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 18: 
        localami.uhr = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 19: 
        localami.uhs = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 20: 
        localami.osy = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 21: 
        localami.tDK = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 22: 
        localami.tDJ = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 23: 
        localami.uht = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      }
      localami.uhu = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(4016868163584L, 29928);
      return 0;
    }
    GMTrace.o(4016868163584L, 29928);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ami.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */