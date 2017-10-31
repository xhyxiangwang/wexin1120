package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class ui
  extends com.tencent.mm.bl.a
{
  public int bzG;
  public String fuw;
  public String mCK;
  public String mDD;
  public String mFw;
  public String osy;
  public String tSb;
  public int tSw;
  public int tSx;
  
  public ui()
  {
    GMTrace.i(3990427271168L, 29731);
    GMTrace.o(3990427271168L, 29731);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3990561488896L, 29732);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fuw == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.mCK == null) {
        throw new b("Not all required fields were included: Desc");
      }
      if (this.osy == null) {
        throw new b("Not all required fields were included: ThumbUrl");
      }
      if (this.fuw != null) {
        paramVarArgs.e(1, this.fuw);
      }
      if (this.mCK != null) {
        paramVarArgs.e(2, this.mCK);
      }
      if (this.osy != null) {
        paramVarArgs.e(3, this.osy);
      }
      if (this.tSb != null) {
        paramVarArgs.e(4, this.tSb);
      }
      paramVarArgs.fd(5, this.tSw);
      paramVarArgs.fd(6, this.tSx);
      if (this.mDD != null) {
        paramVarArgs.e(7, this.mDD);
      }
      paramVarArgs.fd(8, this.bzG);
      if (this.mFw != null) {
        paramVarArgs.e(9, this.mFw);
      }
      GMTrace.o(3990561488896L, 29732);
      return 0;
    }
    if (paramInt == 1) {
      if (this.fuw == null) {
        break label814;
      }
    }
    label814:
    for (int i = b.a.a.b.b.a.f(1, this.fuw) + 0;; i = 0)
    {
      paramInt = i;
      if (this.mCK != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mCK);
      }
      i = paramInt;
      if (this.osy != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.osy);
      }
      paramInt = i;
      if (this.tSb != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tSb);
      }
      i = paramInt + b.a.a.a.fa(5, this.tSw) + b.a.a.a.fa(6, this.tSx);
      paramInt = i;
      if (this.mDD != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.mDD);
      }
      i = paramInt + b.a.a.a.fa(8, this.bzG);
      paramInt = i;
      if (this.mFw != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.mFw);
      }
      GMTrace.o(3990561488896L, 29732);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.fuw == null) {
          throw new b("Not all required fields were included: Title");
        }
        if (this.mCK == null) {
          throw new b("Not all required fields were included: Desc");
        }
        if (this.osy == null) {
          throw new b("Not all required fields were included: ThumbUrl");
        }
        GMTrace.o(3990561488896L, 29732);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ui localui = (ui)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3990561488896L, 29732);
          return -1;
        case 1: 
          localui.fuw = locala.xSv.readString();
          GMTrace.o(3990561488896L, 29732);
          return 0;
        case 2: 
          localui.mCK = locala.xSv.readString();
          GMTrace.o(3990561488896L, 29732);
          return 0;
        case 3: 
          localui.osy = locala.xSv.readString();
          GMTrace.o(3990561488896L, 29732);
          return 0;
        case 4: 
          localui.tSb = locala.xSv.readString();
          GMTrace.o(3990561488896L, 29732);
          return 0;
        case 5: 
          localui.tSw = locala.xSv.nm();
          GMTrace.o(3990561488896L, 29732);
          return 0;
        case 6: 
          localui.tSx = locala.xSv.nm();
          GMTrace.o(3990561488896L, 29732);
          return 0;
        case 7: 
          localui.mDD = locala.xSv.readString();
          GMTrace.o(3990561488896L, 29732);
          return 0;
        case 8: 
          localui.bzG = locala.xSv.nm();
          GMTrace.o(3990561488896L, 29732);
          return 0;
        }
        localui.mFw = locala.xSv.readString();
        GMTrace.o(3990561488896L, 29732);
        return 0;
      }
      GMTrace.o(3990561488896L, 29732);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ui.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */