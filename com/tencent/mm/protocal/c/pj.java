package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class pj
  extends com.tencent.mm.bl.a
{
  public String desc;
  public String tLg;
  public String title;
  
  public pj()
  {
    GMTrace.i(17870822047744L, 133148);
    GMTrace.o(17870822047744L, 133148);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17870956265472L, 133149);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.e(1, this.title);
      }
      if (this.desc != null) {
        paramVarArgs.e(2, this.desc);
      }
      if (this.tLg != null) {
        paramVarArgs.e(3, this.tLg);
      }
      GMTrace.o(17870956265472L, 133149);
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label361;
      }
    }
    label361:
    for (int i = b.a.a.b.b.a.f(1, this.title) + 0;; i = 0)
    {
      paramInt = i;
      if (this.desc != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.desc);
      }
      i = paramInt;
      if (this.tLg != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tLg);
      }
      GMTrace.o(17870956265472L, 133149);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(17870956265472L, 133149);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        pj localpj = (pj)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(17870956265472L, 133149);
          return -1;
        case 1: 
          localpj.title = locala.xSv.readString();
          GMTrace.o(17870956265472L, 133149);
          return 0;
        case 2: 
          localpj.desc = locala.xSv.readString();
          GMTrace.o(17870956265472L, 133149);
          return 0;
        }
        localpj.tLg = locala.xSv.readString();
        GMTrace.o(17870956265472L, 133149);
        return 0;
      }
      GMTrace.o(17870956265472L, 133149);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/pj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */