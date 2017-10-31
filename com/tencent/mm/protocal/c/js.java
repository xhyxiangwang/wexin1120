package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public class js
  extends com.tencent.mm.bl.a
{
  public String kns;
  public String kqV;
  public String oqo;
  public String tEL;
  public String tEM;
  public long tFX;
  public String tFY;
  public String tFZ;
  public String title;
  public String url;
  
  public js()
  {
    GMTrace.i(3684410851328L, 27451);
    GMTrace.o(3684410851328L, 27451);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3684545069056L, 27452);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.e(1, this.title);
      }
      if (this.kns != null) {
        paramVarArgs.e(2, this.kns);
      }
      if (this.kqV != null) {
        paramVarArgs.e(3, this.kqV);
      }
      if (this.url != null) {
        paramVarArgs.e(4, this.url);
      }
      paramVarArgs.R(5, this.tFX);
      if (this.tFY != null) {
        paramVarArgs.e(6, this.tFY);
      }
      if (this.tFZ != null) {
        paramVarArgs.e(7, this.tFZ);
      }
      if (this.oqo != null) {
        paramVarArgs.e(8, this.oqo);
      }
      if (this.tEL != null) {
        paramVarArgs.e(9, this.tEL);
      }
      if (this.tEM != null) {
        paramVarArgs.e(10, this.tEM);
      }
      GMTrace.o(3684545069056L, 27452);
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label814;
      }
    }
    label814:
    for (int i = b.a.a.b.b.a.f(1, this.title) + 0;; i = 0)
    {
      paramInt = i;
      if (this.kns != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.kns);
      }
      i = paramInt;
      if (this.kqV != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.kqV);
      }
      paramInt = i;
      if (this.url != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.url);
      }
      i = paramInt + b.a.a.a.Q(5, this.tFX);
      paramInt = i;
      if (this.tFY != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tFY);
      }
      i = paramInt;
      if (this.tFZ != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.tFZ);
      }
      paramInt = i;
      if (this.oqo != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.oqo);
      }
      i = paramInt;
      if (this.tEL != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.tEL);
      }
      paramInt = i;
      if (this.tEM != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.tEM);
      }
      GMTrace.o(3684545069056L, 27452);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3684545069056L, 27452);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        js localjs = (js)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3684545069056L, 27452);
          return -1;
        case 1: 
          localjs.title = locala.xSv.readString();
          GMTrace.o(3684545069056L, 27452);
          return 0;
        case 2: 
          localjs.kns = locala.xSv.readString();
          GMTrace.o(3684545069056L, 27452);
          return 0;
        case 3: 
          localjs.kqV = locala.xSv.readString();
          GMTrace.o(3684545069056L, 27452);
          return 0;
        case 4: 
          localjs.url = locala.xSv.readString();
          GMTrace.o(3684545069056L, 27452);
          return 0;
        case 5: 
          localjs.tFX = locala.xSv.nn();
          GMTrace.o(3684545069056L, 27452);
          return 0;
        case 6: 
          localjs.tFY = locala.xSv.readString();
          GMTrace.o(3684545069056L, 27452);
          return 0;
        case 7: 
          localjs.tFZ = locala.xSv.readString();
          GMTrace.o(3684545069056L, 27452);
          return 0;
        case 8: 
          localjs.oqo = locala.xSv.readString();
          GMTrace.o(3684545069056L, 27452);
          return 0;
        case 9: 
          localjs.tEL = locala.xSv.readString();
          GMTrace.o(3684545069056L, 27452);
          return 0;
        }
        localjs.tEM = locala.xSv.readString();
        GMTrace.o(3684545069056L, 27452);
        return 0;
      }
      GMTrace.o(3684545069056L, 27452);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/js.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */