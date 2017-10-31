package com.tencent.mm.plugin.appbrand.dynamic.e;

import android.util.Log;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.wx_extension.a.a.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;
import org.json.JSONObject;

public final class g
{
  private static volatile boolean gUt;
  public static volatile int iMn;
  
  static
  {
    GMTrace.i(19951331049472L, 148649);
    iMn = 0;
    gUt = false;
    GMTrace.o(19951331049472L, 148649);
  }
  
  public static c UU()
  {
    GMTrace.i(19950659960832L, 148644);
    if (iMn == 2)
    {
      localObject = new k();
      GMTrace.o(19950659960832L, 148644);
      return (c)localObject;
    }
    Object localObject = new d();
    GMTrace.o(19950659960832L, 148644);
    return (c)localObject;
  }
  
  public static a UV()
  {
    GMTrace.i(19950928396288L, 148646);
    if (iMn == 2)
    {
      localObject = new j();
      GMTrace.o(19950928396288L, 148646);
      return (a)localObject;
    }
    Object localObject = new b();
    GMTrace.o(19950928396288L, 148646);
    return (a)localObject;
  }
  
  public static int UW()
  {
    GMTrace.i(19951196831744L, 148648);
    int i = iMn;
    GMTrace.o(19951196831744L, 148648);
    return i;
  }
  
  public static void initialize()
  {
    GMTrace.i(19950391525376L, 148642);
    com.tencent.mm.bu.a.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19963142209536L, 148737);
        Object localObject = a.b.gOA;
        localObject = com.tencent.mm.ipcinvoker.wx_extension.a.a.em("100295");
        if (localObject == null)
        {
          w.i("MicroMsg.JSONFactory", "JSON lib type ABTest item is null.");
          GMTrace.o(19963142209536L, 148737);
          return;
        }
        if (!((com.tencent.mm.storage.c)localObject).isValid())
        {
          g.ir(2);
          GMTrace.o(19963142209536L, 148737);
          return;
        }
        try
        {
          g.ir(bg.getInt((String)((com.tencent.mm.storage.c)localObject).bPn().get("jsonLibType"), 2));
          w.i("MicroMsg.JSONFactory", "current jsonLibType is : %d", new Object[] { Integer.valueOf(g.iMn) });
          GMTrace.o(19963142209536L, 148737);
          return;
        }
        catch (Exception localException)
        {
          w.w("MicroMsg.JSONFactory", "parse jsonLibType error : %s", new Object[] { Log.getStackTraceString(localException) });
          GMTrace.o(19963142209536L, 148737);
        }
      }
    });
    GMTrace.o(19950391525376L, 148642);
  }
  
  public static void ir(int paramInt)
  {
    GMTrace.i(19951062614016L, 148647);
    iMn = paramInt;
    gUt = true;
    GMTrace.o(19951062614016L, 148647);
  }
  
  public static JSONObject pB(String paramString)
  {
    GMTrace.i(19950525743104L, 148643);
    if (!gUt) {
      initialize();
    }
    if (iMn == 2)
    {
      paramString = new h(paramString);
      GMTrace.o(19950525743104L, 148643);
      return paramString;
    }
    paramString = new JSONObject(paramString);
    GMTrace.o(19950525743104L, 148643);
    return paramString;
  }
  
  public static c pC(String paramString)
  {
    GMTrace.i(19950794178560L, 148645);
    if (iMn == 2)
    {
      paramString = new k(paramString);
      GMTrace.o(19950794178560L, 148645);
      return paramString;
    }
    paramString = new d(paramString);
    GMTrace.o(19950794178560L, 148645);
    return paramString;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/e/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */