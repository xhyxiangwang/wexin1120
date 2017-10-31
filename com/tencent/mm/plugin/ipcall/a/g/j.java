package com.tencent.mm.plugin.ipcall.a.g;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bt.f;
import com.tencent.mm.bt.f.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.w;

public final class j
  extends com.tencent.mm.sdk.e.i<i>
  implements f.a
{
  public static final String[] gMz;
  public e gMB;
  public m hvB;
  
  static
  {
    GMTrace.i(11579231830016L, 86272);
    gMz = new String[] { com.tencent.mm.sdk.e.i.a(i.gLR, "IPCallPopularCountry") };
    GMTrace.o(11579231830016L, 86272);
  }
  
  public j(e parame)
  {
    super(parame, i.gLR, "IPCallPopularCountry", null);
    GMTrace.i(11578560741376L, 86267);
    this.hvB = new m()
    {
      protected final boolean Hc()
      {
        GMTrace.i(11574802644992L, 86239);
        if ((j.this.gMB == null) || (j.this.gMB.bOr()))
        {
          if (j.this.gMB == null) {}
          for (Object localObject = "null";; localObject = Boolean.valueOf(j.this.gMB.bOr()))
          {
            w.w("MicroMsg.IPCallPopularCountryStorage", "shouldProcessEvent db is close :%s", new Object[] { localObject });
            GMTrace.o(11574802644992L, 86239);
            return false;
          }
        }
        GMTrace.o(11574802644992L, 86239);
        return true;
      }
    };
    this.gMB = parame;
    GMTrace.o(11578560741376L, 86267);
  }
  
  public final int a(f paramf)
  {
    GMTrace.i(11578829176832L, 86269);
    if (paramf != null) {
      this.gMB = paramf;
    }
    GMTrace.o(11578829176832L, 86269);
    return 0;
  }
  
  public final String getTableName()
  {
    GMTrace.i(11578694959104L, 86268);
    GMTrace.o(11578694959104L, 86268);
    return "IPCallPopularCountry";
  }
  
  public final void v(int paramInt, long paramLong)
  {
    GMTrace.i(11578963394560L, 86270);
    i locali = new i();
    Cursor localCursor = this.gMB.a("IPCallPopularCountry", null, "countryCode=?", new String[] { Integer.toString(paramInt) }, null, null, null, 2);
    boolean bool;
    if (!localCursor.moveToFirst())
    {
      w.i("MicroMsg.IPCallPopularCountryStorage", "get null with countryCode:" + paramInt);
      localCursor.close();
      locali.field_countryCode = paramInt;
      locali.field_lastCallTime = paramLong;
      locali.field_callTimeCount = 1L;
      bool = b(locali);
    }
    for (;;)
    {
      w.i("MicroMsg.IPCallPopularCountryStorage", "updatePopularCountryCode ret:" + bool);
      GMTrace.o(11578963394560L, 86270);
      return;
      locali.b(localCursor);
      locali.field_callTimeCount += 1L;
      locali.field_lastCallTime = paramLong;
      bool = super.a(locali);
      localCursor.close();
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/g/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */