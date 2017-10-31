package com.tencent.mm.au;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.b;
import com.tencent.mm.protocal.c.ani;
import com.tencent.mm.protocal.c.axt;
import com.tencent.mm.sdk.platformtools.bg;

@Deprecated
public final class k
  extends e.b
{
  private ani hHK;
  
  public k(String paramString, int paramInt)
  {
    super(20);
    GMTrace.i(300513492992L, 2239);
    this.hHK = new ani();
    this.hHK.tuX = new axt().Qx(bg.mY(paramString));
    this.hHK.jXo = paramInt;
    this.nIw = this.hHK;
    GMTrace.o(300513492992L, 2239);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/au/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */