package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.wallet_core.id_verify.model.Profession;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceTitleCategory;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.p;

public class WalletSelectProfessionUI
  extends MMPreference
{
  private f ilZ;
  private Profession[] rKQ;
  
  public WalletSelectProfessionUI()
  {
    GMTrace.i(6922145103872L, 51574);
    this.rKQ = null;
    GMTrace.o(6922145103872L, 51574);
  }
  
  public final int QD()
  {
    GMTrace.i(6922413539328L, 51576);
    GMTrace.o(6922413539328L, 51576);
    return -1;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(6922547757056L, 51577);
    if (paramPreference.iay.startsWith("index_"))
    {
      paramf = paramPreference.iay.split("_");
      if (paramf.length != 2) {
        break label87;
      }
      int i = bg.getInt(paramf[1], 0);
      paramf = this.rKQ[i];
      paramPreference = new Intent();
      paramPreference.putExtra("key_select_profession", paramf);
      setResult(-1, paramPreference);
    }
    for (;;)
    {
      finish();
      GMTrace.o(6922547757056L, 51577);
      return true;
      label87:
      w.w("MicroMsg.WalletSelectProfessionUI", "error key: %s, %s", new Object[] { paramPreference.iay, paramPreference.getTitle() });
      setResult(0);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int j = 0;
    GMTrace.i(6922279321600L, 51575);
    super.onCreate(paramBundle);
    oC(R.l.eZd);
    this.ilZ = this.vOv;
    paramBundle = new PreferenceTitleCategory(this.vov.voR);
    paramBundle.setTitle(getString(R.l.eZc));
    paramBundle.setKey("title_category");
    this.ilZ.a(paramBundle);
    paramBundle = getIntent().getParcelableArrayExtra("key_profession_list");
    int i;
    if ((paramBundle != null) && (paramBundle.length > 0))
    {
      this.rKQ = new Profession[paramBundle.length];
      i = 0;
      while (i < this.rKQ.length)
      {
        this.rKQ[i] = ((Profession)paramBundle[i]);
        i += 1;
      }
    }
    if (this.rKQ != null)
    {
      paramBundle = this.rKQ;
      int m = paramBundle.length;
      int k = 0;
      i = j;
      j = k;
      while (i < m)
      {
        Object localObject = paramBundle[i];
        if ((localObject != null) && (!bg.mZ(((Profession)localObject).rMg)))
        {
          Preference localPreference = new Preference(this.vov.voR);
          localPreference.setTitle(((Profession)localObject).rMg);
          localPreference.setKey("index_" + j);
          this.ilZ.a(localPreference);
        }
        j += 1;
        i += 1;
      }
    }
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6985093218304L, 52043);
        WalletSelectProfessionUI.this.setResult(0);
        WalletSelectProfessionUI.this.finish();
        GMTrace.o(6985093218304L, 52043);
        return true;
      }
    });
    GMTrace.o(6922279321600L, 51575);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/WalletSelectProfessionUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */