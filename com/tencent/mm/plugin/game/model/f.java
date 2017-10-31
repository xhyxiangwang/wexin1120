package com.tencent.mm.plugin.game.model;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.an.a.a.c.a;
import com.tencent.mm.g.a.gj;
import com.tencent.mm.g.a.gj.a;
import com.tencent.mm.plugin.game.ui.GameRegionPreference.a;
import com.tencent.mm.protocal.c.afq;
import com.tencent.mm.protocal.c.amu;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
{
  private static final String mzD;
  
  static
  {
    GMTrace.i(18027051483136L, 134312);
    mzD = com.tencent.mm.loader.stub.a.gZT + "Game/HvMenu/";
    GMTrace.o(18027051483136L, 134312);
  }
  
  public static void a(gj paramgj)
  {
    GMTrace.i(18026648829952L, 134309);
    switch (paramgj.fCy.nN)
    {
    }
    for (;;)
    {
      GMTrace.o(18026648829952L, 134309);
      return;
      Object localObject1 = paramgj.fCy.context;
      if (localObject1 != null)
      {
        localObject1 = e.cx((Context)localObject1);
        if (localObject1 != null)
        {
          localObject1 = e.a((GameRegionPreference.a)localObject1);
          paramgj.fCz.result = ((String)localObject1);
        }
      }
      GMTrace.o(18026648829952L, 134309);
      return;
      paramgj = paramgj.fCy.fCA;
      w.i("MicroMsg.GameCommOpertionProcessor", "update hv menu! appid:%s", new Object[] { paramgj });
      if (!bg.mZ(paramgj))
      {
        ap.wT().a(1369, new com.tencent.mm.ac.e()
        {
          public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
          {
            GMTrace.i(18028796313600L, 134325);
            if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
            {
              w.i("MicroMsg.GameCommOpertionProcessor", "pull menu data success. appid:%s", new Object[] { this.jYJ });
              ap.wT().b(1369, this);
              af.u(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(18030138490880L, 134335);
                  f.a(this.mzE, f.1.this.jYJ);
                  GMTrace.o(18030138490880L, 134335);
                }
              });
              GMTrace.o(18028796313600L, 134325);
              return;
            }
            w.i("MicroMsg.GameCommOpertionProcessor", "pull menu data fail. appid:%s", new Object[] { this.jYJ });
            GMTrace.o(18028796313600L, 134325);
          }
        });
        paramgj = new au(paramgj);
        ap.wT().a(paramgj, 0);
      }
      GMTrace.o(18026648829952L, 134309);
      return;
      localObject1 = paramgj.fCy.fCA;
      w.i("MicroMsg.GameCommOpertionProcessor", "get hv menu! appid:%s", new Object[] { localObject1 });
      if (!bg.mZ((String)localObject1))
      {
        Object localObject2 = SubCoreGameCenter.aFi().zd("pb_game_hv_menu_" + (String)localObject1);
        if (!bg.bp((byte[])localObject2)) {
          try
          {
            localObject2 = new String((byte[])localObject2, "ISO-8859-1");
            paramgj.fCz.result = ((String)localObject2);
            w.i("MicroMsg.GameCommOpertionProcessor", "get hv menu success! appid:%s", new Object[] { localObject1 });
            GMTrace.o(18026648829952L, 134309);
            return;
          }
          catch (UnsupportedEncodingException paramgj) {}
        }
      }
      GMTrace.o(18026648829952L, 134309);
      return;
      b(paramgj);
    }
  }
  
  public static void a(final afq paramafq, String paramString)
  {
    GMTrace.i(18026783047680L, 134310);
    if (paramafq == null)
    {
      GMTrace.o(18026783047680L, 134310);
      return;
    }
    if (bg.bX(paramafq.uaY))
    {
      w.i("MicroMsg.GameCommOpertionProcessor", "menu list is null. appid:%s", new Object[] { paramString });
      GMTrace.o(18026783047680L, 134310);
      return;
    }
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(paramafq.uaY);
    a(localArrayList, new a()
    {
      public final void onComplete()
      {
        GMTrace.i(18029064749056L, 134327);
        w.i("MicroMsg.GameCommOpertionProcessor", "menu icon download complete! save menu data. appid:%s", new Object[] { this.jYJ });
        SubCoreGameCenter.aFi().a("pb_game_hv_menu_" + this.jYJ, paramafq);
        GMTrace.o(18029064749056L, 134327);
      }
    });
    GMTrace.o(18026783047680L, 134310);
  }
  
  public static void a(final List<amu> paramList, final a parama)
  {
    GMTrace.i(18026917265408L, 134311);
    if (bg.bX(paramList))
    {
      if (parama != null) {
        parama.onComplete();
      }
      GMTrace.o(18026917265408L, 134311);
      return;
    }
    amu localamu = (amu)paramList.remove(0);
    if ((localamu == null) || (bg.mZ(localamu.osy)))
    {
      w.e("MicroMsg.GameCommOpertionProcessor", "menu is null or thumburl is null");
      GMTrace.o(18026917265408L, 134311);
      return;
    }
    Object localObject = mzD + com.tencent.mm.a.g.n(localamu.osy.getBytes());
    c.a locala = new c.a();
    locala.hCP = true;
    locala.hCR = ((String)localObject);
    localObject = locala.Jk();
    com.tencent.mm.an.n.Ja().a(localamu.osy, (com.tencent.mm.an.a.a.c)localObject, new com.tencent.mm.an.a.c.c()
    {
      public final void a(boolean paramAnonymousBoolean, Object... paramAnonymousVarArgs)
      {
        GMTrace.i(18030541144064L, 134338);
        if (paramAnonymousBoolean)
        {
          w.i("MicroMsg.GameCommOpertionProcessor", "menu icon download success! thumburl:%s", new Object[] { this.mzG.osy });
          f.a(paramList, parama);
        }
        GMTrace.o(18030541144064L, 134338);
      }
    });
    GMTrace.o(18026917265408L, 134311);
  }
  
  private static void b(gj paramgj)
  {
    GMTrace.i(19312320446464L, 143888);
    paramgj = paramgj.fCy.fCA;
    if (bg.mZ(paramgj))
    {
      GMTrace.o(19312320446464L, 143888);
      return;
    }
    Object localObject;
    int j;
    boolean bool;
    try
    {
      localObject = new JSONObject(paramgj);
      j = Integer.parseInt(((JSONObject)localObject).getString("game_page_report_id"));
      bool = ((JSONObject)localObject).getBoolean("game_page_report_instantly");
      paramgj = ((JSONObject)localObject).getString("game_page_report_format_data");
      localObject = ((JSONObject)localObject).getString("game_page_report_tabs_format_data");
      w.i("MicroMsg.GameCommOpertionProcessor", "reportGamePageTime, reportId:%d, reportInstantly:%b, reportFormatData:(%s), reportTabsFormatData(%s)", new Object[] { Integer.valueOf(j), Boolean.valueOf(bool), paramgj, localObject });
      if (bg.mZ(paramgj)) {
        break label193;
      }
      if (bool)
      {
        ai.ab(j, paramgj);
        GMTrace.o(19312320446464L, 143888);
        return;
      }
    }
    catch (JSONException paramgj)
    {
      w.i("MicroMsg.GameCommOpertionProcessor", "reportGamePageTime, err1:%s", new Object[] { paramgj.getMessage() });
      GMTrace.o(19312320446464L, 143888);
      return;
    }
    com.tencent.mm.plugin.report.service.g.paX.z(j, paramgj);
    GMTrace.o(19312320446464L, 143888);
    return;
    label193:
    if (!bg.mZ((String)localObject)) {}
    for (;;)
    {
      int i;
      try
      {
        paramgj = new JSONArray((String)localObject);
        i = 0;
        if (i >= paramgj.length()) {
          break label291;
        }
        localObject = paramgj.getString(i);
        if (bg.mZ((String)localObject)) {
          break label301;
        }
        if (bool) {
          ai.ab(j, (String)localObject);
        } else {
          com.tencent.mm.plugin.report.service.g.paX.z(j, (String)localObject);
        }
      }
      catch (JSONException paramgj)
      {
        w.i("MicroMsg.GameCommOpertionProcessor", "reportGamePageTime, err2:%s", new Object[] { paramgj.getMessage() });
      }
      GMTrace.o(19312320446464L, 143888);
      return;
      label291:
      GMTrace.o(19312320446464L, 143888);
      return;
      label301:
      i += 1;
    }
  }
  
  static abstract interface a
  {
    public abstract void onComplete();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */