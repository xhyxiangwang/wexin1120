package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class jh
  extends com.tencent.mm.bl.a
{
  public int bzG;
  public int pwk;
  public String tEJ;
  public String text;
  public int type;
  public String url;
  
  public jh()
  {
    GMTrace.i(3697966841856L, 27552);
    GMTrace.o(3697966841856L, 27552);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3698101059584L, 27553);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.type);
      if (this.text != null) {
        paramVarArgs.e(2, this.text);
      }
      if (this.url != null) {
        paramVarArgs.e(3, this.url);
      }
      paramVarArgs.fd(4, this.pwk);
      paramVarArgs.fd(5, this.bzG);
      if (this.tEJ != null) {
        paramVarArgs.e(6, this.tEJ);
      }
      GMTrace.o(3698101059584L, 27553);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.type) + 0;
      paramInt = i;
      if (this.text != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.text);
      }
      i = paramInt;
      if (this.url != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.url);
      }
      i = i + b.a.a.a.fa(4, this.pwk) + b.a.a.a.fa(5, this.bzG);
      paramInt = i;
      if (this.tEJ != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tEJ);
      }
      GMTrace.o(3698101059584L, 27553);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3698101059584L, 27553);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      jh localjh = (jh)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3698101059584L, 27553);
        return -1;
      case 1: 
        localjh.type = locala.xSv.nm();
        GMTrace.o(3698101059584L, 27553);
        return 0;
      case 2: 
        localjh.text = locala.xSv.readString();
        GMTrace.o(3698101059584L, 27553);
        return 0;
      case 3: 
        localjh.url = locala.xSv.readString();
        GMTrace.o(3698101059584L, 27553);
        return 0;
      case 4: 
        localjh.pwk = locala.xSv.nm();
        GMTrace.o(3698101059584L, 27553);
        return 0;
      case 5: 
        localjh.bzG = locala.xSv.nm();
        GMTrace.o(3698101059584L, 27553);
        return 0;
      }
      localjh.tEJ = locala.xSv.readString();
      GMTrace.o(3698101059584L, 27553);
      return 0;
    }
    GMTrace.o(3698101059584L, 27553);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/jh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */