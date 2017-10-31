package com.tencent.mm.plugin.ipcall;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.b.e.a;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.g.a.rw;
import com.tencent.mm.plugin.ipcall.a.b.a.1;
import com.tencent.mm.plugin.ipcall.a.b.b.a;
import com.tencent.mm.plugin.ipcall.a.b.c.a;
import com.tencent.mm.plugin.ipcall.a.f;
import com.tencent.mm.plugin.ipcall.a.g.a;
import com.tencent.mm.plugin.ipcall.a.g.l;
import com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI;
import com.tencent.mm.plugin.ipcall.ui.j;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver.a;
import com.tencent.mm.plugin.voip.model.k.a;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.plugin.voip.video.h.7;
import com.tencent.mm.plugin.voip.video.h.8;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.af;
import com.tencent.mm.x.ap;

public final class c
  implements com.tencent.mm.plugin.ipcall.a.c.a.a, g.a, k.a
{
  public static ae ham;
  private aj fnS;
  public Object lOy;
  public e mVH;
  public com.tencent.mm.plugin.ipcall.a.g.k mVI;
  public boolean mVJ;
  public TelephonyManager mVK;
  public PhoneStateListener mVL;
  public com.tencent.mm.sdk.b.c mVM;
  public Runnable mVN;
  public Runnable mVO;
  public boolean mVP;
  public com.tencent.mm.plugin.voip.ui.a mVQ;
  private long mVR;
  
  static
  {
    GMTrace.i(11735595483136L, 87437);
    ham = new ae(Looper.getMainLooper());
    GMTrace.o(11735595483136L, 87437);
  }
  
  public c()
  {
    GMTrace.i(11731703169024L, 87408);
    this.mVJ = false;
    this.lOy = new Object();
    this.mVL = new PhoneStateListener()
    {
      public final void onCallStateChanged(int paramAnonymousInt, String paramAnonymousString)
      {
        GMTrace.i(11743916982272L, 87499);
        super.onCallStateChanged(paramAnonymousInt, paramAnonymousString);
        w.d("MicroMsg.IPCallManager", "onCallStateChanged " + paramAnonymousInt);
        if (paramAnonymousInt == 2)
        {
          w.i("MicroMsg.IPCallManager", "system phone call state offhook, stop call");
          c.this.cl(0, 0);
        }
        GMTrace.o(11743916982272L, 87499);
      }
    };
    this.mVM = new com.tencent.mm.sdk.b.c() {};
    this.mVN = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14297946128384L, 106528);
        if (!com.tencent.mm.plugin.ipcall.a.i.aHp().aHi())
        {
          w.i("MicroMsg.IPCallManager", "timeout! still not accept!");
          if (c.this.cl(9, 12)) {
            c.this.c(9, null, ab.getContext().getString(R.l.dEr), 2);
          }
        }
        GMTrace.o(14297946128384L, 106528);
      }
    };
    this.mVO = new Runnable()
    {
      public final void run()
      {
        int i = 0;
        GMTrace.i(11621644632064L, 86588);
        com.tencent.mm.plugin.voip.video.h localh = com.tencent.mm.plugin.ipcall.a.i.aHv();
        int j = R.k.doL;
        localh.ryf = 0;
        if (j == 0)
        {
          localh.iF(true);
          GMTrace.o(11621644632064L, 86588);
          return;
        }
        if (3500L != -1L) {
          try
          {
            ap.AS();
            bool = ((Boolean)com.tencent.mm.x.c.xi().get(73218, Boolean.valueOf(true))).booleanValue();
            if ((!bool) || (localh.fji)) {}
          }
          catch (Exception localException2)
          {
            for (;;)
            {
              try
              {
                localh.ryg = System.currentTimeMillis();
                localh.rye = new com.tencent.mm.compatible.b.i();
                w.d("MicroMsg.RingPlayer", "isBluetoothOn: %b, isHeadsetPlugged: %b", new Object[] { Boolean.valueOf(ap.AT().sm()), Boolean.valueOf(ap.AT().ss()) });
                if (p.gJc.gGr >= 0) {
                  i = p.gJc.gGr;
                }
                localh.iE(false);
                localh.a(j, 3500L, true, i);
                localh.fji = true;
                GMTrace.o(11621644632064L, 86588);
                return;
              }
              catch (Exception localException1)
              {
                boolean bool;
                w.e("MicroMsg.RingPlayer", "new MediaPlayer failed, " + localException1.toString());
              }
              localException2 = localException2;
              w.e("MicroMsg.RingPlayer", "get voip sound failed: " + localException2.getMessage());
              bool = true;
            }
            GMTrace.o(11621644632064L, 86588);
            return;
          }
        }
        localException1.l(j, 2, true);
        GMTrace.o(11621644632064L, 86588);
      }
    };
    this.mVQ = new com.tencent.mm.plugin.voip.ui.a()
    {
      public final void a(Intent paramAnonymousIntent, com.tencent.mm.plugin.voip.ui.h paramAnonymoush)
      {
        GMTrace.i(14298214563840L, 106530);
        if (!com.tencent.mm.plugin.ipcall.a.i.aHp().aHi())
        {
          paramAnonymoush.IY(ab.getContext().getString(R.l.eqG));
          GMTrace.o(14298214563840L, 106530);
          return;
        }
        int i = c.this.aGN();
        paramAnonymoush.IZ(String.format("%02d:%02d", new Object[] { Integer.valueOf(i / 60), Integer.valueOf(i % 60) }));
        GMTrace.o(14298214563840L, 106530);
      }
      
      public final boolean aGP()
      {
        GMTrace.i(14298080346112L, 106529);
        if (com.tencent.mm.plugin.ipcall.a.i.aHp().aHf())
        {
          GMTrace.o(14298080346112L, 106529);
          return true;
        }
        GMTrace.o(14298080346112L, 106529);
        return false;
      }
    };
    this.mVR = 0L;
    GMTrace.o(11731703169024L, 87408);
  }
  
  private boolean E(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(11731971604480L, 87410);
    ??? = com.tencent.mm.plugin.ipcall.a.i.aHl().mWy;
    if (!com.tencent.mm.plugin.ipcall.a.i.aHp().pb(paramInt1))
    {
      w.i("MicroMsg.IPCallManager", "finishIPCall, cannot finish now, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aHp().mWi) });
      if (??? != null) {
        w.i("MicroMsg.IPCallManager", "finishIPCall, cannot finish now inviteId:%d, roomId:%d, state:%d,errStatus:%d, pstnErrCode:%d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.a.c)???).mXj), Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.a.c)???).mXg), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      }
      GMTrace.o(11731971604480L, 87410);
      return false;
    }
    if (??? != null) {
      w.i("MicroMsg.IPCallManager", "finishIPCall inviteId:%d, roomId:%d, state:%d, errStatus:%d, pstnErrCode:%d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.a.c)???).mXj), Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.a.c)???).mXg), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    }
    w.i("MicroMsg.IPCallManager", "closeDeviceEngine");
    com.tencent.mm.plugin.voip.model.k.bsI().bsK();
    com.tencent.mm.plugin.voip.model.k.bsI().rqn = null;
    ??? = com.tencent.mm.plugin.ipcall.a.i.aHn();
    ??? = com.tencent.mm.plugin.ipcall.a.i.aHo();
    label326:
    Object localObject6;
    if (((com.tencent.mm.plugin.ipcall.a.b.b)???).mXU != null)
    {
      ??? = ((com.tencent.mm.plugin.ipcall.a.b.b)???).mXU;
      if (((com.tencent.mm.plugin.ipcall.a.b.c)???).mYd != null)
      {
        i = ((com.tencent.mm.plugin.ipcall.a.b.c)???).mYd.fqv;
        if (((com.tencent.mm.plugin.ipcall.a.c.b)???).mYT == 0) {
          ((com.tencent.mm.plugin.ipcall.a.c.b)???).mYT = i;
        }
        ??? = com.tencent.mm.plugin.ipcall.a.i.aHn();
        ??? = com.tencent.mm.plugin.ipcall.a.i.aHo();
        if (((com.tencent.mm.plugin.ipcall.a.b.b)???).mXT == null) {
          break label1727;
        }
        ??? = ((com.tencent.mm.plugin.ipcall.a.b.b)???).mXT;
        if (((com.tencent.mm.plugin.ipcall.a.b.a)???).mXN == null) {
          break label1721;
        }
        w.d("MicroMsg.IPCallAudioPlayer", "AudioPlayer  mAudioPlayErrState:" + ((com.tencent.mm.plugin.ipcall.a.b.a)???).mXN.brJ());
        i = ((com.tencent.mm.plugin.ipcall.a.b.a)???).mXN.brJ();
        if (((com.tencent.mm.plugin.ipcall.a.c.b)???).mYU == 0) {
          ((com.tencent.mm.plugin.ipcall.a.c.b)???).mYU = i;
        }
        ??? = com.tencent.mm.plugin.ipcall.a.i.aHo();
        ??? = com.tencent.mm.plugin.ipcall.a.i.aHm();
        i = 0;
        if (((com.tencent.mm.plugin.ipcall.a.b.b)???).mXT != null)
        {
          localObject6 = ((com.tencent.mm.plugin.ipcall.a.b.b)???).mXT;
          if ((((com.tencent.mm.plugin.ipcall.a.b.a)localObject6).mXN == null) || (!((com.tencent.mm.plugin.ipcall.a.b.a)localObject6).fGc)) {
            break label1733;
          }
          i = ((com.tencent.mm.plugin.ipcall.a.b.a)localObject6).mXN.brK();
        }
        label395:
        if (i != -1) {
          break label1739;
        }
        i = 0;
        label404:
        ((com.tencent.mm.plugin.ipcall.a.c.a)???).mYp.rsj = i;
        ((com.tencent.mm.plugin.ipcall.a.b.b)???).hWD.tC();
        localObject6 = ((com.tencent.mm.plugin.ipcall.a.b.b)???).mXT;
        if (((com.tencent.mm.plugin.ipcall.a.b.a)localObject6).fGc) {
          w.i("MicroMsg.IPCallAudioPlayer", "stopPlay");
        }
        synchronized (((com.tencent.mm.plugin.ipcall.a.b.a)localObject6).mXO)
        {
          com.tencent.mm.sdk.f.e.post(new com.tencent.mm.plugin.ipcall.a.b.a.a((com.tencent.mm.plugin.ipcall.a.b.a)localObject6, ((com.tencent.mm.plugin.ipcall.a.b.a)localObject6).mXN), "IPCallAudioPlayer_stop");
          ((com.tencent.mm.plugin.ipcall.a.b.a)localObject6).fGc = false;
          ((com.tencent.mm.plugin.ipcall.a.b.a)localObject6).mXN = null;
          ((com.tencent.mm.plugin.ipcall.a.b.b)???).fsU = null;
          ((com.tencent.mm.plugin.ipcall.a.b.b)???).mXW.dh(ab.getContext());
          ap.AT().sl();
          ap.AT().b((e.a)???);
          ((com.tencent.mm.plugin.ipcall.a.b.b)???).mXZ = null;
          ((com.tencent.mm.plugin.ipcall.a.b.b)???).mXX = null;
          ??? = com.tencent.mm.plugin.ipcall.a.i.aHo();
          localObject6 = ((com.tencent.mm.plugin.ipcall.a.b.b)???).mXU;
          if (((com.tencent.mm.plugin.ipcall.a.b.c)localObject6).fGc) {
            w.i("MicroMsg.IPCallRecorder", "stop record");
          }
        }
      }
    }
    for (;;)
    {
      synchronized (((com.tencent.mm.plugin.ipcall.a.b.c)localObject6).mYe)
      {
        if (((com.tencent.mm.plugin.ipcall.a.b.c)localObject6).mYd != null)
        {
          com.tencent.mm.sdk.f.e.post(new c.a((com.tencent.mm.plugin.ipcall.a.b.c)localObject6, ((com.tencent.mm.plugin.ipcall.a.b.c)localObject6).mYd), "IPCallRecorder_stopRecord");
          ((com.tencent.mm.plugin.ipcall.a.b.c)localObject6).mYd = null;
          ((com.tencent.mm.plugin.ipcall.a.b.c)localObject6).fGc = false;
          ((com.tencent.mm.plugin.ipcall.a.b.c)localObject6).kwx = false;
        }
        ((com.tencent.mm.plugin.ipcall.a.b.b)???).fsU = null;
        ??? = com.tencent.mm.plugin.ipcall.a.i.aHm();
        w.i("MicroMsg.IPCallEngineManager", "close engine");
        ((com.tencent.mm.plugin.ipcall.a.c.a)???).mYp.iz(true);
        ??? = com.tencent.mm.plugin.ipcall.a.i.aHn();
        boolean bool;
        if ((bg.mZ(((com.tencent.mm.plugin.ipcall.a.c.b)???).mYO)) && (bg.mZ(((com.tencent.mm.plugin.ipcall.a.c.b)???).mYN)))
        {
          Object localObject7 = com.tencent.mm.plugin.ipcall.a.i.aHl().mWy;
          localObject6 = com.tencent.mm.plugin.ipcall.a.i.aHm().mYp;
          if (((com.tencent.mm.plugin.ipcall.a.c.b)???).mYD == 1)
          {
            i = 1;
            int j = ((com.tencent.mm.plugin.ipcall.a.a.c)localObject7).mXC;
            localObject7 = ((v2protocal)localObject6).rth;
            int k = ((v2protocal)localObject6).rth.length;
            if (i == 0) {
              break label1794;
            }
            i = 1;
            ((v2protocal)localObject6).getPstnChannelInfo((byte[])localObject7, k, i, j);
            w.d("MicroMsg.Voip", "field_pstnChannelInfoLength: %d", new Object[] { Integer.valueOf(((v2protocal)localObject6).field_pstnChannelInfoLength) });
            ((com.tencent.mm.plugin.ipcall.a.c.b)???).mYO = new String(((v2protocal)localObject6).rth, 0, ((v2protocal)localObject6).field_pstnChannelInfoLength);
            localObject6 = com.tencent.mm.plugin.ipcall.a.i.aHm().mYp;
            ((v2protocal)localObject6).getPstnEngineInfo(((v2protocal)localObject6).rti, ((v2protocal)localObject6).rti.length);
            w.d("MicroMsg.Voip", "field_pstnEngineInfoLength: %d", new Object[] { Integer.valueOf(((v2protocal)localObject6).field_pstnEngineInfoLength) });
            ((com.tencent.mm.plugin.ipcall.a.c.b)???).mYN = new String(((v2protocal)localObject6).rti, 0, ((v2protocal)localObject6).field_pstnEngineInfoLength);
            localObject6 = com.tencent.mm.plugin.ipcall.a.i.aHm().mYp;
            i = v2protocal.rfw;
            ((com.tencent.mm.plugin.ipcall.a.c.b)???).mYP = (v2protocal.btp() + "," + ((v2protocal)localObject6).rsk + "," + (i & 0xFF) + ((v2protocal)localObject6).btu() + "," + ((v2protocal)localObject6).rsj);
            w.d("MicroMsg.IPCallReportHelper", "nativeChannelReportString: %s", new Object[] { ((com.tencent.mm.plugin.ipcall.a.c.b)???).mYO });
            w.d("MicroMsg.IPCallReportHelper", "nativeEngineReportString: %s", new Object[] { ((com.tencent.mm.plugin.ipcall.a.c.b)???).mYN });
            w.d("MicroMsg.IPCallReportHelper", "clientReportExString: %s", new Object[] { ((com.tencent.mm.plugin.ipcall.a.c.b)???).mYP });
          }
        }
        else
        {
          ((com.tencent.mm.plugin.ipcall.a.c.a)???).mYp.reset();
          ((com.tencent.mm.plugin.ipcall.a.c.a)???).aHI();
          com.tencent.mm.plugin.ipcall.a.i.aHv().stop();
          ??? = com.tencent.mm.plugin.ipcall.a.i.aHv();
          i = R.k.dqe;
          com.tencent.mm.plugin.ipcall.a.i.aHo();
          bool = ap.AT().gFp.isSpeakerphoneOn();
          ((com.tencent.mm.plugin.voip.video.h)???).mContext.getSharedPreferences(ab.bNa(), 0).getBoolean("settings_shake", true);
          ap.AT().setSpeakerphoneOn(bool);
          if (!bool) {
            break label1800;
          }
          ap.AT().setMode(0);
          ((com.tencent.mm.plugin.voip.video.h)???).ryh = System.currentTimeMillis();
          ??? = new com.tencent.mm.compatible.b.i();
        }
        try
        {
          ((MediaPlayer)???).setDataSource(((com.tencent.mm.plugin.voip.video.h)???).mContext, Uri.parse("android.resource://" + ((com.tencent.mm.plugin.voip.video.h)???).mContext.getPackageName() + "/" + i));
          ((MediaPlayer)???).setOnCompletionListener(new h.7((com.tencent.mm.plugin.voip.video.h)???));
          ((MediaPlayer)???).setOnErrorListener(new h.8((com.tencent.mm.plugin.voip.video.h)???));
          if (ap.AT().sm()) {
            break label2317;
          }
          if (bool) {
            break label1810;
          }
        }
        catch (Throwable localThrowable)
        {
          long l2;
          long l3;
          float f;
          w.w("MicroMsg.RingPlayer", "playSound Failed Throwable t = ", new Object[] { localThrowable });
          ((com.tencent.mm.plugin.voip.video.h)localObject2).ryf = 6;
          ((MediaPlayer)localObject5).stop();
          ((MediaPlayer)localObject5).release();
          continue;
          if (paramInt1 != 12) {
            break label1956;
          }
          com.tencent.mm.plugin.ipcall.a.i.aHl().aHj();
          com.tencent.mm.plugin.ipcall.a.i.aHn().aHK();
          if (paramInt2 != 11) {
            break label1891;
          }
          com.tencent.mm.plugin.ipcall.a.g.m.b(this.mVI);
          continue;
          Object localObject3 = this.mVI;
          if (localObject3 == null) {
            continue;
          }
          w.d("MicroMsg.IPCallRecordStorageLogic", "recordCallFailed, localId: %d", new Object[] { Long.valueOf(((com.tencent.mm.plugin.ipcall.a.g.k)localObject3).uQF) });
          if (((com.tencent.mm.plugin.ipcall.a.g.k)localObject3).uQF == -1L) {
            continue;
          }
          ((com.tencent.mm.plugin.ipcall.a.g.k)localObject3).field_status = 6;
          com.tencent.mm.plugin.ipcall.a.i.aHs().a((com.tencent.mm.plugin.ipcall.a.g.k)localObject3);
          continue;
          if (paramInt1 != 9) {
            break label1992;
          }
          com.tencent.mm.plugin.ipcall.a.i.aHl().pc(1);
          com.tencent.mm.plugin.ipcall.a.i.aHn().aHJ();
          com.tencent.mm.plugin.ipcall.a.g.m.a(this.mVI, com.tencent.mm.plugin.ipcall.a.i.aHn().mYE);
          continue;
          if (paramInt1 != 10) {
            break label2112;
          }
          com.tencent.mm.plugin.ipcall.a.i.aHl().pc(1);
          localObject3 = com.tencent.mm.plugin.ipcall.a.i.aHn();
          w.i("MicroMsg.IPCallReportHelper", "otherSideUserShutdown");
          ((com.tencent.mm.plugin.ipcall.a.c.b)localObject3).mYy = 1;
          localObject3 = this.mVI;
          long l1 = com.tencent.mm.plugin.ipcall.a.i.aHn().mYE;
          if (localObject3 == null) {
            continue;
          }
          w.d("MicroMsg.IPCallRecordStorageLogic", "recordOthersideShutdownCall, localId: %d, talkTime: %d", new Object[] { Long.valueOf(((com.tencent.mm.plugin.ipcall.a.g.k)localObject3).uQF), Long.valueOf(l1) });
          if (((com.tencent.mm.plugin.ipcall.a.g.k)localObject3).uQF == -1L) {
            continue;
          }
          ((com.tencent.mm.plugin.ipcall.a.g.k)localObject3).field_status = 5;
          ((com.tencent.mm.plugin.ipcall.a.g.k)localObject3).field_duration = l1;
          com.tencent.mm.plugin.ipcall.a.i.aHs().a((com.tencent.mm.plugin.ipcall.a.g.k)localObject3);
          continue;
          if (paramInt1 != 11) {
            continue;
          }
          if (paramInt2 != 5) {
            break label2153;
          }
          com.tencent.mm.plugin.ipcall.a.i.aHl().pc(3);
          for (;;)
          {
            com.tencent.mm.plugin.ipcall.a.i.aHn().aHJ();
            if (paramInt2 != 11) {
              break label2179;
            }
            com.tencent.mm.plugin.ipcall.a.g.m.b(this.mVI);
            break;
            if (paramInt2 == 11) {
              com.tencent.mm.plugin.ipcall.a.i.aHl().pc(1);
            } else {
              com.tencent.mm.plugin.ipcall.a.i.aHl().pc(2);
            }
          }
          com.tencent.mm.plugin.ipcall.a.g.m.a(this.mVI, com.tencent.mm.plugin.ipcall.a.i.aHn().mYE);
          continue;
          if (l3 - l2 >= 1800L) {
            break label2220;
          }
          w.i("MicroMsg.IPCallPluginUtil", "tryShowFeedbackDialog not reach INTERVAL_TIMES_TRY_SHOW_WCO_FEEDBACK_MAIN");
          continue;
          ap.AS();
          com.tencent.mm.x.c.xi().a(w.a.uWL, Integer.valueOf(paramInt1 + 1));
          ap.AS();
          com.tencent.mm.x.c.xi().a(w.a.uWK, Long.valueOf(l3));
          Intent localIntent = new Intent();
          localIntent.putExtra("IPCallFeedbackDialogUI_KRoomId", paramInt2);
          localIntent.putExtra("IPCallFeedbackDialogUI_KCallseq", l1);
          com.tencent.mm.bi.d.b((Context)localObject3, "ipcall", ".ui.IPCallFeedbackDialogUI", localIntent);
          continue;
          w.e("MicroMsg.IPCallManager", "roomId = 0,ignore feedback");
          continue;
          continue;
          i = 0;
          continue;
        }
        ((MediaPlayer)???).setAudioStreamType(i);
        ((MediaPlayer)???).prepare();
        ((MediaPlayer)???).setLooping(false);
        ((MediaPlayer)???).start();
        if (System.currentTimeMillis() - ((com.tencent.mm.plugin.voip.video.h)???).ryh > 2000L) {
          ((com.tencent.mm.plugin.voip.video.h)???).ryf = 7;
        }
        ham.removeCallbacks(this.mVO);
        ham.removeCallbacks(this.mVN);
        if (this.fnS != null)
        {
          this.fnS.MM();
          this.fnS = null;
        }
        com.tencent.mm.plugin.ipcall.a.i.aHn().mYF = paramInt3;
        ??? = com.tencent.mm.plugin.ipcall.a.i.aHn();
        w.d("MicroMsg.IPCallReportHelper", "markEndTalk");
        if ((((com.tencent.mm.plugin.ipcall.a.c.b)???).mYM == 0L) && (((com.tencent.mm.plugin.ipcall.a.c.b)???).mYL != 0L))
        {
          ((com.tencent.mm.plugin.ipcall.a.c.b)???).mYM = System.currentTimeMillis();
          ((com.tencent.mm.plugin.ipcall.a.c.b)???).mYE = ((((com.tencent.mm.plugin.ipcall.a.c.b)???).mYM - ((com.tencent.mm.plugin.ipcall.a.c.b)???).mYL) / 1000L);
          w.d("MicroMsg.IPCallReportHelper", "callTime: %d", new Object[] { Long.valueOf(((com.tencent.mm.plugin.ipcall.a.c.b)???).mYE) });
        }
        if (paramInt1 != 8) {
          break label1856;
        }
        com.tencent.mm.plugin.ipcall.a.i.aHl().aHj();
        com.tencent.mm.plugin.ipcall.a.i.aHn().aHK();
        ??? = this.mVI;
        if (??? != null)
        {
          w.d("MicroMsg.IPCallRecordStorageLogic", "recordCancelCall, localId: %d", new Object[] { Long.valueOf(((com.tencent.mm.plugin.ipcall.a.g.k)???).uQF) });
          if (((com.tencent.mm.plugin.ipcall.a.g.k)???).uQF != -1L)
          {
            ((com.tencent.mm.plugin.ipcall.a.g.k)???).field_status = 2;
            com.tencent.mm.plugin.ipcall.a.i.aHs().a((com.tencent.mm.plugin.ipcall.a.g.k)???);
          }
        }
        if (com.tencent.mm.plugin.ipcall.a.i.aHl().fJI)
        {
          if ((this.mVP) || (com.tencent.mm.plugin.ipcall.a.i.aHl().mWy.mXg == 0) || (com.tencent.mm.plugin.ipcall.a.i.aHl().mWy.mXi == 0L)) {
            break label2303;
          }
          ??? = ab.getContext();
          paramInt2 = com.tencent.mm.plugin.ipcall.a.i.aHl().mWy.mXg;
          l1 = com.tencent.mm.plugin.ipcall.a.i.aHl().mWy.mXi;
          w.i("MicroMsg.IPCallPluginUtil", "tryShowFeedbackDialog");
          if (d.aGQ())
          {
            paramInt3 = com.tencent.mm.k.g.uz().getInt("WCOMaxTimesForShowFeedback", 0);
            ap.AS();
            paramInt1 = ((Integer)com.tencent.mm.x.c.xi().get(w.a.uWL, Integer.valueOf(0))).intValue();
            ap.AS();
            l2 = ((Long)com.tencent.mm.x.c.xi().get(w.a.uWK, Long.valueOf(0L))).longValue();
            l3 = bg.Po();
            if (l3 - l2 <= 86400L) {
              break label2314;
            }
            paramInt1 = 0;
            w.i("MicroMsg.IPCallPluginUtil", "tryShowFeedbackDialog reset time");
            if (paramInt1 < paramInt3) {
              break label2196;
            }
            w.i("MicroMsg.IPCallPluginUtil", "tryShowFeedbackDialog reach max time" + paramInt3);
          }
        }
        com.tencent.mm.plugin.ipcall.a.i.aHl().mWp = null;
        com.tencent.mm.plugin.ipcall.a.i.aHm().mYu = null;
        com.tencent.mm.plugin.ipcall.a.i.aHp().mWi = -1;
        aGM();
        aqA();
        GMTrace.o(11731971604480L, 87410);
        return true;
        i = 0;
        break;
        i = 0;
        break;
        label1721:
        i = 0;
        break label326;
        label1727:
        i = 0;
        break label326;
        label1733:
        i = -1;
        break label395;
        label1739:
        f = ap.AT().getStreamMaxVolume(i);
        i = (int)(ap.AT().getStreamVolume(i) / f * 100.0F);
        break label404;
        localObject2 = finally;
        throw ((Throwable)localObject2);
      }
      i = 0;
      continue;
      label1794:
      i = 0;
      continue;
      label1800:
      ap.AT().setMode(2);
      continue;
      label1810:
      i = 2;
    }
  }
  
  private void aGO()
  {
    GMTrace.i(11735327047680L, 87435);
    w.i("MicroMsg.IPCallManager", "startTimeCount");
    if (this.fnS != null)
    {
      this.fnS.MM();
      GMTrace.o(11735327047680L, 87435);
      return;
    }
    if (this.fnS == null) {
      this.fnS = new aj(Looper.getMainLooper(), new aj.a()
      {
        public final boolean pO()
        {
          GMTrace.i(11743111675904L, 87493);
          c.this.aGL();
          if ((com.tencent.mm.plugin.ipcall.a.i.aHp().aHi()) && (c.this.mVH != null)) {
            c.this.mVH.aGU();
          }
          GMTrace.o(11743111675904L, 87493);
          return true;
        }
      }, true);
    }
    this.fnS.w(1000L, 1000L);
    GMTrace.o(11735327047680L, 87435);
  }
  
  public static boolean zB(String paramString)
  {
    GMTrace.i(11732105822208L, 87411);
    w.d("MicroMsg.IPCallManager", "dialWhenTalking, dialButton: %s", new Object[] { paramString });
    if (!com.tencent.mm.plugin.ipcall.a.i.aHp().aHi())
    {
      w.i("MicroMsg.IPCallManager", "ipcall not connect, cannot call dialWhenTalking now");
      GMTrace.o(11732105822208L, 87411);
      return false;
    }
    if ((!bg.mZ(paramString)) && (paramString.length() == 1))
    {
      int i;
      if ((!bg.mZ(paramString)) && (paramString.length() == 1))
      {
        i = paramString.charAt(0);
        if ((i >= 48) && (i <= 57)) {
          i -= 48;
        }
      }
      while (i != -1)
      {
        paramString = com.tencent.mm.plugin.ipcall.a.i.aHm();
        w.d("MicroMsg.IPCallEngineManager", "sendDTMF: %d", new Object[] { Integer.valueOf(i) });
        com.tencent.mm.plugin.ipcall.a.c.b localb = com.tencent.mm.plugin.ipcall.a.i.aHn();
        localb.mYW += 1;
        w.i("MicroMsg.IPCallReportHelper", "now addCallClickCnt %d", new Object[] { Integer.valueOf(localb.mYW) });
        i = paramString.mYp.SendDTMF(i);
        if (i < 0) {
          w.i("MicroMsg.IPCallEngineManager", "sendDTMF failed, ret: %d", new Object[] { Integer.valueOf(i) });
        }
        GMTrace.o(11732105822208L, 87411);
        return true;
        if (i == 42) {
          i = 10;
        } else if (i == 35) {
          i = 11;
        } else if ((i >= 65) && (i <= 68)) {
          i = i - 65 + 12;
        } else {
          i = -1;
        }
      }
    }
    GMTrace.o(11732105822208L, 87411);
    return false;
  }
  
  public final void aGC()
  {
    GMTrace.i(11732240039936L, 87412);
    w.i("MicroMsg.IPCallManager", "onInviteSuccess");
    if (!com.tencent.mm.plugin.ipcall.a.i.aHp().pb(3))
    {
      GMTrace.o(11732240039936L, 87412);
      return;
    }
    Object localObject = com.tencent.mm.plugin.ipcall.a.i.aHn();
    w.d("MicroMsg.IPCallReportHelper", "markStartInvite");
    if (((com.tencent.mm.plugin.ipcall.a.c.b)localObject).mYJ == 0L) {
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).mYJ = System.currentTimeMillis();
    }
    localObject = com.tencent.mm.plugin.ipcall.a.i.aHl().mWy;
    com.tencent.mm.plugin.ipcall.a.c.b localb = com.tencent.mm.plugin.ipcall.a.i.aHn();
    int i = ((com.tencent.mm.plugin.ipcall.a.a.c)localObject).mXj;
    String str1 = ((com.tencent.mm.plugin.ipcall.a.a.c)localObject).fMl;
    String str2 = ((com.tencent.mm.plugin.ipcall.a.a.c)localObject).mXI;
    int j = ((com.tencent.mm.plugin.ipcall.a.a.c)localObject).mXg;
    long l1 = ((com.tencent.mm.plugin.ipcall.a.a.c)localObject).mXh;
    long l2 = ((com.tencent.mm.plugin.ipcall.a.a.c)localObject).mXi;
    localb.mXj = i;
    localb.mYI = str1;
    localb.ilw = str2;
    localb.mXg = j;
    localb.mXh = l1;
    localb.mYG = l2;
    if (this.mVH != null) {
      this.mVH.aGC();
    }
    GMTrace.o(11732240039936L, 87412);
  }
  
  public final void aGD()
  {
    GMTrace.i(11732508475392L, 87414);
    w.i("MicroMsg.IPCallManager", "onStartRing, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aHp().mWi) });
    if (!com.tencent.mm.plugin.ipcall.a.i.aHp().pb(4))
    {
      GMTrace.o(11732508475392L, 87414);
      return;
    }
    com.tencent.mm.plugin.ipcall.a.c.b localb = com.tencent.mm.plugin.ipcall.a.i.aHn();
    w.d("MicroMsg.IPCallReportHelper", "markStartRing");
    if (localb.mYK == 0L)
    {
      localb.mYK = System.currentTimeMillis();
      localb.mYB = (localb.mYK - localb.mYJ);
      w.d("MicroMsg.IPCallReportHelper", "ringTime: %d", new Object[] { Long.valueOf(localb.mYB) });
    }
    com.tencent.mm.plugin.ipcall.a.i.aHm().aHH();
    localb = com.tencent.mm.plugin.ipcall.a.i.aHn();
    w.i("MicroMsg.IPCallReportHelper", "startRing");
    localb.mYw = 1;
    if (this.mVH != null) {
      this.mVH.aGD();
    }
    GMTrace.o(11732508475392L, 87414);
  }
  
  public final void aGE()
  {
    GMTrace.i(11732642693120L, 87415);
    w.i("MicroMsg.IPCallManager", "onAccept, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aHp().mWi) });
    if (!com.tencent.mm.plugin.ipcall.a.i.aHp().pb(5))
    {
      GMTrace.o(11732642693120L, 87415);
      return;
    }
    com.tencent.mm.plugin.ipcall.a.c.b localb = com.tencent.mm.plugin.ipcall.a.i.aHn();
    w.d("MicroMsg.IPCallReportHelper", "markUserAccept");
    if (localb.mVR == 0L)
    {
      localb.mVR = System.currentTimeMillis();
      localb.mYC = (localb.mVR - localb.mYJ);
      w.d("MicroMsg.IPCallReportHelper", "answerTime: %d", new Object[] { Long.valueOf(localb.mYC) });
    }
    com.tencent.mm.plugin.ipcall.a.i.aHm().aHH();
    localb = com.tencent.mm.plugin.ipcall.a.i.aHn();
    w.i("MicroMsg.IPCallReportHelper", "userAccept");
    localb.mYx = 1;
    ham.removeCallbacks(this.mVN);
    com.tencent.mm.plugin.ipcall.a.i.aHv().stop();
    ham.removeCallbacks(this.mVO);
    com.tencent.mm.plugin.ipcall.a.i.aHo().aHE();
    if ((com.tencent.mm.plugin.ipcall.a.i.aHm().mYs) && (!this.mVJ))
    {
      com.tencent.mm.plugin.ipcall.a.i.aHn().aHL();
      com.tencent.mm.plugin.ipcall.a.i.aHn().aHO();
      this.mVJ = true;
      this.mVR = bg.Po();
      aGO();
      com.tencent.mm.plugin.ipcall.a.i.aHm().aHG();
      if (this.mVH != null) {
        this.mVH.aGR();
      }
      com.tencent.mm.plugin.ipcall.a.i.aHn().aHN();
      com.tencent.mm.plugin.voip.model.k.bsI().bsJ();
      com.tencent.mm.plugin.voip.model.k.bsI().rqn = this;
    }
    GMTrace.o(11732642693120L, 87415);
  }
  
  public final void aGF()
  {
    GMTrace.i(11733179564032L, 87419);
    w.i("MicroMsg.IPCallManager", "onShutdownByOtherSide, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aHp().mWi) });
    if (E(10, 0, 32))
    {
      if (this.mVH != null)
      {
        this.mVH.aGS();
        GMTrace.o(11733179564032L, 87419);
        return;
      }
      Toast.makeText(ab.getContext(), ab.getContext().getString(R.l.eiv), 1).show();
    }
    GMTrace.o(11733179564032L, 87419);
  }
  
  public final void aGG()
  {
    GMTrace.i(11733447999488L, 87421);
    w.i("MicroMsg.IPCallManager", "onHeartbeatFailed");
    if (cl(7, 29)) {
      c(7, null, ab.getContext().getString(R.l.dEo), 1);
    }
    GMTrace.o(11733447999488L, 87421);
  }
  
  public final void aGH()
  {
    GMTrace.i(11734119088128L, 87426);
    w.i("MicroMsg.IPCallManager", "onStartEngineFailed, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aHp().mWi) });
    if (cl(6, 0)) {
      c(6, null, ab.getContext().getString(R.l.dEr), 1);
    }
    GMTrace.o(11734119088128L, 87426);
  }
  
  public final void aGI()
  {
    GMTrace.i(11734253305856L, 87427);
    w.i("MicroMsg.IPCallManager", "onChannelConnected, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aHp().mWi) });
    com.tencent.mm.plugin.ipcall.a.i.aHv().stop();
    ham.removeCallbacks(this.mVO);
    Object localObject;
    com.tencent.mm.plugin.ipcall.a.b.a locala;
    if (com.tencent.mm.plugin.ipcall.a.i.aHp().aHg())
    {
      localObject = com.tencent.mm.plugin.ipcall.a.i.aHo();
      ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mXW.a(ab.getContext(), (HeadsetPlugReceiver.a)localObject);
      ap.AT().a((e.a)localObject);
      ap.AT().sk();
      ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mYb = ap.AT().ss();
      ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mYa = ap.AT().sm();
      w.d("MicroMsg.IPCallDeviceManager", "startPlay, isHeadsetPlugged: %b, isBluetoothConnected: %b", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mYb), Boolean.valueOf(((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mYa) });
      ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).hWD.requestFocus();
      locala = ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mXT;
      if (!locala.fGc) {
        break label386;
      }
      w.d("MicroMsg.IPCallAudioPlayer", "startPlay, already start");
    }
    for (;;)
    {
      if ((((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mYb) && (!((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mYa) && (((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mXZ != null)) {
        ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mXZ.fr(true);
      }
      if ((((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mYa) && (!((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mYb) && (((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mXZ != null)) {
        ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mXZ.fs(true);
      }
      com.tencent.mm.plugin.ipcall.a.i.aHn().aHL();
      com.tencent.mm.plugin.ipcall.a.i.aHo().aHE();
      if ((com.tencent.mm.plugin.ipcall.a.i.aHp().aHi()) && (!this.mVJ))
      {
        com.tencent.mm.plugin.ipcall.a.i.aHn().aHO();
        com.tencent.mm.plugin.ipcall.a.i.aHm().aHG();
        this.mVJ = true;
        this.mVR = bg.Po();
        aGO();
        if (this.mVH != null) {
          this.mVH.aGR();
        }
        localObject = this.mVI;
        if (localObject != null)
        {
          w.d("MicroMsg.IPCallRecordStorageLogic", "recordStartTalk, localId: %d", new Object[] { Long.valueOf(((com.tencent.mm.plugin.ipcall.a.g.k)localObject).uQF) });
          if (((com.tencent.mm.plugin.ipcall.a.g.k)localObject).uQF != -1L)
          {
            ((com.tencent.mm.plugin.ipcall.a.g.k)localObject).field_status = 3;
            com.tencent.mm.plugin.ipcall.a.i.aHs().a((com.tencent.mm.plugin.ipcall.a.g.k)localObject);
          }
        }
        com.tencent.mm.plugin.ipcall.a.i.aHn().aHN();
        com.tencent.mm.plugin.voip.model.k.bsI().bsJ();
        com.tencent.mm.plugin.voip.model.k.bsI().rqn = this;
      }
      GMTrace.o(11734253305856L, 87427);
      return;
      label386:
      w.i("MicroMsg.IPCallAudioPlayer", "startPlay");
      if (locala.mXN == null)
      {
        locala.mXN = new com.tencent.mm.plugin.voip.model.b();
        locala.mXN.P(v2protocal.nZw, 20, 1);
      }
      locala.mXP = locala.mXN.k(ab.getContext(), false);
      locala.mXN.rmx = new a.1(locala);
      if (locala.mXN.brG() <= 0) {
        com.tencent.mm.plugin.ipcall.a.i.aHn().aHM();
      }
      locala.fo(locala.mXQ);
      locala.fGc = true;
    }
  }
  
  public final void aGJ()
  {
    GMTrace.i(11734655959040L, 87430);
    if (com.tencent.mm.plugin.ipcall.a.i.aHp().mWi != 5)
    {
      w.i("MicroMsg.IPCallManager", "onBadNetStatus currentState != accept:%d", new Object[] { Integer.valueOf(com.tencent.mm.plugin.ipcall.a.i.aHp().mWi) });
      GMTrace.o(11734655959040L, 87430);
      return;
    }
    com.tencent.mm.plugin.ipcall.a.b.b localb = com.tencent.mm.plugin.ipcall.a.i.aHo();
    w.i("MicroMsg.IPCallDeviceManager", "onBadNetStatus");
    if (localb.mXX != null)
    {
      j localj = localb.mXX;
      if (localj.nhD != null) {
        localj.nhD.setVisibility(0);
      }
      if (localj.nhE != null) {
        localj.nhE.setVisibility(0);
      }
    }
    if (!ap.AT().gFp.isSpeakerphoneOn())
    {
      long l = System.currentTimeMillis();
      if (l - localb.mYc > 30000L)
      {
        localb.mYc = l;
        com.tencent.mm.plugin.voip.model.d.brM().wa(R.k.drA);
      }
    }
    GMTrace.o(11734655959040L, 87430);
  }
  
  public final void aGK()
  {
    GMTrace.i(11734790176768L, 87431);
    if (com.tencent.mm.plugin.ipcall.a.i.aHp().mWi != 5)
    {
      w.i("MicroMsg.IPCallManager", "onResumeGoodNetStatus currentState != accept:%d", new Object[] { Integer.valueOf(com.tencent.mm.plugin.ipcall.a.i.aHp().mWi) });
      GMTrace.o(11734790176768L, 87431);
      return;
    }
    com.tencent.mm.plugin.ipcall.a.b.b localb = com.tencent.mm.plugin.ipcall.a.i.aHo();
    w.i("MicroMsg.IPCallDeviceManager", "onResumeGoodNetStatus");
    if (localb.mXX != null) {
      localb.mXX.aIx();
    }
    GMTrace.o(11734790176768L, 87431);
  }
  
  public final void aGL()
  {
    GMTrace.i(11734924394496L, 87432);
    if (com.tencent.mm.plugin.ipcall.a.i.aHp().aHi()) {}
    for (Object localObject1 = ab.getContext().getString(R.l.ehS, new Object[] { String.format("%02d:%02d", new Object[] { Long.valueOf(bg.aE(this.mVR) / 60L), Long.valueOf(bg.aE(this.mVR) % 60L) }) });; localObject1 = ab.getContext().getString(R.l.ehR))
    {
      Object localObject2 = new Intent(ab.getContext(), IPCallTalkUI.class);
      ((Intent)localObject2).putExtra("IPCallTalkUI_isFromMiniNotification", true);
      localObject2 = PendingIntent.getActivity(ab.getContext(), 42, (Intent)localObject2, 134217728);
      int i = R.g.bbw;
      if (com.tencent.mm.compatible.util.d.eu(19)) {
        i = R.g.bbv;
      }
      localObject1 = new Notification.Builder(ab.getContext()).setTicker(ab.getContext().getString(R.l.ehR)).setWhen(System.currentTimeMillis()).setContentTitle(ab.getContext().getString(R.l.ehK)).setContentText((CharSequence)localObject1).setContentIntent((PendingIntent)localObject2).getNotification();
      ((Notification)localObject1).icon = i;
      ((Notification)localObject1).flags |= 0x20;
      ap.getNotification().a(42, (Notification)localObject1, false);
      if (com.tencent.mm.plugin.ipcall.a.i.aHp().aHi()) {
        break;
      }
      com.tencent.mm.plugin.voip.model.d.brN().IY(ab.getContext().getString(R.l.eqG));
      GMTrace.o(11734924394496L, 87432);
      return;
    }
    com.tencent.mm.plugin.voip.model.d.brN().uu(aGN());
    GMTrace.o(11734924394496L, 87432);
  }
  
  public final void aGM()
  {
    GMTrace.i(11735058612224L, 87433);
    synchronized (this.lOy)
    {
      this.mVP = false;
      com.tencent.mm.plugin.voip.model.d.brN().dismiss();
      ((NotificationManager)ab.getContext().getSystemService("notification")).cancel(42);
      GMTrace.o(11735058612224L, 87433);
      return;
    }
  }
  
  public final int aGN()
  {
    GMTrace.i(11735192829952L, 87434);
    int i = (int)bg.aE(this.mVR);
    if (i > 0)
    {
      GMTrace.o(11735192829952L, 87434);
      return i;
    }
    GMTrace.o(11735192829952L, 87434);
    return 0;
  }
  
  public final void aqA()
  {
    GMTrace.i(11731837386752L, 87409);
    if (this.mVK != null)
    {
      this.mVK.listen(this.mVL, 0);
      this.mVK = null;
    }
    com.tencent.mm.sdk.b.a.uLm.c(this.mVM);
    GMTrace.o(11731837386752L, 87409);
  }
  
  public final void bf(String paramString, int paramInt)
  {
    GMTrace.i(11732911128576L, 87417);
    w.i("MicroMsg.IPCallManager", "onUnAvaliable, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aHp().mWi) });
    if (cl(3, 5)) {
      c(3, null, paramString, paramInt);
    }
    GMTrace.o(11732911128576L, 87417);
  }
  
  public final void bg(String paramString, int paramInt)
  {
    GMTrace.i(11733045346304L, 87418);
    w.i("MicroMsg.IPCallManager", "onBusy, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aHp().mWi) });
    if (cl(1, 4)) {
      c(1, null, paramString, paramInt);
    }
    GMTrace.o(11733045346304L, 87418);
  }
  
  public final void bh(String paramString, int paramInt)
  {
    GMTrace.i(11733313781760L, 87420);
    w.i("MicroMsg.IPCallManager", "onSyncFailed");
    if (cl(7, 35)) {
      c(7, null, paramString, paramInt);
    }
    GMTrace.o(11733313781760L, 87420);
  }
  
  public final void c(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    GMTrace.i(11732776910848L, 87416);
    if (this.mVH != null)
    {
      this.mVH.c(paramInt1, paramString1, paramString2, paramInt2);
      GMTrace.o(11732776910848L, 87416);
      return;
    }
    Toast.makeText(ab.getContext(), paramString2, 1).show();
    GMTrace.o(11732776910848L, 87416);
  }
  
  public final boolean cl(int paramInt1, int paramInt2)
  {
    GMTrace.i(11734521741312L, 87429);
    if (com.tencent.mm.plugin.ipcall.a.i.aHp().aHi())
    {
      if (paramInt1 == 0)
      {
        bool = E(9, paramInt1, paramInt2);
        GMTrace.o(11734521741312L, 87429);
        return bool;
      }
      bool = E(11, paramInt1, paramInt2);
      GMTrace.o(11734521741312L, 87429);
      return bool;
    }
    if (paramInt1 == 0)
    {
      bool = E(8, paramInt1, paramInt2);
      GMTrace.o(11734521741312L, 87429);
      return bool;
    }
    boolean bool = E(12, paramInt1, paramInt2);
    GMTrace.o(11734521741312L, 87429);
    return bool;
  }
  
  public final void oZ(int paramInt)
  {
    GMTrace.i(11734387523584L, 87428);
    w.i("MicroMsg.IPCallManager", "onChannelConnectFailed, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aHp().mWi) });
    if (com.tencent.mm.plugin.ipcall.a.i.aHm().mYs)
    {
      w.i("MicroMsg.IPCallManager", "onChannelConnectFailed, channel already connected");
      if (cl(5, paramInt))
      {
        c(5, null, ab.getContext().getString(R.l.dEo), 1);
        GMTrace.o(11734387523584L, 87428);
      }
    }
    else
    {
      w.i("MicroMsg.IPCallManager", "onChannelConnectFailed, channel not connet, may be request connect failed");
      if (cl(4, paramInt)) {
        c(4, null, ab.getContext().getString(R.l.dEo), 1);
      }
    }
    GMTrace.o(11734387523584L, 87428);
  }
  
  public final void u(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(11732374257664L, 87413);
    w.i("MicroMsg.IPCallManager", "onInviteFailed, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aHp().mWi) });
    if (cl(2, 0)) {
      c(2, paramString1, paramString2, paramInt);
    }
    GMTrace.o(11732374257664L, 87413);
  }
  
  public final void v(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(11733582217216L, 87422);
    w.i("MicroMsg.IPCallManager", "onAccountOverdue, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aHp().mWi) });
    if (cl(8, 9)) {
      c(8, paramString1, paramString2, paramInt);
    }
    GMTrace.o(11733582217216L, 87422);
  }
  
  public final void w(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(11733716434944L, 87423);
    w.i("MicroMsg.IPCallManager", "onCallRestricted, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aHp().mWi) });
    if (cl(10, 0)) {
      c(10, paramString1, paramString2, paramInt);
    }
    GMTrace.o(11733716434944L, 87423);
  }
  
  public final void x(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(11733850652672L, 87424);
    w.i("MicroMsg.IPCallManager", "onCallPhoneNumberInvalid, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aHp().mWi) });
    if (cl(11, 0)) {
      c(11, paramString1, paramString2, paramInt);
    }
    GMTrace.o(11733850652672L, 87424);
  }
  
  public final void y(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(11733984870400L, 87425);
    do
    {
      w.i("MicroMsg.IPCallManager", "onDisasterHappen, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aHp().mWi) });
    } while (cl(12, 0));
    GMTrace.o(11733984870400L, 87425);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */