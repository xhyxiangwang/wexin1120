package com.tencent.mm.plugin.appbrand.config;

import android.content.ContentValues;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bt.g;
import com.tencent.mm.g.a.kn;
import com.tencent.mm.plugin.appbrand.appcache.r;
import com.tencent.mm.plugin.appbrand.appcache.v;
import com.tencent.mm.plugin.appbrand.c.e;
import com.tencent.mm.protocal.c.cw;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public final class p
  extends j
{
  private static volatile p iJv;
  
  private p()
  {
    GMTrace.i(15532480790528L, 115726);
    GMTrace.o(15532480790528L, 115726);
  }
  
  public static p Up()
  {
    GMTrace.i(15532212355072L, 115724);
    if (iJv == null) {}
    try
    {
      if (iJv == null) {
        iJv = new p();
      }
      p localp = iJv;
      GMTrace.o(15532212355072L, 115724);
      return localp;
    }
    finally {}
  }
  
  public static e a(String paramString1, String paramString2, int paramInt, long paramLong)
  {
    GMTrace.i(15533017661440L, 115730);
    Object localObject = com.tencent.mm.plugin.appbrand.app.f.Sa().d(paramString2, new String[] { "appId", "nickname", "brandIconURL" });
    String str2 = String.valueOf(paramString1);
    String str1;
    if (localObject == null)
    {
      paramString1 = "";
      if (localObject != null) {
        break label120;
      }
      str1 = "";
      label59:
      if (localObject != null) {
        break label130;
      }
    }
    label120:
    label130:
    for (localObject = "";; localObject = ((WxaAttributes)localObject).field_brandIconURL)
    {
      paramString1 = new e(str2, paramString2, paramString1, str1, (String)localObject, paramInt, com.tencent.mm.plugin.appbrand.app.f.Sa().oW(paramString2), com.tencent.mm.plugin.appbrand.app.f.Sg().Z(paramString2, paramInt), paramLong);
      GMTrace.o(15533017661440L, 115730);
      return paramString1;
      paramString1 = ((WxaAttributes)localObject).field_appId;
      break;
      str1 = ((WxaAttributes)localObject).field_nickname;
      break label59;
    }
  }
  
  private static AppBrandSysConfig a(WxaAttributes paramWxaAttributes)
  {
    boolean bool2 = false;
    GMTrace.i(16160619757568L, 120406);
    Object localObject;
    if (paramWxaAttributes != null)
    {
      localObject = new AppBrandSysConfig();
      ((AppBrandSysConfig)localObject).ftu = paramWxaAttributes.field_username;
      ((AppBrandSysConfig)localObject).fxq = paramWxaAttributes.field_nickname;
      ((AppBrandSysConfig)localObject).iIF = paramWxaAttributes.field_brandIconURL;
      ((AppBrandSysConfig)localObject).appId = paramWxaAttributes.field_appId;
      ((AppBrandSysConfig)localObject).iIG = paramWxaAttributes.Uq().iJL;
      ((AppBrandSysConfig)localObject).iIK = paramWxaAttributes.Ur().iJP.iIK;
      ((AppBrandSysConfig)localObject).iIL = paramWxaAttributes.Ur().iJP.iIL;
      ((AppBrandSysConfig)localObject).iIO = paramWxaAttributes.Ur().iJP.iIO;
      ((AppBrandSysConfig)localObject).iIN = paramWxaAttributes.Ur().iJP.iIN;
      ((AppBrandSysConfig)localObject).iIM = paramWxaAttributes.Ur().iJP.iIM;
      ((AppBrandSysConfig)localObject).iIP = paramWxaAttributes.Ur().iJP.iJT;
      ((AppBrandSysConfig)localObject).iIQ = paramWxaAttributes.Ur().iJP.iJU;
      ((AppBrandSysConfig)localObject).iIT = ((ArrayList)SysConfigUtil.e(new ArrayList(), paramWxaAttributes.Uq().iJH));
      ((AppBrandSysConfig)localObject).iIU = ((ArrayList)SysConfigUtil.e(new ArrayList(), paramWxaAttributes.Uq().iJI));
      ((AppBrandSysConfig)localObject).iIW = ((ArrayList)SysConfigUtil.e(new ArrayList(), paramWxaAttributes.Uq().iJK));
      ((AppBrandSysConfig)localObject).iIV = ((ArrayList)SysConfigUtil.e(new ArrayList(), paramWxaAttributes.Uq().iJJ));
      ((AppBrandSysConfig)localObject).iJd = new cw();
      ((AppBrandSysConfig)localObject).iJd.two = paramWxaAttributes.Uq().iEI;
      ((AppBrandSysConfig)localObject).iJd.twv = paramWxaAttributes.Uq().iJF;
      ((AppBrandSysConfig)localObject).iIX = paramWxaAttributes.Ur().iJP.iIX;
      ((AppBrandSysConfig)localObject).iIY = paramWxaAttributes.Ur().iJP.iIY;
      ((AppBrandSysConfig)localObject).iIZ = paramWxaAttributes.Ur().iJP.iIZ;
      if (paramWxaAttributes.Us() != null)
      {
        ((AppBrandSysConfig)localObject).iJe = paramWxaAttributes.Us().iJW;
        ((AppBrandSysConfig)localObject).iJf = paramWxaAttributes.field_syncVersion;
      }
    }
    for (paramWxaAttributes = (WxaAttributes)localObject;; paramWxaAttributes = null)
    {
      if (paramWxaAttributes != null)
      {
        localObject = paramWxaAttributes.appId;
        if ((!bg.mZ((String)localObject)) && (com.tencent.mm.plugin.appbrand.app.f.Se() != null)) {
          break label556;
        }
      }
      label556:
      for (boolean bool1 = false;; bool1 = Boolean.parseBoolean(com.tencent.mm.plugin.appbrand.app.f.Se().get((String)localObject + "_AppDebugEnabled", "false")))
      {
        paramWxaAttributes.iIH = bool1;
        localObject = com.tencent.mm.plugin.appbrand.app.f.Sh().a(paramWxaAttributes.appId, 0, new String[] { "version", "downloadURL", "versionState" });
        if (localObject != null) {
          paramWxaAttributes.iJa.iCy = ((r)localObject).field_version;
        }
        localObject = com.tencent.mm.x.c.c.Cu().em("100216");
        bool1 = bool2;
        if (((com.tencent.mm.storage.c)localObject).isValid())
        {
          bool1 = bool2;
          if ("1".equals(((com.tencent.mm.storage.c)localObject).bPn().get("isOpenJSCore"))) {
            bool1 = true;
          }
        }
        paramWxaAttributes.iIR = bool1;
        paramWxaAttributes.iII = "1".equals(com.tencent.mm.plugin.appbrand.app.f.Se().get(paramWxaAttributes.appId + "_PerformancePanelEnabled", "0"));
        GMTrace.o(16160619757568L, 120406);
        return paramWxaAttributes;
        ((AppBrandSysConfig)localObject).iJe = -1;
        break;
      }
    }
  }
  
  public static boolean i(String paramString, int paramInt, boolean paramBoolean)
  {
    boolean bool = false;
    GMTrace.i(15532749225984L, 115728);
    Object localObject1 = com.tencent.mm.plugin.appbrand.app.f.Sa();
    if (bg.mZ(paramString))
    {
      GMTrace.o(15532749225984L, 115728);
      return false;
    }
    Object localObject2 = ((o)localObject1).d(paramString, new String[] { "appOpt" });
    if (localObject2 == null)
    {
      GMTrace.o(15532749225984L, 115728);
      return false;
    }
    int i = ((WxaAttributes)localObject2).field_appOpt;
    if (!paramBoolean) {}
    for (paramInt = i & (paramInt ^ 0xFFFFFFFF);; paramInt = i | paramInt)
    {
      localObject2 = new ContentValues(1);
      ((ContentValues)localObject2).put("appOpt", Integer.valueOf(paramInt));
      paramBoolean = bool;
      if (((o)localObject1).hhi.update("WxaAttributesTable", (ContentValues)localObject2, String.format("%s=?", new Object[] { "username" }), new String[] { paramString }) > 0) {
        paramBoolean = true;
      }
      if (paramBoolean)
      {
        localObject1 = new kn();
        ((kn)localObject1).fHS.ftu = paramString;
        ((kn)localObject1).fHS.fHT = paramInt;
        a.uLm.m((b)localObject1);
      }
      GMTrace.o(15532749225984L, 115728);
      return paramBoolean;
    }
  }
  
  public static long oW(String paramString)
  {
    GMTrace.i(15533420314624L, 115733);
    long l = com.tencent.mm.plugin.appbrand.app.f.Sa().oW(paramString);
    GMTrace.o(15533420314624L, 115733);
    return l;
  }
  
  public static s oX(String paramString)
  {
    GMTrace.i(15532883443712L, 115729);
    if (bg.mZ(paramString))
    {
      GMTrace.o(15532883443712L, 115729);
      return null;
    }
    WxaAttributes localWxaAttributes = com.tencent.mm.plugin.appbrand.app.f.Sa().d(paramString, new String[] { "appId", "nickname", "signature", "brandIconURL", "dynamicInfo", "versionInfo", "registerSource", "bindWxaInfo" });
    if (localWxaAttributes != null)
    {
      s locals = new s();
      locals.username = paramString;
      locals.appId = localWxaAttributes.field_appId;
      locals.fvS = localWxaAttributes.field_nickname;
      locals.signature = localWxaAttributes.field_signature;
      locals.iKa = localWxaAttributes.field_brandIconURL;
      locals.iJQ = localWxaAttributes.Ur().iJQ;
      int i;
      if (localWxaAttributes.Us() == null)
      {
        i = -1;
        locals.iJW = i;
        locals.iJD = localWxaAttributes.Ut();
      }
      for (;;)
      {
        try
        {
          if (!bg.mZ(localWxaAttributes.field_registerSource)) {
            continue;
          }
          paramString = "";
          locals.hpg = paramString;
        }
        catch (Exception paramString)
        {
          continue;
        }
        GMTrace.o(15532883443712L, 115729);
        return locals;
        i = localWxaAttributes.Us().iJW;
        break;
        paramString = new JSONObject(localWxaAttributes.field_registerSource).optString("RegisterBody", "");
      }
    }
    GMTrace.o(15532883443712L, 115729);
    return null;
  }
  
  public static AppBrandSysConfig oY(String paramString)
  {
    GMTrace.i(15533151879168L, 115731);
    paramString = com.tencent.mm.plugin.appbrand.app.f.Sa().e(paramString, new String[0]);
    if (paramString != null)
    {
      paramString = a(paramString);
      GMTrace.o(15533151879168L, 115731);
      return paramString;
    }
    GMTrace.o(15533151879168L, 115731);
    return null;
  }
  
  public static AppBrandSysConfig oZ(String paramString)
  {
    GMTrace.i(15533286096896L, 115732);
    if ((bg.mZ(paramString)) || (!paramString.endsWith("@app")))
    {
      GMTrace.o(15533286096896L, 115732);
      return null;
    }
    paramString = com.tencent.mm.plugin.appbrand.app.f.Sa().d(paramString, new String[0]);
    if (paramString != null)
    {
      paramString = a(paramString);
      GMTrace.o(15533286096896L, 115732);
      return paramString;
    }
    GMTrace.o(15533286096896L, 115732);
    return null;
  }
  
  public static String[] pa(String paramString)
  {
    GMTrace.i(15533554532352L, 115734);
    if (bg.mZ(paramString))
    {
      GMTrace.o(15533554532352L, 115734);
      return null;
    }
    Object localObject = com.tencent.mm.plugin.appbrand.app.f.Sa().d(paramString, new String[] { "roundedSquareIconURL", "bigHeadURL" });
    if (localObject == null)
    {
      GMTrace.o(15533554532352L, 115734);
      return null;
    }
    paramString = ((WxaAttributes)localObject).field_roundedSquareIconURL;
    localObject = ((WxaAttributes)localObject).field_bigHeadURL;
    GMTrace.o(15533554532352L, 115734);
    return new String[] { paramString, localObject };
  }
  
  public static String pb(String paramString)
  {
    GMTrace.i(15533688750080L, 115735);
    if (bg.mZ(paramString))
    {
      GMTrace.o(15533688750080L, 115735);
      return null;
    }
    paramString = com.tencent.mm.plugin.appbrand.app.f.Sa().d(paramString, new String[] { "appId" });
    if (paramString == null)
    {
      GMTrace.o(15533688750080L, 115735);
      return null;
    }
    paramString = paramString.field_appId;
    GMTrace.o(15533688750080L, 115735);
    return paramString;
  }
  
  public static String pc(String paramString)
  {
    GMTrace.i(15533822967808L, 115736);
    if (bg.mZ(paramString))
    {
      GMTrace.o(15533822967808L, 115736);
      return null;
    }
    paramString = com.tencent.mm.plugin.appbrand.app.f.Sa().e(paramString, new String[] { "nickname" });
    if (paramString == null)
    {
      GMTrace.o(15533822967808L, 115736);
      return null;
    }
    paramString = paramString.field_nickname;
    GMTrace.o(15533822967808L, 115736);
    return paramString;
  }
  
  public static String pd(String paramString)
  {
    GMTrace.i(15533957185536L, 115737);
    if (bg.mZ(paramString))
    {
      GMTrace.o(15533957185536L, 115737);
      return null;
    }
    paramString = com.tencent.mm.plugin.appbrand.app.f.Sa().e(paramString, new String[] { "username" });
    if (paramString == null)
    {
      GMTrace.o(15533957185536L, 115737);
      return null;
    }
    paramString = paramString.field_username;
    GMTrace.o(15533957185536L, 115737);
    return paramString;
  }
  
  public static void pe(String paramString)
  {
    GMTrace.i(15534225620992L, 115739);
    if (bg.mZ(paramString))
    {
      GMTrace.o(15534225620992L, 115739);
      return;
    }
    o localo = com.tencent.mm.plugin.appbrand.app.f.Sa();
    if (!bg.mZ(paramString))
    {
      ContentValues localContentValues = new ContentValues(2);
      localContentValues.put("syncVersion", "");
      localContentValues.put("syncTimeSecond", Long.valueOf(0L));
      localo.hhi.update("WxaAttributesTable", localContentValues, String.format(Locale.US, "%s=?", new Object[] { "username" }), new String[] { paramString });
    }
    GMTrace.o(15534225620992L, 115739);
  }
  
  public static void pf(String paramString)
  {
    GMTrace.i(15534359838720L, 115740);
    if (bg.mZ(paramString))
    {
      GMTrace.o(15534359838720L, 115740);
      return;
    }
    WxaAttributes localWxaAttributes = new WxaAttributes();
    localWxaAttributes.field_username = paramString;
    com.tencent.mm.plugin.appbrand.app.f.Sa().a(localWxaAttributes, new String[] { "username" });
    GMTrace.o(15534359838720L, 115740);
  }
  
  public static void release()
  {
    GMTrace.i(15532346572800L, 115725);
    try
    {
      iJv = null;
      GMTrace.o(15532346572800L, 115725);
      return;
    }
    finally {}
  }
  
  public final void c(j.a parama)
  {
    GMTrace.i(15532615008256L, 115727);
    super.a(parama, com.tencent.mm.plugin.appbrand.o.d.xC().nTP.getLooper());
    GMTrace.o(15532615008256L, 115727);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */