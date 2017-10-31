package com.tencent.mm.plugin.wallet_core.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.ECardInfo;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.model.u;
import com.tencent.mm.plugin.wallet_core.model.z;
import com.tencent.mm.pluginsdk.l.a;
import com.tencent.mm.pluginsdk.l.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.wallet_core.f.a.h;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class m
  extends h
{
  public String fQA;
  public String fQB;
  public LinkedList<String> fQC;
  public ECardInfo fQD;
  public String fQq;
  public String fQr;
  public String fQs;
  public String fQt;
  public String fQu;
  public String fQv;
  public int fQw;
  public String fQx;
  public String fQy;
  public String fQz;
  public int scene;
  public String title;
  
  public m(String paramString)
  {
    this(paramString, 0);
    GMTrace.i(7026566496256L, 52352);
    GMTrace.o(7026566496256L, 52352);
  }
  
  public m(String paramString, int paramInt)
  {
    GMTrace.i(7026700713984L, 52353);
    this.fQv = "";
    this.fQw = 0;
    this.fQx = "";
    this.fQy = "";
    this.fQz = "";
    this.fQA = "";
    this.fQB = "";
    this.title = "";
    this.fQC = new LinkedList();
    this.scene = 0;
    Object localObject = new HashMap();
    this.scene = paramInt;
    ((Map)localObject).put("req_key", paramString);
    ((Map)localObject).put("bind_query_scene", String.valueOf(paramInt));
    paramString = l.a.sRt;
    ((Map)localObject).put("is_root", "0");
    if (paramString != null)
    {
      ((Map)localObject).put("is_device_open_touch", "1");
      paramString = paramString.ayJ();
      if (paramString != null) {
        ((Map)localObject).putAll(paramString);
      }
      w.i("MicroMsg.NetSceneTenpayQueryBindBankcard", "is_device_open_touch is true");
    }
    for (;;)
    {
      x((Map)localObject);
      paramString = new HashMap();
      ap.AS();
      localObject = (String)c.xi().get(196612, null);
      ap.AS();
      String str = (String)c.xi().get(196613, null);
      paramString.put("bind_serial", localObject);
      paramString.put("last_bind_serial", str);
      aq(paramString);
      GMTrace.o(7026700713984L, 52353);
      return;
      ((Map)localObject).put("is_device_open_touch", "0");
      w.i("MicroMsg.NetSceneTenpayQueryBindBankcard", "is_device_open_touch is false");
    }
  }
  
  public final int Bc()
  {
    GMTrace.i(7027103367168L, 52356);
    GMTrace.o(7027103367168L, 52356);
    return 1501;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7026969149440L, 52355);
    if (paramInt != 0)
    {
      GMTrace.o(7026969149440L, 52355);
      return;
    }
    if (paramJSONObject.has("real_name_info"))
    {
      paramString = paramJSONObject.optJSONObject("real_name_info");
      w.i("MicroMsg.NetSceneTenpayQueryBindBankcard", "get real_name_info %s", new Object[] { paramString.toString() });
      this.fQq = paramString.optString("guide_flag");
      this.fQr = paramString.optString("guide_wording");
      this.fQs = paramString.optString("left_button_wording");
      this.fQt = paramString.optString("right_button_wording");
      this.fQu = paramString.optString("upload_credit_url");
      this.fQv = paramString.optString("done_button_wording");
      this.fQw = paramString.optInt("is_show_protocol", 0);
      this.fQx = paramString.optString("left_protocol_wording");
      this.fQy = paramString.optString("new_upload_credit_url");
      this.fQz = paramString.optString("protocol_url");
      this.fQA = paramString.optString("right_protocol_wording");
      this.fQB = paramString.optString("subtitle");
      this.title = paramString.optString("title");
      JSONArray localJSONArray = paramString.optJSONArray("upload_reasons");
      this.fQC.clear();
      if (localJSONArray != null)
      {
        paramInt = 0;
        while (paramInt < localJSONArray.length())
        {
          this.fQC.add(localJSONArray.optString(paramInt));
          paramInt += 1;
        }
      }
      if (paramString.has("ecard_info"))
      {
        paramString = paramString.optJSONObject("ecard_info");
        this.fQD = new ECardInfo();
        this.fQD.title = this.title;
        this.fQD.rNJ = new ArrayList(this.fQC);
        this.fQD.rNL = this.fQz;
        this.fQD.rNM = this.fQx;
        this.fQD.rNN = this.fQA;
        this.fQD.rNK = this.fQv;
        this.fQD.rNC = paramString.optInt("ecard_open_scene", 0);
        this.fQD.fwJ = paramString.optString("ecard_type", "");
        this.fQD.rND = paramString.optInt("show_check_box", 0);
        this.fQD.rNE = paramString.optInt("check_box_selected", 0);
        this.fQD.rNF = paramString.optString("check_box_left_wording", "");
        this.fQD.rNG = paramString.optString("check_box_right_wording", "");
        this.fQD.rNH = paramString.optString("check_box_url", "");
        this.fQD.rNI = paramString.optInt("is_upload_credid", 0);
        this.fQD.fQu = paramString.optString("upload_credit_url", "");
      }
    }
    if ((paramJSONObject.has("paymenu_array")) && (this.scene == 1))
    {
      paramString = paramJSONObject.optJSONArray("paymenu_array");
      if (paramString != null) {
        u.Jp(paramString.toString());
      }
    }
    long l = paramJSONObject.optLong("time_stamp");
    if (l > 0L)
    {
      com.tencent.mm.wallet_core.c.m.setTimeStamp(String.valueOf(l));
      z.a(paramJSONObject, this.scene);
      if ((this.scene == 0) || (this.scene == 1))
      {
        paramString = paramJSONObject.optJSONObject("bind_card_menu");
        if (paramString == null) {
          break label665;
        }
        w.d("MicroMsg.NetSceneTenpayQueryBindBankcard", "bind card menu: %s", new Object[] { paramString.toString() });
        ap.AS();
        c.xi().a(w.a.vdk, paramString.toString());
      }
    }
    for (;;)
    {
      paramString = l.a.sRt;
      if (paramString == null) {
        break label683;
      }
      w.i("MicroMsg.NetSceneTenpayQueryBindBankcard", "IFingerPrintMgr is not null");
      paramString.ayD();
      paramString.eE(com.tencent.mm.plugin.wallet_core.model.m.bwE().bxa());
      GMTrace.o(7026969149440L, 52355);
      return;
      w.w("MicroMsg.NetSceneTenpayQueryBindBankcard", "no time_stamp in bindquerynew.");
      break;
      label665:
      ap.AS();
      c.xi().a(w.a.vdk, "");
    }
    label683:
    w.e("MicroMsg.NetSceneTenpayQueryBindBankcard", "IFingerPrintMgr is null");
    GMTrace.o(7026969149440L, 52355);
  }
  
  public final int anK()
  {
    GMTrace.i(7026834931712L, 52354);
    GMTrace.o(7026834931712L, 52354);
    return 72;
  }
  
  public final String getUri()
  {
    GMTrace.i(7027237584896L, 52357);
    GMTrace.o(7027237584896L, 52357);
    return "/cgi-bin/mmpay-bin/tenpay/bindquerynew";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/b/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */