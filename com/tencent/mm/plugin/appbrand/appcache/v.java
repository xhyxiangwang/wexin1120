package com.tencent.mm.plugin.appbrand.appcache;

import android.annotation.SuppressLint;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bt.g;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.d;
import com.tencent.mm.protocal.c.bss;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public final class v
{
  public static final String[] iCi;
  public final g iCj;
  public final a iCk;
  
  static
  {
    GMTrace.i(10599576633344L, 78973);
    iCi = new String[] { i.a(r.iBQ, "AppBrandWxaPkgManifestRecord") };
    GMTrace.o(10599576633344L, 78973);
  }
  
  public v(g paramg)
  {
    GMTrace.i(10597831802880L, 78960);
    this.iCj = paramg;
    this.iCk = new a(paramg);
    GMTrace.o(10597831802880L, 78960);
  }
  
  private boolean b(r paramr)
  {
    GMTrace.i(10598905544704L, 78968);
    boolean bool = this.iCk.b(paramr);
    GMTrace.o(10598905544704L, 78968);
    return bool;
  }
  
  private boolean c(r paramr)
  {
    GMTrace.i(10599173980160L, 78970);
    boolean bool = this.iCk.c(paramr, r.iBP);
    GMTrace.o(10599173980160L, 78970);
    return bool;
  }
  
  public final int U(String paramString, int paramInt)
  {
    int i = 0;
    GMTrace.i(10598234456064L, 78963);
    String str = String.format(Locale.US, "select count(%s) from %s where %s=? and %s=?", new Object[] { "version", "AppBrandWxaPkgManifestRecord", "appId", "debugType" });
    paramString = this.iCj.a(str, new String[] { paramString, String.valueOf(paramInt) }, 2);
    if (paramString == null)
    {
      GMTrace.o(10598234456064L, 78963);
      return 0;
    }
    paramInt = i;
    if (paramString.moveToFirst()) {
      paramInt = paramString.getInt(0);
    }
    paramString.close();
    GMTrace.o(10598234456064L, 78963);
    return paramInt;
  }
  
  public final String V(String paramString, int paramInt)
  {
    GMTrace.i(17653657763840L, 131530);
    paramString = a(paramString, paramInt, new String[] { "downloadURL" });
    if (paramString == null)
    {
      GMTrace.o(17653657763840L, 131530);
      return "";
    }
    paramString = paramString.field_downloadURL;
    GMTrace.o(17653657763840L, 131530);
    return paramString;
  }
  
  public final void W(String paramString, int paramInt)
  {
    GMTrace.i(10599442415616L, 78972);
    if (bg.mZ(paramString))
    {
      GMTrace.o(10599442415616L, 78972);
      return;
    }
    String str = String.format("%s=? and %s=?", new Object[] { "appId", "debugType" });
    String[] arrayOfString = new String[2];
    arrayOfString[0] = paramString;
    arrayOfString[1] = String.valueOf(paramInt);
    paramString = this.iCj.a("AppBrandWxaPkgManifestRecord", new String[] { "pkgPath" }, str, arrayOfString, null, null, null, 2);
    if (paramString == null)
    {
      GMTrace.o(10599442415616L, 78972);
      return;
    }
    if (!paramString.moveToFirst())
    {
      paramString.close();
      GMTrace.o(10599442415616L, 78972);
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    do
    {
      localLinkedList.add(paramString.getString(0));
    } while (paramString.moveToNext());
    paramString.close();
    paramString = localLinkedList.iterator();
    while (paramString.hasNext()) {
      b.deleteFile((String)paramString.next());
    }
    this.iCj.delete("AppBrandWxaPkgManifestRecord", str, arrayOfString);
    GMTrace.o(10599442415616L, 78972);
  }
  
  final r a(String paramString, int paramInt1, int paramInt2, String... paramVarArgs)
  {
    GMTrace.i(16161156628480L, 120410);
    String str1 = "";
    Object localObject = r.iBP;
    int j = localObject.length;
    int i = 0;
    while (i < j)
    {
      String str2 = localObject[i];
      str1 = str1 + str2 + "=? and ";
      i += 1;
    }
    str1 = str1 + "1=1";
    localObject = this.iCj;
    if (bg.D(paramVarArgs)) {
      paramVarArgs = null;
    }
    for (;;)
    {
      paramVarArgs = ((g)localObject).a("AppBrandWxaPkgManifestRecord", paramVarArgs, str1, new String[] { paramString, String.valueOf(paramInt1), String.valueOf(paramInt2) }, null, null, null, 2);
      if (paramVarArgs != null) {
        break;
      }
      GMTrace.o(16161156628480L, 120410);
      return null;
    }
    paramString = null;
    if (paramVarArgs.moveToFirst())
    {
      paramString = new r();
      paramString.b(paramVarArgs);
    }
    paramVarArgs.close();
    GMTrace.o(16161156628480L, 120410);
    return paramString;
  }
  
  public final r a(String paramString, int paramInt, String... paramVarArgs)
  {
    GMTrace.i(10597966020608L, 78961);
    if (bg.mZ(paramString))
    {
      GMTrace.o(10597966020608L, 78961);
      return null;
    }
    Object localObject;
    g localg;
    if (c.a.hK(paramInt))
    {
      localObject = "version desc";
      localg = this.iCj;
      if (!bg.D(paramVarArgs)) {
        break label155;
      }
      paramVarArgs = null;
    }
    label155:
    for (;;)
    {
      localObject = localg.query("AppBrandWxaPkgManifestRecord", paramVarArgs, String.format(Locale.US, "%s=? and %s=?", new Object[] { "appId", "debugType" }), new String[] { paramString, String.valueOf(paramInt) }, null, null, (String)localObject);
      if (localObject != null) {
        break label158;
      }
      GMTrace.o(10597966020608L, 78961);
      return null;
      if (c.a.fx(paramInt))
      {
        localObject = "createTime desc";
        break;
      }
      throw new RuntimeException("Illegal pkgType " + paramInt);
    }
    label158:
    paramVarArgs = null;
    if (((Cursor)localObject).moveToFirst())
    {
      paramVarArgs = new r();
      paramVarArgs.b((Cursor)localObject);
      paramVarArgs.field_appId = paramString;
      paramVarArgs.field_debugType = paramInt;
    }
    ((Cursor)localObject).close();
    GMTrace.o(10597966020608L, 78961);
    return paramVarArgs;
  }
  
  public final boolean a(r paramr)
  {
    GMTrace.i(18188649627648L, 135516);
    if ((!bg.mZ(paramr.field_appId)) && (this.iCk.a(paramr, r.iBP)))
    {
      GMTrace.o(18188649627648L, 135516);
      return true;
    }
    GMTrace.o(18188649627648L, 135516);
    return false;
  }
  
  final boolean a(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3)
  {
    GMTrace.i(16161022410752L, 120409);
    if (!c.a.hK(paramInt1))
    {
      GMTrace.o(16161022410752L, 120409);
      return false;
    }
    r localr = a(paramString1, paramInt1, new String[] { "version" });
    if (localr == null) {}
    for (int i = 0; paramInt2 < i; i = localr.field_version)
    {
      w.i("MicroMsg.AppBrandWxaPkgStorage", "flushWxaPkgVersionInfo, newVersion( %d ) < curMaxVersion( %d ), skip", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(i) });
      GMTrace.o(16161022410752L, 120409);
      return false;
    }
    if (("@LibraryAppId".equals(paramString1)) && (paramInt2 == 63))
    {
      w.i("MicroMsg.AppBrandWxaPkgStorage", "flushWxaPkgVersionInfo, given version == local library version %d, skip", new Object[] { Integer.valueOf(63) });
      GMTrace.o(16161022410752L, 120409);
      return false;
    }
    localr = a(paramString1, paramInt2, paramInt1, new String[0]);
    boolean bool1 = false;
    if (localr == null)
    {
      localr = new r();
      localr.field_appId = paramString1;
      localr.field_version = paramInt2;
      localr.field_versionMd5 = paramString2;
      localr.field_downloadURL = paramString3;
      localr.field_debugType = paramInt1;
      bool1 = b(localr);
      w.i("MicroMsg.AppBrandWxaPkgStorage", "flushWxaPkgVersionInfo, insert record %b, version %d, url %s, md5 %s", new Object[] { Boolean.valueOf(bool1), Integer.valueOf(localr.field_version), localr.field_downloadURL, localr.field_versionMd5 });
      GMTrace.o(16161022410752L, 120409);
      return bool1;
    }
    paramString1 = localr.field_downloadURL;
    String str = localr.field_versionMd5;
    if (!bg.mY(localr.field_versionMd5).equals(paramString2))
    {
      localr.field_versionMd5 = paramString2;
      localr.field_version = paramInt2;
      localr.field_downloadURL = paramString3;
      paramInt1 = 1;
    }
    for (;;)
    {
      if (paramInt1 != 0) {
        bool1 = c(localr);
      }
      if ((paramInt1 != 0) && (bool1)) {}
      for (boolean bool2 = true;; bool2 = false)
      {
        w.i("MicroMsg.AppBrandWxaPkgStorage", "flushWxaPkgVersionInfo, update record %b, oldVersion %d, newVersion %d, oldURL %s, newURL %s, oldMd5 %s, newMd5 %s", new Object[] { Boolean.valueOf(bool2), Integer.valueOf(i), Integer.valueOf(paramInt2), paramString1, paramString3, str, paramString2 });
        if ((paramInt1 == 0) || (!bool1)) {
          break label476;
        }
        GMTrace.o(16161022410752L, 120409);
        return true;
        if ((bg.mZ(paramString3)) || (paramString3.equals(localr.field_downloadURL))) {
          break label487;
        }
        localr.field_downloadURL = paramString3;
        paramInt1 = 1;
        break;
      }
      label476:
      GMTrace.o(16161022410752L, 120409);
      return false;
      label487:
      paramInt1 = 0;
    }
  }
  
  public final boolean a(String paramString1, int paramInt, String paramString2, String paramString3, long paramLong1, long paramLong2)
  {
    GMTrace.i(10598502891520L, 78965);
    if ((bg.mZ(paramString1)) || (bg.mZ(paramString2)))
    {
      w.e("MicroMsg.AppBrandWxaPkgStorage", "flushWxaDebugAppVersionInfo, null or nil appId = %s, url = %s", new Object[] { paramString1, paramString2 });
      GMTrace.o(10598502891520L, 78965);
      return false;
    }
    if (paramInt == 999) {
      paramString1 = "@LibraryAppId";
    }
    r localr = a(paramString1, 1, paramInt, new String[0]);
    if (localr == null)
    {
      localr = new r();
      localr.field_appId = paramString1;
      localr.field_version = 1;
      localr.field_debugType = paramInt;
      localr.field_downloadURL = paramString2;
      localr.field_versionMd5 = paramString3;
      localr.field_versionState = 0;
      localr.field_startTime = paramLong1;
      localr.field_endTime = paramLong2;
      localr.field_createTime = bg.Po();
      b(localr);
      GMTrace.o(10598502891520L, 78965);
      return true;
    }
    if ((!bg.mZ(paramString3)) && (!bg.mZ(localr.field_versionMd5)) && (!paramString3.equals(localr.field_versionMd5)))
    {
      paramInt = 1;
      if (paramString2.equals(localr.field_downloadURL)) {
        break label296;
      }
    }
    label296:
    for (int i = 1;; i = 0)
    {
      if (paramInt == 0) {
        break label302;
      }
      localr.field_downloadURL = paramString2;
      b.deleteFile(localr.field_pkgPath);
      localr.field_pkgPath = null;
      localr.field_createTime = bg.Po();
      localr.field_versionMd5 = paramString3;
      localr.field_startTime = paramLong1;
      localr.field_endTime = paramLong2;
      c(localr);
      GMTrace.o(10598502891520L, 78965);
      return true;
      paramInt = 0;
      break;
    }
    label302:
    if (i != 0)
    {
      localr.field_downloadURL = paramString2;
      localr.field_startTime = paramLong1;
      localr.field_endTime = paramLong2;
      c(localr);
      GMTrace.o(10598502891520L, 78965);
      return false;
    }
    GMTrace.o(10598502891520L, 78965);
    return false;
  }
  
  public final boolean a(String paramString, WxaAttributes.d paramd)
  {
    GMTrace.i(17653926199296L, 131532);
    if ((bg.mZ(paramString)) || (paramd == null))
    {
      w.e("MicroMsg.AppBrandWxaPkgStorage", "flushWxaAppVersionInfoV2, args invalid appId = %s, vInfo = %s", new Object[] { paramString, paramd });
      GMTrace.o(17653926199296L, 131532);
      return false;
    }
    boolean bool = a(paramString, 0, paramd.fNP, paramd.iAB, null);
    GMTrace.o(17653926199296L, 131532);
    return bool;
  }
  
  public final boolean a(String paramString, bss parambss, int paramInt)
  {
    GMTrace.i(17653791981568L, 131531);
    if (bg.mZ(paramString))
    {
      w.e("MicroMsg.AppBrandWxaPkgStorage", "flushWxaAppVersionInfo, args invalid appId = %s, vInfo = %s", new Object[] { paramString, parambss });
      GMTrace.o(17653791981568L, 131531);
      return false;
    }
    boolean bool = a(paramString, paramInt, parambss.tAS, parambss.uHC, parambss.uHD);
    GMTrace.o(17653791981568L, 131531);
    return bool;
  }
  
  public final void d(r paramr)
  {
    GMTrace.i(19994817593344L, 148973);
    this.iCk.a(paramr);
    GMTrace.o(19994817593344L, 148973);
  }
  
  public final void d(List<String> paramList, List<Integer> paramList1)
  {
    GMTrace.i(10599308197888L, 78971);
    if ((paramList.size() <= 0) || (paramList1.size() <= 0) || (paramList.size() != paramList1.size()))
    {
      GMTrace.o(10599308197888L, 78971);
      return;
    }
    long l = this.iCj.cA(Thread.currentThread().getId());
    int i = 0;
    while (i < paramList.size())
    {
      W((String)paramList.get(i), ((Integer)paramList1.get(i)).intValue());
      i += 1;
    }
    this.iCj.aJ(l);
    GMTrace.o(10599308197888L, 78971);
  }
  
  public final int[] od(String paramString)
  {
    Object localObject1 = null;
    GMTrace.i(16341813690368L, 121756);
    if (bg.mZ(paramString))
    {
      GMTrace.o(16341813690368L, 121756);
      return null;
    }
    if (!c.a.hK(0))
    {
      GMTrace.o(16341813690368L, 121756);
      return null;
    }
    Object localObject2 = this.iCj;
    String str = String.format(Locale.US, "%s=? and %s=? ", new Object[] { "appId", "debugType" });
    localObject2 = ((g)localObject2).a("AppBrandWxaPkgManifestRecord", new String[] { "version" }, str, new String[] { paramString, "0" }, null, null, "version desc", 2);
    if (localObject2 == null)
    {
      GMTrace.o(16341813690368L, 121756);
      return null;
    }
    paramString = (String)localObject1;
    int i;
    if (((Cursor)localObject2).moveToFirst())
    {
      paramString = new int[((Cursor)localObject2).getCount()];
      i = 0;
    }
    for (;;)
    {
      paramString[i] = ((Cursor)localObject2).getInt(0);
      if (!((Cursor)localObject2).moveToNext())
      {
        ((Cursor)localObject2).close();
        GMTrace.o(16341813690368L, 121756);
        return paramString;
      }
      i += 1;
    }
  }
  
  @SuppressLint({"DefaultLocale"})
  final List<r> q(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(10598368673792L, 78964);
    if (bg.mZ(paramString))
    {
      GMTrace.o(10598368673792L, 78964);
      return null;
    }
    if (c.a.hK(0)) {}
    Object localObject3;
    for (Object localObject1 = String.format("order by %s desc", new Object[] { "version" });; localObject1 = String.format("order by %s desc", new Object[] { "createTime" }))
    {
      localObject3 = String.format("limit %d offset %d", new Object[] { Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(2) });
      localObject2 = this.iCj;
      localObject1 = String.format("%s=? and %s=? %s %s", new Object[] { "appId", "debugType", localObject1, localObject3 });
      localObject1 = ((g)localObject2).a("AppBrandWxaPkgManifestRecord", new String[] { "pkgPath", "version" }, (String)localObject1, new String[] { paramString, "0" }, null, null, null, 2);
      if (localObject1 != null) {
        break;
      }
      GMTrace.o(10598368673792L, 78964);
      return null;
    }
    Object localObject2 = new ArrayList();
    if (((Cursor)localObject1).moveToFirst()) {
      do
      {
        localObject3 = new r();
        ((r)localObject3).field_appId = paramString;
        ((r)localObject3).field_debugType = 0;
        ((r)localObject3).b((Cursor)localObject1);
        ((List)localObject2).add(localObject3);
      } while (((Cursor)localObject1).moveToNext());
    }
    ((Cursor)localObject1).close();
    GMTrace.o(10598368673792L, 78964);
    return (List<r>)localObject2;
  }
  
  private static final class a
    extends i<r>
  {
    a(e parame)
    {
      super(r.iBQ, "AppBrandWxaPkgManifestRecord", r.fSf);
      GMTrace.i(10617159155712L, 79104);
      GMTrace.o(10617159155712L, 79104);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */