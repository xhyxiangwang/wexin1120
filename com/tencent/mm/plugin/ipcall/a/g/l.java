package com.tencent.mm.plugin.ipcall.a.g;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class l
  extends i<k>
{
  public static final String[] gMz;
  public static final String[] naz;
  public e gMB;
  
  static
  {
    GMTrace.i(11577621217280L, 86260);
    gMz = new String[] { i.a(k.gLR, "IPCallRecord") };
    naz = new String[] { "*", "rowid" };
    GMTrace.o(11577621217280L, 86260);
  }
  
  public l(e parame)
  {
    super(parame, k.gLR, "IPCallRecord", null);
    GMTrace.i(11577084346368L, 86256);
    this.gMB = parame;
    GMTrace.o(11577084346368L, 86256);
  }
  
  public final void a(k paramk)
  {
    GMTrace.i(11577486999552L, 86259);
    if (paramk != null) {
      a(paramk.uQF, paramk);
    }
    GMTrace.o(11577486999552L, 86259);
  }
  
  public final Cursor cC(long paramLong)
  {
    GMTrace.i(11577352781824L, 86258);
    Cursor localCursor = this.gMB.query("IPCallRecord", naz, "addressId=?", new String[] { String.valueOf(paramLong) }, null, null, "calltime desc");
    GMTrace.o(11577352781824L, 86258);
    return localCursor;
  }
  
  public final Cursor zJ(String paramString)
  {
    GMTrace.i(11577218564096L, 86257);
    paramString = this.gMB.query("IPCallRecord", naz, "phonenumber=?", new String[] { paramString }, null, null, "calltime desc");
    GMTrace.o(11577218564096L, 86257);
    return paramString;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/g/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */