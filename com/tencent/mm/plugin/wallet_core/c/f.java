package com.tencent.mm.plugin.wallet_core.c;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.v;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import java.util.ArrayList;

public final class f
  extends i<v>
{
  public static final String[] gMz;
  public e gMB;
  
  static
  {
    GMTrace.i(6912884080640L, 51505);
    gMz = new String[] { i.a(v.gLR, "WalletKindInfo") };
    GMTrace.o(6912884080640L, 51505);
  }
  
  public f(e parame)
  {
    super(parame, v.gLR, "WalletKindInfo", null);
    GMTrace.i(6912615645184L, 51503);
    this.gMB = parame;
    GMTrace.o(6912615645184L, 51503);
  }
  
  public final ArrayList<v> bxw()
  {
    ArrayList localArrayList = null;
    GMTrace.i(6912749862912L, 51504);
    Cursor localCursor = this.gMB.a("select * from WalletKindInfo", null, 2);
    if (localCursor == null)
    {
      GMTrace.o(6912749862912L, 51504);
      return null;
    }
    if (localCursor.moveToFirst())
    {
      localArrayList = new ArrayList();
      do
      {
        v localv = new v();
        localv.b(localCursor);
        localArrayList.add(localv);
      } while (localCursor.moveToNext());
    }
    localCursor.close();
    GMTrace.o(6912749862912L, 51504);
    return localArrayList;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */