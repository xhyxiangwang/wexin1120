package com.tencent.mm.plugin.backup.h;

import com.tencent.gmtrace.GMTrace;

public final class u
  extends com.tencent.mm.bl.a
{
  public String gpn;
  public int jXK;
  public int jXL;
  public long jXM;
  public String mediaId;
  public String path;
  public int type;
  
  public u()
  {
    GMTrace.i(9556302233600L, 71200);
    GMTrace.o(9556302233600L, 71200);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(9556436451328L, 71201);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.jXK);
      if (this.gpn != null) {
        paramVarArgs.e(2, this.gpn);
      }
      if (this.mediaId != null) {
        paramVarArgs.e(3, this.mediaId);
      }
      if (this.path != null) {
        paramVarArgs.e(4, this.path);
      }
      paramVarArgs.fd(5, this.type);
      paramVarArgs.fd(6, this.jXL);
      paramVarArgs.R(7, this.jXM);
      GMTrace.o(9556436451328L, 71201);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.jXK) + 0;
      paramInt = i;
      if (this.gpn != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.gpn);
      }
      i = paramInt;
      if (this.mediaId != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.mediaId);
      }
      paramInt = i;
      if (this.path != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.path);
      }
      i = b.a.a.a.fa(5, this.type);
      int j = b.a.a.a.fa(6, this.jXL);
      int k = b.a.a.a.Q(7, this.jXM);
      GMTrace.o(9556436451328L, 71201);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(9556436451328L, 71201);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      u localu = (u)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(9556436451328L, 71201);
        return -1;
      case 1: 
        localu.jXK = locala.xSv.nm();
        GMTrace.o(9556436451328L, 71201);
        return 0;
      case 2: 
        localu.gpn = locala.xSv.readString();
        GMTrace.o(9556436451328L, 71201);
        return 0;
      case 3: 
        localu.mediaId = locala.xSv.readString();
        GMTrace.o(9556436451328L, 71201);
        return 0;
      case 4: 
        localu.path = locala.xSv.readString();
        GMTrace.o(9556436451328L, 71201);
        return 0;
      case 5: 
        localu.type = locala.xSv.nm();
        GMTrace.o(9556436451328L, 71201);
        return 0;
      case 6: 
        localu.jXL = locala.xSv.nm();
        GMTrace.o(9556436451328L, 71201);
        return 0;
      }
      localu.jXM = locala.xSv.nn();
      GMTrace.o(9556436451328L, 71201);
      return 0;
    }
    GMTrace.o(9556436451328L, 71201);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/h/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */