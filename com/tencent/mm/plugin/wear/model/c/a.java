package com.tencent.mm.plugin.wear.model.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wear.model.d;
import com.tencent.mm.plugin.wear.model.e.i;
import com.tencent.mm.protocal.c.bqb;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;

public final class a
{
  public static final void dB(int paramInt1, int paramInt2)
  {
    GMTrace.i(9196330287104L, 68518);
    bqb localbqb = com.tencent.mm.plugin.wear.model.a.bzo().shh.shy.sim;
    if (localbqb != null)
    {
      w.v("MicroMsg.Wear.ReportKVUtil", "report kv operation=%d scene=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      g.paX.i(11632, new Object[] { Integer.valueOf(paramInt1), localbqb.jXb, localbqb.uFF, Integer.valueOf(paramInt2) });
    }
    GMTrace.o(9196330287104L, 68518);
  }
  
  public static final void jl(boolean paramBoolean)
  {
    GMTrace.i(9196598722560L, 68520);
    ArrayList localArrayList = new ArrayList();
    IDKey localIDKey = new IDKey();
    localIDKey.SetID(249);
    localIDKey.SetKey(12);
    localIDKey.SetValue(1L);
    localArrayList.add(localIDKey);
    if (paramBoolean)
    {
      localIDKey = new IDKey();
      localIDKey.SetID(249);
      localIDKey.SetKey(13);
      localIDKey.SetValue(1L);
      localArrayList.add(localIDKey);
    }
    g.paX.b(localArrayList, false);
    GMTrace.o(9196598722560L, 68520);
  }
  
  public static final void wQ(int paramInt)
  {
    GMTrace.i(9196464504832L, 68519);
    g.paX.a(249L, paramInt, 1L, false);
    GMTrace.o(9196464504832L, 68519);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */