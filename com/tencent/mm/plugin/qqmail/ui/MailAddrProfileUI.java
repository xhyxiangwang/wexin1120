package com.tencent.mm.plugin.qqmail.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public class MailAddrProfileUI
  extends MMPreference
{
  private f ilZ;
  private String name;
  private String nke;
  private boolean oJD;
  
  public MailAddrProfileUI()
  {
    GMTrace.i(5546279174144L, 41323);
    GMTrace.o(5546279174144L, 41323);
  }
  
  protected final void MH()
  {
    GMTrace.i(5546681827328L, 41326);
    oC(R.l.egM);
    this.ilZ = this.vOv;
    ((KeyValuePreference)this.ilZ.UM("mail_receiver_info_name")).setSummary(this.name);
    ((KeyValuePreference)this.ilZ.UM("mail_receiver_info_addr")).setSummary(getIntent().getStringExtra("addr"));
    Preference localPreference = this.ilZ.UM("mail_compose_btn");
    if (!this.oJD) {
      this.ilZ.c(localPreference);
    }
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5563861696512L, 41454);
        MailAddrProfileUI.this.aKl();
        MailAddrProfileUI.this.finish();
        GMTrace.o(5563861696512L, 41454);
        return true;
      }
    });
    GMTrace.o(5546681827328L, 41326);
  }
  
  public final int QD()
  {
    GMTrace.i(5546413391872L, 41324);
    int i = R.o.fhO;
    GMTrace.o(5546413391872L, 41324);
    return i;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(5546816045056L, 41327);
    if (paramPreference.iay.equals("mail_compose_btn"))
    {
      paramf = new Intent(this, ComposeUI.class);
      paramf.putExtra("composeType", 4);
      paramf.putExtra("toList", new String[] { this.name + " " + this.nke });
      startActivity(paramf);
      finish();
    }
    GMTrace.o(5546816045056L, 41327);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5546547609600L, 41325);
    super.onCreate(paramBundle);
    this.name = getIntent().getStringExtra("name");
    this.nke = getIntent().getStringExtra("addr");
    this.oJD = getIntent().getBooleanExtra("can_compose", false);
    MH();
    GMTrace.o(5546547609600L, 41325);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/ui/MailAddrProfileUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */