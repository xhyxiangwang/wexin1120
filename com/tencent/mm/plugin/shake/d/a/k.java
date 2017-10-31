package com.tencent.mm.plugin.shake.d.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.gr;
import com.tencent.mm.g.a.px;
import com.tencent.mm.g.a.px.a;
import com.tencent.mm.g.b.af;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.shake.ui.TVInfoUI;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;

public final class k
{
  public static void a(com.tencent.mm.plugin.shake.b.d paramd, Context paramContext, boolean paramBoolean)
  {
    int i = 3;
    GMTrace.i(6607538749440L, 49230);
    if (paramd == null)
    {
      GMTrace.o(6607538749440L, 49230);
      return;
    }
    switch (paramd.field_type)
    {
    }
    for (;;)
    {
      GMTrace.o(6607538749440L, 49230);
      return;
      Object localObject1 = new Intent();
      i = 18;
      if (paramBoolean) {
        i = 26;
      }
      ((Intent)localObject1).putExtra("geta8key_scene", i);
      ((Intent)localObject1).putExtra("stastic_scene", 6);
      ((Intent)localObject1).putExtra("KAppId", "wxaf060266bfa9a35c");
      Object localObject2 = new Bundle();
      ((Bundle)localObject2).putString("jsapi_args_appid", "wxaf060266bfa9a35c");
      ((Intent)localObject1).putExtra("jsapiargs", (Bundle)localObject2);
      ((Intent)localObject1).putExtra("rawUrl", paramd.field_username);
      ((Intent)localObject1).putExtra("srcUsername", paramd.field_distance);
      com.tencent.mm.plugin.shake.a.ifM.j((Intent)localObject1, paramContext);
      GMTrace.o(6607538749440L, 49230);
      return;
      localObject1 = paramd.field_username;
      ap.AS();
      localObject2 = c.yL().SL((String)localObject1);
      if (localObject2 != null)
      {
        Intent localIntent = new Intent();
        if ((com.tencent.mm.l.a.eE(((af)localObject2).field_type)) && (((com.tencent.mm.storage.x)localObject2).bPH()))
        {
          com.tencent.mm.ae.x.FE().in((String)localObject1);
          if (paramd.field_distance.equals("1"))
          {
            localIntent.putExtra("Chat_User", (String)localObject1);
            localIntent.putExtra("finish_direct", true);
            com.tencent.mm.plugin.shake.a.ifM.e(localIntent, paramContext);
            GMTrace.o(6607538749440L, 49230);
            return;
          }
        }
        localIntent.putExtra("Contact_User", (String)localObject1);
        localIntent.putExtra("force_get_contact", true);
        com.tencent.mm.bi.d.b(paramContext, "profile", ".ui.ContactInfoUI", localIntent);
        GMTrace.o(6607538749440L, 49230);
        return;
        localObject1 = new Intent();
        ((Intent)localObject1).setClass(paramContext, TVInfoUI.class);
        ((Intent)localObject1).putExtra("key_TV_xml_bytes", paramd.field_lvbuffer);
        ((Intent)localObject1).putExtra("key_TV_come_from_shake", true);
        paramContext.startActivity((Intent)localObject1);
        GMTrace.o(6607538749440L, 49230);
        return;
        localObject1 = new gr();
        ((gr)localObject1).fCS.actionCode = 11;
        ((gr)localObject1).fCS.result = paramd.field_username;
        ((gr)localObject1).fCS.context = paramContext;
        ((gr)localObject1).fwM = null;
        com.tencent.mm.sdk.b.a.uLm.a((b)localObject1, Looper.myLooper());
        GMTrace.o(6607538749440L, 49230);
        return;
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("key_product_id", paramd.field_username);
        ((Intent)localObject1).putExtra("key_product_scene", 9);
        com.tencent.mm.bi.d.b(paramContext, "product", ".ui.MallProductUI", (Intent)localObject1);
        GMTrace.o(6607538749440L, 49230);
        return;
        if (paramBoolean) {
          i = 4;
        }
        a(paramd.field_distance, paramd.field_username, i, paramContext);
        GMTrace.o(6607538749440L, 49230);
        return;
        paramContext = paramd.field_username;
        localObject1 = paramd.field_reserved3;
        i = paramd.field_reserved2;
        if (bg.mZ(paramContext))
        {
          w.i("Micromsg.ShakeTVLogic", "gotoAppBrand commField.app_brand_user_name is null");
          GMTrace.o(6607538749440L, 49230);
          return;
        }
        paramd = new px();
        paramd.fNL.userName = paramContext;
        paramd.fNL.fNN = bg.ap((String)localObject1, "");
        paramd.fNL.fNO = 0;
        paramd.fNL.scene = 1039;
        paramd.fNL.fNP = i;
        com.tencent.mm.sdk.b.a.uLm.m(paramd);
        w.i("Micromsg.ShakeTVLogic", "gotoAppBrand userName:%s, path:%s, scene:%d openType:%d version:%d", new Object[] { paramd.fNL.userName, paramd.fNL.fNN, Integer.valueOf(paramd.fNL.scene), Integer.valueOf(paramd.fNL.fNO), Integer.valueOf(paramd.fNL.fNP) });
      }
    }
  }
  
  public static void a(n paramn, Context paramContext, int paramInt)
  {
    GMTrace.i(6607941402624L, 49233);
    if (paramn == null)
    {
      GMTrace.o(6607941402624L, 49233);
      return;
    }
    if ((bg.mZ(paramn.field_username)) && (bg.mZ(paramn.field_deeplink)))
    {
      com.tencent.mm.plugin.report.service.g.paX.i(12108, new Object[] { bg.mY(paramn.field_username), Integer.valueOf(paramInt), Integer.valueOf(0) });
      GMTrace.o(6607941402624L, 49233);
      return;
    }
    a(paramn.field_username, paramn.field_deeplink, paramInt, paramContext);
    w.i("Micromsg.ShakeTVLogic", "doShakeTvHistoryItemClick start do nth");
    GMTrace.o(6607941402624L, 49233);
  }
  
  private static void a(String paramString1, String paramString2, int paramInt, Context paramContext)
  {
    GMTrace.i(6608075620352L, 49234);
    if (!bg.mZ(paramString2))
    {
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.addCategory("android.intent.category.BROWSABLE");
      localIntent.setData(Uri.parse(paramString2));
      int i = 16;
      if ((paramInt == 3) || (paramInt == 4)) {
        i = 17;
      }
      localIntent.putExtra("translate_link_scene", i);
      paramContext.startActivity(localIntent);
      w.i("Micromsg.ShakeTVLogic", "doShakeTvHistoryItemClick start tempsession open deeplink");
      com.tencent.mm.plugin.report.service.g.paX.i(12108, new Object[] { bg.mY(paramString1), Integer.valueOf(paramInt), Integer.valueOf(1) });
      GMTrace.o(6608075620352L, 49234);
      return;
    }
    GMTrace.o(6608075620352L, 49234);
  }
  
  public static boolean bdu()
  {
    GMTrace.i(6607807184896L, 49232);
    if (r.icf)
    {
      GMTrace.o(6607807184896L, 49232);
      return true;
    }
    String str = com.tencent.mm.k.g.uz().getValue("ShowShakeTV");
    w.d("Micromsg.ShakeTVLogic", "DynamicConfig Get ShowShakeTV: %s", new Object[] { str });
    if ((!bg.mZ(str)) && (str.equals("1")))
    {
      GMTrace.o(6607807184896L, 49232);
      return true;
    }
    GMTrace.o(6607807184896L, 49232);
    return false;
  }
  
  public static boolean tB(int paramInt)
  {
    GMTrace.i(6607672967168L, 49231);
    if ((7 == paramInt) || (6 == paramInt) || (8 == paramInt) || (9 == paramInt) || (10 == paramInt) || (12 == paramInt) || (13 == paramInt))
    {
      GMTrace.o(6607672967168L, 49231);
      return true;
    }
    GMTrace.o(6607672967168L, 49231);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/d/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */