package com.tencent.mm.plugin.offline;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.offline.a.d;
import com.tencent.mm.plugin.offline.a.q;
import com.tencent.mm.plugin.offline.a.r;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.HashSet;
import java.util.Map;

public final class g
{
  public static String TAG;
  public static int omA;
  public static int omB;
  public static int omC;
  public static int omD;
  public static int omE;
  public static int omF;
  public static int omG;
  public static int omH;
  public static int omI;
  public static int omJ;
  public static int omv;
  private static int omw;
  public static int omx;
  public static int omy;
  public static int omz;
  public com.tencent.mm.ac.e omK;
  public boolean omL;
  public aj omM;
  public int status;
  
  static
  {
    GMTrace.i(15387525644288L, 114646);
    TAG = "MicroMsg.OfflineGetMsgLogic";
    omv = 5000;
    omw = 30000;
    omx = 5000;
    omy = 0;
    omz = 24;
    omA = 4;
    omB = 8;
    omC = 23;
    omD = 6;
    omE = 5;
    omF = 20;
    omG = 20000;
    omH = 20001;
    omI = 10001;
    omJ = omx;
    ap.AS();
    Object localObject = c.xi().get(w.a.vcm, null);
    int i;
    if (localObject != null)
    {
      i = ((Integer)localObject).intValue();
      omJ = i;
      if (i == 0) {
        omJ = omx;
      }
    }
    ap.AS();
    localObject = c.xi().get(w.a.vco, Integer.valueOf(0));
    if (localObject != null)
    {
      i = ((Integer)localObject).intValue();
      if (i != 0) {
        omw = i;
      }
    }
    GMTrace.o(15387525644288L, 114646);
  }
  
  public g()
  {
    GMTrace.i(15385646596096L, 114632);
    this.status = 0;
    this.omK = new com.tencent.mm.ac.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.k paramAnonymousk)
      {
        GMTrace.i(15385378160640L, 114630);
        if (((paramAnonymousk instanceof d)) && (paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
        {
          paramAnonymousk = (d)paramAnonymousk;
          paramAnonymousInt1 = paramAnonymousk.onu;
          g.omJ = paramAnonymousInt1;
          if (paramAnonymousInt1 == 0) {
            g.omJ = g.omx;
          }
          w.i(g.TAG, "NetSceneOfflineGetMsg: ackkey: %s, appMsg: %s", new Object[] { paramAnonymousk.onv, paramAnonymousk.ont });
          if ((bg.mZ(paramAnonymousk.ont)) || (bg.mZ(paramAnonymousk.onv))) {
            break label251;
          }
          if (g.da(paramAnonymousk.onv, paramAnonymousk.ont))
          {
            w.i(g.TAG, "from cgi");
            if (bh.p(paramAnonymousk.ont, "sysmsg") == null)
            {
              GMTrace.o(15385378160640L, 114630);
              return;
            }
            com.tencent.mm.plugin.report.service.g.paX.a(135L, 71L, 1L, true);
            k.aTF();
            paramAnonymousString = k.aTG();
            paramAnonymousk = paramAnonymousk.ont;
            w.i("MicroMsg.WalletOfflineMsgManager", "notifyMsgFromCgi");
            paramAnonymousString.Dp(paramAnonymousk);
            paramAnonymousString.ag(paramAnonymousk, true);
          }
        }
        for (;;)
        {
          w.i(g.TAG, "mIntercal=" + g.omJ);
          paramAnonymousString = g.this.omM;
          long l = g.omJ;
          paramAnonymousString.w(l, l);
          GMTrace.o(15385378160640L, 114630);
          return;
          label251:
          w.i(g.TAG, "OfflineGetMsgLogic msg is null");
        }
      }
    };
    this.omL = true;
    this.omM = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(15384170201088L, 114621);
        if (g.this.omM != null)
        {
          if (!ap.AV())
          {
            aj localaj = g.this.omM;
            long l = g.omv;
            localaj.w(l, l);
            GMTrace.o(15384170201088L, 114621);
            return false;
          }
          if ((com.tencent.mm.plugin.offline.c.a.aUR()) && (com.tencent.mm.plugin.offline.c.a.aUp())) {
            g.aTB();
          }
        }
        GMTrace.o(15384170201088L, 114621);
        return false;
      }
    }, false);
    ap.wT().a(385, this.omK);
    GMTrace.o(15385646596096L, 114632);
  }
  
  private static boolean a(q paramq)
  {
    boolean bool = false;
    GMTrace.i(19264270499840L, 143530);
    if (paramq != null) {
      w.i(TAG, "isOrderClosed lastest status req_key=" + paramq.field_reqkey);
    }
    Object localObject = new HashSet();
    ((HashSet)localObject).add(Integer.valueOf(omG));
    ((HashSet)localObject).add(Integer.valueOf(omD));
    ((HashSet)localObject).add(Integer.valueOf(omE));
    ((HashSet)localObject).add(Integer.valueOf(omA));
    ((HashSet)localObject).add(Integer.valueOf(-1));
    if ((paramq == null) || (((HashSet)localObject).contains(Integer.valueOf(paramq.field_status))))
    {
      localObject = TAG;
      StringBuilder localStringBuilder = new StringBuilder("isOrderClosed true;status==null?");
      if (paramq == null) {
        bool = true;
      }
      w.i((String)localObject, bool);
      if (paramq != null) {
        w.i(TAG, "isOrderClosed status.field_status=" + paramq.field_status);
      }
      GMTrace.o(19264270499840L, 143530);
      return true;
    }
    w.i(TAG, "isOrderClosed false");
    if (paramq != null) {
      w.i(TAG, "status=" + paramq.field_status + ";req_key=" + paramq.field_reqkey);
    }
    for (;;)
    {
      GMTrace.o(19264270499840L, 143530);
      return false;
      w.i(TAG, "isOrderClosed status=null");
    }
  }
  
  private static boolean a(q paramq, int paramInt)
  {
    GMTrace.i(15386049249280L, 114635);
    int i = paramInt;
    if (paramInt == omA) {
      i = omG;
    }
    boolean bool = cD(paramq.field_status, i);
    w.i(TAG, "in changeStatus: isallow=%b; old status = %d; new status = %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramq.field_status), Integer.valueOf(i) });
    if (bool)
    {
      paramq.field_status = i;
      k.aTF();
      k.aTJ().b(paramq);
    }
    GMTrace.o(15386049249280L, 114635);
    return bool;
  }
  
  public static int aTA()
  {
    GMTrace.i(15385512378368L, 114631);
    int i = omw;
    GMTrace.o(15385512378368L, 114631);
    return i;
  }
  
  public static void aTB()
  {
    GMTrace.i(16031233867776L, 119442);
    w.i(TAG, "doGetOfflineMsg doScene:NetSceneOfflineGetMsg");
    d locald = new d();
    ap.wT().a(locald, 0);
    GMTrace.o(16031233867776L, 119442);
  }
  
  public static void aTC()
  {
    GMTrace.i(15386317684736L, 114637);
    w.i(TAG, "endAllOldOrder");
    k.aTF();
    com.tencent.mm.plugin.offline.b.a locala = k.aTJ();
    w.i("MicroMsg.OfflineOrderStatusStorage", "end all orders to final status. orders count: %d, latest 3 orders: %s", new Object[] { Integer.valueOf(locala.aTP()), locala.aTO() });
    Object localObject = String.format("SELECT %s FROM %s ORDER BY %s DESC LIMIT 1;", new Object[] { "rowid", "OfflineOrderStatus", "rowid" });
    localObject = locala.gMB.a((String)localObject, null, 2);
    long l2 = 0L;
    long l1;
    if (localObject == null)
    {
      w.e("MicroMsg.OfflineOrderStatusStorage", "removeOlderOrders: error. cursor is null \n");
      l1 = l2;
      if (l1 - 10L <= 0L) {
        break label319;
      }
      localObject = String.format("DELETE FROM %s WHERE %s < %d;", new Object[] { "OfflineOrderStatus", "rowid", Long.valueOf(l1 - 10L) });
      w.i("MicroMsg.OfflineOrderStatusStorage", "removeOlderOrders. latestRowId is %d. sql: %s", new Object[] { Long.valueOf(l1), localObject });
      locala.gMB.eL("OfflineOrderStatus", (String)localObject);
    }
    for (;;)
    {
      localObject = "UPDATE OfflineOrderStatus SET status=" + omG + " where status!=" + omG;
      locala.gMB.eL("OfflineOrderStatus", (String)localObject);
      GMTrace.o(15386317684736L, 114637);
      return;
      ((Cursor)localObject).moveToFirst();
      l1 = l2;
      if (!((Cursor)localObject).isAfterLast())
      {
        l1 = l2;
        if (((Cursor)localObject).getColumnCount() > 0) {
          l1 = ((Cursor)localObject).getLong(0);
        }
      }
      ((Cursor)localObject).close();
      break;
      label319:
      w.i("MicroMsg.OfflineOrderStatusStorage", "removeOlderOrders. latestRowId is %d. do nothing", new Object[] { Long.valueOf(l1) });
    }
  }
  
  public static void bB(String paramString, int paramInt)
  {
    GMTrace.i(15386183467008L, 114636);
    if (!bg.mZ(paramString))
    {
      k.aTF();
      q localq = k.aTJ().Dq(paramString);
      if (localq != null)
      {
        a(localq, paramInt);
        GMTrace.o(15386183467008L, 114636);
        return;
      }
      localq = new q();
      localq.field_reqkey = paramString;
      localq.field_status = paramInt;
      k.aTF();
      k.aTJ().b(localq);
    }
    GMTrace.o(15386183467008L, 114636);
  }
  
  private static boolean cD(int paramInt1, int paramInt2)
  {
    GMTrace.i(15385915031552L, 114634);
    w.i(TAG, "checkStatus from=" + paramInt1 + ";to=" + paramInt2);
    if (paramInt1 == paramInt2)
    {
      GMTrace.o(15385915031552L, 114634);
      return false;
    }
    if (paramInt1 == omy)
    {
      GMTrace.o(15385915031552L, 114634);
      return true;
    }
    if (paramInt1 == omz)
    {
      if (paramInt2 != omz)
      {
        GMTrace.o(15385915031552L, 114634);
        return true;
      }
      GMTrace.o(15385915031552L, 114634);
      return false;
    }
    if (paramInt1 == omD)
    {
      if (paramInt2 == omG)
      {
        GMTrace.o(15385915031552L, 114634);
        return true;
      }
      GMTrace.o(15385915031552L, 114634);
      return false;
    }
    if (paramInt1 == omE)
    {
      if (paramInt2 == omG)
      {
        GMTrace.o(15385915031552L, 114634);
        return true;
      }
      GMTrace.o(15385915031552L, 114634);
      return false;
    }
    if (paramInt1 == omF)
    {
      if (paramInt2 == omG)
      {
        GMTrace.o(15385915031552L, 114634);
        return true;
      }
      GMTrace.o(15385915031552L, 114634);
      return false;
    }
    if ((paramInt1 == omB) || (paramInt1 == omC))
    {
      if ((paramInt2 == omD) || (paramInt2 == omG))
      {
        GMTrace.o(15385915031552L, 114634);
        return true;
      }
      GMTrace.o(15385915031552L, 114634);
      return false;
    }
    if (paramInt1 == omI)
    {
      if ((paramInt2 == omD) || (paramInt2 == omG))
      {
        GMTrace.o(15385915031552L, 114634);
        return true;
      }
      GMTrace.o(15385915031552L, 114634);
      return false;
    }
    GMTrace.o(15385915031552L, 114634);
    return false;
  }
  
  public static boolean da(String paramString1, String paramString2)
  {
    GMTrace.i(15385780813824L, 114633);
    int i;
    Object localObject1;
    if (bg.mZ(paramString2))
    {
      w.i(TAG, "shouldDeal appmsg is null");
      i = 0;
      if (i == 0) {
        break label1172;
      }
      k.aTF();
      localObject1 = k.aTJ().aTN();
      paramString2 = bh.p(paramString2, "sysmsg");
      i = bg.getInt((String)paramString2.get(".sysmsg.paymsg.PayMsgType"), -1);
      paramString2 = (String)paramString2.get(".sysmsg.paymsg.req_key");
      if (i != 24) {
        break label1047;
      }
      com.tencent.mm.plugin.report.service.g.paX.a(135L, 58L, 1L, true);
      label101:
      if ((localObject1 == null) || (((q)localObject1).field_reqkey == null) || (!((q)localObject1).field_reqkey.equals(paramString2))) {
        break label1126;
      }
      a((q)localObject1, i);
    }
    for (;;)
    {
      w.i(TAG, "dealMsg true");
      GMTrace.o(15385780813824L, 114633);
      return true;
      localObject1 = bh.p(paramString2, "sysmsg");
      String str3 = (String)((Map)localObject1).get(".sysmsg.paymsg.req_key");
      int j = bg.getInt((String)((Map)localObject1).get(".sysmsg.paymsg.PayMsgType"), -1);
      k.aTF();
      q localq1 = k.aTJ().Dq(str3);
      k.aTF();
      q localq2 = k.aTJ().aTN();
      boolean bool2 = a(localq2);
      label247:
      String str1;
      Object localObject2;
      Object localObject3;
      boolean bool1;
      if (localq1 != null)
      {
        com.tencent.mm.plugin.report.service.g.paX.a(135L, 63L, 1L, true);
        if (localq2 == null) {
          break label374;
        }
        str1 = TAG;
        localObject1 = new Object[3];
        localObject1[0] = localq2.field_reqkey;
        localObject1[1] = Integer.valueOf(localq2.field_status);
        localObject2 = "latestStatus: reqKey: %s, status:%d, isLatestClose: %b";
        localObject3 = localObject1;
        i = 2;
        bool1 = bool2;
      }
      for (;;)
      {
        localObject3[i] = Boolean.valueOf(bool1);
        w.i(str1, (String)localObject2, (Object[])localObject1);
        if (localq1 != null) {
          break label558;
        }
        if (localq2 != null) {
          break label455;
        }
        w.i(TAG, "== current reqKey: %s not in local storage, payMsgType:%d; cannot get latest order in local storage. return true", new Object[] { str3, Integer.valueOf(j) });
        i = 1;
        break;
        com.tencent.mm.plugin.report.service.g.paX.a(135L, 64L, 1L, true);
        break label247;
        label374:
        str1 = TAG;
        localObject1 = new Object[2];
        localObject1[0] = Boolean.valueOf(bool2);
        i = 1;
        String str2;
        if (localq1 == null)
        {
          bool1 = true;
          str2 = "latestStatus is null. isLatestClose: %b, localStatus is null ?: %b";
          localObject2 = localObject1;
          localObject3 = localObject1;
          localObject1 = localObject2;
          localObject2 = str2;
        }
        else
        {
          bool1 = false;
          str2 = "latestStatus is null. isLatestClose: %b, localStatus is null ?: %b";
          localObject2 = localObject1;
          localObject3 = localObject1;
          localObject1 = localObject2;
          localObject2 = str2;
        }
      }
      label455:
      if (bool2)
      {
        w.i(TAG, "== current reqKey: %s not in local storage, payMsgType:%d. the latest order in local storage is closed, reqKey:%s, status:%d. return true", new Object[] { str3, Integer.valueOf(j), localq2.field_reqkey, Integer.valueOf(localq2.field_status) });
        i = 1;
        break;
      }
      w.i(TAG, "== current reqKey: %s not in local storage, payMsgType:%d. the latest order in local storage is not closed, reqKey:%s, status:%d. return false", new Object[] { str3, Integer.valueOf(j), localq2.field_reqkey, Integer.valueOf(localq2.field_status) });
      i = 0;
      break;
      label558:
      if (a(localq1))
      {
        w.i(TAG, "== current reqKey: %s  is in local storage, payMsgType: %d, local status is %d, it is final status. return false.", new Object[] { localq1.field_reqkey, Integer.valueOf(j), Integer.valueOf(localq1.field_status) });
        i = 0;
        break;
      }
      if (localq2 == null)
      {
        w.i(TAG, "== unbelievable! current reqKey: %s  is in local storage, payMsgType: %d, local status is %d; cannot get latest order in local storage , or all local orders is in give-up. return false.", new Object[] { str3, Integer.valueOf(j), Integer.valueOf(localq1.field_status) });
        k.aTF();
        k.aTJ().Dr(str3);
        i = 0;
        break;
      }
      w.i(TAG, "== current reqKey: %s  is in local storage, payMsgType: %d, local status is %d; the latest order is in local storage, reqKey: %s, status: %s ", new Object[] { str3, Integer.valueOf(j), Integer.valueOf(localq1.field_status), localq2.field_reqkey, Integer.valueOf(localq2.field_status) });
      if (localq1.field_reqkey.equals(localq2.field_reqkey))
      {
        if (cD(localq2.field_status, j))
        {
          w.i(TAG, "== current reqKey: %s  is in local storage, payMsgType: %d, local status is %d; the latest order is in local storage, reqKey: %s, status: %s. the two reqKeys are equal. return true", new Object[] { str3, Integer.valueOf(j), Integer.valueOf(localq1.field_status), localq2.field_reqkey, Integer.valueOf(localq2.field_status) });
          i = 1;
          break;
        }
        w.i(TAG, "== current reqKey: %s  is in local storage, payMsgType: %d, local status is %d; the latest order is in local storage, reqKey: %s, status: %s. the two reqKeys are equal. return false.", new Object[] { str3, Integer.valueOf(j), Integer.valueOf(localq1.field_status), localq2.field_reqkey, Integer.valueOf(localq2.field_status) });
        if (localq2.field_status != j)
        {
          w.i(TAG, "mark reqKey: %s as give up", new Object[] { str3 });
          k.aTF();
          k.aTJ().Dr(str3);
        }
        i = 0;
        break;
      }
      if (bool2)
      {
        w.i(TAG, "== current reqKey: %s  is in local storage, payMsgType: %d, local status is %d; the latest order is in local storage, reqKey: %s, status: %s. the two reqKeys are not equal. the latest order is closed. return true.", new Object[] { str3, Integer.valueOf(j), Integer.valueOf(localq1.field_status), localq2.field_reqkey, Integer.valueOf(localq2.field_status) });
        i = 1;
        break;
      }
      w.i(TAG, "== current reqKey: %s  is in local storage, payMsgType: %d, local status is %d; the latest order is in local storage, reqKey: %s, status: %s. the two reqKeys are not equal. the latest order is not closed. return false.", new Object[] { str3, Integer.valueOf(j), Integer.valueOf(localq1.field_status), localq2.field_reqkey, Integer.valueOf(localq2.field_status) });
      k.aTF();
      k.aTJ().Dr(str3);
      i = 0;
      break;
      label1047:
      if (i == 6)
      {
        com.tencent.mm.plugin.report.service.g.paX.a(135L, 59L, 1L, true);
        break label101;
      }
      if ((i == 4) || (i == 5) || (i == 20))
      {
        com.tencent.mm.plugin.report.service.g.paX.a(135L, 60L, 1L, true);
        break label101;
      }
      if (i != 23) {
        break label101;
      }
      com.tencent.mm.plugin.report.service.g.paX.a(135L, 66L, 1L, true);
      break label101;
      label1126:
      localObject1 = new q();
      ((q)localObject1).field_reqkey = paramString2;
      if (!bg.mZ(paramString1)) {
        ((q)localObject1).field_ack_key = paramString1;
      }
      ((q)localObject1).field_status = omy;
      a((q)localObject1, i);
    }
    label1172:
    w.i(TAG, "dealMsg false");
    GMTrace.o(15385780813824L, 114633);
    return false;
  }
  
  public final void stop()
  {
    GMTrace.i(15386451902464L, 114638);
    if (com.tencent.mm.plugin.offline.c.a.aUR())
    {
      w.i(TAG, "OFFLINEGETMSGLOGIN STOP; IS stopped=" + this.omM.bNt());
      if (!this.omM.bNt())
      {
        com.tencent.mm.plugin.report.service.g.paX.a(135L, 62L, 1L, true);
        this.omM.MM();
      }
    }
    GMTrace.o(15386451902464L, 114638);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/offline/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */