package com.tencent.mm.plugin.collect.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.wallet_core.b.a.a;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class l
  extends a
{
  public String desc;
  public long fRn;
  public int kKA;
  public String kKB;
  public String kKC;
  public String kKD;
  public String kKE;
  public String kKF;
  public String kKG;
  public int kKH;
  public String kKI;
  public String kKJ;
  public String kKK;
  public String kKL;
  public int kKM;
  public int kKx;
  public String kKy;
  public String kKz;
  
  public l(int paramInt)
  {
    GMTrace.i(17428977287168L, 129856);
    HashMap localHashMap = new HashMap();
    localHashMap.put("set_amount", "0");
    localHashMap.put("wallet_type", String.valueOf(paramInt));
    x(localHashMap);
    w.i("MicroMsg.NetSceneH5F2fTransferGetQrCode", "setAmount: %s, walletType: %s", new Object[] { Integer.valueOf(0), Integer.valueOf(paramInt) });
    GMTrace.o(17428977287168L, 129856);
  }
  
  public l(long paramLong, String paramString, int paramInt)
  {
    GMTrace.i(17429111504896L, 129857);
    HashMap localHashMap = new HashMap();
    localHashMap.put("amount", String.valueOf(paramLong));
    localHashMap.put("set_amount", "1");
    try
    {
      if (!bg.mZ(paramString)) {
        localHashMap.put("desc", URLEncoder.encode(paramString, "UTF-8"));
      }
      localHashMap.put("wallet_type", String.valueOf(paramInt));
      x(localHashMap);
      this.fRn = paramLong;
      this.desc = paramString;
      w.i("MicroMsg.NetSceneH5F2fTransferGetQrCode", "amount: %d, setAmount: %s, desc: %s, walletType: %s", new Object[] { Long.valueOf(paramLong), Integer.valueOf(1), paramString, Integer.valueOf(paramInt) });
      GMTrace.o(17429111504896L, 129857);
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.NetSceneH5F2fTransferGetQrCode", localUnsupportedEncodingException, "", new Object[0]);
      }
    }
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(17429245722624L, 129858);
    this.kKx = paramJSONObject.optInt("retcode", 0);
    this.kKy = paramJSONObject.optString("retmsg", "");
    this.kKz = paramJSONObject.optString("qrcode_url", "");
    this.kKA = paramJSONObject.optInt("alert_type", 0);
    this.kKB = paramJSONObject.optString("alert_title", "");
    this.kKC = paramJSONObject.optString("left_button_text", "");
    this.kKD = paramJSONObject.optString("right_button_text", "");
    this.kKE = paramJSONObject.optString("right_button_url", "");
    this.kKF = paramJSONObject.optString("bottom_text", "");
    this.kKG = paramJSONObject.optString("bottom_url", "");
    this.kKH = paramJSONObject.optInt("currency", 0);
    this.kKI = paramJSONObject.optString("currencyunit", "");
    this.kKJ = paramJSONObject.optString("notice", "");
    this.kKK = paramJSONObject.optString("notice_url", "");
    this.kKL = paramJSONObject.optString("recv_realname", "");
    this.kKM = paramJSONObject.optInt("set_amount", 0);
    if (this.kKM == 0)
    {
      ap.AS();
      c.xi().a(w.a.vcp, this.kKz);
      w.i("MicroMsg.NetSceneH5F2fTransferGetQrCode", "set payurl: %s", new Object[] { this.kKz });
    }
    w.d("MicroMsg.NetSceneH5F2fTransferGetQrCode", "url: %s, currency: %s", new Object[] { this.kKz, Integer.valueOf(this.kKH) });
    GMTrace.o(17429245722624L, 129858);
  }
  
  public final String anH()
  {
    GMTrace.i(17429379940352L, 129859);
    GMTrace.o(17429379940352L, 129859);
    return "/cgi-bin/mmpay-bin/h5f2ftransfergetqrcode";
  }
  
  public final int anI()
  {
    GMTrace.i(17429648375808L, 129861);
    GMTrace.o(17429648375808L, 129861);
    return 1335;
  }
  
  public final boolean anJ()
  {
    GMTrace.i(17429782593536L, 129862);
    GMTrace.o(17429782593536L, 129862);
    return true;
  }
  
  public final int getType()
  {
    GMTrace.i(17429514158080L, 129860);
    GMTrace.o(17429514158080L, 129860);
    return 1335;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/b/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */