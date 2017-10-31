package com.tencent.mm.plugin.ipcall.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.bt.g.d;
import com.tencent.mm.g.a.ay;
import com.tencent.mm.g.a.ba;
import com.tencent.mm.g.a.hx;
import com.tencent.mm.g.a.hy;
import com.tencent.mm.g.a.qa;
import com.tencent.mm.g.a.rc;
import com.tencent.mm.plugin.ipcall.a.a.a.a;
import com.tencent.mm.plugin.ipcall.a.a.b.a;
import com.tencent.mm.plugin.ipcall.a.g.j;
import com.tencent.mm.plugin.ipcall.a.g.l;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.am;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.bn;
import com.tencent.mm.x.bp;
import com.tencent.mm.x.bp.a;
import java.util.HashMap;
import java.util.Map;

public final class i
  implements am
{
  private static i mWE;
  private static HashMap<Integer, g.d> mWX;
  private g mWF;
  private com.tencent.mm.plugin.ipcall.a.c.a mWG;
  private com.tencent.mm.plugin.ipcall.a.c.b mWH;
  private com.tencent.mm.plugin.ipcall.a.b.b mWI;
  private f mWJ;
  private com.tencent.mm.plugin.ipcall.c mWK;
  private com.tencent.mm.plugin.ipcall.a.g.d mWL;
  private l mWM;
  private j mWN;
  private com.tencent.mm.plugin.ipcall.a.g.h mWO;
  private com.tencent.mm.plugin.voip.video.h mWP;
  private com.tencent.mm.plugin.voip.video.d mWQ;
  public Context mWR;
  public long mWS;
  private com.tencent.mm.sdk.b.c mWT;
  private com.tencent.mm.sdk.b.c mWU;
  private com.tencent.mm.sdk.b.c mWV;
  private com.tencent.mm.sdk.b.c mWW;
  private bp.a mWY;
  private bp.a mWZ;
  private bp.a mXa;
  
  static
  {
    GMTrace.i(11613994221568L, 86531);
    mWE = null;
    HashMap localHashMap = new HashMap();
    mWX = localHashMap;
    localHashMap.put(Integer.valueOf("IPCallAddressItem".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(15065805750272L, 112249);
        String[] arrayOfString = com.tencent.mm.plugin.ipcall.a.g.d.gMz;
        GMTrace.o(15065805750272L, 112249);
        return arrayOfString;
      }
    });
    mWX.put(Integer.valueOf("IPCallRecord".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(15065537314816L, 112247);
        String[] arrayOfString = l.gMz;
        GMTrace.o(15065537314816L, 112247);
        return arrayOfString;
      }
    });
    mWX.put(Integer.valueOf("IPCallPopularCountry".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(11566078492672L, 86174);
        String[] arrayOfString = j.gMz;
        GMTrace.o(11566078492672L, 86174);
        return arrayOfString;
      }
    });
    mWX.put(Integer.valueOf("IPCallMsg".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(11600035577856L, 86427);
        String[] arrayOfString = com.tencent.mm.plugin.ipcall.a.g.h.gMz;
        GMTrace.o(11600035577856L, 86427);
        return arrayOfString;
      }
    });
    GMTrace.o(11613994221568L, 86531);
  }
  
  public i()
  {
    GMTrace.i(11610907213824L, 86508);
    this.mWF = new g();
    this.mWG = new com.tencent.mm.plugin.ipcall.a.c.a();
    this.mWH = new com.tencent.mm.plugin.ipcall.a.c.b();
    this.mWI = new com.tencent.mm.plugin.ipcall.a.b.b();
    this.mWJ = new f();
    this.mWK = new com.tencent.mm.plugin.ipcall.c();
    this.mWT = new com.tencent.mm.sdk.b.c() {};
    this.mWU = new com.tencent.mm.sdk.b.c() {};
    this.mWV = new com.tencent.mm.sdk.b.c() {};
    this.mWW = new com.tencent.mm.sdk.b.c() {};
    this.mWY = new bp.a()
    {
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(15067953233920L, 112265);
        w.i("MicroMsg.SubCoreIPCall", "WeChatOut onRecieveMsg");
        paramAnonymousa = com.tencent.mm.platformtools.n.a(paramAnonymousa.hme.tvq);
        if ((paramAnonymousa == null) || (paramAnonymousa.length() == 0))
        {
          w.e("MicroMsg.SubCoreIPCall", "WeChatOut onReceiveMsg, msgContent is null");
          GMTrace.o(15067953233920L, 112265);
          return;
        }
        Object localObject = bh.p(paramAnonymousa, "sysmsg");
        if (localObject == null)
        {
          w.e("MicroMsg.SubCoreIPCall", "WeChatOut onReceiveMsg, values is null");
          GMTrace.o(15067953233920L, 112265);
          return;
        }
        int i;
        if (((Map)localObject).containsKey(".sysmsg.WeChatOut.AccountRedDotType"))
        {
          i = bg.getInt((String)((Map)localObject).get(".sysmsg.WeChatOut.AccountRedDotType"), -1);
          w.i("MicroMsg.SubCoreIPCall", "WeChatOut AccountRedDotType: %d", new Object[] { Integer.valueOf(i) });
          ap.AS();
          com.tencent.mm.x.c.xi().a(w.a.uWn, Integer.valueOf(i));
        }
        for (;;)
        {
          int j;
          if (((Map)localObject).containsKey(".sysmsg.WeChatOut.AcctRD"))
          {
            j = bg.getInt((String)((Map)localObject).get(".sysmsg.WeChatOut.AcctRD"), 0);
            w.i("MicroMsg.SubCoreIPCall", "WeChatOut AcctRD: %d", new Object[] { Integer.valueOf(j) });
            if (j != 0)
            {
              ap.AS();
              com.tencent.mm.x.c.xi().a(w.a.uWm, Boolean.valueOf(true));
              com.tencent.mm.plugin.report.service.g.paX.i(13254, new Object[] { Integer.valueOf(2), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(i), Integer.valueOf(-1), Integer.valueOf(-1) });
            }
          }
          else
          {
            if (((Map)localObject).containsKey(".sysmsg.WeChatOut.TabRD"))
            {
              i = bg.getInt((String)((Map)localObject).get(".sysmsg.WeChatOut.TabRD"), 0);
              w.i("MicroMsg.SubCoreIPCall", "WeChatOut TabRD: %d", new Object[] { Integer.valueOf(i) });
              if (i == 0) {
                break label1298;
              }
              ap.AS();
              com.tencent.mm.x.c.xi().a(w.a.uWz, Boolean.valueOf(true));
              com.tencent.mm.plugin.report.service.g.paX.i(13254, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(-1) });
            }
            label394:
            if (((Map)localObject).containsKey(".sysmsg.WeChatOut.RechargeRD"))
            {
              i = bg.getInt((String)((Map)localObject).get(".sysmsg.WeChatOut.RechargeRD"), 0);
              w.i("MicroMsg.SubCoreIPCall", "WeChatOut RechargeRD: %d", new Object[] { Integer.valueOf(i) });
              if (i == 0) {
                break label1318;
              }
              ap.AS();
              com.tencent.mm.x.c.xi().a(w.a.uWt, Boolean.valueOf(true));
              com.tencent.mm.plugin.report.service.g.paX.i(13254, new Object[] { Integer.valueOf(3), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(-1) });
            }
            label518:
            String str;
            if (((Map)localObject).containsKey(".sysmsg.WeChatOut.RechargeWording"))
            {
              str = (String)((Map)localObject).get(".sysmsg.WeChatOut.RechargeWording");
              w.i("MicroMsg.SubCoreIPCall", "WeChatOut RechargeWording: %s", new Object[] { str });
              ap.AS();
              com.tencent.mm.x.c.xi().a(w.a.uWs, str);
            }
            if (((Map)localObject).containsKey(".sysmsg.WeChatOut.PackagePurchaseWording"))
            {
              str = (String)((Map)localObject).get(".sysmsg.WeChatOut.PackagePurchaseWording");
              w.i("MicroMsg.SubCoreIPCall", "WeChatOut PackagePurchaseWording: %s", new Object[] { str });
              ap.AS();
              com.tencent.mm.x.c.xi().a(w.a.uWu, str);
            }
            if (((Map)localObject).containsKey(".sysmsg.WeChatOut.AccountWording"))
            {
              str = (String)((Map)localObject).get(".sysmsg.WeChatOut.AccountWording");
              w.i("MicroMsg.SubCoreIPCall", "WeChatOut AccountWording: %s", new Object[] { str });
              ap.AS();
              com.tencent.mm.x.c.xi().a(w.a.uWo, str);
            }
            if (((Map)localObject).containsKey(".sysmsg.WeChatOut.RechargeWordingVersion"))
            {
              i = bg.getInt((String)((Map)localObject).get(".sysmsg.WeChatOut.RechargeWordingVersion"), 0);
              w.i("MicroMsg.SubCoreIPCall", "WeChatOut RechargeWordingVersion: %d", new Object[] { Integer.valueOf(i) });
              ap.AS();
              com.tencent.mm.x.c.xi().a(w.a.uWD, Integer.valueOf(i));
            }
            if (((Map)localObject).containsKey(".sysmsg.WeChatOut.TabWording"))
            {
              str = (String)((Map)localObject).get(".sysmsg.WeChatOut.TabWording");
              w.i("MicroMsg.SubCoreIPCall", "WeChatOut TabWording: %s", new Object[] { str });
              ap.AS();
              com.tencent.mm.x.c.xi().a(w.a.uWy, str);
            }
            if (((Map)localObject).containsKey(".sysmsg.WeChatOut.AccountActivityWording"))
            {
              str = (String)((Map)localObject).get(".sysmsg.WeChatOut.AccountActivityWording");
              w.i("MicroMsg.SubCoreIPCall", "WeChatOut AccountActivityWording: %s", new Object[] { str });
              ap.AS();
              com.tencent.mm.x.c.xi().a(w.a.uWp, str);
            }
            if (((Map)localObject).containsKey(".sysmsg.WeChatOut.AccountActivityWordingClearType"))
            {
              i = bg.getInt((String)((Map)localObject).get(".sysmsg.WeChatOut.AccountActivityWordingClearType"), 0);
              w.i("MicroMsg.SubCoreIPCall", "WeChatOut AccountActivityWordingClearType : %d", new Object[] { Integer.valueOf(i) });
              ap.AS();
              com.tencent.mm.x.c.xi().a(w.a.uWq, Integer.valueOf(i));
            }
            if (((Map)localObject).containsKey(".sysmsg.WeChatOut.AccountActivityWordingVersion"))
            {
              i = bg.getInt((String)((Map)localObject).get(".sysmsg.WeChatOut.AccountActivityWordingVersion"), 0);
              w.i("MicroMsg.SubCoreIPCall", "WeChatOut AccountActivityWordingVersion: %d", new Object[] { Integer.valueOf(i) });
              ap.AS();
              com.tencent.mm.x.c.xi().a(w.a.uWr, Integer.valueOf(i));
            }
            if (((Map)localObject).containsKey(".sysmsg.WeChatOut.TabRedDotType"))
            {
              i = bg.getInt((String)((Map)localObject).get(".sysmsg.WeChatOut.TabRedDotType"), 0);
              w.i("MicroMsg.SubCoreIPCall", "WeChatOut TabRedDotType: %d", new Object[] { Integer.valueOf(i) });
              com.tencent.mm.plugin.report.service.g.paX.i(13254, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(i) });
              ap.AS();
              com.tencent.mm.x.c.xi().a(w.a.uWA, Integer.valueOf(i));
            }
            i = paramAnonymousa.indexOf("<ActivityInfo>");
            j = paramAnonymousa.indexOf("</ActivityInfo>");
            if ((i > 0) && (j > 0) && (j > i))
            {
              paramAnonymousa = paramAnonymousa.substring(i, j + 15);
              w.i("MicroMsg.SubCoreIPCall", "WeChatOut ActivityInfo: %s", new Object[] { paramAnonymousa });
              localObject = com.tencent.mm.plugin.ipcall.a.g.a.zD(paramAnonymousa);
              if ((localObject == null) || (!bg.mZ(((com.tencent.mm.plugin.ipcall.a.g.a)localObject).fuw)) || (!bg.mZ(((com.tencent.mm.plugin.ipcall.a.g.a)localObject).mCK))) {
                break label1338;
              }
              w.i("MicroMsg.SubCoreIPCall", "clear activity");
              ap.AS();
              com.tencent.mm.x.c.xi().a(w.a.uWM, Boolean.valueOf(false));
              ap.AS();
              com.tencent.mm.x.c.xi().a(w.a.uWN, "");
            }
          }
          for (;;)
          {
            com.tencent.mm.sdk.b.a.uLm.m(new hy());
            com.tencent.mm.sdk.b.a.uLm.m(new rc());
            GMTrace.o(15067953233920L, 112265);
            return;
            ap.AS();
            com.tencent.mm.x.c.xi().a(w.a.uWm, Boolean.valueOf(false));
            break;
            label1298:
            ap.AS();
            com.tencent.mm.x.c.xi().a(w.a.uWz, Boolean.valueOf(false));
            break label394;
            label1318:
            ap.AS();
            com.tencent.mm.x.c.xi().a(w.a.uWt, Boolean.valueOf(false));
            break label518;
            label1338:
            if (localObject != null)
            {
              if (!bg.mZ(((com.tencent.mm.plugin.ipcall.a.g.a)localObject).nan)) {
                com.tencent.mm.an.n.IV().a(((com.tencent.mm.plugin.ipcall.a.g.a)localObject).nan, null);
              }
              ap.AS();
              com.tencent.mm.x.c.xi().a(w.a.uWM, Boolean.valueOf(true));
              ap.AS();
              com.tencent.mm.x.c.xi().a(w.a.uWN, paramAnonymousa);
            }
          }
          i = -1;
        }
      }
    };
    this.mWZ = new bp.a()
    {
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(15065268879360L, 112245);
        w.i("MicroMsg.SubCoreIPCall", "WeChatOutMsg onRecieveMsg");
        Object localObject = paramAnonymousa.hme;
        paramAnonymousa = com.tencent.mm.platformtools.n.a(paramAnonymousa.hme.tvq);
        if ((paramAnonymousa == null) || (paramAnonymousa.length() == 0))
        {
          w.e("MicroMsg.SubCoreIPCall", "WeChatOutMsg onReceiveMsg, msgContent is null");
          GMTrace.o(15065268879360L, 112245);
          return;
        }
        paramAnonymousa = bh.p(paramAnonymousa, "sysmsg");
        if (paramAnonymousa == null)
        {
          w.e("MicroMsg.SubCoreIPCall", "WeChatOutMsg onReceiveMsg, values is null");
          GMTrace.o(15065268879360L, 112245);
          return;
        }
        com.tencent.mm.plugin.ipcall.a.g.h localh = i.aHu();
        long l = ((bu)localObject).tvn;
        int i;
        if (paramAnonymousa != null)
        {
          localObject = new com.tencent.mm.plugin.ipcall.a.g.g();
          ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_svrId = l;
          ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_title = ((String)paramAnonymousa.get(".sysmsg.WeChatOutMsg.Title"));
          if (((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_title == null) {
            ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_title = "";
          }
          ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_content = ((String)paramAnonymousa.get(".sysmsg.WeChatOutMsg.Content"));
          if (((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_content == null) {
            ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_content = "";
          }
          i = bg.getInt((String)paramAnonymousa.get(".sysmsg.WeChatOutMsg.MsgType"), 0);
          ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_msgType = i;
          ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_pushTime = bg.getLong((String)paramAnonymousa.get(".sysmsg.WeChatOutMsg.PushTime"), 0L);
          ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_descUrl = ((String)paramAnonymousa.get(".sysmsg.WeChatOutMsg.DescUrl"));
          if (((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_descUrl == null) {
            ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_descUrl = "";
          }
          w.i("MicroMsg.IPCallMsgStorage", "insertNewXml svrId:%s,title:%s,content:%s,msgType:%s,pushTime:%s,descUrl=%s", new Object[] { ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_svrId, ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_title, ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_content, ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_msgType, ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_pushTime, ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_descUrl });
          localh.b((com.tencent.mm.sdk.e.c)localObject);
        }
        for (;;)
        {
          if (i != -1)
          {
            ap.AS();
            com.tencent.mm.x.c.xi().a(w.a.uWC, Integer.valueOf(i));
          }
          ap.AS();
          com.tencent.mm.x.c.xi().a(w.a.uWB, Boolean.valueOf(true));
          com.tencent.mm.plugin.report.service.g.paX.i(13254, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(-1), Integer.valueOf(i), Integer.valueOf(-1) });
          GMTrace.o(15065268879360L, 112245);
          return;
          i = -1;
        }
      }
    };
    this.mXa = new bp.a()
    {
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(15066074185728L, 112251);
        w.i("MicroMsg.SubCoreIPCall", "WCONotify onRecieveMsg");
        paramAnonymousa = com.tencent.mm.platformtools.n.a(paramAnonymousa.hme.tvq);
        if ((paramAnonymousa == null) || (paramAnonymousa.length() == 0))
        {
          w.e("MicroMsg.SubCoreIPCall", "WCONotify onReceiveMsg, msgContent is null");
          GMTrace.o(15066074185728L, 112251);
          return;
        }
        paramAnonymousa = bh.p(paramAnonymousa, "sysmsg");
        if (paramAnonymousa == null)
        {
          w.e("MicroMsg.SubCoreIPCall", "WCONotify onReceiveMsg, values is null");
          GMTrace.o(15066074185728L, 112251);
          return;
        }
        if (paramAnonymousa.containsKey(".sysmsg.WCONotify.NotifyGetBalance"))
        {
          int i = bg.getInt((String)paramAnonymousa.get(".sysmsg.WCONotify.NotifyGetBalance"), 0);
          w.i("MicroMsg.SubCoreIPCall", "WCONotify NotifyGetBalance: %d", new Object[] { Integer.valueOf(i) });
          if (i > 0)
          {
            paramAnonymousa = new com.tencent.mm.plugin.ipcall.a.d.g(2);
            ap.wT().a(paramAnonymousa, 0);
          }
        }
        GMTrace.o(15066074185728L, 112251);
      }
    };
    GMTrace.o(11610907213824L, 86508);
  }
  
  public static i aHk()
  {
    GMTrace.i(11611041431552L, 86509);
    if (mWE == null)
    {
      mWE = new i();
      ap.AL().a("plugin.ipcall", mWE);
    }
    i locali = mWE;
    GMTrace.o(11611041431552L, 86509);
    return locali;
  }
  
  public static g aHl()
  {
    GMTrace.i(11611175649280L, 86510);
    g localg = aHk().mWF;
    GMTrace.o(11611175649280L, 86510);
    return localg;
  }
  
  public static com.tencent.mm.plugin.ipcall.a.c.a aHm()
  {
    GMTrace.i(11611309867008L, 86511);
    com.tencent.mm.plugin.ipcall.a.c.a locala = aHk().mWG;
    GMTrace.o(11611309867008L, 86511);
    return locala;
  }
  
  public static com.tencent.mm.plugin.ipcall.a.c.b aHn()
  {
    GMTrace.i(11611444084736L, 86512);
    com.tencent.mm.plugin.ipcall.a.c.b localb = aHk().mWH;
    GMTrace.o(11611444084736L, 86512);
    return localb;
  }
  
  public static com.tencent.mm.plugin.ipcall.a.b.b aHo()
  {
    GMTrace.i(11611578302464L, 86513);
    com.tencent.mm.plugin.ipcall.a.b.b localb = aHk().mWI;
    GMTrace.o(11611578302464L, 86513);
    return localb;
  }
  
  public static f aHp()
  {
    GMTrace.i(11611712520192L, 86514);
    f localf = aHk().mWJ;
    GMTrace.o(11611712520192L, 86514);
    return localf;
  }
  
  public static com.tencent.mm.plugin.ipcall.c aHq()
  {
    GMTrace.i(11611846737920L, 86515);
    com.tencent.mm.plugin.ipcall.c localc = aHk().mWK;
    GMTrace.o(11611846737920L, 86515);
    return localc;
  }
  
  public static com.tencent.mm.plugin.ipcall.a.g.d aHr()
  {
    GMTrace.i(11611980955648L, 86516);
    com.tencent.mm.kernel.h.xx().wH();
    if (aHk().mWL == null)
    {
      localObject = aHk();
      ap.AS();
      ((i)localObject).mWL = new com.tencent.mm.plugin.ipcall.a.g.d(com.tencent.mm.x.c.yI());
    }
    Object localObject = aHk().mWL;
    GMTrace.o(11611980955648L, 86516);
    return (com.tencent.mm.plugin.ipcall.a.g.d)localObject;
  }
  
  public static l aHs()
  {
    GMTrace.i(11612115173376L, 86517);
    com.tencent.mm.kernel.h.xx().wH();
    if (aHk().mWM == null)
    {
      localObject = aHk();
      ap.AS();
      ((i)localObject).mWM = new l(com.tencent.mm.x.c.yI());
    }
    Object localObject = aHk().mWM;
    GMTrace.o(11612115173376L, 86517);
    return (l)localObject;
  }
  
  public static j aHt()
  {
    GMTrace.i(11612249391104L, 86518);
    com.tencent.mm.kernel.h.xx().wH();
    if (aHk().mWN == null)
    {
      localObject = aHk();
      ap.AS();
      ((i)localObject).mWN = new j(com.tencent.mm.x.c.yI());
    }
    Object localObject = aHk().mWN;
    GMTrace.o(11612249391104L, 86518);
    return (j)localObject;
  }
  
  public static com.tencent.mm.plugin.ipcall.a.g.h aHu()
  {
    GMTrace.i(11612383608832L, 86519);
    com.tencent.mm.kernel.h.xx().wH();
    if (aHk().mWO == null)
    {
      localObject = aHk();
      ap.AS();
      ((i)localObject).mWO = new com.tencent.mm.plugin.ipcall.a.g.h(com.tencent.mm.x.c.yI());
    }
    Object localObject = aHk().mWO;
    GMTrace.o(11612383608832L, 86519);
    return (com.tencent.mm.plugin.ipcall.a.g.h)localObject;
  }
  
  public static com.tencent.mm.plugin.voip.video.h aHv()
  {
    GMTrace.i(11612517826560L, 86520);
    if (aHk().mWP == null) {
      aHk().mWP = new com.tencent.mm.plugin.voip.video.h(ab.getContext());
    }
    com.tencent.mm.plugin.voip.video.h localh = aHk().mWP;
    GMTrace.o(11612517826560L, 86520);
    return localh;
  }
  
  public static com.tencent.mm.plugin.voip.video.d aHw()
  {
    GMTrace.i(11612652044288L, 86521);
    if (aHk().mWQ == null) {
      aHk().mWQ = new com.tencent.mm.plugin.voip.video.d(ab.getContext());
    }
    com.tencent.mm.plugin.voip.video.d locald = aHk().mWQ;
    GMTrace.o(11612652044288L, 86521);
    return locald;
  }
  
  public final void aW(boolean paramBoolean)
  {
    GMTrace.i(11613054697472L, 86524);
    Object localObject = this.mWF;
    ((g)localObject).mWq.init();
    ((g)localObject).mWr.init();
    ((g)localObject).mWs.init();
    ((g)localObject).mWt.init();
    ((g)localObject).mWu.init();
    ((g)localObject).mWv.init();
    ((g)localObject).mWw.init();
    ((g)localObject).mWx.init();
    ((g)localObject).mWq.mXc = ((a.a)localObject);
    ((g)localObject).mWs.mXc = ((a.a)localObject);
    ((g)localObject).mWt.mXc = ((a.a)localObject);
    ((g)localObject).mWv.mXc = ((a.a)localObject);
    ((g)localObject).mWx.mXc = ((a.a)localObject);
    ((g)localObject).mWr.mXe = ((b.a)localObject);
    ((g)localObject).mWu.mXe = ((b.a)localObject);
    ap.a(((g)localObject).mWB);
    b.init();
    localObject = d.aHb();
    com.tencent.mm.sdk.b.a.uLm.b(((d)localObject).mWd);
    localObject = e.aHe();
    com.tencent.mm.sdk.b.a.uLm.b(((e)localObject).ili);
    ap.getSysCmdMsgExtension().a("WeChatOut", this.mWY, true);
    ap.getSysCmdMsgExtension().a("WeChatOutMsg", this.mWZ, true);
    ap.getSysCmdMsgExtension().a("WCONotify", this.mXa, true);
    com.tencent.mm.sdk.b.a.uLm.b(this.mWT);
    com.tencent.mm.sdk.b.a.uLm.b(this.mWU);
    com.tencent.mm.sdk.b.a.uLm.b(this.mWV);
    com.tencent.mm.sdk.b.a.uLm.b(this.mWW);
    GMTrace.o(11613054697472L, 86524);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(11613188915200L, 86525);
    GMTrace.o(11613188915200L, 86525);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(11612920479744L, 86523);
    GMTrace.o(11612920479744L, 86523);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(11613323132928L, 86526);
    if (this.mWJ.aHf()) {
      this.mWK.cl(0, 0);
    }
    Object localObject = this.mWF;
    ((g)localObject).mWq.destroy();
    ((g)localObject).mWr.destroy();
    ((g)localObject).mWs.destroy();
    ((g)localObject).mWt.destroy();
    ((g)localObject).mWu.destroy();
    ((g)localObject).mWw.destroy();
    ap.b(((g)localObject).mWB);
    b.release();
    localObject = d.aHb();
    ap.wT().b(159, (com.tencent.mm.ac.e)localObject);
    ap.wT().b(160, (com.tencent.mm.ac.e)localObject);
    com.tencent.mm.sdk.b.a.uLm.c(((d)localObject).mWd);
    localObject = e.aHe();
    com.tencent.mm.sdk.b.a.uLm.c(((e)localObject).ili);
    ap.getSysCmdMsgExtension().b("WeChatOut", this.mWY, true);
    ap.getSysCmdMsgExtension().b("WeChatOutMsg", this.mWZ, true);
    ap.getSysCmdMsgExtension().b("WCONotify", this.mXa, true);
    com.tencent.mm.sdk.b.a.uLm.c(this.mWT);
    com.tencent.mm.sdk.b.a.uLm.c(this.mWU);
    com.tencent.mm.sdk.b.a.uLm.c(this.mWV);
    com.tencent.mm.sdk.b.a.uLm.c(this.mWW);
    GMTrace.o(11613323132928L, 86526);
  }
  
  public final HashMap<Integer, g.d> vM()
  {
    GMTrace.i(11612786262016L, 86522);
    HashMap localHashMap = mWX;
    GMTrace.o(11612786262016L, 86522);
    return localHashMap;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */