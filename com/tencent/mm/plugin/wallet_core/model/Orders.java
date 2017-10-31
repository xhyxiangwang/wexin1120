package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet.a.a;
import com.tencent.mm.plugin.wallet.a.c;
import com.tencent.mm.plugin.wallet.a.f;
import com.tencent.mm.plugin.wallet.a.g;
import com.tencent.mm.plugin.wallet.a.h;
import com.tencent.mm.plugin.wallet.a.k;
import com.tencent.mm.plugin.wallet.a.l;
import com.tencent.mm.pluginsdk.l.a;
import com.tencent.mm.pluginsdk.l.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Orders
  implements Parcelable
{
  public static final Parcelable.Creator<Orders> CREATOR;
  public static int rPv;
  public static int rPw;
  public String fAF;
  public String fvS;
  public String kFf;
  public String lpQ;
  public double oVZ;
  public String oiq;
  public String ori;
  public int rKN;
  public String rMv;
  public long rOQ;
  public double rOR;
  public double rOS;
  public int rOT;
  public String rOU;
  public int rOV;
  public String rOW;
  public String rOX;
  public String rOY;
  public String rOZ;
  public int rPa;
  public boolean rPb;
  public String rPc;
  public long rPd;
  public String rPe;
  public String rPf;
  public Set<String> rPg;
  public int rPh;
  public String rPi;
  public List<Commodity> rPj;
  public f rPk;
  public int rPl;
  public String rPm;
  public String rPn;
  public DeductInfo rPo;
  public long rPp;
  public long rPq;
  public int rPr;
  public int rPs;
  public int rPt;
  public String rPu;
  public String token;
  public String username;
  
  static
  {
    GMTrace.i(6879329648640L, 51255);
    CREATOR = new Parcelable.Creator() {};
    rPv = 0;
    rPw = 1;
    GMTrace.o(6879329648640L, 51255);
  }
  
  public Orders()
  {
    GMTrace.i(6877853253632L, 51244);
    this.fAF = "";
    this.token = "";
    this.kFf = "0";
    this.rOR = 0.0D;
    this.rOS = 0.0D;
    this.rPb = false;
    this.rPc = "";
    this.lpQ = "";
    this.rPd = 0L;
    this.rPe = "";
    this.rPg = new HashSet();
    this.rPh = 0;
    this.rPi = "";
    this.rPj = new ArrayList();
    this.rPk = new f();
    this.rPl = 0;
    this.rPm = "";
    this.rPn = "";
    this.rPr = 0;
    this.rPs = 0;
    this.rPt = 0;
    this.rPu = "";
    GMTrace.o(6877853253632L, 51244);
  }
  
  public Orders(Parcel paramParcel)
  {
    GMTrace.i(6879061213184L, 51253);
    this.fAF = "";
    this.token = "";
    this.kFf = "0";
    this.rOR = 0.0D;
    this.rOS = 0.0D;
    this.rPb = false;
    this.rPc = "";
    this.lpQ = "";
    this.rPd = 0L;
    this.rPe = "";
    this.rPg = new HashSet();
    this.rPh = 0;
    this.rPi = "";
    this.rPj = new ArrayList();
    this.rPk = new f();
    this.rPl = 0;
    this.rPm = "";
    this.rPn = "";
    this.rPr = 0;
    this.rPs = 0;
    this.rPt = 0;
    this.rPu = "";
    this.rOQ = paramParcel.readLong();
    this.fAF = paramParcel.readString();
    this.token = paramParcel.readString();
    this.kFf = paramParcel.readString();
    this.rOR = paramParcel.readDouble();
    this.rKN = paramParcel.readInt();
    this.ori = paramParcel.readString();
    this.oVZ = paramParcel.readDouble();
    this.rOS = paramParcel.readDouble();
    this.rOT = paramParcel.readInt();
    this.rMv = paramParcel.readString();
    this.rOU = paramParcel.readString();
    this.rOV = paramParcel.readInt();
    this.rOW = paramParcel.readString();
    this.username = paramParcel.readString();
    this.fvS = paramParcel.readString();
    this.oiq = paramParcel.readString();
    this.rOX = paramParcel.readString();
    this.rOY = paramParcel.readString();
    this.rOZ = paramParcel.readString();
    this.rPa = paramParcel.readInt();
    if (paramParcel.readInt() == 1) {}
    for (;;)
    {
      this.rPb = bool;
      this.rPc = paramParcel.readString();
      this.lpQ = paramParcel.readString();
      this.rPd = paramParcel.readLong();
      this.rPe = paramParcel.readString();
      paramParcel.readTypedList(this.rPj, Commodity.CREATOR);
      this.rPf = paramParcel.readString();
      this.rPg = Jm(this.rPf);
      this.rPh = paramParcel.readInt();
      this.rPi = paramParcel.readString();
      this.rPo = ((DeductInfo)paramParcel.readParcelable(DeductInfo.class.getClassLoader()));
      this.rPr = paramParcel.readInt();
      this.rPs = paramParcel.readInt();
      GMTrace.o(6879061213184L, 51253);
      return;
      bool = false;
    }
  }
  
  private static HashSet<String> Jm(String paramString)
  {
    GMTrace.i(6878926995456L, 51252);
    HashSet localHashSet = new HashSet();
    if (!bg.mZ(paramString))
    {
      paramString = paramString.split("\\|");
      int j = paramString.length;
      int i = 0;
      while (i < j)
      {
        localHashSet.add(paramString[i]);
        i += 1;
      }
      if (localHashSet.size() <= 0) {
        break label81;
      }
      localHashSet.retainAll(localHashSet);
    }
    for (;;)
    {
      GMTrace.o(6878926995456L, 51252);
      return localHashSet;
      label81:
      localHashSet.clear();
    }
  }
  
  public static Orders O(JSONObject paramJSONObject)
  {
    bool = true;
    GMTrace.i(6877987471360L, 51245);
    localOrders = null;
    if (paramJSONObject != null) {
      localOrders = new Orders();
    }
    try
    {
      localOrders.rOQ = bg.Pp();
      localOrders.rOR = (paramJSONObject.getDouble("total_fee") / 100.0D);
      localOrders.kFf = paramJSONObject.getString("num");
      localOrders.rKN = paramJSONObject.optInt("bank_card_tag", 1);
      localOrders.ori = paramJSONObject.optString("fee_type", "");
      localOrders.oVZ = (paramJSONObject.optDouble("charge_fee", 0.0D) / 100.0D);
      localOrders.rOS = (paramJSONObject.optDouble("fetch_fee", 0.0D) / 100.0D);
      localOrders.rOT = paramJSONObject.optInt("is_assign_userinfo_pay");
      localOrders.rMv = paramJSONObject.optString("true_name");
      localOrders.rOU = paramJSONObject.optString("cre_id");
      localOrders.rOV = paramJSONObject.optInt("ce_type");
      localOrders.rOW = paramJSONObject.optString("assign_pay_info");
      localObject1 = paramJSONObject.getJSONArray("Array");
      localOrders.rPp = paramJSONObject.optLong("free_fee");
      localOrders.rPq = paramJSONObject.optLong("remain_fee");
      localOrders.rPr = paramJSONObject.optInt("not_support_bind_card", 0);
      localOrders.rPs = paramJSONObject.optInt("not_support_retry", 0);
      if (paramJSONObject.optInt("support_all_bank", 0) != 1) {
        break label897;
      }
      i = 1;
    }
    catch (JSONException paramJSONObject)
    {
      for (;;)
      {
        int i;
        int k;
        int j;
        Object localObject2;
        Commodity localCommodity;
        w.printErrStackTrace("MicroMsg.Orders", paramJSONObject, "", new Object[0]);
        continue;
        Object localObject1 = ((JSONObject)localObject1).optJSONObject("user_info");
        if (localObject1 == null)
        {
          w.e("MicroMsg.Orders", "user_info is null ");
        }
        else
        {
          localObject1 = ((JSONObject)localObject1).optJSONObject("touch_info");
          if (localObject1 == null)
          {
            w.e("MicroMsg.Orders", "touch_info is null ");
          }
          else
          {
            if (l.a.sRt.ayC())
            {
              i = ((JSONObject)localObject1).optInt("use_touch_pay", 0);
              localOrders.rPh = i;
              localOrders.rPi = ((JSONObject)localObject1).optString("touch_forbidword");
              localObject2 = ((JSONObject)localObject1).optString("touch_challenge");
              if (1 != ((JSONObject)localObject1).optInt("need_change_auth_key")) {
                break label884;
              }
            }
            for (;;)
            {
              q.rQG.lZc = ((String)localObject2);
              q.rQG.lZd = bool;
              w.i("MicroMsg.Orders", "hy: use_touch_pay is %s, challenge is: %s, is need change: %b", new Object[] { Integer.valueOf(localOrders.rPh), localObject2, Boolean.valueOf(bool) });
              break;
              i = 0;
              break label782;
              bool = false;
            }
            j += 1;
            continue;
            i = 0;
          }
        }
      }
    }
    if (i != 0) {
      localOrders.rPg = new HashSet();
    }
    k = ((JSONArray)localObject1).length();
    j = 0;
    if (j < k)
    {
      localObject2 = ((JSONArray)localObject1).getJSONObject(j);
      localCommodity = new Commodity();
      localCommodity.desc = ((JSONObject)localObject2).getString("desc");
      localCommodity.kKX = (((JSONObject)localObject2).getInt("fee") / 100.0D);
      localCommodity.oqZ = ((JSONObject)localObject2).optInt("count", 1);
      localCommodity.orb = ((JSONObject)localObject2).getString("pay_status");
      localCommodity.org = ((JSONObject)localObject2).optString("buy_bank_name");
      localCommodity.orc = ((JSONObject)localObject2).getString("pay_status_name");
      localCommodity.oqW = ((JSONObject)localObject2).optString("spid");
      localCommodity.oqX = ((JSONObject)localObject2).optString("sp_name");
      localCommodity.ore = ((JSONObject)localObject2).optInt("modify_timestamp");
      localCommodity.fKK = ((JSONObject)localObject2).getString("transaction_id");
      localCommodity.ori = ((JSONObject)localObject2).optString("fee_type");
      if (bg.mZ(localOrders.ori)) {
        localOrders.ori = localCommodity.ori;
      }
      localCommodity.orj = ((JSONObject)localObject2).optString("appusername");
      localCommodity.oqL = ((JSONObject)localObject2).optString("app_telephone");
      localOrders.rPj.add(localCommodity);
      if (i == 0)
      {
        localOrders.rPf = ((JSONObject)localObject2).optString("support_bank");
        localOrders.rPg = Jm(localOrders.rPf);
      }
    }
    else
    {
      if (paramJSONObject.has("is_open_fee_protocal")) {}
      for (localOrders.rPb = com.tencent.mm.wallet_core.ui.e.g(paramJSONObject, "is_open_fee_protocal");; localOrders.rPb = Bankcard.dv(localOrders.rKN, 2))
      {
        localOrders.rPk = P(paramJSONObject);
        localObject1 = paramJSONObject.optJSONObject("bindqueryresp");
        if (localObject1 != null) {
          break;
        }
        w.e("MicroMsg.Orders", "bindqueryresp is null ");
        localOrders.rPl = paramJSONObject.optInt("needbindcardtoshowfavinfo");
        localOrders.rPm = paramJSONObject.optString("discount_wording");
        localOrders.rPn = paramJSONObject.optString("favor_rule_wording");
        a(localOrders, paramJSONObject.optJSONObject("entrustpayinfo"));
        GMTrace.o(6877987471360L, 51245);
        return localOrders;
      }
    }
  }
  
  private static f P(JSONObject paramJSONObject)
  {
    GMTrace.i(6878121689088L, 51246);
    f localf = new f();
    paramJSONObject = paramJSONObject.optJSONObject("favinfo");
    if (paramJSONObject == null)
    {
      w.d("MicroMsg.Orders", "Parse getJsonObject(favinfo) null");
      GMTrace.o(6878121689088L, 51246);
      return localf;
    }
    localf.rFO = (paramJSONObject.optLong("tradeAmount") / 100.0D);
    localf.rFP = (paramJSONObject.optLong("totalFavAmount") / 100.0D);
    localf.rFQ = (paramJSONObject.optLong("afterFavorTradeAmount") / 100.0D);
    localf.rFR = paramJSONObject.optString("favorComposeId");
    localf.rFU = paramJSONObject.optInt("useNaturalDefense");
    localf.rFV = paramJSONObject.optString("discountWording");
    localf.rFW = paramJSONObject.optString("favorRuleWording");
    localf.rFX = (paramJSONObject.optDouble("showFavorAmount", 0.0D) / 100.0D);
    localf.rFY = (paramJSONObject.optDouble("invariableFavorAmount", 0.0D) / 100.0D);
    localf.rFZ = paramJSONObject.optInt("isVariableFavor");
    localf.rGa = paramJSONObject.optString("invariableFavorDesc");
    localf.rGb = paramJSONObject.optString("variableFavorDesc");
    Object localObject1 = paramJSONObject.optJSONArray("tradeFavList");
    int i = 0;
    Object localObject3;
    Object localObject2;
    int j;
    Object localObject4;
    while (i < ((JSONArray)localObject1).length())
    {
      localObject3 = ((JSONArray)localObject1).getJSONObject(i);
      localObject2 = new com.tencent.mm.plugin.wallet.a.q();
      ((com.tencent.mm.plugin.wallet.a.q)localObject2).rGz = ((JSONObject)localObject3).optInt("favType");
      ((com.tencent.mm.plugin.wallet.a.q)localObject2).rGA = ((JSONObject)localObject3).optInt("favSubType");
      ((com.tencent.mm.plugin.wallet.a.q)localObject2).rGB = ((JSONObject)localObject3).optLong("favProperty");
      ((com.tencent.mm.plugin.wallet.a.q)localObject2).rGC = ((JSONObject)localObject3).optString("favorTypeDesc");
      ((com.tencent.mm.plugin.wallet.a.q)localObject2).rFL = ((JSONObject)localObject3).optString("favId");
      ((com.tencent.mm.plugin.wallet.a.q)localObject2).rGD = ((JSONObject)localObject3).optString("favName");
      ((com.tencent.mm.plugin.wallet.a.q)localObject2).rGE = ((JSONObject)localObject3).optString("favDesc");
      ((com.tencent.mm.plugin.wallet.a.q)localObject2).rFM = ((JSONObject)localObject3).optString("favorUseManual");
      ((com.tencent.mm.plugin.wallet.a.q)localObject2).rFN = ((JSONObject)localObject3).optString("favorRemarks");
      ((com.tencent.mm.plugin.wallet.a.q)localObject2).rGF = (((JSONObject)localObject3).optLong("favPrice") / 100.0D);
      ((com.tencent.mm.plugin.wallet.a.q)localObject2).rGG = (((JSONObject)localObject3).optLong("realFavFee") / 100.0D);
      ((com.tencent.mm.plugin.wallet.a.q)localObject2).rGH = ((JSONObject)localObject3).optInt("needBankPay");
      ((com.tencent.mm.plugin.wallet.a.q)localObject2).rGI = ((JSONObject)localObject3).optString("bankNo");
      ((com.tencent.mm.plugin.wallet.a.q)localObject2).org = ((JSONObject)localObject3).optString("bankName");
      ((com.tencent.mm.plugin.wallet.a.q)localObject2).rGJ = ((JSONObject)localObject3).optString("bankLogoUrl");
      localObject3 = ((JSONObject)localObject3).optJSONArray("bind_serial_list");
      if ((localObject3 != null) && (((JSONArray)localObject3).length() > 0))
      {
        j = 0;
        while (j < ((JSONArray)localObject3).length())
        {
          localObject4 = ((JSONArray)localObject3).optString(j);
          ((com.tencent.mm.plugin.wallet.a.q)localObject2).rGK.add(com.tencent.mm.bl.b.aW(((String)localObject4).getBytes()));
          j += 1;
        }
      }
      localf.rFS.add(localObject2);
      i += 1;
    }
    localObject1 = paramJSONObject.optJSONObject("favorComposeList");
    Object localObject5;
    if (localObject1 != null)
    {
      localf.rFT = new g();
      localObject1 = ((JSONObject)localObject1).optJSONArray("favorComposeInfo");
      i = 0;
      while (i < ((JSONArray)localObject1).length())
      {
        localObject3 = ((JSONArray)localObject1).getJSONObject(i);
        localObject2 = new h();
        ((h)localObject2).rGf = ((JSONObject)localObject3).optString("faovrComposeId");
        ((h)localObject2).rGg = (((JSONObject)localObject3).optLong("totalFavorAmount") / 100.0D);
        ((h)localObject2).rFQ = (((JSONObject)localObject3).optLong("afterFavorTradeAmount") / 100.0D);
        ((h)localObject2).rFX = (((JSONObject)localObject3).optDouble("showFavorAmount", 0.0D) / 100.0D);
        ((h)localObject2).rFY = (((JSONObject)localObject3).optDouble("invariableFavorAmount", 0.0D) / 100.0D);
        ((h)localObject2).rFZ = ((JSONObject)localObject3).optInt("isVariableFavor");
        ((h)localObject2).rGa = ((JSONObject)localObject3).optString("invariableFavorDesc");
        ((h)localObject2).rGb = ((JSONObject)localObject3).optString("variableFavorDesc");
        localObject3 = ((JSONObject)localObject3).optJSONArray("composeArray");
        j = 0;
        while (j < ((JSONArray)localObject3).length())
        {
          localObject4 = ((JSONArray)localObject3).getJSONObject(j);
          localObject5 = new com.tencent.mm.plugin.wallet.a.e();
          ((com.tencent.mm.plugin.wallet.a.e)localObject5).rFL = ((JSONObject)localObject4).optString("favId");
          ((com.tencent.mm.plugin.wallet.a.e)localObject5).rFM = ((JSONObject)localObject4).optString("favorUseManual");
          ((com.tencent.mm.plugin.wallet.a.e)localObject5).rFN = ((JSONObject)localObject4).optString("favorRemarks");
          ((h)localObject2).rGh.add(localObject5);
          j += 1;
        }
        localf.rFT.rGd.add(localObject2);
        i += 1;
      }
    }
    localObject1 = new a();
    paramJSONObject = paramJSONObject.optJSONObject("bank_card_info");
    if (paramJSONObject != null)
    {
      localObject2 = paramJSONObject.optJSONArray("bind_serial_favor_info_list");
      if (localObject2 != null)
      {
        i = 0;
        while (i < ((JSONArray)localObject2).length())
        {
          localObject3 = new com.tencent.mm.plugin.wallet.a.b();
          localObject4 = ((JSONArray)localObject2).getJSONObject(i);
          ((com.tencent.mm.plugin.wallet.a.b)localObject3).oqm = ((JSONObject)localObject4).optString("bind_serial");
          localObject4 = ((JSONObject)localObject4).optJSONArray("bind_serial_favor_list");
          if ((localObject4 != null) && (((JSONArray)localObject4).length() > 0))
          {
            j = 0;
            while (j < ((JSONArray)localObject4).length())
            {
              localObject5 = new c();
              JSONObject localJSONObject = ((JSONArray)localObject4).optJSONObject(j);
              ((c)localObject5).rFJ = localJSONObject.optString("favor_desc");
              ((c)localObject5).rFK = localJSONObject.optInt("is_default_show", 0);
              ((com.tencent.mm.plugin.wallet.a.b)localObject3).rFI.add(localObject5);
              j += 1;
            }
          }
          ((a)localObject1).rFG.add(localObject3);
          i += 1;
        }
      }
      paramJSONObject = paramJSONObject.optJSONObject("new_bind_card_info").optJSONArray("new_bind_card_favor_list");
      if ((paramJSONObject != null) && (paramJSONObject.length() > 0))
      {
        ((a)localObject1).rFH = new k();
        i = 0;
        while (i < paramJSONObject.length())
        {
          localObject2 = new l();
          ((l)localObject2).rFJ = paramJSONObject.optJSONObject(i).optString("favor_desc");
          ((a)localObject1).rFH.rGm.add(localObject2);
          i += 1;
        }
      }
    }
    localf.rGc = ((a)localObject1);
    GMTrace.o(6878121689088L, 51246);
    return localf;
  }
  
  public static Orders a(JSONObject paramJSONObject, Orders paramOrders)
  {
    GMTrace.i(6878255906816L, 51247);
    if ((paramJSONObject != null) && (paramOrders != null)) {}
    for (;;)
    {
      Object localObject1;
      int i;
      try
      {
        localObject1 = paramJSONObject.optJSONObject("appservice");
        if (localObject1 != null)
        {
          paramOrders.rOY = ((JSONObject)localObject1).optString("app_recommend_desc");
          paramOrders.rOZ = ((JSONObject)localObject1).optString("app_telephone");
          paramOrders.rPa = ((JSONObject)localObject1).optInt("recommend_level", 2);
          paramOrders.lpQ = ((JSONObject)localObject1).optString("share_to_friends_url");
        }
        int j = paramOrders.rPa;
        localObject1 = paramOrders.rPj;
        paramOrders.rPc = paramJSONObject.optString("pay_result_tips");
        JSONArray localJSONArray = paramJSONObject.getJSONArray("payresult");
        int k = localJSONArray.length();
        i = 0;
        if (i < k)
        {
          JSONObject localJSONObject = localJSONArray.getJSONObject(i);
          Object localObject2;
          if ((localObject1 != null) && (((List)localObject1).size() == 1))
          {
            localObject2 = (Commodity)((List)localObject1).get(0);
            ((Commodity)localObject2).rPE = new ArrayList();
            ((Commodity)localObject2).rPA = new ArrayList();
            ((Commodity)localObject2).fKK = localJSONObject.getString("transaction_id");
            a((Commodity)localObject2, localJSONObject, j);
          }
          else if (localObject1 != null)
          {
            localObject2 = localJSONObject.getString("transaction_id");
            Iterator localIterator = ((List)localObject1).iterator();
            if (localIterator.hasNext())
            {
              Commodity localCommodity = (Commodity)localIterator.next();
              if ((localObject2 == null) || (!((String)localObject2).equals(localCommodity.fKK))) {
                continue;
              }
              a(localCommodity, localJSONObject, j);
            }
          }
        }
      }
      catch (JSONException paramJSONObject)
      {
        w.printErrStackTrace("MicroMsg.Orders", paramJSONObject, "", new Object[0]);
      }
      for (;;)
      {
        GMTrace.o(6878255906816L, 51247);
        return paramOrders;
        localObject1 = paramJSONObject.optJSONObject("extinfo");
        if (localObject1 != null)
        {
          paramOrders.rPd = (((JSONObject)localObject1).optLong("fetch_pre_arrive_time") * 1000L);
          paramOrders.rPe = ((JSONObject)localObject1).optString("fetch_pre_arrive_time_wording");
        }
        paramOrders.rPt = paramJSONObject.optInt("is_use_new_paid_succ_page", 0);
        paramOrders.rPu = paramJSONObject.optString("pay_succ_btn_wording");
        continue;
        w.w("MicroMsg.Orders", "oldOrders is null");
      }
      i += 1;
    }
  }
  
  private static void a(Commodity paramCommodity, JSONObject paramJSONObject, int paramInt)
  {
    int i = 0;
    GMTrace.i(6878390124544L, 51248);
    paramCommodity.orn = paramJSONObject.optString("discount");
    paramCommodity.orb = paramJSONObject.getString("pay_status");
    paramCommodity.orc = paramJSONObject.getString("pay_status_name");
    paramCommodity.org = paramJSONObject.optString("buy_bank_name");
    paramCommodity.ore = paramJSONObject.optInt("pay_timestamp");
    paramCommodity.rPz = paramJSONObject.optString("card_tail");
    paramCommodity.rPa = paramInt;
    paramCommodity.rPB = paramJSONObject.optString("rateinfo");
    paramCommodity.rPC = paramJSONObject.optString("original_feeinfo");
    if (paramJSONObject.has("total_fee")) {
      paramCommodity.kKX = (paramJSONObject.optDouble("total_fee", 0.0D) / 100.0D);
    }
    paramCommodity.rPx = (paramJSONObject.optDouble("original_total_fee", -1.0D) / 100.0D);
    paramCommodity.ori = paramJSONObject.optString("fee_type", "");
    Object localObject1 = paramJSONObject.optJSONObject("subscribe_biz_info");
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = new b();
      ((b)localObject2).type = rPv;
      ((b)localObject2).name = ((JSONObject)localObject1).optString("nickname");
      ((b)localObject2).orj = ((JSONObject)localObject1).optString("username");
      paramCommodity.rPy = ((b)localObject2).orj;
      ((b)localObject2).ovK = ((JSONObject)localObject1).optString("logo_round_url");
      ((b)localObject2).url = ((JSONObject)localObject1).optString("subscribe_biz_url");
      if ((!bg.mZ(((b)localObject2).name)) && (!bg.mZ(((b)localObject2).url)))
      {
        paramCommodity.rPE.add(localObject2);
        paramCommodity.rPF = true;
      }
    }
    localObject1 = paramJSONObject.getJSONArray("activity_info");
    int j = ((JSONArray)localObject1).length();
    paramInt = 0;
    Object localObject3;
    while (paramInt < j)
    {
      localObject2 = ((JSONArray)localObject1).getJSONObject(paramInt);
      localObject3 = new b();
      ((b)localObject3).type = rPw;
      ((b)localObject3).ovK = ((JSONObject)localObject2).optString("icon");
      ((b)localObject3).name = ((JSONObject)localObject2).optString("wording");
      ((b)localObject3).url = ((JSONObject)localObject2).optString("url");
      ((b)localObject3).rPL = ((JSONObject)localObject2).optString("btn_text");
      ((b)localObject3).rPM = ((JSONObject)localObject2).optInt("type");
      ((b)localObject3).title = ((JSONObject)localObject2).optString("title");
      ((b)localObject3).rPN = ((JSONObject)localObject2).optLong("activity_id");
      ((b)localObject3).rPO = ((JSONObject)localObject2).optInt("activity_type", 0);
      ((b)localObject3).rPS = ((JSONObject)localObject2).optString("small_title");
      ((b)localObject3).rPP = ((JSONObject)localObject2).optInt("award_id");
      ((b)localObject3).rPQ = ((JSONObject)localObject2).optInt("send_record_id");
      ((b)localObject3).rPR = ((JSONObject)localObject2).optInt("user_record_id");
      ((b)localObject3).rPT = ((JSONObject)localObject2).optString("activity_tinyapp_username");
      ((b)localObject3).rPU = ((JSONObject)localObject2).optString("activity_tinyapp_path");
      ((b)localObject3).rPV = ((JSONObject)localObject2).optLong("activity_mch_id");
      paramCommodity.rPE.add(localObject3);
      paramInt += 1;
    }
    localObject1 = paramJSONObject.optJSONObject("link_ativity_info");
    if (localObject1 != null)
    {
      paramCommodity.rPG.text = ((JSONObject)localObject1).optString("text");
      paramCommodity.rPG.url = ((JSONObject)localObject1).optString("url");
    }
    localObject1 = paramJSONObject.optJSONArray("discount_array");
    if (localObject1 != null)
    {
      j = ((JSONArray)localObject1).length();
      paramInt = i;
      while (paramInt < j)
      {
        localObject2 = ((JSONArray)localObject1).optJSONObject(paramInt);
        localObject3 = new DiscountInfo();
        if (localObject2 != null)
        {
          ((DiscountInfo)localObject3).rPK = ((JSONObject)localObject2).optDouble("payment_amount");
          ((DiscountInfo)localObject3).rFJ = ((JSONObject)localObject2).optString("favor_desc");
          paramCommodity.rPA.add(localObject3);
        }
        paramInt += 1;
      }
    }
    paramJSONObject = paramJSONObject.optJSONObject("tinyapp_info");
    if (paramJSONObject != null)
    {
      if (paramCommodity.rPD == null) {
        paramCommodity.rPD = new RecommendTinyAppInfo();
      }
      paramCommodity.rPD.rPW = paramJSONObject.optString("tinyapp_name");
      paramCommodity.rPD.rPX = paramJSONObject.optString("tinyapp_logo");
      paramCommodity.rPD.rPY = paramJSONObject.optString("tinyapp_desc");
      paramCommodity.rPD.rPZ = paramJSONObject.optString("tinyapp_username");
      paramCommodity.rPD.rQa = paramJSONObject.optString("tinyapp_path");
      paramCommodity.rPD.rQb = paramJSONObject.optString("activity_tinyapp_btn_text");
      paramCommodity.rPD.rQc = paramJSONObject.optLong("activity_id");
      paramCommodity.rPD.rQd = paramJSONObject.optLong("activity_type");
      paramCommodity.rPD.rQe = paramJSONObject.optLong("award_id");
      paramCommodity.rPD.rQf = paramJSONObject.optInt("send_record_id");
      paramCommodity.rPD.rQg = paramJSONObject.optInt("user_record_id");
      paramCommodity.rPD.rQh = paramJSONObject.optLong("activity_mch_id");
    }
    GMTrace.o(6878390124544L, 51248);
  }
  
  private static void a(Orders paramOrders, JSONObject paramJSONObject)
  {
    int i = 0;
    GMTrace.i(6878524342272L, 51249);
    if (paramJSONObject != null)
    {
      w.i("MicroMsg.Orders", "parseDeductInfo json is not null");
      paramOrders.rPo = new DeductInfo();
      paramOrders.rPo.title = paramJSONObject.optString("contract_title");
      paramOrders.rPo.desc = paramJSONObject.optString("contract_desc");
      paramOrders.rPo.rIu = paramJSONObject.optInt("auto_deduct_flag", 0);
      paramOrders.rPo.rPH = paramJSONObject.optString("contract_url");
      paramOrders.rPo.rPJ = paramJSONObject.optInt("is_select_pay_way", 0);
      paramOrders.rPo.rHM = paramJSONObject.optInt("deduct_show_type", 0);
      paramOrders.rPo.kpd = paramJSONObject.optString("button_wording", "");
      paramOrders.rPo.rHN = paramJSONObject.optString("deduct_rule_wording", "");
      paramJSONObject = paramJSONObject.optJSONArray("show_info");
      int j = paramJSONObject.length();
      if (j > 0)
      {
        paramOrders.rPo.rPI = new ArrayList();
        if (i < j)
        {
          JSONObject localJSONObject = paramJSONObject.optJSONObject(i);
          if (localJSONObject != null)
          {
            DeductShowInfo localDeductShowInfo = new DeductShowInfo();
            localDeductShowInfo.name = localJSONObject.optString("name");
            localDeductShowInfo.value = localJSONObject.optString("value");
            localDeductShowInfo.url = localJSONObject.optString("url");
            paramOrders.rPo.rPI.add(localDeductShowInfo);
          }
          for (;;)
          {
            i += 1;
            break;
            w.e("MicroMsg.Orders", "parseDeductInfo's showInfo get a null value from json,index=" + i);
          }
        }
        GMTrace.o(6878524342272L, 51249);
        return;
      }
      w.e("MicroMsg.Orders", "parseDeductInfo's showInfo len is " + j);
      GMTrace.o(6878524342272L, 51249);
      return;
    }
    w.i("MicroMsg.Orders", "parseDeductInfo json is null");
    GMTrace.o(6878524342272L, 51249);
  }
  
  public int describeContents()
  {
    GMTrace.i(6878792777728L, 51251);
    GMTrace.o(6878792777728L, 51251);
    return 0;
  }
  
  public String toString()
  {
    GMTrace.i(6878658560000L, 51250);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("reqKey:").append(this.fAF).append("\n");
    ((StringBuilder)localObject).append("token").append(this.token).append("\n");
    ((StringBuilder)localObject).append("num").append(this.kFf).append("\n");
    ((StringBuilder)localObject).append("totalFee").append(this.rOR).append("\n");
    localObject = ((StringBuilder)localObject).toString();
    GMTrace.o(6878658560000L, 51250);
    return (String)localObject;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(6879195430912L, 51254);
    paramParcel.writeLong(this.rOQ);
    paramParcel.writeString(this.fAF);
    paramParcel.writeString(this.token);
    paramParcel.writeString(this.kFf);
    paramParcel.writeDouble(this.rOR);
    paramParcel.writeInt(this.rKN);
    paramParcel.writeString(this.ori);
    paramParcel.writeDouble(this.oVZ);
    paramParcel.writeDouble(this.rOS);
    paramParcel.writeInt(this.rOT);
    paramParcel.writeString(this.rMv);
    paramParcel.writeString(this.rOU);
    paramParcel.writeInt(this.rOV);
    paramParcel.writeString(this.rOW);
    paramParcel.writeString(this.username);
    paramParcel.writeString(this.fvS);
    paramParcel.writeString(this.oiq);
    paramParcel.writeString(this.rOX);
    paramParcel.writeString(this.rOY);
    paramParcel.writeString(this.rOZ);
    paramParcel.writeInt(this.rPa);
    if (this.rPb) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.rPc);
      paramParcel.writeString(this.lpQ);
      paramParcel.writeLong(this.rPd);
      paramParcel.writeString(this.rPe);
      paramParcel.writeTypedList(this.rPj);
      paramParcel.writeString(this.rPf);
      paramParcel.writeInt(this.rPh);
      paramParcel.writeString(this.rPi);
      paramParcel.writeParcelable(this.rPo, 1);
      paramParcel.writeInt(this.rPr);
      paramParcel.writeInt(this.rPs);
      GMTrace.o(6879195430912L, 51254);
      return;
    }
  }
  
  public static class Commodity
    implements Parcelable
  {
    public static final Parcelable.Creator<Commodity> CREATOR;
    public String desc;
    public String fKK;
    public double kKX;
    public String oqL;
    public String oqU;
    public String oqV;
    public String oqW;
    public String oqX;
    public String oqZ;
    public String orb;
    public String orc;
    public int ore;
    public String org;
    public String ori;
    public String orj;
    public String orn;
    public List<Orders.DiscountInfo> rPA;
    public String rPB;
    public String rPC;
    public Orders.RecommendTinyAppInfo rPD;
    public List<Orders.b> rPE;
    public boolean rPF;
    public Orders.a rPG;
    public int rPa;
    public double rPx;
    public String rPy;
    public String rPz;
    
    static
    {
      GMTrace.i(6892348768256L, 51352);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(6892348768256L, 51352);
    }
    
    public Commodity()
    {
      GMTrace.i(6891946115072L, 51349);
      this.kKX = 0.0D;
      this.rPx = 0.0D;
      this.rPA = new ArrayList();
      this.rPD = null;
      this.rPE = new ArrayList();
      this.rPF = false;
      this.rPG = new Orders.a();
      GMTrace.o(6891946115072L, 51349);
    }
    
    public Commodity(Parcel paramParcel)
    {
      GMTrace.i(6892080332800L, 51350);
      this.kKX = 0.0D;
      this.rPx = 0.0D;
      this.rPA = new ArrayList();
      this.rPD = null;
      this.rPE = new ArrayList();
      this.rPF = false;
      this.rPG = new Orders.a();
      this.oqU = paramParcel.readString();
      this.oqV = paramParcel.readString();
      this.oqW = paramParcel.readString();
      this.oqX = paramParcel.readString();
      this.desc = paramParcel.readString();
      this.oqZ = paramParcel.readString();
      this.kKX = paramParcel.readDouble();
      this.orb = paramParcel.readString();
      this.orc = paramParcel.readString();
      this.ore = paramParcel.readInt();
      this.fKK = paramParcel.readString();
      this.org = paramParcel.readString();
      this.ori = paramParcel.readString();
      this.orj = paramParcel.readString();
      this.oqL = paramParcel.readString();
      this.rPz = paramParcel.readString();
      this.orn = paramParcel.readString();
      paramParcel.readTypedList(this.rPA, Orders.DiscountInfo.CREATOR);
      this.rPB = paramParcel.readString();
      this.rPC = paramParcel.readString();
      this.rPD = ((Orders.RecommendTinyAppInfo)paramParcel.readParcelable(Orders.RecommendTinyAppInfo.class.getClassLoader()));
      GMTrace.o(6892080332800L, 51350);
    }
    
    public int describeContents()
    {
      GMTrace.i(6891811897344L, 51348);
      GMTrace.o(6891811897344L, 51348);
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(6892214550528L, 51351);
      paramParcel.writeString(this.oqU);
      paramParcel.writeString(this.oqV);
      paramParcel.writeString(this.oqW);
      paramParcel.writeString(this.oqX);
      paramParcel.writeString(this.desc);
      paramParcel.writeString(this.oqZ);
      paramParcel.writeDouble(this.kKX);
      paramParcel.writeString(this.orb);
      paramParcel.writeString(this.orc);
      paramParcel.writeInt(this.ore);
      paramParcel.writeString(this.fKK);
      paramParcel.writeString(this.org);
      paramParcel.writeString(this.ori);
      paramParcel.writeString(this.orj);
      paramParcel.writeString(this.oqL);
      paramParcel.writeString(this.rPz);
      paramParcel.writeString(this.orn);
      paramParcel.writeTypedList(this.rPA);
      paramParcel.writeString(this.rPB);
      paramParcel.writeString(this.rPC);
      paramParcel.writeParcelable(this.rPD, 0);
      GMTrace.o(6892214550528L, 51351);
    }
  }
  
  public static class DeductInfo
    implements Parcelable
  {
    public static final Parcelable.Creator<DeductInfo> CREATOR;
    public String desc;
    public String kpd;
    public int rHM;
    public String rHN;
    public int rIu;
    public String rPH;
    public List<Orders.DeductShowInfo> rPI;
    public int rPJ;
    public String title;
    
    static
    {
      GMTrace.i(6891677679616L, 51347);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(6891677679616L, 51347);
    }
    
    public DeductInfo()
    {
      GMTrace.i(6891140808704L, 51343);
      this.rPI = new ArrayList();
      GMTrace.o(6891140808704L, 51343);
    }
    
    public DeductInfo(Parcel paramParcel)
    {
      GMTrace.i(6891275026432L, 51344);
      this.rPI = new ArrayList();
      this.title = paramParcel.readString();
      this.desc = paramParcel.readString();
      this.rIu = paramParcel.readInt();
      this.rPH = paramParcel.readString();
      this.rPJ = paramParcel.readInt();
      paramParcel.readTypedList(this.rPI, Orders.DeductShowInfo.CREATOR);
      this.rHM = paramParcel.readInt();
      this.kpd = paramParcel.readString();
      this.rHN = paramParcel.readString();
      GMTrace.o(6891275026432L, 51344);
    }
    
    public int describeContents()
    {
      GMTrace.i(6891409244160L, 51345);
      GMTrace.o(6891409244160L, 51345);
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(6891543461888L, 51346);
      paramParcel.writeString(this.title);
      paramParcel.writeString(this.desc);
      paramParcel.writeInt(this.rIu);
      paramParcel.writeString(this.rPH);
      paramParcel.writeInt(this.rPJ);
      paramParcel.writeTypedList(this.rPI);
      paramParcel.writeInt(this.rHM);
      paramParcel.writeString(this.kpd);
      paramParcel.writeString(this.rHN);
      GMTrace.o(6891543461888L, 51346);
    }
  }
  
  public static class DeductShowInfo
    implements Parcelable
  {
    public static final Parcelable.Creator<DeductShowInfo> CREATOR;
    public String name;
    public String url;
    public String value;
    
    static
    {
      GMTrace.i(6864834134016L, 51147);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(6864834134016L, 51147);
    }
    
    public DeductShowInfo()
    {
      GMTrace.i(6864297263104L, 51143);
      GMTrace.o(6864297263104L, 51143);
    }
    
    protected DeductShowInfo(Parcel paramParcel)
    {
      GMTrace.i(6864431480832L, 51144);
      this.name = paramParcel.readString();
      this.value = paramParcel.readString();
      this.url = paramParcel.readString();
      GMTrace.o(6864431480832L, 51144);
    }
    
    public int describeContents()
    {
      GMTrace.i(6864565698560L, 51145);
      GMTrace.o(6864565698560L, 51145);
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(6864699916288L, 51146);
      paramParcel.writeString(this.name);
      paramParcel.writeString(this.value);
      paramParcel.writeString(this.url);
      GMTrace.o(6864699916288L, 51146);
    }
  }
  
  public static class DiscountInfo
    implements Parcelable
  {
    public static final Parcelable.Creator<DiscountInfo> CREATOR;
    public String rFJ;
    public double rPK;
    
    static
    {
      GMTrace.i(6886711623680L, 51310);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(6886711623680L, 51310);
    }
    
    public DiscountInfo()
    {
      GMTrace.i(6886174752768L, 51306);
      GMTrace.o(6886174752768L, 51306);
    }
    
    public DiscountInfo(Parcel paramParcel)
    {
      GMTrace.i(6886308970496L, 51307);
      this.rPK = paramParcel.readDouble();
      this.rFJ = paramParcel.readString();
      GMTrace.o(6886308970496L, 51307);
    }
    
    public int describeContents()
    {
      GMTrace.i(6886443188224L, 51308);
      GMTrace.o(6886443188224L, 51308);
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(6886577405952L, 51309);
      paramParcel.writeDouble(this.rPK);
      paramParcel.writeString(this.rFJ);
      GMTrace.o(6886577405952L, 51309);
    }
  }
  
  public static class RecommendTinyAppInfo
    implements Parcelable
  {
    public static final Parcelable.Creator<RecommendTinyAppInfo> CREATOR;
    public String rPW;
    public String rPX;
    public String rPY;
    public String rPZ;
    public String rQa;
    public String rQb;
    public long rQc;
    public long rQd;
    public long rQe;
    public int rQf;
    public int rQg;
    public long rQh;
    
    static
    {
      GMTrace.i(6865773658112L, 51154);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(6865773658112L, 51154);
    }
    
    public RecommendTinyAppInfo()
    {
      GMTrace.i(6865236787200L, 51150);
      GMTrace.o(6865236787200L, 51150);
    }
    
    public RecommendTinyAppInfo(Parcel paramParcel)
    {
      GMTrace.i(6865371004928L, 51151);
      this.rPW = paramParcel.readString();
      this.rPX = paramParcel.readString();
      this.rPY = paramParcel.readString();
      this.rPZ = paramParcel.readString();
      this.rQa = paramParcel.readString();
      GMTrace.o(6865371004928L, 51151);
    }
    
    public int describeContents()
    {
      GMTrace.i(6865505222656L, 51152);
      GMTrace.o(6865505222656L, 51152);
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(6865639440384L, 51153);
      paramParcel.writeString(this.rPW);
      paramParcel.writeString(this.rPX);
      paramParcel.writeString(this.rPY);
      paramParcel.writeString(this.rPZ);
      paramParcel.writeString(this.rQa);
      GMTrace.o(6865639440384L, 51153);
    }
  }
  
  public static final class a
  {
    public String text;
    public String url;
    
    public a()
    {
      GMTrace.i(6889261760512L, 51329);
      this.text = "";
      this.url = "";
      GMTrace.o(6889261760512L, 51329);
    }
  }
  
  public static final class b
  {
    public String name;
    public String orj;
    public String ovK;
    public String rPL;
    public int rPM;
    public long rPN;
    public int rPO;
    public int rPP;
    public int rPQ;
    public int rPR;
    public String rPS;
    public String rPT;
    public String rPU;
    public long rPV;
    public String title;
    public int type;
    public String url;
    
    public b()
    {
      GMTrace.i(6869129101312L, 51179);
      GMTrace.o(6869129101312L, 51179);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/Orders.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */