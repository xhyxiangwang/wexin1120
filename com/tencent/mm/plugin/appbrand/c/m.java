package com.tencent.mm.plugin.appbrand.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.a;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.u.a;
import com.tencent.mm.protocal.c.bjc;
import com.tencent.mm.protocal.c.bjd;

public final class m
  extends a<bjd>
{
  private final bjc iFh;
  private final b iFi;
  public volatile u.a iFj;
  private final String irM;
  
  public m(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, String paramString1, int paramInt5, String paramString2)
  {
    GMTrace.i(19887577628672L, 148174);
    this.irM = paramString2;
    b.a locala = new b.a();
    bjc localbjc = new bjc();
    int i = paramInt1;
    if (paramInt1 == 0) {
      i = 1000;
    }
    localbjc.scene = i;
    if (paramBoolean) {}
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      localbjc.uzD = paramInt1;
      localbjc.tCf = paramInt2;
      localbjc.uzE = paramInt3;
      localbjc.uzF = paramInt4;
      localbjc.username = paramString1;
      localbjc.fFs = paramInt5;
      localbjc.uzG = paramString2;
      this.iFh = localbjc;
      locala.hlX = localbjc;
      locala.hlY = new bjd();
      locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/updatewxausagerecord";
      locala.hlW = 1149;
      paramString1 = locala.DA();
      this.iFi = paramString1;
      this.gMC = paramString1;
      GMTrace.o(19887577628672L, 148174);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/c/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */