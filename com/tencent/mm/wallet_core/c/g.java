package com.tencent.mm.wallet_core.c;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.e;
import com.tencent.mm.network.p;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.wallet_core.model.h;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.protocal.c.at;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public abstract class g
  extends k
{
  public com.tencent.mm.ac.b gMC;
  public e gMF;
  public int rNA;
  public int rNw;
  public String rNx;
  public int rNy;
  public String rNz;
  public String xfY;
  public String xfZ;
  public String xga;
  public boolean xgb;
  protected String xgc;
  public boolean xgd;
  private Map<String, String> xge;
  
  public g()
  {
    GMTrace.i(1447001325568L, 10781);
    this.xfY = "";
    this.xfZ = "";
    this.xga = "";
    this.xgb = false;
    this.rNw = 0;
    this.rNx = "";
    this.rNy = 0;
    this.rNz = "";
    this.rNA = 0;
    this.xgd = false;
    this.xge = new HashMap();
    GMTrace.o(1447001325568L, 10781);
  }
  
  public abstract String Jj(String paramString);
  
  public abstract void a(int paramInt, String paramString, JSONObject paramJSONObject);
  
  public abstract void a(com.tencent.mm.ac.b paramb, axs paramaxs);
  
  public final void a(PayInfo paramPayInfo, Map<String, String> paramMap1, Map<String, String> paramMap2)
  {
    GMTrace.i(1448746156032L, 10794);
    a(paramPayInfo, paramMap1, paramMap2, false);
    GMTrace.o(1448746156032L, 10794);
  }
  
  public final void a(PayInfo paramPayInfo, Map<String, String> paramMap1, Map<String, String> paramMap2, boolean paramBoolean)
  {
    GMTrace.i(1448880373760L, 10795);
    Object localObject = paramMap2;
    if (paramMap2 == null) {
      localObject = new HashMap();
    }
    if (paramPayInfo == null)
    {
      w.e("MicroMsg.NetScenePayBase", "Cmd : " + bvT() + ", payInfo is null");
      ((Map)localObject).put("devicename", Build.MODEL);
      aq((Map)localObject);
      GMTrace.o(1448880373760L, 10795);
      return;
    }
    paramMap1.put("req_key", paramPayInfo.fAF);
    paramMap1.put("partner_id", paramPayInfo.partnerId);
    paramMap1.put("pay_sign", paramPayInfo.fPZ);
    if (paramPayInfo.tob >= 0) {
      paramMap1.put("auto_deduct_flag", paramPayInfo.tob);
    }
    if (paramPayInfo.fIG > 0) {
      paramMap1.put("pay_scene", paramPayInfo.fIG);
    }
    if (paramPayInfo.fIH >= 0) {
      paramMap1.put("bindbankscene", paramPayInfo.fIH);
    }
    if (!bg.mZ(paramPayInfo.toc)) {
      paramMap1.put("deduct_bank_type", paramPayInfo.toc);
    }
    if (!bg.mZ(paramPayInfo.tod)) {
      paramMap1.put("deduct_bind_serial", paramPayInfo.tod);
    }
    if (paramBoolean) {
      paramMap1.put("use_touch", "0");
    }
    for (;;)
    {
      paramMap1.put("fp_identify_num", paramPayInfo.tnY);
      if (!TextUtils.isEmpty(paramPayInfo.fCQ)) {
        paramMap1.put("encrypted_pay_info", URLEncoder.encode(paramPayInfo.fCQ));
      }
      if (!TextUtils.isEmpty(paramPayInfo.fCR)) {
        paramMap1.put("encrypted_rsa_sign", URLEncoder.encode(paramPayInfo.fCR));
      }
      ((Map)localObject).put("uuid", paramPayInfo.mBX);
      ((Map)localObject).put("appid", paramPayInfo.appId);
      ((Map)localObject).put("appsource", paramPayInfo.rZS);
      ((Map)localObject).put("channel", paramPayInfo.fIC);
      ((Map)localObject).put("devicename", Build.MODEL);
      ((Map)localObject).put("soter_req", paramPayInfo.fIm);
      GMTrace.o(1448880373760L, 10795);
      return;
      paramMap1.put("use_touch", paramPayInfo.tnX);
    }
  }
  
  public void a(c paramc, JSONObject paramJSONObject)
  {
    GMTrace.i(1447403978752L, 10784);
    GMTrace.o(1447403978752L, 10784);
  }
  
  public final int aLe()
  {
    GMTrace.i(1449551462400L, 10800);
    int i = bvT();
    GMTrace.o(1449551462400L, 10800);
    return i;
  }
  
  public boolean aTK()
  {
    GMTrace.i(1449417244672L, 10799);
    this.hmp = bg.Pq();
    this.hmq = -1;
    this.aCW = -99;
    GMTrace.o(1449417244672L, 10799);
    return false;
  }
  
  public boolean aTL()
  {
    GMTrace.i(1449819897856L, 10802);
    GMTrace.o(1449819897856L, 10802);
    return true;
  }
  
  public String aUD()
  {
    GMTrace.i(1449148809216L, 10797);
    GMTrace.o(1449148809216L, 10797);
    return null;
  }
  
  public boolean aZF()
  {
    GMTrace.i(1449283026944L, 10798);
    GMTrace.o(1449283026944L, 10798);
    return false;
  }
  
  public final void ap(Map<String, String> paramMap)
  {
    GMTrace.i(1448209285120L, 10790);
    paramMap.remove("uin");
    if (this.xge == null) {
      this.xge = new HashMap();
    }
    if (this.xge != null) {
      this.xge.remove("uin");
    }
    Object[] arrayOfObject = paramMap.keySet().toArray();
    int i = 0;
    while (i < arrayOfObject.length)
    {
      Object localObject = arrayOfObject[i];
      String str = (String)paramMap.get(localObject);
      if (this.xge.containsKey(localObject)) {
        this.xge.remove(localObject);
      }
      this.xge.put((String)localObject, str);
      i += 1;
    }
    x(this.xge);
    GMTrace.o(1448209285120L, 10790);
  }
  
  public final void aq(Map<String, String> paramMap)
  {
    GMTrace.i(1448611938304L, 10793);
    z(false, false);
    if (paramMap != null)
    {
      Object localObject1 = h.bww();
      if (localObject1 != null)
      {
        w.i("MicroMsg.NetScenePayBase", "location found");
        paramMap.put("province", ((at)localObject1).gbW);
        if (!paramMap.containsKey("city")) {
          paramMap.put("city", ((at)localObject1).gbX);
        }
        paramMap.put("location_timestamp", ((at)localObject1).tui);
        paramMap.put("encrypt_key", ((at)localObject1).tum);
        paramMap.put("encrypt_userinfo", ((at)localObject1).tul);
      }
      localObject1 = paramMap.keySet().toArray();
      Arrays.sort((Object[])localObject1);
      StringBuilder localStringBuilder = new StringBuilder();
      int i = 0;
      int k;
      for (int j = 0; i < localObject1.length; j = k)
      {
        Object localObject2 = localObject1[i];
        String str = (String)paramMap.get(localObject2);
        k = j;
        if (!bg.mZ(str))
        {
          if (j != 0) {
            localStringBuilder.append("&");
          }
          localStringBuilder.append(localObject2);
          localStringBuilder.append("=");
          localStringBuilder.append(str);
          k = 1;
        }
        i += 1;
      }
      if (com.tencent.mm.sdk.a.b.bMv()) {
        w.d("MicroMsg.NetScenePayBase", "Cmd : " + bvT() + ", wxreq = " + localStringBuilder.toString());
      }
      w.d("MicroMsg.NetScenePayBase", "wxreq: " + localStringBuilder.toString());
      paramMap = localStringBuilder.toString().getBytes();
      paramMap = new axs().bd(paramMap);
      b(this.gMC, paramMap);
    }
    GMTrace.o(1448611938304L, 10793);
  }
  
  public abstract void b(com.tencent.mm.ac.b paramb, axs paramaxs);
  
  public void b(StringBuilder paramStringBuilder, String paramString)
  {
    GMTrace.i(1448477720576L, 10792);
    paramStringBuilder.append(paramString);
    GMTrace.o(1448477720576L, 10792);
  }
  
  public abstract int bvT();
  
  public abstract l c(com.tencent.mm.ac.b paramb);
  
  public final String ciF()
  {
    GMTrace.i(1449685680128L, 10801);
    String str = this.xgc;
    GMTrace.o(1449685680128L, 10801);
    return str;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, p paramp)
  {
    GMTrace.i(1449014591488L, 10796);
    int j = paramInt1;
    int i = paramInt2;
    if (r.idi)
    {
      j = paramInt1;
      i = paramInt2;
      if (1686 == bvT())
      {
        j = 3;
        i = -1;
      }
    }
    w.i("MicroMsg.NetScenePayBase", "cgi: %d, rrType %d, rrCgi %s, PayCgicmd %s, errType %d, errCode %d, errMsg %s, this: %s ", new Object[] { Integer.valueOf(getType()), Integer.valueOf(paramp.getType()), paramp.getUri(), Integer.valueOf(bvT()), Integer.valueOf(j), Integer.valueOf(i), paramString, toString() });
    Object localObject = c((com.tencent.mm.ac.b)paramp);
    paramInt2 = ((l)localObject).ubJ;
    String str3 = ((l)localObject).ubK;
    int k = ((l)localObject).xgg;
    String str1 = ((l)localObject).lpl;
    paramp = ab.getContext().getString(R.l.eUe);
    localJSONObject = null;
    localObject = n.b(((l)localObject).ubI);
    if (!bg.mZ((String)localObject)) {}
    for (;;)
    {
      try
      {
        localJSONObject = new JSONObject((String)localObject);
      }
      catch (Exception localException2)
      {
        String str2;
        localJSONObject = null;
        continue;
      }
      try
      {
        this.xgc = localJSONObject.optString("error_detail_url");
        paramInt1 = localJSONObject.getInt("retcode");
        localObject = localJSONObject.optString("retmsg");
        paramp = (p)localObject;
        try
        {
          this.xfY = localJSONObject.optString("pay_flag");
          this.xfZ = localJSONObject.optString("return_url");
          this.xga = localJSONObject.optString("wappay_jumped_url");
          this.rNw = localJSONObject.optInt("is_gen_cert");
          this.rNx = localJSONObject.optString("crt_token");
          this.rNy = localJSONObject.optInt("is_hint_crt");
          localObject = localJSONObject.optJSONObject("crt_wording");
          if (localObject != null)
          {
            this.rNz = ((JSONObject)localObject).toString();
            this.rNA = localJSONObject.optInt("is_ignore_crt");
            if (localJSONObject.optInt("del_cert", 0) != 0)
            {
              q.ciR();
              localObject = q.ciQ();
              w.i("MicroMsg.NetScenePayBase", "clean token %s", new Object[] { localObject });
              q.ciR().Wy((String)localObject);
            }
            this.xgd = true;
            if (com.tencent.mm.sdk.a.b.bMv()) {
              w.i("MicroMsg.NetScenePayBase", "RP:hy: FOR UNIT TEST: cgi: %d, cmd: %d, errType: %d, errCode: %d, errMsg: %s, platRet: %d, platMsg: %s, biz_ErrType: %d, biz_ErrMsg: %s, retcode: %d, retMsg: %s, json: %s this %s", new Object[] { Integer.valueOf(getType()), Integer.valueOf(bvT()), Integer.valueOf(j), Integer.valueOf(i), paramString, Integer.valueOf(paramInt2), str3, Integer.valueOf(k), str1, Integer.valueOf(paramInt1), paramp, localJSONObject, toString() });
            }
            localObject = new c(j, i, paramString);
            if ((j != 0) || (i != 0)) {
              continue;
            }
            if (paramInt2 == 0) {
              continue;
            }
            w.w("MicroMsg.NetScenePayBase", "hy: resolve busi error: plat ret is error");
            ((c)localObject).c(1000, paramInt2, str3, 1);
            if (localJSONObject == null) {
              continue;
            }
            if (((((c)localObject).errType != 0) || (((c)localObject).errCode != 0)) && (!aZF())) {
              continue;
            }
            a(((c)localObject).errCode, ((c)localObject).ftU, localJSONObject);
            a((c)localObject, localJSONObject);
            if (!this.xgb) {
              continue;
            }
            w.d("MicroMsg.NetScenePayBase", "hy: user consumed the call back");
            GMTrace.o(1449014591488L, 10796);
            return;
          }
          this.rNz = "";
          continue;
          w.w("MicroMsg.NetScenePayBase", "hy: json resolve error: error when resolving error code : " + localException1.toString());
        }
        catch (Exception localException1) {}
      }
      catch (Exception localException3)
      {
        continue;
      }
      paramInt1 = 55447;
      str2 = ab.getContext().getString(R.l.eVg);
      continue;
      w.w("MicroMsg.NetScenePayBase", "hy: respString is null");
      paramInt1 = 55448;
      continue;
      if (k != 0)
      {
        w.w("MicroMsg.NetScenePayBase", "hy: resolve busi error: errType is error");
        ((c)localObject).c(1000, k, str2, 2);
      }
      else if (paramInt1 != 0)
      {
        w.w("MicroMsg.NetScenePayBase", "hy: resolve busi error: retCode is error");
        if ((paramInt1 != 55447) && (paramInt1 != 55448)) {
          ((c)localObject).c(1000, paramInt1, paramp, 2);
        } else {
          ((c)localObject).c(1000, 2, paramp, 2);
        }
      }
      else
      {
        w.i("MicroMsg.NetScenePayBase", "hy: all's OK");
        continue;
        w.w("MicroMsg.NetScenePayBase", "hy: resolve system error.");
        paramString = bh.p(paramString, "e");
        if (paramString != null)
        {
          w.d("MicroMsg.NetScenePayBase", "hy: CDN error!");
          ((c)localObject).ftU = ((String)paramString.get(".e.Content"));
        }
        else if ((i == -1) || (i == 65036))
        {
          w.w("MicroMsg.NetScenePayBase", "hy: network error");
          ((c)localObject).ftU = ab.getContext().getString(R.l.eVG);
        }
        else
        {
          w.w("MicroMsg.NetScenePayBase", "hy: unknown system error");
          ((c)localObject).ftU = ab.getContext().getString(R.l.eUe);
          continue;
          w.i("MicroMsg.NetScenePayBase", "hy: ret code is not ok and should not resolve when error");
          continue;
          w.i("MicroMsg.NetScenePayBase", "hy: no json object when doing business");
        }
      }
    }
    this.gMF.a(((c)localObject).errType, ((c)localObject).errCode, ((c)localObject).ftU, this);
    GMTrace.o(1449014591488L, 10796);
  }
  
  public final void x(Map<String, String> paramMap)
  {
    GMTrace.i(1448343502848L, 10791);
    Object localObject1 = paramMap;
    if (paramMap == null) {
      localObject1 = new HashMap();
    }
    if (localObject1 != null) {
      ((Map)localObject1).remove("uin");
    }
    this.xge = ((Map)localObject1);
    z(true, true);
    StringBuilder localStringBuilder;
    if (localObject1 != null)
    {
      paramMap = ((Map)localObject1).keySet().toArray();
      Arrays.sort(paramMap);
      localStringBuilder = new StringBuilder();
      int i = 0;
      int k;
      for (int j = 0; i < paramMap.length; j = k)
      {
        Object localObject2 = paramMap[i];
        String str = (String)((Map)localObject1).get(localObject2);
        k = j;
        if (!bg.mZ(str))
        {
          if (j != 0) {
            localStringBuilder.append("&");
          }
          localStringBuilder.append(localObject2);
          localStringBuilder.append("=");
          b(localStringBuilder, str);
          k = 1;
        }
        i += 1;
      }
      if (!com.tencent.mm.sdk.a.b.bMv()) {
        break label389;
      }
      w.v("MicroMsg.NetScenePayBase", "RQ: Cmd : " + bvT() + ", req = " + localStringBuilder.toString() + " " + toString() + " " + bg.bOd().toString());
      localObject1 = Jj(localStringBuilder.toString());
      if (j == 0) {
        break label444;
      }
    }
    label389:
    label444:
    for (paramMap = "&";; paramMap = "")
    {
      localStringBuilder.append(paramMap);
      localStringBuilder.append("WCPaySign");
      localStringBuilder.append("=");
      localStringBuilder.append((String)localObject1);
      paramMap = localStringBuilder.toString().getBytes();
      paramMap = new axs().bd(paramMap);
      a(this.gMC, paramMap);
      w.i("MicroMsg.NetScenePayBase", "setRequestData getPayCgicmd: %s type: %s this: %s cgi %s ", new Object[] { Integer.valueOf(bvT()), Integer.valueOf(getType()), toString(), this.gMC.uri });
      GMTrace.o(1448343502848L, 10791);
      return;
      w.d("MicroMsg.NetScenePayBase", "RQ: Cmd : " + bvT() + ", req = " + localStringBuilder.toString() + " " + toString());
      break;
    }
  }
  
  public abstract void z(boolean paramBoolean1, boolean paramBoolean2);
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/c/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */