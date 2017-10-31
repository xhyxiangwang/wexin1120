package com.tencent.mm.plugin.backup.h;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class aa
  extends com.tencent.mm.bl.a
{
  public String jWO;
  public long jXZ;
  public long jYa;
  public String jYb;
  
  public aa()
  {
    GMTrace.i(14834682822656L, 110527);
    GMTrace.o(14834682822656L, 110527);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14834817040384L, 110528);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jWO == null) {
        throw new b("Not all required fields were included: BakChatName");
      }
      if (this.jYb == null) {
        throw new b("Not all required fields were included: MsgDataID");
      }
      if (this.jWO != null) {
        paramVarArgs.e(1, this.jWO);
      }
      paramVarArgs.R(2, this.jXZ);
      paramVarArgs.R(3, this.jYa);
      if (this.jYb != null) {
        paramVarArgs.e(4, this.jYb);
      }
      GMTrace.o(14834817040384L, 110528);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jWO == null) {
        break label460;
      }
    }
    label460:
    for (paramInt = b.a.a.b.b.a.f(1, this.jWO) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.Q(2, this.jXZ) + b.a.a.a.Q(3, this.jYa);
      paramInt = i;
      if (this.jYb != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.jYb);
      }
      GMTrace.o(14834817040384L, 110528);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
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
        GMTrace.o(14834817040384L, 110528);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        aa localaa = (aa)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(14834817040384L, 110528);
          return -1;
        case 1: 
          localaa.jWO = locala.xSv.readString();
          GMTrace.o(14834817040384L, 110528);
          return 0;
        case 2: 
          localaa.jXZ = locala.xSv.nn();
          GMTrace.o(14834817040384L, 110528);
          return 0;
        case 3: 
          localaa.jYa = locala.xSv.nn();
          GMTrace.o(14834817040384L, 110528);
          return 0;
        }
        localaa.jYb = locala.xSv.readString();
        GMTrace.o(14834817040384L, 110528);
        return 0;
      }
      GMTrace.o(14834817040384L, 110528);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/h/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */