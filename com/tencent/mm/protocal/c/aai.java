package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aai
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
  public int pwb;
  public String pwc;
  public String pwd;
  public String pwe;
  public String pwg;
  public boolean pwh;
  public boolean tWC;
  public boolean tWD;
  public String tWE;
  public String tWF;
  public int tWG;
  public String tWH;
  public int tWI;
  public String tWJ;
  public String title;
  
  public aai()
  {
    GMTrace.i(3891240370176L, 28992);
    GMTrace.o(3891240370176L, 28992);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3891374587904L, 28993);
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
      paramVarArgs.af(2, this.tWC);
      paramVarArgs.af(3, this.tWD);
      if (this.tWE != null) {
        paramVarArgs.e(4, this.tWE);
      }
      if (this.tWF != null) {
        paramVarArgs.e(5, this.tWF);
      }
      paramVarArgs.fd(6, this.tWG);
      if (this.tWH != null) {
        paramVarArgs.e(7, this.tWH);
      }
      paramVarArgs.fd(8, this.tWI);
      if (this.knp != null) {
        paramVarArgs.e(9, this.knp);
      }
      if (this.fMw != null) {
        paramVarArgs.e(10, this.fMw);
      }
      if (this.title != null) {
        paramVarArgs.e(11, this.title);
      }
      if (this.kns != null) {
        paramVarArgs.e(12, this.kns);
      }
      if (this.knt != null) {
        paramVarArgs.e(13, this.knt);
      }
      if (this.koD != null) {
        paramVarArgs.e(14, this.koD);
      }
      if (this.knr != null) {
        paramVarArgs.e(15, this.knr);
      }
      if (this.hbA != null) {
        paramVarArgs.e(16, this.hbA);
      }
      paramVarArgs.fd(17, this.pwb);
      if (this.pwc != null) {
        paramVarArgs.e(18, this.pwc);
      }
      if (this.pwd != null) {
        paramVarArgs.e(19, this.pwd);
      }
      if (this.pwe != null) {
        paramVarArgs.e(20, this.pwe);
      }
      paramVarArgs.fd(21, this.knw);
      if (this.pwg != null) {
        paramVarArgs.e(22, this.pwg);
      }
      if (this.tWJ != null) {
        paramVarArgs.e(23, this.tWJ);
      }
      paramVarArgs.af(24, this.pwh);
      GMTrace.o(3891374587904L, 28993);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt + (b.a.a.b.b.a.cK(2) + 1) + (b.a.a.b.b.a.cK(3) + 1);
      paramInt = i;
      if (this.tWE != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tWE);
      }
      i = paramInt;
      if (this.tWF != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tWF);
      }
      i += b.a.a.a.fa(6, this.tWG);
      paramInt = i;
      if (this.tWH != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.tWH);
      }
      i = paramInt + b.a.a.a.fa(8, this.tWI);
      paramInt = i;
      if (this.knp != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.knp);
      }
      i = paramInt;
      if (this.fMw != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.fMw);
      }
      paramInt = i;
      if (this.title != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.title);
      }
      i = paramInt;
      if (this.kns != null) {
        i = paramInt + b.a.a.b.b.a.f(12, this.kns);
      }
      paramInt = i;
      if (this.knt != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.knt);
      }
      i = paramInt;
      if (this.koD != null) {
        i = paramInt + b.a.a.b.b.a.f(14, this.koD);
      }
      paramInt = i;
      if (this.knr != null) {
        paramInt = i + b.a.a.b.b.a.f(15, this.knr);
      }
      i = paramInt;
      if (this.hbA != null) {
        i = paramInt + b.a.a.b.b.a.f(16, this.hbA);
      }
      i += b.a.a.a.fa(17, this.pwb);
      paramInt = i;
      if (this.pwc != null) {
        paramInt = i + b.a.a.b.b.a.f(18, this.pwc);
      }
      i = paramInt;
      if (this.pwd != null) {
        i = paramInt + b.a.a.b.b.a.f(19, this.pwd);
      }
      paramInt = i;
      if (this.pwe != null) {
        paramInt = i + b.a.a.b.b.a.f(20, this.pwe);
      }
      i = paramInt + b.a.a.a.fa(21, this.knw);
      paramInt = i;
      if (this.pwg != null) {
        paramInt = i + b.a.a.b.b.a.f(22, this.pwg);
      }
      i = paramInt;
      if (this.tWJ != null) {
        i = paramInt + b.a.a.b.b.a.f(23, this.tWJ);
      }
      paramInt = b.a.a.b.b.a.cK(24);
      GMTrace.o(3891374587904L, 28993);
      return i + (paramInt + 1);
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
      GMTrace.o(3891374587904L, 28993);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aai localaai = (aai)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3891374587904L, 28993);
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
          localaai.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 2: 
        localaai.tWC = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 3: 
        localaai.tWD = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 4: 
        localaai.tWE = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 5: 
        localaai.tWF = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 6: 
        localaai.tWG = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 7: 
        localaai.tWH = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 8: 
        localaai.tWI = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 9: 
        localaai.knp = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 10: 
        localaai.fMw = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 11: 
        localaai.title = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 12: 
        localaai.kns = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 13: 
        localaai.knt = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 14: 
        localaai.koD = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 15: 
        localaai.knr = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 16: 
        localaai.hbA = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 17: 
        localaai.pwb = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 18: 
        localaai.pwc = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 19: 
        localaai.pwd = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 20: 
        localaai.pwe = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 21: 
        localaai.knw = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 22: 
        localaai.pwg = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 23: 
        localaai.tWJ = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      }
      localaai.pwh = ((b.a.a.a.a)localObject1).cpH();
      GMTrace.o(3891374587904L, 28993);
      return 0;
    }
    GMTrace.o(3891374587904L, 28993);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */