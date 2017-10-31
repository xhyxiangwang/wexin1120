package com.tencent.mm.plugin.wallet_core.c;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.ad;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class j
  extends i<ad>
{
  public static final String[] gMz;
  public e gMB;
  private List<Object> hxh;
  
  static
  {
    GMTrace.i(6915031564288L, 51521);
    gMz = new String[] { i.a(ad.gLR, "WalletUserInfo") };
    GMTrace.o(6915031564288L, 51521);
  }
  
  public j(e parame)
  {
    super(parame, ad.gLR, "WalletUserInfo", null);
    GMTrace.i(6914226257920L, 51515);
    this.hxh = new LinkedList();
    this.gMB = parame;
    GMTrace.o(6914226257920L, 51515);
  }
  
  public final boolean a(ad paramad)
  {
    GMTrace.i(6914494693376L, 51517);
    if (super.b(paramad))
    {
      paramad = this.hxh.iterator();
      while (paramad.hasNext()) {
        paramad.next();
      }
      GMTrace.o(6914494693376L, 51517);
      return true;
    }
    GMTrace.o(6914494693376L, 51517);
    return false;
  }
  
  public final ad bxx()
  {
    GMTrace.i(6914360475648L, 51516);
    ad localad = new ad();
    Cursor localCursor = this.gMB.a("select * from WalletUserInfo", null, 2);
    localad.field_is_reg = -1;
    if (localCursor == null)
    {
      GMTrace.o(6914360475648L, 51516);
      return localad;
    }
    if (localCursor.moveToNext()) {
      localad.b(localCursor);
    }
    localCursor.close();
    GMTrace.o(6914360475648L, 51516);
    return localad;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */