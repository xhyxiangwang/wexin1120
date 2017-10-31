package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class amz
  extends com.tencent.mm.bl.a
{
  public String desc;
  public String knr;
  public String path;
  public String title;
  public String username;
  
  public amz()
  {
    GMTrace.i(17873774837760L, 133170);
    GMTrace.o(17873774837760L, 133170);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17873909055488L, 133171);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.knr != null) {
        paramVarArgs.e(1, this.knr);
      }
      if (this.title != null) {
        paramVarArgs.e(2, this.title);
      }
      if (this.desc != null) {
        paramVarArgs.e(3, this.desc);
      }
      if (this.username != null) {
        paramVarArgs.e(4, this.username);
      }
      if (this.path != null) {
        paramVarArgs.e(5, this.path);
      }
      GMTrace.o(17873909055488L, 133171);
      return 0;
    }
    if (paramInt == 1) {
      if (this.knr == null) {
        break label487;
      }
    }
    label487:
    for (int i = b.a.a.b.b.a.f(1, this.knr) + 0;; i = 0)
    {
      paramInt = i;
      if (this.title != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.title);
      }
      i = paramInt;
      if (this.desc != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.desc);
      }
      paramInt = i;
      if (this.username != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.username);
      }
      i = paramInt;
      if (this.path != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.path);
      }
      GMTrace.o(17873909055488L, 133171);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(17873909055488L, 133171);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        amz localamz = (amz)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(17873909055488L, 133171);
          return -1;
        case 1: 
          localamz.knr = locala.xSv.readString();
          GMTrace.o(17873909055488L, 133171);
          return 0;
        case 2: 
          localamz.title = locala.xSv.readString();
          GMTrace.o(17873909055488L, 133171);
          return 0;
        case 3: 
          localamz.desc = locala.xSv.readString();
          GMTrace.o(17873909055488L, 133171);
          return 0;
        case 4: 
          localamz.username = locala.xSv.readString();
          GMTrace.o(17873909055488L, 133171);
          return 0;
        }
        localamz.path = locala.xSv.readString();
        GMTrace.o(17873909055488L, 133171);
        return 0;
      }
      GMTrace.o(17873909055488L, 133171);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/amz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */