package com.tencent.mm.plugin.freewifi.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.protocal.c.lo;
import com.tencent.mm.protocal.c.lp;

public final class d
  extends c
{
  public d(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, long paramLong, String paramString6, String paramString7)
  {
    GMTrace.i(7255273504768L, 54056);
    aAl();
    lo locallo = (lo)this.gMC.hlU.hmc;
    locallo.tHT = paramString1;
    locallo.tHU = paramString2;
    locallo.tHV = paramString3;
    locallo.tHW = paramString4;
    locallo.tHX = paramString5;
    locallo.tHY = paramLong;
    locallo.tHZ = paramString6;
    locallo.tIa = paramString7;
    GMTrace.o(7255273504768L, 54056);
  }
  
  protected final void aAl()
  {
    GMTrace.i(7255005069312L, 54054);
    b.a locala = new b.a();
    locala.hlX = new lo();
    locala.hlY = new lp();
    locala.uri = "/cgi-bin/mmo2o-bin/checkifcallup";
    locala.hlW = 1155;
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    GMTrace.o(7255005069312L, 54054);
  }
  
  public final lp aAt()
  {
    GMTrace.i(7255407722496L, 54057);
    lp locallp = (lp)this.gMC.hlV.hmc;
    GMTrace.o(7255407722496L, 54057);
    return locallp;
  }
  
  public final int getType()
  {
    GMTrace.i(15395712925696L, 114707);
    GMTrace.o(15395712925696L, 114707);
    return 1155;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */