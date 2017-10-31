package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ark
  extends com.tencent.mm.bl.a
{
  public String mFw;
  public String orR;
  public String orT;
  public int orU;
  public String orV;
  public int orW;
  public String orX;
  public int orY;
  public int orZ;
  public String osa;
  public String osb;
  public String osc;
  public String osd;
  public String ose;
  public int osf;
  public LinkedList<bcf> osg;
  public int unx;
  
  public ark()
  {
    GMTrace.i(3851646140416L, 28697);
    this.osg = new LinkedList();
    GMTrace.o(3851646140416L, 28697);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3851780358144L, 28698);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.orR != null) {
        paramVarArgs.e(1, this.orR);
      }
      paramVarArgs.fd(2, this.unx);
      if (this.orT != null) {
        paramVarArgs.e(3, this.orT);
      }
      paramVarArgs.fd(4, this.orU);
      if (this.orV != null) {
        paramVarArgs.e(5, this.orV);
      }
      paramVarArgs.fd(6, this.orW);
      if (this.orX != null) {
        paramVarArgs.e(7, this.orX);
      }
      paramVarArgs.fd(8, this.orY);
      paramVarArgs.fd(9, this.orZ);
      if (this.osa != null) {
        paramVarArgs.e(10, this.osa);
      }
      if (this.mFw != null) {
        paramVarArgs.e(11, this.mFw);
      }
      if (this.osb != null) {
        paramVarArgs.e(12, this.osb);
      }
      if (this.osc != null) {
        paramVarArgs.e(13, this.osc);
      }
      if (this.osd != null) {
        paramVarArgs.e(14, this.osd);
      }
      if (this.ose != null) {
        paramVarArgs.e(15, this.ose);
      }
      paramVarArgs.fd(16, this.osf);
      paramVarArgs.d(17, 8, this.osg);
      GMTrace.o(3851780358144L, 28698);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.orR != null) {
        paramInt = b.a.a.b.b.a.f(1, this.orR) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.unx);
      paramInt = i;
      if (this.orT != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.orT);
      }
      i = paramInt + b.a.a.a.fa(4, this.orU);
      paramInt = i;
      if (this.orV != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.orV);
      }
      i = paramInt + b.a.a.a.fa(6, this.orW);
      paramInt = i;
      if (this.orX != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.orX);
      }
      i = paramInt + b.a.a.a.fa(8, this.orY) + b.a.a.a.fa(9, this.orZ);
      paramInt = i;
      if (this.osa != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.osa);
      }
      i = paramInt;
      if (this.mFw != null) {
        i = paramInt + b.a.a.b.b.a.f(11, this.mFw);
      }
      paramInt = i;
      if (this.osb != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.osb);
      }
      i = paramInt;
      if (this.osc != null) {
        i = paramInt + b.a.a.b.b.a.f(13, this.osc);
      }
      paramInt = i;
      if (this.osd != null) {
        paramInt = i + b.a.a.b.b.a.f(14, this.osd);
      }
      i = paramInt;
      if (this.ose != null) {
        i = paramInt + b.a.a.b.b.a.f(15, this.ose);
      }
      paramInt = b.a.a.a.fa(16, this.osf);
      int j = b.a.a.a.c(17, 8, this.osg);
      GMTrace.o(3851780358144L, 28698);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.osg.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3851780358144L, 28698);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ark localark = (ark)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3851780358144L, 28698);
        return -1;
      case 1: 
        localark.orR = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      case 2: 
        localark.unx = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      case 3: 
        localark.orT = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      case 4: 
        localark.orU = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      case 5: 
        localark.orV = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      case 6: 
        localark.orW = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      case 7: 
        localark.orX = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      case 8: 
        localark.orY = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      case 9: 
        localark.orZ = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      case 10: 
        localark.osa = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      case 11: 
        localark.mFw = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      case 12: 
        localark.osb = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      case 13: 
        localark.osc = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      case 14: 
        localark.osd = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      case 15: 
        localark.ose = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      case 16: 
        localark.osf = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bcf();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((bcf)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localark.osg.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3851780358144L, 28698);
      return 0;
    }
    GMTrace.o(3851780358144L, 28698);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ark.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */