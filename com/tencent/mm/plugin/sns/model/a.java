package com.tencent.mm.plugin.sns.model;

import android.database.Cursor;
import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.plugin.sns.b.c;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.storage.b;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.protocal.c.avx;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.protocal.c.bcp;
import com.tencent.mm.protocal.c.bct;
import com.tencent.mm.protocal.c.bcu;
import com.tencent.mm.protocal.c.bcz;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.bdy;
import com.tencent.mm.protocal.c.bfi;
import com.tencent.mm.protocal.c.bfj;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.ca;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public final class a
{
  private static final String pZN;
  private static LinkedHashMap<Long, Integer> pZO;
  private static Comparator<bcz> pZP;
  
  static
  {
    GMTrace.i(8044607963136L, 59937);
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.h.xA();
    pZN = com.tencent.mm.kernel.h.xz().cachePath + "sns_recvd_ad";
    pZP = new Comparator() {};
    GMTrace.o(8044607963136L, 59937);
  }
  
  public static void Go(String paramString)
  {
    GMTrace.i(8043668439040L, 59930);
    if (bg.mZ(paramString))
    {
      GMTrace.o(8043668439040L, 59930);
      return;
    }
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.f.bjE().d("adId", paramString, "adxml", 1);
    GMTrace.o(8043668439040L, 59930);
  }
  
  private static int a(bdk parambdk)
  {
    GMTrace.i(8043802656768L, 59931);
    com.tencent.mm.plugin.sns.storage.m localm = ae.bhp().dP(parambdk.tDg);
    if (localm == null)
    {
      i = parambdk.orU;
      GMTrace.o(8043802656768L, 59931);
      return i;
    }
    int i = localm.field_createTime;
    GMTrace.o(8043802656768L, 59931);
    return i;
  }
  
  private static ca a(avx paramavx)
  {
    GMTrace.i(8042326261760L, 59920);
    if (paramavx != null)
    {
      ca localca = new ca();
      localca.tvG = paramavx.uqJ;
      if (localca.tvG == null)
      {
        w.i("MicroMsg.AdSnsInfoStorageLogic", "recObject.RecommendInfo is null");
        GMTrace.o(8042326261760L, 59920);
        return null;
      }
      localca.tvF = b(paramavx.uqI);
      GMTrace.o(8042326261760L, 59920);
      return localca;
    }
    GMTrace.o(8042326261760L, 59920);
    return null;
  }
  
  public static void a(bcp parambcp)
  {
    GMTrace.i(8041118302208L, 59911);
    if (parambcp == null)
    {
      w.i("MicroMsg.AdSnsInfoStorageLogic", "error adobj");
      GMTrace.o(8041118302208L, 59911);
      return;
    }
    if (parambcp.uuw == null)
    {
      w.i("MicroMsg.AdSnsInfoStorageLogic", "error adobj");
      GMTrace.o(8041118302208L, 59911);
      return;
    }
    com.tencent.mm.plugin.sns.storage.e locale = c(parambcp);
    if (locale == null)
    {
      GMTrace.o(8041118302208L, 59911);
      return;
    }
    if (ae.bhr().dJ(parambcp.uuw.tDg))
    {
      w.i("MicroMsg.AdSnsInfoStorageLogic", "ind this adobj and update" + parambcp.uuw.tDg);
      ae.bhr().b(parambcp.uuw.tDg, locale);
      GMTrace.o(8041118302208L, 59911);
      return;
    }
    w.i("MicroMsg.AdSnsInfoStorageLogic", "local can not find this adobj " + parambcp.uuw.tDg);
    GMTrace.o(8041118302208L, 59911);
  }
  
  public static void a(bdy parambdy)
  {
    GMTrace.i(8041252519936L, 59912);
    b(b(parambdy));
    GMTrace.o(8041252519936L, 59912);
  }
  
  private static void a(ca paramca)
  {
    GMTrace.i(8043400003584L, 59928);
    paramca = com.tencent.mm.platformtools.n.a(paramca.tvF.uux);
    if ((!bg.mZ(paramca)) && (new b(paramca).qln)) {
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.f.bjE().d("adId", paramca, "adxml", 0);
    }
    GMTrace.o(8043400003584L, 59928);
  }
  
  private static void a(ca paramca, int paramInt1, int paramInt2, com.tencent.mm.plugin.sns.storage.a parama)
  {
    GMTrace.i(8042057826304L, 59918);
    if (paramca == null)
    {
      w.i("MicroMsg.AdSnsInfoStorageLogic", "error adobj");
      GMTrace.o(8042057826304L, 59918);
      return;
    }
    if ((paramca.tvF == null) || (paramca.tvF.uuw == null))
    {
      w.i("MicroMsg.AdSnsInfoStorageLogic", "error adobj");
      GMTrace.o(8042057826304L, 59918);
      return;
    }
    bdk localbdk = paramca.tvF.uuw;
    com.tencent.mm.plugin.sns.storage.e locale = c(paramca.tvF);
    bhc localbhc = locale.bjL();
    bfi localbfi = new bfi();
    localbfi.uxt = new bfj();
    localbfi.uxt.uxx = parama.qhb;
    localbfi.uxt.uxw = localbhc.nas;
    localbfi.uxt.cyK = locale.getSource();
    localbfi.uxt.quG = o.a(localbfi.uxt);
    if (localbhc.uyu.tKc == 1) {
      localbfi.uxt.hNB = 1;
    }
    for (;;)
    {
      parama = localbfi.uxt;
      b localb = locale.bjI();
      int i;
      if (localb == null)
      {
        i = 0;
        parama.uxy = i;
      }
      try
      {
        parama = Base64.encodeToString(localbfi.toByteArray(), 0).replace("\n", "");
        w.i("MicroMsg.AdSnsInfoStorageLogic", "replace newly add snsId:%s, statExtStr:%s(id=%s,uxInfo=%s)", new Object[] { localbhc.nas, parama, localbfi.uxt.uxw, localbfi.uxt.uxx });
        localbhc.qBT = parama;
        locale.c(localbhc);
        if (locale == null)
        {
          GMTrace.o(8042057826304L, 59918);
          return;
          if (localbhc.uyu.tKc == 15)
          {
            localbfi.uxt.hNB = 2;
            continue;
          }
          localbfi.uxt.hNB = 0;
          continue;
          i = localb.qlS;
        }
      }
      catch (IOException parama)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", parama, "", new Object[0]);
        }
        locale.field_createTime = paramInt1;
        locale.field_exposureTime = 0;
        locale.field_createAdTime = paramInt2;
        parama = com.tencent.mm.platformtools.n.a(paramca.tvF.uux);
        if (!bg.mZ(parama)) {
          locale.field_recxml = parama;
        }
        locale.field_adinfo = com.tencent.mm.platformtools.n.a(paramca.tvG);
        locale.field_adxml = locale.field_recxml;
        ae.bhr().a(localbdk.tDg, locale);
        GMTrace.o(8042057826304L, 59918);
      }
    }
  }
  
  private static void a(LinkedList<ca> paramLinkedList, LinkedList<bdk> paramLinkedList1, boolean paramBoolean)
  {
    GMTrace.i(8042997350400L, 59925);
    if ((paramLinkedList == null) || (paramLinkedList1 == null) || (paramLinkedList1.size() == 0))
    {
      GMTrace.o(8042997350400L, 59925);
      return;
    }
    int k = a((bdk)paramLinkedList1.get(paramLinkedList1.size() - 1));
    int i = 0;
    if (i < paramLinkedList.size())
    {
      ca localca = (ca)paramLinkedList.get(i);
      if (localca == null) {
        w.i("MicroMsg.AdSnsInfoStorageLogic", "ad is null");
      }
      Object localObject;
      com.tencent.mm.plugin.sns.storage.a locala;
      for (;;)
      {
        i += 1;
        break;
        if (localca.tvF == null)
        {
          w.i("MicroMsg.AdSnsInfoStorageLogic", "item.SnsADObject is null");
        }
        else if (localca.tvF.uuw == null)
        {
          w.i("MicroMsg.AdSnsInfoStorageLogic", "item.SnsADObject.SnsObject is null");
        }
        else if ((paramBoolean) && (ae.bhr().dJ(localca.tvF.uuw.tDg)))
        {
          w.i("MicroMsg.AdSnsInfoStorageLogic", "snsId %d already exist, ignore ", new Object[] { Long.valueOf(localca.tvF.uuw.tDg) });
        }
        else
        {
          localObject = com.tencent.mm.platformtools.n.a(localca.tvG);
          String str1 = com.tencent.mm.platformtools.n.a(localca.tvF.uux);
          String str2 = com.tencent.mm.platformtools.n.b(localca.tvF.uuw.uve);
          locala = new com.tencent.mm.plugin.sns.storage.a((String)localObject);
          w.i("MicroMsg.AdSnsInfoStorageLogic", "skXml " + (String)localObject);
          w.i("MicroMsg.AdSnsInfoStorageLogic", "adXml " + str1);
          w.i("MicroMsg.AdSnsInfoStorageLogic", "snsXml " + str2 + "\r\n");
          localObject = new b(str1);
          if ((((b)localObject).qlT == 0L) || (!dq(((b)localObject).qlT))) {
            break label375;
          }
          w.w("MicroMsg.AdSnsInfoStorageLogic", "ignore recvd ad filter by originSnsId " + ((b)localObject).qlT);
        }
      }
      label375:
      int j = k + 1;
      if ((locala.qkX < paramLinkedList1.size()) && (locala.qkX >= 0))
      {
        j = a((bdk)paramLinkedList1.get(locala.qkX)) + 1;
        w.i("MicroMsg.AdSnsInfoStorageLogic", "create adinfo time  " + j + " pos " + locala.qkX);
      }
      for (;;)
      {
        int m = (int)(System.currentTimeMillis() / 1000L);
        w.i("MicroMsg.AdSnsInfoStorageLogic", "gettime " + m);
        a(localca, j, m, locala);
        dr(localca.tvF.uuw.tDg);
        dr(((b)localObject).qlT);
        break;
        w.w("MicroMsg.AdSnsInfoStorageLogic", "invalid ad.pos " + locala.qkX);
      }
    }
    GMTrace.o(8042997350400L, 59925);
  }
  
  public static boolean a(long paramLong, bcu parambcu)
  {
    GMTrace.i(8044071092224L, 59933);
    bct localbct = parambcu.uuL;
    if ((localbct.jXP != 7) && (localbct.jXP != 8))
    {
      GMTrace.o(8044071092224L, 59933);
      return false;
    }
    com.tencent.mm.plugin.sns.storage.e locale = ae.bhr().dI(paramLong);
    if (locale == null)
    {
      w.i("MicroMsg.AdSnsInfoStorageLogic", "pass the action because the snsinfo is null " + paramLong);
      GMTrace.o(8044071092224L, 59933);
      return false;
    }
    for (;;)
    {
      try
      {
        localbdk = (bdk)new bdk().aC(locale.field_attrBuf);
        localbdk.tDg = paramLong;
        if (localbct.jXP != 7) {
          continue;
        }
        localIterator = localbdk.uvi.iterator();
        if (localIterator.hasNext())
        {
          localbcz = (bcz)localIterator.next();
          if ((localbcz.orU != localbct.orU) || (!localbcz.twR.equals(localbct.upg))) {
            continue;
          }
          w.i("MicroMsg.AdSnsInfoStorageLogic", "like create time " + localbcz.orU + " ");
          GMTrace.o(8044071092224L, 59933);
          return false;
        }
        localbdk.uvi.add(ac.a(parambcu));
        locale.aE(localbdk.toByteArray());
        ae.bhr().a(localbdk.tDg, locale);
      }
      catch (Exception parambcu)
      {
        bdk localbdk;
        Iterator localIterator;
        bcz localbcz;
        w.e("MicroMsg.AdSnsInfoStorageLogic", "e " + parambcu.getMessage());
        w.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", parambcu, "", new Object[0]);
        continue;
      }
      GMTrace.o(8044071092224L, 59933);
      return true;
      if (localbct.jXP == 8)
      {
        localIterator = localbdk.uvl.iterator();
        if (localIterator.hasNext())
        {
          localbcz = (bcz)localIterator.next();
          if ((localbcz.orU == localbct.orU) && (localbcz.twR.equals(localbct.upg)))
          {
            w.i("MicroMsg.AdSnsInfoStorageLogic", "like create time " + localbcz.orU + " ");
            GMTrace.o(8044071092224L, 59933);
            return false;
          }
        }
        else
        {
          localbdk.uvl.add(ac.a(parambcu));
        }
      }
    }
  }
  
  public static boolean a(long paramLong, bcu parambcu, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    GMTrace.i(8043936874496L, 59932);
    Object localObject1;
    if (parambcu != null)
    {
      localObject1 = parambcu.uuL;
      if ((((bct)localObject1).jXP != 7) && (((bct)localObject1).jXP != 8))
      {
        GMTrace.o(8043936874496L, 59932);
        return false;
      }
    }
    Object localObject3 = com.tencent.mm.x.m.zF();
    if ((parambcu != null) && (parambcu.uuM != null) && (parambcu.uuM.upg != null) && (parambcu.uuM.upg.equals(localObject3)))
    {
      GMTrace.o(8043936874496L, 59932);
      return true;
    }
    Object localObject2 = ae.bhr().dI(paramLong);
    int k;
    Object localObject4;
    long l;
    for (;;)
    {
      try
      {
        localObject1 = (bdk)new bdk().aC(((com.tencent.mm.plugin.sns.storage.e)localObject2).field_attrBuf);
        ((bdk)localObject1).tDg = paramLong;
        k = ((com.tencent.mm.plugin.sns.storage.e)localObject2).field_firstControlTime;
        parambcu = parambcu.uuL;
        if (parambcu.jXP != 7) {
          break;
        }
        if ((paramInt2 <= 0) || (k + paramInt2 >= parambcu.orU)) {
          break label798;
        }
        if (paramBoolean)
        {
          localObject3 = ae.bhp().Hz(((com.tencent.mm.plugin.sns.storage.e)localObject2).bjM());
          if (localObject3 == null) {
            break label475;
          }
          localObject4 = ((com.tencent.mm.plugin.sns.storage.m)localObject3).bjJ();
          if (localObject4 == null) {
            continue;
          }
          localObject3 = (c)com.tencent.mm.kernel.h.h(c.class);
          i = ((com.tencent.mm.plugin.sns.storage.e)localObject2).getSource();
          l = u.HU(((com.tencent.mm.plugin.sns.storage.e)localObject2).bjM());
          localObject2 = ((com.tencent.mm.plugin.sns.storage.a)localObject4).iLj;
          if (((bdk)localObject1).uvi != null)
          {
            paramInt1 = ((bdk)localObject1).uvi.size();
            if (((bdk)localObject1).uvl == null) {
              continue;
            }
            paramInt3 = ((bdk)localObject1).uvl.size();
            ((c)localObject3).a(13182, i, new Object[] { Long.valueOf(l), localObject2, Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(paramInt1), Integer.valueOf(paramInt3), Integer.valueOf((int)(System.currentTimeMillis() / 1000L)) });
          }
        }
        else
        {
          w.i("MicroMsg.AdSnsInfoStorageLogic", "snsid " + paramLong + " firstCreateTime " + k + " actionLikeTimeLimit: " + paramInt2 + " curAction.createTime: " + parambcu.orU + "is over the time limit!");
          GMTrace.o(8043936874496L, 59932);
          return false;
        }
        paramInt1 = 0;
        continue;
        paramInt3 = 0;
        continue;
        w.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the adinfo is null!");
        continue;
        GMTrace.o(8043936874496L, 59932);
      }
      catch (Exception parambcu)
      {
        w.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", parambcu, "", new Object[0]);
      }
      return true;
      label475:
      w.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the snsInfo is null!");
    }
    if ((parambcu.jXP == 8) && (paramInt3 > 0) && (k + paramInt3 < parambcu.orU))
    {
      if (paramBoolean)
      {
        localObject3 = ae.bhp().Hz(((com.tencent.mm.plugin.sns.storage.e)localObject2).bjM());
        if (localObject3 == null) {
          break label787;
        }
        localObject4 = ((com.tencent.mm.plugin.sns.storage.m)localObject3).bjJ();
        if (localObject4 == null) {
          break label776;
        }
        localObject3 = (c)com.tencent.mm.kernel.h.h(c.class);
        i = ((com.tencent.mm.plugin.sns.storage.e)localObject2).getSource();
        l = u.HU(((com.tencent.mm.plugin.sns.storage.e)localObject2).bjM());
        localObject2 = ((com.tencent.mm.plugin.sns.storage.a)localObject4).iLj;
        if (((bdk)localObject1).uvi == null) {
          break label765;
        }
        paramInt1 = ((bdk)localObject1).uvi.size();
        if (((bdk)localObject1).uvl == null) {
          break label770;
        }
        paramInt2 = ((bdk)localObject1).uvl.size();
        label617:
        ((c)localObject3).a(13182, i, new Object[] { Long.valueOf(l), localObject2, Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf((int)(System.currentTimeMillis() / 1000L)) });
      }
      for (;;)
      {
        w.i("MicroMsg.AdSnsInfoStorageLogic", "snsid " + paramLong + " firstCreateTime " + k + " actionCommentTimeLimit: " + paramInt3 + " curAction.createTime: " + parambcu.orU + "is over the time limit!");
        GMTrace.o(8043936874496L, 59932);
        return false;
        label765:
        paramInt1 = 0;
        break;
        label770:
        paramInt2 = 0;
        break label617;
        label776:
        w.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the adinfo is null!");
        continue;
        label787:
        w.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the snsInfo is null!");
      }
    }
    label798:
    int i = 0;
    parambcu = ((bdk)localObject1).uvi.iterator();
    label810:
    int j;
    if (parambcu.hasNext())
    {
      localObject4 = (bcz)parambcu.next();
      if (((bcz)localObject4).orU > k)
      {
        if ((localObject4 == null) || (((bcz)localObject4).twR == null)) {
          break label1243;
        }
        if (!((bcz)localObject4).twR.equals(localObject3)) {
          break label1243;
        }
      }
    }
    else
    {
      j = 0;
      parambcu = ((bdk)localObject1).uvl.iterator();
    }
    label1121:
    label1204:
    label1209:
    label1215:
    label1226:
    label1243:
    label1249:
    label1252:
    label1258:
    for (;;)
    {
      if (parambcu.hasNext())
      {
        localObject4 = (bcz)parambcu.next();
        if (((bcz)localObject4).orU > k)
        {
          if ((localObject4 == null) || (((bcz)localObject4).twR == null)) {
            break label1252;
          }
          if (!((bcz)localObject4).twR.equals(localObject3)) {
            break label1252;
          }
        }
      }
      else
      {
        i = i + 0 + j;
        w.i("MicroMsg.AdSnsInfoStorageLogic", "totalsize " + i + " firstCreateTime " + k + " actionLimit: " + paramInt1 + " actionLikeTimeLimit: " + paramInt2 + " actionCommentTimeLimit: " + paramInt3);
        if (i < paramInt1) {
          break;
        }
        if (paramBoolean)
        {
          parambcu = ae.bhp().Hz(((com.tencent.mm.plugin.sns.storage.e)localObject2).bjM());
          if (parambcu == null) {
            break label1226;
          }
          localObject3 = parambcu.bjJ();
          if (localObject3 == null) {
            break label1215;
          }
          parambcu = (c)com.tencent.mm.kernel.h.h(c.class);
          paramInt3 = ((com.tencent.mm.plugin.sns.storage.e)localObject2).getSource();
          paramLong = u.HU(((com.tencent.mm.plugin.sns.storage.e)localObject2).bjM());
          localObject2 = ((com.tencent.mm.plugin.sns.storage.a)localObject3).iLj;
          if (((bdk)localObject1).uvi == null) {
            break label1204;
          }
          paramInt1 = ((bdk)localObject1).uvi.size();
          if (((bdk)localObject1).uvl == null) {
            break label1209;
          }
          paramInt2 = ((bdk)localObject1).uvl.size();
          parambcu.a(13182, paramInt3, new Object[] { Long.valueOf(paramLong), localObject2, Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf((int)(System.currentTimeMillis() / 1000L)) });
        }
        for (;;)
        {
          GMTrace.o(8043936874496L, 59932);
          return false;
          paramInt1 = 0;
          break;
          paramInt2 = 0;
          break label1121;
          w.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the adinfo is null!");
          continue;
          w.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the snsInfo is null!");
        }
      }
      break label1258;
      break label1249;
      i += 1;
      break label810;
      j += 1;
    }
  }
  
  private static boolean a(bcz parambcz, List<bcz> paramList)
  {
    GMTrace.i(8041789390848L, 59916);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      bcz localbcz = (bcz)paramList.next();
      if ((!bg.mZ(parambcz.twR)) && (parambcz.twR.equals(localbcz.twR)))
      {
        GMTrace.o(8041789390848L, 59916);
        return true;
      }
    }
    GMTrace.o(8041789390848L, 59916);
    return false;
  }
  
  private static LinkedList<ca> af(LinkedList<avx> paramLinkedList)
  {
    GMTrace.i(8042863132672L, 59924);
    LinkedList localLinkedList = new LinkedList();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      ca localca = a((avx)paramLinkedList.next());
      if (localca != null) {
        localLinkedList.add(localca);
      }
    }
    GMTrace.o(8042863132672L, 59924);
    return localLinkedList;
  }
  
  public static void ag(LinkedList<avx> paramLinkedList)
  {
    GMTrace.i(8043131568128L, 59926);
    if ((paramLinkedList != null) && (!paramLinkedList.isEmpty()))
    {
      paramLinkedList = af(paramLinkedList);
      w.i("MicroMsg.AdSnsInfoStorageLogic", "convert " + paramLinkedList.size() + " recObj to AdvertiseObj");
      ah(paramLinkedList);
    }
    GMTrace.o(8043131568128L, 59926);
  }
  
  public static void ah(LinkedList<ca> paramLinkedList)
  {
    GMTrace.i(8043265785856L, 59927);
    if (paramLinkedList == null)
    {
      GMTrace.o(8043265785856L, 59927);
      return;
    }
    int i = 0;
    while (i < paramLinkedList.size())
    {
      a((ca)paramLinkedList.get(i));
      i += 1;
    }
    GMTrace.o(8043265785856L, 59927);
  }
  
  public static void ai(LinkedList<bdk> paramLinkedList)
  {
    GMTrace.i(8043534221312L, 59929);
    if (paramLinkedList == null)
    {
      GMTrace.o(8043534221312L, 59929);
      return;
    }
    com.tencent.mm.plugin.sns.storage.n localn = ae.bhp();
    int i = 0;
    while (i < paramLinkedList.size())
    {
      Object localObject = (bdk)paramLinkedList.get(i);
      if (localObject != null)
      {
        localObject = localn.dP(((bdk)localObject).tDg);
        if (localObject != null)
        {
          localObject = ((com.tencent.mm.plugin.sns.storage.m)localObject).bjL();
          if ((localObject != null) && (!bg.mZ(((bhc)localObject).qAC))) {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.f.bjE().d("adId", ((bhc)localObject).qAC, "adxml", 0);
          }
        }
      }
      i += 1;
    }
    GMTrace.o(8043534221312L, 59929);
  }
  
  private static bcp b(bdy parambdy)
  {
    GMTrace.i(8042192044032L, 59919);
    if (parambdy != null)
    {
      bcp localbcp = new bcp();
      localbcp.uux = parambdy.uvX;
      if (localbcp.uux == null) {
        w.i("MicroMsg.AdSnsInfoStorageLogic", "recommendObj.RecommendXml is null");
      }
      localbcp.uuw = parambdy.uuw;
      GMTrace.o(8042192044032L, 59919);
      return localbcp;
    }
    GMTrace.o(8042192044032L, 59919);
    return null;
  }
  
  public static void b(avx paramavx)
  {
    GMTrace.i(8042460479488L, 59921);
    ca localca = a(paramavx);
    if (localca == null)
    {
      GMTrace.o(8042460479488L, 59921);
      return;
    }
    com.tencent.mm.plugin.sns.storage.a locala = new com.tencent.mm.plugin.sns.storage.a(com.tencent.mm.platformtools.n.a(localca.tvG));
    int j = locala.qkX;
    Object localObject;
    if (j <= 0)
    {
      i = 1;
      int k = ae.bhp().HN("");
      w.i("MicroMsg.AdSnsInfoStorageLogic", "ad.pos = %d, dbLimit = %d, createTime.limit = %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(k) });
      com.tencent.mm.plugin.sns.storage.n localn = ae.bhp();
      paramavx = com.tencent.mm.plugin.sns.storage.n.qvf + " from SnsInfo where ";
      localObject = paramavx + com.tencent.mm.plugin.sns.storage.n.bkw();
      paramavx = (avx)localObject;
      if (com.tencent.mm.plugin.sns.storage.n.HI("")) {
        paramavx = (String)localObject + " AND " + localn.HJ("");
      }
      paramavx = paramavx + " AND createTime >= " + k;
      paramavx = paramavx + " UNION ";
      paramavx = paramavx + com.tencent.mm.plugin.sns.storage.n.qvf + " from AdSnsInfo where createTime" + " > " + k;
      paramavx = paramavx + com.tencent.mm.plugin.sns.storage.n.qvg;
      paramavx = paramavx + " limit " + i;
      w.d("MicroMsg.SnsInfoStorage", "getAdCursorForTimeLine " + paramavx + " limtiSeq: " + "");
      paramavx = localn.gMB.rawQuery(paramavx, null);
      if ((paramavx == null) || (paramavx.getCount() <= 0)) {
        break label553;
      }
      w.i("MicroMsg.AdSnsInfoStorageLogic", "db return %d feeds", new Object[] { Integer.valueOf(paramavx.getCount()) });
      localObject = new com.tencent.mm.plugin.sns.storage.m();
      if (j >= 0) {
        break label532;
      }
      i = 0;
      label426:
      if (!paramavx.moveToPosition(i)) {
        break label537;
      }
      ((com.tencent.mm.plugin.sns.storage.m)localObject).b(paramavx);
    }
    label442:
    for (int i = ((com.tencent.mm.plugin.sns.storage.m)localObject).field_createTime + 1;; i = (int)bg.Po())
    {
      paramavx.close();
      w.i("MicroMsg.AdSnsInfoStorageLogic", "inserting snsid  " + localca.tvF.uuw.tDg + " ,createTime " + i);
      a(localca, i, (int)bg.Po(), locala);
      a(localca);
      GMTrace.o(8042460479488L, 59921);
      return;
      i = j + 1;
      break;
      label532:
      i = j;
      break label426;
      label537:
      paramavx.moveToLast();
      ((com.tencent.mm.plugin.sns.storage.m)localObject).b(paramavx);
      break label442;
      label553:
      w.i("MicroMsg.AdSnsInfoStorageLogic", "db return nothing");
    }
  }
  
  public static void b(bcp parambcp)
  {
    GMTrace.i(8041386737664L, 59913);
    if (parambcp == null)
    {
      w.i("MicroMsg.AdSnsInfoStorageLogic", "error adobj");
      GMTrace.o(8041386737664L, 59913);
      return;
    }
    if (parambcp.uuw == null)
    {
      w.i("MicroMsg.AdSnsInfoStorageLogic", "error adobj");
      GMTrace.o(8041386737664L, 59913);
      return;
    }
    com.tencent.mm.plugin.sns.storage.e locale = c(parambcp);
    ae.bhr().a(parambcp.uuw.tDg, locale);
    GMTrace.o(8041386737664L, 59913);
  }
  
  private static boolean b(bcz parambcz, List<bcz> paramList)
  {
    GMTrace.i(8041923608576L, 59917);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      bcz localbcz = (bcz)paramList.next();
      if ((parambcz.uuH == localbcz.uuH) && (localbcz.uuH != 0L))
      {
        GMTrace.o(8041923608576L, 59917);
        return true;
      }
    }
    GMTrace.o(8041923608576L, 59917);
    return false;
  }
  
  /* Error */
  private static void bgr()
  {
    // Byte code:
    //   0: ldc2_w 763
    //   3: ldc_w 765
    //   6: invokestatic 27	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: getstatic 767	com/tencent/mm/plugin/sns/model/a:pZO	Ljava/util/LinkedHashMap;
    //   12: ifnonnull +77 -> 89
    //   15: getstatic 59	com/tencent/mm/plugin/sns/model/a:pZN	Ljava/lang/String;
    //   18: invokestatic 773	com/tencent/mm/pluginsdk/j/a/e/a:NZ	(Ljava/lang/String;)[B
    //   21: astore_0
    //   22: aload_0
    //   23: ifnull +41 -> 64
    //   26: new 775	java/io/ByteArrayInputStream
    //   29: dup
    //   30: aload_0
    //   31: invokespecial 777	java/io/ByteArrayInputStream:<init>	([B)V
    //   34: astore_0
    //   35: new 779	java/io/ObjectInputStream
    //   38: dup
    //   39: aload_0
    //   40: invokespecial 782	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   43: astore_1
    //   44: aload_1
    //   45: astore_0
    //   46: aload_1
    //   47: invokeinterface 787 1 0
    //   52: checkcast 789	java/util/LinkedHashMap
    //   55: putstatic 767	com/tencent/mm/plugin/sns/model/a:pZO	Ljava/util/LinkedHashMap;
    //   58: aload_1
    //   59: invokeinterface 790 1 0
    //   64: getstatic 767	com/tencent/mm/plugin/sns/model/a:pZO	Ljava/util/LinkedHashMap;
    //   67: ifnonnull +22 -> 89
    //   70: new 8	com/tencent/mm/plugin/sns/model/a$2
    //   73: dup
    //   74: ldc2_w 791
    //   77: invokestatic 798	java/lang/Math:ceil	(D)D
    //   80: d2i
    //   81: iconst_1
    //   82: iadd
    //   83: invokespecial 801	com/tencent/mm/plugin/sns/model/a$2:<init>	(I)V
    //   86: putstatic 767	com/tencent/mm/plugin/sns/model/a:pZO	Ljava/util/LinkedHashMap;
    //   89: ldc2_w 763
    //   92: ldc_w 765
    //   95: invokestatic 65	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   98: return
    //   99: astore_2
    //   100: aconst_null
    //   101: astore_1
    //   102: aload_1
    //   103: astore_0
    //   104: ldc -115
    //   106: aload_2
    //   107: invokestatic 805	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   110: invokestatic 529	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   113: aload_1
    //   114: ifnull -50 -> 64
    //   117: aload_1
    //   118: invokeinterface 790 1 0
    //   123: goto -59 -> 64
    //   126: astore_0
    //   127: goto -63 -> 64
    //   130: astore_2
    //   131: aconst_null
    //   132: astore_1
    //   133: aload_1
    //   134: astore_0
    //   135: ldc -115
    //   137: aload_2
    //   138: invokestatic 805	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   141: invokestatic 529	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   144: aload_1
    //   145: ifnull -81 -> 64
    //   148: aload_1
    //   149: invokeinterface 790 1 0
    //   154: goto -90 -> 64
    //   157: astore_0
    //   158: goto -94 -> 64
    //   161: astore_2
    //   162: aconst_null
    //   163: astore_1
    //   164: aload_1
    //   165: astore_0
    //   166: ldc -115
    //   168: aload_2
    //   169: invokestatic 805	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   172: invokestatic 529	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   175: aload_1
    //   176: ifnull -112 -> 64
    //   179: aload_1
    //   180: invokeinterface 790 1 0
    //   185: goto -121 -> 64
    //   188: astore_0
    //   189: goto -125 -> 64
    //   192: astore_1
    //   193: aconst_null
    //   194: astore_0
    //   195: aload_0
    //   196: ifnull +9 -> 205
    //   199: aload_0
    //   200: invokeinterface 790 1 0
    //   205: aload_1
    //   206: athrow
    //   207: astore_0
    //   208: goto -144 -> 64
    //   211: astore_0
    //   212: goto -7 -> 205
    //   215: astore_1
    //   216: goto -21 -> 195
    //   219: astore_2
    //   220: goto -56 -> 164
    //   223: astore_2
    //   224: goto -91 -> 133
    //   227: astore_2
    //   228: goto -126 -> 102
    // Local variable table:
    //   start	length	slot	name	signature
    //   21	83	0	localObject1	Object
    //   126	1	0	localIOException1	IOException
    //   134	1	0	localObject2	Object
    //   157	1	0	localIOException2	IOException
    //   165	1	0	localObject3	Object
    //   188	1	0	localIOException3	IOException
    //   194	6	0	localObject4	Object
    //   207	1	0	localIOException4	IOException
    //   211	1	0	localIOException5	IOException
    //   43	137	1	localObjectInputStream	java.io.ObjectInputStream
    //   192	14	1	localObject5	Object
    //   215	1	1	localObject6	Object
    //   99	8	2	localStreamCorruptedException1	java.io.StreamCorruptedException
    //   130	8	2	localIOException6	IOException
    //   161	8	2	localClassNotFoundException1	ClassNotFoundException
    //   219	1	2	localClassNotFoundException2	ClassNotFoundException
    //   223	1	2	localIOException7	IOException
    //   227	1	2	localStreamCorruptedException2	java.io.StreamCorruptedException
    // Exception table:
    //   from	to	target	type
    //   35	44	99	java/io/StreamCorruptedException
    //   117	123	126	java/io/IOException
    //   35	44	130	java/io/IOException
    //   148	154	157	java/io/IOException
    //   35	44	161	java/lang/ClassNotFoundException
    //   179	185	188	java/io/IOException
    //   35	44	192	finally
    //   58	64	207	java/io/IOException
    //   199	205	211	java/io/IOException
    //   46	58	215	finally
    //   104	113	215	finally
    //   135	144	215	finally
    //   166	175	215	finally
    //   46	58	219	java/lang/ClassNotFoundException
    //   46	58	223	java/io/IOException
    //   46	58	227	java/io/StreamCorruptedException
  }
  
  private static com.tencent.mm.plugin.sns.storage.e c(bcp parambcp)
  {
    GMTrace.i(8041520955392L, 59914);
    locale = ae.bhr().dI(parambcp.uuw.tDg);
    localbdk = parambcp.uuw;
    localObject1 = null;
    if (locale == null) {
      locale = new com.tencent.mm.plugin.sns.storage.e();
    }
    for (;;)
    {
      localObject2 = com.tencent.mm.platformtools.n.b(localbdk.uve);
      if (!bg.mZ((String)localObject2)) {
        break;
      }
      GMTrace.o(8041520955392L, 59914);
      return null;
      localObject1 = locale.bjL().qBT;
    }
    if (!locale.Hy((String)localObject2))
    {
      GMTrace.o(8041520955392L, 59914);
      return null;
    }
    if (!bg.mZ((String)localObject1))
    {
      localObject2 = locale.bjL();
      ((bhc)localObject2).qBT = ((String)localObject1);
      locale.c((bhc)localObject2);
    }
    localbdk.uvv = ai.b(localbdk.uvv, locale.field_attrBuf);
    w.d("MicroMsg.AdSnsInfoStorageLogic", "from server xml ok %d", new Object[] { Long.valueOf(localbdk.tDg) });
    localbdk.uve.bd(new byte[0]);
    locale.field_userName = localbdk.twR;
    if (parambcp.uux != null)
    {
      parambcp = com.tencent.mm.platformtools.n.a(parambcp.uux);
      if (!bg.mZ(parambcp)) {
        locale.field_recxml = parambcp;
      }
      parambcp = locale.field_recxml;
      if ((!bg.mZ(parambcp)) && (!parambcp.equals(locale.field_adxml)))
      {
        w.i("MicroMsg.AdSnsInfoStorageLogic", "update field adxml " + parambcp);
        locale.field_adxml = parambcp;
      }
    }
    locale.field_likeFlag = localbdk.uvf;
    long l = localbdk.tDg;
    locale.field_snsId = l;
    if (l != 0L)
    {
      locale.field_stringSeq = i.jdMethod_do(l);
      locale.field_stringSeq = i.Gf(locale.field_stringSeq);
      w.d("MicroMsg.AdSnsInfo", l + " stringSeq " + locale.field_stringSeq);
    }
    locale.uD(2);
    locale.uD(32);
    try
    {
      if (locale.field_attrBuf == null) {
        parambcp = new bdk();
      }
      for (;;)
      {
        Object localObject3;
        Iterator localIterator;
        bcz localbcz;
        if ((parambcp != null) && (parambcp.uvl != null))
        {
          localObject1 = new LinkedList();
          localObject2 = localbdk.uvl.iterator();
          for (;;)
          {
            if (!((Iterator)localObject2).hasNext()) {
              break label691;
            }
            localObject3 = (bcz)((Iterator)localObject2).next();
            if (((bcz)localObject3).ujq > 0)
            {
              ((List)localObject1).add(localObject3);
              localIterator = parambcp.uvl.iterator();
              if (localIterator.hasNext())
              {
                localbcz = (bcz)localIterator.next();
                if (localbcz.uuH != ((bcz)localObject3).uuH) {
                  break;
                }
                parambcp.uvl.remove(localbcz);
              }
            }
          }
        }
        try
        {
          for (;;)
          {
            locale.aE(localbdk.toByteArray());
            parambcp = locale.bjL();
            parambcp.jWW = localbdk.twR;
            locale.field_pravited = parambcp.uhC;
            w.d("MicroMsg.AdSnsInfoStorageLogic", "ext flag " + localbdk.ujv + " " + localbdk.uvl.size() + " " + localbdk.uvi.size());
            locale.c(parambcp);
            locale.field_type = parambcp.uyu.tKc;
            locale.field_subType = parambcp.uyu.tKe;
            GMTrace.o(8041520955392L, 59914);
            return locale;
            parambcp = (bdk)new bdk().aC(locale.field_attrBuf);
            break;
            localObject2 = ((List)localObject1).iterator();
            while (((Iterator)localObject2).hasNext())
            {
              localObject3 = (bcz)((Iterator)localObject2).next();
              localbdk.uvl.remove(localObject3);
            }
            ((List)localObject1).clear();
            localObject1 = parambcp.uvl.iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject2 = (bcz)((Iterator)localObject1).next();
              if ((!b((bcz)localObject2, localbdk.uvl)) && (((bcz)localObject2).uuH != 0L))
              {
                com.tencent.mm.kernel.h.xA();
                localObject3 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yL().SL(((bcz)localObject2).twR);
                if ((localObject3 != null) && (com.tencent.mm.l.a.eE(((af)localObject3).field_type)) && (!((x)localObject3).vf()))
                {
                  localbdk.uvl.add(localObject2);
                  localbdk.uvk = localbdk.uvl.size();
                }
                else
                {
                  w.i("MicroMsg.AdSnsInfoStorageLogic", "not in ommentlist not mycontact " + ((bcz)localObject2).twR);
                }
              }
            }
            Collections.sort(localbdk.uvl, pZP);
            if (localbdk.uvi != null)
            {
              localObject1 = new LinkedList();
              localObject2 = localbdk.uvi.iterator();
              for (;;)
              {
                if (!((Iterator)localObject2).hasNext()) {
                  break label1056;
                }
                localObject3 = (bcz)((Iterator)localObject2).next();
                if (((bcz)localObject3).ujq > 0)
                {
                  ((List)localObject1).add(localObject3);
                  localIterator = parambcp.uvi.iterator();
                  if (localIterator.hasNext())
                  {
                    localbcz = (bcz)localIterator.next();
                    if ((!bg.mZ(localbcz.twR)) && (!localbcz.twR.equals(((bcz)localObject3).twR))) {
                      break;
                    }
                    parambcp.uvi.remove(localbcz);
                  }
                }
              }
              localObject2 = ((List)localObject1).iterator();
              while (((Iterator)localObject2).hasNext())
              {
                localObject3 = (bcz)((Iterator)localObject2).next();
                localbdk.uvi.remove(localObject3);
              }
              ((List)localObject1).clear();
              if ((parambcp != null) && (parambcp.uvi != null))
              {
                parambcp = parambcp.uvi.iterator();
                while (parambcp.hasNext())
                {
                  localObject1 = (bcz)parambcp.next();
                  if (!a((bcz)localObject1, localbdk.uvi))
                  {
                    com.tencent.mm.kernel.h.xA();
                    localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yL().SL(((bcz)localObject1).twR);
                    if ((localObject2 != null) && (com.tencent.mm.l.a.eE(((af)localObject2).field_type)) && (!((x)localObject2).vf()))
                    {
                      localbdk.uvi.add(localObject1);
                      localbdk.uvh = localbdk.uvi.size();
                    }
                    else
                    {
                      w.i("MicroMsg.AdSnsInfoStorageLogic", "not in likelist not mycontact " + ((bcz)localObject1).twR);
                    }
                  }
                }
              }
              Collections.sort(localbdk.uvi, pZP);
            }
          }
        }
        catch (Exception parambcp)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", parambcp, "", new Object[0]);
          }
        }
      }
    }
    catch (Exception parambcp)
    {
      w.i("MicroMsg.AdSnsInfoStorageLogic", "error " + parambcp.getMessage());
      w.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", parambcp, "", new Object[0]);
    }
  }
  
  public static void d(LinkedList<avx> paramLinkedList, LinkedList<bdk> paramLinkedList1)
  {
    GMTrace.i(8042594697216L, 59922);
    if (paramLinkedList != null)
    {
      paramLinkedList = af(paramLinkedList);
      w.i("MicroMsg.AdSnsInfoStorageLogic", "convert " + paramLinkedList.size() + " recObj to AdvertiseObj");
      Iterator localIterator = paramLinkedList.iterator();
      while (localIterator.hasNext())
      {
        ca localca = (ca)localIterator.next();
        if (dq(localca.tvF.uuw.tDg))
        {
          w.w("MicroMsg.AdSnsInfoStorageLogic", "ignore recvd ad filter by snsId " + localca.tvF.uuw.tDg);
          localIterator.remove();
        }
      }
      a(paramLinkedList, paramLinkedList1, true);
    }
    GMTrace.o(8042594697216L, 59922);
  }
  
  private static boolean dq(long paramLong)
  {
    GMTrace.i(8044205309952L, 59934);
    bgr();
    if (pZO.get(Long.valueOf(paramLong)) != null)
    {
      GMTrace.o(8044205309952L, 59934);
      return true;
    }
    GMTrace.o(8044205309952L, 59934);
    return false;
  }
  
  private static void dr(long paramLong)
  {
    GMTrace.i(8044473745408L, 59936);
    if (paramLong == 0L)
    {
      GMTrace.o(8044473745408L, 59936);
      return;
    }
    if (pZO == null) {
      bgr();
    }
    pZO.put(Long.valueOf(paramLong), Integer.valueOf(0));
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      Object localObject1 = new ObjectOutputStream(localByteArrayOutputStream);
      ((ObjectOutput)localObject1).writeObject(pZO);
      ((ObjectOutput)localObject1).flush();
      localObject1 = localByteArrayOutputStream.toByteArray();
      com.tencent.mm.pluginsdk.j.a.e.a.u(pZN, (byte[])localObject1);
      try
      {
        localByteArrayOutputStream.close();
        GMTrace.o(8044473745408L, 59936);
        return;
      }
      catch (IOException localIOException1)
      {
        GMTrace.o(8044473745408L, 59936);
        return;
      }
      try
      {
        localIOException2.close();
        throw ((Throwable)localObject2);
      }
      catch (IOException localIOException3)
      {
        for (;;) {}
      }
    }
    catch (IOException localIOException4)
    {
      localIOException4 = localIOException4;
      w.e("MicroMsg.AdSnsInfoStorageLogic", bg.f(localIOException4));
      try
      {
        localIOException1.close();
        GMTrace.o(8044473745408L, 59936);
        return;
      }
      catch (IOException localIOException2)
      {
        GMTrace.o(8044473745408L, 59936);
        return;
      }
    }
    finally {}
  }
  
  public static void e(LinkedList<ca> paramLinkedList, LinkedList<bdk> paramLinkedList1)
  {
    GMTrace.i(8042728914944L, 59923);
    a(paramLinkedList, paramLinkedList1, false);
    GMTrace.o(8042728914944L, 59923);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */