package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class pd
  extends com.tencent.mm.bl.a
{
  public String desc;
  public String ovp;
  public LinkedList<String> tKV;
  public String tKW;
  public String title;
  public String url;
  
  public pd()
  {
    GMTrace.i(3719575896064L, 27713);
    this.tKV = new LinkedList();
    GMTrace.o(3719575896064L, 27713);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3719710113792L, 27714);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.e(1, this.title);
      }
      if (this.url != null) {
        paramVarArgs.e(2, this.url);
      }
      if (this.desc != null) {
        paramVarArgs.e(3, this.desc);
      }
      paramVarArgs.d(4, 1, this.tKV);
      if (this.ovp != null) {
        paramVarArgs.e(5, this.ovp);
      }
      if (this.tKW != null) {
        paramVarArgs.e(6, this.tKW);
      }
      GMTrace.o(3719710113792L, 27714);
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label562;
      }
    }
    label562:
    for (int i = b.a.a.b.b.a.f(1, this.title) + 0;; i = 0)
    {
      paramInt = i;
      if (this.url != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.url);
      }
      i = paramInt;
      if (this.desc != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.desc);
      }
      i += b.a.a.a.c(4, 1, this.tKV);
      paramInt = i;
      if (this.ovp != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.ovp);
      }
      i = paramInt;
      if (this.tKW != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.tKW);
      }
      GMTrace.o(3719710113792L, 27714);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.tKV.clear();
        paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3719710113792L, 27714);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        pd localpd = (pd)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3719710113792L, 27714);
          return -1;
        case 1: 
          localpd.title = locala.xSv.readString();
          GMTrace.o(3719710113792L, 27714);
          return 0;
        case 2: 
          localpd.url = locala.xSv.readString();
          GMTrace.o(3719710113792L, 27714);
          return 0;
        case 3: 
          localpd.desc = locala.xSv.readString();
          GMTrace.o(3719710113792L, 27714);
          return 0;
        case 4: 
          localpd.tKV.add(locala.xSv.readString());
          GMTrace.o(3719710113792L, 27714);
          return 0;
        case 5: 
          localpd.ovp = locala.xSv.readString();
          GMTrace.o(3719710113792L, 27714);
          return 0;
        }
        localpd.tKW = locala.xSv.readString();
        GMTrace.o(3719710113792L, 27714);
        return 0;
      }
      GMTrace.o(3719710113792L, 27714);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/pd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */