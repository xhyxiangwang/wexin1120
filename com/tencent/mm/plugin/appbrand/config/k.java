package com.tencent.mm.plugin.appbrand.config;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.u;
import com.tencent.mm.ac.u.a;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.protocal.c.bls;
import com.tencent.mm.protocal.c.cp;
import com.tencent.mm.protocal.c.vd;
import com.tencent.mm.protocal.c.ve;
import com.tencent.mm.protocal.c.vf;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;

public final class k
{
  public static String a(final String paramString, int paramInt1, int paramInt2, c paramc, boolean paramBoolean)
  {
    GMTrace.i(10578101796864L, 78813);
    if (f.Se() == null)
    {
      GMTrace.o(10578101796864L, 78813);
      return "";
    }
    int j = a.ae(paramString, paramInt1);
    int i;
    String str;
    if (f.Se() == null)
    {
      i = 0;
      str = a.af(paramString, paramInt1);
      if ((i == 0) || ((!bg.mZ(str)) && (i <= j))) {
        break label227;
      }
      paramBoolean = true;
      label71:
      w.i("MicroMsg.CommonConfigManager", "getConfig the server_version is %d ,the local_version is %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      w.i("MicroMsg.CommonConfigManager", "the config is \n %s \n isShouldSyncFromServer:%b", new Object[] { str, Boolean.valueOf(paramBoolean) });
      if (!paramBoolean) {
        break label233;
      }
      paramc = new b()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb)
        {
          GMTrace.i(10584678465536L, 78862);
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            w.e("MicroMsg.CommonConfigManager", "getConfig syncConfigFromServer, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
            if (this.iJk != null) {
              this.iJk.oc("");
            }
            GMTrace.o(10584678465536L, 78862);
            return;
          }
          paramAnonymousString = (vf)paramAnonymousb.hlV.hmc;
          if ((paramAnonymousString.tTw == null) || (paramAnonymousString.tTw.size() == 0))
          {
            w.e("MicroMsg.CommonConfigManager", "getConfig syncConfigFromServer, AppConfigList is empty");
            if (this.iJk != null) {
              this.iJk.oc("");
            }
            GMTrace.o(10584678465536L, 78862);
            return;
          }
          paramAnonymousString = (cp)paramAnonymousString.tTw.get(0);
          w.i("MicroMsg.CommonConfigManager", "getConfig syncConfigFromServer, the config is %s, the configVersion is %d", new Object[] { paramAnonymousString.tvU, Integer.valueOf(paramAnonymousString.tvT) });
          if (!bg.mZ(paramAnonymousString.tvU))
          {
            k.a.u(paramString, paramAnonymousString.jXP, paramAnonymousString.tvT);
            k.a.v(paramString, paramAnonymousString.jXP, paramAnonymousString.tvT);
            k.a.e(paramString, paramAnonymousString.jXP, paramAnonymousString.tvU);
            if (this.iJk != null)
            {
              this.iJk.oc(paramAnonymousString.tvU);
              GMTrace.o(10584678465536L, 78862);
            }
          }
          else if (this.iJk != null)
          {
            this.iJk.oc("");
          }
          GMTrace.o(10584678465536L, 78862);
        }
      };
      LinkedList localLinkedList = new LinkedList();
      vd localvd = new vd();
      localvd.mDD = paramString;
      localvd.jXP = paramInt1;
      localvd.tvT = i;
      localvd.tTu = paramInt2;
      localLinkedList.add(localvd);
      a(localLinkedList, paramc);
    }
    for (;;)
    {
      GMTrace.o(10578101796864L, 78813);
      return str;
      i = bg.getInt(f.Se().get(a.ac(paramString, paramInt1), "0"), 0);
      break;
      label227:
      paramBoolean = false;
      break label71;
      label233:
      paramc.oc(str);
    }
  }
  
  public static void a(String paramString, LinkedList<bls> paramLinkedList)
  {
    GMTrace.i(10577699143680L, 78810);
    a(paramString, paramLinkedList, true);
    GMTrace.o(10577699143680L, 78810);
  }
  
  public static void a(String paramString, LinkedList<bls> paramLinkedList, boolean paramBoolean)
  {
    GMTrace.i(10577833361408L, 78811);
    if (bg.mZ(paramString))
    {
      w.e("MicroMsg.CommonConfigManager", "setVersion, app_id is null");
      GMTrace.o(10577833361408L, 78811);
      return;
    }
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
    {
      w.e("MicroMsg.CommonConfigManager", "setVersion, versionItems is empty");
      GMTrace.o(10577833361408L, 78811);
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = paramLinkedList.iterator();
    while (localIterator.hasNext())
    {
      bls localbls = (bls)localIterator.next();
      w.d("MicroMsg.CommonConfigManager", "versionItem.version:%d,version.type:%d", new Object[] { Integer.valueOf(localbls.version), Integer.valueOf(localbls.type) });
      int i = a.ae(paramString, localbls.type);
      int j = localbls.version;
      a.v(paramString, localbls.type, j);
      if (j != 0) {
        if (j > i)
        {
          localLinkedList.add(t(paramString, localbls.type, localbls.version));
        }
        else if (j == i)
        {
          if (bg.mZ(a.af(paramString, localbls.type))) {
            localLinkedList.add(t(paramString, localbls.type, localbls.version));
          }
        }
        else
        {
          w.i("MicroMsg.CommonConfigManager", "local_version:%d, server_version:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          if (bg.mZ(a.af(paramString, localbls.type))) {
            localLinkedList.add(t(paramString, localbls.type, localbls.version));
          }
        }
      }
    }
    w.i("MicroMsg.CommonConfigManager", "setVersion appid:%s,versionItems.size:%d,getAppConfigItems.size:%d", new Object[] { paramString, Integer.valueOf(paramLinkedList.size()), Integer.valueOf(localLinkedList.size()) });
    if (paramBoolean)
    {
      if (localLinkedList.size() == 0)
      {
        GMTrace.o(10577833361408L, 78811);
        return;
      }
      w.d("MicroMsg.CommonConfigManager", "setVersion appid:%s, need sync from server", new Object[] { paramString });
      a(localLinkedList, new b()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb)
        {
          GMTrace.i(10581457240064L, 78838);
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            w.e("MicroMsg.CommonConfigManager", "setVersion syncConfigFromServer, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
            GMTrace.o(10581457240064L, 78838);
            return;
          }
          paramAnonymousString = (vf)paramAnonymousb.hlV.hmc;
          if ((paramAnonymousString.tTw == null) || (paramAnonymousString.tTw.size() == 0))
          {
            w.e("MicroMsg.CommonConfigManager", "setVersion syncConfigFromServer, AppConfigList is empty");
            GMTrace.o(10581457240064L, 78838);
            return;
          }
          w.i("MicroMsg.CommonConfigManager", "setVersion syncConfigFromServer appConfigList.size:%d", new Object[] { Integer.valueOf(paramAnonymousString.tTw.size()) });
          paramAnonymousString = paramAnonymousString.tTw.iterator();
          while (paramAnonymousString.hasNext())
          {
            paramAnonymousb = (cp)paramAnonymousString.next();
            w.i("MicroMsg.CommonConfigManager", "setVersion syncConfigFromServer, the config is %s, the configVersion is %d", new Object[] { paramAnonymousb.tvU, Integer.valueOf(paramAnonymousb.tvT) });
            if (!bg.mZ(paramAnonymousb.tvU))
            {
              k.a.u(this.iJj, paramAnonymousb.jXP, paramAnonymousb.tvT);
              k.a.v(this.iJj, paramAnonymousb.jXP, paramAnonymousb.tvT);
              k.a.e(this.iJj, paramAnonymousb.jXP, paramAnonymousb.tvU);
            }
          }
          GMTrace.o(10581457240064L, 78838);
        }
      });
    }
    GMTrace.o(10577833361408L, 78811);
  }
  
  private static void a(LinkedList<vd> paramLinkedList, b paramb)
  {
    GMTrace.i(10578236014592L, 78814);
    b.a locala = new b.a();
    locala.hlW = 1138;
    locala.uri = "/cgi-bin/mmbiz-bin/wxausrevent/getappconfig";
    locala.hlY = new vf();
    locala.hlZ = 0;
    locala.hma = 0;
    ve localve = new ve();
    localve.tTv = paramLinkedList;
    locala.hlX = localve;
    u.a(locala.DA(), new u.a()
    {
      public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb, com.tencent.mm.ac.k paramAnonymousk)
      {
        GMTrace.i(10592060440576L, 78917);
        if (this.iJl != null) {
          this.iJl.a(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString, paramAnonymousb);
        }
        GMTrace.o(10592060440576L, 78917);
        return 0;
      }
    }, true);
    GMTrace.o(10578236014592L, 78814);
  }
  
  private static vd t(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(10577967579136L, 78812);
    vd localvd = new vd();
    localvd.mDD = paramString;
    localvd.jXP = paramInt1;
    localvd.tvT = paramInt2;
    GMTrace.o(10577967579136L, 78812);
    return localvd;
  }
  
  public static final class a
  {
    private static String ab(String paramString, int paramInt)
    {
      GMTrace.i(10585886425088L, 78871);
      paramString = String.format("%s_%s_local_version", new Object[] { paramString, Integer.valueOf(paramInt) });
      GMTrace.o(10585886425088L, 78871);
      return paramString;
    }
    
    public static String ac(String paramString, int paramInt)
    {
      GMTrace.i(10586020642816L, 78872);
      paramString = String.format("%s_%s_server_version", new Object[] { paramString, Integer.valueOf(paramInt) });
      GMTrace.o(10586020642816L, 78872);
      return paramString;
    }
    
    private static String ad(String paramString, int paramInt)
    {
      GMTrace.i(10586154860544L, 78873);
      paramString = String.format("%s_%s_config", new Object[] { paramString, Integer.valueOf(paramInt) });
      GMTrace.o(10586154860544L, 78873);
      return paramString;
    }
    
    public static int ae(String paramString, int paramInt)
    {
      GMTrace.i(10586691731456L, 78877);
      if (f.Se() == null)
      {
        GMTrace.o(10586691731456L, 78877);
        return 0;
      }
      paramInt = bg.getInt(f.Se().get(ab(paramString, paramInt), "0"), 0);
      GMTrace.o(10586691731456L, 78877);
      return paramInt;
    }
    
    public static String af(String paramString, int paramInt)
    {
      GMTrace.i(10586825949184L, 78878);
      if (f.Se() == null)
      {
        GMTrace.o(10586825949184L, 78878);
        return "";
      }
      paramString = f.Se().get(ad(paramString, paramInt), "");
      GMTrace.o(10586825949184L, 78878);
      return paramString;
    }
    
    public static void e(String paramString1, int paramInt, String paramString2)
    {
      GMTrace.i(10586557513728L, 78876);
      if (f.Se() == null)
      {
        GMTrace.o(10586557513728L, 78876);
        return;
      }
      f.Se().aP(ad(paramString1, paramInt), paramString2);
      GMTrace.o(10586557513728L, 78876);
    }
    
    public static void u(String paramString, int paramInt1, int paramInt2)
    {
      GMTrace.i(10586289078272L, 78874);
      if (f.Se() == null)
      {
        GMTrace.o(10586289078272L, 78874);
        return;
      }
      f.Se().aP(ab(paramString, paramInt1), String.valueOf(paramInt2));
      GMTrace.o(10586289078272L, 78874);
    }
    
    public static void v(String paramString, int paramInt1, int paramInt2)
    {
      GMTrace.i(10586423296000L, 78875);
      if (f.Se() == null)
      {
        GMTrace.o(10586423296000L, 78875);
        return;
      }
      f.Se().aP(ac(paramString, paramInt1), String.valueOf(paramInt2));
      GMTrace.o(10586423296000L, 78875);
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(int paramInt1, int paramInt2, String paramString, b paramb);
  }
  
  public static abstract interface c
  {
    public abstract void oc(String paramString);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */