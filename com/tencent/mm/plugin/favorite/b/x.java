package com.tencent.mm.plugin.favorite.b;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.HandlerThread;
import android.os.Looper;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.a.g;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.favorite.c.f;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.sy;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.protocal.c.ta;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tj;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.m;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class x
{
  public static final int[] lPA;
  public static final int[] lPB;
  private static Map<Long, Long> lPw;
  private static Map<Long, Long> lPx;
  private static long lPy;
  public static List<Integer> lPz;
  
  static
  {
    GMTrace.i(6294140354560L, 46895);
    lPw = new HashMap();
    lPx = new HashMap();
    lPy = 0L;
    lPz = new LinkedList();
    lPA = new int[] { 2, 3, 4, 8, 14, 16, 18 };
    lPB = new int[] { 10, 8, 7 };
    GMTrace.o(6294140354560L, 46895);
  }
  
  public static Integer T(Context paramContext, String paramString)
  {
    GMTrace.i(6291590217728L, 46876);
    if (paramContext == null)
    {
      GMTrace.o(6291590217728L, 46876);
      return Integer.valueOf(-1);
    }
    if (paramContext.getString(R.l.dXW).equals(paramString))
    {
      GMTrace.o(6291590217728L, 46876);
      return Integer.valueOf(2);
    }
    if (paramContext.getString(R.l.dXY).equals(paramString))
    {
      GMTrace.o(6291590217728L, 46876);
      return Integer.valueOf(7);
    }
    if (paramContext.getString(R.l.dXX).equals(paramString))
    {
      GMTrace.o(6291590217728L, 46876);
      return Integer.valueOf(6);
    }
    if (paramContext.getString(R.l.dXU).equals(paramString))
    {
      GMTrace.o(6291590217728L, 46876);
      return Integer.valueOf(1);
    }
    if (paramContext.getString(R.l.dYb).equals(paramString))
    {
      GMTrace.o(6291590217728L, 46876);
      return Integer.valueOf(4);
    }
    if (paramContext.getString(R.l.dYa).equals(paramString))
    {
      GMTrace.o(6291590217728L, 46876);
      return Integer.valueOf(5);
    }
    if (paramContext.getString(R.l.dYc).equals(paramString))
    {
      GMTrace.o(6291590217728L, 46876);
      return Integer.valueOf(3);
    }
    if (paramContext.getString(R.l.dXV).equals(paramString))
    {
      GMTrace.o(6291590217728L, 46876);
      return Integer.valueOf(8);
    }
    GMTrace.o(6291590217728L, 46876);
    return Integer.valueOf(-1);
  }
  
  public static sp a(j paramj, String paramString)
  {
    GMTrace.i(6284208242688L, 46821);
    if ((bg.mZ(paramString)) || (paramj == null) || (paramj.field_favProto.tQC.size() == 0))
    {
      GMTrace.o(6284208242688L, 46821);
      return null;
    }
    paramj = paramj.field_favProto.tQC.iterator();
    while (paramj.hasNext())
    {
      sp localsp = (sp)paramj.next();
      if (localsp.lUP.equals(paramString))
      {
        GMTrace.o(6284208242688L, 46821);
        return localsp;
      }
    }
    GMTrace.o(6284208242688L, 46821);
    return null;
  }
  
  public static String a(Context paramContext, List<String> paramList)
  {
    GMTrace.i(6291321782272L, 46874);
    if ((paramContext == null) || (paramList == null) || (paramList.isEmpty()))
    {
      GMTrace.o(6291321782272L, 46874);
      return "";
    }
    String str1 = (String)paramList.get(0);
    String str2 = paramContext.getResources().getString(R.l.dYd);
    int i = 1;
    paramContext = str1;
    while (i < paramList.size())
    {
      paramContext = paramContext + str2 + (String)paramList.get(i);
      i += 1;
    }
    GMTrace.o(6291321782272L, 46874);
    return paramContext;
  }
  
  public static ArrayList<j> a(List<String> paramList1, List<String> paramList2, List<Integer> paramList, List<j> paramList3, Set<Integer> paramSet, a parama)
  {
    GMTrace.i(6289040080896L, 46857);
    p localp = com.tencent.mm.plugin.favorite.h.awC();
    ArrayList localArrayList = new ArrayList();
    String str = " 1=1 ";
    Object localObject = str;
    if (paramList1 != null)
    {
      localObject = str;
      if (!paramList1.isEmpty())
      {
        localObject = paramList1.iterator();
        for (paramList1 = " 1=1 "; ((Iterator)localObject).hasNext(); paramList1 = paramList1 + " and content like '%" + str + "%'") {
          str = (String)((Iterator)localObject).next();
        }
        localObject = paramList1;
      }
    }
    paramList1 = (List<String>)localObject;
    if (paramList2 != null)
    {
      paramList1 = (List<String>)localObject;
      if (!paramList2.isEmpty())
      {
        paramList2 = paramList2.iterator();
        for (paramList1 = (List<String>)localObject; paramList2.hasNext(); paramList1 = paramList1 + " and tagContent like '%" + (String)localObject + "%'") {
          localObject = (String)paramList2.next();
        }
      }
    }
    paramList2 = "select localId from FavSearchInfo" + " where " + paramList1;
    paramList1 = paramList2;
    int i;
    if (paramList != null)
    {
      paramList1 = paramList2;
      if (!paramList.isEmpty())
      {
        paramList1 = paramList2 + " and ((1=1 ";
        paramList2 = paramList.iterator();
        while (paramList2.hasNext())
        {
          i = ((Integer)paramList2.next()).intValue();
          paramList1 = paramList1 + " and type = " + i;
        }
        paramList1 = paramList1 + ") or (1=1";
        paramList2 = paramList.iterator();
        while (paramList2.hasNext())
        {
          i = ((Integer)paramList2.next()).intValue();
          paramList1 = paramList1 + " and subtype & " + o.np(i) + " != 0";
        }
        paramList1 = paramList1 + "))";
      }
    }
    paramList1 = paramList1 + " order by time desc";
    w.d("MicroMsg.FavSearchStorage", "search id sql {%s}", new Object[] { paramList1 });
    paramList1 = localp.gMB.a(paramList1, null, 2);
    if (paramList1 == null) {}
    for (;;)
    {
      paramList1 = new ArrayList();
      if (localArrayList.size() != 0) {
        break;
      }
      GMTrace.o(6289040080896L, 46857);
      return paramList1;
      while (paramList1.moveToNext()) {
        localArrayList.add(Long.valueOf(paramList1.getLong(0)));
      }
      paramList1.close();
    }
    for (int j = 0;; j = i)
    {
      if (j + 20 < localArrayList.size()) {}
      for (i = j + 20;; i = localArrayList.size())
      {
        w.v("MicroMsg.FavoriteLogic", "start:%d  end:%d listSize:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(localArrayList.size()) });
        paramList2 = com.tencent.mm.plugin.favorite.h.awD().a(localArrayList.subList(j, i), paramList3, paramSet, parama);
        if ((paramList2 != null) && (paramList2.size() > 0)) {
          paramList1.addAll(paramList2);
        }
        if (i < localArrayList.size()) {
          break;
        }
        GMTrace.o(6289040080896L, 46857);
        return paramList1;
      }
    }
  }
  
  public static void a(ah paramah)
  {
    GMTrace.i(6293335048192L, 46889);
    if ((paramah.hmv != null) && (paramah.hmv.Ba() != null) && (paramah.hmv.Ba().tpN == 65101))
    {
      paramah = com.tencent.mm.plugin.favorite.h.awD().cd(paramah.lPZ);
      if ((paramah != null) && (paramah.field_favProto != null) && (paramah.field_favProto.tQC != null))
      {
        paramah.field_favProto.zr(paramah.field_favProto.version + 2);
        paramah.field_itemStatus = 1;
        com.tencent.mm.plugin.favorite.h.awD().a(paramah, new String[] { "localId" });
        com.tencent.mm.plugin.favorite.h.awu().run();
      }
    }
    GMTrace.o(6293335048192L, 46889);
  }
  
  public static void a(j paramj, sp paramsp, boolean paramBoolean)
  {
    GMTrace.i(6285550419968L, 46831);
    if ((paramj == null) || (bg.mZ(paramsp.lUP)))
    {
      GMTrace.o(6285550419968L, 46831);
      return;
    }
    w.i("MicroMsg.FavoriteLogic", "restart cdndata download, favId %d, favLocalId %d, dataId %s", new Object[] { Integer.valueOf(paramj.field_id), Long.valueOf(paramj.field_localId), paramsp.lUP });
    a locala = com.tencent.mm.plugin.favorite.h.awy().wZ(paramsp.lUP);
    Object localObject = locala;
    if (locala != null)
    {
      localObject = locala;
      if (locala.field_status == 3)
      {
        com.tencent.mm.plugin.favorite.h.awy().b(locala, new String[] { "dataId" });
        localObject = null;
      }
    }
    if ((localObject != null) && (((a)localObject).field_type == 1))
    {
      w.i("MicroMsg.FavoriteLogic", "klem data not download completed.");
      ((a)localObject).field_status = 1;
      com.tencent.mm.plugin.favorite.h.awy().a((a)localObject, new String[] { "dataId" });
      if (paramBoolean)
      {
        com.tencent.mm.plugin.favorite.h.awx().xp(paramsp.lUP);
        if ((!bg.mZ(paramsp.tPz)) && (paramsp.tPz.equals("WeNoteHtmlFile")))
        {
          paramj = com.tencent.mm.plugin.favorite.h.awy().wZ(paramsp.lUP);
          com.tencent.mm.plugin.favorite.h.awx().g(paramj);
        }
      }
      com.tencent.mm.plugin.favorite.h.awx().run();
      GMTrace.o(6285550419968L, 46831);
      return;
    }
    localObject = new File(g(paramsp));
    if ((!bg.mZ(paramsp.tOz)) && (!bg.mZ(paramsp.tOx)) && (!((File)localObject).exists()))
    {
      w.i("MicroMsg.FavoriteLogic", "klem big img not exist, start download.");
      long l = System.currentTimeMillis();
      a(paramsp, paramj, 1, true);
      if (paramBoolean)
      {
        com.tencent.mm.plugin.favorite.h.awx().xp(paramsp.lUP);
        if ((!bg.mZ(paramsp.tPz)) && (paramsp.tPz.equals("WeNoteHtmlFile")))
        {
          paramj = com.tencent.mm.plugin.favorite.h.awy().wZ(paramsp.lUP);
          com.tencent.mm.plugin.favorite.h.awx().g(paramj);
        }
      }
      com.tencent.mm.plugin.favorite.h.awx().run();
      w.i("MicroMsg.FavoriteLogic", "insert cdn item use %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    }
    GMTrace.o(6285550419968L, 46831);
  }
  
  public static void a(j paramj, Collection<String> paramCollection, int paramInt)
  {
    GMTrace.i(6291187564544L, 46873);
    if (paramj == null)
    {
      GMTrace.o(6291187564544L, 46873);
      return;
    }
    w.d("MicroMsg.FavoriteLogic", "mod tags %s", new Object[] { paramCollection });
    HashSet localHashSet = new HashSet();
    localHashSet.addAll(paramj.field_tagProto.tQM);
    paramj.field_tagProto.tQM.clear();
    if ((paramCollection == null) || (paramCollection.isEmpty())) {}
    for (;;)
    {
      com.tencent.mm.plugin.favorite.h.awD().a(paramj, new String[] { "localId" });
      q(paramj);
      com.tencent.mm.plugin.favorite.h.aww().c(localHashSet);
      z.a(paramj, paramInt);
      GMTrace.o(6291187564544L, 46873);
      return;
      paramj.field_tagProto.tQM.addAll(paramCollection);
      localHashSet.removeAll(paramCollection);
    }
  }
  
  public static void a(j paramj, boolean paramBoolean)
  {
    GMTrace.i(6287563685888L, 46846);
    p(paramj);
    com.tencent.mm.plugin.favorite.h.awC().ce(paramj.field_localId);
    com.tencent.mm.plugin.favorite.h.awD().d(paramj);
    com.tencent.mm.plugin.favorite.h.awy().cb(paramj.field_localId);
    com.tencent.mm.plugin.favorite.h.aww().i(paramj);
    if (paramBoolean)
    {
      Set localSet = axf();
      localSet.add(paramj.field_id);
      d(localSet);
      axe();
    }
    GMTrace.o(6287563685888L, 46846);
  }
  
  public static void a(sp paramsp, j paramj, int paramInt)
  {
    GMTrace.i(6288637427712L, 46854);
    if ((paramInt == 1) && ((paramsp.tPd <= 0L) || (bg.mZ(paramsp.tOt)) || (bg.mZ(paramsp.haX))))
    {
      w.e("MicroMsg.FavoriteLogic", "insertCdnThumbInfo, type recv, cdndataurl must not be null!");
      GMTrace.o(6288637427712L, 46854);
      return;
    }
    if ((paramInt == 0) && (bg.mZ(h(paramsp))))
    {
      w.e("MicroMsg.FavoriteLogic", "insertCdnThumbInfo, type send, path must not be null!");
      GMTrace.o(6288637427712L, 46854);
      return;
    }
    String str = xl(paramsp.lUP);
    if (com.tencent.mm.plugin.favorite.h.awy().wZ(str) != null)
    {
      w.w("MicroMsg.FavoriteLogic", "cdn info exist, id[%s], return", new Object[] { str });
      GMTrace.o(6288637427712L, 46854);
      return;
    }
    w.v("MicroMsg.FavoriteLogic", "insert cdn thumb info, fav local id[%d] fav id[%d]", new Object[] { Long.valueOf(paramj.field_localId), Integer.valueOf(paramj.field_id) });
    a locala = new a();
    locala.field_cdnKey = paramsp.tOt;
    locala.field_cdnUrl = paramsp.haX;
    locala.field_dataId = str;
    locala.field_favLocalId = paramj.field_localId;
    locala.field_totalLen = ((int)paramsp.tPd);
    locala.field_type = paramInt;
    locala.field_status = 1;
    locala.field_path = h(paramsp);
    locala.field_modifyTime = bg.Pp();
    com.tencent.mm.plugin.favorite.h.awy().a(locala);
    if (paramInt == 1)
    {
      com.tencent.mm.plugin.favorite.c.c.f(locala);
      GMTrace.o(6288637427712L, 46854);
      return;
    }
    com.tencent.mm.plugin.favorite.c.c.e(locala);
    GMTrace.o(6288637427712L, 46854);
  }
  
  public static void a(sp paramsp, j paramj, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(6288503209984L, 46853);
    if ((paramInt == 1) && ((paramsp.tOS <= 0L) || (bg.mZ(paramsp.tOz)) || (bg.mZ(paramsp.tOx))))
    {
      w.e("MicroMsg.FavoriteLogic", "insertCdnDataInfo, type recv, cdndataurl must not be null!");
      GMTrace.o(6288503209984L, 46853);
      return;
    }
    if ((paramInt == 0) && (bg.mZ(g(paramsp))))
    {
      w.e("MicroMsg.FavoriteLogic", "insertCdnDataInfo, type send, path must not be null!");
      GMTrace.o(6288503209984L, 46853);
      return;
    }
    if (com.tencent.mm.plugin.favorite.h.awy().wZ(paramsp.lUP) != null)
    {
      w.v("MicroMsg.FavoriteLogic", "cdn info exist, id[%s], return", new Object[] { paramsp.lUP });
      GMTrace.o(6288503209984L, 46853);
      return;
    }
    w.i("MicroMsg.FavoriteLogic", "insert cdn data info, fav local id[%d] fav id[%d]", new Object[] { Long.valueOf(paramj.field_localId), Integer.valueOf(paramj.field_id) });
    a locala = new a();
    locala.field_dataId = paramsp.lUP;
    locala.field_totalLen = ((int)paramsp.tOS);
    locala.field_type = paramInt;
    locala.field_favLocalId = paramj.field_localId;
    locala.field_cdnKey = paramsp.tOz;
    locala.field_cdnUrl = paramsp.tOx;
    locala.field_path = g(paramsp);
    int i;
    label282:
    boolean bool;
    if (paramsp.aHe == 3)
    {
      paramsp = paramsp.tOM;
      if ((!bg.mZ(paramsp)) && (paramsp.equals("speex")))
      {
        i = -3;
        locala.field_dataType = i;
        locala.field_modifyTime = bg.Pp();
        bool = am.isWifi(com.tencent.mm.sdk.platformtools.ab.getContext());
        if (paramInt == 0)
        {
          w.i("MicroMsg.FavoriteLogic", "can auto upload, force %B, isWifi %B, dataType %d, totalLen %d", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool), Integer.valueOf(locala.field_dataType), Integer.valueOf(locala.field_totalLen) });
          if (!paramBoolean) {
            break label533;
          }
          i = 1;
          label359:
          if (i == 0) {
            break label629;
          }
          locala.field_status = 1;
          w.i("MicroMsg.FavoriteLogic", "insertCdnDataInfo upload status traning");
        }
        label379:
        if (paramInt == 1)
        {
          w.i("MicroMsg.FavoriteLogic", "can auto download, force %B, isWifi %B, dataType %d, totalLen %d", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool), Integer.valueOf(locala.field_dataType), Integer.valueOf(locala.field_totalLen) });
          if (!paramBoolean) {
            break label647;
          }
          i = 1;
          label441:
          if (i == 0) {
            break label743;
          }
          locala.field_status = 1;
          w.i("MicroMsg.FavoriteLogic", "insertCdnDataInfo download status traning");
        }
      }
    }
    for (;;)
    {
      com.tencent.mm.plugin.favorite.h.awy().a(locala);
      if (paramInt != 1) {
        break label761;
      }
      com.tencent.mm.plugin.favorite.c.c.f(locala);
      GMTrace.o(6288503209984L, 46853);
      return;
      if ((!bg.mZ(paramsp)) && (paramsp.equals("silk")))
      {
        i = -4;
        break;
      }
      i = -2;
      break;
      locala.field_dataType = paramsp.aHe;
      break label282;
      label533:
      if (bool)
      {
        i = 1;
        break label359;
      }
      if ((locala.field_dataType != 8) && (locala.field_dataType != 4) && (locala.field_dataType != 15))
      {
        i = 1;
        break label359;
      }
      long l = axm();
      if (locala.field_totalLen <= l)
      {
        w.i("MicroMsg.FavoriteLogic", "match max auto upload, max size %d", new Object[] { Long.valueOf(l) });
        i = 1;
        break label359;
      }
      i = 0;
      break label359;
      label629:
      locala.field_status = 4;
      w.i("MicroMsg.FavoriteLogic", "insertCdnDataInfo upload status pause");
      break label379;
      label647:
      if (bool)
      {
        i = 1;
        break label441;
      }
      if ((locala.field_dataType != 8) && (locala.field_dataType != 4) && (locala.field_dataType != 15))
      {
        i = 1;
        break label441;
      }
      l = axl();
      if (locala.field_totalLen <= l)
      {
        w.i("MicroMsg.FavoriteLogic", "match max auto download, max size %d", new Object[] { Long.valueOf(l) });
        i = 1;
        break label441;
      }
      i = 0;
      break label441;
      label743:
      locala.field_status = 4;
      w.i("MicroMsg.FavoriteLogic", "insertCdnDataInfo download status pause");
    }
    label761:
    com.tencent.mm.plugin.favorite.c.c.e(locala);
    GMTrace.o(6288503209984L, 46853);
  }
  
  public static void a(List<j> paramList, String[] paramArrayOfString)
  {
    GMTrace.i(6291053346816L, 46872);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      GMTrace.o(6291053346816L, 46872);
      return;
    }
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      GMTrace.o(6291053346816L, 46872);
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      j localj = (j)paramList.next();
      int j = paramArrayOfString.length;
      int i = 0;
      boolean bool = false;
      while (i < j)
      {
        bool |= localj.xc(paramArrayOfString[i]);
        i += 1;
      }
      if (bool)
      {
        com.tencent.mm.plugin.favorite.h.awD().a(localj, new String[] { "localId" });
        q(localj);
        localLinkedList.add(localj);
      }
    }
    paramList = localLinkedList.iterator();
    while (paramList.hasNext()) {
      z.a((j)paramList.next(), 3);
    }
    GMTrace.o(6291053346816L, 46872);
  }
  
  public static boolean a(long paramLong, Runnable paramRunnable)
  {
    GMTrace.i(6287161032704L, 46843);
    boolean bool = a(com.tencent.mm.plugin.favorite.h.awD().cc(paramLong), true, paramRunnable);
    GMTrace.o(6287161032704L, 46843);
    return bool;
  }
  
  public static boolean a(j paramj, Runnable paramRunnable)
  {
    GMTrace.i(6287295250432L, 46844);
    boolean bool = a(paramj, true, null);
    GMTrace.o(6287295250432L, 46844);
    return bool;
  }
  
  public static boolean a(j paramj, final boolean paramBoolean, final Runnable paramRunnable)
  {
    GMTrace.i(6287429468160L, 46845);
    if (paramj == null)
    {
      w.w("MicroMsg.FavoriteLogic", "delete fav item fail, item is null");
      com.tencent.mm.sdk.platformtools.af.u(paramRunnable);
      GMTrace.o(6287429468160L, 46845);
      return false;
    }
    if (Looper.myLooper() == ap.xC().nTP.getLooper())
    {
      w.i("MicroMsg.FavoriteLogic", "delete favItem id %d, localId %d, needBatchDel %B, do directly", new Object[] { Integer.valueOf(paramj.field_id), Long.valueOf(paramj.field_localId), Boolean.valueOf(paramBoolean) });
      a(paramj, paramBoolean);
      com.tencent.mm.sdk.platformtools.af.u(paramRunnable);
    }
    for (;;)
    {
      GMTrace.o(6287429468160L, 46845);
      return true;
      w.i("MicroMsg.FavoriteLogic", "delete favItem id %d, localId %d, needBatchDel %B, post to worker", new Object[] { Integer.valueOf(paramj.field_id), Long.valueOf(paramj.field_localId), Boolean.valueOf(paramBoolean) });
      ap.xC().C(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6279913275392L, 46789);
          w.i("MicroMsg.FavoriteLogic", "delete favItem id %d, localId %d, needBatchDel %B, do on worker thread", new Object[] { Integer.valueOf(this.lPC.field_id), Long.valueOf(this.lPC.field_localId), Boolean.valueOf(paramBoolean) });
          x.a(this.lPC, paramBoolean);
          com.tencent.mm.sdk.platformtools.af.u(paramRunnable);
          GMTrace.o(6279913275392L, 46789);
        }
      });
    }
  }
  
  public static boolean a(List<j> paramList, Context paramContext, DialogInterface.OnClickListener paramOnClickListener)
  {
    GMTrace.i(6293603483648L, 46891);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      GMTrace.o(6293603483648L, 46891);
      return true;
    }
    new q();
    Iterator localIterator1 = paramList.iterator();
    int m = 0;
    int i1 = 0;
    int i = 0;
    int k = 0;
    int j = 0;
    j localj;
    int n;
    int i2;
    for (;;)
    {
      if (localIterator1.hasNext())
      {
        localj = (j)localIterator1.next();
        if ((localj != null) && (localj.field_favProto != null) && (localj.field_favProto.tQC != null)) {
          if (localj.field_type == 3)
          {
            i1 += 1;
          }
          else
          {
            Iterator localIterator2 = localj.field_favProto.tQC.iterator();
            n = 0;
            i2 = j;
            j = m;
            m = i2;
            while (localIterator2.hasNext())
            {
              sp localsp = (sp)localIterator2.next();
              if (localsp.tPF == 2) {
                j += 1;
              } else if (localsp.tPF == 1) {
                m += 1;
              } else {
                n += 1;
              }
            }
            if (!q.h(localj)) {
              break label653;
            }
            int i3 = k + 1;
            k = i3;
            i2 = n;
            if (n > 0)
            {
              i2 = n - 1;
              k = i3;
            }
          }
        }
      }
    }
    for (;;)
    {
      if ((i == 0) && (i2 == localj.field_favProto.tQC.size())) {
        i = 1;
      }
      for (;;)
      {
        n = m;
        m = j;
        j = n;
        break;
        if (1 == paramList.size())
        {
          if ((((j)paramList.get(0)).field_type == 14) && ((m > 0) || (j > 0)))
          {
            com.tencent.mm.ui.base.h.bl(paramContext, paramContext.getString(R.l.dWi));
            GMTrace.o(6293603483648L, 46891);
            return false;
          }
          if (m > 0)
          {
            com.tencent.mm.ui.base.h.bl(paramContext, paramContext.getString(R.l.dWj));
            GMTrace.o(6293603483648L, 46891);
            return false;
          }
          if (j > 0)
          {
            switch (((j)paramList.get(0)).field_type)
            {
            }
            for (;;)
            {
              GMTrace.o(6293603483648L, 46891);
              return false;
              com.tencent.mm.ui.base.h.bl(paramContext, paramContext.getString(R.l.dWk));
              continue;
              com.tencent.mm.ui.base.h.bl(paramContext, paramContext.getString(R.l.dWl));
              continue;
              com.tencent.mm.ui.base.h.bl(paramContext, paramContext.getString(R.l.dWm));
            }
          }
          if (k > 0)
          {
            com.tencent.mm.ui.base.h.bl(paramContext, paramContext.getString(R.l.drQ));
            GMTrace.o(6293603483648L, 46891);
            return false;
          }
          if (i1 > 0)
          {
            com.tencent.mm.ui.base.h.bl(paramContext, paramContext.getString(R.l.drR));
            GMTrace.o(6293603483648L, 46891);
            return false;
          }
        }
        else if ((m > 0) || (j > 0) || (k > 0) || (i1 > 0))
        {
          if (i != 0) {
            com.tencent.mm.ui.base.h.a(paramContext, paramContext.getString(R.l.dWo), "", paramContext.getString(R.l.dLF), paramContext.getString(R.l.dLD), paramOnClickListener, null, R.e.aQR);
          }
          for (;;)
          {
            GMTrace.o(6293603483648L, 46891);
            return false;
            com.tencent.mm.ui.base.h.bl(paramContext, paramContext.getString(R.l.dWn));
          }
        }
        GMTrace.o(6293603483648L, 46891);
        return true;
      }
      label653:
      i2 = n;
    }
  }
  
  public static float aB(long paramLong)
  {
    float f2 = 60.0F;
    float f1 = 1.0F;
    GMTrace.i(6286087290880L, 46835);
    float f3 = (float)paramLong / 1000.0F;
    if (f3 < 1.0F) {}
    for (;;)
    {
      if (f1 > 60.0F) {
        f1 = f2;
      }
      for (;;)
      {
        f1 = Math.round(f1);
        GMTrace.o(6286087290880L, 46835);
        return f1;
      }
      f1 = f3;
    }
  }
  
  public static String aY(String paramString, int paramInt)
  {
    GMTrace.i(6286355726336L, 46837);
    paramString = g.n((paramString + paramInt + System.currentTimeMillis()).getBytes());
    GMTrace.o(6286355726336L, 46837);
    return paramString;
  }
  
  public static String ab(float paramFloat)
  {
    GMTrace.i(6290919129088L, 46871);
    if (paramFloat < 1024.0F)
    {
      str = String.format("%.1fB", new Object[] { Float.valueOf(paramFloat) });
      GMTrace.o(6290919129088L, 46871);
      return str;
    }
    if (paramFloat < 1048576.0F)
    {
      str = String.format("%.1fKB", new Object[] { Float.valueOf(paramFloat / 1024.0F) });
      GMTrace.o(6290919129088L, 46871);
      return str;
    }
    if (paramFloat < 1.07374182E9F)
    {
      str = String.format("%.1fMB", new Object[] { Float.valueOf(paramFloat / 1024.0F / 1024.0F) });
      GMTrace.o(6290919129088L, 46871);
      return str;
    }
    String str = String.format("%.1fGB", new Object[] { Float.valueOf(paramFloat / 1024.0F / 1024.0F / 1024.0F) });
    GMTrace.o(6290919129088L, 46871);
    return str;
  }
  
  public static boolean av(List<j> paramList)
  {
    GMTrace.i(6287697903616L, 46847);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      w.w("MicroMsg.FavoriteLogic", "delete fav item fail, item is null");
      GMTrace.o(6287697903616L, 46847);
      return false;
    }
    Set localSet = axf();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      j localj = (j)paramList.next();
      p(localj);
      com.tencent.mm.plugin.favorite.h.awC().ce(localj.field_localId);
      com.tencent.mm.plugin.favorite.h.awD().d(localj);
      com.tencent.mm.plugin.favorite.h.awy().cb(localj.field_localId);
      com.tencent.mm.plugin.favorite.h.aww().i(localj);
      localSet.add(localj.field_id);
      w.d("MicroMsg.FavoriteLogic", "delete id %d", new Object[] { Integer.valueOf(localj.field_id) });
    }
    d(localSet);
    axe();
    GMTrace.o(6287697903616L, 46847);
    return true;
  }
  
  public static void aw(List<Integer> paramList)
  {
    GMTrace.i(6287832121344L, 46848);
    if (paramList.size() == 0)
    {
      w.e("MicroMsg.FavoriteLogic", "setDeleted list null");
      GMTrace.o(6287832121344L, 46848);
      return;
    }
    Set localSet = axf();
    w.i("MicroMsg.FavoriteLogic", "setDeleted before del:%s", new Object[] { localSet.toString() });
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Integer localInteger = (Integer)paramList.next();
      w.i("MicroMsg.FavoriteLogic", "setDeleted id:%d, ret:%b", new Object[] { localInteger, Boolean.valueOf(localSet.remove(localInteger.toString())) });
    }
    w.i("MicroMsg.FavoriteLogic", "setDeleted after del:%s", new Object[] { localSet.toString() });
    d(localSet);
    GMTrace.o(6287832121344L, 46848);
  }
  
  public static String awZ()
  {
    GMTrace.i(6283671371776L, 46817);
    Object localObject = new StringBuilder();
    ap.AS();
    localObject = com.tencent.mm.x.c.zp() + "favorite/";
    GMTrace.o(6283671371776L, 46817);
    return (String)localObject;
  }
  
  public static String axa()
  {
    GMTrace.i(6283805589504L, 46818);
    Object localObject = new StringBuilder();
    ap.AS();
    localObject = com.tencent.mm.x.c.zp() + "favorite/web/";
    GMTrace.o(6283805589504L, 46818);
    return (String)localObject;
  }
  
  public static String axb()
  {
    GMTrace.i(6283939807232L, 46819);
    Object localObject = new StringBuilder();
    ap.AS();
    localObject = com.tencent.mm.x.c.zp() + "favorite/voice/";
    GMTrace.o(6283939807232L, 46819);
    return (String)localObject;
  }
  
  public static String axc()
  {
    GMTrace.i(6284074024960L, 46820);
    Object localObject = new StringBuilder();
    ap.AS();
    localObject = com.tencent.mm.x.c.zp() + "favorite/music/";
    GMTrace.o(6284074024960L, 46820);
    return (String)localObject;
  }
  
  public static boolean axd()
  {
    GMTrace.i(6285147766784L, 46828);
    if (ac.axs() > 0)
    {
      GMTrace.o(6285147766784L, 46828);
      return true;
    }
    GMTrace.o(6285147766784L, 46828);
    return false;
  }
  
  public static void axe()
  {
    GMTrace.i(6287966339072L, 46849);
    Object localObject2 = axf();
    if (((Set)localObject2).size() == 0)
    {
      w.v("MicroMsg.FavoriteLogic", "doBatchDel no item to delete");
      GMTrace.o(6287966339072L, 46849);
      return;
    }
    w.i("MicroMsg.FavoriteLogic", "doBatchDel idList:%s", new Object[] { localObject2.toString() });
    Object localObject1 = new LinkedList();
    localObject2 = ((Set)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      String str = (String)((Iterator)localObject2).next();
      try
      {
        ((LinkedList)localObject1).add(Integer.valueOf(bg.getInt(str, 0)));
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.FavoriteLogic", localException, "", new Object[0]);
        w.e("MicroMsg.FavoriteLogic", "doBatchDel parseInt error:%s", new Object[] { localException.getMessage() });
      }
    }
    w.i("MicroMsg.FavoriteLogic", "doBatchDel after parse, total size %d", new Object[] { Integer.valueOf(((LinkedList)localObject1).size()) });
    if (((LinkedList)localObject1).size() > 0)
    {
      localObject1 = new ab((LinkedList)localObject1);
      ap.wT().a((com.tencent.mm.ac.k)localObject1, 0);
    }
    GMTrace.o(6287966339072L, 46849);
  }
  
  private static Set<String> axf()
  {
    GMTrace.i(6288234774528L, 46851);
    ap.AS();
    Object localObject = (String)com.tencent.mm.x.c.xi().get(225282, "");
    w.i("MicroMsg.FavoriteLogic", "get need del IDs: %s", new Object[] { localObject });
    HashSet localHashSet = new HashSet();
    if (bg.mZ((String)localObject))
    {
      GMTrace.o(6288234774528L, 46851);
      return localHashSet;
    }
    localObject = ((String)localObject).split(",");
    if ((localObject == null) || (localObject.length == 0))
    {
      GMTrace.o(6288234774528L, 46851);
      return localHashSet;
    }
    int j = localObject.length;
    int i = 0;
    while (i < j)
    {
      localHashSet.add(localObject[i]);
      i += 1;
    }
    GMTrace.o(6288234774528L, 46851);
    return localHashSet;
  }
  
  public static long axg()
  {
    GMTrace.i(6289576951808L, 46861);
    long l2 = axh() - axi();
    long l1 = l2;
    if (l2 < 0L) {
      l1 = 1024L;
    }
    GMTrace.o(6289576951808L, 46861);
    return l1;
  }
  
  public static long axh()
  {
    GMTrace.i(6289711169536L, 46862);
    ap.AS();
    long l = ((Long)com.tencent.mm.x.c.xi().get(w.a.uWI, Long.valueOf(0L))).longValue();
    GMTrace.o(6289711169536L, 46862);
    return l;
  }
  
  public static long axi()
  {
    GMTrace.i(6289845387264L, 46863);
    ap.AS();
    long l = ((Long)com.tencent.mm.x.c.xi().get(w.a.uWH, Long.valueOf(0L))).longValue();
    GMTrace.o(6289845387264L, 46863);
    return l;
  }
  
  public static boolean axj()
  {
    GMTrace.i(6289979604992L, 46864);
    if (axh() == 0L)
    {
      GMTrace.o(6289979604992L, 46864);
      return false;
    }
    if (axg() < 10485760L)
    {
      GMTrace.o(6289979604992L, 46864);
      return true;
    }
    GMTrace.o(6289979604992L, 46864);
    return false;
  }
  
  public static boolean axk()
  {
    GMTrace.i(6290113822720L, 46865);
    if (axh() == 0L)
    {
      GMTrace.o(6290113822720L, 46865);
      return false;
    }
    if (axg() < 52428800L)
    {
      GMTrace.o(6290113822720L, 46865);
      return true;
    }
    GMTrace.o(6290113822720L, 46865);
    return false;
  }
  
  public static long axl()
  {
    GMTrace.i(6290248040448L, 46866);
    long l = com.tencent.mm.sdk.platformtools.ab.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ab.bNa(), 0).getLong("fav_mx_auto_download_size", 26214400L);
    GMTrace.o(6290248040448L, 46866);
    return l;
  }
  
  public static long axm()
  {
    GMTrace.i(6290516475904L, 46868);
    long l2 = com.tencent.mm.sdk.platformtools.ab.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ab.bNa(), 0).getLong("fav_mx_auto_upload_size", 0L);
    long l1 = l2;
    if (l2 == 0L) {
      l1 = 26214400L;
    }
    GMTrace.o(6290516475904L, 46868);
    return l1;
  }
  
  public static void axn()
  {
    GMTrace.i(6292127088640L, 46880);
    if (0L >= lPy)
    {
      w.i("MicroMsg.FavoriteLogic", "addTagWhenAddToFav,try to add tag ,but favLocalId is null, return");
      GMTrace.o(6292127088640L, 46880);
      return;
    }
    j localj = com.tencent.mm.plugin.favorite.h.awD().cc(lPy);
    lPy = 0L;
    if (localj == null)
    {
      w.i("MicroMsg.FavoriteLogic", "addTagWhenAddToFav,try to add tag ,but iteminfo is null, return");
      GMTrace.o(6292127088640L, 46880);
      return;
    }
    w.i("MicroMsg.FavoriteLogic", "addTagWhenAddToFav ,go on");
    Intent localIntent = new Intent();
    localIntent.putExtra("key_fav_scene", 5);
    localIntent.putExtra("key_fav_item_id", localj.field_localId);
    com.tencent.mm.bi.d.b(com.tencent.mm.sdk.platformtools.ab.getContext(), "favorite", ".ui.FavTagEditUI", localIntent);
    GMTrace.o(6292127088640L, 46880);
  }
  
  public static List<Long> axo()
  {
    GMTrace.i(6292395524096L, 46882);
    k localk = com.tencent.mm.plugin.favorite.h.awD();
    long l1 = System.currentTimeMillis();
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = "";
    Object localObject2 = lPB;
    int j = localObject2.length;
    int i = 0;
    int k;
    while (i < j)
    {
      k = localObject2[i];
      localObject1 = (String)localObject1 + k + ",";
      i += 1;
    }
    localObject2 = localObject1;
    if (((String)localObject1).endsWith(",")) {
      localObject2 = ((String)localObject1).substring(0, ((String)localObject1).length() - 1);
    }
    localObject1 = "select localId from FavItemInfo where " + " itemStatus in (" + (String)localObject2 + ")";
    String str = (String)localObject1 + " and datatotalsize > 0 ";
    localObject1 = "";
    localObject2 = lPA;
    j = localObject2.length;
    i = 0;
    while (i < j)
    {
      k = localObject2[i];
      localObject1 = (String)localObject1 + k + ",";
      i += 1;
    }
    localObject2 = localObject1;
    if (((String)localObject1).endsWith(",")) {
      localObject2 = ((String)localObject1).substring(0, ((String)localObject1).length() - 1);
    }
    localObject1 = str + " and type in (" + (String)localObject2 + ")";
    localObject1 = (String)localObject1 + " order by datatotalsize desc";
    localObject1 = localk.gMB.rawQuery((String)localObject1, null);
    if (localObject1 == null)
    {
      GMTrace.o(6292395524096L, 46882);
      return localArrayList;
    }
    if (((Cursor)localObject1).getCount() == 0)
    {
      ((Cursor)localObject1).close();
      GMTrace.o(6292395524096L, 46882);
      return localArrayList;
    }
    while (((Cursor)localObject1).moveToNext()) {
      localArrayList.add(Long.valueOf(((Cursor)localObject1).getLong(0)));
    }
    ((Cursor)localObject1).close();
    long l2 = System.currentTimeMillis();
    w.i("MicroMsg.FavItemInfoStorage", "getCleanList cu.getCount() = %d,used %dms", new Object[] { Integer.valueOf(localArrayList.size()), Long.valueOf(l2 - l1) });
    GMTrace.o(6292395524096L, 46882);
    return localArrayList;
  }
  
  public static List<j> b(long paramLong, int paramInt, Set<Integer> paramSet, a parama)
  {
    GMTrace.i(6284342460416L, 46822);
    k localk;
    ArrayList localArrayList;
    Object localObject;
    if (paramLong == 0L)
    {
      localk = com.tencent.mm.plugin.favorite.h.awD();
      if ((paramSet != null) && (paramSet.contains(Integer.valueOf(paramInt))))
      {
        w.w("MicroMsg.FavItemInfoStorage", "getFirstPageList::block set contains target type, error, do return null");
        GMTrace.o(6284342460416L, 46822);
        return null;
      }
      localArrayList = new ArrayList();
      localObject = "select " + k.lOE + " from FavItemInfo where itemStatus" + " > 0";
      if (paramInt != -1) {
        paramSet = (String)localObject + " and type = " + paramInt;
      }
    }
    for (;;)
    {
      paramSet = paramSet + " order by updateTime desc limit 20";
      paramSet = localk.gMB.a(paramSet, null, 2);
      if (paramSet == null)
      {
        GMTrace.o(6284342460416L, 46822);
        return localArrayList;
        if (paramSet != null)
        {
          Iterator localIterator = paramSet.iterator();
          for (;;)
          {
            paramSet = (Set<Integer>)localObject;
            if (!localIterator.hasNext()) {
              break;
            }
            paramInt = ((Integer)localIterator.next()).intValue();
            localObject = (String)localObject + " and type != " + paramInt;
          }
        }
      }
      else
      {
        while (paramSet.moveToNext())
        {
          localObject = new j();
          ((j)localObject).b(paramSet);
          if ((parama != null) && (parama.g((j)localObject))) {
            w.w("MicroMsg.FavItemInfoStorage", "id[%d] type[%d] match filter", new Object[] { Integer.valueOf(((j)localObject).field_id), Integer.valueOf(((j)localObject).field_type) });
          } else {
            localArrayList.add(localObject);
          }
        }
        paramSet.close();
        GMTrace.o(6284342460416L, 46822);
        return localArrayList;
        paramSet = com.tencent.mm.plugin.favorite.h.awD().a(paramLong, paramInt, paramSet, parama);
        GMTrace.o(6284342460416L, 46822);
        return paramSet;
      }
      paramSet = (Set<Integer>)localObject;
    }
  }
  
  public static void b(j paramj, sp paramsp, boolean paramBoolean)
  {
    GMTrace.i(6285684637696L, 46832);
    if (bg.mZ(paramsp.lUP))
    {
      GMTrace.o(6285684637696L, 46832);
      return;
    }
    String str = xl(paramsp.lUP);
    a locala = com.tencent.mm.plugin.favorite.h.awy().wZ(str);
    Object localObject = locala;
    if (locala != null)
    {
      localObject = locala;
      if (locala.field_status == 3)
      {
        com.tencent.mm.plugin.favorite.h.awy().b(locala, new String[] { "dataId" });
        localObject = null;
      }
    }
    if ((localObject != null) && (((a)localObject).field_type == 1))
    {
      ((a)localObject).field_status = 1;
      com.tencent.mm.plugin.favorite.h.awy().a((a)localObject, new String[] { "dataId" });
      com.tencent.mm.plugin.favorite.h.awx().xp(str);
      com.tencent.mm.plugin.favorite.h.awx().run();
      GMTrace.o(6285684637696L, 46832);
      return;
    }
    localObject = new File(h(paramsp));
    if ((!bg.mZ(paramsp.tOt)) && (!bg.mZ(paramsp.haX)) && (!((File)localObject).exists()))
    {
      a(paramsp, paramj, 1);
      com.tencent.mm.plugin.favorite.h.awx().xp(str);
      com.tencent.mm.plugin.favorite.h.awx().run();
    }
    GMTrace.o(6285684637696L, 46832);
  }
  
  public static int bZ(int paramInt1, int paramInt2)
  {
    GMTrace.i(6283402936320L, 46815);
    if (paramInt2 == 65135)
    {
      GMTrace.o(6283402936320L, 46815);
      return -4;
    }
    if (paramInt1 == 4)
    {
      GMTrace.o(6283402936320L, 46815);
      return -2;
    }
    GMTrace.o(6283402936320L, 46815);
    return -1;
  }
  
  public static void cg(long paramLong)
  {
    GMTrace.i(6283000283136L, 46812);
    if (lPw.containsKey(Long.valueOf(paramLong)))
    {
      GMTrace.o(6283000283136L, 46812);
      return;
    }
    lPw.put(Long.valueOf(paramLong), Long.valueOf(System.currentTimeMillis()));
    GMTrace.o(6283000283136L, 46812);
  }
  
  public static long ch(long paramLong)
  {
    GMTrace.i(6283134500864L, 46813);
    Long localLong = (Long)lPw.get(Long.valueOf(paramLong));
    if (localLong == null)
    {
      GMTrace.o(6283134500864L, 46813);
      return -1L;
    }
    paramLong = System.currentTimeMillis();
    long l = localLong.longValue();
    GMTrace.o(6283134500864L, 46813);
    return paramLong - l;
  }
  
  public static void ci(long paramLong)
  {
    GMTrace.i(6283268718592L, 46814);
    if (lPx.containsKey(Long.valueOf(paramLong)))
    {
      GMTrace.o(6283268718592L, 46814);
      return;
    }
    lPx.put(Long.valueOf(paramLong), Long.valueOf(System.currentTimeMillis()));
    GMTrace.o(6283268718592L, 46814);
  }
  
  public static float cj(long paramLong)
  {
    float f1 = 1.0F;
    GMTrace.i(18033762369536L, 134362);
    float f2 = (float)paramLong / 1000.0F;
    if (f2 < 1.0F) {}
    for (;;)
    {
      f1 = Math.round(f1);
      GMTrace.o(18033762369536L, 134362);
      return f1;
      f1 = f2;
    }
  }
  
  public static void ck(long paramLong)
  {
    GMTrace.i(6289308516352L, 46859);
    w.i("MicroMsg.FavoriteLogic", "setUsedCapacity:%d", new Object[] { Long.valueOf(paramLong) });
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.uWH, Long.valueOf(paramLong));
    GMTrace.o(6289308516352L, 46859);
  }
  
  public static void cl(long paramLong)
  {
    GMTrace.i(6289442734080L, 46860);
    w.i("MicroMsg.FavoriteLogic", "setTotalCapacity:%d", new Object[] { Long.valueOf(paramLong) });
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.uWI, Long.valueOf(paramLong));
    GMTrace.o(6289442734080L, 46860);
  }
  
  public static void cm(long paramLong)
  {
    GMTrace.i(6290382258176L, 46867);
    com.tencent.mm.sdk.platformtools.ab.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ab.bNa(), 0).edit().putLong("fav_mx_auto_download_size", paramLong).commit();
    GMTrace.o(6290382258176L, 46867);
  }
  
  public static void cn(long paramLong)
  {
    GMTrace.i(6290650693632L, 46869);
    com.tencent.mm.sdk.platformtools.ab.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ab.bNa(), 0).edit().putLong("fav_mx_auto_upload_size", paramLong).commit();
    GMTrace.o(6290650693632L, 46869);
  }
  
  public static void co(long paramLong)
  {
    GMTrace.i(6290784911360L, 46870);
    com.tencent.mm.sdk.platformtools.ab.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ab.bNa(), 0).edit().putLong("fav_mx_file_size", paramLong).commit();
    GMTrace.o(6290784911360L, 46870);
  }
  
  public static void cp(long paramLong)
  {
    GMTrace.i(6291992870912L, 46879);
    lPy = paramLong;
    GMTrace.o(6291992870912L, 46879);
  }
  
  public static j cq(long paramLong)
  {
    GMTrace.i(16937203531776L, 126192);
    j localj = new j();
    localj.field_type = 18;
    localj.field_sourceType = 6;
    String str = m.zF();
    ta localta = new ta();
    localta.Qf(str);
    localta.Qg(str);
    localta.zs(localj.field_sourceType);
    localta.ez(bg.Pp());
    localj.field_favProto.a(localta);
    localj.field_fromUser = localta.fFB;
    localj.field_toUser = localta.toUser;
    localj.field_favProto.zr(1);
    localj.field_favProto.zq(127);
    localj.field_edittime = bg.Po();
    localj.field_updateTime = bg.Pp();
    localj.field_favProto.ey(localj.field_edittime);
    localj.field_favProto.tQA.ez(bg.Pp());
    localj.field_itemStatus = 9;
    localj.field_localId = paramLong;
    com.tencent.mm.plugin.favorite.h.awD().c(localj);
    GMTrace.o(16937203531776L, 126192);
    return localj;
  }
  
  private static void d(Set<String> paramSet)
  {
    GMTrace.i(6288100556800L, 46850);
    StringBuffer localStringBuffer = new StringBuffer();
    paramSet = paramSet.iterator();
    while (paramSet.hasNext()) {
      localStringBuffer.append((String)paramSet.next()).append(",");
    }
    paramSet = "";
    if (localStringBuffer.length() > 0) {
      paramSet = localStringBuffer.substring(0, localStringBuffer.length() - 1);
    }
    w.i("MicroMsg.FavoriteLogic", "set need del IDs: %s", new Object[] { paramSet });
    ap.AS();
    com.tencent.mm.x.c.xi().set(225282, paramSet);
    GMTrace.o(6288100556800L, 46850);
  }
  
  public static boolean d(sp paramsp)
  {
    GMTrace.i(6284879331328L, 46826);
    boolean bool = new File(g(paramsp)).exists();
    GMTrace.o(6284879331328L, 46826);
    return bool;
  }
  
  public static void e(String paramString, Context paramContext)
  {
    GMTrace.i(6293469265920L, 46890);
    String str = com.tencent.mm.modelvideo.t.mk(paramString);
    w.i("MicroMsg.FavoriteLogic", "save video now video path %s out path %s", new Object[] { paramString, str });
    if (bg.mZ(str))
    {
      Toast.makeText(paramContext, paramContext.getString(R.l.eOS), 1).show();
      GMTrace.o(6293469265920L, 46890);
      return;
    }
    Toast.makeText(paramContext, paramContext.getString(R.l.eOT, new Object[] { str }), 1).show();
    com.tencent.mm.pluginsdk.ui.tools.k.b(str, paramContext);
    GMTrace.o(6293469265920L, 46890);
  }
  
  public static boolean e(sp paramsp)
  {
    GMTrace.i(6285013549056L, 46827);
    boolean bool = com.tencent.mm.sdk.platformtools.o.QO(g(paramsp));
    GMTrace.o(6285013549056L, 46827);
    return bool;
  }
  
  public static List<j> f(List<j> paramList, List<Long> paramList1)
  {
    int k = 0;
    GMTrace.i(6292529741824L, 46883);
    ArrayList localArrayList = new ArrayList();
    if (paramList1 == null)
    {
      GMTrace.o(6292529741824L, 46883);
      return localArrayList;
    }
    int i = k;
    long l;
    int j;
    if (paramList != null)
    {
      i = k;
      if (paramList.size() > 0)
      {
        localArrayList.addAll(paramList);
        l = ((j)paramList.get(paramList.size() - 1)).field_localId;
        j = 0;
      }
    }
    for (;;)
    {
      i = k;
      if (j < paramList1.size())
      {
        if (Long.valueOf(l).equals(paramList1.get(j))) {
          i = j + 1;
        }
      }
      else
      {
        j = i;
        while ((j < i + 20) && (j < paramList1.size()))
        {
          paramList = com.tencent.mm.plugin.favorite.h.awD().cc(((Long)paramList1.get(j)).longValue());
          if (paramList != null) {
            localArrayList.add(paramList);
          }
          j += 1;
        }
      }
      j += 1;
    }
    GMTrace.o(6292529741824L, 46883);
    return localArrayList;
  }
  
  public static void f(sp paramsp)
  {
    GMTrace.i(6285818855424L, 46833);
    a locala = com.tencent.mm.plugin.favorite.h.awy().wZ(paramsp.lUP);
    if ((locala != null) && (locala.field_status != 3))
    {
      locala.field_status = 2;
      com.tencent.mm.plugin.favorite.h.awy().a(locala, new String[] { "dataId" });
      com.tencent.mm.plugin.favorite.h.awx().pauseDownload(paramsp.lUP);
    }
    locala = com.tencent.mm.plugin.favorite.h.awy().wZ(xl(paramsp.lUP));
    if ((locala != null) && (locala.field_status != 3))
    {
      locala.field_status = 2;
      com.tencent.mm.plugin.favorite.h.awy().a(locala, new String[] { "dataId" });
      com.tencent.mm.plugin.favorite.h.awx().pauseDownload(xl(paramsp.lUP));
    }
    GMTrace.o(6285818855424L, 46833);
  }
  
  public static String fd(String paramString)
  {
    GMTrace.i(6291724435456L, 46877);
    ap.AS();
    Object localObject = com.tencent.mm.x.c.yL().SL(paramString);
    if (localObject == null)
    {
      w.w("MicroMsg.FavoriteLogic", "wtf get contact null, username %s", new Object[] { paramString });
      GMTrace.o(6291724435456L, 46877);
      return "";
    }
    String str = ((com.tencent.mm.storage.x)localObject).vq();
    localObject = str;
    if (com.tencent.mm.x.o.dW(str))
    {
      paramString = com.tencent.mm.x.j.eS(paramString);
      localObject = m.zF();
      if ((paramString != null) && (!paramString.isEmpty())) {
        break label114;
      }
      w.w("MicroMsg.FavoriteLogic", "get members from username error, content empty");
    }
    for (localObject = str;; localObject = com.tencent.mm.x.j.b(paramString, 3))
    {
      GMTrace.o(6291724435456L, 46877);
      return (String)localObject;
      label114:
      paramString.remove(localObject);
      paramString.add(0, localObject);
    }
  }
  
  public static String g(sp paramsp)
  {
    GMTrace.i(6286489944064L, 46838);
    if (paramsp == null)
    {
      GMTrace.o(6286489944064L, 46838);
      return "";
    }
    Object localObject2 = paramsp.lUP;
    if ((bg.mZ((String)localObject2)) || (!ap.AV()))
    {
      GMTrace.o(6286489944064L, 46838);
      return "";
    }
    File localFile2 = xk((String)localObject2);
    int j = 0;
    int i = j;
    File localFile1 = localFile2;
    Object localObject1 = localObject2;
    if (paramsp.aHe == 8)
    {
      i = j;
      localFile1 = localFile2;
      localObject1 = localObject2;
      if (!bg.mZ(paramsp.title))
      {
        localObject1 = paramsp.title;
        localFile1 = xk(paramsp.lUP);
        i = 1;
      }
    }
    localObject2 = localObject1;
    if (paramsp.tOM != null)
    {
      localObject2 = localObject1;
      if (paramsp.tOM.trim().length() > 0)
      {
        localObject2 = localObject1;
        if (i == 0) {
          localObject2 = (String)localObject1 + "." + paramsp.tOM;
        }
      }
    }
    paramsp = new File(localFile1, (String)localObject2).getAbsolutePath();
    GMTrace.o(6286489944064L, 46838);
    return paramsp;
  }
  
  public static String h(sp paramsp)
  {
    GMTrace.i(6286624161792L, 46839);
    if ((paramsp == null) || (bg.mZ(paramsp.lUP)))
    {
      GMTrace.o(6286624161792L, 46839);
      return "";
    }
    paramsp = xl(paramsp.lUP);
    paramsp = new File(xk(paramsp), paramsp).getAbsolutePath();
    GMTrace.o(6286624161792L, 46839);
    return paramsp;
  }
  
  public static void i(sp paramsp)
  {
    GMTrace.i(6293066612736L, 46887);
    if (bg.mZ(paramsp.lUP))
    {
      GMTrace.o(6293066612736L, 46887);
      return;
    }
    w.i("MicroMsg.FavoriteLogic", "restart cdndata download, dataId %s", new Object[] { paramsp.lUP });
    a locala = com.tencent.mm.plugin.favorite.h.awy().wZ(paramsp.lUP);
    Object localObject = locala;
    if (locala != null) {
      if (locala.field_status != 3)
      {
        localObject = locala;
        if (locala.field_status != 4) {}
      }
      else
      {
        com.tencent.mm.plugin.favorite.h.awy().b(locala, new String[] { "dataId" });
        localObject = null;
      }
    }
    if ((localObject != null) && (((a)localObject).field_type == 1))
    {
      w.i("MicroMsg.FavoriteLogic", "klem data not download completed.");
      ((a)localObject).field_status = 1;
      com.tencent.mm.plugin.favorite.h.awy().a((a)localObject, new String[] { "dataId" });
      com.tencent.mm.plugin.favorite.h.awx().xp(paramsp.lUP);
      com.tencent.mm.plugin.favorite.h.awx().run();
      GMTrace.o(6293066612736L, 46887);
      return;
    }
    localObject = new File(g(paramsp));
    if ((!bg.mZ(paramsp.tOz)) && (!bg.mZ(paramsp.tOx)) && (!((File)localObject).exists()))
    {
      w.i("MicroMsg.FavoriteLogic", "klem big img not exist, start download.");
      long l = System.currentTimeMillis();
      localObject = new j();
      ((j)localObject).field_localId = -1L;
      ((j)localObject).field_id = -1;
      ((j)localObject).field_type = 18;
      a(paramsp, (j)localObject, 1, true);
      com.tencent.mm.plugin.favorite.h.awx().xp(paramsp.lUP);
      com.tencent.mm.plugin.favorite.h.awx().run();
      w.i("MicroMsg.FavoriteLogic", "insert cdn item use %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    }
    GMTrace.o(6293066612736L, 46887);
  }
  
  public static long k(j paramj)
  {
    GMTrace.i(6283537154048L, 46816);
    if (paramj == null)
    {
      GMTrace.o(6283537154048L, 46816);
      return 0L;
    }
    paramj = paramj.field_favProto.tQC.iterator();
    sp localsp;
    for (int i = 0; paramj.hasNext(); i = (int)(localsp.tOS + l))
    {
      localsp = (sp)paramj.next();
      l = i;
    }
    long l = i;
    GMTrace.o(6283537154048L, 46816);
    return l;
  }
  
  public static void l(j paramj)
  {
    GMTrace.i(6285281984512L, 46829);
    if (!paramj.awM())
    {
      w.f("MicroMsg.FavoriteLogic", "restartItemUpload status not upload failed!");
      GMTrace.o(6285281984512L, 46829);
      return;
    }
    switch (paramj.field_itemStatus)
    {
    }
    for (;;)
    {
      GMTrace.o(6285281984512L, 46829);
      return;
      paramj.field_itemStatus = 1;
      com.tencent.mm.plugin.favorite.h.awD().a(paramj, new String[] { "localId" });
      com.tencent.mm.plugin.favorite.h.awu().run();
      GMTrace.o(6285281984512L, 46829);
      return;
      if (com.tencent.mm.plugin.favorite.h.awy().bZ(paramj.field_localId).size() == 0)
      {
        paramj.field_itemStatus = 9;
        com.tencent.mm.plugin.favorite.h.awD().a(paramj, new String[] { "localId" });
        paramj = new aa(paramj);
        ap.wT().a(paramj, 0);
        GMTrace.o(6285281984512L, 46829);
        return;
      }
      paramj.field_itemStatus = 4;
      com.tencent.mm.plugin.favorite.h.awy().a(paramj);
      com.tencent.mm.plugin.favorite.h.awD().a(paramj, new String[] { "localId" });
      Iterator localIterator = com.tencent.mm.plugin.favorite.h.awy().bZ(paramj.field_localId).iterator();
      a locala;
      while (localIterator.hasNext())
      {
        locala = (a)localIterator.next();
        w.i("MicroMsg.FavoriteLogic", "force upload favItem[last failed], favid:%d localId:%d, dataId:%s, dataType:%d totalLength %d", new Object[] { Integer.valueOf(paramj.field_id), Long.valueOf(paramj.field_localId), locala.field_dataId, Integer.valueOf(locala.field_dataType), Integer.valueOf(locala.field_totalLen) });
        com.tencent.mm.plugin.favorite.h.awx().xp(locala.field_dataId);
      }
      com.tencent.mm.plugin.favorite.h.awx().run();
      GMTrace.o(6285281984512L, 46829);
      return;
      com.tencent.mm.plugin.favorite.h.awD().r(12, paramj.field_localId);
      com.tencent.mm.plugin.favorite.h.awt().run();
      GMTrace.o(6285281984512L, 46829);
      return;
      com.tencent.mm.plugin.favorite.h.awD().r(15, paramj.field_localId);
      com.tencent.mm.plugin.favorite.h.awy().a(paramj);
      localIterator = com.tencent.mm.plugin.favorite.h.awy().bZ(paramj.field_localId).iterator();
      while (localIterator.hasNext())
      {
        locala = (a)localIterator.next();
        w.i("MicroMsg.FavoriteLogic", "force upload favItem[last mod failed], favid:%d localId:%d, dataId:%s, dataType:%d totalLength %d", new Object[] { Integer.valueOf(paramj.field_id), Long.valueOf(paramj.field_localId), locala.field_dataId, Integer.valueOf(locala.field_dataType), Integer.valueOf(locala.field_totalLen) });
        com.tencent.mm.plugin.favorite.h.awx().xp(locala.field_dataId);
      }
      com.tencent.mm.plugin.favorite.h.awx().run();
      GMTrace.o(6285281984512L, 46829);
      return;
      com.tencent.mm.plugin.favorite.h.awD().r(17, paramj.field_localId);
      com.tencent.mm.plugin.favorite.h.awv().run();
      GMTrace.o(6285281984512L, 46829);
      return;
      paramj.field_itemStatus = 9;
      com.tencent.mm.plugin.favorite.h.awD().a(paramj, new String[] { "localId" });
      com.tencent.mm.plugin.favorite.h.awt().run();
    }
  }
  
  public static void m(j paramj)
  {
    GMTrace.i(6285416202240L, 46830);
    if (paramj == null)
    {
      GMTrace.o(6285416202240L, 46830);
      return;
    }
    if ((paramj.field_itemStatus == 8) || (paramj.field_itemStatus == 10))
    {
      paramj.field_itemStatus = 7;
      Object localObject = paramj.field_favProto.tQC;
      if (((List)localObject).size() == 0)
      {
        GMTrace.o(6285416202240L, 46830);
        return;
      }
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        sp localsp = (sp)((Iterator)localObject).next();
        a(paramj, localsp, true);
        b(paramj, localsp, true);
      }
      GMTrace.o(6285416202240L, 46830);
      return;
    }
    w.e("MicroMsg.FavoriteLogic", "status not download failed or done!");
    GMTrace.o(6285416202240L, 46830);
  }
  
  public static sp n(j paramj)
  {
    GMTrace.i(6285953073152L, 46834);
    if (paramj == null)
    {
      paramj = new sp();
      GMTrace.o(6285953073152L, 46834);
      return paramj;
    }
    if (paramj.field_favProto.tQC.size() == 0)
    {
      paramj = new sp();
      GMTrace.o(6285953073152L, 46834);
      return paramj;
    }
    paramj = (sp)paramj.field_favProto.tQC.get(0);
    GMTrace.o(6285953073152L, 46834);
    return paramj;
  }
  
  public static boolean nr(int paramInt)
  {
    GMTrace.i(6292663959552L, 46884);
    int[] arrayOfInt = lPB;
    int j = arrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      if (arrayOfInt[i] == paramInt)
      {
        GMTrace.o(6292663959552L, 46884);
        return true;
      }
      i += 1;
    }
    GMTrace.o(6292663959552L, 46884);
    return false;
  }
  
  public static boolean ns(int paramInt)
  {
    GMTrace.i(6292798177280L, 46885);
    int[] arrayOfInt = lPA;
    int j = arrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      if (arrayOfInt[i] == paramInt)
      {
        GMTrace.o(6292798177280L, 46885);
        return true;
      }
      i += 1;
    }
    GMTrace.o(6292798177280L, 46885);
    return false;
  }
  
  public static void o(j paramj)
  {
    GMTrace.i(6286221508608L, 46836);
    if (!paramj.awL())
    {
      w.e("MicroMsg.FavoriteLogic", "pauseItemUpload, not uploading");
      GMTrace.o(6286221508608L, 46836);
      return;
    }
    w.v("MicroMsg.FavoriteLogic", "pauseItemUpload, itemStatu:%d", new Object[] { Integer.valueOf(paramj.field_itemStatus) });
    Iterator localIterator = paramj.field_favProto.tQC.iterator();
    while (localIterator.hasNext())
    {
      sp localsp = (sp)localIterator.next();
      a locala = com.tencent.mm.plugin.favorite.h.awy().wZ(localsp.lUP);
      if ((locala != null) && (locala.field_status != 3))
      {
        locala.field_status = 2;
        com.tencent.mm.plugin.favorite.h.awy().a(locala, new String[] { "dataId" });
        com.tencent.mm.plugin.favorite.h.awx().xq(localsp.lUP);
      }
      locala = com.tencent.mm.plugin.favorite.h.awy().wZ(xl(localsp.lUP));
      if ((locala != null) && (locala.field_status != 3))
      {
        locala.field_status = 2;
        com.tencent.mm.plugin.favorite.h.awy().a(locala, new String[] { "dataId" });
        com.tencent.mm.plugin.favorite.h.awx().xq(xl(localsp.lUP));
      }
    }
    paramj = com.tencent.mm.plugin.favorite.h.awD().cc(paramj.field_localId);
    w.v("MicroMsg.FavoriteLogic", "pauseItemUpload, after pause data itemStatu:%d", new Object[] { Integer.valueOf(paramj.field_itemStatus) });
    switch (paramj.field_itemStatus)
    {
    }
    for (;;)
    {
      GMTrace.o(6286221508608L, 46836);
      return;
      com.tencent.mm.plugin.favorite.h.awD().r(3, paramj.field_localId);
      w.v("MicroMsg.FavoriteLogic", "pauseItemUpload, final itemStatu:%d", new Object[] { Integer.valueOf(3) });
      GMTrace.o(6286221508608L, 46836);
      return;
      com.tencent.mm.plugin.favorite.h.awD().r(6, paramj.field_localId);
      w.v("MicroMsg.FavoriteLogic", "pauseItemUpload, final itemStatu:%d", new Object[] { Integer.valueOf(6) });
      GMTrace.o(6286221508608L, 46836);
      return;
      com.tencent.mm.plugin.favorite.h.awD().r(11, paramj.field_localId);
      w.v("MicroMsg.FavoriteLogic", "pauseItemUpload, final itemStatu:%d", new Object[] { Integer.valueOf(11) });
      GMTrace.o(6286221508608L, 46836);
      return;
      com.tencent.mm.plugin.favorite.h.awD().r(14, paramj.field_localId);
      w.v("MicroMsg.FavoriteLogic", "pauseItemUpload, final itemStatu:%d", new Object[] { Integer.valueOf(14) });
      GMTrace.o(6286221508608L, 46836);
      return;
      com.tencent.mm.plugin.favorite.h.awD().r(16, paramj.field_localId);
      w.v("MicroMsg.FavoriteLogic", "pauseItemUpload, final itemStatu:%d", new Object[] { Integer.valueOf(16) });
      GMTrace.o(6286221508608L, 46836);
      return;
      com.tencent.mm.plugin.favorite.h.awD().r(18, paramj.field_localId);
      w.v("MicroMsg.FavoriteLogic", "pauseItemUpload, final itemStatu:%d", new Object[] { Integer.valueOf(18) });
    }
  }
  
  private static void p(j paramj)
  {
    GMTrace.i(6288368992256L, 46852);
    Set localSet = com.tencent.mm.be.a.hYg;
    paramj = paramj.field_favProto.tQC;
    int i = 0;
    while (i < paramj.size())
    {
      String str = h((sp)paramj.get(i));
      if ((localSet == null) || (!localSet.contains(str))) {
        com.tencent.mm.loader.stub.b.deleteFile(str);
      }
      str = g((sp)paramj.get(i));
      if ((localSet == null) || (!localSet.contains(str))) {
        com.tencent.mm.loader.stub.b.deleteFile(str);
      }
      i += 1;
    }
    GMTrace.o(6288368992256L, 46852);
  }
  
  public static long q(long paramLong, int paramInt)
  {
    GMTrace.i(6284476678144L, 46823);
    w.i("MicroMsg.FavoriteLogic", "tryStartBatchGet...");
    k localk = com.tencent.mm.plugin.favorite.h.awD();
    long l1;
    long l2;
    if (localk.gMB == null)
    {
      w.e("MicroMsg.FavItemInfoStorage", "getMinBatchGetUpdateTime, but db is null, return");
      l1 = 0L;
      localk = com.tencent.mm.plugin.favorite.h.awD();
      if (localk.gMB != null) {
        break label458;
      }
      w.e("MicroMsg.FavItemInfoStorage", "getNextUpdateTime, but db is null, return");
      l2 = 0L;
    }
    for (;;)
    {
      w.v("MicroMsg.FavoriteLogic", "klem, tryStartBatchGet, batchGetTime:%d, itemTiem:%d, updateTime:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(paramLong) });
      if (l1 != 0L) {
        break label772;
      }
      GMTrace.o(6284476678144L, 46823);
      return l2;
      if (paramLong == 0L)
      {
        localObject = "select updateTime from (select * from FavItemInfo";
        if (paramInt != -1) {
          localObject = "select updateTime from (select * from FavItemInfo" + " where type = " + paramInt;
        }
        localObject = (String)localObject + " order by updateTime desc limit 20";
        localObject = (String)localObject + ") where updateSeq > localSeq";
        localObject = localk.gMB.rawQuery((String)localObject, null);
        if (localObject == null)
        {
          l1 = 0L;
          break;
        }
        if (((Cursor)localObject).getCount() == 0)
        {
          ((Cursor)localObject).close();
          l1 = 0L;
          break;
        }
        ((Cursor)localObject).moveToLast();
        l1 = ((Cursor)localObject).getLong(0);
        ((Cursor)localObject).close();
        break;
      }
      str = "select updateTime from (select * from FavItemInfo where updateTime < " + paramLong;
      localObject = str;
      if (paramInt != -1) {
        localObject = str + " and type = " + paramInt;
      }
      localObject = (String)localObject + " order by updateTime desc limit 20";
      localObject = (String)localObject + ") where updateSeq > localSeq";
      localObject = localk.gMB.rawQuery((String)localObject, null);
      if (localObject == null)
      {
        l1 = 0L;
        break;
      }
      if (((Cursor)localObject).getCount() == 0)
      {
        ((Cursor)localObject).close();
        l1 = 0L;
        break;
      }
      ((Cursor)localObject).moveToLast();
      l1 = ((Cursor)localObject).getLong(0);
      ((Cursor)localObject).close();
      break;
      label458:
      if (paramLong != 0L) {
        break label601;
      }
      localObject = "select updateTime from FavItemInfo where itemStatus > 0";
      if (paramInt != -1) {
        localObject = "select updateTime from FavItemInfo where itemStatus > 0" + " and type = " + paramInt;
      }
      localObject = (String)localObject + " order by updateTime desc limit 20";
      localObject = localk.gMB.rawQuery((String)localObject, null);
      if (localObject == null)
      {
        l2 = 0L;
      }
      else if (((Cursor)localObject).getCount() == 0)
      {
        ((Cursor)localObject).close();
        l2 = 0L;
      }
      else
      {
        ((Cursor)localObject).moveToLast();
        l2 = ((Cursor)localObject).getLong(0);
        ((Cursor)localObject).close();
      }
    }
    label601:
    String str = "select updateTime from FavItemInfo where updateTime < " + paramLong;
    Object localObject = str;
    if (paramInt != -1) {
      localObject = str + " and type = " + paramInt;
    }
    localObject = (String)localObject + " and itemStatus > 0";
    localObject = (String)localObject + " order by updateTime desc limit 20";
    localObject = localk.gMB.rawQuery((String)localObject, null);
    if ((localObject != null) && (((Cursor)localObject).getCount() > 0)) {
      ((Cursor)localObject).moveToLast();
    }
    for (long l3 = ((Cursor)localObject).getLong(0);; l3 = paramLong)
    {
      l2 = l3;
      if (localObject == null) {
        break;
      }
      ((Cursor)localObject).close();
      l2 = l3;
      break;
      label772:
      localObject = com.tencent.mm.plugin.favorite.h.awD().p(l1, paramInt);
      if (((LinkedList)localObject).size() > 0)
      {
        w.i("MicroMsg.FavoriteLogic", "klem, tryStartBatchGet, batchGetTime:%d, itemTiem:%d, updateTime:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(paramLong) });
        w.i("MicroMsg.FavoriteLogic", "klem, tryStartBatchGet, need batch get idList size:%d", new Object[] { Integer.valueOf(((LinkedList)localObject).size()) });
        localObject = new ac((LinkedList)localObject);
        if (!ap.wT().a((com.tencent.mm.ac.k)localObject, 0))
        {
          w.w("MicroMsg.FavoriteLogic", "do scene BatchGetFav fail");
          ac.axr();
        }
      }
      if (l2 == 0L)
      {
        GMTrace.o(6284476678144L, 46823);
        return l1;
      }
      if (l1 < l2)
      {
        GMTrace.o(6284476678144L, 46823);
        return l1;
      }
      GMTrace.o(6284476678144L, 46823);
      return l2;
    }
  }
  
  private static void q(j paramj)
  {
    GMTrace.i(6288771645440L, 46855);
    o localo = com.tencent.mm.plugin.favorite.h.awC().cf(paramj.field_localId);
    if (localo == null)
    {
      localo = new o();
      localo.field_localId = paramj.field_localId;
    }
    for (int i = 1;; i = 0)
    {
      localo.field_tagContent = "";
      Iterator localIterator = paramj.field_tagProto.tQL.iterator();
      String str;
      while (localIterator.hasNext())
      {
        str = (String)localIterator.next();
        localo.field_tagContent = (localo.field_tagContent + " " + str);
      }
      localIterator = paramj.field_tagProto.tQM.iterator();
      while (localIterator.hasNext())
      {
        str = (String)localIterator.next();
        localo.field_tagContent = (localo.field_tagContent + " " + str);
        com.tencent.mm.plugin.favorite.h.aww().xg(str);
      }
      localo.field_content = "";
      localo.field_time = paramj.field_updateTime;
      localo.field_type = paramj.field_type;
      if (i != 0)
      {
        com.tencent.mm.plugin.favorite.h.awC().b(localo);
        GMTrace.o(6288771645440L, 46855);
        return;
      }
      com.tencent.mm.plugin.favorite.h.awC().c(localo, new String[] { "localId" });
      GMTrace.o(6288771645440L, 46855);
      return;
    }
  }
  
  public static void r(j paramj)
  {
    GMTrace.i(6288905863168L, 46856);
    o localo = com.tencent.mm.plugin.favorite.h.awC().cf(paramj.field_localId);
    if (localo == null)
    {
      localo = new o();
      localo.field_localId = paramj.field_localId;
    }
    for (int i = 1;; i = 0)
    {
      StringBuffer localStringBuffer = new StringBuffer();
      if (paramj.field_favProto.title != null) {
        localStringBuffer.append(paramj.field_favProto.title);
      }
      if (paramj.field_favProto.desc != null) {
        localStringBuffer.append(paramj.field_favProto.desc);
      }
      Object localObject2;
      if (paramj.field_favProto.tQA != null)
      {
        localObject1 = paramj.field_favProto.tQA;
        if (!bg.mZ(((ta)localObject1).fFB))
        {
          localStringBuffer.append(((ta)localObject1).fFB);
          ap.AS();
          localObject2 = com.tencent.mm.x.c.yL().SL(((ta)localObject1).fFB);
          if (localObject2 != null) {
            localStringBuffer.append(((com.tencent.mm.g.b.af)localObject2).field_nickname).append(((com.tencent.mm.g.b.af)localObject2).field_conRemark);
          }
          ap.AS();
          localObject2 = com.tencent.mm.x.c.yL().SL(((ta)localObject1).toUser);
          if (localObject2 != null) {
            localStringBuffer.append(((com.tencent.mm.g.b.af)localObject2).field_nickname).append(((com.tencent.mm.g.b.af)localObject2).field_conRemark);
          }
          localStringBuffer.append(((ta)localObject1).tQf);
        }
      }
      Object localObject1 = paramj.field_favProto.tQC;
      localo.field_subtype = 0;
      localObject1 = ((LinkedList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (sp)((Iterator)localObject1).next();
        if (((sp)localObject2).desc != null) {
          localStringBuffer.append(((sp)localObject2).desc);
        }
        if (((sp)localObject2).title != null) {
          localStringBuffer.append(((sp)localObject2).title);
        }
        int j = ((sp)localObject2).aHe;
        int k = localo.field_subtype;
        localo.field_subtype = (o.np(j) | k);
      }
      if (paramj.field_favProto.tPN != null)
      {
        if (paramj.field_favProto.tPN.desc != null) {
          localStringBuffer.append(paramj.field_favProto.tPN.desc);
        }
        if (paramj.field_favProto.tPN.title != null) {
          localStringBuffer.append(paramj.field_favProto.tPN.title);
        }
      }
      if (paramj.field_favProto.tPP != null)
      {
        if (paramj.field_favProto.tPP.desc != null) {
          localStringBuffer.append(paramj.field_favProto.tPP.desc);
        }
        if (paramj.field_favProto.tPP.title != null) {
          localStringBuffer.append(paramj.field_favProto.tPP.title);
        }
      }
      localo.field_tagContent = "";
      localObject1 = paramj.field_tagProto.tQL.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        localo.field_tagContent = (localo.field_tagContent + " " + (String)localObject2);
        localStringBuffer.append((String)localObject2);
      }
      localObject1 = paramj.field_tagProto.tQM.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        localo.field_tagContent = (localo.field_tagContent + " " + (String)localObject2);
        localStringBuffer.append((String)localObject2);
        com.tencent.mm.plugin.favorite.h.aww().xg((String)localObject2);
      }
      localo.field_content = localStringBuffer.toString();
      localo.field_time = paramj.field_updateTime;
      localo.field_type = paramj.field_type;
      if (i != 0)
      {
        com.tencent.mm.plugin.favorite.h.awC().b(localo);
        GMTrace.o(6288905863168L, 46856);
        return;
      }
      com.tencent.mm.plugin.favorite.h.awC().c(localo, new String[] { "localId" });
      GMTrace.o(6288905863168L, 46856);
      return;
    }
  }
  
  public static boolean s(j paramj)
  {
    GMTrace.i(6292261306368L, 46881);
    if (paramj == null)
    {
      GMTrace.o(6292261306368L, 46881);
      return false;
    }
    if ((paramj.field_itemStatus == 8) || (paramj.field_itemStatus == 10) || (paramj.field_itemStatus == 7))
    {
      GMTrace.o(6292261306368L, 46881);
      return true;
    }
    GMTrace.o(6292261306368L, 46881);
    return false;
  }
  
  public static void startSync()
  {
    GMTrace.i(6284610895872L, 46824);
    af localaf = new af();
    ap.wT().a(localaf, 0);
    GMTrace.o(6284610895872L, 46824);
  }
  
  public static CharSequence t(Context paramContext, int paramInt)
  {
    GMTrace.i(18033628151808L, 134361);
    int i = paramInt / 1000;
    if (i <= 0)
    {
      paramContext = paramContext.getString(R.l.dYn, new Object[] { Integer.valueOf(0) });
      GMTrace.o(18033628151808L, 134361);
      return paramContext;
    }
    paramInt = i / 60;
    i %= 60;
    if (paramInt == 0)
    {
      paramContext = paramContext.getString(R.l.dYn, new Object[] { Integer.valueOf(i) });
      GMTrace.o(18033628151808L, 134361);
      return paramContext;
    }
    paramContext = paramContext.getString(R.l.dYm, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
    GMTrace.o(18033628151808L, 134361);
    return paramContext;
  }
  
  public static boolean t(j paramj)
  {
    GMTrace.i(6293200830464L, 46888);
    if (paramj == null)
    {
      GMTrace.o(6293200830464L, 46888);
      return false;
    }
    sp localsp = n(paramj);
    if (localsp == null)
    {
      GMTrace.o(6293200830464L, 46888);
      return false;
    }
    long l = bg.Pq();
    com.tencent.mm.plugin.sight.base.a locala = com.tencent.mm.plugin.sight.base.d.FK(g(localsp));
    int j;
    int i;
    boolean bool;
    if (locala != null)
    {
      j = locala.bes();
      i = localsp.duration;
      if ((i <= 0) || (Math.abs(i - j) >= 2))
      {
        localsp.zj(j);
        bool = com.tencent.mm.plugin.favorite.h.awD().a(paramj, new String[] { "localId" });
      }
    }
    for (;;)
    {
      w.i("MicroMsg.FavoriteLogic", "repair video duration[%d TO %d] %b cost time %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(bool), Long.valueOf(bg.aG(l)) });
      GMTrace.o(6293200830464L, 46888);
      return bool;
      bool = false;
      continue;
      bool = false;
      i = 0;
      j = 0;
    }
  }
  
  public static boolean u(j paramj)
  {
    GMTrace.i(6293737701376L, 46892);
    if (paramj.field_favProto == null)
    {
      GMTrace.o(6293737701376L, 46892);
      return false;
    }
    paramj = paramj.field_favProto.tQC.iterator();
    while (paramj.hasNext())
    {
      sp localsp = (sp)paramj.next();
      if (localsp.tPF == 2)
      {
        GMTrace.o(6293737701376L, 46892);
        return true;
      }
      if (localsp.tPF == 1)
      {
        GMTrace.o(6293737701376L, 46892);
        return true;
      }
    }
    GMTrace.o(6293737701376L, 46892);
    return false;
  }
  
  public static boolean v(j paramj)
  {
    GMTrace.i(16937337749504L, 126193);
    if (com.tencent.mm.plugin.favorite.h.awD().cc(paramj.field_localId) != null)
    {
      GMTrace.o(16937337749504L, 126193);
      return true;
    }
    GMTrace.o(16937337749504L, 126193);
    return false;
  }
  
  public static String x(Context paramContext, int paramInt)
  {
    GMTrace.i(6291456000000L, 46875);
    if (paramContext == null)
    {
      GMTrace.o(6291456000000L, 46875);
      return "";
    }
    switch (paramInt)
    {
    default: 
      GMTrace.o(6291456000000L, 46875);
      return "";
    case 2: 
      paramContext = paramContext.getString(R.l.dXW);
      GMTrace.o(6291456000000L, 46875);
      return paramContext;
    case 7: 
      paramContext = paramContext.getString(R.l.dXY);
      GMTrace.o(6291456000000L, 46875);
      return paramContext;
    case 6: 
      paramContext = paramContext.getString(R.l.dXX);
      GMTrace.o(6291456000000L, 46875);
      return paramContext;
    case 1: 
      paramContext = paramContext.getString(R.l.dXU);
      GMTrace.o(6291456000000L, 46875);
      return paramContext;
    case 4: 
      paramContext = paramContext.getString(R.l.dYb);
      GMTrace.o(6291456000000L, 46875);
      return paramContext;
    case 5: 
      paramContext = paramContext.getString(R.l.dYa);
      GMTrace.o(6291456000000L, 46875);
      return paramContext;
    case 3: 
      paramContext = paramContext.getString(R.l.dYc);
      GMTrace.o(6291456000000L, 46875);
      return paramContext;
    }
    paramContext = paramContext.getString(R.l.dXV);
    GMTrace.o(6291456000000L, 46875);
    return paramContext;
  }
  
  public static String xj(String paramString)
  {
    GMTrace.i(6284745113600L, 46825);
    if (bg.mZ(paramString))
    {
      GMTrace.o(6284745113600L, 46825);
      return null;
    }
    paramString = new File(axa() + g.n(paramString.getBytes()));
    if (paramString.exists())
    {
      paramString = paramString.getAbsolutePath();
      GMTrace.o(6284745113600L, 46825);
      return paramString;
    }
    GMTrace.o(6284745113600L, 46825);
    return null;
  }
  
  private static File xk(String paramString)
  {
    GMTrace.i(6286758379520L, 46840);
    int i = paramString.hashCode();
    ap.AS();
    paramString = new File(String.format("%s/%s/%d/", new Object[] { com.tencent.mm.x.c.zp(), "favorite", Integer.valueOf(i & 0xFF) }));
    if ((!paramString.exists()) || (!paramString.isDirectory())) {
      paramString.mkdirs();
    }
    GMTrace.o(6286758379520L, 46840);
    return paramString;
  }
  
  public static String xl(String paramString)
  {
    GMTrace.i(6286892597248L, 46841);
    paramString = paramString + "_t";
    GMTrace.o(6286892597248L, 46841);
    return paramString;
  }
  
  public static boolean xm(String paramString)
  {
    GMTrace.i(6287026814976L, 46842);
    if (bg.mZ(paramString))
    {
      GMTrace.o(6287026814976L, 46842);
      return false;
    }
    boolean bool = paramString.endsWith("_t");
    GMTrace.o(6287026814976L, 46842);
    return bool;
  }
  
  public static int xn(String paramString)
  {
    GMTrace.i(6289174298624L, 46858);
    if ((!bg.mZ(paramString)) && (paramString.equals("speex")))
    {
      GMTrace.o(6289174298624L, 46858);
      return 1;
    }
    if ((!bg.mZ(paramString)) && (paramString.equals("silk")))
    {
      GMTrace.o(6289174298624L, 46858);
      return 2;
    }
    GMTrace.o(6289174298624L, 46858);
    return 0;
  }
  
  public static j xo(String paramString)
  {
    GMTrace.i(6292932395008L, 46886);
    j localj = new j();
    localj.field_localId = -1L;
    localj.field_id = -1;
    localj.field_xml = paramString;
    localj.field_type = 18;
    localj.xa(paramString);
    GMTrace.o(6292932395008L, 46886);
    return localj;
  }
  
  public static abstract interface a
  {
    public abstract boolean g(j paramj);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/b/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */