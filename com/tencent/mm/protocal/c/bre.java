package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bre
  extends com.tencent.mm.bl.a
{
  public String tXq;
  public int tsx;
  public String uFL;
  public boolean uGp;
  
  public bre()
  {
    GMTrace.i(3656761999360L, 27245);
    GMTrace.o(3656761999360L, 27245);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3656896217088L, 27246);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uFL == null) {
        throw new b("Not all required fields were included: Talker");
      }
      if (this.tXq == null) {
        throw new b("Not all required fields were included: Text");
      }
      if (this.uFL != null) {
        paramVarArgs.e(1, this.uFL);
      }
      if (this.tXq != null) {
        paramVarArgs.e(2, this.tXq);
      }
      paramVarArgs.af(3, this.uGp);
      paramVarArgs.fd(4, this.tsx);
      GMTrace.o(3656896217088L, 27246);
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
      int i = paramInt;
      if (this.tXq != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.tXq);
      }
      paramInt = b.a.a.b.b.a.cK(3);
      int j = b.a.a.a.fa(4, this.tsx);
      GMTrace.o(3656896217088L, 27246);
      return i + (paramInt + 1) + j;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.uFL == null) {
          throw new b("Not all required fields were included: Talker");
        }
        if (this.tXq == null) {
          throw new b("Not all required fields were included: Text");
        }
        GMTrace.o(3656896217088L, 27246);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bre localbre = (bre)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3656896217088L, 27246);
          return -1;
        case 1: 
          localbre.uFL = locala.xSv.readString();
          GMTrace.o(3656896217088L, 27246);
          return 0;
        case 2: 
          localbre.tXq = locala.xSv.readString();
          GMTrace.o(3656896217088L, 27246);
          return 0;
        case 3: 
          localbre.uGp = locala.cpH();
          GMTrace.o(3656896217088L, 27246);
          return 0;
        }
        localbre.tsx = locala.xSv.nm();
        GMTrace.o(3656896217088L, 27246);
        return 0;
      }
      GMTrace.o(3656896217088L, 27246);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bre.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */