package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.plugin.webview.model.aj;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class g
{
  public static g sra;
  private String fwy;
  boolean hie;
  private int networkType;
  String qlo;
  String srb;
  
  static
  {
    GMTrace.i(12123216281600L, 90325);
    sra = new g();
    GMTrace.o(12123216281600L, 90325);
  }
  
  private g()
  {
    GMTrace.i(12122545192960L, 90320);
    this.hie = false;
    GMTrace.o(12122545192960L, 90320);
  }
  
  final void c(int paramInt1, String paramString, int paramInt2)
  {
    GMTrace.i(12123082063872L, 90324);
    d locald = new d();
    locald.m("20adInfo", this.qlo + ",");
    locald.m("21optype", paramInt1 + ",");
    locald.m("22sessionId", this.fwy + ",");
    locald.m("23currURL", this.srb + ",");
    locald.m("24referURL", paramString + ",");
    locald.m("25errCode", paramInt2 + ",");
    locald.m("26networkType", this.networkType + ",");
    locald.m("27timeStamp", bg.Pp() + ",");
    w.i("MicroMsg.WebViewReportUtil", "report logbuffer adPageOp(13791): optype:%d, sessionId:%s, currUrl:%s, referUrl:%s, errCode:%d, networkType:%d", new Object[] { Integer.valueOf(paramInt1), this.fwy, this.srb, paramString, Integer.valueOf(paramInt2), Integer.valueOf(this.networkType) });
    com.tencent.mm.plugin.report.service.g.paX.i(13791, new Object[] { locald });
    GMTrace.o(12123082063872L, 90324);
  }
  
  public final void close()
  {
    GMTrace.i(12122813628416L, 90322);
    w.v("MicroMsg.WebViewReportUtil", "close traceid %s", new Object[] { this.qlo });
    this.hie = true;
    if (bg.mZ(this.qlo))
    {
      GMTrace.o(12122813628416L, 90322);
      return;
    }
    nK(4);
    this.qlo = null;
    GMTrace.o(12122813628416L, 90322);
  }
  
  public final void dX(String paramString1, String paramString2)
  {
    GMTrace.i(18067048366080L, 134610);
    w.i("MicroMsg.WebViewReportUtil", "setting traceid " + paramString1 + ",usename " + paramString2);
    this.qlo = paramString1;
    this.networkType = aj.bAf();
    this.fwy = aa.QW(paramString2 + bg.Pp());
    this.hie = false;
    GMTrace.o(18067048366080L, 134610);
  }
  
  final void nK(int paramInt)
  {
    GMTrace.i(12122947846144L, 90323);
    c(paramInt, "", 0);
    GMTrace.o(12122947846144L, 90323);
  }
  
  public final void xw(int paramInt)
  {
    GMTrace.i(12122679410688L, 90321);
    w.v("MicroMsg.WebViewReportUtil", "onReceivedError traceid %s", new Object[] { this.qlo });
    if (bg.mZ(this.qlo))
    {
      GMTrace.o(12122679410688L, 90321);
      return;
    }
    c(3, "", paramInt);
    GMTrace.o(12122679410688L, 90321);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */