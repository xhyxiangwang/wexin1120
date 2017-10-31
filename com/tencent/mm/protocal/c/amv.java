package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class amv
  extends com.tencent.mm.bl.a
{
  public String fEM;
  public int type;
  public String uiO;
  public String uiP;
  public String uiQ;
  public int uiR;
  public String url;
  
  public amv()
  {
    GMTrace.i(17872164225024L, 133158);
    GMTrace.o(17872164225024L, 133158);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17872298442752L, 133159);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fEM == null) {
        throw new b("Not all required fields were included: wording");
      }
      paramVarArgs.fd(1, this.type);
      if (this.fEM != null) {
        paramVarArgs.e(2, this.fEM);
      }
      if (this.url != null) {
        paramVarArgs.e(3, this.url);
      }
      if (this.uiO != null) {
        paramVarArgs.e(4, this.uiO);
      }
      if (this.uiP != null) {
        paramVarArgs.e(5, this.uiP);
      }
      if (this.uiQ != null) {
        paramVarArgs.e(7, this.uiQ);
      }
      paramVarArgs.fd(8, this.uiR);
      GMTrace.o(17872298442752L, 133159);
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
      paramInt = i;
      if (this.uiO != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uiO);
      }
      i = paramInt;
      if (this.uiP != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uiP);
      }
      paramInt = i;
      if (this.uiQ != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.uiQ);
      }
      i = b.a.a.a.fa(8, this.uiR);
      GMTrace.o(17872298442752L, 133159);
      return paramInt + i;
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
      GMTrace.o(17872298442752L, 133159);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      amv localamv = (amv)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      case 6: 
      default: 
        GMTrace.o(17872298442752L, 133159);
        return -1;
      case 1: 
        localamv.type = locala.xSv.nm();
        GMTrace.o(17872298442752L, 133159);
        return 0;
      case 2: 
        localamv.fEM = locala.xSv.readString();
        GMTrace.o(17872298442752L, 133159);
        return 0;
      case 3: 
        localamv.url = locala.xSv.readString();
        GMTrace.o(17872298442752L, 133159);
        return 0;
      case 4: 
        localamv.uiO = locala.xSv.readString();
        GMTrace.o(17872298442752L, 133159);
        return 0;
      case 5: 
        localamv.uiP = locala.xSv.readString();
        GMTrace.o(17872298442752L, 133159);
        return 0;
      case 7: 
        localamv.uiQ = locala.xSv.readString();
        GMTrace.o(17872298442752L, 133159);
        return 0;
      }
      localamv.uiR = locala.xSv.nm();
      GMTrace.o(17872298442752L, 133159);
      return 0;
    }
    GMTrace.o(17872298442752L, 133159);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/amv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */