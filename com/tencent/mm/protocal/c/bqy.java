package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bqy
  extends com.tencent.mm.bl.a
{
  public int ttY;
  public com.tencent.mm.bl.b twT;
  public String uFL;
  public long uGg;
  
  public bqy()
  {
    GMTrace.i(3683873980416L, 27447);
    GMTrace.o(3683873980416L, 27447);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3684008198144L, 27448);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uFL == null) {
        throw new b.a.a.b("Not all required fields were included: Talker");
      }
      if (this.twT == null) {
        throw new b.a.a.b("Not all required fields were included: VoiceData");
      }
      if (this.uFL != null) {
        paramVarArgs.e(1, this.uFL);
      }
      paramVarArgs.R(2, this.uGg);
      if (this.twT != null) {
        paramVarArgs.b(3, this.twT);
      }
      paramVarArgs.fd(4, this.ttY);
      GMTrace.o(3684008198144L, 27448);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uFL == null) {
        break label467;
      }
    }
    label467:
    for (paramInt = b.a.a.b.b.a.f(1, this.uFL) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.Q(2, this.uGg);
      paramInt = i;
      if (this.twT != null) {
        paramInt = i + b.a.a.a.a(3, this.twT);
      }
      i = b.a.a.a.fa(4, this.ttY);
      GMTrace.o(3684008198144L, 27448);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.uFL == null) {
          throw new b.a.a.b("Not all required fields were included: Talker");
        }
        if (this.twT == null) {
          throw new b.a.a.b("Not all required fields were included: VoiceData");
        }
        GMTrace.o(3684008198144L, 27448);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bqy localbqy = (bqy)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3684008198144L, 27448);
          return -1;
        case 1: 
          localbqy.uFL = locala.xSv.readString();
          GMTrace.o(3684008198144L, 27448);
          return 0;
        case 2: 
          localbqy.uGg = locala.xSv.nn();
          GMTrace.o(3684008198144L, 27448);
          return 0;
        case 3: 
          localbqy.twT = locala.cpI();
          GMTrace.o(3684008198144L, 27448);
          return 0;
        }
        localbqy.ttY = locala.xSv.nm();
        GMTrace.o(3684008198144L, 27448);
        return 0;
      }
      GMTrace.o(3684008198144L, 27448);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bqy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */