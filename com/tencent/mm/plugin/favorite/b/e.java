package com.tencent.mm.plugin.favorite.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends i<d>
{
  public static final String[] gMz;
  private com.tencent.mm.sdk.e.e gMB;
  
  static
  {
    GMTrace.i(6280852799488L, 46796);
    gMz = new String[] { i.a(d.gLR, "FavConfigInfo") };
    GMTrace.o(6280852799488L, 46796);
  }
  
  public e(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, d.gLR, "FavConfigInfo", null);
    GMTrace.i(6280450146304L, 46793);
    this.gMB = parame;
    GMTrace.o(6280450146304L, 46793);
  }
  
  public final void aq(byte[] paramArrayOfByte)
  {
    GMTrace.i(6280584364032L, 46794);
    d locald = awG();
    if (8216 == locald.field_configId)
    {
      locald.field_value = bg.br(paramArrayOfByte);
      bool = c(locald, new String[0]);
      w.i("MicroMsg.FavConfigStorage", "update sync key: %s, result %B", new Object[] { locald.field_value, Boolean.valueOf(bool) });
      GMTrace.o(6280584364032L, 46794);
      return;
    }
    locald.field_configId = 8216;
    locald.field_value = bg.br(paramArrayOfByte);
    boolean bool = b(locald);
    w.i("MicroMsg.FavConfigStorage", "insert sync key: %s, result %B", new Object[] { locald.field_value, Boolean.valueOf(bool) });
    GMTrace.o(6280584364032L, 46794);
  }
  
  final d awG()
  {
    GMTrace.i(6280718581760L, 46795);
    d locald = new d();
    Object localObject = "select * from FavConfigInfo where configId = 8216";
    w.d("MicroMsg.FavConfigStorage", "get fav config sql %s", new Object[] { localObject });
    localObject = this.gMB.a((String)localObject, null, 2);
    if (localObject != null)
    {
      if (((Cursor)localObject).moveToFirst()) {
        locald.b((Cursor)localObject);
      }
      ((Cursor)localObject).close();
    }
    GMTrace.o(6280718581760L, 46795);
    return locald;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */