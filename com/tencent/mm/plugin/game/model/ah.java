package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.n;
import com.tencent.mm.pluginsdk.model.app.al;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.util.ArrayList;

public final class ah
  implements e
{
  ArrayList<a> mBU;
  private boolean mBV;
  
  public ah()
  {
    GMTrace.i(12592575676416L, 93822);
    this.mBV = false;
    ap.wT().a(427, this);
    this.mBU = new ArrayList();
    GMTrace.o(12592575676416L, 93822);
  }
  
  private void aEW()
  {
    GMTrace.i(12592844111872L, 93824);
    do
    {
      if (this.mBV)
      {
        w.i("MicroMsg.AppReportService", "is doing scene, wait for a minite");
        GMTrace.o(12592844111872L, 93824);
        return;
      }
      if ((this.mBU == null) || (this.mBU.size() == 0))
      {
        w.d("MicroMsg.AppReportService", "report queue is null, no need do scnene");
        GMTrace.o(12592844111872L, 93824);
        return;
      }
      localObject = (a)this.mBU.remove(0);
    } while (localObject == null);
    this.mBV = true;
    Object localObject = new al(((a)localObject).hPv, ((a)localObject).mBW);
    ap.wT().a((com.tencent.mm.ac.k)localObject, 0);
    GMTrace.o(12592844111872L, 93824);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(12592978329600L, 93825);
    this.mBV = false;
    aEW();
    GMTrace.o(12592978329600L, 93825);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(12592709894144L, 93823);
    if (!this.mBU.contains(parama)) {
      this.mBU.add(parama);
    }
    aEW();
    GMTrace.o(12592709894144L, 93823);
  }
  
  public static final class a
  {
    public int hPv;
    public String mBW;
    
    public a()
    {
      GMTrace.i(12584388395008L, 93761);
      GMTrace.o(12584388395008L, 93761);
    }
    
    public static a h(int paramInt, Object... paramVarArgs)
    {
      GMTrace.i(12584522612736L, 93762);
      a locala = new a();
      locala.hPv = paramInt;
      StringBuilder localStringBuilder = new StringBuilder();
      int j = paramVarArgs.length - 1;
      int i = 0;
      while (i < j)
      {
        localStringBuilder.append(String.valueOf(paramVarArgs[i])).append(',');
        i += 1;
      }
      localStringBuilder.append(String.valueOf(paramVarArgs[j]));
      locala.mBW = localStringBuilder.toString();
      if (k.fCD > 0) {
        w.i("MicroMsg.AppReportService", "appStat logID=%d, vals.size=%d, val = %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramVarArgs.length), localStringBuilder.toString() });
      }
      for (;;)
      {
        GMTrace.o(12584522612736L, 93762);
        return locala;
        w.d("MicroMsg.AppReportService", "appStat logID=%d, vals.size=%d, val = %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramVarArgs.length), localStringBuilder.toString() });
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */