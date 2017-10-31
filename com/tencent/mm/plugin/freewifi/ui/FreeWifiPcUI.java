package com.tencent.mm.plugin.freewifi.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
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
import com.tencent.mm.ac.e;
import com.tencent.mm.bi.d;
import com.tencent.mm.plugin.freewifi.d.l;
import com.tencent.mm.plugin.freewifi.g;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.q;
import com.tencent.mm.ui.p;

public class FreeWifiPcUI
  extends MMActivity
{
  private String appId;
  private String fxT;
  private Button jWv;
  private String meD;
  private Button mgO;
  private String mgU;
  private TextView mhJ;
  private int mhK;
  private q mhL;
  
  public FreeWifiPcUI()
  {
    GMTrace.i(7199036276736L, 53637);
    this.mhL = null;
    GMTrace.o(7199036276736L, 53637);
  }
  
  private void goBack()
  {
    GMTrace.i(7199573147648L, 53641);
    Intent localIntent = new Intent();
    g.ifM.i(localIntent, this);
    finish();
    GMTrace.o(7199573147648L, 53641);
  }
  
  protected final int Qb()
  {
    GMTrace.i(7199304712192L, 53639);
    GMTrace.o(7199304712192L, 53639);
    return 1;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7199707365376L, 53642);
    int i = R.i.cVj;
    GMTrace.o(7199707365376L, 53642);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7199170494464L, 53638);
    super.onCreate(paramBundle);
    oC(R.l.ebo);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7197291446272L, 53624);
        FreeWifiPcUI.a(FreeWifiPcUI.this);
        GMTrace.o(7197291446272L, 53624);
        return true;
      }
    });
    this.appId = getIntent().getStringExtra("free_wifi_appid");
    this.mhK = getIntent().getIntExtra("ConstantsFreeWifi.FREE_WIFI_PC_ENCRYPTED_SHOPID", 0);
    this.fxT = getIntent().getStringExtra("ConstantsFreeWifi.FREE_WIFI_PC_TICKET");
    this.meD = getIntent().getStringExtra("free_wifi_app_nickname");
    this.mgU = getIntent().getStringExtra("free_wifi_privacy_url");
    this.mhJ = ((TextView)findViewById(R.h.bKc));
    this.jWv = ((Button)findViewById(R.h.bKd));
    this.mhJ.setText("由" + this.meD + "提供");
    this.jWv.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(final View paramAnonymousView)
      {
        GMTrace.i(7233530232832L, 53894);
        FreeWifiPcUI.b(FreeWifiPcUI.this).setClickable(false);
        paramAnonymousView = new aj(new aj.a()
        {
          public final boolean pO()
          {
            GMTrace.i(7179306270720L, 53490);
            FreeWifiPcUI.a(FreeWifiPcUI.this, h.a(FreeWifiPcUI.this.vov.voR, FreeWifiPcUI.this.getString(R.l.dLP), true, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymous3DialogInterface)
              {
                GMTrace.i(7205612945408L, 53686);
                GMTrace.o(7205612945408L, 53686);
              }
            }));
            GMTrace.o(7179306270720L, 53490);
            return true;
          }
        }, false);
        paramAnonymousView.w(2000L, 2000L);
        k.a locala = com.tencent.mm.plugin.freewifi.k.azB();
        locala.mbV = String.valueOf(FreeWifiPcUI.e(FreeWifiPcUI.this));
        locala.mbW = FreeWifiPcUI.d(FreeWifiPcUI.this);
        locala.mbX = FreeWifiPcUI.c(FreeWifiPcUI.this);
        locala.mbZ = k.b.mcG.mcK;
        locala.mca = k.b.mcG.name;
        locala.azD().azC();
        w.i("MicroMsg.FreeWifi.FreeWifiPcUI", "sessionKey=%s, step=%d, method=setOnClickListener, desc=It starts NetSceneSetPcLoginUserInfo.shopid=%d, appid=%s, ticket=%s", new Object[] { m.B(FreeWifiPcUI.this.getIntent()), Integer.valueOf(m.C(FreeWifiPcUI.this.getIntent())), Integer.valueOf(FreeWifiPcUI.e(FreeWifiPcUI.this)), FreeWifiPcUI.d(FreeWifiPcUI.this), FreeWifiPcUI.c(FreeWifiPcUI.this) });
        new l(FreeWifiPcUI.d(FreeWifiPcUI.this), FreeWifiPcUI.e(FreeWifiPcUI.this), FreeWifiPcUI.c(FreeWifiPcUI.this)).b(new e()
        {
          public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, com.tencent.mm.ac.k paramAnonymous2k)
          {
            GMTrace.i(7217826758656L, 53777);
            paramAnonymousView.MM();
            if ((paramAnonymous2Int1 == 0) && (paramAnonymous2Int2 == 0)) {
              FreeWifiPcUI.this.finish();
            }
            for (;;)
            {
              paramAnonymous2String = com.tencent.mm.plugin.freewifi.k.azB();
              paramAnonymous2String.mbV = String.valueOf(FreeWifiPcUI.e(FreeWifiPcUI.this));
              paramAnonymous2String.mbW = FreeWifiPcUI.d(FreeWifiPcUI.this);
              paramAnonymous2String.mbX = FreeWifiPcUI.c(FreeWifiPcUI.this);
              paramAnonymous2String.mbZ = k.b.mcH.mcK;
              paramAnonymous2String.mca = k.b.mcH.name;
              paramAnonymous2String.result = paramAnonymous2Int2;
              paramAnonymous2String.azD().azC();
              w.i("MicroMsg.FreeWifi.FreeWifiPcUI", "sessionKey=%s, step=%d, method=setOnClickListener, desc=NetSceneSetPcLoginUserInfo returns.shopid=%d, appid=%s, ticket=%s", new Object[] { m.B(FreeWifiPcUI.this.getIntent()), Integer.valueOf(m.C(FreeWifiPcUI.this.getIntent())), Integer.valueOf(FreeWifiPcUI.e(FreeWifiPcUI.this)), FreeWifiPcUI.d(FreeWifiPcUI.this), FreeWifiPcUI.c(FreeWifiPcUI.this) });
              GMTrace.o(7217826758656L, 53777);
              return;
              if ((m.cd(paramAnonymous2Int1, paramAnonymous2Int2)) && (!m.xJ(paramAnonymous2String))) {
                FreeWifiPcUI.a(FreeWifiPcUI.this, paramAnonymous2String + "(" + m.a(m.D(FreeWifiPcUI.this.getIntent()), k.b.mcH, paramAnonymous2Int2) + ")", "");
              } else {
                FreeWifiPcUI.a(FreeWifiPcUI.this, FreeWifiPcUI.this.getString(R.l.eaS), FreeWifiPcUI.this.getString(R.l.eaT));
              }
            }
          }
        });
        GMTrace.o(7233530232832L, 53894);
      }
    });
    this.mgO = ((Button)findViewById(R.h.bKe));
    this.mgO.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7177427222528L, 53476);
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("rawUrl", FreeWifiPcUI.f(FreeWifiPcUI.this));
        paramAnonymousView.putExtra("showShare", false);
        paramAnonymousView.putExtra("show_bottom", false);
        d.b(FreeWifiPcUI.this.vov.voR, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
        GMTrace.o(7177427222528L, 53476);
      }
    });
    GMTrace.o(7199170494464L, 53638);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7199438929920L, 53640);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      GMTrace.o(7199438929920L, 53640);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(7199438929920L, 53640);
    return bool;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreeWifiPcUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */