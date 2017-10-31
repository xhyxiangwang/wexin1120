package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.ui.MMActivity;

public class FreeWifiErrorUI
  extends MMActivity
{
  private ImageView mgF;
  private TextView mgG;
  private TextView mgH;
  private TextView mgI;
  
  public FreeWifiErrorUI()
  {
    GMTrace.i(7177561440256L, 53477);
    GMTrace.o(7177561440256L, 53477);
  }
  
  protected final int Qb()
  {
    GMTrace.i(7177829875712L, 53479);
    GMTrace.o(7177829875712L, 53479);
    return 1;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7177964093440L, 53480);
    int i = R.i.bJX;
    GMTrace.o(7177964093440L, 53480);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7177695657984L, 53478);
    super.onCreate(paramBundle);
    oC(R.l.ebo);
    this.mgF = ((ImageView)findViewById(R.h.bJX));
    if (getIntent().getIntExtra("free_wifi_show_detail_error", 0) == 1) {
      this.mgF.setImageResource(R.g.aYP);
    }
    this.mgG = ((TextView)findViewById(R.h.bJW));
    this.mgH = ((TextView)findViewById(R.h.bJU));
    this.mgI = ((TextView)findViewById(R.h.bJV));
    paramBundle = getIntent().getStringExtra("free_wifi_error_ui_error_msg");
    String str1 = getIntent().getStringExtra("free_wifi_error_ui_error_msg_detail1");
    String str2 = getIntent().getStringExtra("free_wifi_error_ui_error_msg_detail12");
    if (!m.xJ(paramBundle)) {
      this.mgG.setText(paramBundle);
    }
    if (!m.xJ(str1)) {
      this.mgH.setText(str1);
    }
    if (!m.xJ(str2)) {
      this.mgI.setText(str2);
    }
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7187761987584L, 53553);
        FreeWifiErrorUI.this.finish();
        GMTrace.o(7187761987584L, 53553);
        return true;
      }
    });
    GMTrace.o(7177695657984L, 53478);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreeWifiErrorUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */