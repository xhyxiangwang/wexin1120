package com.tencent.mm.plugin.collect.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.ac.k;
import com.tencent.mm.bt.g.d;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.collect.b.d;
import com.tencent.mm.plugin.collect.b.g;
import com.tencent.mm.plugin.collect.b.s;
import com.tencent.mm.protocal.c.bu;
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
import com.tencent.mm.x.m;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class a
  implements am
{
  private bp.a kJS;
  private g kJT;
  
  public a()
  {
    GMTrace.i(5437562814464L, 40513);
    this.kJS = new bp.a()
    {
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(5437160161280L, 40510);
        a.anz();
        if (a.anA() != null)
        {
          Object localObject = com.tencent.mm.platformtools.n.a(paramAnonymousa.hme.tvq);
          a.anz();
          paramAnonymousa = a.anA();
          w.v("MicroMsg.CollectPayerMsgMgr", "func[onResvMsg] content:" + (String)localObject);
          if (bg.mZ((String)localObject))
          {
            w.d("MicroMsg.CollectPayerMsgMgr", "func[onResvMsg] Msg content empty");
            GMTrace.o(5437160161280L, 40510);
            return;
          }
          localObject = bh.p((String)localObject, "sysmsg");
          int i = bg.getInt((String)((Map)localObject).get(".sysmsg.paymsg.PayMsgType"), 0);
          if ((i != 9) && (i != 26))
          {
            w.i("MicroMsg.CollectPayerMsgMgr", "Not ftf collect msg type, ignore; type=" + i);
            GMTrace.o(5437160161280L, 40510);
            return;
          }
          s locals = new s();
          locals.username = bg.mY((String)((Map)localObject).get(".sysmsg.paymsg.username"));
          locals.kKX = (bg.getDouble((String)((Map)localObject).get(".sysmsg.paymsg.fee"), 0.0D) / 100.0D);
          locals.fvV = bg.mY((String)((Map)localObject).get(".sysmsg.paymsg.feetype"));
          locals.kKY = bg.getInt((String)((Map)localObject).get(".sysmsg.paymsgtimestamp"), (int)bg.Po());
          locals.fKK = bg.mY((String)((Map)localObject).get(".sysmsg.paymsg.transid"));
          locals.gEW = bg.mY((String)((Map)localObject).get(".sysmsg.paymsg.displayname"));
          locals.scene = bg.getInt((String)((Map)localObject).get(".sysmsg.paymsg.scene"), 1);
          locals.status = bg.getInt((String)((Map)localObject).get(".sysmsg.paymsg.status"), 0);
          locals.msgType = i;
          locals.kKZ = bg.mY((String)((Map)localObject).get(".sysmsg.paymsg.outtradeno"));
          paramAnonymousa.a(locals);
          GMTrace.o(5437160161280L, 40510);
          return;
        }
        w.w("MicroMsg.SubCoreCollect", "func[onRecieveMsg] payerMsgMgr null");
        GMTrace.o(5437160161280L, 40510);
      }
    };
    this.kJT = new g();
    GMTrace.o(5437562814464L, 40513);
  }
  
  public static d anA()
  {
    GMTrace.i(5438502338560L, 40520);
    h.xx().wH();
    d locald = d.kJZ;
    GMTrace.o(5438502338560L, 40520);
    return locald;
  }
  
  public static boolean anB()
  {
    GMTrace.i(17787607056384L, 132528);
    String str = (String)h.xz().xi().get(w.a.vaD, "");
    long l = m.zK();
    if ((!bg.mZ(str)) && (!str.equals("in.caf")))
    {
      w.i("MicroMsg.SubCoreCollect", "old version switch is open");
      GMTrace.o(17787607056384L, 132528);
      return true;
    }
    if ((l & 0x8000) != 0L)
    {
      GMTrace.o(17787607056384L, 132528);
      return true;
    }
    GMTrace.o(17787607056384L, 132528);
    return false;
  }
  
  public static a anz()
  {
    GMTrace.i(5437697032192L, 40514);
    a locala2 = (a)ap.AL().gJ("plugin.collect");
    a locala1 = locala2;
    if (locala2 == null)
    {
      w.w("MicroMsg.SubCoreCollect", "not found in MMCore, new one");
      locala1 = new a();
      ap.AL().a("plugin.collect", locala1);
    }
    GMTrace.o(5437697032192L, 40514);
    return locala1;
  }
  
  private void uK(String paramString)
  {
    GMTrace.i(17788009709568L, 132531);
    ap.wT().a(304, new com.tencent.mm.ac.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(5437428596736L, 40512);
        ap.wT().b(304, this);
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0)) {
          w.i("MicroMsg.SubCoreCollect", "set sound fail!");
        }
        GMTrace.o(5437428596736L, 40512);
      }
    });
    paramString = new com.tencent.mm.plugin.collect.b.n(bg.ap(paramString, ""));
    ap.wT().a(paramString, 0);
    GMTrace.o(17788009709568L, 132531);
  }
  
  public final void aW(boolean paramBoolean)
  {
    GMTrace.i(5438233903104L, 40518);
    ap.getSysCmdMsgExtension().a("paymsg", this.kJS, true);
    g localg = this.kJT;
    localg.bMz();
    localg.kKf = new ConcurrentLinkedQueue();
    ap.wT().a(1384, localg);
    ap.wT().a(1317, localg);
    GMTrace.o(5438233903104L, 40518);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(5438099685376L, 40517);
    GMTrace.o(5438099685376L, 40517);
  }
  
  public final void anC()
  {
    GMTrace.i(17787741274112L, 132529);
    uK("cash.caf");
    h.xz().xi().a(w.a.vaD, "cash.caf");
    GMTrace.o(17787741274112L, 132529);
  }
  
  public final void anD()
  {
    GMTrace.i(17787875491840L, 132530);
    uK("in.caf");
    h.xz().xi().a(w.a.vaD, "in.caf");
    GMTrace.o(17787875491840L, 132530);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(5437965467648L, 40516);
    GMTrace.o(5437965467648L, 40516);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(5438368120832L, 40519);
    ap.getSysCmdMsgExtension().b("paymsg", this.kJS, true);
    g localg = this.kJT;
    localg.dead();
    ap.wT().b(1384, localg);
    ap.wT().b(1317, localg);
    g.anE();
    GMTrace.o(5438368120832L, 40519);
  }
  
  public final HashMap<Integer, g.d> vM()
  {
    GMTrace.i(5437831249920L, 40515);
    GMTrace.o(5437831249920L, 40515);
    return null;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */