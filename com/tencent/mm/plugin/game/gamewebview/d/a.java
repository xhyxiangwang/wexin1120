package com.tencent.mm.plugin.game.gamewebview.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.MMWebView;

public final class a
{
  public d muE;
  private String mwd;
  private int mwe;
  private int mwf;
  public int mwg;
  public boolean mwh;
  public long mwi;
  public long mwj;
  public long mwk;
  public long mwl;
  public long mwm;
  
  public a(d paramd)
  {
    GMTrace.i(18026246176768L, 134306);
    this.muE = paramd;
    this.mwe = am.getNetType(ab.getContext());
    if (paramd.mwT.isX5Kernel) {}
    for (int i = 1;; i = 2)
    {
      this.mwf = i;
      this.mwi = System.currentTimeMillis();
      this.mwd = bg.mY(this.muE.mwd);
      GMTrace.o(18026246176768L, 134306);
      return;
    }
  }
  
  public final void a(String paramString, int paramInt1, long paramLong, int paramInt2, int paramInt3)
  {
    GMTrace.i(18026514612224L, 134308);
    g.paX.i(14531, new Object[] { this.muE.aDq(), ai.ze(this.mwd), ai.ze(paramString), Integer.valueOf(paramInt1), Long.valueOf(paramLong), Integer.valueOf(paramInt2), Integer.valueOf(this.mwe), Integer.valueOf(this.mwf), Integer.valueOf(paramInt3) });
    GMTrace.o(18026514612224L, 134308);
  }
  
  public final void eS(boolean paramBoolean)
  {
    int i = 1;
    GMTrace.i(18026380394496L, 134307);
    long l = System.currentTimeMillis() - this.mwl;
    w.d("MicroMsg.GameWebViewReportManager", "getA8keyTime = %d, success = %b", new Object[] { Long.valueOf(l), Boolean.valueOf(paramBoolean) });
    Object localObject = this.muE.aDp();
    if (paramBoolean)
    {
      a((String)localObject, 3, l, i, 0);
      localObject = g.paX;
      if (!paramBoolean) {
        break label105;
      }
    }
    label105:
    for (l = 2L;; l = 1L)
    {
      ((g)localObject).a(607L, l, 1L, false);
      GMTrace.o(18026380394496L, 134307);
      return;
      i = 0;
      break;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */