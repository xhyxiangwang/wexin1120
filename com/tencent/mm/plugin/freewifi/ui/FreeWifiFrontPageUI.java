package com.tencent.mm.plugin.freewifi.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.m;
import com.tencent.mm.an.a.a.c.a;
import com.tencent.mm.an.n;
import com.tencent.mm.compatible.d.t;
import com.tencent.mm.plugin.freewifi.e.f;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.l;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.protocal.c.dy;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.e.b;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FreeWifiFrontPageUI
  extends MMActivity
{
  protected String className;
  protected int cyK;
  protected String fKY;
  protected int fjU;
  protected String fvF;
  private final com.tencent.mm.an.a.a.c hCC;
  private ae ham;
  protected Intent intent;
  protected String meB;
  protected int meC;
  protected String meD;
  protected ImageView mgK;
  protected TextView mgL;
  protected TextView mgM;
  protected Button mgN;
  protected Button mgO;
  protected Dialog mgP;
  protected View mgQ;
  protected String mgR;
  protected String mgS;
  protected String mgT;
  protected String mgU;
  protected com.tencent.mm.plugin.freewifi.e.a mgV;
  private Lock mgW;
  private d mgX;
  protected TextView mgw;
  protected TextView mgx;
  protected TextView mgy;
  protected String ssid;
  
  public FreeWifiFrontPageUI()
  {
    GMTrace.i(7214471315456L, 53752);
    this.ham = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(7176621916160L, 53470);
        paramAnonymousMessage = (FreeWifiFrontPageUI.c)paramAnonymousMessage.obj;
        switch (FreeWifiFrontPageUI.8.mgZ[paramAnonymousMessage.mgX.ordinal()])
        {
        }
        for (;;)
        {
          GMTrace.o(7176621916160L, 53470);
          return;
          FreeWifiFrontPageUI.this.aAS();
          GMTrace.o(7176621916160L, 53470);
          return;
          FreeWifiFrontPageUI.this.aAT();
          GMTrace.o(7176621916160L, 53470);
          return;
          FreeWifiFrontPageUI.this.aX(paramAnonymousMessage.data);
          GMTrace.o(7176621916160L, 53470);
          return;
          FreeWifiFrontPageUI.this.aY(paramAnonymousMessage.data);
        }
      }
    };
    c.a locala = new c.a();
    locala.hCN = true;
    locala.hCO = true;
    locala.hDe = R.g.aYQ;
    locala.hDm = true;
    locala.hDn = 0.0F;
    this.hCC = locala.Jk();
    GMTrace.o(7214471315456L, 53752);
  }
  
  private d aAQ()
  {
    GMTrace.i(7214605533184L, 53753);
    try
    {
      this.mgW.lock();
      d locald = this.mgX;
      this.mgW.unlock();
      GMTrace.o(7214605533184L, 53753);
      return locald;
    }
    finally
    {
      this.mgW.unlock();
    }
  }
  
  private void aAR()
  {
    GMTrace.i(7215142404096L, 53757);
    l.q(com.tencent.mm.plugin.freewifi.model.d.azX(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
    d locald = aAQ();
    w.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, class=%s, desc=User click the connect button and starts the connect wifi process. uiState=%s", new Object[] { m.B(getIntent()), Integer.valueOf(m.C(getIntent())), this.className, locald.name() });
    if ((aAQ() == d.mhc) || (aAQ() == d.mhe))
    {
      boolean bool = this.intent.getBooleanExtra("ConstantsFreeWifi.FREE_WIFI_SHOULD_BIND_PHONE", false);
      int i = m.azH();
      w.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, class=%s, desc=It makes a decision whether to bind phone number. shoudBindPhone=%b, userPhoneState=%d(0 means no phone number. 1 means having a china phone number. 2 means having a foreign number.)", new Object[] { m.B(getIntent()), Integer.valueOf(m.C(getIntent())), this.className, Boolean.valueOf(bool), Integer.valueOf(i) });
      if ((bool) && (i == 1) && (this.meC != 33))
      {
        com.tencent.mm.ui.base.h.a(this, R.l.eaI, R.l.eaJ, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(7179574706176L, 53492);
            m.cv(FreeWifiFrontPageUI.this);
            GMTrace.o(7179574706176L, 53492);
          }
        }, null);
        GMTrace.o(7215142404096L, 53757);
        return;
      }
      this.mgX = d.mhd;
      aAT();
      this.mgV.connect();
    }
    GMTrace.o(7215142404096L, 53757);
  }
  
  private void goBack()
  {
    GMTrace.i(7216216145920L, 53765);
    l.r(com.tencent.mm.plugin.freewifi.model.d.azX(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
    Object localObject = k.azB();
    ((k.a)localObject).fvF = this.fvF;
    ((k.a)localObject).mbX = m.B(this.intent);
    ((k.a)localObject).mbZ = k.b.mcx.mcK;
    ((k.a)localObject).mca = k.b.mcx.name;
    ((k.a)localObject).fIC = m.E(this.intent);
    ((k.a)localObject).mbY = m.D(this.intent);
    ((k.a)localObject).result = 0;
    ((k.a)localObject).kCB = "";
    ((k.a)localObject).azD().b(this.intent, true).azC();
    localObject = new Intent();
    com.tencent.mm.plugin.freewifi.g.ifM.i((Intent)localObject, this);
    finish();
    GMTrace.o(7216216145920L, 53765);
  }
  
  public final void MH()
  {
    GMTrace.i(7215008186368L, 53756);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7193801785344L, 53598);
        FreeWifiFrontPageUI.a(FreeWifiFrontPageUI.this);
        GMTrace.o(7193801785344L, 53598);
        return true;
      }
    });
    if (this.mgP != null) {
      this.mgP.dismiss();
    }
    this.mgW = new ReentrantLock();
    this.className = getClass().getSimpleName();
    this.intent = getIntent();
    this.ssid = getIntent().getStringExtra("free_wifi_ssid");
    this.meB = getIntent().getStringExtra("free_wifi_url");
    this.fvF = getIntent().getStringExtra("free_wifi_ap_key");
    this.cyK = getIntent().getIntExtra("free_wifi_source", 1);
    this.fjU = getIntent().getIntExtra("free_wifi_channel_id", 0);
    this.meC = this.intent.getIntExtra("ConstantsFreeWifi.FREE_WIFI_PROTOCOL_NUMBER", 0);
    this.fKY = getIntent().getStringExtra("free_wifi_appid");
    this.mgR = getIntent().getStringExtra("free_wifi_head_img_url");
    this.mgS = getIntent().getStringExtra("free_wifi_welcome_msg");
    this.mgT = getIntent().getStringExtra("free_wifi_welcome_sub_title");
    this.mgU = getIntent().getStringExtra("free_wifi_privacy_url");
    this.meD = getIntent().getStringExtra("free_wifi_app_nickname");
    w.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, method=%s.initView, desc=Initializing the view. ssid=%s, fullUrl=%s, apKey=%s, source=%d, channel=%d, protocolNumber=%d, appid=%s, headImgUrl=%s, welcomeMsg=%s, privacyUrl=%s", new Object[] { m.B(getIntent()), Integer.valueOf(m.C(getIntent())), this.className, this.ssid, this.meB, this.fvF, Integer.valueOf(this.cyK), Integer.valueOf(this.fjU), Integer.valueOf(this.meC), this.fKY, this.mgR, this.mgS, this.mgU });
    this.mgQ = findViewById(R.h.cDH);
    this.mgK = ((ImageView)findViewById(R.h.bJH));
    this.mgL = ((TextView)findViewById(R.h.bKt));
    this.mgM = ((TextView)findViewById(R.h.bKg));
    this.mgw = ((TextView)findViewById(R.h.bJO));
    this.mgx = ((TextView)findViewById(R.h.bJM));
    this.mgy = ((TextView)findViewById(R.h.bJN));
    this.mgN = ((Button)findViewById(R.h.bxl));
    this.mgN.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7176353480704L, 53468);
        FreeWifiFrontPageUI.b(FreeWifiFrontPageUI.this);
        GMTrace.o(7176353480704L, 53468);
      }
    });
    this.mgO = ((Button)findViewById(R.h.cDI));
    this.mgO.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7205881380864L, 53688);
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("rawUrl", FreeWifiFrontPageUI.this.mgU);
        paramAnonymousView.putExtra("showShare", false);
        paramAnonymousView.putExtra("show_bottom", false);
        com.tencent.mm.bi.d.b(FreeWifiFrontPageUI.this.vov.voR, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
        GMTrace.o(7205881380864L, 53688);
      }
    });
    if (bg.mZ(this.ssid))
    {
      this.mgM.setText(getString(R.l.ebm));
      this.mgN.setVisibility(4);
    }
    rV(getString(R.l.ebo));
    a(d.mhc, null);
    GMTrace.o(7215008186368L, 53756);
  }
  
  protected final int Qb()
  {
    GMTrace.i(7216350363648L, 53766);
    GMTrace.o(7216350363648L, 53766);
    return 1;
  }
  
  public final void a(d paramd, Object paramObject)
  {
    GMTrace.i(7214739750912L, 53754);
    try
    {
      this.mgW.lock();
      this.mgX = paramd;
      Message localMessage = Message.obtain();
      localMessage.obj = new c(paramd, paramObject);
      this.ham.sendMessage(localMessage);
      this.mgW.unlock();
      GMTrace.o(7214739750912L, 53754);
      return;
    }
    finally
    {
      this.mgW.unlock();
    }
  }
  
  protected final void aAS()
  {
    GMTrace.i(7215276621824L, 53758);
    this.mgw.setVisibility(4);
    if (this.meC == 31)
    {
      this.mgN.setVisibility(8);
      if ((m.E(getIntent()) == 10) && (!m.xJ(com.tencent.mm.compatible.d.p.gJg.gJA)) && (!m.xJ(com.tencent.mm.compatible.d.p.aD(this.vov.voR)))) {
        this.mgN.setText(String.format(getString(R.l.eaK), new Object[] { com.tencent.mm.compatible.d.p.aD(this.vov.voR) }));
      }
      if (!bg.mZ(this.mgT)) {
        break label310;
      }
      if (this.meC != 33) {
        break label293;
      }
      this.mgM.setText(getString(R.l.dLO) + ": " + this.ssid);
    }
    for (;;)
    {
      if (!bg.mZ(this.fKY))
      {
        if (!bg.mZ(this.meD)) {
          this.mgL.setText(this.meD);
        }
        if (!bg.mZ(this.mgR)) {
          n.Ja().a(this.mgR, this.mgK, this.hCC);
        }
      }
      w.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, method=Protocol.toConnectStart, desc=it initializes the connect front page.", new Object[] { m.B(getIntent()), Integer.valueOf(m.C(getIntent())) });
      GMTrace.o(7215276621824L, 53758);
      return;
      this.mgN.setVisibility(0);
      this.mgN.setText(R.l.dLS);
      break;
      label293:
      this.mgM.setText(getString(R.l.dLO));
      continue;
      label310:
      this.mgM.setText(this.mgT);
    }
  }
  
  protected final void aAT()
  {
    GMTrace.i(7215410839552L, 53759);
    this.mgw.setVisibility(4);
    this.mgx.setVisibility(4);
    this.mgy.setVisibility(4);
    this.mgN.setText(R.l.dLP);
    Object localObject = this.vov.voR;
    DialogInterface.OnCancelListener local6 = new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(7194607091712L, 53604);
        com.tencent.mm.plugin.freewifi.model.d.a(FreeWifiFrontPageUI.this.ssid, 4, FreeWifiFrontPageUI.this.getIntent());
        w.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, method=Protocol.toConnecting.ProgressDlg.onCancel, desc=it changes the connect state of the model to CONNECT_STATE_WAIT_START because the user cancles the connect process in progress. state=%d", new Object[] { m.B(FreeWifiFrontPageUI.this.getIntent()), Integer.valueOf(m.C(FreeWifiFrontPageUI.this.getIntent())), Integer.valueOf(4) });
        GMTrace.o(7194607091712L, 53604);
      }
    };
    View localView = View.inflate((Context)localObject, R.i.cVk, null);
    localObject = new com.tencent.mm.ui.base.j((Context)localObject, R.m.fdg);
    ((Dialog)localObject).setCancelable(true);
    ((Dialog)localObject).setContentView(localView);
    ((Dialog)localObject).setOnCancelListener(local6);
    this.mgP = ((Dialog)localObject);
    w.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, method=Protocol.toConnecting, desc=it adds a loading ui on the connect front page.", new Object[] { m.B(getIntent()), Integer.valueOf(m.C(getIntent())) });
    this.mgP.show();
    GMTrace.o(7215410839552L, 53759);
  }
  
  protected final void aX(final Object paramObject)
  {
    GMTrace.i(7215545057280L, 53760);
    if (!(paramObject instanceof a))
    {
      GMTrace.o(7215545057280L, 53760);
      return;
    }
    a locala = (a)paramObject;
    w.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, desc=Connect failed. errcode=%s", new Object[] { m.B(this.intent), Integer.valueOf(m.C(this.intent)), locala.mgD });
    if (this.mgP != null) {
      this.mgP.dismiss();
    }
    this.mgw.setVisibility(0);
    if (!m.xJ(locala.text)) {}
    for (paramObject = locala.text;; paramObject = getString(locala.mgC))
    {
      this.mgw.setText((CharSequence)paramObject);
      this.mgw.setVisibility(0);
      this.mgx.setVisibility(0);
      this.mgy.setVisibility(0);
      paramObject = getString(R.l.eaX) + ": " + locala.mgD;
      this.mgy.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7185346068480L, 53535);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("free_wifi_show_detail_error", 1);
          paramAnonymousView.putExtra("free_wifi_error_ui_error_msg", FreeWifiFrontPageUI.this.getString(R.l.eaL));
          paramAnonymousView.putExtra("free_wifi_error_ui_error_msg_detail1", paramObject);
          paramAnonymousView.setClass(FreeWifiFrontPageUI.this, FreeWifiErrorUI.class);
          FreeWifiFrontPageUI.this.startActivity(paramAnonymousView);
          GMTrace.o(7185346068480L, 53535);
        }
      });
      this.mgN.setVisibility(0);
      this.mgN.setText(R.l.ebk);
      w.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, method=Protocol.toFail, desc=connect failed.", new Object[] { m.B(getIntent()), Integer.valueOf(m.C(getIntent())) });
      GMTrace.o(7215545057280L, 53760);
      return;
      if (locala.mgC == 0) {
        locala.mgC = R.l.eaM;
      }
    }
  }
  
  protected final void aY(Object paramObject)
  {
    GMTrace.i(7215679275008L, 53761);
    if (!(paramObject instanceof b))
    {
      GMTrace.o(7215679275008L, 53761);
      return;
    }
    Object localObject = ((b)paramObject).mhb;
    if ((this.meC != 31) && (this.mgP != null)) {
      this.mgP.dismiss();
    }
    this.mgN.setText(R.l.dLM);
    this.mgN.setClickable(false);
    paramObject = getIntent();
    ((Intent)paramObject).putExtra("free_wifi_appid", ((dy)localObject).mGI);
    ((Intent)paramObject).putExtra("free_wifi_app_nickname", ((dy)localObject).jYc);
    ((Intent)paramObject).putExtra("free_wifi_app_username", ((dy)localObject).jWW);
    ((Intent)paramObject).putExtra("free_wifi_signature", ((dy)localObject).huM);
    ((Intent)paramObject).putExtra("free_wifi_finish_actioncode", ((dy)localObject).txV);
    ((Intent)paramObject).putExtra("free_wifi_finish_url", ((dy)localObject).txW);
    ((Intent)paramObject).putExtra(e.b.vkA, ((dy)localObject).mib);
    if (((dy)localObject).txV == 2)
    {
      if (!bg.mZ(((dy)localObject).jWW))
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("Contact_User", ((dy)localObject).jWW);
        com.tencent.mm.bi.d.b(this, "profile", ".ui.ContactInfoUI", localIntent);
        d.rB();
        w.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, method=toSuccess, desc=connect succeeded.", new Object[] { m.B(getIntent()), Integer.valueOf(m.C(getIntent())) });
        localObject = k.azB();
        ((k.a)localObject).fvF = this.fvF;
        ((k.a)localObject).mbX = m.B((Intent)paramObject);
        ((k.a)localObject).mbZ = k.b.mcz.mcK;
        ((k.a)localObject).mca = k.b.mcz.name;
        ((k.a)localObject).fIC = m.E((Intent)paramObject);
        ((k.a)localObject).mbY = m.D((Intent)paramObject);
        ((k.a)localObject).result = 0;
        ((k.a)localObject).kCB = "";
        ((k.a)localObject).azD().b((Intent)paramObject, true).azC();
        GMTrace.o(7215679275008L, 53761);
        return;
      }
      ((Intent)paramObject).setClass(this, FreeWifiSuccUI.class);
    }
    for (;;)
    {
      localObject = k.azB();
      ((k.a)localObject).fvF = this.fvF;
      ((k.a)localObject).mbX = m.B((Intent)paramObject);
      ((k.a)localObject).mbZ = k.b.mcy.mcK;
      ((k.a)localObject).mca = k.b.mcy.name;
      ((k.a)localObject).fIC = m.E((Intent)paramObject);
      ((k.a)localObject).mbY = m.D((Intent)paramObject);
      ((k.a)localObject).result = 0;
      ((k.a)localObject).kCB = "";
      ((k.a)localObject).azD().b((Intent)paramObject, true).azC();
      finish();
      startActivity((Intent)paramObject);
      d.rB();
      w.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, method=toSuccess, desc=connect succeeded.", new Object[] { m.B(getIntent()), Integer.valueOf(m.C(getIntent())) });
      GMTrace.o(7215679275008L, 53761);
      return;
      if (m.xJ(((dy)localObject).txX))
      {
        ((Intent)paramObject).setClass(this, FreeWifiSuccUI.class);
      }
      else
      {
        ((Intent)paramObject).putExtra("free_wifi_qinghuai_url", ((dy)localObject).txX);
        ((Intent)paramObject).setClass(this, FreeWifiSuccWebViewUI.class);
      }
    }
  }
  
  public void finish()
  {
    GMTrace.i(7215813492736L, 53762);
    super.finish();
    k.a locala = k.azB();
    locala.fvF = this.fvF;
    locala.mbX = m.B(this.intent);
    locala.mbZ = k.b.mcw.mcK;
    locala.mca = k.b.mcw.name;
    locala.fIC = m.E(this.intent);
    locala.mbY = m.D(this.intent);
    locala.result = 0;
    locala.kCB = "";
    locala.azD().b(this.intent, true).azC();
    GMTrace.o(7215813492736L, 53762);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7215947710464L, 53763);
    int i = R.i.cVe;
    GMTrace.o(7215947710464L, 53763);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7214873968640L, 53755);
    super.onCreate(paramBundle);
    MH();
    switch (this.meC)
    {
    }
    for (;;)
    {
      w.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, method=%s.onCreate, desc=it goes into connect frontpage. apKey=%s", new Object[] { m.B(getIntent()), Integer.valueOf(m.C(getIntent())), this.className, this.fvF });
      l.p(com.tencent.mm.plugin.freewifi.model.d.azX(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
      GMTrace.o(7214873968640L, 53755);
      return;
      this.mgV = new f(this);
      continue;
      this.mgV = new com.tencent.mm.plugin.freewifi.e.g(this);
      continue;
      this.mgV = new com.tencent.mm.plugin.freewifi.e.h(this);
      this.mgQ.setVisibility(0);
      aAR();
      continue;
      this.mgV = new com.tencent.mm.plugin.freewifi.e.j(this);
      this.mgQ.setVisibility(0);
      continue;
      this.mgV = new com.tencent.mm.plugin.freewifi.e.i(this);
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7216484581376L, 53767);
    super.onDestroy();
    com.tencent.mm.plugin.freewifi.model.j.aAh().release();
    GMTrace.o(7216484581376L, 53767);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7216081928192L, 53764);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      GMTrace.o(7216081928192L, 53764);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(7216081928192L, 53764);
    return bool;
  }
  
  public static final class a
  {
    public static a mha;
    public int mgC;
    public String mgD;
    public String text;
    
    static
    {
      GMTrace.i(7171387424768L, 53431);
      mha = new a();
      GMTrace.o(7171387424768L, 53431);
    }
    
    public a()
    {
      GMTrace.i(7170716336128L, 53426);
      GMTrace.o(7170716336128L, 53426);
    }
  }
  
  public static final class b
  {
    public dy mhb;
    
    public b()
    {
      GMTrace.i(7207760429056L, 53702);
      GMTrace.o(7207760429056L, 53702);
    }
  }
  
  public static final class c
  {
    Object data;
    FreeWifiFrontPageUI.d mgX;
    
    public c(FreeWifiFrontPageUI.d paramd, Object paramObject)
    {
      GMTrace.i(7183064367104L, 53518);
      this.mgX = paramd;
      this.data = paramObject;
      GMTrace.o(7183064367104L, 53518);
    }
  }
  
  public static enum d
  {
    static
    {
      GMTrace.i(7184003891200L, 53525);
      mhc = new d("START", 0);
      mhd = new d("CONNECTING", 1);
      mhe = new d("FAIL", 2);
      mhf = new d("SUCCESS", 3);
      mhg = new d[] { mhc, mhd, mhe, mhf };
      GMTrace.o(7184003891200L, 53525);
    }
    
    private d()
    {
      GMTrace.i(7183869673472L, 53524);
      GMTrace.o(7183869673472L, 53524);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreeWifiFrontPageUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */