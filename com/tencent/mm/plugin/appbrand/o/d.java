package com.tencent.mm.plugin.appbrand.o;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.HandlerThread;
import android.os.Looper;
import android.webkit.URLUtil;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMFragmentActivity.a;
import com.tencent.mm.ui.e.g;
import com.tencent.mm.vending.h.g;
import com.tencent.mm.vending.h.h;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONObject;

public final class d
{
  private static volatile af hmL;
  private static final Object jwi;
  private static final Set<Object> jwj;
  private static final char[] jwk;
  private static final String[] jwl;
  
  static
  {
    GMTrace.i(10006871146496L, 74557);
    jwi = new Object();
    jwj = new HashSet();
    jwk = new char[] { 60, 62, 34, 39, 38, 32, 39 };
    jwl = new String[] { "&lt;", "&gt;", "&quot;", "&apos;", "&amp;", "&nbsp;", "&#39;" };
    GMTrace.o(10006871146496L, 74557);
  }
  
  public static <T> T aQ(T paramT)
  {
    GMTrace.i(10005528969216L, 74547);
    if (paramT != null) {
      jwj.add(paramT);
    }
    GMTrace.o(10005528969216L, 74547);
    return paramT;
  }
  
  public static void aR(Object paramObject)
  {
    GMTrace.i(10005663186944L, 74548);
    if (paramObject == null)
    {
      GMTrace.o(10005663186944L, 74548);
      return;
    }
    jwj.remove(paramObject);
    GMTrace.o(10005663186944L, 74548);
  }
  
  public static void aaV()
  {
    GMTrace.i(16145990025216L, 120297);
    Intent localIntent = new Intent();
    localIntent.setComponent(new ComponentName(e.g.vkF, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
    localIntent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
    ab.getContext().sendBroadcast(localIntent);
    GMTrace.o(16145990025216L, 120297);
  }
  
  public static long aaW()
  {
    GMTrace.i(10005260533760L, 74545);
    long l = bg.Po();
    GMTrace.o(10005260533760L, 74545);
    return l;
  }
  
  public static void aaX()
  {
    GMTrace.i(10005797404672L, 74549);
    if (hmL == null)
    {
      GMTrace.o(10005797404672L, 74549);
      return;
    }
    synchronized (jwi)
    {
      if (hmL != null)
      {
        g.Wr("SubCoreAppBrand#WorkerThread");
        hmL.nTP.quit();
        hmL = null;
      }
      GMTrace.o(10005797404672L, 74549);
      return;
    }
  }
  
  public static void bU(Context paramContext)
  {
    GMTrace.i(10006200057856L, 74552);
    if (!(paramContext instanceof Activity))
    {
      GMTrace.o(10006200057856L, 74552);
      return;
    }
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(16973825, new int[] { 16842936, 16842937 });
    int i = localTypedArray.getResourceId(0, 0);
    int j = localTypedArray.getResourceId(1, 0);
    localTypedArray.recycle();
    ((Activity)paramContext).overridePendingTransition(i, j);
    GMTrace.o(10006200057856L, 74552);
  }
  
  public static void bV(Context paramContext)
  {
    GMTrace.i(10006334275584L, 74553);
    if (!(paramContext instanceof Activity))
    {
      GMTrace.o(10006334275584L, 74553);
      return;
    }
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(16973825, new int[] { 16842938, 16842939 });
    int i = localTypedArray.getResourceId(0, 0);
    int j = localTypedArray.getResourceId(1, 0);
    localTypedArray.recycle();
    ((Activity)paramContext).overridePendingTransition(i, j);
    GMTrace.o(10006334275584L, 74553);
  }
  
  public static void bW(Context paramContext)
  {
    GMTrace.i(10006468493312L, 74554);
    if (!(paramContext instanceof Activity))
    {
      GMTrace.o(10006468493312L, 74554);
      return;
    }
    ((Activity)paramContext).overridePendingTransition(MMFragmentActivity.a.vqw, MMFragmentActivity.a.vqx);
    GMTrace.o(10006468493312L, 74554);
  }
  
  public static String e(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(10005394751488L, 74546);
    paramVarArgs = ab.getResources().getString(paramInt, paramVarArgs);
    GMTrace.o(10005394751488L, 74546);
    return paramVarArgs;
  }
  
  public static <T, L extends List<T>> L e(L paramL, int paramInt)
  {
    int i = 0;
    GMTrace.i(16146124242944L, 120298);
    if (paramL == null)
    {
      GMTrace.o(16146124242944L, 120298);
      return null;
    }
    if (paramInt <= 0) {
      throw new IllegalArgumentException(String.format(Locale.US, "startInclusive %d >= endExclusive %d !!!", new Object[] { Integer.valueOf(0), Integer.valueOf(paramInt) }));
    }
    try
    {
      List localList = (List)paramL.getClass().newInstance();
      paramL = paramL.listIterator(0);
      while ((paramL.hasNext()) && (i < paramInt))
      {
        localList.add(paramL.next());
        i += 1;
      }
      GMTrace.o(16146124242944L, 120298);
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.AppBrandUtil", "createSubList, newInstance of %s, exp = %s", new Object[] { paramL.getClass().getName(), localException });
      GMTrace.o(16146124242944L, 120298);
      return null;
    }
    return localException;
  }
  
  public static void k(Map paramMap)
  {
    GMTrace.i(10006602711040L, 74555);
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject2 = (Map.Entry)localIterator.next();
      Object localObject1 = ((Map.Entry)localObject2).getKey();
      localObject2 = ((Map.Entry)localObject2).getValue();
      if (((localObject1 instanceof String)) && ((localObject2 instanceof Map)))
      {
        k((Map)localObject2);
        paramMap.put(localObject1, new JSONObject((Map)localObject2));
      }
    }
    GMTrace.o(10006602711040L, 74555);
  }
  
  public static void runOnUiThread(Runnable paramRunnable)
  {
    GMTrace.i(10006065840128L, 74551);
    if (Thread.currentThread() != Looper.getMainLooper().getThread())
    {
      af.u(paramRunnable);
      GMTrace.o(10006065840128L, 74551);
      return;
    }
    paramRunnable.run();
    GMTrace.o(10006065840128L, 74551);
  }
  
  public static String sd(String paramString)
  {
    GMTrace.i(10006736928768L, 74556);
    StringBuffer localStringBuffer = new StringBuffer();
    int m = paramString.length();
    int i = 0;
    while (i < m)
    {
      int j = 0;
      while (j < jwk.length)
      {
        String str = jwl[j];
        int k = 0;
        while ((k < str.length()) && (i + k < m) && (str.charAt(k) == paramString.charAt(i + k))) {
          k += 1;
        }
        if (k == str.length()) {
          break;
        }
        j += 1;
      }
      if (j != jwk.length)
      {
        localStringBuffer.append(jwk[j]);
        i = jwl[j].length() + i;
      }
      else
      {
        localStringBuffer.append(paramString.charAt(i));
        i += 1;
      }
    }
    paramString = localStringBuffer.toString();
    GMTrace.o(10006736928768L, 74556);
    return paramString;
  }
  
  public static String se(String paramString)
  {
    GMTrace.i(19684103553024L, 146658);
    if (paramString == null)
    {
      GMTrace.o(19684103553024L, 146658);
      return null;
    }
    paramString = paramString.replace(' ', '\n').replace(' ', '\n');
    GMTrace.o(19684103553024L, 146658);
    return paramString;
  }
  
  public static boolean sf(String paramString)
  {
    GMTrace.i(19684237770752L, 146659);
    if ((!bg.mZ(paramString)) && ((URLUtil.isHttpsUrl(paramString)) || (URLUtil.isHttpUrl(paramString))))
    {
      GMTrace.o(19684237770752L, 146659);
      return true;
    }
    GMTrace.o(19684237770752L, 146659);
    return false;
  }
  
  public static af xC()
  {
    GMTrace.i(10005931622400L, 74550);
    if (hmL == null) {}
    synchronized (jwi)
    {
      if (hmL == null)
      {
        hmL = new af("SubCoreAppBrand#WorkerThread");
        g.a("SubCoreAppBrand#WorkerThread", new h(hmL.nTP.getLooper(), "SubCoreAppBrand#WorkerThread"));
      }
      ??? = hmL;
      GMTrace.o(10005931622400L, 74550);
      return (af)???;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/o/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */