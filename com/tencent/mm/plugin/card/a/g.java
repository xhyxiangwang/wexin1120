package com.tencent.mm.plugin.card.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.card.b.q;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.ae;
import com.tencent.mm.plugin.card.model.ah;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.model.g.c;
import com.tencent.mm.plugin.card.model.i;
import com.tencent.mm.plugin.card.model.j;
import com.tencent.mm.protocal.c.aqh;
import com.tencent.mm.protocal.c.aud;
import com.tencent.mm.protocal.c.aue;
import com.tencent.mm.protocal.c.jf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class g
  implements com.tencent.mm.ac.e
{
  public com.tencent.mm.plugin.card.b.c kmQ;
  public int kmR;
  public aj kmS;
  public List<WeakReference<a>> kmu;
  
  public g()
  {
    GMTrace.i(18901614198784L, 140828);
    this.kmu = new ArrayList();
    this.kmS = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(18900943110144L, 140823);
        w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "onTimerExpired, do refresh code!");
        g localg = g.this;
        w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "onShowTimeExpired()");
        if (localg.kmu != null)
        {
          int i = 0;
          while (i < localg.kmu.size())
          {
            Object localObject = (WeakReference)localg.kmu.get(i);
            if (localObject != null)
            {
              localObject = (g.a)((WeakReference)localObject).get();
              if (localObject != null) {
                ((g.a)localObject).ajk();
              }
            }
            i += 1;
          }
        }
        GMTrace.o(18900943110144L, 140823);
        return true;
      }
    }, false);
    GMTrace.o(18901614198784L, 140828);
  }
  
  private void D(LinkedList<aqh> paramLinkedList)
  {
    GMTrace.i(18903090593792L, 140839);
    ap.wT().a(1275, this);
    paramLinkedList = new ah(paramLinkedList);
    ap.wT().a(paramLinkedList, 0);
    GMTrace.o(18903090593792L, 140839);
  }
  
  private void a(com.tencent.mm.plugin.card.b.c paramc)
  {
    GMTrace.i(18903761682432L, 140844);
    w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "onSuccess()");
    if (this.kmu == null)
    {
      GMTrace.o(18903761682432L, 140844);
      return;
    }
    int i = 0;
    while (i < this.kmu.size())
    {
      Object localObject = (WeakReference)this.kmu.get(i);
      if (localObject != null)
      {
        localObject = (a)((WeakReference)localObject).get();
        if (localObject != null) {
          ((a)localObject).c(paramc);
        }
      }
      i += 1;
    }
    GMTrace.o(18903761682432L, 140844);
  }
  
  private void a(aue paramaue)
  {
    GMTrace.i(18903359029248L, 140841);
    if (paramaue == null)
    {
      GMTrace.o(18903359029248L, 140841);
      return;
    }
    String str = paramaue.fMv;
    Object localObject;
    if (al.ajR().tC(str) == null)
    {
      localObject = b(paramaue);
      al.ajR().b((com.tencent.mm.sdk.e.c)localObject);
    }
    for (;;)
    {
      localObject = al.ajQ().tD(str);
      if ((!((List)localObject).isEmpty()) && (al.ajQ().hl(str)) && (this.kmQ != null)) {
        a(str, (List)localObject, this.kmQ);
      }
      paramaue = paramaue.upF.iterator();
      while (paramaue.hasNext())
      {
        localObject = (aud)paramaue.next();
        com.tencent.mm.plugin.card.model.k localk = new com.tencent.mm.plugin.card.model.k();
        localk.field_card_id = str;
        localk.field_code_id = ((aud)localObject).kpf;
        localk.field_code = com.tencent.mm.plugin.card.b.e.bC(str, ((aud)localObject).data);
        al.ajQ().b(localk);
      }
      localObject = b(paramaue);
      al.ajR().c((com.tencent.mm.sdk.e.c)localObject, new String[0]);
    }
    GMTrace.o(18903359029248L, 140841);
  }
  
  private void a(String paramString, q paramq)
  {
    GMTrace.i(18902687940608L, 140836);
    Object localObject = new StringBuilder("doNetSceneGetDynamicQrcode, cardId:").append(paramString).append(",scene :");
    if (paramq == null)
    {
      i = 0;
      w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", i);
      localObject = new LinkedList();
      ((LinkedList)localObject).add(paramString);
      if (paramq != null) {
        break label117;
      }
    }
    label117:
    for (int i = 0;; i = paramq.scene)
    {
      paramString = new ae((LinkedList)localObject, i);
      ap.wT().a(1382, this);
      ap.wT().a(paramString, 0);
      GMTrace.o(18902687940608L, 140836);
      return;
      i = paramq.scene;
      break;
    }
  }
  
  private void a(String paramString, List<com.tencent.mm.plugin.card.model.k> paramList, com.tencent.mm.plugin.card.b.c paramc)
  {
    GMTrace.i(18902822158336L, 140837);
    if (paramc == null)
    {
      w.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doNetSceneReport error! CardCodeRefreshAction is null! cannot report!");
      GMTrace.o(18902822158336L, 140837);
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localLinkedList.add(b(paramString, ((com.tencent.mm.plugin.card.model.k)paramList.next()).field_code_id, paramc));
    }
    D(localLinkedList);
    GMTrace.o(18902822158336L, 140837);
  }
  
  public static boolean a(i parami)
  {
    GMTrace.i(18902285287424L, 140833);
    if (System.currentTimeMillis() - parami.field_fetch_time > parami.field_expire_time_interval * 1000)
    {
      w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "code  expire time is true! currentTime= %s,codeFetchTime=%s,field_expire_time_interval=%s", new Object[] { Long.valueOf(System.currentTimeMillis()), Long.valueOf(parami.field_fetch_time), Integer.valueOf(parami.field_expire_time_interval) });
      GMTrace.o(18902285287424L, 140833);
      return true;
    }
    GMTrace.o(18902285287424L, 140833);
    return false;
  }
  
  private static i b(aue paramaue)
  {
    GMTrace.i(18903493246976L, 140842);
    i locali = new i();
    locali.field_card_id = paramaue.fMv;
    locali.field_lower_bound = paramaue.upA;
    locali.field_expire_time_interval = paramaue.upD;
    locali.field_need_insert_show_timestamp = paramaue.upB;
    locali.field_show_expire_interval = paramaue.upE;
    locali.field_show_timestamp_encrypt_key = paramaue.upC;
    locali.field_fetch_time = System.currentTimeMillis();
    GMTrace.o(18903493246976L, 140842);
    return locali;
  }
  
  private static aqh b(String paramString1, String paramString2, com.tencent.mm.plugin.card.b.c paramc)
  {
    GMTrace.i(18903224811520L, 140840);
    aqh localaqh = new aqh();
    localaqh.fMv = paramString1;
    localaqh.kpf = paramString2;
    localaqh.umy = new Long(System.currentTimeMillis() / 1000L).intValue();
    if (paramc == null) {}
    for (int i = -1;; i = paramc.action)
    {
      localaqh.umz = i;
      GMTrace.o(18903224811520L, 140840);
      return localaqh;
    }
  }
  
  private void b(com.tencent.mm.plugin.card.b.c paramc)
  {
    GMTrace.i(18904030117888L, 140846);
    w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "onReceiveCodeUnavailable()");
    if (this.kmu == null)
    {
      GMTrace.o(18904030117888L, 140846);
      return;
    }
    int i = 0;
    while (i < this.kmu.size())
    {
      Object localObject = (WeakReference)this.kmu.get(i);
      if (localObject != null)
      {
        localObject = (a)((WeakReference)localObject).get();
        if (localObject != null) {
          ((a)localObject).b(paramc);
        }
      }
      i += 1;
    }
    GMTrace.o(18904030117888L, 140846);
  }
  
  private static boolean g(b paramb)
  {
    GMTrace.i(18902553722880L, 140835);
    if (paramb == null)
    {
      GMTrace.o(18902553722880L, 140835);
      return false;
    }
    if ((paramb.aiL() != null) && (paramb.aiL().tEI))
    {
      GMTrace.o(18902553722880L, 140835);
      return true;
    }
    w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "get cardInfo is_commom_card is false!");
    GMTrace.o(18902553722880L, 140835);
    return false;
  }
  
  public final void F(int paramInt, String paramString)
  {
    GMTrace.i(18903895900160L, 140845);
    w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "onFail()");
    if (this.kmu == null)
    {
      GMTrace.o(18903895900160L, 140845);
      return;
    }
    int i = 0;
    while (i < this.kmu.size())
    {
      Object localObject = (WeakReference)this.kmu.get(i);
      if (localObject != null)
      {
        localObject = (a)((WeakReference)localObject).get();
        if (localObject != null) {
          ((a)localObject).G(paramInt, paramString);
        }
      }
      i += 1;
    }
    GMTrace.o(18903895900160L, 140845);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(18903627464704L, 140843);
    StringBuilder localStringBuilder = new StringBuilder("onSceneEnd, errType = ").append(paramInt1).append(" errCode = ").append(paramInt2).append(",NetSceneBase=");
    if (paramk != null) {}
    for (Object localObject = paramk.getClass();; localObject = "")
    {
      w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", localObject);
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label176;
      }
      if (!(paramk instanceof ae)) {
        break label156;
      }
      paramString = ((ae)paramk).kpH;
      if (paramString != null) {
        break;
      }
      w.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "onSceneEnd, resp  qr_code_item_list is null ");
      GMTrace.o(18903627464704L, 140843);
      return;
    }
    a(paramString);
    a(this.kmQ);
    ap.wT().b(1382, this);
    GMTrace.o(18903627464704L, 140843);
    return;
    label156:
    ap.wT().b(1275, this);
    GMTrace.o(18903627464704L, 140843);
    return;
    label176:
    localObject = new StringBuilder("onSceneEnd, errType = ").append(paramInt1).append(" errCode = ").append(paramInt2).append(" cmd:");
    if (paramk != null)
    {
      paramInt1 = paramk.getType();
      localStringBuilder = ((StringBuilder)localObject).append(paramInt1).append("  NetSceneBase=");
      if (paramk == null) {
        break label299;
      }
    }
    label299:
    for (localObject = paramk.getClass();; localObject = "")
    {
      w.e("MicroMsg.CardDynamicQrcodeOfflineMgr", localObject);
      if (!(paramk instanceof ae)) {
        break label307;
      }
      F(paramInt2, paramString);
      ap.wT().b(1382, this);
      GMTrace.o(18903627464704L, 140843);
      return;
      paramInt1 = 0;
      break;
    }
    label307:
    ap.wT().b(1275, this);
    GMTrace.o(18903627464704L, 140843);
  }
  
  public final void a(q paramq)
  {
    GMTrace.i(18902016851968L, 140831);
    w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "doUpdateOfflineQrcodeByDynaimicCard! fromScene=%d", new Object[] { Integer.valueOf(paramq.scene) });
    Object localObject1 = al.ajC().ajr();
    if (((List)localObject1).isEmpty())
    {
      w.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doUpdateOfflineQrcodeByDynaimicCard do update all offileQrcode is failure! is dynamic cardList is empyt!fromScene=%d", new Object[] { Integer.valueOf(paramq.scene) });
      GMTrace.o(18902016851968L, 140831);
      return;
    }
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      CardInfo localCardInfo = (CardInfo)((Iterator)localObject1).next();
      if (localCardInfo == null)
      {
        w.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doUpdateOfflineQrcodeByDynaimicCard  is failure! cardInfo is null fromScene=%d", new Object[] { Integer.valueOf(paramq.scene) });
      }
      else if (paramq == null)
      {
        w.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doUpdateOfflineQrcodeByDynaimicCard  is failure! fromScene is null!");
      }
      else
      {
        w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "doUpdateOfflineQrcodeByDynaimicCard  get dynamic code! cardId= %s,fromScene=%d", new Object[] { localCardInfo.aiO(), Integer.valueOf(paramq.scene) });
        if (!g(localCardInfo))
        {
          w.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "cannot  get qrCode ! cardId =%s", new Object[] { localCardInfo.aiO() });
        }
        else
        {
          Object localObject2 = localCardInfo.aiO();
          i locali = al.ajR().tC((String)localObject2);
          int i;
          if (locali == null) {
            i = 1;
          }
          for (;;)
          {
            if (i != 0) {
              break label358;
            }
            w.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "do not need  get qrCode!  cardId =%s,fromScene=%d", new Object[] { localCardInfo.aiO(), Integer.valueOf(paramq.scene) });
            break;
            localObject2 = al.ajQ().tD((String)localObject2);
            if (((List)localObject2).isEmpty())
            {
              i = 1;
            }
            else if (((List)localObject2).size() < locali.field_lower_bound)
            {
              this.kmQ = com.tencent.mm.plugin.card.b.c.kAI;
              i = 1;
            }
            else if (a(locali))
            {
              this.kmQ = com.tencent.mm.plugin.card.b.c.kAC;
              i = 1;
            }
            else
            {
              i = 0;
            }
          }
          label358:
          w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "doUpdateOfflineQrcodeByDynaimicCard doNetSceneGetDynamicQrcode! fromScene=%d", new Object[] { Integer.valueOf(paramq.scene) });
          a(localCardInfo.aiO(), paramq);
        }
      }
    }
    GMTrace.o(18902016851968L, 140831);
  }
  
  public final void a(b paramb, q paramq)
  {
    GMTrace.i(18901882634240L, 140830);
    if (!g(paramb))
    {
      w.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "cannot  get qrCode !");
      F(2, "");
      GMTrace.o(18901882634240L, 140830);
      return;
    }
    if (!com.tencent.mm.plugin.card.b.l.isNetworkAvailable(ab.getContext()))
    {
      w.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "isNetworkAvailable false cannot connet network!");
      F(-1, "");
      GMTrace.o(18901882634240L, 140830);
      return;
    }
    if (this.kmR >= 3)
    {
      w.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doRequestNetSceneGetDynamicQrcode is  limit requestcount:" + this.kmR + ",cannot request!");
      GMTrace.o(18901882634240L, 140830);
      return;
    }
    a(paramb.aiO(), paramq);
    this.kmR += 1;
    GMTrace.o(18901882634240L, 140830);
  }
  
  public final void a(String paramString1, String paramString2, com.tencent.mm.plugin.card.b.c paramc)
  {
    GMTrace.i(18902956376064L, 140838);
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(b(paramString1, paramString2, paramc));
    w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "doNetSceneReport, operate_list=%d,refreshAction=%d", new Object[] { Integer.valueOf(localLinkedList.size()), Integer.valueOf(paramc.action) });
    D(localLinkedList);
    GMTrace.o(18902956376064L, 140838);
  }
  
  public final void ajb()
  {
    GMTrace.i(18902419505152L, 140834);
    w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "stopRefreshCodeTimer!");
    if (!this.kmS.bNt()) {
      this.kmS.MM();
    }
    GMTrace.o(18902419505152L, 140834);
  }
  
  public final void b(com.tencent.mm.plugin.card.model.g paramg)
  {
    GMTrace.i(18902151069696L, 140832);
    String str = paramg.field_card_id;
    Object localObject1 = al.ajQ();
    if (paramg.koW)
    {
      paramg = al.ajQ().tD(str);
      localObject2 = ((com.tencent.mm.plugin.card.model.l)localObject1).tF(str);
      w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "get msg allUnavailable is true! delete all card code data by card_id=%s", new Object[] { str });
      if (((com.tencent.mm.plugin.card.model.l)localObject1).hl(str))
      {
        if (localObject2 != null)
        {
          w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "code is showing card_id= %s,notify ui to refresh!", new Object[] { str });
          b(com.tencent.mm.plugin.card.b.c.kAH);
        }
        a(str, paramg, com.tencent.mm.plugin.card.b.c.kAH);
      }
      GMTrace.o(18902151069696L, 140832);
      return;
    }
    Object localObject2 = paramg.koX;
    if (localObject2 == null)
    {
      w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "get msg allUnavailable is false! unavailableQrCodeList is empty, do nothing! card_id=%s", new Object[] { str });
      GMTrace.o(18902151069696L, 140832);
      return;
    }
    w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "get msg allUnavailable is false! delete card code data by unavailableQrCodeList, card_id=%s，unavailableQrCodeList size= %d", new Object[] { str, Integer.valueOf(((List)localObject2).size()) });
    paramg = ((com.tencent.mm.plugin.card.model.l)localObject1).tF(str);
    localObject1 = new LinkedList();
    localObject2 = ((List)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      g.c localc = (g.c)((Iterator)localObject2).next();
      if (al.ajQ().bv(str, localc.kpf)) {
        ((LinkedList)localObject1).add(b(str, localc.kpf, com.tencent.mm.plugin.card.b.c.kAH));
      }
    }
    if (paramg != null)
    {
      w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "code is showing card_id= %s,code_id= %s, notify ui to refresh!", new Object[] { str, paramg.field_code_id });
      b(com.tencent.mm.plugin.card.b.c.kAH);
    }
    if (!((LinkedList)localObject1).isEmpty()) {
      D((LinkedList)localObject1);
    }
    GMTrace.o(18902151069696L, 140832);
  }
  
  public final void release()
  {
    GMTrace.i(18901748416512L, 140829);
    this.kmR = 0;
    ajb();
    w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "removeNetSceneListener!");
    ap.wT().b(1382, this);
    ap.wT().b(1275, this);
    GMTrace.o(18901748416512L, 140829);
  }
  
  public static abstract interface a
  {
    public abstract void G(int paramInt, String paramString);
    
    public abstract void ajk();
    
    public abstract void b(com.tencent.mm.plugin.card.b.c paramc);
    
    public abstract void c(com.tencent.mm.plugin.card.b.c paramc);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */