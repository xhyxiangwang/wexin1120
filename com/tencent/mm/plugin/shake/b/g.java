package com.tencent.mm.plugin.shake.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.w;

public final class g
  extends i<f>
{
  public static final String[] fSf;
  public static final String[] gMz;
  public e gMB;
  
  static
  {
    GMTrace.i(6508083412992L, 48489);
    fSf = new String[] { "CREATE INDEX IF NOT EXISTS  shakemessage_status_index ON shakemessage ( status )", "CREATE INDEX IF NOT EXISTS shakemessage_type_index ON shakemessage ( type )" };
    gMz = new String[] { i.a(f.gLR, "shakemessage") };
    GMTrace.o(6508083412992L, 48489);
  }
  
  public g(e parame)
  {
    super(parame, f.gLR, "shakemessage", fSf);
    GMTrace.i(6507546542080L, 48485);
    this.gMB = parame;
    GMTrace.o(6507546542080L, 48485);
  }
  
  public final int Mw()
  {
    GMTrace.i(6507814977536L, 48487);
    Cursor localCursor = this.gMB.a("select count(*) from " + getTableName() + " where status != 1", null, 2);
    if (localCursor.moveToFirst()) {}
    for (int i = localCursor.getInt(0);; i = 0)
    {
      localCursor.close();
      if (i > 0)
      {
        GMTrace.o(6507814977536L, 48487);
        return i;
      }
      GMTrace.o(6507814977536L, 48487);
      return 0;
    }
  }
  
  public final boolean a(f paramf)
  {
    GMTrace.i(6507680759808L, 48486);
    if (paramf == null)
    {
      w.e("MicroMsg.ShakeMessageStorage", "insert fail, shakeMsg is null");
      GMTrace.o(6507680759808L, 48486);
      return false;
    }
    if (super.b(paramf))
    {
      RZ(paramf.uQF);
      GMTrace.o(6507680759808L, 48486);
      return true;
    }
    GMTrace.o(6507680759808L, 48486);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */