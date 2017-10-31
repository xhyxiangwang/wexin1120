package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class jw
  extends axk
{
  public int oWr;
  public String oWs;
  public String oWt;
  public String rMv;
  public LinkedList<amv> tGb;
  public amv tGc;
  public String tGd;
  public boolean tGe;
  public String tGf;
  public String url;
  
  public jw()
  {
    GMTrace.i(17874580144128L, 133176);
    this.tGb = new LinkedList();
    GMTrace.o(17874580144128L, 133176);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17874714361856L, 133177);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.url == null) {
        throw new b("Not all required fields were included: url");
      }
      if (this.tGc == null) {
        throw new b("Not all required fields were included: bottom_item");
      }
      if (this.urV != null)
      {
        paramVarArgs.ff(1, this.urV.aWM());
        this.urV.a(paramVarArgs);
      }
      if (this.url != null) {
        paramVarArgs.e(2, this.url);
      }
      paramVarArgs.d(3, 8, this.tGb);
      if (this.tGc != null)
      {
        paramVarArgs.ff(4, this.tGc.aWM());
        this.tGc.a(paramVarArgs);
      }
      if (this.rMv != null) {
        paramVarArgs.e(5, this.rMv);
      }
      if (this.tGd != null) {
        paramVarArgs.e(6, this.tGd);
      }
      paramVarArgs.af(7, this.tGe);
      paramVarArgs.fd(8, this.oWr);
      if (this.tGf != null) {
        paramVarArgs.e(9, this.tGf);
      }
      if (this.oWs != null) {
        paramVarArgs.e(10, this.oWs);
      }
      if (this.oWt != null) {
        paramVarArgs.e(11, this.oWt);
      }
      GMTrace.o(17874714361856L, 133177);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt;
      if (this.url != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.url);
      }
      i += b.a.a.a.c(3, 8, this.tGb);
      paramInt = i;
      if (this.tGc != null) {
        paramInt = i + b.a.a.a.fc(4, this.tGc.aWM());
      }
      i = paramInt;
      if (this.rMv != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.rMv);
      }
      paramInt = i;
      if (this.tGd != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tGd);
      }
      i = paramInt + (b.a.a.b.b.a.cK(7) + 1) + b.a.a.a.fa(8, this.oWr);
      paramInt = i;
      if (this.tGf != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.tGf);
      }
      i = paramInt;
      if (this.oWs != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.oWs);
      }
      paramInt = i;
      if (this.oWt != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.oWt);
      }
      GMTrace.o(17874714361856L, 133177);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tGb.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.url == null) {
        throw new b("Not all required fields were included: url");
      }
      if (this.tGc == null) {
        throw new b("Not all required fields were included: bottom_item");
      }
      GMTrace.o(17874714361856L, 133177);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      jw localjw = (jw)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(17874714361856L, 133177);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new eo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((eo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localjw.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17874714361856L, 133177);
        return 0;
      case 2: 
        localjw.url = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(17874714361856L, 133177);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new amv();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((amv)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localjw.tGb.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(17874714361856L, 133177);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new amv();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((amv)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localjw.tGc = ((amv)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17874714361856L, 133177);
        return 0;
      case 5: 
        localjw.rMv = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(17874714361856L, 133177);
        return 0;
      case 6: 
        localjw.tGd = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(17874714361856L, 133177);
        return 0;
      case 7: 
        localjw.tGe = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(17874714361856L, 133177);
        return 0;
      case 8: 
        localjw.oWr = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(17874714361856L, 133177);
        return 0;
      case 9: 
        localjw.tGf = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(17874714361856L, 133177);
        return 0;
      case 10: 
        localjw.oWs = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(17874714361856L, 133177);
        return 0;
      }
      localjw.oWt = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(17874714361856L, 133177);
      return 0;
    }
    GMTrace.o(17874714361856L, 133177);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/jw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */