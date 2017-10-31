package com.tencent.mm.plugin.appbrand.k;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.c.a;
import java.util.List;

public abstract interface f
  extends a
{
  public abstract b TB();
  
  public abstract void a(Context paramContext, c paramc, String paramString);
  
  public abstract void a(Context paramContext, String paramString, a parama);
  
  public static enum a
  {
    public final String tag;
    
    static
    {
      GMTrace.i(20074140270592L, 149564);
      jpe = new a("CLICK", 0, "1");
      jpf = new a("SWIPE", 1, "2");
      jpg = new a[] { jpe, jpf };
      GMTrace.o(20074140270592L, 149564);
    }
    
    private a(String paramString)
    {
      GMTrace.i(20074006052864L, 149563);
      this.tag = paramString;
      GMTrace.o(20074006052864L, 149563);
    }
  }
  
  public static final class b
  {
    public String fEM;
    public List<f.c> hip;
    public int jph;
    
    public b()
    {
      GMTrace.i(20075348230144L, 149573);
      GMTrace.o(20075348230144L, 149573);
    }
  }
  
  public static final class c
  {
    public int fNP;
    public String fvS;
    public int iQS;
    public String jpi;
    public String username;
    
    public c()
    {
      GMTrace.i(20074274488320L, 149565);
      GMTrace.o(20074274488320L, 149565);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/k/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */