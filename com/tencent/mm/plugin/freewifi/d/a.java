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
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.protocal.c.aul;
import com.tencent.mm.protocal.c.bcd;
import com.tencent.mm.protocal.c.cj;
import com.tencent.mm.protocal.c.dy;
import com.tencent.mm.protocal.c.tv;
import com.tencent.mm.protocal.c.z;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.net.URLDecoder;
import java.util.LinkedList;

public final class a
  extends c
{
  private static int meq;
  private int fAy;
  private String mac;
  private String ssid;
  
  static
  {
    GMTrace.i(7250978537472L, 54024);
    meq = 7200;
    GMTrace.o(7250978537472L, 54024);
  }
  
  public a(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(7249770577920L, 54015);
    aAl();
    this.fAy = 4;
    z localz = (z)this.gMC.hlU.hmc;
    localz.tsp = 4;
    localz.URL = paramString1;
    localz.tsr = paramInt;
    localz.tss = paramString2;
    localz.tst = m.azH();
    localz.tsq = new LinkedList();
    paramString2 = new cj();
    paramString2.ssid = m.xM("MicroMsg.FreeWifi.NetSceneAPAuth");
    paramString2.mac = m.xN("MicroMsg.FreeWifi.NetSceneAPAuth");
    localz.tsq.add(paramString2);
    localz.tsu = m.xO("MicroMsg.FreeWifi.NetSceneAPAuth");
    w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "Constructing get front page request, HasMobile=%d, Ap_info[0].ssid=%s, Ap_info[0].mac=%s", new Object[] { Integer.valueOf(localz.tst), paramString2.ssid, paramString2.mac });
    w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "opCode = %d, url = %s", new Object[] { Integer.valueOf(4), paramString1 });
    GMTrace.o(7249770577920L, 54015);
  }
  
  public a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4)
  {
    GMTrace.i(7249636360192L, 54014);
    aAl();
    this.ssid = paramString3;
    this.mac = paramString2;
    this.fAy = 1;
    LinkedList localLinkedList = new LinkedList();
    Object localObject = new cj();
    ((cj)localObject).ssid = paramString3;
    ((cj)localObject).mac = paramString2;
    ((cj)localObject).tvM = paramInt1;
    localLinkedList.add(localObject);
    localObject = (z)this.gMC.hlU.hmc;
    ((z)localObject).tsp = 1;
    ((z)localObject).tsq = localLinkedList;
    ((z)localObject).URL = paramString1;
    ((z)localObject).tsr = paramInt2;
    ((z)localObject).tss = paramString4;
    ((z)localObject).tsu = m.xO("MicroMsg.FreeWifi.NetSceneAPAuth");
    w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "opcode = %d, mac = %s, ssid = %s, rssi = %d", new Object[] { Integer.valueOf(1), paramString2, paramString3, Integer.valueOf(paramInt1) });
    GMTrace.o(7249636360192L, 54014);
  }
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt, String paramString7)
  {
    GMTrace.i(7249502142464L, 54013);
    aAl();
    this.ssid = paramString2;
    this.mac = paramString3;
    z localz = (z)this.gMC.hlU.hmc;
    String str = URLDecoder.decode(paramString5);
    localz.tsp = 0;
    localz.URL = paramString1;
    localz.SSID = paramString2;
    localz.tsm = paramString4;
    localz.tsn = str;
    localz.tso = paramString6;
    localz.tsr = paramInt;
    localz.tss = paramString7;
    paramString7 = new LinkedList();
    cj localcj = new cj();
    localcj.ssid = paramString2;
    localcj.mac = paramString3;
    paramString7.add(localcj);
    localz.tsq = paramString7;
    w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "url : %s, ssid : %s, mid : %s, mac : %s, apauthdata : %s, decoded apauthdata :%s,  token : %s", new Object[] { paramString1, paramString2, paramString4, paramString3, paramString5, str, paramString6 });
    GMTrace.o(7249502142464L, 54013);
  }
  
  protected final void aAl()
  {
    GMTrace.i(7249233707008L, 54011);
    b.a locala = new b.a();
    locala.hlX = new z();
    locala.hlY = new com.tencent.mm.protocal.c.aa();
    locala.uri = "/cgi-bin/micromsg-bin/apauth";
    locala.hlW = 640;
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    GMTrace.o(7249233707008L, 54011);
  }
  
  public final String aAm()
  {
    GMTrace.i(7250039013376L, 54017);
    Object localObject = (com.tencent.mm.protocal.c.aa)this.gMC.hlV.hmc;
    if (localObject != null)
    {
      localObject = ((com.tencent.mm.protocal.c.aa)localObject).tsv;
      GMTrace.o(7250039013376L, 54017);
      return (String)localObject;
    }
    GMTrace.o(7250039013376L, 54017);
    return null;
  }
  
  public final aul aAn()
  {
    GMTrace.i(7250173231104L, 54018);
    Object localObject = (com.tencent.mm.protocal.c.aa)this.gMC.hlV.hmc;
    if (localObject != null)
    {
      localObject = ((com.tencent.mm.protocal.c.aa)localObject).tsC;
      GMTrace.o(7250173231104L, 54018);
      return (aul)localObject;
    }
    GMTrace.o(7250173231104L, 54018);
    return null;
  }
  
  public final boolean aAo()
  {
    GMTrace.i(7250307448832L, 54019);
    com.tencent.mm.protocal.c.aa localaa = (com.tencent.mm.protocal.c.aa)this.gMC.hlV.hmc;
    if ((localaa != null) && (localaa.tsD != null))
    {
      if (localaa.tsD.tst == 1)
      {
        GMTrace.o(7250307448832L, 54019);
        return true;
      }
      GMTrace.o(7250307448832L, 54019);
      return false;
    }
    GMTrace.o(7250307448832L, 54019);
    return false;
  }
  
  public final tv aAp()
  {
    GMTrace.i(7250441666560L, 54020);
    Object localObject = (com.tencent.mm.protocal.c.aa)this.gMC.hlV.hmc;
    if (localObject != null)
    {
      localObject = ((com.tencent.mm.protocal.c.aa)localObject).tsD;
      GMTrace.o(7250441666560L, 54020);
      return (tv)localObject;
    }
    GMTrace.o(7250441666560L, 54020);
    return null;
  }
  
  public final String aAq()
  {
    GMTrace.i(7250575884288L, 54021);
    Object localObject = (com.tencent.mm.protocal.c.aa)this.gMC.hlV.hmc;
    if (localObject != null)
    {
      localObject = ((com.tencent.mm.protocal.c.aa)localObject).tsF;
      GMTrace.o(7250575884288L, 54021);
      return (String)localObject;
    }
    GMTrace.o(7250575884288L, 54021);
    return null;
  }
  
  public final String aAr()
  {
    GMTrace.i(7250710102016L, 54022);
    Object localObject = (com.tencent.mm.protocal.c.aa)this.gMC.hlV.hmc;
    if (localObject != null)
    {
      localObject = ((com.tencent.mm.protocal.c.aa)localObject).tsG;
      GMTrace.o(7250710102016L, 54022);
      return (String)localObject;
    }
    GMTrace.o(7250710102016L, 54022);
    return null;
  }
  
  public final dy aAs()
  {
    GMTrace.i(7250844319744L, 54023);
    Object localObject = (com.tencent.mm.protocal.c.aa)this.gMC.hlV.hmc;
    if (localObject != null)
    {
      localObject = ((com.tencent.mm.protocal.c.aa)localObject).tsE;
      GMTrace.o(7250844319744L, 54023);
      return (dy)localObject;
    }
    GMTrace.o(7250844319744L, 54023);
    return null;
  }
  
  protected final void b(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    GMTrace.i(7249904795648L, 54016);
    w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, opCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Integer.valueOf(this.fAy) });
    Object localObject;
    boolean bool;
    switch (this.fAy)
    {
    default: 
    case 0: 
      do
      {
        GMTrace.o(7249904795648L, 54016);
        return;
      } while ((paramInt2 != 0) || (paramInt3 != 0));
      paramString = j.aAe().yb(this.ssid);
      localObject = this.ssid;
      if (paramString == null)
      {
        bool = true;
        w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "get freewifi by ssid :%s, is wifi info = null ? %b", new Object[] { localObject, Boolean.valueOf(bool) });
        if (paramString != null) {
          break label1091;
        }
        paramString = new com.tencent.mm.plugin.freewifi.g.c();
        paramString.field_ssidmd5 = com.tencent.mm.sdk.platformtools.aa.QW(this.ssid);
      }
      break;
    }
    label530:
    label986:
    label1091:
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      paramString.field_wifiType = 1;
      localObject = (com.tencent.mm.protocal.c.aa)this.gMC.hlV.hmc;
      bcd localbcd = ((com.tencent.mm.protocal.c.aa)localObject).tsz;
      if (localbcd != null)
      {
        w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "en : %s, cn : %s, tw : %s", new Object[] { localbcd.uuj, localbcd.uuk, localbcd.uul });
        paramString.field_showWordCn = localbcd.uuk;
        paramString.field_showWordEn = localbcd.uuj;
      }
      for (paramString.field_showWordTw = localbcd.uul;; paramString.field_showWordTw = ab.getContext().getResources().getString(R.l.ebp))
      {
        paramString.field_action = ((com.tencent.mm.protocal.c.aa)localObject).tsx;
        paramString.field_verifyResult = 1;
        paramString.field_connectState = -1;
        if (((com.tencent.mm.protocal.c.aa)localObject).tsH <= 0) {
          ((com.tencent.mm.protocal.c.aa)localObject).tsH = meq;
        }
        paramString.field_expiredTime = (bg.Po() + ((com.tencent.mm.protocal.c.aa)localObject).tsH);
        paramString.field_showUrl = ((com.tencent.mm.protocal.c.aa)localObject).tsy;
        paramString.field_action = ((com.tencent.mm.protocal.c.aa)localObject).tsx;
        paramString.field_ssid = this.ssid;
        paramString.field_mac = this.mac;
        paramString.field_wifiType = 1;
        if (paramInt1 == 0) {
          break label530;
        }
        bool = j.aAe().b(paramString);
        w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "insert freewifi ret = %b", new Object[] { Boolean.valueOf(bool) });
        w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "insert local freewifi info : %s, %b, expiredTime : %d, action :%d, showurl : %s", new Object[] { this.ssid, Boolean.valueOf(bool), Integer.valueOf(((com.tencent.mm.protocal.c.aa)localObject).tsw), Integer.valueOf(((com.tencent.mm.protocal.c.aa)localObject).tsx), ((com.tencent.mm.protocal.c.aa)localObject).tsy });
        GMTrace.o(7249904795648L, 54016);
        return;
        bool = false;
        break;
        paramString.field_showWordCn = ab.getContext().getResources().getString(R.l.ebp);
        paramString.field_showWordEn = ab.getContext().getResources().getString(R.l.ebp);
      }
      bool = j.aAe().c(paramString, new String[0]);
      w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "update local freewifi info : %s, %b, expiredTime : %d, action :%d, showurl : %s", new Object[] { this.ssid, Boolean.valueOf(bool), Integer.valueOf(((com.tencent.mm.protocal.c.aa)localObject).tsw), Integer.valueOf(((com.tencent.mm.protocal.c.aa)localObject).tsx), ((com.tencent.mm.protocal.c.aa)localObject).tsy });
      GMTrace.o(7249904795648L, 54016);
      return;
      paramString = j.aAe().yb(this.ssid);
      if (paramString == null)
      {
        paramString = new com.tencent.mm.plugin.freewifi.g.c();
        paramString.field_ssidmd5 = com.tencent.mm.sdk.platformtools.aa.QW(this.ssid);
      }
      for (paramInt1 = 1;; paramInt1 = 0)
      {
        if ((paramInt2 == 0) && (paramInt3 == 0))
        {
          localObject = (com.tencent.mm.protocal.c.aa)this.gMC.hlV.hmc;
          paramString.field_ssid = this.ssid;
          paramString.field_showUrl = ((com.tencent.mm.protocal.c.aa)localObject).tsy;
          localbcd = ((com.tencent.mm.protocal.c.aa)localObject).tsz;
          w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "get resp info : %s, expiredTime : %d, action :%d, showurl : %s", new Object[] { this.ssid, Integer.valueOf(((com.tencent.mm.protocal.c.aa)localObject).tsw), Integer.valueOf(((com.tencent.mm.protocal.c.aa)localObject).tsx), ((com.tencent.mm.protocal.c.aa)localObject).tsy });
          if (localbcd != null)
          {
            w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "en : %s, cn : %s, tw : %s", new Object[] { localbcd.uuj, localbcd.uuk, localbcd.uul });
            paramString.field_showWordCn = localbcd.uuk;
            paramString.field_showWordEn = localbcd.uuj;
            paramString.field_showWordTw = localbcd.uul;
            paramString.field_action = ((com.tencent.mm.protocal.c.aa)localObject).tsx;
            paramString.field_verifyResult = 1;
            paramString.field_connectState = -1;
            if (((com.tencent.mm.protocal.c.aa)localObject).tsH <= 0) {
              ((com.tencent.mm.protocal.c.aa)localObject).tsH = meq;
            }
            paramString.field_expiredTime = (bg.Po() + ((com.tencent.mm.protocal.c.aa)localObject).tsH);
            paramString.field_mac = this.mac;
            if (paramInt1 == 0) {
              break label986;
            }
            w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "insert freewifi ret = %b", new Object[] { Boolean.valueOf(j.aAe().b(paramString)) });
          }
          for (;;)
          {
            j.aAe().yc(this.ssid);
            GMTrace.o(7249904795648L, 54016);
            return;
            paramString.field_showWordCn = ab.getContext().getResources().getString(R.l.ebp);
            paramString.field_showWordEn = ab.getContext().getResources().getString(R.l.ebp);
            paramString.field_showWordTw = ab.getContext().getResources().getString(R.l.ebp);
            break;
            w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "insert freewifi ret = %b", new Object[] { Boolean.valueOf(j.aAe().c(paramString, new String[0])) });
          }
        }
        w.e("MicroMsg.FreeWifi.NetSceneAPAuth", "check this ap failed, ssid is :%s", new Object[] { this.ssid });
        if (paramInt1 != 0) {
          break;
        }
        bool = j.aAe().a(paramString, new String[0]);
        w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "freewifi verify failed, delte local db infos : %s, ret = %b", new Object[] { this.ssid, Boolean.valueOf(bool) });
        break;
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(7249367924736L, 54012);
    GMTrace.o(7249367924736L, 54012);
    return 640;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */