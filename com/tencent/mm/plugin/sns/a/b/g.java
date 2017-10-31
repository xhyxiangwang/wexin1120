package com.tencent.mm.plugin.sns.a.b;

import android.app.Activity;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.ju;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.plugin.sns.ui.bf;
import com.tencent.mm.protocal.c.bb;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.be;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public final class g
  implements b
{
  public static Map<String, Integer> pWy;
  public Activity activity;
  public long khj;
  public int oja;
  public int pVL;
  public View pWA;
  private a pWB;
  private int pWC;
  public HashMap<String, Long> pWp;
  public HashSet<Long> pWq;
  public Map<String, Long> pWr;
  public Map<String, Integer> pWs;
  public HashSet<Long> pWt;
  public Map<Long, h> pWu;
  public Map<String, a> pWv;
  private LinkedList<String> pWw;
  private Map<String, Integer> pWx;
  private int pWz;
  
  static
  {
    GMTrace.i(8170772627456L, 60877);
    pWy = new HashMap();
    GMTrace.o(8170772627456L, 60877);
  }
  
  public g(int paramInt)
  {
    GMTrace.i(8169027796992L, 60864);
    this.pWp = new HashMap();
    this.pWq = new HashSet();
    this.pWr = new HashMap();
    this.pWs = new HashMap();
    this.pWt = new HashSet();
    this.pWu = new HashMap();
    this.pWv = new HashMap();
    this.oja = 1;
    this.pWw = new LinkedList();
    this.pWx = new HashMap();
    this.pWz = 0;
    this.pVL = 0;
    this.pWA = null;
    this.pWB = null;
    this.khj = 0L;
    this.pWC = -1;
    this.oja = paramInt;
    GMTrace.o(8169027796992L, 60864);
  }
  
  public final void a(int paramInt1, String paramString1, String paramString2, boolean paramBoolean, View paramView, long paramLong, bf parambf, bdk parambdk, int paramInt2, int paramInt3)
  {
    GMTrace.i(15964125003776L, 118942);
    this.pWq.add(Long.valueOf(paramLong));
    this.pWp.put(paramString1, Long.valueOf(paramLong));
    if (this.pWC == -1) {
      if (this.activity != null) {
        break label89;
      }
    }
    m localm;
    label89:
    for (int i = -1;; i = com.tencent.mm.pluginsdk.e.dH(this.activity))
    {
      this.pWC = i;
      localm = com.tencent.mm.plugin.sns.model.ae.bhp().HA(paramString1);
      if (localm != null) {
        break;
      }
      w.w("MicroMsg.SnsAdStatistic", "snsinfo not found! skip onAdAdded logic!");
      GMTrace.o(15964125003776L, 118942);
      return;
    }
    long l;
    if ((this.pWB == null) && (paramView != null) && (com.tencent.mm.plugin.sns.model.ae.qcK))
    {
      if (parambf == null)
      {
        parambf = null;
        this.pWB = new a(parambf, paramLong, paramView, this.pVL, this.pWA, this.pWC, this.oja, parambdk, paramInt1, localm.bjH());
        paramView = this.pWB;
        paramView.pVU = System.currentTimeMillis();
        com.tencent.mm.plugin.sns.model.ae.aCa().post(new a.1(paramView));
      }
    }
    else
    {
      if (!this.pWr.containsKey(paramString1)) {
        break label361;
      }
      l = bg.aG(((Long)this.pWr.get(paramString1)).longValue());
      if (l >= 1200000L) {
        break label717;
      }
      if (!this.pWs.containsKey(paramString1)) {
        break label337;
      }
    }
    label337:
    for (i = ((Integer)this.pWs.get(paramString1)).intValue();; i = 0)
    {
      if (i < 2) {
        break label343;
      }
      w.i("MicroMsg.SnsAdStatistic", "passed localid " + paramString1 + " viewid " + paramString2 + " passedTime: " + l);
      GMTrace.o(15964125003776L, 118942);
      return;
      parambf = parambf.qSn;
      break;
    }
    label343:
    this.pWs.put(paramString1, Integer.valueOf(i + 1));
    label361:
    if (!this.pWv.containsKey(paramString1))
    {
      this.pWv.put(paramString1, new a(bg.Pq(), paramString1, paramInt1, paramString2, paramInt2, paramLong));
      w.i("MicroMsg.SnsAdStatistic", "onAdAdded " + paramInt1 + " " + paramString1 + "  isExposure: " + paramBoolean);
      if (paramInt2 == 9)
      {
        if (!this.pWu.containsKey(Long.valueOf(paramLong))) {
          break label752;
        }
        paramView = (h)this.pWu.get(Long.valueOf(paramLong));
        label488:
        paramView.pWK = bg.Pq();
        this.pWu.put(Long.valueOf(paramLong), paramView);
      }
      if (!this.pWw.contains(paramString1))
      {
        this.pWw.add(paramString1);
        w.i("MicroMsg.SnsAdStatistic", "exposures item " + paramString1);
        this.pWx.put(paramString1, Integer.valueOf((int)(System.currentTimeMillis() / 1000L)));
      }
      parambf = localm.bjH();
      parambdk = localm.bjL();
      paramView = null;
      paramString1 = paramView;
      if (this.pWB != null)
      {
        paramString1 = paramView;
        if (com.tencent.mm.plugin.sns.model.ae.qcK) {
          paramString1 = this.pWB.bfR();
        }
      }
      paramView = localm.bkr();
      paramInt1 = 0;
      if (paramInt3 == 1)
      {
        paramInt1 = paramView.field_exposureCount + 1;
        paramView.field_exposureCount = paramInt1;
        com.tencent.mm.plugin.sns.model.ae.bhr().c(paramView, new String[0]);
      }
      if (!parambf.bim()) {
        break label767;
      }
      paramString1 = new d(paramString2, this.oja, paramString1, 3, paramInt1, localm.bkt());
    }
    for (;;)
    {
      com.tencent.mm.kernel.h.xA();
      com.tencent.mm.kernel.h.xy().gQO.a(paramString1, 0);
      GMTrace.o(15964125003776L, 118942);
      return;
      label717:
      this.pWr.put(paramString1, Long.valueOf(bg.Pq()));
      this.pWs.put(paramString1, Integer.valueOf(0));
      break;
      label752:
      paramView = new h("timeline");
      break label488;
      label767:
      if (parambf.bin())
      {
        if ((parambdk != null) && (parambdk.uyu.tKc == 15) && (parambdk.uyB != 1)) {
          paramString1 = new d(paramString2, this.oja, paramString1, 5, paramInt1, localm.bkt());
        } else {
          paramString1 = new d(paramString2, this.oja, paramString1, 4, paramInt1, localm.bkt());
        }
      }
      else if (paramInt2 == 9) {
        paramString1 = new d(paramString2, this.oja, paramString1, 2, paramInt1, localm.bkt());
      } else {
        paramString1 = new d(paramString2, this.oja, paramString1, 1, paramInt1, localm.bkt());
      }
    }
  }
  
  public final void bfS()
  {
    GMTrace.i(8170504192000L, 60875);
    if ((this.pWB != null) && (com.tencent.mm.plugin.sns.model.ae.qcK)) {
      this.pWB.bfQ();
    }
    GMTrace.o(8170504192000L, 60875);
  }
  
  public final void clear()
  {
    GMTrace.i(8170638409728L, 60876);
    w.i("MicroMsg.SnsAdStatistic", "clean the adRemove" + this.pWw.size());
    Object localObject1 = new LinkedList();
    Object localObject2 = this.pWv.keySet().iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((List)localObject1).add((String)((Iterator)localObject2).next());
    }
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      localObject2 = (a)this.pWv.get(localObject2);
      q(((a)localObject2).position, ((a)localObject2).fNI, ((a)localObject2).hNw);
    }
    localObject1 = this.pWw.iterator();
    com.tencent.mm.plugin.sns.storage.e locale;
    m localm;
    int i;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      locale = com.tencent.mm.plugin.sns.model.ae.bhr().uE(u.HV((String)localObject2));
      if (locale != null)
      {
        localm = locale.bjN();
        locale.field_localFlag |= 0x80;
        i = (int)(System.currentTimeMillis() / 1000L);
        if (!this.pWx.containsKey(localObject2)) {
          break label336;
        }
        i = ((Integer)this.pWx.get(localObject2)).intValue();
      }
    }
    label336:
    for (;;)
    {
      if (locale.field_exposureTime <= 0) {
        locale.field_exposureTime = i;
      }
      localm.field_localFlag |= 0x80;
      com.tencent.mm.plugin.sns.model.ae.bhp().b(localm.field_snsId, localm);
      com.tencent.mm.plugin.sns.model.ae.bhr().b(locale.field_snsId, locale);
      break;
      this.pWw.clear();
      this.pWx.clear();
      GMTrace.o(8170638409728L, 60876);
      return;
    }
  }
  
  public final void d(long paramLong, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(8169564667904L, 60868);
    h localh;
    if (this.pWu.containsKey(Long.valueOf(paramLong)))
    {
      localh = (h)this.pWu.get(Long.valueOf(paramLong));
      if (paramInt > 0) {
        localh.pWP.pXN = paramInt;
      }
      if (!paramBoolean) {
        break label110;
      }
    }
    label110:
    for (paramInt = 1;; paramInt = 0)
    {
      localh.pWI = paramInt;
      this.pWu.put(Long.valueOf(paramLong), localh);
      GMTrace.o(8169564667904L, 60868);
      return;
      localh = new h("timeline");
      break;
    }
  }
  
  public final boolean dh(long paramLong)
  {
    GMTrace.i(8168893579264L, 60863);
    boolean bool = this.pWq.contains(Long.valueOf(paramLong));
    GMTrace.o(8168893579264L, 60863);
    return bool;
  }
  
  public final void di(final long paramLong)
  {
    GMTrace.i(8169296232448L, 60866);
    af.u(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8161243168768L, 60806);
        g localg;
        long l;
        if (g.this.dh(paramLong))
        {
          localg = g.this;
          l = paramLong;
          if (!localg.pWu.containsKey(Long.valueOf(l))) {
            break label114;
          }
        }
        label114:
        for (h localh = (h)localg.pWu.get(Long.valueOf(l));; localh = new h("timeline"))
        {
          localh.pWI = 1;
          localh.pWP.pXL += 1;
          localg.pWu.put(Long.valueOf(l), localh);
          GMTrace.o(8161243168768L, 60806);
          return;
        }
      }
    });
    GMTrace.o(8169296232448L, 60866);
  }
  
  public final boolean dj(long paramLong)
  {
    GMTrace.i(8169967321088L, 60871);
    if (this.pWt.contains(Long.valueOf(paramLong)))
    {
      GMTrace.o(8169967321088L, 60871);
      return true;
    }
    GMTrace.o(8169967321088L, 60871);
    return false;
  }
  
  public final void k(long paramLong, boolean paramBoolean)
  {
    GMTrace.i(8169698885632L, 60869);
    h localh;
    if (this.pWu.containsKey(Long.valueOf(paramLong)))
    {
      localh = (h)this.pWu.get(Long.valueOf(paramLong));
      if (!paramBoolean) {
        break label106;
      }
    }
    label106:
    for (localh.pWP.pXO = 2;; localh.pWP.pXO = 1)
    {
      localh.pWP.pXP = 1;
      this.pWu.put(Long.valueOf(paramLong), localh);
      GMTrace.o(8169698885632L, 60869);
      return;
      localh = new h("timeline");
      break;
    }
  }
  
  public final void o(final long paramLong1, long paramLong2)
  {
    GMTrace.i(8169833103360L, 60870);
    af.u(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8161780039680L, 60810);
        if (g.this.dh(paramLong1))
        {
          g localg = g.this;
          long l = this.pWG;
          if (!localg.pWt.contains(Long.valueOf(l))) {
            localg.pWt.add(Long.valueOf(l));
          }
        }
        GMTrace.o(8161780039680L, 60810);
      }
    });
    GMTrace.o(8169833103360L, 60870);
  }
  
  public final void onResume()
  {
    GMTrace.i(8169162014720L, 60865);
    if (this.khj <= 0L)
    {
      GMTrace.o(8169162014720L, 60865);
      return;
    }
    long l = bg.aG(this.khj);
    Iterator localIterator = this.pWv.keySet().iterator();
    Object localObject;
    a locala;
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      locala = (a)this.pWv.get(localObject);
      w.i("MicroMsg.SnsAdStatistic", "before Key " + (String)localObject + " " + locala.time);
    }
    localIterator = this.pWv.keySet().iterator();
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      localObject = (a)this.pWv.get(localObject);
      ((a)localObject).time -= l;
    }
    localIterator = this.pWv.keySet().iterator();
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      locala = (a)this.pWv.get(localObject);
      w.i("MicroMsg.SnsAdStatistic", "update Key " + (String)localObject + " " + locala.time);
    }
    GMTrace.o(8169162014720L, 60865);
  }
  
  public final void p(final long paramLong1, long paramLong2)
  {
    GMTrace.i(8170101538816L, 60872);
    af.u(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8171041062912L, 60879);
        g localg;
        long l1;
        long l2;
        if (g.this.dh(paramLong1))
        {
          localg = g.this;
          l1 = paramLong1;
          l2 = this.pWH;
          if (!localg.pWu.containsKey(Long.valueOf(l1))) {
            break label122;
          }
        }
        label122:
        for (h localh = (h)localg.pWu.get(Long.valueOf(l1));; localh = new h("timeline"))
        {
          if (localh.pWP.pXQ == 0L) {
            localh.pWP.pXQ = l2;
          }
          localg.pWu.put(Long.valueOf(l1), localh);
          GMTrace.o(8171041062912L, 60879);
          return;
        }
      }
    });
    GMTrace.o(8170101538816L, 60872);
  }
  
  public final void q(int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(8170369974272L, 60874);
    long l;
    if (this.pWp.containsKey(paramString1))
    {
      l = ((Long)this.pWp.remove(paramString1)).longValue();
      this.pWq.remove(Long.valueOf(l));
    }
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject2 = localObject3;
    Object localObject1 = localObject4;
    if (this.pWB != null)
    {
      localObject2 = localObject3;
      localObject1 = localObject4;
      if (com.tencent.mm.plugin.sns.model.ae.qcK)
      {
        localObject1 = this.pWB;
        ((a)localObject1).kpQ = true;
        ((a)localObject1).pVV = System.currentTimeMillis();
        localObject1 = this.pWB;
        label138:
        label776:
        int i;
        if (((a)localObject1).pVQ < 0)
        {
          ((a)localObject1).pWl = 2;
          if (((a)localObject1).pVS >= 0) {
            break label1128;
          }
          ((a)localObject1).pWm = 2;
          localObject3 = new StringBuilder();
          ((StringBuilder)localObject3).append(com.tencent.mm.plugin.sns.data.i.jdMethod_do(((a)localObject1).hNx) + ",");
          ((StringBuilder)localObject3).append(((a)localObject1).hNy + ",");
          ((StringBuilder)localObject3).append(((a)localObject1).pWl + ",");
          ((StringBuilder)localObject3).append(((a)localObject1).pWm + ",");
          ((StringBuilder)localObject3).append(((a)localObject1).pWi + ",");
          ((StringBuilder)localObject3).append(((a)localObject1).pWj + ",");
          ((StringBuilder)localObject3).append(((a)localObject1).pWk + ",");
          ((StringBuilder)localObject3).append(((a)localObject1).pVU + ",");
          ((StringBuilder)localObject3).append(((a)localObject1).pVV + ",");
          if ((((a)localObject1).pVY > 0L) && (((a)localObject1).pWb == 0L)) {
            ((a)localObject1).pWb = System.currentTimeMillis();
          }
          ((StringBuilder)localObject3).append(((a)localObject1).pVY + ",");
          ((StringBuilder)localObject3).append(((a)localObject1).pWb + ",");
          if ((((a)localObject1).pWe > 0L) && (((a)localObject1).pWh == 0L)) {
            ((a)localObject1).pWh = System.currentTimeMillis();
          }
          ((StringBuilder)localObject3).append(((a)localObject1).pWe + ",");
          ((StringBuilder)localObject3).append(((a)localObject1).pWh);
          f.a(((a)localObject1).hNx, (StringBuilder)localObject3);
          w.i("MicroMsg.AdViewStatic", "report " + ((StringBuilder)localObject3).toString());
          localObject2 = new bb();
          ((bb)localObject2).tuI = ((a)localObject1).pWe;
          ((bb)localObject2).tuJ = ((a)localObject1).pWh;
          ((bb)localObject2).pWl = ((a)localObject1).pWl;
          ((bb)localObject2).pWm = ((a)localObject1).pWm;
          ((bb)localObject2).tuD = ((a)localObject1).pWi;
          ((bb)localObject2).tuE = ((a)localObject1).pWj;
          ((bb)localObject2).tuF = ((a)localObject1).pWk;
          ((bb)localObject2).tuG = ((a)localObject1).pVY;
          ((bb)localObject2).tuH = ((a)localObject1).pWb;
          ((bb)localObject2).startTime = ((a)localObject1).pVU;
          ((bb)localObject2).endTime = ((a)localObject1).pVV;
          if ((((a)localObject1).pVP == null) || (!((a)localObject1).pVP.bir())) {
            break label1137;
          }
          com.tencent.mm.plugin.sns.model.ae.bhj().i(14648, new Object[] { ((StringBuilder)localObject3).toString() });
          localObject4 = com.tencent.mm.modelsns.b.gM(730);
          ((com.tencent.mm.modelsns.b)localObject4).lh(com.tencent.mm.plugin.sns.data.i.jdMethod_do(((a)localObject1).hNx)).lh(((a)localObject1).hNy).gP(((a)localObject1).pWl).gP(((a)localObject1).pWm).gP(((a)localObject1).pWi).gP(((a)localObject1).pWj).gP(((a)localObject1).pWk).lh(((a)localObject1).pVU).lh(((a)localObject1).pVV).lh(((a)localObject1).pVY).lh(((a)localObject1).pWb).lh(((a)localObject1).pWe).lh(((a)localObject1).pWh);
          ((com.tencent.mm.modelsns.b)localObject4).LJ();
          localObject4 = new ju();
          ((ju)localObject4).fHj.position = ((a)localObject1).position;
          com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject4);
          if (!r.icT) {
            break label1185;
          }
          int j = new Random(System.currentTimeMillis()).nextInt(2000) + 10;
          w.i("MicroMsg.AdViewStatic", "run on test kv " + j);
          i = 0;
          label1063:
          if (i >= j) {
            break label1185;
          }
          if ((((a)localObject1).pVP == null) || (!((a)localObject1).pVP.bir())) {
            break label1161;
          }
          com.tencent.mm.plugin.sns.model.ae.bhj().i(14648, new Object[] { ((StringBuilder)localObject3).toString() });
        }
        for (;;)
        {
          i += 1;
          break label1063;
          ((a)localObject1).pWl = 1;
          break;
          label1128:
          ((a)localObject1).pWm = 1;
          break label138;
          label1137:
          com.tencent.mm.plugin.sns.model.ae.bhj().i(12010, new Object[] { ((StringBuilder)localObject3).toString() });
          break label776;
          label1161:
          com.tencent.mm.plugin.sns.model.ae.bhj().i(12010, new Object[] { ((StringBuilder)localObject3).toString() });
        }
        label1185:
        localObject1 = this.pWB.bfR();
        this.pWB = null;
      }
    }
    Object localObject5;
    if (this.pWv.containsKey(paramString1))
    {
      localObject4 = (a)this.pWv.remove(paramString1);
      this.pWr.put(paramString1, Long.valueOf(bg.Pq()));
      if (localObject4 == null)
      {
        GMTrace.o(8170369974272L, 60874);
        return;
      }
      l = bg.aG(((a)localObject4).time);
      w.i("MicroMsg.SnsAdStatistic", "onAdRemoved " + paramInt + " " + paramString1 + " " + l + " ");
      localObject3 = com.tencent.mm.plugin.sns.model.ae.bhp().HA(paramString1);
      if (localObject3 == null)
      {
        GMTrace.o(8170369974272L, 60874);
        return;
      }
      paramString1 = "";
      localObject5 = ((m)localObject3).bjL();
      com.tencent.mm.plugin.sns.storage.b localb = ((m)localObject3).bjH();
      if (localb.bim())
      {
        paramInt = 3;
        paramString1 = "";
        paramString1 = new d(paramString2, this.oja, 2, (int)l, (bb)localObject2, (be)localObject1, paramInt, paramString1, -1, ((m)localObject3).bkt());
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.a(paramString1, 0);
        GMTrace.o(8170369974272L, 60874);
        return;
      }
      if (localb.bin()) {
        if ((localObject5 != null) && (((bhc)localObject5).uyu.tKc == 15) && (((bhc)localObject5).uyB != 1))
        {
          paramInt = 5;
          paramString1 = (h)this.pWu.remove(Long.valueOf(((a)localObject4).hNx));
          if (paramString1 == null) {
            break label1650;
          }
          paramString1.tN(0);
        }
      }
    }
    label1650:
    for (paramString1 = paramString1.bfT();; paramString1 = "")
    {
      this.pWt.remove(Long.valueOf(((a)localObject4).hNx));
      break;
      paramInt = 4;
      paramString1 = "";
      break;
      if (((a)localObject4).kxh == 9)
      {
        paramInt = 2;
        localObject5 = (h)this.pWu.remove(Long.valueOf(((a)localObject4).hNx));
        if (localObject5 != null)
        {
          ((h)localObject5).tN(0);
          paramString1 = ((h)localObject5).bfT();
        }
        this.pWt.remove(Long.valueOf(((a)localObject4).hNx));
        break;
      }
      paramInt = 1;
      paramString1 = "";
      break;
      w.i("MicroMsg.SnsAdStatistic", "can not find onAdRemoved " + paramInt + " " + paramString1);
      GMTrace.o(8170369974272L, 60874);
      return;
    }
  }
  
  public final void u(final long paramLong, int paramInt)
  {
    GMTrace.i(8169430450176L, 60867);
    af.u(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8162048475136L, 60812);
        g.this.d(paramLong, this.jaR, this.pWF);
        GMTrace.o(8162048475136L, 60812);
      }
    });
    GMTrace.o(8169430450176L, 60867);
  }
  
  static final class a
  {
    public String fNI;
    public String hNw;
    public long hNx;
    public int kxh;
    public int position;
    public long time;
    
    public a(long paramLong1, String paramString1, int paramInt1, String paramString2, int paramInt2, long paramLong2)
    {
      GMTrace.i(8165940789248L, 60841);
      this.time = paramLong1;
      this.fNI = paramString1;
      this.position = paramInt1;
      this.hNw = paramString2;
      this.hNx = paramLong2;
      this.kxh = paramInt2;
      GMTrace.o(8165940789248L, 60841);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/a/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */