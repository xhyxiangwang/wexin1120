package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
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
import com.tencent.mm.plugin.freewifi.d.a;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.l;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.m.a;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.pluginsdk.i.c;
import com.tencent.mm.protocal.c.dy;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.pb.common.c.h;

public class FreeWifiCopyPwdUI
  extends MMActivity
{
  public static int mgt;
  private String appId;
  private int fjU;
  private String fvF;
  private ae ham;
  private Intent intent;
  private int meC;
  private int mgu;
  private int mgv;
  protected TextView mgw;
  protected TextView mgx;
  protected TextView mgy;
  private String ssid;
  
  static
  {
    GMTrace.i(7232053837824L, 53883);
    mgt = 111;
    GMTrace.o(7232053837824L, 53883);
  }
  
  public FreeWifiCopyPwdUI()
  {
    GMTrace.i(7230309007360L, 53870);
    this.mgu = 1;
    this.mgv = 2;
    this.ham = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(7184540762112L, 53529);
        paramAnonymousMessage = (FreeWifiCopyPwdUI.b)paramAnonymousMessage.obj;
        if (paramAnonymousMessage.mgE == FreeWifiCopyPwdUI.b(FreeWifiCopyPwdUI.this))
        {
          FreeWifiCopyPwdUI.a(FreeWifiCopyPwdUI.this, paramAnonymousMessage.data);
          GMTrace.o(7184540762112L, 53529);
          return;
        }
        FreeWifiCopyPwdUI.b(FreeWifiCopyPwdUI.this, paramAnonymousMessage.data);
        GMTrace.o(7184540762112L, 53529);
      }
    };
    GMTrace.o(7230309007360L, 53870);
  }
  
  private void goBack()
  {
    GMTrace.i(7230845878272L, 53874);
    l.r(d.azX(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
    Object localObject = com.tencent.mm.plugin.freewifi.k.azB();
    ((k.a)localObject).fvF = this.fvF;
    ((k.a)localObject).mbX = m.B(this.intent);
    ((k.a)localObject).mbZ = k.b.mcJ.mcK;
    ((k.a)localObject).mca = k.b.mcJ.name;
    ((k.a)localObject).fIC = m.E(this.intent);
    ((k.a)localObject).mbY = m.D(this.intent);
    ((k.a)localObject).result = 0;
    ((k.a)localObject).kCB = "";
    ((k.a)localObject).azD().b(this.intent, true).azC();
    localObject = new Intent();
    com.tencent.mm.plugin.freewifi.g.ifM.i((Intent)localObject, this);
    finish();
    GMTrace.o(7230845878272L, 53874);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7230980096000L, 53875);
    int i = R.i.cVd;
    GMTrace.o(7230980096000L, 53875);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(7230577442816L, 53872);
    if ((paramInt1 == mgt) && (m.azI()) && (!h.isNullOrEmpty(this.ssid)) && (this.ssid.equals(d.azY())))
    {
      w.i("MicroMsg.FreeWifi.FreeWifiCopyPwdUI", "sessionKey=%s, step=%d, desc=connect ssid succeeded. ", new Object[] { m.B(this.intent), Integer.valueOf(m.C(this.intent)) });
      paramIntent = com.tencent.mm.plugin.freewifi.k.azB();
      paramIntent.ssid = this.ssid;
      paramIntent.bssid = m.xN("MicroMsg.FreeWifi.FreeWifiCopyPwdUI");
      paramIntent.fvG = m.xO("MicroMsg.FreeWifi.FreeWifiCopyPwdUI");
      paramIntent.fvF = this.fvF;
      paramIntent.mbW = this.appId;
      paramIntent.mbX = m.B(this.intent);
      paramIntent.mbY = m.D(this.intent);
      paramIntent.mbZ = k.b.mck.mcK;
      paramIntent.mca = k.b.mck.name;
      paramIntent.result = 0;
      paramIntent.fIC = m.E(this.intent);
      paramIntent.azD().azC();
      m.a(this.intent, this.fvF, this.meC, this.fjU, new m.a()
      {
        public final void h(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.k paramAnonymousk)
        {
          GMTrace.i(7174205997056L, 53452);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            if (!(paramAnonymousk instanceof a))
            {
              GMTrace.o(7174205997056L, 53452);
              return;
            }
            paramAnonymousString = ((a)paramAnonymousk).aAs();
            if (paramAnonymousString != null)
            {
              w.i("MicroMsg.FreeWifi.FreeWifiCopyPwdUI", "backPageInfo appid: %s, nickName: %s, userName: %s, finishActionCode: %d, finishUrl: %s, signature: %s, qingHuaiPageUrl: %s", new Object[] { paramAnonymousString.mGI, paramAnonymousString.jYc, paramAnonymousString.jWW, Integer.valueOf(paramAnonymousString.txV), paramAnonymousString.txW, paramAnonymousString.huM, paramAnonymousString.txX });
              FreeWifiCopyPwdUI.a(FreeWifiCopyPwdUI.this, new FreeWifiCopyPwdUI.b(FreeWifiCopyPwdUI.this, FreeWifiCopyPwdUI.b(FreeWifiCopyPwdUI.this), paramAnonymousString));
              GMTrace.o(7174205997056L, 53452);
              return;
            }
            w.i("MicroMsg.FreeWifi.FreeWifiCopyPwdUI", "backPageInfo is null");
            paramAnonymousString = FreeWifiCopyPwdUI.this;
            paramAnonymousk = FreeWifiCopyPwdUI.this;
            paramAnonymousInt1 = FreeWifiCopyPwdUI.c(FreeWifiCopyPwdUI.this);
            localObject = new FreeWifiCopyPwdUI.a();
            ((FreeWifiCopyPwdUI.a)localObject).mgD = m.a(FreeWifiCopyPwdUI.d(FreeWifiCopyPwdUI.this), k.b.mcm, 21);
            FreeWifiCopyPwdUI.a(paramAnonymousString, new FreeWifiCopyPwdUI.b(paramAnonymousk, paramAnonymousInt1, localObject));
            GMTrace.o(7174205997056L, 53452);
            return;
          }
          if ((m.cd(paramAnonymousInt1, paramAnonymousInt2)) && (!m.xJ(paramAnonymousString)))
          {
            paramAnonymousk = FreeWifiCopyPwdUI.this;
            localObject = FreeWifiCopyPwdUI.this;
            paramAnonymousInt1 = FreeWifiCopyPwdUI.c(FreeWifiCopyPwdUI.this);
            FreeWifiCopyPwdUI.a locala = new FreeWifiCopyPwdUI.a();
            locala.text = paramAnonymousString;
            locala.mgD = m.a(FreeWifiCopyPwdUI.d(FreeWifiCopyPwdUI.this), k.b.mcm, paramAnonymousInt2);
            FreeWifiCopyPwdUI.a(paramAnonymousk, new FreeWifiCopyPwdUI.b((FreeWifiCopyPwdUI)localObject, paramAnonymousInt1, locala));
            GMTrace.o(7174205997056L, 53452);
            return;
          }
          paramAnonymousString = FreeWifiCopyPwdUI.this;
          paramAnonymousk = FreeWifiCopyPwdUI.this;
          paramAnonymousInt1 = FreeWifiCopyPwdUI.c(FreeWifiCopyPwdUI.this);
          Object localObject = new FreeWifiCopyPwdUI.a();
          ((FreeWifiCopyPwdUI.a)localObject).mgD = m.a(FreeWifiCopyPwdUI.d(FreeWifiCopyPwdUI.this), k.b.mcm, paramAnonymousInt2);
          FreeWifiCopyPwdUI.a(paramAnonymousString, new FreeWifiCopyPwdUI.b(paramAnonymousk, paramAnonymousInt1, localObject));
          GMTrace.o(7174205997056L, 53452);
        }
      }, "MicroMsg.FreeWifi.FreeWifiCopyPwdUI");
    }
    GMTrace.o(7230577442816L, 53872);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7230443225088L, 53871);
    super.onCreate(paramBundle);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7233261797376L, 53892);
        FreeWifiCopyPwdUI.a(FreeWifiCopyPwdUI.this);
        GMTrace.o(7233261797376L, 53892);
        return true;
      }
    });
    this.intent = getIntent();
    this.ssid = getIntent().getStringExtra("free_wifi_ssid");
    this.fvF = this.intent.getStringExtra("free_wifi_ap_key");
    this.appId = this.intent.getStringExtra("free_wifi_appid");
    this.fjU = this.intent.getIntExtra("free_wifi_channel_id", 0);
    this.meC = this.intent.getIntExtra("ConstantsFreeWifi.FREE_WIFI_PROTOCOL_NUMBER", 0);
    ((TextView)findViewById(R.h.bKf)).setText(this.ssid);
    paramBundle = getIntent().getStringExtra("free_wifi_passowrd");
    c.a(this.vov.voR, "wifi password", paramBundle);
    ((Button)findViewById(R.h.bJP)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7201586413568L, 53656);
        paramAnonymousView = new Intent("android.settings.WIFI_SETTINGS");
        FreeWifiCopyPwdUI.this.startActivityForResult(paramAnonymousView, FreeWifiCopyPwdUI.mgt);
        GMTrace.o(7201586413568L, 53656);
      }
    });
    this.mgw = ((TextView)findViewById(R.h.bJR));
    this.mgx = ((TextView)findViewById(R.h.bJQ));
    this.mgy = ((TextView)findViewById(R.h.bJS));
    paramBundle = d.azX();
    String str = getIntent().getStringExtra("free_wifi_ap_key");
    int i = getIntent().getIntExtra("free_wifi_protocol_type", 0);
    com.tencent.mm.plugin.report.service.g.paX.i(12651, new Object[] { Integer.valueOf(6), paramBundle, Integer.valueOf(0), str, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i) });
    GMTrace.o(7230443225088L, 53871);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7230711660544L, 53873);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      GMTrace.o(7230711660544L, 53873);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(7230711660544L, 53873);
    return bool;
  }
  
  public static final class a
  {
    public static a mgB;
    public int mgC;
    public String mgD;
    public String text;
    
    static
    {
      GMTrace.i(7186419810304L, 53543);
      mgB = new a();
      GMTrace.o(7186419810304L, 53543);
    }
    
    public a()
    {
      GMTrace.i(7185748721664L, 53538);
      GMTrace.o(7185748721664L, 53538);
    }
  }
  
  public final class b
  {
    Object data;
    int mgE;
    
    public b(int paramInt, Object paramObject)
    {
      GMTrace.i(7196486139904L, 53618);
      this.mgE = paramInt;
      this.data = paramObject;
      GMTrace.o(7196486139904L, 53618);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreeWifiCopyPwdUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */