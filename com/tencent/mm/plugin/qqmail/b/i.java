package com.tencent.mm.plugin.qqmail.b;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class i
  extends com.tencent.mm.bl.a
{
  public String name;
  public String nke;
  public int oFk;
  public int oFl;
  public String oFm;
  
  public i()
  {
    GMTrace.i(5449373974528L, 40601);
    GMTrace.o(5449373974528L, 40601);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(5449508192256L, 40602);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.name == null) {
        throw new b("Not all required fields were included: name");
      }
      if (this.nke == null) {
        throw new b("Not all required fields were included: addr");
      }
      paramVarArgs.fd(1, this.oFk);
      if (this.name != null) {
        paramVarArgs.e(2, this.name);
      }
      if (this.nke != null) {
        paramVarArgs.e(3, this.nke);
      }
      paramVarArgs.fd(4, this.oFl);
      if (this.oFm != null) {
        paramVarArgs.e(5, this.oFm);
      }
      GMTrace.o(5449508192256L, 40602);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.oFk) + 0;
      paramInt = i;
      if (this.name != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.name);
      }
      i = paramInt;
      if (this.nke != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.nke);
      }
      i += b.a.a.a.fa(4, this.oFl);
      paramInt = i;
      if (this.oFm != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.oFm);
      }
      GMTrace.o(5449508192256L, 40602);
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
      if (this.name == null) {
        throw new b("Not all required fields were included: name");
      }
      if (this.nke == null) {
        throw new b("Not all required fields were included: addr");
      }
      GMTrace.o(5449508192256L, 40602);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      i locali = (i)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(5449508192256L, 40602);
        return -1;
      case 1: 
        locali.oFk = locala.xSv.nm();
        GMTrace.o(5449508192256L, 40602);
        return 0;
      case 2: 
        locali.name = locala.xSv.readString();
        GMTrace.o(5449508192256L, 40602);
        return 0;
      case 3: 
        locali.nke = locala.xSv.readString();
        GMTrace.o(5449508192256L, 40602);
        return 0;
      case 4: 
        locali.oFl = locala.xSv.nm();
        GMTrace.o(5449508192256L, 40602);
        return 0;
      }
      locali.oFm = locala.xSv.readString();
      GMTrace.o(5449508192256L, 40602);
      return 0;
    }
    GMTrace.o(5449508192256L, 40602);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */