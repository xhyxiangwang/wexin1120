package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ka
  extends axk
{
  public String desc;
  public int kKx;
  public String kKy;
  public String klL;
  public String kpd;
  public String rMv;
  public boolean tGl;
  public String tGm;
  public String tGn;
  public int tGo;
  public LinkedList<Integer> tGp;
  public String tGq;
  public int tGr;
  public int tGs;
  
  public ka()
  {
    GMTrace.i(19139984883712L, 142604);
    this.tGp = new LinkedList();
    GMTrace.o(19139984883712L, 142604);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19140119101440L, 142605);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.urV != null)
      {
        paramVarArgs.ff(1, this.urV.aWM());
        this.urV.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.kKx);
      if (this.kKy != null) {
        paramVarArgs.e(3, this.kKy);
      }
      paramVarArgs.af(4, this.tGl);
      if (this.tGm != null) {
        paramVarArgs.e(5, this.tGm);
      }
      if (this.tGn != null) {
        paramVarArgs.e(6, this.tGn);
      }
      if (this.klL != null) {
        paramVarArgs.e(7, this.klL);
      }
      paramVarArgs.fd(8, this.tGo);
      if (this.desc != null) {
        paramVarArgs.e(9, this.desc);
      }
      if (this.rMv != null) {
        paramVarArgs.e(10, this.rMv);
      }
      paramVarArgs.d(11, 2, this.tGp);
      if (this.tGq != null) {
        paramVarArgs.e(12, this.tGq);
      }
      if (this.kpd != null) {
        paramVarArgs.e(13, this.kpd);
      }
      paramVarArgs.fd(14, this.tGr);
      paramVarArgs.fd(15, this.tGs);
      GMTrace.o(19140119101440L, 142605);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.kKx);
      paramInt = i;
      if (this.kKy != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.kKy);
      }
      i = paramInt + (b.a.a.b.b.a.cK(4) + 1);
      paramInt = i;
      if (this.tGm != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tGm);
      }
      i = paramInt;
      if (this.tGn != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.tGn);
      }
      paramInt = i;
      if (this.klL != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.klL);
      }
      i = paramInt + b.a.a.a.fa(8, this.tGo);
      paramInt = i;
      if (this.desc != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.desc);
      }
      i = paramInt;
      if (this.rMv != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.rMv);
      }
      i += b.a.a.a.c(11, 2, this.tGp);
      paramInt = i;
      if (this.tGq != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.tGq);
      }
      i = paramInt;
      if (this.kpd != null) {
        i = paramInt + b.a.a.b.b.a.f(13, this.kpd);
      }
      paramInt = b.a.a.a.fa(14, this.tGr);
      int j = b.a.a.a.fa(15, this.tGs);
      GMTrace.o(19140119101440L, 142605);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tGp.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(19140119101440L, 142605);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ka localka = (ka)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(19140119101440L, 142605);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new eo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((eo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localka.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(19140119101440L, 142605);
        return 0;
      case 2: 
        localka.kKx = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(19140119101440L, 142605);
        return 0;
      case 3: 
        localka.kKy = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(19140119101440L, 142605);
        return 0;
      case 4: 
        localka.tGl = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(19140119101440L, 142605);
        return 0;
      case 5: 
        localka.tGm = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(19140119101440L, 142605);
        return 0;
      case 6: 
        localka.tGn = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(19140119101440L, 142605);
        return 0;
      case 7: 
        localka.klL = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(19140119101440L, 142605);
        return 0;
      case 8: 
        localka.tGo = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(19140119101440L, 142605);
        return 0;
      case 9: 
        localka.desc = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(19140119101440L, 142605);
        return 0;
      case 10: 
        localka.rMv = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(19140119101440L, 142605);
        return 0;
      case 11: 
        localka.tGp.add(Integer.valueOf(((b.a.a.a.a)localObject1).xSv.nm()));
        GMTrace.o(19140119101440L, 142605);
        return 0;
      case 12: 
        localka.tGq = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(19140119101440L, 142605);
        return 0;
      case 13: 
        localka.kpd = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(19140119101440L, 142605);
        return 0;
      case 14: 
        localka.tGr = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(19140119101440L, 142605);
        return 0;
      }
      localka.tGs = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(19140119101440L, 142605);
      return 0;
    }
    GMTrace.o(19140119101440L, 142605);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */