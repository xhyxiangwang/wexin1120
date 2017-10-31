package com.tencent.mm.plugin.freewifi.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.protocal.c.abe;
import com.tencent.mm.protocal.c.abf;
import com.tencent.mm.protocal.c.tv;

public final class h
  extends c
{
  public h(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(7256347246592L, 54064);
    aAl();
    abe localabe = (abe)this.gMC.hlU.hmc;
    localabe.appId = paramString1;
    localabe.mhK = paramInt;
    localabe.fxT = paramString2;
    GMTrace.o(7256347246592L, 54064);
  }
  
  protected final void aAl()
  {
    GMTrace.i(7256078811136L, 54062);
    b.a locala = new b.a();
    locala.hlX = new abe();
    locala.hlY = new abf();
    locala.uri = "/cgi-bin/mmo2o-bin/getpcfrontpage";
    locala.hlW = 1760;
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    GMTrace.o(7256078811136L, 54062);
  }
  
  public final tv aAp()
  {
    GMTrace.i(7256481464320L, 54065);
    Object localObject = (abf)this.gMC.hlV.hmc;
    if (localObject != null)
    {
      localObject = ((abf)localObject).tsD;
      GMTrace.o(7256481464320L, 54065);
      return (tv)localObject;
    }
    GMTrace.o(7256481464320L, 54065);
    return null;
  }
  
  public final int getType()
  {
    GMTrace.i(7256213028864L, 54063);
    GMTrace.o(7256213028864L, 54063);
    return 1760;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/d/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */