package com.tencent.mm.plugin.appbrand.jsapi.a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.p.d;
import com.tencent.mm.plugin.appbrand.p.f;
import com.tencent.mm.plugin.appbrand.p.g;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.protocal.c.ds;
import com.tencent.mm.protocal.c.dt;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d
  extends a
{
  public static final int CTRL_INDEX = 208;
  public static final String NAME = "requestAuthUserAutoFillData";
  
  public d()
  {
    GMTrace.i(19764768407552L, 147259);
    GMTrace.o(19764768407552L, 147259);
  }
  
  public final void a(final AppBrandPageView paramAppBrandPageView, final JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(19764902625280L, 147260);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData data is invalid");
      paramAppBrandPageView.v(paramInt, d("fail:data is invalid", null));
      GMTrace.o(19764902625280L, 147260);
      return;
    }
    LinkedList localLinkedList1 = new LinkedList();
    final Object localObject1 = paramJSONObject.optJSONArray("fields");
    int i;
    if ((localObject1 != null) && (((JSONArray)localObject1).length() > 0))
    {
      i = 0;
      while (i < ((JSONArray)localObject1).length())
      {
        localLinkedList1.add(((JSONArray)localObject1).optString(i));
        i += 1;
      }
    }
    localObject1 = paramJSONObject.optString("wording");
    final int j = paramJSONObject.optInt("authStatus", 2);
    final LinkedList localLinkedList2 = new LinkedList();
    Object localObject2 = paramJSONObject.optJSONArray("authGroupList");
    if ((localObject2 != null) && (((JSONArray)localObject2).length() > 0))
    {
      i = 0;
      while (i < ((JSONArray)localObject2).length())
      {
        localLinkedList2.add("  " + ((JSONArray)localObject2).optString(i));
        i += 1;
      }
    }
    if (localLinkedList1.size() == 0)
    {
      w.e("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData fields is empty");
      paramAppBrandPageView.v(paramInt, d("fail:fields is empty", null));
      GMTrace.o(19764902625280L, 147260);
      return;
    }
    if (TextUtils.isEmpty((CharSequence)localObject1))
    {
      w.e("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData wording is empty");
      paramAppBrandPageView.v(paramInt, d("fail:wording is empty", null));
      GMTrace.o(19764902625280L, 147260);
      return;
    }
    localObject2 = paramAppBrandPageView.iqL;
    w.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData appId:%s", new Object[] { localObject2 });
    w.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "wording:%s, authType:%d, fieldIds:%s", new Object[] { localObject1, Integer.valueOf(j), paramJSONObject.optJSONArray("fields").toString() });
    if (paramJSONObject.optJSONArray("authGroupList") != null) {
      w.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "authGroupList:%s", new Object[] { paramJSONObject.optJSONArray("authGroupList").toString() });
    }
    paramJSONObject = new com.tencent.mm.ac.b.a();
    paramJSONObject.hlX = new ds();
    paramJSONObject.hlY = new dt();
    paramJSONObject.uri = "/cgi-bin/mmbiz-bin/wxaapp/autofill/authinfo";
    paramJSONObject.hlW = 1183;
    paramJSONObject.hlZ = 0;
    paramJSONObject.hma = 0;
    paramJSONObject = paramJSONObject.DA();
    final ds localds = (ds)paramJSONObject.hlU.hmc;
    localds.txG = localLinkedList1;
    localds.fKY = ((String)localObject2);
    localds.txI = j;
    af.u(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19761949835264L, 147238);
        d locald = d.this;
        AppBrandPageView localAppBrandPageView = paramAppBrandPageView;
        int i = paramInt;
        ds localds = localds;
        com.tencent.mm.ac.b localb = paramJSONObject;
        int j = j;
        Object localObject2 = localObject1;
        Object localObject3 = localLinkedList2;
        if (j == 2) {}
        String str2;
        String str3;
        View localView;
        Object localObject4;
        LinearLayout localLinearLayout;
        for (String str1 = localAppBrandPageView.mContext.getString(p.i.iwq);; str1 = localAppBrandPageView.mContext.getString(p.i.iwr))
        {
          str2 = localAppBrandPageView.mContext.getString(p.i.iws);
          str3 = localAppBrandPageView.mContext.getString(p.i.iwp);
          String str4 = localAppBrandPageView.mContext.getString(p.i.iwo);
          localObject1 = (LayoutInflater)localAppBrandPageView.mContext.getSystemService("layout_inflater");
          localView = ((LayoutInflater)localObject1).inflate(p.g.iuY, null);
          TextView localTextView = (TextView)localView.findViewById(p.f.isT);
          localObject4 = (TextView)localView.findViewById(p.f.isU);
          localLinearLayout = (LinearLayout)localView.findViewById(p.f.isV);
          localTextView.setText((CharSequence)localObject2);
          ((TextView)localObject4).setText(str4);
          ((TextView)localObject4).setOnClickListener(new d.2(locald, localAppBrandPageView));
          localLinearLayout.removeAllViews();
          if ((localObject3 == null) || (((LinkedList)localObject3).size() <= 0)) {
            break;
          }
          localLinearLayout.setVisibility(0);
          localObject2 = ((LinkedList)localObject3).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject4 = (String)((Iterator)localObject2).next();
            localObject3 = (TextView)((LayoutInflater)localObject1).inflate(p.g.iuU, null);
            ((TextView)localObject3).setText((CharSequence)localObject4);
            localObject4 = new LinearLayout.LayoutParams(-1, -2);
            ((LinearLayout.LayoutParams)localObject4).bottomMargin = localAppBrandPageView.jjV.getResources().getDimensionPixelOffset(p.d.iso);
            ((TextView)localObject3).setLayoutParams((ViewGroup.LayoutParams)localObject4);
            localLinearLayout.addView((View)localObject3);
          }
        }
        Object localObject1 = (LinearLayout.LayoutParams)((TextView)localObject4).getLayoutParams();
        ((LinearLayout.LayoutParams)localObject1).leftMargin = 0;
        ((TextView)localObject4).setLayoutParams((ViewGroup.LayoutParams)localObject1);
        localLinearLayout.setVisibility(8);
        w.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "show the auto fill data protocol dialog!");
        h.a(localAppBrandPageView.mContext, false, str1, localView, str2, str3, new d.3(locald, localds, localAppBrandPageView, i, localb), new d.4(locald, localds, localAppBrandPageView, i, localb));
        GMTrace.o(19761949835264L, 147238);
      }
    });
    GMTrace.o(19764902625280L, 147260);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */