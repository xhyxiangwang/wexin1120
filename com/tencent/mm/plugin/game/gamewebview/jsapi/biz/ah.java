package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.u;
import com.tencent.mm.ac.u.a;
import com.tencent.mm.g.a.px;
import com.tencent.mm.g.a.px.b;
import com.tencent.mm.plugin.game.gamewebview.jsapi.GameJsApiMMTask.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.boz;
import com.tencent.mm.protocal.c.bpa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class ah
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 10000;
  public static final int DO_IN_ENV = 1;
  public static final String NAME = "openWeAppPage";
  
  public ah()
  {
    GMTrace.i(17041356488704L, 126968);
    GMTrace.o(17041356488704L, 126968);
  }
  
  public final void a(Context paramContext, final String paramString, GameJsApiMMTask.a parama)
  {
    GMTrace.i(17041490706432L, 126969);
    w.i("MicroMsg.GameJsApiOpenWeAppPage", "invoke");
    paramString = com.tencent.mm.plugin.game.gamewebview.a.d.pQ(paramString);
    if (paramString == null)
    {
      w.e("MicroMsg.GameJsApiOpenWeAppPage", "data is null");
      parama.qb(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("openWeAppPage:fail_null_data", null));
      GMTrace.o(17041490706432L, 126969);
      return;
    }
    String str1 = paramString.optString("userName");
    String str2 = paramString.optString("relativeURL");
    int i = paramString.optInt("appVersion", 0);
    Object localObject1 = paramString.optString("searchId");
    Object localObject2 = paramString.optString("docId");
    int j = paramString.optInt("position", 1);
    int k = paramString.optInt("scene", 1000);
    paramContext = new px();
    if (k == 201) {
      paramContext.fNL.scene = 1006;
    }
    for (;;)
    {
      paramContext.fNL.userName = str1;
      paramContext.fNL.fNN = str2;
      paramContext.fNL.fNP = i;
      paramContext.fNL.fNS = false;
      str1 = paramString.optString("statSessionId");
      str2 = paramString.optString("statKeywordId");
      String str3 = paramString.optString("subScene");
      paramContext.fNL.fty = (str1 + ":" + str2 + ":" + (String)localObject1 + ":" + (String)localObject2 + ":" + j + ":" + str3);
      com.tencent.mm.sdk.b.a.uLm.m(paramContext);
      localObject1 = new b.a();
      ((b.a)localObject1).hlX = new boz();
      ((b.a)localObject1).hlY = new bpa();
      ((b.a)localObject1).uri = "/cgi-bin/mmux-bin/weappsearchadclick";
      ((b.a)localObject1).hlW = 1873;
      localObject1 = ((b.a)localObject1).DA();
      localObject2 = (boz)((b)localObject1).hlU.hmc;
      ((boz)localObject2).uFa = paramString.optString("statSessionId");
      ((boz)localObject2).uFb = paramString.optString("statKeywordId");
      ((boz)localObject2).ugH = paramString.optString("searchId");
      ((boz)localObject2).urr = paramString.optString("docId");
      ((boz)localObject2).uFc = paramString.optInt("position", 1);
      ((boz)localObject2).osr = paramString.optString("userName");
      ((boz)localObject2).uFd = paramString.optInt("appVersion", 0);
      ((boz)localObject2).uFe = paramString.optString("adBuffer");
      ((boz)localObject2).uFf = paramString.optString("clickExtInfo");
      paramString = new com.tencent.mm.modelsns.d();
      paramString.m("20StatSessionId", ((boz)localObject2).uFa + ",");
      paramString.m("21KeywordId", ((boz)localObject2).uFb + ",");
      paramString.m("22SearchId", ((boz)localObject2).ugH + ",");
      paramString.m("23DocId", ((boz)localObject2).urr + ",");
      paramString.m("24Pos", ((boz)localObject2).uFc + ",");
      paramString.m("25AppUserName", ((boz)localObject2).osr + ",");
      paramString.m("26AppVersion", ((boz)localObject2).uFd + ",");
      paramString.m("27AdBuffer", ((boz)localObject2).uFe + ",");
      paramString.m("28AdClickBuffer", ((boz)localObject2).uFf + ",");
      paramString.m("29scene", k + ",");
      w.i("MicroMsg.GameJsApiOpenWeAppPage", "doClickReportScene oreh" + paramString.LL());
      u.a((b)localObject1, new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb, k paramAnonymousk)
        {
          GMTrace.i(17068871122944L, 127173);
          w.d("MicroMsg.GameJsApiOpenWeAppPage", "onGYNetEnd oreh errType:%d errCode:%d msg:%s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            w.i("MicroMsg.GameJsApiOpenWeAppPage", "report oreh logbuffer(13927)");
            g.paX.i(13927, new Object[] { paramString });
            g.paX.a(457L, 0L, 1L, false);
          }
          GMTrace.o(17068871122944L, 127173);
          return 0;
        }
      });
      if (!paramContext.fNM.fNX) {
        break;
      }
      parama.qb(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("openWeAppPage:ok", null));
      GMTrace.o(17041490706432L, 126969);
      return;
      if (k == 3) {
        paramContext.fNL.scene = 1005;
      } else if (k == 16) {
        paramContext.fNL.scene = 1042;
      } else {
        paramContext.fNL.scene = 1000;
      }
    }
    parama.qb(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("openWeAppPage:fail:" + bg.mY(paramContext.fNM.fNY), null));
    GMTrace.o(17041490706432L, 126969);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */