package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class kr
  extends axk
{
  public String desc;
  public int kKx;
  public String kKy;
  public String tGm;
  public String tGn;
  public int tGo;
  public LinkedList<Integer> tGp;
  public int tGs;
  
  public kr()
  {
    GMTrace.i(19148574818304L, 142668);
    this.tGp = new LinkedList();
    GMTrace.o(19148574818304L, 142668);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19148709036032L, 142669);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.urV != null)
      {
        paramVarArgs.ff(1, this.urV.aWM());
        this.urV.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.kKx);
      if (this.kKy != null) {
        paramVarArgs.e(3, this.kKy);
      }
      if (this.tGm != null) {
        paramVarArgs.e(4, this.tGm);
      }
      if (this.tGn != null) {
        paramVarArgs.e(5, this.tGn);
      }
      paramVarArgs.fd(6, this.tGo);
      paramVarArgs.d(7, 2, this.tGp);
      if (this.desc != null) {
        paramVarArgs.e(8, this.desc);
      }
      paramVarArgs.fd(9, this.tGs);
      GMTrace.o(19148709036032L, 142669);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.kKx);
      paramInt = i;
      if (this.kKy != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.kKy);
      }
      i = paramInt;
      if (this.tGm != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.tGm);
      }
      paramInt = i;
      if (this.tGn != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tGn);
      }
      i = paramInt + b.a.a.a.fa(6, this.tGo) + b.a.a.a.c(7, 2, this.tGp);
      paramInt = i;
      if (this.desc != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.desc);
      }
      i = b.a.a.a.fa(9, this.tGs);
      GMTrace.o(19148709036032L, 142669);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tGp.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(19148709036032L, 142669);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      kr localkr = (kr)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(19148709036032L, 142669);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new eo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((eo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localkr.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(19148709036032L, 142669);
        return 0;
      case 2: 
        localkr.kKx = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(19148709036032L, 142669);
        return 0;
      case 3: 
        localkr.kKy = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(19148709036032L, 142669);
        return 0;
      case 4: 
        localkr.tGm = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(19148709036032L, 142669);
        return 0;
      case 5: 
        localkr.tGn = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(19148709036032L, 142669);
        return 0;
      case 6: 
        localkr.tGo = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(19148709036032L, 142669);
        return 0;
      case 7: 
        localkr.tGp.add(Integer.valueOf(((b.a.a.a.a)localObject1).xSv.nm()));
        GMTrace.o(19148709036032L, 142669);
        return 0;
      case 8: 
        localkr.desc = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(19148709036032L, 142669);
        return 0;
      }
      localkr.tGs = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(19148709036032L, 142669);
      return 0;
    }
    GMTrace.o(19148709036032L, 142669);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/kr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */