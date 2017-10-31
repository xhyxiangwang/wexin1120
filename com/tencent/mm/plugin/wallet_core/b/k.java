package com.tencent.mm.plugin.wallet_core.b;

import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.id_verify.model.Profession;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.m;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.n;
import com.tencent.mm.wallet_core.f.a.h;
import com.tencent.mm.wallet_core.ui.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class k
  extends h
{
  public String kmv;
  public String mTimeStamp;
  public List<ElementQuery> rKK;
  public ElementQuery rKL;
  public String rKM;
  private int rKN;
  private int rKO;
  private int rKP;
  public Profession[] rKQ;
  
  public k()
  {
    this(3, null, null, null, null, -1, -1);
    GMTrace.i(7037035479040L, 52430);
    GMTrace.o(7037035479040L, 52430);
  }
  
  private k(int paramInt1, String paramString1, String paramString2, PayInfo paramPayInfo, String paramString3, int paramInt2, int paramInt3)
  {
    GMTrace.i(7037169696768L, 52431);
    this.rKK = null;
    this.rKL = null;
    this.mTimeStamp = null;
    this.kmv = null;
    this.rKM = null;
    this.rKN = 3;
    this.rKQ = null;
    this.kmv = paramString2;
    this.rKN = 3;
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    a(paramPayInfo, localHashMap1, localHashMap2);
    localHashMap1.put("req_key", paramString1);
    localHashMap1.put("flag", "4");
    localHashMap1.put("card_id", paramString2);
    if (paramInt3 > 0)
    {
      localHashMap1.put("realname_scene", String.valueOf(paramInt3));
      w.i("MicroMsg.NetSenceTenPayBase", "realname_scene=%d", new Object[] { Integer.valueOf(paramInt3) });
    }
    if (paramInt2 == 8) {
      localHashMap1.put("scene", "1003");
    }
    localHashMap1.put("bank_card_tag", "3");
    localHashMap1.put("token", paramString3);
    x(localHashMap1);
    if (n.ciK())
    {
      localHashMap2.put("uuid_for_bindcard", n.ciM());
      localHashMap2.put("bindcard_scene", n.ciL());
    }
    aq(localHashMap2);
    GMTrace.o(7037169696768L, 52431);
  }
  
  public k(String paramString1, String paramString2, PayInfo paramPayInfo)
  {
    this(3, paramString1, paramString2, paramPayInfo, null, -1, -1);
    GMTrace.i(7036632825856L, 52427);
    GMTrace.o(7036632825856L, 52427);
  }
  
  public k(String paramString1, String paramString2, PayInfo paramPayInfo, int paramInt)
  {
    this(3, paramString1, paramString2, paramPayInfo, null, -1, paramInt);
    GMTrace.i(7036767043584L, 52428);
    GMTrace.o(7036767043584L, 52428);
  }
  
  public k(String paramString1, String paramString2, PayInfo paramPayInfo, String paramString3, int paramInt1, int paramInt2)
  {
    this(3, paramString1, paramString2, paramPayInfo, paramString3, paramInt1, paramInt2);
    GMTrace.i(7036901261312L, 52429);
    GMTrace.o(7036901261312L, 52429);
  }
  
  public final int Bc()
  {
    GMTrace.i(7037572349952L, 52434);
    GMTrace.o(7037572349952L, 52434);
    return 1505;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7037438132224L, 52433);
    this.rKK = new ArrayList();
    label68:
    Object localObject2;
    for (;;)
    {
      ElementQuery localElementQuery;
      String str;
      try
      {
        this.mTimeStamp = paramJSONObject.optString("time_stamp");
        paramString = paramJSONObject.optString("bank_type");
        if (bg.mZ(this.rKM)) {
          break label975;
        }
        paramString = this.rKM;
        localObject1 = paramJSONObject.getJSONArray("Array");
        i = ((JSONArray)localObject1).length();
        paramInt = 0;
        if (paramInt >= i) {
          break;
        }
        localObject2 = ((JSONArray)localObject1).getJSONObject(paramInt);
        localElementQuery = new ElementQuery();
        localElementQuery.hoi = ((JSONObject)localObject2);
        localElementQuery.mVv = ((JSONObject)localObject2).optString("bank_name");
        localElementQuery.oql = ((JSONObject)localObject2).optString("bank_type");
        localElementQuery.rNY = ((JSONObject)localObject2).optString("bankacc_type_name");
        localElementQuery.rOa = ((JSONObject)localObject2).optString("bank_phone");
        localElementQuery.rOd = ((JSONObject)localObject2).optString("forbid_word");
        localElementQuery.rOc = ((JSONObject)localObject2).optString("bank_recommend_desc");
        localElementQuery.rOb = ((JSONObject)localObject2).optString("bank_app_user_name");
        localElementQuery.rNX = ((JSONObject)localObject2).optInt("bankacc_type", 1);
        localElementQuery.rNQ = e.g((JSONObject)localObject2, "canModifyName");
        localElementQuery.rNR = e.g((JSONObject)localObject2, "canModifyCreID");
        localElementQuery.rNV = "0".equals(((JSONObject)localObject2).optString("is_sure"));
        localElementQuery.rNS = "1".equals(((JSONObject)localObject2).optString("needCVV"));
        localElementQuery.rNT = "1".equals(((JSONObject)localObject2).optString("needValiDate"));
        localElementQuery.rNP = ((JSONObject)localObject2).optString("time_stamp");
        localElementQuery.rNU = ((JSONObject)localObject2).optString("uesr_name");
        localElementQuery.rNZ = ((JSONObject)localObject2).optString("bank_flag");
        localElementQuery.rOe = e.g((JSONObject)localObject2, "needFirstName");
        localElementQuery.rOf = e.g((JSONObject)localObject2, "needLastName");
        localElementQuery.rOg = e.g((JSONObject)localObject2, "needCountry");
        localElementQuery.rOh = e.g((JSONObject)localObject2, "needArea");
        localElementQuery.rOi = e.g((JSONObject)localObject2, "needCity");
        localElementQuery.rOj = e.g((JSONObject)localObject2, "needAddress");
        localElementQuery.rOk = e.g((JSONObject)localObject2, "needZip");
        localElementQuery.rOl = e.g((JSONObject)localObject2, "needPhone");
        localElementQuery.rOm = e.g((JSONObject)localObject2, "needEmail");
        localElementQuery.rOp = e.g((JSONObject)localObject2, "needShowProtocol");
        localElementQuery.rOn = ((JSONObject)localObject2).optString("support_cre_type");
        localElementQuery.rKN = ((JSONObject)localObject2).optInt("bank_card_tag", 1);
        if (localElementQuery.rKN != 1) {
          break label639;
        }
        if (!e.g((JSONObject)localObject2, "IsSaveYfq"))
        {
          localElementQuery.rNW = 0;
          str = ((JSONObject)localObject2).optString("support_micropay");
          if (!TextUtils.isEmpty(str)) {
            break label669;
          }
          localElementQuery.rOq = true;
          localElementQuery.rMC = ((JSONObject)localObject2).optString("arrive_type");
          if (Bankcard.dv(this.rKN, localElementQuery.rKN)) {
            this.rKK.add(localElementQuery);
          }
          if ((paramString == null) || (!paramString.equals(localElementQuery.oql))) {
            break label978;
          }
          this.rKL = localElementQuery;
          break label978;
        }
        if (e.g((JSONObject)localObject2, "canReturnYfq"))
        {
          localElementQuery.rNW = 4;
          continue;
        }
        localElementQuery.rNW = 3;
      }
      catch (JSONException paramString)
      {
        w.printErrStackTrace("MicroMsg.NetSenceTenPayBase", paramString, "", new Object[0]);
        GMTrace.o(7037438132224L, 52433);
        return;
      }
      continue;
      label639:
      if (((JSONObject)localObject2).optInt("auth_mode") == 1)
      {
        localElementQuery.rNW = 1;
      }
      else
      {
        localElementQuery.rNW = 2;
        continue;
        label669:
        if ("1".equals(str)) {
          localElementQuery.rOq = true;
        } else if ("0".equals(str)) {
          localElementQuery.rOq = false;
        }
      }
    }
    paramString = new SparseArray();
    Object localObject1 = paramJSONObject.getJSONArray("cre_type_map");
    int i = ((JSONArray)localObject1).length();
    paramInt = 0;
    label735:
    if (paramInt < i)
    {
      localObject2 = ((JSONArray)localObject1).getJSONObject(paramInt);
      int j = ((JSONObject)localObject2).optInt("key", 0);
      if (j > 0) {
        paramString.put(j, ((JSONObject)localObject2).getString("val"));
      }
    }
    else
    {
      localObject1 = m.bwM();
      localObject2 = this.rKK;
      ((o)localObject1).rQF = paramString;
      ((o)localObject1).rKK = ((List)localObject2);
      this.rKO = paramJSONObject.optInt("need_area");
      this.rKP = paramJSONObject.optInt("need_profession");
      if ((this.rKL != null) && (this.rKL.rKN != 1))
      {
        w.i("MicroMsg.NetSenceTenPayBase", "oversea card, no need area and profession");
        this.rKO = 0;
        this.rKP = 0;
      }
      paramString = paramJSONObject.optJSONArray("profession_array");
      if (paramString != null)
      {
        this.rKQ = new Profession[paramString.length()];
        paramInt = 0;
      }
    }
    for (;;)
    {
      if (paramInt < paramString.length())
      {
        paramJSONObject = paramString.optJSONObject(paramInt);
        if (paramJSONObject != null)
        {
          localObject1 = paramJSONObject.optString("profession_name");
          i = paramJSONObject.optInt("profession_type");
          if (!bg.mZ((String)localObject1))
          {
            paramJSONObject = new Profession((String)localObject1, i);
            this.rKQ[paramInt] = paramJSONObject;
          }
          else
          {
            w.i("MicroMsg.NetSenceTenPayBase", "empty profession_name!");
          }
        }
      }
      else
      {
        GMTrace.o(7037438132224L, 52433);
        return;
        label975:
        break;
        label978:
        paramInt += 1;
        break label68;
        paramInt += 1;
        break label735;
      }
      paramInt += 1;
    }
  }
  
  public final int anK()
  {
    GMTrace.i(7037303914496L, 52432);
    GMTrace.o(7037303914496L, 52432);
    return 73;
  }
  
  public final boolean bwg()
  {
    GMTrace.i(7037840785408L, 52436);
    if (this.rKO == 1)
    {
      GMTrace.o(7037840785408L, 52436);
      return true;
    }
    GMTrace.o(7037840785408L, 52436);
    return false;
  }
  
  public final boolean bwh()
  {
    GMTrace.i(7037975003136L, 52437);
    if (this.rKP == 1)
    {
      GMTrace.o(7037975003136L, 52437);
      return true;
    }
    GMTrace.o(7037975003136L, 52437);
    return false;
  }
  
  public final String getUri()
  {
    GMTrace.i(7037706567680L, 52435);
    GMTrace.o(7037706567680L, 52435);
    return "/cgi-bin/mmpay-bin/tenpay/elementquerynew";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/b/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */