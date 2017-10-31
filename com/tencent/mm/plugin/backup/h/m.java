package com.tencent.mm.plugin.backup.h;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class m
  extends com.tencent.mm.bl.a
{
  public String jWZ;
  public String jXa;
  public String jXb;
  public String jXc;
  public String jXd;
  public int jXe;
  public long jXf;
  
  public m()
  {
    GMTrace.i(14832535339008L, 110511);
    GMTrace.o(14832535339008L, 110511);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14832669556736L, 110512);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jWZ == null) {
        throw new b("Not all required fields were included: DeviceID");
      }
      if (this.jXa == null) {
        throw new b("Not all required fields were included: DeviceName");
      }
      if (this.jXb == null) {
        throw new b("Not all required fields were included: Model");
      }
      if (this.jXc == null) {
        throw new b("Not all required fields were included: SystemName");
      }
      if (this.jXd == null) {
        throw new b("Not all required fields were included: SystemVersion");
      }
      if (this.jWZ != null) {
        paramVarArgs.e(1, this.jWZ);
      }
      if (this.jXa != null) {
        paramVarArgs.e(2, this.jXa);
      }
      if (this.jXb != null) {
        paramVarArgs.e(3, this.jXb);
      }
      if (this.jXc != null) {
        paramVarArgs.e(4, this.jXc);
      }
      if (this.jXd != null) {
        paramVarArgs.e(5, this.jXd);
      }
      paramVarArgs.fd(6, this.jXe);
      paramVarArgs.R(7, this.jXf);
      GMTrace.o(14832669556736L, 110512);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jWZ == null) {
        break label757;
      }
    }
    label757:
    for (int i = b.a.a.b.b.a.f(1, this.jWZ) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jXa != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jXa);
      }
      i = paramInt;
      if (this.jXb != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.jXb);
      }
      paramInt = i;
      if (this.jXc != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.jXc);
      }
      i = paramInt;
      if (this.jXd != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.jXd);
      }
      paramInt = b.a.a.a.fa(6, this.jXe);
      int j = b.a.a.a.Q(7, this.jXf);
      GMTrace.o(14832669556736L, 110512);
      return i + paramInt + j;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.jWZ == null) {
          throw new b("Not all required fields were included: DeviceID");
        }
        if (this.jXa == null) {
          throw new b("Not all required fields were included: DeviceName");
        }
        if (this.jXb == null) {
          throw new b("Not all required fields were included: Model");
        }
        if (this.jXc == null) {
          throw new b("Not all required fields were included: SystemName");
        }
        if (this.jXd == null) {
          throw new b("Not all required fields were included: SystemVersion");
        }
        GMTrace.o(14832669556736L, 110512);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        m localm = (m)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(14832669556736L, 110512);
          return -1;
        case 1: 
          localm.jWZ = locala.xSv.readString();
          GMTrace.o(14832669556736L, 110512);
          return 0;
        case 2: 
          localm.jXa = locala.xSv.readString();
          GMTrace.o(14832669556736L, 110512);
          return 0;
        case 3: 
          localm.jXb = locala.xSv.readString();
          GMTrace.o(14832669556736L, 110512);
          return 0;
        case 4: 
          localm.jXc = locala.xSv.readString();
          GMTrace.o(14832669556736L, 110512);
          return 0;
        case 5: 
          localm.jXd = locala.xSv.readString();
          GMTrace.o(14832669556736L, 110512);
          return 0;
        case 6: 
          localm.jXe = locala.xSv.nm();
          GMTrace.o(14832669556736L, 110512);
          return 0;
        }
        localm.jXf = locala.xSv.nn();
        GMTrace.o(14832669556736L, 110512);
        return 0;
      }
      GMTrace.o(14832669556736L, 110512);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/h/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */