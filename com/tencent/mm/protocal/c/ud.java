package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class ud
  extends com.tencent.mm.bl.a
{
  public String mCH;
  public int tSa;
  public String tSb;
  public String tSj;
  public String txe;
  
  public ud()
  {
    GMTrace.i(3699711672320L, 27565);
    GMTrace.o(3699711672320L, 27565);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3699845890048L, 27566);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mCH == null) {
        throw new b("Not all required fields were included: AppID");
      }
      if (this.tSj == null) {
        throw new b("Not all required fields were included: RecommendKey");
      }
      if (this.mCH != null) {
        paramVarArgs.e(1, this.mCH);
      }
      if (this.tSj != null) {
        paramVarArgs.e(2, this.tSj);
      }
      if (this.txe != null) {
        paramVarArgs.e(3, this.txe);
      }
      paramVarArgs.fd(4, this.tSa);
      if (this.tSb != null) {
        paramVarArgs.e(5, this.tSb);
      }
      GMTrace.o(3699845890048L, 27566);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mCH == null) {
        break label550;
      }
    }
    label550:
    for (int i = b.a.a.b.b.a.f(1, this.mCH) + 0;; i = 0)
    {
      paramInt = i;
      if (this.tSj != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tSj);
      }
      i = paramInt;
      if (this.txe != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.txe);
      }
      i += b.a.a.a.fa(4, this.tSa);
      paramInt = i;
      if (this.tSb != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tSb);
      }
      GMTrace.o(3699845890048L, 27566);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.mCH == null) {
          throw new b("Not all required fields were included: AppID");
        }
        if (this.tSj == null) {
          throw new b("Not all required fields were included: RecommendKey");
        }
        GMTrace.o(3699845890048L, 27566);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ud localud = (ud)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3699845890048L, 27566);
          return -1;
        case 1: 
          localud.mCH = locala.xSv.readString();
          GMTrace.o(3699845890048L, 27566);
          return 0;
        case 2: 
          localud.tSj = locala.xSv.readString();
          GMTrace.o(3699845890048L, 27566);
          return 0;
        case 3: 
          localud.txe = locala.xSv.readString();
          GMTrace.o(3699845890048L, 27566);
          return 0;
        case 4: 
          localud.tSa = locala.xSv.nm();
          GMTrace.o(3699845890048L, 27566);
          return 0;
        }
        localud.tSb = locala.xSv.readString();
        GMTrace.o(3699845890048L, 27566);
        return 0;
      }
      GMTrace.o(3699845890048L, 27566);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ud.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */