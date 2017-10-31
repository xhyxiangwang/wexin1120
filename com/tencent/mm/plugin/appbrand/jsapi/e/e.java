package com.tencent.mm.plugin.appbrand.jsapi.e;

import android.support.v4.view.z;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.widget.input.ac;
import com.tencent.mm.plugin.appbrand.widget.input.b.a;
import com.tencent.mm.plugin.appbrand.widget.input.b.a.a;
import com.tencent.mm.plugin.appbrand.widget.input.b.a.b;
import com.tencent.mm.plugin.appbrand.widget.input.g;
import com.tencent.mm.plugin.appbrand.widget.input.g.10;
import com.tencent.mm.plugin.appbrand.widget.input.g.11;
import com.tencent.mm.plugin.appbrand.widget.input.g.12;
import com.tencent.mm.plugin.appbrand.widget.input.g.13;
import com.tencent.mm.plugin.appbrand.widget.input.g.4;
import com.tencent.mm.plugin.appbrand.widget.input.g.5;
import com.tencent.mm.plugin.appbrand.widget.input.g.6;
import com.tencent.mm.plugin.appbrand.widget.input.h;
import com.tencent.mm.plugin.appbrand.widget.input.h.1;
import com.tencent.mm.plugin.appbrand.widget.input.h.2;
import com.tencent.mm.plugin.appbrand.widget.input.h.a;
import com.tencent.mm.plugin.appbrand.widget.input.i;
import com.tencent.mm.plugin.appbrand.widget.input.m;
import com.tencent.mm.plugin.appbrand.widget.input.o;
import com.tencent.mm.plugin.appbrand.widget.input.r;
import com.tencent.mm.plugin.appbrand.widget.input.u;
import com.tencent.mm.plugin.appbrand.widget.input.v;
import com.tencent.mm.plugin.appbrand.widget.input.x;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.q;
import com.tencent.mm.x.q.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import junit.framework.Assert;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class e
  extends a<com.tencent.mm.plugin.appbrand.widget.input.b.e>
{
  static final int CTRL_INDEX = 1;
  static final String NAME = "showKeyboard";
  
  public e()
  {
    GMTrace.i(10369527447552L, 77259);
    GMTrace.o(10369527447552L, 77259);
  }
  
  protected boolean WB()
  {
    GMTrace.i(10369795883008L, 77261);
    GMTrace.o(10369795883008L, 77261);
    return true;
  }
  
  protected boolean WC()
  {
    GMTrace.i(15479464787968L, 115331);
    GMTrace.o(15479464787968L, 115331);
    return true;
  }
  
  protected boolean WD()
  {
    GMTrace.i(10370064318464L, 77263);
    GMTrace.o(10370064318464L, 77263);
    return true;
  }
  
  public final void a(final AppBrandPageView paramAppBrandPageView, final int paramInt1, final String paramString, final com.tencent.mm.plugin.appbrand.widget.input.b.e parame, final int paramInt2)
  {
    GMTrace.i(18203950448640L, 135630);
    h localh = h.a.jBI;
    com.tencent.mm.plugin.appbrand.widget.input.b localb = b.a.a(parame.jFS, paramAppBrandPageView);
    if (localb == null) {
      localObject1 = null;
    }
    while (!bg.mZ((String)localObject1))
    {
      paramString = new HashMap(1);
      paramString.put("inputId", localObject1);
      paramAppBrandPageView.v(paramInt2, d("ok", paramString));
      GMTrace.o(18203950448640L, 135630);
      return;
      if (parame.jFX != null) {
        localb.su(parame.jFX);
      }
      localb.a(parame);
      Object localObject2;
      label150:
      int j;
      int k;
      int m;
      boolean bool;
      if (parame.jFW != null)
      {
        localObject1 = parame.jFW;
        localObject2 = (AppBrandPageView)localb.jAL.get();
        if ((localObject2 != null) && (localb.abB() != null)) {}
      }
      else
      {
        i = parame.jFY.intValue();
        j = parame.jFZ.intValue();
        k = parame.jGb.intValue();
        m = parame.jGa.intValue();
        localObject1 = (AppBrandPageView)localb.jAL.get();
        if ((localObject1 != null) && (((AppBrandPageView)localObject1).jlc != null)) {
          break label245;
        }
        bool = false;
      }
      label245:
      Object localObject3;
      for (;;)
      {
        if (bool) {
          break label333;
        }
        localObject1 = null;
        break;
        com.tencent.mm.plugin.appbrand.widget.input.autofill.d.a((AppBrandPageView)localObject2, localb.abB(), (a.a)localObject1);
        break label150;
        localObject2 = localb.abB();
        if (localObject2 == null)
        {
          bool = false;
        }
        else
        {
          localObject3 = ((AppBrandPageView)localObject1).jlb;
          if (localObject3 == null)
          {
            bool = false;
          }
          else
          {
            bool = ((com.tencent.mm.plugin.appbrand.widget.input.e)localObject3).a(((AppBrandPageView)localObject1).jlc, (View)localObject2, i, j, k, m);
            if (bool)
            {
              ((x)localObject2).a(localb.jAM);
              ((EditText)localObject2).addTextChangedListener(localb);
            }
          }
        }
      }
      label333:
      if (!localb.jP(-2))
      {
        localObject1 = null;
      }
      else
      {
        localObject1 = new WeakReference(paramAppBrandPageView);
        localObject2 = localb.abA();
        localb.jAJ = new h.2(localh, (WeakReference)localObject1, (String)localObject2, paramString);
        localObject1 = localObject2;
        if (paramAppBrandPageView != null)
        {
          localObject1 = localObject2;
          if (localb != null)
          {
            localObject3 = localb.abA();
            localObject1 = localObject2;
            if (!bg.mZ((String)localObject3))
            {
              paramAppBrandPageView.a(new h.1(localh, (String)localObject3));
              localh.jBD.put(localObject3, localb);
              localObject1 = localObject2;
            }
          }
        }
      }
    }
    final Object localObject1 = paramAppBrandPageView.iqL;
    final int i = paramAppBrandPageView.hashCode();
    paramAppBrandPageView = new WeakReference(paramAppBrandPageView);
    parame.jAL = paramAppBrandPageView;
    paramString = new g()
    {
      private void WG()
      {
        GMTrace.i(10364024520704L, 77218);
        AppBrandPageView localAppBrandPageView = (AppBrandPageView)paramAppBrandPageView.get();
        if ((localAppBrandPageView == null) || (localAppBrandPageView.jlc == null))
        {
          GMTrace.o(10364024520704L, 77218);
          return;
        }
        com.tencent.mm.plugin.appbrand.widget.input.f.abN().q(localAppBrandPageView.jlc);
        GMTrace.o(10364024520704L, 77218);
      }
      
      public final void WE()
      {
        GMTrace.i(10363756085248L, 77216);
        if (paramAppBrandPageView.get() != null)
        {
          Object localObject = new HashMap(1);
          ((Map)localObject).put("inputId", this.jBm);
          ((AppBrandPageView)paramAppBrandPageView.get()).v(paramInt2, e.this.d("ok", (Map)localObject));
          e.aY(this.jBm, paramString);
          localObject = this.jBm;
          AppBrandPageView localAppBrandPageView = (AppBrandPageView)paramAppBrandPageView.get();
          if (localAppBrandPageView == null)
          {
            GMTrace.o(10363756085248L, 77216);
            return;
          }
          q.Aw().n("AppBrandJsInput@" + (String)localObject, true).k("webview_reference", new WeakReference(localAppBrandPageView));
        }
        GMTrace.o(10363756085248L, 77216);
      }
      
      public final void WF()
      {
        GMTrace.i(10363890302976L, 77217);
        com.tencent.mm.plugin.appbrand.o.d.aR(this);
        if (paramAppBrandPageView.get() != null)
        {
          ((AppBrandPageView)paramAppBrandPageView.get()).v(paramInt2, e.this.d("fail", null));
          WG();
        }
        GMTrace.o(10363890302976L, 77217);
      }
      
      public final void b(String paramAnonymousString, int paramAnonymousInt, boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2)
      {
        GMTrace.i(18204218884096L, 135632);
        if (e.this.WD()) {
          com.tencent.mm.plugin.appbrand.o.d.aR(this);
        }
        if (paramAppBrandPageView.get() != null) {}
        try
        {
          paramAnonymousString = com.tencent.mm.plugin.appbrand.o.d.se(paramAnonymousString);
          paramAnonymousString = new JSONObject().put("value", paramAnonymousString).put("inputId", this.jBm).put("cursor", paramAnonymousInt).toString();
          if (paramAnonymousBoolean1) {
            ((AppBrandPageView)paramAppBrandPageView.get()).h("onKeyboardConfirm", paramAnonymousString, 0);
          }
          if (!paramAnonymousBoolean2) {
            ((AppBrandPageView)paramAppBrandPageView.get()).h("onKeyboardComplete", paramAnonymousString, 0);
          }
        }
        catch (JSONException paramAnonymousString)
        {
          for (;;)
          {
            w.e("MicroMsg.JsApiShowKeyboard", "dispatch input done, exp = %s", new Object[] { bg.f(paramAnonymousString) });
          }
        }
        if (!paramAnonymousBoolean2) {
          WG();
        }
        GMTrace.o(18204218884096L, 135632);
      }
    };
    localObject1 = new com.tencent.mm.plugin.appbrand.widget.input.a.c()
    {
      public final void al(String paramAnonymousString, int paramAnonymousInt)
      {
        GMTrace.i(18203816230912L, 135629);
        String str = paramString.jBm;
        if (bg.mZ(str))
        {
          GMTrace.o(18203816230912L, 135629);
          return;
        }
        e.b localb = new e.b();
        HashMap localHashMap = new HashMap();
        localHashMap.put("value", com.tencent.mm.plugin.appbrand.o.d.se(paramAnonymousString));
        localHashMap.put("data", q.Aw().n("AppBrandJsInput@" + str, true).getString("passing_data", ""));
        localHashMap.put("cursor", Integer.valueOf(paramAnonymousInt));
        localHashMap.put("inputId", str);
        localb.aj(localObject1, i).r(localHashMap).VI();
        GMTrace.o(18203816230912L, 135629);
      }
    };
    paramString.jBr.jEZ = ((com.tencent.mm.plugin.appbrand.widget.input.a.c)localObject1);
    a(paramString);
    com.tencent.mm.plugin.appbrand.o.d.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10366037786624L, 77233);
        Object localObject1 = (AppBrandPageView)paramAppBrandPageView.get();
        if ((localObject1 == null) || (((AppBrandPageView)localObject1).jlc == null))
        {
          GMTrace.o(10366037786624L, 77233);
          return;
        }
        com.tencent.mm.plugin.appbrand.widget.input.f.abN().p(((AppBrandPageView)localObject1).jlc);
        g localg = paramString;
        localObject1 = parame;
        int j = paramInt1;
        com.tencent.mm.plugin.appbrand.o.d.aQ(localg);
        localg.jBl = ((com.tencent.mm.plugin.appbrand.widget.input.b.e)localObject1);
        localg.iWI = localg.jBl.jAL;
        if (localg.iWI == null) {}
        for (localObject1 = null; (localObject1 == null) || (((AppBrandPageView)localObject1).jlc == null); localObject1 = (AppBrandPageView)localg.iWI.get())
        {
          w.e("MicroMsg.AppBrandInputInvokeHandler", "insertInputImpl, view not ready, return fail");
          localg.WF();
          GMTrace.o(10366037786624L, 77233);
          return;
        }
        Object localObject2;
        int k;
        int m;
        int n;
        if (ac.d(localg.jBl.jGr))
        {
          localObject2 = new o(((AppBrandPageView)localObject1).mContext);
          localg.jBn = ((v)localObject2);
          localg.cN(true);
          localg.jBn.addTextChangedListener(new g.10(localg));
          localg.jBn.jDk = new g.11(localg);
          localObject2 = localg.jBn;
          i = localg.jBl.jFY.intValue();
          k = localg.jBl.jFZ.intValue();
          m = localg.jBl.jGb.intValue();
          n = localg.jBl.jGa.intValue();
          if ((localObject2 != null) && (localg.iWI != null) && (localg.iWI.get() != null)) {
            break label357;
          }
          i = 0;
        }
        for (;;)
        {
          if (i != 0) {
            break label418;
          }
          w.e("MicroMsg.AppBrandInputInvokeHandler", "add custom view into webView failed");
          localg.WF();
          GMTrace.o(10366037786624L, 77233);
          return;
          localObject2 = new r(((AppBrandPageView)localObject1).mContext);
          break;
          label357:
          com.tencent.mm.plugin.appbrand.widget.input.e locale = ((AppBrandPageView)localg.iWI.get()).jlb;
          if ((locale != null) && (locale.a(((AppBrandPageView)localg.iWI.get()).jlc, (View)localObject2, i, k, m, n))) {
            i = 1;
          } else {
            i = 0;
          }
        }
        label418:
        if ((localg.jBl.jFW != null) && (!bg.bX(localg.jBl.jFW.jFH))) {
          com.tencent.mm.plugin.appbrand.widget.input.autofill.d.a((AppBrandPageView)localObject1, localg.jBn, localg.jBl.jFW);
        }
        if (!ac.d(localg.jBl.jGr)) {
          if (j >= 0) {
            break label1021;
          }
        }
        label765:
        label828:
        label948:
        label961:
        label982:
        label1021:
        for (int i = localg.jBn.getText().length();; i = j)
        {
          localg.jBn.setSelection(i);
          if (ac.d(localg.jBl.jGr)) {
            localg.jBn.post(new g.12(localg));
          }
          if (("text".equalsIgnoreCase(localg.jBl.jFS)) || ("emoji".equalsIgnoreCase(localg.jBl.jFS)))
          {
            localObject2 = (AppBrandPageView)localg.iWI.get();
            if (z.al(((AppBrandPageView)localObject2).jjV))
            {
              localg.jBo = u.bX(((AppBrandPageView)localObject2).jjV);
              localg.abS();
              localg.abW();
              localg.jBn.a(localg.jBh);
              localg.jBn.setOnKeyListener(new g.4(localg));
              m.a((AppBrandPageView)localg.iWI.get(), localg.jBn);
              localObject2 = localg.jBo;
              if (!localg.jBl.jFT) {
                "emoji".equals(localg.jBl.jFS);
              }
              ((u)localObject2).acv();
              if (localg.jBl.jGr.booleanValue()) {
                break label961;
              }
              if (localg.jBl.jGw != null) {
                break label948;
              }
              localObject2 = com.tencent.mm.plugin.appbrand.widget.input.b.b.acZ();
              i = ((com.tencent.mm.plugin.appbrand.widget.input.b.b)localObject2).jFN;
              localg.jBn.setImeOptions(i);
              localg.jBn.setOnEditorActionListener(new g.5(localg, i));
              localg.jBo.cU(localg.jBl.jGs.booleanValue());
              localg.jBo.jCY = localg.jBn;
              if (localg.jBl.jGr.booleanValue()) {
                break label982;
              }
              localg.jBn.requestFocus();
              localg.jBo.show();
              if (!localg.jBl.jGr.booleanValue()) {
                i.a(localg.iWI).abZ();
              }
              ((AppBrandPageView)localg.iWI.get()).a(new g.6(localg));
            }
          }
          for (;;)
          {
            localg.jBm = String.valueOf(com.tencent.mm.plugin.appbrand.jsapi.base.f.a((AppBrandPageView)localObject1, localg.jBn));
            localg.jBn.sz(localg.jBm);
            localg.jBn.setOnClickListener(new g.13(localg));
            m.a(localg.jBm, localg);
            localg.WE();
            GMTrace.o(10366037786624L, 77233);
            return;
            localObject2 = localg.jBl.jGw;
            break;
            localg.jBn.setOnEditorActionListener(null);
            localg.jBn.setImeOptions(0);
            break label765;
            localg.jBn.setFocusable(false);
            localg.jBn.setFocusableInTouchMode(false);
            localg.jBo.hide();
            break label828;
            Assert.assertTrue("Number type implementation removed from here", false);
          }
        }
      }
    });
    GMTrace.o(18203950448640L, 135630);
  }
  
  public void a(final AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(10369661665280L, 77260);
    final Object localObject = paramJSONObject.optString("inputId", "");
    final int i = paramJSONObject.optInt("cursor", -2);
    if ((WB()) && (!bg.mZ((String)localObject)))
    {
      af.u(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(10365232480256L, 77227);
          if (m.a(paramAppBrandPageView, localObject, i))
          {
            paramAppBrandPageView.v(paramInt, e.this.d("ok", null));
            GMTrace.o(10365232480256L, 77227);
            return;
          }
          paramAppBrandPageView.v(paramInt, e.this.d("fail:invalid data", null));
          GMTrace.o(10365232480256L, 77227);
        }
      });
      GMTrace.o(10369661665280L, 77260);
      return;
    }
    localObject = new com.tencent.mm.plugin.appbrand.widget.input.b.e();
    if (!a((com.tencent.mm.plugin.appbrand.widget.input.b.e)localObject, paramJSONObject, paramAppBrandPageView, paramInt))
    {
      GMTrace.o(10369661665280L, 77260);
      return;
    }
    com.tencent.mm.plugin.appbrand.o.d.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10367648399360L, 77245);
        e.this.a(paramAppBrandPageView, i, this.iWw, localObject, paramInt);
        GMTrace.o(10367648399360L, 77245);
      }
    });
    GMTrace.o(10369661665280L, 77260);
  }
  
  protected void a(g paramg)
  {
    GMTrace.i(10369930100736L, 77262);
    GMTrace.o(10369930100736L, 77262);
  }
  
  protected boolean a(com.tencent.mm.plugin.appbrand.widget.input.b.e parame, JSONObject paramJSONObject, AppBrandPageView paramAppBrandPageView, int paramInt)
  {
    int j = 0;
    GMTrace.i(17388980404224L, 129558);
    if (!super.a(parame, paramJSONObject, paramAppBrandPageView, paramInt))
    {
      GMTrace.o(17388980404224L, 129558);
      return false;
    }
    parame.jFY = Integer.valueOf(Math.max(0, parame.jFY.intValue()));
    if (parame.jFZ == null) {}
    for (int i = 0;; i = Math.max(0, parame.jFZ.intValue()))
    {
      parame.jFZ = Integer.valueOf(i);
      parame.jFS = paramJSONObject.optString("type", "text");
      if (m.jCg.contains(parame.jFS)) {
        break;
      }
      paramAppBrandPageView.v(paramInt, d("fail:unsupported input type", null));
      GMTrace.o(17388980404224L, 129558);
      return false;
    }
    parame.jFT = paramJSONObject.optBoolean("password");
    parame.jGF = Boolean.valueOf(paramJSONObject.optBoolean("password"));
    if (WC())
    {
      paramAppBrandPageView = paramJSONObject.optJSONObject("dropdown");
      if (paramAppBrandPageView != null)
      {
        paramJSONObject = new a.a();
        paramJSONObject.jFE = paramAppBrandPageView.optInt("marginLeft");
        paramJSONObject.jFF = paramAppBrandPageView.optInt("marginRight");
        paramJSONObject.jFG = paramAppBrandPageView.optString("width");
        paramAppBrandPageView = paramAppBrandPageView.optJSONArray("options");
        if ((paramAppBrandPageView != null) && (paramAppBrandPageView.length() > 0))
        {
          paramJSONObject.jFH = new ArrayList();
          paramInt = j;
          while (paramInt < paramAppBrandPageView.length())
          {
            Object localObject = paramAppBrandPageView.optJSONObject(paramInt);
            if (localObject != null)
            {
              String str1 = ((JSONObject)localObject).optString("id");
              String str2 = ((JSONObject)localObject).optString("title");
              localObject = ((JSONObject)localObject).optString("content");
              if ((!bg.mZ(str1)) && (!bg.mZ(str2)))
              {
                a.b localb = new a.b();
                localb.id = str1;
                localb.title = str2;
                localb.content = ((String)localObject);
                paramJSONObject.jFH.add(localb);
              }
            }
            paramInt += 1;
          }
          parame.jFW = paramJSONObject;
        }
      }
    }
    GMTrace.o(17388980404224L, 129558);
    return true;
  }
  
  public static final class a
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 207;
    public static final String NAME = "onKeyboardDropdownOperate";
    
    public a()
    {
      GMTrace.i(15479867441152L, 115334);
      GMTrace.o(15479867441152L, 115334);
    }
  }
  
  public static final class b
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 78;
    public static final String NAME = "onKeyboardValueChange";
    
    public b()
    {
      GMTrace.i(10367379963904L, 77243);
      GMTrace.o(10367379963904L, 77243);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/e/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */