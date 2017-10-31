package com.tencent.mm.plugin.card.sharecard.a;

import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.b.s;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.plugin.card.sharecard.model.i;
import com.tencent.mm.plugin.card.sharecard.model.k;
import com.tencent.mm.plugin.card.sharecard.model.m;
import com.tencent.mm.plugin.card.sharecard.model.p;
import com.tencent.mm.plugin.card.sharecard.model.r;
import com.tencent.mm.plugin.card.sharecard.ui.b.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class b
{
  private static boolean hjm;
  public static boolean kqB;
  public b.a kqA;
  private Context mContext;
  
  static
  {
    GMTrace.i(5097589309440L, 37980);
    hjm = false;
    kqB = false;
    GMTrace.o(5097589309440L, 37980);
  }
  
  public b(Context paramContext)
  {
    GMTrace.i(5093294342144L, 37948);
    this.kqA = null;
    this.mContext = paramContext;
    kqB = false;
    GMTrace.o(5093294342144L, 37948);
  }
  
  private static void C(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(5096247132160L, 37970);
    Object localObject = (Map)al.ajH().getValue("key_share_user_info_map");
    if (localObject == null) {
      localObject = new HashMap();
    }
    for (;;)
    {
      ArrayList localArrayList = (ArrayList)((Map)localObject).get(paramString2);
      if (localArrayList == null) {
        localArrayList = new ArrayList();
      }
      for (;;)
      {
        int i = 0;
        while (i < localArrayList.size())
        {
          r localr = (r)localArrayList.get(i);
          if ((paramString3 != null) && (paramString3.equals(localr.krc)))
          {
            localr.kre = false;
            localr.cxy -= 1;
            localr.krd.remove(paramString1);
            localArrayList.set(i, localr);
          }
          i += 1;
        }
        ((Map)localObject).put(paramString2, localArrayList);
        al.ajH().putValue("key_share_user_info_map", localObject);
        GMTrace.o(5096247132160L, 37970);
        return;
      }
    }
  }
  
  public static void O(Context paramContext, String paramString)
  {
    GMTrace.i(5096515567616L, 37972);
    w.i("MicroMsg.ShareCardDataMgr", "updateCardCountbyCardTpId() card_tp_id:" + paramString);
    Object localObject1 = (Map)al.ajH().getValue("key_share_card_count_map");
    if (localObject1 == null) {
      localObject1 = new HashMap();
    }
    for (;;)
    {
      Map localMap = (Map)al.ajH().getValue("key_share_card_username_map");
      Object localObject2 = localMap;
      if (localMap == null) {
        localObject2 = new HashMap();
      }
      ((Map)localObject1).put(paramString, Integer.valueOf(al.ajK().tO(paramString)));
      ((Map)localObject2).put(paramString, a(paramContext, al.ajK().tN(paramString)));
      al.ajH().putValue("key_share_card_count_map", localObject1);
      al.ajH().putValue("key_share_card_username_map", localObject2);
      GMTrace.o(5096515567616L, 37972);
      return;
    }
  }
  
  private static String a(Context paramContext, ArrayList<String> paramArrayList)
  {
    GMTrace.i(5094502301696L, 37957);
    if ((paramArrayList == null) || (paramArrayList.size() == 0))
    {
      w.e("MicroMsg.ShareCardDataMgr", "getShareUserName， username_list == null || username_list.size() == 0");
      GMTrace.o(5094502301696L, 37957);
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    if ((i < paramArrayList.size()) && (i < 2))
    {
      if (i != 0) {
        localStringBuilder.append("、");
      }
      String str1 = n.fd((String)paramArrayList.get(i));
      String str2 = n.fc((String)paramArrayList.get(i));
      if (!TextUtils.isEmpty(str1)) {
        localStringBuilder.append(str1);
      }
      for (;;)
      {
        i += 1;
        break;
        localStringBuilder.append(str2);
      }
    }
    if (paramContext == null)
    {
      w.e("MicroMsg.ShareCardDataMgr", "context == null");
      GMTrace.o(5094502301696L, 37957);
      return "";
    }
    if ((paramArrayList.size() == 1) || (paramArrayList.size() == 2))
    {
      paramContext = paramContext.getString(R.l.dGs, new Object[] { localStringBuilder.toString() });
      GMTrace.o(5094502301696L, 37957);
      return paramContext;
    }
    paramContext = paramContext.getString(R.l.dGe, new Object[] { localStringBuilder.toString(), Integer.valueOf(paramArrayList.size()) });
    GMTrace.o(5094502301696L, 37957);
    return paramContext;
  }
  
  public static void a(Context paramContext, com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(5097455091712L, 37979);
    w.i("MicroMsg.ShareCardDataMgr", "updateShareCardData()");
    w.i("MicroMsg.ShareCardDataMgr", "card id:" + paramb.aiO() + " cardtpid:" + paramb.aiP());
    bw(paramb.aiO(), paramb.aiP());
    if (paramContext != null) {
      O(paramContext, paramb.aiP());
    }
    C(paramb.aiO(), paramb.aiP(), paramb.aiQ());
    tH(paramb.aiP());
    GMTrace.o(5097455091712L, 37979);
  }
  
  private static void a(com.tencent.mm.plugin.card.sharecard.model.l paraml1, com.tencent.mm.plugin.card.sharecard.model.l paraml2, boolean paramBoolean)
  {
    GMTrace.i(5094099648512L, 37954);
    if ((paraml1 == null) && (paraml2 == null))
    {
      w.e("MicroMsg.ShareCardDataMgr", "don't updateCategoryType(), newData == null && oldData == null");
      GMTrace.o(5094099648512L, 37954);
      return;
    }
    if ((paraml1 != null) && (paraml1.kqQ == null) && (paraml1.kqP == null) && (paraml2 != null) && (paraml2.kqQ == null) && (paraml2.kqP == null))
    {
      w.e("MicroMsg.ShareCardDataMgr", "don't updateCategoryType(), newData.local_city_list == null && oldData.local_city_list == null");
      GMTrace.o(5094099648512L, 37954);
      return;
    }
    w.i("MicroMsg.ShareCardDataMgr", "updateCategoryType()");
    Object localObject1 = (ArrayList)al.ajH().getValue("key_share_card_local_city_category_info_list");
    if (localObject1 == null) {
      localObject1 = new ArrayList();
    }
    for (;;)
    {
      ArrayList localArrayList = (ArrayList)al.ajH().getValue("key_share_card_other_city_category_info_list");
      if (localArrayList == null) {
        localArrayList = new ArrayList();
      }
      for (;;)
      {
        int j = 0;
        int i;
        if (paramBoolean)
        {
          al.ajK().lA(10);
          ((ArrayList)localObject1).clear();
          al.ajK().lA(0);
          localArrayList.clear();
          j = 0;
          i = 0;
        }
        for (;;)
        {
          long l1 = System.currentTimeMillis();
          ap.AS();
          long l2 = com.tencent.mm.x.c.yI().cA(Thread.currentThread().getId());
          Object localObject2;
          if ((paraml1 != null) && (paraml1.kqP != null) && (paraml1.kqP.size() > 0))
          {
            int k = 0;
            for (;;)
            {
              if (k < paraml1.kqP.size())
              {
                localObject2 = (m)paraml1.kqP.get(k);
                al.ajK().z(((m)localObject2).knp, 10, k + j);
                i locali = new i();
                locali.knp = ((m)localObject2).knp;
                locali.kqK = (k + j);
                ((ArrayList)localObject1).add(locali);
                k += 1;
                continue;
                i = j;
                if (paraml2 != null)
                {
                  i = j;
                  if (paraml2.kqP != null)
                  {
                    i = j;
                    if (paraml2.kqP.size() >= 0) {
                      i = paraml2.kqP.size();
                    }
                  }
                }
                if ((paraml2 == null) || (paraml2.kqQ == null) || (paraml2.kqQ.size() < 0)) {
                  break label702;
                }
                k = paraml2.kqQ.size();
                j = i;
                i = k;
                break;
              }
            }
            if ((!paramBoolean) && (paraml2 != null) && (paraml2.kqP != null)) {
              paraml1.kqP.addAll(paraml2.kqP);
            }
          }
          for (;;)
          {
            al.ajH().putValue("key_share_card_local_city_category_info_list", localObject1);
            if ((paraml1 == null) || (paraml1.kqQ == null) || (paraml1.kqQ.size() <= 0)) {
              break label672;
            }
            j = 0;
            while (j < paraml1.kqQ.size())
            {
              localObject1 = (m)paraml1.kqQ.get(j);
              al.ajK().z(((m)localObject1).knp, 0, j + i);
              localObject2 = new i();
              ((i)localObject2).knp = ((m)localObject1).knp;
              ((i)localObject2).kqK = (j + i);
              localArrayList.add(localObject2);
              j += 1;
            }
            if ((paraml1 != null) && (!paramBoolean) && (paraml2 != null) && (paraml2.kqP != null)) {
              paraml1.kqP = paraml2.kqP;
            }
          }
          if ((!paramBoolean) && (paraml2 != null) && (paraml2.kqQ != null)) {
            paraml1.kqQ.addAll(paraml2.kqQ);
          }
          for (;;)
          {
            al.ajH().putValue("key_share_card_other_city_category_info_list", localArrayList);
            ap.AS();
            com.tencent.mm.x.c.yI().aJ(l2);
            w.d("MicroMsg.ShareCardDataMgr", "updateCategoryType  >> updateCategoryInfo use time %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
            GMTrace.o(5094099648512L, 37954);
            return;
            label672:
            if ((paraml1 != null) && (!paramBoolean) && (paraml2 != null) && (paraml2.kqQ != null)) {
              paraml1.kqQ = paraml2.kqQ;
            }
          }
          label702:
          j = i;
          i = 0;
        }
      }
    }
  }
  
  private void a(com.tencent.mm.plugin.card.sharecard.model.l paraml, boolean paramBoolean)
  {
    GMTrace.i(5093965430784L, 37953);
    if (paraml == null)
    {
      w.e("MicroMsg.ShareCardDataMgr", "don't parserShareCardListData, data is null");
      GMTrace.o(5093965430784L, 37953);
      return;
    }
    w.i("MicroMsg.ShareCardDataMgr", "parserShareCardListData()");
    Object localObject1 = (Map)al.ajH().getValue("key_share_card_annoucement_map");
    if (localObject1 == null) {
      localObject1 = new HashMap();
    }
    for (;;)
    {
      Object localObject2 = (Map)al.ajH().getValue("key_share_card_count_map");
      if (localObject2 == null) {
        localObject2 = new HashMap();
      }
      for (;;)
      {
        Object localObject3 = (Map)al.ajH().getValue("key_share_card_username_map");
        if (localObject3 == null) {
          localObject3 = new HashMap();
        }
        for (;;)
        {
          ArrayList localArrayList1 = (ArrayList)al.ajH().getValue("key_share_card_local_city_ids");
          if (localArrayList1 == null) {
            localArrayList1 = new ArrayList();
          }
          for (;;)
          {
            ArrayList localArrayList2 = (ArrayList)al.ajH().getValue("key_share_card_other_city_ids");
            if (localArrayList2 == null) {
              localArrayList2 = new ArrayList();
            }
            for (;;)
            {
              ArrayList localArrayList3 = (ArrayList)al.ajH().getValue("key_share_card_other_city_top_info_list");
              if (localArrayList3 == null) {
                localArrayList3 = new ArrayList();
              }
              for (;;)
              {
                if (paramBoolean)
                {
                  localArrayList1.clear();
                  localArrayList2.clear();
                  localArrayList3.clear();
                }
                ArrayList localArrayList4 = new ArrayList();
                int i;
                m localm;
                int j;
                Object localObject4;
                if ((paraml.kqP != null) && (paraml.kqP.size() > 0))
                {
                  i = 0;
                  if (i < paraml.kqP.size())
                  {
                    localm = (m)paraml.kqP.get(i);
                    if (!TextUtils.isEmpty(localm.kqX)) {
                      ((Map)localObject1).put(localm.knp, localm.kqX);
                    }
                    j = al.ajK().tO(localm.knp);
                    ((Map)localObject2).put(localm.knp, Integer.valueOf(j));
                    ((Map)localObject3).put(localm.knp, o(al.ajK().tN(localm.knp)));
                    if (!localArrayList4.contains(localm.knp))
                    {
                      localObject4 = al.ajK().tP(localm.knp);
                      if ((TextUtils.isEmpty((CharSequence)localObject4)) || (localArrayList1.contains(localObject4))) {
                        break label471;
                      }
                      localArrayList1.add(localObject4);
                    }
                    for (;;)
                    {
                      localArrayList4.add(localm.knp);
                      localObject4 = new p();
                      ((p)localObject4).knp = localm.knp;
                      ((p)localObject4).top = localm.top;
                      localArrayList3.add(localObject4);
                      i += 1;
                      break;
                      label471:
                      if (!localArrayList1.contains(localm.fMv)) {
                        localArrayList1.add(localm.fMv);
                      }
                    }
                  }
                }
                localArrayList4.clear();
                if ((paraml.kqQ != null) && (paraml.kqQ.size() > 0))
                {
                  i = 0;
                  if (i < paraml.kqQ.size())
                  {
                    localm = (m)paraml.kqQ.get(i);
                    if (!TextUtils.isEmpty(localm.kqX)) {
                      ((Map)localObject1).put(localm.knp, localm.kqX);
                    }
                    j = al.ajK().tO(localm.knp);
                    ((Map)localObject2).put(localm.knp, Integer.valueOf(j));
                    ((Map)localObject3).put(localm.knp, o(al.ajK().tN(localm.knp)));
                    if (!localArrayList4.contains(localm.knp))
                    {
                      localObject4 = al.ajK().tP(localm.knp);
                      if ((TextUtils.isEmpty((CharSequence)localObject4)) || (localArrayList2.contains(localObject4))) {
                        break label741;
                      }
                      localArrayList2.add(localObject4);
                    }
                    for (;;)
                    {
                      localArrayList4.add(localm.knp);
                      localObject4 = new p();
                      ((p)localObject4).knp = localm.knp;
                      ((p)localObject4).top = localm.top;
                      localArrayList3.add(localObject4);
                      i += 1;
                      break;
                      label741:
                      if (!localArrayList2.contains(localm.fMv)) {
                        localArrayList2.add(localm.fMv);
                      }
                    }
                  }
                }
                al.ajH().putValue("key_share_card_annoucement_map", localObject1);
                al.ajH().putValue("key_share_card_count_map", localObject2);
                al.ajH().putValue("key_share_card_username_map", localObject3);
                al.ajH().putValue("key_share_card_local_city", paraml.kqR);
                al.ajH().putValue("key_share_card_local_city_ids", localArrayList1);
                al.ajH().putValue("key_share_card_other_city_ids", localArrayList2);
                al.ajH().putValue("key_share_card_other_city_top_info_list", localArrayList3);
                GMTrace.o(5093965430784L, 37953);
                return;
              }
            }
          }
        }
      }
    }
  }
  
  public static int ajU()
  {
    int i = 0;
    GMTrace.i(5093562777600L, 37950);
    Object localObject1 = al.ajC();
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append(" where (status=0 OR ").append("status=5) AND ").append("card_type=10");
    localObject2 = "select count(*) from UserCardInfo" + ((StringBuilder)localObject2).toString();
    localObject1 = ((com.tencent.mm.plugin.card.model.c)localObject1).gMB.a((String)localObject2, null, 2);
    if (localObject1 == null)
    {
      GMTrace.o(5093562777600L, 37950);
      return 0;
    }
    if (((Cursor)localObject1).moveToFirst()) {
      i = ((Cursor)localObject1).getInt(0);
    }
    ((Cursor)localObject1).close();
    GMTrace.o(5093562777600L, 37950);
    return i;
  }
  
  public static int ajV()
  {
    int i = 0;
    GMTrace.i(5093696995328L, 37951);
    Object localObject1 = al.ajC();
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append(" where (status=0 OR ").append("status=5) AND ").append("card_type!=10");
    localObject2 = "select count(*) from UserCardInfo" + ((StringBuilder)localObject2).toString();
    localObject1 = ((com.tencent.mm.plugin.card.model.c)localObject1).gMB.a((String)localObject2, null, 2);
    if (localObject1 == null)
    {
      GMTrace.o(5093696995328L, 37951);
      return 0;
    }
    if (((Cursor)localObject1).moveToFirst()) {
      i = ((Cursor)localObject1).getInt(0);
    }
    ((Cursor)localObject1).close();
    GMTrace.o(5093696995328L, 37951);
    return i;
  }
  
  public static void ajW()
  {
    GMTrace.i(5094233866240L, 37955);
    long l1 = System.currentTimeMillis();
    ap.AS();
    long l2 = com.tencent.mm.x.c.yI().cA(Thread.currentThread().getId());
    w.i("MicroMsg.ShareCardDataMgr", "updateShareCardCategory()");
    Object localObject = (ArrayList)al.ajH().getValue("key_share_card_local_city_category_info_list");
    if (localObject == null) {
      localObject = new ArrayList();
    }
    for (;;)
    {
      ArrayList localArrayList = (ArrayList)al.ajH().getValue("key_share_card_other_city_category_info_list");
      if (localArrayList == null) {
        localArrayList = new ArrayList();
      }
      for (;;)
      {
        int i = 0;
        while (i < ((ArrayList)localObject).size())
        {
          i locali = (i)((ArrayList)localObject).get(i);
          al.ajK().z(locali.knp, 10, locali.kqK);
          i += 1;
        }
        i = 0;
        while (i < localArrayList.size())
        {
          localObject = (i)localArrayList.get(i);
          al.ajK().z(((i)localObject).knp, 0, ((i)localObject).kqK);
          i += 1;
        }
        ap.AS();
        com.tencent.mm.x.c.yI().aJ(l2);
        w.i("MicroMsg.ShareCardDataMgr", "updateShareCardCategory  >> updateCategoryInfo use time %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
        GMTrace.o(5094233866240L, 37955);
        return;
      }
    }
  }
  
  public static int ajX()
  {
    GMTrace.i(5095307608064L, 37963);
    if (ajZ())
    {
      GMTrace.o(5095307608064L, 37963);
      return 1;
    }
    if (ajY())
    {
      if (kqB)
      {
        GMTrace.o(5095307608064L, 37963);
        return 3;
      }
      GMTrace.o(5095307608064L, 37963);
      return 4;
    }
    GMTrace.o(5095307608064L, 37963);
    return 0;
  }
  
  public static boolean ajY()
  {
    GMTrace.i(5095441825792L, 37964);
    ArrayList localArrayList = (ArrayList)al.ajH().getValue("key_share_card_other_city_ids");
    if ((localArrayList != null) && (localArrayList.size() > 0))
    {
      GMTrace.o(5095441825792L, 37964);
      return true;
    }
    GMTrace.o(5095441825792L, 37964);
    return false;
  }
  
  public static boolean ajZ()
  {
    GMTrace.i(5095576043520L, 37965);
    ArrayList localArrayList = (ArrayList)al.ajH().getValue("key_share_card_local_city_ids");
    if ((localArrayList != null) && (localArrayList.size() > 0))
    {
      GMTrace.o(5095576043520L, 37965);
      return true;
    }
    GMTrace.o(5095576043520L, 37965);
    return false;
  }
  
  public static void aka()
  {
    GMTrace.i(5096381349888L, 37971);
    w.i("MicroMsg.ShareCardDataMgr", "delelteAllIllegalStatusCard()");
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5093160124416L, 37947);
        w.i("MicroMsg.ShareCardDataMgr", "begin to delelteAllIllegalStatusCard()");
        Object localObject1 = al.ajK();
        Object localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append(" where (status=1 OR ").append("status=2 OR status").append("=3 OR status=4").append(" OR status=6)");
        localObject2 = "delete from ShareCardInfo" + ((StringBuilder)localObject2).toString();
        boolean bool = ((k)localObject1).gMB.eL("ShareCardInfo", (String)localObject2);
        localObject1 = new StringBuilder("delelteAllIllegalStatusCard updateRet is ");
        if (bool) {}
        for (int i = 1;; i = 0)
        {
          w.i("MicroMsg.ShareCardInfoStorage", i);
          w.i("MicroMsg.ShareCardDataMgr", "end to delelteAllIllegalStatusCard()");
          GMTrace.o(5093160124416L, 37947);
          return;
        }
      }
    }, "delelteAllIllegalStatusCard");
    GMTrace.o(5096381349888L, 37971);
  }
  
  public static boolean akb()
  {
    GMTrace.i(5097186656256L, 37977);
    com.tencent.mm.plugin.card.sharecard.model.l locall = (com.tencent.mm.plugin.card.sharecard.model.l)al.ajH().getValue("key_share_card_layout_data");
    if (locall == null)
    {
      GMTrace.o(5097186656256L, 37977);
      return true;
    }
    boolean bool = locall.kqS;
    GMTrace.o(5097186656256L, 37977);
    return bool;
  }
  
  public static boolean akc()
  {
    GMTrace.i(5097320873984L, 37978);
    com.tencent.mm.plugin.card.sharecard.model.l locall = (com.tencent.mm.plugin.card.sharecard.model.l)al.ajH().getValue("key_share_card_layout_data");
    if (locall == null)
    {
      GMTrace.o(5097320873984L, 37978);
      return true;
    }
    boolean bool = locall.kqT;
    GMTrace.o(5097320873984L, 37978);
    return bool;
  }
  
  public static void bw(String paramString1, String paramString2)
  {
    GMTrace.i(5095039172608L, 37961);
    if (hjm)
    {
      w.i("MicroMsg.ShareCardDataMgr", "is isUpdating data, don't do updateCardIdsListByCardId");
      GMTrace.o(5095039172608L, 37961);
      return;
    }
    w.i("MicroMsg.ShareCardDataMgr", "do updateCardIdsListByCardId");
    hjm = true;
    ArrayList localArrayList = lw(1);
    if ((localArrayList != null) && (localArrayList.contains(paramString1)))
    {
      localArrayList.remove(paramString1);
      String str = al.ajK().bz(paramString1, paramString2);
      if (!TextUtils.isEmpty(str)) {
        localArrayList.add(str);
      }
      al.ajH().putValue("key_share_card_local_city_ids", localArrayList);
    }
    localArrayList = lw(2);
    if ((localArrayList != null) && (localArrayList.contains(paramString1)))
    {
      localArrayList.remove(paramString1);
      paramString1 = al.ajK().bz(paramString1, paramString2);
      if (!TextUtils.isEmpty(paramString1)) {
        localArrayList.add(paramString1);
      }
      al.ajH().putValue("key_share_card_other_city_ids", localArrayList);
    }
    hjm = false;
    GMTrace.o(5095039172608L, 37961);
  }
  
  public static void bx(String paramString1, String paramString2)
  {
    GMTrace.i(5095173390336L, 37962);
    w.i("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId card_id:" + paramString1 + ", card_tp_id:" + paramString2);
    ArrayList localArrayList1 = lw(1);
    if ((localArrayList1 != null) && (localArrayList1.contains(paramString1)))
    {
      GMTrace.o(5095173390336L, 37962);
      return;
    }
    ArrayList localArrayList2 = lw(2);
    if ((localArrayList2 != null) && (localArrayList2.contains(paramString1)))
    {
      GMTrace.o(5095173390336L, 37962);
      return;
    }
    com.tencent.mm.plugin.card.sharecard.model.l locall = (com.tencent.mm.plugin.card.sharecard.model.l)al.ajH().getValue("key_share_card_layout_data");
    if (locall == null)
    {
      w.e("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId data == null");
      GMTrace.o(5095173390336L, 37962);
      return;
    }
    int j = al.ajK().tO(paramString2);
    int k = tJ(paramString2);
    w.e("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId realCount:" + j + " cacheCount:" + k);
    int i;
    if ((locall.kqP != null) && (locall.kqP.size() > 0) && ((k <= 0) || (j == 1))) {
      i = 0;
    }
    while (i < locall.kqP.size())
    {
      m localm = (m)locall.kqP.get(i);
      if ((paramString2 != null) && (paramString2.contains(localm.knp)))
      {
        localArrayList1.add(paramString1);
        al.ajH().putValue("key_share_card_local_city_ids", localArrayList1);
        w.i("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId add for local ids, card id is " + paramString1);
        GMTrace.o(5095173390336L, 37962);
        return;
      }
      i += 1;
      continue;
      w.i("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId, not add for local_ids");
    }
    if ((localArrayList2 != null) && ((k <= 0) || (j == 1)))
    {
      localArrayList2.add(paramString1);
      al.ajH().putValue("key_share_card_other_city_ids", localArrayList2);
      w.i("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId add for other ids, card id is " + paramString1);
      GMTrace.o(5095173390336L, 37962);
      return;
    }
    w.i("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId, not add for other_ids");
    GMTrace.o(5095173390336L, 37962);
  }
  
  public static String by(String paramString1, String paramString2)
  {
    GMTrace.i(5097052438528L, 37976);
    w.i("MicroMsg.ShareCardDataMgr", "initShareUserCardId()");
    if (paramString2 != null)
    {
      paramString2 = tK(paramString2);
      if ((paramString2 != null) && (paramString2.size() > 0))
      {
        paramString2 = (r)paramString2.get(0);
        if ((paramString2 != null) && (paramString2.krd != null) && (paramString2.krd.size() > 0) && (!paramString1.equals(paramString2.krd.get(0))))
        {
          paramString1 = (String)paramString2.krd.get(0);
          w.i("MicroMsg.ShareCardDataMgr", "initShareUserCardId(), mCardId is not first!, reset it");
        }
      }
    }
    for (;;)
    {
      GMTrace.o(5097052438528L, 37976);
      return paramString1;
      w.i("MicroMsg.ShareCardDataMgr", "initShareUserCardId(), mCardId is first!");
      continue;
      w.e("MicroMsg.ShareCardDataMgr", "initShareUserCardId(), shareUserInfoList is null");
      continue;
      w.e("MicroMsg.ShareCardDataMgr", "initShareUserCardId(), card_tp_id is null");
    }
  }
  
  public static String iR(String paramString)
  {
    GMTrace.i(5095978696704L, 37968);
    Map localMap = (Map)al.ajH().getValue("key_share_card_username_map");
    if (localMap == null)
    {
      GMTrace.o(5095978696704L, 37968);
      return "";
    }
    paramString = (String)localMap.get(paramString);
    GMTrace.o(5095978696704L, 37968);
    return paramString;
  }
  
  public static ArrayList<String> lw(int paramInt)
  {
    GMTrace.i(5094770737152L, 37959);
    ArrayList localArrayList;
    if (paramInt == 1)
    {
      localArrayList = (ArrayList)al.ajH().getValue("key_share_card_local_city_ids");
      if ((localArrayList == null) || (localArrayList.size() == 0))
      {
        w.e("MicroMsg.ShareCardDataMgr", "getCardIds() ids == null || ids.size() == 0 for showType == " + paramInt);
        localArrayList = lx(paramInt);
        GMTrace.o(5094770737152L, 37959);
        return localArrayList;
      }
      GMTrace.o(5094770737152L, 37959);
      return localArrayList;
    }
    if (paramInt == 2)
    {
      localArrayList = (ArrayList)al.ajH().getValue("key_share_card_other_city_ids");
      if ((localArrayList == null) || (localArrayList.size() == 0))
      {
        w.e("MicroMsg.ShareCardDataMgr", "getCardIds() ids == null || ids.size() == 0 for showType == " + paramInt);
        localArrayList = lx(paramInt);
        GMTrace.o(5094770737152L, 37959);
        return localArrayList;
      }
      GMTrace.o(5094770737152L, 37959);
      return localArrayList;
    }
    GMTrace.o(5094770737152L, 37959);
    return null;
  }
  
  private static ArrayList<String> lx(int paramInt)
  {
    GMTrace.i(5094904954880L, 37960);
    com.tencent.mm.plugin.card.sharecard.model.l locall = (com.tencent.mm.plugin.card.sharecard.model.l)al.ajH().getValue("key_share_card_layout_data");
    if (locall == null)
    {
      w.e("MicroMsg.ShareCardDataMgr", "getCardIdsByType() data == null for showType = " + paramInt);
      GMTrace.o(5094904954880L, 37960);
      return null;
    }
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    m localm;
    String str;
    if (paramInt == 1)
    {
      if ((locall.kqP != null) && (locall.kqP.size() > 0))
      {
        paramInt = 0;
        if (paramInt < locall.kqP.size())
        {
          localm = (m)locall.kqP.get(paramInt);
          if (!localArrayList2.contains(localm.knp))
          {
            str = al.ajK().tP(localm.knp);
            if ((TextUtils.isEmpty(str)) || (localArrayList1.contains(str))) {
              break label189;
            }
            localArrayList1.add(str);
          }
          for (;;)
          {
            localArrayList2.add(localm.knp);
            paramInt += 1;
            break;
            label189:
            if (!localArrayList1.contains(localm.fMv)) {
              localArrayList1.add(localm.fMv);
            }
          }
        }
        al.ajH().putValue("key_share_card_local_city_ids", localArrayList1);
      }
      GMTrace.o(5094904954880L, 37960);
      return localArrayList1;
    }
    if (paramInt == 2)
    {
      if ((locall.kqQ != null) && (locall.kqQ.size() > 0))
      {
        paramInt = 0;
        if (paramInt < locall.kqQ.size())
        {
          localm = (m)locall.kqQ.get(paramInt);
          if (!localArrayList2.contains(localm.knp))
          {
            str = al.ajK().tP(localm.knp);
            if ((TextUtils.isEmpty(str)) || (localArrayList1.contains(str))) {
              break label349;
            }
            localArrayList1.add(str);
          }
          for (;;)
          {
            localArrayList2.add(localm.knp);
            paramInt += 1;
            break;
            label349:
            if (!localArrayList1.contains(localm.fMv)) {
              localArrayList1.add(localm.fMv);
            }
          }
        }
        al.ajH().putValue("key_share_card_other_city_ids", localArrayList1);
      }
      GMTrace.o(5094904954880L, 37960);
      return localArrayList1;
    }
    GMTrace.o(5094904954880L, 37960);
    return null;
  }
  
  public static boolean ly(int paramInt)
  {
    GMTrace.i(5096649785344L, 37973);
    Object localObject = (Integer)al.ajH().getValue("key_share_card_show_type");
    if (localObject == null)
    {
      GMTrace.o(5096649785344L, 37973);
      return false;
    }
    if (((Integer)localObject).intValue() == 0)
    {
      GMTrace.o(5096649785344L, 37973);
      return false;
    }
    if (paramInt == 0)
    {
      localObject = (ArrayList)al.ajH().getValue("key_share_card_other_city_ids");
      if ((localObject == null) || (((ArrayList)localObject).size() == 0))
      {
        GMTrace.o(5096649785344L, 37973);
        return false;
      }
      GMTrace.o(5096649785344L, 37973);
      return true;
    }
    if (paramInt == 10)
    {
      localObject = (ArrayList)al.ajH().getValue("key_share_card_local_city_ids");
      if ((localObject == null) || (((ArrayList)localObject).size() == 0))
      {
        GMTrace.o(5096649785344L, 37973);
        return false;
      }
      GMTrace.o(5096649785344L, 37973);
      return true;
    }
    GMTrace.o(5096649785344L, 37973);
    return false;
  }
  
  private String o(ArrayList<String> paramArrayList)
  {
    GMTrace.i(5094368083968L, 37956);
    paramArrayList = a(this.mContext, paramArrayList);
    GMTrace.o(5094368083968L, 37956);
    return paramArrayList;
  }
  
  public static void tH(String paramString)
  {
    GMTrace.i(5094636519424L, 37958);
    w.i("MicroMsg.ShareCardDataMgr", "updateShareUserInfo()");
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.ShareCardDataMgr", "updateShareUserInfo(), card_tp_id is empty");
      GMTrace.o(5094636519424L, 37958);
      return;
    }
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        final Object localObject1 = null;
        GMTrace.i(5098126180352L, 37984);
        w.i("MicroMsg.ShareCardDataMgr", "begin to getShareUserInfo()");
        Object localObject2 = al.ajK();
        Object localObject3 = this.kqC;
        w.i("MicroMsg.ShareCardInfoStorage", "getShareUserInfo()");
        Object localObject4 = new StringBuilder();
        ((StringBuilder)localObject4).append(" where ( status=0) ");
        ((StringBuilder)localObject4).append(" AND (card_tp_id = '" + (String)localObject3 + "' )");
        ((StringBuilder)localObject4).append(" order by share_time desc ");
        localObject3 = "select * from ShareCardInfo" + ((StringBuilder)localObject4).toString();
        localObject3 = ((k)localObject2).gMB.a((String)localObject3, null, 2);
        if (localObject3 == null)
        {
          w.i("MicroMsg.ShareCardInfoStorage", "getShareUserInfo(), cursor == null");
          w.i("MicroMsg.ShareCardDataMgr", "end to getShareUserInfo(), 1");
          if ((localObject1 == null) || (((ArrayList)localObject1).size() == 0))
          {
            w.e("MicroMsg.ShareCardDataMgr", "getShareUserInfo(), share_user_list is null");
            GMTrace.o(5098126180352L, 37984);
          }
        }
        else
        {
          localObject2 = new ArrayList();
          localObject4 = new ArrayList();
        }
        label187:
        label305:
        label454:
        label457:
        for (;;)
        {
          ShareCardInfo localShareCardInfo;
          int i;
          if (((Cursor)localObject3).moveToNext())
          {
            localShareCardInfo = new ShareCardInfo();
            localShareCardInfo.b((Cursor)localObject3);
            if (!((ArrayList)localObject4).contains(localShareCardInfo.field_from_username))
            {
              localObject1 = new r();
              ((r)localObject1).knp = localShareCardInfo.field_card_tp_id;
              ((r)localObject1).krc = localShareCardInfo.field_from_username;
              ((r)localObject1).krd = new ArrayList();
              ((r)localObject1).krd.add(localShareCardInfo.field_card_id);
              ((r)localObject1).cxy = 1;
              ((ArrayList)localObject2).add(localObject1);
              ((ArrayList)localObject4).add(localShareCardInfo.field_from_username);
              continue;
            }
            i = 0;
            localObject1 = null;
            if (i >= ((ArrayList)localObject2).size()) {
              break label454;
            }
            localObject1 = (r)((ArrayList)localObject2).get(i);
            if ((localShareCardInfo.field_from_username == null) || (!localShareCardInfo.field_from_username.equals(((r)localObject1).krc))) {}
          }
          for (;;)
          {
            if (localObject1 == null) {
              break label457;
            }
            ((r)localObject1).krd.add(0, localShareCardInfo.field_card_id);
            ((r)localObject1).cxy += 1;
            ((ArrayList)localObject2).set(i, localObject1);
            break label187;
            i += 1;
            break label305;
            ((Cursor)localObject3).close();
            localObject1 = localObject2;
            break;
            if (((ArrayList)localObject1).get(0) != null) {
              ((r)((ArrayList)localObject1).get(0)).kre = true;
            }
            w.i("MicroMsg.ShareCardDataMgr", "end to getShareUserInfo(), 2");
            this.kqD.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(5098931486720L, 37990);
                Map localMap = (Map)al.ajH().getValue("key_share_user_info_map");
                Object localObject = localMap;
                if (localMap == null) {
                  localObject = new HashMap();
                }
                ((Map)localObject).put(b.1.this.kqC, localObject1);
                al.ajH().putValue("key_share_user_info_map", localObject);
                GMTrace.o(5098931486720L, 37990);
              }
            });
            GMTrace.o(5098126180352L, 37984);
            return;
            i = 0;
          }
        }
      }
    }, "updateShareUserInfo_thread");
    GMTrace.o(5094636519424L, 37958);
  }
  
  public static String tI(String paramString)
  {
    GMTrace.i(5095710261248L, 37966);
    Map localMap = (Map)al.ajH().getValue("key_share_card_annoucement_map");
    if (localMap == null)
    {
      GMTrace.o(5095710261248L, 37966);
      return "";
    }
    paramString = (String)localMap.get(paramString);
    GMTrace.o(5095710261248L, 37966);
    return paramString;
  }
  
  public static int tJ(String paramString)
  {
    GMTrace.i(5095844478976L, 37967);
    Map localMap = (Map)al.ajH().getValue("key_share_card_count_map");
    if (localMap == null)
    {
      GMTrace.o(5095844478976L, 37967);
      return 0;
    }
    paramString = (Integer)localMap.get(paramString);
    if (paramString == null)
    {
      GMTrace.o(5095844478976L, 37967);
      return 0;
    }
    int i = paramString.intValue();
    GMTrace.o(5095844478976L, 37967);
    return i;
  }
  
  public static ArrayList<r> tK(String paramString)
  {
    GMTrace.i(5096112914432L, 37969);
    Map localMap = (Map)al.ajH().getValue("key_share_user_info_map");
    Object localObject = localMap;
    if (localMap == null) {
      localObject = new HashMap();
    }
    paramString = (ArrayList)((Map)localObject).get(paramString);
    if (paramString == null)
    {
      paramString = new ArrayList();
      GMTrace.o(5096112914432L, 37969);
      return paramString;
    }
    GMTrace.o(5096112914432L, 37969);
    return paramString;
  }
  
  public static boolean tL(String paramString)
  {
    GMTrace.i(5096784003072L, 37974);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(5096784003072L, 37974);
      return false;
    }
    Object localObject2 = (ArrayList)al.ajH().getValue("key_share_card_other_city_top_info_list");
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = new ArrayList();
    }
    localObject1 = ((ArrayList)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (p)((Iterator)localObject1).next();
      if ((localObject2 != null) && (paramString.equals(((p)localObject2).knp)) && (((p)localObject2).top == 1))
      {
        GMTrace.o(5096784003072L, 37974);
        return true;
      }
    }
    GMTrace.o(5096784003072L, 37974);
    return false;
  }
  
  public static void tM(String paramString)
  {
    GMTrace.i(5096918220800L, 37975);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(5096918220800L, 37975);
      return;
    }
    ArrayList localArrayList = (ArrayList)al.ajH().getValue("key_share_card_other_city_top_info_list");
    if (localArrayList == null) {
      localArrayList = new ArrayList();
    }
    for (;;)
    {
      int i = 0;
      while (i < localArrayList.size())
      {
        p localp = (p)localArrayList.get(i);
        if ((localp != null) && (paramString.equals(localp.knp)) && (localp.top == 1))
        {
          localp.krb = true;
          localArrayList.set(i, localp);
          al.ajH().putValue("key_share_card_other_city_top_info_list", localArrayList);
          GMTrace.o(5096918220800L, 37975);
          return;
        }
        i += 1;
      }
      GMTrace.o(5096918220800L, 37975);
      return;
    }
  }
  
  public final void P(String paramString, boolean paramBoolean)
  {
    GMTrace.i(5093831213056L, 37952);
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.ShareCardDataMgr", "updateGetShareLayoutData json is empty");
      GMTrace.o(5093831213056L, 37952);
      return;
    }
    long l = System.currentTimeMillis();
    Object localObject1 = s.uu(paramString);
    Object localObject2 = (com.tencent.mm.plugin.card.sharecard.model.l)al.ajH().getValue("key_share_card_layout_data");
    if (localObject1 == null)
    {
      w.e("MicroMsg.ShareCardDataMgr", "updateGetShareLayoutData data == null");
      a((com.tencent.mm.plugin.card.sharecard.model.l)localObject1, (com.tencent.mm.plugin.card.sharecard.model.l)localObject2, paramBoolean);
      al.ajH().putValue("key_share_card_layout_data", localObject1);
      GMTrace.o(5093831213056L, 37952);
      return;
    }
    if (paramBoolean) {
      com.tencent.mm.plugin.card.b.l.um(paramString);
    }
    a((com.tencent.mm.plugin.card.sharecard.model.l)localObject1, paramBoolean);
    a((com.tencent.mm.plugin.card.sharecard.model.l)localObject1, (com.tencent.mm.plugin.card.sharecard.model.l)localObject2, paramBoolean);
    al.ajH().putValue("key_share_card_layout_data", localObject1);
    int j = 0;
    int i = j;
    if (((com.tencent.mm.plugin.card.sharecard.model.l)localObject1).kqP != null)
    {
      i = j;
      if (((com.tencent.mm.plugin.card.sharecard.model.l)localObject1).kqP.size() > 0) {
        i = ((com.tencent.mm.plugin.card.sharecard.model.l)localObject1).kqP.size();
      }
    }
    j = i;
    if (((com.tencent.mm.plugin.card.sharecard.model.l)localObject1).kqQ != null)
    {
      j = i;
      if (((com.tencent.mm.plugin.card.sharecard.model.l)localObject1).kqQ.size() > 0) {
        j = i + ((com.tencent.mm.plugin.card.sharecard.model.l)localObject1).kqQ.size();
      }
    }
    if (j > 0)
    {
      i = (int)(System.currentTimeMillis() - l);
      paramString = new ArrayList();
      localObject1 = new IDKey();
      ((IDKey)localObject1).SetID(281);
      ((IDKey)localObject1).SetKey(10);
      ((IDKey)localObject1).SetValue(1L);
      localObject2 = new IDKey();
      ((IDKey)localObject2).SetID(281);
      ((IDKey)localObject2).SetKey(11);
      ((IDKey)localObject2).SetValue(i);
      IDKey localIDKey1 = new IDKey();
      localIDKey1.SetID(281);
      localIDKey1.SetKey(12);
      localIDKey1.SetValue(j);
      IDKey localIDKey2 = new IDKey();
      localIDKey2.SetID(281);
      localIDKey2.SetKey(14);
      localIDKey2.SetValue(i / j);
      paramString.add(localObject1);
      paramString.add(localObject2);
      paramString.add(localIDKey1);
      paramString.add(localIDKey2);
      com.tencent.mm.plugin.report.service.g.paX.b(paramString, true);
    }
    GMTrace.o(5093831213056L, 37952);
  }
  
  public final void init()
  {
    GMTrace.i(5093428559872L, 37949);
    if ((com.tencent.mm.plugin.card.sharecard.model.l)al.ajH().getValue("key_share_card_layout_data") == null)
    {
      w.e("MicroMsg.ShareCardDataMgr", "initShareCardLayoutData, data cache is empty!, load data from db!");
      Object localObject = com.tencent.mm.plugin.card.b.l.amn();
      if (TextUtils.isEmpty((CharSequence)localObject))
      {
        w.e("MicroMsg.ShareCardDataMgr", "initShareCardLayoutData, json is empty");
        GMTrace.o(5093428559872L, 37949);
        return;
      }
      localObject = s.uu((String)localObject);
      if (localObject != null)
      {
        w.i("MicroMsg.ShareCardDataMgr", "load share card layout data success!");
        al.ajH().putValue("key_share_card_layout_data", localObject);
        a((com.tencent.mm.plugin.card.sharecard.model.l)localObject, true);
        GMTrace.o(5093428559872L, 37949);
        return;
      }
      w.e("MicroMsg.ShareCardDataMgr", "load share card layout data fail!");
      GMTrace.o(5093428559872L, 37949);
      return;
    }
    w.i("MicroMsg.ShareCardDataMgr", "the share card layout cache is valid!");
    GMTrace.o(5093428559872L, 37949);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */