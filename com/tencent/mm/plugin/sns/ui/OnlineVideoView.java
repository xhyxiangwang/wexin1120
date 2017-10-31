package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.cd;
import com.tencent.mm.g.a.cd.b;
import com.tencent.mm.g.a.ko;
import com.tencent.mm.g.a.ko.a;
import com.tencent.mm.g.a.ow;
import com.tencent.mm.g.a.oz;
import com.tencent.mm.g.a.oz.a;
import com.tencent.mm.g.a.pu;
import com.tencent.mm.kernel.e;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.plugin.r.j;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.am;
import com.tencent.mm.plugin.sns.model.ap;
import com.tencent.mm.plugin.sns.model.aq;
import com.tencent.mm.plugin.sns.model.b.b;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.VideoTextureView;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.pluginsdk.ui.tools.f.e;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.x.d.a;
import com.tencent.mm.x.y;
import java.io.File;
import java.util.HashMap;

public class OnlineVideoView
  extends RelativeLayout
  implements af.a, f.a, d.a
{
  private int duration;
  private String fAx;
  private int fNC;
  private boolean fND;
  private int fNE;
  private amn fNf;
  private int hzl;
  private com.tencent.mm.x.d jdd;
  com.tencent.mm.sdk.platformtools.ae kvt;
  private aj kwG;
  boolean kwx;
  com.tencent.mm.pluginsdk.ui.tools.f kwz;
  ImageView lUH;
  private TextView lUI;
  private boolean lUJ;
  private boolean lUK;
  private int lUL;
  private ProgressBar lUN;
  private MMPinProgressBtn lUO;
  private RelativeLayout lWD;
  private Context mContext;
  private com.tencent.mm.plugin.r.b nIV;
  private an pYm;
  private boolean qDa;
  private f.e qDd;
  private int qDh;
  boolean qDi;
  String qDj;
  private boolean qDk;
  private a qDl;
  private TextView qDm;
  private af qDn;
  private boolean qDo;
  private boolean qDp;
  private int qDq;
  private int qDr;
  private long qDs;
  private long qDt;
  private aj qDu;
  private b.b qDv;
  private c qDw;
  c qDx;
  private long qDy;
  private int qDz;
  private c qeX;
  
  public OnlineVideoView(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(8726702456832L, 65019);
    GMTrace.o(8726702456832L, 65019);
  }
  
  public OnlineVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(8726836674560L, 65020);
    GMTrace.o(8726836674560L, 65020);
  }
  
  public OnlineVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8726970892288L, 65021);
    this.qDh = 0;
    this.qDi = false;
    this.lUJ = false;
    this.kwx = false;
    this.fNf = null;
    this.qDk = false;
    this.qDn = null;
    this.qDp = false;
    this.duration = 0;
    this.qDq = 0;
    this.qDr = 0;
    this.qDs = 0L;
    this.qDt = 0L;
    this.lUL = 0;
    this.kvt = new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper());
    this.qDu = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(8513833140224L, 63433);
        if ((OnlineVideoView.k(OnlineVideoView.this) == null) || (OnlineVideoView.d(OnlineVideoView.this) == null))
        {
          GMTrace.o(8513833140224L, 63433);
          return false;
        }
        if (((View)OnlineVideoView.d(OnlineVideoView.this)).getAlpha() < 1.0F) {
          OnlineVideoView.m(OnlineVideoView.this);
        }
        if (OnlineVideoView.d(OnlineVideoView.this).isPlaying()) {
          OnlineVideoView.n(OnlineVideoView.this);
        }
        try
        {
          boolean bool = bg.mZ(OnlineVideoView.k(OnlineVideoView.this).hSm);
          if (!bool) {}
          for (int i = 1; i == 0; i = 0)
          {
            GMTrace.o(8513833140224L, 63433);
            return false;
          }
          i = OnlineVideoView.d(OnlineVideoView.this).getCurrentPosition() / 1000;
          bool = OnlineVideoView.k(OnlineVideoView.this).gY(i);
          GMTrace.o(8513833140224L, 63433);
          return bool;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.OnlineVideoView", "online video timer check error : " + localException.toString());
          GMTrace.o(8513833140224L, 63433);
        }
        return false;
      }
    }, true);
    this.kwG = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(14707847069696L, 109582);
        if (OnlineVideoView.d(OnlineVideoView.this) == null)
        {
          GMTrace.o(14707847069696L, 109582);
          return false;
        }
        if (((View)OnlineVideoView.d(OnlineVideoView.this)).getAlpha() < 1.0F) {
          OnlineVideoView.m(OnlineVideoView.this);
        }
        if (OnlineVideoView.d(OnlineVideoView.this).isPlaying())
        {
          OnlineVideoView.n(OnlineVideoView.this);
          OnlineVideoView.d(OnlineVideoView.this).getCurrentPosition();
        }
        GMTrace.o(14707847069696L, 109582);
        return true;
      }
    }, true);
    this.qDv = new b.b()
    {
      public final void Gm(String paramAnonymousString)
      {
        GMTrace.i(14704894279680L, 109560);
        GMTrace.o(14704894279680L, 109560);
      }
      
      public final void ar(String paramAnonymousString, boolean paramAnonymousBoolean)
      {
        GMTrace.i(14705028497408L, 109561);
        GMTrace.o(14705028497408L, 109561);
      }
      
      public final void as(final String paramAnonymousString, final boolean paramAnonymousBoolean)
      {
        GMTrace.i(14705296932864L, 109563);
        OnlineVideoView.o(OnlineVideoView.this).postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(14706907545600L, 109575);
            w.i("MicroMsg.OnlineVideoView", "%d weixin download finish[%b], go to prepare video", new Object[] { Integer.valueOf(OnlineVideoView.this.hashCode()), Boolean.valueOf(paramAnonymousBoolean) });
            if ((OnlineVideoView.e(OnlineVideoView.this) != null) && (paramAnonymousBoolean) && (bg.eI(OnlineVideoView.e(OnlineVideoView.this).nas, paramAnonymousString)))
            {
              ap.dv(OnlineVideoView.a(OnlineVideoView.this), "");
              String str = ap.a(OnlineVideoView.a(OnlineVideoView.this), OnlineVideoView.e(OnlineVideoView.this));
              if (!bg.mZ(str)) {
                OnlineVideoView.this.av(str, false);
              }
            }
            GMTrace.o(14706907545600L, 109575);
          }
        }, 100L);
        GMTrace.o(14705296932864L, 109563);
      }
      
      public final void bgh()
      {
        GMTrace.i(14705162715136L, 109562);
        GMTrace.o(14705162715136L, 109562);
      }
    };
    this.qDw = new c() {};
    this.qDx = new c() {};
    this.qeX = new c()
    {
      private boolean a(ko paramAnonymousko)
      {
        GMTrace.i(14709994553344L, 109598);
        if (OnlineVideoView.k(OnlineVideoView.this) == null)
        {
          w.w("MicroMsg.OnlineVideoView", "%d online video helper is null.", new Object[] { Integer.valueOf(OnlineVideoView.this.hashCode()) });
          GMTrace.o(14709994553344L, 109598);
          return false;
        }
        try
        {
          bool = OnlineVideoView.k(OnlineVideoView.this).Ii(paramAnonymousko.fHU.mediaId);
          if (!bool)
          {
            GMTrace.o(14709994553344L, 109598);
            return false;
          }
          if (paramAnonymousko.fHU.fvP == 44424)
          {
            paramAnonymousko = OnlineVideoView.this;
            com.tencent.mm.plugin.report.service.g.paX.a(354L, 218L, 1L, false);
            paramAnonymousko.kvt.post(new OnlineVideoView.9(paramAnonymousko));
            GMTrace.o(14709994553344L, 109598);
            return false;
          }
          if ((paramAnonymousko.fHU.fvP != 0) && (paramAnonymousko.fHU.fvP != 44530))
          {
            w.w("MicroMsg.OnlineVideoView", "%d stream download online video error. retCode %d ", new Object[] { Integer.valueOf(OnlineVideoView.this.hashCode()), Integer.valueOf(paramAnonymousko.fHU.fvP) });
            GMTrace.o(14709994553344L, 109598);
            return false;
          }
          switch (paramAnonymousko.fHU.fAI)
          {
          }
        }
        catch (Exception paramAnonymousko)
        {
          for (;;)
          {
            boolean bool;
            long l2;
            long l1;
            w.e("MicroMsg.OnlineVideoView", "online video callback error: " + paramAnonymousko.toString());
            continue;
            if (l1 > localaf.hta) {}
            for (;;)
            {
              localaf.hta = l1;
              localaf.qDK = bg.Pp();
              try
              {
                if (localaf.hSr != null) {
                  break label537;
                }
                w.w("MicroMsg.OnlineVideoViewHelper", "parser is null, thread is error.");
              }
              catch (Exception paramAnonymousko)
              {
                w.e("MicroMsg.OnlineVideoViewHelper", "deal moov ready error: " + paramAnonymousko.toString());
              }
              break;
              l1 = localaf.hta;
            }
            if (localaf.hSr.l(localaf.hSn, l2))
            {
              localaf.hSs = localaf.hSr.ifu;
              w.i("MicroMsg.OnlineVideoViewHelper", "mp4 parse moov success. duration %d cdnMediaId %s isFastStart %b", new Object[] { Integer.valueOf(localaf.hSs), localaf.hSm, Boolean.valueOf(bool) });
              if (!bool) {
                com.tencent.mm.sdk.platformtools.af.u(new af.1(localaf));
              }
              if (localaf.hSt == -1) {}
              for (localaf.hSq = 1;; localaf.hSq = 2)
              {
                com.tencent.mm.plugin.report.service.g.paX.a(354L, 204L, 1L, false);
                break;
              }
            }
            w.w("MicroMsg.OnlineVideoViewHelper", "mp4 parse moov error. cdnMediaId %s", new Object[] { localaf.hSm });
            o.Nb();
            com.tencent.mm.modelcdntran.f.e(localaf.hSm, 0, -1);
            com.tencent.mm.plugin.report.service.g.paX.a(354L, 205L, 1L, false);
            com.tencent.mm.plugin.report.service.g.paX.i(13836, new Object[] { Integer.valueOf(402), Long.valueOf(bg.Po()), "" });
            continue;
            af localaf = OnlineVideoView.k(OnlineVideoView.this);
            Object localObject = paramAnonymousko.fHU.mediaId;
            int i = paramAnonymousko.fHU.offset;
            int j = paramAnonymousko.fHU.length;
            localaf.hSz = false;
            if ((i < 0) || (j < 0)) {
              w.w("MicroMsg.OnlineVideoViewHelper", "deal data available error offset[%d], length[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
            }
            while (!localaf.Ii((String)localObject))
            {
              if (paramAnonymousko.fHU.length <= 0) {
                break;
              }
              OnlineVideoView.this.bD(true);
              break;
            }
            localObject = localaf.hSm + i + "_" + j;
            localObject = (Integer)localaf.qDG.get(localObject);
            if ((localObject != null) && (((Integer)localObject).intValue() > 0)) {
              localaf.hSw = ((Integer)localObject).intValue();
            }
            for (;;)
            {
              w.i("MicroMsg.OnlineVideoViewHelper", "deal data available. offset[%d] length[%d] cachePlayTime[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(localaf.hSw) });
              break;
              try
              {
                localaf.hSw = localaf.hSr.bh(i, j);
              }
              catch (Exception localException)
              {
                w.e("MicroMsg.OnlineVideoViewHelper", "deal data available file pos to video time error: " + localException.toString());
              }
            }
            OnlineVideoView.this.bD(true);
            continue;
            w.i("MicroMsg.OnlineVideoView", "%d download finish. cdnMediaId %s sendReqCode %d favFromScene %d", new Object[] { Integer.valueOf(OnlineVideoView.this.hashCode()), paramAnonymousko.fHU.mediaId, Integer.valueOf(OnlineVideoView.s(OnlineVideoView.this)), Integer.valueOf(OnlineVideoView.t(OnlineVideoView.this)) });
            paramAnonymousko = OnlineVideoView.k(OnlineVideoView.this);
            w.i("MicroMsg.OnlineVideoViewHelper", "deal stream finish. playStatus %d cdnMediaId %s", new Object[] { Integer.valueOf(paramAnonymousko.hSq), paramAnonymousko.hSm });
            paramAnonymousko.hSz = false;
            paramAnonymousko.hSp = 3;
            com.tencent.mm.plugin.report.service.g.paX.a(354L, 206L, 1L, false);
            if (paramAnonymousko.hSq == 0)
            {
              w.w("MicroMsg.OnlineVideoViewHelper", "it had not moov callback and download finish start to play video.");
              paramAnonymousko.bmh();
            }
            for (;;)
            {
              if (OnlineVideoView.s(OnlineVideoView.this) <= 0) {
                break label1244;
              }
              OnlineVideoView.n(OnlineVideoView.this);
              OnlineVideoView.b(OnlineVideoView.this, OnlineVideoView.s(OnlineVideoView.this));
              break;
              if (paramAnonymousko.hSq == 5)
              {
                w.w("MicroMsg.OnlineVideoViewHelper", "it had play error, it request all video data finish, start to play." + paramAnonymousko.hSm);
                paramAnonymousko.bmh();
              }
            }
            if (OnlineVideoView.t(OnlineVideoView.this) > 0)
            {
              OnlineVideoView.n(OnlineVideoView.this);
              OnlineVideoView.b(OnlineVideoView.this, OnlineVideoView.t(OnlineVideoView.this), OnlineVideoView.u(OnlineVideoView.this));
            }
            else if (OnlineVideoView.v(OnlineVideoView.this))
            {
              OnlineVideoView.n(OnlineVideoView.this);
              OnlineVideoView.w(OnlineVideoView.this);
            }
            else
            {
              OnlineVideoView.this.bD(true);
              continue;
              if (OnlineVideoView.j(OnlineVideoView.this) == 1)
              {
                localaf = OnlineVideoView.k(OnlineVideoView.this);
                String str = paramAnonymousko.fHU.mediaId;
                i = paramAnonymousko.fHU.offset;
                j = paramAnonymousko.fHU.length;
                if (localaf.Ii(str))
                {
                  localaf.progress = i;
                  localaf.ppO = j;
                  localaf.qDI = (localaf.progress * 100 / localaf.ppO);
                  w.i("MicroMsg.OnlineVideoViewHelper", "deal video[%s] progress callback[%d, %d]. downloadedPercent[%d]", new Object[] { localaf.hSm, Integer.valueOf(localaf.progress), Integer.valueOf(localaf.ppO), Integer.valueOf(localaf.qDI) });
                }
                if (localaf.qDI >= 100) {
                  localaf.hSp = 3;
                }
              }
              else if (OnlineVideoView.j(OnlineVideoView.this) == 2)
              {
                OnlineVideoView.a(OnlineVideoView.this, paramAnonymousko.fHU.offset, paramAnonymousko.fHU.length);
                continue;
                paramAnonymousko = OnlineVideoView.k(OnlineVideoView.this);
                w.i("MicroMsg.OnlineVideoViewHelper", "deal had dup video. cdnMediaId %s", new Object[] { paramAnonymousko.hSm });
                paramAnonymousko.bmh();
              }
            }
          }
        }
        w.w("MicroMsg.OnlineVideoView", "%d unknown event opcode %d", new Object[] { Integer.valueOf(OnlineVideoView.this.hashCode()), Integer.valueOf(paramAnonymousko.fHU.fAI) });
        for (;;)
        {
          GMTrace.o(14709994553344L, 109598);
          return false;
          localaf = OnlineVideoView.k(OnlineVideoView.this);
          l2 = paramAnonymousko.fHU.offset;
          l1 = paramAnonymousko.fHU.fHV;
          bool = paramAnonymousko.fHU.fHW;
          w.i("MicroMsg.OnlineVideoViewHelper", "deal moov ready moovPos %d, timeDuration %d, cdnMediaId %s startDownload[%d %d]", new Object[] { Long.valueOf(l2), Integer.valueOf(localaf.hSs), localaf.hSm, Long.valueOf(l1), Long.valueOf(localaf.hta) });
          if (localaf.hSs == 0) {
            break;
          }
          w.w("MicroMsg.OnlineVideoViewHelper", "moov had callback, do nothing.");
          OnlineVideoView.r(OnlineVideoView.this);
        }
      }
    };
    this.qDd = new f.e()
    {
      public final void aPF()
      {
        GMTrace.i(14710262988800L, 109600);
        w.i("MicroMsg.OnlineVideoView", "%d on texture update.", new Object[] { Integer.valueOf(OnlineVideoView.this.hashCode()) });
        try
        {
          OnlineVideoView.m(OnlineVideoView.this);
          GMTrace.o(14710262988800L, 109600);
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.OnlineVideoView", "texture view update. error " + localException.toString());
          GMTrace.o(14710262988800L, 109600);
        }
      }
    };
    this.nIV = new com.tencent.mm.plugin.r.b()
    {
      public final long aNs()
      {
        GMTrace.i(14709055029248L, 109591);
        w.i("MicroMsg.OnlineVideoView", "%d sns video get online cache", new Object[] { Integer.valueOf(OnlineVideoView.this.hashCode()) });
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xz().xi().a(w.a.vaK, Boolean.valueOf(true));
        try
        {
          if ((OnlineVideoView.x(OnlineVideoView.this)) && (OnlineVideoView.k(OnlineVideoView.this) != null))
          {
            int i = OnlineVideoView.k(OnlineVideoView.this).hSw;
            long l = i;
            GMTrace.o(14709055029248L, 109591);
            return l;
          }
        }
        catch (Exception localException)
        {
          GMTrace.o(14709055029248L, 109591);
        }
        return 0L;
      }
    };
    this.mContext = paramContext;
    w.i("MicroMsg.OnlineVideoView", "%d ui init view.", new Object[] { Integer.valueOf(hashCode()) });
    LayoutInflater.from(paramContext).inflate(i.g.pPO, this);
    this.lUH = ((ImageView)findViewById(i.f.cEH));
    this.lWD = ((RelativeLayout)findViewById(i.f.cEG));
    this.qDm = ((TextView)findViewById(i.f.cEl));
    this.qDm.setVisibility(8);
    this.lUO = ((MMPinProgressBtn)findViewById(i.f.cEw));
    this.lUN = ((ProgressBar)findViewById(i.f.cEr));
    this.lUI = ((TextView)findViewById(i.f.cEJ));
    com.tencent.mm.modelcontrol.d.Gs();
    if (com.tencent.mm.modelcontrol.d.Gz())
    {
      this.lUK = true;
      this.kwz = new VideoPlayerTextureView(paramContext);
      ((VideoPlayerTextureView)this.kwz).nIV = this.nIV;
      ((VideoPlayerTextureView)this.kwz).tmI = true;
      com.tencent.mm.plugin.report.service.g.paX.a(354L, 148L, 1L, false);
    }
    for (;;)
    {
      this.kwz.a(this);
      paramContext = new RelativeLayout.LayoutParams(-1, -2);
      paramContext.addRule(13);
      this.lWD.addView((View)this.kwz, paramContext);
      a(false, 0.0F);
      GMTrace.o(8726970892288L, 65021);
      return;
      this.lUK = false;
      this.kwz = new VideoTextureView(paramContext);
      com.tencent.mm.plugin.report.service.g.paX.a(354L, 149L, 1L, false);
    }
  }
  
  private void J(final int paramInt, final boolean paramBoolean)
  {
    GMTrace.i(8728178851840L, 65030);
    this.kvt.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8537992331264L, 63613);
        Object localObject1 = com.tencent.mm.plugin.sns.model.ae.bhp().HA(OnlineVideoView.a(OnlineVideoView.this));
        if (localObject1 == null)
        {
          GMTrace.o(8537992331264L, 63613);
          return;
        }
        w.i("MicroMsg.OnlineVideoView", "fav download video[%s] farFromScene %d isFromMain %b", new Object[] { OnlineVideoView.a(OnlineVideoView.this), Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
        Object localObject2 = new cd();
        ((cd)localObject2).fwt.fwA = paramInt;
        ((cd)localObject2).fwt.activity = ((Activity)OnlineVideoView.b(OnlineVideoView.this));
        com.tencent.mm.plugin.sns.i.a.a((cd)localObject2, (m)localObject1);
        com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject2);
        if (((cd)localObject2).fwu.ret == 0) {
          OnlineVideoView.bme();
        }
        for (;;)
        {
          if (paramBoolean)
          {
            localObject2 = new ow();
            ((ow)localObject2).fMU.fxL = ((m)localObject1).bkg();
            ((ow)localObject2).fMU.fMT = com.tencent.mm.plugin.sns.data.i.g((m)localObject1);
            com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject2);
          }
          OnlineVideoView.c(OnlineVideoView.this);
          if (OnlineVideoView.d(OnlineVideoView.this) == null) {
            break label330;
          }
          if (!bg.mZ(OnlineVideoView.d(OnlineVideoView.this).Nx())) {
            break;
          }
          w.i("MicroMsg.OnlineVideoView", "%d had not set video path to play", new Object[] { Integer.valueOf(OnlineVideoView.this.hashCode()) });
          localObject1 = ap.a(OnlineVideoView.a(OnlineVideoView.this), OnlineVideoView.e(OnlineVideoView.this));
          if (!bg.mZ((String)localObject1)) {
            OnlineVideoView.this.av((String)localObject1, false);
          }
          GMTrace.o(8537992331264L, 63613);
          return;
          OnlineVideoView.bmf();
        }
        if (!OnlineVideoView.d(OnlineVideoView.this).isPlaying())
        {
          OnlineVideoView.d(OnlineVideoView.this).start();
          GMTrace.o(8537992331264L, 63613);
          return;
        }
        label330:
        GMTrace.o(8537992331264L, 63613);
      }
    });
    GMTrace.o(8728178851840L, 65030);
  }
  
  private void a(final boolean paramBoolean, final float paramFloat)
  {
    GMTrace.i(8728447287296L, 65032);
    this.kvt.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8750861647872L, 65199);
        w.i("MicroMsg.OnlineVideoView", "%d switch video model isVideoPlay %b %f", new Object[] { Integer.valueOf(OnlineVideoView.this.hashCode()), Boolean.valueOf(paramBoolean), Float.valueOf(paramFloat) });
        View localView = (View)OnlineVideoView.d(OnlineVideoView.this);
        if (paramBoolean)
        {
          OnlineVideoView.f(OnlineVideoView.this).setAlpha(paramFloat);
          OnlineVideoView.f(OnlineVideoView.this).setVisibility(0);
          localView.setAlpha(paramFloat);
          localView.setVisibility(0);
          if (paramFloat >= 1.0D)
          {
            OnlineVideoView.g(OnlineVideoView.this).setVisibility(8);
            GMTrace.o(8750861647872L, 65199);
          }
        }
        else
        {
          OnlineVideoView.f(OnlineVideoView.this).setVisibility(8);
          localView.setVisibility(8);
          OnlineVideoView.g(OnlineVideoView.this).setVisibility(0);
        }
        GMTrace.o(8750861647872L, 65199);
      }
    });
    GMTrace.o(8728447287296L, 65032);
  }
  
  private void aIO()
  {
    GMTrace.i(8728984158208L, 65036);
    this.kvt.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8539871379456L, 63627);
        if ((OnlineVideoView.h(OnlineVideoView.this) != null) && (OnlineVideoView.h(OnlineVideoView.this).getVisibility() != 8))
        {
          w.i("MicroMsg.OnlineVideoView", "%d hide loading.", new Object[] { Integer.valueOf(OnlineVideoView.this.hashCode()) });
          OnlineVideoView.h(OnlineVideoView.this).setVisibility(8);
        }
        if ((OnlineVideoView.i(OnlineVideoView.this) != null) && (OnlineVideoView.i(OnlineVideoView.this).getVisibility() != 8))
        {
          w.i("MicroMsg.OnlineVideoView", "%d hide progress.", new Object[] { Integer.valueOf(OnlineVideoView.this.hashCode()) });
          OnlineVideoView.i(OnlineVideoView.this).setVisibility(8);
        }
        GMTrace.o(8539871379456L, 63627);
      }
    });
    GMTrace.o(8728984158208L, 65036);
  }
  
  private void aaN()
  {
    GMTrace.i(8728849940480L, 65035);
    this.kvt.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8450079719424L, 62958);
        w.i("MicroMsg.OnlineVideoView", "%d show loading. downloadMode %d", new Object[] { Integer.valueOf(OnlineVideoView.this.hashCode()), Integer.valueOf(OnlineVideoView.j(OnlineVideoView.this)) });
        if (OnlineVideoView.j(OnlineVideoView.this) == 1)
        {
          if ((OnlineVideoView.h(OnlineVideoView.this) != null) && (OnlineVideoView.h(OnlineVideoView.this).getVisibility() != 0)) {
            OnlineVideoView.h(OnlineVideoView.this).setVisibility(0);
          }
          if ((OnlineVideoView.i(OnlineVideoView.this) != null) && (OnlineVideoView.i(OnlineVideoView.this).getVisibility() != 8)) {
            OnlineVideoView.i(OnlineVideoView.this).setVisibility(8);
          }
        }
        if (OnlineVideoView.j(OnlineVideoView.this) == 2)
        {
          if ((OnlineVideoView.i(OnlineVideoView.this) != null) && (OnlineVideoView.i(OnlineVideoView.this).getVisibility() != 0)) {
            OnlineVideoView.i(OnlineVideoView.this).setVisibility(0);
          }
          if ((OnlineVideoView.h(OnlineVideoView.this) != null) && (OnlineVideoView.h(OnlineVideoView.this).getVisibility() != 8)) {
            OnlineVideoView.h(OnlineVideoView.this).setVisibility(8);
          }
        }
        if (OnlineVideoView.j(OnlineVideoView.this) == 3)
        {
          if ((OnlineVideoView.i(OnlineVideoView.this) != null) && (OnlineVideoView.i(OnlineVideoView.this).getVisibility() != 0))
          {
            OnlineVideoView.i(OnlineVideoView.this).setVisibility(0);
            OnlineVideoView.i(OnlineVideoView.this).cgd();
          }
          if ((OnlineVideoView.h(OnlineVideoView.this) != null) && (OnlineVideoView.h(OnlineVideoView.this).getVisibility() != 8)) {
            OnlineVideoView.h(OnlineVideoView.this).setVisibility(8);
          }
        }
        GMTrace.o(8450079719424L, 62958);
      }
    });
    GMTrace.o(8728849940480L, 65035);
  }
  
  private void blS()
  {
    GMTrace.i(18573854507008L, 138386);
    if (!this.qDi) {}
    for (String str = ap.a(this.fAx, this.fNf);; str = this.qDj)
    {
      w.i("MicroMsg.OnlineVideoView", "%d toggleVideo local id %s finish path %s isPreview %b", new Object[] { Integer.valueOf(hashCode()), this.fAx, str, Boolean.valueOf(this.qDi) });
      if (bg.mZ(str)) {
        break;
      }
      w.i("MicroMsg.OnlineVideoView", "%d sns video already download finish, play now", new Object[] { Integer.valueOf(hashCode()) });
      a(true, 0.0F);
      av(str, false);
      GMTrace.o(18573854507008L, 138386);
      return;
    }
    a(false, 0.0F);
    n(false, 0);
    aaN();
    GMTrace.o(18573854507008L, 138386);
  }
  
  private void blW()
  {
    GMTrace.i(8728313069568L, 65031);
    long l = bg.Pq();
    String str1 = ap.a(this.fAx, this.fNf);
    String str2 = com.tencent.mm.modelvideo.t.mk(str1);
    if (bg.mZ(str2))
    {
      Toast.makeText(this.mContext, this.mContext.getString(i.j.eOS), 1).show();
      com.tencent.mm.plugin.report.service.g.paX.a(354L, 222L, 1L, false);
    }
    for (;;)
    {
      this.qDk = false;
      w.i("MicroMsg.OnlineVideoView", "%d save downloaded video finish %d %s", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(bg.aG(l)), str1 });
      this.kvt.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8577989214208L, 63911);
          if (OnlineVideoView.d(OnlineVideoView.this) != null)
          {
            if (bg.mZ(OnlineVideoView.d(OnlineVideoView.this).Nx()))
            {
              w.i("MicroMsg.OnlineVideoView", "%d had not set video path to play", new Object[] { Integer.valueOf(OnlineVideoView.this.hashCode()) });
              String str = ap.a(OnlineVideoView.a(OnlineVideoView.this), OnlineVideoView.e(OnlineVideoView.this));
              if (!bg.mZ(str)) {
                OnlineVideoView.this.av(str, false);
              }
              GMTrace.o(8577989214208L, 63911);
              return;
            }
            if (!OnlineVideoView.d(OnlineVideoView.this).isPlaying())
            {
              OnlineVideoView.d(OnlineVideoView.this).start();
              GMTrace.o(8577989214208L, 63911);
              return;
            }
          }
          GMTrace.o(8577989214208L, 63911);
        }
      });
      GMTrace.o(8728313069568L, 65031);
      return;
      Toast.makeText(this.mContext, this.mContext.getString(i.j.eOT, new Object[] { str2 }), 1).show();
      com.tencent.mm.platformtools.d.b(str2, this.mContext);
      com.tencent.mm.plugin.report.service.g.paX.a(354L, 221L, 1L, false);
    }
  }
  
  private void blZ()
  {
    GMTrace.i(8731131641856L, 65052);
    this.qDy = bg.Pp();
    w.d("MicroMsg.OnlineVideoView", "%d notePlayVideo notePlayVideo %d ", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(this.qDy) });
    GMTrace.o(8731131641856L, 65052);
  }
  
  private void bma()
  {
    GMTrace.i(8731265859584L, 65053);
    if (this.qDy > 0L) {
      this.qDz = ((int)(this.qDz + (bg.Pp() - this.qDy) / 1000L));
    }
    w.i("MicroMsg.OnlineVideoView", "%d notePauseVideo playVideoDuration %d ", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(this.qDz) });
    this.qDy = 0L;
    GMTrace.o(8731265859584L, 65053);
  }
  
  private void n(boolean paramBoolean, int paramInt)
  {
    GMTrace.i(8728581505024L, 65033);
    if (this.fNf == null)
    {
      w.w("MicroMsg.OnlineVideoView", "%d start download video but media is null.", new Object[] { Integer.valueOf(hashCode()) });
      GMTrace.o(8728581505024L, 65033);
      return;
    }
    if (this.qDn == null)
    {
      w.w("MicroMsg.OnlineVideoView", "%d start download video but helper is null.", new Object[] { Integer.valueOf(hashCode()) });
      GMTrace.o(8728581505024L, 65033);
      return;
    }
    if (this.fNf.uhz == 2)
    {
      w.w("MicroMsg.OnlineVideoView", "%d it start download video, url type is weixin", new Object[] { Integer.valueOf(hashCode()) });
      this.qDh = 3;
      com.tencent.mm.plugin.sns.model.ae.bhk().a(this.fNf, 4, null, this.pYm);
      GMTrace.o(8728581505024L, 65033);
      return;
    }
    int i;
    if (!paramBoolean)
    {
      com.tencent.mm.modelcontrol.d.Gs();
      if (com.tencent.mm.modelcontrol.d.Gy())
      {
        w.i("MicroMsg.OnlineVideoView", "%d it start online download video", new Object[] { Integer.valueOf(hashCode()) });
        this.qDh = 1;
        paramBoolean = true;
        i = paramInt;
        if (paramInt == 0) {
          i = 30;
        }
        paramInt = i;
      }
    }
    af localaf;
    amn localamn;
    String str;
    do
    {
      localaf = this.qDn;
      localamn = this.fNf;
      i = this.hzl;
      str = this.fAx;
      localaf.fNf = localamn;
      localaf.hzl = i;
      localaf.fxL = str;
      localaf.hSn = ap.C(localamn);
      localaf.hSm = ap.ar(i, localamn.mDo);
      if ((!bg.mZ(localaf.hSn)) && (!bg.mZ(localaf.hSm))) {
        break;
      }
      GMTrace.o(8728581505024L, 65033);
      return;
      w.i("MicroMsg.OnlineVideoView", "%d it start offline download video", new Object[] { Integer.valueOf(hashCode()) });
      this.qDh = 2;
      paramBoolean = false;
    } while (paramInt != 0);
    for (;;)
    {
      paramInt = 31;
    }
    w.i("MicroMsg.OnlineVideoViewHelper", "start online download video %s isPlayMode %b", new Object[] { localaf.hSm, Boolean.valueOf(paramBoolean) });
    com.tencent.mm.plugin.sns.model.ae.bhn().a(localamn, i, str, paramBoolean, true, paramInt);
    localaf.hSp = 1;
    localaf.hta = bg.Pp();
    if (paramBoolean)
    {
      com.tencent.mm.plugin.report.service.g.paX.a(354L, 201L, 1L, false);
      GMTrace.o(8728581505024L, 65033);
      return;
    }
    com.tencent.mm.plugin.report.service.g.paX.a(354L, 202L, 1L, false);
    GMTrace.o(8728581505024L, 65033);
  }
  
  private void uQ(int paramInt)
  {
    GMTrace.i(8728044634112L, 65029);
    String str = am.dt(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), this.fNf.nas) + com.tencent.mm.plugin.sns.data.i.e(this.fNf);
    Intent localIntent = new Intent();
    localIntent.putExtra("Select_Conv_Type", 3);
    localIntent.putExtra("select_is_ret", true);
    localIntent.putExtra("mutil_select_is_ret", true);
    localIntent.putExtra("image_path", str);
    localIntent.putExtra("Retr_Msg_Type", 11);
    w.i("MicroMsg.OnlineVideoView", "send video path %s reqCode %d", new Object[] { str, Integer.valueOf(paramInt) });
    com.tencent.mm.bi.d.a(this.mContext, ".ui.transmit.SelectConversationUI", localIntent, paramInt);
    this.fNE = 0;
    GMTrace.o(8728044634112L, 65029);
  }
  
  public final void ML()
  {
    GMTrace.i(8730326335488L, 65046);
    w.i("MicroMsg.OnlineVideoView", "%d pauseByDataBlock", new Object[] { Integer.valueOf(hashCode()) });
    bma();
    aaN();
    if (this.kwz.isPlaying())
    {
      w.i("MicroMsg.OnlineVideoView", "%d pause play", new Object[] { Integer.valueOf(hashCode()) });
      bma();
      this.kwz.pause();
    }
    GMTrace.o(8730326335488L, 65046);
  }
  
  public final void Xd()
  {
    GMTrace.i(8729521029120L, 65040);
    w.i("MicroMsg.OnlineVideoView", "%d onPrepared playErrorCode[%d] onErrorPlayTimeSec[%d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(this.lUL), Integer.valueOf(this.qDq) });
    this.lUL = 0;
    if (this.qDq > 0)
    {
      qp(this.qDq);
      this.qDq = 0;
      GMTrace.o(8729521029120L, 65040);
      return;
    }
    this.qDr = 0;
    aIO();
    blZ();
    this.kwz.start();
    this.duration = (this.kwz.getDuration() / 1000);
    w.i("MicroMsg.OnlineVideoView", "%d start play duration %d sns local id %s ", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(this.duration), this.fAx });
    bD(false);
    GMTrace.o(8729521029120L, 65040);
  }
  
  public final void a(amn paramamn, String paramString, int paramInt)
  {
    GMTrace.i(8727239327744L, 65023);
    this.fAx = paramString;
    this.hzl = paramInt;
    paramString = an.bQy();
    paramString.time = this.hzl;
    this.pYm = paramString;
    if (this.fNf != paramamn)
    {
      this.fNf = paramamn;
      boolean bool = com.tencent.mm.plugin.sns.model.ae.bhm().c(this.fNf, this.lUH, i.e.black, this.mContext.hashCode(), this.pYm);
      w.i("MicroMsg.OnlineVideoView", "%d fresh thumb image %b", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(bool) });
    }
    this.qDi = false;
    w.i("MicroMsg.OnlineVideoView", "%d set video data[%s, %d] isPreview %b ", new Object[] { Integer.valueOf(hashCode()), this.fAx, Integer.valueOf(this.hzl), Boolean.valueOf(this.qDi) });
    GMTrace.o(8727239327744L, 65023);
  }
  
  public final void av(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8730057900032L, 65044);
    w.i("MicroMsg.OnlineVideoView", "%d prepare video isOnlinePlay %b filePath %s", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(paramBoolean), paramString });
    if (bg.mZ(paramString))
    {
      w.w("MicroMsg.OnlineVideoView", "%d prepare video but filepath is null.", new Object[] { Integer.valueOf(hashCode()) });
      GMTrace.o(8730057900032L, 65044);
      return;
    }
    this.qDo = paramBoolean;
    Object localObject;
    boolean bool;
    if (this.kwz != null)
    {
      if (this.qDr == -3) {
        break label256;
      }
      if ((this.kwz instanceof VideoPlayerTextureView))
      {
        localObject = (VideoPlayerTextureView)this.kwz;
        if (this.qDo) {
          break label235;
        }
        bool = false;
        ((VideoPlayerTextureView)localObject).fT(bool);
        ((VideoPlayerTextureView)this.kwz).fU(paramBoolean);
      }
      this.kwz.a(this.qDd);
      this.kwz.setVideoPath(paramString);
      a(true, 0.0F);
    }
    for (;;)
    {
      com.tencent.mm.kernel.h.xA();
      if (((Integer)com.tencent.mm.kernel.h.xz().xi().get(w.a.uZI, Integer.valueOf(0))).intValue() == 1)
      {
        this.lUI.setText(com.tencent.mm.plugin.sight.base.d.Ca(paramString));
        this.lUI.setVisibility(0);
      }
      GMTrace.o(8730057900032L, 65044);
      return;
      label235:
      com.tencent.mm.kernel.h.xA();
      bool = com.tencent.mm.kernel.h.xz().xi().c(w.a.vaK, false);
      break;
      label256:
      w.i("MicroMsg.OnlineVideoView", "%d prepare video reset source", new Object[] { Integer.valueOf(hashCode()) });
      if ((this.kwz instanceof VideoPlayerTextureView))
      {
        localObject = (VideoPlayerTextureView)this.kwz;
        w.i("MicroMsg.VideoPlayerTextureView", "%d reset source ", new Object[] { Integer.valueOf(localObject.hashCode()) });
        if (((VideoPlayerTextureView)localObject).tmD != null)
        {
          localObject = ((VideoPlayerTextureView)localObject).tmD;
          if (((com.tencent.mm.plugin.r.i)localObject).nJo != null) {
            ((com.tencent.mm.plugin.r.i)localObject).nJo.aNH();
          }
        }
      }
      qp(this.qDq);
    }
  }
  
  protected final void bD(boolean paramBoolean)
  {
    GMTrace.i(14710799859712L, 109604);
    if (this.qDo)
    {
      if (paramBoolean)
      {
        com.tencent.mm.sdk.platformtools.af.u(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(14707175981056L, 109577);
            if ((OnlineVideoView.d(OnlineVideoView.this) != null) && (OnlineVideoView.k(OnlineVideoView.this) != null))
            {
              int i = OnlineVideoView.d(OnlineVideoView.this).getCurrentPosition() / 1000;
              OnlineVideoView.k(OnlineVideoView.this).gY(i);
            }
            OnlineVideoView.l(OnlineVideoView.this).w(500L, 500L);
            GMTrace.o(14707175981056L, 109577);
          }
        });
        GMTrace.o(14710799859712L, 109604);
        return;
      }
      this.qDu.w(500L, 500L);
      GMTrace.o(14710799859712L, 109604);
      return;
    }
    this.kwG.w(500L, 500L);
    GMTrace.o(14710799859712L, 109604);
  }
  
  public final int bL(int paramInt1, int paramInt2)
  {
    GMTrace.i(8729789464576L, 65042);
    GMTrace.o(8729789464576L, 65042);
    return 0;
  }
  
  public final void blV()
  {
    GMTrace.i(8727105110016L, 65022);
    w.d("MicroMsg.OnlineVideoView", "%d unRegister sns ui event", new Object[] { Integer.valueOf(hashCode()) });
    com.tencent.mm.sdk.b.a.uLm.c(this.qDx);
    GMTrace.o(8727105110016L, 65022);
  }
  
  protected final void blX()
  {
    GMTrace.i(18573988724736L, 138387);
    this.qDu.MM();
    this.kwG.MM();
    GMTrace.o(18573988724736L, 138387);
  }
  
  public final boolean blY()
  {
    boolean bool = true;
    GMTrace.i(8730192117760L, 65045);
    w.i("MicroMsg.OnlineVideoView", "%d resumeByDataGain", new Object[] { Integer.valueOf(hashCode()) });
    if (!this.kwz.isPlaying())
    {
      blZ();
      bool = this.kwz.start();
      aIO();
    }
    GMTrace.o(8730192117760L, 65045);
    return bool;
  }
  
  public final int bmb()
  {
    GMTrace.i(8731400077312L, 65054);
    if (this.qDz < 0) {
      this.qDz = 0;
    }
    w.i("MicroMsg.OnlineVideoView", "%d get play video duration [%d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(this.qDz) });
    int i = this.qDz;
    GMTrace.o(8731400077312L, 65054);
    return i;
  }
  
  public final int bmc()
  {
    GMTrace.i(8731534295040L, 65055);
    int i = this.lUL;
    GMTrace.o(8731534295040L, 65055);
    return i;
  }
  
  public final int bmd()
  {
    int j = 0;
    GMTrace.i(8731668512768L, 65056);
    if ((this.qDt > 0L) && (this.qDs > 0L)) {}
    for (int i = (int)(this.qDt - this.qDs);; i = 0)
    {
      if (i < 0) {
        i = j;
      }
      for (;;)
      {
        GMTrace.o(8731668512768L, 65056);
        return i;
      }
    }
  }
  
  public final void br(int paramInt1, int paramInt2)
  {
    GMTrace.i(8729923682304L, 65043);
    GMTrace.o(8729923682304L, 65043);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(8727910416384L, 65028);
    w.d("MicroMsg.OnlineVideoView", "%d on destroy %s", new Object[] { Integer.valueOf(hashCode()), bg.bOd() });
    this.qDt = bg.Pp();
    w.i("MicroMsg.OnlineVideoView", "%d logic unInit", new Object[] { Integer.valueOf(hashCode()) });
    bma();
    this.kwz.stop();
    com.tencent.mm.sdk.b.a.uLm.c(this.qeX);
    com.tencent.mm.sdk.b.a.uLm.c(this.qDw);
    com.tencent.mm.plugin.sns.model.ae.bhk().b(this.qDv);
    blX();
    this.kvt.removeCallbacksAndMessages(null);
    if (this.qDn != null)
    {
      this.qDn.bmg();
      this.qDn.clear();
    }
    if (com.tencent.mm.p.a.pF() != null) {
      com.tencent.mm.p.a.pF().rm();
    }
    if (this.jdd != null) {
      this.jdd.bc(false);
    }
    this.jdd = null;
    this.fNf = null;
    this.fAx = null;
    this.qDn = null;
    this.qDr = 0;
    GMTrace.o(8727910416384L, 65028);
  }
  
  public final void onError(int paramInt1, int paramInt2)
  {
    GMTrace.i(8729386811392L, 65039);
    w.e("MicroMsg.OnlineVideoView", "%d on play video error what %d extra %d. isOnlinePlay %b isMMVideoPlayer[%b]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(this.qDo), Boolean.valueOf(this.lUK) });
    Object localObject;
    if (this.qDo)
    {
      com.tencent.mm.plugin.report.service.g.paX.a(354L, 230L, 1L, false);
      this.lUL = paramInt2;
      bma();
      localObject = this.kwz.Nx();
      this.qDq = (this.kwz.getCurrentPosition() / 1000);
      if (!this.qDo) {
        break label380;
      }
      if (paramInt1 != -2) {
        break label346;
      }
      this.kwz.stop();
    }
    for (;;)
    {
      try
      {
        aaN();
        if (this.qDn != null)
        {
          localObject = this.qDn;
          String str = ((af)localObject).hSm + 0 + "_-1";
          if (!((af)localObject).qDG.containsKey(str))
          {
            w.i("MicroMsg.OnlineVideoViewHelper", "request all data. [%s]", new Object[] { ((af)localObject).hSm });
            o.Nb();
            com.tencent.mm.modelcdntran.f.e(((af)localObject).hSm, 0, -1);
            ((af)localObject).qDG.put(str, Integer.valueOf(0));
            com.tencent.mm.plugin.report.service.g.paX.a(354L, 207L, 1L, false);
            com.tencent.mm.plugin.report.service.g.paX.i(13836, new Object[] { Integer.valueOf(403), Long.valueOf(bg.Po()), "" });
          }
          ((af)localObject).hSq = 5;
          ((af)localObject).hSv = true;
          ((af)localObject).hSy = false;
        }
        bma();
        GMTrace.o(8729386811392L, 65039);
        return;
      }
      catch (Exception localException)
      {
        label346:
        GMTrace.o(8729386811392L, 65039);
        return;
      }
      com.tencent.mm.plugin.report.service.g.paX.a(354L, 231L, 1L, false);
      break;
      if (paramInt1 == -3)
      {
        this.qDr = paramInt1;
        this.kwz.pause();
      }
    }
    label380:
    this.kwz.stop();
    this.lUJ = true;
    a(false, 0.0F);
    if (!bg.mZ(localException))
    {
      w.w("MicroMsg.OnlineVideoView", "%d start third player to play", new Object[] { Integer.valueOf(hashCode()) });
      this.kvt.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14703954755584L, 109553);
          Intent localIntent = new Intent();
          localIntent.setAction("android.intent.action.VIEW");
          localIntent.setDataAndType(Uri.fromFile(new File(localException)), "video/*");
          try
          {
            OnlineVideoView.this.getContext().startActivity(localIntent);
            GMTrace.o(14703954755584L, 109553);
            return;
          }
          catch (Exception localException)
          {
            w.e("MicroMsg.OnlineVideoView", "startActivity fail, activity not found");
            com.tencent.mm.ui.base.h.h(OnlineVideoView.this.getContext(), i.j.dXl, i.j.dXm);
            GMTrace.o(14703954755584L, 109553);
          }
        }
      });
    }
    GMTrace.o(8729386811392L, 65039);
  }
  
  public final void onPause()
  {
    GMTrace.i(18573720289280L, 138385);
    w.d("MicroMsg.OnlineVideoView", "%d on pause %s ", new Object[] { Integer.valueOf(hashCode()), bg.bOd() });
    blX();
    if (this.kwz != null) {
      this.kwz.stop();
    }
    GMTrace.o(18573720289280L, 138385);
  }
  
  public final void onResume()
  {
    GMTrace.i(8727641980928L, 65026);
    w.d("MicroMsg.OnlineVideoView", "%d on resume %s", new Object[] { Integer.valueOf(hashCode()), bg.bOd() });
    this.qDs = bg.Pp();
    if (this.qDn == null)
    {
      w.i("MicroMsg.OnlineVideoView", "%d logic init, create new helper and add listener.", new Object[] { Integer.valueOf(hashCode()) });
      this.qDn = new af(this);
      com.tencent.mm.sdk.b.a.uLm.b(this.qeX);
      com.tencent.mm.sdk.b.a.uLm.b(this.qDw);
      com.tencent.mm.plugin.sns.model.ae.bhk().a(this.qDv);
      this.jdd = new com.tencent.mm.x.d();
      this.jdd.a(this);
      if (com.tencent.mm.p.a.pF() != null) {
        com.tencent.mm.p.a.pF().rn();
      }
    }
    if (!this.lUJ) {
      blS();
    }
    this.qDa = true;
    GMTrace.o(8727641980928L, 65026);
  }
  
  public final void qp(int paramInt)
  {
    GMTrace.i(15298270855168L, 113981);
    w.i("MicroMsg.OnlineVideoView", "%d seek second %d afterSeekPlay %b", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt), Boolean.valueOf(true) });
    this.qDr = 0;
    aIO();
    this.kwz.c(paramInt * 1000, true);
    bD(false);
    GMTrace.o(15298270855168L, 113981);
  }
  
  public final void qq()
  {
    GMTrace.i(8729655246848L, 65041);
    w.i("MicroMsg.OnlineVideoView", "%d on completion", new Object[] { Integer.valueOf(hashCode()) });
    if (this.qDl == null)
    {
      if ((com.tencent.mm.compatible.util.d.ev(18)) || (!this.lUK))
      {
        qp(0);
        GMTrace.o(8729655246848L, 65041);
        return;
      }
      if (this.kwz != null)
      {
        String str = this.kwz.Nx();
        this.kwz.stop();
        av(str, this.qDo);
      }
    }
    GMTrace.o(8729655246848L, 65041);
  }
  
  public static abstract interface a {}
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/OnlineVideoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */