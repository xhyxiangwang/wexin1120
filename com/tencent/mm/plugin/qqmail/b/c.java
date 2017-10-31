package com.tencent.mm.plugin.qqmail.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.x.ap;
import java.io.IOException;

public final class c
{
  public e oEM;
  
  public c(String paramString)
  {
    GMTrace.i(5471251464192L, 40764);
    this.oEM = new e(paramString, 10);
    GMTrace.o(5471251464192L, 40764);
  }
  
  public static String bE(String paramString, int paramInt)
  {
    GMTrace.i(5471519899648L, 40766);
    if ((paramString == null) || (paramString.length() == 0))
    {
      paramString = new StringBuilder();
      ap.AS();
    }
    for (paramString = com.tencent.mm.x.c.xi().get(9, null);; paramString = paramString + "_" + paramInt)
    {
      GMTrace.o(5471519899648L, 40766);
      return paramString;
    }
  }
  
  public final d bD(String paramString, int paramInt)
  {
    GMTrace.i(5471385681920L, 40765);
    paramString = e.readFromFile(this.oEM.oEW + bE(paramString, paramInt));
    if ((paramString == null) || (paramString.length == 0))
    {
      GMTrace.o(5471385681920L, 40765);
      return null;
    }
    try
    {
      paramString = (d)new d().aC(paramString);
      GMTrace.o(5471385681920L, 40765);
      return paramString;
    }
    catch (IOException paramString)
    {
      w.printErrStackTrace("MicroMsg.DraftBoxMgr", paramString, "", new Object[0]);
      GMTrace.o(5471385681920L, 40765);
    }
    return null;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */