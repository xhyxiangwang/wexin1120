package com.tencent.mm.plugin.offline.c;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.KeyguardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.offline.a.r.f;
import com.tencent.mm.plugin.offline.a.r.h;
import com.tencent.mm.plugin.offline.j;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.Orders.DiscountInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders.RecommendTinyAppInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders.b;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.model.m;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.bb;
import com.tencent.mm.x.bb.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  public static String kmv;
  public static String opW;
  public static String opX;
  public static int opY;
  public static String opZ;
  public static String oqa;
  public static String oqb;
  public static int oqc;
  public static int oqd;
  public static long oqe;
  public static boolean oqf;
  public static String oqg;
  public static String oqh;
  private static Comparator<Bankcard> oqi;
  private static Comparator<a> oqj;
  
  static
  {
    GMTrace.i(6250385375232L, 46569);
    opW = "";
    opX = "";
    opY = 1;
    opZ = "";
    oqa = "";
    oqb = "";
    oqc = 1;
    oqd = 0;
    oqe = 0L;
    oqf = false;
    kmv = "";
    oqg = "";
    oqh = "";
    oqi = new Comparator() {};
    oqj = new Comparator() {};
    GMTrace.o(6250385375232L, 46569);
  }
  
  public static void C(Activity paramActivity)
  {
    GMTrace.i(6246493061120L, 46540);
    a(paramActivity, "freeze", paramActivity.getString(R.l.fai), 0, -1);
    GMTrace.o(6246493061120L, 46540);
  }
  
  public static void D(Activity paramActivity)
  {
    GMTrace.i(6246627278848L, 46541);
    com.tencent.mm.plugin.offline.k.aTF();
    String str = com.tencent.mm.plugin.offline.k.rR(196640);
    int i;
    if ((TextUtils.isEmpty(str)) || (!ul(str)))
    {
      i = 0;
      if (i <= 0) {
        break label73;
      }
      i *= 100;
    }
    for (;;)
    {
      a(paramActivity, "create", "", i, -1);
      GMTrace.o(6246627278848L, 46541);
      return;
      i = Integer.valueOf(str).intValue();
      break;
      label73:
      i = 20000;
    }
  }
  
  public static String DA(String paramString)
  {
    int j = 0;
    GMTrace.i(6249982722048L, 46566);
    Object localObject = Dv(aUF());
    LinkedList localLinkedList = Dy(aUK());
    if ((localObject == null) || (localLinkedList == null) || (((LinkedList)localObject).size() == 0) || (localLinkedList.size() == 0))
    {
      w.e("MicroMsg.WalletOfflineUtil", "getBankLogoUrl() cardList == null || cardLogoList == null || cardList.size() == 0 || cardLogoList.size() == 0");
      GMTrace.o(6249982722048L, 46566);
      return "";
    }
    int i = 0;
    a locala;
    if (i < ((LinkedList)localObject).size())
    {
      locala = (a)((LinkedList)localObject).get(i);
      if ((locala == null) || (!paramString.equals(locala.oqm))) {}
    }
    for (paramString = locala.oql;; paramString = "")
    {
      if (TextUtils.isEmpty(paramString))
      {
        w.e("MicroMsg.WalletOfflineUtil", "getBankLogoUrl() bank_type == null, can not find this bank_type");
        GMTrace.o(6249982722048L, 46566);
        return "";
        i += 1;
        break;
      }
      i = j;
      if (i < localLinkedList.size())
      {
        localObject = (b)localLinkedList.get(i);
        if ((localObject == null) || (!paramString.equals(((b)localObject).oql))) {}
      }
      for (paramString = ((b)localObject).oqo;; paramString = "")
      {
        GMTrace.o(6249982722048L, 46566);
        return paramString;
        i += 1;
        break;
      }
    }
  }
  
  public static void DB(String paramString)
  {
    GMTrace.i(16582734512128L, 123551);
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.vcn, paramString);
    GMTrace.o(16582734512128L, 123551);
  }
  
  public static void DC(String paramString)
  {
    GMTrace.i(16583002947584L, 123553);
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.vcV, paramString);
    GMTrace.o(16583002947584L, 123553);
  }
  
  public static void DD(String paramString)
  {
    GMTrace.i(16583539818496L, 123557);
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.vcX, paramString);
    GMTrace.o(16583539818496L, 123557);
  }
  
  public static void Ds(String paramString)
  {
    GMTrace.i(6244614012928L, 46526);
    com.tencent.mm.plugin.offline.k.aTF();
    com.tencent.mm.plugin.offline.k.ag(196631, paramString);
    GMTrace.o(6244614012928L, 46526);
  }
  
  public static void Dt(String paramString)
  {
    GMTrace.i(6245285101568L, 46531);
    w.i("MicroMsg.WalletOfflineUtil", "setSelectBindSerial %s %s", new Object[] { paramString, bg.bOd().toString() });
    com.tencent.mm.plugin.offline.k.aTF();
    com.tencent.mm.plugin.offline.k.ag(196633, paramString);
    GMTrace.o(6245285101568L, 46531);
  }
  
  private static void Du(String paramString)
  {
    GMTrace.i(6247835238400L, 46550);
    com.tencent.mm.plugin.offline.k.aTF();
    com.tencent.mm.plugin.offline.k.ag(196656, paramString);
    opZ = paramString;
    GMTrace.o(6247835238400L, 46550);
  }
  
  public static LinkedList<a> Dv(String paramString)
  {
    GMTrace.i(6248103673856L, 46552);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(6248103673856L, 46552);
      return null;
    }
    try
    {
      paramString = q(new JSONArray(paramString));
      GMTrace.o(6248103673856L, 46552);
      return paramString;
    }
    catch (JSONException paramString)
    {
      w.printErrStackTrace("MicroMsg.WalletOfflineUtil", paramString, "", new Object[0]);
      GMTrace.o(6248103673856L, 46552);
    }
    return null;
  }
  
  public static void Dw(String paramString)
  {
    GMTrace.i(6248640544768L, 46556);
    com.tencent.mm.plugin.offline.k.aTF();
    com.tencent.mm.plugin.offline.k.ag(196616, paramString);
    GMTrace.o(6248640544768L, 46556);
  }
  
  public static void Dx(String paramString)
  {
    GMTrace.i(6249177415680L, 46560);
    com.tencent.mm.plugin.offline.k.aTF();
    com.tencent.mm.plugin.offline.k.ag(196615, paramString);
    oqb = paramString;
    GMTrace.o(6249177415680L, 46560);
  }
  
  private static LinkedList<b> Dy(String paramString)
  {
    GMTrace.i(6249311633408L, 46561);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(6249311633408L, 46561);
      return null;
    }
    try
    {
      paramString = r(new JSONArray(paramString));
      GMTrace.o(6249311633408L, 46561);
      return paramString;
    }
    catch (JSONException paramString)
    {
      w.printErrStackTrace("MicroMsg.WalletOfflineUtil", paramString, "", new Object[0]);
      GMTrace.o(6249311633408L, 46561);
    }
    return null;
  }
  
  public static String Dz(String paramString)
  {
    GMTrace.i(6249848504320L, 46565);
    LinkedList localLinkedList = Dy(aUK());
    if (localLinkedList == null)
    {
      GMTrace.o(6249848504320L, 46565);
      return "";
    }
    int i = 0;
    b localb;
    if (i < localLinkedList.size())
    {
      localb = (b)localLinkedList.get(i);
      if ((localb == null) || (!paramString.equals(localb.oql))) {}
    }
    for (paramString = localb.oqo;; paramString = "")
    {
      GMTrace.o(6249848504320L, 46565);
      return paramString;
      i += 1;
      break;
    }
  }
  
  public static Orders E(Map<String, String> paramMap)
  {
    GMTrace.i(6245687754752L, 46534);
    Orders localOrders = new Orders();
    Orders.Commodity localCommodity = new Orders.Commodity();
    localCommodity.oqU = ((String)paramMap.get(".sysmsg.paymsg.user_roll.buy_uin"));
    localCommodity.oqV = ((String)paramMap.get(".sysmsg.paymsg.user_roll.buy_name"));
    localCommodity.oqW = ((String)paramMap.get(".sysmsg.paymsg.user_roll.sale_uin"));
    localCommodity.oqX = ((String)paramMap.get(".sysmsg.paymsg.user_roll.sale_name"));
    localCommodity.fKK = ((String)paramMap.get(".sysmsg.paymsg.user_roll.trans_id"));
    localCommodity.desc = ((String)paramMap.get(".sysmsg.paymsg.user_roll.goods_name"));
    localCommodity.kKX = (bg.getInt((String)paramMap.get(".sysmsg.paymsg.user_roll.pay_num"), -1) / 100.0D);
    localCommodity.orb = ((String)paramMap.get(".sysmsg.paymsg.user_roll.trade_state"));
    localCommodity.orc = ((String)paramMap.get(".sysmsg.paymsg.user_roll.trade_state_name"));
    localCommodity.org = ((String)paramMap.get(".sysmsg.paymsg.user_roll.buy_bank_name"));
    localCommodity.orn = ((String)paramMap.get(".sysmsg.paymsg.user_roll.discount"));
    localCommodity.ore = bg.getInt((String)paramMap.get(".sysmsg.paymsg.user_roll.modify_timestamp"), 0);
    localCommodity.ori = ((String)paramMap.get(".sysmsg.paymsg.user_roll.fee_type"));
    localCommodity.orj = ((String)paramMap.get(".sysmsg.paymsg.user_roll.appusername"));
    localCommodity.oqL = ((String)paramMap.get(".sysmsg.paymsg.user_roll.app_telephone"));
    localCommodity.rPx = (bg.getInt((String)paramMap.get(".sysmsg.paymsg.user_roll.buy_bank_name"), -1) / 100.0D);
    Object localObject1 = new Orders.b();
    ((Orders.b)localObject1).name = ((String)paramMap.get(".sysmsg.paymsg.user_roll.subscribe_biz_info.nickname"));
    ((Orders.b)localObject1).orj = ((String)paramMap.get(".sysmsg.paymsg.user_roll.subscribe_biz_info.username"));
    ((Orders.b)localObject1).type = Orders.rPv;
    localCommodity.rPy = ((Orders.b)localObject1).orj;
    ((Orders.b)localObject1).ovK = ((String)paramMap.get(".sysmsg.paymsg.user_roll.subscribe_biz_info.logo_round_url"));
    ((Orders.b)localObject1).url = ((String)paramMap.get(".sysmsg.paymsg.user_roll.subscribe_biz_info.subscribe_biz_url"));
    int j = bg.getInt((String)paramMap.get(".sysmsg.paymsg.user_roll.subscribe_biz_info.recommend_level"), 1);
    localCommodity.rPa = j;
    localCommodity.rPB = ((String)paramMap.get(".sysmsg.paymsg.user_roll.rateinfo"));
    localCommodity.rPC = ((String)paramMap.get(".sysmsg.paymsg.user_roll.original_feeinfo"));
    if (!bg.mZ(((Orders.b)localObject1).name))
    {
      localCommodity.rPF = true;
      localCommodity.rPE.add(localObject1);
    }
    int i = 0;
    Orders.b localb;
    String str1;
    Object localObject2;
    String str2;
    String str3;
    String str4;
    String str5;
    String str6;
    String str7;
    String str8;
    String str9;
    String str10;
    String str11;
    String str12;
    String str13;
    if (i < 255)
    {
      localb = new Orders.b();
      if (i == 0)
      {
        localObject1 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.icon");
        str1 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.wording");
        localObject2 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.url");
        str2 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.btn_text");
        str3 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.type");
        str4 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.title");
        str5 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_type");
        str6 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_id");
        str7 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.send_record_id");
        str8 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.award_id");
        str9 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.user_record_id");
        str10 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.small_title");
        str11 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_tinyapp_username");
        str12 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_tinyapp_path");
        str13 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_mch_id");
        label725:
        if (!bg.mZ(str1)) {
          break label1942;
        }
        w.i("MicroMsg.WalletOfflineUtil", "hy: activity end. total size: %d", new Object[] { Integer.valueOf(i + 1) });
      }
    }
    else
    {
      localObject1 = (String)paramMap.get(".sysmsg.paymsg.user_roll.link_ativity_info.text");
      str1 = (String)paramMap.get(".sysmsg.paymsg.user_roll.link_ativity_info.url");
      localCommodity.rPG.text = ((String)localObject1);
      localCommodity.rPG.url = str1;
      localObject1 = (String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_name");
      str1 = (String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_logo");
      localObject2 = (String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_desc");
      str2 = (String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_username");
      str3 = (String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_path");
      if ((!bg.mZ((String)localObject1)) && (!bg.mZ(str1)) && (!bg.mZ((String)localObject2)) && (!bg.mZ(str2)))
      {
        localCommodity.rPD = new Orders.RecommendTinyAppInfo();
        localCommodity.rPD.rPW = ((String)localObject1);
        localCommodity.rPD.rPX = str1;
        localCommodity.rPD.rPY = ((String)localObject2);
        localCommodity.rPD.rPZ = str2;
        localCommodity.rPD.rQa = str3;
        localCommodity.rPD.rQb = ((String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.activity_tinyapp_btn_text"));
        localCommodity.rPD.rQc = bg.getLong((String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.activity_id"), 0L);
        localCommodity.rPD.rQd = bg.getLong((String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.activity_type"), 0L);
        localCommodity.rPD.rQf = bg.getInt((String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.send_record_id"), 0);
        localCommodity.rPD.rQg = bg.getInt((String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.user_record_id"), 0);
        localCommodity.rPD.rQh = bg.getInt((String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.activity_mch_id"), 0);
        localCommodity.rPD.rQe = bg.getInt((String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.award_id"), 0);
      }
      localOrders.rPj = new ArrayList();
      localOrders.rPj.add(localCommodity);
      localOrders.rPt = bg.getInt((String)paramMap.get(".sysmsg.paymsg.user_roll.is_use_new_paid_succ_page"), 0);
      localOrders.rPu = ((String)paramMap.get(".sysmsg.paymsg.user_roll.pay_succ_btn_wording"));
      localOrders.rPc = ((String)paramMap.get(".sysmsg.paymsg.user_roll.trade_state_name"));
      localOrders.rPa = j;
      localOrders.fAF = ((String)paramMap.get(".sysmsg.req_key"));
      localCommodity.rPx = (bg.getDouble((String)paramMap.get(".sysmsg.paymsg.user_roll.original_total_fee"), -1.0D) / 100.0D);
      if (TextUtils.isEmpty((String)paramMap.get(".sysmsg.paymsg.user_roll.discount_array.record.favor_desc"))) {
        break label2161;
      }
      i = 0;
      label1277:
      if (i != 0) {
        break label2102;
      }
    }
    label1942:
    label2102:
    for (localObject1 = "";; localObject1 = String.valueOf(i))
    {
      str1 = ".sysmsg.paymsg.user_roll.discount_array.record" + (String)localObject1 + ".favor_desc";
      localObject1 = ".sysmsg.paymsg.user_roll.discount_array.record" + (String)localObject1 + ".payment_amount";
      if ((TextUtils.isEmpty((CharSequence)paramMap.get(str1))) || (TextUtils.isEmpty((CharSequence)paramMap.get(localObject1)))) {
        break label2110;
      }
      localObject2 = new Orders.DiscountInfo();
      ((Orders.DiscountInfo)localObject2).rFJ = ((String)paramMap.get(str1));
      ((Orders.DiscountInfo)localObject2).rPK = bg.getDouble((String)paramMap.get(localObject1), 0.0D);
      localCommodity.rPA.add(localObject2);
      i += 1;
      break label1277;
      localObject1 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".icon");
      str1 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".wording");
      localObject2 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".url");
      str2 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".btn_text");
      str3 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".type");
      str4 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".title");
      str5 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".activity_type");
      str6 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".activity_id");
      str7 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".send_record_id");
      str8 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".award_id");
      str9 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".user_record_id");
      str10 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".small_title");
      str11 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".activity_tinyapp_username");
      str12 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".activity_tinyapp_path");
      str13 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".activity_mch_id");
      break label725;
      localb.ovK = ((String)localObject1);
      localb.name = str1;
      localb.url = ((String)localObject2);
      localb.rPL = str2;
      localb.type = Orders.rPw;
      localb.rPM = bg.getInt(str3, 0);
      localb.title = str4;
      localb.rPO = bg.getInt(str5, 0);
      localb.rPN = bg.getLong(str6, 0L);
      localb.rPQ = bg.getInt(str7, 0);
      localb.rPP = bg.getInt(str8, 0);
      localb.rPR = bg.getInt(str9, 0);
      localb.rPS = str10;
      localb.rPT = str11;
      localb.rPU = str12;
      localb.rPV = bg.getLong(str13, 0L);
      localCommodity.rPE.add(localb);
      i += 1;
      break;
    }
    label2110:
    w.e("MicroMsg.WalletOfflineUtil", "favor_desc_key is " + str1 + ", payment_amount_key is " + (String)localObject1 + ", break");
    for (;;)
    {
      GMTrace.o(6245687754752L, 46534);
      return localOrders;
      label2161:
      w.e("MicroMsg.WalletOfflineUtil", ".sysmsg.paymsg.user_roll.discount_array.record.favor_desc value is empty");
    }
  }
  
  public static void E(Activity paramActivity)
  {
    GMTrace.i(6248774762496L, 46557);
    com.tencent.mm.ui.base.h.bl(paramActivity, paramActivity.getResources().getString(R.l.fag));
    if (!TextUtils.isEmpty(aUI())) {
      ap(paramActivity, aUI());
    }
    GMTrace.o(6248774762496L, 46557);
  }
  
  public static void a(Activity paramActivity, int paramInt1, int paramInt2)
  {
    GMTrace.i(6246090407936L, 46537);
    PayInfo localPayInfo = new PayInfo();
    localPayInfo.fIH = 5;
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("key_pay_info", localPayInfo);
    localBundle.putBoolean("key_need_bind_response", true);
    localBundle.putInt("key_bind_scene", 5);
    localBundle.putInt("key_offline_add_fee", paramInt1);
    if (paramInt2 >= 0) {
      localBundle.putInt("key_entry_scene", paramInt2);
    }
    if (!m.bwE().bwY())
    {
      if (m.bwE().bwV())
      {
        localBundle.putBoolean("key_is_bind_bankcard", true);
        com.tencent.mm.wallet_core.a.a(paramActivity, com.tencent.mm.plugin.offline.d.class, localBundle);
        GMTrace.o(6246090407936L, 46537);
        return;
      }
      if (m.bwE().bwZ())
      {
        localBundle.putBoolean("key_is_bind_bankcard", true);
        com.tencent.mm.wallet_core.a.a(paramActivity, com.tencent.mm.plugin.offline.d.class, localBundle);
        GMTrace.o(6246090407936L, 46537);
        return;
      }
    }
    com.tencent.mm.wallet_core.a.a(paramActivity, com.tencent.mm.plugin.offline.c.class, localBundle);
    GMTrace.o(6246090407936L, 46537);
  }
  
  public static void a(Activity paramActivity, r.f paramf)
  {
    GMTrace.i(15384707072000L, 114625);
    w.i("MicroMsg.WalletOfflineUtil", "hy: whole pay msg coming. direct parse");
    if ((paramf == null) || (paramf.oor == null))
    {
      w.e("MicroMsg.WalletOfflineUtil", "order == null");
      GMTrace.o(15384707072000L, 114625);
      return;
    }
    if (!aUq())
    {
      GMTrace.o(15384707072000L, 114625);
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("key_orders", paramf.oor);
    localBundle.putInt("key_pay_type", 2);
    if (paramf.fQI != null)
    {
      RealnameGuideHelper localRealnameGuideHelper = new RealnameGuideHelper();
      localRealnameGuideHelper.a(paramf.fQI.fQq, paramf.fQI.fQr, paramf.fQI.fQs, paramf.fQI.fQt, paramf.fQI.fQu, 8);
      localBundle.putParcelable("key_realname_guide_helper", localRealnameGuideHelper);
    }
    com.tencent.mm.wallet_core.a.a(paramActivity, j.class, localBundle);
    GMTrace.o(15384707072000L, 114625);
  }
  
  public static void a(Activity paramActivity, String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(6245821972480L, 46535);
    w.i("MicroMsg.WalletOfflineUtil", "hy: only transid coming. do old way");
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.WalletOfflineUtil", "transid == null");
      GMTrace.o(6245821972480L, 46535);
      return;
    }
    if (!aUq())
    {
      GMTrace.o(6245821972480L, 46535);
      return;
    }
    Bundle localBundle = new Bundle();
    if ((paramk instanceof com.tencent.mm.plugin.offline.a.e))
    {
      paramk = ((com.tencent.mm.plugin.offline.a.e)paramk).onA;
      if (paramk != null) {
        localBundle.putParcelable("key_realname_guide_helper", paramk);
      }
    }
    localBundle.putString("key_trans_id", paramString);
    localBundle.putInt("key_pay_type", 2);
    com.tencent.mm.wallet_core.a.a(paramActivity, j.class, localBundle);
    GMTrace.o(6245821972480L, 46535);
  }
  
  private static void a(Activity paramActivity, String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    GMTrace.i(6246358843392L, 46539);
    Bundle localBundle = new Bundle();
    localBundle.putString("oper", paramString1);
    localBundle.putInt("offline_chg_fee", paramInt1);
    localBundle.putString("pwd_tips", paramString2);
    if (paramInt2 >= 0) {
      localBundle.putInt("offline_from_scene", paramInt2);
    }
    com.tencent.mm.wallet_core.a.a(paramActivity, com.tencent.mm.plugin.offline.h.class, localBundle);
    GMTrace.o(6246358843392L, 46539);
  }
  
  public static void aUA()
  {
    GMTrace.i(6245419319296L, 46532);
    w.i("MicroMsg.WalletOfflineUtil", "clear offline data");
    com.tencent.mm.plugin.offline.k.aTF();
    com.tencent.mm.plugin.offline.k.ag(196630, "0");
    com.tencent.mm.plugin.offline.k.aTF();
    com.tencent.mm.plugin.offline.k.ag(196626, "");
    com.tencent.mm.plugin.offline.k.aTF();
    com.tencent.mm.plugin.offline.k.ag(196627, "");
    com.tencent.mm.plugin.offline.k.aTF();
    com.tencent.mm.plugin.offline.k.ag(196628, "");
    com.tencent.mm.plugin.offline.k.aTF();
    com.tencent.mm.plugin.offline.k.ag(196617, "");
    com.tencent.mm.plugin.offline.k.aTF();
    com.tencent.mm.plugin.offline.k.ag(196632, "");
    com.tencent.mm.plugin.offline.k.aTF();
    com.tencent.mm.plugin.offline.k.ag(196641, "");
    com.tencent.mm.plugin.offline.k.aTF();
    com.tencent.mm.plugin.offline.k.ag(196647, "");
    com.tencent.mm.plugin.offline.k.aTF();
    com.tencent.mm.plugin.offline.k.ag(196649, "");
    i("", "", "", "");
    com.tencent.mm.plugin.offline.k.aTF();
    com.tencent.mm.plugin.offline.k.ag(196629, "0");
    Ds("");
    com.tencent.mm.plugin.offline.k.aTF();
    com.tencent.mm.plugin.offline.k.aTG().ood = null;
    com.tencent.mm.plugin.offline.k.aTF();
    com.tencent.mm.plugin.offline.k.aTI();
    com.tencent.mm.plugin.offline.k.aTF();
    String str = com.tencent.mm.plugin.offline.k.rR(196617);
    com.tencent.mm.wallet_core.c.a.ciD();
    com.tencent.mm.wallet_core.c.a.clearToken(str);
    Dx("");
    Du("");
    GMTrace.o(6245419319296L, 46532);
  }
  
  public static void aUB()
  {
    GMTrace.i(6246895714304L, 46543);
    com.tencent.mm.plugin.offline.k.aTF();
    com.tencent.mm.plugin.offline.k.ag(196643, "1");
    GMTrace.o(6246895714304L, 46543);
  }
  
  public static int aUC()
  {
    GMTrace.i(6247164149760L, 46545);
    com.tencent.mm.plugin.offline.k.aTF();
    String str = com.tencent.mm.plugin.offline.k.rR(196644);
    if ((TextUtils.isEmpty(str)) || (!ul(str)))
    {
      GMTrace.o(6247164149760L, 46545);
      return 0;
    }
    int i = Integer.valueOf(str).intValue();
    GMTrace.o(6247164149760L, 46545);
    return i;
  }
  
  public static String aUD()
  {
    GMTrace.i(6247298367488L, 46546);
    if (!TextUtils.isEmpty(opW))
    {
      str = opW;
      GMTrace.o(6247298367488L, 46546);
      return str;
    }
    aUG();
    if (TextUtils.isEmpty(opW)) {
      w.e("MicroMsg.WalletOfflineUtil", "token is null");
    }
    String str = opW;
    GMTrace.o(6247298367488L, 46546);
    return str;
  }
  
  public static String aUE()
  {
    GMTrace.i(6247566802944L, 46548);
    if (!TextUtils.isEmpty(opX))
    {
      str = opX;
      GMTrace.o(6247566802944L, 46548);
      return str;
    }
    aUG();
    if (TextUtils.isEmpty(opX)) {
      w.e("MicroMsg.WalletOfflineUtil", "offline_token_v2 is null");
    }
    String str = opX;
    GMTrace.o(6247566802944L, 46548);
    return str;
  }
  
  public static String aUF()
  {
    GMTrace.i(6247701020672L, 46549);
    if (!TextUtils.isEmpty(opZ))
    {
      str = opZ;
      GMTrace.o(6247701020672L, 46549);
      return str;
    }
    if (TextUtils.isEmpty(opZ))
    {
      com.tencent.mm.plugin.offline.k.aTF();
      str = com.tencent.mm.plugin.offline.k.rR(196656);
      opZ = str;
      GMTrace.o(6247701020672L, 46549);
      return str;
    }
    if (TextUtils.isEmpty(opZ)) {
      w.e("MicroMsg.WalletOfflineUtil", "offline_card_list is null");
    }
    String str = opZ;
    GMTrace.o(6247701020672L, 46549);
    return str;
  }
  
  private static void aUG()
  {
    GMTrace.i(6247969456128L, 46551);
    ap.wT().a(new bb(new bb.a()
    {
      public final void a(com.tencent.mm.network.e paramAnonymouse)
      {
        GMTrace.i(6241795440640L, 46505);
        if ((paramAnonymouse == null) || (paramAnonymouse.DY() == null))
        {
          w.e("MicroMsg.WalletOfflineUtil", "doLocalProxyScene dispatcher == null || dispatcher.getAccInfo() == null");
          GMTrace.o(6241795440640L, 46505);
          return;
        }
        byte[] arrayOfByte = paramAnonymouse.DY().hS("offline_token");
        if (arrayOfByte != null) {
          a.opW = new String(arrayOfByte);
        }
        arrayOfByte = paramAnonymouse.DY().hS("offline_token_V2");
        if (arrayOfByte != null) {
          a.opX = new String(arrayOfByte);
        }
        paramAnonymouse = paramAnonymouse.DY().hS("offline_key_list");
        if (paramAnonymouse != null) {
          a.oqa = new String(paramAnonymouse);
        }
        GMTrace.o(6241795440640L, 46505);
      }
    }), 0);
    GMTrace.o(6247969456128L, 46551);
  }
  
  public static String aUH()
  {
    GMTrace.i(6248372109312L, 46554);
    com.tencent.mm.plugin.offline.k.aTF();
    String str = com.tencent.mm.plugin.offline.k.rR(196647);
    GMTrace.o(6248372109312L, 46554);
    return str;
  }
  
  private static String aUI()
  {
    GMTrace.i(6248506327040L, 46555);
    com.tencent.mm.plugin.offline.k.aTF();
    String str = com.tencent.mm.plugin.offline.k.rR(196616);
    GMTrace.o(6248506327040L, 46555);
    return str;
  }
  
  public static boolean aUJ()
  {
    GMTrace.i(6248908980224L, 46558);
    ArrayList localArrayList = m.bwE().iJ(true);
    Object localObject = Dv(aUF());
    if ((localObject == null) || (localArrayList.size() != ((LinkedList)localObject).size()))
    {
      GMTrace.o(6248908980224L, 46558);
      return false;
    }
    Collections.sort((List)localObject, oqj);
    Collections.sort(localArrayList, oqi);
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    while (i < ((LinkedList)localObject).size())
    {
      localStringBuilder.append(((a)((LinkedList)localObject).get(i)).oqm);
      i += 1;
    }
    localObject = new StringBuilder();
    i = 0;
    while (i < localArrayList.size())
    {
      ((StringBuilder)localObject).append(((Bankcard)localArrayList.get(i)).field_bindSerial);
      i += 1;
    }
    if (aa.QW(localStringBuilder.toString()).equals(aa.QW(((StringBuilder)localObject).toString())))
    {
      GMTrace.o(6248908980224L, 46558);
      return true;
    }
    GMTrace.o(6248908980224L, 46558);
    return false;
  }
  
  private static String aUK()
  {
    GMTrace.i(6249043197952L, 46559);
    if (TextUtils.isEmpty(oqb))
    {
      com.tencent.mm.plugin.offline.k.aTF();
      str = com.tencent.mm.plugin.offline.k.rR(196615);
      oqb = str;
      GMTrace.o(6249043197952L, 46559);
      return str;
    }
    String str = oqb;
    GMTrace.o(6249043197952L, 46559);
    return str;
  }
  
  public static int aUL()
  {
    GMTrace.i(6249580068864L, 46563);
    com.tencent.mm.plugin.offline.k.aTF();
    String str = com.tencent.mm.plugin.offline.k.rR(196649);
    if ((TextUtils.isEmpty(str)) || (!ul(str)))
    {
      GMTrace.o(6249580068864L, 46563);
      return 0;
    }
    int i = Integer.valueOf(str).intValue();
    GMTrace.o(6249580068864L, 46563);
    return i;
  }
  
  public static boolean aUM()
  {
    GMTrace.i(6249714286592L, 46564);
    String str = aUx();
    if (TextUtils.isEmpty(str))
    {
      GMTrace.o(6249714286592L, 46564);
      return false;
    }
    long l1 = aUL();
    long l2 = Long.valueOf(str).longValue();
    if (System.currentTimeMillis() / 1000L - l2 >= l1)
    {
      GMTrace.o(6249714286592L, 46564);
      return true;
    }
    GMTrace.o(6249714286592L, 46564);
    return false;
  }
  
  public static String aUN()
  {
    GMTrace.i(16582868729856L, 123552);
    ap.AS();
    Object localObject = com.tencent.mm.x.c.xi().get(w.a.vcn, "");
    if (localObject != null)
    {
      localObject = (String)localObject;
      GMTrace.o(16582868729856L, 123552);
      return (String)localObject;
    }
    GMTrace.o(16582868729856L, 123552);
    return null;
  }
  
  public static String aUO()
  {
    GMTrace.i(16583137165312L, 123554);
    ap.AS();
    Object localObject = com.tencent.mm.x.c.xi().get(w.a.vcV, "");
    if (localObject != null)
    {
      localObject = (String)localObject;
      GMTrace.o(16583137165312L, 123554);
      return (String)localObject;
    }
    GMTrace.o(16583137165312L, 123554);
    return null;
  }
  
  public static int aUP()
  {
    GMTrace.i(16583405600768L, 123556);
    ap.AS();
    Object localObject = com.tencent.mm.x.c.xi().get(w.a.vcW, null);
    if (localObject != null) {}
    for (int i = ((Integer)localObject).intValue();; i = 0)
    {
      int j = i;
      if (i < 0) {
        j = 0;
      }
      GMTrace.o(16583405600768L, 123556);
      return j;
    }
  }
  
  public static String aUQ()
  {
    GMTrace.i(16583674036224L, 123558);
    ap.AS();
    Object localObject = com.tencent.mm.x.c.xi().get(w.a.vcX, "");
    if (localObject != null)
    {
      localObject = (String)localObject;
      GMTrace.o(16583674036224L, 123558);
      return (String)localObject;
    }
    GMTrace.o(16583674036224L, 123558);
    return null;
  }
  
  public static boolean aUR()
  {
    GMTrace.i(16583942471680L, 123560);
    boolean bool2 = false;
    Object localObject = com.tencent.mm.x.c.c.Cu().em("100232");
    if (((com.tencent.mm.storage.c)localObject).isValid())
    {
      localObject = ((com.tencent.mm.storage.c)localObject).bPn();
      if ((((Map)localObject).containsKey("open")) && ("1".equals(((Map)localObject).get("open")))) {
        w.e("MicroMsg.WalletOfflineUtil", "deprecated abtest 100232 enabled.");
      }
    }
    localObject = com.tencent.mm.x.c.c.Cu().em("100261");
    boolean bool1 = bool2;
    if (((com.tencent.mm.storage.c)localObject).isValid())
    {
      localObject = ((com.tencent.mm.storage.c)localObject).bPn();
      bool1 = bool2;
      if (((Map)localObject).containsKey("open"))
      {
        bool1 = bool2;
        if ("1".equals(((Map)localObject).get("open"))) {
          bool1 = true;
        }
      }
    }
    w.v("MicroMsg.WalletOfflineUtil", "isPosEnabled: " + bool1);
    GMTrace.o(16583942471680L, 123560);
    return bool1;
  }
  
  public static boolean aUp()
  {
    GMTrace.i(6242869182464L, 46513);
    com.tencent.mm.plugin.offline.k.aTF();
    String str = com.tencent.mm.plugin.offline.k.rR(196630);
    if ((str != null) && (str.equals("1")))
    {
      GMTrace.o(6242869182464L, 46513);
      return true;
    }
    GMTrace.o(6242869182464L, 46513);
    return false;
  }
  
  public static boolean aUq()
  {
    GMTrace.i(6243003400192L, 46514);
    com.tencent.mm.plugin.offline.k.aTF();
    String str = com.tencent.mm.plugin.offline.k.rR(196641);
    if ((str != null) && (str.equals("1")))
    {
      GMTrace.o(6243003400192L, 46514);
      return true;
    }
    GMTrace.o(6243003400192L, 46514);
    return false;
  }
  
  public static Bankcard aUr()
  {
    GMTrace.i(6243137617920L, 46515);
    Object localObject2 = aUz();
    w.i("MicroMsg.WalletOfflineUtil", "step 1 getSelectedBindBankCard %s", new Object[] { localObject2 });
    Object localObject1 = m.bwE().iR(true);
    int i = 0;
    while ((!TextUtils.isEmpty((CharSequence)localObject2)) && (i < ((List)localObject1).size()))
    {
      Bankcard localBankcard = (Bankcard)((List)localObject1).get(i);
      if ((localBankcard != null) && (((String)localObject2).equals(localBankcard.field_bindSerial)))
      {
        w.i("MicroMsg.WalletOfflineUtil", "step 2 micropay: %s, forbidword: %s", new Object[] { Boolean.valueOf(localBankcard.field_support_micropay), localBankcard.field_forbidWord });
        if (localBankcard.field_support_micropay)
        {
          GMTrace.o(6243137617920L, 46515);
          return localBankcard;
        }
      }
      i += 1;
    }
    w.i("MicroMsg.WalletOfflineUtil", "step 3 clear default bindserial");
    Dt("");
    localObject2 = aUt();
    if ((localObject2 != null) && (bg.mZ(((Bankcard)localObject2).field_forbidWord)))
    {
      w.i("MicroMsg.WalletOfflineUtil", "do change main card: %s", new Object[] { ((Bankcard)localObject2).field_bankcardType });
      GMTrace.o(6243137617920L, 46515);
      return (Bankcard)localObject2;
    }
    i = 0;
    while (i < ((List)localObject1).size())
    {
      localObject2 = (Bankcard)((List)localObject1).get(i);
      if ((localObject2 != null) && (((Bankcard)localObject2).field_support_micropay) && (!((Bankcard)localObject2).bwm()))
      {
        w.i("MicroMsg.WalletOfflineUtil", "do change first card: %s", new Object[] { ((Bankcard)localObject2).field_bankcardType });
        GMTrace.o(6243137617920L, 46515);
        return (Bankcard)localObject2;
      }
      i += 1;
    }
    localObject1 = m.bwE().rCP;
    if ((localObject1 != null) && (((Bankcard)localObject1).field_support_micropay))
    {
      w.i("MicroMsg.WalletOfflineUtil", "do change balance: %s", new Object[] { ((Bankcard)localObject1).field_bankcardType });
      GMTrace.o(6243137617920L, 46515);
      return (Bankcard)localObject1;
    }
    localObject1 = m.bwE().rRv;
    if ((localObject1 != null) && (((Bankcard)localObject1).field_support_micropay) && (bg.mZ(((Bankcard)localObject1).field_forbidWord)))
    {
      w.i("MicroMsg.WalletOfflineUtil", "do change balance: %s", new Object[] { ((Bankcard)localObject1).field_bankcardType });
      GMTrace.o(6243137617920L, 46515);
      return (Bankcard)localObject1;
    }
    GMTrace.o(6243137617920L, 46515);
    return null;
  }
  
  public static Bankcard aUs()
  {
    GMTrace.i(6243271835648L, 46516);
    Object localObject = aUr();
    if ((localObject != null) && (((Bankcard)localObject).field_support_micropay) && (bg.mZ(((Bankcard)localObject).field_forbidWord)))
    {
      GMTrace.o(6243271835648L, 46516);
      return (Bankcard)localObject;
    }
    localObject = m.bwE().iJ(true);
    int i = 0;
    while (i < ((List)localObject).size())
    {
      Bankcard localBankcard = (Bankcard)((List)localObject).get(i);
      if ((localBankcard != null) && (localBankcard.field_support_micropay))
      {
        GMTrace.o(6243271835648L, 46516);
        return localBankcard;
      }
      i += 1;
    }
    GMTrace.o(6243271835648L, 46516);
    return null;
  }
  
  public static Bankcard aUt()
  {
    GMTrace.i(6243406053376L, 46517);
    Bankcard localBankcard = m.bwE().a(null, null, true, true);
    if (localBankcard == null) {
      w.e("MicroMsg.WalletOfflineUtil", "defaultBankcards == null");
    }
    GMTrace.o(6243406053376L, 46517);
    return localBankcard;
  }
  
  public static int aUu()
  {
    GMTrace.i(6243540271104L, 46518);
    int i = m.bwE().iJ(true).size();
    GMTrace.o(6243540271104L, 46518);
    return i;
  }
  
  public static List<Bankcard> aUv()
  {
    GMTrace.i(6243808706560L, 46520);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = m.bwE().iR(true);
    int i = 0;
    while (i < localArrayList2.size())
    {
      localArrayList1.add((Bankcard)localArrayList2.get(i));
      i += 1;
    }
    w.i("MicroMsg.WalletOfflineUtil", "getOfflineBindBankCardList() list size is " + localArrayList1.size());
    GMTrace.o(6243808706560L, 46520);
    return localArrayList1;
  }
  
  public static int aUw()
  {
    GMTrace.i(6243942924288L, 46521);
    com.tencent.mm.plugin.offline.k.aTF();
    String str = com.tencent.mm.plugin.offline.k.rR(196629);
    if ((TextUtils.isEmpty(str)) || (!ul(str)))
    {
      GMTrace.o(6243942924288L, 46521);
      return 0;
    }
    int i = Integer.valueOf(str).intValue();
    GMTrace.o(6243942924288L, 46521);
    return i;
  }
  
  public static String aUx()
  {
    GMTrace.i(6244345577472L, 46524);
    com.tencent.mm.plugin.offline.k.aTF();
    String str = com.tencent.mm.plugin.offline.k.rR(196632);
    GMTrace.o(6244345577472L, 46524);
    return str;
  }
  
  public static String aUy()
  {
    GMTrace.i(6244479795200L, 46525);
    com.tencent.mm.plugin.offline.k.aTF();
    String str = com.tencent.mm.plugin.offline.k.rR(196631);
    GMTrace.o(6244479795200L, 46525);
    return str;
  }
  
  public static String aUz()
  {
    GMTrace.i(6245150883840L, 46530);
    com.tencent.mm.plugin.offline.k.aTF();
    String str = com.tencent.mm.plugin.offline.k.rR(196633);
    GMTrace.o(6245150883840L, 46530);
    return str;
  }
  
  private static void ap(Context paramContext, String paramString)
  {
    GMTrace.i(6244882448384L, 46528);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", false);
    com.tencent.mm.bi.d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
    GMTrace.o(6244882448384L, 46528);
  }
  
  public static void b(Activity paramActivity, String paramString)
  {
    GMTrace.i(6246761496576L, 46542);
    com.tencent.mm.ui.base.h.a(paramActivity, false, paramString, "", paramActivity.getString(R.l.fao), paramActivity.getString(R.l.duP), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(6242600747008L, 46511);
        a.aUA();
        a.D(this.ne);
        this.ne.finish();
        GMTrace.o(6242600747008L, 46511);
      }
    }, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(6241258569728L, 46501);
        this.ne.finish();
        GMTrace.o(6241258569728L, 46501);
      }
    });
    GMTrace.o(6246761496576L, 46542);
  }
  
  public static int cB(Context paramContext)
  {
    GMTrace.i(16583808253952L, 123559);
    int i;
    if (am.isConnected(paramContext)) {
      if (am.isWifi(paramContext)) {
        i = 1;
      }
    }
    for (;;)
    {
      GMTrace.o(16583808253952L, 123559);
      return i;
      if (am.is2G(paramContext))
      {
        i = 2;
      }
      else if (am.is3G(paramContext))
      {
        i = 3;
      }
      else if (am.is4G(paramContext))
      {
        i = 4;
      }
      else
      {
        i = 0;
        continue;
        i = -1;
      }
    }
  }
  
  public static boolean cQ(Context paramContext)
  {
    GMTrace.i(15384841289728L, 114626);
    Object localObject = ((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1);
    if ((localObject != null) && (!((List)localObject).isEmpty()))
    {
      localObject = ((ActivityManager.RunningTaskInfo)((List)localObject).get(0)).topActivity;
      w.d("MicroMsg.WalletOfflineUtil", "topActivity:" + ((ComponentName)localObject).flattenToString());
      if (!((ComponentName)localObject).getPackageName().equals(paramContext.getPackageName()))
      {
        w.i("MicroMsg.WalletOfflineUtil", "is in backGround.");
        GMTrace.o(15384841289728L, 114626);
        return false;
      }
    }
    if (((KeyguardManager)ab.getContext().getSystemService("keyguard")).inKeyguardRestrictedInputMode())
    {
      GMTrace.o(15384841289728L, 114626);
      return false;
    }
    w.i("MicroMsg.WalletOfflineUtil", "is in foreGround.");
    GMTrace.o(15384841289728L, 114626);
    return true;
  }
  
  public static void cW(Context paramContext)
  {
    GMTrace.i(6244748230656L, 46527);
    String str = v.bMQ();
    if ("zh_CN".equals(str)) {
      str = paramContext.getString(R.l.eOc);
    }
    for (;;)
    {
      ap(paramContext, str);
      GMTrace.o(6244748230656L, 46527);
      return;
      if ("zh_TW".equals(str)) {
        str = paramContext.getString(R.l.eOf);
      } else if ("zh_HK".equals(str)) {
        str = paramContext.getString(R.l.eOe);
      } else {
        str = paramContext.getResources().getString(R.l.eOd);
      }
    }
  }
  
  public static void e(Activity paramActivity, int paramInt)
  {
    GMTrace.i(6245956190208L, 46536);
    a(paramActivity, paramInt, -1);
    GMTrace.o(6245956190208L, 46536);
  }
  
  public static void f(Activity paramActivity, int paramInt)
  {
    GMTrace.i(6246224625664L, 46538);
    a(paramActivity, "create", paramActivity.getString(R.l.faf), 0, paramInt);
    GMTrace.o(6246224625664L, 46538);
  }
  
  public static List<Bankcard> gx(boolean paramBoolean)
  {
    GMTrace.i(6243674488832L, 46519);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = m.bwE().iJ(true);
    int i = 0;
    if (i < localArrayList2.size())
    {
      Bankcard localBankcard = (Bankcard)localArrayList2.get(i);
      if (paramBoolean) {
        localArrayList1.add(localBankcard);
      }
      for (;;)
      {
        i += 1;
        break;
        localArrayList1.add(localBankcard);
      }
    }
    w.i("MicroMsg.WalletOfflineUtil", "getBindBankCardList() list size is " + localArrayList1.size());
    GMTrace.o(6243674488832L, 46519);
    return localArrayList1;
  }
  
  public static void i(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(6247432585216L, 46547);
    opW = paramString1;
    opX = paramString2;
    opZ = paramString3;
    oqa = paramString4;
    Du(opZ);
    ap.wT().a(new bb(new bb.a()
    {
      public final void a(com.tencent.mm.network.e paramAnonymouse)
      {
        GMTrace.i(6242063876096L, 46507);
        if ((paramAnonymouse == null) || (paramAnonymouse.DY() == null))
        {
          GMTrace.o(6242063876096L, 46507);
          return;
        }
        if (a.opW != null) {
          paramAnonymouse.DY().g("offline_token", a.opW.getBytes());
        }
        if (a.opX != null) {
          paramAnonymouse.DY().g("offline_token_V2", a.opX.getBytes());
        }
        if (a.oqa != null) {
          paramAnonymouse.DY().g("offline_key_list", a.oqa.getBytes());
        }
        GMTrace.o(6242063876096L, 46507);
      }
    }), 0);
    GMTrace.o(6247432585216L, 46547);
  }
  
  private static LinkedList<a> q(JSONArray paramJSONArray)
  {
    GMTrace.i(6248237891584L, 46553);
    if (paramJSONArray.length() == 0)
    {
      GMTrace.o(6248237891584L, 46553);
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    while (i < paramJSONArray.length())
    {
      JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
      if (localJSONObject != null)
      {
        a locala = new a();
        locala.oqk = localJSONObject.optInt("card_id");
        locala.oql = localJSONObject.optString("bank_type");
        locala.oqm = localJSONObject.optString("bind_serial");
        locala.oqn = localJSONObject.optString("forbid_word");
        localLinkedList.add(locala);
      }
      i += 1;
    }
    GMTrace.o(6248237891584L, 46553);
    return localLinkedList;
  }
  
  private static LinkedList<b> r(JSONArray paramJSONArray)
  {
    GMTrace.i(6249445851136L, 46562);
    if (paramJSONArray.length() == 0)
    {
      GMTrace.o(6249445851136L, 46562);
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    while (i < paramJSONArray.length())
    {
      JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
      if (localJSONObject != null)
      {
        b localb = new b();
        localb.oql = localJSONObject.optString("bank_type");
        localb.oqo = localJSONObject.optString("icon_url");
        localLinkedList.add(localb);
      }
      i += 1;
    }
    GMTrace.o(6249445851136L, 46562);
    return localLinkedList;
  }
  
  public static void rV(int paramInt)
  {
    GMTrace.i(6244077142016L, 46522);
    com.tencent.mm.plugin.offline.k.aTF();
    com.tencent.mm.plugin.offline.k.ag(196640, String.valueOf(paramInt));
    GMTrace.o(6244077142016L, 46522);
  }
  
  public static void rW(int paramInt)
  {
    GMTrace.i(6244211359744L, 46523);
    com.tencent.mm.plugin.offline.k.aTF();
    com.tencent.mm.plugin.offline.k.ag(196642, String.valueOf(paramInt));
    GMTrace.o(6244211359744L, 46523);
  }
  
  public static void rX(int paramInt)
  {
    GMTrace.i(6247029932032L, 46544);
    com.tencent.mm.plugin.offline.k.aTF();
    com.tencent.mm.plugin.offline.k.ag(196644, String.valueOf(paramInt));
    GMTrace.o(6247029932032L, 46544);
  }
  
  public static void rY(int paramInt)
  {
    GMTrace.i(16583271383040L, 123555);
    int i = paramInt;
    if (paramInt < 0) {
      i = 0;
    }
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.vcW, Integer.valueOf(i));
    GMTrace.o(16583271383040L, 123555);
  }
  
  public static boolean ul(String paramString)
  {
    GMTrace.i(6245016666112L, 46529);
    if (paramString == null)
    {
      GMTrace.o(6245016666112L, 46529);
      return false;
    }
    boolean bool = Pattern.compile("[0-9]*").matcher(paramString).matches();
    GMTrace.o(6245016666112L, 46529);
    return bool;
  }
  
  public static final class a
  {
    public int oqk;
    public String oql;
    public String oqm;
    public String oqn;
    
    public a()
    {
      GMTrace.i(6242734964736L, 46512);
      GMTrace.o(6242734964736L, 46512);
    }
  }
  
  public static final class b
  {
    public String oql;
    public String oqo;
    
    public b()
    {
      GMTrace.i(6240990134272L, 46499);
      GMTrace.o(6240990134272L, 46499);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/offline/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */