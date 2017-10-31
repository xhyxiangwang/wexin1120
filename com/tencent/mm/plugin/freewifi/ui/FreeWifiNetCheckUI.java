package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.net.wifi.ScanResult;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.e;
import com.tencent.mm.plugin.freewifi.d.a;
import com.tencent.mm.plugin.freewifi.d.c;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.plugin.freewifi.model.h.a;
import com.tencent.mm.plugin.freewifi.model.h.b;
import com.tencent.mm.protocal.c.aya;
import com.tencent.mm.protocal.c.cj;
import com.tencent.mm.protocal.c.tv;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FreeWifiNetCheckUI
  extends MMActivity
{
  private String amo;
  private int fIC;
  private aj fnS;
  private Intent intent;
  private b mhD;
  ImageView mhp;
  private final int mhs;
  private final int mht;
  private int[] mhv;
  ae mhw;
  private int scene;
  
  public FreeWifiNetCheckUI()
  {
    GMTrace.i(7189104164864L, 53563);
    this.mhs = 1;
    this.mht = 2;
    this.mhv = new int[] { R.g.aYR, R.g.aYS, R.g.aYT, R.g.aYU, R.g.aYV };
    this.mhw = new ae()
    {
      int i;
      
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(7206149816320L, 53690);
        if (paramAnonymousMessage.what == 1)
        {
          if (this.i >= FreeWifiNetCheckUI.a(FreeWifiNetCheckUI.this).length) {
            this.i = 0;
          }
          FreeWifiNetCheckUI.this.mhp.setImageResource(FreeWifiNetCheckUI.a(FreeWifiNetCheckUI.this)[this.i]);
          this.i += 1;
        }
        for (;;)
        {
          super.handleMessage(paramAnonymousMessage);
          GMTrace.o(7206149816320L, 53690);
          return;
          if (paramAnonymousMessage.what == 2) {
            FreeWifiNetCheckUI.this.mhp.setImageResource(FreeWifiNetCheckUI.a(FreeWifiNetCheckUI.this)[(FreeWifiNetCheckUI.a(FreeWifiNetCheckUI.this).length - 1)]);
          }
        }
      }
    };
    GMTrace.o(7189104164864L, 53563);
  }
  
  private void aAZ()
  {
    GMTrace.i(7189506818048L, 53566);
    if (bg.mZ(this.amo))
    {
      w.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "get key failed");
      finish();
      GMTrace.o(7189506818048L, 53566);
      return;
    }
    this.mhD = new b(this, this.amo, this.fIC);
    w.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=FreeWifiNetCheckUI.connectFreewifi, desc=base params are ready and it will connets wifi.apKey=%s, channel=%d", new Object[] { m.B(getIntent()), Integer.valueOf(m.C(this.intent)), this.amo, Integer.valueOf(this.fIC) });
    b localb = this.mhD;
    if (bg.mZ(localb.fvF))
    {
      w.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "get key failed");
      localb.activity.finish();
    }
    localb.activity.getIntent().putExtra("free_wifi_url", localb.fvF);
    localb.activity.getIntent().putExtra("free_wifi_ap_key", localb.fvF);
    if (bg.mZ(localb.fvF))
    {
      w.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "ap key is null");
      localb.activity.finish();
      GMTrace.o(7189506818048L, 53566);
      return;
    }
    w.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=FreeWifiConnector.getApInfo, desc=it starts net request [getApInfo] for retrieving protocol type and frontpage info. apKey=%s, channel=%d", new Object[] { m.B(localb.intent), Integer.valueOf(m.C(localb.intent)), localb.fvF, Integer.valueOf(localb.fIC) });
    k.a locala = com.tencent.mm.plugin.freewifi.k.azB();
    locala.fvF = localb.fvF;
    locala.mbX = m.B(localb.intent);
    locala.mbZ = k.b.mch.mcK;
    locala.mca = k.b.mch.name;
    locala.fIC = localb.fIC;
    locala.mbY = m.D(localb.intent);
    locala.azD().b(localb.intent, false).azC();
    new a(localb.fvF, localb.fIC, m.B(localb.intent)).u(localb.activity).b(new b.1(localb));
    GMTrace.o(7189506818048L, 53566);
  }
  
  public void finish()
  {
    GMTrace.i(7189238382592L, 53564);
    if (this.fnS != null) {
      this.fnS.MM();
    }
    this.mhw.sendEmptyMessage(2);
    super.finish();
    GMTrace.o(7189238382592L, 53564);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7189641035776L, 53567);
    int i = R.i.cVh;
    GMTrace.o(7189641035776L, 53567);
    return i;
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    GMTrace.i(7189372600320L, 53565);
    super.onCreate(paramBundle);
    oC(R.l.ebo);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7226550910976L, 53842);
        FreeWifiNetCheckUI.this.finish();
        GMTrace.o(7226550910976L, 53842);
        return true;
      }
    });
    this.intent = getIntent();
    m.A(this.intent);
    this.amo = getIntent().getStringExtra("free_wifi_ap_key");
    this.scene = getIntent().getIntExtra("free_wifi_source", 1);
    w.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=FreeWifiNetCheckUI.onCreate, desc=it goes into black loading ui and starts to connect. get qrcode key = %s, current connected ssid = %s", new Object[] { m.B(this.intent), Integer.valueOf(m.C(this.intent)), this.amo, d.azV() });
    this.mhp = ((ImageView)findViewById(R.h.bJH));
    this.fnS = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(7163737014272L, 53374);
        FreeWifiNetCheckUI.this.mhw.sendEmptyMessage(1);
        GMTrace.o(7163737014272L, 53374);
        return true;
      }
    }, true);
    this.fnS.w(200L, 200L);
    switch (this.scene)
    {
    case 2: 
    case 3: 
    default: 
      w.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "unkown scene, just finish");
      finish();
    }
    for (;;)
    {
      w.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=FreeWifiNetCheckUI.handleRequstByScene, desc=it decides the channel. channel=%d", new Object[] { m.B(getIntent()), Integer.valueOf(m.C(this.intent)), Integer.valueOf(this.fIC) });
      GMTrace.o(7189372600320L, 53565);
      return;
      paramBundle = getIntent().getStringExtra("free_wifi_jsapi_param_type");
      if ("1".equals(paramBundle))
      {
        getIntent().putExtra("free_wifi_channel_id", 9);
        this.fIC = 9;
      }
      for (;;)
      {
        paramBundle = getIntent().getStringExtra("free_wifi_jsapi_param_type");
        if ((!paramBundle.equals("0")) || (!bg.mZ(this.amo))) {
          break label417;
        }
        w.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "get key fail");
        finish();
        break;
        if ("0".equals(paramBundle))
        {
          getIntent().putExtra("free_wifi_channel_id", 8);
          this.fIC = 8;
        }
        else
        {
          getIntent().putExtra("free_wifi_channel_id", 4);
          this.fIC = 4;
        }
      }
      label417:
      if (paramBundle.equals("0"))
      {
        aAZ();
      }
      else if (paramBundle.equals("1"))
      {
        paramBundle = getIntent().getStringExtra("free_wifi_jsapi_param_username");
        if (!d.isWifiEnabled()) {
          d.azS();
        }
        h.b.mdX.a(new h.a()
        {
          public final void aC(List<ScanResult> paramAnonymousList)
          {
            GMTrace.i(7157697216512L, 53329);
            if ((paramAnonymousList == null) || (paramAnonymousList.size() == 0))
            {
              FreeWifiNetCheckUI.this.finish();
              FreeWifiNetCheckUI.c(FreeWifiNetCheckUI.this);
              GMTrace.o(7157697216512L, 53329);
              return;
            }
            aya localaya = new aya();
            localaya.uso = new LinkedList();
            paramAnonymousList = paramAnonymousList.iterator();
            while (paramAnonymousList.hasNext())
            {
              ScanResult localScanResult = (ScanResult)paramAnonymousList.next();
              if (localScanResult != null)
              {
                cj localcj = new cj();
                localcj.mac = localScanResult.BSSID;
                localcj.tvM = localScanResult.level;
                localcj.ssid = localScanResult.SSID;
                localaya.uso.add(localcj);
              }
            }
            paramAnonymousList = com.tencent.mm.plugin.freewifi.k.azB();
            paramAnonymousList.mbX = m.B(FreeWifiNetCheckUI.b(FreeWifiNetCheckUI.this));
            paramAnonymousList.mbZ = k.b.mcr.mcK;
            paramAnonymousList.mca = k.b.mcr.name;
            paramAnonymousList.fIC = 9;
            paramAnonymousList.azD().azC();
            new com.tencent.mm.plugin.freewifi.d.k(paramBundle, localaya, 9, m.B(FreeWifiNetCheckUI.this.getIntent())).b(new e()
            {
              public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, com.tencent.mm.ac.k paramAnonymous2k)
              {
                GMTrace.i(7162126401536L, 53362);
                paramAnonymous2String = ((com.tencent.mm.plugin.freewifi.d.k)paramAnonymous2k).aAz();
                if (!bg.mZ(paramAnonymous2String))
                {
                  FreeWifiNetCheckUI.a(FreeWifiNetCheckUI.this, paramAnonymous2String);
                  FreeWifiNetCheckUI.this.getIntent().putExtra("free_wifi_ap_key", paramAnonymous2String);
                  FreeWifiNetCheckUI.d(FreeWifiNetCheckUI.this);
                  FreeWifiNetCheckUI.e(FreeWifiNetCheckUI.this);
                  GMTrace.o(7162126401536L, 53362);
                  return;
                }
                FreeWifiNetCheckUI.this.finish();
                FreeWifiNetCheckUI.c(FreeWifiNetCheckUI.this);
                GMTrace.o(7162126401536L, 53362);
              }
            });
            GMTrace.o(7157697216512L, 53329);
          }
        });
      }
      else
      {
        w.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "undefined jsapi type");
        finish();
        continue;
        this.fIC = getIntent().getIntExtra("free_wifi_channel_id", 1);
        if (bg.mZ(this.amo))
        {
          w.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "get key failed");
          finish();
        }
        else
        {
          aAZ();
          continue;
          getIntent().putExtra("free_wifi_channel_id", 2);
          this.fIC = 2;
          if (bg.mZ(this.amo))
          {
            w.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "get key failed");
            finish();
          }
          else
          {
            paramBundle = null;
            final Object localObject2 = "";
            try
            {
              localObject1 = Uri.parse(this.amo);
              paramBundle = (Bundle)localObject1;
              localObject3 = ((Uri)localObject1).getQueryParameter("q");
              localObject2 = localObject3;
              paramBundle = (Bundle)localObject1;
            }
            catch (Exception localException)
            {
              for (;;)
              {
                final Object localObject1;
                Object localObject3;
                finish();
              }
              "_test".equals(localObject2);
              aAZ();
            }
            if ("pc".equalsIgnoreCase((String)localObject2))
            {
              localObject1 = paramBundle.getQueryParameter("appid");
              localObject2 = paramBundle.getQueryParameter("shopid");
              paramBundle = paramBundle.getQueryParameter("ticket");
              m.d(getIntent(), paramBundle);
              localObject3 = com.tencent.mm.plugin.freewifi.k.azB();
              ((k.a)localObject3).mbV = ((String)localObject2);
              ((k.a)localObject3).mbW = ((String)localObject1);
              ((k.a)localObject3).mbX = paramBundle;
              ((k.a)localObject3).mbZ = k.b.mcE.mcK;
              ((k.a)localObject3).mca = k.b.mcE.name;
              ((k.a)localObject3).azD().azC();
              w.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=handlePcRequest, desc=It starts NetSceneGetPcFrontPage.shopid=%s, appid=%s, ticket=%s", new Object[] { m.B(getIntent()), Integer.valueOf(m.C(getIntent())), localObject2, localObject1, paramBundle });
              new com.tencent.mm.plugin.freewifi.d.h((String)localObject1, Integer.valueOf((String)localObject2).intValue(), paramBundle).b(new e()
              {
                public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.k paramAnonymousk)
                {
                  GMTrace.i(7172461166592L, 53439);
                  if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
                  {
                    paramAnonymousString = ((com.tencent.mm.plugin.freewifi.d.h)paramAnonymousk).aAp();
                    if (paramAnonymousString != null)
                    {
                      paramAnonymousk = FreeWifiNetCheckUI.this.getIntent();
                      paramAnonymousk.putExtra("free_wifi_appid", paramAnonymousString.mGI);
                      paramAnonymousk.putExtra("free_wifi_head_img_url", paramAnonymousString.mDH);
                      paramAnonymousk.putExtra("free_wifi_welcome_msg", paramAnonymousString.tRR);
                      paramAnonymousk.putExtra("free_wifi_welcome_sub_title", paramAnonymousString.mDi);
                      paramAnonymousk.putExtra("free_wifi_privacy_url", paramAnonymousString.tRS);
                      paramAnonymousk.putExtra("free_wifi_app_nickname", paramAnonymousString.jYc);
                      paramAnonymousk.putExtra("ConstantsFreeWifi.FREE_WIFI_PC_ENCRYPTED_SHOPID", localObject2);
                      paramAnonymousk.putExtra("ConstantsFreeWifi.FREE_WIFI_PC_TICKET", paramBundle);
                      paramAnonymousk.setClass(FreeWifiNetCheckUI.this, FreeWifiPcUI.class);
                      FreeWifiNetCheckUI.this.finish();
                      FreeWifiNetCheckUI.this.startActivity(paramAnonymousk);
                    }
                  }
                  for (;;)
                  {
                    paramAnonymousString = com.tencent.mm.plugin.freewifi.k.azB();
                    paramAnonymousString.mbV = localObject2;
                    paramAnonymousString.mbW = localObject1;
                    paramAnonymousString.mbX = paramBundle;
                    paramAnonymousString.mbZ = k.b.mcF.mcK;
                    paramAnonymousString.mca = k.b.mcF.name;
                    paramAnonymousString.result = paramAnonymousInt2;
                    paramAnonymousString.azD().azC();
                    w.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=handlePcRequest, desc=NetSceneGetPcFrontPage returns.errcode=%d", new Object[] { m.B(FreeWifiNetCheckUI.this.getIntent()), Integer.valueOf(m.C(FreeWifiNetCheckUI.this.getIntent())), Integer.valueOf(paramAnonymousInt2) });
                    GMTrace.o(7172461166592L, 53439);
                    return;
                    if ((m.cd(paramAnonymousInt1, paramAnonymousInt2)) && (!m.xJ(paramAnonymousString))) {
                      FreeWifiNetCheckUI.a(FreeWifiNetCheckUI.this, paramAnonymousString + "(" + m.a(m.D(FreeWifiNetCheckUI.b(FreeWifiNetCheckUI.this)), k.b.mcF, paramAnonymousInt2) + ")", "");
                    } else {
                      FreeWifiNetCheckUI.a(FreeWifiNetCheckUI.this, FreeWifiNetCheckUI.this.getString(R.l.eaQ), FreeWifiNetCheckUI.this.getString(R.l.eaR));
                    }
                  }
                }
              });
            }
            else
            {
              continue;
              getIntent().putExtra("free_wifi_channel_id", 10);
              this.fIC = 10;
              if (bg.mZ(this.amo))
              {
                w.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "get key failed");
                finish();
              }
              else
              {
                aAZ();
              }
            }
          }
        }
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7189775253504L, 53568);
    super.onDestroy();
    if (this.mhD != null) {
      this.mhD = null;
    }
    this.fnS.MM();
    GMTrace.o(7189775253504L, 53568);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7189909471232L, 53569);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      finish();
      GMTrace.o(7189909471232L, 53569);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(7189909471232L, 53569);
    return bool;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */