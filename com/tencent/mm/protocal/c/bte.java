package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bte
  extends com.tencent.mm.bl.a
{
  public String fKY;
  public int type;
  public String uHP;
  public String uHQ;
  public int uHR;
  public int uHS;
  
  public bte()
  {
    GMTrace.i(4029484630016L, 30022);
    GMTrace.o(4029484630016L, 30022);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4029618847744L, 30023);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.type);
      if (this.fKY != null) {
        paramVarArgs.e(2, this.fKY);
      }
      if (this.uHP != null) {
        paramVarArgs.e(3, this.uHP);
      }
      if (this.uHQ != null) {
        paramVarArgs.e(4, this.uHQ);
      }
      paramVarArgs.fd(5, this.uHR);
      paramVarArgs.fd(6, this.uHS);
      GMTrace.o(4029618847744L, 30023);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.type) + 0;
      paramInt = i;
      if (this.fKY != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.fKY);
      }
      i = paramInt;
      if (this.uHP != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uHP);
      }
      paramInt = i;
      if (this.uHQ != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uHQ);
      }
      i = b.a.a.a.fa(5, this.uHR);
      int j = b.a.a.a.fa(6, this.uHS);
      GMTrace.o(4029618847744L, 30023);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(4029618847744L, 30023);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bte localbte = (bte)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4029618847744L, 30023);
        return -1;
      case 1: 
        localbte.type = locala.xSv.nm();
        GMTrace.o(4029618847744L, 30023);
        return 0;
      case 2: 
        localbte.fKY = locala.xSv.readString();
        GMTrace.o(4029618847744L, 30023);
        return 0;
      case 3: 
        localbte.uHP = locala.xSv.readString();
        GMTrace.o(4029618847744L, 30023);
        return 0;
      case 4: 
        localbte.uHQ = locala.xSv.readString();
        GMTrace.o(4029618847744L, 30023);
        return 0;
      case 5: 
        localbte.uHR = locala.xSv.nm();
        GMTrace.o(4029618847744L, 30023);
        return 0;
      }
      localbte.uHS = locala.xSv.nm();
      GMTrace.o(4029618847744L, 30023);
      return 0;
    }
    GMTrace.o(4029618847744L, 30023);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bte.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */