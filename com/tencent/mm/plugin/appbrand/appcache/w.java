package com.tencent.mm.plugin.appbrand.appcache;

import android.content.ContentValues;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.pluginsdk.j.a.d.k;
import com.tencent.mm.sdk.platformtools.bg;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class w
{
  private static volatile w iCl;
  private final Map<String, Map<a, Boolean>> iCm;
  private final o iCn;
  
  static
  {
    GMTrace.i(10609777180672L, 79049);
    iCl = null;
    GMTrace.o(10609777180672L, 79049);
  }
  
  public w()
  {
    GMTrace.i(10608032350208L, 79036);
    this.iCm = new android.support.v4.e.a();
    this.iCn = new o();
    GMTrace.o(10608032350208L, 79036);
  }
  
  private static w SO()
  {
    GMTrace.i(10608166567936L, 79037);
    if (((com.tencent.mm.plugin.appbrand.a.a)h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RT() == null)
    {
      iCl = null;
      GMTrace.o(10608166567936L, 79037);
      return null;
    }
    if (iCl == null) {}
    try
    {
      if (iCl == null) {
        iCl = new w();
      }
      w localw = iCl;
      GMTrace.o(10608166567936L, 79037);
      return localw;
    }
    finally {}
  }
  
  static void a(String paramString1, String paramString2, w.a.b paramb)
  {
    GMTrace.i(19996428206080L, 148985);
    if (SO() == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWxaPkgUpdater", "onDownloadFail, get instance null !!!");
      GMTrace.o(19996428206080L, 148985);
      return;
    }
    a(paramString1, paramString2, paramb, null);
    GMTrace.o(19996428206080L, 148985);
  }
  
  static void a(String paramString1, String paramString2, w.a.b paramb, w.a.a parama)
  {
    GMTrace.i(15543620861952L, 115809);
    paramString1 = oe(paramString1);
    if (paramString1 != null)
    {
      paramString1 = paramString1.keySet().iterator();
      while (paramString1.hasNext())
      {
        a locala = (a)paramString1.next();
        if (locala != null) {
          locala.a(paramString2, paramb, parama);
        }
      }
      GMTrace.o(15543620861952L, 115809);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AppBrandWxaPkgUpdater", "callback, null callback appId = %s", new Object[] { paramString2 });
    GMTrace.o(15543620861952L, 115809);
  }
  
  static void a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, g.a parama)
  {
    GMTrace.i(19996562423808L, 148986);
    boolean bool = c.a.fx(paramInt2);
    if (SO() == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWxaPkgUpdater", "onDownloadComplete, get instance null !!!");
      GMTrace.o(19996562423808L, 148986);
      return;
    }
    if (bg.mZ(paramString3))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWxaPkgUpdater", "onDownloadComplete, filePath is null or nil");
      a(paramString1, paramString2, w.a.b.iCr, null);
      parama.Ss();
      GMTrace.o(19996562423808L, 148986);
      return;
    }
    if (!new File(paramString3).exists())
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWxaPkgUpdater", "onDownloadComplete, pkg file not exists");
      a(paramString1, paramString2, w.a.b.iCr, null);
      parama.Ss();
      GMTrace.o(19996562423808L, 148986);
      return;
    }
    if (((com.tencent.mm.plugin.appbrand.a.a)h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RT() == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWxaPkgUpdater", "onDownloadComplete, WxaPkgStorage is null");
      aA(paramString1, paramString2);
      GMTrace.o(19996562423808L, 148986);
      return;
    }
    if (!bool) {}
    for (int i = paramInt1;; i = 1)
    {
      localObject2 = ((com.tencent.mm.plugin.appbrand.a.a)h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RT().a(paramString2, i, paramInt2, new String[0]);
      if (localObject2 != null) {
        break;
      }
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWxaPkgUpdater", "onDownloadComplete, no manifest record!!! with given appId(%s) version(%d) debugType(%d)", new Object[] { paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      a(paramString1, paramString2, w.a.b.iCq, null);
      GMTrace.o(19996562423808L, 148986);
      return;
    }
    parama.St();
    Object localObject1 = new File(paramString3);
    Object localObject2 = ((r)localObject2).field_versionMd5;
    if (!bool)
    {
      String str = com.tencent.mm.a.g.h((File)localObject1);
      if (!bg.mY((String)localObject2).equals(str))
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWxaPkgUpdater", "onDownloadComplete, record.md5(%s) != file.md5(%s)", new Object[] { localObject2, str });
        bool = false;
      }
    }
    for (;;)
    {
      parama.bT(bool);
      if (bool) {
        break;
      }
      b.deleteFile(paramString3);
      a(paramString1, paramString2, w.a.b.iCt, null);
      GMTrace.o(19996562423808L, 148986);
      return;
      localObject2 = new n((File)localObject1);
      if (!((n)localObject2).iBl)
      {
        ((n)localObject2).close();
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWxaPkgUpdater", "onDownloadComplete, pkg invalid");
        ((File)localObject1).delete();
        bool = false;
      }
      else if (!((n)localObject2).Sx())
      {
        ((n)localObject2).close();
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWxaPkgUpdater", "onDownloadComplete, pkg readInfo failed");
        ((File)localObject1).delete();
        bool = false;
      }
      else
      {
        ((n)localObject2).close();
        bool = true;
      }
    }
    parama = ((com.tencent.mm.plugin.appbrand.a.a)h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RT();
    if (!bg.mZ(paramString2)) {
      if (!c.a.fx(paramInt2)) {
        break label651;
      }
    }
    label651:
    for (int j = 1;; j = i)
    {
      localObject1 = new ContentValues(1);
      ((ContentValues)localObject1).put("pkgPath", paramString3);
      if (parama.iCj.update("AppBrandWxaPkgManifestRecord", (ContentValues)localObject1, String.format("%s=? and %s=? and %s=?", new Object[] { "appId", "debugType", "version" }), new String[] { paramString2, String.valueOf(paramInt2), String.valueOf(j) }) > 0) {}
      for (bool = true;; bool = false)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandWxaPkgUpdater", "onDownloadComplete, update ret = %b, appId = %s, debugType = %d, pkgVersion = %d, String filePath = %s", new Object[] { Boolean.valueOf(bool), paramString2, Integer.valueOf(paramInt2), Integer.valueOf(i), paramString3 });
        a(paramString1, paramString2, w.a.b.iCp, new w.a.a(paramString2, paramString3, paramInt1, paramInt2));
        GMTrace.o(19996562423808L, 148986);
        return;
      }
    }
  }
  
  public static boolean a(p paramp, a parama)
  {
    GMTrace.i(19996293988352L, 148984);
    if (SO() == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWxaPkgUpdater", "startDownloadPkg, get null updater instance!!!");
      GMTrace.o(19996293988352L, 148984);
      return false;
    }
    String str = paramp.sUR;
    Object localObject;
    if ((!bg.mZ(str)) && (parama != null))
    {
      localObject = SO();
      if (localObject != null) {
        break label106;
      }
    }
    for (;;)
    {
      int i = SO().iCn.b(paramp);
      if ((i != 0) && (i != 2))
      {
        a(paramp.sUR, paramp.appId, w.a.b.iCv, null);
        GMTrace.o(19996293988352L, 148984);
        return false;
        try
        {
          label106:
          Map localMap = (Map)((w)localObject).iCm.get(str);
          localObject = localMap;
          if (localMap == null)
          {
            localObject = new HashMap();
            SO().iCm.put(str, localObject);
          }
          ((Map)localObject).put(parama, Boolean.valueOf(true));
        }
        finally {}
      }
    }
    GMTrace.o(19996293988352L, 148984);
    return true;
  }
  
  public static boolean a(String paramString1, int paramInt1, int paramInt2, String paramString2, a parama)
  {
    Object localObject2 = null;
    GMTrace.i(17655671029760L, 131545);
    if (SO() == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWxaPkgUpdater", "startDownloadPkg, get null updater instance!!!");
      GMTrace.o(17655671029760L, 131545);
      return false;
    }
    Object localObject1 = localObject2;
    if (!bg.mZ(paramString1))
    {
      if (!bg.mZ(paramString2)) {
        break label109;
      }
      localObject1 = localObject2;
    }
    while (localObject1 == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWxaPkgUpdater", "startDownloadPkg, create Null request, appId %s, pkgType %d, pkgVersion %d, url %s", new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString2 });
      GMTrace.o(17655671029760L, 131545);
      return false;
      switch (paramInt1)
      {
      default: 
        localObject1 = localObject2;
        break;
      case 0: 
        localObject1 = new p(paramString1, paramInt1, paramInt2, paramString2);
        break;
      case 10000: 
      case 10001: 
      case 10002: 
      case 10100: 
      case 10101: 
      case 10102: 
        localObject1 = new x(paramString2, paramString1, paramInt2, paramInt1);
        break;
      case 1: 
      case 2: 
      case 999: 
        label109:
        localObject1 = new o.b(paramString1, paramString2, paramInt1);
      }
    }
    boolean bool = a((p)localObject1, parama);
    GMTrace.o(17655671029760L, 131545);
    return bool;
  }
  
  public static boolean a(String paramString, int paramInt, a parama)
  {
    GMTrace.i(15543218208768L, 115806);
    boolean bool = a("@LibraryAppId", 0, paramInt, paramString, parama);
    GMTrace.o(15543218208768L, 115806);
    return bool;
  }
  
  public static boolean a(String paramString1, int paramInt, String paramString2, a parama)
  {
    GMTrace.i(17655805247488L, 131546);
    boolean bool = a(paramString1, paramInt, 1, paramString2, parama);
    GMTrace.o(17655805247488L, 131546);
    return bool;
  }
  
  public static boolean a(String paramString, a parama)
  {
    GMTrace.i(10608300785664L, 79038);
    boolean bool = a("@LibraryAppId", 999, paramString, parama);
    GMTrace.o(10608300785664L, 79038);
    return bool;
  }
  
  static void aA(String paramString1, String paramString2)
  {
    GMTrace.i(17655536812032L, 131544);
    a(paramString1, paramString2, w.a.b.iCv, null);
    GMTrace.o(17655536812032L, 131544);
  }
  
  static Map<a, Boolean> oe(String paramString)
  {
    GMTrace.i(16161425063936L, 120412);
    w localw;
    if (!bg.mZ(paramString))
    {
      localw = SO();
      if (localw != null) {}
    }
    else
    {
      GMTrace.o(16161425063936L, 120412);
      return null;
    }
    try
    {
      paramString = (Map)localw.iCm.remove(paramString);
      GMTrace.o(16161425063936L, 120412);
      return paramString;
    }
    finally {}
  }
  
  public static void shutdown()
  {
    GMTrace.i(17655402594304L, 131543);
    try
    {
      w localw = iCl;
      iCl = null;
      if (localw != null) {
        localw.iCn.iBs.shutdown();
      }
      GMTrace.o(17655402594304L, 131543);
      return;
    }
    finally {}
  }
  
  public static abstract interface a
  {
    public abstract void a(String paramString, b paramb, a parama);
    
    public static final class a
    {
      public final String appId;
      public final String filePath;
      public final int iCo;
      public final int version;
      
      public a(String paramString1, String paramString2, int paramInt1, int paramInt2)
      {
        GMTrace.i(10606421737472L, 79024);
        this.appId = paramString1;
        this.filePath = paramString2;
        this.version = paramInt1;
        this.iCo = paramInt2;
        GMTrace.o(10606421737472L, 79024);
      }
    }
    
    public static enum b
    {
      public final int code;
      
      static
      {
        GMTrace.i(10606019084288L, 79021);
        iCp = new b("OK", 0, 0);
        iCq = new b("FAILED", 1, 101);
        iCr = new b("LOCAL_FILE_NOT_FOUND", 2, 102);
        iCs = new b("PKG_INTEGRITY_FAILED", 3, 104);
        iCt = new b("PKG_INVALID", 4, 105);
        iCu = new b("SEVER_FILE_NOT_FOUND", 5, 106);
        iCv = new b("ENV_ERR", 6, 200);
        iCw = new b[] { iCp, iCq, iCr, iCs, iCt, iCu, iCv };
        GMTrace.o(10606019084288L, 79021);
      }
      
      private b(int paramInt)
      {
        GMTrace.i(10605884866560L, 79020);
        this.code = paramInt;
        GMTrace.o(10605884866560L, 79020);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */