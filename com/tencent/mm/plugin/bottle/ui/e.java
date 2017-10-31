package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.au.g;
import com.tencent.mm.au.n;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.bottle.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.base.q;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import junit.framework.Assert;

public final class e
  implements com.tencent.mm.pluginsdk.d.a, m.b
{
  public final Context context;
  private boolean fwS;
  private f ilZ;
  private x jqN;
  private final Map<String, Preference> kgE;
  private int status;
  
  public e(Context paramContext)
  {
    GMTrace.i(7626519740416L, 56822);
    this.kgE = new HashMap();
    this.context = paramContext;
    GMTrace.o(7626519740416L, 56822);
  }
  
  private void ahi()
  {
    int i = 1;
    GMTrace.i(7626922393600L, 56825);
    this.status = com.tencent.mm.x.m.zJ();
    boolean bool;
    HelperHeaderPreference localHelperHeaderPreference;
    if ((com.tencent.mm.x.m.zQ() & 0x40) == 0)
    {
      bool = true;
      this.fwS = bool;
      this.ilZ.removeAll();
      if (this.kgE.containsKey("contact_info_header_helper"))
      {
        localHelperHeaderPreference = (HelperHeaderPreference)this.kgE.get("contact_info_header_helper");
        this.ilZ.a(localHelperHeaderPreference);
        localHelperHeaderPreference = (HelperHeaderPreference)this.ilZ.UM("contact_info_header_helper");
        localHelperHeaderPreference.ab(this.jqN.field_username, this.jqN.vq(), this.context.getString(R.l.dMH));
        if (!this.fwS) {
          break label345;
        }
      }
    }
    for (;;)
    {
      localHelperHeaderPreference.lm(i);
      if (this.kgE.containsKey("contact_info_floatbottle_hide_cat")) {
        this.ilZ.a((Preference)this.kgE.get("contact_info_floatbottle_hide_cat"));
      }
      if (!this.fwS) {
        break label350;
      }
      if (this.kgE.containsKey("contact_info_goto_floatbottle")) {
        this.ilZ.a((Preference)this.kgE.get("contact_info_goto_floatbottle"));
      }
      if (this.kgE.containsKey("contact_info_floatbottle_clear_data")) {
        this.ilZ.a((Preference)this.kgE.get("contact_info_floatbottle_clear_data"));
      }
      if (this.kgE.containsKey("contact_info_floatbottle_hide_cat2")) {
        this.ilZ.a((Preference)this.kgE.get("contact_info_floatbottle_hide_cat2"));
      }
      if (!this.kgE.containsKey("contact_info_floatbottle_uninstall")) {
        break label387;
      }
      this.ilZ.a((Preference)this.kgE.get("contact_info_floatbottle_uninstall"));
      GMTrace.o(7626922393600L, 56825);
      return;
      bool = false;
      break;
      label345:
      i = 0;
    }
    label350:
    if (this.kgE.containsKey("contact_info_floatbottle_install")) {
      this.ilZ.a((Preference)this.kgE.get("contact_info_floatbottle_install"));
    }
    label387:
    GMTrace.o(7626922393600L, 56825);
  }
  
  public static void f(Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(7627056611328L, 56826);
    if (paramBoolean) {}
    for (final Object localObject = paramContext.getString(R.l.eIl);; localObject = paramContext.getString(R.l.eIs))
    {
      paramContext.getString(R.l.dxm);
      paramContext = com.tencent.mm.ui.base.h.a(paramContext, (String)localObject, true, null);
      localObject = new ae()
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          GMTrace.i(7602360549376L, 56642);
          boolean bool = this.kgG;
          int i = com.tencent.mm.x.m.zJ();
          int j = com.tencent.mm.x.m.zQ();
          if (bool)
          {
            i |= 0x1000;
            j &= 0xFFFFFFBF;
            ap.AS();
            c.yK().b(new g(11, 1));
          }
          for (;;)
          {
            ap.AS();
            c.xi().set(7, Integer.valueOf(i));
            ap.AS();
            c.xi().set(34, Integer.valueOf(j));
            ap.AS();
            c.yK().b(new n("", "", "", "", "", "", "", "", j, "", ""));
            if (!this.kgG) {
              i.agY();
            }
            if (this.kgH != null) {
              this.kgH.a(null, null);
            }
            GMTrace.o(7602360549376L, 56642);
            return;
            i &= 0xEFFF;
            j |= 0x40;
            ap.AS();
            c.yK().b(new g(11, 2));
          }
        }
      };
      new Timer().schedule(new TimerTask()
      {
        public final void run()
        {
          GMTrace.i(7620882595840L, 56780);
          if (this.kgI != null)
          {
            this.kgI.dismiss();
            localObject.sendEmptyMessage(0);
          }
          GMTrace.o(7620882595840L, 56780);
        }
      }, 1500L);
      GMTrace.o(7627056611328L, 56826);
      return;
    }
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    GMTrace.i(7627325046784L, 56828);
    int i = com.tencent.mm.sdk.platformtools.bg.m(paramObject, 0);
    w.d("MicroMsg.ContactWidgetFloatBottle", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    ap.AS();
    if ((paramm != c.xi()) || (i <= 0))
    {
      w.e("MicroMsg.ContactWidgetFloatBottle", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
      GMTrace.o(7627325046784L, 56828);
      return;
    }
    if ((i != 40) && (i != 34) && (i != 7))
    {
      GMTrace.o(7627325046784L, 56828);
      return;
    }
    ahi();
    GMTrace.o(7627325046784L, 56828);
  }
  
  public final boolean a(f paramf, x paramx, boolean paramBoolean, int paramInt)
  {
    boolean bool = false;
    GMTrace.i(7626788175872L, 56824);
    if (paramf != null) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      Assert.assertTrue(paramBoolean);
      paramBoolean = bool;
      if (paramx != null) {
        paramBoolean = true;
      }
      Assert.assertTrue(paramBoolean);
      Assert.assertTrue(com.tencent.mm.x.o.ft(paramx.field_username));
      ap.AS();
      c.xi().a(this);
      this.jqN = paramx;
      this.ilZ = paramf;
      paramf.addPreferencesFromResource(R.o.fhp);
      paramx = paramf.UM("contact_info_header_helper");
      if (paramx != null) {
        this.kgE.put("contact_info_header_helper", paramx);
      }
      paramx = paramf.UM("contact_info_goto_floatbottle");
      if (paramx != null) {
        this.kgE.put("contact_info_goto_floatbottle", paramx);
      }
      paramx = (PreferenceCategory)paramf.UM("contact_info_floatbottle_hide_cat");
      if (paramx != null) {
        this.kgE.put("contact_info_floatbottle_hide_cat", paramx);
      }
      paramx = paramf.UM("contact_info_floatbottle_clear_data");
      if (paramx != null) {
        this.kgE.put("contact_info_floatbottle_clear_data", paramx);
      }
      paramx = (PreferenceCategory)paramf.UM("contact_info_floatbottle_hide_cat2");
      if (paramx != null) {
        this.kgE.put("contact_info_floatbottle_hide_cat2", paramx);
      }
      paramx = (PreferenceCategory)paramf.UM("contact_info_floatbottle_hide_cat3");
      if (paramx != null) {
        this.kgE.put("contact_info_floatbottle_hide_cat3", paramx);
      }
      paramx = paramf.UM("contact_info_floatbottle_install");
      if (paramx != null) {
        this.kgE.put("contact_info_floatbottle_install", paramx);
      }
      paramf = paramf.UM("contact_info_floatbottle_uninstall");
      if (paramf != null) {
        this.kgE.put("contact_info_floatbottle_uninstall", paramf);
      }
      ahi();
      GMTrace.o(7626788175872L, 56824);
      return true;
    }
  }
  
  public final boolean ahj()
  {
    GMTrace.i(7627190829056L, 56827);
    ap.AS();
    c.xi().b(this);
    com.tencent.mm.plugin.bottle.a.ifN.pt();
    GMTrace.o(7627190829056L, 56827);
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(7627459264512L, 56829);
    GMTrace.o(7627459264512L, 56829);
  }
  
  public final boolean tk(String paramString)
  {
    GMTrace.i(7626653958144L, 56823);
    w.d("MicroMsg.ContactWidgetFloatBottle", "handleEvent : key = " + paramString);
    if (com.tencent.mm.sdk.platformtools.bg.mY(paramString).length() <= 0)
    {
      GMTrace.o(7626653958144L, 56823);
      return false;
    }
    if (paramString.equals("contact_info_goto_floatbottle"))
    {
      paramString = com.tencent.mm.x.bg.BF();
      if ((com.tencent.mm.sdk.platformtools.bg.a(Integer.valueOf(paramString.gbM), 0) <= 0) || (com.tencent.mm.sdk.platformtools.bg.mZ(paramString.getProvince()))) {
        this.context.startActivity(new Intent(this.context, BottleWizardStep1.class));
      }
      for (;;)
      {
        GMTrace.o(7626653958144L, 56823);
        return true;
        this.context.startActivity(new Intent(this.context, BottleBeachUI.class));
      }
    }
    if (paramString.equals("contact_info_floatbottle_clear_data"))
    {
      com.tencent.mm.ui.base.h.a(this.context, this.context.getString(R.l.dMj), "", this.context.getString(R.l.duQ), this.context.getString(R.l.duP), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7614037491712L, 56729);
          i.agY();
          GMTrace.o(7614037491712L, 56729);
        }
      }, null);
      GMTrace.o(7626653958144L, 56823);
      return true;
    }
    if (paramString.equals("contact_info_floatbottle_install"))
    {
      f(this.context, true);
      GMTrace.o(7626653958144L, 56823);
      return true;
    }
    if (paramString.equals("contact_info_floatbottle_uninstall"))
    {
      com.tencent.mm.ui.base.h.a(this.context, this.context.getString(R.l.eIo), "", this.context.getString(R.l.duQ), this.context.getString(R.l.duP), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7604910686208L, 56661);
          e.f(e.this.context, false);
          GMTrace.o(7604910686208L, 56661);
        }
      }, null);
      GMTrace.o(7626653958144L, 56823);
      return true;
    }
    w.e("MicroMsg.ContactWidgetFloatBottle", "handleEvent : unExpected key = " + paramString);
    GMTrace.o(7626653958144L, 56823);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */