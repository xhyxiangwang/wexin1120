package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bbr
  extends com.tencent.mm.bl.a
{
  public String fMv;
  public String fMw;
  public String knp;
  public String tsZ;
  public String tta;
  public int ttb;
  public String utW;
  
  public bbr()
  {
    GMTrace.i(4031632113664L, 30038);
    GMTrace.o(4031632113664L, 30038);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4031766331392L, 30039);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fMv != null) {
        paramVarArgs.e(1, this.fMv);
      }
      if (this.knp != null) {
        paramVarArgs.e(2, this.knp);
      }
      if (this.fMw != null) {
        paramVarArgs.e(3, this.fMw);
      }
      if (this.tsZ != null) {
        paramVarArgs.e(4, this.tsZ);
      }
      if (this.tta != null) {
        paramVarArgs.e(5, this.tta);
      }
      paramVarArgs.fd(6, this.ttb);
      if (this.utW != null) {
        paramVarArgs.e(7, this.utW);
      }
      GMTrace.o(4031766331392L, 30039);
      return 0;
    }
    if (paramInt == 1) {
      if (this.fMv == null) {
        break label614;
      }
    }
    label614:
    for (int i = b.a.a.b.b.a.f(1, this.fMv) + 0;; i = 0)
    {
      paramInt = i;
      if (this.knp != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.knp);
      }
      i = paramInt;
      if (this.fMw != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.fMw);
      }
      paramInt = i;
      if (this.tsZ != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tsZ);
      }
      i = paramInt;
      if (this.tta != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tta);
      }
      i += b.a.a.a.fa(6, this.ttb);
      paramInt = i;
      if (this.utW != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.utW);
      }
      GMTrace.o(4031766331392L, 30039);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(4031766331392L, 30039);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bbr localbbr = (bbr)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(4031766331392L, 30039);
          return -1;
        case 1: 
          localbbr.fMv = locala.xSv.readString();
          GMTrace.o(4031766331392L, 30039);
          return 0;
        case 2: 
          localbbr.knp = locala.xSv.readString();
          GMTrace.o(4031766331392L, 30039);
          return 0;
        case 3: 
          localbbr.fMw = locala.xSv.readString();
          GMTrace.o(4031766331392L, 30039);
          return 0;
        case 4: 
          localbbr.tsZ = locala.xSv.readString();
          GMTrace.o(4031766331392L, 30039);
          return 0;
        case 5: 
          localbbr.tta = locala.xSv.readString();
          GMTrace.o(4031766331392L, 30039);
          return 0;
        case 6: 
          localbbr.ttb = locala.xSv.nm();
          GMTrace.o(4031766331392L, 30039);
          return 0;
        }
        localbbr.utW = locala.xSv.readString();
        GMTrace.o(4031766331392L, 30039);
        return 0;
      }
      GMTrace.o(4031766331392L, 30039);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bbr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */