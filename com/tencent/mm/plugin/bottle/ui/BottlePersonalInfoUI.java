package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.ab.n;
import com.tencent.mm.au.g;
import com.tencent.mm.plugin.bottle.a;
import com.tencent.mm.pluginsdk.model.o;
import com.tencent.mm.pluginsdk.ui.preference.HeadImgPreference;
import com.tencent.mm.pluginsdk.ui.tools.k;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class BottlePersonalInfoUI
  extends MMPreference
  implements d.a
{
  private SharedPreferences gZW;
  private com.tencent.mm.ui.base.preference.f ilZ;
  private c kgw;
  private HashMap<Integer, Integer> kgx;
  private int status;
  
  public BottlePersonalInfoUI()
  {
    GMTrace.i(7606252863488L, 56671);
    this.kgx = new HashMap();
    GMTrace.o(7606252863488L, 56671);
  }
  
  protected final void MH()
  {
    boolean bool = true;
    GMTrace.i(7606655516672L, 56674);
    oC(R.l.eIY);
    this.ilZ = this.vOv;
    this.ilZ.addPreferencesFromResource(R.o.fhi);
    this.gZW = this.gZW;
    this.status = m.zJ();
    Object localObject;
    if (getIntent().getBooleanExtra("is_allow_set", true))
    {
      this.kgw = new c(this, this.ilZ);
      localObject = (CheckBoxPreference)this.ilZ.UM("bottle_settings_show_at_main");
      if ((this.status & 0x8000) == 0) {
        break label176;
      }
    }
    for (;;)
    {
      ((CheckBoxPreference)localObject).vNl = bool;
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(7627996135424L, 56833);
          BottlePersonalInfoUI.this.finish();
          GMTrace.o(7627996135424L, 56833);
          return true;
        }
      });
      GMTrace.o(7606655516672L, 56674);
      return;
      localObject = this.ilZ;
      ((com.tencent.mm.ui.base.preference.f)localObject).UN("settings_sex");
      ((com.tencent.mm.ui.base.preference.f)localObject).UN("settings_district");
      ((com.tencent.mm.ui.base.preference.f)localObject).UN("settings_signature");
      ((com.tencent.mm.ui.base.preference.f)localObject).UN("bottle_settings_change_avatar_alert");
      break;
      label176:
      bool = false;
    }
  }
  
  public final int QD()
  {
    GMTrace.i(7607058169856L, 56677);
    int i = R.o.fhh;
    GMTrace.o(7607058169856L, 56677);
    return i;
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    int i = 2;
    GMTrace.i(7607192387584L, 56678);
    paramf = paramPreference.iay;
    if (paramf.equals("bottle_settings_change_avatar"))
    {
      ap.AS();
      if (!com.tencent.mm.x.c.isSDCardAvailable())
      {
        com.tencent.mm.ui.base.t.fn(this);
        GMTrace.o(7607192387584L, 56678);
        return false;
      }
      k.a(this, 2, null);
      GMTrace.o(7607192387584L, 56678);
      return true;
    }
    boolean bool;
    if (paramf.equals("settings_district"))
    {
      bool = this.kgw.ahf();
      GMTrace.o(7607192387584L, 56678);
      return bool;
    }
    if (paramf.equals("settings_signature"))
    {
      bool = this.kgw.ahe();
      GMTrace.o(7607192387584L, 56678);
      return bool;
    }
    if (paramf.equals("bottle_settings_show_at_main"))
    {
      bool = this.gZW.getBoolean("bottle_settings_show_at_main", true);
      w.d("MicroMsg.BottleSettignsPersonalInfoUI", "switch change : open = " + bool + " item value = 32768 functionId = 14");
      if (bool) {}
      for (this.status |= 0x8000;; this.status &= 0xFFFF7FFF)
      {
        if (bool) {
          i = 1;
        }
        this.kgx.put(Integer.valueOf(14), Integer.valueOf(i));
        GMTrace.o(7607192387584L, 56678);
        return true;
      }
    }
    if (paramf.equals("bottle_settings_clear_data"))
    {
      com.tencent.mm.ui.base.h.a(this.vov.voR, this.vov.voR.getString(R.l.dMj), "", this.vov.voR.getString(R.l.duQ), this.vov.voR.getString(R.l.duP), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7652826415104L, 57018);
          com.tencent.mm.plugin.bottle.a.i.agY();
          GMTrace.o(7652826415104L, 57018);
        }
      }, null);
      GMTrace.o(7607192387584L, 56678);
      return true;
    }
    GMTrace.o(7607192387584L, 56678);
    return false;
  }
  
  public final void hM(String paramString)
  {
    GMTrace.i(7607460823040L, 56680);
    if ((paramString != null) && (paramString.equals(x.SA(m.zF()))))
    {
      Bitmap localBitmap = b.a(paramString, false, -1);
      paramString = localBitmap;
      if (localBitmap == null) {
        paramString = b.a(m.zF(), false, -1);
      }
      if (paramString != null) {
        break label91;
      }
      paramString = BitmapFactory.decodeResource(getResources(), R.g.aYg);
    }
    label91:
    for (;;)
    {
      ((HeadImgPreference)this.ilZ.UM("bottle_settings_change_avatar")).N(paramString);
      GMTrace.o(7607460823040L, 56680);
      return;
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(7607326605312L, 56679);
    Object localObject;
    switch (paramInt1)
    {
    default: 
      GMTrace.o(7607326605312L, 56679);
      return;
    case 3: 
      localObject = getApplicationContext();
      ap.AS();
      paramIntent = k.b((Context)localObject, paramIntent, com.tencent.mm.x.c.yV());
      if (paramIntent == null)
      {
        GMTrace.o(7607326605312L, 56679);
        return;
      }
      localObject = new Intent();
      ((Intent)localObject).putExtra("CropImageMode", 1);
      ((Intent)localObject).putExtra("CropImage_OutputPath", paramIntent);
      ((Intent)localObject).putExtra("CropImage_ImgPath", paramIntent);
      a.ifM.a(this, (Intent)localObject, 4);
      GMTrace.o(7607326605312L, 56679);
      return;
    case 2: 
      if (paramIntent == null)
      {
        GMTrace.o(7607326605312L, 56679);
        return;
      }
      localObject = getApplicationContext();
      ap.AS();
      localObject = k.b((Context)localObject, paramIntent, com.tencent.mm.x.c.yV());
      if (localObject == null)
      {
        GMTrace.o(7607326605312L, 56679);
        return;
      }
      Intent localIntent = new Intent();
      localIntent.putExtra("CropImageMode", 1);
      n.Dh();
      localIntent.putExtra("CropImage_OutputPath", com.tencent.mm.ab.d.r(x.SA(m.zF()), true));
      localIntent.putExtra("CropImage_ImgPath", (String)localObject);
      a.ifM.a(localIntent, 4, this, paramIntent);
      GMTrace.o(7607326605312L, 56679);
      return;
    }
    if (paramIntent == null)
    {
      GMTrace.o(7607326605312L, 56679);
      return;
    }
    paramIntent = paramIntent.getStringExtra("CropImage_OutputPath");
    if (paramIntent == null)
    {
      w.e("MicroMsg.BottleSettignsPersonalInfoUI", "crop picture failed");
      GMTrace.o(7607326605312L, 56679);
      return;
    }
    new o(this.vov.voR, paramIntent).b(2, null);
    GMTrace.o(7607326605312L, 56679);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7606387081216L, 56672);
    super.onCreate(paramBundle);
    n.Dh().d(this);
    MH();
    GMTrace.o(7606387081216L, 56672);
  }
  
  public void onDestroy()
  {
    GMTrace.i(7606521298944L, 56673);
    a.ifN.pt();
    n.Dh().e(this);
    super.onDestroy();
    GMTrace.o(7606521298944L, 56673);
  }
  
  public void onPause()
  {
    GMTrace.i(7606923952128L, 56676);
    c.ahd();
    ap.AS();
    com.tencent.mm.x.c.xi().set(7, Integer.valueOf(this.status));
    Iterator localIterator = this.kgx.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      int i = ((Integer)localEntry.getKey()).intValue();
      int j = ((Integer)localEntry.getValue()).intValue();
      ap.AS();
      com.tencent.mm.x.c.yK().b(new g(i, j));
      w.d("MicroMsg.BottleSettignsPersonalInfoUI", "switch  " + i + " " + j);
    }
    this.kgx.clear();
    super.onPause();
    GMTrace.o(7606923952128L, 56676);
  }
  
  public void onResume()
  {
    GMTrace.i(7606789734400L, 56675);
    HeadImgPreference localHeadImgPreference = (HeadImgPreference)this.ilZ.UM("bottle_settings_change_avatar");
    Bitmap localBitmap2 = b.a(x.SA(m.zF()), false, -1);
    Bitmap localBitmap1 = localBitmap2;
    if (localBitmap2 == null) {
      localBitmap1 = b.a(m.zF(), false, -1);
    }
    if (localBitmap1 != null) {
      localHeadImgPreference.N(localBitmap1);
    }
    localHeadImgPreference.sPf = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7623432732672L, 56799);
        paramAnonymousView = x.SA(m.zF());
        new com.tencent.mm.pluginsdk.ui.f(BottlePersonalInfoUI.this.vov.voR, paramAnonymousView).bHS();
        GMTrace.o(7623432732672L, 56799);
      }
    };
    if (this.kgw != null) {
      this.kgw.update();
    }
    super.onResume();
    GMTrace.o(7606789734400L, 56675);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/BottlePersonalInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */