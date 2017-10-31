package com.tencent.mm.plugin.ipcall.a.a;

import com.tencent.gmtrace.GMTrace;

public final class d
{
  public int gQy;
  public int mXM;
  public int mXp;
  
  public d()
  {
    GMTrace.i(11618691842048L, 86566);
    GMTrace.o(11618691842048L, 86566);
  }
  
  public final String toString()
  {
    GMTrace.i(11618826059776L, 86567);
    String str = String.format("IPCallUserInfo, userStatus: %d, syncKey: %d, memberId: %d", new Object[] { Integer.valueOf(this.gQy), Integer.valueOf(this.mXp), Integer.valueOf(this.mXM) });
    GMTrace.o(11618826059776L, 86567);
    return str;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */