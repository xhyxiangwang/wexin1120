package com.tencent.mm.plugin.appbrand.media;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class b
{
  private static String jgY;
  private static Map<String, c> jgZ;
  private static ArrayList<String> jha;
  private static Map<String, c> jhb;
  private static ArrayList<String> jhc;
  
  static
  {
    GMTrace.i(19857915510784L, 147953);
    jgY = "";
    jgZ = new HashMap();
    jha = new ArrayList();
    jhb = new HashMap();
    jhc = new ArrayList();
    GMTrace.o(19857915510784L, 147953);
  }
  
  public static String Yn()
  {
    GMTrace.i(19857110204416L, 147947);
    String str = jgY;
    GMTrace.o(19857110204416L, 147947);
    return str;
  }
  
  public static void Yo()
  {
    GMTrace.i(19857244422144L, 147948);
    w.i("MicroMsg.AppBrandAudioService", "clearAudioListener");
    Iterator localIterator = jha.iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      localObject = (c)jgZ.remove(localObject);
      if (localObject != null) {
        a.uLm.c((c)localObject);
      }
    }
    jgZ.clear();
    jha.clear();
    localIterator = jhc.iterator();
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      localObject = (c)jhb.remove(localObject);
      if (localObject != null) {
        a.uLm.c((c)localObject);
      }
    }
    jhb.clear();
    jhc.clear();
    GMTrace.o(19857244422144L, 147948);
  }
  
  public static void a(String paramString, c paramc)
  {
    GMTrace.i(19857378639872L, 147949);
    if (jgZ.containsKey(paramString))
    {
      w.e("MicroMsg.AppBrandAudioService", "appId:%s has add listener", new Object[] { paramString });
      GMTrace.o(19857378639872L, 147949);
      return;
    }
    if (paramc == null)
    {
      w.e("MicroMsg.AppBrandAudioService", "listener is null");
      GMTrace.o(19857378639872L, 147949);
      return;
    }
    w.i("MicroMsg.AppBrandAudioService", "addRecordListener,appId:%s", new Object[] { paramString });
    jgZ.put(paramString, paramc);
    if (!jha.contains(paramString)) {
      jha.add(paramString);
    }
    a.uLm.a(paramc);
    GMTrace.o(19857378639872L, 147949);
  }
  
  public static void b(String paramString, c paramc)
  {
    GMTrace.i(19857647075328L, 147951);
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.AppBrandAudioService", "appId is empty");
      GMTrace.o(19857647075328L, 147951);
      return;
    }
    if (paramc == null)
    {
      w.e("MicroMsg.AppBrandAudioService", "listener is null");
      GMTrace.o(19857647075328L, 147951);
      return;
    }
    if (jhb.containsKey(paramString)) {
      qP(paramString);
    }
    w.i("MicroMsg.AppBrandAudioService", "addAudioPlayerListener,appId:%s", new Object[] { paramString });
    jhb.put(paramString, paramc);
    if (!jhc.contains(paramString)) {
      jhc.add(paramString);
    }
    a.uLm.a(paramc);
    GMTrace.o(19857647075328L, 147951);
  }
  
  public static void qN(String paramString)
  {
    GMTrace.i(19856975986688L, 147946);
    jgY = paramString;
    GMTrace.o(19856975986688L, 147946);
  }
  
  public static void qO(String paramString)
  {
    GMTrace.i(19857512857600L, 147950);
    if (!jgZ.containsKey(paramString))
    {
      w.e("MicroMsg.AppBrandAudioService", "appId:%s not exist the appId for listener", new Object[] { paramString });
      GMTrace.o(19857512857600L, 147950);
      return;
    }
    w.i("MicroMsg.AppBrandAudioService", "removeRecordListener,appId:%s", new Object[] { paramString });
    jha.remove(paramString);
    paramString = (c)jgZ.remove(paramString);
    if (paramString != null) {
      a.uLm.c(paramString);
    }
    GMTrace.o(19857512857600L, 147950);
  }
  
  public static void qP(String paramString)
  {
    GMTrace.i(19857781293056L, 147952);
    if (!jhb.containsKey(paramString))
    {
      w.e("MicroMsg.AppBrandAudioService", "appId:%s not exist the appId for listener", new Object[] { paramString });
      GMTrace.o(19857781293056L, 147952);
      return;
    }
    w.i("MicroMsg.AppBrandAudioService", "removeAudioPlayerListener,appId:%s", new Object[] { paramString });
    jhc.remove(paramString);
    paramString = (c)jhb.remove(paramString);
    if (paramString != null) {
      a.uLm.c(paramString);
    }
    GMTrace.o(19857781293056L, 147952);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/media/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */