package com.tencent.mm.plugin.sns.model;

import android.view.Menu;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bi.d;
import com.tencent.mm.g.a.pq;
import com.tencent.mm.g.a.pr;
import com.tencent.mm.g.a.ps;
import com.tencent.mm.g.a.qv;
import com.tencent.mm.g.a.qx;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.protocal.c.bcz;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class ao
{
  private static HashMap<String, b> qeM;
  public static LinkedList<a> qeN;
  private static c qeO;
  
  static
  {
    GMTrace.i(8088228724736L, 60262);
    qeM = new HashMap();
    qeN = new LinkedList();
    qeO = new c() {};
    GMTrace.o(8088228724736L, 60262);
  }
  
  public static b GJ(String paramString)
  {
    GMTrace.i(8087691853824L, 60258);
    if (qeM.containsKey(paramString))
    {
      paramString = (b)qeM.get(paramString);
      GMTrace.o(8087691853824L, 60258);
      return paramString;
    }
    GMTrace.o(8087691853824L, 60258);
    return null;
  }
  
  public static void PK()
  {
    GMTrace.i(8085275934720L, 60240);
    a.uLm.c(qeO);
    GMTrace.o(8085275934720L, 60240);
  }
  
  public static void a(Menu paramMenu, boolean paramBoolean)
  {
    GMTrace.i(8085544370176L, 60242);
    if (pJ())
    {
      if (paramBoolean)
      {
        paramMenu.add(0, 14, 0, i.j.pUd);
        GMTrace.o(8085544370176L, 60242);
        return;
      }
      paramMenu.add(0, 15, 0, i.j.pUd);
    }
    GMTrace.o(8085544370176L, 60242);
  }
  
  public static void a(b paramb)
  {
    GMTrace.i(8085947023360L, 60245);
    if ((paramb.gbQ & 0x2) != 0) {
      paramb.qeR = false;
    }
    for (;;)
    {
      qeM.put(paramb.id, paramb);
      GMTrace.o(8085947023360L, 60245);
      return;
      if ((paramb.gbQ & 0x4) != 0) {
        paramb.qeS = false;
      }
    }
  }
  
  public static void a(com.tencent.mm.plugin.sns.ui.m paramm)
  {
    GMTrace.i(8086349676544L, 60248);
    if ((paramm != null) && (paramm.qbt != null))
    {
      String str = paramm.ovi;
      Object localObject = new StringBuilder();
      if (paramm.qbt.uuE != 0) {}
      for (long l = paramm.qbt.uuE;; l = paramm.qbt.uuH)
      {
        localObject = l;
        paramm = du(paramm.qys, (String)localObject);
        if (!qeM.containsKey(paramm)) {
          break label176;
        }
        localObject = (b)qeM.get(paramm);
        if ((!((b)localObject).hie) || (bg.mZ(((b)localObject).result))) {
          break;
        }
        w.d("MicroMsg.SnsTranslateManager", "translateComment, get from cache, id:%s", new Object[] { paramm });
        e(((b)localObject).id, 2, ((b)localObject).result, ((b)localObject).hpO);
        GMTrace.o(8086349676544L, 60248);
        return;
      }
      qeM.remove(paramm);
      label176:
      localObject = new qv();
      ((qv)localObject).fOS.id = paramm;
      ((qv)localObject).fOS.fOT = str;
      ((qv)localObject).fOS.type = 3;
      a.uLm.m((b)localObject);
      bN(paramm, 2);
      localObject = new a();
      ((a)localObject).id = paramm;
      ((a)localObject).qeP = str;
      ((a)localObject).type = 3;
      qeN.add(localObject);
      w.d("MicroMsg.SnsTranslateManager", "translateComment, id:%s", new Object[] { ((a)localObject).id });
    }
    GMTrace.o(8086349676544L, 60248);
  }
  
  public static void b(Menu paramMenu, boolean paramBoolean)
  {
    GMTrace.i(8085678587904L, 60243);
    if (pJ())
    {
      if (paramBoolean)
      {
        paramMenu.add(0, 16, 0, i.j.pUf);
        GMTrace.o(8085678587904L, 60243);
        return;
      }
      paramMenu.add(0, 17, 0, i.j.pUf);
    }
    GMTrace.o(8085678587904L, 60243);
  }
  
  private static void b(b paramb)
  {
    GMTrace.i(8086081241088L, 60246);
    if ((paramb.gbQ & 0x2) != 0) {
      paramb.qeR = true;
    }
    for (;;)
    {
      qeM.put(paramb.id, paramb);
      GMTrace.o(8086081241088L, 60246);
      return;
      if ((paramb.gbQ & 0x4) != 0) {
        paramb.qeS = true;
      }
    }
  }
  
  public static void b(com.tencent.mm.plugin.sns.ui.m paramm)
  {
    GMTrace.i(8086483894272L, 60249);
    Object localObject;
    if (paramm != null)
    {
      localObject = new StringBuilder();
      if (paramm.qbt.uuE == 0) {
        break label120;
      }
    }
    label120:
    for (long l = paramm.qbt.uuE;; l = paramm.qbt.uuH)
    {
      localObject = l;
      paramm = du(paramm.qys, (String)localObject);
      b(GJ(paramm));
      localObject = new ps();
      ((ps)localObject).fNA.type = 2;
      ((ps)localObject).fNA.id = paramm;
      a.uLm.m((b)localObject);
      w.d("MicroMsg.SnsTranslateManager", "unTranslateComment, id:%s", new Object[] { paramm });
      GMTrace.o(8086483894272L, 60249);
      return;
    }
  }
  
  public static a bM(String paramString, int paramInt)
  {
    GMTrace.i(16041568632832L, 119519);
    Iterator localIterator = qeN.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if ((locala.type == paramInt) && (!bg.mZ(paramString)) && (!bg.mZ(locala.id)) && (paramString.equals(locala.id)))
      {
        GMTrace.o(16041568632832L, 119519);
        return locala;
      }
    }
    GMTrace.o(16041568632832L, 119519);
    return null;
  }
  
  private static void bN(String paramString, int paramInt)
  {
    GMTrace.i(8086618112000L, 60250);
    if (!qeM.containsKey(paramString))
    {
      localObject = new b();
      ((b)localObject).id = paramString;
      ((b)localObject).hpO = null;
      ((b)localObject).result = null;
      ((b)localObject).hie = false;
      ((b)localObject).hkX = false;
      ((b)localObject).qeS = true;
      ((b)localObject).qeR = true;
      qeM.put(paramString, localObject);
    }
    Object localObject = new pr();
    ((pr)localObject).fNz.type = paramInt;
    ((pr)localObject).fNz.id = paramString;
    a.uLm.m((b)localObject);
    GMTrace.o(8086618112000L, 60250);
  }
  
  public static void bO(String paramString, int paramInt)
  {
    GMTrace.i(8087154982912L, 60254);
    if (qeM.containsKey(paramString))
    {
      b localb = (b)qeM.get(paramString);
      localb.gbQ |= paramInt;
      qeM.put(paramString, localb);
    }
    GMTrace.o(8087154982912L, 60254);
  }
  
  public static void bP(String paramString, int paramInt)
  {
    GMTrace.i(8087289200640L, 60255);
    if (qeM.containsKey(paramString))
    {
      b localb = (b)qeM.get(paramString);
      localb.gbQ &= (paramInt ^ 0xFFFFFFFF);
      if ((paramInt != 2) && (paramInt == 4)) {
        localb.qeS = true;
      }
      qeM.put(paramString, localb);
    }
    GMTrace.o(8087289200640L, 60255);
  }
  
  public static boolean bQ(String paramString, int paramInt)
  {
    GMTrace.i(8087423418368L, 60256);
    if (qeM.containsKey(paramString))
    {
      if ((((b)qeM.get(paramString)).gbQ & paramInt) != 0)
      {
        GMTrace.o(8087423418368L, 60256);
        return true;
      }
      GMTrace.o(8087423418368L, 60256);
      return false;
    }
    GMTrace.o(8087423418368L, 60256);
    return false;
  }
  
  public static HashMap<String, b> bhR()
  {
    GMTrace.i(8087020765184L, 60253);
    HashMap localHashMap = qeM;
    GMTrace.o(8087020765184L, 60253);
    return localHashMap;
  }
  
  public static boolean c(b paramb)
  {
    GMTrace.i(8087557636096L, 60257);
    if (paramb != null)
    {
      if ((paramb.gbQ & 0x2) != 0)
      {
        GMTrace.o(8087557636096L, 60257);
        return true;
      }
      GMTrace.o(8087557636096L, 60257);
      return false;
    }
    GMTrace.o(8087557636096L, 60257);
    return false;
  }
  
  public static String du(String paramString1, String paramString2)
  {
    GMTrace.i(8086886547456L, 60252);
    paramString1 = paramString1 + ";" + paramString2;
    GMTrace.o(8086886547456L, 60252);
    return paramString1;
  }
  
  public static void e(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    GMTrace.i(8086752329728L, 60251);
    if (qeM.containsKey(paramString1))
    {
      localObject = (b)qeM.get(paramString1);
      ((b)localObject).hpO = paramString3;
      ((b)localObject).result = paramString2;
      ((b)localObject).hie = true;
      ((b)localObject).hkX = bg.mZ(paramString2);
      qeM.put(paramString1, localObject);
    }
    if (bg.mZ(paramString2)) {
      Toast.makeText(ab.getContext(), i.j.pUe, 1).show();
    }
    Object localObject = new pq();
    ((pq)localObject).fNx.type = paramInt;
    ((pq)localObject).fNx.id = paramString1;
    ((pq)localObject).fNx.result = paramString2;
    ((pq)localObject).fNx.fNy = paramString3;
    a.uLm.m((b)localObject);
    GMTrace.o(8086752329728L, 60251);
  }
  
  public static void init()
  {
    GMTrace.i(8085141716992L, 60239);
    a.uLm.b(qeO);
    GMTrace.o(8085141716992L, 60239);
  }
  
  public static void o(com.tencent.mm.plugin.sns.storage.m paramm)
  {
    GMTrace.i(8085812805632L, 60244);
    if (paramm != null)
    {
      String str = paramm.bjM();
      w.d("MicroMsg.SnsTranslateManager", "translatePost, id:%s", new Object[] { str });
      if (paramm.field_snsId == 0L)
      {
        w.d("MicroMsg.SnsTranslateManager", "translatePost, the id is null or zero");
        qeM.remove(str);
        e(str, 1, null, null);
        GMTrace.o(8085812805632L, 60244);
        return;
      }
      Object localObject;
      if (qeM.containsKey(str))
      {
        localObject = (b)qeM.get(str);
        if ((((b)localObject).hie) && (!((b)localObject).hkX))
        {
          w.d("MicroMsg.SnsTranslateManager", "translatePost, get from cache, id:%s", new Object[] { str });
          e(((b)localObject).id, 1, ((b)localObject).result, ((b)localObject).hpO);
          GMTrace.o(8085812805632L, 60244);
          return;
        }
        qeM.remove(str);
      }
      if (paramm.bjL() != null)
      {
        localObject = paramm.bjL().uyr;
        qv localqv = new qv();
        localqv.fOS.id = str;
        localqv.fOS.fOT = ((String)localObject);
        localqv.fOS.type = 2;
        a.uLm.m(localqv);
        bN(paramm.bjM(), 1);
        paramm = new a();
        paramm.id = str;
        paramm.qeP = ((String)localObject);
        paramm.type = 2;
        qeN.add(paramm);
      }
    }
    GMTrace.o(8085812805632L, 60244);
  }
  
  public static void p(com.tencent.mm.plugin.sns.storage.m paramm)
  {
    GMTrace.i(8086215458816L, 60247);
    if (paramm != null)
    {
      paramm = paramm.bjM();
      b(GJ(paramm));
      ps localps = new ps();
      localps.fNA.type = 1;
      localps.fNA.id = paramm;
      a.uLm.m(localps);
      w.d("MicroMsg.SnsTranslateManager", "unTranslatePost, id:%s", new Object[] { paramm });
    }
    GMTrace.o(8086215458816L, 60247);
  }
  
  private static boolean pJ()
  {
    GMTrace.i(8085410152448L, 60241);
    if (!d.KT("translate"))
    {
      GMTrace.o(8085410152448L, 60241);
      return false;
    }
    String str = g.uz().getValue("TranslateSnsOff");
    if (bg.mZ(str))
    {
      GMTrace.o(8085410152448L, 60241);
      return true;
    }
    if (bg.RF(str) != 0)
    {
      GMTrace.o(8085410152448L, 60241);
      return false;
    }
    GMTrace.o(8085410152448L, 60241);
    return true;
  }
  
  private static final class a
  {
    String fNy;
    String id;
    String qeP;
    String qeQ;
    int type;
    
    public a()
    {
      GMTrace.i(8152787451904L, 60743);
      GMTrace.o(8152787451904L, 60743);
    }
    
    public final boolean equals(Object paramObject)
    {
      GMTrace.i(8152921669632L, 60744);
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if ((this.id.equals(((a)paramObject).id)) && (this.type == ((a)paramObject).type))
        {
          GMTrace.o(8152921669632L, 60744);
          return true;
        }
        GMTrace.o(8152921669632L, 60744);
        return false;
      }
      boolean bool = super.equals(paramObject);
      GMTrace.o(8152921669632L, 60744);
      return bool;
    }
  }
  
  public static final class b
  {
    public int gbQ;
    public boolean hie;
    public boolean hkX;
    public String hpO;
    public String id;
    public boolean qeR;
    public boolean qeS;
    public String result;
    
    public b()
    {
      GMTrace.i(8112924786688L, 60446);
      GMTrace.o(8112924786688L, 60446);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */