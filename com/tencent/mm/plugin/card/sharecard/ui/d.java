package com.tencent.mm.plugin.card.sharecard.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.plugin.card.base.a;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.report.service.g;
import java.util.ArrayList;

public final class d
  implements a
{
  private c ksg;
  
  public d(c paramc)
  {
    GMTrace.i(5076651343872L, 37824);
    this.ksg = paramc;
    GMTrace.o(5076651343872L, 37824);
  }
  
  public final void Bg()
  {
    GMTrace.i(5077053997056L, 37827);
    if (this.ksg != null) {
      this.ksg.a(null, null);
    }
    GMTrace.o(5077053997056L, 37827);
  }
  
  public final void onCreate()
  {
    GMTrace.i(5076785561600L, 37825);
    if (this.ksg != null) {
      al.ajC().c(this.ksg);
    }
    GMTrace.o(5076785561600L, 37825);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(5076919779328L, 37826);
    if (this.ksg != null)
    {
      al.ajC().j(this.ksg);
      Object localObject = this.ksg;
      ((c)localObject).kse.release();
      ((c)localObject).kse = null;
      ((c)localObject).aIb();
      int i = (int)(((c)localObject).endTime - ((c)localObject).beginTime);
      localObject = new ArrayList();
      IDKey localIDKey1 = new IDKey();
      localIDKey1.SetID(281);
      localIDKey1.SetKey(24);
      localIDKey1.SetValue(1L);
      IDKey localIDKey2 = new IDKey();
      localIDKey2.SetID(281);
      localIDKey2.SetKey(25);
      localIDKey2.SetValue(i);
      ((ArrayList)localObject).add(localIDKey1);
      ((ArrayList)localObject).add(localIDKey2);
      g.paX.b((ArrayList)localObject, true);
      this.ksg = null;
    }
    GMTrace.o(5076919779328L, 37826);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */