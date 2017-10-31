package com.tencent.mm.plugin.freewifi.e;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI;
import com.tencent.mm.sdk.platformtools.w;

public class e
{
  protected String appId;
  protected int cyK;
  protected int fjU;
  protected String fvF;
  protected final Intent intent;
  protected FreeWifiFrontPageUI meA;
  protected String meB;
  protected int meC;
  protected String meD;
  protected String ssid;
  
  public e(FreeWifiFrontPageUI paramFreeWifiFrontPageUI)
  {
    GMTrace.i(7244401868800L, 53975);
    this.meA = paramFreeWifiFrontPageUI;
    this.intent = paramFreeWifiFrontPageUI.getIntent();
    this.ssid = this.intent.getStringExtra("free_wifi_ssid");
    this.meB = this.intent.getStringExtra("free_wifi_url");
    this.fvF = this.intent.getStringExtra("free_wifi_ap_key");
    this.cyK = this.intent.getIntExtra("free_wifi_source", 1);
    this.fjU = this.intent.getIntExtra("free_wifi_channel_id", 0);
    this.appId = this.intent.getStringExtra("free_wifi_appid");
    this.meD = this.intent.getStringExtra("free_wifi_app_nickname");
    this.meC = this.intent.getIntExtra("ConstantsFreeWifi.FREE_WIFI_PROTOCOL_NUMBER", 0);
    w.i("MicroMsg.FreeWifi.ProtocolBase", "sessionKey=%s, step=%d, desc=Data retrieved. ssid=%s, fullUrl=%s, apKey=%s, source=%s, channelId=%d, appid=%s, appNickName=%s, protocolNumber=%d", new Object[] { m.B(this.intent), Integer.valueOf(m.C(this.intent)), this.ssid, this.meB, this.fvF, Integer.valueOf(this.cyK), Integer.valueOf(this.fjU), this.appId, this.meD, Integer.valueOf(this.meC) });
    GMTrace.o(7244401868800L, 53975);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/e/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */