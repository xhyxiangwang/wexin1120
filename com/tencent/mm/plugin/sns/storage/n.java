package com.tencent.mm.plugin.sns.storage;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.pf;
import com.tencent.mm.g.a.pf.a;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class n
  extends com.tencent.mm.sdk.e.i<m>
  implements com.tencent.mm.plugin.sns.b.g
{
  public static final String[] fSf;
  public static final String[] gMz;
  private static String[] qve;
  public static String qvf;
  public static String qvg;
  public static String qvh;
  private static String qvi;
  private static String qvj;
  private static String qvk;
  public static String qvl;
  public static String qvm;
  protected static String qvn;
  protected static String qvo;
  private static String qvp;
  private static String qvq;
  private static String qvr;
  private static ArrayList<Integer> qvs;
  private static ArrayList<Integer> qvt;
  public com.tencent.mm.sdk.e.e gMB;
  private boolean qvc;
  private int qvd;
  
  static
  {
    GMTrace.i(8179899432960L, 60945);
    gMz = new String[] { com.tencent.mm.sdk.e.i.a(m.gLR, "SnsInfo") };
    qve = new String[] { "snsId", "userName", "localFlag", "createTime", "head", "localPrivate", "type", "sourceType", "likeFlag", "pravited", "stringSeq", "content", "attrBuf", "postBuf", "rowid" };
    fSf = new String[] { "CREATE INDEX IF NOT EXISTS serverSnsNameIndex ON SnsInfo ( snsId )", "CREATE INDEX IF NOT EXISTS serverSnsTimeHeadIndex ON SnsInfo ( head )", "DROP INDEX IF EXISTS serverSnsTimeIndex", "DROP INDEX IF EXISTS serverSnsTimeSourceTypeIndex", "CREATE INDEX IF NOT EXISTS snsMultiIndex1 ON SnsInfo ( createTime,snsId,sourceType,type)", "CREATE INDEX IF NOT EXISTS snsMultiIndex2 ON SnsInfo ( sourceType,type,userName)", "CREATE INDEX IF NOT EXISTS snsLocalflagIndex ON SnsInfo ( localFlag )" };
    qvf = "";
    qvg = " order by SnsInfo.createTime desc ,snsId desc";
    qvh = " order by SnsInfo.createTime asc ,snsId asc";
    qvi = " order by SnsInfo.createTime asc ,snsId asc";
    qvj = " order by SnsInfo.head desc ,SnsInfo.createTime desc ";
    qvk = " order by SnsInfo.head desc ,snsId desc";
    qvl = null;
    qvm = null;
    qvn = " (sourceType & 2 != 0 ) ";
    qvo = " (sourceType & 2 != 0 ) and type < 21";
    qvp = null;
    qvq = null;
    qvr = null;
    qvs = bt(Arrays.asList(new Integer[] { Integer.valueOf(16), Integer.valueOf(32), Integer.valueOf(2), Integer.valueOf(8), Integer.valueOf(64), Integer.valueOf(128) }));
    qvt = bt(Arrays.asList(new Integer[] { Integer.valueOf(2), Integer.valueOf(4), Integer.valueOf(8) }));
    qvf = "select ";
    int i = 0;
    if (i < qve.length)
    {
      if (i < qve.length - 1) {}
      for (qvf = qvf + " " + qve[i] + ",";; qvf = qvf + " " + qve[i] + " ")
      {
        i += 1;
        break;
      }
    }
    w.i("MicroMsg.SnsInfoStorage", "TIMELINE_SELECT_BEGIN " + qvf);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = qvs.iterator();
    while (localIterator.hasNext())
    {
      i = ((Integer)localIterator.next()).intValue();
      if (((i & 0x10) != 0) && ((i & 0x20) == 0)) {
        localArrayList.add(Integer.valueOf(i));
      }
    }
    qvl = g(localArrayList, "localFlag");
    w.i("MicroMsg.SnsInfoStorage", "auto optimalize sql %s", new Object[] { qvl });
    localArrayList.clear();
    localIterator = qvs.iterator();
    while (localIterator.hasNext())
    {
      i = ((Integer)localIterator.next()).intValue();
      if ((i & 0x20) != 0) {
        localArrayList.add(Integer.valueOf(i));
      }
    }
    qvm = g(localArrayList, "localFlag");
    w.i("MicroMsg.SnsInfoStorage", "auto optimalize sql %s", new Object[] { qvm });
    localArrayList.clear();
    localIterator = qvs.iterator();
    while (localIterator.hasNext())
    {
      i = ((Integer)localIterator.next()).intValue();
      if (((i & 0x40) == 0) && ((i & 0x20) != 0)) {
        localArrayList.add(Integer.valueOf(i));
      }
    }
    qvr = g(localArrayList, "localFlag");
    localArrayList.clear();
    localIterator = qvt.iterator();
    while (localIterator.hasNext())
    {
      i = ((Integer)localIterator.next()).intValue();
      if ((i & 0x8) != 0) {
        localArrayList.add(Integer.valueOf(i));
      }
    }
    qvq = g(localArrayList, "sourceType");
    w.i("MicroMsg.SnsInfoStorage", "auto optimalize sql %s", new Object[] { qvq });
    localArrayList.clear();
    localIterator = qvt.iterator();
    while (localIterator.hasNext())
    {
      i = ((Integer)localIterator.next()).intValue();
      if ((i & 0x2) != 0) {
        localArrayList.add(Integer.valueOf(i));
      }
    }
    qvn = g(localArrayList, "sourceType");
    w.i("MicroMsg.SnsInfoStorage", "auto optimalize sql %s", new Object[] { qvn });
    localArrayList.clear();
    localIterator = qvt.iterator();
    while (localIterator.hasNext())
    {
      i = ((Integer)localIterator.next()).intValue();
      if ((i & 0x4) != 0) {
        localArrayList.add(Integer.valueOf(i));
      }
    }
    qvp = g(localArrayList, "sourceType");
    w.i("MicroMsg.SnsInfoStorage", "auto optimalize sql %s", new Object[] { qvp });
    GMTrace.o(8179899432960L, 60945);
  }
  
  public n(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, m.gLR, "SnsInfo", fSf);
    GMTrace.i(8174128070656L, 60902);
    this.gMB = parame;
    parame = this.gMB.a("select count(*) from SnsInfo where snsId > 0;", null, 2);
    int i;
    if (parame.moveToFirst())
    {
      i = parame.getInt(0);
      if (i > 0)
      {
        w.i("MicroMsg.SnsInfoStorage", "exsits snsId > 0  ,count is %d", new Object[] { Integer.valueOf(i) });
        parame.close();
        i = 1;
        if (i != 0) {
          break label139;
        }
      }
    }
    for (;;)
    {
      this.qvc = bool;
      this.qvd = 0;
      if (!this.qvc) {
        break label144;
      }
      w.i("MicroMsg.SnsInfoStorage", "all sndId < 0 ,so optimalizeForSnsId");
      GMTrace.o(8174128070656L, 60902);
      return;
      parame.close();
      i = 0;
      break;
      label139:
      bool = false;
    }
    label144:
    qvg = " order by SnsInfo.createTime desc ,case when snsId < 0 then 0 else 1 end ,  snsId desc";
    qvh = " order by SnsInfo.createTime asc ,case when snsId < 0 then 0 else 1 end ,  snsId asc";
    qvj = " order by SnsInfo.head desc ,SnsInfo.createTime desc ";
    qvk = " order by SnsInfo.head desc ,case when snsId < 0 then 0 else 1 end ,  snsId desc";
    GMTrace.o(8174128070656L, 60902);
  }
  
  private void HH(String paramString)
  {
    GMTrace.i(8174933377024L, 60908);
    paramString = "UPDATE SnsInfo SET sourceType = sourceType & -3" + paramString;
    w.d("MicroMsg.SnsInfoStorage", "updateFilterTimeLine sql " + paramString);
    this.gMB.eL("SnsInfo", paramString);
    GMTrace.o(8174933377024L, 60908);
  }
  
  public static boolean HI(String paramString)
  {
    GMTrace.i(8175336030208L, 60911);
    if ((paramString == null) || (paramString.equals("")))
    {
      GMTrace.o(8175336030208L, 60911);
      return false;
    }
    GMTrace.o(8175336030208L, 60911);
    return true;
  }
  
  private static long HK(String paramString)
  {
    GMTrace.i(8175604465664L, 60913);
    long l = new BigInteger(paramString).longValue();
    w.i("MicroMsg.SnsInfoStorage", "seq %s to snsId %d ", new Object[] { paramString, Long.valueOf(l) });
    GMTrace.o(8175604465664L, 60913);
    return l;
  }
  
  public static String at(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8176007118848L, 60916);
    if (paramBoolean) {}
    for (paramString = "" + " WHERE " + qvp;; paramString = paramString + " AND " + qvq)
    {
      GMTrace.o(8176007118848L, 60916);
      return paramString;
      paramString = "" + " WHERE SnsInfo.userName=\"" + bg.mX(paramString) + "\"";
    }
  }
  
  public static String bkA()
  {
    GMTrace.i(8176946642944L, 60923);
    StringBuilder localStringBuilder = new StringBuilder().append("select *,rowid from SnsInfo  where ");
    if (bkv()) {}
    for (String str = qvo;; str = qvn)
    {
      str = str;
      GMTrace.o(8176946642944L, 60923);
      return str;
    }
  }
  
  private static boolean bkv()
  {
    GMTrace.i(8173591199744L, 60898);
    pf localpf = new pf();
    a.uLm.m(localpf);
    boolean bool = localpf.fNg.fNh;
    GMTrace.o(8173591199744L, 60898);
    return bool;
  }
  
  public static String bkw()
  {
    GMTrace.i(8173725417472L, 60899);
    if (bkv())
    {
      GMTrace.o(8173725417472L, 60899);
      return " (sourceType & 2 != 0 ) and type < 21";
    }
    GMTrace.o(8173725417472L, 60899);
    return " (sourceType & 2 != 0 ) ";
  }
  
  public static String bky()
  {
    GMTrace.i(8176678207488L, 60921);
    String str = "select *,rowid from SnsInfo  where " + " (sourceType & 2 != 0 ) ";
    GMTrace.o(8176678207488L, 60921);
    return str;
  }
  
  public static String bkz()
  {
    GMTrace.i(8176812425216L, 60922);
    String str = "select *,rowid from SnsInfo  where " + bkw();
    GMTrace.o(8176812425216L, 60922);
    return str;
  }
  
  private static ArrayList<Integer> bt(List<Integer> paramList)
  {
    GMTrace.i(8173993852928L, 60901);
    Object localObject = new ArrayList(paramList);
    paramList = new HashSet();
    ArrayList localArrayList1 = new ArrayList();
    localObject = ((ArrayList)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      Integer localInteger = (Integer)((Iterator)localObject).next();
      ArrayList localArrayList2 = new ArrayList();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext()) {
        localArrayList2.add(Integer.valueOf(((Integer)localIterator.next()).intValue() | localInteger.intValue()));
      }
      paramList.addAll(new HashSet(localArrayList2));
      paramList.add(localInteger);
    }
    paramList.add(Integer.valueOf(0));
    localArrayList1.addAll(paramList);
    GMTrace.o(8173993852928L, 60901);
    return localArrayList1;
  }
  
  private long c(String paramString, long paramLong, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(8176543989760L, 60920);
    Object localObject;
    if (paramLong != 0L)
    {
      localObject = com.tencent.mm.plugin.sns.data.i.Gf(com.tencent.mm.plugin.sns.data.i.jdMethod_do(paramLong));
      paramString = paramString + " AND SnsInfo.stringSeq < '" + (String)localObject + "'";
    }
    for (;;)
    {
      localObject = paramString;
      if (paramBoolean) {
        localObject = paramString + " AND  (snsId != 0 ) ";
      }
      paramString = (String)localObject + qvg;
      paramString = paramString + " limit " + paramInt;
      paramString = this.gMB.rawQuery(paramString, null);
      if (paramString.moveToLast())
      {
        localObject = new m();
        ((m)localObject).b(paramString);
        paramString.close();
        paramLong = ((m)localObject).field_snsId;
        GMTrace.o(8176543989760L, 60920);
        return paramLong;
      }
      paramString.close();
      GMTrace.o(8176543989760L, 60920);
      return 0L;
    }
  }
  
  public static String d(boolean paramBoolean1, String paramString, boolean paramBoolean2)
  {
    GMTrace.i(8176141336576L, 60917);
    paramString = "select *,rowid from SnsInfo " + at(paramString, paramBoolean2);
    paramString = paramString + " AND type in ( 1,2 , 3 , 4 , 18 , 5 , 12 , 9 , 14 , 15 , 13 , 21 , 25)";
    GMTrace.o(8176141336576L, 60917);
    return paramString;
  }
  
  private static String g(List<Integer> paramList, String paramString)
  {
    GMTrace.i(8173859635200L, 60900);
    StringBuilder localStringBuilder = new StringBuilder("(");
    localStringBuilder.append(paramString + " in (");
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      localStringBuilder.append(paramList.next());
      if (paramList.hasNext()) {
        localStringBuilder.append(",");
      }
    }
    localStringBuilder.append(")");
    localStringBuilder.append(")");
    paramList = localStringBuilder.toString();
    GMTrace.o(8173859635200L, 60900);
    return paramList;
  }
  
  public static String uH(int paramInt)
  {
    GMTrace.i(8177080860672L, 60924);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("select snsId from SnsInfo  where ").append(bkw()).append(" limit 3");
    localObject = ((StringBuilder)localObject).toString();
    GMTrace.o(8177080860672L, 60924);
    return (String)localObject;
  }
  
  public final Cursor FS(String paramString)
  {
    GMTrace.i(8177349296128L, 60926);
    String str2 = bkz();
    String str1 = str2;
    if (HI(paramString)) {
      str1 = str2 + " AND " + HJ(paramString);
    }
    paramString = str1 + qvg;
    w.d("MicroMsg.SnsInfoStorage", "getCursorForTimeLine " + paramString);
    paramString = this.gMB.rawQuery(paramString, null);
    GMTrace.o(8177349296128L, 60926);
    return paramString;
  }
  
  public final int FT(String paramString)
  {
    GMTrace.i(20063805505536L, 149487);
    paramString = ae.bhp().Hz(paramString);
    if (paramString == null)
    {
      GMTrace.o(20063805505536L, 149487);
      return 0;
    }
    int i = paramString.bkt();
    GMTrace.o(20063805505536L, 149487);
    return i;
  }
  
  public final m HA(String paramString)
  {
    GMTrace.i(8178825691136L, 60937);
    if (u.FN(paramString))
    {
      paramString = uI(u.HV(paramString));
      GMTrace.o(8178825691136L, 60937);
      return paramString;
    }
    paramString = ae.bhr().uE(u.HV(paramString));
    if (paramString != null)
    {
      paramString = paramString.bjN();
      GMTrace.o(8178825691136L, 60937);
      return paramString;
    }
    GMTrace.o(8178825691136L, 60937);
    return null;
  }
  
  public final void HF(String paramString)
  {
    GMTrace.i(8174799159296L, 60907);
    if (!HI(paramString))
    {
      GMTrace.o(8174799159296L, 60907);
      return;
    }
    HH(" where " + HM(paramString) + " and " + bkw() + " and  (snsId != 0  ) ");
    GMTrace.o(8174799159296L, 60907);
  }
  
  public final void HG(String paramString)
  {
    GMTrace.i(17096654192640L, 127380);
    if (!HI(paramString))
    {
      GMTrace.o(17096654192640L, 127380);
      return;
    }
    HH(" where " + HL(paramString) + " and " + bkw() + " and  (snsId != 0  ) ");
    GMTrace.o(17096654192640L, 127380);
  }
  
  public final String HJ(String paramString)
  {
    GMTrace.i(8175470247936L, 60912);
    if ((paramString == null) || (paramString.equals("")))
    {
      GMTrace.o(8175470247936L, 60912);
      return " ";
    }
    if (this.qvc)
    {
      paramString = " (snsId >= " + HK(bg.mX(paramString)) + " ) ";
      GMTrace.o(8175470247936L, 60912);
      return paramString;
    }
    paramString = " (stringSeq >=\"" + bg.mX(paramString) + "\"  ) ";
    GMTrace.o(8175470247936L, 60912);
    return paramString;
  }
  
  public final String HL(String paramString)
  {
    GMTrace.i(8175738683392L, 60914);
    if ((paramString == null) || (paramString.equals("")))
    {
      GMTrace.o(8175738683392L, 60914);
      return " ";
    }
    if (this.qvc)
    {
      paramString = " (snsId > " + HK(bg.mX(paramString)) + " ) ";
      GMTrace.o(8175738683392L, 60914);
      return paramString;
    }
    paramString = " (stringSeq >\"" + bg.mX(paramString) + "\"  ) ";
    GMTrace.o(8175738683392L, 60914);
    return paramString;
  }
  
  public final String HM(String paramString)
  {
    GMTrace.i(8175872901120L, 60915);
    if ((paramString == null) || (paramString.equals("")))
    {
      GMTrace.o(8175872901120L, 60915);
      return " ";
    }
    if (this.qvc)
    {
      paramString = " (snsId < " + HK(bg.mX(paramString)) + " ) ";
      GMTrace.o(8175872901120L, 60915);
      return paramString;
    }
    paramString = " (stringSeq <\"" + bg.mX(paramString) + "\"  ) ";
    GMTrace.o(8175872901120L, 60915);
    return paramString;
  }
  
  public final int HN(String paramString)
  {
    GMTrace.i(8177617731584L, 60928);
    Object localObject2 = bkz();
    Object localObject1 = localObject2;
    if (HI(paramString)) {
      localObject1 = (String)localObject2 + " AND " + HJ(paramString);
    }
    paramString = (String)localObject1 + " AND  (snsId != 0 ) ";
    paramString = paramString + qvh + " limit 1";
    localObject1 = this.gMB.a(paramString, null, 2);
    int i = 0;
    if (((Cursor)localObject1).moveToFirst())
    {
      localObject2 = new m();
      ((m)localObject2).b((Cursor)localObject1);
      i = ((m)localObject2).field_createTime;
    }
    ((Cursor)localObject1).close();
    w.i("MicroMsg.SnsInfoStorage", "getLastTime " + paramString + " createtime " + i);
    GMTrace.o(8177617731584L, 60928);
    return i;
  }
  
  public final m Hz(String paramString)
  {
    GMTrace.i(8178557255680L, 60935);
    if (u.FN(paramString))
    {
      paramString = dP(u.HU(paramString));
      GMTrace.o(8178557255680L, 60935);
      return paramString;
    }
    paramString = ae.bhr().dI(u.HU(paramString));
    if (paramString != null)
    {
      paramString = paramString.bjN();
      GMTrace.o(8178557255680L, 60935);
      return paramString;
    }
    GMTrace.o(8178557255680L, 60935);
    return null;
  }
  
  public final long a(long paramLong, int paramInt, String paramString, boolean paramBoolean)
  {
    GMTrace.i(8176409772032L, 60919);
    paramLong = c(d(false, paramString, paramBoolean), paramLong, paramInt, false);
    GMTrace.o(8176409772032L, 60919);
    return paramLong;
  }
  
  public final Cursor a(boolean paramBoolean1, String paramString1, int paramInt, boolean paramBoolean2, String paramString2)
  {
    GMTrace.i(8177215078400L, 60925);
    String str = d(paramBoolean1, paramString1, paramBoolean2);
    paramString1 = str;
    if (HI(paramString2)) {
      paramString1 = str + " AND " + HJ(paramString2);
    }
    if (paramBoolean2) {}
    for (paramString1 = paramString1 + qvj;; paramString1 = paramString1 + qvk)
    {
      paramString2 = paramString1;
      if (paramInt > 0) {
        paramString2 = paramString1 + " LIMIT " + paramInt;
      }
      w.d("MicroMsg.SnsInfoStorage", "getCursorByUserName in gallery " + paramString2);
      paramString1 = this.gMB.rawQuery(paramString2, null);
      GMTrace.o(8177215078400L, 60925);
      return paramString1;
    }
  }
  
  public final void a(String paramString1, boolean paramBoolean, String paramString2)
  {
    GMTrace.i(8174396506112L, 60904);
    String str = at(paramString1, paramBoolean) + " AND  (snsId != 0  ) ";
    paramString1 = str;
    if (HI(paramString2)) {
      paramString1 = str + " AND " + HM(paramString2);
    }
    i(paramBoolean, paramString1);
    GMTrace.o(8174396506112L, 60904);
  }
  
  public final boolean a(long paramLong, m paramm)
  {
    GMTrace.i(8175201812480L, 60910);
    if (dJ(paramLong))
    {
      boolean bool = b(paramLong, paramm);
      GMTrace.o(8175201812480L, 60910);
      return bool;
    }
    if (y(paramm) != -1)
    {
      GMTrace.o(8175201812480L, 60910);
      return true;
    }
    GMTrace.o(8175201812480L, 60910);
    return false;
  }
  
  public final List<m> au(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8177483513856L, 60927);
    paramString = "select *,rowid from SnsInfo " + at(paramString, paramBoolean) + " AND type = 4";
    paramString = this.gMB.a(paramString, null, 2);
    ArrayList localArrayList = new ArrayList();
    while (paramString.moveToNext())
    {
      m localm = new m();
      localm.b(paramString);
      localArrayList.add(localm);
    }
    paramString.close();
    GMTrace.o(8177483513856L, 60927);
    return localArrayList;
  }
  
  public final int b(int paramInt, m paramm)
  {
    GMTrace.i(8179228344320L, 60940);
    paramm = paramm.qQ();
    paramm.remove("rowid");
    paramInt = this.gMB.update("SnsInfo", paramm, "rowid=?", new String[] { String.valueOf(paramInt) });
    GMTrace.o(8179228344320L, 60940);
    return paramInt;
  }
  
  public final boolean b(long paramLong, m paramm)
  {
    GMTrace.i(8178959908864L, 60938);
    paramm = paramm.qQ();
    paramm.remove("rowid");
    if (this.gMB.update("SnsInfo", paramm, "snsId=?", new String[] { String.valueOf(paramLong) }) > 0)
    {
      GMTrace.o(8178959908864L, 60938);
      return true;
    }
    GMTrace.o(8178959908864L, 60938);
    return false;
  }
  
  public final Cursor bT(String paramString, int paramInt)
  {
    GMTrace.i(8177751949312L, 60929);
    Object localObject = qvf + " from SnsInfo where ";
    String str = (String)localObject + bkw();
    localObject = str;
    if (HI(paramString)) {
      localObject = str + " AND " + HJ(paramString);
    }
    localObject = (String)localObject + " AND createTime >= " + paramInt;
    localObject = (String)localObject + " UNION ";
    localObject = (String)localObject + qvf + " from AdSnsInfo where createTime" + " > " + paramInt;
    localObject = (String)localObject + qvg;
    w.d("MicroMsg.SnsInfoStorage", "getAdCursorForTimeLine " + (String)localObject + " limtiSeq: " + paramString);
    paramString = this.gMB.rawQuery((String)localObject, null);
    GMTrace.o(8177751949312L, 60929);
    return paramString;
  }
  
  public final ArrayList<Long> bgb()
  {
    GMTrace.i(8178020384768L, 60931);
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = this.gMB;
    Object localObject2 = "createTime >=? AND " + qvr;
    int i = (int)(System.currentTimeMillis() / 1000L);
    localObject1 = ((com.tencent.mm.sdk.e.e)localObject1).a("SnsInfo", new String[] { "*", "rowid" }, (String)localObject2, new String[] { String.valueOf(i - 172800) }, null, null, "createTime ASC", 2);
    try
    {
      while (((Cursor)localObject1).moveToNext())
      {
        localObject2 = new m();
        ((m)localObject2).b((Cursor)localObject1);
        if ((((m)localObject2).quQ != -1) && (((m)localObject2).field_userName.equals(com.tencent.mm.x.m.zF())))
        {
          localArrayList.add(Long.valueOf(((m)localObject2).quQ));
          w.d("MicroMsg.SnsInfoStorage", "getAllNeedResendSns, add snsInfo: " + ((m)localObject2).bkg());
        }
      }
    }
    finally
    {
      ((Cursor)localObject1).close();
    }
    tmp213_210[0] = Integer.valueOf(localArrayList1.size());
    w.d("MicroMsg.SnsInfoStorage", "getAllNeedResendSns, resendList.size:%d", tmp213_210);
    GMTrace.o(8178020384768L, 60931);
    return localArrayList1;
  }
  
  public final void bkx()
  {
    GMTrace.i(8174664941568L, 60906);
    HH(" where " + bkw() + " AND  (snsId != 0  ) ");
    GMTrace.o(8174664941568L, 60906);
  }
  
  public final boolean dJ(long paramLong)
  {
    GMTrace.i(8175067594752L, 60909);
    Object localObject = "select *,rowid from SnsInfo  where SnsInfo.snsId=" + paramLong;
    localObject = this.gMB.rawQuery((String)localObject, null);
    int i = ((Cursor)localObject).getCount();
    ((Cursor)localObject).close();
    if (i > 0)
    {
      GMTrace.o(8175067594752L, 60909);
      return true;
    }
    GMTrace.o(8175067594752L, 60909);
    return false;
  }
  
  public final m dP(long paramLong)
  {
    GMTrace.i(8178423037952L, 60934);
    m localm = new m();
    Object localObject = "select *,rowid from SnsInfo  where SnsInfo.snsId=" + paramLong + " limit 1";
    localObject = this.gMB.a((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      localm.b((Cursor)localObject);
      ((Cursor)localObject).close();
      GMTrace.o(8178423037952L, 60934);
      return localm;
    }
    ((Cursor)localObject).close();
    GMTrace.o(8178423037952L, 60934);
    return null;
  }
  
  public final boolean delete(long paramLong)
  {
    GMTrace.i(8179362562048L, 60941);
    int i = this.gMB.delete("SnsInfo", "snsId=?", new String[] { String.valueOf(paramLong) });
    w.d("MicroMsg.SnsInfoStorage", "del msg " + paramLong + " res " + i);
    if (i > 0)
    {
      GMTrace.o(8179362562048L, 60941);
      return true;
    }
    GMTrace.o(8179362562048L, 60941);
    return false;
  }
  
  public final void dk(long paramLong)
  {
    GMTrace.i(8177886167040L, 60930);
    ab.getContext().getSharedPreferences(ab.bNa(), 0).edit().putLong("check_trim_time", 0L).commit();
    com.tencent.mm.bt.g localg = ae.yI();
    long l = localg.cA(Thread.currentThread().getId());
    int i = 0;
    while (i < paramLong)
    {
      localg.eL("SnsInfo", "INSERT INTO SnsInfo VALUES(-69999999991777434909,'miaochanchan',2,1402026897,20140606,0,2,2,0,0,'0',X'0A143131373631303534303431393332313136373037120C6D69616F6368616E6368616E18002091F7C49C052A36E8A681E6849FE8B0A2E8BF99E4BBBDE5B7A5EFBC8CE8AEA9E68891E4B88DE4BC9AE69C89E5A29EE882A5E79A84E8BFB9E8B1A1E3808232180D0000000015000000001A0022002A0032003800480050003A0A0A0012001A0022002A0042080A0010021A0022004A0052005A006000680272007A2408001200180022002A0032003A080A0012001A00220042004A040800100052040A001200',X'08E3E5A48CEA8AEA9BA301120C6D69616F6368616E6368616E1A09E88B97E7B1B3E7B1B32091F7C49C052A04080012003000380040005000580068007000800101880100900100A00101B00100B80100',NULL);");
      i += 1;
    }
    i = 0;
    while (i < 20000L)
    {
      localg.eL("snsExtInfo3", String.format("INSERT INTO snsExtInfo3 VALUES('zeustest%d','afd',2,1402026897,'d', 0,1, 1, 1, 1, 'a', 'a', NULL);", new Object[] { Integer.valueOf(i) }));
      i += 1;
    }
    i = 0;
    while (i < 20000L)
    {
      localg.eL("snsComment", String.format("INSERT INTO snsComment VALUES(-69999999991777434909,0,2,1402026897,'d', 2,1, 'a', 'b', 1, NULL);", new Object[0]));
      i += 1;
    }
    localg.aJ(l);
    GMTrace.o(8177886167040L, 60930);
  }
  
  public final int dl(long paramLong)
  {
    GMTrace.i(20063671287808L, 149486);
    m localm = ae.bhp().dP(paramLong);
    if (localm == null)
    {
      GMTrace.o(20063671287808L, 149486);
      return 0;
    }
    int i = localm.bkt();
    GMTrace.o(20063671287808L, 149486);
    return i;
  }
  
  public final long e(long paramLong, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(8176275554304L, 60918);
    paramLong = c(bkz(), paramLong, paramInt, paramBoolean);
    GMTrace.o(8176275554304L, 60918);
    return paramLong;
  }
  
  public final void i(boolean paramBoolean, String paramString)
  {
    GMTrace.i(8174530723840L, 60905);
    if (paramBoolean) {}
    for (int i = 4;; i = 8)
    {
      paramString = "UPDATE SnsInfo SET sourceType = sourceType & " + (i ^ 0xFFFFFFFF) + paramString;
      w.d("MicroMsg.SnsInfoStorage", "updateFilterUserName sql " + paramString);
      this.gMB.eL("SnsInfo", paramString);
      GMTrace.o(8174530723840L, 60905);
      return;
    }
  }
  
  public final boolean tO(int paramInt)
  {
    GMTrace.i(8178154602496L, 60932);
    if (uI(paramInt) != null)
    {
      GMTrace.o(8178154602496L, 60932);
      return true;
    }
    GMTrace.o(8178154602496L, 60932);
    return false;
  }
  
  public final m uI(int paramInt)
  {
    GMTrace.i(8178691473408L, 60936);
    m localm = new m();
    Object localObject = "select *,rowid from SnsInfo  where SnsInfo.rowid=" + paramInt;
    localObject = this.gMB.a((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      localm.b((Cursor)localObject);
      ((Cursor)localObject).close();
      GMTrace.o(8178691473408L, 60936);
      return localm;
    }
    ((Cursor)localObject).close();
    GMTrace.o(8178691473408L, 60936);
    return null;
  }
  
  public final boolean uJ(int paramInt)
  {
    GMTrace.i(8179496779776L, 60942);
    if (this.gMB.delete("SnsInfo", "rowid=?", new String[] { String.valueOf(paramInt) }) > 0)
    {
      GMTrace.o(8179496779776L, 60942);
      return true;
    }
    GMTrace.o(8179496779776L, 60942);
    return false;
  }
  
  public final int y(m paramm)
  {
    GMTrace.i(8174262288384L, 60903);
    w.d("MicroMsg.SnsInfoStorage", "SnsInfo Insert");
    if (paramm == null)
    {
      GMTrace.o(8174262288384L, 60903);
      return -1;
    }
    paramm = paramm.qQ();
    int i = (int)this.gMB.insert("SnsInfo", "", paramm);
    w.d("MicroMsg.SnsInfoStorage", "SnsInfo Insert result " + i);
    GMTrace.o(8174262288384L, 60903);
    return i;
  }
  
  public final boolean z(m paramm)
  {
    GMTrace.i(8178288820224L, 60933);
    if (paramm.uF(32))
    {
      bool = ae.bhr().a(paramm.bkr());
      GMTrace.o(8178288820224L, 60933);
      return bool;
    }
    paramm = paramm.qQ();
    if (this.gMB.replace("SnsInfo", "", paramm) > 0L) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.SnsInfoStorage", "SnsInfo replace result " + bool);
      GMTrace.o(8178288820224L, 60933);
      return bool;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */