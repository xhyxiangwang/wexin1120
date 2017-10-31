package com.tencent.mm.plugin.backup.h;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class z
  extends com.tencent.mm.bl.a
{
  public String jWO;
  public LinkedList<String> jXG;
  public long jXZ;
  public long jYa;
  public String jYb;
  public String jYc;
  
  public z()
  {
    GMTrace.i(14831461597184L, 110503);
    this.jXG = new LinkedList();
    GMTrace.o(14831461597184L, 110503);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14831595814912L, 110504);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jWO == null) {
        throw new b("Not all required fields were included: BakChatName");
      }
      if (this.jYb == null) {
        throw new b("Not all required fields were included: MsgDataID");
      }
      if (this.jYc == null) {
        throw new b("Not all required fields were included: NickName");
      }
      if (this.jWO != null) {
        paramVarArgs.e(1, this.jWO);
      }
      paramVarArgs.R(2, this.jXZ);
      paramVarArgs.R(3, this.jYa);
      if (this.jYb != null) {
        paramVarArgs.e(4, this.jYb);
      }
      if (this.jYc != null) {
        paramVarArgs.e(5, this.jYc);
      }
      paramVarArgs.d(6, 1, this.jXG);
      GMTrace.o(14831595814912L, 110504);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jWO == null) {
        break label618;
      }
    }
    label618:
    for (paramInt = b.a.a.b.b.a.f(1, this.jWO) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.Q(2, this.jXZ) + b.a.a.a.Q(3, this.jYa);
      paramInt = i;
      if (this.jYb != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.jYb);
      }
      i = paramInt;
      if (this.jYc != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.jYc);
      }
      paramInt = b.a.a.a.c(6, 1, this.jXG);
      GMTrace.o(14831595814912L, 110504);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.jXG.clear();
        paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.jWO == null) {
          throw new b("Not all required fields were included: BakChatName");
        }
        if (this.jYb == null) {
          throw new b("Not all required fields were included: MsgDataID");
        }
        if (this.jYc == null) {
          throw new b("Not all required fields were included: NickName");
        }
        GMTrace.o(14831595814912L, 110504);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        z localz = (z)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(14831595814912L, 110504);
          return -1;
        case 1: 
          localz.jWO = locala.xSv.readString();
          GMTrace.o(14831595814912L, 110504);
          return 0;
        case 2: 
          localz.jXZ = locala.xSv.nn();
          GMTrace.o(14831595814912L, 110504);
          return 0;
        case 3: 
          localz.jYa = locala.xSv.nn();
          GMTrace.o(14831595814912L, 110504);
          return 0;
        case 4: 
          localz.jYb = locala.xSv.readString();
          GMTrace.o(14831595814912L, 110504);
          return 0;
        case 5: 
          localz.jYc = locala.xSv.readString();
          GMTrace.o(14831595814912L, 110504);
          return 0;
        }
        localz.jXG.add(locala.xSv.readString());
        GMTrace.o(14831595814912L, 110504);
        return 0;
      }
      GMTrace.o(14831595814912L, 110504);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/h/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */