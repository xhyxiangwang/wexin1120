package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ua
  extends com.tencent.mm.bl.a
{
  public String mCJ;
  public String mCL;
  public String mDD;
  public String mFy;
  public String tJO;
  public uj tRZ;
  public int tSa;
  public String tSb;
  
  public ua()
  {
    GMTrace.i(3719307460608L, 27711);
    GMTrace.o(3719307460608L, 27711);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3719441678336L, 27712);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mDD == null) {
        throw new b("Not all required fields were included: AppId");
      }
      if (this.mCJ == null) {
        throw new b("Not all required fields were included: Name");
      }
      if (this.tJO == null) {
        throw new b("Not all required fields were included: Remark");
      }
      if (this.mFy == null) {
        throw new b("Not all required fields were included: IconUrl");
      }
      if (this.tRZ == null) {
        throw new b("Not all required fields were included: DownloadInfo");
      }
      if (this.mDD != null) {
        paramVarArgs.e(1, this.mDD);
      }
      if (this.mCJ != null) {
        paramVarArgs.e(2, this.mCJ);
      }
      if (this.tJO != null) {
        paramVarArgs.e(3, this.tJO);
      }
      if (this.mFy != null) {
        paramVarArgs.e(4, this.mFy);
      }
      if (this.mCL != null) {
        paramVarArgs.e(5, this.mCL);
      }
      if (this.tRZ != null)
      {
        paramVarArgs.ff(6, this.tRZ.aWM());
        this.tRZ.a(paramVarArgs);
      }
      paramVarArgs.fd(7, this.tSa);
      if (this.tSb != null) {
        paramVarArgs.e(8, this.tSb);
      }
      GMTrace.o(3719441678336L, 27712);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.mDD != null) {
        i = b.a.a.b.b.a.f(1, this.mDD) + 0;
      }
      paramInt = i;
      if (this.mCJ != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mCJ);
      }
      i = paramInt;
      if (this.tJO != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tJO);
      }
      paramInt = i;
      if (this.mFy != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mFy);
      }
      i = paramInt;
      if (this.mCL != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.mCL);
      }
      paramInt = i;
      if (this.tRZ != null) {
        paramInt = i + b.a.a.a.fc(6, this.tRZ.aWM());
      }
      i = paramInt + b.a.a.a.fa(7, this.tSa);
      paramInt = i;
      if (this.tSb != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tSb);
      }
      GMTrace.o(3719441678336L, 27712);
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
      if (this.mDD == null) {
        throw new b("Not all required fields were included: AppId");
      }
      if (this.mCJ == null) {
        throw new b("Not all required fields were included: Name");
      }
      if (this.tJO == null) {
        throw new b("Not all required fields were included: Remark");
      }
      if (this.mFy == null) {
        throw new b("Not all required fields were included: IconUrl");
      }
      if (this.tRZ == null) {
        throw new b("Not all required fields were included: DownloadInfo");
      }
      GMTrace.o(3719441678336L, 27712);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ua localua = (ua)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3719441678336L, 27712);
        return -1;
      case 1: 
        localua.mDD = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3719441678336L, 27712);
        return 0;
      case 2: 
        localua.mCJ = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3719441678336L, 27712);
        return 0;
      case 3: 
        localua.tJO = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3719441678336L, 27712);
        return 0;
      case 4: 
        localua.mFy = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3719441678336L, 27712);
        return 0;
      case 5: 
        localua.mCL = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3719441678336L, 27712);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new uj();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((uj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localua.tRZ = ((uj)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3719441678336L, 27712);
        return 0;
      case 7: 
        localua.tSa = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3719441678336L, 27712);
        return 0;
      }
      localua.tSb = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3719441678336L, 27712);
      return 0;
    }
    GMTrace.o(3719441678336L, 27712);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ua.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */