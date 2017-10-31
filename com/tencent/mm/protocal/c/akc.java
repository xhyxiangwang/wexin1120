package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.b;
import java.util.LinkedList;

public final class akc
  extends com.tencent.mm.bl.a
{
  public String fuw;
  public int jXP;
  public String oic;
  public float oid;
  public int oie;
  public LinkedList<Integer> oif;
  public int oig;
  public LinkedList<axt> oih;
  public float oii;
  public String oij;
  public axs oik;
  public String ufo;
  public axs ufp;
  public int ufq;
  public int ufr;
  
  public akc()
  {
    GMTrace.i(3939021881344L, 29348);
    this.oif = new LinkedList();
    this.oih = new LinkedList();
    GMTrace.o(3939021881344L, 29348);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3939156099072L, 29349);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.oic != null) {
        paramVarArgs.e(1, this.oic);
      }
      if (this.fuw != null) {
        paramVarArgs.e(2, this.fuw);
      }
      paramVarArgs.n(3, this.oid);
      paramVarArgs.fd(4, this.oie);
      paramVarArgs.c(5, this.oif);
      paramVarArgs.fd(6, this.oig);
      paramVarArgs.d(7, 8, this.oih);
      paramVarArgs.n(8, this.oii);
      if (this.oij != null) {
        paramVarArgs.e(9, this.oij);
      }
      paramVarArgs.fd(10, this.jXP);
      if (this.oik != null)
      {
        paramVarArgs.ff(11, this.oik.aWM());
        this.oik.a(paramVarArgs);
      }
      if (this.ufo != null) {
        paramVarArgs.e(12, this.ufo);
      }
      if (this.ufp != null)
      {
        paramVarArgs.ff(13, this.ufp.aWM());
        this.ufp.a(paramVarArgs);
      }
      paramVarArgs.fd(14, this.ufq);
      paramVarArgs.fd(15, this.ufr);
      GMTrace.o(3939156099072L, 29349);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.oic != null) {
        paramInt = b.a.a.b.b.a.f(1, this.oic) + 0;
      }
      i = paramInt;
      if (this.fuw != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.fuw);
      }
      i = i + (b.a.a.b.b.a.cK(3) + 4) + b.a.a.a.fa(4, this.oie) + b.a.a.a.b(5, this.oif) + b.a.a.a.fa(6, this.oig) + b.a.a.a.c(7, 8, this.oih) + (b.a.a.b.b.a.cK(8) + 4);
      paramInt = i;
      if (this.oij != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.oij);
      }
      i = paramInt + b.a.a.a.fa(10, this.jXP);
      paramInt = i;
      if (this.oik != null) {
        paramInt = i + b.a.a.a.fc(11, this.oik.aWM());
      }
      i = paramInt;
      if (this.ufo != null) {
        i = paramInt + b.a.a.b.b.a.f(12, this.ufo);
      }
      paramInt = i;
      if (this.ufp != null) {
        paramInt = i + b.a.a.a.fc(13, this.ufp.aWM());
      }
      i = b.a.a.a.fa(14, this.ufq);
      int j = b.a.a.a.fa(15, this.ufr);
      GMTrace.o(3939156099072L, 29349);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.oif.clear();
      this.oih.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3939156099072L, 29349);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      akc localakc = (akc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3939156099072L, 29349);
        return -1;
      case 1: 
        localakc.oic = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3939156099072L, 29349);
        return 0;
      case 2: 
        localakc.fuw = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3939156099072L, 29349);
        return 0;
      case 3: 
        localakc.oid = ((b.a.a.a.a)localObject1).xSv.readFloat();
        GMTrace.o(3939156099072L, 29349);
        return 0;
      case 4: 
        localakc.oie = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3939156099072L, 29349);
        return 0;
      case 5: 
        localakc.oif = new b.a.a.a.a(((b.a.a.a.a)localObject1).cpI().toK, unknownTagHandler).cpF();
        GMTrace.o(3939156099072L, 29349);
        return 0;
      case 6: 
        localakc.oig = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3939156099072L, 29349);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axt();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localakc.oih.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3939156099072L, 29349);
        return 0;
      case 8: 
        localakc.oii = ((b.a.a.a.a)localObject1).xSv.readFloat();
        GMTrace.o(3939156099072L, 29349);
        return 0;
      case 9: 
        localakc.oij = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3939156099072L, 29349);
        return 0;
      case 10: 
        localakc.jXP = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3939156099072L, 29349);
        return 0;
      case 11: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localakc.oik = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3939156099072L, 29349);
        return 0;
      case 12: 
        localakc.ufo = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3939156099072L, 29349);
        return 0;
      case 13: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localakc.ufp = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3939156099072L, 29349);
        return 0;
      case 14: 
        localakc.ufq = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3939156099072L, 29349);
        return 0;
      }
      localakc.ufr = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3939156099072L, 29349);
      return 0;
    }
    GMTrace.o(3939156099072L, 29349);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/akc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */