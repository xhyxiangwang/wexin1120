package com.tencent.mm.plugin.appbrand.jsapi.a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.CountDownTimer;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.modelappbrand.a.e;
import com.tencent.mm.plugin.appbrand.d.b;
import com.tencent.mm.plugin.appbrand.p.b;
import com.tencent.mm.plugin.appbrand.p.c;
import com.tencent.mm.plugin.appbrand.p.f;
import com.tencent.mm.plugin.appbrand.p.g;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.ui.AppBrandRedirectUI;
import com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeView;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.ail;
import com.tencent.mm.protocal.c.aim;
import com.tencent.mm.protocal.c.ayd;
import com.tencent.mm.protocal.c.bac;
import com.tencent.mm.protocal.c.bad;
import com.tencent.mm.protocal.c.mf;
import com.tencent.mm.protocal.c.mg;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.q;
import com.tencent.mm.ui.p;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

public final class b
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 209;
  public static final String NAME = "getPhoneNumber";
  String fFP;
  public int iQC;
  public AppBrandPageView iTB;
  private String iTC;
  private boolean iTD;
  String iTE;
  public String iTF;
  public String iTG;
  String iTH;
  public boolean iTI;
  public View iTJ;
  public EditVerifyCodeView iTK;
  public TextView iTL;
  a iTM;
  public com.tencent.mm.plugin.ac.a iTN;
  private i iTO;
  public int iTP;
  public int iTQ;
  public int iTR;
  com.tencent.mm.plugin.ac.a.a iTS;
  String signature;
  
  public b()
  {
    GMTrace.i(19765305278464L, 147263);
    this.fFP = "";
    this.iTH = "";
    this.iTI = false;
    this.iTN = null;
    this.iTP = 0;
    this.iTQ = 0;
    this.iTR = 0;
    this.iTS = new com.tencent.mm.plugin.ac.a.a()
    {
      public final void qa(String paramAnonymousString)
      {
        GMTrace.i(19763828883456L, 147252);
        w.i("MicroMsg.JsApiGetPhoneNumber", "smsListener onchange");
        w.d("MicroMsg.JsApiGetPhoneNumber", "smsVerifyCode:%s", new Object[] { paramAnonymousString });
        b.this.iTK.setText(paramAnonymousString);
        GMTrace.o(19763828883456L, 147252);
      }
    };
    GMTrace.o(19765305278464L, 147263);
  }
  
  public final void VZ()
  {
    GMTrace.i(19765573713920L, 147265);
    w.i("MicroMsg.JsApiGetPhoneNumber", "requestBindPhoneNumber");
    JSONStringer localJSONStringer = new JSONStringer();
    try
    {
      localJSONStringer.object();
      localJSONStringer.key("api_name");
      localJSONStringer.value(this.iTC);
      localJSONStringer.key("with_credentials");
      localJSONStringer.value(this.iTD);
      localJSONStringer.endObject();
      w.i("MicroMsg.JsApiGetPhoneNumber", "getPhoneNumber appId:%s, api_name:%s, with_credentials:%b", new Object[] { this.iTB.iqL, this.iTC, Boolean.valueOf(this.iTD) });
      Object localObject = new com.tencent.mm.ac.b.a();
      ((com.tencent.mm.ac.b.a)localObject).hlX = new ail();
      ((com.tencent.mm.ac.b.a)localObject).hlY = new aim();
      ((com.tencent.mm.ac.b.a)localObject).uri = "/cgi-bin/mmbiz-bin/js-getuserwxphone";
      ((com.tencent.mm.ac.b.a)localObject).hlW = 1141;
      ((com.tencent.mm.ac.b.a)localObject).hlZ = 0;
      ((com.tencent.mm.ac.b.a)localObject).hma = 0;
      localObject = ((com.tencent.mm.ac.b.a)localObject).DA();
      ail localail = (ail)((com.tencent.mm.ac.b)localObject).hlU.hmc;
      localail.mDD = this.iTB.iqL;
      localail.jWD = new com.tencent.mm.bl.b(localJSONStringer.toString().getBytes());
      com.tencent.mm.ipcinvoker.wx_extension.b.a((com.tencent.mm.ac.b)localObject, new com.tencent.mm.ipcinvoker.wx_extension.b.a()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, final String paramAnonymousString, com.tencent.mm.ac.b paramAnonymousb)
        {
          GMTrace.i(19760339222528L, 147226);
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0) || (paramAnonymousb.hlV.hmc == null))
          {
            w.e("MicroMsg.JsApiGetPhoneNumber", "getPhoneNumber JsOperateWxData cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, paramAnonymousb.hlV.hmc });
            b.this.iTB.v(b.this.iQC, b.this.d("fail:JsOperateWxData cgi fail", null));
            GMTrace.o(19760339222528L, 147226);
            return;
          }
          w.i("MicroMsg.JsApiGetPhoneNumber", "JsOperateWxData success");
          paramAnonymousString = (aim)paramAnonymousb.hlV.hmc;
          b.this.iTB.jjV.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(19767184326656L, 147277);
              b localb = b.this;
              Object localObject3 = paramAnonymousString;
              w.i("MicroMsg.JsApiGetPhoneNumber", "handleOperateWxData");
              Object localObject1 = "";
              if (((aim)localObject3).jWD != null) {
                localObject1 = ((aim)localObject3).jWD.bKX();
              }
              w.i("MicroMsg.JsApiGetPhoneNumber", "resp data:%s", new Object[] { localObject1 });
              if (TextUtils.isEmpty((CharSequence)localObject1))
              {
                w.e("MicroMsg.JsApiGetPhoneNumber", "resp data is empty");
                localb.iTB.v(localb.iQC, localb.d("fail:resp data is empty", null));
                GMTrace.o(19767184326656L, 147277);
                return;
              }
              String str2 = ((aim)localObject3).tuq;
              String str3 = ((aim)localObject3).mFw;
              String str1 = "";
              if (((aim)localObject3).udn != null)
              {
                str1 = ((aim)localObject3).udn.mCK;
                localb.iTH = ((aim)localObject3).udn.iTH;
              }
              w.i("MicroMsg.JsApiGetPhoneNumber", "appName:%s, desc:%s, IconUrl:%s, ext_desc:%s", new Object[] { str3, str1, str2, localb.iTH });
              localObject3 = null;
              Object localObject2;
              Object localObject5;
              try
              {
                localObject1 = new JSONObject((String)localObject1);
                if (localObject1 == null)
                {
                  w.e("MicroMsg.JsApiGetPhoneNumber", "jsonObj is null");
                  localb.iTB.v(localb.iQC, localb.d("fail:jsonObj is null", null));
                  GMTrace.o(19767184326656L, 147277);
                  return;
                }
              }
              catch (JSONException localJSONException1)
              {
                for (;;)
                {
                  w.e("MicroMsg.JsApiGetPhoneNumber", "new data json exception:%s", new Object[] { localJSONException1.getMessage() });
                  localObject2 = localObject3;
                }
                localb.iTE = ((JSONObject)localObject2).optString("data");
                localObject5 = ((JSONObject)localObject2).optJSONObject("data");
                localObject3 = localObject5;
                if (localObject5 == null)
                {
                  localObject3 = localObject5;
                  if (TextUtils.isEmpty(localb.iTE)) {}
                }
              }
              for (;;)
              {
                try
                {
                  localObject3 = new JSONObject(localb.iTE);
                  if (localObject3 != null)
                  {
                    localb.fFP = ((JSONObject)localObject3).optString("mobile");
                    bool = ((JSONObject)localObject3).optBoolean("need_auth", false);
                    localb.iTI = ((JSONObject)localObject3).optBoolean("allow_send_sms", false);
                    localb.signature = ((JSONObject)localObject2).optString("signature");
                    localb.iTF = ((JSONObject)localObject2).optString("encryptedData");
                    localb.iTG = ((JSONObject)localObject2).optString("iv");
                    w.i("MicroMsg.JsApiGetPhoneNumber", "mobile:%s, need_auth:%b, allow_send_sms:%b", new Object[] { localb.fFP, Boolean.valueOf(bool), Boolean.valueOf(localb.iTI) });
                    if (localb.iTP == 0)
                    {
                      if (TextUtils.isEmpty(localb.fFP)) {
                        continue;
                      }
                      if (bool) {
                        localb.iTP = 2;
                      }
                    }
                    else
                    {
                      if (TextUtils.isEmpty(localb.fFP)) {
                        continue;
                      }
                      w.i("MicroMsg.JsApiGetPhoneNumber", "show the confirm login dialog");
                      localObject2 = ((LayoutInflater)localb.iTB.mContext.getSystemService("layout_inflater")).inflate(p.g.ivd, null);
                      localObject3 = (ImageView)((View)localObject2).findViewById(p.f.itc);
                      localObject5 = (TextView)((View)localObject2).findViewById(p.f.ita);
                      TextView localTextView1 = (TextView)((View)localObject2).findViewById(p.f.itb);
                      localTextView2 = (TextView)((View)localObject2).findViewById(p.f.itd);
                      if (TextUtils.isEmpty(str3)) {
                        continue;
                      }
                      ((TextView)localObject5).setText(str3);
                      ((TextView)localObject5).setVisibility(0);
                      localTextView1.setText(str1);
                      if (TextUtils.isEmpty(localb.iTH)) {
                        continue;
                      }
                      localTextView2.setText(localb.iTH);
                      localTextView2.setVisibility(0);
                      if (TextUtils.isEmpty(str2)) {
                        continue;
                      }
                      com.tencent.mm.modelappbrand.a.b.CT().a((ImageView)localObject3, str2, com.tencent.mm.modelappbrand.a.a.CS(), e.hkj);
                      h.a(localb.iTB.mContext, false, localb.iTB.jjV.getResources().getString(p.i.iwU), (View)localObject2, localb.iTB.jjV.getResources().getString(p.i.iwT), localb.iTB.jjV.getResources().getString(p.i.duP), new b.11(localb, bool), new b.12(localb));
                      GMTrace.o(19767184326656L, 147277);
                      return;
                    }
                  }
                }
                catch (JSONException localJSONException2)
                {
                  TextView localTextView2;
                  w.e("MicroMsg.JsApiGetPhoneNumber", "new dataJson exist exception, e:%s", new Object[] { localJSONException2.getMessage() });
                  Object localObject4 = localObject5;
                  continue;
                  localb.iTP = 1;
                  continue;
                  localb.iTP = 3;
                  continue;
                  ((TextView)localObject5).setVisibility(8);
                  continue;
                  localTextView2.setVisibility(8);
                  continue;
                  ((ImageView)localObject4).setImageDrawable(com.tencent.mm.modelappbrand.a.a.CS());
                  continue;
                  w.i("MicroMsg.JsApiGetPhoneNumber", "show the confirm bind phone dialog");
                  h.a(localb.iTB.mContext, localb.iTB.jjV.getResources().getString(p.i.iwV), localb.iTB.jjV.getResources().getString(p.i.iwW), localb.iTB.jjV.getResources().getString(p.i.ixc), localb.iTB.jjV.getResources().getString(p.i.duP), false, new b.13(localb), new b.14(localb));
                  GMTrace.o(19767184326656L, 147277);
                  return;
                }
                boolean bool = false;
              }
            }
          });
          GMTrace.o(19760339222528L, 147226);
        }
      });
      GMTrace.o(19765573713920L, 147265);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        w.e("MicroMsg.JsApiGetPhoneNumber", "JSONException:%s", new Object[] { localJSONException.getMessage() });
      }
    }
  }
  
  public final void Wa()
  {
    GMTrace.i(19765707931648L, 147266);
    w.i("MicroMsg.JsApiGetPhoneNumber", "doSuccCallback");
    HashMap localHashMap = new HashMap(5);
    localHashMap.put("encryptedData", this.iTF);
    localHashMap.put("iv", this.iTG);
    this.iTB.v(this.iQC, d("ok", localHashMap));
    GMTrace.o(19765707931648L, 147266);
  }
  
  public final void Wb()
  {
    GMTrace.i(19765842149376L, 147267);
    w.i("MicroMsg.JsApiGetPhoneNumber", "doSendVerifyCode");
    Object localObject = new com.tencent.mm.ac.b.a();
    ((com.tencent.mm.ac.b.a)localObject).hlX = new bac();
    ((com.tencent.mm.ac.b.a)localObject).hlY = new bad();
    ((com.tencent.mm.ac.b.a)localObject).uri = "/cgi-bin/mmbiz-bin/wxaapp/sendverifycode";
    ((com.tencent.mm.ac.b.a)localObject).hlW = 1024;
    ((com.tencent.mm.ac.b.a)localObject).hlZ = 0;
    ((com.tencent.mm.ac.b.a)localObject).hma = 0;
    localObject = ((com.tencent.mm.ac.b.a)localObject).DA();
    bac localbac = (bac)((com.tencent.mm.ac.b)localObject).hlU.hmc;
    localbac.fKY = this.iTB.iqL;
    localbac.fFP = this.fFP;
    com.tencent.mm.ipcinvoker.wx_extension.b.a((com.tencent.mm.ac.b)localObject, new com.tencent.mm.ipcinvoker.wx_extension.b.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, final String paramAnonymousString, com.tencent.mm.ac.b paramAnonymousb)
      {
        GMTrace.i(19759802351616L, 147222);
        this.iTU.dismiss();
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0) || (paramAnonymousb.hlV.hmc == null))
        {
          w.e("MicroMsg.JsApiGetPhoneNumber", "getPhoneNumber SendVerifyCode cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, paramAnonymousb.hlV.hmc });
          b.this.iTB.v(b.this.iQC, b.this.d("fail:SendVerifyCode cgi fail", null));
          g.paX.i(14249, new Object[] { b.this.iTB.iqL, Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(b.this.iTQ), Integer.valueOf(b.this.iTR), Integer.valueOf(b.this.iTP) });
          GMTrace.o(19759802351616L, 147222);
          return;
        }
        paramAnonymousString = (bad)paramAnonymousb.hlV.hmc;
        w.i("MicroMsg.JsApiGetPhoneNumber", "SendVerifyCode cgi success");
        b.this.iTB.jjV.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(19758728609792L, 147214);
            b localb = b.this;
            int i = paramAnonymousString.status;
            w.i("MicroMsg.JsApiGetPhoneNumber", "handleSendVerifyCodeStatus:%d", new Object[] { Integer.valueOf(i) });
            if (i == 0)
            {
              w.i("MicroMsg.JsApiGetPhoneNumber", "startSmsListener");
              if (localb.iTM != null)
              {
                localb.iTM.cancel();
                localb.iTM.start();
                if (localb.iTN == null) {
                  localb.iTN = new com.tencent.mm.plugin.ac.a(localb.iTB.mContext);
                }
                localb.iTN.pFP = localb.iTB.jjV.getResources().getStringArray(p.b.isi);
                localb.iTN.pFN = localb.iTS;
                com.tencent.mm.plugin.appbrand.a.a(localb.iTB.iqL, new b.8(localb));
                boolean bool = com.tencent.mm.pluginsdk.h.a.a((Activity)localb.iTB.mContext, "android.permission.READ_SMS", 128, "", "");
                if (bool) {
                  com.tencent.mm.plugin.appbrand.a.nw(localb.iTB.iqL);
                }
                if (!bool) {
                  break label231;
                }
                w.i("MicroMsg.JsApiGetPhoneNumber", "request sms permission success");
              }
              for (;;)
              {
                localb.iTN.start();
                GMTrace.o(19758728609792L, 147214);
                return;
                localb.iTM = new b.a(localb);
                break;
                label231:
                w.e("MicroMsg.JsApiGetPhoneNumber", "request sms permission fail");
              }
            }
            if ((i != 1) && (i == 2))
            {
              localb.pZ(localb.iTB.jjV.getResources().getString(p.i.ixb));
              g.paX.i(14249, new Object[] { localb.iTB.iqL, Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(localb.iTQ), Integer.valueOf(localb.iTR), Integer.valueOf(localb.iTP) });
              GMTrace.o(19758728609792L, 147214);
              return;
            }
            localb.pZ(localb.iTB.jjV.getResources().getString(p.i.ixa));
            g.paX.i(14249, new Object[] { localb.iTB.iqL, Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(localb.iTQ), Integer.valueOf(localb.iTR), Integer.valueOf(localb.iTP) });
            GMTrace.o(19758728609792L, 147214);
          }
        });
        GMTrace.o(19759802351616L, 147222);
      }
    });
    GMTrace.o(19765842149376L, 147267);
  }
  
  public final void Wc()
  {
    GMTrace.i(19765976367104L, 147268);
    w.i("MicroMsg.JsApiGetPhoneNumber", "showVerifyMobileDialog");
    Object localObject = (LayoutInflater)this.iTB.mContext.getSystemService("layout_inflater");
    if (this.iTJ == null)
    {
      this.iTJ = ((LayoutInflater)localObject).inflate(p.g.ivA, null);
      this.iTK = ((EditVerifyCodeView)this.iTJ.findViewById(p.f.itz));
      this.iTL = ((TextView)this.iTJ.findViewById(p.f.itx));
    }
    if (this.iTJ.getParent() != null) {
      ((ViewGroup)this.iTJ.getParent()).removeAllViews();
    }
    localObject = (TextView)this.iTJ.findViewById(p.f.itA);
    if (this.iTH == null) {
      this.iTH = "";
    }
    ((TextView)localObject).setText(this.iTB.jjV.getResources().getString(p.i.ixh, new Object[] { this.iTH }));
    this.iTK.setText("");
    Wd();
    localObject = new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(19762218270720L, 147240);
        w.i("MicroMsg.JsApiGetPhoneNumber", "to verify sms");
        if ((!TextUtils.isEmpty(b.this.iTK.mBuilder.toString())) && (b.this.iTK.mBuilder.toString().length() == 6))
        {
          w.e("MicroMsg.JsApiGetPhoneNumber", "code is length is 6");
          paramAnonymousDialogInterface.dismiss();
          b.this.We();
          b.this.iTJ.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(19759533916160L, 147220);
              ((MMActivity)b.this.iTB.mContext).aKl();
              GMTrace.o(19759533916160L, 147220);
            }
          });
          paramAnonymousDialogInterface = b.this;
          String str = b.this.iTK.mBuilder.toString().toString();
          w.i("MicroMsg.JsApiGetPhoneNumber", "doVerifyCode");
          Object localObject = new com.tencent.mm.ac.b.a();
          ((com.tencent.mm.ac.b.a)localObject).hlX = new mf();
          ((com.tencent.mm.ac.b.a)localObject).hlY = new mg();
          ((com.tencent.mm.ac.b.a)localObject).uri = "/cgi-bin/mmbiz-bin/wxaapp/checkverifycode";
          ((com.tencent.mm.ac.b.a)localObject).hlW = 1010;
          ((com.tencent.mm.ac.b.a)localObject).hlZ = 0;
          ((com.tencent.mm.ac.b.a)localObject).hma = 0;
          localObject = ((com.tencent.mm.ac.b.a)localObject).DA();
          mf localmf = (mf)((com.tencent.mm.ac.b)localObject).hlU.hmc;
          localmf.fKY = paramAnonymousDialogInterface.iTB.iqL;
          localmf.fFP = paramAnonymousDialogInterface.fFP;
          localmf.rQD = str;
          com.tencent.mm.ipcinvoker.wx_extension.b.a((com.tencent.mm.ac.b)localObject, new b.4(paramAnonymousDialogInterface, h.a(paramAnonymousDialogInterface.iTB.mContext, "", false, null)));
          GMTrace.o(19762218270720L, 147240);
          return;
        }
        if ((!TextUtils.isEmpty(b.this.iTK.mBuilder.toString())) && (b.this.iTK.mBuilder.toString().length() < 6))
        {
          h.bl(b.this.iTB.mContext, b.this.iTB.jjV.getResources().getString(p.i.ixf));
          w.e("MicroMsg.JsApiGetPhoneNumber", "code is length is < 6");
          GMTrace.o(19762218270720L, 147240);
          return;
        }
        w.e("MicroMsg.JsApiGetPhoneNumber", "code is empty");
        h.bl(b.this.iTB.mContext, b.this.iTB.jjV.getResources().getString(p.i.ixe));
        GMTrace.o(19762218270720L, 147240);
      }
    };
    this.iTO = h.a(this.iTB.mContext, false, this.iTB.jjV.getResources().getString(p.i.ixi), this.iTJ, this.iTB.jjV.getResources().getString(p.i.dwr), this.iTB.jjV.getResources().getString(p.i.duP), (DialogInterface.OnClickListener)localObject, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(19764365754368L, 147256);
        w.i("MicroMsg.JsApiGetPhoneNumber", "cancel to verify sms");
        paramAnonymousDialogInterface.dismiss();
        b.this.iTB.v(b.this.iQC, b.this.d("fail:cancel to verify sms", null));
        b.this.We();
        b.this.iTJ.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(19761681399808L, 147236);
            ((MMActivity)b.this.iTB.mContext).aKl();
            GMTrace.o(19761681399808L, 147236);
          }
        });
        g.paX.i(14249, new Object[] { b.this.iTB.iqL, Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(b.this.iTQ), Integer.valueOf(b.this.iTR), Integer.valueOf(b.this.iTP) });
        GMTrace.o(19764365754368L, 147256);
      }
    });
    this.iTO.a(this.iTB.jjV.getResources().getString(p.i.dwr), false, (DialogInterface.OnClickListener)localObject);
    this.iTJ.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19762486706176L, 147242);
        ((MMActivity)b.this.iTB.mContext).aKp();
        GMTrace.o(19762486706176L, 147242);
      }
    });
    GMTrace.o(19765976367104L, 147268);
  }
  
  public final void Wd()
  {
    GMTrace.i(19766110584832L, 147269);
    w.i("MicroMsg.JsApiGetPhoneNumber", "updateSendText()");
    String str1 = this.iTB.jjV.getResources().getString(p.i.iwX);
    String str2 = this.iTB.jjV.getResources().getString(p.i.iwZ);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    localSpannableStringBuilder.append(str1);
    localSpannableStringBuilder.append(str2);
    int i = str1.length();
    int j = str2.length();
    localSpannableStringBuilder.setSpan(new ClickableSpan()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(19760607657984L, 147228);
        w.i("MicroMsg.JsApiGetPhoneNumber", "click the resend spanBuilder, do resend sms");
        if (b.this.iTI)
        {
          b.this.Wb();
          GMTrace.o(19760607657984L, 147228);
          return;
        }
        w.e("MicroMsg.JsApiGetPhoneNumber", "allow_send_sms is false, show send_verify_code_frequent error");
        b.this.pZ(b.this.iTB.jjV.getResources().getString(p.i.ixb));
        GMTrace.o(19760607657984L, 147228);
      }
    }, i, i + j, 17);
    localSpannableStringBuilder.setSpan(new ForegroundColorSpan(this.iTB.mContext.getResources().getColor(p.c.aOU)), i, j + i, 17);
    this.iTL.setText(localSpannableStringBuilder);
    this.iTL.setMovementMethod(LinkMovementMethod.getInstance());
    GMTrace.o(19766110584832L, 147269);
  }
  
  public final void We()
  {
    GMTrace.i(19766379020288L, 147271);
    w.i("MicroMsg.JsApiGetPhoneNumber", "stopSmsListener");
    if (this.iTM != null) {
      this.iTM.cancel();
    }
    if (this.iTN != null)
    {
      this.iTN.stop();
      this.iTN.pFN = null;
    }
    GMTrace.o(19766379020288L, 147271);
  }
  
  public final void a(final AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19765439496192L, 147264);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiGetPhoneNumber", "getPhoneNumber data is null");
      paramAppBrandPageView.v(paramInt, d("fail:data is null", null));
      GMTrace.o(19765439496192L, 147264);
      return;
    }
    this.iTB = paramAppBrandPageView;
    this.iQC = paramInt;
    w.i("MicroMsg.JsApiGetPhoneNumber", "getPhoneNumber data:%s", new Object[] { paramJSONObject.toString() });
    String str = paramJSONObject.optString("api_name", "webapi_getuserwxphone");
    boolean bool = paramJSONObject.optBoolean("with_credentials", true);
    if (TextUtils.isEmpty(str))
    {
      w.e("MicroMsg.JsApiGetPhoneNumber", "getPhoneNumber api_name is null");
      paramAppBrandPageView.v(paramInt, d("fail:api_name is null", null));
      GMTrace.o(19765439496192L, 147264);
      return;
    }
    com.tencent.mm.plugin.appbrand.d.a(paramAppBrandPageView.iqL, new d.b()
    {
      public final void onDestroy()
      {
        GMTrace.i(19761144528896L, 147232);
        w.i("MicroMsg.JsApiGetPhoneNumber", "AppBrandLifeCycle onDestroy");
        com.tencent.mm.plugin.appbrand.d.b(paramAppBrandPageView.iqL, this);
        b.this.We();
        GMTrace.o(19761144528896L, 147232);
      }
    });
    this.iTC = str;
    this.iTD = bool;
    VZ();
    GMTrace.o(19765439496192L, 147264);
  }
  
  public final void pZ(String paramString)
  {
    GMTrace.i(19766244802560L, 147270);
    We();
    h.a(this.iTB.mContext, paramString, "", false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(19763560448000L, 147250);
        paramAnonymousDialogInterface.dismiss();
        b.this.iTB.v(b.this.iQC, b.this.d("fail", null));
        GMTrace.o(19763560448000L, 147250);
      }
    });
    GMTrace.o(19766244802560L, 147270);
  }
  
  final class a
    extends CountDownTimer
  {
    public a()
    {
      super(1000L);
      GMTrace.i(19757117997056L, 147202);
      GMTrace.o(19757117997056L, 147202);
    }
    
    public final void onFinish()
    {
      GMTrace.i(19757386432512L, 147204);
      b.this.Wd();
      GMTrace.o(19757386432512L, 147204);
    }
    
    public final void onTick(long paramLong)
    {
      GMTrace.i(19757252214784L, 147203);
      b.this.iTL.setText(b.this.iTB.jjV.getResources().getString(p.i.iwY, new Object[] { paramLong / 1000L }));
      GMTrace.o(19757252214784L, 147203);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */