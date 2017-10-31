package com.tencent.mm.plugin.appbrand.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.bph;
import com.tencent.mm.protocal.c.bpi;
import com.tencent.mm.protocal.c.bpj;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.Locale;

public final class a
  extends k
  implements j
{
  private com.tencent.mm.ac.e gPR;
  private b hjw;
  private bpi jiy;
  
  public a()
  {
    GMTrace.i(10554076823552L, 78634);
    b.a locala = new b.a();
    locala.hlX = new bph();
    locala.hlY = new bpi();
    locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/weappsearchtitle";
    locala.hlW = 1170;
    locala.hlZ = 0;
    locala.hma = 0;
    this.hjw = locala.DA();
    GMTrace.o(10554076823552L, 78634);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(10554345259008L, 78636);
    w.i("MicroMsg.NetSceneGetWeAppSearchTitle", "doScene");
    this.gPR = parame1;
    int i = a(parame, this.hjw, this);
    GMTrace.o(10554345259008L, 78636);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(10554479476736L, 78637);
    w.i("MicroMsg.NetSceneGetWeAppSearchTitle", "onGYNetEnd, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.jiy = ((bpi)this.hjw.hlV.hmc);
    if (this.gPR != null) {
      this.gPR.a(paramInt2, paramInt3, paramString, this);
    }
    if (this.jiy.uFv == null)
    {
      GMTrace.o(10554479476736L, 78637);
      return;
    }
    paramString = h.xz().xi();
    paramString.a(w.a.vaE, Locale.getDefault().getLanguage());
    paramString.a(w.a.vaF, this.jiy.uFv.nat);
    paramString.a(w.a.vaG, this.jiy.uFv.uFu);
    paramString.a(w.a.vaH, Long.valueOf(System.currentTimeMillis()));
    GMTrace.o(10554479476736L, 78637);
  }
  
  public final int getType()
  {
    GMTrace.i(15528320040960L, 115695);
    GMTrace.o(15528320040960L, 115695);
    return 1170;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */