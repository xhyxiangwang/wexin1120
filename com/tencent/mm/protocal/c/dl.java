package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class dl
  extends com.tencent.mm.bl.a
{
  public String fuw;
  public String mCJ;
  public String txd;
  public String txe;
  public dm txf;
  
  public dl()
  {
    GMTrace.i(3702396026880L, 27585);
    GMTrace.o(3702396026880L, 27585);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3702530244608L, 27586);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.txf == null) {
        throw new b("Not all required fields were included: ArtisIcon");
      }
      if (this.mCJ != null) {
        paramVarArgs.e(1, this.mCJ);
      }
      if (this.fuw != null) {
        paramVarArgs.e(2, this.fuw);
      }
      if (this.txd != null) {
        paramVarArgs.e(3, this.txd);
      }
      if (this.txe != null) {
        paramVarArgs.e(4, this.txe);
      }
      if (this.txf != null)
      {
        paramVarArgs.ff(5, this.txf.aWM());
        this.txf.a(paramVarArgs);
      }
      GMTrace.o(3702530244608L, 27586);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.mCJ != null) {
        i = b.a.a.b.b.a.f(1, this.mCJ) + 0;
      }
      paramInt = i;
      if (this.fuw != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.fuw);
      }
      i = paramInt;
      if (this.txd != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.txd);
      }
      paramInt = i;
      if (this.txe != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.txe);
      }
      i = paramInt;
      if (this.txf != null) {
        i = paramInt + b.a.a.a.fc(5, this.txf.aWM());
      }
      GMTrace.o(3702530244608L, 27586);
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
      if (this.txf == null) {
        throw new b("Not all required fields were included: ArtisIcon");
      }
      GMTrace.o(3702530244608L, 27586);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      dl localdl = (dl)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3702530244608L, 27586);
        return -1;
      case 1: 
        localdl.mCJ = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3702530244608L, 27586);
        return 0;
      case 2: 
        localdl.fuw = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3702530244608L, 27586);
        return 0;
      case 3: 
        localdl.txd = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3702530244608L, 27586);
        return 0;
      case 4: 
        localdl.txe = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3702530244608L, 27586);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new dm();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((dm)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localdl.txf = ((dm)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3702530244608L, 27586);
      return 0;
    }
    GMTrace.o(3702530244608L, 27586);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/dl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */