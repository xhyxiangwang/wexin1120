package com.tencent.mm.plugin.collect.b;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public class s
  extends com.tencent.mm.bl.a
{
  public String fKK;
  public String fvV;
  public String gEW;
  public double kKX;
  public int kKY;
  public String kKZ;
  public int msgType;
  public int scene;
  public int status;
  public String username;
  
  public s()
  {
    GMTrace.i(5400787156992L, 40239);
    GMTrace.o(5400787156992L, 40239);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(5400921374720L, 40240);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.username == null) {
        throw new b("Not all required fields were included: username");
      }
      if (this.fKK == null) {
        throw new b("Not all required fields were included: transactionId");
      }
      if (this.fvV == null) {
        throw new b("Not all required fields were included: feeType");
      }
      if (this.username != null) {
        paramVarArgs.e(1, this.username);
      }
      if (this.fKK != null) {
        paramVarArgs.e(2, this.fKK);
      }
      paramVarArgs.a(3, this.kKX);
      if (this.fvV != null) {
        paramVarArgs.e(4, this.fvV);
      }
      paramVarArgs.fd(5, this.kKY);
      paramVarArgs.fd(6, this.scene);
      paramVarArgs.fd(7, this.status);
      if (this.gEW != null) {
        paramVarArgs.e(8, this.gEW);
      }
      if (this.kKZ != null) {
        paramVarArgs.e(9, this.kKZ);
      }
      paramVarArgs.fd(10, this.msgType);
      GMTrace.o(5400921374720L, 40240);
      return 0;
    }
    if (paramInt == 1) {
      if (this.username == null) {
        break label830;
      }
    }
    label830:
    for (paramInt = b.a.a.b.b.a.f(1, this.username) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.fKK != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.fKK);
      }
      i += b.a.a.b.b.a.cK(3) + 8;
      paramInt = i;
      if (this.fvV != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.fvV);
      }
      i = paramInt + b.a.a.a.fa(5, this.kKY) + b.a.a.a.fa(6, this.scene) + b.a.a.a.fa(7, this.status);
      paramInt = i;
      if (this.gEW != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.gEW);
      }
      i = paramInt;
      if (this.kKZ != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.kKZ);
      }
      paramInt = b.a.a.a.fa(10, this.msgType);
      GMTrace.o(5400921374720L, 40240);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.username == null) {
          throw new b("Not all required fields were included: username");
        }
        if (this.fKK == null) {
          throw new b("Not all required fields were included: transactionId");
        }
        if (this.fvV == null) {
          throw new b("Not all required fields were included: feeType");
        }
        GMTrace.o(5400921374720L, 40240);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        s locals = (s)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(5400921374720L, 40240);
          return -1;
        case 1: 
          locals.username = locala.xSv.readString();
          GMTrace.o(5400921374720L, 40240);
          return 0;
        case 2: 
          locals.fKK = locala.xSv.readString();
          GMTrace.o(5400921374720L, 40240);
          return 0;
        case 3: 
          locals.kKX = locala.xSv.readDouble();
          GMTrace.o(5400921374720L, 40240);
          return 0;
        case 4: 
          locals.fvV = locala.xSv.readString();
          GMTrace.o(5400921374720L, 40240);
          return 0;
        case 5: 
          locals.kKY = locala.xSv.nm();
          GMTrace.o(5400921374720L, 40240);
          return 0;
        case 6: 
          locals.scene = locala.xSv.nm();
          GMTrace.o(5400921374720L, 40240);
          return 0;
        case 7: 
          locals.status = locala.xSv.nm();
          GMTrace.o(5400921374720L, 40240);
          return 0;
        case 8: 
          locals.gEW = locala.xSv.readString();
          GMTrace.o(5400921374720L, 40240);
          return 0;
        case 9: 
          locals.kKZ = locala.xSv.readString();
          GMTrace.o(5400921374720L, 40240);
          return 0;
        }
        locals.msgType = locala.xSv.nm();
        GMTrace.o(5400921374720L, 40240);
        return 0;
      }
      GMTrace.o(5400921374720L, 40240);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/b/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */