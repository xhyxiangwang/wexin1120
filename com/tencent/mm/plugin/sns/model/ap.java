package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.modelcdntran.d;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class ap
{
  public static String C(amn paramamn)
  {
    GMTrace.i(8103932198912L, 60379);
    if (paramamn == null)
    {
      GMTrace.o(8103932198912L, 60379);
      return null;
    }
    paramamn = am.dt(ae.getAccSnsPath(), paramamn.nas) + i.j(paramamn);
    w.i("MicroMsg.SnsVideoLogic", "get sns video path %s", new Object[] { paramamn });
    GMTrace.o(8103932198912L, 60379);
    return paramamn;
  }
  
  public static String GK(String paramString)
  {
    GMTrace.i(18583249747968L, 138456);
    if (bg.mZ(paramString))
    {
      GMTrace.o(18583249747968L, 138456);
      return "";
    }
    int i = paramString.indexOf("SNS_");
    if (i < 0)
    {
      GMTrace.o(18583249747968L, 138456);
      return "";
    }
    String str = "";
    try
    {
      paramString = paramString.substring(i + 4);
      GMTrace.o(18583249747968L, 138456);
      return paramString;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        paramString = str;
      }
    }
  }
  
  public static String GL(String paramString)
  {
    GMTrace.i(17152086114304L, 127793);
    if (bg.mZ(paramString))
    {
      GMTrace.o(17152086114304L, 127793);
      return null;
    }
    String str = am.dt(ae.getAccSnsPath(), paramString);
    w.i("MicroMsg.SnsVideoLogic", "get sns video dir %s mediaId %s", new Object[] { str, paramString });
    GMTrace.o(17152086114304L, 127793);
    return str;
  }
  
  public static r GM(String paramString)
  {
    GMTrace.i(8104334852096L, 60382);
    if (bg.mZ(paramString))
    {
      GMTrace.o(8104334852096L, 60382);
      return null;
    }
    paramString = t.mj(lW(paramString));
    GMTrace.o(8104334852096L, 60382);
    return paramString;
  }
  
  public static String a(String paramString, amn paramamn)
  {
    GMTrace.i(8104066416640L, 60380);
    if (paramamn == null) {
      localObject = null;
    }
    while (e.aZ((String)localObject))
    {
      w.i("MicroMsg.SnsVideoLogic", "it needn't download video[%s] because of the video is self. %s", new Object[] { paramString, localObject });
      GMTrace.o(8104066416640L, 60380);
      return (String)localObject;
      localObject = am.dt(ae.getAccSnsPath(), paramamn.nas) + i.p(paramamn);
      w.i("MicroMsg.SnsVideoLogic", "get sns video tmp path %s", new Object[] { localObject });
    }
    paramamn = C(paramamn);
    boolean bool = e.aZ(paramamn);
    Object localObject = GM(paramString);
    if (localObject == null)
    {
      if (bool)
      {
        w.i("MicroMsg.SnsVideoLogic", "it old version already download video[%s]. path :%s", new Object[] { paramString, paramamn });
        GMTrace.o(8104066416640L, 60380);
        return paramamn;
      }
      w.i("MicroMsg.SnsVideoLogic", "video info is null and file is no exists, return null.[%s]", new Object[] { paramString });
      GMTrace.o(8104066416640L, 60380);
      return null;
    }
    if ((bool) && (((r)localObject).Np()))
    {
      w.i("MicroMsg.SnsVideoLogic", "it had download sns video[%s] finish. %s", new Object[] { paramString, paramamn });
      GMTrace.o(8104066416640L, 60380);
      return paramamn;
    }
    w.i("MicroMsg.SnsVideoLogic", "it don't download video[%s] finish. file[%b] status[%d], return null.", new Object[] { paramString, Boolean.valueOf(bool), Integer.valueOf(((r)localObject).status) });
    GMTrace.o(8104066416640L, 60380);
    return null;
  }
  
  public static String ar(int paramInt, String paramString)
  {
    GMTrace.i(8103663763456L, 60377);
    paramString = d.a("snsvideo", paramInt, "sns", paramString);
    if (bg.mZ(paramString))
    {
      GMTrace.o(8103663763456L, 60377);
      return null;
    }
    GMTrace.o(8103663763456L, 60377);
    return paramString;
  }
  
  public static boolean bR(String paramString, int paramInt)
  {
    GMTrace.i(17152220332032L, 127794);
    if (bg.mZ(paramString))
    {
      w.w("MicroMsg.SnsVideoLogic", "init sns record, but snsLocalId is null");
      GMTrace.o(17152220332032L, 127794);
      return false;
    }
    paramString = lW(paramString);
    r localr = new r();
    localr.fnP = paramString;
    localr.hUw = bg.Po();
    localr.status = 130;
    localr.htf = paramInt;
    boolean bool = o.Na().a(localr);
    w.i("MicroMsg.SnsVideoLogic", "init sns Record filename %s, insert %b", new Object[] { paramString, Boolean.valueOf(bool) });
    GMTrace.o(17152220332032L, 127794);
    return bool;
  }
  
  public static boolean c(r paramr, int paramInt)
  {
    GMTrace.i(17152354549760L, 127795);
    paramr.status = 130;
    paramr.htf = paramInt;
    paramr.fJg = 268435712;
    boolean bool = o.Na().b(paramr);
    w.i("MicroMsg.SnsVideoLogic", "update sns Record filename %s, update %b", new Object[] { paramr.getFileName(), Boolean.valueOf(bool) });
    GMTrace.o(17152354549760L, 127795);
    return bool;
  }
  
  public static boolean dv(String paramString1, String paramString2)
  {
    GMTrace.i(8104200634368L, 60381);
    r localr = GM(paramString1);
    if (localr == null)
    {
      localr = new r();
      localr.fnP = lW(paramString1);
    }
    for (int i = 1;; i = 0)
    {
      localr.hUw = bg.Po();
      localr.fMM = paramString2;
      localr.status = 199;
      if (i != 0) {}
      for (boolean bool = o.Na().a(localr);; bool = o.Na().b(localr))
      {
        w.i("MicroMsg.SnsVideoLogic", "post sns video snsLocalId %s, md5 %s ret %b", new Object[] { paramString1, paramString2, Boolean.valueOf(bool) });
        GMTrace.o(8104200634368L, 60381);
        return bool;
        localr.fJg = 33555200;
      }
    }
  }
  
  public static String lW(String paramString)
  {
    GMTrace.i(8103797981184L, 60378);
    if (bg.mZ(paramString))
    {
      GMTrace.o(8103797981184L, 60378);
      return "";
    }
    String str = "SNS_" + paramString;
    w.d("MicroMsg.SnsVideoLogic", "gen sns[%s] video file name [%s]", new Object[] { paramString, str });
    GMTrace.o(8103797981184L, 60378);
    return str;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */