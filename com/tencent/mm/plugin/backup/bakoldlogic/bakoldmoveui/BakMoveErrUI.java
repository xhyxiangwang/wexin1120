package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmoveui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bi.d;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;

public class BakMoveErrUI
  extends MMActivity
{
  private Button jUL;
  private TextView jUM;
  private TextView jUN;
  
  public BakMoveErrUI()
  {
    GMTrace.i(14805691793408L, 110311);
    GMTrace.o(14805691793408L, 110311);
  }
  
  public final void MH()
  {
    GMTrace.i(14805960228864L, 110313);
    this.jUM = ((TextView)findViewById(R.h.bEP));
    this.jUN = ((TextView)findViewById(R.h.bEO));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(14796564987904L, 110243);
        BakMoveErrUI.this.finish();
        GMTrace.o(14796564987904L, 110243);
        return true;
      }
    });
    this.jUL = ((Button)findViewById(R.h.bjX));
    this.jUL.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(14804215398400L, 110300);
        BakMoveErrUI.this.finish();
        GMTrace.o(14804215398400L, 110300);
      }
    });
    if (getIntent().getBooleanExtra("battery_not_enough", false))
    {
      w.i("MicroMsg.BakMoveErrUI", "GET_BATTERY_ERR");
      this.jUM.setText(R.l.dAK);
      this.jUN.setText(R.l.dAL);
      g.paX.i(11787, new Object[] { Integer.valueOf(4) });
      g.paX.a(103L, 3L, 1L, false);
      GMTrace.o(14805960228864L, 110313);
      return;
    }
    if (getIntent().getBooleanExtra("getConnectInfoErr", false))
    {
      w.i("MicroMsg.BakMoveErrUI", "GET_CONNECTINFO_ERR");
      this.jUM.setText(R.l.dAM);
      this.jUN.setText(R.l.dAN);
      g.paX.i(11787, new Object[] { Integer.valueOf(1) });
      g.paX.a(103L, 0L, 1L, false);
      GMTrace.o(14805960228864L, 110313);
      return;
    }
    if (getIntent().getBooleanExtra("wifiNameDifferentErr", false))
    {
      w.i("MicroMsg.BakMoveErrUI", "WIFINAME_DIFFERENT_ERR");
      this.jUM.setText(R.l.dAU);
      this.jUN.setText(getString(R.l.dAV, new Object[] { getIntent().getStringExtra("WifiName") }));
      g.paX.i(11787, new Object[] { Integer.valueOf(2) });
      g.paX.a(103L, 1L, 1L, false);
      GMTrace.o(14805960228864L, 110313);
      return;
    }
    if (getIntent().getBooleanExtra("complexWIFIErr", false))
    {
      w.i("MicroMsg.BakMoveErrUI", "COMPLEX_WIFI_ERR");
      this.jUM.setText(R.l.dAS);
      this.jUN.setText(R.l.dAT);
      this.jUL.setText(R.l.dAJ);
      this.jUL.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14807570841600L, 110325);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("title", BakMoveErrUI.this.getString(R.l.dAW));
          paramAnonymousView.putExtra("rawUrl", BakMoveErrUI.this.getString(R.l.dBp));
          paramAnonymousView.putExtra("showShare", false);
          paramAnonymousView.putExtra("neverGetA8Key", true);
          d.b(BakMoveErrUI.this, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
          GMTrace.o(14807570841600L, 110325);
        }
      });
      g.paX.i(11787, new Object[] { Integer.valueOf(3) });
      g.paX.a(103L, 2L, 1L, false);
      GMTrace.o(14805960228864L, 110313);
      return;
    }
    String[] arrayOfString;
    if (getIntent().getIntExtra("err_type", 0) == 10012)
    {
      this.jUM.setText(R.l.dAQ);
      arrayOfString = getIntent().getStringExtra("err_info").split(",");
    }
    label697:
    for (;;)
    {
      try
      {
        long l1 = bg.getLong(arrayOfString[0], 0L) / 1024L / 1024L;
        if (l1 != 0L) {
          break label697;
        }
        l1 = 1L;
        long l3 = bg.getLong(arrayOfString[1], 0L) / 1024L / 1024L;
        long l2 = l3;
        if (l3 == 0L) {
          l2 = 1L;
        }
        this.jUN.setText(getString(R.l.dAR, new Object[] { Long.valueOf(l1), Long.valueOf(l2) }));
        w.i("MicroMsg.BakMoveErrUI", "GET_CONNECTINFO_ERR, size:%d, need:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2) });
      }
      catch (Exception localException)
      {
        this.jUN.setVisibility(8);
        continue;
      }
      g.paX.i(11787, new Object[] { Integer.valueOf(5) });
      g.paX.a(103L, 4L, 1L, false);
      GMTrace.o(14805960228864L, 110313);
      return;
      w.i("MicroMsg.BakMoveErrUI", "DISCONNECT");
      this.jUM.setText(R.l.dAO);
      this.jUN.setText(R.l.dAP);
      GMTrace.o(14805960228864L, 110313);
      return;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(14806094446592L, 110314);
    int i = R.i.cMX;
    GMTrace.o(14806094446592L, 110314);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(14805826011136L, 110312);
    super.onCreate(paramBundle);
    MH();
    GMTrace.o(14805826011136L, 110312);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/bakoldmoveui/BakMoveErrUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */