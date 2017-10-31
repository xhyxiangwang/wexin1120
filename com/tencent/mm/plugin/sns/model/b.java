package com.tencent.mm.plugin.sns.model;

import android.os.Build.VERSION;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.kernel.h;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.a.d;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.storage.an;
import com.tencent.mm.storage.t;
import com.tencent.mm.x.ag.a;
import com.tencent.mm.x.ag.e;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class b
  implements com.tencent.mm.ac.e, com.tencent.mm.plugin.sns.model.a.b.a
{
  static int pZQ;
  private static final int pZR;
  LinkedList<com.tencent.mm.plugin.sns.data.f> gES;
  Set<b> gFw;
  com.tencent.mm.sdk.platformtools.ae handler;
  public long pZS;
  private int pZT;
  private int pZU;
  LinkedList<com.tencent.mm.plugin.sns.data.g> pZV;
  public HashMap<String, Long> pZW;
  public boolean pZX;
  public Set<a> pZY;
  Map<String, Long> pZZ;
  Map<String, com.tencent.mm.plugin.sns.data.c> qaa;
  
  static
  {
    GMTrace.i(8130507309056L, 60577);
    pZQ = 0;
    if (Build.VERSION.SDK_INT >= 14) {}
    for (int i = 100;; i = 25)
    {
      pZR = i;
      GMTrace.o(8130507309056L, 60577);
      return;
    }
  }
  
  public b()
  {
    GMTrace.i(8128494043136L, 60562);
    this.handler = null;
    this.pZS = 0L;
    this.pZT = 0;
    this.pZU = 2;
    this.pZV = new LinkedList();
    this.pZW = new HashMap();
    this.pZX = true;
    this.gFw = new HashSet();
    this.pZY = new HashSet();
    this.gES = new LinkedList();
    this.pZZ = new ConcurrentHashMap();
    this.qaa = new HashMap();
    this.handler = ae.aCa();
    bgu();
    GMTrace.o(8128494043136L, 60562);
  }
  
  public static void bgs()
  {
    GMTrace.i(8128091389952L, 60559);
    GMTrace.o(8128091389952L, 60559);
  }
  
  public static boolean bgt()
  {
    GMTrace.i(8128225607680L, 60560);
    GMTrace.o(8128225607680L, 60560);
    return false;
  }
  
  private void bgu()
  {
    GMTrace.i(8128628260864L, 60563);
    this.gES.clear();
    this.qaa.clear();
    this.pZZ.clear();
    this.pZV.clear();
    this.pZW.clear();
    GMTrace.o(8128628260864L, 60563);
  }
  
  public final void E(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(8128359825408L, 60561);
    this.pZU = paramInt;
    for (;;)
    {
      label126:
      int i;
      try
      {
        String str;
        if (com.tencent.mm.sdk.platformtools.am.isWifi(ab.getContext()))
        {
          str = com.tencent.mm.k.g.uz().getValue("SnsImgDownloadConcurrentCountForWifi");
          if ((!bg.mZ(str)) || (!com.tencent.mm.sdk.a.b.bMv())) {
            break label451;
          }
          str = "00:00-18:30-1-3;19:30-23:00-1-2;23:00-23:59-1-3;18:30-19:30-3-5;";
          if (bg.mZ(str)) {
            continue;
          }
          localObject = new SimpleDateFormat("HH:mm").format(new Date()).split(":");
          paramInt = bg.RF(localObject[0]);
          paramInt = bg.RF(localObject[1]) + paramInt * 60 - ((int)i.Go() - 8) * 60;
          if (paramInt >= 0) {
            break label461;
          }
          paramInt += 1440;
          String[] arrayOfString1 = str.split(";");
          i = 0;
          label137:
          if (i >= arrayOfString1.length) {
            continue;
          }
          if (bg.mZ(arrayOfString1[i])) {
            break label454;
          }
          localObject = arrayOfString1[i].split("-");
          if ((localObject == null) || (localObject.length < 4))
          {
            w.e("MicroMsg.DownloadManager", "setMaxThread Err i%d :%s", new Object[] { Integer.valueOf(i), str });
            break label454;
          }
        }
        else
        {
          str = com.tencent.mm.k.g.uz().getValue("SnsImgDownloadConcurrentCountForNotWifi");
          continue;
        }
        String[] arrayOfString2 = localObject[0].split(":");
        int j = bg.RF(arrayOfString2[0]);
        j = bg.RF(arrayOfString2[1]) + j * 60;
        arrayOfString2 = localObject[1].split(":");
        int k = bg.RF(arrayOfString2[0]);
        k = bg.RF(arrayOfString2[1]) + k * 60;
        w.i("MicroMsg.DownloadManager", "setMaxThread i:%d [%d,%d] now:%d threadcnt:[%s,%s]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(paramInt), localObject[2], localObject[3] });
        if ((paramInt > k) || (paramInt <= j)) {
          break label454;
        }
        if (paramBoolean)
        {
          localObject = localObject[2];
          j = bg.RF((String)localObject);
          if (j <= 0) {
            break label454;
          }
          this.pZU = j;
        }
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.DownloadManager", "setMaxThread :%s", new Object[] { bg.f(localException) });
        w.i("MicroMsg.DownloadManager", "setMaxThread Res:%d ", new Object[] { Integer.valueOf(this.pZU) });
        GMTrace.o(8128359825408L, 60561);
        return;
      }
      Object localObject = localObject[3];
      continue;
      label451:
      label454:
      label461:
      do
      {
        break label126;
        break;
        i += 1;
        break label137;
      } while (paramInt < 1440);
      paramInt -= 1440;
    }
  }
  
  public final void Gp(String paramString)
  {
    GMTrace.i(8129165131776L, 60567);
    w.d("MicroMsg.DownloadManager", "unLockDownLoad the thread id is %s %s", new Object[] { Long.valueOf(Thread.currentThread().getId()), paramString });
    Object localObject1 = (com.tencent.mm.plugin.sns.data.c)this.qaa.get(paramString);
    com.tencent.mm.plugin.sns.data.e locale;
    g localg;
    Object localObject2;
    int i;
    if (localObject1 != null)
    {
      locale = ((com.tencent.mm.plugin.sns.data.c)localObject1).pYf;
      if (locale != null)
      {
        localg = ae.bhm();
        localObject2 = (amn)locale.fIU.get(0);
        i = 1;
        if (i >= locale.fIU.size()) {
          break label328;
        }
        localObject1 = (amn)locale.fIU.get(i);
        if ((paramString == null) || (paramString.indexOf(((amn)localObject1).nas) < 0)) {
          break label276;
        }
        localObject2 = localObject1;
      }
    }
    label276:
    label328:
    for (;;)
    {
      String str1 = am.dt(ae.getAccSnsPath(), ((amn)localObject2).nas);
      if (locale.pYl == 0) {
        localObject1 = i.f((amn)localObject2);
      }
      for (;;)
      {
        String str2 = i.ap(locale.pYl, ((amn)localObject2).nas);
        if (!localg.qak.aZ(str2)) {
          new g.b(localg, i.ap(locale.pYl, ((amn)localObject2).nas), str1 + (String)localObject1, str1, (amn)localObject2, locale.pYl).m(new String[] { "" });
        }
        this.qaa.remove(paramString);
        GMTrace.o(8129165131776L, 60567);
        return;
        i += 1;
        break;
        if (locale.pYl == 4) {
          localObject1 = i.g((amn)localObject2);
        } else if (locale.pYl == 5) {
          localObject1 = i.g((amn)localObject2);
        } else {
          localObject1 = i.e((amn)localObject2);
        }
      }
    }
  }
  
  public final void Gq(final String paramString)
  {
    GMTrace.i(8129567784960L, 60570);
    ae.aCa().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8072793686016L, 60147);
        b localb = b.this;
        String str = paramString;
        w.d("MicroMsg.DownloadManager", "onDownLoadFinish by scene %s", new Object[] { str });
        ae.bho().GB(str);
        localb.qL();
        b.this.Gp(paramString);
        GMTrace.o(8072793686016L, 60147);
      }
    });
    GMTrace.o(8129567784960L, 60570);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8129702002688L, 60571);
    w.i("MicroMsg.DownloadManager", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " type = " + paramk.getType() + " @" + hashCode());
    if (paramk.getType() != 208)
    {
      GMTrace.o(8129702002688L, 60571);
      return;
    }
    paramString = (o)paramk;
    b localb;
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      if (paramString.qbo == 2)
      {
        paramk = this.gFw.iterator();
        while (paramk.hasNext())
        {
          localb = (b)paramk.next();
          if (localb != null) {
            localb.ar(paramString.mediaId, false);
          }
        }
      }
      GMTrace.o(8129702002688L, 60571);
      return;
    }
    if (paramk.getType() == 208)
    {
      paramk = this.gFw.iterator();
      while (paramk.hasNext())
      {
        localb = (b)paramk.next();
        if (localb != null) {
          if (paramString.qbo == 3) {
            localb.bgh();
          } else if ((paramString.qbo == 1) || (paramString.qbo == 5) || (paramString.qbo == 7)) {
            localb.Gm(paramString.mediaId);
          } else if (paramString.qbo == 2) {
            localb.ar(paramString.mediaId, true);
          }
        }
      }
    }
    GMTrace.o(8129702002688L, 60571);
  }
  
  public final void a(int paramInt1, amn paramamn, int paramInt2, boolean paramBoolean, String paramString, int paramInt3)
  {
    GMTrace.i(8129433567232L, 60569);
    if (!ae.bgY())
    {
      h.xA();
      if (h.xx().wM()) {}
    }
    else
    {
      bgu();
      GMTrace.o(8129433567232L, 60569);
      return;
    }
    this.pZT += paramInt3;
    if ((this.pZT > 512000) && (this.gES.size() == 0))
    {
      w.d("MicroMsg.DownloadManager", "netSizeAdd %s", new Object[] { Integer.valueOf(this.pZT) });
      ag.a.hfs.aH(this.pZT, 0);
      this.pZT = 0;
    }
    if ((paramInt1 == 1) || (paramInt1 == 3)) {
      this.pZW.put(paramString, Long.valueOf(System.currentTimeMillis()));
    }
    Object localObject2;
    if ((paramInt1 != 3) && (paramInt1 == 1) && (paramInt2 != 3))
    {
      localObject1 = ae.bhm();
      w.d("MicroMsg.LazyerImageLoader2", "updateCache " + paramamn.nas);
      localObject2 = i.ap(1, paramamn.nas);
      localObject2 = (com.tencent.mm.memory.n)((g)localObject1).qak.get(localObject2);
      if (i.a((com.tencent.mm.memory.n)localObject2))
      {
        ((com.tencent.mm.memory.n)localObject2).ys();
        w.d("MicroMsg.LazyerImageLoader2", "force update");
        ae.bhc().post(new g.9((g)localObject1, paramamn));
      }
    }
    Object localObject1 = this.gFw.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (b)((Iterator)localObject1).next();
      if (localObject2 != null) {
        if (paramInt1 != 2)
        {
          if (paramInt2 == 3) {
            ((b)localObject2).bgh();
          } else if ((paramInt2 == 1) || (paramInt2 == 5) || (paramInt2 == 7)) {
            ((b)localObject2).Gm(paramamn.nas);
          } else if (paramInt2 == 2) {
            ((b)localObject2).ar(paramamn.nas, true);
          } else if ((paramInt2 == 4) || (paramInt2 == 6)) {
            ((b)localObject2).as(paramamn.nas, true);
          }
        }
        else if (paramInt2 == 2) {
          ((b)localObject2).ar(paramamn.nas, false);
        } else if ((paramInt2 == 4) || (paramInt2 == 6)) {
          ((b)localObject2).as(paramamn.nas, false);
        }
      }
    }
    w.d("MicroMsg.DownloadManager", "onDownLoadFinish by cdn %s", new Object[] { paramString });
    this.pZZ.remove(paramString);
    qL();
    Gp(paramString);
    GMTrace.o(8129433567232L, 60569);
  }
  
  public final void a(final b paramb)
  {
    GMTrace.i(8128762478592L, 60564);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8091449950208L, 60286);
        b localb = b.this;
        b.b localb1 = paramb;
        localb.gFw.add(localb1);
        int i = b.pZQ + 1;
        b.pZQ = i;
        if (i <= 1)
        {
          h.xA();
          h.xy().gQO.a(208, localb);
        }
        GMTrace.o(8091449950208L, 60286);
      }
    });
    GMTrace.o(8128762478592L, 60564);
  }
  
  public final boolean a(final amn paramamn, final int paramInt, final com.tencent.mm.plugin.sns.data.e parame, final an paraman)
  {
    GMTrace.i(8129030914048L, 60566);
    if (paramamn == null)
    {
      w.e("MicroMsg.DownloadManager", "unknow case media is null " + bg.bOd().toString());
      GMTrace.o(8129030914048L, 60566);
      return false;
    }
    ae.aCa().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8070377766912L, 60129);
        au.GN(paramamn.nas);
        b localb = b.this;
        Object localObject1 = paramamn;
        int i = paramInt;
        Object localObject2 = parame;
        Object localObject3 = paraman;
        if (!i.Gh(ae.zp()))
        {
          w.i("MicroMsg.DownloadManager", "isHasSdcard is false accpath %s sdcard: %s", new Object[] { ae.zp(), com.tencent.mm.compatible.util.e.gZR });
          GMTrace.o(8070377766912L, 60129);
          return;
        }
        if ((((amn)localObject1).nas.startsWith("Locall_path")) || (((amn)localObject1).nas.startsWith("pre_temp_sns_pic")))
        {
          w.d("MicroMsg.DownloadManager", "is a local img not need download");
          GMTrace.o(8070377766912L, 60129);
          return;
        }
        String str = i.aq(i, ((amn)localObject1).nas);
        if (!localb.qaa.containsKey(str))
        {
          w.d("MicroMsg.DownloadManager", "add list %s", new Object[] { ((amn)localObject1).nas });
          localb.qaa.put(str, new com.tencent.mm.plugin.sns.data.c((com.tencent.mm.plugin.sns.data.e)localObject2, i));
          localb.gES.add(new com.tencent.mm.plugin.sns.data.f((amn)localObject1, i, str, (an)localObject3));
        }
        for (;;)
        {
          w.d("MicroMsg.DownloadManager", "tryStartNetscene size %s Tsize : %s", new Object[] { Integer.valueOf(ae.bho().bgT()), Integer.valueOf(localb.pZZ.size()) });
          w.v("MicroMsg.DownloadManager", "lockwaitdownload. %s * %s memeryFiles.size() ", new Object[] { Integer.valueOf(localb.qaa.size()), Integer.valueOf(localb.qaa.size()), Integer.valueOf(localb.pZV.size()) });
          if (Looper.myLooper() != null) {
            break label414;
          }
          w.w("MicroMsg.DownloadManager", "Looper.myLooper() == null");
          GMTrace.o(8070377766912L, 60129);
          return;
          localObject2 = localb.gES.iterator();
          if (((Iterator)localObject2).hasNext())
          {
            localObject3 = (com.tencent.mm.plugin.sns.data.f)((Iterator)localObject2).next();
            if ((!((com.tencent.mm.plugin.sns.data.f)localObject3).fNf.nas.equals(((amn)localObject1).nas)) || (((com.tencent.mm.plugin.sns.data.f)localObject3).requestType != i)) {
              break;
            }
            if (localb.gES.remove(localObject3)) {
              localb.gES.addLast(localObject3);
            }
            w.v("MicroMsg.DownloadManager", "update the donwload list ");
          }
        }
        label414:
        Looper.myQueue().addIdleHandler(new b.c(localb));
        if (bg.aE(localb.pZS) * 1000L > 300000L) {}
        for (i = 1;; i = 0)
        {
          if (i != 0) {
            localb.handler.postDelayed(new b.6(localb), 500L);
          }
          localObject1 = new LinkedList();
          localObject2 = localb.pZZ.entrySet().iterator();
          while (((Iterator)localObject2).hasNext()) {
            ((List)localObject1).add(((Map.Entry)((Iterator)localObject2).next()).getKey());
          }
        }
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (String)((Iterator)localObject1).next();
          if ((localb.pZZ.containsKey(localObject2)) && (bg.aE(((Long)localb.pZZ.get(localObject2)).longValue()) * 1000L > 300000L))
          {
            w.d("MicroMsg.DownloadManager", "too long to download");
            localb.pZZ.remove(localObject2);
            localb.qaa.remove(localObject2);
          }
        }
        if (localb.gES.size() > 0) {
          localb.handler.postDelayed(new b.4(localb), 500L);
        }
        GMTrace.o(8070377766912L, 60129);
      }
    });
    GMTrace.o(8129030914048L, 60566);
    return true;
  }
  
  public final void b(final b paramb)
  {
    GMTrace.i(8128896696320L, 60565);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8150371532800L, 60725);
        b localb = b.this;
        b.b localb1 = paramb;
        localb.gFw.remove(localb1);
        int i = b.pZQ - 1;
        b.pZQ = i;
        if (i <= 0)
        {
          h.xA();
          h.xy().gQO.b(208, localb);
        }
        GMTrace.o(8150371532800L, 60725);
      }
    });
    GMTrace.o(8128896696320L, 60565);
  }
  
  public final boolean bgv()
  {
    GMTrace.i(16041837068288L, 119521);
    if ((this.pZV != null) && (this.pZV.size() > 0))
    {
      com.tencent.mm.plugin.sns.data.g localg = (com.tencent.mm.plugin.sns.data.g)this.pZV.remove();
      new ar().m(new com.tencent.mm.plugin.sns.data.g[] { localg });
      GMTrace.o(16041837068288L, 119521);
      return true;
    }
    GMTrace.o(16041837068288L, 119521);
    return false;
  }
  
  public final void qL()
  {
    GMTrace.i(8129299349504L, 60568);
    if (!this.pZX)
    {
      GMTrace.o(8129299349504L, 60568);
      return;
    }
    if (ae.bgY())
    {
      bgu();
      GMTrace.o(8129299349504L, 60568);
      return;
    }
    if (!i.Gh(ae.zp()))
    {
      GMTrace.o(8129299349504L, 60568);
      return;
    }
    int i = this.pZU;
    if (r.ibT > 0) {
      i = r.ibT;
    }
    com.tencent.mm.plugin.sns.data.f localf;
    amn localamn;
    int k;
    String str;
    com.tencent.mm.plugin.sns.data.e locale;
    boolean bool;
    Object localObject2;
    Object localObject1;
    if ((this.gES.size() > 0) && (ae.bho().bgT() + this.pZZ.size() <= i))
    {
      w.d("MicroMsg.DownloadManager", "tryStartNetscene size %s Tsize : %s listsize %s max_thread_downloading: %s", new Object[] { Integer.valueOf(ae.bho().bgT()), Integer.valueOf(this.pZZ.size()), Integer.valueOf(this.gES.size()), Integer.valueOf(this.pZU) });
      localf = (com.tencent.mm.plugin.sns.data.f)this.gES.removeLast();
      localamn = localf.fNf;
      k = localf.requestType;
      str = localf.amo;
      if ((!this.qaa.containsKey(str)) || (this.qaa.get(str) == null))
      {
        this.qaa.remove(str);
        GMTrace.o(8129299349504L, 60568);
        return;
      }
      locale = ((com.tencent.mm.plugin.sns.data.c)this.qaa.get(str)).pYf;
      if ((k == 1) || (k == 5) || (k == 7))
      {
        bool = true;
        localObject2 = localamn.uhA;
        localObject1 = localObject2;
        if (k == 7)
        {
          localObject1 = localObject2;
          if (!bg.mZ(localamn.uhK)) {
            localObject1 = localamn.uhK;
          }
        }
        i = localamn.uhB;
        if ((!bg.mZ((String)localObject1)) || (localamn.jXP != 2)) {
          break label1161;
        }
        localObject1 = localamn.mDo;
        i = localamn.uhz;
      }
    }
    label483:
    label1045:
    label1161:
    for (;;)
    {
      if ((localObject1 == null) || (((String)localObject1).equals(""))) {
        w.d("MicroMsg.DownloadManager", "url  " + (String)localObject1);
      }
      for (int j = 0;; j = 1)
      {
        if (j != 0) {
          break label483;
        }
        this.qaa.remove(str);
        GMTrace.o(8129299349504L, 60568);
        return;
        if (k == 6)
        {
          bool = false;
          localObject1 = localamn.uhH;
          i = localamn.uhz;
          break;
        }
        bool = false;
        localObject1 = localamn.mDo;
        i = localamn.uhz;
        break;
      }
      if (i == 2)
      {
        if (!ae.bho().isDownloading(str))
        {
          w.d("MicroMsg.DownloadManager", "to downLoad scene " + localamn.nas + "  " + (String)localObject1);
          h.xA();
          h.xy().gQO.a(new o(localamn, localamn.nas, (String)localObject1, localamn.jXP, bool, k, str), 0);
          ae.bho().GA(str);
          GMTrace.o(8129299349504L, 60568);
        }
      }
      else if ((i == 1) || (i == 0))
      {
        if (i == 0) {
          w.e("MicroMsg.DownloadManager", "others http: urlType" + i + " -- url : " + (String)localObject1 + " isThumb :" + bool);
        }
        if (!this.pZZ.containsKey(str))
        {
          w.d("MicroMsg.DownloadManager", "to downLoad cdn " + localamn.nas + "  " + (String)localObject1);
          if ((localamn != null) && (k != 6) && (this.pZW.containsKey(str)))
          {
            long l = ((Long)this.pZW.get(str)).longValue();
            if (System.currentTimeMillis() - l < 300000L)
            {
              this.qaa.remove(str);
              w.w("MicroMsg.DownloadManager", "download error pass " + l + " url " + (String)localObject1 + " id: " + localamn.nas);
              GMTrace.o(8129299349504L, 60568);
              return;
            }
          }
          this.pZZ.put(str, Long.valueOf(bg.Po()));
          if (k == 2)
          {
            h.xA();
            i = bg.a((Integer)h.xz().xi().get(68391, null), 0);
            h.xA();
            h.xz().xi().set(68391, Integer.valueOf(i + 1));
          }
          localObject2 = new com.tencent.mm.plugin.sns.model.a.a(localamn.nas);
          ((com.tencent.mm.plugin.sns.model.a.a)localObject2).qbr = localamn;
          ((com.tencent.mm.plugin.sns.model.a.a)localObject2).qfT = localf.pYm;
          if (k == 4)
          {
            ((com.tencent.mm.plugin.sns.model.a.a)localObject2).qfR = true;
            ((com.tencent.mm.plugin.sns.model.a.a)localObject2).url = ((String)localObject1);
            i = localamn.jXP;
            ((com.tencent.mm.plugin.sns.model.a.a)localObject2).qfQ = bool;
            ((com.tencent.mm.plugin.sns.model.a.a)localObject2).qfS = k;
            ((com.tencent.mm.plugin.sns.model.a.a)localObject2).qbq = str;
            ((com.tencent.mm.plugin.sns.model.a.a)localObject2).pYf = locale;
            localObject1 = null;
            if ((k != 1) && (k != 5) && (k != 7)) {
              break label1045;
            }
            localObject1 = new com.tencent.mm.plugin.sns.model.a.g(this, (com.tencent.mm.plugin.sns.model.a.a)localObject2);
          }
          for (;;)
          {
            ((com.tencent.mm.plugin.sns.model.a.b)localObject1).m(new String[] { "" });
            GMTrace.o(8129299349504L, 60568);
            return;
            ((com.tencent.mm.plugin.sns.model.a.a)localObject2).qfR = false;
            break;
            if (k == 4)
            {
              w.w("MicroMsg.DownloadManager", "it can not download sight, may be something warn here.");
              localObject1 = new com.tencent.mm.plugin.sns.model.a.f(this, (com.tencent.mm.plugin.sns.model.a.a)localObject2);
            }
            else if ((k == 2) || (k == 3))
            {
              localObject1 = new d(this, (com.tencent.mm.plugin.sns.model.a.a)localObject2);
            }
            else if (k == 6)
            {
              ((com.tencent.mm.plugin.sns.model.a.a)localObject2).url = localamn.uhH;
              ((com.tencent.mm.plugin.sns.model.a.a)localObject2).fwU = localamn.uhJ;
              localObject1 = new com.tencent.mm.plugin.sns.model.a.c(this, (com.tencent.mm.plugin.sns.model.a.a)localObject2);
            }
          }
        }
      }
      else
      {
        this.qaa.remove(str);
      }
      GMTrace.o(8129299349504L, 60568);
      return;
    }
  }
  
  public static abstract interface a
  {
    public abstract void dq(String paramString1, String paramString2);
  }
  
  public static abstract interface b
  {
    public abstract void Gm(String paramString);
    
    public abstract void ar(String paramString, boolean paramBoolean);
    
    public abstract void as(String paramString, boolean paramBoolean);
    
    public abstract void bgh();
  }
  
  final class c
    implements MessageQueue.IdleHandler
  {
    c()
    {
      GMTrace.i(8091047297024L, 60283);
      GMTrace.o(8091047297024L, 60283);
    }
    
    public final boolean queueIdle()
    {
      GMTrace.i(8091181514752L, 60284);
      w.d("MicroMsg.DownloadManager", "I run idleHandler ");
      b.this.pZS = bg.Po();
      boolean bool = b.this.bgv();
      GMTrace.o(8091181514752L, 60284);
      return bool;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */