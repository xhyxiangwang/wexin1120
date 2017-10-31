package com.tencent.mm.plugin.order.a;

import android.os.Looper;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.bt.g.d;
import com.tencent.mm.kernel.h;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.order.model.j;
import com.tencent.mm.protocal.c.ark;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.x.am;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.bn;
import com.tencent.mm.x.bp.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class b
  implements am
{
  private static HashMap<Integer, g.d> gBa;
  private bp.a kJS;
  private List<WeakReference<Object>> kmu;
  public ae mHandler;
  private bp.a oqA;
  com.tencent.mm.plugin.order.model.b oqx;
  private com.tencent.mm.plugin.order.b.b oqy;
  private com.tencent.mm.plugin.order.model.c oqz;
  
  static
  {
    GMTrace.i(6668205162496L, 49682);
    HashMap localHashMap = new HashMap();
    gBa = localHashMap;
    localHashMap.put(Integer.valueOf("ORDERCOMMONMSGXML_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(6668473597952L, 49684);
        String[] arrayOfString = com.tencent.mm.plugin.order.b.b.gMz;
        GMTrace.o(6668473597952L, 49684);
        return arrayOfString;
      }
    });
    com.tencent.mm.wallet_core.a.h("ShowOrdersInfoProcess", a.class);
    GMTrace.o(6668205162496L, 49682);
  }
  
  public b()
  {
    GMTrace.i(6666460332032L, 49669);
    this.mHandler = new ae(Looper.getMainLooper());
    this.oqx = null;
    this.oqz = null;
    this.kmu = new ArrayList();
    this.oqA = new bp.a()
    {
      public final void a(final d.a paramAnonymousa)
      {
        GMTrace.i(6668742033408L, 49686);
        paramAnonymousa = n.a(paramAnonymousa.hme.tvq);
        w.i("MicroMsg.SubCoreWalletOrder", "MallOrderNotifyConfXml:" + paramAnonymousa);
        b.this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6664849719296L, 49657);
            Object localObject1 = b.this;
            h.xx().wH();
            if (((b)localObject1).oqx == null) {
              ((b)localObject1).oqx = new com.tencent.mm.plugin.order.model.b();
            }
            localObject1 = ((b)localObject1).oqx;
            Object localObject2 = paramAnonymousa;
            if (!bg.mZ((String)localObject2))
            {
              localObject2 = bh.p((String)localObject2, "sysmsg");
              if (localObject2 == null)
              {
                GMTrace.o(6664849719296L, 49657);
                return;
              }
              try
              {
                localObject2 = (String)((Map)localObject2).get(".sysmsg.wxpay.transid");
                if (!bg.mZ((String)localObject2))
                {
                  w.d("MicroMsg.WalletOrdersManager", "transid " + (String)localObject2);
                  if (!((com.tencent.mm.plugin.order.model.b)localObject1).oqR.contains(localObject2))
                  {
                    ((com.tencent.mm.plugin.order.model.b)localObject1).oqR.add(localObject2);
                    ap.AS();
                    com.tencent.mm.x.c.xi().set(204817, Integer.valueOf(((com.tencent.mm.plugin.order.model.b)localObject1).oqR.size()));
                    w.d("MicroMsg.WalletOrdersManager", "notifyTrans.size() : " + ((com.tencent.mm.plugin.order.model.b)localObject1).oqR.size());
                    ((com.tencent.mm.plugin.order.model.b)localObject1).GE();
                    b.aVa().ahA();
                  }
                }
                GMTrace.o(6664849719296L, 49657);
                return;
              }
              catch (Exception localException)
              {
                w.e("MicroMsg.WalletOrdersManager", "cmdid error");
              }
            }
            GMTrace.o(6664849719296L, 49657);
          }
        });
        GMTrace.o(6668742033408L, 49686);
      }
    };
    this.kJS = new bp.a()
    {
      public final void a(final d.a paramAnonymousa)
      {
        GMTrace.i(6665118154752L, 49659);
        final String str = n.a(paramAnonymousa.hme.tvq);
        w.i("MicroMsg.SubCoreWalletOrder", "MallPayMsg:" + str);
        b.this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6666326114304L, 49668);
            Object localObject1 = b.aVd();
            Object localObject2 = str;
            Object localObject3 = paramAnonymousa.hme.tvn;
            j localj;
            if (!TextUtils.isEmpty((CharSequence)localObject2))
            {
              localj = com.tencent.mm.plugin.order.model.c.DG((String)localObject2);
              if (localj == null)
              {
                w.i("MicroMsg.MallPayMsgManager", "payMsg == null");
                GMTrace.o(6666326114304L, 49668);
                return;
              }
              if ((!TextUtils.isEmpty(localj.osb)) || (!TextUtils.isEmpty(localj.oss)) || (!TextUtils.isEmpty(localj.osr)) || (!TextUtils.isEmpty(localj.fJC)) || (!TextUtils.isEmpty(localj.osn)) || (!TextUtils.isEmpty(localj.oso)) || (!TextUtils.isEmpty(localj.osm)) || (!TextUtils.isEmpty(localj.osq)) || (!TextUtils.isEmpty(localj.osp)) || (!TextUtils.isEmpty(localj.osl))) {
                if ((localj.osl != null) && (com.tencent.mm.plugin.order.c.c.ul(localj.osl)))
                {
                  int i = Integer.valueOf(localj.osl).intValue();
                  if ((i != 2) && (i != 1)) {}
                }
                else
                {
                  if (!TextUtils.isEmpty(localj.osn)) {
                    break label461;
                  }
                  localj.fJw = ((String)localObject3);
                  w.i("MicroMsg.MallPayMsgManager", "msgid: " + localj.fJw);
                  w.i("MicroMsg.MallPayMsgManager", "msgType: " + localj.osl);
                  if (((com.tencent.mm.plugin.order.model.c)localObject1).DI(localj.fJw)) {
                    break label490;
                  }
                  ((com.tencent.mm.plugin.order.model.c)localObject1).knh.add(localj);
                  ((com.tencent.mm.plugin.order.model.c)localObject1).a(localj, (String)localObject2, "0");
                  label310:
                  ((com.tencent.mm.plugin.order.model.c)localObject1).aVg();
                  localObject1 = b.aVa();
                  if (localj != null)
                  {
                    localObject2 = new ark();
                    if ((TextUtils.isEmpty(localj.osn)) || (!com.tencent.mm.plugin.order.c.c.ul(localj.osn))) {
                      break label564;
                    }
                    ((ark)localObject2).orU = Integer.valueOf(localj.osn).intValue();
                  }
                }
              }
            }
            for (((ark)localObject2).orW = Integer.valueOf(localj.osn).intValue();; ((ark)localObject2).orW = ((int)(System.currentTimeMillis() / 1000L)))
            {
              ((ark)localObject2).orZ = 100000;
              ((ark)localObject2).osb = localj.osb;
              ((ark)localObject2).orR = localj.fJw;
              ((ark)localObject2).orV = localj.osp;
              ((ark)localObject2).unx = -1;
              ((ark)localObject2).osc = localj.osm;
              ((ark)localObject2).osd = localj.osp;
              ((ark)localObject2).ose = localj.fJC;
              ((b)localObject1).aVb();
              GMTrace.o(6666326114304L, 49668);
              return;
              label461:
              localj.fJw = ((String)localObject3 + localj.osn);
              break;
              label490:
              w.e("MicroMsg.MallPayMsgManager", "msg for id " + localj.fJw + " is exist!!");
              localObject3 = ((com.tencent.mm.plugin.order.model.c)localObject1).DK(localj.fJw);
              ((com.tencent.mm.plugin.order.model.c)localObject1).DH(localj.fJw);
              ((com.tencent.mm.plugin.order.model.c)localObject1).knh.add(localj);
              ((com.tencent.mm.plugin.order.model.c)localObject1).a(localj, (String)localObject2, ((com.tencent.mm.plugin.order.b.a)localObject3).field_isRead);
              break label310;
              label564:
              ((ark)localObject2).orU = ((int)(System.currentTimeMillis() / 1000L));
            }
          }
        });
        GMTrace.o(6665118154752L, 49659);
      }
    };
    GMTrace.o(6666460332032L, 49669);
  }
  
  public static String aKO()
  {
    GMTrace.i(6667936727040L, 49680);
    if (ap.AV())
    {
      Object localObject = new StringBuilder();
      ap.AS();
      localObject = com.tencent.mm.x.c.yV() + "order";
      GMTrace.o(6667936727040L, 49680);
      return (String)localObject;
    }
    GMTrace.o(6667936727040L, 49680);
    return "";
  }
  
  public static b aVa()
  {
    GMTrace.i(6666594549760L, 49670);
    b localb2 = (b)ap.AL().gJ("plugin.order");
    b localb1 = localb2;
    if (localb2 == null)
    {
      w.w("MicroMsg.SubCoreWalletOrder", "not found in MMCore, new one");
      localb1 = new b();
      ap.AL().a("plugin.order", localb1);
    }
    GMTrace.o(6666594549760L, 49670);
    return localb1;
  }
  
  public static com.tencent.mm.plugin.order.b.b aVc()
  {
    GMTrace.i(6667668291584L, 49678);
    h.xx().wH();
    if (aVa().oqy == null)
    {
      localObject = aVa();
      ap.AS();
      ((b)localObject).oqy = new com.tencent.mm.plugin.order.b.b(com.tencent.mm.x.c.yI());
    }
    Object localObject = aVa().oqy;
    GMTrace.o(6667668291584L, 49678);
    return (com.tencent.mm.plugin.order.b.b)localObject;
  }
  
  public static com.tencent.mm.plugin.order.model.c aVd()
  {
    GMTrace.i(6667802509312L, 49679);
    h.xx().wH();
    if (aVa().oqz == null) {
      aVa().oqz = new com.tencent.mm.plugin.order.model.c();
    }
    com.tencent.mm.plugin.order.model.c localc = aVa().oqz;
    GMTrace.o(6667802509312L, 49679);
    return localc;
  }
  
  public final void aVb()
  {
    GMTrace.i(6666728767488L, 49671);
    if (this.kmu == null)
    {
      GMTrace.o(6666728767488L, 49671);
      return;
    }
    int i = 0;
    while (i < this.kmu.size())
    {
      WeakReference localWeakReference = (WeakReference)this.kmu.get(i);
      if (localWeakReference != null) {
        localWeakReference.get();
      }
      i += 1;
    }
    GMTrace.o(6666728767488L, 49671);
  }
  
  public final void aW(boolean paramBoolean)
  {
    GMTrace.i(6667399856128L, 49676);
    this.oqx = null;
    this.oqz = null;
    GMTrace.o(6667399856128L, 49676);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(6667265638400L, 49675);
    GMTrace.o(6667265638400L, 49675);
  }
  
  public final void ahA()
  {
    GMTrace.i(6666862985216L, 49672);
    if (this.kmu == null)
    {
      GMTrace.o(6666862985216L, 49672);
      return;
    }
    int i = 0;
    while (i < this.kmu.size())
    {
      WeakReference localWeakReference = (WeakReference)this.kmu.get(i);
      if (localWeakReference != null) {
        localWeakReference.get();
      }
      i += 1;
    }
    GMTrace.o(6666862985216L, 49672);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(6667131420672L, 49674);
    GMTrace.o(6667131420672L, 49674);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(6667534073856L, 49677);
    GMTrace.o(6667534073856L, 49677);
  }
  
  public final HashMap<Integer, g.d> vM()
  {
    GMTrace.i(6666997202944L, 49673);
    HashMap localHashMap = gBa;
    GMTrace.o(6666997202944L, 49673);
    return localHashMap;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/order/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */