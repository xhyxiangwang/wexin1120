package com.tencent.mm.plugin.wallet_core.c;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.w;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import java.util.HashMap;
import java.util.Map;

public final class g
  extends i<w>
{
  public static final String[] gMz;
  public static Map<String, w> ihz;
  private e gMB;
  
  static
  {
    GMTrace.i(6916373741568L, 51531);
    gMz = new String[] { i.a(w.gLR, "WalletLuckyMoney") };
    ihz = new HashMap();
    GMTrace.o(6916373741568L, 51531);
  }
  
  public g(e parame)
  {
    super(parame, w.gLR, "WalletLuckyMoney", null);
    GMTrace.i(6916239523840L, 51530);
    this.gMB = parame;
    GMTrace.o(6916239523840L, 51530);
  }
  
  public final w Jz(String paramString)
  {
    GMTrace.i(18040070602752L, 134409);
    paramString = this.gMB.rawQuery("select * from WalletLuckyMoney where mNativeUrl=?", new String[] { paramString });
    if (paramString == null)
    {
      GMTrace.o(18040070602752L, 134409);
      return null;
    }
    if (paramString.getCount() == 0)
    {
      paramString.close();
      GMTrace.o(18040070602752L, 134409);
      return null;
    }
    paramString.moveToFirst();
    w localw = new w();
    localw.b(paramString);
    paramString.close();
    GMTrace.o(18040070602752L, 134409);
    return localw;
  }
  
  public final boolean a(w paramw)
  {
    GMTrace.i(18040204820480L, 134410);
    if ((paramw != null) && (ihz.containsKey(paramw.field_mNativeUrl))) {
      ihz.put(paramw.field_mNativeUrl, paramw);
    }
    boolean bool = super.a(paramw);
    GMTrace.o(18040204820480L, 134410);
    return bool;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */