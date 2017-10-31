package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bpy
  extends com.tencent.mm.bl.a
{
  public String jWW;
  public String jYc;
  public int mGz;
  public String ovi;
  public com.tencent.mm.bl.b uFD;
  
  public bpy()
  {
    GMTrace.i(3729776443392L, 27789);
    GMTrace.o(3729776443392L, 27789);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3729910661120L, 27790);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jWW == null) {
        throw new b.a.a.b("Not all required fields were included: UserName");
      }
      if (this.jYc == null) {
        throw new b.a.a.b("Not all required fields were included: NickName");
      }
      if (this.ovi == null) {
        throw new b.a.a.b("Not all required fields were included: Content");
      }
      paramVarArgs.fd(1, this.mGz);
      if (this.jWW != null) {
        paramVarArgs.e(2, this.jWW);
      }
      if (this.jYc != null) {
        paramVarArgs.e(3, this.jYc);
      }
      if (this.ovi != null) {
        paramVarArgs.e(4, this.ovi);
      }
      if (this.uFD != null) {
        paramVarArgs.b(5, this.uFD);
      }
      GMTrace.o(3729910661120L, 27790);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.mGz) + 0;
      paramInt = i;
      if (this.jWW != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jWW);
      }
      i = paramInt;
      if (this.jYc != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.jYc);
      }
      paramInt = i;
      if (this.ovi != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ovi);
      }
      i = paramInt;
      if (this.uFD != null) {
        i = paramInt + b.a.a.a.a(5, this.uFD);
      }
      GMTrace.o(3729910661120L, 27790);
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
      if (this.jWW == null) {
        throw new b.a.a.b("Not all required fields were included: UserName");
      }
      if (this.jYc == null) {
        throw new b.a.a.b("Not all required fields were included: NickName");
      }
      if (this.ovi == null) {
        throw new b.a.a.b("Not all required fields were included: Content");
      }
      GMTrace.o(3729910661120L, 27790);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bpy localbpy = (bpy)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3729910661120L, 27790);
        return -1;
      case 1: 
        localbpy.mGz = locala.xSv.nm();
        GMTrace.o(3729910661120L, 27790);
        return 0;
      case 2: 
        localbpy.jWW = locala.xSv.readString();
        GMTrace.o(3729910661120L, 27790);
        return 0;
      case 3: 
        localbpy.jYc = locala.xSv.readString();
        GMTrace.o(3729910661120L, 27790);
        return 0;
      case 4: 
        localbpy.ovi = locala.xSv.readString();
        GMTrace.o(3729910661120L, 27790);
        return 0;
      }
      localbpy.uFD = locala.cpI();
      GMTrace.o(3729910661120L, 27790);
      return 0;
    }
    GMTrace.o(3729910661120L, 27790);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bpy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */