package com.tencent.mm.plugin.appbrand.dynamic.jsapi;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.jsapi.b.b.a;
import com.tencent.mm.plugin.appbrand.collector.CollectSession;
import com.tencent.mm.plugin.appbrand.dynamic.e.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.q.b;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.jsapi.b.a
{
  public a(int paramInt)
  {
    super("drawCanvas", paramInt);
    GMTrace.i(19928379817984L, 148478);
    GMTrace.o(19928379817984L, 148478);
  }
  
  protected final void b(com.tencent.mm.jsapi.core.a parama, JSONObject paramJSONObject, b.a parama1)
  {
    GMTrace.i(19928514035712L, 148479);
    com.tencent.mm.plugin.appbrand.collector.c.aL(com.tencent.mm.plugin.appbrand.dynamic.g.d.h(paramJSONObject), "before_jsapi_invoke");
    q.b localb = parama.ww();
    String str1 = localb.getString("__page_view_id", null);
    String str2 = localb.getString("__process_name", ab.vR());
    if (com.tencent.mm.plugin.appbrand.dynamic.d.UB().pn(str1) == null)
    {
      w.w("MicroMsg.JsApiFunc_DrawCanvas", "get view by viewId(%s) return null.", new Object[] { str1 });
      parama1.c(a(false, "got 'null' when get view by the given viewId", null));
      GMTrace.o(19928514035712L, 148479);
      return;
    }
    for (;;)
    {
      try
      {
        long l2 = System.currentTimeMillis();
        parama = pr("lastTime");
        if (TextUtils.isEmpty(parama)) {
          break label310;
        }
        parama = localb.hfb.get(parama);
        if (!(parama instanceof Long)) {
          break label310;
        }
        l1 = ((Long)parama).longValue();
        l1 = l2 - l1;
        a locala = (a)localb.get(pr("DrawCanvasRunnable"), null);
        parama = locala;
        if (locala == null)
        {
          parama = new a();
          localb.k(pr("DrawCanvasRunnable"), parama);
        }
        parama.process = str2;
        parama.iLj = str1;
        parama.iLk = paramJSONObject;
        parama.iLl = this;
        parama.iLm = parama1;
        parama.iLn = localb;
        com.tencent.mm.plugin.appbrand.dynamic.b.Uz().removeCallbacks(parama);
        if (l1 < 16L)
        {
          w.v("MicroMsg.JsApiFunc_DrawCanvas", "postDelayed(%s)", new Object[] { Long.valueOf(l1) });
          com.tencent.mm.plugin.appbrand.dynamic.b.Uz().postDelayed(parama, l1);
          GMTrace.o(19928514035712L, 148479);
          return;
        }
      }
      finally {}
      parama.run();
      GMTrace.o(19928514035712L, 148479);
      return;
      label310:
      long l1 = 0L;
    }
  }
  
  public final String pr(String paramString)
  {
    GMTrace.i(17754186842112L, 132279);
    paramString = this.name + "#" + paramString;
    GMTrace.o(17754186842112L, 132279);
    return paramString;
  }
  
  private static final class a
    implements Runnable
  {
    String iLj;
    JSONObject iLk;
    a iLl;
    b.a iLm;
    q.b iLn;
    String process;
    
    public a()
    {
      GMTrace.i(17753113100288L, 132271);
      GMTrace.o(17753113100288L, 132271);
    }
    
    public final void run()
    {
      GMTrace.i(17753247318016L, 132272);
      synchronized (this.iLn)
      {
        this.iLn.k(this.iLl.pr("lastTime"), Long.valueOf(System.currentTimeMillis()));
        ??? = new Bundle();
        ((Bundle)???).putString("viewId", this.iLj);
        ((Bundle)???).putString("jsApiInvokeData", this.iLk.toString());
        String str = com.tencent.mm.plugin.appbrand.dynamic.g.d.h(this.iLk);
        CollectSession localCollectSession = com.tencent.mm.plugin.appbrand.collector.c.aL(str, "after_jsapi_invoke");
        ((Bundle)???).putString("__session_id", str);
        ((Bundle)???).putParcelable("__cost_time_session", localCollectSession);
        com.tencent.mm.ipcinvoker.e.a(this.process, (Bundle)???, a.b.class, new com.tencent.mm.ipcinvoker.c()
        {
          public final void k(Bundle paramAnonymousBundle)
          {
            GMTrace.i(17754992148480L, 132285);
            a.a.this.iLm.c(a.a.this.iLl.a(paramAnonymousBundle.getBoolean("ret"), paramAnonymousBundle.getString("reason", ""), null));
            GMTrace.o(17754992148480L, 132285);
          }
        });
        GMTrace.o(17753247318016L, 132272);
        return;
      }
    }
  }
  
  private static class b
    implements com.tencent.mm.ipcinvoker.a
  {
    private b()
    {
      GMTrace.i(17754589495296L, 132282);
      GMTrace.o(17754589495296L, 132282);
    }
    
    public final void a(Bundle paramBundle, com.tencent.mm.ipcinvoker.c paramc)
    {
      GMTrace.i(18330651983872L, 136574);
      Object localObject1 = paramBundle.getString("__session_id");
      com.tencent.mm.plugin.appbrand.collector.c.a((CollectSession)paramBundle.getParcelable("__cost_time_session"));
      com.tencent.mm.plugin.appbrand.collector.c.aL((String)localObject1, "after_cross_process_invoke");
      Bundle localBundle = new Bundle();
      Object localObject2 = paramBundle.getString("viewId");
      View localView = com.tencent.mm.plugin.appbrand.dynamic.e.UC().po((String)localObject2);
      if (!(localView instanceof com.tencent.mm.plugin.appbrand.canvas.widget.a))
      {
        w.i("MicroMsg.JsApiFunc_DrawCanvas", "drawCanvas failed, view is not a instance of DrawableView.(%s)", new Object[] { localObject2 });
        localBundle.putBoolean("ret", false);
        localBundle.putString("reason", "view is not a instance of DrawableView");
        paramc.k(localBundle);
        GMTrace.o(18330651983872L, 136574);
        return;
      }
      for (;;)
      {
        try
        {
          localObject2 = g.pB(paramBundle.getString("jsApiInvokeData"));
          paramBundle = ((JSONObject)localObject2).optJSONArray("actions");
          boolean bool = ((JSONObject)localObject2).optBoolean("reserve");
          com.tencent.mm.plugin.appbrand.collector.c.aL((String)localObject1, "after_cp_parse_json_end");
          if ((localView instanceof com.tencent.mm.plugin.appbrand.collector.d))
          {
            com.tencent.mm.plugin.appbrand.collector.d locald = (com.tencent.mm.plugin.appbrand.collector.d)localView;
            locald.ot((String)localObject1);
            locald.setStartTime(((JSONObject)localObject2).optLong("__invoke_jsapi_timestamp"));
          }
          localObject1 = (com.tencent.mm.plugin.appbrand.canvas.widget.a)localView;
          if (bool)
          {
            ((com.tencent.mm.plugin.appbrand.canvas.widget.a)localObject1).e(paramBundle);
            ((com.tencent.mm.plugin.appbrand.canvas.widget.a)localObject1).TC();
            localBundle.putBoolean("ret", true);
            paramc.k(localBundle);
            GMTrace.o(18330651983872L, 136574);
            return;
          }
        }
        catch (JSONException paramBundle)
        {
          w.e("MicroMsg.JsApiFunc_DrawCanvas", "drawCanvas failed, IPC parse JSONObject error : %s", new Object[] { paramBundle });
          localBundle.putBoolean("ret", false);
          localBundle.putString("reason", "parse json data error");
          paramc.k(localBundle);
          GMTrace.o(18330651983872L, 136574);
          return;
        }
        ((com.tencent.mm.plugin.appbrand.canvas.widget.a)localObject1).d(paramBundle);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/jsapi/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */