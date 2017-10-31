package com.tencent.mm.plugin.freewifi.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.protocal.c.aya;
import com.tencent.mm.protocal.c.ck;
import com.tencent.mm.protocal.c.hp;
import com.tencent.mm.protocal.c.hq;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class k
  extends c
{
  public k(String paramString1, aya paramaya, int paramInt, String paramString2)
  {
    GMTrace.i(7252052279296L, 54032);
    aAl();
    if ((8 != paramInt) || (9 != paramInt)) {
      w.e("MicroMsg.FreeWifi.NetSceneScanAndReportNearFieldFreeWifi", "invalid channel, channel is :%d", new Object[] { Integer.valueOf(paramInt) });
    }
    hp localhp = (hp)this.gMC.hlU.hmc;
    localhp.tAY = paramString1;
    localhp.tCd = paramaya;
    localhp.tsr = paramInt;
    localhp.tss = paramString2;
    GMTrace.o(7252052279296L, 54032);
  }
  
  protected final void aAl()
  {
    GMTrace.i(7251783843840L, 54030);
    b.a locala = new b.a();
    locala.hlX = new hp();
    locala.hlY = new hq();
    locala.uri = "/cgi-bin/mmo2o-bin/bizwificonnect";
    locala.hlW = 1705;
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    GMTrace.o(7251783843840L, 54030);
  }
  
  public final String aAz()
  {
    GMTrace.i(7252186497024L, 54033);
    Object localObject = ((hq)this.gMC.hlV.hmc).tCe;
    if ((localObject != null) && (((LinkedList)localObject).size() == 1))
    {
      localObject = ((ck)((LinkedList)localObject).get(0)).tvN;
      GMTrace.o(7252186497024L, 54033);
      return (String)localObject;
    }
    GMTrace.o(7252186497024L, 54033);
    return null;
  }
  
  public final int getType()
  {
    GMTrace.i(7251918061568L, 54031);
    GMTrace.o(7251918061568L, 54031);
    return 1705;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/d/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */