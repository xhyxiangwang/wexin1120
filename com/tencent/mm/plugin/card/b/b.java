package com.tencent.mm.plugin.card.b;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bi.d;
import com.tencent.mm.g.a.px;
import com.tencent.mm.g.a.px.a;
import com.tencent.mm.plugin.card.ui.CardNewMsgUI;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.protocal.c.jf;
import com.tencent.mm.protocal.c.nc;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.x.o;

public final class b
{
  public static void P(Context paramContext, String paramString)
  {
    GMTrace.i(5052760588288L, 37646);
    if (TextUtils.isEmpty(paramString))
    {
      w.v("MicroMsg.CardActivityHelper", "username is null");
      GMTrace.o(5052760588288L, 37646);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("Contact_User", paramString);
    localIntent.putExtra("force_get_contact", true);
    com.tencent.mm.plugin.card.a.ifM.d(localIntent, paramContext);
    GMTrace.o(5052760588288L, 37646);
  }
  
  public static void Q(Context paramContext, String paramString)
  {
    GMTrace.i(5052894806016L, 37647);
    if (TextUtils.isEmpty(paramString))
    {
      w.v("MicroMsg.CardActivityHelper", "username is null");
      GMTrace.o(5052894806016L, 37647);
      return;
    }
    if (o.fm(paramString))
    {
      if (TextUtils.isEmpty(paramString))
      {
        w.v("MicroMsg.CardActivityHelper", "username is null");
        GMTrace.o(5052894806016L, 37647);
        return;
      }
      Intent localIntent = new Intent();
      localIntent.putExtra("Chat_User", paramString);
      localIntent.putExtra("finish_direct", true);
      d.a(paramContext, ".ui.chatting.En_5b8fbb1e", localIntent);
      GMTrace.o(5052894806016L, 37647);
      return;
    }
    P(paramContext, paramString);
    GMTrace.o(5052894806016L, 37647);
  }
  
  public static void a(MMActivity paramMMActivity, float paramFloat1, float paramFloat2, String paramString)
  {
    GMTrace.i(5053297459200L, 37650);
    Intent localIntent = new Intent();
    localIntent.putExtra("map_view_type", 2);
    localIntent.putExtra("kwebmap_slat", paramFloat1);
    localIntent.putExtra("kwebmap_lng", paramFloat2);
    localIntent.putExtra("Kwebmap_locaion", paramString);
    d.b(paramMMActivity, "location", ".ui.RedirectUI", localIntent);
    GMTrace.o(5053297459200L, 37650);
  }
  
  public static void a(MMActivity paramMMActivity, int paramInt, MMActivity.a parama)
  {
    GMTrace.i(5053431676928L, 37651);
    Intent localIntent = new Intent();
    localIntent.putExtra("select_is_ret", false);
    localIntent.putExtra("Select_Conv_Type", 3);
    d.a(paramMMActivity, ".ui.transmit.SelectConversationUI", localIntent, paramInt, parama);
    GMTrace.o(5053431676928L, 37651);
  }
  
  public static void a(MMActivity paramMMActivity, int paramInt, String paramString, boolean paramBoolean, com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(5053700112384L, 37653);
    Intent localIntent = new Intent();
    localIntent.putExtra("key_from_scene", 3);
    localIntent.putExtra("key_expire_time", paramInt);
    localIntent.putExtra("key_begin_time", System.currentTimeMillis());
    localIntent.putExtra("key_card_tips", paramString);
    localIntent.putExtra("key_is_mark", paramBoolean);
    localIntent.putExtra("key_card_id", paramb.aiP());
    localIntent.putExtra("key_user_card_id", paramb.aiO());
    localIntent.putExtra("key_card_code", paramb.aiL().code);
    d.b(paramMMActivity, "offline", ".ui.WalletOfflineEntranceUI", localIntent);
    g.paX.i(11850, new Object[] { Integer.valueOf(5), Integer.valueOf(0) });
    GMTrace.o(5053700112384L, 37653);
  }
  
  public static void a(MMActivity paramMMActivity, String paramString)
  {
    GMTrace.i(5053565894656L, 37652);
    Intent localIntent = new Intent();
    localIntent.putExtra("KEY_BRAND_NAME", paramString);
    d.b(paramMMActivity, "card", ".ui.CardShowWaringTransparentUI", localIntent);
    GMTrace.o(5053565894656L, 37652);
  }
  
  public static void a(MMActivity paramMMActivity, String paramString, int paramInt)
  {
    GMTrace.i(5053163241472L, 37649);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("stastic_scene", paramInt);
    d.b(paramMMActivity, "webview", ".ui.tools.WebViewUI", localIntent);
    GMTrace.o(5053163241472L, 37649);
  }
  
  public static void a(MMActivity paramMMActivity, String paramString1, String paramString2)
  {
    GMTrace.i(5053029023744L, 37648);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString1);
    localIntent.putExtra("stastic_scene", 0);
    localIntent.putExtra("rawUrl", paramString1);
    localIntent.putExtra("title", paramString2);
    d.b(paramMMActivity, "webview", ".ui.tools.WebViewUI", localIntent);
    GMTrace.o(5053029023744L, 37648);
  }
  
  public static void a(MMActivity paramMMActivity, boolean paramBoolean)
  {
    GMTrace.i(5052626370560L, 37645);
    Intent localIntent = new Intent(paramMMActivity, CardNewMsgUI.class);
    localIntent.putExtra("from_menu", paramBoolean);
    paramMMActivity.startActivity(localIntent);
    w.v("MicroMsg.CardActivityHelper", "start CardNewMsgUI");
    g.paX.i(11324, new Object[] { "CardMsgCenterView", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), "" });
    GMTrace.o(5052626370560L, 37645);
  }
  
  public static boolean a(String paramString, nc paramnc, int paramInt1, int paramInt2)
  {
    GMTrace.i(16137802743808L, 120236);
    if (paramnc == null)
    {
      w.i("MicroMsg.CardActivityHelper", "gotoAppBrand commField is null");
      GMTrace.o(16137802743808L, 120236);
      return false;
    }
    boolean bool = c(paramString, paramnc.tEL, paramnc.tEM, paramInt1, paramInt2);
    GMTrace.o(16137802743808L, 120236);
    return bool;
  }
  
  public static boolean c(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    GMTrace.i(16137936961536L, 120237);
    if (bg.mZ(paramString2))
    {
      w.i("MicroMsg.CardActivityHelper", "gotoAppBrand commField.app_brand_user_name is null");
      GMTrace.o(16137936961536L, 120237);
      return false;
    }
    px localpx = new px();
    localpx.fNL.userName = paramString2;
    localpx.fNL.fNN = bg.ap(paramString3, "");
    localpx.fNL.fNO = paramInt2;
    if (paramInt1 == 26) {}
    for (localpx.fNL.scene = 1029;; localpx.fNL.scene = 1028)
    {
      localpx.fNL.fty = paramString1;
      localpx.fNL.fNR = true;
      com.tencent.mm.sdk.b.a.uLm.m(localpx);
      w.i("MicroMsg.CardActivityHelper", "gotoAppBrand userName:%s, path:%s, scene:%d openType:%d", new Object[] { localpx.fNL.userName, localpx.fNL.fNN, Integer.valueOf(localpx.fNL.scene), Integer.valueOf(localpx.fNL.fNO) });
      GMTrace.o(16137936961536L, 120237);
      return true;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */