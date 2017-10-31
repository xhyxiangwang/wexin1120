package com.tencent.mm.plugin.freewifi.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.protocal.c.abi;
import com.tencent.mm.protocal.c.abj;

public final class i
  extends c
{
  public i(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    GMTrace.i(7248294182912L, 54004);
    aAl();
    abi localabi = (abi)this.gMC.hlU.hmc;
    localabi.fvF = paramString1;
    localabi.mdJ = paramString2;
    localabi.mdK = paramString3;
    localabi.mdL = paramString4;
    localabi.fxT = paramString5;
    localabi.tss = paramString6;
    GMTrace.o(7248294182912L, 54004);
  }
  
  protected final void aAl()
  {
    GMTrace.i(7248025747456L, 54002);
    b.a locala = new b.a();
    locala.hlX = new abi();
    locala.hlY = new abj();
    locala.uri = "/cgi-bin/mmo2o-bin/getportalapinfo";
    locala.hlW = 1709;
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    GMTrace.o(7248025747456L, 54002);
  }
  
  public final String aAw()
  {
    GMTrace.i(7248428400640L, 54005);
    String str = ((abj)this.gMC.hlV.hmc).meR;
    GMTrace.o(7248428400640L, 54005);
    return str;
  }
  
  public final String aAx()
  {
    GMTrace.i(7248562618368L, 54006);
    String str = ((abj)this.gMC.hlV.hmc).meS;
    GMTrace.o(7248562618368L, 54006);
    return str;
  }
  
  public final int getType()
  {
    GMTrace.i(7248159965184L, 54003);
    GMTrace.o(7248159965184L, 54003);
    return 1709;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/d/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */