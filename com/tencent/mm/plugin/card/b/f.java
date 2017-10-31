package com.tencent.mm.plugin.card.b;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.protocal.c.afc;
import com.tencent.mm.protocal.c.au;
import com.tencent.mm.protocal.c.bbx;
import com.tencent.mm.protocal.c.bgn;
import com.tencent.mm.protocal.c.bkr;
import com.tencent.mm.protocal.c.jf;
import com.tencent.mm.protocal.c.jh;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.protocal.c.js;
import com.tencent.mm.protocal.c.nc;
import com.tencent.mm.protocal.c.pd;
import com.tencent.mm.protocal.c.pe;
import com.tencent.mm.protocal.c.pu;
import com.tencent.mm.protocal.c.tp;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
{
  public static void a(CardInfo paramCardInfo, String paramString)
  {
    GMTrace.i(5048465620992L, 37614);
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.CardInfoParser", "parserCardItemJson jsonContent is null");
      GMTrace.o(5048465620992L, 37614);
      return;
    }
    try
    {
      a(paramCardInfo, new JSONObject(paramString));
      GMTrace.o(5048465620992L, 37614);
      return;
    }
    catch (JSONException paramCardInfo)
    {
      w.printErrStackTrace("MicroMsg.CardInfoParser", paramCardInfo, "", new Object[0]);
      GMTrace.o(5048465620992L, 37614);
    }
  }
  
  private static void a(CardInfo paramCardInfo, JSONObject paramJSONObject)
  {
    GMTrace.i(5048599838720L, 37615);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.CardInfoParser", "parserCardItemJson json is null");
      GMTrace.o(5048599838720L, 37615);
      return;
    }
    paramCardInfo.field_card_id = ue(paramJSONObject.optString("card_id"));
    paramCardInfo.field_card_tp_id = ue(paramJSONObject.optString("card_tp_id"));
    paramCardInfo.field_delete_state_flag = paramJSONObject.optInt("state_flag");
    paramCardInfo.field_updateTime = paramJSONObject.optInt("update_time");
    paramCardInfo.field_updateSeq = paramJSONObject.optLong("sequence");
    paramCardInfo.field_from_username = paramJSONObject.optString("from_username");
    paramCardInfo.field_begin_time = paramJSONObject.optLong("begin_time", 0L);
    paramCardInfo.field_end_time = paramJSONObject.optLong("end_time", 0L);
    paramCardInfo.knu = paramJSONObject.optString("encrypt_code");
    JSONObject localJSONObject2 = paramJSONObject.optJSONObject("card_data_info");
    JSONObject localJSONObject1 = paramJSONObject.optJSONObject("card_tp_info");
    paramJSONObject = paramJSONObject.optJSONObject("share_info");
    paramCardInfo.kow = r(localJSONObject2);
    paramCardInfo.kov = s(localJSONObject1);
    paramCardInfo.kox = t(paramJSONObject);
    if (paramCardInfo.kov != null)
    {
      paramJSONObject = paramCardInfo.kov;
      paramCardInfo.kov = paramJSONObject;
    }
    try
    {
      paramCardInfo.field_cardTpInfoData = paramJSONObject.toByteArray();
      paramCardInfo.field_block_mask = Integer.toString(paramCardInfo.kov.tFd);
      paramCardInfo.field_card_type = paramCardInfo.kov.knq;
      if (TextUtils.isEmpty(paramCardInfo.field_card_tp_id)) {
        paramCardInfo.field_card_tp_id = paramCardInfo.kov.knp;
      }
      if ((paramCardInfo.field_begin_time == 0L) && (localJSONObject1 != null)) {
        paramCardInfo.field_begin_time = localJSONObject1.optLong("begin_time");
      }
      if ((paramCardInfo.field_end_time == 0L) && (localJSONObject1 != null)) {
        paramCardInfo.field_end_time = localJSONObject1.optLong("end_time");
      }
      if (paramCardInfo.kov.tFB != null) {
        paramCardInfo.field_is_dynamic = paramCardInfo.kov.tFB.tLw;
      }
      if (paramCardInfo.kow != null)
      {
        paramCardInfo.a(paramCardInfo.kow);
        paramCardInfo.field_status = paramCardInfo.kow.status;
      }
      if (paramCardInfo.kox != null)
      {
        paramJSONObject = paramCardInfo.kox;
        paramCardInfo.kox = paramJSONObject;
      }
    }
    catch (Exception paramJSONObject)
    {
      try
      {
        paramCardInfo.field_shareInfoData = paramJSONObject.toByteArray();
        paramCardInfo.field_local_updateTime = ((int)(System.currentTimeMillis() / 1000L));
        GMTrace.o(5048599838720L, 37615);
        return;
        paramJSONObject = paramJSONObject;
        w.e("MicroMsg.CardInfo", "setCardTpInfo fail, ex = %s", new Object[] { paramJSONObject.getMessage() });
      }
      catch (Exception paramJSONObject)
      {
        for (;;)
        {
          w.e("MicroMsg.CardInfo", "setShareInfo fail, ex = %s", new Object[] { paramJSONObject.getMessage() });
          w.printErrStackTrace("MicroMsg.CardInfo", paramJSONObject, "", new Object[0]);
        }
      }
    }
  }
  
  public static void a(ShareCardInfo paramShareCardInfo, String paramString)
  {
    GMTrace.i(5048062967808L, 37611);
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.CardInfoParser", "parserShareCardItemJson jsonContent is null");
      GMTrace.o(5048062967808L, 37611);
      return;
    }
    try
    {
      a(paramShareCardInfo, new JSONObject(paramString).optJSONObject("share_card"));
      GMTrace.o(5048062967808L, 37611);
      return;
    }
    catch (JSONException paramShareCardInfo)
    {
      w.printErrStackTrace("MicroMsg.CardInfoParser", paramShareCardInfo, "", new Object[0]);
      w.e("MicroMsg.CardInfoParser", paramShareCardInfo.getMessage());
      GMTrace.o(5048062967808L, 37611);
    }
  }
  
  public static void a(ShareCardInfo paramShareCardInfo, JSONObject paramJSONObject)
  {
    GMTrace.i(5048197185536L, 37612);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.CardInfoParser", "parserShareCardItemJson json is null");
      GMTrace.o(5048197185536L, 37612);
      return;
    }
    paramShareCardInfo.field_card_id = ue(paramJSONObject.optString("card_id"));
    paramShareCardInfo.field_card_tp_id = ue(paramJSONObject.optString("card_tp_id"));
    paramShareCardInfo.field_app_id = paramJSONObject.optString("app_id");
    paramShareCardInfo.field_consumer = paramJSONObject.optString("consumer");
    paramShareCardInfo.field_share_time = paramJSONObject.optInt("share_time");
    paramShareCardInfo.field_updateTime = paramJSONObject.optInt("update_time");
    paramShareCardInfo.field_status = paramJSONObject.optInt("state_flag");
    paramShareCardInfo.field_updateSeq = paramJSONObject.optLong("sequence");
    paramShareCardInfo.field_from_username = paramJSONObject.optString("from_user_name");
    paramShareCardInfo.field_begin_time = paramJSONObject.optLong("begin_time");
    paramShareCardInfo.field_end_time = paramJSONObject.optInt("end_time");
    JSONObject localJSONObject2 = paramJSONObject.optJSONObject("card_data_info");
    JSONObject localJSONObject1 = paramJSONObject.optJSONObject("card_tp_info");
    paramJSONObject = paramJSONObject.optJSONObject("share_info");
    paramShareCardInfo.kow = r(localJSONObject2);
    paramShareCardInfo.kov = s(localJSONObject1);
    paramShareCardInfo.kox = t(paramJSONObject);
    if (paramShareCardInfo.kow != null) {
      paramShareCardInfo.a(paramShareCardInfo.kow);
    }
    if (paramShareCardInfo.kov != null)
    {
      paramJSONObject = paramShareCardInfo.kov;
      paramShareCardInfo.kov = paramJSONObject;
    }
    try
    {
      paramShareCardInfo.field_cardTpInfoData = paramJSONObject.toByteArray();
      paramShareCardInfo.field_end_time = localJSONObject1.optInt("end_time");
      paramShareCardInfo.field_begin_time = localJSONObject1.optInt("begin_time");
      if (paramShareCardInfo.kox != null)
      {
        paramJSONObject = paramShareCardInfo.kox;
        paramShareCardInfo.kox = paramJSONObject;
      }
    }
    catch (Exception paramJSONObject)
    {
      try
      {
        paramShareCardInfo.field_shareInfoData = paramJSONObject.toByteArray();
        paramShareCardInfo.field_local_updateTime = ((int)(System.currentTimeMillis() / 1000L));
        GMTrace.o(5048197185536L, 37612);
        return;
        paramJSONObject = paramJSONObject;
        w.e("MicroMsg.ShareCardInfo", "setCardTpInfo fail, ex = %s", new Object[] { paramJSONObject.getMessage() });
      }
      catch (Exception paramJSONObject)
      {
        for (;;)
        {
          w.e("MicroMsg.ShareCardInfo", "setShareInfo fail, ex = %s", new Object[] { paramJSONObject.getMessage() });
          w.printErrStackTrace("MicroMsg.ShareCardInfo", paramJSONObject, "", new Object[0]);
        }
      }
    }
  }
  
  private static LinkedList<js> m(JSONArray paramJSONArray)
  {
    GMTrace.i(5049002491904L, 37618);
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0))
    {
      GMTrace.o(5049002491904L, 37618);
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    while (i < paramJSONArray.length())
    {
      JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
      js localjs = new js();
      localjs.title = localJSONObject.optString("title");
      localjs.kns = localJSONObject.optString("sub_title");
      localjs.kqV = localJSONObject.optString("tips");
      localjs.url = localJSONObject.optString("url");
      localjs.tFX = localJSONObject.optLong("show_flag");
      localjs.tFY = localJSONObject.optString("primary_color");
      localjs.tFZ = localJSONObject.optString("secondary_color");
      localjs.oqo = localJSONObject.optString("icon_url");
      localjs.tEL = localJSONObject.optString("app_brand_user_name");
      localjs.tEM = localJSONObject.optString("app_brand_pass");
      localLinkedList.add(localjs);
      i += 1;
    }
    GMTrace.o(5049002491904L, 37618);
    return localLinkedList;
  }
  
  private static LinkedList<nc> n(JSONArray paramJSONArray)
  {
    GMTrace.i(5049270927360L, 37620);
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0))
    {
      GMTrace.o(5049270927360L, 37620);
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    while (i < paramJSONArray.length())
    {
      nc localnc = u(paramJSONArray.getJSONObject(i));
      if (localnc != null) {
        localLinkedList.add(localnc);
      }
      i += 1;
    }
    GMTrace.o(5049270927360L, 37620);
    return localLinkedList;
  }
  
  private static LinkedList<au> o(JSONArray paramJSONArray)
  {
    GMTrace.i(5049539362816L, 37622);
    LinkedList localLinkedList = new LinkedList();
    if (paramJSONArray != null)
    {
      int i = 0;
      for (;;)
      {
        if (i < paramJSONArray.length()) {
          try
          {
            au localau = new au();
            JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
            localau.text = localJSONObject.optString("text");
            localau.url = localJSONObject.optString("url");
            localLinkedList.add(localau);
            i += 1;
          }
          catch (JSONException localJSONException)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.CardInfoParser", localJSONException, "", new Object[0]);
            }
          }
        }
      }
    }
    GMTrace.o(5049539362816L, 37622);
    return localLinkedList;
  }
  
  private static jf r(JSONObject paramJSONObject)
  {
    Object localObject2 = null;
    GMTrace.i(5048868274176L, 37617);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.CardInfoParser", "parserCardDataInfo json is null");
      GMTrace.o(5048868274176L, 37617);
      return null;
    }
    jf localjf = new jf();
    for (;;)
    {
      try
      {
        localjf.status = paramJSONObject.optInt("status");
        localjf.tEm = paramJSONObject.optInt("init_balance");
        localjf.tEn = paramJSONObject.optInt("init_bonus");
        localObject1 = paramJSONObject.optJSONArray("cell_list0");
        if (localObject1 != null) {
          localjf.tEo = m((JSONArray)localObject1);
        }
        localObject1 = paramJSONObject.optJSONArray("cell_list1");
        if (localObject1 != null) {
          localjf.tEp = m((JSONArray)localObject1);
        }
        localObject1 = paramJSONObject.optJSONArray("cell_list2");
        if (localObject1 != null) {
          localjf.tEq = m((JSONArray)localObject1);
        }
        localJSONArray = paramJSONObject.optJSONArray("acceptors");
        if (localJSONArray != null)
        {
          localObject1 = localObject2;
          if (localJSONArray != null)
          {
            if (localJSONArray.length() != 0) {
              continue;
            }
            localObject1 = localObject2;
          }
          localjf.tEr = ((LinkedList)localObject1);
        }
        localjf.tEs = paramJSONObject.optInt("avail_num");
        localjf.tEt = paramJSONObject.optInt("code_type");
        localjf.code = paramJSONObject.optString("code");
        localObject1 = paramJSONObject.optJSONArray("secondary_fields");
        if (localObject1 != null) {
          localjf.tEu = n((JSONArray)localObject1);
        }
        localjf.tEv = paramJSONObject.optLong("stock_num");
        localjf.tEw = paramJSONObject.optInt("limit_num");
        localjf.tEx = paramJSONObject.optString("user_report_url");
        localObject1 = paramJSONObject.optJSONObject("third_field");
        if (localObject1 != null) {
          localjf.tEy = u((JSONObject)localObject1);
        }
        localjf.tEz = o(paramJSONObject.optJSONArray("action_sheets"));
        localObject1 = paramJSONObject.optJSONObject("card_list_field");
        if (localObject1 != null) {
          localjf.tEA = u((JSONObject)localObject1);
        }
        localObject1 = paramJSONObject.optJSONObject("operate_field");
        if (localObject1 != null) {
          localjf.tEB = u((JSONObject)localObject1);
        }
        localObject1 = paramJSONObject.optJSONObject("limit_field");
        if (localObject1 != null) {
          localjf.tEC = u((JSONObject)localObject1);
        }
        localObject1 = paramJSONObject.optJSONObject("detail_table");
        if (localObject1 != null) {
          localjf.tED = x((JSONObject)localObject1);
        }
        localjf.tEE = paramJSONObject.optString("background_pic_url");
        localObject1 = paramJSONObject.optJSONObject("gifting_info_cell");
        if (localObject1 != null) {
          localjf.tEF = u((JSONObject)localObject1);
        }
        localjf.tEG = paramJSONObject.optString("sign_number");
        localObject1 = paramJSONObject.optJSONObject("unavailable_qrcode_field");
        if (localObject1 != null) {
          localjf.tEH = u((JSONObject)localObject1);
        }
        localjf.tEI = paramJSONObject.optBoolean("is_commom_card");
      }
      catch (JSONException paramJSONObject)
      {
        Object localObject1;
        JSONArray localJSONArray;
        int i;
        w.printErrStackTrace("MicroMsg.CardInfoParser", paramJSONObject, "", new Object[0]);
        continue;
      }
      GMTrace.o(5048868274176L, 37617);
      return localjf;
      localObject1 = new LinkedList();
      i = 0;
      if (i < localJSONArray.length())
      {
        ((LinkedList)localObject1).add((String)localJSONArray.get(i));
        i += 1;
      }
    }
  }
  
  public static jn s(JSONObject paramJSONObject)
  {
    Object localObject2 = null;
    GMTrace.i(5049136709632L, 37619);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.CardInfoParser", "parserCardTpInfo json is null");
      GMTrace.o(5049136709632L, 37619);
      return null;
    }
    jn localjn = new jn();
    Object localObject1;
    Object localObject3;
    for (;;)
    {
      try
      {
        localjn.knp = paramJSONObject.optString("card_tp_id");
        localjn.knr = paramJSONObject.optString("logo_url");
        localjn.fKY = paramJSONObject.optString("appid");
        localjn.tET = paramJSONObject.optString("app_username");
        localjn.tEU = paramJSONObject.optInt("card_category");
        localjn.knq = paramJSONObject.optInt("card_type");
        localjn.koD = paramJSONObject.optString("brand_name");
        localjn.title = paramJSONObject.optString("title");
        localjn.kns = paramJSONObject.optString("sub_title");
        localjn.hbA = paramJSONObject.optString("color");
        localjn.kKJ = paramJSONObject.optString("notice");
        localjn.tEV = paramJSONObject.optString("service_phone");
        localjn.tEY = paramJSONObject.optString("image_text_url");
        localjn.tEZ = paramJSONObject.optString("source_icon");
        localjn.aEn = paramJSONObject.optString("source");
        localObject1 = paramJSONObject.optJSONArray("primary_fields");
        if (localObject1 != null) {
          localjn.tEW = n((JSONArray)localObject1);
        }
        localObject1 = paramJSONObject.optJSONArray("introduce_fields");
        if (localObject1 != null) {
          localjn.tEX = n((JSONArray)localObject1);
        }
        localjn.tFa = paramJSONObject.optInt("shop_count");
        localjn.tFb = paramJSONObject.optString("limit_wording");
        localjn.koC = paramJSONObject.optString("card_type_name");
        localjn.tFc = paramJSONObject.optString("h5_show_url");
        localjn.tFd = paramJSONObject.optInt("block_mask");
        localjn.tFe = paramJSONObject.optString("middle_icon");
        localjn.tFf = paramJSONObject.optString("accept_wording");
        localjn.tFg = paramJSONObject.optLong("control_flag");
        localjn.tFh = paramJSONObject.optString("advertise_wording");
        localjn.tFi = paramJSONObject.optString("advertise_url");
        localjn.tFj = paramJSONObject.optString("public_service_name");
        localObject3 = paramJSONObject.optJSONObject("announcement");
        if (localObject3 != null) {
          continue;
        }
        w.e("MicroMsg.CardInfoParser", "parserannoucement json is null");
        localObject1 = null;
        localjn.tFk = ((jh)localObject1);
        localjn.tFl = paramJSONObject.optString("public_service_tip");
        localjn.tFm = paramJSONObject.optString("primary_sub_title");
        localjn.tFn = paramJSONObject.optInt("gen_type");
        localjn.tFo = v(paramJSONObject.optJSONObject("detail_struct"));
        localObject3 = paramJSONObject.optJSONObject("use_condition");
        if (localObject3 != null) {
          continue;
        }
        w.e("MicroMsg.CardInfoParser", "parserUseCondition json is null");
        localObject1 = null;
        localjn.tFp = ((bkr)localObject1);
        localObject3 = paramJSONObject.optJSONObject("follow_box");
        if (localObject3 != null) {
          break label1109;
        }
        w.e("MicroMsg.CardInfoParser", "parserFollowBox json is null");
        localObject1 = null;
        label531:
        localjn.tFq = ((tp)localObject1);
        localObject3 = paramJSONObject.optJSONObject("guidance");
        if (localObject3 != null) {
          break label1182;
        }
        w.e("MicroMsg.CardInfoParser", "parserActionSheet json is null");
        localObject1 = null;
        label561:
        localjn.tFr = ((au)localObject1);
        localjn.tFs = paramJSONObject.optInt("need_direct_jump", 0);
        localjn.tFt = paramJSONObject.optInt("is_acceptable", 0);
        localjn.tFu = paramJSONObject.optString("unacceptable_wording");
        localjn.tFv = paramJSONObject.optInt("has_hongbao", 0);
        localjn.tFw = paramJSONObject.optString("accept_ui_title");
        localjn.tFx = paramJSONObject.optInt("show_accept_view", 0);
        localObject1 = paramJSONObject.optJSONObject("brand_field");
        if (localObject1 != null) {
          localjn.tFy = u((JSONObject)localObject1);
        }
        localjn.tFz = paramJSONObject.optString("shop_name");
        localObject1 = paramJSONObject.optJSONObject("pay_and_qrcode_field");
        if (localObject1 != null) {
          localjn.tFA = u((JSONObject)localObject1);
        }
        localObject3 = paramJSONObject.optJSONObject("dynamic_qr_code_info");
        if (localObject3 != null)
        {
          if (localObject3 != null) {
            break label1217;
          }
          w.e("MicroMsg.CardInfoParser", "parserDynamicQrCodeInfo json is null");
          localObject1 = localObject2;
          label726:
          localjn.tFB = ((pu)localObject1);
        }
        localjn.tFC = paramJSONObject.optBoolean("is_card_code_exposed");
        localjn.tFD = paramJSONObject.optInt("qrcode_correct_level");
        localjn.tFE = paramJSONObject.optBoolean("dismiss_qrcode_icon_on_card");
      }
      catch (JSONException paramJSONObject)
      {
        w.printErrStackTrace("MicroMsg.CardInfoParser", paramJSONObject, "", new Object[0]);
        continue;
        localObject1 = new bkr();
        ((bkr)localObject1).title = ((JSONObject)localObject3).optString("title");
        localJSONArray = ((JSONObject)localObject3).optJSONArray("outer_tag_list");
        if (localJSONArray == null) {
          break label973;
        }
      }
      GMTrace.o(5049136709632L, 37619);
      return localjn;
      localObject1 = new jh();
      ((jh)localObject1).type = ((JSONObject)localObject3).optInt("type");
      ((jh)localObject1).text = ((JSONObject)localObject3).optString("text");
      ((jh)localObject1).url = ((JSONObject)localObject3).optString("url");
      ((jh)localObject1).pwk = ((JSONObject)localObject3).optInt("endtime");
      ((jh)localObject1).bzG = ((JSONObject)localObject3).optInt("create_time");
      ((jh)localObject1).tEJ = ((JSONObject)localObject3).optString("thumb_url");
    }
    int i;
    label935:
    bgn localbgn;
    if (localJSONArray.length() > 0)
    {
      ((bkr)localObject1).uAR = new LinkedList();
      i = 0;
      if (i < localJSONArray.length())
      {
        localbgn = w(localJSONArray.optJSONObject(i));
        if (localbgn == null) {
          break label1315;
        }
        ((bkr)localObject1).uAR.add(localbgn);
        break label1315;
      }
    }
    else
    {
      label973:
      w.e("MicroMsg.CardInfoParser", "parserUseCondition outer_tag_list is null");
    }
    JSONArray localJSONArray = ((JSONObject)localObject3).optJSONArray("inner_tag_list");
    if ((localJSONArray != null) && (localJSONArray.length() > 0))
    {
      ((bkr)localObject1).uAS = new LinkedList();
      i = 0;
    }
    for (;;)
    {
      if (i < localJSONArray.length())
      {
        localbgn = w(localJSONArray.optJSONObject(i));
        if (localbgn != null)
        {
          ((bkr)localObject1).uAS.add(localbgn);
          break label1322;
          w.e("MicroMsg.CardInfoParser", "parserUseCondition inner_tag_list is null");
        }
      }
      else
      {
        localObject3 = ((JSONObject)localObject3).optJSONArray("detail_field");
        if ((localObject3 != null) && (((JSONArray)localObject3).length() > 0))
        {
          ((bkr)localObject1).uAT = n((JSONArray)localObject3);
          break;
        }
        w.e("MicroMsg.CardInfoParser", "parserUseCondition detail_field is null");
        break;
        label1109:
        localObject1 = new tp();
        ((tp)localObject1).text = ((JSONObject)localObject3).optString("text");
        ((tp)localObject1).tRK = ((JSONObject)localObject3).optInt("follow");
        w.i("MicroMsg.CardInfoParser", "follow:" + ((tp)localObject1).tRK + "　text:" + ((tp)localObject1).text);
        break label531;
        label1182:
        localObject1 = new au();
        ((au)localObject1).text = ((JSONObject)localObject3).optString("text");
        ((au)localObject1).url = ((JSONObject)localObject3).optString("url");
        break label561;
        label1217:
        localObject1 = new pu();
        ((pu)localObject1).tLw = ((JSONObject)localObject3).optBoolean("is_dynamic");
        ((pu)localObject1).tLx = ((JSONObject)localObject3).optBoolean("can_refresh");
        ((pu)localObject1).tLy = ((JSONObject)localObject3).optString("refresh_wording");
        w.i("MicroMsg.CardInfoParser", "is_dynamic:" + ((pu)localObject1).tLw + "　can_refresh:" + ((pu)localObject1).tLx + "　refresh_wording:" + ((pu)localObject1).tLy);
        break label726;
        label1315:
        i += 1;
        break label935;
      }
      label1322:
      i += 1;
    }
  }
  
  private static bbx t(JSONObject paramJSONObject)
  {
    GMTrace.i(5049405145088L, 37621);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.CardInfoParser", "parserShareInfo json is null");
      GMTrace.o(5049405145088L, 37621);
      return null;
    }
    bbx localbbx = new bbx();
    localbbx.uuc = paramJSONObject.optString("gift_msg_title");
    GMTrace.o(5049405145088L, 37621);
    return localbbx;
  }
  
  private static nc u(JSONObject paramJSONObject)
  {
    afc localafc = null;
    GMTrace.i(5049673580544L, 37623);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.CardInfoParser", "parserThirdFiled json is null");
      GMTrace.o(5049673580544L, 37623);
      return null;
    }
    nc localnc = new nc();
    localnc.title = paramJSONObject.optString("title");
    localnc.knt = paramJSONObject.optString("aux_title");
    localnc.kns = paramJSONObject.optString("sub_title");
    localnc.url = paramJSONObject.optString("url");
    localnc.tFX = paramJSONObject.optLong("show_flag");
    localnc.tFY = paramJSONObject.optString("primary_color");
    localnc.tFZ = paramJSONObject.optString("secondary_color");
    localnc.oqo = paramJSONObject.optString("icon_url");
    JSONObject localJSONObject = paramJSONObject.optJSONObject("gifting_info");
    if (localJSONObject != null)
    {
      if (localJSONObject != null) {
        break label192;
      }
      w.e("MicroMsg.CardInfoParser", "parserGiftInfo json is null");
    }
    for (;;)
    {
      localnc.tJw = localafc;
      localnc.tEL = paramJSONObject.optString("app_brand_user_name");
      localnc.tEM = paramJSONObject.optString("app_brand_pass");
      GMTrace.o(5049673580544L, 37623);
      return localnc;
      label192:
      w.d("MicroMsg.CardInfoParser", "parserGitfInfo:%s", new Object[] { localJSONObject });
      localafc = new afc();
      localafc.ttf = o.bj(localJSONObject.optString("biz_uin"));
      localafc.ttg = localJSONObject.optString("order_id");
    }
  }
  
  public static ArrayList<ShareCardInfo> uc(String paramString)
  {
    GMTrace.i(5047928750080L, 37610);
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.CardInfoParser", "parseShareCardArray jsonContent is null");
      GMTrace.o(5047928750080L, 37610);
      return null;
    }
    try
    {
      paramString = new JSONObject(paramString).optJSONArray("card_list");
      if ((paramString == null) || (paramString.length() == 0))
      {
        w.e("MicroMsg.CardInfoParser", "parseShareCardArray cardItemListJson is null");
        GMTrace.o(5047928750080L, 37610);
        return null;
      }
      ArrayList localArrayList = new ArrayList();
      int i = 0;
      while (i < paramString.length())
      {
        JSONObject localJSONObject = paramString.optJSONObject(i);
        ShareCardInfo localShareCardInfo = new ShareCardInfo();
        a(localShareCardInfo, localJSONObject);
        localArrayList.add(localShareCardInfo);
        i += 1;
      }
      GMTrace.o(5047928750080L, 37610);
      return localArrayList;
    }
    catch (JSONException paramString)
    {
      w.printErrStackTrace("MicroMsg.CardInfoParser", paramString, "", new Object[0]);
      GMTrace.o(5047928750080L, 37610);
    }
    return null;
  }
  
  public static ArrayList<CardInfo> ud(String paramString)
  {
    GMTrace.i(5048331403264L, 37613);
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.CardInfoParser", "parseCardArray jsonContent is null");
      GMTrace.o(5048331403264L, 37613);
      return null;
    }
    try
    {
      paramString = new JSONObject(paramString).optJSONArray("card_array");
      if ((paramString == null) || (paramString.length() == 0))
      {
        w.e("MicroMsg.CardInfoParser", "parseCardArray cardItemListJson is null");
        GMTrace.o(5048331403264L, 37613);
        return null;
      }
      ArrayList localArrayList = new ArrayList();
      int i = 0;
      while (i < paramString.length())
      {
        JSONObject localJSONObject = paramString.optJSONObject(i);
        CardInfo localCardInfo = new CardInfo();
        a(localCardInfo, localJSONObject);
        localArrayList.add(localCardInfo);
        i += 1;
      }
      GMTrace.o(5048331403264L, 37613);
      return localArrayList;
    }
    catch (JSONException paramString)
    {
      w.printErrStackTrace("MicroMsg.CardInfoParser", paramString, "", new Object[0]);
      GMTrace.o(5048331403264L, 37613);
    }
    return null;
  }
  
  private static String ue(String paramString)
  {
    GMTrace.i(5048734056448L, 37616);
    if ((TextUtils.isEmpty(paramString)) || ("null".equals(paramString)))
    {
      GMTrace.o(5048734056448L, 37616);
      return "";
    }
    GMTrace.o(5048734056448L, 37616);
    return paramString;
  }
  
  private static pd v(JSONObject paramJSONObject)
  {
    GMTrace.i(5049807798272L, 37624);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.CardInfoParser", "parserDetailStruct json is null");
      GMTrace.o(5049807798272L, 37624);
      return null;
    }
    pd localpd = new pd();
    localpd.title = paramJSONObject.optString("title");
    localpd.url = paramJSONObject.optString("url");
    localpd.desc = paramJSONObject.optString("abstract");
    localpd.ovp = paramJSONObject.optString("detail");
    localpd.tKW = paramJSONObject.optString("ad_title");
    JSONArray localJSONArray = paramJSONObject.optJSONArray("icon_url_list");
    if ((localJSONArray != null) && (localJSONArray.length() > 0))
    {
      LinkedList localLinkedList = new LinkedList();
      int i = 0;
      for (;;)
      {
        if (i >= localJSONArray.length()) {
          break label204;
        }
        paramJSONObject = "";
        try
        {
          String str = localJSONArray.getString(i);
          paramJSONObject = str;
        }
        catch (JSONException localJSONException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.CardInfoParser", localJSONException, "", new Object[0]);
            w.e("MicroMsg.CardInfoParser", "getMessage:" + localJSONException.getMessage());
          }
        }
        localLinkedList.add(paramJSONObject);
        i += 1;
      }
      label204:
      localpd.tKV = localLinkedList;
    }
    for (;;)
    {
      GMTrace.o(5049807798272L, 37624);
      return localpd;
      w.e("MicroMsg.CardInfoParser", "parserDetailStruct icon_url_list is null");
    }
  }
  
  private static bgn w(JSONObject paramJSONObject)
  {
    GMTrace.i(5049942016000L, 37625);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.CardInfoParser", "parserUseCondition json is null");
      GMTrace.o(5049942016000L, 37625);
      return null;
    }
    bgn localbgn = new bgn();
    localbgn.tag = paramJSONObject.optString("tag");
    localbgn.hbA = paramJSONObject.optString("color");
    GMTrace.o(5049942016000L, 37625);
    return localbgn;
  }
  
  private static pe x(JSONObject paramJSONObject)
  {
    GMTrace.i(5050076233728L, 37626);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.CardInfoParser", "parserDetailTable json is null");
      GMTrace.o(5050076233728L, 37626);
      return null;
    }
    pe localpe = new pe();
    localpe.title = paramJSONObject.optString("title");
    localpe.kns = paramJSONObject.optString("sub_title");
    localpe.tKX = paramJSONObject.optInt("show_num", 0);
    paramJSONObject = paramJSONObject.optJSONArray("rows");
    if ((paramJSONObject != null) && (paramJSONObject.length() > 0)) {}
    for (;;)
    {
      try
      {
        localpe.tKY = n(paramJSONObject);
        GMTrace.o(5050076233728L, 37626);
        return localpe;
      }
      catch (JSONException paramJSONObject)
      {
        w.printErrStackTrace("MicroMsg.CardInfoParser", paramJSONObject, "", new Object[0]);
        w.e("MicroMsg.CardInfoParser", paramJSONObject.getMessage());
        continue;
      }
      w.e("MicroMsg.CardInfoParser", "parserDetailTable jsonArray is  null");
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */