package com.tencent.mm.plugin.backup.h;

import com.tencent.gmtrace.GMTrace;

public final class w
  extends com.tencent.mm.bl.a
{
  public String ID;
  public com.tencent.mm.bl.b jWD;
  public int jXN;
  public int jXO;
  public int jXP;
  public int jXQ;
  public int jXo;
  
  public w()
  {
    GMTrace.i(14831193161728L, 110501);
    GMTrace.o(14831193161728L, 110501);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14831327379456L, 110502);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ID == null) {
        throw new b.a.a.b("Not all required fields were included: ID");
      }
      paramVarArgs.fd(1, this.jXN);
      paramVarArgs.fd(2, this.jXo);
      if (this.ID != null) {
        paramVarArgs.e(3, this.ID);
      }
      if (this.jWD != null) {
        paramVarArgs.b(4, this.jWD);
      }
      paramVarArgs.fd(5, this.jXO);
      paramVarArgs.fd(6, this.jXP);
      paramVarArgs.fd(7, this.jXQ);
      GMTrace.o(14831327379456L, 110502);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.jXN) + 0 + b.a.a.a.fa(2, this.jXo);
      paramInt = i;
      if (this.ID != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.ID);
      }
      i = paramInt;
      if (this.jWD != null) {
        i = paramInt + b.a.a.a.a(4, this.jWD);
      }
      paramInt = b.a.a.a.fa(5, this.jXO);
      int j = b.a.a.a.fa(6, this.jXP);
      int k = b.a.a.a.fa(7, this.jXQ);
      GMTrace.o(14831327379456L, 110502);
      return i + paramInt + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.ID == null) {
        throw new b.a.a.b("Not all required fields were included: ID");
      }
      GMTrace.o(14831327379456L, 110502);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      w localw = (w)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(14831327379456L, 110502);
        return -1;
      case 1: 
        localw.jXN = locala.xSv.nm();
        GMTrace.o(14831327379456L, 110502);
        return 0;
      case 2: 
        localw.jXo = locala.xSv.nm();
        GMTrace.o(14831327379456L, 110502);
        return 0;
      case 3: 
        localw.ID = locala.xSv.readString();
        GMTrace.o(14831327379456L, 110502);
        return 0;
      case 4: 
        localw.jWD = locala.cpI();
        GMTrace.o(14831327379456L, 110502);
        return 0;
      case 5: 
        localw.jXO = locala.xSv.nm();
        GMTrace.o(14831327379456L, 110502);
        return 0;
      case 6: 
        localw.jXP = locala.xSv.nm();
        GMTrace.o(14831327379456L, 110502);
        return 0;
      }
      localw.jXQ = locala.xSv.nm();
      GMTrace.o(14831327379456L, 110502);
      return 0;
    }
    GMTrace.o(14831327379456L, 110502);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/h/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */