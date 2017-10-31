package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a.a;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.widget.e;
import com.tencent.mm.plugin.webview.ui.tools.widget.e.a;
import com.tencent.mm.protocal.c.ahr;
import com.tencent.mm.protocal.c.aid;
import com.tencent.mm.protocal.c.aie;
import com.tencent.mm.protocal.c.aif;
import com.tencent.mm.protocal.c.aig;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d
  extends a
{
  public static final int CTRL_BYTE = 232;
  public static final String NAME = "authorize";
  
  public d()
  {
    GMTrace.i(17044443496448L, 126991);
    GMTrace.o(17044443496448L, 126991);
  }
  
  public final void a(final com.tencent.mm.plugin.game.gamewebview.ui.d paramd, final JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17044577714176L, 126992);
    w.i("MicroMsg.GameJsApiAuthorize", "invoke");
    final GameWebViewUI localGameWebViewUI = paramd.aDm();
    Object localObject = paramJSONObject.optJSONArray("scope");
    if (localObject == null)
    {
      w.e("MicroMsg.GameJsApiAuthorize", "scope is null!");
      paramd.v(paramInt, a.d("authorize:fail", null));
      GMTrace.o(17044577714176L, 126992);
      return;
    }
    paramJSONObject = paramd.aDq();
    if (bg.mZ(paramJSONObject))
    {
      w.e("MicroMsg.GameJsApiAuthorize", "appId is null!");
      paramd.v(paramInt, a.d("authorize:fail", null));
      GMTrace.o(17044577714176L, 126992);
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    while (i < ((JSONArray)localObject).length())
    {
      localLinkedList.add(((JSONArray)localObject).optString(i));
      i += 1;
    }
    localObject = new com.tencent.mm.ac.b.a();
    aif localaif = new aif();
    ((com.tencent.mm.ac.b.a)localObject).hlX = localaif;
    ((com.tencent.mm.ac.b.a)localObject).hlY = new aig();
    ((com.tencent.mm.ac.b.a)localObject).uri = "/cgi-bin/mmbiz-bin/js-authorize";
    ((com.tencent.mm.ac.b.a)localObject).hlW = 1157;
    ((com.tencent.mm.ac.b.a)localObject).hlZ = 0;
    ((com.tencent.mm.ac.b.a)localObject).hma = 0;
    localaif.mDD = paramJSONObject;
    localaif.udc = localLinkedList;
    localaif.ude = 0;
    paramd = new a.a(paramd, paramInt);
    com.tencent.mm.ipcinvoker.wx_extension.b.a(((com.tencent.mm.ac.b.a)localObject).DA(), new com.tencent.mm.ipcinvoker.wx_extension.b.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.b paramAnonymousb)
      {
        GMTrace.i(17052630777856L, 127052);
        w.i("MicroMsg.GameJsApiAuthorize", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
        {
          paramd.qb(com.tencent.mm.plugin.game.gamewebview.a.d.yF("authorize:fail"));
          GMTrace.o(17052630777856L, 127052);
          return;
        }
        paramAnonymousString = (aig)paramAnonymousb.hlV.hmc;
        if ((paramAnonymousString == null) || (paramAnonymousString.udg == null))
        {
          paramAnonymousString = paramd;
          paramAnonymousb = d.this;
          paramAnonymousString.qb(a.d("authorize:fail", null));
          GMTrace.o(17052630777856L, 127052);
          return;
        }
        paramAnonymousInt1 = paramAnonymousString.udg.fzx;
        paramAnonymousb = paramAnonymousString.udg.fzy;
        w.i("MicroMsg.GameJsApiAuthorize", "jsErrcode = %d", new Object[] { Integer.valueOf(paramAnonymousInt1) });
        if (paramAnonymousInt1 == 53536)
        {
          af.u(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(17835657003008L, 132886);
              Object localObject1 = new e(d.1.this.val$context);
              Object localObject2 = new e.a()
              {
                public final void c(int paramAnonymous3Int, Bundle paramAnonymous3Bundle)
                {
                  GMTrace.i(17835388567552L, 132884);
                  w.i("MicroMsg.GameJsApiAuthorize", "stev onRevMsg resultCode %d", new Object[] { Integer.valueOf(paramAnonymous3Int) });
                  switch (paramAnonymous3Int)
                  {
                  default: 
                    w.d("MicroMsg.GameJsApiAuthorize", "press back button!");
                    paramAnonymous3Bundle = d.1.this.muu;
                    locald = d.this;
                    paramAnonymous3Bundle.qb(a.d("authorize:fail_auth_cancel", null));
                  }
                  do
                  {
                    GMTrace.o(17835388567552L, 132884);
                    return;
                    locald = d.this;
                    String str = d.1.this.fnb;
                    a.a locala = d.1.this.muu;
                    Object localObject = (ArrayList)paramAnonymous3Bundle.getSerializable("key_scope");
                    paramAnonymous3Bundle = new LinkedList();
                    localObject = ((ArrayList)localObject).iterator();
                    while (((Iterator)localObject).hasNext()) {
                      paramAnonymous3Bundle.add((String)((Iterator)localObject).next());
                    }
                    localObject = new com.tencent.mm.ac.b.a();
                    aid localaid = new aid();
                    ((com.tencent.mm.ac.b.a)localObject).hlX = localaid;
                    ((com.tencent.mm.ac.b.a)localObject).hlY = new aie();
                    ((com.tencent.mm.ac.b.a)localObject).uri = "/cgi-bin/mmbiz-bin/js-authorize-confirm";
                    ((com.tencent.mm.ac.b.a)localObject).hlW = 1158;
                    ((com.tencent.mm.ac.b.a)localObject).hlZ = 0;
                    ((com.tencent.mm.ac.b.a)localObject).hma = 0;
                    localaid.mDD = str;
                    localaid.udc = paramAnonymous3Bundle;
                    localaid.ude = 0;
                    localaid.udd = paramAnonymous3Int;
                    com.tencent.mm.ipcinvoker.wx_extension.b.a(((com.tencent.mm.ac.b.a)localObject).DA(), new d.2(locald, locala, paramAnonymous3Int));
                  } while (paramAnonymous3Int != 2);
                  paramAnonymous3Bundle = d.1.this.muu;
                  d locald = d.this;
                  paramAnonymous3Bundle.qb(a.d("authorize:fail_auth_deny", null));
                  GMTrace.o(17835388567552L, 132884);
                }
              };
              if ((this.iTl != null) && (this.iTl.size() > 0))
              {
                if (!((e)localObject1).a(this.iTl, this.muw, this.mux, (e.a)localObject2))
                {
                  localObject1 = d.1.this.muu;
                  localObject2 = d.this;
                  ((a.a)localObject1).qb(a.d("authorize:fail", null));
                }
                GMTrace.o(17835657003008L, 132886);
                return;
              }
              w.e("MicroMsg.GameJsApiAuthorize", "scopeInfoList is empty!");
              localObject1 = d.1.this.muu;
              localObject2 = d.this;
              ((a.a)localObject1).qb(a.d("authorize:fail", null));
              GMTrace.o(17835657003008L, 132886);
            }
          });
          GMTrace.o(17052630777856L, 127052);
          return;
        }
        if (paramAnonymousInt1 == 0)
        {
          paramAnonymousString = paramd;
          paramAnonymousb = d.this;
          paramAnonymousString.qb(a.d("authorize:ok", null));
          GMTrace.o(17052630777856L, 127052);
          return;
        }
        w.e("MicroMsg.GameJsApiAuthorize", "ERROR = %s", new Object[] { paramAnonymousb });
        paramAnonymousString = paramd;
        paramAnonymousb = d.this;
        paramAnonymousString.qb(a.d("authorize:fail", null));
        GMTrace.o(17052630777856L, 127052);
      }
    });
    GMTrace.o(17044577714176L, 126992);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */