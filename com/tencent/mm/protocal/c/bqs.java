package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bqs
  extends com.tencent.mm.bl.a
{
  public com.tencent.mm.bl.b twT;
  public long uFM;
  public int uGf;
  
  public bqs()
  {
    GMTrace.i(3967476039680L, 29560);
    GMTrace.o(3967476039680L, 29560);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3967610257408L, 29561);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.twT == null) {
        throw new b.a.a.b("Not all required fields were included: VoiceData");
      }
      paramVarArgs.R(1, this.uFM);
      if (this.twT != null) {
        paramVarArgs.b(2, this.twT);
      }
      paramVarArgs.fd(3, this.uGf);
      GMTrace.o(3967610257408L, 29561);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.Q(1, this.uFM) + 0;
      paramInt = i;
      if (this.twT != null) {
        paramInt = i + b.a.a.a.a(2, this.twT);
      }
      i = b.a.a.a.fa(3, this.uGf);
      GMTrace.o(3967610257408L, 29561);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.twT == null) {
        throw new b.a.a.b("Not all required fields were included: VoiceData");
      }
      GMTrace.o(3967610257408L, 29561);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bqs localbqs = (bqs)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3967610257408L, 29561);
        return -1;
      case 1: 
        localbqs.uFM = locala.xSv.nn();
        GMTrace.o(3967610257408L, 29561);
        return 0;
      case 2: 
        localbqs.twT = locala.cpI();
        GMTrace.o(3967610257408L, 29561);
        return 0;
      }
      localbqs.uGf = locala.xSv.nm();
      GMTrace.o(3967610257408L, 29561);
      return 0;
    }
    GMTrace.o(3967610257408L, 29561);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bqs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */