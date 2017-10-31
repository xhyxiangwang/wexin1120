package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.text.TextUtils;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams.a;
import com.tencent.mm.plugin.appbrand.d.b;
import com.tencent.mm.plugin.appbrand.d.c;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.share.i;
import com.tencent.mm.plugin.appbrand.m;
import com.tencent.mm.plugin.appbrand.n.h;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.n;
import com.tencent.mm.protocal.c.acp;
import com.tencent.mm.protocal.c.acq;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONObject;

public final class c
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 145;
  public static final String NAME = "enterContact";
  public static int iSC;
  public AppBrandPageView iTB;
  private String iVN;
  public String iVO;
  public String iVP;
  public String iVQ;
  public boolean iVR;
  public int iVS;
  private String sessionFrom;
  
  static
  {
    GMTrace.i(18210795552768L, 135681);
    iSC = 0;
    GMTrace.o(18210795552768L, 135681);
  }
  
  public c()
  {
    GMTrace.i(18210124464128L, 135676);
    this.iVS = 1;
    GMTrace.o(18210124464128L, 135676);
  }
  
  public final void a(final AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(18210258681856L, 135677);
    if (paramJSONObject == null)
    {
      paramAppBrandPageView.v(paramInt, d("fail", null));
      w.e("MicroMsg.JsApiEnterContact", "data is null");
      GMTrace.o(18210258681856L, 135677);
      return;
    }
    w.i("MicroMsg.JsApiEnterContact", "enterContact appId:%s, data:%s", new Object[] { paramAppBrandPageView.iqL, paramJSONObject.toString() });
    this.iTB = paramAppBrandPageView;
    this.sessionFrom = paramJSONObject.optString("sessionFrom");
    this.iVN = paramJSONObject.optString("businessId");
    this.iVO = paramJSONObject.optString("sendMessageTitle");
    this.iVP = paramJSONObject.optString("sendMessagePath");
    this.iVQ = paramJSONObject.optString("sendMessageImg");
    this.iVR = paramJSONObject.optBoolean("showMessageCard", false);
    this.iVS = 1;
    if (this.sessionFrom.length() > 1024)
    {
      this.sessionFrom = this.sessionFrom.substring(0, 1024);
      w.i("MicroMsg.JsApiEnterContact", "sessionFrom length is large than 1024!");
    }
    if (this.iVR)
    {
      if ((!com.tencent.mm.pluginsdk.ui.tools.s.ew(this.iVQ, "http://")) && (!com.tencent.mm.pluginsdk.ui.tools.s.ew(this.iVQ, "https://"))) {
        break label300;
      }
      this.iVS = 4;
    }
    for (;;)
    {
      if ((this.iVR) && (this.iVS == 1))
      {
        this.iVQ = com.tencent.mm.plugin.appbrand.appstorage.c.aD(paramAppBrandPageView.iqL, "share_" + System.currentTimeMillis());
        com.tencent.mm.plugin.appbrand.d.a(paramAppBrandPageView.iqL, new d.b()
        {
          public final void a(d.c paramAnonymousc)
          {
            GMTrace.i(18211063988224L, 135683);
            com.tencent.mm.plugin.appbrand.d.b(paramAppBrandPageView.iqL, this);
            paramAnonymousc = i.b(paramAppBrandPageView);
            if (paramAnonymousc != null) {}
            try
            {
              com.tencent.mm.sdk.platformtools.d.a(paramAnonymousc, 100, Bitmap.CompressFormat.PNG, c.this.iVQ, true);
              if ((paramAnonymousc != null) && (!paramAnonymousc.isRecycled()))
              {
                paramAnonymousc.recycle();
                GMTrace.o(18211063988224L, 135683);
                return;
              }
            }
            catch (IOException localIOException)
            {
              w.w("MicroMsg.JsApiEnterContact", "save temp bitmap to file failed, . exception : %s", new Object[] { localIOException });
              if ((paramAnonymousc != null) && (!paramAnonymousc.isRecycled()))
              {
                paramAnonymousc.recycle();
                GMTrace.o(18211063988224L, 135683);
                return;
              }
            }
            catch (Exception localException)
            {
              w.w("MicroMsg.JsApiEnterContact", "save temp bitmap to file failed, . exception : %s", new Object[] { localException });
              if ((paramAnonymousc != null) && (!paramAnonymousc.isRecycled()))
              {
                paramAnonymousc.recycle();
                GMTrace.o(18211063988224L, 135683);
                return;
              }
            }
            finally
            {
              if ((paramAnonymousc != null) && (!paramAnonymousc.isRecycled())) {
                paramAnonymousc.recycle();
              }
            }
            GMTrace.o(18211063988224L, 135683);
          }
        });
      }
      if (TextUtils.isEmpty(this.iVN))
      {
        w.i("MicroMsg.JsApiEnterContact", "businessId is empty, enter to chatting");
        ak("", paramInt);
        GMTrace.o(18210258681856L, 135677);
        return;
        label300:
        if ((!bg.mZ(this.iVQ)) && (this.iVQ.startsWith("wxfile://")))
        {
          paramJSONObject = com.tencent.mm.plugin.appbrand.appstorage.c.aI(paramAppBrandPageView.iqL, this.iVQ);
          if ((paramJSONObject == null) || (TextUtils.isEmpty(paramJSONObject.hhT))) {
            continue;
          }
          this.iVQ = paramJSONObject.hhT;
          this.iVS = 2;
          continue;
        }
        if (bg.mZ(this.iVQ)) {
          continue;
        }
        paramJSONObject = n.g(paramAppBrandPageView.irS, this.iVQ);
        if (paramJSONObject == null) {
          continue;
        }
        this.iVQ = com.tencent.mm.plugin.appbrand.appstorage.c.aD(paramAppBrandPageView.iqL, "share_" + System.currentTimeMillis());
        try
        {
          com.tencent.mm.sdk.platformtools.d.a(paramJSONObject, 100, Bitmap.CompressFormat.PNG, this.iVQ, true);
          this.iVS = 3;
          if ((paramJSONObject != null) && (!paramJSONObject.isRecycled())) {
            paramJSONObject.recycle();
          }
        }
        catch (IOException localIOException)
        {
          w.w("MicroMsg.JsApiEnterContact", "save temp bitmap to file failed, . exception : %s", new Object[] { localIOException });
          if ((paramJSONObject != null) && (!paramJSONObject.isRecycled())) {
            paramJSONObject.recycle();
          }
        }
        catch (Exception localException)
        {
          w.w("MicroMsg.JsApiEnterContact", "save temp bitmap to file failed, . exception : %s", new Object[] { localException });
          if ((paramJSONObject != null) && (!paramJSONObject.isRecycled())) {
            paramJSONObject.recycle();
          }
        }
        finally
        {
          if ((paramJSONObject != null) && (!paramJSONObject.isRecycled())) {
            paramJSONObject.recycle();
          }
        }
      }
    }
    w.i("MicroMsg.JsApiEnterContact", "do GetSubBusinessInfo cgi");
    paramJSONObject = new com.tencent.mm.ac.b.a();
    paramJSONObject.hlX = new acp();
    paramJSONObject.hlY = new acq();
    paramJSONObject.uri = "/cgi-bin/mmbiz-bin/wxausrevent/getsubbusinessinfo";
    paramJSONObject.hlW = 1303;
    paramJSONObject.hlZ = 0;
    paramJSONObject.hma = 0;
    paramJSONObject = paramJSONObject.DA();
    acp localacp = (acp)paramJSONObject.hlU.hmc;
    AppBrandSysConfig localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.nx(paramAppBrandPageView.iqL);
    if (localAppBrandSysConfig != null)
    {
      localacp.username = localAppBrandSysConfig.ftu;
      w.i("MicroMsg.JsApiEnterContact", "req.username:%s", new Object[] { localacp.username });
    }
    for (;;)
    {
      localacp.tYt = this.iVN;
      com.tencent.mm.ipcinvoker.wx_extension.b.a(paramJSONObject, new com.tencent.mm.ipcinvoker.wx_extension.b.a()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, final String paramAnonymousString, com.tencent.mm.ac.b paramAnonymousb)
        {
          GMTrace.i(18209990246400L, 135675);
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0) || (paramAnonymousb.hlV.hmc == null))
          {
            w.e("MicroMsg.JsApiEnterContact", "getsubbusinessinfo cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, paramAnonymousb.hlV.hmc });
            paramAppBrandPageView.v(paramInt, c.this.d("fail:cgi fail", null));
            GMTrace.o(18209990246400L, 135675);
            return;
          }
          paramAnonymousString = (acq)paramAnonymousb.hlV.hmc;
          w.i("MicroMsg.JsApiEnterContact", "getsubbusinessinfo success, subBusinessUsername:%s", new Object[] { paramAnonymousString.tYu });
          paramAppBrandPageView.jjV.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(18207708545024L, 135658);
              c.this.ak(paramAnonymousString.tYu, c.2.this.gQa);
              GMTrace.o(18207708545024L, 135658);
            }
          });
          GMTrace.o(18209990246400L, 135675);
        }
      });
      GMTrace.o(18210258681856L, 135677);
      return;
      w.e("MicroMsg.JsApiEnterContact", "getSysConfig is null, username is empty");
    }
  }
  
  public final void ak(String paramString, final int paramInt)
  {
    GMTrace.i(18210392899584L, 135678);
    String str2 = "";
    String str1 = "";
    final Object localObject = "";
    final WxaExposedParams.a locala = new WxaExposedParams.a();
    if (this.iTB.jlc != null) {
      localObject = this.iTB.jlc.jlW;
    }
    AppBrandSysConfig localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.nx(this.iTB.iqL);
    if (localAppBrandSysConfig != null)
    {
      str2 = localAppBrandSysConfig.ftu;
      str1 = localAppBrandSysConfig.fxq;
      locala.appId = this.iTB.iqL;
      locala.username = localAppBrandSysConfig.ftu;
      locala.fvS = localAppBrandSysConfig.fxq;
      locala.iconUrl = localAppBrandSysConfig.iIF;
      locala.iCx = localAppBrandSysConfig.iJa.iCx;
      locala.iCy = localAppBrandSysConfig.iJa.iCy;
      locala.iJX = localAppBrandSysConfig.iJa.iCB;
      locala.fwk = 5;
      locala.iJY = ((String)localObject);
      locala.iJZ = m.nU(this.iTB.iqL);
    }
    if (bg.mZ(str2)) {
      w.e("MicroMsg.JsApiEnterContact", "onInsertView username is empty!!!");
    }
    localObject = new JsApiChattingTask();
    if (!TextUtils.isEmpty(paramString)) {
      ((JsApiChattingTask)localObject).username = paramString;
    }
    for (((JsApiChattingTask)localObject).fvS = "";; ((JsApiChattingTask)localObject).fvS = str1)
    {
      ((JsApiChattingTask)localObject).sessionFrom = this.sessionFrom;
      ((JsApiChattingTask)localObject).iQi = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18208916504576L, 135667);
          w.i("MicroMsg.JsApiEnterContact", "go to the chattingUI");
          Intent localIntent = new Intent();
          localIntent.setFlags(67108864);
          localIntent.putExtra("Chat_User", localObject.username);
          localIntent.putExtra("app_brand_chatting_from_scene", 2);
          localIntent.putExtra("app_brand_chatting_expose_params", locala.Uv());
          localIntent.putExtra("key_temp_session_from", localObject.sessionFrom);
          localIntent.putExtra("finish_direct", true);
          localIntent.putExtra("key_need_send_video", false);
          if (c.this.iVR)
          {
            localIntent.putExtra("sendMessageTitle", c.this.iVO);
            localIntent.putExtra("sendMessagePath", c.this.iVP);
            localIntent.putExtra("sendMessageImg", c.this.iVQ);
            localIntent.putExtra("isBitmapFrom", c.this.iVS);
          }
          localIntent.putExtra("showMessageCard", c.this.iVR);
          MMActivity localMMActivity = (MMActivity)c.this.iTB.mContext;
          if (localMMActivity == null)
          {
            c.this.iTB.v(paramInt, c.this.d("fail", null));
            w.e("MicroMsg.JsApiEnterContact", "mmActivity is null, invoke fail!");
            GMTrace.o(18208916504576L, 135667);
            return;
          }
          localMMActivity.vow = new MMActivity.a()
          {
            public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, Intent paramAnonymous2Intent)
            {
              GMTrace.i(18207037456384L, 135653);
              if (paramAnonymous2Int1 == 1)
              {
                if (c.iSC > 0)
                {
                  c.iSC -= 1;
                  c.this.iTB.irS.RG();
                }
                w.i("MicroMsg.JsApiEnterContact", "mmOnActivityResult lockCount:%d", new Object[] { Integer.valueOf(c.iSC) });
                c.3.this.iVW.VE();
                HashMap localHashMap2 = new HashMap();
                String str2 = "";
                HashMap localHashMap1 = new HashMap();
                Object localObject = localHashMap1;
                String str1 = str2;
                if (paramAnonymous2Int2 == -1)
                {
                  localObject = localHashMap1;
                  str1 = str2;
                  if (paramAnonymous2Intent != null)
                  {
                    paramAnonymous2Intent = bg.ap(paramAnonymous2Intent.getStringExtra("keyOutPagePath"), "");
                    str1 = h.sa(paramAnonymous2Intent);
                    localObject = h.sb(paramAnonymous2Intent);
                  }
                }
                localHashMap2.put("path", str1);
                localHashMap2.put("query", localObject);
                w.i("MicroMsg.JsApiEnterContact", "onBackFromContact path:%s, query:%s", new Object[] { str1, localObject.toString() });
                c.this.iTB.v(c.3.this.gQa, c.this.d("ok", localHashMap2));
              }
              GMTrace.o(18207037456384L, 135653);
            }
          };
          com.tencent.mm.bi.d.a(c.this.iTB.mContext, ".ui.chatting.AppBrandServiceChattingUI", localIntent, 1);
          if (c.iSC > 0)
          {
            c.iSC -= 1;
            c.this.iTB.irS.RG();
          }
          if (c.iSC == 0)
          {
            c.iSC += 1;
            c.this.iTB.irS.RF();
          }
          com.tencent.mm.plugin.appbrand.d.a(c.this.iTB.iqL, new d.b()
          {
            public final void onDestroy()
            {
              GMTrace.i(18207440109568L, 135656);
              w.i("MicroMsg.JsApiEnterContact", "onDestroy");
              if (c.iSC > 0)
              {
                c.iSC -= 1;
                c.this.iTB.irS.RG();
              }
              c.3.this.iVW.VE();
              com.tencent.mm.plugin.appbrand.d.b(c.this.iTB.iqL, this);
              GMTrace.o(18207440109568L, 135656);
            }
          });
          w.i("MicroMsg.JsApiEnterContact", "doEnterChatting lockCount:%d", new Object[] { Integer.valueOf(c.iSC) });
          GMTrace.o(18208916504576L, 135667);
        }
      };
      ((JsApiChattingTask)localObject).VD();
      AppBrandMainProcessService.a((MainProcessTask)localObject);
      GMTrace.o(18210392899584L, 135678);
      return;
      ((JsApiChattingTask)localObject).username = str2;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/contact/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */