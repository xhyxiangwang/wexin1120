package com.tencent.mm.plugin.sns.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.model.ao;
import com.tencent.mm.plugin.sns.model.ao.b;

public final class as
{
  public String fAx;
  public String fMT;
  public boolean qMx;
  public boolean qMy;
  public int scene;
  
  public as(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    GMTrace.i(8311298588672L, 61924);
    this.qMx = false;
    this.qMy = false;
    this.fMT = paramString1;
    this.qMx = paramBoolean1;
    this.qMy = paramBoolean2;
    this.scene = paramInt;
    this.fAx = paramString2;
    GMTrace.o(8311298588672L, 61924);
  }
  
  public final boolean bnr()
  {
    int i = 2;
    GMTrace.i(8311432806400L, 61925);
    if (this.scene == 1) {}
    for (;;)
    {
      ao.b localb = ao.GJ(this.fMT);
      if ((localb != null) && (localb.hie) && (!localb.hkX) && ((i & localb.gbQ) != 0))
      {
        GMTrace.o(8311432806400L, 61925);
        return true;
        if (this.scene == 2) {
          i = 4;
        }
      }
      else
      {
        GMTrace.o(8311432806400L, 61925);
        return false;
      }
      i = -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */