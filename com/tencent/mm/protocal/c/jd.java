package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class jd
  extends com.tencent.mm.bl.a
{
  public int kpb;
  public String text;
  public String url;
  
  public jd()
  {
    GMTrace.i(3804267282432L, 28344);
    GMTrace.o(3804267282432L, 28344);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3804401500160L, 28345);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.kpb);
      if (this.text != null) {
        paramVarArgs.e(2, this.text);
      }
      if (this.url != null) {
        paramVarArgs.e(3, this.url);
      }
      GMTrace.o(3804401500160L, 28345);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.kpb) + 0;
      paramInt = i;
      if (this.text != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.text);
      }
      i = paramInt;
      if (this.url != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.url);
      }
      GMTrace.o(3804401500160L, 28345);
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
      GMTrace.o(3804401500160L, 28345);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      jd localjd = (jd)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3804401500160L, 28345);
        return -1;
      case 1: 
        localjd.kpb = locala.xSv.nm();
        GMTrace.o(3804401500160L, 28345);
        return 0;
      case 2: 
        localjd.text = locala.xSv.readString();
        GMTrace.o(3804401500160L, 28345);
        return 0;
      }
      localjd.url = locala.xSv.readString();
      GMTrace.o(3804401500160L, 28345);
      return 0;
    }
    GMTrace.o(3804401500160L, 28345);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/jd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */