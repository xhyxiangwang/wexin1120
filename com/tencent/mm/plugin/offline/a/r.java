package com.tencent.mm.plugin.offline.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.n;
import com.tencent.mm.g.a.se;
import com.tencent.mm.plugin.offline.g;
import com.tencent.mm.plugin.offline.i;
import com.tencent.mm.plugin.offline.k;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.model.m;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class r
{
  private List<WeakReference<a>> kmu;
  public ArrayList<Long> olr;
  public b ood;
  private HashSet<String> ooe;
  
  public r()
  {
    GMTrace.i(6189987397632L, 46119);
    this.kmu = new ArrayList();
    this.ood = null;
    this.olr = new ArrayList();
    this.ooe = new HashSet();
    Object localObject = com.tencent.mm.plugin.offline.c.a.aUy();
    if (!TextUtils.isEmpty((CharSequence)localObject))
    {
      localObject = bh.p((String)localObject, "sysmsg");
      if (localObject != null)
      {
        int i = bg.getInt((String)((Map)localObject).get(".sysmsg.paymsg.PayMsgType"), -1);
        if ((i >= 0) && (i == 4))
        {
          w.i("MicroMsg.WalletOfflineMsgManager", "msg type is 4 ");
          b(D((Map)localObject));
        }
      }
    }
    this.olr.clear();
    GMTrace.o(6189987397632L, 46119);
  }
  
  private b D(Map<String, String> paramMap)
  {
    GMTrace.i(6190524268544L, 46123);
    if (this.ood == null) {
      this.ood = new b();
    }
    this.ood.ook = bg.getInt((String)paramMap.get(".sysmsg.paymsg.PayMsgType"), -1);
    this.ood.ooh = ((String)paramMap.get(".sysmsg.paymsg.isfreeze"));
    this.ood.ooi = ((String)paramMap.get(".sysmsg.paymsg.freezetype"));
    this.ood.ooj = ((String)paramMap.get(".sysmsg.paymsg.freezemsg"));
    paramMap = this.ood;
    GMTrace.o(6190524268544L, 46123);
    return paramMap;
  }
  
  private void b(c paramc)
  {
    GMTrace.i(6190121615360L, 46120);
    if (this.kmu == null)
    {
      GMTrace.o(6190121615360L, 46120);
      return;
    }
    int i = 0;
    while (i < this.kmu.size())
    {
      Object localObject = (WeakReference)this.kmu.get(i);
      if (localObject != null)
      {
        localObject = (a)((WeakReference)localObject).get();
        if ((localObject != null) && (((a)localObject).a(paramc))) {
          break;
        }
      }
      i += 1;
    }
    GMTrace.o(6190121615360L, 46120);
  }
  
  public final void Dp(String paramString)
  {
    GMTrace.i(15374238089216L, 114547);
    com.tencent.mm.plugin.offline.c.a.DB("");
    com.tencent.mm.plugin.offline.c.a.DD("");
    com.tencent.mm.plugin.offline.c.a.DC("");
    ??? = bh.p(paramString, "sysmsg");
    if (??? == null)
    {
      GMTrace.o(15374238089216L, 114547);
      return;
    }
    int i = bg.getInt((String)((Map)???).get(".sysmsg.paymsg.PayMsgType"), -1);
    String str = (String)((Map)???).get(".sysmsg.paymsg.req_key");
    com.tencent.mm.plugin.offline.c.a.DB((String)((Map)???).get(".sysmsg.paymsg.ack_key"));
    com.tencent.mm.plugin.offline.c.a.rY(i);
    com.tencent.mm.plugin.offline.c.a.DC(str);
    i = bg.getInt((String)((Map)???).get(".sysmsg.paymsg.PayMsgType"), -1);
    w.i("MicroMsg.WalletOfflineMsgManager", "msg type is " + i);
    w.v("MicroMsg.WalletOfflineMsgManager", "msg type is type %d xml %s", new Object[] { Integer.valueOf(i), paramString });
    if ((i >= 0) && (i == 4))
    {
      b(D((Map)???));
      com.tencent.mm.plugin.offline.c.a.Ds(paramString);
      GMTrace.o(15374238089216L, 114547);
      return;
    }
    if ((i >= 0) && (i == 5))
    {
      paramString = new e();
      paramString.ook = bg.getInt((String)((Map)???).get(".sysmsg.paymsg.PayMsgType"), -1);
      paramString.ool = ((String)((Map)???).get(".sysmsg.paymsg.cftretcode"));
      paramString.oom = ((String)((Map)???).get(".sysmsg.paymsg.cftretmsg"));
      paramString.oon = ((String)((Map)???).get(".sysmsg.paymsg.wxretcode"));
      paramString.ooo = ((String)((Map)???).get(".sysmsg.paymsg.wxretmsg"));
      paramString.oop = ((String)((Map)???).get(".sysmsg.paymsg.error_detail_url"));
      b(paramString);
      GMTrace.o(15374238089216L, 114547);
      return;
    }
    if ((i >= 0) && (i == 6))
    {
      paramString = (String)((Map)???).get(".sysmsg.paymsg.transid");
      w.i("helios", "MSG_TYPE_ORDER trasid=" + paramString);
      if (!bg.mZ(paramString))
      {
        ap.AS();
        c.xi().a(w.a.uZx, Boolean.valueOf(true));
      }
      paramString = new f();
      paramString.ook = bg.getInt((String)((Map)???).get(".sysmsg.paymsg.PayMsgType"), -1);
      paramString.ooq = ((String)((Map)???).get(".sysmsg.paymsg.transid"));
      paramString.oor = com.tencent.mm.plugin.offline.c.a.E((Map)???);
      if (paramString.oor.rPj.size() > 0) {
        com.tencent.mm.plugin.offline.c.a.DD(((Orders.Commodity)paramString.oor.rPj.get(0)).fKK);
      }
      if (((Map)???).containsKey(".sysmsg.paymsg.real_name_info")) {
        paramString.fQI = new h((Map)???);
      }
      b(paramString);
      GMTrace.o(15374238089216L, 114547);
      return;
    }
    if ((i >= 0) && (i == 7))
    {
      m.bwE().axG();
      GMTrace.o(15374238089216L, 114547);
      return;
    }
    if ((i >= 0) && (i == 8))
    {
      paramString = new g();
      paramString.ook = bg.getInt((String)((Map)???).get(".sysmsg.paymsg.PayMsgType"), -1);
      paramString.oos = ((String)((Map)???).get(".sysmsg.paymsg.good_name"));
      paramString.oot = ((String)((Map)???).get(".sysmsg.paymsg.total_fee"));
      paramString.fCP = ((String)((Map)???).get(".sysmsg.paymsg.req_key"));
      paramString.id = ((String)((Map)???).get(".sysmsg.paymsg.id"));
      ??? = (String)((Map)???).get(".sysmsg.paymsg.confirm_type");
      w.i("MicroMsg.WalletOfflineMsgManager", "msg confirm_type is" + paramString.oou);
      if ((!TextUtils.isEmpty((CharSequence)???)) && (((String)???).equals("1"))) {}
      for (paramString.oou = 1;; paramString.oou = 0)
      {
        b(paramString);
        GMTrace.o(15374238089216L, 114547);
        return;
      }
    }
    if ((i >= 0) && (i == 10))
    {
      k.aTF();
      k.aTI().cE(4, 4);
      GMTrace.o(15374238089216L, 114547);
      return;
    }
    if ((i >= 0) && (i == 20))
    {
      paramString = new se();
      paramString.fQH.fQI = new h((Map)???);
      com.tencent.mm.sdk.b.a.uLm.m(paramString);
      GMTrace.o(15374238089216L, 114547);
      return;
    }
    if ((i >= 0) && (i == 23))
    {
      paramString = new d();
      paramString.ook = bg.getInt((String)((Map)???).get(".sysmsg.paymsg.PayMsgType"), -1);
      paramString.fCP = ((String)((Map)???).get(".sysmsg.paymsg.req_key"));
      synchronized (this.ooe)
      {
        if (this.ooe.contains(paramString.fCP))
        {
          w.i("MicroMsg.WalletOfflineMsgManager", "pass this msg %s", new Object[] { paramString.fCP });
          GMTrace.o(15374238089216L, 114547);
          return;
        }
        this.ooe.add(paramString.fCP);
        b(paramString);
        GMTrace.o(15374238089216L, 114547);
        return;
      }
    }
    if ((i >= 0) && (i == 24))
    {
      paramString = new d();
      paramString.ook = bg.getInt((String)((Map)???).get(".sysmsg.paymsg.PayMsgType"), -1);
      paramString.fCP = ((String)((Map)???).get(".sysmsg.paymsg.req_key"));
      b(paramString);
      GMTrace.o(15374238089216L, 114547);
      return;
    }
    GMTrace.o(15374238089216L, 114547);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(6190255833088L, 46121);
    if (this.kmu == null) {
      this.kmu = new ArrayList();
    }
    if (parama != null) {
      this.kmu.add(new WeakReference(parama));
    }
    GMTrace.o(6190255833088L, 46121);
  }
  
  public final void ag(String paramString, final boolean paramBoolean)
  {
    GMTrace.i(19264136282112L, 143529);
    int i = bg.getInt((String)bh.p(paramString, "sysmsg").get(".sysmsg.paymsg.PayMsgType"), -1);
    paramString = new HashSet();
    paramString.add(Integer.valueOf(g.omE));
    paramString.add(Integer.valueOf(g.omD));
    paramString.add(Integer.valueOf(g.omF));
    paramString.add(Integer.valueOf(g.omC));
    paramString.add(Integer.valueOf(g.omz));
    if (paramString.contains(Integer.valueOf(i))) {
      ap.xC().C(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16593471930368L, 123631);
          w.v("MicroMsg.WalletOfflineMsgManager", "DO NetSceneOfflineAckMsg");
          ap.wT().a(new b(paramBoolean), 0);
          GMTrace.o(16593471930368L, 123631);
        }
      });
    }
    GMTrace.o(19264136282112L, 143529);
  }
  
  public final void b(a parama)
  {
    GMTrace.i(6190390050816L, 46122);
    if ((this.kmu == null) || (parama == null))
    {
      GMTrace.o(6190390050816L, 46122);
      return;
    }
    int i = 0;
    while (i < this.kmu.size())
    {
      WeakReference localWeakReference = (WeakReference)this.kmu.get(i);
      if (localWeakReference != null)
      {
        a locala = (a)localWeakReference.get();
        if ((locala != null) && (locala.equals(parama)))
        {
          this.kmu.remove(localWeakReference);
          GMTrace.o(6190390050816L, 46122);
          return;
        }
      }
      i += 1;
    }
    GMTrace.o(6190390050816L, 46122);
  }
  
  public final boolean cX(long paramLong)
  {
    GMTrace.i(16593069277184L, 123628);
    if ((this.olr == null) || (this.olr.size() == 0))
    {
      w.e("MicroMsg.WalletOfflineMsgManager", "mMsgIdList is null or size == 0");
      GMTrace.o(16593069277184L, 123628);
      return false;
    }
    int i = 0;
    while (i < this.olr.size())
    {
      if (((Long)this.olr.get(i)).longValue() == paramLong)
      {
        GMTrace.o(16593069277184L, 123628);
        return true;
      }
      i += 1;
    }
    GMTrace.o(16593069277184L, 123628);
    return false;
  }
  
  public static abstract interface a
  {
    public abstract boolean a(r.c paramc);
  }
  
  public final class b
    extends r.c
  {
    public String ooh;
    public String ooi;
    public String ooj;
    
    public b()
    {
      super();
      GMTrace.i(6199516856320L, 46190);
      GMTrace.o(6199516856320L, 46190);
    }
  }
  
  public class c
  {
    public int ook;
    
    public c()
    {
      GMTrace.i(6192805969920L, 46140);
      GMTrace.o(6192805969920L, 46140);
    }
  }
  
  public final class d
    extends r.c
  {
    public String fCP;
    
    public d()
    {
      super();
      GMTrace.i(6198845767680L, 46185);
      GMTrace.o(6198845767680L, 46185);
    }
  }
  
  public final class e
    extends r.c
  {
    public String ool;
    public String oom;
    public String oon;
    public String ooo;
    public String oop;
    
    public e()
    {
      super();
      GMTrace.i(6196161413120L, 46165);
      GMTrace.o(6196161413120L, 46165);
    }
  }
  
  public final class f
    extends r.c
  {
    public r.h fQI;
    public String ooq;
    public Orders oor;
    
    public f()
    {
      super();
      GMTrace.i(6196295630848L, 46166);
      GMTrace.o(6196295630848L, 46166);
    }
  }
  
  public final class g
    extends r.c
  {
    public String fCP;
    public String id;
    public String oos;
    public String oot;
    public int oou;
    
    public g()
    {
      super();
      GMTrace.i(6192671752192L, 46139);
      GMTrace.o(6192671752192L, 46139);
    }
  }
  
  public final class h
  {
    public String fQq;
    public String fQr;
    public String fQs;
    public String fQt;
    public String fQu;
    public boolean oov;
    
    public h()
    {
      GMTrace.i(15375580266496L, 114557);
      Object localObject;
      this.fQq = ((String)((Map)localObject).get(".sysmsg.paymsg.guide_flag"));
      this.fQr = ((String)((Map)localObject).get(".sysmsg.paymsg.guide_wording"));
      this.fQs = ((String)((Map)localObject).get(".sysmsg.paymsg.left_button_wording"));
      this.fQt = ((String)((Map)localObject).get(".sysmsg.paymsg.right_button_wording"));
      this.fQu = ((String)((Map)localObject).get(".sysmsg.paymsg.upload_credit_url"));
      if ("1".equals(((Map)localObject).get(".sysmsg.paymsg.guide_block"))) {}
      for (boolean bool = true;; bool = false)
      {
        this.oov = bool;
        GMTrace.o(15375580266496L, 114557);
        return;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/offline/a/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */