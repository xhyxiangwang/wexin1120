package com.tencent.mm.plugin.offline;

import android.os.Looper;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.bt.g.d;
import com.tencent.mm.g.a.sf;
import com.tencent.mm.kernel.h;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.offline.a.r;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.protocal.i.f;
import com.tencent.mm.protocal.i.g;
import com.tencent.mm.protocal.y.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.x.am;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.bn;
import com.tencent.mm.x.bp;
import com.tencent.mm.x.bp.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class k
  implements am
{
  private static HashMap<Integer, g.d> gBa;
  private static Map<String, String> iGG;
  public static boolean onk;
  public static int onl;
  private com.tencent.mm.vending.b.b iAf;
  private bp.a kJS;
  public ae mHandler;
  private r one;
  private e onf;
  private i ong;
  private com.tencent.mm.plugin.offline.b.a onh;
  private com.tencent.mm.plugin.offline.ui.d oni;
  public f onj;
  private com.tencent.mm.sdk.b.c<sf> onm;
  private m onn;
  
  static
  {
    GMTrace.i(6239513739264L, 46488);
    onk = false;
    onl = 10;
    iGG = new HashMap();
    gBa = new HashMap();
    com.tencent.mm.wallet_core.a.h("OfflineBindCardRegProcess", d.class);
    com.tencent.mm.wallet_core.a.h("OfflineBindCardProcess", c.class);
    gBa.put(Integer.valueOf("OFFLINE_ORDER_STATUS".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(15376117137408L, 114561);
        String[] arrayOfString = com.tencent.mm.plugin.offline.b.a.gMz;
        GMTrace.o(15376117137408L, 114561);
        return arrayOfString;
      }
    });
    GMTrace.o(6239513739264L, 46488);
  }
  
  public k()
  {
    GMTrace.i(6237768908800L, 46475);
    this.one = null;
    this.onf = null;
    this.ong = null;
    this.onh = null;
    this.oni = new com.tencent.mm.plugin.offline.ui.d();
    this.onj = new f();
    this.onm = new com.tencent.mm.sdk.b.c() {};
    this.mHandler = new ae(Looper.getMainLooper());
    this.kJS = new bp.a()
    {
      public final void a(final d.a paramAnonymousa)
      {
        GMTrace.i(17960747925504L, 133818);
        final String str = n.a(paramAnonymousa.hme.tvq);
        w.i("MicroMsg.SubCoreOffline", "OfflinePayMsg:" + str);
        k.this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(17960479490048L, 133816);
            r localr = k.aTG();
            String str2 = str;
            long l = paramAnonymousa.hme.tvv;
            w.v("MicroMsg.WalletOfflineMsgManager", "onReceiveMsg msg id is :" + l);
            w.v("MicroMsg.WalletOfflineMsgManager", "onReceiveMsg msg content is :" + str2);
            String str1;
            if (!TextUtils.isEmpty(str2))
            {
              if (localr.cX(l))
              {
                w.e("MicroMsg.WalletOfflineMsgManager", "onReceiveMsg msg id is exist in list:" + l);
                GMTrace.o(17960479490048L, 133816);
                return;
              }
              str1 = null;
              Map localMap = bh.p(str2, "sysmsg");
              if (localMap != null) {
                str1 = (String)localMap.get(".sysmsg.paymsg.ack_key");
              }
              if (!com.tencent.mm.plugin.offline.c.a.aUR()) {
                break label247;
              }
              if (g.da(str1, str2))
              {
                com.tencent.mm.plugin.report.service.g.paX.a(135L, 70L, 1L, true);
                localr.Dp(str2);
                localr.ag(str2, false);
              }
            }
            for (;;)
            {
              if (localr.olr.size() > 10) {
                localr.olr.remove(localr.olr.size() - 1);
              }
              localr.olr.add(0, Long.valueOf(l));
              GMTrace.o(17960479490048L, 133816);
              return;
              label247:
              g.da(str1, str2);
              localr.Dp(str2);
              localr.ag(str2, false);
            }
          }
        });
        GMTrace.o(17960747925504L, 133818);
      }
    };
    GMTrace.o(6237768908800L, 46475);
  }
  
  public static k aTF()
  {
    GMTrace.i(6237903126528L, 46476);
    k localk2 = (k)ap.AL().gJ("plugin.offline");
    k localk1 = localk2;
    if (localk2 == null)
    {
      w.e("MicroMsg.SubCoreOffline", "not found in MMCore, new one");
      localk1 = new k();
      ap.AL().a("plugin.offline", localk1);
    }
    GMTrace.o(6237903126528L, 46476);
    return localk1;
  }
  
  public static r aTG()
  {
    GMTrace.i(6238708432896L, 46482);
    h.xx().wH();
    if (aTF().one == null) {
      aTF().one = new r();
    }
    r localr = aTF().one;
    GMTrace.o(6238708432896L, 46482);
    return localr;
  }
  
  public static e aTH()
  {
    GMTrace.i(6238842650624L, 46483);
    h.xx().wH();
    if (aTF().onf == null) {
      aTF().onf = new e();
    }
    e locale = aTF().onf;
    GMTrace.o(6238842650624L, 46483);
    return locale;
  }
  
  public static i aTI()
  {
    GMTrace.i(6238976868352L, 46484);
    h.xx().wH();
    if (aTF().ong == null) {
      aTF().ong = new i();
    }
    i locali = aTF().ong;
    GMTrace.o(6238976868352L, 46484);
    return locali;
  }
  
  public static com.tencent.mm.plugin.offline.b.a aTJ()
  {
    GMTrace.i(15384572854272L, 114624);
    if (!ap.AV()) {
      throw new com.tencent.mm.x.b();
    }
    if (aTF().onh == null)
    {
      localObject = aTF();
      ap.AS();
      ((k)localObject).onh = new com.tencent.mm.plugin.offline.b.a(com.tencent.mm.x.c.yI());
    }
    Object localObject = aTF().onh;
    GMTrace.o(15384572854272L, 114624);
    return (com.tencent.mm.plugin.offline.b.a)localObject;
  }
  
  public static void ag(int paramInt, String paramString)
  {
    GMTrace.i(6239111086080L, 46485);
    if (paramString != null)
    {
      ap.AS();
      com.tencent.mm.x.c.xi().set(paramInt, paramString);
      ap.AS();
      com.tencent.mm.x.c.xi().kz(true);
    }
    GMTrace.o(6239111086080L, 46485);
  }
  
  public static String rR(int paramInt)
  {
    GMTrace.i(6239245303808L, 46486);
    ap.AS();
    String str = (String)com.tencent.mm.x.c.xi().get(paramInt, null);
    GMTrace.o(6239245303808L, 46486);
    return str;
  }
  
  public final void aW(boolean paramBoolean)
  {
    GMTrace.i(6238439997440L, 46480);
    this.iAf = ((com.tencent.mm.plugin.auth.a.b)h.j(com.tencent.mm.plugin.auth.a.b.class)).addHandleAuthResponse(new com.tencent.mm.plugin.auth.a.a()
    {
      public final void a(i.f paramAnonymousf, i.g paramAnonymousg, boolean paramAnonymousBoolean)
      {
        GMTrace.i(17960882143232L, 133819);
        w.i("MicroMsg.SubCoreOffline", "autoAuth: %s", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
        if (!paramAnonymousBoolean) {
          k.aTI().cE(7, 7);
        }
        GMTrace.o(17960882143232L, 133819);
      }
      
      public final void a(y.b paramAnonymousb, String paramAnonymousString1, int paramAnonymousInt1, String paramAnonymousString2, String paramAnonymousString3, int paramAnonymousInt2)
      {
        GMTrace.i(17961016360960L, 133820);
        GMTrace.o(17961016360960L, 133820);
      }
    });
    ap.getSysCmdMsgExtension().a("paymsg", this.kJS, true);
    com.tencent.mm.sdk.b.a.uLm.b(this.oni);
    com.tencent.mm.sdk.b.a.uLm.b(this.onm);
    this.one = null;
    this.onf = null;
    this.ong = null;
    this.onn = new m();
    GMTrace.o(6238439997440L, 46480);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(6238305779712L, 46479);
    GMTrace.o(6238305779712L, 46479);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(6238171561984L, 46478);
    GMTrace.o(6238171561984L, 46478);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(6238574215168L, 46481);
    ap.getSysCmdMsgExtension().b("paymsg", this.kJS, true);
    com.tencent.mm.sdk.b.a.uLm.c(this.oni);
    com.tencent.mm.sdk.b.a.uLm.c(this.onm);
    if (this.onn != null)
    {
      m localm = this.onn;
      aTF();
      aTG().b(localm);
      com.tencent.mm.sdk.b.a.uLm.c(localm.nxx);
    }
    this.onn = null;
    this.iAf.dead();
    GMTrace.o(6238574215168L, 46481);
  }
  
  public final HashMap<Integer, g.d> vM()
  {
    GMTrace.i(6238037344256L, 46477);
    HashMap localHashMap = gBa;
    GMTrace.o(6238037344256L, 46477);
    return localHashMap;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/offline/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */