package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.au.n;
import com.tencent.mm.g.b.af;
import com.tencent.mm.k.e;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.base.q;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.ay;
import com.tencent.mm.x.ay.a;
import com.tencent.mm.x.c;
import java.util.Timer;
import java.util.TimerTask;
import junit.framework.Assert;

public final class j
  implements com.tencent.mm.pluginsdk.d.a, m.b
{
  public static boolean kgc;
  public Context context;
  private f ilZ;
  private x jqN;
  
  static
  {
    GMTrace.i(6821481807872L, 50824);
    kgc = false;
    GMTrace.o(6821481807872L, 50824);
  }
  
  public j(Context paramContext)
  {
    GMTrace.i(6819736977408L, 50811);
    this.context = paramContext;
    GMTrace.o(6819736977408L, 50811);
  }
  
  private void ahi()
  {
    boolean bool4 = true;
    GMTrace.i(6820139630592L, 50814);
    boolean bool1;
    int i;
    boolean bool2;
    label62:
    Object localObject;
    label113:
    boolean bool3;
    if ((com.tencent.mm.x.m.zQ() & 0x10) == 0)
    {
      bool1 = true;
      i = com.tencent.mm.x.m.zJ();
      if (com.tencent.mm.x.m.Am()) {
        break label295;
      }
      if ((i & 0x4000) != 0)
      {
        ap.AS();
        c.xi().set(7, Integer.valueOf(i & 0xBFFF));
      }
      bool2 = false;
      localObject = (HelperHeaderPreference)this.ilZ.UM("contact_info_header_helper");
      ((HelperHeaderPreference)localObject).ab(this.jqN.field_username, this.jqN.vq(), this.context.getString(R.l.dNg));
      if (!bool1) {
        break label313;
      }
      i = 1;
      ((HelperHeaderPreference)localObject).lm(i);
      this.ilZ.aZ("contact_info_medianote_install", bool1);
      localObject = this.ilZ;
      if (bool1) {
        break label318;
      }
      bool3 = true;
      label144:
      ((f)localObject).aZ("contact_info_medianote_view", bool3);
      if ((!bool1) || (com.tencent.mm.x.m.Am())) {
        break label347;
      }
      if (bg.getInt(com.tencent.mm.k.g.uz().getValue("BindQQSwitch"), 1) != 1) {
        break label324;
      }
      bool3 = true;
      label184:
      w.i("MicroMsg.ContactWidgetMediaNote", "summerqq BindQQSwitch off");
    }
    for (;;)
    {
      localObject = this.ilZ;
      if (!bool3)
      {
        bool3 = true;
        label205:
        ((f)localObject).aZ("contact_info_medianote_sync_to_qqmail", bool3);
        localObject = this.ilZ;
        if (bool1) {
          break label336;
        }
        bool3 = true;
        label229:
        ((f)localObject).aZ("contact_info_medianote_clear_data", bool3);
        localObject = this.ilZ;
        if (bool1) {
          break label342;
        }
      }
      label295:
      label313:
      label318:
      label324:
      label336:
      label342:
      for (bool1 = bool4;; bool1 = false)
      {
        ((f)localObject).aZ("contact_info_medianote_uninstall", bool1);
        ((CheckBoxPreference)this.ilZ.UM("contact_info_medianote_sync_to_qqmail")).vNl = bool2;
        GMTrace.o(6820139630592L, 50814);
        return;
        bool1 = false;
        break;
        if ((i & 0x4000) != 0)
        {
          bool2 = true;
          break label62;
        }
        bool2 = false;
        break label62;
        i = 0;
        break label113;
        bool3 = false;
        break label144;
        bool3 = false;
        break label184;
        bool3 = false;
        break label205;
        bool3 = false;
        break label229;
      }
      label347:
      bool3 = bool1;
    }
  }
  
  public static void cX(Context paramContext)
  {
    GMTrace.i(16033918222336L, 119462);
    kgc = false;
    paramContext.getString(R.l.dxm);
    ay.a("medianote", new ay.a()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(6800275406848L, 50666);
        j.kgc = true;
        GMTrace.o(6800275406848L, 50666);
      }
    }
    {
      public final void Bl()
      {
        GMTrace.i(6757594169344L, 50348);
        if (this.khm != null) {
          this.khm.dismiss();
        }
        GMTrace.o(6757594169344L, 50348);
      }
      
      public final boolean Bm()
      {
        GMTrace.i(6757459951616L, 50347);
        boolean bool = j.kgc;
        GMTrace.o(6757459951616L, 50347);
        return bool;
      }
    });
    ap.AS();
    c.yQ().SU("medianote");
    GMTrace.o(16033918222336L, 119462);
  }
  
  public static void f(final Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(6820273848320L, 50815);
    if (paramBoolean) {}
    for (Object localObject = paramContext.getString(R.l.eIl);; localObject = paramContext.getString(R.l.eIs))
    {
      paramContext.getString(R.l.dxm);
      localObject = com.tencent.mm.ui.base.h.a(paramContext, (String)localObject, true, null);
      paramContext = new ae()
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          GMTrace.i(6806046769152L, 50709);
          if (this.kgG) {
            j.gB(true);
          }
          int i = com.tencent.mm.x.m.zQ();
          if (this.kgG) {
            i &= 0xFFFFFFEF;
          }
          for (;;)
          {
            ap.AS();
            c.xi().set(34, Integer.valueOf(i));
            ap.AS();
            c.yK().b(new n("", "", "", "", "", "", "", "", i, "", ""));
            if (!this.kgG) {
              j.cX(paramContext);
            }
            if (this.kgH != null) {
              this.kgH.a(null, null);
            }
            GMTrace.o(6806046769152L, 50709);
            return;
            i |= 0x10;
          }
        }
      };
      new Timer().schedule(new TimerTask()
      {
        public final void run()
        {
          GMTrace.i(6739877429248L, 50216);
          if (this.kgI != null)
          {
            this.kgI.dismiss();
            paramContext.sendEmptyMessage(0);
          }
          GMTrace.o(6739877429248L, 50216);
        }
      }, 1500L);
      GMTrace.o(6820273848320L, 50815);
      return;
    }
  }
  
  static void gB(boolean paramBoolean)
  {
    GMTrace.i(6820810719232L, 50819);
    int i = com.tencent.mm.x.m.zJ();
    if (paramBoolean)
    {
      i |= 0x4000;
      ap.AS();
      c.xi().set(7, Integer.valueOf(i));
      if (!paramBoolean) {
        break label86;
      }
    }
    label86:
    for (i = 1;; i = 2)
    {
      ap.AS();
      c.yK().b(new com.tencent.mm.au.g(13, i));
      GMTrace.o(6820810719232L, 50819);
      return;
      i &= 0xBFFF;
      break;
    }
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    GMTrace.i(6820542283776L, 50817);
    int i = bg.m(paramObject, 0);
    w.d("MicroMsg.ContactWidgetMediaNote", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    ap.AS();
    if ((paramm != c.xi()) || (i <= 0))
    {
      w.e("MicroMsg.ContactWidgetMediaNote", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
      GMTrace.o(6820542283776L, 50817);
      return;
    }
    if ((i != 40) && (i != 34) && (i != 7))
    {
      GMTrace.o(6820542283776L, 50817);
      return;
    }
    ahi();
    GMTrace.o(6820542283776L, 50817);
  }
  
  public final boolean a(f paramf, x paramx, boolean paramBoolean, int paramInt)
  {
    boolean bool = false;
    GMTrace.i(6820005412864L, 50813);
    if (paramf != null) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      Assert.assertTrue(paramBoolean);
      paramBoolean = bool;
      if (paramx != null) {
        paramBoolean = true;
      }
      Assert.assertTrue(paramBoolean);
      Assert.assertTrue(com.tencent.mm.x.o.fC(paramx.field_username));
      ap.AS();
      c.xi().a(this);
      this.jqN = paramx;
      this.ilZ = paramf;
      paramf.addPreferencesFromResource(R.o.fhu);
      ahi();
      GMTrace.o(6820005412864L, 50813);
      return true;
    }
  }
  
  public final boolean ahj()
  {
    GMTrace.i(6820408066048L, 50816);
    ap.AS();
    c.xi().b(this);
    com.tencent.mm.plugin.profile.a.ifN.pt();
    GMTrace.o(6820408066048L, 50816);
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6820676501504L, 50818);
    GMTrace.o(6820676501504L, 50818);
  }
  
  public final boolean tk(String paramString)
  {
    GMTrace.i(6819871195136L, 50812);
    w.d("MicroMsg.ContactWidgetMediaNote", "handleEvent : key = " + paramString);
    if (bg.mY(paramString).length() <= 0)
    {
      GMTrace.o(6819871195136L, 50812);
      return false;
    }
    if (paramString.equals("contact_info_medianote_view"))
    {
      paramString = new Intent();
      paramString.putExtra("Chat_User", "medianote");
      com.tencent.mm.plugin.profile.a.ifM.e(paramString, this.context);
      com.tencent.mm.plugin.profile.a.ifN.pt();
      GMTrace.o(6819871195136L, 50812);
      return true;
    }
    if (paramString.equals("contact_info_medianote_sync_to_qqmail"))
    {
      if (!com.tencent.mm.x.m.Am())
      {
        com.tencent.mm.ui.base.h.a(this.context, R.l.dNf, R.l.dNe, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(6773968732160L, 50470);
            com.tencent.mm.plugin.profile.a.ifM.h(new Intent(), j.this.context);
            GMTrace.o(6773968732160L, 50470);
          }
        }, null);
        ahi();
      }
      for (;;)
      {
        GMTrace.o(6819871195136L, 50812);
        return true;
        gB(((CheckBoxPreference)this.ilZ.UM(paramString)).isChecked());
      }
    }
    if (paramString.equals("contact_info_medianote_clear_data"))
    {
      com.tencent.mm.ui.base.h.a(this.context, this.context.getString(R.l.dMj), "", this.context.getString(R.l.duQ), this.context.getString(R.l.duP), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6799738535936L, 50662);
          j.cX(j.this.context);
          GMTrace.o(6799738535936L, 50662);
        }
      }, null);
      GMTrace.o(6819871195136L, 50812);
      return true;
    }
    if (paramString.equals("contact_info_medianote_install"))
    {
      f(this.context, true);
      GMTrace.o(6819871195136L, 50812);
      return true;
    }
    if (paramString.equals("contact_info_medianote_uninstall"))
    {
      com.tencent.mm.ui.base.h.a(this.context, this.context.getString(R.l.eIo), "", this.context.getString(R.l.duQ), this.context.getString(R.l.duP), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6805509898240L, 50705);
          j.f(j.this.context, false);
          GMTrace.o(6805509898240L, 50705);
        }
      }, null);
      GMTrace.o(6819871195136L, 50812);
      return true;
    }
    w.e("MicroMsg.ContactWidgetMediaNote", "handleEvent : unExpected key = " + paramString);
    GMTrace.o(6819871195136L, 50812);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */