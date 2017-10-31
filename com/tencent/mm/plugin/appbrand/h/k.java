package com.tencent.mm.plugin.appbrand.h;

import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;

public final class k
{
  public HashMap<String, j> iVd;
  
  public k()
  {
    GMTrace.i(10670846246912L, 79504);
    this.iVd = new HashMap();
    GMTrace.o(10670846246912L, 79504);
  }
  
  public final j ri(String paramString)
  {
    GMTrace.i(10670980464640L, 79505);
    if (this.iVd.containsKey(paramString))
    {
      paramString = (j)this.iVd.get(paramString);
      GMTrace.o(10670980464640L, 79505);
      return paramString;
    }
    GMTrace.o(10670980464640L, 79505);
    return null;
  }
  
  public final boolean rj(String paramString)
  {
    GMTrace.i(10671114682368L, 79506);
    if (this.iVd.containsKey(paramString))
    {
      paramString = (j)this.iVd.remove(paramString);
      if (paramString != null) {
        paramString.YC();
      }
      GMTrace.o(10671114682368L, 79506);
      return true;
    }
    GMTrace.o(10671114682368L, 79506);
    return false;
  }
  
  private static final class a
  {
    public static k jju;
    
    static
    {
      GMTrace.i(10670040940544L, 79498);
      jju = new k();
      GMTrace.o(10670040940544L, 79498);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/h/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */