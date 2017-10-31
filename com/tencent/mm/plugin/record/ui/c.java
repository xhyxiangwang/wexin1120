package com.tencent.mm.plugin.record.ui;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.fo;
import com.tencent.mm.g.a.fo.a;
import com.tencent.mm.g.a.fo.b;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  implements h.a
{
  public c(Context paramContext)
  {
    GMTrace.i(7527467057152L, 56084);
    fo localfo = new fo();
    localfo.fBa.opType = 3;
    localfo.fBa.context = paramContext;
    a.uLm.m(localfo);
    GMTrace.o(7527467057152L, 56084);
  }
  
  public final Bitmap a(h.a.b paramb)
  {
    GMTrace.i(7527869710336L, 56087);
    fo localfo = new fo();
    localfo.fBa.opType = 2;
    localfo.fBa.fBh = false;
    if (paramb.fBf)
    {
      localfo.fBa.fBc = paramb.fBc;
      localfo.fBa.fBf = paramb.fBf;
    }
    for (;;)
    {
      a.uLm.m(localfo);
      w.d("MicroMsg.FavImageServiceProxy", "getSuitableBigImg favLocalId %s, dataId %s, retBmp %s, fromCache", new Object[] { Long.valueOf(paramb.oUO), paramb.fBc.lUP, localfo.fBb.fBi, Boolean.valueOf(localfo.fBa.fBf) });
      paramb = localfo.fBb.fBi;
      GMTrace.o(7527869710336L, 56087);
      return paramb;
      localfo.fBa.fBc = paramb.fBc;
      localfo.fBa.fwq = paramb.oUO;
      localfo.fBa.maxWidth = paramb.maxWidth;
      localfo.fBa.fBg = paramb.fBg;
    }
  }
  
  public final Bitmap a(h.a.c paramc)
  {
    GMTrace.i(7527735492608L, 56086);
    fo localfo = new fo();
    localfo.fBa.opType = 0;
    localfo.fBa.fBc = paramc.fBc;
    localfo.fBa.fwq = paramc.oUO;
    a.uLm.m(localfo);
    w.d("MicroMsg.FavImageServiceProxy", "getThumb favLocalId %s, retBmp %s", new Object[] { Long.valueOf(paramc.oUO), localfo.fBb.fBi });
    paramc = localfo.fBb.fBi;
    GMTrace.o(7527735492608L, 56086);
    return paramc;
  }
  
  public final void a(h.a.a parama)
  {
    GMTrace.i(7527601274880L, 56085);
    w.d("MicroMsg.FavImageServiceProxy", "attachThumb favLocalId %s", new Object[] { Long.valueOf(parama.oUO) });
    fo localfo = new fo();
    localfo.fBa.opType = 1;
    localfo.fBa.fBd = parama.fBd;
    localfo.fBa.fBc = parama.fBc;
    localfo.fBa.fwq = parama.oUO;
    localfo.fBa.fBe = parama.fBe;
    localfo.fBa.width = parama.width;
    localfo.fBa.height = parama.height;
    a.uLm.m(localfo);
    GMTrace.o(7527601274880L, 56085);
  }
  
  public final void aZk()
  {
    GMTrace.i(7528003928064L, 56088);
    fo localfo = new fo();
    localfo.fBa.opType = 4;
    a.uLm.m(localfo);
    GMTrace.o(7528003928064L, 56088);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/record/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */