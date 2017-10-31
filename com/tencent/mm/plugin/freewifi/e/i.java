package com.tencent.mm.plugin.freewifi.e;

import android.content.Intent;
import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.freewifi.a.a.a;
import com.tencent.mm.plugin.freewifi.d.f;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.c;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiErrorUI;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.a;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.b;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.d;
import com.tencent.mm.protocal.c.dy;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.net.HttpURLConnection;

public final class i
  extends e
  implements a
{
  protected String fwH;
  private int meN;
  protected String meQ;
  protected String meR;
  protected String meS;
  private Uri meT;
  private String meU;
  protected String sign;
  
  public i(FreeWifiFrontPageUI paramFreeWifiFrontPageUI)
  {
    super(paramFreeWifiFrontPageUI);
    GMTrace.i(7244938739712L, 53979);
    this.meN = 0;
    this.meU = this.intent.getStringExtra("free_wifi_schema_uri");
    this.meT = Uri.parse(this.meU);
    this.appId = this.meT.getQueryParameter("appId");
    this.meQ = this.meT.getQueryParameter("shopId");
    this.meR = this.meT.getQueryParameter("authUrl");
    this.meS = this.meT.getQueryParameter("extend");
    this.fwH = this.meT.getQueryParameter("timestamp");
    this.sign = this.meT.getQueryParameter("sign");
    w.i("MicroMsg.FreeWifi.Protocol33", "sessionKey=%s, step=%d, desc=Data retrieved. schemaUri=%s, appid=%s, shopId=%s, authUrl=%s, extend=%s, timestamp=%s, sign=%s", new Object[] { m.B(this.intent), Integer.valueOf(m.C(this.intent)), this.meT, this.appId, this.meQ, this.meR, this.meS, this.fwH, this.sign });
    GMTrace.o(7244938739712L, 53979);
  }
  
  protected final void aAE()
  {
    GMTrace.i(7245207175168L, 53981);
    j.aAh().azR().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7238630506496L, 53932);
        Object localObject = com.tencent.mm.plugin.freewifi.k.azB();
        ((k.a)localObject).ssid = i.this.ssid;
        ((k.a)localObject).bssid = m.xN("MicroMsg.FreeWifi.Protocol33");
        ((k.a)localObject).fvG = m.xO("MicroMsg.FreeWifi.Protocol33");
        ((k.a)localObject).fvF = i.this.fvF;
        ((k.a)localObject).mbX = m.B(i.this.intent);
        ((k.a)localObject).mbY = i.this.meC;
        ((k.a)localObject).mbZ = k.b.mcn.mcK;
        ((k.a)localObject).mca = k.b.mcn.name;
        ((k.a)localObject).fIC = m.E(i.this.intent);
        ((k.a)localObject).result = 0;
        ((k.a)localObject).azD().azC();
        localObject = d.azT();
        String str = d.azV();
        int i = d.azU();
        w.i("MicroMsg.FreeWifi.Protocol33", "sessionKey=%s, step=%d, method=Protocol33.getBackPageInfoAfterConnectSuccess, desc=it starts net request [apauth.getBackPageFor33]  for backpage info. fullUrl=%s, nowApMac=%s, nowNetworkSSID=%s, rssi=%d", new Object[] { m.B(i.this.intent), Integer.valueOf(m.C(i.this.intent)), "", localObject, str, Integer.valueOf(i) });
        new f(i.this.ssid, m.xN("MicroMsg.FreeWifi.Protocol33"), i.this.appId, i.this.meQ, i.this.meR, i.this.meS, i.this.fwH, i.this.sign).b(new com.tencent.mm.ac.e()
        {
          public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, com.tencent.mm.ac.k paramAnonymous2k)
          {
            GMTrace.i(7237825200128L, 53926);
            w.i("MicroMsg.FreeWifi.Protocol33", "sessionKey=%s, step=%d, method=FreeWifiConnector.getA8Key.callback, desc=net request [apauth.getBackPageFor33] returns. errType=%d, errCode=%d, errMsg=%s", new Object[] { m.B(i.this.intent), Integer.valueOf(m.C(i.this.intent)), Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2), paramAnonymous2String });
            Object localObject = com.tencent.mm.plugin.freewifi.k.azB();
            ((k.a)localObject).ssid = i.this.ssid;
            ((k.a)localObject).bssid = m.xN("MicroMsg.FreeWifi.Protocol33");
            ((k.a)localObject).fvG = m.xO("MicroMsg.FreeWifi.Protocol33");
            ((k.a)localObject).fvF = i.this.fvF;
            ((k.a)localObject).mbX = m.B(i.this.intent);
            ((k.a)localObject).mbY = m.D(i.this.intent);
            ((k.a)localObject).mbZ = k.b.mco.mcK;
            ((k.a)localObject).mca = k.b.mco.name;
            ((k.a)localObject).fIC = m.E(i.this.intent);
            ((k.a)localObject).result = paramAnonymous2Int2;
            ((k.a)localObject).kCB = paramAnonymous2String;
            ((k.a)localObject).azD().azC();
            if ((paramAnonymous2Int1 == 0) && (paramAnonymous2Int2 == 0))
            {
              paramAnonymous2String = ((f)paramAnonymous2k).aAs();
              if (paramAnonymous2String != null)
              {
                w.i("MicroMsg.FreeWifi.Protocol33", "backPageInfo appid: %s, nickName: %s, userName: %s, finishActionCode: %d, finishUrl: %s, signature: %s, qingHuaiPageUrl: %s", new Object[] { paramAnonymous2String.mGI, paramAnonymous2String.jYc, paramAnonymous2String.jWW, Integer.valueOf(paramAnonymous2String.txV), paramAnonymous2String.txW, paramAnonymous2String.huM, paramAnonymous2String.txX });
                paramAnonymous2k = i.this.meA;
                localObject = FreeWifiFrontPageUI.d.mhf;
                FreeWifiFrontPageUI.b localb = new FreeWifiFrontPageUI.b();
                localb.mhb = paramAnonymous2String;
                paramAnonymous2k.a((FreeWifiFrontPageUI.d)localObject, localb);
                GMTrace.o(7237825200128L, 53926);
                return;
              }
              paramAnonymous2String = i.this.meA;
              paramAnonymous2k = FreeWifiFrontPageUI.d.mhe;
              localObject = new FreeWifiFrontPageUI.a();
              ((FreeWifiFrontPageUI.a)localObject).mgD = m.a(i.this.meC, k.b.mco, 20);
              paramAnonymous2String.a(paramAnonymous2k, localObject);
              GMTrace.o(7237825200128L, 53926);
              return;
            }
            if (paramAnonymous2Int2 == 35504)
            {
              paramAnonymous2String = new Intent();
              paramAnonymous2String.putExtra("free_wifi_error_ui_error_msg", i.this.meA.getString(R.l.eaP));
              paramAnonymous2String.setClass(i.this.meA, FreeWifiErrorUI.class);
              i.this.meA.finish();
              i.this.meA.startActivity(paramAnonymous2String);
              GMTrace.o(7237825200128L, 53926);
              return;
            }
            paramAnonymous2String = i.this.meA;
            paramAnonymous2k = FreeWifiFrontPageUI.d.mhe;
            localObject = new FreeWifiFrontPageUI.a();
            ((FreeWifiFrontPageUI.a)localObject).mgC = R.l.eaM;
            ((FreeWifiFrontPageUI.a)localObject).mgD = m.a(i.this.meC, k.b.mco, paramAnonymous2Int2);
            paramAnonymous2String.a(paramAnonymous2k, localObject);
            GMTrace.o(7237825200128L, 53926);
          }
        });
        GMTrace.o(7238630506496L, 53932);
      }
    });
    GMTrace.o(7245207175168L, 53981);
  }
  
  public final void connect()
  {
    GMTrace.i(7245072957440L, 53980);
    FreeWifiFrontPageUI.d locald;
    FreeWifiFrontPageUI.a locala;
    if (m.xJ(this.ssid))
    {
      w.i("MicroMsg.FreeWifi.Protocol33", "sessionKey=%s, step=%d, desc=it cannot get ssid, so it fails. ", new Object[] { m.B(this.intent), Integer.valueOf(m.C(this.intent)) });
      localObject = this.meA;
      locald = FreeWifiFrontPageUI.d.mhe;
      locala = new FreeWifiFrontPageUI.a();
      locala.mgD = m.a(this.meC, k.b.mcD, 32);
      ((FreeWifiFrontPageUI)localObject).a(locald, locala);
      GMTrace.o(7245072957440L, 53980);
      return;
    }
    if (m.xJ(this.meR))
    {
      w.i("MicroMsg.FreeWifi.Protocol33", "sessionKey=%s, step=%d, desc=authurl is empty, so it fails. ", new Object[] { m.B(this.intent), Integer.valueOf(m.C(this.intent)) });
      localObject = this.meA;
      locald = FreeWifiFrontPageUI.d.mhe;
      locala = new FreeWifiFrontPageUI.a();
      locala.mgD = m.a(this.meC, k.b.mcD, 32);
      ((FreeWifiFrontPageUI)localObject).a(locald, locala);
      GMTrace.o(7245072957440L, 53980);
      return;
    }
    final Object localObject = new StringBuilder(this.meR);
    if (this.meR.indexOf("?") == -1) {
      ((StringBuilder)localObject).append("?extend=").append(this.meS);
    }
    for (;;)
    {
      localObject = ((StringBuilder)localObject).toString();
      j.aAh().azR().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7241314861056L, 53952);
          w.i("MicroMsg.FreeWifi.Protocol33", "sessionKey=%s, step=%d, method=Protocol33.httpAuthentication, desc=it sends http request for authentication. http url=%s", new Object[] { m.B(i.this.intent), Integer.valueOf(m.C(i.this.intent)), localObject });
          com.tencent.mm.plugin.freewifi.a.a.azK();
          com.tencent.mm.plugin.freewifi.a.a.a(localObject, new a.a()
          {
            public final void d(HttpURLConnection paramAnonymous2HttpURLConnection)
            {
              GMTrace.i(7244670304256L, 53977);
              int i = paramAnonymous2HttpURLConnection.getResponseCode();
              w.i("MicroMsg.FreeWifi.Protocol33", "sessionKey=%s, step=%d, method=Protocol33.HttpAuthentication.onSuccess, desc=it receives http response for authentication. http response status code=%d", new Object[] { m.B(i.this.intent), Integer.valueOf(m.C(i.this.intent)), Integer.valueOf(i) });
              if (i == 200)
              {
                i.this.aAE();
                GMTrace.o(7244670304256L, 53977);
                return;
              }
              if (i == 302)
              {
                paramAnonymous2HttpURLConnection = paramAnonymous2HttpURLConnection.getHeaderField("Location");
                i.this.xX(paramAnonymous2HttpURLConnection);
                GMTrace.o(7244670304256L, 53977);
                return;
              }
              w.i("MicroMsg.FreeWifi.Protocol33", "sessionKey=%s, step=%d, method=Protocol33.httpAuthentication, desc=http response status code is neither 200 nor 302, so it fails to connect wifi. ", new Object[] { m.B(i.this.intent), Integer.valueOf(m.C(i.this.intent)) });
              paramAnonymous2HttpURLConnection = i.this.meA;
              FreeWifiFrontPageUI.d locald = FreeWifiFrontPageUI.d.mhe;
              FreeWifiFrontPageUI.a locala = new FreeWifiFrontPageUI.a();
              locala.mgD = m.a(i.this.meC, k.b.mcD, 32);
              paramAnonymous2HttpURLConnection.a(locald, locala);
              GMTrace.o(7244670304256L, 53977);
            }
            
            public final void g(Exception paramAnonymous2Exception)
            {
              GMTrace.i(7244804521984L, 53978);
              w.i("MicroMsg.FreeWifi.Protocol33", "sessionKey=%s, step=%d, method=Protocol33.httpAuthentication, desc=exception happens during http, so it fails to connect wifi. e.getMessage()=%s, stacktrace=%s", new Object[] { m.B(i.this.intent), Integer.valueOf(m.C(i.this.intent)), paramAnonymous2Exception.getMessage(), m.e(paramAnonymous2Exception) });
              FreeWifiFrontPageUI localFreeWifiFrontPageUI = i.this.meA;
              FreeWifiFrontPageUI.d locald = FreeWifiFrontPageUI.d.mhe;
              FreeWifiFrontPageUI.a locala = new FreeWifiFrontPageUI.a();
              locala.mgD = m.a(i.this.meC, k.b.mcD, m.f(paramAnonymous2Exception));
              localFreeWifiFrontPageUI.a(locald, locala);
              GMTrace.o(7244804521984L, 53978);
            }
          });
          GMTrace.o(7241314861056L, 53952);
        }
      });
      GMTrace.o(7245072957440L, 53980);
      return;
      ((StringBuilder)localObject).append("&extend=").append(this.meS);
    }
  }
  
  public final void xX(String paramString)
  {
    GMTrace.i(16035931488256L, 119477);
    this.meN += 1;
    if (this.meN > 3)
    {
      w.i("MicroMsg.FreeWifi.Protocol33", "sessionKey=%s, step=%d, method=Protocol33.handle302Authentication, desc=Connection fail. Too many 302, exceeding 3 times", new Object[] { m.B(this.intent), Integer.valueOf(m.C(this.intent)) });
      paramString = this.meA;
      localObject1 = FreeWifiFrontPageUI.d.mhe;
      localObject2 = new FreeWifiFrontPageUI.a();
      ((FreeWifiFrontPageUI.a)localObject2).mgD = m.a(this.meC, k.b.mcD, 33);
      paramString.a((FreeWifiFrontPageUI.d)localObject1, localObject2);
      GMTrace.o(16035931488256L, 119477);
      return;
    }
    w.i("MicroMsg.FreeWifi.Protocol33", "sessionKey=%s, step=%d, method=Protocol33.handle302Authentication, desc=it discovers 302 Location and redirects. http response header Location=%s", new Object[] { m.B(this.intent), Integer.valueOf(m.C(this.intent)), paramString });
    if (m.xJ(paramString))
    {
      paramString = this.meA;
      localObject1 = FreeWifiFrontPageUI.d.mhe;
      localObject2 = new FreeWifiFrontPageUI.a();
      ((FreeWifiFrontPageUI.a)localObject2).mgD = m.a(this.meC, k.b.mcD, 34);
      paramString.a((FreeWifiFrontPageUI.d)localObject1, localObject2);
      GMTrace.o(16035931488256L, 119477);
      return;
    }
    Object localObject1 = new a.a()
    {
      public final void d(HttpURLConnection paramAnonymousHttpURLConnection)
      {
        GMTrace.i(7235006627840L, 53905);
        int i = paramAnonymousHttpURLConnection.getResponseCode();
        w.i("MicroMsg.FreeWifi.Protocol33", "sessionKey=%s, step=%d, method=Protocol33.handle302Authentication.onSuccess, desc=it receives http response for authentication(after 302). http response status code=%d", new Object[] { m.B(i.this.intent), Integer.valueOf(m.C(i.this.intent)), Integer.valueOf(i) });
        if (i == 200)
        {
          i.this.aAE();
          GMTrace.o(7235006627840L, 53905);
          return;
        }
        if (i == 302)
        {
          paramAnonymousHttpURLConnection = paramAnonymousHttpURLConnection.getHeaderField("Location");
          i.this.xX(paramAnonymousHttpURLConnection);
          GMTrace.o(7235006627840L, 53905);
          return;
        }
        w.i("MicroMsg.FreeWifi.Protocol33", "sessionKey=%s, step=%d, method=Protocol33.handle302Authentication, desc=http response status code is not 200, so it fails to connect wifi. ", new Object[] { m.B(i.this.intent), Integer.valueOf(m.C(i.this.intent)) });
        paramAnonymousHttpURLConnection = i.this.meA;
        FreeWifiFrontPageUI.d locald = FreeWifiFrontPageUI.d.mhe;
        FreeWifiFrontPageUI.a locala = new FreeWifiFrontPageUI.a();
        locala.mgD = m.a(i.this.meC, k.b.mcD, 32);
        paramAnonymousHttpURLConnection.a(locald, locala);
        GMTrace.o(7235006627840L, 53905);
      }
      
      public final void g(Exception paramAnonymousException)
      {
        GMTrace.i(7235140845568L, 53906);
        w.e("MicroMsg.FreeWifi.Protocol33", "sessionKey=%s, step=%d, method=Protocol33.handle302Authentication.onException, desc=exception happens during http. e.getMessage()=%s, stacktrace=%s", new Object[] { m.B(i.this.intent), Integer.valueOf(m.C(i.this.intent)), paramAnonymousException.getMessage(), m.e(paramAnonymousException) });
        FreeWifiFrontPageUI localFreeWifiFrontPageUI = i.this.meA;
        FreeWifiFrontPageUI.d locald = FreeWifiFrontPageUI.d.mhe;
        FreeWifiFrontPageUI.a locala = new FreeWifiFrontPageUI.a();
        locala.mgD = m.a(i.this.meC, k.b.mcD, m.f(paramAnonymousException));
        localFreeWifiFrontPageUI.a(locald, locala);
        GMTrace.o(7235140845568L, 53906);
      }
    };
    Object localObject2 = Uri.parse(paramString);
    if ("post".equalsIgnoreCase(((Uri)localObject2).getQueryParameter("method")))
    {
      com.tencent.mm.plugin.freewifi.a.a.azK();
      com.tencent.mm.plugin.freewifi.a.a.a(paramString, ((Uri)localObject2).getEncodedQuery(), (a.a)localObject1);
      GMTrace.o(16035931488256L, 119477);
      return;
    }
    com.tencent.mm.plugin.freewifi.a.a.azK();
    com.tencent.mm.plugin.freewifi.a.a.a(paramString, (a.a)localObject1);
    GMTrace.o(16035931488256L, 119477);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/e/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */