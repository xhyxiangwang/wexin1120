package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.ae.a.c;
import com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar;
import com.tencent.mm.plugin.sight.decode.ui.VideoPlayView;
import com.tencent.mm.plugin.sight.decode.ui.VideoPlayView.5;
import com.tencent.mm.plugin.sight.decode.ui.VideoPlayView.6;
import com.tencent.mm.plugin.sight.decode.ui.VideoPlayView.a;
import com.tencent.mm.plugin.sns.a.b.j.a;
import com.tencent.mm.plugin.sns.a.b.j.c;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.am;
import com.tencent.mm.plugin.sns.model.b.a;
import com.tencent.mm.plugin.sns.model.b.b;
import com.tencent.mm.pluginsdk.ui.tools.f;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.p;
import com.tencent.mm.w.f.a;
import com.tencent.mm.w.m.a;
import com.tencent.mm.x.o;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@com.tencent.mm.ui.base.a(19)
public class VideoAdPlayerUI
  extends MMActivity
  implements b.a, b.b
{
  private String bssid;
  private String fBx;
  private String fMi;
  private String hCR;
  private String hdf;
  private String hdg;
  private String iLj;
  private com.tencent.mm.x.d jdd;
  private boolean kKg;
  private String mediaId;
  private boolean pYb;
  private com.tencent.mm.plugin.sns.storage.m qGc;
  private com.tencent.mm.plugin.sns.a.b.h qNU;
  private VideoPlayView qTa;
  private com.tencent.mm.modelsns.b qTb;
  private String qTc;
  private int qTd;
  private String qTe;
  public String qTf;
  public String qTg;
  private int qTh;
  private int qTi;
  private String qTj;
  private String qTk;
  private String qTl;
  private long qTm;
  private int qTn;
  private int qTo;
  private boolean qTp;
  private boolean qTq;
  private amn qTr;
  private String qTs;
  private int qTt;
  private String[] qTu;
  private String[] qTv;
  private String qno;
  private String ssid;
  private String thumbUrl;
  private String url;
  
  public VideoAdPlayerUI()
  {
    GMTrace.i(8605101195264L, 64113);
    this.qTb = null;
    this.qNU = new com.tencent.mm.plugin.sns.a.b.h("VideoAdPlayerUI");
    this.hCR = "";
    this.fBx = "";
    this.qTc = "";
    this.url = "";
    this.thumbUrl = "";
    this.mediaId = "";
    this.pYb = false;
    this.qTd = 0;
    this.qTe = "";
    this.hdf = "";
    this.hdg = "";
    this.qTf = "";
    this.qTg = "";
    this.qTh = 0;
    this.qTi = 0;
    this.qTj = "";
    this.qTl = "";
    this.qTm = 0L;
    this.qTn = 0;
    this.qTo = 0;
    this.qno = "";
    this.iLj = "";
    this.qTp = false;
    this.qTq = false;
    this.qTr = null;
    this.kKg = false;
    this.qTu = null;
    this.qTv = null;
    GMTrace.o(8605101195264L, 64113);
  }
  
  private void ve(int paramInt)
  {
    GMTrace.i(8606980243456L, 64127);
    if (!this.pYb)
    {
      GMTrace.o(8606980243456L, 64127);
      return;
    }
    this.qNU.tN(this.qTa.getDuration());
    this.qNU.pWP.pXQ = bg.Pq();
    com.tencent.mm.plugin.sns.a.b.a.a locala = this.qNU.pWP;
    if (paramInt == 2) {}
    for (paramInt = 2;; paramInt = 1)
    {
      locala.pXP = paramInt;
      this.qNU.pWP.pXO = 2;
      w.i("MicroMsg.VideoPlayerUI", "duration  orient " + this.qNU.pWP.pXP);
      GMTrace.o(8606980243456L, 64127);
      return;
    }
  }
  
  public final void Gm(String paramString)
  {
    GMTrace.i(8606174937088L, 64121);
    GMTrace.o(8606174937088L, 64121);
  }
  
  protected final int Qb()
  {
    GMTrace.i(8606711808000L, 64125);
    if (this.qTq)
    {
      GMTrace.o(8606711808000L, 64125);
      return 0;
    }
    GMTrace.o(8606711808000L, 64125);
    return 4;
  }
  
  public final void ar(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8606309154816L, 64122);
    GMTrace.o(8606309154816L, 64122);
  }
  
  public final void as(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8606577590272L, 64124);
    w.i("MicroMsg.VideoPlayerUI", "onSightFinish " + paramString);
    this.qTa.hs(false);
    this.qTa.setVideoPath(this.hCR);
    this.qTa.o(this.qTa.bfa());
    this.qTa.ch(false);
    if ((this.pYb) && (!bg.mZ(paramString)) && (this.qTr != null) && (paramString.equals(this.qTr.nas)) && (FileOp.aZ(this.hCR))) {
      this.qNU.pWI = 1;
    }
    GMTrace.o(8606577590272L, 64124);
  }
  
  public final void bgh()
  {
    GMTrace.i(8606443372544L, 64123);
    GMTrace.o(8606443372544L, 64123);
  }
  
  public final void dq(String paramString1, String paramString2)
  {
    GMTrace.i(8606040719360L, 64120);
    w.i("MicroMsg.VideoPlayerUI", "isPlaying " + this.qTa.isPlaying());
    if (this.qTa.isPlaying())
    {
      GMTrace.o(8606040719360L, 64120);
      return;
    }
    this.qTa.ch(false);
    if (paramString2.equals(this.qTa.hCR))
    {
      this.qTa.o(this.qTa.bfa());
      this.qTa.start();
      w.i("MicroMsg.VideoPlayerUI", "onSightProgressstart " + paramString1 + " path: " + paramString2);
      GMTrace.o(8606040719360L, 64120);
      return;
    }
    this.qTa.setVideoPath(paramString2);
    this.qTa.o(this.qTa.bfa());
    w.i("MicroMsg.VideoPlayerUI", "onSightProgresssetVideoPath " + paramString1 + " path: " + paramString2);
    GMTrace.o(8606040719360L, 64120);
  }
  
  public void finish()
  {
    GMTrace.i(18572378112000L, 138375);
    if (this.kKg) {
      this.qTa.pause();
    }
    if ((this.qNU != null) && (this.qno != null) && (this.qno.length() > 0))
    {
      Object localObject = this.qNU;
      ((com.tencent.mm.plugin.sns.a.b.h)localObject).pWM = 0;
      ((com.tencent.mm.plugin.sns.a.b.h)localObject).pWN = 0;
      ((com.tencent.mm.plugin.sns.a.b.h)localObject).pWO = 0;
      Iterator localIterator = ((com.tencent.mm.plugin.sns.a.b.h)localObject).pWQ.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.sns.a.b.a.a locala = (com.tencent.mm.plugin.sns.a.b.a.a)localIterator.next();
        ((com.tencent.mm.plugin.sns.a.b.h)localObject).pWM += locala.pXK;
        ((com.tencent.mm.plugin.sns.a.b.h)localObject).pWN += locala.pXL;
        int i = ((com.tencent.mm.plugin.sns.a.b.h)localObject).pWO;
        ((com.tencent.mm.plugin.sns.a.b.h)localObject).pWO = (locala.pXM + i);
      }
      if ((((com.tencent.mm.plugin.sns.a.b.h)localObject).pWP != null) && (!((com.tencent.mm.plugin.sns.a.b.h)localObject).pWQ.contains(((com.tencent.mm.plugin.sns.a.b.h)localObject).pWP)))
      {
        ((com.tencent.mm.plugin.sns.a.b.h)localObject).pWM += ((com.tencent.mm.plugin.sns.a.b.h)localObject).pWP.pXK;
        ((com.tencent.mm.plugin.sns.a.b.h)localObject).pWN += ((com.tencent.mm.plugin.sns.a.b.h)localObject).pWP.pXL;
        ((com.tencent.mm.plugin.sns.a.b.h)localObject).pWO += ((com.tencent.mm.plugin.sns.a.b.h)localObject).pWP.pXM;
      }
      localObject = new Intent();
      ((Intent)localObject).putExtra("KComponentCid", this.qno);
      ((Intent)localObject).putExtra("KStreamVideoPlayCount", this.qNU.pWM);
      ((Intent)localObject).putExtra("KStreamVideoPlayCompleteCount", this.qNU.pWN);
      ((Intent)localObject).putExtra("KStreamVideoTotalPlayTimeInMs", this.qNU.pWO);
      setResult(-1, (Intent)localObject);
    }
    super.finish();
    GMTrace.o(18572378112000L, 138375);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8605906501632L, 64119);
    int i = i.g.pPW;
    GMTrace.o(8605906501632L, 64119);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8605369630720L, 64115);
    w.i("MicroMsg.VideoPlayerUI", "onActivityResult %d", new Object[] { Integer.valueOf(paramInt1) });
    Object localObject1;
    if (4097 == paramInt1)
    {
      if (-1 == paramInt2)
      {
        localObject1 = paramIntent.getStringExtra("Select_Conv_User");
        String str1 = paramIntent.getStringExtra("custom_send_text");
        Iterator localIterator = bg.f(((String)localObject1).split(",")).iterator();
        while (localIterator.hasNext())
        {
          String str2 = (String)localIterator.next();
          w.i("MicroMsg.VideoPlayerUI", "send sight to %s", new Object[] { str2 });
          Object localObject2 = new f.a();
          ((f.a)localObject2).title = this.qTe;
          ((f.a)localObject2).type = 4;
          label166:
          label188:
          label301:
          int j;
          label623:
          String str3;
          int k;
          String str4;
          String str5;
          String str6;
          long l;
          int m;
          int n;
          if (!bg.mZ(this.qTr.mDo))
          {
            ((f.a)localObject2).url = this.qTr.mDo;
            if (!bg.mZ(this.qTr.uhK)) {
              break label740;
            }
            localObject1 = this.qTr.uhA;
            ((f.a)localObject2).thumburl = ((String)localObject1);
            ((f.a)localObject2).hdc = this.qTr.uhH;
            ((f.a)localObject2).hdd = this.qTr.qTd;
            ((f.a)localObject2).hde = this.qTe;
            ((f.a)localObject2).hdg = this.hdg;
            ((f.a)localObject2).hdf = this.hdf;
            ((f.a)localObject2).hdh = this.thumbUrl;
            ((f.a)localObject2).hdi = this.qTf;
            ((f.a)localObject2).hdj = this.qTg;
            ((f.a)localObject2).fMi = this.fMi;
            localObject1 = FileOp.c(this.fBx, 0, -1);
            if (localObject1 != null) {
              break label752;
            }
            i = 0;
            w.i("MicroMsg.VideoPlayerUI", "read buf size %d", new Object[] { Integer.valueOf(i) });
            if (m.a.yA() != null) {
              m.a.yA().a((f.a)localObject2, "", "", str2, "", (byte[])localObject1);
            }
            if (this.qTt != 0)
            {
              j = this.qNU.pWP.pXM;
              i = j;
              if (this.kKg)
              {
                i = j;
                if (this.qNU.pWP.pXQ != 0L) {
                  i = j + (int)(bg.aG(this.qNU.pWP.pXQ) / 1000L);
                }
              }
              localObject1 = new com.tencent.mm.modelstat.h(13228, "1,3," + i + "," + this.ssid + "," + this.bssid + "," + bg.Po() + "," + this.qTs + "," + this.qTd, (int)bg.Po());
              com.tencent.mm.kernel.h.xA();
              com.tencent.mm.kernel.h.xy().gQO.a((k)localObject1, 0);
            }
            com.tencent.mm.plugin.messenger.a.d.aNb().cM(str1, str2);
            if (this.pYb)
            {
              localObject1 = new com.tencent.mm.plugin.sns.a.b.c(this.iLj, 12, 6, "", 2, this.qGc.bjM());
              com.tencent.mm.kernel.h.xA();
              com.tencent.mm.kernel.h.xy().gQO.a((k)localObject1, 0);
            }
            if (this.qTi == 0) {
              continue;
            }
            boolean bool = o.dW(str2);
            if (!bool) {
              break label760;
            }
            localObject1 = j.c.pXx;
            localObject2 = this.qTg;
            str3 = this.qTf;
            j = this.qTh;
            k = this.qTi;
            str4 = this.qTj;
            str5 = this.qTk;
            str6 = this.qTl;
            l = this.qTm;
            m = this.qTn;
            n = this.qTo;
            if (!bool) {
              break label768;
            }
          }
          label740:
          label752:
          label760:
          label768:
          for (int i = com.tencent.mm.x.j.eU(str2);; i = 0)
          {
            com.tencent.mm.plugin.sns.a.b.j.a((j.c)localObject1, (String)localObject2, str3, j, k, str4, str5, str6, l, m, n, i);
            break;
            ((f.a)localObject2).url = this.qTr.uhH;
            break label166;
            localObject1 = this.qTr.uhK;
            break label188;
            i = localObject1.length;
            break label301;
            localObject1 = j.c.pXw;
            break label623;
          }
        }
        com.tencent.mm.ui.snackbar.a.e(this, getString(i.j.egk));
      }
    }
    else if (4098 == paramInt1)
    {
      if (this.qTi != 0) {
        com.tencent.mm.plugin.sns.a.b.j.a(j.c.pXy, this.qTg, this.qTf, this.qTh, this.qTi, this.qTj, this.qTk, this.qTl, this.qTm, this.qTn, this.qTo, 0);
      }
      if (-1 != paramInt2) {
        break label973;
      }
      if (this.pYb)
      {
        localObject1 = new com.tencent.mm.plugin.sns.a.b.c(this.iLj, 15, 6, "", 2, this.qGc.bjM());
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.a((k)localObject1, 0);
      }
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      GMTrace.o(8605369630720L, 64115);
      return;
      if (!this.pYb) {
        break;
      }
      localObject1 = new com.tencent.mm.plugin.sns.a.b.c(this.iLj, 13, 6, "", 2, this.qGc.bjM());
      com.tencent.mm.kernel.h.xA();
      com.tencent.mm.kernel.h.xy().gQO.a((k)localObject1, 0);
      break;
      label973:
      if (this.pYb)
      {
        localObject1 = new com.tencent.mm.plugin.sns.a.b.c(this.iLj, 16, 6, "", 2, this.qGc.bjM());
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.a((k)localObject1, 0);
      }
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(8606846025728L, 64126);
    super.onConfigurationChanged(paramConfiguration);
    VideoPlayView localVideoPlayView = this.qTa;
    w.i("MicroMsg.VideoPlayView", "onConfigurationChanged " + paramConfiguration.orientation + " " + localVideoPlayView.pDf);
    if (localVideoPlayView.pDf != paramConfiguration.orientation)
    {
      if (paramConfiguration.orientation != 1) {
        break label125;
      }
      localVideoPlayView.update(1);
    }
    for (;;)
    {
      localVideoPlayView.pDf = paramConfiguration.orientation;
      if (localVideoPlayView.pDf == 2) {
        localVideoPlayView.ocG.setVisibility(8);
      }
      ve(paramConfiguration.orientation);
      GMTrace.o(8606846025728L, 64126);
      return;
      label125:
      localVideoPlayView.update(2);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8605235412992L, 64114);
    super.onCreate(paramBundle);
    this.vov.bUK();
    getWindow().setFlags(1024, 1024);
    this.qTu = new String[] { getString(i.j.pRD), getString(i.j.pRE), getString(i.j.pRC) };
    this.qTv = new String[] { getString(i.j.pRD), getString(i.j.pRE) };
    paramBundle = getIntent().getStringExtra("KSta_SnSId");
    this.qGc = com.tencent.mm.plugin.sns.model.ae.bhp().Hz(com.tencent.mm.plugin.sns.data.i.Gk(paramBundle));
    this.jdd = new com.tencent.mm.x.d();
    this.qTb = com.tencent.mm.modelsns.b.q(getIntent());
    this.hCR = getIntent().getStringExtra("KFullVideoPath");
    this.qTc = getIntent().getStringExtra("KStremVideoUrl");
    this.thumbUrl = getIntent().getStringExtra("KThumUrl");
    this.mediaId = getIntent().getStringExtra("KMediaId");
    this.pYb = getIntent().getBooleanExtra("IsAd", false);
    this.url = getIntent().getStringExtra("KUrl");
    this.qTe = bg.ap(getIntent().getStringExtra("KMediaTitle"), "");
    this.qTd = getIntent().getIntExtra("KMediaVideoTime", 0);
    this.qTp = getIntent().getBooleanExtra("KBlockFav", false);
    this.qTq = getIntent().getBooleanExtra("ForceLandscape", false);
    this.hdf = getIntent().getStringExtra("StreamWording");
    this.hdg = getIntent().getStringExtra("StremWebUrl");
    this.qno = getIntent().getStringExtra("KComponentCid");
    this.qTf = getIntent().getStringExtra("KSta_StremVideoAduxInfo");
    this.qTg = getIntent().getStringExtra("KSta_StremVideoPublishId");
    this.qTh = getIntent().getIntExtra("KSta_SourceType", 0);
    this.qTi = getIntent().getIntExtra("KSta_Scene", 0);
    this.qTj = getIntent().getStringExtra("KSta_FromUserName");
    this.qTk = getIntent().getStringExtra("KSta_ChatName");
    this.qTl = getIntent().getStringExtra("KSta_SnSId");
    this.qTm = getIntent().getLongExtra("KSta_MsgId", 0L);
    this.qTn = getIntent().getIntExtra("KSta_FavID", 0);
    this.qTo = getIntent().getIntExtra("KSta_ChatroomMembercount", 0);
    this.fMi = getIntent().getStringExtra("KSta_SnsStatExtStr");
    this.iLj = bg.ap(getIntent().getStringExtra("KViewId"), "");
    this.qTs = bg.ap(getIntent().getStringExtra("ReportArgs"), "");
    this.qTt = getIntent().getIntExtra("NeedReportData", 0);
    if (this.qTt != 0)
    {
      paramBundle = ((WifiManager)getSystemService("wifi")).getConnectionInfo();
      this.ssid = paramBundle.getSSID();
      this.bssid = paramBundle.getBSSID();
    }
    this.qTr = new amn();
    this.qTr.uhA = this.thumbUrl;
    this.qTr.uhH = this.qTc;
    this.qTr.nas = this.mediaId;
    this.qTr.mDo = this.url;
    this.qTr.uhz = 1;
    this.qTr.qTd = this.qTd;
    this.qNU.pWK = bg.Pq();
    w.i("MicroMsg.VideoPlayerUI", "init streamvideo " + this.qTr.nas + " attachurl:" + this.qTr.uhH + " videoattachTotalTime:" + this.qTr.qTd + " streamvideowording: " + this.hdf + " streamvideoweburl: " + this.hdg + " mediaTitle: " + this.qTe + " thumburl " + this.thumbUrl + " streamvideoaduxinfo " + this.qTf + " streamvideopublishid " + this.qTg);
    Object localObject1;
    if (bg.mZ(this.hCR))
    {
      paramBundle = am.dt(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), this.qTr.nas);
      localObject1 = com.tencent.mm.plugin.sns.data.i.k(this.qTr);
      this.hCR = (paramBundle + (String)localObject1);
    }
    if ((bg.mZ(this.fBx)) || (!com.tencent.mm.a.e.aZ(this.fBx)))
    {
      paramBundle = "attach" + this.qTr.nas;
      localObject1 = am.dt(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), paramBundle);
      this.fBx = ((String)localObject1 + com.tencent.mm.plugin.sns.data.i.FV(paramBundle));
    }
    if (!com.tencent.mm.a.e.aZ(this.fBx)) {}
    try
    {
      paramBundle = new amn();
      paramBundle.aC(this.qTr.toByteArray());
      paramBundle.nas = ("attach" + paramBundle.nas);
      localObject1 = new com.tencent.mm.plugin.sns.data.e(this.qTr);
      ((com.tencent.mm.plugin.sns.data.e)localObject1).pYl = 1;
      ((com.tencent.mm.plugin.sns.data.e)localObject1).nry = this.qTr.nas;
      com.tencent.mm.plugin.sns.model.ae.bhk().a(paramBundle, 7, (com.tencent.mm.plugin.sns.data.e)localObject1, an.vfb);
      getWindow().addFlags(128);
      this.qTa = ((VideoPlayView)findViewById(i.f.pNF));
      paramBundle = this.qTa;
      localObject1 = new AdVideoPlayerLoadingBar(this.vov.voR);
      Object localObject2 = new RelativeLayout.LayoutParams(-1, -2);
      ((RelativeLayout.LayoutParams)localObject2).addRule(12);
      ((RelativeLayout.LayoutParams)localObject2).bottomMargin = BackwardSupportUtil.b.a(paramBundle.getContext(), paramBundle.getContext().getResources().getDimension(a.c.pGw));
      paramBundle.pCQ = ((com.tencent.mm.plugin.sight.decode.ui.a)localObject1);
      paramBundle.kwz.hu(true);
      paramBundle.addView((View)paramBundle.pCQ, (ViewGroup.LayoutParams)localObject2);
      paramBundle.pCQ.a(new VideoPlayView.5(paramBundle));
      paramBundle.pCQ.d(new VideoPlayView.6(paramBundle));
      paramBundle.pCQ.cr(paramBundle.kwz.isPlaying());
      if (paramBundle.pCQ != null) {
        ((View)paramBundle.pCQ).setVisibility(8);
      }
      ((com.tencent.mm.plugin.sight.decode.ui.a)localObject1).seek(0);
      this.qTa.pCO = new VideoPlayView.a()
      {
        public final void bfc()
        {
          GMTrace.i(8532489404416L, 63572);
          VideoAdPlayerUI.d(VideoAdPlayerUI.this).bc(false);
          com.tencent.mm.plugin.sns.a.b.a.a locala = VideoAdPlayerUI.a(VideoAdPlayerUI.this).pWP;
          locala.pXM += (int)bg.aG(VideoAdPlayerUI.a(VideoAdPlayerUI.this).pWP.pXQ);
          VideoAdPlayerUI.a(VideoAdPlayerUI.this, false);
          GMTrace.o(8532489404416L, 63572);
        }
        
        public final void bfd()
        {
          GMTrace.i(8532623622144L, 63573);
          w.i("MicroMsg.VideoPlayerUI", "onPlayCompletion");
          Object localObject = VideoAdPlayerUI.a(VideoAdPlayerUI.this).pWP;
          ((com.tencent.mm.plugin.sns.a.b.a.a)localObject).pXL += 1;
          VideoAdPlayerUI.a(VideoAdPlayerUI.this, false);
          if (VideoAdPlayerUI.e(VideoAdPlayerUI.this) != 0)
          {
            localObject = new com.tencent.mm.modelstat.h(13227, "1,2," + VideoAdPlayerUI.i(VideoAdPlayerUI.this) + "," + VideoAdPlayerUI.f(VideoAdPlayerUI.this) + "," + VideoAdPlayerUI.g(VideoAdPlayerUI.this) + "," + bg.Po() + "," + VideoAdPlayerUI.h(VideoAdPlayerUI.this) + "," + VideoAdPlayerUI.i(VideoAdPlayerUI.this), (int)bg.Po());
            com.tencent.mm.kernel.h.xA();
            com.tencent.mm.kernel.h.xy().gQO.a((k)localObject, 0);
          }
          GMTrace.o(8532623622144L, 63573);
        }
        
        public final void bfe()
        {
          GMTrace.i(18911948963840L, 140905);
          w.i("MicroMsg.VideoPlayerUI", "onPlayDownloadedPartComplete");
          VideoAdPlayerUI.a(VideoAdPlayerUI.this, false);
          VideoAdPlayerUI.c(VideoAdPlayerUI.this).beX();
          GMTrace.o(18911948963840L, 140905);
        }
        
        public final void hv(boolean paramAnonymousBoolean)
        {
          GMTrace.i(8532355186688L, 63571);
          Object localObject;
          if (paramAnonymousBoolean)
          {
            localObject = VideoAdPlayerUI.a(VideoAdPlayerUI.this).pWP;
            if (VideoAdPlayerUI.this.getResources().getConfiguration().orientation != 2) {
              break label307;
            }
          }
          label307:
          for (int i = 2;; i = 1)
          {
            ((com.tencent.mm.plugin.sns.a.b.a.a)localObject).pXP = i;
            VideoAdPlayerUI.a(VideoAdPlayerUI.this).pWP.pXQ = bg.Pq();
            VideoAdPlayerUI.a(VideoAdPlayerUI.this).pWP.pXO = 2;
            VideoAdPlayerUI.a(VideoAdPlayerUI.this).pWP.pXM = 0;
            if ((!VideoAdPlayerUI.b(VideoAdPlayerUI.this)) && ((int)VideoAdPlayerUI.c(VideoAdPlayerUI.this).bfa() == 0))
            {
              localObject = VideoAdPlayerUI.a(VideoAdPlayerUI.this).pWP;
              ((com.tencent.mm.plugin.sns.a.b.a.a)localObject).pXK += 1;
            }
            VideoAdPlayerUI.a(VideoAdPlayerUI.this).pWP.pXQ = bg.Pq();
            VideoAdPlayerUI.d(VideoAdPlayerUI.this).a(VideoAdPlayerUI.c(VideoAdPlayerUI.this));
            if (VideoAdPlayerUI.e(VideoAdPlayerUI.this) != 0)
            {
              localObject = new com.tencent.mm.modelstat.h(13227, "1,1,0," + VideoAdPlayerUI.f(VideoAdPlayerUI.this) + "," + VideoAdPlayerUI.g(VideoAdPlayerUI.this) + "," + bg.Po() + "," + VideoAdPlayerUI.h(VideoAdPlayerUI.this) + "," + VideoAdPlayerUI.i(VideoAdPlayerUI.this), (int)bg.Po());
              com.tencent.mm.kernel.h.xA();
              com.tencent.mm.kernel.h.xy().gQO.a((k)localObject, 0);
            }
            VideoAdPlayerUI.a(VideoAdPlayerUI.this, true);
            GMTrace.o(8532355186688L, 63571);
            return;
          }
        }
        
        public final void tK(int paramAnonymousInt)
        {
          GMTrace.i(8532757839872L, 63574);
          if (VideoAdPlayerUI.i(VideoAdPlayerUI.this) == 0)
          {
            VideoAdPlayerUI.a(VideoAdPlayerUI.this, paramAnonymousInt);
            VideoAdPlayerUI.j(VideoAdPlayerUI.this).qTd = paramAnonymousInt;
          }
          GMTrace.o(8532757839872L, 63574);
        }
      };
      paramBundle = this.qTa;
      int i = this.qTr.qTd;
      if (paramBundle.pCQ.beQ() != i) {
        paramBundle.pCQ.tI(i);
      }
      if (com.tencent.mm.a.e.aZ(this.hCR))
      {
        this.qNU.pWI = 1;
        this.qTa.setVideoPath(this.hCR);
        paramBundle = this.qTa;
        localObject1 = new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(8484573675520L, 63215);
            VideoAdPlayerUI.this.finish();
            GMTrace.o(8484573675520L, 63215);
          }
        };
        paramBundle.pCU.setOnClickListener((View.OnClickListener)localObject1);
        paramBundle = this.qTa;
        localObject1 = new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(8391560790016L, 62522);
            VideoAdPlayerUI localVideoAdPlayerUI = VideoAdPlayerUI.this;
            if (VideoAdPlayerUI.k(VideoAdPlayerUI.this)) {}
            for (paramAnonymousView = VideoAdPlayerUI.l(VideoAdPlayerUI.this);; paramAnonymousView = VideoAdPlayerUI.m(VideoAdPlayerUI.this))
            {
              com.tencent.mm.ui.base.h.a(localVideoAdPlayerUI, null, paramAnonymousView, null, new h.c()
              {
                public final void hC(int paramAnonymous2Int)
                {
                  GMTrace.i(8503095721984L, 63353);
                  switch (paramAnonymous2Int)
                  {
                  }
                  for (;;)
                  {
                    GMTrace.o(8503095721984L, 63353);
                    return;
                    Intent localIntent = new Intent();
                    localIntent.putExtra("Select_Conv_Type", 3);
                    localIntent.putExtra("select_is_ret", true);
                    localIntent.putExtra("mutil_select_is_ret", true);
                    localIntent.putExtra("ad_video_title", VideoAdPlayerUI.n(VideoAdPlayerUI.this));
                    localIntent.putExtra("Retr_Msg_Type", 2);
                    com.tencent.mm.bi.d.a(VideoAdPlayerUI.this, ".ui.transmit.SelectConversationUI", localIntent, 4097);
                    GMTrace.o(8503095721984L, 63353);
                    return;
                    VideoAdPlayerUI.o(VideoAdPlayerUI.this);
                    GMTrace.o(8503095721984L, 63353);
                    return;
                    VideoAdPlayerUI.p(VideoAdPlayerUI.this);
                  }
                }
              });
              GMTrace.o(8391560790016L, 62522);
              return;
            }
          }
        };
        paramBundle.pCV.setOnClickListener((View.OnClickListener)localObject1);
        paramBundle = this.qTa;
        localObject1 = this.hdf;
        localObject2 = new View.OnClickListener()
        {
          public final void onClick(final View paramAnonymousView)
          {
            GMTrace.i(8536650153984L, 63603);
            if (VideoAdPlayerUI.q(VideoAdPlayerUI.this) != 0) {
              com.tencent.mm.plugin.sns.a.b.j.a(j.a.pXj, VideoAdPlayerUI.this.qTg, VideoAdPlayerUI.this.qTf, VideoAdPlayerUI.r(VideoAdPlayerUI.this), VideoAdPlayerUI.q(VideoAdPlayerUI.this), VideoAdPlayerUI.s(VideoAdPlayerUI.this), VideoAdPlayerUI.t(VideoAdPlayerUI.this), VideoAdPlayerUI.u(VideoAdPlayerUI.this), VideoAdPlayerUI.v(VideoAdPlayerUI.this), VideoAdPlayerUI.w(VideoAdPlayerUI.this), VideoAdPlayerUI.x(VideoAdPlayerUI.this));
            }
            if (VideoAdPlayerUI.e(VideoAdPlayerUI.this) != 0)
            {
              int j = VideoAdPlayerUI.a(VideoAdPlayerUI.this).pWP.pXM;
              int i = j;
              if (VideoAdPlayerUI.b(VideoAdPlayerUI.this))
              {
                i = j;
                if (VideoAdPlayerUI.a(VideoAdPlayerUI.this).pWP.pXQ != 0L) {
                  i = j + (int)(bg.aG(VideoAdPlayerUI.a(VideoAdPlayerUI.this).pWP.pXQ) / 1000L);
                }
              }
              paramAnonymousView = new com.tencent.mm.modelstat.h(13228, "1,1," + i + "," + VideoAdPlayerUI.f(VideoAdPlayerUI.this) + "," + VideoAdPlayerUI.g(VideoAdPlayerUI.this) + "," + bg.Po() + "," + VideoAdPlayerUI.h(VideoAdPlayerUI.this) + "," + VideoAdPlayerUI.i(VideoAdPlayerUI.this), (int)bg.Po());
              com.tencent.mm.kernel.h.xA();
              com.tencent.mm.kernel.h.xy().gQO.a(paramAnonymousView, 0);
            }
            VideoAdPlayerUI.this.finish();
            paramAnonymousView = new Intent();
            Object localObject = new Bundle();
            ((Bundle)localObject).putString("key_snsad_statextstr", VideoAdPlayerUI.y(VideoAdPlayerUI.this));
            paramAnonymousView.putExtra("jsapiargs", (Bundle)localObject);
            paramAnonymousView.putExtra("rawUrl", VideoAdPlayerUI.z(VideoAdPlayerUI.this));
            paramAnonymousView.putExtra("useJs", true);
            if (VideoAdPlayerUI.A(VideoAdPlayerUI.this))
            {
              localObject = new com.tencent.mm.plugin.sns.a.b.c(VideoAdPlayerUI.B(VideoAdPlayerUI.this), 18, 6, "", 2, VideoAdPlayerUI.C(VideoAdPlayerUI.this).bjM());
              com.tencent.mm.kernel.h.xA();
              com.tencent.mm.kernel.h.xy().gQO.a((k)localObject, 0);
            }
            new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper()).post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(8573425811456L, 63877);
                com.tencent.mm.plugin.sns.c.a.ifM.j(paramAnonymousView, VideoAdPlayerUI.this);
                GMTrace.o(8573425811456L, 63877);
              }
            });
            GMTrace.o(8536650153984L, 63603);
          }
        };
        paramBundle.pCT = ((String)localObject1);
        paramBundle.pCS.setText((CharSequence)localObject1);
        paramBundle.pCS.setOnClickListener((View.OnClickListener)localObject2);
        this.qTa.beZ();
        if (getIntent().getIntExtra("ShareBtnHidden", 0) != 0)
        {
          paramBundle = this.qTa;
          if (paramBundle.pCV != null)
          {
            paramBundle.pCW = false;
            paramBundle.pCV.setVisibility(8);
          }
        }
        GMTrace.o(8605235412992L, 64114);
        return;
      }
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        w.e("MicroMsg.VideoPlayerUI", "error for download thumb");
        continue;
        this.qTa.beX();
        this.qTa.hs(true);
        com.tencent.mm.plugin.sns.model.ae.bhk().a(this.qTr, 6, null, an.vfb);
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(8605503848448L, 64116);
    super.onDestroy();
    getWindow().clearFlags(128);
    if (this.qTi != 0) {
      com.tencent.mm.plugin.sns.a.b.j.a(j.a.pXl, this.qTg, this.qTf, this.qTh, this.qTi, this.qTj, this.qTk, this.qTl, this.qTm, this.qTn, this.qTo);
    }
    if (this.pYb) {
      if (this.qGc != null) {
        break label329;
      }
    }
    label329:
    for (int i = 0;; i = this.qGc.bkt())
    {
      Object localObject = this.qNU.bfT();
      com.tencent.mm.kernel.h.xA();
      com.tencent.mm.kernel.h.xy().gQO.a(new com.tencent.mm.plugin.sns.a.b.d(this.iLj, 6, 2, this.qNU.pWJ, null, null, 2, (String)localObject, -1, i), 0);
      if (this.qTt != 0)
      {
        int j = this.qNU.pWP.pXM;
        i = j;
        if (this.kKg)
        {
          i = j;
          if (this.qNU.pWP.pXQ != 0L) {
            i = j + (int)(bg.aG(this.qNU.pWP.pXQ) / 1000L);
          }
        }
        localObject = new com.tencent.mm.modelstat.h(13228, "1,2," + i + "," + this.ssid + "," + this.bssid + "," + bg.Po() + "," + this.qTs + "," + this.qTd, (int)bg.Po());
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.a((k)localObject, 0);
      }
      GMTrace.o(8605503848448L, 64116);
      return;
    }
  }
  
  protected void onPause()
  {
    GMTrace.i(8605638066176L, 64117);
    super.onPause();
    int i = getResources().getConfiguration().orientation;
    w.i("MicroMsg.VideoPlayerUI", "onpause  " + i);
    ve(i);
    if ((this.qTa != null) && (this.qTa.isPlaying())) {
      this.qTa.pause();
    }
    if (this.qTa != null)
    {
      w.i("MicroMsg.VideoPlayerUI", "onDetach");
      this.qTa.onDetach();
    }
    com.tencent.mm.plugin.sns.model.ae.bhk().pZY.remove(this);
    com.tencent.mm.plugin.sns.model.ae.bhk().b(this);
    GMTrace.o(8605638066176L, 64117);
  }
  
  protected void onResume()
  {
    GMTrace.i(8605772283904L, 64118);
    super.onResume();
    com.tencent.mm.plugin.sns.model.ae.bhk().pZY.add(this);
    com.tencent.mm.plugin.sns.model.ae.bhk().a(this);
    GMTrace.o(8605772283904L, 64118);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/VideoAdPlayerUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */