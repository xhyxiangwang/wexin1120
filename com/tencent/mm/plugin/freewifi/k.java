package com.tencent.mm.plugin.freewifi;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.freewifi.f.b;
import com.tencent.mm.plugin.freewifi.g.f;
import com.tencent.mm.plugin.freewifi.model.c;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class k
{
  public static Map<String, String> mbT;
  public String bssid;
  public int fIC;
  public String fvF;
  public String fvG;
  public String kCB;
  public int mbU;
  public String mbV;
  public String mbW;
  public String mbX;
  public int mbY;
  public long mbZ;
  public String mca;
  public String mcb;
  public long mcc;
  public int result;
  public String ssid;
  
  static
  {
    GMTrace.i(7263863439360L, 54120);
    mbT = new HashMap() {};
    GMTrace.o(7263863439360L, 54120);
  }
  
  public k()
  {
    GMTrace.i(7261044867072L, 54099);
    GMTrace.o(7261044867072L, 54099);
  }
  
  public static a azB()
  {
    GMTrace.i(7261179084800L, 54100);
    a locala = new a();
    GMTrace.o(7261179084800L, 54100);
    return locala;
  }
  
  public static String xI(String paramString)
  {
    GMTrace.i(7260910649344L, 54098);
    paramString = m.xL((String)mbT.get(paramString));
    GMTrace.o(7260910649344L, 54098);
    return paramString;
  }
  
  public final k azC()
  {
    GMTrace.i(7261313302528L, 54101);
    g.paX.i(12804, new Object[] { m.xL(this.ssid), m.xL(this.bssid), m.xL(this.fvG), m.xL(this.fvF), Integer.valueOf(this.mbU), m.xL(this.mbV), m.xL(this.mbW), m.xL(this.mbX), Integer.valueOf(this.mbY), Long.valueOf(this.mbZ), m.xL(this.mca), Integer.valueOf(this.result), Integer.valueOf(this.fIC), m.xL(this.mcb), Long.valueOf(this.mcc), m.xL(this.kCB) });
    GMTrace.o(7261313302528L, 54101);
    return this;
  }
  
  public final k b(final Intent paramIntent, boolean paramBoolean)
  {
    GMTrace.i(7261447520256L, 54102);
    for (;;)
    {
      try
      {
        i = m.D(paramIntent);
        if (i != 31)
        {
          GMTrace.o(7261447520256L, 54102);
          return this;
        }
        localObject = new JSONObject();
      }
      catch (Exception paramIntent)
      {
        final int i;
        final Object localObject;
        String str;
        w.e("MicroMsg.FreeWifi.FreeWifiQualityReporter", "reportWifiServer() write to local file exception. " + m.e(paramIntent));
        continue;
        paramIntent.putExtra("ConstantsFreeWifi.FREE_WIFI_REPORT_WIFI_SERVER_JSON", localJSONException + "," + (String)localObject);
        continue;
      }
      try
      {
        ((JSONObject)localObject).put("ssid", this.ssid);
        ((JSONObject)localObject).put("bssid", this.bssid);
        ((JSONObject)localObject).put("clientMac", this.fvG);
        ((JSONObject)localObject).put("apKey", this.fvF);
        ((JSONObject)localObject).put("qrtype", this.mbU);
        ((JSONObject)localObject).put("mpShopId", this.mbV);
        ((JSONObject)localObject).put("mpAppId", this.mbW);
        ((JSONObject)localObject).put("sessionKey", this.mbX);
        ((JSONObject)localObject).put("protocolType", this.mbY);
        ((JSONObject)localObject).put("stageCode", this.mbZ);
        ((JSONObject)localObject).put("stageName", this.mca);
        ((JSONObject)localObject).put("result", this.result);
        ((JSONObject)localObject).put("channel", this.fIC);
        ((JSONObject)localObject).put("mpUserName", this.mcb);
        ((JSONObject)localObject).put("timeCost", this.mcc);
        ((JSONObject)localObject).put("resultMsg", this.kCB);
        ((JSONObject)localObject).put("logCurrentTimeMillis", System.currentTimeMillis());
        localObject = ((JSONObject)localObject).toString();
        str = paramIntent.getStringExtra("ConstantsFreeWifi.FREE_WIFI_REPORT_WIFI_SERVER_JSON");
        if (m.xJ(str))
        {
          paramIntent.putExtra("ConstantsFreeWifi.FREE_WIFI_REPORT_WIFI_SERVER_JSON", (String)localObject);
          final long l = System.currentTimeMillis();
          localObject = paramIntent.getStringExtra("ConstantsFreeWifi.FREE_WIFI_REPORT_WIFI_SERVER_ID");
          paramIntent = paramIntent.getStringExtra("ConstantsFreeWifi.FREE_WIFI_REPORT_WIFI_SERVER_JSON");
          if (paramBoolean) {
            j.aAi().azR().post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(7148436193280L, 53260);
                j.aAg().a(localObject, i, paramIntent, l);
                if (m.azI()) {
                  b.nK(1);
                }
                GMTrace.o(7148436193280L, 53260);
              }
            });
          }
          GMTrace.o(7261447520256L, 54102);
          return this;
        }
      }
      catch (JSONException localJSONException)
      {
        w.e("MicroMsg.FreeWifi.FreeWifiQualityReporter", "JSONException e. " + m.e(localJSONException));
      }
    }
  }
  
  public static final class a
  {
    public String bssid;
    public int fIC;
    public String fvF;
    public String fvG;
    public String kCB;
    private int mbU;
    public String mbV;
    public String mbW;
    public String mbX;
    public int mbY;
    public long mbZ;
    public String mca;
    public String mcb;
    private long mcc;
    public int result;
    public String ssid;
    
    public a()
    {
      GMTrace.i(7128169316352L, 53109);
      GMTrace.o(7128169316352L, 53109);
    }
    
    public final k azD()
    {
      GMTrace.i(7128303534080L, 53110);
      k localk = new k();
      localk.ssid = this.ssid;
      localk.bssid = this.bssid;
      localk.fvG = this.fvG;
      localk.fvF = this.fvF;
      localk.mbU = this.mbU;
      localk.mbV = this.mbV;
      localk.mbW = this.mbW;
      localk.mbX = this.mbX;
      localk.mbY = this.mbY;
      localk.mbZ = Integer.valueOf("1" + String.format("%03d", new Object[] { Integer.valueOf(this.mbY) }) + String.format("%03d", new Object[] { Long.valueOf(this.mbZ) })).intValue();
      localk.mca = this.mca;
      localk.result = this.result;
      localk.fIC = this.fIC;
      localk.mcb = this.mcb;
      localk.mcc = this.mcc;
      localk.kCB = this.kCB;
      GMTrace.o(7128303534080L, 53110);
      return localk;
    }
  }
  
  public static enum b
  {
    public long mcK;
    String mcL;
    public String name;
    
    static
    {
      GMTrace.i(7264400310272L, 54124);
      mch = new b("GetFrontPage", 0, 10L, "getFrontPage", "a");
      mci = new b("GetFrontPageReturn", 1, 11L, "getFrontpageReturn", "ar");
      mcj = new b("GetFrontPageReturnDataCheck", 2, 12L, "getFrontPageReturnDataCheck", "ard");
      mck = new b("AddNetwork", 3, 20L, "addNetwork", "n");
      mcl = new b("GetBackPage", 4, 30L, "getBackPage", "b");
      mcm = new b("GetBackPageReturn", 5, 31L, "getBackPageReturn", "br");
      mcn = new b("GetBackPage33", 6, 32L, "getBackPage33", "b33");
      mco = new b("GetBackPage33Return", 7, 33L, "getBackPage33Return", "b33r");
      mcp = new b("BackpageFinished", 8, 40L, "backpageFinished", "bf");
      mcq = new b("QinghuaiBackpageFinished", 9, 50L, "qinghuaiBackpageFinished", "qbf");
      mcr = new b("ScanNearFieldWifiAndReport", 10, 110L, "scanNearFieldWifiAndReport", "sc");
      mcs = new b("GetThreeOneLock", 11, 290L, "getThreeOneLock", "31lk");
      mct = new b("GetPortalApInfo", 12, 300L, "getPortalApInfo", "o");
      mcu = new b("GetPortalApInfoReturn", 13, 301L, "getPortalApInfoReturn", "or");
      mcv = new b("GetPortalApInfoReturnDataCheck", 14, 302L, "getPortalApInfoReturnDataCheck", "ord");
      mcw = new b("FrontPageUIClosed", 15, 303L, "frontPageUIClosed", "af");
      mcx = new b("FrontPageUIClosedByGoBack", 16, 311L, "frontPageUIClosedByGoBack", "afg");
      mcy = new b("FrontPageUIClosedByGoSuc", 17, 312L, "frontPageUIClosedByGoSuc", "afs");
      mcz = new b("FrontPageUIClosedByGoContactInfoUI", 18, 313L, "frontPageUIClosedByGoContactInfoUI", "afc");
      mcA = new b("ThreeOneAuth", 19, 305L, "threeOneAuth", "31a");
      mcB = new b("ThreeTwoAuth", 20, 306L, "threeTwoAuth", "32a");
      mcC = new b("ThreeTwoBlack", 21, 307L, "threeTwoAuthBlack", "32ab");
      mcD = new b("ThreeThreeAuth", 22, 308L, "threeThreeAuth", "33a");
      mcE = new b("GetPcFrontPage", 23, 210L, "getPcFrontPage", "pca");
      mcF = new b("GetPcFrontPageReturn", 24, 211L, "getPcFrontPageReturn", "pcar");
      mcG = new b("SetPcLoginUserInfo", 25, 212L, "setPcLoginUserInfo", "pcset");
      mcH = new b("SetPcLoginUserInfoReturn", 26, 212L, "setPcLoginUserInfoReturn", "pcsetr");
      mcI = new b("ManufacturerConnectLoading", 27, 500L, "manufacturerConnectLoading", "mld");
      mcJ = new b("CopyPwdPageUIClosedByGoBack", 28, 600L, "CopyPwdPageUIClosedByGoBack", "cpg");
      mcM = new b[] { mch, mci, mcj, mck, mcl, mcm, mcn, mco, mcp, mcq, mcr, mcs, mct, mcu, mcv, mcw, mcx, mcy, mcz, mcA, mcB, mcC, mcD, mcE, mcF, mcG, mcH, mcI, mcJ };
      GMTrace.o(7264400310272L, 54124);
    }
    
    private b(long paramLong, String paramString1, String paramString2)
    {
      GMTrace.i(7264266092544L, 54123);
      if ((paramLong > 999L) || (paramLong < 0L)) {
        throw new IllegalArgumentException("code must be between 0 and 999");
      }
      this.mcK = paramLong;
      this.name = paramString1;
      this.mcL = paramString2;
      GMTrace.o(7264266092544L, 54123);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */