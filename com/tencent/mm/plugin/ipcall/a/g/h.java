package com.tencent.mm.plugin.ipcall.a.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class h
  extends i<g>
{
  public static final String[] gMz;
  public static final String[] naw;
  public static int nax;
  public e gMB;
  
  static
  {
    GMTrace.i(11579500265472L, 86274);
    gMz = new String[] { i.a(g.gLR, "IPCallMsg") };
    naw = new String[] { "*", "rowid" };
    nax = 0;
    GMTrace.o(11579500265472L, 86274);
  }
  
  public h(e parame)
  {
    super(parame, g.gLR, "IPCallMsg", null);
    GMTrace.i(11579366047744L, 86273);
    this.gMB = parame;
    GMTrace.o(11579366047744L, 86273);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/g/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */