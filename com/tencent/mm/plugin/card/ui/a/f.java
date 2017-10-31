package com.tencent.mm.plugin.card.ui.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.protocal.c.jf;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;

public final class f
  extends a
{
  public f(MMActivity paramMMActivity)
  {
    super(paramMMActivity);
    GMTrace.i(4947265454080L, 36860);
    GMTrace.o(4947265454080L, 36860);
  }
  
  public final boolean alN()
  {
    GMTrace.i(4947399671808L, 36861);
    boolean bool = this.kzo;
    GMTrace.o(4947399671808L, 36861);
    return bool;
  }
  
  public final boolean alO()
  {
    GMTrace.i(4947533889536L, 36862);
    if ((this.kmJ.aiG()) && (super.alO()) && ((this.kmJ.aiE()) || (!bg.mZ(this.kmJ.aiL().code))))
    {
      GMTrace.o(4947533889536L, 36862);
      return true;
    }
    GMTrace.o(4947533889536L, 36862);
    return false;
  }
  
  public final boolean alP()
  {
    GMTrace.i(4947668107264L, 36863);
    GMTrace.o(4947668107264L, 36863);
    return true;
  }
  
  public final boolean alS()
  {
    GMTrace.i(4947802324992L, 36864);
    if ((this.kmJ.aiG()) && (super.alS()))
    {
      GMTrace.o(4947802324992L, 36864);
      return true;
    }
    GMTrace.o(4947802324992L, 36864);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */