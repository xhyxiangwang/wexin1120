package com.tencent.mm.plugin.appbrand.task;

import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.c.a;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.ui.AppBrandInToolsUI;
import com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI;
import com.tencent.mm.plugin.appbrand.ui.AppBrandUI;
import com.tencent.mm.plugin.appbrand.ui.AppBrandUI1;
import com.tencent.mm.plugin.appbrand.ui.AppBrandUI2;
import com.tencent.mm.plugin.appbrand.ui.AppBrandUI3;
import com.tencent.mm.plugin.appbrand.ui.AppBrandUI4;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import junit.framework.Assert;

public final class b
{
  private static final LinkedList<c> jpQ;
  private static final c jpR;
  private static final c jpS;
  
  static
  {
    GMTrace.i(10646284402688L, 79321);
    LinkedList localLinkedList = new LinkedList();
    jpQ = localLinkedList;
    localLinkedList.add(new c(AppBrandUI.class, AppBrandTaskPreloadReceiver.class));
    jpQ.add(new c(AppBrandUI1.class, AppBrandTaskPreloadReceiver1.class));
    jpQ.add(new c(AppBrandUI2.class, AppBrandTaskPreloadReceiver2.class));
    jpQ.add(new c(AppBrandUI3.class, AppBrandTaskPreloadReceiver3.class));
    jpQ.add(new c(AppBrandUI4.class, AppBrandTaskPreloadReceiver4.class));
    jpR = new c(AppBrandPluginUI.class, AppBrandTaskPreloadReceiver.class);
    jpS = new c(AppBrandInToolsUI.class, null);
    GMTrace.o(10646284402688L, 79321);
  }
  
  public static void ZQ()
  {
    GMTrace.i(10644405354496L, 79307);
    if (!a.SX())
    {
      GMTrace.o(10644405354496L, 79307);
      return;
    }
    ZR().yh();
    GMTrace.o(10644405354496L, 79307);
  }
  
  private static c ZR()
  {
    GMTrace.i(17272345198592L, 128689);
    int i = 0;
    if (i < jpQ.size()) {
      if (!((c)jpQ.get(i)).jpX.keySet().isEmpty()) {}
    }
    for (c localc = (c)jpQ.get(i);; localc = null)
    {
      if (localc != null)
      {
        GMTrace.o(17272345198592L, 128689);
        return localc;
        i += 1;
        break;
      }
      localc = (c)jpQ.getFirst();
      GMTrace.o(17272345198592L, 128689);
      return localc;
    }
  }
  
  private static LinkedList<c> ZS()
  {
    GMTrace.i(17272882069504L, 128693);
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.addAll(jpQ);
    localLinkedList.add(jpR);
    localLinkedList.add(jpS);
    GMTrace.o(17272882069504L, 128693);
    return localLinkedList;
  }
  
  public static void a(Context paramContext, AppBrandInitConfig paramAppBrandInitConfig, AppBrandStatObject paramAppBrandStatObject)
  {
    GMTrace.i(10643868483584L, 79303);
    Object localObject1;
    Object localObject2;
    if (paramAppBrandInitConfig.iIw)
    {
      localObject1 = jpR;
      ((c)localObject1).a(paramAppBrandInitConfig.appId, paramAppBrandInitConfig.iCo, null);
      localObject2 = paramContext;
      if (paramContext == null) {
        localObject2 = ab.getContext();
      }
      paramContext = new Intent((Context)localObject2, ((c)localObject1).jpV);
      paramContext.putExtra("key_appbrand_init_config", paramAppBrandInitConfig);
      paramContext.putExtra("key_appbrand_stat_object", paramAppBrandStatObject);
      paramContext.addFlags(268435456);
      ((Context)localObject2).startActivity(paramContext);
      if (paramAppBrandStatObject != null) {
        break label163;
      }
    }
    label163:
    for (int i = 0;; i = paramAppBrandStatObject.scene)
    {
      if (i != 1023) {
        break label171;
      }
      d.bU((Context)localObject2);
      GMTrace.o(10643868483584L, 79303);
      return;
      localObject2 = rQ(paramAppBrandInitConfig.appId);
      localObject1 = localObject2;
      if (localObject2 != null) {
        break;
      }
      if (paramAppBrandInitConfig.iIx) {}
      for (localObject1 = jpS;; localObject1 = ZR())
      {
        a((c)localObject1);
        break;
      }
    }
    label171:
    d.bW((Context)localObject2);
    GMTrace.o(10643868483584L, 79303);
  }
  
  static void a(c paramc)
  {
    GMTrace.i(17273150504960L, 128695);
    if (!jpQ.contains(paramc))
    {
      GMTrace.o(17273150504960L, 128695);
      return;
    }
    jpQ.remove(paramc);
    jpQ.addLast(paramc);
    GMTrace.o(17273150504960L, 128695);
  }
  
  public static void at(String paramString, int paramInt)
  {
    GMTrace.i(10644002701312L, 79304);
    c localc = rQ(paramString);
    if (localc == null)
    {
      GMTrace.o(10644002701312L, 79304);
      return;
    }
    if ((((Integer)localc.jpX.get(paramString)).intValue() == paramInt) && (localc.rU(paramString) != null)) {
      localc.rU(paramString).rN(paramString);
    }
    GMTrace.o(10644002701312L, 79304);
  }
  
  static c bf(String paramString1, String paramString2)
  {
    GMTrace.i(17272747851776L, 128692);
    Iterator localIterator = ZS().iterator();
    while (localIterator.hasNext())
    {
      c localc = (c)localIterator.next();
      if ((localc.jpX.keySet().contains(paramString1)) && (localc.jpU.equals(paramString2)))
      {
        GMTrace.o(17272747851776L, 128692);
        return localc;
      }
    }
    GMTrace.o(17272747851776L, 128692);
    return null;
  }
  
  public static void jr(int paramInt)
  {
    GMTrace.i(10644136919040L, 79305);
    Iterator localIterator1 = ZS().iterator();
    while (localIterator1.hasNext())
    {
      Iterator localIterator2 = ((c)localIterator1.next()).jpY.values().iterator();
      while (localIterator2.hasNext())
      {
        AppBrandRemoteTaskController localAppBrandRemoteTaskController = (AppBrandRemoteTaskController)localIterator2.next();
        if (localAppBrandRemoteTaskController != null)
        {
          localAppBrandRemoteTaskController.jpz = AppBrandRemoteTaskController.a.jpI;
          localAppBrandRemoteTaskController.jpA = paramInt;
          localAppBrandRemoteTaskController.VC();
        }
      }
    }
    GMTrace.o(10644136919040L, 79305);
  }
  
  public static void onNetworkChange()
  {
    GMTrace.i(10644808007680L, 79310);
    Iterator localIterator1 = ZS().iterator();
    while (localIterator1.hasNext())
    {
      Iterator localIterator2 = ((c)localIterator1.next()).jpY.values().iterator();
      while (localIterator2.hasNext())
      {
        AppBrandRemoteTaskController localAppBrandRemoteTaskController = (AppBrandRemoteTaskController)localIterator2.next();
        if (localAppBrandRemoteTaskController != null)
        {
          localAppBrandRemoteTaskController.jpz = AppBrandRemoteTaskController.a.jpM;
          localAppBrandRemoteTaskController.VC();
        }
      }
    }
    GMTrace.o(10644808007680L, 79310);
  }
  
  public static void rO(String paramString)
  {
    GMTrace.i(17272210980864L, 128688);
    c localc = rQ(paramString);
    if ((localc != null) && (localc.rU(paramString) != null)) {
      localc.rU(paramString).rN(paramString);
    }
    GMTrace.o(17272210980864L, 128688);
  }
  
  public static void rP(String paramString)
  {
    GMTrace.i(10644539572224L, 79308);
    paramString = rR(paramString);
    if (paramString == null)
    {
      GMTrace.o(10644539572224L, 79308);
      return;
    }
    af.i(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10643063177216L, 79297);
        this.jpT.yh();
        GMTrace.o(10643063177216L, 79297);
      }
    }, 500L);
    GMTrace.o(10644539572224L, 79308);
  }
  
  private static c rQ(String paramString)
  {
    GMTrace.i(17272479416320L, 128690);
    Iterator localIterator = ZS().iterator();
    while (localIterator.hasNext())
    {
      c localc = (c)localIterator.next();
      if (localc.jpX.keySet().contains(paramString))
      {
        GMTrace.o(17272479416320L, 128690);
        return localc;
      }
    }
    GMTrace.o(17272479416320L, 128690);
    return null;
  }
  
  static c rR(String paramString)
  {
    GMTrace.i(17272613634048L, 128691);
    Iterator localIterator = ZS().iterator();
    while (localIterator.hasNext())
    {
      c localc = (c)localIterator.next();
      if (localc.jpU.equals(paramString))
      {
        GMTrace.o(17272613634048L, 128691);
        return localc;
      }
    }
    Assert.assertTrue(false);
    GMTrace.o(17272613634048L, 128691);
    return null;
  }
  
  public static boolean rS(String paramString)
  {
    GMTrace.i(10645210660864L, 79313);
    c localc = rQ(paramString);
    if ((localc != null) && (localc.rU(paramString) != null))
    {
      paramString = localc.rU(paramString);
      paramString.jpz = AppBrandRemoteTaskController.a.jpL;
      if (paramString.VC())
      {
        GMTrace.o(10645210660864L, 79313);
        return true;
      }
    }
    GMTrace.o(10645210660864L, 79313);
    return false;
  }
  
  static void rT(String paramString)
  {
    GMTrace.i(17273016287232L, 128694);
    c localc = rQ(paramString);
    if (localc != null)
    {
      localc.jpX.remove(paramString);
      localc.jpY.remove(paramString);
      if ((localc.jpX.keySet().isEmpty()) && (jpQ.contains(localc)))
      {
        jpQ.remove(localc);
        jpQ.addFirst(localc);
      }
    }
    GMTrace.o(17273016287232L, 128694);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/task/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */