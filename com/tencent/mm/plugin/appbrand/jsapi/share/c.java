package com.tencent.mm.plugin.appbrand.jsapi.share;

import android.content.Intent;
import android.content.res.Resources;
import android.util.Log;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.m;
import com.tencent.mm.plugin.appbrand.menu.l;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.s;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.mm.x.q.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 240;
  public static final String NAME = "shareAppMessageDirectly";
  
  public c()
  {
    GMTrace.i(18230928211968L, 135831);
    GMTrace.o(18230928211968L, 135831);
  }
  
  public final void a(final com.tencent.mm.plugin.appbrand.k paramk, final JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(18231062429696L, 135832);
    w.i("MicroMsg.JsApiShareAppMessageDirectly", "invoke share app message directly.");
    if (paramJSONObject == null)
    {
      w.i("MicroMsg.JsApiShareAppMessageDirectly", "data is null");
      paramk.v(paramInt, d("fail:data is null", null));
      GMTrace.o(18231062429696L, 135832);
      return;
    }
    final MMActivity localMMActivity = a(paramk);
    if (localMMActivity == null)
    {
      w.i("MicroMsg.JsApiShareAppMessageDirectly", "share app message fail, context is null");
      paramk.v(paramInt, d("fail: page context is null", null));
      GMTrace.o(18231062429696L, 135832);
      return;
    }
    final AppBrandPageView localAppBrandPageView = b(paramk);
    if (localAppBrandPageView == null)
    {
      w.i("MicroMsg.JsApiShareAppMessageDirectly", "share app message fail, pageView is null");
      paramk.v(paramInt, d("fail:current page do not exist", null));
      GMTrace.o(18231062429696L, 135832);
      return;
    }
    final Object localObject = localAppBrandPageView.jb(l.jii);
    if (localObject == null)
    {
      w.i("MicroMsg.JsApiShareAppMessageDirectly", "share app message fail, menuInfo is null.");
      paramk.v(paramInt, d("fail:menu is null", null));
      GMTrace.o(18231062429696L, 135832);
      return;
    }
    final AppBrandSysConfig localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.nx(paramk.iqL);
    final boolean bool2 = ((com.tencent.mm.plugin.appbrand.menu.k)localObject).iLn.getBoolean("enable_share_with_share_ticket", false);
    final int i;
    final String str1;
    final String str2;
    final String str3;
    final String str4;
    final boolean bool3;
    final String str5;
    final String str6;
    final String str7;
    HashMap localHashMap;
    Intent localIntent;
    if (bool2)
    {
      i = 3;
      str1 = paramJSONObject.optString("title");
      str2 = paramJSONObject.optString("desc", "");
      str3 = paramJSONObject.optString("path");
      str4 = paramJSONObject.optString("imageUrl");
      paramJSONObject = paramJSONObject.optString("cacheKey");
      bool3 = ((com.tencent.mm.plugin.appbrand.menu.k)localObject).iLn.gj("enable_share_dynamic");
      localObject = paramk.iqL;
      str5 = localAppBrandSysConfig.ftu;
      int j = localAppBrandSysConfig.iJa.iCx;
      int k = localAppBrandSysConfig.iJa.iCy;
      str6 = m.nU(paramk.iqL);
      str7 = i.a(localAppBrandPageView, str4);
      localHashMap = new HashMap();
      localHashMap.put("desc", str2);
      localHashMap.put("type", Integer.valueOf(i));
      localHashMap.put("title", str1);
      localHashMap.put("app_id", localObject);
      localHashMap.put("pkg_type", Integer.valueOf(j));
      localHashMap.put("pkg_version", Integer.valueOf(k));
      localHashMap.put("img_url", str4);
      localHashMap.put("is_dynamic", Boolean.valueOf(bool3));
      localHashMap.put("cache_key", paramJSONObject);
      localHashMap.put("path", str3);
      if (!bg.mZ(str7)) {
        localHashMap.put("delay_load_img_path", "file://" + str7);
      }
      localIntent = new Intent();
      localIntent.putExtra("Select_Conv_Type", 3);
      if (bool2) {
        break label593;
      }
    }
    label593:
    for (boolean bool1 = true;; bool1 = false)
    {
      localIntent.putExtra("mutil_select_is_ret", bool1);
      localIntent.putExtra("select_is_ret", true);
      localIntent.putExtra("scene_from", 3);
      localIntent.putExtra("appbrand_params", localHashMap);
      localIntent.putExtra("Retr_Msg_Type", 2);
      com.tencent.mm.bi.d.a(localMMActivity, ".ui.transmit.SelectConversationUI", localIntent, 1, new MMActivity.a()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
        {
          GMTrace.i(18231330865152L, 135834);
          if (paramAnonymousInt1 != 1)
          {
            w.i("MicroMsg.JsApiShareAppMessageDirectly", "requestCode(%d) not corrected.", new Object[] { Integer.valueOf(paramAnonymousInt1) });
            GMTrace.o(18231330865152L, 135834);
            return;
          }
          if (paramAnonymousInt2 != -1)
          {
            w.i("MicroMsg.JsApiShareAppMessageDirectly", "resultCode is not RESULT_OK(%d)", new Object[] { Integer.valueOf(paramAnonymousInt2) });
            paramk.v(paramInt, c.this.d("cancel", null));
            GMTrace.o(18231330865152L, 135834);
            return;
          }
          if (paramAnonymousIntent == null) {}
          for (String str = null; (str == null) || (str.length() == 0); str = paramAnonymousIntent.getStringExtra("Select_Conv_User"))
          {
            w.e("MicroMsg.JsApiShareAppMessageDirectly", "mmOnActivityResult fail, toUser is null");
            paramk.v(paramInt, c.this.d("fail:selected user is nil", null));
            GMTrace.o(18231330865152L, 135834);
            return;
          }
          w.i("MicroMsg.JsApiShareAppMessageDirectly", "result success toUser : %s ", new Object[] { str });
          paramAnonymousIntent = paramAnonymousIntent.getStringExtra("custom_send_text");
          final SendAppMessageTask localSendAppMessageTask = new SendAppMessageTask();
          localSendAppMessageTask.jbk = paramAnonymousIntent;
          localSendAppMessageTask.toUser = str;
          localSendAppMessageTask.appId = localObject;
          localSendAppMessageTask.userName = str5;
          localSendAppMessageTask.title = str1;
          localSendAppMessageTask.description = str2;
          localSendAppMessageTask.url = str6;
          localSendAppMessageTask.path = str3;
          localSendAppMessageTask.type = i;
          localSendAppMessageTask.jbl = str4;
          localSendAppMessageTask.iconUrl = localAppBrandSysConfig.iIF;
          localSendAppMessageTask.fBH = localAppBrandSysConfig.iJa.iCx;
          localSendAppMessageTask.iJX = localAppBrandSysConfig.iJa.iCB;
          localSendAppMessageTask.version = localAppBrandSysConfig.iJa.iCy;
          localSendAppMessageTask.fvS = localAppBrandSysConfig.fxq;
          localSendAppMessageTask.jbn = j.nR(localObject).irP.getAndIncrement();
          localSendAppMessageTask.jbp = localAppBrandPageView.jlc.jlV;
          localSendAppMessageTask.jbq = localAppBrandPageView.Zc();
          paramAnonymousIntent = com.tencent.mm.plugin.appbrand.a.ny(localObject);
          if (paramAnonymousIntent != null)
          {
            if (paramAnonymousIntent.scene == 0)
            {
              paramAnonymousInt1 = 1000;
              localSendAppMessageTask.scene = paramAnonymousInt1;
              localSendAppMessageTask.fty = bg.mY(paramAnonymousIntent.fty);
              localSendAppMessageTask.jbo = bg.mY(com.tencent.mm.plugin.appbrand.i.b(paramk.irS).irM);
            }
          }
          else
          {
            localSendAppMessageTask.jbm = str7;
            localSendAppMessageTask.withShareTicket = bool2;
            localSendAppMessageTask.jbr = bool3;
            localSendAppMessageTask.iMh = paramJSONObject;
            paramAnonymousIntent = localAppBrandPageView.Zd();
            if (paramAnonymousIntent != null) {
              break label589;
            }
            paramAnonymousIntent = "";
            label506:
            localSendAppMessageTask.jbs = paramAnonymousIntent;
            if (!bool2) {
              break label600;
            }
            localSendAppMessageTask.iQi = new Runnable()
            {
              public final void run()
              {
                GMTrace.i(18233612566528L, 135851);
                w.i("MicroMsg.JsApiShareAppMessageDirectly", "task callback");
                localSendAppMessageTask.VE();
                HashMap localHashMap = new HashMap();
                JSONArray localJSONArray = new JSONArray();
                try
                {
                  if (!bg.bX(localSendAppMessageTask.jbt))
                  {
                    Iterator localIterator = localSendAppMessageTask.jbt.iterator();
                    while (localIterator.hasNext())
                    {
                      ShareInfo localShareInfo = (ShareInfo)localIterator.next();
                      JSONObject localJSONObject = new JSONObject();
                      localJSONObject.put("shareKey", localShareInfo.hju);
                      localJSONObject.put("shareName", localShareInfo.hjt);
                      localJSONArray.put(localJSONObject);
                    }
                  }
                  return;
                }
                catch (JSONException localJSONException)
                {
                  w.e("MicroMsg.JsApiShareAppMessageDirectly", Log.getStackTraceString(localJSONException));
                  localHashMap.put("shareInfos", localJSONArray);
                  c.1.this.iPN.v(c.1.this.gQa, c.this.d("ok", localHashMap));
                  GMTrace.o(18233612566528L, 135851);
                }
              }
            };
            localSendAppMessageTask.VD();
            AppBrandMainProcessService.a(localSendAppMessageTask);
          }
          for (;;)
          {
            if (localMMActivity != null) {
              h.bl(localMMActivity, localMMActivity.getResources().getString(p.i.iwj));
            }
            GMTrace.o(18231330865152L, 135834);
            return;
            paramAnonymousInt1 = paramAnonymousIntent.scene;
            break;
            label589:
            paramAnonymousIntent = paramAnonymousIntent.jeA.getUrl();
            break label506;
            label600:
            AppBrandMainProcessService.a(localSendAppMessageTask);
            paramk.v(paramInt, c.this.d("ok", null));
          }
        }
      });
      GMTrace.o(18231062429696L, 135832);
      return;
      i = 2;
      break;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/share/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */