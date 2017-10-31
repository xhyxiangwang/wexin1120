package com.tencent.mm.plugin.voip_cs.ui;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.PowerManager;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.view.KeyEvent;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.n;
import com.tencent.mm.compatible.b.e.a;
import com.tencent.mm.compatible.d.b.a;
import com.tencent.mm.g.a.qb;
import com.tencent.mm.network.m;
import com.tencent.mm.network.m.a;
import com.tencent.mm.plugin.video.ObservableTextureView;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver.a;
import com.tencent.mm.plugin.voip.model.l;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.plugin.voip.video.f;
import com.tencent.mm.plugin.voip_cs.b.b.a.a;
import com.tencent.mm.protocal.c.bkz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.x.af;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.y;
import java.util.Arrays;

@com.tencent.mm.ui.base.a(3)
public class VoipCSMainUI
  extends MMActivity
  implements com.tencent.mm.plugin.voip_cs.b.a, a.a
{
  private String appId;
  public String fEM;
  public String fQe;
  private com.tencent.mm.compatible.util.b frC;
  private ae ham;
  public String iVM;
  private TelephonyManager mVK;
  PhoneStateListener mVL;
  private m peQ;
  public String rAs;
  private com.tencent.mm.plugin.voip_cs.b.a.a rAy;
  private com.tencent.mm.plugin.voip_cs.b.a.b rBc;
  private com.tencent.mm.plugin.voip_cs.b.a.c rBd;
  private boolean rBe;
  public String rBf;
  public String rBg;
  public String rBh;
  public boolean rBi;
  private aj rBj;
  e.a rBk;
  private BroadcastReceiver rpX;
  private HeadsetPlugReceiver.a rpY;
  private HeadsetPlugReceiver rpr;
  public CharSequence tickerText;
  public CharSequence title;
  public String type;
  
  public VoipCSMainUI()
  {
    GMTrace.i(11278718337024L, 84033);
    this.rBe = false;
    this.rpr = null;
    this.rAs = "";
    this.appId = "";
    this.iVM = "";
    this.rBf = "";
    this.rBg = "";
    this.rBh = "";
    this.fQe = "";
    this.type = "";
    this.rBi = false;
    this.fEM = ab.getContext().getString(R.l.eQx);
    this.tickerText = ab.getContext().getString(R.l.eQx);
    this.title = ab.getContext().getString(R.l.eQr);
    this.rBj = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(11275631329280L, 84010);
        Object localObject = new Intent(ab.getContext(), VoipCSMainUI.class);
        localObject = PendingIntent.getActivity(ab.getContext(), 44, (Intent)localObject, 134217728);
        localObject = new Notification.Builder(ab.getContext()).setTicker(VoipCSMainUI.this.tickerText).setContentTitle(VoipCSMainUI.this.title).setContentText(VoipCSMainUI.this.fEM).setContentIntent((PendingIntent)localObject).setOngoing(true).getNotification();
        ((Notification)localObject).icon = com.tencent.mm.bh.a.bFQ();
        ((Notification)localObject).flags |= 0x20;
        ap.getNotification().a(44, (Notification)localObject, false);
        GMTrace.o(11275631329280L, 84010);
        return true;
      }
    }, true);
    this.rBk = new e.a()
    {
      public final void dc(int paramAnonymousInt)
      {
        GMTrace.i(11276705071104L, 84018);
        w.d("MicroMsg.voipcs.VoipCSMainUI", "onBluetoothHeadsetStateChange status: %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(11276705071104L, 84018);
          return;
          ap.AT().sk();
          GMTrace.o(11276705071104L, 84018);
          return;
          ap.AT().sl();
          VoipCSMainUI.c(VoipCSMainUI.this).it(true);
          GMTrace.o(11276705071104L, 84018);
          return;
          VoipCSMainUI.c(VoipCSMainUI.this).it(false);
          GMTrace.o(11276705071104L, 84018);
          return;
          ap.AT().sl();
          VoipCSMainUI.c(VoipCSMainUI.this).it(true);
        }
      }
    };
    this.rpY = new HeadsetPlugReceiver.a()
    {
      public final void fq(boolean paramAnonymousBoolean)
      {
        GMTrace.i(11276436635648L, 84016);
        w.d("MicroMsg.voipcs.VoipCSMainUI", "onHeadsetState, on:%b", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
        if (VoipCSMainUI.d(VoipCSMainUI.this) == paramAnonymousBoolean)
        {
          w.d("MicroMsg.voipcs.VoipCSMainUI", "same status, no changed");
          GMTrace.o(11276436635648L, 84016);
          return;
        }
        VoipCSMainUI.a(VoipCSMainUI.this, paramAnonymousBoolean);
        if (paramAnonymousBoolean)
        {
          VoipCSMainUI.c(VoipCSMainUI.this).it(false);
          Toast.makeText(ab.getContext(), ab.getContext().getString(R.l.eRC), 0).show();
          GMTrace.o(11276436635648L, 84016);
          return;
        }
        VoipCSMainUI.c(VoipCSMainUI.this).it(true);
        Toast.makeText(ab.getContext(), ab.getContext().getString(R.l.eRD), 0).show();
        GMTrace.o(11276436635648L, 84016);
      }
    };
    this.rpX = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(11278315683840L, 84030);
        paramAnonymousContext = paramAnonymousIntent.getAction();
        paramAnonymousIntent = (PowerManager)ab.getContext().getSystemService("power");
        if (("android.intent.action.USER_PRESENT".equals(paramAnonymousContext)) && (paramAnonymousIntent.isScreenOn()))
        {
          w.d("MicroMsg.voipcs.VoipCSMainUI", "on user present home");
          VoipCSMainUI.e(VoipCSMainUI.this).fBD = false;
          GMTrace.o(11278315683840L, 84030);
          return;
        }
        if ("android.intent.action.SCREEN_ON".equals(paramAnonymousContext))
        {
          w.d("MicroMsg.voipcs.VoipCSMainUI", "screen on...");
          VoipCSMainUI.e(VoipCSMainUI.this).fBD = false;
          if ((!VoipCSMainUI.f(VoipCSMainUI.this).bsW()) && (com.tencent.mm.plugin.voip_cs.b.b.bux().rAr == 2))
          {
            VoipCSMainUI.f(VoipCSMainUI.this).buF();
            GMTrace.o(11278315683840L, 84030);
          }
        }
        else if ("android.intent.action.SCREEN_OFF".equals(paramAnonymousContext))
        {
          w.d("MicroMsg.voipcs.VoipCSMainUI", "screen off...");
          VoipCSMainUI.e(VoipCSMainUI.this).fBD = true;
          if (!VoipCSMainUI.f(VoipCSMainUI.this).bsW()) {
            VoipCSMainUI.f(VoipCSMainUI.this).aQq();
          }
        }
        GMTrace.o(11278315683840L, 84030);
      }
    };
    this.mVL = new PhoneStateListener()
    {
      public final void onCallStateChanged(int paramAnonymousInt, String paramAnonymousString)
      {
        GMTrace.i(11277241942016L, 84022);
        w.d("MicroMsg.voipcs.VoipCSMainUI", "now phone state change!");
        if (paramAnonymousInt == 2)
        {
          w.i("MicroMsg.voipcs.VoipCSMainUI", " phone is talking ! exist voipcs !");
          com.tencent.mm.plugin.voip_cs.b.b.buy().rzL = 4;
          VoipCSMainUI.this.wo(7);
        }
        GMTrace.o(11277241942016L, 84022);
      }
    };
    this.peQ = new m.a()
    {
      public final void db(int paramAnonymousInt)
      {
        GMTrace.i(11276168200192L, 84014);
        w.d("MicroMsg.voipcs.VoipCSMainUI", "network status change from " + paramAnonymousInt);
        v2protocal localv2protocal;
        if ((com.tencent.mm.plugin.voip_cs.b.b.bux().rAr == 2) && ((paramAnonymousInt == 4) || (paramAnonymousInt == 6)))
        {
          localObject = com.tencent.mm.plugin.voip_cs.b.b.bux();
          localv2protocal = com.tencent.mm.plugin.voip_cs.b.b.buw().mYp;
          if (((com.tencent.mm.plugin.voip_cs.b.d)localObject).rnT == 0) {
            ((com.tencent.mm.plugin.voip_cs.b.d)localObject).rnT = localv2protocal.rrI;
          }
          paramAnonymousInt = com.tencent.mm.plugin.voip.b.a.getNetType(ab.getContext());
          if (paramAnonymousInt != ((com.tencent.mm.plugin.voip_cs.b.d)localObject).rnT) {
            w.i("MicroMsg.voipcs.VoipCSService", "steve: onVoipLocalNetTypeChange: local network type change from " + ((com.tencent.mm.plugin.voip_cs.b.d)localObject).rnT + " to " + paramAnonymousInt);
          }
        }
        try
        {
          byte[] arrayOfByte = new byte[4];
          arrayOfByte[0] = ((byte)paramAnonymousInt);
          int i = localv2protocal.setAppCmd(301, arrayOfByte, 4);
          if (i < 0) {
            w.i("MicroMsg.voipcs.VoipCSService", "steve:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetLocalNetType] update local network type" + paramAnonymousInt + "fail:" + i + ", [roomid=" + localv2protocal.mXo + ", roomkey=" + localv2protocal.mXh + "]");
          }
          bkz localbkz = new bkz();
          localbkz.uBr = 3;
          localbkz.uBs = new com.tencent.mm.bl.b(arrayOfByte, 0, 1);
          localv2protocal.SendRUDP(localbkz.toByteArray(), localbkz.toByteArray().length);
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.e("MicroMsg.voipcs.VoipCSService", "onVoipLocalNetTypeChange Error");
          }
        }
        ((com.tencent.mm.plugin.voip_cs.b.d)localObject).rnT = paramAnonymousInt;
        Object localObject = com.tencent.mm.plugin.voip_cs.b.b.bux();
        w.i("MicroMsg.voipcs.VoipCSService", "now doRedirect+,csroomId:" + com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.rrK + "roomkey:" + com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.mXh);
        ap.wT().a(285, (com.tencent.mm.ac.e)localObject);
        localObject = com.tencent.mm.plugin.voip_cs.b.b.buw().mYp;
        localObject = new com.tencent.mm.plugin.voip_cs.b.c.d(((v2protocal)localObject).rrK, ((v2protocal)localObject).mXh);
        ap.wT().a((com.tencent.mm.ac.k)localObject, 0);
        GMTrace.o(11276168200192L, 84014);
      }
    };
    GMTrace.o(11278718337024L, 84033);
  }
  
  private int aHF()
  {
    int i = 2;
    GMTrace.i(11279255207936L, 84037);
    if (ap.AT().sm()) {
      i = ap.AT().sy();
    }
    for (;;)
    {
      w.d("MicroMsg.voipcs.VoipCSMainUI", "Current StreamType:%d", new Object[] { Integer.valueOf(i) });
      GMTrace.o(11279255207936L, 84037);
      return i;
      if (this.rAy.bsW())
      {
        if (com.tencent.mm.plugin.voip_cs.b.b.bux().rAr != 2)
        {
          com.tencent.mm.plugin.voip_cs.b.a.c localc = this.rBd;
          if (localc.rod != null)
          {
            i = localc.rod.brK();
            continue;
          }
        }
        i = 0;
      }
    }
  }
  
  private void buN()
  {
    GMTrace.i(11278986772480L, 84035);
    Object localObject1;
    Object localObject2;
    long l;
    boolean bool1;
    boolean bool2;
    label330:
    boolean bool3;
    if (com.tencent.mm.plugin.voip_cs.b.b.bux().rAr <= 0)
    {
      localObject1 = this.rBc;
      if (((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).rAQ.bNt())
      {
        localObject2 = ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).rAQ;
        l = ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).rAL;
        ((aj)localObject2).w(l, l);
      }
      localObject1 = this.rBc;
      if (((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).rAR.bNt())
      {
        localObject2 = ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).rAR;
        l = ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).rAM;
        ((aj)localObject2).w(l, l);
      }
      localObject1 = com.tencent.mm.plugin.voip_cs.b.b.buw();
      ((com.tencent.mm.plugin.voip_cs.b.b.a)localObject1).mYs = false;
      ((com.tencent.mm.plugin.voip_cs.b.b.a)localObject1).mYr = false;
      if (((com.tencent.mm.plugin.voip_cs.b.b.a)localObject1).mYp.nQI)
      {
        w.d("MicroMsg.VoipCSEngine", "protocal has init,now uninit!");
        ((com.tencent.mm.plugin.voip_cs.b.b.a)localObject1).mYp.iz(false);
        ((com.tencent.mm.plugin.voip_cs.b.b.a)localObject1).mYp.reset();
      }
      ((com.tencent.mm.plugin.voip_cs.b.b.a)localObject1).mYp.rrJ = 1;
      l = System.currentTimeMillis();
      localObject1 = ((com.tencent.mm.plugin.voip_cs.b.b.a)localObject1).mYp;
      ((v2protocal)localObject1).netType = com.tencent.mm.plugin.voip.b.a.getNetType(ab.getContext());
      ((v2protocal)localObject1).rrI = ((v2protocal)localObject1).netType;
      com.tencent.mm.plugin.voip_cs.b.b.buy().rrI = ((v2protocal)localObject1).netType;
      if (((v2protocal)localObject1).netType == 5) {
        ((v2protocal)localObject1).netType = 4;
      }
      if ((((v2protocal)localObject1).rrI < 4) || ((v2protocal.rfw & 0x400) == 0) || ((v2protocal.rfw & 0xFF) < 30)) {
        break label1300;
      }
      bool1 = true;
      if ((com.tencent.mm.compatible.d.p.gJb.gHy != 1) || (com.tencent.mm.compatible.d.p.gJb.gHb.width < 480) || (com.tencent.mm.compatible.d.p.gJb.gHb.height < 360) || (com.tencent.mm.compatible.d.p.gJb.gHd.width < 480) || (com.tencent.mm.compatible.d.p.gJb.gHd.height < 360)) {
        break label1306;
      }
      bool2 = true;
      if (com.tencent.mm.compatible.d.p.gJb.gHy != 0) {
        break label1312;
      }
      bool3 = true;
      label342:
      if (((bool1) || (bool2)) && (!bool3))
      {
        ((v2protocal)localObject1).defaultWidth = 480;
        ((v2protocal)localObject1).defaultHeight = 360;
        v2protocal.rrF = true;
        com.tencent.mm.plugin.voip.b.a.dI("MicroMsg.Voip", "steve:Set Enable 480! " + ((v2protocal)localObject1).defaultWidth + "x" + ((v2protocal)localObject1).defaultHeight);
      }
      com.tencent.mm.plugin.voip.b.a.dI("MicroMsg.Voip", "steve: Android CPUFlag:" + (v2protocal.rfw & 0xFF) + ", 480x360 Enc flags: bEnable480FromLocal:" + bool1 + ", bEnable480FromSvr:" + bool2 + ", bDisable480FromSvr:" + bool3);
      ((v2protocal)localObject1).rsC = new int[((v2protocal)localObject1).defaultWidth * ((v2protocal)localObject1).defaultHeight];
      ap.AS();
      ((v2protocal)localObject1).rrH = com.tencent.mm.x.c.wy();
      if ((v2protocal.rfw & 0x400) == 0) {
        break label1318;
      }
      com.tencent.mm.compatible.loader.d.u(ab.getContext(), "libvoipCodec_v7a.so");
      com.tencent.mm.plugin.voip.b.a.dJ("MicroMsg.Voip", "dlopen /data/data/com.tencent.mm/lib/libvoipCodec_v7a.so... ");
    }
    for (;;)
    {
      int i = Build.VERSION.SDK_INT;
      int j = OpenGlRender.bug();
      localObject2 = ((WindowManager)ab.getContext().getSystemService("window")).getDefaultDisplay();
      int k = ((Display)localObject2).getWidth();
      int m = ((Display)localObject2).getHeight();
      i = ((v2protocal)localObject1).init(((v2protocal)localObject1).netType, 2, ((v2protocal)localObject1).defaultWidth << 16 | ((v2protocal)localObject1).defaultHeight, k << 16 | m, ((v2protocal)localObject1).rrH, i << 16 | j << 24 | v2protocal.rfw, com.tencent.mm.compatible.util.e.gZO + "app_lib/", 8);
      com.tencent.mm.plugin.voip.b.a.dJ("MicroMsg.Voip", "protocal init ret :" + i + ",uin= " + ((v2protocal)localObject1).rrH);
      ((v2protocal)localObject1).nQI = true;
      if (i < 0) {
        ((v2protocal)localObject1).reset();
      }
      w.d("MicroMsg.VoipCSEngine", "protocal init finish, ret: %d, used %dms", new Object[] { Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - l) });
      if (i < 0) {
        w.e("MicroMsg.VoipCSEngine", "engine init failed!");
      }
      com.tencent.mm.plugin.voip_cs.b.d locald = com.tencent.mm.plugin.voip_cs.b.b.bux();
      String str1 = this.rAs;
      String str2 = this.appId;
      String str3 = this.rBh;
      w.i("MicroMsg.voipcs.VoipCSService", "start netscene invite for username:" + str1 + ",appid:" + str2 + ",voipCSContext:" + str3);
      locald.rAs = str1;
      locald.rAr = 1;
      localObject1 = com.tencent.mm.plugin.voip_cs.b.b.buy();
      w.d("MicroMsg.VoipCSReportHelper", "markSendInvite");
      if (((com.tencent.mm.plugin.voip_cs.b.c)localObject1).rAe == 0) {
        ((com.tencent.mm.plugin.voip_cs.b.c)localObject1).rAe = ((int)(System.currentTimeMillis() / 1000L));
      }
      localObject2 = null;
      localObject1 = localObject2;
      if (str3 != null)
      {
        localObject1 = localObject2;
        if (!str3.equals("")) {
          localObject1 = str3.getBytes();
        }
      }
      ap.wT().a(823, locald);
      com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.mXj = ((int)(System.currentTimeMillis() / 1000L));
      localObject1 = new com.tencent.mm.plugin.voip_cs.b.c.c(com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.mXj, str1, com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.netType, (byte[])localObject1, com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.field_capInfo, str2);
      w.i("MicroMsg.voipcs.VoipCSService", "capDump is " + Arrays.toString(com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.field_capInfo));
      ap.wT().a((com.tencent.mm.ac.k)localObject1, 0);
      if (com.tencent.mm.plugin.voip_cs.b.b.bux().rAr < 2) {
        this.rAy.buF();
      }
      localObject1 = this.rBc;
      w.i("MicroMsg.voipcs.VoipCSViewManager", "start capture render");
      if (((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).ocA == null)
      {
        w.i("MicroMsg.voipcs.VoipCSViewManager", "create capture View");
        ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).ocA = new ObservableTextureView(((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).rAz);
        localObject2 = new RelativeLayout.LayoutParams(1, 1);
        ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).ocA.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).rAA.addView(((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).ocA, new RelativeLayout.LayoutParams(1, 1));
        ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).ocA.setVisibility(0);
      }
      if (((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).ocy == null)
      {
        i = 320;
        j = 240;
        com.tencent.mm.plugin.voip_cs.b.b.buw();
        if (v2protocal.rrF)
        {
          i = 640;
          j = 480;
        }
        w.i("MicroMsg.voipcs.VoipCSViewManager", "create capture Render");
        ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).ocy = new com.tencent.mm.plugin.voip.video.a(i, j);
        ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).ocy.a((f)localObject1, true);
        ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).ocy.a(((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).ocA);
        com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.rrW = ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).ocy.bud();
        ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).ocy.btY();
        ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).ocy.bue();
        w.i("MicroMsg.voipcs.VoipCSViewManager", "captureRender.mIsCurrentFaceCamera=%b captureRender.mIsCameraRemote180=%b", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).ocy.bub()), Boolean.valueOf(((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).ocy.buc()) });
      }
      GMTrace.o(11278986772480L, 84035);
      return;
      label1300:
      bool1 = false;
      break;
      label1306:
      bool2 = false;
      break label330;
      label1312:
      bool3 = false;
      break label342;
      label1318:
      if ((v2protocal.rfw & 0x200) != 0)
      {
        com.tencent.mm.compatible.loader.d.u(ab.getContext(), "libvoipCodec.so");
        com.tencent.mm.plugin.voip.b.a.dJ("MicroMsg.Voip", "dlopen /data/data/com.tencent.mm/lib/libvoipCodec.so... ");
      }
      else
      {
        com.tencent.mm.compatible.loader.d.u(ab.getContext(), "libvoipCodec_v5.so");
        com.tencent.mm.plugin.voip.b.a.dJ("MicroMsg.Voip", "dlopen /data/data/com.tencent.mm/lib/libvoipCodec_v5.so... ");
      }
    }
  }
  
  private boolean buO()
  {
    GMTrace.i(11280597385216L, 84047);
    if (!com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.RECORD_AUDIO", 82, "", ""))
    {
      w.i("MicroMsg.voipcs.VoipCSMainUI", "has not audio record premission!");
      GMTrace.o(11280597385216L, 84047);
      return false;
    }
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.CAMERA", 19, "", "");
    w.d("MicroMsg.voipcs.VoipCSMainUI", "voipcs checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bOd(), this });
    if (!bool)
    {
      w.i("MicroMsg.voipcs.VoipCSMainUI", "has not camera  premission!");
      GMTrace.o(11280597385216L, 84047);
      return false;
    }
    GMTrace.o(11280597385216L, 84047);
    return true;
  }
  
  public final void aGI()
  {
    GMTrace.i(11280865820672L, 84049);
    this.rBc.aGI();
    Object localObject;
    int i;
    if ((ap.AT().ss()) || (ap.AT().sm()))
    {
      this.rBd.it(false);
      localObject = this.rBd;
      if (((com.tencent.mm.plugin.voip_cs.b.a.c)localObject).nZE == null) {
        break label233;
      }
      boolean bool = ((com.tencent.mm.plugin.voip_cs.b.a.c)localObject).nZE.qA();
      com.tencent.mm.plugin.voip_cs.b.b.buy().rzQ = 1;
      if (!bool) {
        break label233;
      }
      i = 1;
      label75:
      com.tencent.mm.plugin.voip_cs.b.b.buy().rAj = i;
      localObject = this.rBd;
      if (((com.tencent.mm.plugin.voip_cs.b.a.c)localObject).rod != null) {
        break label238;
      }
      com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.rrX = Math.abs(1);
    }
    for (;;)
    {
      this.rAy.aQq();
      localObject = com.tencent.mm.plugin.voip_cs.b.b.buy();
      if (((com.tencent.mm.plugin.voip_cs.b.c)localObject).rAe != 0) {
        ((com.tencent.mm.plugin.voip_cs.b.c)localObject).rzT = ((int)(System.currentTimeMillis() / 1000L) - ((com.tencent.mm.plugin.voip_cs.b.c)localObject).rAe);
      }
      localObject = com.tencent.mm.plugin.voip_cs.b.b.buy();
      w.d("MicroMsg.VoipCSReportHelper", "markStartTalk");
      if (((com.tencent.mm.plugin.voip_cs.b.c)localObject).rAh == 0) {
        ((com.tencent.mm.plugin.voip_cs.b.c)localObject).rAh = ((int)(System.currentTimeMillis() / 1000L));
      }
      localObject = com.tencent.mm.plugin.voip_cs.b.b.buy();
      w.d("MicroMsg.VoipCSReportHelper", "markConnect");
      if (((com.tencent.mm.plugin.voip_cs.b.c)localObject).rAg != 0) {
        ((com.tencent.mm.plugin.voip_cs.b.c)localObject).rzV = ((int)(System.currentTimeMillis() / 1000L) - ((com.tencent.mm.plugin.voip_cs.b.c)localObject).rAg);
      }
      GMTrace.o(11280865820672L, 84049);
      return;
      this.rBd.it(true);
      break;
      label233:
      i = -1;
      break label75;
      label238:
      ((com.tencent.mm.plugin.voip_cs.b.a.c)localObject).rod.brG();
      if (((com.tencent.mm.plugin.voip_cs.b.a.c)localObject).rod.brG() <= 0) {
        com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.rrX = Math.abs(1);
      }
    }
  }
  
  public final void buM()
  {
    GMTrace.i(11281000038400L, 84050);
    w.d("MicroMsg.voipcs.VoipCSMainUI", "onChannelConnectFailed now finish it!");
    this.rBc.wr(5);
    GMTrace.o(11281000038400L, 84050);
  }
  
  public final void dL(String paramString1, String paramString2)
  {
    GMTrace.i(11280463167488L, 84046);
    com.tencent.mm.plugin.voip_cs.b.a.b localb = this.rBc;
    if ((localb.rAP.equals("")) && (com.tencent.pb.common.c.h.isNullOrEmpty(paramString2))) {
      if (localb.rAz.rBi) {
        localb.kfQ.setText(R.l.eQh);
      }
    }
    while ((localb.rAO.equals("")) && (com.tencent.pb.common.c.h.isNullOrEmpty(paramString1)) && ((localb.rAz.iVM == null) || (localb.rAz.iVM.equals(""))))
    {
      localb.rAF.setImageResource(R.g.aYg);
      GMTrace.o(11280463167488L, 84046);
      return;
      localb.kfQ.setText(R.l.eQg);
      continue;
      localb.Jc(paramString2);
    }
    SharedPreferences localSharedPreferences = ab.bNb();
    if ((!com.tencent.pb.common.c.h.isNullOrEmpty(paramString1)) && (!localb.rAO.equals(paramString1)))
    {
      localb.Jd(paramString1);
      localSharedPreferences.edit().putString(localb.buG(), paramString1).commit();
    }
    if ((!com.tencent.pb.common.c.h.isNullOrEmpty(paramString2)) && (!localb.rAP.equals(paramString2)))
    {
      localb.Jc(paramString2);
      localSharedPreferences.edit().putString(localb.buH(), paramString2).commit();
    }
    GMTrace.o(11280463167488L, 84046);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11280060514304L, 84043);
    int i = R.i.dhF;
    GMTrace.o(11280060514304L, 84043);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11278852554752L, 84034);
    w.i("MicroMsg.voipcs.VoipCSMainUI", "onCreate voipcs....");
    super.onCreate(paramBundle);
    this.vov.bUK();
    this.rAs = getIntent().getStringExtra("voipCSBizId");
    this.appId = getIntent().getStringExtra("voipCSAppId");
    this.fQe = bg.mY(getIntent().getStringExtra("voipCSScene"));
    this.type = bg.mY(getIntent().getStringExtra("voipCSType"));
    this.rBf = getIntent().getStringExtra("voipCSAllowBackCamera");
    this.rBg = getIntent().getStringExtra("voipCSShowOther");
    this.iVM = getIntent().getStringExtra("voipCSAvatarUrl");
    this.rBh = getIntent().getStringExtra("voipCSContext");
    this.rBi = getIntent().getBooleanExtra("launch_from_appbrand", false);
    getWindow().addFlags(6946944);
    if (Build.VERSION.SDK_INT >= 19) {
      getWindow().addFlags(67108864);
    }
    this.ham = new ae();
    paramBundle = com.tencent.mm.plugin.voip_cs.b.b.buy();
    w.d("MicroMsg.VoipCSReportHelper", "reset");
    paramBundle.aHe = 0;
    paramBundle.rzt = 0;
    paramBundle.rzu = 0;
    paramBundle.rzv = 0;
    paramBundle.nPQ = 0;
    paramBundle.rzw = 0;
    paramBundle.rzx = 0;
    paramBundle.rzy = 0;
    paramBundle.rzz = 0;
    paramBundle.rzA = 0;
    paramBundle.rzB = 0;
    paramBundle.networkType = 0;
    paramBundle.rzC = 0;
    paramBundle.rzD = com.tencent.mm.plugin.voip_cs.b.c.rzq;
    paramBundle.rzE = 0;
    paramBundle.rzF = 0L;
    paramBundle.mXh = 0L;
    paramBundle.rzG = "";
    paramBundle.rrI = 0;
    paramBundle.rzJ = 0;
    paramBundle.rzK = 0;
    paramBundle.rzL = 0;
    paramBundle.rsb = 0;
    paramBundle.rsa = 0;
    paramBundle.rzM = 0;
    paramBundle.rzN = 0;
    paramBundle.rzO = 0;
    paramBundle.rzP = 0;
    paramBundle.rzQ = 0;
    paramBundle.rzR = 0;
    paramBundle.rzS = 0L;
    paramBundle.rzT = 0;
    paramBundle.rzU = 0L;
    paramBundle.rzV = 0L;
    paramBundle.rzW = 0L;
    paramBundle.mYE = 0L;
    paramBundle.rzX = 0;
    paramBundle.rzY = 0;
    paramBundle.channelStrategy = 1;
    paramBundle.rtm = 0;
    paramBundle.rsc = 0;
    paramBundle.rzZ = 0;
    paramBundle.rAa = 0;
    paramBundle.mYO = "";
    paramBundle.mYN = "";
    paramBundle.rAe = 0;
    paramBundle.rAf = 0;
    paramBundle.rAg = 0;
    paramBundle.rAh = 0;
    paramBundle.rAi = 0;
    this.mVK = ((TelephonyManager)ab.getContext().getSystemService("phone"));
    com.tencent.mm.plugin.voip_cs.b.b.bux().rAs = this.rAs;
    this.rBc = new com.tencent.mm.plugin.voip_cs.b.a.b(this);
    this.rBd = new com.tencent.mm.plugin.voip_cs.b.a.c();
    this.frC = new com.tencent.mm.compatible.util.b(ab.getContext());
    this.rAy = com.tencent.mm.plugin.voip_cs.b.a.a.buD();
    com.tencent.mm.plugin.voip_cs.b.b.buw().rBa = this;
    com.tencent.mm.plugin.voip_cs.b.b.bux().rAk = this;
    if ((com.tencent.mm.plugin.voip_cs.b.b.bux().rAr == 0) || (com.tencent.mm.plugin.voip_cs.b.b.bux().rAr == 3)) {
      com.tencent.mm.plugin.voip_cs.b.b.bux().rAr = 0;
    }
    ap.pF().rn();
    this.frC.requestFocus();
    ap.AT().sk();
    ap.AT().a(this.rBk);
    this.rpr = new HeadsetPlugReceiver();
    this.rpr.a(ab.getContext(), this.rpY);
    paramBundle = new IntentFilter();
    paramBundle.addAction("android.intent.action.SCREEN_ON");
    paramBundle.addAction("android.intent.action.SCREEN_OFF");
    paramBundle.addAction("android.intent.action.USER_PRESENT");
    ab.getContext().registerReceiver(this.rpX, paramBundle);
    ap.a(this.peQ);
    if (this.rBi) {
      if (this.fQe.equals("1")) {
        if (this.type.equals("video"))
        {
          this.title = ab.getContext().getString(R.l.eQp);
          this.tickerText = ab.getContext().getString(R.l.eQt);
          this.fEM = ab.getContext().getString(R.l.eQt);
          i = this.mVK.getCallState();
          if ((i != 2) && (i != 1)) {
            break label1183;
          }
          w.i("MicroMsg.voipcs.VoipCSMainUI", "check is phone use now ! TelephoneManager.callState is %d", new Object[] { Integer.valueOf(i) });
          com.tencent.mm.ui.base.h.a(this, R.l.eQD, R.l.dxm, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(11278047248384L, 84028);
              paramAnonymousDialogInterface.dismiss();
              VoipCSMainUI.this.wo(0);
              GMTrace.o(11278047248384L, 84028);
            }
          });
        }
      }
    }
    label1183:
    for (int i = 1;; i = 0)
    {
      if (i == 0) {
        break label1188;
      }
      w.i("MicroMsg.voipcs.VoipCSMainUI", "can not start voip cs  by in telephone talking!");
      GMTrace.o(11278852554752L, 84034);
      return;
      this.title = ab.getContext().getString(R.l.eQq);
      this.tickerText = ab.getContext().getString(R.l.eQu);
      this.fEM = ab.getContext().getString(R.l.eQu);
      break;
      if (this.type.equals("video"))
      {
        this.title = ab.getContext().getString(R.l.eQr);
        this.tickerText = ab.getContext().getString(R.l.eQv);
        this.fEM = ab.getContext().getString(R.l.eQv);
        break;
      }
      this.title = ab.getContext().getString(R.l.eQq);
      this.tickerText = ab.getContext().getString(R.l.eQu);
      this.fEM = ab.getContext().getString(R.l.eQu);
      break;
      if (this.fQe.equals("1"))
      {
        if (this.type.equals("video"))
        {
          this.title = ab.getContext().getString(R.l.eQp);
          this.tickerText = ab.getContext().getString(R.l.eQt);
          this.fEM = ab.getContext().getString(R.l.eQt);
          break;
        }
        this.title = ab.getContext().getString(R.l.eQq);
        this.tickerText = ab.getContext().getString(R.l.eQx);
        this.fEM = ab.getContext().getString(R.l.eQx);
        break;
      }
      if (this.type.equals("video"))
      {
        this.title = ab.getContext().getString(R.l.eQr);
        this.tickerText = ab.getContext().getString(R.l.eQx);
        this.fEM = ab.getContext().getString(R.l.eQx);
        break;
      }
      this.title = ab.getContext().getString(R.l.eQq);
      this.tickerText = ab.getContext().getString(R.l.eQw);
      this.fEM = ab.getContext().getString(R.l.eQw);
      break;
    }
    label1188:
    this.mVK.listen(this.mVL, 32);
    if (!am.isNetworkConnected(this))
    {
      w.e("MicroMsg.voipcs.VoipCSMainUI", "isNetworkAvailable false, not connected!cannot start voip cs!");
      com.tencent.mm.ui.base.h.a(this, R.l.eQz, R.l.eRl, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11274826022912L, 84004);
          paramAnonymousDialogInterface.dismiss();
          VoipCSMainUI.this.wo(9);
          GMTrace.o(11274826022912L, 84004);
        }
      });
      i = 0;
    }
    while (i == 0)
    {
      w.i("MicroMsg.voipcs.VoipCSMainUI", "can not start voip cs  by in  voip talking!");
      GMTrace.o(11278852554752L, 84034);
      return;
      if ((am.isWifi(this)) || (l.bsM()))
      {
        i = 1;
      }
      else
      {
        w.i("MicroMsg.voipcs.VoipCSMainUI", "check is not wifi network!");
        com.tencent.mm.ui.base.h.a(this, R.l.eQA, R.l.eRl, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(11274557587456L, 84002);
            w.i("MicroMsg.voipcs.VoipCSMainUI", " start voip by user choose continue call  in not wifi network!");
            l.bsL();
            if (VoipCSMainUI.a(VoipCSMainUI.this)) {
              VoipCSMainUI.b(VoipCSMainUI.this);
            }
            GMTrace.o(11274557587456L, 84002);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(11277510377472L, 84024);
            w.i("MicroMsg.voipcs.VoipCSMainUI", "cannot start voip by user choose cancel call  in not wifi network!");
            paramAnonymousDialogInterface.dismiss();
            VoipCSMainUI.this.wo(8);
            GMTrace.o(11277510377472L, 84024);
          }
        });
        i = 0;
      }
    }
    if (com.tencent.mm.plugin.voip.b.d.btT())
    {
      w.i("MicroMsg.voipcs.VoipCSMainUI", "check  is voip talking now!");
      com.tencent.mm.ui.base.h.a(this, R.l.egB, R.l.dxm, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11277778812928L, 84026);
          paramAnonymousDialogInterface.dismiss();
          VoipCSMainUI.this.wo(0);
          GMTrace.o(11277778812928L, 84026);
        }
      });
      i = 1;
    }
    while (i != 0)
    {
      w.i("MicroMsg.voipcs.VoipCSMainUI", "can not start voip cs  by in other voip talking!");
      GMTrace.o(11278852554752L, 84034);
      return;
      if (com.tencent.mm.plugin.voip.b.d.btS())
      {
        w.i("MicroMsg.voipcs.VoipCSMainUI", "check is ipCall talking now!");
        com.tencent.mm.ui.base.h.a(this, R.l.egC, R.l.dxm, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(11275362893824L, 84008);
            paramAnonymousDialogInterface.dismiss();
            VoipCSMainUI.this.wo(0);
            GMTrace.o(11275362893824L, 84008);
          }
        });
        i = 1;
      }
      else if (com.tencent.mm.p.a.vv())
      {
        w.i("MicroMsg.voipcs.VoipCSMainUI", "check is multiTalking  now!");
        com.tencent.mm.ui.base.h.a(this, R.l.egw, R.l.dxm, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(11274289152000L, 84000);
            paramAnonymousDialogInterface.dismiss();
            VoipCSMainUI.this.wo(0);
            GMTrace.o(11274289152000L, 84000);
          }
        });
        i = 1;
      }
      else if (com.tencent.mm.ar.a.JH())
      {
        w.i("MicroMsg.voipcs.VoipCSMainUI", "check is in talktRoom  now!");
        com.tencent.mm.ui.base.h.a(this, R.l.egx, R.l.dxm, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(11278584119296L, 84032);
            paramAnonymousDialogInterface.dismiss();
            VoipCSMainUI.this.wo(0);
            GMTrace.o(11278584119296L, 84032);
          }
        });
        i = 1;
      }
      else
      {
        i = 0;
      }
    }
    if (buO()) {
      buN();
    }
    GMTrace.o(11278852554752L, 84034);
  }
  
  protected void onDestroy()
  {
    int j = 2;
    GMTrace.i(11279926296576L, 84042);
    w.i("MicroMsg.voipcs.VoipCSMainUI", "onDestroy voipcs....");
    if (this.frC != null) {
      this.frC.tC();
    }
    Object localObject1 = new qb();
    Object localObject2;
    if (com.tencent.mm.plugin.voip_cs.b.b.bux().rAt == -1)
    {
      ((qb)localObject1).fOe.status = 3;
      com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject1);
      localObject1 = this.rBd;
      localObject2 = com.tencent.mm.plugin.voip_cs.b.b.buy();
      if ((((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).rod == null) || (com.tencent.mm.plugin.voip_cs.b.b.buy().rzQ != 1)) {
        break label1356;
      }
    }
    label170:
    label256:
    label400:
    label704:
    label1306:
    label1316:
    label1346:
    label1351:
    label1356:
    for (int i = ((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).rod.brK();; i = 0)
    {
      float f = ap.AT().getStreamMaxVolume(i);
      ((com.tencent.mm.plugin.voip_cs.b.c)localObject2).rAa = ((int)(ap.AT().getStreamVolume(i) / f * 100.0F));
      localObject2 = com.tencent.mm.plugin.voip_cs.b.b.buy();
      Object localObject3;
      byte[] arrayOfByte;
      if ((((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).nZE != null) && (com.tencent.mm.plugin.voip_cs.b.b.buy().rzQ == 1))
      {
        i = ((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).nZE.qC();
        ((com.tencent.mm.plugin.voip_cs.b.c)localObject2).rsc = i;
        if (((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).nZE != null) {
          ((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).nZE.qr();
        }
        if (((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).rod != null) {
          ((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).rod.brI();
        }
        this.rAy.aQq();
        if (this.rBc != null)
        {
          localObject1 = this.rBc;
          if (com.tencent.mm.plugin.voip_cs.b.b.buy().aHe == 0)
          {
            if (com.tencent.mm.plugin.voip_cs.b.b.bux().rAr >= 2) {
              break label1306;
            }
            com.tencent.mm.plugin.voip_cs.b.b.buy().aHe = 1;
          }
          ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).ruc.buh();
          ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).rud.buh();
          ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).buI();
          ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).buL();
          localObject1 = com.tencent.mm.plugin.voip_cs.b.b.bux();
          w.i("MicroMsg.voipcs.VoipCSService", "now stop service");
          ap.wT().b(823, (com.tencent.mm.ac.e)localObject1);
          ap.wT().b(455, (com.tencent.mm.ac.e)localObject1);
          ap.wT().b(818, (com.tencent.mm.ac.e)localObject1);
          ap.wT().b(795, (com.tencent.mm.ac.e)localObject1);
          ap.wT().b(285, (com.tencent.mm.ac.e)localObject1);
          ap.wT().b(312, (com.tencent.mm.ac.e)localObject1);
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).rAr = 3;
          if (((com.tencent.mm.plugin.voip_cs.b.d)localObject1).rAt != 823)
          {
            ap.wT().a(880, (com.tencent.mm.ac.e)localObject1);
            if (((com.tencent.mm.plugin.voip_cs.b.d)localObject1).rAm != 0) {
              break label1316;
            }
            i = 1;
            w.i("MicroMsg.voipcs.VoipCSService", "start netscene hangup for username:" + ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).rAs + ",inviteId：" + com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.mXj + ",csroomId:" + com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.rrK + ",roomkey:" + com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.mXh + ",reason:" + i);
            localObject2 = new com.tencent.mm.plugin.voip_cs.b.c.a(com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.mXj, com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.rrK, com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.mXh, ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).rAs, i);
            ap.wT().a((com.tencent.mm.ac.k)localObject2, 0);
          }
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).rAv.MM();
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).rAw.MM();
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).rAl = 0;
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).rzH = 0;
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).rAm = 0;
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).rAn = 0;
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).rAo = null;
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).mXq = 0;
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).rAp = 0;
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).rAr = 0;
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).rAs = "";
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).rAq = 0;
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).rAt = 0;
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).rAu = 999;
          localObject1 = com.tencent.mm.plugin.voip_cs.b.b.buw();
          w.i("MicroMsg.VoipCSEngine", "now stop engine");
          ((com.tencent.mm.plugin.voip_cs.b.b.a)localObject1).mYp.iz(true);
          localObject2 = com.tencent.mm.plugin.voip_cs.b.b.buy();
          if ((bg.mZ(((com.tencent.mm.plugin.voip_cs.b.c)localObject2).mYO)) && (bg.mZ(((com.tencent.mm.plugin.voip_cs.b.c)localObject2).mYN)))
          {
            localObject3 = com.tencent.mm.plugin.voip_cs.b.b.buw().mYp;
            if (((com.tencent.mm.plugin.voip_cs.b.c)localObject2).rzO != 1) {
              break label1346;
            }
            i = 1;
            arrayOfByte = ((v2protocal)localObject3).rtj;
            j = ((v2protocal)localObject3).rtj.length;
            if (i == 0) {
              break label1351;
            }
          }
        }
      }
      for (i = 1;; i = 0)
      {
        ((v2protocal)localObject3).getVoipcsChannelInfo(arrayOfByte, j, i);
        w.d("MicroMsg.Voip", "field_voipcsEngineInfoLength: %d", new Object[] { Integer.valueOf(((v2protocal)localObject3).field_voipcsChannelInfoLength) });
        ((com.tencent.mm.plugin.voip_cs.b.c)localObject2).mYO = new String(((v2protocal)localObject3).rtj, 0, ((v2protocal)localObject3).field_voipcsChannelInfoLength);
        localObject3 = com.tencent.mm.plugin.voip_cs.b.b.buw().mYp;
        ((v2protocal)localObject3).getVoipcsEngineInfo(((v2protocal)localObject3).rtk, ((v2protocal)localObject3).rtk.length);
        w.d("MicroMsg.Voip", "field_voipcsEngineInfoLength: %d", new Object[] { Integer.valueOf(((v2protocal)localObject3).field_voipcsEngineInfoLength) });
        localObject3 = ((v2protocal)localObject3).mXo + "," + ((v2protocal)localObject3).mXh + "," + ((v2protocal)localObject3).rrK + "," + com.tencent.mm.plugin.voip_cs.b.b.buy().rzQ + "," + ((v2protocal)localObject3).rrW + "," + ((v2protocal)localObject3).rrX + ((v2protocal)localObject3).btr() + new String(((v2protocal)localObject3).rtk, 0, ((v2protocal)localObject3).field_voipcsEngineInfoLength);
        com.tencent.mm.plugin.voip.b.a.dI("MicroMsg.Voip", "voipreport:NewEngineString:" + (String)localObject3);
        ((com.tencent.mm.plugin.voip_cs.b.c)localObject2).mYN = ((String)localObject3);
        w.d("MicroMsg.VoipCSReportHelper", "nativeChannelReportString: %s", new Object[] { ((com.tencent.mm.plugin.voip_cs.b.c)localObject2).mYO });
        w.d("MicroMsg.VoipCSReportHelper", "nativeEngineReportString: %s", new Object[] { ((com.tencent.mm.plugin.voip_cs.b.c)localObject2).mYN });
        localObject2 = com.tencent.mm.plugin.voip_cs.b.b.bux();
        ap.wT().a(312, (com.tencent.mm.ac.e)localObject2);
        localObject2 = new com.tencent.mm.plugin.voip_cs.b.c.e(com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.rrK, com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.mXh);
        ap.wT().a((com.tencent.mm.ac.k)localObject2, 0);
        ((com.tencent.mm.plugin.voip_cs.b.b.a)localObject1).mYp.reset();
        com.tencent.mm.plugin.voip.model.k.bsI().bsK();
        com.tencent.mm.plugin.voip.model.k.bsI().rqn = null;
        this.rBc = null;
        this.rBd = null;
        ap.AT().setMode(0);
        ab.getContext().unregisterReceiver(this.rpX);
        ap.AT().b(this.rBk);
        ap.AT().sl();
        if (this.rpr != null) {
          this.rpr.dh(ab.getContext());
        }
        ap.b(this.peQ);
        if (this.rBj != null) {
          this.rBj.MM();
        }
        ap.getNotification().cancel(44);
        if ((this.mVK != null) && (this.mVL != null))
        {
          this.mVK.listen(this.mVL, 0);
          this.mVL = null;
        }
        super.onDestroy();
        GMTrace.o(11279926296576L, 84042);
        return;
        if (com.tencent.mm.plugin.voip_cs.b.b.bux().rAt == 823)
        {
          ((qb)localObject1).fOe.status = 4;
          break;
        }
        if (com.tencent.mm.plugin.voip_cs.b.b.bux().rAr <= 1)
        {
          ((qb)localObject1).fOe.status = 1;
          break;
        }
        if (com.tencent.mm.plugin.voip_cs.b.b.bux().rAr < 2) {
          break;
        }
        ((qb)localObject1).fOe.status = 2;
        break;
        i = 0;
        break label170;
        com.tencent.mm.plugin.voip_cs.b.b.buy().aHe = 3;
        break label256;
        i = j;
        if (((com.tencent.mm.plugin.voip_cs.b.d)localObject1).rAm == 2) {
          break label400;
        }
        if (((com.tencent.mm.plugin.voip_cs.b.d)localObject1).rAm == 3)
        {
          i = 3;
          break label400;
        }
        i = 4;
        break label400;
        i = 0;
        break label704;
      }
    }
  }
  
  public final void onError(int paramInt)
  {
    GMTrace.i(11280328949760L, 84045);
    if (this.rBc != null)
    {
      w.d("MicroMsg.voipcs.VoipCSMainUI", "onError for errCode:" + paramInt);
      this.rBc.wr(paramInt);
    }
    GMTrace.o(11280328949760L, 84045);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(11279120990208L, 84036);
    if (paramKeyEvent.getKeyCode() == 4)
    {
      GMTrace.o(11279120990208L, 84036);
      return true;
    }
    if (paramInt == 25)
    {
      paramInt = aHF();
      ap.AT().ei(paramInt);
      GMTrace.o(11279120990208L, 84036);
      return true;
    }
    if (paramInt == 24)
    {
      paramInt = aHF();
      ap.AT().eh(paramInt);
      GMTrace.o(11279120990208L, 84036);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(11279120990208L, 84036);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(11279523643392L, 84039);
    super.onPause();
    if (!this.rAy.bsW()) {
      this.rAy.aQq();
    }
    if ((com.tencent.mm.plugin.voip_cs.b.b.bux().rAr == 1) || (com.tencent.mm.plugin.voip_cs.b.b.bux().rAr == 2))
    {
      Object localObject = new Intent(ab.getContext(), VoipCSMainUI.class);
      ((Intent)localObject).putExtra("voipCSBizId", this.rAs);
      ((Intent)localObject).putExtra("voipCSAppId", this.appId);
      ((Intent)localObject).putExtra("voipCSScene", this.fQe);
      ((Intent)localObject).putExtra("voipCSType", this.type);
      ((Intent)localObject).putExtra("voipCSAllowBackCamera", this.rBf);
      ((Intent)localObject).putExtra("voipCSShowOther", this.rBg);
      ((Intent)localObject).putExtra("voipCSAvatarUrl", this.iVM);
      ((Intent)localObject).putExtra("voipCSContext", this.rBh);
      ((Intent)localObject).putExtra("launch_from_appbrand", this.rBi);
      localObject = PendingIntent.getActivity(ab.getContext(), 44, (Intent)localObject, 134217728);
      localObject = new Notification.Builder(ab.getContext()).setTicker(this.tickerText).setWhen(System.currentTimeMillis()).setContentTitle(this.title).setContentText(this.fEM).setContentIntent((PendingIntent)localObject).setOngoing(true).getNotification();
      ((Notification)localObject).icon = com.tencent.mm.bh.a.bFQ();
      ((Notification)localObject).flags |= 0x20;
      ap.getNotification().a(44, (Notification)localObject, false);
      if ((this.rBj != null) && (this.rBj.bNt())) {
        this.rBj.w(5000L, 5000L);
      }
    }
    for (;;)
    {
      this.rBc.buI();
      this.rBc.fBD = true;
      GMTrace.o(11279523643392L, 84039);
      return;
      ap.getNotification().cancel(44);
      if (this.rBj != null) {
        this.rBj.MM();
      }
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(11280731602944L, 84048);
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0) || (paramArrayOfInt == null) || (paramArrayOfInt.length == 0))
    {
      w.e("MicroMsg.voipcs.VoipCSMainUI", "[voip_cs]onRequestPermissionsResult %d data is invalid", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(11280731602944L, 84048);
      return;
    }
    w.d("MicroMsg.voipcs.VoipCSMainUI", "[voip_cs] onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default: 
      GMTrace.o(11280731602944L, 84048);
      return;
    case 82: 
      if (paramArrayOfInt[0] == 0)
      {
        w.d("MicroMsg.voipcs.VoipCSMainUI", "granted record audio!");
        if (com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.CAMERA", 19, "", "")) {
          buN();
        }
        GMTrace.o(11280731602944L, 84048);
        return;
      }
      com.tencent.mm.ui.base.h.a(this, getString(R.l.etT), getString(R.l.etW), getString(R.l.ejv), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11276973506560L, 84020);
          VoipCSMainUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(11276973506560L, 84020);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11275094458368L, 84006);
          paramAnonymousDialogInterface.dismiss();
          VoipCSMainUI.this.wo(2);
          GMTrace.o(11275094458368L, 84006);
        }
      });
      GMTrace.o(11280731602944L, 84048);
      return;
    }
    if (paramArrayOfInt[0] == 0)
    {
      buN();
      GMTrace.o(11280731602944L, 84048);
      return;
    }
    if ("android.permission.CAMERA".equals(paramArrayOfString[0])) {}
    for (paramInt = R.l.etQ;; paramInt = R.l.etT)
    {
      com.tencent.mm.ui.base.h.a(this, getString(paramInt), getString(R.l.etW), getString(R.l.ejv), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11275899764736L, 84012);
          paramAnonymousDialogInterface.dismiss();
          VoipCSMainUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(11275899764736L, 84012);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11274020716544L, 83998);
          paramAnonymousDialogInterface.dismiss();
          VoipCSMainUI.this.wo(3);
          GMTrace.o(11274020716544L, 83998);
        }
      });
      break;
    }
  }
  
  protected void onRestart()
  {
    GMTrace.i(11279657861120L, 84040);
    w.i("MicroMsg.voipcs.VoipCSMainUI", "onRestart voipcs....");
    super.onRestart();
    if ((buO()) && (com.tencent.mm.plugin.voip_cs.b.b.bux().rAr <= 1)) {
      buN();
    }
    if (this.rBc != null) {
      this.rBc.fBD = false;
    }
    GMTrace.o(11279657861120L, 84040);
  }
  
  protected void onResume()
  {
    GMTrace.i(11279389425664L, 84038);
    w.i("MicroMsg.voipcs.VoipCSMainUI", "onResume voipcs....");
    super.onResume();
    if (this.rBc != null)
    {
      this.rBc.fBD = false;
      if (com.tencent.mm.plugin.voip_cs.b.b.bux().rAr > 1)
      {
        buN();
        if ((this.rBg != null) && (this.rBg.equals("1"))) {
          this.rBc.buK();
        }
      }
    }
    if (this.rBj != null) {
      this.rBj.MM();
    }
    ap.getNotification().cancel(44);
    GMTrace.o(11279389425664L, 84038);
  }
  
  protected void onStop()
  {
    GMTrace.i(11279792078848L, 84041);
    super.onStop();
    GMTrace.o(11279792078848L, 84041);
  }
  
  public final void wo(int paramInt)
  {
    GMTrace.i(11280194732032L, 84044);
    w.d("MicroMsg.voipcs.VoipCSMainUI", "onExitVoipCS for action:" + paramInt + ",CallingStatus:" + com.tencent.mm.plugin.voip_cs.b.b.bux().rAr);
    if (com.tencent.mm.plugin.voip_cs.b.b.bux().rAr == 0)
    {
      finish();
      GMTrace.o(11280194732032L, 84044);
      return;
    }
    if (this.rBc != null) {
      this.rBc.wr(paramInt);
    }
    GMTrace.o(11280194732032L, 84044);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/voip_cs/ui/VoipCSMainUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */