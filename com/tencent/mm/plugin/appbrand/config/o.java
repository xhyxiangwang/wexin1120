package com.tencent.mm.plugin.appbrand.config;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ab.n;
import com.tencent.mm.bl.b;
import com.tencent.mm.bt.g;
import com.tencent.mm.g.b.af;
import com.tencent.mm.platformtools.c;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appcache.v;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.cq;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

public final class o
  extends com.tencent.mm.sdk.e.i<WxaAttributes>
{
  public final g hhi;
  
  public o(g paramg)
  {
    super(paramg, WxaAttributes.iAU, "WxaAttributesTable", WxaAttributes.fSf);
    GMTrace.i(15534494056448L, 115741);
    this.hhi = paramg;
    GMTrace.o(15534494056448L, 115741);
  }
  
  private static boolean a(WxaAttributes paramWxaAttributes, bsu parambsu)
  {
    GMTrace.i(15535433580544L, 115748);
    if (("NickName".equals(parambsu.tBb)) && (!aQ(parambsu.paD, paramWxaAttributes.field_nickname)))
    {
      paramWxaAttributes.field_nickname = parambsu.paD;
      GMTrace.o(15535433580544L, 115748);
      return true;
    }
    if (("BrandIconURL".equals(parambsu.tBb)) && (!aQ(parambsu.paD, paramWxaAttributes.field_brandIconURL)))
    {
      paramWxaAttributes.field_brandIconURL = parambsu.paD;
      GMTrace.o(15535433580544L, 115748);
      return true;
    }
    if (("BigHeadImgUrl".equals(parambsu.tBb)) && (!aQ(parambsu.paD, paramWxaAttributes.field_bigHeadURL)))
    {
      paramWxaAttributes.field_bigHeadURL = parambsu.paD;
      GMTrace.o(15535433580544L, 115748);
      return true;
    }
    if (("SmallHeadImgUrl".equals(parambsu.tBb)) && (!aQ(parambsu.paD, paramWxaAttributes.field_smallHeadURL)))
    {
      paramWxaAttributes.field_smallHeadURL = parambsu.paD;
      GMTrace.o(15535433580544L, 115748);
      return true;
    }
    if (("Signature".equals(parambsu.tBb)) && (!aQ(parambsu.paD, paramWxaAttributes.field_signature)))
    {
      paramWxaAttributes.field_signature = parambsu.paD;
      GMTrace.o(15535433580544L, 115748);
      return true;
    }
    if ("WxAppOpt".equals(parambsu.tBb))
    {
      int i = bg.getInt(parambsu.paD, 0);
      if (i != paramWxaAttributes.field_appOpt)
      {
        paramWxaAttributes.field_appOpt = i;
        GMTrace.o(15535433580544L, 115748);
        return true;
      }
    }
    if (("RegisterSource".equals(parambsu.tBb)) && (!aQ(parambsu.paD, paramWxaAttributes.field_registerSource)))
    {
      paramWxaAttributes.field_registerSource = parambsu.paD;
      GMTrace.o(15535433580544L, 115748);
      return true;
    }
    if (("WxaAppInfo".equals(parambsu.tBb)) && (!aQ(parambsu.paD, paramWxaAttributes.field_appInfo))) {
      paramWxaAttributes.field_appInfo = parambsu.paD;
    }
    try
    {
      parambsu = new JSONObject(parambsu.paD);
      paramWxaAttributes.field_appId = parambsu.getString("Appid");
      parambsu = SysConfigUtil.g(parambsu);
      k.a(paramWxaAttributes.field_appId, parambsu.tvV);
      GMTrace.o(15535433580544L, 115748);
      return true;
      if (("WxaAppVersionInfo".equalsIgnoreCase(parambsu.tBb)) && (!aQ(parambsu.paD, paramWxaAttributes.field_versionInfo)))
      {
        paramWxaAttributes.field_versionInfo = parambsu.paD;
        GMTrace.o(15535433580544L, 115748);
        return true;
      }
      if (("BindWxaInfo".equals(parambsu.tBb)) && (!aQ(parambsu.paD, paramWxaAttributes.field_bindWxaInfo)))
      {
        paramWxaAttributes.field_bindWxaInfo = parambsu.paD;
        GMTrace.o(15535433580544L, 115748);
        return true;
      }
      if (("WxaAppDynamic".equals(parambsu.tBb)) && (!aQ(parambsu.paD, paramWxaAttributes.field_dynamicInfo)))
      {
        paramWxaAttributes.field_dynamicInfo = parambsu.paD;
        GMTrace.o(15535433580544L, 115748);
        return true;
      }
      if (("MMBizMenu".equals(parambsu.tBb)) && (!aQ(parambsu.paD, paramWxaAttributes.field_bizMenu)))
      {
        paramWxaAttributes.field_bizMenu = parambsu.paD;
        GMTrace.o(15535433580544L, 115748);
        return true;
      }
      GMTrace.o(15535433580544L, 115748);
      return false;
    }
    catch (Exception paramWxaAttributes)
    {
      for (;;) {}
    }
  }
  
  private boolean a(WxaAttributes paramWxaAttributes, String... paramVarArgs)
  {
    GMTrace.i(15535702016000L, 115750);
    int i;
    if (!bg.D(paramVarArgs)) {
      i = 0;
    }
    for (;;)
    {
      if (i < paramVarArgs.length)
      {
        if (paramVarArgs[i].equals("username"))
        {
          paramVarArgs[i] = "usernameHash";
          paramWxaAttributes.field_usernameHash = paramWxaAttributes.field_username.hashCode();
        }
      }
      else
      {
        boolean bool = super.b(paramWxaAttributes, paramVarArgs);
        GMTrace.o(15535702016000L, 115750);
        return bool;
      }
      i += 1;
    }
  }
  
  private static boolean aQ(String paramString1, String paramString2)
  {
    GMTrace.i(15535567798272L, 115749);
    boolean bool = bg.mY(paramString1).equals(bg.mY(paramString2));
    GMTrace.o(15535567798272L, 115749);
    return bool;
  }
  
  final long Uo()
  {
    GMTrace.i(15534628274176L, 115742);
    long l = this.hhi.cA(Thread.currentThread().getId());
    GMTrace.o(15534628274176L, 115742);
    return l;
  }
  
  final boolean a(String paramString, b paramb, List<bsu> paramList)
  {
    GMTrace.i(15535299362816L, 115747);
    if (bg.bX(paramList))
    {
      GMTrace.o(15535299362816L, 115747);
      return false;
    }
    WxaAttributes localWxaAttributes = new WxaAttributes();
    localWxaAttributes.field_username = paramString;
    if (!a(localWxaAttributes, new String[] { "username" })) {}
    boolean bool;
    for (int i = 1;; i = 0)
    {
      paramString = paramList.iterator();
      bool = false;
      while (paramString.hasNext())
      {
        paramList = (bsu)paramString.next();
        if (paramList != null) {
          bool = a(localWxaAttributes, paramList) | bool;
        }
      }
    }
    if (bool)
    {
      if (i == 0) {
        break label460;
      }
      b(localWxaAttributes);
    }
    for (;;)
    {
      try
      {
        if (com.tencent.mm.kernel.h.xx().wM())
        {
          String str1 = localWxaAttributes.field_username;
          String str2 = localWxaAttributes.field_nickname;
          String str3 = localWxaAttributes.field_bigHeadURL;
          String str4 = localWxaAttributes.field_smallHeadURL;
          paramList = n.Di().hQ(str1);
          i = 0;
          paramString = paramList;
          if (paramList == null)
          {
            paramString = new com.tencent.mm.ab.h();
            i = 1;
          }
          if (!bg.mY(str4).equals(paramString.Dp()))
          {
            paramString.hll = str4;
            i = 1;
          }
          if (!bg.mY(str3).equals(paramString.Do()))
          {
            paramString.hlm = str3;
            i = 1;
          }
          if (i != 0)
          {
            paramString.username = str1;
            paramString.bf(true);
            paramString.fJg = 31;
            n.Di().a(paramString);
          }
          paramList = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yL().SL(str1);
          i = 0;
          paramString = paramList;
          if (paramList == null) {
            paramString = new x();
          }
          if ((int)paramString.gLS == 0)
          {
            paramString.setUsername(str1);
            i = 1;
          }
          if (!str2.equals(paramString.field_nickname))
          {
            paramString.cg(str2);
            paramString.ch(c.mP(str2));
            paramString.ci(c.mO(str2));
            i = 1;
          }
          if (i != 0) {
            ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yL().P(paramString);
          }
        }
      }
      catch (Exception paramString)
      {
        label460:
        w.printErrStackTrace("MicroMsg.WxaAttrStorage", paramString, "flushContactInMainDB", new Object[0]);
        continue;
      }
      f.Sh().a(localWxaAttributes.field_appId, localWxaAttributes.Us());
      localWxaAttributes.field_syncTimeSecond = bg.Po();
      localWxaAttributes.field_syncVersion = bg.br(paramb.toK);
      c(localWxaAttributes, new String[] { "username" });
      GMTrace.o(15535299362816L, 115747);
      return bool;
      c(localWxaAttributes, new String[] { "username" });
    }
  }
  
  final int aJ(long paramLong)
  {
    GMTrace.i(15534762491904L, 115743);
    int i = this.hhi.aJ(paramLong);
    GMTrace.o(15534762491904L, 115743);
    return i;
  }
  
  public final WxaAttributes d(String paramString, String... paramVarArgs)
  {
    Object localObject1 = null;
    GMTrace.i(15534896709632L, 115744);
    if (bg.mZ(paramString))
    {
      GMTrace.o(15534896709632L, 115744);
      return null;
    }
    if (!paramString.endsWith("@app"))
    {
      GMTrace.o(15534896709632L, 115744);
      return null;
    }
    Object localObject2 = this.hhi;
    if (bg.D(paramVarArgs)) {
      paramVarArgs = null;
    }
    for (;;)
    {
      localObject2 = ((g)localObject2).a("WxaAttributesTable", paramVarArgs, String.format(Locale.US, "%s=?", new Object[] { "usernameHash" }), new String[] { String.valueOf(paramString.hashCode()) }, null, null, null, 2);
      if (localObject2 != null) {
        break;
      }
      GMTrace.o(15534896709632L, 115744);
      return null;
    }
    paramVarArgs = (String[])localObject1;
    if (((Cursor)localObject2).moveToFirst())
    {
      paramVarArgs = new WxaAttributes();
      paramVarArgs.b((Cursor)localObject2);
      paramVarArgs.field_username = paramString;
    }
    ((Cursor)localObject2).close();
    GMTrace.o(15534896709632L, 115744);
    return paramVarArgs;
  }
  
  public final WxaAttributes e(String paramString, String... paramVarArgs)
  {
    Object localObject1 = null;
    GMTrace.i(15535030927360L, 115745);
    if (bg.mZ(paramString))
    {
      GMTrace.o(15535030927360L, 115745);
      return null;
    }
    Object localObject2 = this.hhi;
    if (bg.D(paramVarArgs)) {
      paramVarArgs = null;
    }
    for (;;)
    {
      localObject2 = ((g)localObject2).a("WxaAttributesTable", paramVarArgs, String.format(Locale.US, "%s=?", new Object[] { "appId" }), new String[] { paramString }, null, null, null, 2);
      if (localObject2 != null) {
        break;
      }
      GMTrace.o(15535030927360L, 115745);
      return null;
    }
    paramVarArgs = (String[])localObject1;
    if (((Cursor)localObject2).moveToFirst())
    {
      paramVarArgs = new WxaAttributes();
      paramVarArgs.b((Cursor)localObject2);
      paramVarArgs.field_appId = paramString;
    }
    ((Cursor)localObject2).close();
    GMTrace.o(15535030927360L, 115745);
    return paramVarArgs;
  }
  
  final long oW(String paramString)
  {
    GMTrace.i(15535165145088L, 115746);
    paramString = d(paramString, new String[] { "appInfo" });
    if ((paramString == null) || (paramString.Uq() == null))
    {
      GMTrace.o(15535165145088L, 115746);
      return 0L;
    }
    long l = paramString.Uq().iEI;
    GMTrace.o(15535165145088L, 115746);
    return l;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */