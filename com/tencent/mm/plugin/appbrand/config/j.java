package com.tencent.mm.plugin.appbrand.config;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.a;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.protocal.c.bst;
import com.tencent.mm.protocal.c.bsv;
import com.tencent.mm.sdk.platformtools.bg;

final class j
  extends a<bsv>
{
  final com.tencent.mm.ac.b gMC;
  
  j(String paramString1, String paramString2)
  {
    GMTrace.i(17268989755392L, 128664);
    b.a locala = new b.a();
    bst localbst = new bst();
    localbst.uHG = paramString1;
    if (bg.mZ(paramString1))
    {
      paramString1 = f.Sa().e(paramString2, new String[] { "syncVersion" });
      if (paramString1 == null) {
        paramString1 = "";
      }
    }
    for (paramString1 = new com.tencent.mm.bl.b(paramString1.getBytes());; paramString1 = q.pi(paramString1))
    {
      localbst.tAZ = paramString1;
      localbst.uHH = paramString2;
      locala.hlX = localbst;
      locala.hlY = new bsv();
      locala.hlW = 1151;
      locala.uri = "/cgi-bin/mmbiz-bin/wxaattr/wxaattrsync";
      paramString1 = locala.DA();
      this.gMC = paramString1;
      this.gMC = paramString1;
      GMTrace.o(17268989755392L, 128664);
      return;
      paramString1 = bg.mY(paramString1.field_syncVersion);
      break;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */