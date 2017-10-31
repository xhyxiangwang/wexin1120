package com.tencent.mm.plugin.freewifi.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.protocal.c.aaa;
import com.tencent.mm.protocal.c.zz;

public final class g
  extends c
{
  public g(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(7255810375680L, 54060);
    aAl();
    zz localzz = (zz)this.gMC.hlU.hmc;
    localzz.mdJ = paramString1;
    localzz.mdK = paramString2;
    localzz.mdL = paramString3;
    localzz.tsJ = m.azJ();
    GMTrace.o(7255810375680L, 54060);
  }
  
  protected final void aAl()
  {
    GMTrace.i(7255541940224L, 54058);
    b.a locala = new b.a();
    locala.hlX = new zz();
    locala.hlY = new aaa();
    locala.uri = "/cgi-bin/mmo2o-bin/getprotocol31schemaurl";
    locala.hlW = 1746;
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    GMTrace.o(7255541940224L, 54058);
  }
  
  public final String aAv()
  {
    GMTrace.i(7255944593408L, 54061);
    String str = ((aaa)this.gMC.hlV.hmc).tWs;
    GMTrace.o(7255944593408L, 54061);
    return str;
  }
  
  public final int getType()
  {
    GMTrace.i(7255676157952L, 54059);
    GMTrace.o(7255676157952L, 54059);
    return 1746;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/d/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */