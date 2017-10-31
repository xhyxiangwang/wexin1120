package com.tencent.mm.plugin.freewifi.d;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.plugin.freewifi.g.d;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.protocal.c.bcd;
import com.tencent.mm.protocal.c.cj;
import com.tencent.mm.protocal.c.dy;
import com.tencent.mm.protocal.c.vs;
import com.tencent.mm.protocal.c.vt;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class f
  extends c
{
  private static int meq;
  private String mac;
  private String ssid;
  
  static
  {
    GMTrace.i(7254199762944L, 54048);
    meq = 7200;
    GMTrace.o(7254199762944L, 54048);
  }
  
  public f(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    GMTrace.i(7253797109760L, 54045);
    aAl();
    this.ssid = paramString1;
    this.mac = paramString2;
    cj localcj = new cj();
    localcj.mac = paramString2;
    localcj.ssid = paramString1;
    paramString1 = (vs)this.gMC.hlU.hmc;
    paramString1.appId = paramString3;
    paramString1.meQ = paramString4;
    paramString1.meR = paramString5;
    paramString1.meS = paramString6;
    paramString1.fwH = paramString7;
    paramString1.sign = paramString8;
    paramString1.tTH = localcj;
    GMTrace.o(7253797109760L, 54045);
  }
  
  protected final void aAl()
  {
    GMTrace.i(7253528674304L, 54043);
    b.a locala = new b.a();
    locala.hlX = new vs();
    locala.hlY = new vt();
    locala.uri = "/cgi-bin/mmo2o-bin/getbackpagefor33";
    locala.hlW = 1726;
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    GMTrace.o(7253528674304L, 54043);
  }
  
  public final dy aAs()
  {
    GMTrace.i(7254065545216L, 54047);
    dy localdy = ((vt)this.gMC.hlV.hmc).mhb;
    GMTrace.o(7254065545216L, 54047);
    return localdy;
  }
  
  protected final void b(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    GMTrace.i(7253931327488L, 54046);
    paramString = j.aAe().yb(this.ssid);
    if (paramString == null)
    {
      paramString = new com.tencent.mm.plugin.freewifi.g.c();
      paramString.field_ssidmd5 = aa.QW(this.ssid);
    }
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      if ((paramInt2 == 0) && (paramInt3 == 0))
      {
        vt localvt = (vt)this.gMC.hlV.hmc;
        paramString.field_ssid = this.ssid;
        paramString.field_showUrl = localvt.tsy;
        bcd localbcd = localvt.tsz;
        if (localbcd != null)
        {
          w.i("MicroMsg.FreeWifi.NetSceneGetBackPageFor33", "en : %s, cn : %s, tw : %s", new Object[] { localbcd.uuj, localbcd.uuk, localbcd.uul });
          paramString.field_showWordCn = localbcd.uuk;
          paramString.field_showWordEn = localbcd.uuj;
          paramString.field_showWordTw = localbcd.uul;
          paramString.field_action = localvt.tsx;
          paramString.field_verifyResult = 1;
          paramString.field_connectState = -1;
          if (localvt.tsH <= 0) {
            localvt.tsH = meq;
          }
          paramString.field_expiredTime = (bg.Po() + localvt.tsH);
          paramString.field_mac = this.mac;
          if (paramInt1 == 0) {
            break label331;
          }
          w.i("MicroMsg.FreeWifi.NetSceneGetBackPageFor33", "insert freewifi ret = %b", new Object[] { Boolean.valueOf(j.aAe().b(paramString)) });
        }
        for (;;)
        {
          j.aAe().yc(this.ssid);
          GMTrace.o(7253931327488L, 54046);
          return;
          paramString.field_showWordCn = ab.getContext().getResources().getString(R.l.ebp);
          paramString.field_showWordEn = ab.getContext().getResources().getString(R.l.ebp);
          paramString.field_showWordTw = ab.getContext().getResources().getString(R.l.ebp);
          break;
          label331:
          w.i("MicroMsg.FreeWifi.NetSceneGetBackPageFor33", "insert freewifi ret = %b", new Object[] { Boolean.valueOf(j.aAe().c(paramString, new String[0])) });
        }
      }
      w.e("MicroMsg.FreeWifi.NetSceneGetBackPageFor33", "check this ap failed, ssid is :%s", new Object[] { this.ssid });
      if (paramInt1 == 0)
      {
        boolean bool = j.aAe().a(paramString, new String[0]);
        w.i("MicroMsg.FreeWifi.NetSceneGetBackPageFor33", "freewifi verify failed, delte local db infos : %s, ret = %b", new Object[] { this.ssid, Boolean.valueOf(bool) });
      }
      GMTrace.o(7253931327488L, 54046);
      return;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(7253662892032L, 54044);
    GMTrace.o(7253662892032L, 54044);
    return 1726;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/d/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */