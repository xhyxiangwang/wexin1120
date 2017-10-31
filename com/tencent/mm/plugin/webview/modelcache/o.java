package com.tencent.mm.plugin.webview.modelcache;

import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.sdk.platformtools.bg;

public final class o
{
  public final j smC;
  public final SparseArray<Object> smD;
  public final SparseArray<Boolean> smE;
  
  public o()
  {
    GMTrace.i(12366284587008L, 92136);
    this.smC = new j();
    this.smD = new SparseArray();
    this.smE = new SparseArray();
    GMTrace.o(12366284587008L, 92136);
  }
  
  public static boolean a(String paramString, d paramd, int paramInt)
  {
    GMTrace.i(12366418804736L, 92137);
    paramd = a.smF;
    bg.mZ(paramString);
    GMTrace.o(12366418804736L, 92137);
    return false;
  }
  
  private static final class a
  {
    public static final o smF;
    
    static
    {
      GMTrace.i(12358365741056L, 92077);
      smF = new o();
      GMTrace.o(12358365741056L, 92077);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/modelcache/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */