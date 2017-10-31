package com.tencent.mm.plugin.appbrand;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.bq;
import com.tencent.mm.g.a.bq.b;
import com.tencent.mm.g.a.px;
import com.tencent.mm.g.a.px.b;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.base.model.c;
import com.tencent.mm.plugin.report.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class q
  extends com.tencent.mm.plugin.ab.a
{
  public q()
  {
    GMTrace.i(19884356403200L, 148150);
    GMTrace.o(19884356403200L, 148150);
  }
  
  public final int getType()
  {
    GMTrace.i(19884490620928L, 148151);
    GMTrace.o(19884490620928L, 148151);
    return 1;
  }
  
  public final void k(final Context paramContext, Intent paramIntent)
  {
    GMTrace.i(19884624838656L, 148152);
    com.tencent.mm.plugin.report.service.g.paX.a(443L, 2L, 1L, false);
    final String str = c.ta(s.i(paramIntent, "id"));
    Object localObject1 = c.ta(s.i(paramIntent, "ext_info"));
    Object localObject2 = s.i(paramIntent, "token");
    final int i = s.a(paramIntent, "ext_info_1", 0);
    if ((TextUtils.isEmpty(str)) || (TextUtils.isEmpty((CharSequence)localObject1)) || (TextUtils.isEmpty((CharSequence)localObject2)))
    {
      w.e("MiroMsg.WxaShortcutEntry", "jump to Wxa failed, username or appId or token is null or nil.");
      i = 0;
    }
    for (;;)
    {
      if (i == 0) {
        com.tencent.mm.plugin.report.service.g.paX.a(443L, 3L, 1L, false);
      }
      GMTrace.o(19884624838656L, 148152);
      return;
      if (!com.tencent.mm.w.h.eE(str))
      {
        w.e("MiroMsg.WxaShortcutEntry", "jump to Wxa failed, username %s invalid ", new Object[] { str });
        d.oZR.a(647L, 1L, 1L, false);
        i = 0;
      }
      else
      {
        localObject3 = new StringBuilder();
        com.tencent.mm.kernel.h.xx();
        if (!((String)localObject2).equals(c.bp((String)localObject1, com.tencent.mm.kernel.a.wy())))
        {
          localObject3 = ab.getContext().getSharedPreferences("app_brand_global_sp", 0);
          if (localObject3 == null)
          {
            w.w("MiroMsg.WxaShortcutEntry", "jump to Wxa failed, sp is null.");
            i = 0;
            continue;
          }
          Object localObject4 = ((SharedPreferences)localObject3).getStringSet("uin_set", new HashSet());
          if ((localObject4 == null) || (((Set)localObject4).isEmpty()))
          {
            w.w("MiroMsg.WxaShortcutEntry", "jump to Wxa failed, uin set is null or nil.");
            i = 0;
            continue;
          }
          localObject3 = new HashSet();
          localObject4 = ((Set)localObject4).iterator();
          while (((Iterator)localObject4).hasNext()) {
            ((Set)localObject3).add(c.bp((String)localObject1, (String)((Iterator)localObject4).next()));
          }
          if (!((Set)localObject3).contains(localObject2))
          {
            w.e("MiroMsg.WxaShortcutEntry", "jump to Wxa failed, illegal token(%s).", new Object[] { localObject2 });
            i = 0;
            continue;
          }
        }
        if ((com.tencent.mm.sdk.a.b.bMv()) || (i != 1)) {
          break;
        }
        w.i("MiroMsg.WxaShortcutEntry", "can not open testing WeApp in released WeChat.");
        i = 0;
      }
    }
    localObject2 = new px();
    ((px)localObject2).fNL.appId = ((String)localObject1);
    ((px)localObject2).fNL.userName = str;
    ((px)localObject2).fNL.fNO = i;
    ((px)localObject2).fNL.scene = 1023;
    ((px)localObject2).fNL.fNR = true;
    ((px)localObject2).fNL.context = paramContext;
    ((px)localObject2).fNL.fNS = false;
    com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject2);
    if (((px)localObject2).fNM.fNX) {
      w.i("MiroMsg.WxaShortcutEntry", "open wxa with id : %s", new Object[] { str });
    }
    for (;;)
    {
      localObject1 = s.i(paramIntent, "digest");
      if (TextUtils.isEmpty((CharSequence)localObject1)) {
        break label694;
      }
      localObject2 = ((com.tencent.mm.plugin.appbrand.k.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.b.class)).oU(str);
      if (localObject2 != null) {
        break label594;
      }
      w.e("MiroMsg.WxaShortcutEntry", "no such WeApp(%s)", new Object[] { str });
      i = 1;
      break;
      if (i == 1) {
        Toast.makeText(paramContext, p.i.iwB, 0).show();
      } else if (i == 2) {
        Toast.makeText(paramContext, p.i.ixF, 0).show();
      }
    }
    label594:
    Object localObject3 = ((WxaAttributes)localObject2).field_nickname;
    if (!((String)localObject1).equals(com.tencent.mm.a.g.n(((String)localObject3 + ((WxaAttributes)localObject2).field_roundedSquareIconURL + ((WxaAttributes)localObject2).field_bigHeadURL).getBytes())))
    {
      w.i("MiroMsg.WxaShortcutEntry", "update shortcut for wxa(%s)", new Object[] { str });
      if (paramContext != null) {
        break label718;
      }
      w.e("MicroMsg.AppBrandShortcutManager", "remove fail, context or username is null.");
    }
    for (;;)
    {
      af.i(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19674842529792L, 146589);
          l.d(paramContext, str, i);
          GMTrace.o(19674842529792L, 146589);
        }
      }, 1000L);
      label694:
      paramIntent.putExtra("type", 0);
      paramIntent.putExtra("id", "");
      i = 1;
      break;
      label718:
      if (paramIntent == null)
      {
        w.e("MicroMsg.AppBrandShortcutManager", "remove fail, intent is null");
      }
      else
      {
        localObject1 = new bq();
        ((bq)localObject1).fvQ.username = str;
        com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject1);
        if (((bq)localObject1).fvR.fvT != null) {
          break label794;
        }
        w.e("MicroMsg.AppBrandShortcutManager", "no such WeApp(%s)", new Object[] { str });
      }
    }
    label794:
    if (TextUtils.isEmpty(((bq)localObject1).fvR.fvS)) {}
    for (localObject1 = str;; localObject1 = ((bq)localObject1).fvR.fvS)
    {
      localObject2 = new Intent("com.android.launcher.action.UNINSTALL_SHORTCUT");
      ((Intent)localObject2).putExtra("android.intent.extra.shortcut.NAME", (String)localObject1);
      ((Intent)localObject2).putExtra("duplicate", false);
      ((Intent)localObject2).putExtra("android.intent.extra.shortcut.INTENT", paramIntent);
      com.tencent.mm.plugin.base.model.b.n(paramContext, paramIntent);
      w.i("MicroMsg.AppBrandShortcutManager", "remove shortcut %s", new Object[] { str });
      break;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */