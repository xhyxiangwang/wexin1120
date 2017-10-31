package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.modelappbrand.j;
import com.tencent.mm.plugin.webview.c.a.1;
import com.tencent.mm.plugin.webview.c.a.2;
import com.tencent.mm.plugin.webview.c.a.3;
import com.tencent.mm.plugin.webview.c.a.4;
import com.tencent.mm.plugin.webview.c.a.a;
import com.tencent.mm.plugin.webview.model.z;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.24;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.26;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BaseSearchWebviewUI
  extends WebViewUI
{
  protected boolean svn;
  
  public BaseSearchWebviewUI()
  {
    GMTrace.i(19406272856064L, 144588);
    GMTrace.o(19406272856064L, 144588);
  }
  
  private void V(Bundle paramBundle)
  {
    GMTrace.i(19406809726976L, 144592);
    Object localObject1 = new ArrayList();
    String str1 = paramBundle.getString("title");
    String str2 = paramBundle.getString("desc");
    Object localObject2 = paramBundle.getString("items");
    try
    {
      JSONArray localJSONArray = new JSONArray((String)localObject2);
      i = 0;
      if (i < localJSONArray.length())
      {
        localObject3 = localJSONArray.optJSONObject(i);
        z localz;
        if (localObject3 != null)
        {
          localz = new z();
          localz.iconUrl = ((JSONObject)localObject3).optString("icon");
          localz.title = ((JSONObject)localObject3).optString("title");
          if (((JSONObject)localObject3).optInt("selected") != 1) {
            break label157;
          }
        }
        label157:
        for (boolean bool = true;; bool = false)
        {
          localz.mPc = bool;
          localz.desc = ((JSONObject)localObject3).optString("desc");
          ((List)localObject1).add(localz);
          i += 1;
          break;
        }
      }
      localObject2 = com.tencent.mm.plugin.webview.c.a.bzI();
    }
    catch (JSONException localJSONException)
    {
      w.e("BaseSearchWebviewUI", bg.f(localJSONException));
      w.v("BaseSearchWebviewUI", "doShowSearchActionSheet args: title %s,subTitle %s,items %s", new Object[] { str1, str2, localObject2 });
      if (((List)localObject1).isEmpty()) {
        break label413;
      }
    }
    Object localObject3 = new a.a()
    {
      public final void dC(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(19410836258816L, 144622);
        if (BaseSearchWebviewUI.a(BaseSearchWebviewUI.this) != null)
        {
          d locald = BaseSearchWebviewUI.b(BaseSearchWebviewUI.this);
          if (!locald.syz)
          {
            w.e("MicroMsg.JsApiHandler", "onSearchActionSheetClick fail, not ready");
            GMTrace.o(19410836258816L, 144622);
            return;
          }
          w.i("MicroMsg.JsApiHandler", "onSearchActionSheetClick success, ready");
          HashMap localHashMap = new HashMap();
          localHashMap.put("index", Integer.valueOf(paramAnonymousInt1));
          localHashMap.put("actionSheetId", Integer.valueOf(paramAnonymousInt2));
          af.u(new d.24(locald, i.a.a("onSearchActionSheetClick", localHashMap, locald.syB, locald.syC)));
        }
        GMTrace.o(19410836258816L, 144622);
      }
    };
    com.tencent.mm.ui.widget.e locale = new com.tencent.mm.ui.widget.e(this, com.tencent.mm.ui.widget.e.wSQ, true);
    int i = locale.hashCode();
    locale.wKW = new a.1((com.tencent.mm.plugin.webview.c.a)localObject2, (List)localObject1);
    locale.qQS = new a.2((com.tencent.mm.plugin.webview.c.a)localObject2, (List)localObject1, locale);
    locale.qQT = new a.3((com.tencent.mm.plugin.webview.c.a)localObject2, (a.a)localObject3, i);
    locale.wTa = new a.4((com.tencent.mm.plugin.webview.c.a)localObject2, (a.a)localObject3, i);
    localObject1 = View.inflate(this, R.i.dff, null);
    if (!TextUtils.isEmpty(str1))
    {
      ((TextView)((View)localObject1).findViewById(R.h.title)).setText(str1);
      if (TextUtils.isEmpty(str2)) {
        break label438;
      }
      ((TextView)((View)localObject1).findViewById(R.h.czn)).setText(str2);
    }
    for (;;)
    {
      locale.wSX = true;
      locale.dG((View)localObject1);
      locale.bCV();
      ((com.tencent.mm.plugin.webview.c.a)localObject2).sja.put(Integer.valueOf(i), locale);
      paramBundle.putInt("actionSheetId", i);
      label413:
      GMTrace.o(19406809726976L, 144592);
      return;
      ((View)localObject1).findViewById(R.h.title).setVisibility(8);
      break;
      label438:
      ((View)localObject1).findViewById(R.h.czn).setVisibility(8);
    }
  }
  
  protected com.tencent.mm.plugin.webview.c.b bCH()
  {
    GMTrace.i(19406675509248L, 144591);
    GMTrace.o(19406675509248L, 144591);
    return null;
  }
  
  public void g(int paramInt, Bundle paramBundle)
  {
    GMTrace.i(19406541291520L, 144590);
    switch (paramInt)
    {
    default: 
      super.g(paramInt, paramBundle);
    case 137: 
      do
      {
        GMTrace.o(19406541291520L, 144590);
        return;
        paramBundle = paramBundle.getString("fts_key_json_data");
      } while (this.sjk == null);
      try
      {
        localObject1 = this.sjk;
        af.u(new d.26((d)localObject1, i.a.a("onGetMatchContactList", new JSONObject(paramBundle), ((d)localObject1).syB, ((d)localObject1).syC)));
        GMTrace.o(19406541291520L, 144590);
        return;
      }
      catch (JSONException paramBundle)
      {
        w.printErrStackTrace("BaseSearchWebviewUI", paramBundle, "", new Object[0]);
        GMTrace.o(19406541291520L, 144590);
        return;
      }
    case 133: 
      V(paramBundle);
      GMTrace.o(19406541291520L, 144590);
      return;
    case 134: 
      localObject1 = com.tencent.mm.plugin.webview.c.a.bzI();
      paramInt = paramBundle.getInt("actionSheetId");
      paramBundle = (com.tencent.mm.ui.widget.e)((com.tencent.mm.plugin.webview.c.a)localObject1).sja.remove(Integer.valueOf(paramInt));
      if (paramBundle != null) {
        paramBundle.bCW();
      }
      GMTrace.o(19406541291520L, 144590);
      return;
    }
    Object localObject1 = bCH();
    if (localObject1 != null)
    {
      paramInt = paramBundle.getInt("x", -1);
      int i = paramBundle.getInt("y", -1);
      String str = paramBundle.getString("widgetId");
      paramBundle = paramBundle.getString("eventId");
      w.v("FTSSearchWidgetMgr", "tapSearchWAWidgetView x %d, y %d, widgetId %s, eventId %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), str, paramBundle });
      Object localObject2 = (View)((com.tencent.mm.plugin.webview.c.b)localObject1).sjf.get(str);
      if (localObject2 != null)
      {
        localObject2 = ((com.tencent.mm.plugin.webview.c.b)localObject1).sjj.bB((View)localObject2);
        com.tencent.mm.plugin.webview.c.b.a.b localb = new com.tencent.mm.plugin.webview.c.b.a.b(paramInt, i, paramBundle);
        if (localObject2 == null) {
          w.e("BaseJsapiEvent", "null JSBridgeAccessible ");
        }
        for (boolean bool = false;; bool = ((j)localObject2).P(localb.getName(), localb.bzO()))
        {
          if (!bool)
          {
            w.i("FTSSearchWidgetMgr", "onTap fail: exec js event %s ", new Object[] { str });
            ((com.tencent.mm.plugin.webview.c.b)localObject1).sjk.a(paramBundle, false, "onTap fail: exec js event  " + str, str);
          }
          GMTrace.o(19406541291520L, 144590);
          return;
        }
      }
      w.i("FTSSearchWidgetMgr", "onTap fail: can not find Widget by widgetId %s", new Object[] { str });
      ((com.tencent.mm.plugin.webview.c.b)localObject1).sjk.a(paramBundle, false, "onTap fail: can not find Widget by widgetId " + str, str);
      GMTrace.o(19406541291520L, 144590);
      return;
    }
    w.e("BaseSearchWebviewUI", "can not find FTSSearchWidgetMgr to handle tapSearchWAWidgetView");
    this.sjk.a(paramBundle.getString(""), false, "can not find FTSSearchWidgetMgr to handle tapSearchWAWidgetView", paramBundle.getString("widgetId"));
    GMTrace.o(19406541291520L, 144590);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19406407073792L, 144589);
    super.onCreate(paramBundle);
    if (getIntent() != null) {
      this.svn = getIntent().getBooleanExtra("jumpto_sns_contact_page", false);
    }
    GMTrace.o(19406407073792L, 144589);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/fts/BaseSearchWebviewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */