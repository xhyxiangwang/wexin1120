package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bbf
  extends axk
{
  public String fMw;
  public String hbA;
  public String knp;
  public String knr;
  public String kns;
  public String knt;
  public int knw;
  public String koD;
  public int kpb;
  public int pvY;
  public int pwb;
  public String pwc;
  public String pwd;
  public String pwe;
  public String pwf;
  public String pwg;
  public boolean pwh;
  public String title;
  
  public bbf()
  {
    GMTrace.i(3841445593088L, 28621);
    GMTrace.o(3841445593088L, 28621);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3841579810816L, 28622);
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
      paramVarArgs.fd(2, this.kpb);
      if (this.knp != null) {
        paramVarArgs.e(3, this.knp);
      }
      if (this.fMw != null) {
        paramVarArgs.e(4, this.fMw);
      }
      if (this.title != null) {
        paramVarArgs.e(5, this.title);
      }
      if (this.kns != null) {
        paramVarArgs.e(6, this.kns);
      }
      if (this.knt != null) {
        paramVarArgs.e(7, this.knt);
      }
      if (this.koD != null) {
        paramVarArgs.e(8, this.koD);
      }
      if (this.knr != null) {
        paramVarArgs.e(9, this.knr);
      }
      if (this.hbA != null) {
        paramVarArgs.e(10, this.hbA);
      }
      paramVarArgs.fd(11, this.pvY);
      paramVarArgs.fd(12, this.pwb);
      if (this.pwc != null) {
        paramVarArgs.e(13, this.pwc);
      }
      if (this.pwd != null) {
        paramVarArgs.e(14, this.pwd);
      }
      if (this.pwe != null) {
        paramVarArgs.e(19, this.pwe);
      }
      if (this.pwf != null) {
        paramVarArgs.e(21, this.pwf);
      }
      paramVarArgs.fd(22, this.knw);
      if (this.pwg != null) {
        paramVarArgs.e(23, this.pwg);
      }
      paramVarArgs.af(24, this.pwh);
      GMTrace.o(3841579810816L, 28622);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.kpb);
      paramInt = i;
      if (this.knp != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.knp);
      }
      i = paramInt;
      if (this.fMw != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.fMw);
      }
      paramInt = i;
      if (this.title != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.title);
      }
      i = paramInt;
      if (this.kns != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.kns);
      }
      paramInt = i;
      if (this.knt != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.knt);
      }
      i = paramInt;
      if (this.koD != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.koD);
      }
      paramInt = i;
      if (this.knr != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.knr);
      }
      i = paramInt;
      if (this.hbA != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.hbA);
      }
      i = i + b.a.a.a.fa(11, this.pvY) + b.a.a.a.fa(12, this.pwb);
      paramInt = i;
      if (this.pwc != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.pwc);
      }
      i = paramInt;
      if (this.pwd != null) {
        i = paramInt + b.a.a.b.b.a.f(14, this.pwd);
      }
      paramInt = i;
      if (this.pwe != null) {
        paramInt = i + b.a.a.b.b.a.f(19, this.pwe);
      }
      i = paramInt;
      if (this.pwf != null) {
        i = paramInt + b.a.a.b.b.a.f(21, this.pwf);
      }
      i += b.a.a.a.fa(22, this.knw);
      paramInt = i;
      if (this.pwg != null) {
        paramInt = i + b.a.a.b.b.a.f(23, this.pwg);
      }
      i = b.a.a.b.b.a.cK(24);
      GMTrace.o(3841579810816L, 28622);
      return paramInt + (i + 1);
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
      GMTrace.o(3841579810816L, 28622);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bbf localbbf = (bbf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      case 15: 
      case 16: 
      case 17: 
      case 18: 
      case 20: 
      default: 
        GMTrace.o(3841579810816L, 28622);
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
          localbbf.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 2: 
        localbbf.kpb = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 3: 
        localbbf.knp = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 4: 
        localbbf.fMw = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 5: 
        localbbf.title = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 6: 
        localbbf.kns = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 7: 
        localbbf.knt = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 8: 
        localbbf.koD = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 9: 
        localbbf.knr = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 10: 
        localbbf.hbA = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 11: 
        localbbf.pvY = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 12: 
        localbbf.pwb = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 13: 
        localbbf.pwc = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 14: 
        localbbf.pwd = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 19: 
        localbbf.pwe = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 21: 
        localbbf.pwf = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 22: 
        localbbf.knw = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 23: 
        localbbf.pwg = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      }
      localbbf.pwh = ((b.a.a.a.a)localObject1).cpH();
      GMTrace.o(3841579810816L, 28622);
      return 0;
    }
    GMTrace.o(3841579810816L, 28622);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bbf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */