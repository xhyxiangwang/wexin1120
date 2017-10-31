package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.ipcall.a.c.a.a;
import com.tencent.mm.plugin.ipcall.a.f;
import com.tencent.mm.plugin.ipcall.a.g.a;
import com.tencent.mm.plugin.ipcall.a.g.k;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ax;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.x.ap;

@com.tencent.mm.ui.base.a(3)
public class IPCallTalkUI
  extends MMActivity
  implements j.a
{
  private String mHB;
  private String ndi;
  private String ndj;
  private String ndk;
  private String ndl;
  private int ndm;
  private int ndn;
  private j ngZ;
  
  public IPCallTalkUI()
  {
    GMTrace.i(11659494031360L, 86870);
    GMTrace.o(11659494031360L, 86870);
  }
  
  private void init()
  {
    GMTrace.i(11659896684544L, 86873);
    this.ngZ = new j(this);
    this.ngZ.nhK = this;
    j localj = this.ngZ;
    Object localObject2 = this.mHB;
    Object localObject3 = this.ndi;
    Object localObject4 = this.ndj;
    String str1 = this.ndk;
    Object localObject1 = this.ndl;
    int i = this.ndm;
    int j = this.ndn;
    localj.nhQ = localj.nhI.getIntent().getBooleanExtra("IPCallTalkUI_isFromMiniNotification", false);
    w.i("MicroMsg.TalkUIController", "onCreate, mNickname: %s, mPhoneNumber: %s, mContactId: %s, mCountryCode: %s, toUsername: %s, isFromMinimize: %b", new Object[] { localObject2, localObject3, localObject4, str1, localObject1, Boolean.valueOf(localj.nhQ) });
    localj.nhy = ((ImageView)localj.nhI.findViewById(R.h.czU));
    localj.iil = ((ImageView)localj.nhI.findViewById(R.h.czT));
    localj.nhw = ((EditText)localj.nhI.findViewById(R.h.czY));
    localj.iiq = ((TextView)localj.nhI.findViewById(R.h.cAb));
    localj.nhx = ((TextView)localj.nhI.findViewById(R.h.czZ));
    localj.nhz = ((IPCallFuncButton)localj.nhI.findViewById(R.h.czX));
    localj.nhA = ((IPCallFuncButton)localj.nhI.findViewById(R.h.czV));
    localj.nhB = ((IPCallFuncButton)localj.nhI.findViewById(R.h.cAa));
    localj.nhC = ((ImageButton)localj.nhI.findViewById(R.h.czW));
    localj.nhF = ((ImageButton)localj.nhI.findViewById(R.h.bRp));
    localj.nhD = ((TextView)localj.nhI.findViewById(R.h.cGH));
    localj.nhE = localj.nhI.findViewById(R.h.cGI);
    localj.naM = ((DialPad)localj.nhI.findViewById(R.h.bBK));
    if (localj.nhQ)
    {
      localj.mHB = i.aHl().mWy.fvS;
      localj.nhH = i.aHl().mWy.mXI;
      localj.ndl = i.aHl().mWy.fMl;
      localj.ndj = i.aHl().mWy.fOb;
      localj.ndi = i.aHl().mWy.mXH;
      localj.nhG = i.aHl().mWy.mXK;
      w.i("MicroMsg.TalkUIController", "restoreParam nickname:%s,fianlPhoneNumber:%s,toUserName:%s,contactId:%s,phoneNumber:%s,phoneType:%d", new Object[] { localj.mHB, localj.nhH, localj.ndl, localj.ndj, localj.ndi, Integer.valueOf(localj.nhG) });
      localj.aIu();
      localj.aIv();
      i.aHp();
      w.i("MicroMsg.TalkUIController", f.stateToString(i.aHp().mWi));
      localj.pr(i.aHp().mWi);
      localObject1 = i.aHl().mWy.mXI;
      localObject2 = i.aHl().mWy.mXJ;
      if (!bg.mZ((String)localObject2))
      {
        localj.Aa((String)localObject2);
        localj.nhx.setText(com.tencent.mm.plugin.ipcall.b.a.Ak((String)localObject2));
      }
      for (;;)
      {
        if (i.aHp().aHg())
        {
          localObject1 = localj.nhB;
          i.aHo();
          ((IPCallFuncButton)localObject1).setChecked(com.tencent.mm.plugin.ipcall.a.b.a.sr());
          localj.nhz.setChecked(i.aHo().mXU.kwx);
        }
        GMTrace.o(11659896684544L, 86873);
        return;
        if (!bg.mZ((String)localObject1))
        {
          localj.Aa((String)localObject1);
          localj.nhx.setText(com.tencent.mm.plugin.ipcall.b.a.Ak((String)localObject1));
        }
      }
    }
    if (i.aHp().aHf())
    {
      h.a(localj.nhI, R.l.egC, R.l.dxm, false, new j.1(localj));
      GMTrace.o(11659896684544L, 86873);
      return;
    }
    localj.aIu();
    localj.mHB = ((String)localObject2);
    localj.ndi = ((String)localObject3);
    localj.ndj = ((String)localObject4);
    localj.ndk = str1;
    localj.ndm = i;
    localj.ndn = j;
    if (!bg.mZ(localj.ndi)) {
      localj.ndi = com.tencent.mm.plugin.ipcall.b.c.Ao(localj.ndi);
    }
    if (bg.mZ(localj.ndk))
    {
      if (com.tencent.mm.plugin.ipcall.b.a.Ai(localj.ndi))
      {
        localObject2 = com.tencent.mm.plugin.ipcall.b.a.Ag(localj.ndi);
        if (bg.mZ((String)localObject2)) {
          localj.ndi = com.tencent.mm.plugin.ipcall.b.a.Aj(localj.ndi);
        }
      }
      else
      {
        localj.ndk = com.tencent.mm.plugin.ipcall.b.c.aID();
      }
    }
    else
    {
      w.i("MicroMsg.TalkUIController", "final mCountryCode: %s", new Object[] { localj.ndk });
      localObject2 = com.tencent.mm.plugin.ipcall.a.c.aGX();
      localObject3 = localj.ndk;
      if (!((com.tencent.mm.plugin.ipcall.a.c)localObject2).isInit) {
        ((com.tencent.mm.plugin.ipcall.a.c)localObject2).fh(false);
      }
      if (!bg.mZ((String)localObject3))
      {
        localObject3 = ((String)localObject3).replace("+", "");
        i.aHt().v(bg.getInt((String)localObject3, 0), bg.Pp());
        ((com.tencent.mm.plugin.ipcall.a.c)localObject2).aGZ();
      }
      if (bg.mZ(localj.mHB)) {
        localj.mHB = com.tencent.mm.plugin.ipcall.b.a.ai(localj.nhI, localj.ndi);
      }
      localj.ndl = ((String)localObject1);
      if ((bg.mZ(localj.ndk)) || (com.tencent.mm.plugin.ipcall.b.a.Ai(localj.ndi))) {
        break label1229;
      }
      localj.nhH = (localj.ndk + localj.ndi);
      if (localj.nhH.startsWith("+")) {}
    }
    label1229:
    for (localj.nhH = ("+" + localj.nhH);; localj.nhH = localj.ndi)
    {
      w.i("MicroMsg.TalkUIController", "final call mPhoneNumber: %s", new Object[] { localj.nhH });
      if (!com.tencent.mm.plugin.ipcall.a.c.aGX().pa(bg.getInt(localj.ndk, -1))) {
        break label1242;
      }
      com.tencent.mm.plugin.report.service.g.paX.z(12058, localj.ndk);
      h.a(localj.nhI, localj.nhI.getString(R.l.dEp), localj.nhI.getString(R.l.dEq), false, new j.6(localj));
      GMTrace.o(11659896684544L, 86873);
      return;
      localj.ndi = com.tencent.mm.plugin.ipcall.b.a.Al(localj.ndi);
      localj.ndk = ((String)localObject2);
      break;
    }
    label1242:
    if (!am.isNetworkConnected(localj.nhI))
    {
      Toast.makeText(localj.nhI, R.l.eRh, 1).show();
      localj.nhI.finish();
      GMTrace.o(11659896684544L, 86873);
      return;
    }
    long l1 = localj.nhI.getSharedPreferences("IPCall_LastInputPref", 0).getLong("IPCall_LastInvite", -1L);
    long l2 = System.currentTimeMillis();
    if ((l1 > l2) && (l1 != -1L))
    {
      w.i("MicroMsg.TalkUIController", "onDisasterHappen");
      h.a(localj.nhI, localj.nhI.getString(R.l.ehE, new Object[] { String.valueOf((l1 - l2) / 1000L + 1L) }), localj.nhI.getString(R.l.ehz), localj.nhI.getString(R.l.ehA), false, new j.5(localj));
      GMTrace.o(11659896684544L, 86873);
      return;
    }
    localj.aIv();
    String str2;
    String str3;
    int k;
    if ((!localj.nhQ) || (!i.aHp().aHf()))
    {
      localj.nhG = com.tencent.mm.plugin.ipcall.b.a.cC(localj.ndj, localj.ndi);
      localj.pr(1);
      localObject2 = localj.nhJ;
      localObject3 = localj.mHB;
      localObject4 = localj.ndi;
      str1 = localj.ndl;
      str2 = localj.nhH;
      str3 = localj.ndj;
      i = localj.nhG;
      j = localj.ndm;
      k = localj.ndn;
      if (!i.aHp().aHf()) {
        break label1626;
      }
      w.i("MicroMsg.IPCallManager", "startIPCall, already start!");
      w.i("MicroMsg.TalkUIController", "startLaunchTalk, callNumber: %s", new Object[] { localj.nhH });
      localObject1 = i.aHn();
      localObject2 = localj.ndk;
      w.d("MicroMsg.IPCallReportHelper", "setCountryCode: %s", new Object[] { localObject2 });
      if (!bg.mZ((String)localObject2)) {
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).countryCode = ((String)localObject2);
      }
    }
    localj.nhS = false;
    GMTrace.o(11659896684544L, 86873);
    return;
    label1626:
    w.i("MicroMsg.IPCallManager", "startIPCall");
    i.aHl().mWp = ((g.a)localObject2);
    i.aHm().mYu = ((a.a)localObject2);
    i.aHp().mWi = -1;
    ((com.tencent.mm.plugin.ipcall.c)localObject2).aqA();
    ((com.tencent.mm.plugin.ipcall.c)localObject2).mVK = ((TelephonyManager)ab.getContext().getSystemService("phone"));
    ((com.tencent.mm.plugin.ipcall.c)localObject2).mVK.listen(((com.tencent.mm.plugin.ipcall.c)localObject2).mVL, 32);
    com.tencent.mm.sdk.b.a.uLm.b(((com.tencent.mm.plugin.ipcall.c)localObject2).mVM);
    w.d("MicroMsg.IPCallRecordStorageLogic", "recordStartCall, phoneNumber: %s, contactId: %s", new Object[] { str2, str3 });
    localObject1 = new k();
    ((k)localObject1).field_phonenumber = str2;
    if (!bg.mZ(str3))
    {
      com.tencent.mm.plugin.ipcall.a.g.c localc = i.aHr().zF(str3);
      if ((localc != null) && (localc.uQF != -1L))
      {
        ((k)localObject1).field_addressId = localc.uQF;
        label1791:
        if (i == -1) {
          break label2406;
        }
        ((k)localObject1).field_phoneType = i;
        label1802:
        ((k)localObject1).field_calltime = bg.Pp();
        ((k)localObject1).field_status = 1;
        if (!i.aHs().b((com.tencent.mm.sdk.e.c)localObject1)) {
          break label2415;
        }
      }
    }
    for (;;)
    {
      ((com.tencent.mm.plugin.ipcall.c)localObject2).mVI = ((k)localObject1);
      com.tencent.mm.plugin.ipcall.c.ham.postDelayed(((com.tencent.mm.plugin.ipcall.c)localObject2).mVO, 1754L);
      ((com.tencent.mm.plugin.ipcall.c)localObject2).mVJ = false;
      localObject1 = i.aHn();
      w.d("MicroMsg.IPCallReportHelper", "reset");
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mYw = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mYx = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mYy = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mYz = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mYA = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mYB = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mYC = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mYD = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mYE = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mYF = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mXg = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mXh = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mYG = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).ilw = "";
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mYH = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mYI = "";
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mYK = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mYJ = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mVR = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mYL = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mYM = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mYR = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mYQ = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mYN = "";
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mYO = "";
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).countryCode = "";
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mYS = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mYT = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mYU = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mYV = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mYW = 0;
      i.aHp().mWi = -1;
      w.d("MicroMsg.IPCallManager", "startIPCall, username: %s, phoneNumber: %s", new Object[] { str1, str2 });
      localObject1 = i.aHl();
      w.d("MicroMsg.IPCallSvrLogic", "startIPCall, toUsername: %s, toPhoneNumber: %s", new Object[] { str1, str2 });
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).fJI = false;
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).mWz = false;
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).mWk = 0;
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).mWl = 0;
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).mWm = 0;
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).mWn = false;
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).mWo = false;
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).mWA = false;
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).mWy = new com.tencent.mm.plugin.ipcall.a.a.c();
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).mWy.fvS = ((String)localObject3);
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).mWy.mXH = ((String)localObject4);
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).mWy.fOb = str3;
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).mWy.mXI = str2;
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).mWy.fMl = str1;
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).mWy.mXj = ((int)System.currentTimeMillis());
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).mWy.mXk = j;
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).mWy.mXl = k;
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).mWy.mXK = i;
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).mWq.a(((com.tencent.mm.plugin.ipcall.a.g)localObject1).mWy);
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).mWv.a(((com.tencent.mm.plugin.ipcall.a.g)localObject1).mWy);
      w.i("MicroMsg.IPCallSvrLogic", "startIPCallInternal, inviteId: %d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.g)localObject1).mWy.mXj) });
      i.aHp().pb(1);
      localObject1 = i.aHm();
      if (!((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).mYt) {
        break label2421;
      }
      w.d("MicroMsg.IPCallEngineManager", "already start engine");
      com.tencent.mm.plugin.ipcall.c.ham.removeCallbacks(((com.tencent.mm.plugin.ipcall.c)localObject2).mVN);
      com.tencent.mm.plugin.ipcall.c.ham.postDelayed(((com.tencent.mm.plugin.ipcall.c)localObject2).mVN, 60000L);
      break;
      ((k)localObject1).field_addressId = -1L;
      break label1791;
      ((k)localObject1).field_addressId = -1L;
      break label1791;
      label2406:
      ((k)localObject1).field_phoneType = -1;
      break label1802;
      label2415:
      localObject1 = null;
    }
    label2421:
    ((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).aHI();
    w.i("MicroMsg.IPCallEngineManager", "start engine");
    if (((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).mYp.nQI)
    {
      ((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).mYp.iz(false);
      ((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).mYp.reset();
    }
    ((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).mYp.rrJ = 1;
    l1 = System.currentTimeMillis();
    localObject3 = ((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).mYp;
    ((v2protocal)localObject3).netType = com.tencent.mm.plugin.voip.b.a.getNetType(ab.getContext());
    if (((v2protocal)localObject3).netType == 5) {
      ((v2protocal)localObject3).netType = 4;
    }
    ((v2protocal)localObject3).rsC = new int[((v2protocal)localObject3).defaultWidth * ((v2protocal)localObject3).defaultHeight];
    ap.AS();
    ((v2protocal)localObject3).rrH = com.tencent.mm.x.c.wy();
    i = com.tencent.mm.compatible.d.l.sP();
    if ((i & 0x400) != 0)
    {
      com.tencent.mm.compatible.loader.d.u(ab.getContext(), "libvoipCodec_v7a.so");
      com.tencent.mm.plugin.voip.b.a.dJ("MicroMsg.Voip", "dlopen /data/data/com.tencent.mm/lib/libvoipCodec_v7a.so... ");
    }
    for (;;)
    {
      j = Build.VERSION.SDK_INT;
      k = OpenGlRender.bug();
      localObject4 = ((WindowManager)ab.getContext().getSystemService("window")).getDefaultDisplay();
      int m = ((Display)localObject4).getWidth();
      int n = ((Display)localObject4).getHeight();
      i = ((v2protocal)localObject3).init(((v2protocal)localObject3).netType, 65538, ((v2protocal)localObject3).defaultWidth << 16 | ((v2protocal)localObject3).defaultHeight, m << 16 | n, ((v2protocal)localObject3).rrH, i | j << 16 | k << 24, com.tencent.mm.compatible.util.e.gZO + "app_lib/", 4);
      com.tencent.mm.plugin.voip.b.a.dJ("MicroMsg.Voip", "protocal init ret :" + i + ",uin= " + ((v2protocal)localObject3).rrH);
      ((v2protocal)localObject3).nQI = true;
      if (i < 0) {
        ((v2protocal)localObject3).reset();
      }
      w.d("MicroMsg.IPCallEngineManager", "protocal init finish, ret: %d, used %dms", new Object[] { Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - l1) });
      if ((((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).mYp.field_capInfo != null) && (((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).mYp.exchangeCabInfo(((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).mYp.field_capInfo, ((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).mYp.field_capInfo.length) < 0))
      {
        w.e("MicroMsg.IPCallEngineManager", "exchangeCabInfo failed");
        i.aHn().mYF = 24;
      }
      if (i < 0) {
        w.e("MicroMsg.IPCallEngineManager", "engine init failed!");
      }
      ((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).mYp.rrJ = 1;
      ((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).mYt = true;
      break;
      if ((i & 0x200) != 0)
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
  
  protected final int Qb()
  {
    GMTrace.i(11659628249088L, 86871);
    GMTrace.o(11659628249088L, 86871);
    return 1;
  }
  
  public final void fz(boolean paramBoolean)
  {
    GMTrace.i(11660299337728L, 86876);
    if (!paramBoolean)
    {
      GMTrace.o(11660299337728L, 86876);
      return;
    }
    com.tencent.mm.sdk.platformtools.af.i(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11659091378176L, 86867);
        Intent localIntent = new Intent();
        IPCallTalkUI.this.setResult(-1, localIntent);
        IPCallTalkUI.this.finish();
        GMTrace.o(11659091378176L, 86867);
      }
    }, 3000L);
    GMTrace.o(11660299337728L, 86876);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11660165120000L, 86875);
    int i = R.i.cXT;
    GMTrace.o(11660165120000L, 86875);
    return i;
  }
  
  public void onBackPressed()
  {
    GMTrace.i(11660433555456L, 86877);
    GMTrace.o(11660433555456L, 86877);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11659762466816L, 86872);
    super.onCreate(paramBundle);
    cO().cP().hide();
    getWindow().addFlags(6946944);
    this.mHB = getIntent().getStringExtra("IPCallTalkUI_nickname");
    this.ndi = getIntent().getStringExtra("IPCallTalkUI_phoneNumber");
    this.ndj = getIntent().getStringExtra("IPCallTalkUI_contactId");
    this.ndk = getIntent().getStringExtra("IPCallTalkUI_countryCode");
    this.ndl = getIntent().getStringExtra("IPCallTalkUI_toWechatUsername");
    this.ndm = getIntent().getIntExtra("IPCallTalkUI_dialScene", 0);
    this.ndn = getIntent().getIntExtra("IPCallTalkUI_countryType", 0);
    w.i("MicroMsg.IPCallTalkUI", "onCreate, mNickname: %s, mPhoneNumber: %s, mContactId: %s, mCountryCode: %s, toUsername:%s, mDialScene:%d ,mCountryType:%d", new Object[] { this.mHB, this.ndi, this.ndj, this.ndk, this.ndl, Integer.valueOf(this.ndm), Integer.valueOf(this.ndn) });
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.RECORD_AUDIO", 80, null, null);
    w.i("MicroMsg.IPCallTalkUI", "summerper checkPermission checkMicrophone[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bg.bOd() });
    if (!bool)
    {
      GMTrace.o(11659762466816L, 86872);
      return;
    }
    init();
    GMTrace.o(11659762466816L, 86872);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11660030902272L, 86874);
    super.onDestroy();
    dq(true);
    if (this.ngZ != null)
    {
      j localj = this.ngZ;
      w.i("MicroMsg.TalkUIController", "onDestroy");
      localj.nhJ.mVH = null;
      i.aHo().fsU = null;
      i.aHo().mXZ = null;
      i.aHo().a(null);
      Object localObject = i.aHo();
      ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mXV.mYm = null;
      localObject = ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mXV;
      ((com.tencent.mm.plugin.ipcall.a.b.d)localObject).kha.bNK();
      ((com.tencent.mm.plugin.ipcall.a.b.d)localObject).khe.bNL();
      localj.nhI = null;
      localj.nhK = null;
    }
    GMTrace.o(11660030902272L, 86874);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(11660567773184L, 86878);
    if (this.ngZ != null)
    {
      int i;
      if (i.aHp().aHg()) {
        if (paramInt == 25)
        {
          i = i.aHo().aHF();
          if (i == -1) {
            break label97;
          }
          ap.AT().ei(i);
          i = 1;
        }
      }
      while (i != 0)
      {
        GMTrace.o(11660567773184L, 86878);
        return true;
        if (paramInt == 24)
        {
          i = i.aHo().aHF();
          if (i != -1)
          {
            ap.AT().eh(i);
            i = 1;
            continue;
          }
        }
        label97:
        i = 0;
      }
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(11660567773184L, 86878);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(11660701990912L, 86879);
    w.d("MicroMsg.IPCallTalkUI", "onPause");
    super.onPause();
    if (this.ngZ != null) {
      w.d("MicroMsg.TalkUIController", "onPause");
    }
    GMTrace.o(11660701990912L, 86879);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(11660970426368L, 86881);
    w.i("MicroMsg.IPCallTalkUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(11660970426368L, 86881);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        init();
        GMTrace.o(11660970426368L, 86881);
        return;
      }
      h.a(this, getString(R.l.etT), getString(R.l.etW), getString(R.l.ejv), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11692243156992L, 87114);
          paramAnonymousDialogInterface.dismiss();
          IPCallTalkUI.this.finish();
          IPCallTalkUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(11692243156992L, 87114);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11631576743936L, 86662);
          paramAnonymousDialogInterface.dismiss();
          IPCallTalkUI.this.finish();
          GMTrace.o(11631576743936L, 86662);
        }
      });
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(11660836208640L, 86880);
    w.d("MicroMsg.IPCallTalkUI", "onResume");
    super.onResume();
    if (this.ngZ != null)
    {
      w.d("MicroMsg.TalkUIController", "onResume");
      ap.getNotification().cancel(42);
    }
    GMTrace.o(11660836208640L, 86880);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/IPCallTalkUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */