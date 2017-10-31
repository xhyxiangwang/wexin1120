package com.tencent.mm.bd;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;

public enum a
{
  static
  {
    GMTrace.i(16866605006848L, 125666);
    hYc = new a("INSTANCE");
    hYd = new a[] { hYc };
    GMTrace.o(16866605006848L, 125666);
  }
  
  private a()
  {
    GMTrace.i(16865933918208L, 125661);
    GMTrace.o(16865933918208L, 125661);
  }
  
  public static boolean Od()
  {
    GMTrace.i(16866068135936L, 125662);
    if (!bg.mZ(Oe()))
    {
      GMTrace.o(16866068135936L, 125662);
      return true;
    }
    GMTrace.o(16866068135936L, 125662);
    return false;
  }
  
  public static String Oe()
  {
    GMTrace.i(16866202353664L, 125663);
    h.xA();
    String str = (String)h.xz().xi().get(w.a.vaQ, String.valueOf(""));
    w.i("MicroMsg.WebviewKeepManager", "getLastPageUrl : %s", new Object[] { str });
    GMTrace.o(16866202353664L, 125663);
    return str;
  }
  
  public static String Of()
  {
    GMTrace.i(16866336571392L, 125664);
    h.xA();
    String str = (String)h.xz().xi().get(w.a.vaS, String.valueOf(""));
    w.i("MicroMsg.WebviewKeepManager", "getLastPageTitle : %s", new Object[] { str });
    GMTrace.o(16866336571392L, 125664);
    return str;
  }
  
  public static void p(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(16866470789120L, 125665);
    h.xA();
    h.xz().xi().a(w.a.vaQ, paramString1);
    h.xA();
    h.xz().xi().a(w.a.vaS, paramString2);
    h.xA();
    h.xz().xi().a(w.a.vaR, paramString3);
    GMTrace.o(16866470789120L, 125665);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/bd/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */