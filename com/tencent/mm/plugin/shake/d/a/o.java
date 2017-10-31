package com.tencent.mm.plugin.shake.d.a;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class o
  extends i<n>
{
  public static final String[] fSf;
  public static final String[] gMz;
  public e gMB;
  
  static
  {
    GMTrace.i(6595459153920L, 49140);
    fSf = new String[0];
    gMz = new String[] { i.a(n.gLR, "shaketvhistory") };
    GMTrace.o(6595459153920L, 49140);
  }
  
  public o(e parame)
  {
    super(parame, n.gLR, "shaketvhistory", gMz);
    GMTrace.i(6595190718464L, 49138);
    this.gMB = parame;
    GMTrace.o(6595190718464L, 49138);
  }
  
  public final Cursor bea()
  {
    GMTrace.i(6595324936192L, 49139);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("SELECT * FROM shaketvhistory ORDER BY createtime").append(" DESC");
    localObject = ((StringBuilder)localObject).toString();
    localObject = this.gMB.rawQuery((String)localObject, null);
    GMTrace.o(6595324936192L, 49139);
    return (Cursor)localObject;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/d/a/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */