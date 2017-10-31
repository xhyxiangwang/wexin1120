package com.tencent.mm.plugin.order.model;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class i
  extends com.tencent.mm.bl.a
{
  public String mFw;
  public String orR;
  public double orS;
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
  public LinkedList<k> osg;
  public String osh;
  public String osi;
  public double osj;
  public String osk;
  
  public i()
  {
    GMTrace.i(6628745150464L, 49388);
    this.osg = new LinkedList();
    GMTrace.o(6628745150464L, 49388);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(6628879368192L, 49389);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.orR != null) {
        paramVarArgs.e(1, this.orR);
      }
      paramVarArgs.a(2, this.orS);
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
      if (this.osh != null) {
        paramVarArgs.e(18, this.osh);
      }
      if (this.osi != null) {
        paramVarArgs.e(19, this.osi);
      }
      paramVarArgs.a(20, this.osj);
      if (this.osk != null) {
        paramVarArgs.e(21, this.osk);
      }
      GMTrace.o(6628879368192L, 49389);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.orR != null) {
        paramInt = b.a.a.b.b.a.f(1, this.orR) + 0;
      }
      i = paramInt + (b.a.a.b.b.a.cK(2) + 8);
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
      i = i + b.a.a.a.fa(16, this.osf) + b.a.a.a.c(17, 8, this.osg);
      paramInt = i;
      if (this.osh != null) {
        paramInt = i + b.a.a.b.b.a.f(18, this.osh);
      }
      i = paramInt;
      if (this.osi != null) {
        i = paramInt + b.a.a.b.b.a.f(19, this.osi);
      }
      i += b.a.a.b.b.a.cK(20) + 8;
      paramInt = i;
      if (this.osk != null) {
        paramInt = i + b.a.a.b.b.a.f(21, this.osk);
      }
      GMTrace.o(6628879368192L, 49389);
      return paramInt;
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
      GMTrace.o(6628879368192L, 49389);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      i locali = (i)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(6628879368192L, 49389);
        return -1;
      case 1: 
        locali.orR = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 2: 
        locali.orS = ((b.a.a.a.a)localObject1).xSv.readDouble();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 3: 
        locali.orT = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 4: 
        locali.orU = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 5: 
        locali.orV = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 6: 
        locali.orW = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 7: 
        locali.orX = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 8: 
        locali.orY = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 9: 
        locali.orZ = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 10: 
        locali.osa = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 11: 
        locali.mFw = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 12: 
        locali.osb = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 13: 
        locali.osc = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 14: 
        locali.osd = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 15: 
        locali.ose = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 16: 
        locali.osf = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 17: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new k();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((k)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          locali.osg.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 18: 
        locali.osh = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 19: 
        locali.osi = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 20: 
        locali.osj = ((b.a.a.a.a)localObject1).xSv.readDouble();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      }
      locali.osk = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(6628879368192L, 49389);
      return 0;
    }
    GMTrace.o(6628879368192L, 49389);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/order/model/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */