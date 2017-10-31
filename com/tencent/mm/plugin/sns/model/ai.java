package com.tencent.mm.plugin.sns.model;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.g.a;
import com.tencent.mm.plugin.sns.storage.h;
import com.tencent.mm.plugin.sns.storage.k;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.q;
import com.tencent.mm.plugin.sns.storage.r;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.plugin.sns.storage.t;
import com.tencent.mm.protocal.c.afk;
import com.tencent.mm.protocal.c.aku;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.amo;
import com.tencent.mm.protocal.c.amq;
import com.tencent.mm.protocal.c.asr;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.protocal.c.bct;
import com.tencent.mm.protocal.c.bcu;
import com.tencent.mm.protocal.c.bcz;
import com.tencent.mm.protocal.c.bdg;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.bds;
import com.tencent.mm.protocal.c.bdz;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.cc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class ai
{
  private static Map<String, bdk> qep;
  
  static
  {
    GMTrace.i(8127688736768L, 60556);
    qep = new ConcurrentHashMap();
    GMTrace.o(8127688736768L, 60556);
  }
  
  public static boolean F(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(8126078124032L, 60544);
    if (paramBoolean)
    {
      if (paramInt > 0)
      {
        GMTrace.o(8126078124032L, 60544);
        return true;
      }
      GMTrace.o(8126078124032L, 60544);
      return false;
    }
    GMTrace.o(8126078124032L, 60544);
    return false;
  }
  
  public static com.tencent.mm.plugin.sns.storage.m GD(String paramString)
  {
    GMTrace.i(8124467511296L, 60532);
    paramString = ae.bhp().a(true, paramString, 1, false, "");
    if (paramString.getCount() == 0)
    {
      paramString.close();
      GMTrace.o(8124467511296L, 60532);
      return null;
    }
    paramString.moveToFirst();
    com.tencent.mm.plugin.sns.storage.m localm = new com.tencent.mm.plugin.sns.storage.m();
    localm.b(paramString);
    if (!paramString.isClosed()) {
      paramString.close();
    }
    GMTrace.o(8124467511296L, 60532);
    return localm;
  }
  
  public static boolean GE(String paramString)
  {
    GMTrace.i(8126346559488L, 60546);
    boolean bool = com.tencent.mm.x.m.zF().equals(paramString.trim());
    GMTrace.o(8126346559488L, 60546);
    return bool;
  }
  
  public static String GF(String paramString)
  {
    GMTrace.i(8126614994944L, 60548);
    int i = 1;
    LinkedList localLinkedList = new LinkedList();
    Object localObject = ae.bhu().getCursor();
    if (((Cursor)localObject).moveToFirst()) {
      do
      {
        s locals = new s();
        locals.b((Cursor)localObject);
        localLinkedList.add(bg.ap(locals.field_tagName, ""));
      } while (((Cursor)localObject).moveToNext());
    }
    ((Cursor)localObject).close();
    localObject = paramString;
    while (localLinkedList.contains(localObject))
    {
      localObject = paramString + i;
      i += 1;
    }
    GMTrace.o(8126614994944L, 60548);
    return (String)localObject;
  }
  
  public static List<com.tencent.mm.plugin.sns.g.b> GG(String paramString)
  {
    GMTrace.i(8127151865856L, 60552);
    ArrayList localArrayList = new ArrayList();
    if (ae.bgY())
    {
      GMTrace.o(8127151865856L, 60552);
      return localArrayList;
    }
    Object localObject = h.HA(paramString);
    if (localObject == null)
    {
      GMTrace.o(8127151865856L, 60552);
      return localArrayList;
    }
    localObject = ((com.tencent.mm.plugin.sns.storage.m)localObject).bjL();
    if ((((bhc)localObject).uyu == null) || (((bhc)localObject).uyu.tKd.size() == 0))
    {
      GMTrace.o(8127151865856L, 60552);
      return localArrayList;
    }
    localArrayList.clear();
    Iterator localIterator = ((bhc)localObject).uyu.tKd.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      amn localamn = (amn)localIterator.next();
      com.tencent.mm.plugin.sns.g.b localb = new com.tencent.mm.plugin.sns.g.b();
      localb.fNf = localamn;
      localb.qhV = paramString;
      localb.hzl = ((bhc)localObject).orU;
      localb.qhW = i;
      localArrayList.add(localb);
      i += 1;
    }
    GMTrace.o(8127151865856L, 60552);
    return localArrayList;
  }
  
  private static long a(com.tencent.mm.plugin.sns.storage.m paramm, bdk parambdk, String paramString, int paramInt)
  {
    GMTrace.i(8125541253120L, 60540);
    com.tencent.mm.plugin.sns.storage.m localm = paramm;
    if (paramm == null) {
      localm = new com.tencent.mm.plugin.sns.storage.m();
    }
    long l;
    if (!ae.bho().dA(localm.field_snsId))
    {
      l = parambdk.tDg;
      GMTrace.o(8125541253120L, 60540);
      return l;
    }
    int i;
    if (parambdk.uvp != 0)
    {
      w.i("MicroMsg.SnsInfoStorageLogic", "hit the filter id:" + parambdk.tDg + "  " + i.jdMethod_do(parambdk.tDg));
      i = 0;
      if (!localm.uF(paramInt))
      {
        localm.uD(paramInt);
        i = 1;
      }
      if (i != 0) {
        ae.bhp().a(parambdk.tDg, localm);
      }
      l = parambdk.tDg;
      GMTrace.o(8125541253120L, 60540);
      return l;
    }
    paramm = parambdk.uvl;
    w.i("MicroMsg.SnsInfoStorageLogic", "hasChange id:  %s listSize %s Stringid %s", new Object[] { Long.valueOf(parambdk.tDg), Integer.valueOf(paramm.size()), i.jdMethod_do(parambdk.tDg) });
    if ((parambdk.uve == null) || (parambdk.uve.ush == null))
    {
      w.i("MicroMsg.SnsInfoStorageLogic", "object desc is null");
      l = parambdk.tDg;
      GMTrace.o(8125541253120L, 60540);
      return l;
    }
    paramm = new String(parambdk.uve.ush.toByteArray());
    w.d("MicroMsg.SnsInfoStorageLogic", "from server %d ", new Object[] { Long.valueOf(parambdk.tDg) });
    if (bg.mZ(paramm))
    {
      l = parambdk.tDg;
      GMTrace.o(8125541253120L, 60540);
      return l;
    }
    if (!localm.Hy(paramm))
    {
      l = parambdk.tDg;
      GMTrace.o(8125541253120L, 60540);
      return l;
    }
    parambdk.uvv = b(parambdk.uvv, localm.field_attrBuf);
    w.d("MicroMsg.SnsInfoStorageLogic", "from server xml ok %d", new Object[] { Long.valueOf(parambdk.tDg) });
    parambdk.uve.bd(new byte[0]);
    localm.field_userName = parambdk.twR;
    localm.fZ(parambdk.orU);
    localm.field_likeFlag = parambdk.uvf;
    localm.dL(parambdk.tDg);
    localm.dN(parambdk.tDg);
    localm.uD(paramInt);
    for (;;)
    {
      try
      {
        l = bg.Pq();
      }
      catch (Exception paramm)
      {
        int j;
        w.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", paramm, "", new Object[0]);
        continue;
        i = 0;
        continue;
        localm.bke();
        continue;
        if ((j != 1) && ((paramString.equals(parambdk.twR)) || (paramInt != 4))) {
          continue;
        }
        localm.bka();
        localm.c(paramm);
        localm.field_type = paramm.uyu.tKc;
        localm.field_subType = paramm.uyu.tKe;
        ae.bhp().a(parambdk.tDg, localm);
        l = parambdk.tDg;
        GMTrace.o(8125541253120L, 60540);
      }
      try
      {
        if (localm.field_type == 15)
        {
          paramm = (bdk)new bdk().aC(localm.field_attrBuf);
          if ((paramm != null) && (paramm.uvx != null) && (paramm.uvx.uoh > 0))
          {
            parambdk.uvx = paramm.uvx;
            w.i("MicroMsg.SnsInfoStorageLogic", "mergePreloadInfo predownload info [%d %d %s] cost[%d]", new Object[] { Integer.valueOf(parambdk.uvx.uoh), Integer.valueOf(parambdk.uvx.uoi), parambdk.uvx.uoj, Long.valueOf(bg.aG(l)) });
          }
        }
      }
      catch (Exception paramm)
      {
        w.e("MicroMsg.SnsInfoStorageLogic", "mergePreloadInfo error %s", new Object[] { paramm.toString() });
      }
    }
    localm.aE(parambdk.toByteArray());
    paramm = localm.bjL();
    paramm.jWW = parambdk.twR;
    j = paramm.uhC;
    localm.field_pravited = j;
    w.i("MicroMsg.SnsInfoStorageLogic", "ext flag %s  extflag %s", new Object[] { Long.valueOf(parambdk.tDg), Integer.valueOf(parambdk.ujv) });
    if ((parambdk.ujv & 0x1) > 0)
    {
      i = 1;
      if (i == 0) {
        break label734;
      }
      localm.bkd();
      if ((j != 1) || (paramInt == 4)) {
        break label742;
      }
      w.e("MicroMsg.SnsInfoStorageLogic", "svr error push me the private pic in timelnie or others");
      GMTrace.o(8125541253120L, 60540);
      return 0L;
    }
    label734:
    label742:
    return l;
  }
  
  public static amn a(com.tencent.mm.plugin.sns.storage.m paramm, int paramInt)
  {
    GMTrace.i(8127017648128L, 60551);
    if (ae.bgY())
    {
      GMTrace.o(8127017648128L, 60551);
      return null;
    }
    if (paramm == null)
    {
      GMTrace.o(8127017648128L, 60551);
      return null;
    }
    paramm = paramm.bjL();
    if ((paramm.uyu == null) || (paramm.uyu.tKd.size() == 0) || (paramm.uyu.tKd.size() <= paramInt))
    {
      GMTrace.o(8127017648128L, 60551);
      return null;
    }
    paramm = (amn)paramm.uyu.tKd.get(paramInt);
    GMTrace.o(8127017648128L, 60551);
    return paramm;
  }
  
  public static amn a(com.tencent.mm.plugin.sns.storage.m paramm, String paramString)
  {
    GMTrace.i(16340471513088L, 121746);
    paramm = paramm.bjL();
    if ((paramm.uyu == null) || (paramm.uyu.tKd.size() == 0))
    {
      GMTrace.o(16340471513088L, 121746);
      return null;
    }
    paramm = paramm.uyu.tKd.iterator();
    while (paramm.hasNext())
    {
      amn localamn = (amn)paramm.next();
      if (localamn.nas.equals(paramString))
      {
        GMTrace.o(16340471513088L, 121746);
        return localamn;
      }
    }
    GMTrace.o(16340471513088L, 121746);
    return null;
  }
  
  public static List<com.tencent.mm.plugin.sns.storage.m> a(String paramString1, boolean paramBoolean1, String paramString2, boolean paramBoolean2)
  {
    GMTrace.i(8124333293568L, 60531);
    if (paramBoolean2) {}
    for (paramString1 = ae.bhp().a(false, paramString1, 10, paramBoolean1, paramString2);; paramString1 = ae.bhp().a(false, paramString1, 0, paramBoolean1, paramString2))
    {
      paramString2 = new ArrayList();
      if (paramString1.getCount() != 0) {
        break;
      }
      paramString1.close();
      GMTrace.o(8124333293568L, 60531);
      return paramString2;
    }
    if (paramString1.moveToFirst()) {
      do
      {
        com.tencent.mm.plugin.sns.storage.m localm = new com.tencent.mm.plugin.sns.storage.m();
        localm.b(paramString1);
        paramString2.add(localm);
      } while (paramString1.moveToNext());
    }
    paramString1.close();
    GMTrace.o(8124333293568L, 60531);
    return paramString2;
  }
  
  public static void a(String paramString1, int paramInt, LinkedList<bdk> paramLinkedList, String paramString2)
  {
    GMTrace.i(8125943906304L, 60543);
    if ((paramLinkedList == null) || (paramLinkedList.isEmpty()))
    {
      GMTrace.o(8125943906304L, 60543);
      return;
    }
    Object localObject3 = ae.bhp();
    ArrayList localArrayList = new ArrayList();
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    Object localObject2;
    while (i < paramLinkedList.size())
    {
      bdk localbdk = (bdk)paramLinkedList.get(i);
      localObject2 = ((n)localObject3).dP(localbdk.tDg);
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = new com.tencent.mm.plugin.sns.storage.m();
      }
      if (a((com.tencent.mm.plugin.sns.storage.m)localObject1, localbdk, paramString1, paramInt) != 0L)
      {
        if ((localLinkedList.size() < 3) && ((((com.tencent.mm.plugin.sns.storage.m)localObject1).field_type == 1) || (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_type == 15))) {
          localLinkedList.add(i.jdMethod_do(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId));
        }
        localArrayList.add(Long.valueOf(localbdk.tDg));
      }
      i += 1;
    }
    if (((paramInt == 4) || (paramInt == 8)) && (paramString2.equals("")))
    {
      localObject1 = ae.bhs().HE(paramString1);
      if (localObject1 != null)
      {
        localObject1 = ((k)localObject1).field_newerIds;
        localObject1 = bg.f(bg.ap((String)localObject1, "").split(","));
        w.d("MicroMsg.SnsInfoStorageLogic", "newerIds " + bo(localLinkedList));
        label277:
        do
        {
          if ((localLinkedList.size() >= 3) || (((List)localObject1).size() <= 0)) {
            break;
          }
          localObject2 = (String)((List)localObject1).remove(0);
        } while (localObject2 == null);
        i = 0;
      }
      for (;;)
      {
        if (i < localLinkedList.size())
        {
          localObject3 = (String)localLinkedList.get(i);
          if (((String)localObject2).compareTo((String)localObject3) != 0)
          {
            if (((String)localObject2).compareTo((String)localObject3) <= 0) {
              break label407;
            }
            localLinkedList.add(0, localObject2);
          }
        }
        if (localLinkedList.contains(localObject2)) {
          break label277;
        }
        localLinkedList.add(localObject2);
        break label277;
        localObject1 = "";
        break;
        label407:
        i += 1;
      }
      w.i("MicroMsg.SnsInfoStorageLogic", "merge newerIds " + bo(localLinkedList));
      ae.bhs().dC(paramString1, bo(localLinkedList));
    }
    Object localObject1 = i.Gf(i.jdMethod_do(((bdk)paramLinkedList.getLast()).tDg));
    w.d("MicroMsg.SnsInfoStorageLogic", "FIlTER SEQ :: " + paramString2 + "  -  " + (String)localObject1);
    if (paramInt == 2)
    {
      localObject2 = ae.bhp();
      paramLinkedList = n.bky();
      if (paramString2 != null)
      {
        paramString1 = paramLinkedList;
        if (paramString2.equals("")) {}
      }
      else
      {
        paramString1 = paramLinkedList + " AND " + ((n)localObject2).HM(paramString2);
      }
      paramLinkedList = paramString1;
      if (n.HI((String)localObject1)) {
        paramLinkedList = paramString1 + " AND " + ((n)localObject2).HJ((String)localObject1);
      }
      w.d("MicroMsg.SnsInfoStorage", "getCursorByUserSeq " + paramLinkedList);
      paramString1 = ((n)localObject2).gMB.rawQuery(paramLinkedList, null);
      if (paramString1 == null) {
        GMTrace.o(8125943906304L, 60543);
      }
    }
    else
    {
      localObject2 = ae.bhp();
      if (paramInt == 4) {}
      for (boolean bool = true;; bool = false)
      {
        paramLinkedList = n.d(true, paramString1, bool);
        paramString1 = paramLinkedList;
        if (n.HI(paramString2)) {
          paramString1 = paramLinkedList + " AND " + ((n)localObject2).HM(paramString2);
        }
        paramLinkedList = paramString1;
        if (n.HI((String)localObject1)) {
          paramLinkedList = paramString1 + " AND " + ((n)localObject2).HJ((String)localObject1);
        }
        w.d("MicroMsg.SnsInfoStorage", "getCursorByUserSeq " + paramLinkedList);
        paramString1 = ((n)localObject2).gMB.rawQuery(paramLinkedList, null);
        break;
      }
    }
    if (!paramString1.moveToFirst())
    {
      paramString1.close();
      GMTrace.o(8125943906304L, 60543);
      return;
    }
    for (;;)
    {
      paramLinkedList = new com.tencent.mm.plugin.sns.storage.m();
      paramLinkedList.b(paramString1);
      long l = paramLinkedList.field_snsId;
      if (paramLinkedList.bkh()) {
        w.d("MicroMsg.SnsInfoStorageLogic", "uploading one ");
      }
      while (!paramString1.moveToNext())
      {
        paramString1.close();
        GMTrace.o(8125943906304L, 60543);
        return;
        if (paramLinkedList.bki())
        {
          w.d("MicroMsg.SnsInfoStorageLogic", "die one ");
        }
        else if (!localArrayList.contains(Long.valueOf(l)))
        {
          paramLinkedList.uG(paramInt);
          ae.bhp().b(l, paramLinkedList);
          w.i("MicroMsg.SnsInfoStorageLogic", "removeSourceFlag sns Id " + l + " source " + paramInt);
        }
      }
    }
  }
  
  public static boolean a(long paramLong, bcu parambcu)
  {
    GMTrace.i(8125272817664L, 60538);
    bct localbct = parambcu.uuL;
    if ((localbct.jXP != 1) && (localbct.jXP != 2))
    {
      GMTrace.o(8125272817664L, 60538);
      return true;
    }
    com.tencent.mm.plugin.sns.storage.m localm = ae.bhp().dP(paramLong);
    if (localm == null)
    {
      GMTrace.o(8125272817664L, 60538);
      return true;
    }
    if ((localm.field_type == 21) && (!com.tencent.mm.plugin.sns.lucky.a.g.bgj()))
    {
      w.i("MicroMsg.SnsInfoStorageLogic", "passed because close lucky");
      GMTrace.o(8125272817664L, 60538);
      return false;
    }
    for (;;)
    {
      try
      {
        localbdk = (bdk)new bdk().aC(localm.field_attrBuf);
        localbdk.tDg = paramLong;
        if (localbct.jXP != 1) {
          continue;
        }
        localIterator = localbdk.uvi.iterator();
        if (localIterator.hasNext())
        {
          localbcz = (bcz)localIterator.next();
          if (localbcz.orU != localbct.orU) {
            continue;
          }
          bool = localbcz.twR.equals(localbct.upg);
          if (!bool) {
            continue;
          }
          GMTrace.o(8125272817664L, 60538);
          return true;
        }
        localbdk.uvi.add(ac.a(parambcu));
        localm.aE(localbdk.toByteArray());
        ae.bhp().a(localbdk.tDg, localm);
      }
      catch (Exception parambcu)
      {
        bdk localbdk;
        Iterator localIterator;
        bcz localbcz;
        boolean bool;
        w.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", parambcu, "", new Object[0]);
        continue;
      }
      GMTrace.o(8125272817664L, 60538);
      return true;
      if (localbct.jXP == 2)
      {
        localIterator = localbdk.uvl.iterator();
        if (localIterator.hasNext())
        {
          localbcz = (bcz)localIterator.next();
          if (localbcz.orU == localbct.orU)
          {
            bool = localbcz.twR.equals(localbct.upg);
            if (bool)
            {
              GMTrace.o(8125272817664L, 60538);
              return true;
            }
          }
        }
        else
        {
          localbdk.uvl.add(ac.a(parambcu));
        }
      }
    }
  }
  
  public static axs b(axs paramaxs, byte[] paramArrayOfByte)
  {
    GMTrace.i(8125675470848L, 60541);
    if (paramArrayOfByte != null) {}
    for (;;)
    {
      try
      {
        axs localaxs = ((bdk)new bdk().aC(paramArrayOfByte)).uvv;
        if (paramaxs == null)
        {
          GMTrace.o(8125675470848L, 60541);
          return localaxs;
        }
        bds localbds = new bds();
        paramArrayOfByte = localbds;
        if (localaxs != null) {
          paramArrayOfByte = (bds)localbds.aC(localaxs.ush.toK);
        }
        paramaxs = (bds)new bds().aC(paramaxs.ush.toK);
        if (paramaxs.uvK == null) {
          paramaxs.uvK = paramArrayOfByte.uvK;
        }
        if (paramArrayOfByte.uvJ == null)
        {
          paramaxs.uvJ = null;
          paramaxs = paramaxs.toByteArray();
          paramaxs = new axs().bd(paramaxs);
          GMTrace.o(8125675470848L, 60541);
          return paramaxs;
        }
        if (paramaxs.uvJ == null)
        {
          paramaxs.uvJ = paramArrayOfByte.uvJ;
          continue;
          localaxs = null;
        }
      }
      catch (Exception paramaxs)
      {
        w.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", paramaxs, "", new Object[0]);
        GMTrace.o(8125675470848L, 60541);
        return null;
      }
    }
  }
  
  public static void b(long paramLong, bcu parambcu)
  {
    GMTrace.i(8125004382208L, 60536);
    parambcu = parambcu.uuL;
    if (parambcu.jXP != 9)
    {
      GMTrace.o(8125004382208L, 60536);
      return;
    }
    com.tencent.mm.plugin.sns.storage.m localm = ae.bhp().dP(paramLong);
    if (localm == null)
    {
      GMTrace.o(8125004382208L, 60536);
      return;
    }
    try
    {
      bdk localbdk = (bdk)new bdk().aC(localm.field_attrBuf);
      localbdk.tDg = paramLong;
      Iterator localIterator = localbdk.uvl.iterator();
      while (localIterator.hasNext())
      {
        bcz localbcz = (bcz)localIterator.next();
        if ((localbcz.uuE == parambcu.uuE) && (!bg.mZ(localbcz.twR)) && (localbcz.twR.equals(parambcu.upg))) {
          localbdk.uvl.remove(localbcz);
        }
      }
      localm.aE(localbdk.toByteArray());
      ae.bhp().a(localbdk.tDg, localm);
      GMTrace.o(8125004382208L, 60536);
      return;
    }
    catch (Exception parambcu)
    {
      w.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", parambcu, "", new Object[0]);
      GMTrace.o(8125004382208L, 60536);
    }
  }
  
  public static void bhH()
  {
    GMTrace.i(8124601729024L, 60533);
    if (qep != null) {
      qep.clear();
    }
    GMTrace.o(8124601729024L, 60533);
  }
  
  public static List<com.tencent.mm.plugin.sns.storage.m> bhI()
  {
    GMTrace.i(8126480777216L, 60547);
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = ae.bhp();
    Object localObject2 = n.bkz() + " AND " + n.qvm + " AND  (snsId = 0  ) ";
    localObject1 = ((n)localObject1).gMB.rawQuery((String)localObject2, null);
    if (((Cursor)localObject1).getCount() == 0)
    {
      ((Cursor)localObject1).close();
      GMTrace.o(8126480777216L, 60547);
      return localArrayList;
    }
    ((Cursor)localObject1).moveToFirst();
    do
    {
      localObject2 = new com.tencent.mm.plugin.sns.storage.m();
      ((com.tencent.mm.plugin.sns.storage.m)localObject2).b((Cursor)localObject1);
      localArrayList.add(localObject2);
    } while (((Cursor)localObject1).moveToNext());
    ((Cursor)localObject1).close();
    GMTrace.o(8126480777216L, 60547);
    return localArrayList;
  }
  
  public static void bhJ()
  {
    GMTrace.i(8127554519040L, 60555);
    Cursor localCursor = ae.bhp().bT("", 0);
    if (localCursor != null)
    {
      w.i("MicroMsg.SnsInfoStorageLogic", "all timeline snsId begin");
      while (localCursor.moveToNext())
      {
        com.tencent.mm.plugin.sns.storage.m localm = new com.tencent.mm.plugin.sns.storage.m();
        localm.b(localCursor);
        w.i("MicroMsg.SnsInfoStorageLogic", localm.bjM());
      }
      w.i("MicroMsg.SnsInfoStorageLogic", "all timeline snsId end");
      localCursor.close();
    }
    GMTrace.o(8127554519040L, 60555);
  }
  
  private static String bo(List<String> paramList)
  {
    GMTrace.i(8125809688576L, 60542);
    Iterator localIterator = paramList.iterator();
    paramList = "";
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (paramList.length() == 0) {
        paramList = str;
      } else {
        paramList = paramList + "," + str;
      }
    }
    GMTrace.o(8125809688576L, 60542);
    return paramList;
  }
  
  public static List<com.tencent.mm.plugin.sns.g.b> bp(List<String> paramList)
  {
    GMTrace.i(8127286083584L, 60553);
    ArrayList localArrayList = new ArrayList();
    if (paramList == null)
    {
      GMTrace.o(8127286083584L, 60553);
      return localArrayList;
    }
    localArrayList.clear();
    paramList = paramList.iterator();
    int i = 0;
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      com.tencent.mm.plugin.sns.g.b localb = new com.tencent.mm.plugin.sns.g.b();
      amn localamn = new amn();
      localamn.nas = ("pre_temp_extend_pic" + str);
      localb.fNf = localamn;
      localb.qhV = "";
      localb.qhW = i;
      localArrayList.add(localb);
      i += 1;
    }
    GMTrace.o(8127286083584L, 60553);
    return localArrayList;
  }
  
  public static void c(long paramLong, bcu parambcu)
  {
    GMTrace.i(8125138599936L, 60537);
    parambcu = parambcu.uuL;
    if (parambcu.jXP != 13)
    {
      GMTrace.o(8125138599936L, 60537);
      return;
    }
    com.tencent.mm.plugin.sns.storage.m localm = ae.bhp().dP(paramLong);
    if (localm == null)
    {
      GMTrace.o(8125138599936L, 60537);
      return;
    }
    try
    {
      bdk localbdk = (bdk)new bdk().aC(localm.field_attrBuf);
      localbdk.tDg = paramLong;
      if (localbdk.uvw == null) {
        localbdk.uvw = new bdz();
      }
      if (parambcu.jXP == 13)
      {
        Object localObject = localbdk.uvw.uvZ.iterator();
        while (((Iterator)localObject).hasNext())
        {
          boolean bool = ((bdg)((Iterator)localObject).next()).twR.equals(parambcu.upg);
          if (bool)
          {
            GMTrace.o(8125138599936L, 60537);
            return;
          }
        }
        localObject = new bdg();
        ((bdg)localObject).uuI = parambcu.uuI;
        ((bdg)localObject).orU = parambcu.orU;
        ((bdg)localObject).twR = parambcu.upg;
        localbdk.uvw.uvZ.add(localObject);
        localbdk.uvw.uvY = localbdk.uvw.uvZ.size();
      }
      localm.aE(localbdk.toByteArray());
      ae.bhp().a(localbdk.tDg, localm);
      GMTrace.o(8125138599936L, 60537);
      return;
    }
    catch (Exception parambcu)
    {
      w.e("MicroMsg.SnsInfoStorageLogic", "error for update hbaction " + parambcu.getMessage());
      w.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", parambcu, "", new Object[0]);
      GMTrace.o(8125138599936L, 60537);
    }
  }
  
  public static long d(bdk parambdk)
  {
    GMTrace.i(8125407035392L, 60539);
    com.tencent.mm.plugin.sns.storage.m localm2 = ae.bhp().dP(parambdk.tDg);
    com.tencent.mm.plugin.sns.storage.m localm1 = localm2;
    if (localm2 == null) {
      localm1 = new com.tencent.mm.plugin.sns.storage.m();
    }
    long l = a(localm1, parambdk, "", 0);
    GMTrace.o(8125407035392L, 60539);
    return l;
  }
  
  public static List<com.tencent.mm.plugin.sns.g.b> ds(String paramString1, String paramString2)
  {
    int i = 0;
    GMTrace.i(8126883430400L, 60550);
    localArrayList = new ArrayList();
    Object localObject1 = null;
    try
    {
      Object localObject2 = paramString2 + paramString1 + "_ARTISTF.mm";
      Object localObject3 = paramString2 + paramString1 + "_ARTIST.mm";
      paramString1 = (String)localObject1;
      if (FileOp.aZ((String)localObject2))
      {
        paramString1 = FileOp.c((String)localObject2, 0, (int)FileOp.kI((String)localObject2));
        paramString1 = (cc)new cc().aC(paramString1);
      }
      paramString2 = paramString1;
      if (paramString1 == null)
      {
        FileOp.deleteFile((String)localObject2);
        paramString2 = a.Hi(new String(FileOp.c((String)localObject3, 0, (int)FileOp.kI((String)localObject3))));
        FileOp.b((String)localObject2, paramString2.toByteArray(), -1);
      }
      paramString1 = paramString2.tvK.iterator();
      if (paramString1.hasNext())
      {
        localObject1 = (afk)paramString1.next();
        paramString2 = ((afk)localObject1).mCJ;
        localObject1 = ((afk)localObject1).tKd.iterator();
        int j = i;
        for (;;)
        {
          i = j;
          if (!((Iterator)localObject1).hasNext()) {
            break;
          }
          localObject2 = (amn)((Iterator)localObject1).next();
          ((amn)localObject2).mCK = paramString2;
          localObject3 = new com.tencent.mm.plugin.sns.g.b();
          ((com.tencent.mm.plugin.sns.g.b)localObject3).fNf = ((amn)localObject2);
          ((com.tencent.mm.plugin.sns.g.b)localObject3).qhV = "";
          ((com.tencent.mm.plugin.sns.g.b)localObject3).qhW = j;
          localArrayList.add(localObject3);
          j += 1;
        }
      }
      return localArrayList;
    }
    catch (Exception paramString1)
    {
      w.e("MicroMsg.SnsInfoStorageLogic", "error initDataArtist");
      GMTrace.o(8126883430400L, 60550);
    }
  }
  
  public static bdk m(com.tencent.mm.plugin.sns.storage.m paramm)
  {
    GMTrace.i(8124735946752L, 60534);
    try
    {
      paramm = (bdk)new bdk().aC(paramm.field_attrBuf);
      paramm = ae.bho().c(paramm);
      qep.clear();
      GMTrace.o(8124735946752L, 60534);
      return paramm;
    }
    catch (Exception paramm)
    {
      w.e("MicroMsg.SnsInfoStorageLogic", "SnsObject parseFrom error");
      w.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", paramm, "", new Object[0]);
      paramm = new bdk();
      GMTrace.o(8124735946752L, 60534);
    }
    return paramm;
  }
  
  public static bdk n(com.tencent.mm.plugin.sns.storage.m paramm)
  {
    GMTrace.i(8124870164480L, 60535);
    try
    {
      if (paramm.quP == null) {
        paramm.quP = (com.tencent.mm.a.g.n(paramm.field_content) + com.tencent.mm.a.g.n(paramm.field_attrBuf));
      }
      if (qep.containsKey(paramm.quP))
      {
        localbdk = (bdk)qep.get(paramm.quP);
        if (localbdk != null)
        {
          ae.bho().c(localbdk);
          GMTrace.o(8124870164480L, 60535);
          return localbdk;
        }
      }
      bdk localbdk = (bdk)new bdk().aC(paramm.field_attrBuf);
      qep.put(paramm.quP, localbdk);
      ae.bho().c(localbdk);
      GMTrace.o(8124870164480L, 60535);
      return localbdk;
    }
    catch (Exception paramm)
    {
      w.e("MicroMsg.SnsInfoStorageLogic", "SnsObject parseFrom error");
      w.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", paramm, "", new Object[0]);
      paramm = new bdk();
      GMTrace.o(8124870164480L, 60535);
    }
    return paramm;
  }
  
  public static boolean uf(int paramInt)
  {
    GMTrace.i(8126212341760L, 60545);
    w.d("MicroMsg.SnsInfoStorageLogic", "retryPostItem localId　" + paramInt);
    com.tencent.mm.plugin.sns.storage.m localm = ae.bhp().uI(paramInt);
    if (localm == null)
    {
      GMTrace.o(8126212341760L, 60545);
      return false;
    }
    localm.bkj();
    localm.fZ((int)(System.currentTimeMillis() / 1000L));
    Object localObject2 = null;
    for (;;)
    {
      try
      {
        localObject1 = (amo)new amo().aC(localm.field_postBuf);
        w.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", (Throwable)localObject2, "", new Object[0]);
      }
      catch (Exception localException3)
      {
        try
        {
          ((amo)localObject1).hkI = 0;
          ((amo)localObject1).uib = System.currentTimeMillis();
          localm.field_postBuf = ((amo)localObject1).toByteArray();
          if (localObject1 != null) {
            break;
          }
          GMTrace.o(8126212341760L, 60545);
          return false;
        }
        catch (Exception localException2)
        {
          for (;;)
          {
            Object localObject1;
            int i;
            amq localamq;
            continue;
            paramInt += 1;
          }
        }
        localException3 = localException3;
        localObject1 = localObject2;
        localObject2 = localException3;
      }
    }
    ae.bhp().b(paramInt, localm);
    paramInt = 0;
    if (paramInt < ((amo)localObject1).uhY.size())
    {
      i = ((aku)((amo)localObject1).uhY.get(paramInt)).ufH;
      localObject2 = ae.bhe().dQ(i);
      if (localObject2 != null)
      {
        ((q)localObject2).offset = 0;
        try
        {
          localamq = (amq)new amq().aC(((q)localObject2).qvA);
          if (localamq.uiy == 0) {
            break label311;
          }
          localamq.uiy = 2;
          localamq.uiz = "";
          ((q)localObject2).qvA = localamq.toByteArray();
          ae.bhe().a(i, (q)localObject2);
        }
        catch (Exception localException1)
        {
          w.e("MicroMsg.SnsInfoStorageLogic", "MediaUploadInfo parseFrom MediaUploadInfo Exception");
          GMTrace.o(8126212341760L, 60545);
          return false;
        }
      }
    }
    else
    {
      GMTrace.o(8126212341760L, 60545);
      return true;
    }
  }
  
  public static com.tencent.mm.plugin.sns.storage.m ug(int paramInt)
  {
    GMTrace.i(8126749212672L, 60549);
    com.tencent.mm.plugin.sns.storage.m localm = new com.tencent.mm.plugin.sns.storage.m();
    Object localObject1 = ae.bhp();
    Object localObject2 = n.bkA();
    localObject2 = (String)localObject2 + " and createTime < " + paramInt;
    localObject2 = (String)localObject2 + n.qvg;
    localObject2 = (String)localObject2 + " LIMIT 1";
    w.i("MicroMsg.SnsInfoStorage", "getTimelineByCreateTime sql %s", new Object[] { localObject2 });
    localObject2 = ((n)localObject1).gMB.rawQuery((String)localObject2, null);
    localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = null;
    }
    if (localObject1 == null)
    {
      GMTrace.o(8126749212672L, 60549);
      return null;
    }
    if (((Cursor)localObject1).moveToFirst())
    {
      localm.b((Cursor)localObject1);
      ((Cursor)localObject1).close();
      GMTrace.o(8126749212672L, 60549);
      return localm;
    }
    ((Cursor)localObject1).close();
    GMTrace.o(8126749212672L, 60549);
    return null;
  }
  
  public static void uh(int paramInt)
  {
    GMTrace.i(8127420301312L, 60554);
    w.d("MicroMsg.SnsInfoStorageLogic", "unsetOmitResendFlag localId　" + paramInt);
    com.tencent.mm.plugin.sns.storage.m localm = ae.bhp().uI(paramInt);
    if (localm == null)
    {
      GMTrace.o(8127420301312L, 60554);
      return;
    }
    if ((localm.field_localFlag & 0x40) > 0) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        localm.field_localFlag &= 0xFFFFFFBF;
      }
      ae.bhp().b(paramInt, localm);
      GMTrace.o(8127420301312L, 60554);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */