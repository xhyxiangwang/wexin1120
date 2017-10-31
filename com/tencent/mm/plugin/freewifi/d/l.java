package com.tencent.mm.plugin.freewifi.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.protocal.c.bay;
import com.tencent.mm.protocal.c.baz;

public final class l
  extends c
{
  public l(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(7247891529728L, 54001);
    aAl();
    bay localbay = (bay)this.gMC.hlU.hmc;
    localbay.appId = paramString1;
    localbay.mhK = paramInt;
    localbay.fxT = paramString2;
    GMTrace.o(7247891529728L, 54001);
  }
  
  protected final void aAl()
  {
    GMTrace.i(7247623094272L, 53999);
    b.a locala = new b.a();
    locala.hlX = new bay();
    locala.hlY = new baz();
    locala.uri = "/cgi-bin/mmo2o-bin/setpcloginuserInfo";
    locala.hlW = 1761;
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    GMTrace.o(7247623094272L, 53999);
  }
  
  public final int getType()
  {
    GMTrace.i(7247757312000L, 54000);
    GMTrace.o(7247757312000L, 54000);
    return 1761;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/d/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */