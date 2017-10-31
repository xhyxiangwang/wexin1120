package com.tencent.mm.plugin.freewifi.e;

import android.content.Intent;
import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.freewifi.a.a.a;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.c;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.a;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.d;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.net.HttpURLConnection;

public final class h
  extends e
  implements a
{
  private String meM;
  private int meN;
  
  public h(FreeWifiFrontPageUI paramFreeWifiFrontPageUI)
  {
    super(paramFreeWifiFrontPageUI);
    GMTrace.i(7240509554688L, 53946);
    this.meN = 0;
    this.meM = this.intent.getStringExtra("free_wifi_portal_ap_info_authurl_with_params");
    w.i("MicroMsg.FreeWifi.ProtocolThreeOne", "sessionKey=%s, step=%d, desc=Data retrieved. authUrlWithParams=%s", new Object[] { m.B(this.intent), Integer.valueOf(m.C(this.intent)), this.meM });
    GMTrace.o(7240509554688L, 53946);
  }
  
  public final void V(int paramInt, String paramString)
  {
    GMTrace.i(7240777990144L, 53948);
    Object localObject = k.azB();
    ((k.a)localObject).ssid = this.ssid;
    ((k.a)localObject).bssid = m.xN("MicroMsg.FreeWifi.ProtocolThreeOne");
    ((k.a)localObject).fvG = m.xO("MicroMsg.FreeWifi.ProtocolThreeOne");
    ((k.a)localObject).fvF = this.fvF;
    ((k.a)localObject).mbW = this.appId;
    ((k.a)localObject).mbX = m.B(this.intent);
    ((k.a)localObject).mbY = 31;
    ((k.a)localObject).mbZ = k.b.mcA.mcK;
    ((k.a)localObject).mca = k.b.mcA.name;
    ((k.a)localObject).result = paramInt;
    ((k.a)localObject).kCB = paramString;
    ((k.a)localObject).fIC = m.E(this.intent);
    paramString = ((k.a)localObject).azD();
    localObject = this.intent;
    if (paramInt != 0) {}
    for (boolean bool = true;; bool = false)
    {
      paramString.b((Intent)localObject, bool).azC();
      GMTrace.o(7240777990144L, 53948);
      return;
    }
  }
  
  public final void connect()
  {
    GMTrace.i(7240643772416L, 53947);
    w.i("MicroMsg.FreeWifi.ProtocolThreeOne", "sessionKey=%s, step=%d, method=Protocol31.connect, desc=it starts connecting wifi by protocol 3.1. authUrlWithParams=%s", new Object[] { m.B(this.intent), Integer.valueOf(m.C(this.intent)), this.meM });
    final String str = this.meM;
    j.aAh().azR().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7239972683776L, 53942);
        w.i("MicroMsg.FreeWifi.ProtocolThreeOne", "sessionKey=%s, step=%d, method=Protocol31.httpAuthentication, desc=it sends http request for authentication. http url=%s", new Object[] { m.B(h.this.intent), Integer.valueOf(m.C(h.this.intent)), str });
        com.tencent.mm.plugin.freewifi.a.a.azK();
        com.tencent.mm.plugin.freewifi.a.a.a(str, new a.a()
        {
          public final void d(HttpURLConnection paramAnonymous2HttpURLConnection)
          {
            GMTrace.i(7237154111488L, 53921);
            int i = paramAnonymous2HttpURLConnection.getResponseCode();
            w.i("MicroMsg.FreeWifi.ProtocolThreeOne", "sessionKey=%s, step=%d, method=Protocol31.HttpAuthentication.onSuccess, desc=it receives http response for authentication. http response status code=%d", new Object[] { m.B(h.this.intent), Integer.valueOf(m.C(h.this.intent)), Integer.valueOf(i) });
            if (i == 200)
            {
              h.this.V(0, "");
              m.a(h.this.intent, h.this.fvF, h.this.meC, h.this.fjU, h.this.meA, "MicroMsg.FreeWifi.ProtocolThreeOne");
              GMTrace.o(7237154111488L, 53921);
              return;
            }
            if (i == 302)
            {
              paramAnonymous2HttpURLConnection = paramAnonymous2HttpURLConnection.getHeaderField("Location");
              h.this.xX(paramAnonymous2HttpURLConnection);
              GMTrace.o(7237154111488L, 53921);
              return;
            }
            w.i("MicroMsg.FreeWifi.ProtocolThreeOne", "sessionKey=%s, step=%d, method=Protocol31.httpAuthentication, desc=http response status code is neither 200 nor 302, so it fails to connect wifi. ", new Object[] { m.B(h.this.intent), Integer.valueOf(m.C(h.this.intent)) });
            paramAnonymous2HttpURLConnection = h.this.meA;
            FreeWifiFrontPageUI.d locald = FreeWifiFrontPageUI.d.mhe;
            FreeWifiFrontPageUI.a locala = new FreeWifiFrontPageUI.a();
            locala.mgD = m.a(h.this.meC, k.b.mcA, 32);
            paramAnonymous2HttpURLConnection.a(locald, locala);
            h.this.V(32, "INVALID_HTTP_RESP_CODE");
            GMTrace.o(7237154111488L, 53921);
          }
          
          public final void g(Exception paramAnonymous2Exception)
          {
            GMTrace.i(7237288329216L, 53922);
            w.i("MicroMsg.FreeWifi.ProtocolThreeOne", "sessionKey=%s, step=%d, method=Protocol31.httpAuthentication, desc=exception happens during http, so it fails to connect wifi. e.getMessage()=%s, stackTrace=%s", new Object[] { m.B(h.this.intent), Integer.valueOf(m.C(h.this.intent)), paramAnonymous2Exception.getMessage(), m.e(paramAnonymous2Exception) });
            FreeWifiFrontPageUI localFreeWifiFrontPageUI = h.this.meA;
            FreeWifiFrontPageUI.d locald = FreeWifiFrontPageUI.d.mhe;
            FreeWifiFrontPageUI.a locala = new FreeWifiFrontPageUI.a();
            locala.mgD = m.a(h.this.meC, k.b.mcA, m.f(paramAnonymous2Exception));
            localFreeWifiFrontPageUI.a(locald, locala);
            h.this.V(m.f(paramAnonymous2Exception), m.d(paramAnonymous2Exception));
            GMTrace.o(7237288329216L, 53922);
          }
        });
        GMTrace.o(7239972683776L, 53942);
      }
    });
    GMTrace.o(7240643772416L, 53947);
  }
  
  public final void xX(String paramString)
  {
    GMTrace.i(16035394617344L, 119473);
    this.meN += 1;
    if (this.meN > 3)
    {
      w.i("MicroMsg.FreeWifi.ProtocolThreeOne", "sessionKey=%s, step=%d, method=Protocol31.handle302Authentication, desc=Connection fail. Too many 302, exceeding 3 times", new Object[] { m.B(this.intent), Integer.valueOf(m.C(this.intent)) });
      paramString = this.meA;
      localObject1 = FreeWifiFrontPageUI.d.mhe;
      localObject2 = new FreeWifiFrontPageUI.a();
      ((FreeWifiFrontPageUI.a)localObject2).mgD = m.a(this.meC, k.b.mcA, 33);
      paramString.a((FreeWifiFrontPageUI.d)localObject1, localObject2);
      V(33, "AUTH_302_TIMES_EXCESS");
      GMTrace.o(16035394617344L, 119473);
      return;
    }
    w.i("MicroMsg.FreeWifi.ProtocolThreeOne", "sessionKey=%s, step=%d, method=Protocol31.handle302Authentication, desc=it discovers 302 Location and redirects. http response header Location=%s", new Object[] { m.B(this.intent), Integer.valueOf(m.C(this.intent)), paramString });
    if (m.xJ(paramString))
    {
      paramString = this.meA;
      localObject1 = FreeWifiFrontPageUI.d.mhe;
      localObject2 = new FreeWifiFrontPageUI.a();
      ((FreeWifiFrontPageUI.a)localObject2).mgD = m.a(this.meC, k.b.mcA, 34);
      paramString.a((FreeWifiFrontPageUI.d)localObject1, localObject2);
      V(34, "EMPTY_AUTH_LOCATION");
      GMTrace.o(16035394617344L, 119473);
      return;
    }
    Object localObject1 = new a.a()
    {
      public final void d(HttpURLConnection paramAnonymousHttpURLConnection)
      {
        GMTrace.i(7239301595136L, 53937);
        int i = paramAnonymousHttpURLConnection.getResponseCode();
        w.i("MicroMsg.FreeWifi.ProtocolThreeOne", "sessionKey=%s, step=%d, method=Protocol31.handle302Authentication.onSuccess, desc=it receives http response for authentication(after 302). http response status code=%d", new Object[] { m.B(h.this.intent), Integer.valueOf(m.C(h.this.intent)), Integer.valueOf(i) });
        if (i == 200)
        {
          h.this.V(0, "");
          m.a(h.this.intent, h.this.fvF, h.this.meC, h.this.fjU, h.this.meA, "MicroMsg.FreeWifi.ProtocolThreeOne");
          GMTrace.o(7239301595136L, 53937);
          return;
        }
        if (i == 302)
        {
          paramAnonymousHttpURLConnection = paramAnonymousHttpURLConnection.getHeaderField("Location");
          h.this.xX(paramAnonymousHttpURLConnection);
          GMTrace.o(7239301595136L, 53937);
          return;
        }
        w.i("MicroMsg.FreeWifi.ProtocolThreeOne", "sessionKey=%s, step=%d, method=Protocol31.handle302Authentication, desc=http response status code is not 200, so it fails to connect wifi. ", new Object[] { m.B(h.this.intent), Integer.valueOf(m.C(h.this.intent)) });
        paramAnonymousHttpURLConnection = h.this.meA;
        FreeWifiFrontPageUI.d locald = FreeWifiFrontPageUI.d.mhe;
        FreeWifiFrontPageUI.a locala = new FreeWifiFrontPageUI.a();
        locala.mgD = m.a(h.this.meC, k.b.mcA, 32);
        paramAnonymousHttpURLConnection.a(locald, locala);
        h.this.V(32, "INVALID_HTTP_RESP_CODE");
        GMTrace.o(7239301595136L, 53937);
      }
      
      public final void g(Exception paramAnonymousException)
      {
        GMTrace.i(7239435812864L, 53938);
        w.e("MicroMsg.FreeWifi.ProtocolThreeOne", "sessionKey=%s, step=%d, method=Protocol31.handle302Authentication.onException, desc=exception happens during http. e.getMessage()=%s, stacktrace=%s", new Object[] { m.B(h.this.intent), Integer.valueOf(m.C(h.this.intent)), paramAnonymousException.getMessage(), m.e(paramAnonymousException) });
        FreeWifiFrontPageUI localFreeWifiFrontPageUI = h.this.meA;
        FreeWifiFrontPageUI.d locald = FreeWifiFrontPageUI.d.mhe;
        FreeWifiFrontPageUI.a locala = new FreeWifiFrontPageUI.a();
        locala.mgD = m.a(h.this.meC, k.b.mcA, m.f(paramAnonymousException));
        localFreeWifiFrontPageUI.a(locald, locala);
        h.this.V(m.f(paramAnonymousException), m.d(paramAnonymousException));
        GMTrace.o(7239435812864L, 53938);
      }
    };
    Object localObject2 = Uri.parse(paramString);
    if ("post".equalsIgnoreCase(((Uri)localObject2).getQueryParameter("method")))
    {
      com.tencent.mm.plugin.freewifi.a.a.azK();
      com.tencent.mm.plugin.freewifi.a.a.a(paramString, ((Uri)localObject2).getEncodedQuery(), (a.a)localObject1);
      GMTrace.o(16035394617344L, 119473);
      return;
    }
    com.tencent.mm.plugin.freewifi.a.a.azK();
    com.tencent.mm.plugin.freewifi.a.a.a(paramString, (a.a)localObject1);
    GMTrace.o(16035394617344L, 119473);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/e/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */