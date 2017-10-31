package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class dp
  extends com.tencent.mm.bl.a
{
  public String mCH;
  public String mDh;
  public String mFw;
  public String mFy;
  public int twE;
  public String txk;
  public String txl;
  public String txm;
  
  public dp()
  {
    GMTrace.i(3902246223872L, 29074);
    GMTrace.o(3902246223872L, 29074);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3902380441600L, 29075);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mCH != null) {
        paramVarArgs.e(1, this.mCH);
      }
      if (this.txk != null) {
        paramVarArgs.e(2, this.txk);
      }
      if (this.mFy != null) {
        paramVarArgs.e(3, this.mFy);
      }
      if (this.mFw != null) {
        paramVarArgs.e(4, this.mFw);
      }
      paramVarArgs.fd(5, this.twE);
      if (this.mDh != null) {
        paramVarArgs.e(6, this.mDh);
      }
      if (this.txl != null) {
        paramVarArgs.e(7, this.txl);
      }
      if (this.txm != null) {
        paramVarArgs.e(8, this.txm);
      }
      GMTrace.o(3902380441600L, 29075);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mCH == null) {
        break label682;
      }
    }
    label682:
    for (int i = b.a.a.b.b.a.f(1, this.mCH) + 0;; i = 0)
    {
      paramInt = i;
      if (this.txk != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.txk);
      }
      i = paramInt;
      if (this.mFy != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.mFy);
      }
      paramInt = i;
      if (this.mFw != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mFw);
      }
      i = paramInt + b.a.a.a.fa(5, this.twE);
      paramInt = i;
      if (this.mDh != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.mDh);
      }
      i = paramInt;
      if (this.txl != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.txl);
      }
      paramInt = i;
      if (this.txm != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.txm);
      }
      GMTrace.o(3902380441600L, 29075);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3902380441600L, 29075);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        dp localdp = (dp)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3902380441600L, 29075);
          return -1;
        case 1: 
          localdp.mCH = locala.xSv.readString();
          GMTrace.o(3902380441600L, 29075);
          return 0;
        case 2: 
          localdp.txk = locala.xSv.readString();
          GMTrace.o(3902380441600L, 29075);
          return 0;
        case 3: 
          localdp.mFy = locala.xSv.readString();
          GMTrace.o(3902380441600L, 29075);
          return 0;
        case 4: 
          localdp.mFw = locala.xSv.readString();
          GMTrace.o(3902380441600L, 29075);
          return 0;
        case 5: 
          localdp.twE = locala.xSv.nm();
          GMTrace.o(3902380441600L, 29075);
          return 0;
        case 6: 
          localdp.mDh = locala.xSv.readString();
          GMTrace.o(3902380441600L, 29075);
          return 0;
        case 7: 
          localdp.txl = locala.xSv.readString();
          GMTrace.o(3902380441600L, 29075);
          return 0;
        }
        localdp.txm = locala.xSv.readString();
        GMTrace.o(3902380441600L, 29075);
        return 0;
      }
      GMTrace.o(3902380441600L, 29075);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/dp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */