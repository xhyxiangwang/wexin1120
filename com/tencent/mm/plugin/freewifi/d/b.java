package com.tencent.mm.plugin.freewifi.d;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.plugin.freewifi.g.d;
import com.tencent.mm.plugin.freewifi.h;
import com.tencent.mm.plugin.freewifi.h.b;
import com.tencent.mm.plugin.freewifi.i;
import com.tencent.mm.plugin.freewifi.i.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.protocal.c.ac;
import com.tencent.mm.protocal.c.bcd;
import com.tencent.mm.protocal.c.cj;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class b
  extends c
{
  private static int meq;
  public String mac;
  private String ssid;
  
  static
  {
    GMTrace.i(7254870851584L, 54053);
    meq = 7200;
    GMTrace.o(7254870851584L, 54053);
  }
  
  public b(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    GMTrace.i(7254602416128L, 54051);
    aAl();
    this.ssid = paramString2;
    this.mac = paramString1;
    LinkedList localLinkedList = new LinkedList();
    Object localObject = new cj();
    ((cj)localObject).ssid = paramString2;
    ((cj)localObject).mac = paramString1;
    ((cj)localObject).tvM = paramInt1;
    localLinkedList.add(localObject);
    localObject = (com.tencent.mm.protocal.c.ab)this.gMC.hlU.hmc;
    ((com.tencent.mm.protocal.c.ab)localObject).tsI = h.b.mbR.azv();
    ((com.tencent.mm.protocal.c.ab)localObject).tsq = localLinkedList;
    ((com.tencent.mm.protocal.c.ab)localObject).tsJ = m.azJ();
    ((com.tencent.mm.protocal.c.ab)localObject).tsK = paramInt2;
    w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "new apcheck request. mac = %s, ssid = %s, rssi = %d", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1) });
    GMTrace.o(7254602416128L, 54051);
  }
  
  protected final void aAl()
  {
    GMTrace.i(7254333980672L, 54049);
    b.a locala = new b.a();
    locala.hlX = new com.tencent.mm.protocal.c.ab();
    locala.hlY = new ac();
    locala.uri = "/cgi-bin/mmo2o-bin/apcheck";
    locala.hlW = 1744;
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    GMTrace.o(7254333980672L, 54049);
  }
  
  protected final void b(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    GMTrace.i(7254736633856L, 54052);
    w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "apcheck returns. onGYNetEnd : errType : %d, errCode : %d, errMsg : %s ", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    boolean bool;
    if ((this.gMC != null) && (this.gMC.hlV.hmc != null))
    {
      h.b.mbR.a((ac)this.gMC.hlV.hmc);
      if ((m.cc(paramInt2, paramInt3)) || (m.cd(paramInt2, paramInt3)))
      {
        paramString = (ac)this.gMC.hlV.hmc;
        paramInt1 = paramString.tsN;
        bool = paramString.tsM;
        if ((paramInt1 != 0) && (paramInt1 != i.a.mbS.getInt("LOCAL_CONFIG_APCHECK_DELAY_CRD_EXPIRED_DAYS", 7))) {
          i.a.mbS.ba("LOCAL_CONFIG_APCHECK_DELAY_CRD_EXPIRED_DAYS", paramInt1);
        }
        if (bool) {
          i.a.mbS.w("LOCAL_CONFIG_LAST_APCHECK_SAVE_DELAY_CRD_TIMEMILLIS", System.currentTimeMillis());
        }
      }
    }
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
        ac localac = (ac)this.gMC.hlV.hmc;
        paramString.field_ssid = this.ssid;
        paramString.field_showUrl = localac.tsy;
        bcd localbcd = localac.tsz;
        if (localbcd != null)
        {
          w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "en : %s, cn : %s, tw : %s", new Object[] { localbcd.uuj, localbcd.uuk, localbcd.uul });
          paramString.field_showWordCn = localbcd.uuk;
          paramString.field_showWordEn = localbcd.uuj;
          paramString.field_showWordTw = localbcd.uul;
          paramString.field_action = localac.tsx;
          paramString.field_verifyResult = 1;
          paramString.field_connectState = -1;
          if (localac.tsH <= 0) {
            localac.tsH = meq;
          }
          paramString.field_expiredTime = (bg.Po() + localac.tsH);
          paramString.field_mac = this.mac;
          if (paramInt1 == 0) {
            break label489;
          }
          w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "insert freewifi ret = %b", new Object[] { Boolean.valueOf(j.aAe().b(paramString)) });
        }
        for (;;)
        {
          j.aAe().yc(this.ssid);
          GMTrace.o(7254736633856L, 54052);
          return;
          paramString.field_showWordCn = com.tencent.mm.sdk.platformtools.ab.getContext().getResources().getString(R.l.ebp);
          paramString.field_showWordEn = com.tencent.mm.sdk.platformtools.ab.getContext().getResources().getString(R.l.ebp);
          paramString.field_showWordTw = com.tencent.mm.sdk.platformtools.ab.getContext().getResources().getString(R.l.ebp);
          break;
          label489:
          w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "insert freewifi ret = %b", new Object[] { Boolean.valueOf(j.aAe().c(paramString, new String[0])) });
        }
      }
      w.e("MicroMsg.FreeWifi.NetSceneAPAuth", "check this ap failed, ssid is :%s", new Object[] { this.ssid });
      if (paramInt1 == 0)
      {
        bool = j.aAe().a(paramString, new String[0]);
        w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "freewifi verify failed, delte local db infos : %s, ret = %b", new Object[] { this.ssid, Boolean.valueOf(bool) });
      }
      GMTrace.o(7254736633856L, 54052);
      return;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(7254468198400L, 54050);
    GMTrace.o(7254468198400L, 54050);
    return 1744;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */