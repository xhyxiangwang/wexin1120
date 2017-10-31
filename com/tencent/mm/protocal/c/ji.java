package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ji
  extends com.tencent.mm.bl.a
{
  public String country;
  public String descriptor;
  public float fFh;
  public float fGL;
  public String gbW;
  public String gbX;
  public String hwK;
  public String knH;
  public String kpe;
  public String name;
  public float tEK;
  public String tEL;
  public String tEM;
  
  public ji()
  {
    GMTrace.i(3844129947648L, 28641);
    GMTrace.o(3844129947648L, 28641);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3844264165376L, 28642);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.name != null) {
        paramVarArgs.e(1, this.name);
      }
      if (this.descriptor != null) {
        paramVarArgs.e(2, this.descriptor);
      }
      if (this.knH != null) {
        paramVarArgs.e(3, this.knH);
      }
      if (this.country != null) {
        paramVarArgs.e(4, this.country);
      }
      if (this.gbW != null) {
        paramVarArgs.e(5, this.gbW);
      }
      if (this.gbX != null) {
        paramVarArgs.e(6, this.gbX);
      }
      if (this.hwK != null) {
        paramVarArgs.e(7, this.hwK);
      }
      paramVarArgs.n(8, this.tEK);
      paramVarArgs.n(9, this.fGL);
      paramVarArgs.n(10, this.fFh);
      if (this.kpe != null) {
        paramVarArgs.e(11, this.kpe);
      }
      if (this.tEL != null) {
        paramVarArgs.e(12, this.tEL);
      }
      if (this.tEM != null) {
        paramVarArgs.e(13, this.tEM);
      }
      GMTrace.o(3844264165376L, 28642);
      return 0;
    }
    if (paramInt == 1) {
      if (this.name == null) {
        break label970;
      }
    }
    label970:
    for (int i = b.a.a.b.b.a.f(1, this.name) + 0;; i = 0)
    {
      paramInt = i;
      if (this.descriptor != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.descriptor);
      }
      i = paramInt;
      if (this.knH != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.knH);
      }
      paramInt = i;
      if (this.country != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.country);
      }
      i = paramInt;
      if (this.gbW != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.gbW);
      }
      paramInt = i;
      if (this.gbX != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.gbX);
      }
      i = paramInt;
      if (this.hwK != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.hwK);
      }
      i = i + (b.a.a.b.b.a.cK(8) + 4) + (b.a.a.b.b.a.cK(9) + 4) + (b.a.a.b.b.a.cK(10) + 4);
      paramInt = i;
      if (this.kpe != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.kpe);
      }
      i = paramInt;
      if (this.tEL != null) {
        i = paramInt + b.a.a.b.b.a.f(12, this.tEL);
      }
      paramInt = i;
      if (this.tEM != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.tEM);
      }
      GMTrace.o(3844264165376L, 28642);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3844264165376L, 28642);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ji localji = (ji)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3844264165376L, 28642);
          return -1;
        case 1: 
          localji.name = locala.xSv.readString();
          GMTrace.o(3844264165376L, 28642);
          return 0;
        case 2: 
          localji.descriptor = locala.xSv.readString();
          GMTrace.o(3844264165376L, 28642);
          return 0;
        case 3: 
          localji.knH = locala.xSv.readString();
          GMTrace.o(3844264165376L, 28642);
          return 0;
        case 4: 
          localji.country = locala.xSv.readString();
          GMTrace.o(3844264165376L, 28642);
          return 0;
        case 5: 
          localji.gbW = locala.xSv.readString();
          GMTrace.o(3844264165376L, 28642);
          return 0;
        case 6: 
          localji.gbX = locala.xSv.readString();
          GMTrace.o(3844264165376L, 28642);
          return 0;
        case 7: 
          localji.hwK = locala.xSv.readString();
          GMTrace.o(3844264165376L, 28642);
          return 0;
        case 8: 
          localji.tEK = locala.xSv.readFloat();
          GMTrace.o(3844264165376L, 28642);
          return 0;
        case 9: 
          localji.fGL = locala.xSv.readFloat();
          GMTrace.o(3844264165376L, 28642);
          return 0;
        case 10: 
          localji.fFh = locala.xSv.readFloat();
          GMTrace.o(3844264165376L, 28642);
          return 0;
        case 11: 
          localji.kpe = locala.xSv.readString();
          GMTrace.o(3844264165376L, 28642);
          return 0;
        case 12: 
          localji.tEL = locala.xSv.readString();
          GMTrace.o(3844264165376L, 28642);
          return 0;
        }
        localji.tEM = locala.xSv.readString();
        GMTrace.o(3844264165376L, 28642);
        return 0;
      }
      GMTrace.o(3844264165376L, 28642);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ji.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */