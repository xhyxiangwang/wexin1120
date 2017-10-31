package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bsz
  extends com.tencent.mm.bl.a
{
  public String hoh;
  public String oqo;
  public String title;
  public String username;
  
  public bsz()
  {
    GMTrace.i(3884261048320L, 28940);
    GMTrace.o(3884261048320L, 28940);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3884395266048L, 28941);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.username != null) {
        paramVarArgs.e(1, this.username);
      }
      if (this.title != null) {
        paramVarArgs.e(2, this.title);
      }
      if (this.hoh != null) {
        paramVarArgs.e(3, this.hoh);
      }
      if (this.oqo != null) {
        paramVarArgs.e(4, this.oqo);
      }
      GMTrace.o(3884395266048L, 28941);
      return 0;
    }
    if (paramInt == 1) {
      if (this.username == null) {
        break label434;
      }
    }
    label434:
    for (int i = b.a.a.b.b.a.f(1, this.username) + 0;; i = 0)
    {
      paramInt = i;
      if (this.title != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.title);
      }
      i = paramInt;
      if (this.hoh != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.hoh);
      }
      paramInt = i;
      if (this.oqo != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.oqo);
      }
      GMTrace.o(3884395266048L, 28941);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3884395266048L, 28941);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bsz localbsz = (bsz)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3884395266048L, 28941);
          return -1;
        case 1: 
          localbsz.username = locala.xSv.readString();
          GMTrace.o(3884395266048L, 28941);
          return 0;
        case 2: 
          localbsz.title = locala.xSv.readString();
          GMTrace.o(3884395266048L, 28941);
          return 0;
        case 3: 
          localbsz.hoh = locala.xSv.readString();
          GMTrace.o(3884395266048L, 28941);
          return 0;
        }
        localbsz.oqo = locala.xSv.readString();
        GMTrace.o(3884395266048L, 28941);
        return 0;
      }
      GMTrace.o(3884395266048L, 28941);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bsz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */