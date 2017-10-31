package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.av.b;
import com.tencent.mm.av.n;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.pluginsdk.ui.tools.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;

public class SettingsChattingBackgroundUI
  extends MMPreference
{
  private f ilZ;
  private boolean prZ;
  private String username;
  
  public SettingsChattingBackgroundUI()
  {
    GMTrace.i(4622190116864L, 34438);
    GMTrace.o(4622190116864L, 34438);
  }
  
  private void ahh()
  {
    GMTrace.i(4623129640960L, 34445);
    if (!k.c(this, e.gKA, "microMsg." + System.currentTimeMillis() + ".jpg", 2)) {
      Toast.makeText(this, getString(R.l.eFk), 1).show();
    }
    GMTrace.o(4623129640960L, 34445);
  }
  
  private String hf(boolean paramBoolean)
  {
    GMTrace.i(4623398076416L, 34447);
    com.tencent.mm.av.t.Kg();
    if (this.prZ)
    {
      str = n.w("default", paramBoolean);
      GMTrace.o(4623398076416L, 34447);
      return str;
    }
    String str = n.w(this.username, paramBoolean);
    GMTrace.o(4623398076416L, 34447);
    return str;
  }
  
  protected final void MH()
  {
    GMTrace.i(4622861205504L, 34443);
    oC(R.l.eGP);
    this.ilZ = this.vOv;
    this.prZ = getIntent().getBooleanExtra("isApplyToAll", true);
    if (!this.prZ)
    {
      Preference localPreference = this.ilZ.UM("settings_chatting_bg_apply_to_all");
      if (localPreference != null) {
        this.ilZ.c(localPreference);
      }
    }
    this.username = getIntent().getStringExtra("username");
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4613197529088L, 34371);
        SettingsChattingBackgroundUI.this.aKl();
        SettingsChattingBackgroundUI.this.finish();
        GMTrace.o(4613197529088L, 34371);
        return true;
      }
    });
    GMTrace.o(4622861205504L, 34443);
  }
  
  public final int QD()
  {
    GMTrace.i(4622324334592L, 34439);
    int i = R.o.fie;
    GMTrace.o(4622324334592L, 34439);
    return i;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(4622995423232L, 34444);
    paramf = paramPreference.iay;
    w.i("MicroMsg.SettingsChattingBackgroundUI", paramf + " item has been clicked!");
    if (paramf.equals("settings_chatting_bg_select_bg"))
    {
      paramf = new Intent();
      paramf.setClass(this, SettingsSelectBgUI.class);
      paramf.putExtra("isApplyToAll", this.prZ);
      paramf.putExtra("username", this.username);
      startActivityForResult(paramf, 3);
      GMTrace.o(4622995423232L, 34444);
      return true;
    }
    if (paramf.equals("settings_chatting_bg_select_from_album"))
    {
      k.a(this, 1, null);
      GMTrace.o(4622995423232L, 34444);
      return true;
    }
    if (paramf.equals("settings_chatting_bg_take_photo"))
    {
      boolean bool = com.tencent.mm.pluginsdk.h.a.a(this.vov.voR, "android.permission.CAMERA", 16, "", "");
      w.i("MicroMsg.SettingsChattingBackgroundUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bOd(), this.vov.voR });
      if (!bool)
      {
        GMTrace.o(4622995423232L, 34444);
        return false;
      }
      ahh();
      GMTrace.o(4622995423232L, 34444);
      return true;
    }
    if (paramf.equals("settings_chatting_bg_apply_to_all"))
    {
      h.a(this.vov.voR, getString(R.l.eGQ), "", new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(4592259563520L, 34215);
          SettingsChattingBackgroundUI.bcK();
          GMTrace.o(4592259563520L, 34215);
        }
      }, null);
      GMTrace.o(4622995423232L, 34444);
      return true;
    }
    GMTrace.o(4622995423232L, 34444);
    return false;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(4622726987776L, 34442);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    }
    do
    {
      for (;;)
      {
        if (!this.prZ)
        {
          setResult(-1);
          finish();
        }
        GMTrace.o(4622726987776L, 34442);
        return;
        if (paramIntent == null)
        {
          GMTrace.o(4622726987776L, 34442);
          return;
        }
        Object localObject = new Intent();
        ((Intent)localObject).putExtra("CropImageMode", 2);
        ((Intent)localObject).putExtra("CropImage_bg_vertical", hf(true));
        ((Intent)localObject).putExtra("CropImage_bg_horizontal", hf(false));
        i locali = com.tencent.mm.plugin.setting.a.ifM;
        ap.AS();
        locali.a(this, paramIntent, (Intent)localObject, c.yV(), 4, null);
        GMTrace.o(4622726987776L, 34442);
        return;
        localObject = getApplicationContext();
        ap.AS();
        paramIntent = k.b((Context)localObject, paramIntent, c.yV());
        if (paramIntent == null)
        {
          GMTrace.o(4622726987776L, 34442);
          return;
        }
        localObject = new Intent();
        ((Intent)localObject).putExtra("CropImageMode", 2);
        ((Intent)localObject).putExtra("CropImage_ImgPath", paramIntent);
        ((Intent)localObject).putExtra("CropImage_bg_vertical", hf(true));
        ((Intent)localObject).putExtra("CropImage_bg_horizontal", hf(false));
        com.tencent.mm.plugin.setting.a.ifM.a(this, (Intent)localObject, 4);
        GMTrace.o(4622726987776L, 34442);
        return;
        if (paramInt2 == -1)
        {
          ap.AS();
          c.xi().set(66820, Integer.valueOf(-1));
          g.paX.i(10198, new Object[] { Integer.valueOf(-1) });
          w.i("MicroMsg.SettingsChattingBackgroundUI", "set chating bg id:%d", new Object[] { Integer.valueOf(-1) });
          if (this.prZ)
          {
            ap.AS();
            c.xi().set(12311, Integer.valueOf(-1));
            com.tencent.mm.av.t.Kg().gv(1);
          }
          else
          {
            paramIntent = com.tencent.mm.av.t.Kh();
            localObject = paramIntent.ks(this.username);
            if (localObject == null)
            {
              localObject = new com.tencent.mm.av.a();
              ((com.tencent.mm.av.a)localObject).username = this.username;
              ((com.tencent.mm.av.a)localObject).hHX = -1;
              paramIntent.a((com.tencent.mm.av.a)localObject);
            }
            else
            {
              ((com.tencent.mm.av.a)localObject).hHX = -1;
              paramIntent.b((com.tencent.mm.av.a)localObject);
            }
          }
        }
      }
    } while (paramInt2 == -1);
    GMTrace.o(4622726987776L, 34442);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4622458552320L, 34440);
    super.onCreate(paramBundle);
    MH();
    GMTrace.o(4622458552320L, 34440);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(4622592770048L, 34441);
    super.onDestroy();
    GMTrace.o(4622592770048L, 34441);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(4623263858688L, 34446);
    w.i("MicroMsg.SettingsChattingBackgroundUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(4623263858688L, 34446);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        ahh();
        GMTrace.o(4623263858688L, 34446);
        return;
      }
      h.a(this, getString(R.l.etQ), getString(R.l.etW), getString(R.l.ejv), getString(R.l.cancel), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(4671045369856L, 34802);
          SettingsChattingBackgroundUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(4671045369856L, 34802);
        }
      }, null);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsChattingBackgroundUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */