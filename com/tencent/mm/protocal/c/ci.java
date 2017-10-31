package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class ci
  extends com.tencent.mm.bl.a
{
  public String fEM;
  public int type;
  public String url;
  
  public ci()
  {
    GMTrace.i(16868215619584L, 125678);
    GMTrace.o(16868215619584L, 125678);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16868349837312L, 125679);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fEM == null) {
        throw new b("Not all required fields were included: wording");
      }
      if (this.url == null) {
        throw new b("Not all required fields were included: url");
      }
      paramVarArgs.fd(1, this.type);
      if (this.fEM != null) {
        paramVarArgs.e(2, this.fEM);
      }
      if (this.url != null) {
        paramVarArgs.e(3, this.url);
      }
      GMTrace.o(16868349837312L, 125679);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.type) + 0;
      paramInt = i;
      if (this.fEM != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.fEM);
      }
      i = paramInt;
      if (this.url != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.url);
      }
      GMTrace.o(16868349837312L, 125679);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.fEM == null) {
        throw new b("Not all required fields were included: wording");
      }
      if (this.url == null) {
        throw new b("Not all required fields were included: url");
      }
      GMTrace.o(16868349837312L, 125679);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ci localci = (ci)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(16868349837312L, 125679);
        return -1;
      case 1: 
        localci.type = locala.xSv.nm();
        GMTrace.o(16868349837312L, 125679);
        return 0;
      case 2: 
        localci.fEM = locala.xSv.readString();
        GMTrace.o(16868349837312L, 125679);
        return 0;
      }
      localci.url = locala.xSv.readString();
      GMTrace.o(16868349837312L, 125679);
      return 0;
    }
    GMTrace.o(16868349837312L, 125679);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */