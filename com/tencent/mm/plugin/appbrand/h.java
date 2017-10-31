package com.tencent.mm.plugin.appbrand;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.task.a;
import com.tencent.mm.plugin.report.service.g;

public final class h
{
  int afx;
  int hJp;
  long[] irF;
  int irG;
  private int irH;
  int irI;
  int mType;
  
  public h()
  {
    GMTrace.i(18854369558528L, 140476);
    this.irH = 0;
    this.irI = 0;
    GMTrace.o(18854369558528L, 140476);
  }
  
  public final void k(int paramInt, long paramLong)
  {
    GMTrace.i(18854503776256L, 140477);
    if (paramInt == 0)
    {
      this.irF = new long[6];
      if (!a.ZM()) {
        break label64;
      }
    }
    label64:
    for (int i = 1;; i = 0)
    {
      this.irH = i;
      if ((paramInt < this.irF.length) && (this.irF[paramInt] == 0L)) {
        break;
      }
      GMTrace.o(18854503776256L, 140477);
      return;
    }
    this.irF[paramInt] = paramLong;
    GMTrace.o(18854503776256L, 140477);
  }
  
  final void m(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(18854637993984L, 140478);
    g.paX.i(13886, new Object[] { paramString, Integer.valueOf(this.afx), Integer.valueOf(this.mType), Integer.valueOf(paramInt1), "", "", Long.valueOf(this.irF[paramInt2]), Integer.valueOf(this.irG), Integer.valueOf(this.irH), Integer.valueOf(this.hJp), Integer.valueOf(this.irI) });
    GMTrace.o(18854637993984L, 140478);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */