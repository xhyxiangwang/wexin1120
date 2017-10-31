package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class a
{
  public volatile af skD;
  public aj skE;
  
  public a(aj paramaj)
  {
    GMTrace.i(12011815567360L, 89495);
    this.skD = new af("WebviewWorkerThread");
    this.skE = paramaj;
    GMTrace.o(12011815567360L, 89495);
  }
  
  public final af xC()
  {
    GMTrace.i(12011949785088L, 89496);
    if (this.skD == null) {
      this.skD = new af("WebviewWorkerThread");
    }
    af localaf = this.skD;
    GMTrace.o(12011949785088L, 89496);
    return localaf;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/model/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */