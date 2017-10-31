package com.tencent.mm.plugin.appbrand.launching.a;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.ipcinvoker.e;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appcache.v;
import com.tencent.mm.plugin.appbrand.dynamic.i.a.e;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

abstract class a
{
  a()
  {
    GMTrace.i(17333548482560L, 129145);
    GMTrace.o(17333548482560L, 129145);
  }
  
  private static void a(String paramString, int paramInt, AppBrandStatObject paramAppBrandStatObject, Bundle paramBundle)
  {
    GMTrace.i(17333951135744L, 129148);
    paramAppBrandStatObject.scene = paramInt;
    paramAppBrandStatObject.fty = p.encode(paramString);
    paramAppBrandStatObject.fNV = com.tencent.mm.plugin.appbrand.report.b.e(paramInt, paramBundle);
    paramAppBrandStatObject.fNW = com.tencent.mm.plugin.appbrand.report.b.f(paramInt, paramBundle);
    if ((paramInt != 1037) && (paramInt != 1018))
    {
      paramAppBrandStatObject.fNU = paramInt;
      GMTrace.o(17333951135744L, 129148);
      return;
    }
    paramAppBrandStatObject.fNU = 0;
    GMTrace.o(17333951135744L, 129148);
  }
  
  final int a(Context paramContext, String paramString, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(17668958584832L, 131644);
    w.i("MicroMsg.AppBrand.AbsLinkOpener", "handle url = %s", new Object[] { paramString });
    Uri localUri = null;
    if (bg.mZ(paramString))
    {
      paramInt = a.jgH;
      paramContext = localUri;
    }
    for (;;)
    {
      a(paramContext, paramInt);
      GMTrace.o(17668958584832L, 131644);
      return paramInt;
      localUri = Uri.parse(paramString);
      if (bg.getInt(localUri.getQueryParameter("debug"), 0) > 0) {
        i = 1;
      }
      Object localObject1;
      for (;;)
      {
        if (i != 0)
        {
          i = bg.getInt(localUri.getQueryParameter("ret"), 0);
          if (i == 1)
          {
            paramInt = a.jgI;
            paramContext = localUri;
            break;
            i = 0;
            continue;
          }
          if (i == 2)
          {
            paramInt = a.jgJ;
            paramContext = localUri;
            break;
          }
          localObject1 = localUri.getQueryParameter("appid");
          str1 = localUri.getQueryParameter("username");
          str2 = bg.mY(localUri.getQueryParameter("path"));
          Object localObject2 = localUri.getQueryParameter("codeurl");
          String str3 = localUri.getQueryParameter("md5");
          String str4 = localUri.getQueryParameter("pageurl");
          String str5 = localUri.getQueryParameter("pagemd5");
          long l = bg.getLong(localUri.getQueryParameter("test_lifespan"), 7200L);
          if ((bg.mZ((String)localObject1)) || (bg.mZ(str1)) || (bg.mZ((String)localObject2)))
          {
            w.i("MicroMsg.AppBrand.AbsLinkOpener", "appId = %s, username = %s, codeURL = %s, invalid, return", new Object[] { localObject1, str1, localObject2 });
            paramInt = a.jgH;
            paramContext = localUri;
            break;
          }
          boolean bool = f.Sh().a((String)localObject1, 1, (String)localObject2, str3, 0L, bg.Po() + l);
          if ((!bg.mZ(str4)) && (!bg.mZ(str5)))
          {
            f.Sh().a((String)localObject1, 10000, str4, str5, 0L, bg.Po() + l);
            i = com.tencent.mm.plugin.appbrand.dynamic.j.a.bo(0, 1);
            if (i == 10000)
            {
              localObject2 = new Bundle();
              ((Bundle)localObject2).putString("appId", (String)localObject1);
              ((Bundle)localObject2).putInt("debugType", i);
              e.a("com.tencent.mm", (Parcelable)localObject2, a.e.class, null);
            }
          }
          if (bool) {
            com.tencent.mm.plugin.appbrand.task.b.at((String)localObject1, 1);
          }
          localObject1 = new AppBrandStatObject();
          a(paramString, paramInt, (AppBrandStatObject)localObject1, paramBundle);
          AppBrandLaunchProxyUI.a(paramContext, str1, str2, 1, -1, (AppBrandStatObject)localObject1, null);
          paramInt = a.jgG;
          paramContext = localUri;
          break;
        }
      }
      String str1 = localUri.getQueryParameter("username");
      String str2 = bg.mY(localUri.getQueryParameter("path"));
      int i = bg.getInt(localUri.getQueryParameter("version"), 0);
      int j = bg.getInt(localUri.getQueryParameter("type"), 0);
      if (bg.mZ(str1))
      {
        w.i("MicroMsg.AppBrand.AbsLinkOpener", "username = %s, invalid, return", new Object[] { str1 });
        paramInt = a.jgH;
        paramContext = localUri;
      }
      else
      {
        localObject1 = new AppBrandStatObject();
        a(paramString, paramInt, (AppBrandStatObject)localObject1, paramBundle);
        AppBrandLaunchProxyUI.a(paramContext, str1, str2, j, i, (AppBrandStatObject)localObject1, null);
        paramInt = a.jgG;
        paramContext = localUri;
      }
    }
  }
  
  abstract void a(Uri paramUri, int paramInt);
  
  static enum a
  {
    static
    {
      GMTrace.i(17333414264832L, 129144);
      jgG = 1;
      jgH = 2;
      jgI = 3;
      jgJ = 4;
      jgK = new int[] { jgG, jgH, jgI, jgJ };
      GMTrace.o(17333414264832L, 129144);
    }
    
    public static int[] Yi()
    {
      GMTrace.i(17333280047104L, 129143);
      int[] arrayOfInt = (int[])jgK.clone();
      GMTrace.o(17333280047104L, 129143);
      return arrayOfInt;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */