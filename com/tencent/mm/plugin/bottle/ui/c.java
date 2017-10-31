package com.tencent.mm.plugin.bottle.ui;

import android.content.Intent;
import android.text.Html;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.bottle.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.ChoicePreference;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.Preference.a;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.n;

public final class c
{
  private MMActivity fsU;
  private f ilZ;
  
  public c(MMActivity paramMMActivity, f paramf)
  {
    GMTrace.i(7629740965888L, 56846);
    this.fsU = paramMMActivity;
    this.ilZ = paramf;
    paramMMActivity = (ChoicePreference)this.ilZ.UM("settings_sex");
    paramMMActivity.vNs = new Preference.a()
    {
      public final boolean a(Preference paramAnonymousPreference, Object paramAnonymousObject)
      {
        GMTrace.i(7653363286016L, 57022);
        paramAnonymousPreference = (String)paramAnonymousObject;
        int i = -1;
        if ("male".equalsIgnoreCase(paramAnonymousPreference)) {
          i = 1;
        }
        for (;;)
        {
          if (i > 0)
          {
            ap.AS();
            com.tencent.mm.x.c.xi().set(12290, Integer.valueOf(i));
          }
          GMTrace.o(7653363286016L, 57022);
          return false;
          if ("female".equalsIgnoreCase(paramAnonymousPreference)) {
            i = 2;
          }
        }
      }
    };
    paramMMActivity.setTitle(Html.fromHtml(this.fsU.getString(R.l.eIF) + "<font color='red'>*</font>"));
    ((KeyValuePreference)this.ilZ.UM("settings_district")).setTitle(Html.fromHtml(this.fsU.getString(R.l.eGW) + "<font color='red'>*</font>"));
    GMTrace.o(7629740965888L, 56846);
  }
  
  public static void ahd()
  {
    GMTrace.i(7629875183616L, 56847);
    com.tencent.mm.x.bg localbg = com.tencent.mm.x.bg.BF();
    ap.AS();
    com.tencent.mm.x.c.yK().b(new e.a(1, com.tencent.mm.x.bg.a(localbg)));
    a.ifN.pt();
    GMTrace.o(7629875183616L, 56847);
  }
  
  public final boolean ahe()
  {
    GMTrace.i(7630143619072L, 56849);
    Intent localIntent = new Intent();
    localIntent.putExtra("persist_signature", false);
    a.ifM.c(localIntent, this.fsU);
    GMTrace.o(7630143619072L, 56849);
    return true;
  }
  
  public final boolean ahf()
  {
    GMTrace.i(7630277836800L, 56850);
    a.ifM.b(new Intent(), this.fsU);
    GMTrace.o(7630277836800L, 56850);
    return true;
  }
  
  public final void update()
  {
    GMTrace.i(7630009401344L, 56848);
    ap.AS();
    int i = com.tencent.mm.sdk.platformtools.bg.a((Integer)com.tencent.mm.x.c.xi().get(12290, null), 0);
    Object localObject1 = (ChoicePreference)this.ilZ.UM("settings_sex");
    switch (i)
    {
    default: 
      ((ChoicePreference)localObject1).setValue("unknown");
    }
    for (;;)
    {
      Object localObject2 = com.tencent.mm.x.bg.BF();
      localObject1 = ((com.tencent.mm.x.bg)localObject2).getProvince();
      localObject2 = ((com.tencent.mm.x.bg)localObject2).getCity();
      this.ilZ.UM("settings_district").setSummary(n.fe((String)localObject1) + " " + (String)localObject2);
      KeyValuePreference localKeyValuePreference = (KeyValuePreference)this.ilZ.UM("settings_signature");
      localKeyValuePreference.vOl = false;
      ap.AS();
      localObject2 = com.tencent.mm.sdk.platformtools.bg.mY((String)com.tencent.mm.x.c.xi().get(12291, null));
      MMActivity localMMActivity = this.fsU;
      localObject1 = localObject2;
      if (((String)localObject2).length() <= 0) {
        localObject1 = this.fsU.getString(R.l.eIL);
      }
      localKeyValuePreference.setSummary(com.tencent.mm.pluginsdk.ui.d.h.a(localMMActivity, (CharSequence)localObject1));
      this.ilZ.notifyDataSetChanged();
      GMTrace.o(7630009401344L, 56848);
      return;
      ((ChoicePreference)localObject1).setValue("male");
      continue;
      ((ChoicePreference)localObject1).setValue("female");
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */