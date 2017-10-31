package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Display;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.g.a.cd;
import com.tencent.mm.g.a.df;
import com.tencent.mm.g.a.df.b;
import com.tencent.mm.g.a.os;
import com.tencent.mm.g.a.ow;
import com.tencent.mm.g.a.pa;
import com.tencent.mm.g.a.pb;
import com.tencent.mm.g.a.rb;
import com.tencent.mm.k.e;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.a.b.j.a;
import com.tencent.mm.plugin.sns.a.b.j.b;
import com.tencent.mm.plugin.sns.a.b.j.c;
import com.tencent.mm.plugin.sns.a.b.j.d;
import com.tencent.mm.plugin.sns.a.b.j.e;
import com.tencent.mm.plugin.sns.i.a;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.am;
import com.tencent.mm.plugin.sns.model.b.b;
import com.tencent.mm.pluginsdk.ui.tools.VideoSightView;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.bft;
import com.tencent.mm.protocal.c.bfu;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ad;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.g.b;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.x.d.a;
import com.tencent.mm.x.o;
import com.tencent.mm.x.y;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class SnsSightPlayerUI
  extends MMActivity
  implements b.b, d.a
{
  private int duration;
  private VelocityTracker ez;
  private String fAx;
  private String fBx;
  private amn fNf;
  private int fPe;
  private String hCR;
  private boolean hie;
  private String imagePath;
  private boolean isInit;
  private com.tencent.mm.x.d jdd;
  private GestureDetector jds;
  private int kvA;
  Bundle kvu;
  private boolean kvv;
  com.tencent.mm.ui.tools.g kvw;
  private int kvx;
  private int kvy;
  private int kvz;
  public l kwF;
  com.tencent.mm.pluginsdk.ui.tools.f kwz;
  private int lRC;
  private TextView lVm;
  private boolean lVp;
  private ImageView lWE;
  o.d nHl;
  private int pBL;
  private TextView pCF;
  private boolean pCG;
  ViewGroup pCP;
  private int pCX;
  private int pCY;
  public int pDf;
  private boolean pYb;
  private float qGW;
  private int qGX;
  private int qGY;
  private boolean qMe;
  private float qMg;
  private float qMh;
  private boolean qMi;
  private boolean qMj;
  private boolean qMk;
  private com.tencent.mm.plugin.sns.a.b.h qNU;
  private String qNV;
  private TextView qNW;
  private MMPinProgressBtn qNX;
  private com.tencent.mm.plugin.sns.storage.m qNY;
  private String qNZ;
  private RelativeLayout qOa;
  View.OnCreateContextMenuListener qOb;
  private int scene;
  
  public SnsSightPlayerUI()
  {
    GMTrace.i(8374515138560L, 62395);
    this.qNU = new com.tencent.mm.plugin.sns.a.b.h("SnsSightPlayerUI");
    this.hCR = "";
    this.imagePath = "";
    this.fAx = "";
    this.qNV = "";
    this.pYb = false;
    this.kwz = null;
    this.pCF = null;
    this.qNW = null;
    this.qNX = null;
    this.scene = 0;
    this.duration = 0;
    this.fPe = 0;
    this.pBL = 0;
    this.lRC = 0;
    this.pCG = false;
    this.qMe = false;
    this.pCX = 0;
    this.pCY = 0;
    this.isInit = false;
    this.lVp = false;
    this.qNY = null;
    this.fNf = null;
    this.fBx = "";
    this.qNZ = "";
    this.lVm = null;
    this.kvv = false;
    this.kvx = 0;
    this.kvy = 0;
    this.kvz = 0;
    this.kvA = 0;
    this.qMg = 0.0F;
    this.qMh = 0.0F;
    this.qMi = false;
    this.qMj = false;
    this.qMk = false;
    this.qGW = 1.0F;
    this.qGX = 0;
    this.qGY = 0;
    this.hie = false;
    this.qOb = new View.OnCreateContextMenuListener()
    {
      public final void onCreateContextMenu(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
      {
        GMTrace.i(8580539351040L, 63930);
        if (bg.RF(com.tencent.mm.k.g.uz().getValue("SIGHTCannotTransmitForFav")) == 0)
        {
          boolean bool1 = FileOp.aZ(SnsSightPlayerUI.c(SnsSightPlayerUI.this));
          boolean bool2 = FileOp.aZ(SnsSightPlayerUI.t(SnsSightPlayerUI.this));
          w.i("MicroMsg.SnsSightPlayerUI", "config can forward sight, thumb existed %B, video existed %B", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
          if ((bool1) && (bool2)) {
            paramAnonymousContextMenu.add(0, 3, 0, SnsSightPlayerUI.this.getString(i.j.pRD));
          }
        }
        for (int i = 1;; i = 0)
        {
          if (com.tencent.mm.bi.d.KT("favorite")) {
            paramAnonymousContextMenu.add(0, 2, 0, SnsSightPlayerUI.this.getString(i.j.euj));
          }
          if (i != 0)
          {
            paramAnonymousView = new df();
            paramAnonymousView.fxU.fxL = SnsSightPlayerUI.d(SnsSightPlayerUI.this);
            com.tencent.mm.sdk.b.a.uLm.m(paramAnonymousView);
            if (paramAnonymousView.fxV.fxs) {
              paramAnonymousContextMenu.add(0, 4, 0, SnsSightPlayerUI.this.getString(i.j.pQV));
            }
          }
          if (!SnsSightPlayerUI.i(SnsSightPlayerUI.this)) {
            paramAnonymousContextMenu.add(0, 1, 0, SnsSightPlayerUI.this.vov.voR.getString(i.j.pTX));
          }
          GMTrace.o(8580539351040L, 63930);
          return;
        }
      }
    };
    this.nHl = new o.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(8544971653120L, 63665);
        switch (paramAnonymousMenuItem.getItemId())
        {
        }
        for (;;)
        {
          GMTrace.o(8544971653120L, 63665);
          return;
          paramAnonymousMenuItem = com.tencent.mm.plugin.sns.model.ae.bhp().HA(SnsSightPlayerUI.d(SnsSightPlayerUI.this));
          if (paramAnonymousMenuItem == null)
          {
            GMTrace.o(8544971653120L, 63665);
            return;
          }
          Object localObject = new cd();
          com.tencent.mm.plugin.sns.i.a.a((cd)localObject, paramAnonymousMenuItem);
          ((cd)localObject).fwt.activity = SnsSightPlayerUI.this;
          ((cd)localObject).fwt.fwA = 17;
          com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
          if (SnsSightPlayerUI.i(SnsSightPlayerUI.this))
          {
            localObject = new com.tencent.mm.plugin.sns.a.b.c(paramAnonymousMenuItem.bkp(), 11, 5, "", 2, SnsSightPlayerUI.a(SnsSightPlayerUI.this).bjM());
            com.tencent.mm.kernel.h.xA();
            com.tencent.mm.kernel.h.xy().gQO.a((k)localObject, 0);
            com.tencent.mm.plugin.sns.a.b.j.a(j.d.pXA, j.c.pXv, j.e.pXH, 0, paramAnonymousMenuItem);
          }
          if (SnsSightPlayerUI.e(SnsSightPlayerUI.this) == 0)
          {
            localObject = new ow();
            ((ow)localObject).fMU.fxL = paramAnonymousMenuItem.bkg();
            ((ow)localObject).fMU.fMT = com.tencent.mm.plugin.sns.data.i.g(paramAnonymousMenuItem);
            com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
          }
          GMTrace.o(8544971653120L, 63665);
          return;
          localObject = new Intent();
          com.tencent.mm.plugin.sns.storage.m localm = com.tencent.mm.plugin.sns.model.ae.bhp().HA(SnsSightPlayerUI.d(SnsSightPlayerUI.this));
          if (localm != null) {
            w.i("MicroMsg.SnsSightPlayerUI", "expose id " + localm.bjM());
          }
          if (localm == null)
          {
            paramAnonymousMenuItem = Integer.valueOf(0);
            ((Intent)localObject).putExtra("k_expose_msg_id", paramAnonymousMenuItem);
            if (localm != null) {
              break label396;
            }
          }
          label396:
          for (paramAnonymousMenuItem = "";; paramAnonymousMenuItem = localm.field_userName)
          {
            ((Intent)localObject).putExtra("k_username", paramAnonymousMenuItem);
            ((Intent)localObject).putExtra("showShare", false);
            ((Intent)localObject).putExtra("rawUrl", String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(33) }));
            com.tencent.mm.bi.d.b(SnsSightPlayerUI.this, "webview", ".ui.tools.WebViewUI", (Intent)localObject);
            GMTrace.o(8544971653120L, 63665);
            return;
            paramAnonymousMenuItem = localm.bjM();
            break;
          }
          SnsSightPlayerUI.u(SnsSightPlayerUI.this);
          paramAnonymousMenuItem = new Intent();
          paramAnonymousMenuItem.putExtra("Select_Conv_Type", 3);
          paramAnonymousMenuItem.putExtra("select_is_ret", true);
          paramAnonymousMenuItem.putExtra("mutil_select_is_ret", true);
          paramAnonymousMenuItem.putExtra("image_path", SnsSightPlayerUI.c(SnsSightPlayerUI.this));
          paramAnonymousMenuItem.putExtra("Retr_Msg_Type", 11);
          com.tencent.mm.bi.d.a(SnsSightPlayerUI.this, ".ui.transmit.SelectConversationUI", paramAnonymousMenuItem, 4097);
          GMTrace.o(8544971653120L, 63665);
          return;
          paramAnonymousMenuItem = com.tencent.mm.plugin.sns.model.ae.bhp().HA(SnsSightPlayerUI.d(SnsSightPlayerUI.this));
          if (paramAnonymousMenuItem == null)
          {
            GMTrace.o(8544971653120L, 63665);
            return;
          }
          localObject = new Intent();
          if ((paramAnonymousMenuItem.bjL().uyu.tKc == 15) && ((amn)paramAnonymousMenuItem.bjL().uyu.tKd.get(0) == null))
          {
            w.w("MicroMsg.SnsSightPlayerUI", "send sight fail, mediaObj is null");
            GMTrace.o(8544971653120L, 63665);
            return;
          }
          ((Intent)localObject).putExtra("exdevice_open_scene_type", 2);
          ((Intent)localObject).putExtra("sns_local_id", SnsSightPlayerUI.d(SnsSightPlayerUI.this));
          ((Intent)localObject).putExtra("sns_send_data_ui_activity", true);
          com.tencent.mm.bi.d.a(SnsSightPlayerUI.this, ".ui.chatting.ChattingSendDataToDeviceUI", (Intent)localObject);
        }
      }
    };
    this.pDf = 0;
    GMTrace.o(8374515138560L, 62395);
  }
  
  private void K(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(8377065275392L, 62414);
    if ((this.pCY == 0) || (this.pCX == 0))
    {
      localObject = getResources().getDisplayMetrics();
      this.pCY = ((DisplayMetrics)localObject).heightPixels;
      this.pCX = ((DisplayMetrics)localObject).widthPixels;
    }
    Object localObject = this.pCP.getLayoutParams();
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.qNW.getLayoutParams();
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
    if (paramInt == 1)
    {
      localLayoutParams1.width = this.pCX;
      localLayoutParams1.height = ((int)(this.pCX * 1.0D * 240.0D / 320.0D));
      localLayoutParams.addRule(12, 0);
      localLayoutParams.addRule(1, 0);
      localLayoutParams.addRule(11, -1);
      localLayoutParams.addRule(3, this.pCP.getId());
      findViewById(i.f.cBu).setVisibility(0);
    }
    for (;;)
    {
      w.i("MicroMsg.SnsSightPlayerUI", "orientation " + paramInt + " " + localLayoutParams1.width + " " + localLayoutParams1.height);
      ((View)this.kwz).setLayoutParams(localLayoutParams1);
      if ((this.kwz instanceof com.tencent.mm.plugin.sight.decode.a.a)) {
        ((com.tencent.mm.plugin.sight.decode.a.a)this.kwz).cT(localLayoutParams1.width, localLayoutParams1.height);
      }
      ((ViewGroup.LayoutParams)localObject).height = localLayoutParams1.height;
      ((ViewGroup.LayoutParams)localObject).width = localLayoutParams1.width;
      this.pCF.setLayoutParams(localLayoutParams);
      this.pCP.setLayoutParams((ViewGroup.LayoutParams)localObject);
      ((View)this.kwz).requestLayout();
      if (!paramBoolean) {
        ve(paramInt);
      }
      GMTrace.o(8377065275392L, 62414);
      return;
      localLayoutParams1.height = this.pCX;
      localLayoutParams1.width = ((int)(this.pCX * 1.0D * 320.0D / 240.0D));
      localLayoutParams.addRule(11, 0);
      localLayoutParams.addRule(3, 0);
      localLayoutParams.addRule(12, -1);
      localLayoutParams.addRule(1, this.pCP.getId());
      findViewById(i.f.cBu).setVisibility(8);
    }
  }
  
  private void bjj()
  {
    GMTrace.i(8375052009472L, 62399);
    w.i("MicroMsg.SnsSightPlayerUI", "snsSightplayui pauseplay");
    this.kwz.pause();
    this.kwz.onDetach();
    this.jdd.bc(false);
    GMTrace.o(8375052009472L, 62399);
  }
  
  private void ht(boolean paramBoolean)
  {
    GMTrace.i(8374917791744L, 62398);
    this.kwz.start();
    this.duration = this.kwz.getDuration();
    w.i("MicroMsg.SnsSightPlayerUI", "startplay get duration " + this.duration);
    this.jdd.a(this);
    com.tencent.mm.plugin.sns.a.b.a.a locala;
    if (paramBoolean)
    {
      locala = this.qNU.pWP;
      if (getResources().getConfiguration().orientation != 2) {
        break label134;
      }
    }
    label134:
    for (int i = 2;; i = 1)
    {
      locala.pXP = i;
      this.qNU.pWP.pXQ = bg.Pq();
      this.qNU.pWP.pXO = 2;
      GMTrace.o(8374917791744L, 62398);
      return;
    }
  }
  
  private void ve(int paramInt)
  {
    GMTrace.i(8377199493120L, 62415);
    if (!this.pYb)
    {
      GMTrace.o(8377199493120L, 62415);
      return;
    }
    com.tencent.mm.plugin.sns.a.b.a.a locala;
    if (this.kwz.isPlaying())
    {
      if (this.duration == 0) {
        this.duration = this.kwz.getDuration();
      }
      this.qNU.tN(this.duration);
      this.qNU.pWP.pXQ = bg.Pq();
      locala = this.qNU.pWP;
      if (paramInt != 2) {
        break label168;
      }
    }
    label168:
    for (paramInt = 2;; paramInt = 1)
    {
      locala.pXP = paramInt;
      this.qNU.pWP.pXO = 2;
      w.i("MicroMsg.SnsSightPlayerUI", "duration " + this.duration + " orient " + this.qNU.pWP.pXP);
      GMTrace.o(8377199493120L, 62415);
      return;
    }
  }
  
  public final void Gm(String paramString)
  {
    GMTrace.i(8376259969024L, 62408);
    GMTrace.o(8376259969024L, 62408);
  }
  
  protected final int Qb()
  {
    GMTrace.i(8376796839936L, 62412);
    GMTrace.o(8376796839936L, 62412);
    return 7;
  }
  
  public final void alb()
  {
    GMTrace.i(8375857315840L, 62405);
    int k = this.pCP.getWidth();
    int j = this.pCP.getHeight();
    int i = j;
    if (this.kvz != 0)
    {
      i = j;
      if (this.kvA != 0) {
        i = (int)(k / this.kvz * this.kvA);
      }
    }
    this.kvw.ex(k, i);
    this.kvw.p(this.kvy, this.kvx, this.kvz, this.kvA);
    if (this.qGW != 1.0D)
    {
      int m = ad.fc(this.vov.voR);
      this.kvw.wKp = (1.0F / this.qGW);
      if ((this.qGX != 0) || (this.qGY != 0))
      {
        j = (int)(this.pCP.getWidth() / 2 * (1.0F - this.qGW));
        k = this.qGX;
        i = (int)((m + this.pCP.getHeight()) / 2 - i / 2 * this.qGW + this.qGY);
        this.kvw.ey(j + k, i);
      }
    }
    this.kvw.a(this.pCP, this.lWE, new g.b()
    {
      public final void onAnimationEnd()
      {
        GMTrace.i(8707106668544L, 64873);
        new com.tencent.mm.sdk.platformtools.ae().post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8552085192704L, 63718);
            SnsSightPlayerUI.this.finish();
            SnsSightPlayerUI.this.overridePendingTransition(0, 0);
            GMTrace.o(8552085192704L, 63718);
          }
        });
        GMTrace.o(8707106668544L, 64873);
      }
      
      public final void onAnimationStart()
      {
        GMTrace.i(8706972450816L, 64872);
        if (SnsSightPlayerUI.p(SnsSightPlayerUI.this) != null) {
          SnsSightPlayerUI.p(SnsSightPlayerUI.this).setVisibility(8);
        }
        GMTrace.o(8706972450816L, 64872);
      }
    }, null);
    GMTrace.o(8375857315840L, 62405);
  }
  
  public final void ar(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8376394186752L, 62409);
    GMTrace.o(8376394186752L, 62409);
  }
  
  public final void as(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8376662622208L, 62411);
    w.i("MicroMsg.SnsSightPlayerUI", "onSightFinish " + paramString);
    if ((this.pYb) && (!bg.mZ(paramString)) && (this.fNf != null) && (paramString.equals(this.fNf.nas)) && (FileOp.aZ(this.hCR)))
    {
      this.qNU.pWI = 1;
      this.kwz.setVideoPath(this.hCR);
      ht(true);
      if (this.qNX != null) {
        this.qNX.setVisibility(8);
      }
    }
    GMTrace.o(8376662622208L, 62411);
  }
  
  public final void bgh()
  {
    GMTrace.i(8376528404480L, 62410);
    GMTrace.o(8376528404480L, 62410);
  }
  
  public void finish()
  {
    GMTrace.i(8374783574016L, 62397);
    if (!this.hie)
    {
      super.finish();
      this.hie = true;
    }
    GMTrace.o(8374783574016L, 62397);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8375186227200L, 62400);
    int i = i.g.pPp;
    GMTrace.o(8375186227200L, 62400);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8376125751296L, 62407);
    if (4097 == paramInt1)
    {
      Object localObject1;
      if (-1 == paramInt2)
      {
        localObject1 = paramIntent.getStringExtra("Select_Conv_User");
        String str1 = paramIntent.getStringExtra("custom_send_text");
        Iterator localIterator = bg.f(((String)localObject1).split(",")).iterator();
        String str2;
        label155:
        Object localObject3;
        bfu localbfu;
        label251:
        label271:
        label300:
        label469:
        do
        {
          if (!localIterator.hasNext()) {
            break label854;
          }
          str2 = (String)localIterator.next();
          if (this.scene == 0)
          {
            localObject1 = com.tencent.mm.plugin.sns.model.ae.bhp().HA(this.fAx);
            if (localObject1 != null)
            {
              if (!o.dW(str2)) {
                break;
              }
              localObject2 = new pa();
              ((pa)localObject2).fMY.fMT = com.tencent.mm.plugin.sns.data.i.g((com.tencent.mm.plugin.sns.storage.m)localObject1);
              ((pa)localObject2).fMY.fxL = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkg();
              com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject2);
            }
          }
          localObject2 = this.qNY.bjL();
          if (!this.pYb) {
            break label707;
          }
          localObject3 = this.qNY.bjH();
          localbfu = new bfu();
          localbfu.tQo = this.fNf.qTd;
          localbfu.hdc = this.fNf.uhH;
          if (((bhc)localObject2).uyu.tKc != 15) {
            break label654;
          }
          localbfu.hdi = this.qNY.bjJ().qhb;
          localbfu.hdj = ((bhc)localObject2).nas;
          if (!bg.mZ(this.fNf.uhL)) {
            break label683;
          }
          localObject1 = ((bhc)localObject2).uyr;
          localbfu.hde = ((String)localObject1);
          if (!bg.mZ(this.fNf.uhK)) {
            break label695;
          }
          localObject1 = this.fNf.uhA;
          localbfu.hdh = ((String)localObject1);
          if ((localObject3 != null) && (((com.tencent.mm.plugin.sns.storage.b)localObject3).qlE == 0))
          {
            localbfu.hdg = ((com.tencent.mm.plugin.sns.storage.b)localObject3).qlG;
            localbfu.hdf = ((com.tencent.mm.plugin.sns.storage.b)localObject3).qlF;
          }
          if (localObject3 != null) {
            localbfu.hdg = ((com.tencent.mm.plugin.sns.storage.b)localObject3).qle;
          }
          i = com.tencent.mm.plugin.sns.data.i.Gl(this.hCR);
          w.i("MicroMsg.SnsSightPlayerUI", "send adsight to %s, videopath %s, thumbpath %s url: %s time: %d streamvideothumburl %s, duration: %s", new Object[] { str2, this.hCR, this.imagePath, this.fNf.uhH, Integer.valueOf(this.fNf.qTd), localbfu.hdh, Integer.valueOf(i) });
          com.tencent.mm.plugin.messenger.a.d.aNb().a(this, str2, this.hCR, this.imagePath, 43, i, localbfu, false, false, ((bhc)localObject2).qBT);
          if (str1 != null) {
            com.tencent.mm.plugin.messenger.a.d.aNb().cM(str1, str2);
          }
          com.tencent.mm.ui.snackbar.a.e(this, getString(i.j.egk));
        } while (!this.pYb);
        localObject1 = new com.tencent.mm.plugin.sns.a.b.c(this.qNY.bkp(), 12, 5, "", 2, this.qNY.bjM());
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.a((k)localObject1, 0);
        boolean bool = o.dW(str2);
        Object localObject2 = j.d.pXA;
        if (bool)
        {
          localObject1 = j.c.pXx;
          label572:
          localObject3 = j.e.pXH;
          if (!bool) {
            break label795;
          }
        }
        label654:
        label683:
        label695:
        label707:
        label795:
        for (int i = com.tencent.mm.x.j.eU(str2);; i = 0)
        {
          com.tencent.mm.plugin.sns.a.b.j.a((j.d)localObject2, (j.c)localObject1, (j.e)localObject3, i, this.qNY);
          break;
          localObject2 = new pb();
          ((pb)localObject2).fMZ.fMT = com.tencent.mm.plugin.sns.data.i.g((com.tencent.mm.plugin.sns.storage.m)localObject1);
          ((pb)localObject2).fMZ.fxL = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkg();
          com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject2);
          break label155;
          localbfu.hdi = ((bhc)localObject2).uyz.hdi;
          localbfu.hdj = ((bhc)localObject2).uyz.hdj;
          break label251;
          localObject1 = this.fNf.uhL;
          break label271;
          localObject1 = this.fNf.uhK;
          break label300;
          i = com.tencent.mm.plugin.sns.data.i.Gl(this.hCR);
          w.i("MicroMsg.SnsSightPlayerUI", "send sight to %s, videopath %s, thumbpath %s, duration: %s", new Object[] { str2, this.hCR, this.imagePath, Integer.valueOf(i) });
          com.tencent.mm.plugin.messenger.a.d.aNb().a(this, str2, this.hCR, this.imagePath, 43, i, ((bhc)localObject2).qBT);
          break label469;
          localObject1 = j.c.pXw;
          break label572;
        }
      }
      if (this.pYb)
      {
        localObject1 = new com.tencent.mm.plugin.sns.a.b.c(this.qNY.bkp(), 13, 5, "", 2, this.qNY.bjM());
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.a((k)localObject1, 0);
      }
    }
    label854:
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(8376125751296L, 62407);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(8375991533568L, 62406);
    alb();
    GMTrace.o(8375991533568L, 62406);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(8376931057664L, 62413);
    super.onConfigurationChanged(paramConfiguration);
    w.i("MicroMsg.SnsSightPlayerUI", "onConfigurationChanged " + paramConfiguration.orientation + " " + this.pDf);
    if (this.pDf == paramConfiguration.orientation)
    {
      GMTrace.o(8376931057664L, 62413);
      return;
    }
    int i = paramConfiguration.orientation;
    K(paramConfiguration.orientation, false);
    this.pDf = paramConfiguration.orientation;
    GMTrace.o(8376931057664L, 62413);
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    GMTrace.i(8374649356288L, 62396);
    if (getIntent().getExtras() != null) {
      getIntent().getExtras().setClassLoader(getClass().getClassLoader());
    }
    this.scene = getIntent().getIntExtra("intent_from_scene", -1);
    long l = System.currentTimeMillis();
    super.onCreate(paramBundle);
    this.vov.bUK();
    com.tencent.mm.plugin.sns.model.ae.bhk().a(this);
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().setStatusBarColor(getResources().getColor(i.c.black));
    }
    if (com.tencent.mm.compatible.util.d.et(19))
    {
      getWindow().setFlags(201327616, 201327616);
      this.kvu = paramBundle;
      this.jdd = new com.tencent.mm.x.d();
      this.hCR = getIntent().getStringExtra("intent_videopath");
      this.imagePath = getIntent().getStringExtra("intent_thumbpath");
      this.fAx = getIntent().getStringExtra("intent_localid");
      this.pYb = getIntent().getBooleanExtra("intent_isad", false);
      this.qNY = com.tencent.mm.plugin.sns.model.ae.bhp().HA(this.fAx);
      if (!this.pYb) {
        break label360;
      }
      if (this.qNY != null) {
        break label257;
      }
    }
    label257:
    Object localObject1;
    for (int i = 0;; i = 1)
    {
      if (i != 0) {
        break label360;
      }
      finish();
      GMTrace.o(8374649356288L, 62396);
      return;
      getWindow().setFlags(1024, 1024);
      break;
      this.fNf = ((amn)this.qNY.bjL().uyu.tKd.get(0));
      paramBundle = am.dt(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), this.fNf.nas);
      localObject1 = com.tencent.mm.plugin.sns.data.i.k(this.fNf);
      this.qNZ = (paramBundle + (String)localObject1);
      this.fBx = (paramBundle + com.tencent.mm.plugin.sns.data.i.e(this.fNf));
    }
    label360:
    if (com.tencent.mm.p.a.pF() != null) {
      com.tencent.mm.p.a.pF().rn();
    }
    this.qNU.pWK = bg.Pq();
    this.qOa = ((RelativeLayout)findViewById(i.f.itP));
    this.qOa.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(8682813259776L, 64692);
        SnsSightPlayerUI.this.alb();
        GMTrace.o(8682813259776L, 64692);
        return true;
      }
    });
    w.d("MicroMsg.SnsSightPlayerUI", com.tencent.mm.compatible.util.g.tG() + " initView: fullpath:" + this.hCR + ", imagepath:" + this.imagePath);
    this.kvw = new com.tencent.mm.ui.tools.g(this.vov.voR);
    this.lWE = ((ImageView)findViewById(i.f.bKT));
    this.lWE.setLayerType(2, null);
    this.pCF = ((TextView)findViewById(i.f.cBu));
    this.qNX = ((MMPinProgressBtn)findViewById(i.f.cye));
    this.pCP = ((ViewGroup)findViewById(i.f.cEe));
    this.kwz = com.tencent.mm.pluginsdk.ui.tools.n.dX(this.vov.voR);
    paramBundle = new LinearLayout.LayoutParams(-1, -2);
    this.lVm = ((TextView)findViewById(i.f.cxV));
    this.pCP.addView((View)this.kwz, 0, paramBundle);
    this.qNW = ((TextView)findViewById(i.f.pNu));
    this.qNW.setText("");
    if (!this.pYb) {
      this.qNW.setVisibility(8);
    }
    if (this.pYb) {
      if (this.fNf == null)
      {
        this.lVm.setVisibility(8);
        com.tencent.mm.pluginsdk.ui.tools.m.a(this.lVm, (VideoSightView)this.kwz);
        label675:
        this.kwz.a(new f.a()
        {
          public final void Xd()
          {
            GMTrace.i(8724823408640L, 65005);
            w.d("MicroMsg.SnsSightPlayerUI", com.tencent.mm.compatible.util.g.tG() + " onPrepared");
            SnsSightPlayerUI.a(SnsSightPlayerUI.this, true);
            GMTrace.o(8724823408640L, 65005);
          }
          
          public final int bL(int paramAnonymousInt1, int paramAnonymousInt2)
          {
            GMTrace.i(8725226061824L, 65008);
            GMTrace.o(8725226061824L, 65008);
            return 0;
          }
          
          public final void br(int paramAnonymousInt1, int paramAnonymousInt2)
          {
            GMTrace.i(8725360279552L, 65009);
            GMTrace.o(8725360279552L, 65009);
          }
          
          public final void onError(int paramAnonymousInt1, int paramAnonymousInt2)
          {
            GMTrace.i(8724957626368L, 65006);
            w.e("MicroMsg.SnsSightPlayerUI", "on play video error, what %d extra %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
            SnsSightPlayerUI.f(SnsSightPlayerUI.this).stop();
            if (SnsSightPlayerUI.g(SnsSightPlayerUI.this))
            {
              GMTrace.o(8724957626368L, 65006);
              return;
            }
            SnsSightPlayerUI.h(SnsSightPlayerUI.this);
            com.tencent.mm.sdk.a.b.q(Base64.encodeToString((com.tencent.mm.plugin.sight.base.d.beu() + "[SnsSightPlayerUI] on play video error, what " + paramAnonymousInt1 + " extra " + paramAnonymousInt2 + ", path=" + bg.ap(SnsSightPlayerUI.c(SnsSightPlayerUI.this), "")).getBytes(), 2), "FullScreenPlaySight");
            final String str = SnsSightPlayerUI.c(SnsSightPlayerUI.this);
            af.u(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(8766028251136L, 65312);
                Object localObject = (ImageView)SnsSightPlayerUI.this.findViewById(i.f.cEP);
                if (localObject != null)
                {
                  ((ImageView)localObject).setImageBitmap(this.oVf);
                  ((ImageView)localObject).setVisibility(0);
                }
                localObject = new Intent();
                ((Intent)localObject).setAction("android.intent.action.VIEW");
                ((Intent)localObject).setDataAndType(Uri.fromFile(new File(str)), "video/*");
                try
                {
                  SnsSightPlayerUI.this.vov.voR.startActivity(Intent.createChooser((Intent)localObject, SnsSightPlayerUI.this.vov.voR.getString(i.j.dYl)));
                  GMTrace.o(8766028251136L, 65312);
                  return;
                }
                catch (Exception localException)
                {
                  w.e("MicroMsg.SnsSightPlayerUI", "startActivity fail, activity not found");
                  com.tencent.mm.ui.base.h.h(SnsSightPlayerUI.this.vov.voR, i.j.dXl, i.j.dXm);
                  GMTrace.o(8766028251136L, 65312);
                }
              }
            });
            GMTrace.o(8724957626368L, 65006);
          }
          
          public final void qq()
          {
            GMTrace.i(8725091844096L, 65007);
            w.d("MicroMsg.SnsSightPlayerUI", "on completion");
            if (!SnsSightPlayerUI.i(SnsSightPlayerUI.this)) {
              SnsSightPlayerUI.j(SnsSightPlayerUI.this).post(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(8602282622976L, 64092);
                  if (SnsSightPlayerUI.j(SnsSightPlayerUI.this).getVisibility() != 0)
                  {
                    SnsSightPlayerUI.j(SnsSightPlayerUI.this).setVisibility(0);
                    SnsSightPlayerUI.j(SnsSightPlayerUI.this).startAnimation(AnimationUtils.loadAnimation(SnsSightPlayerUI.this.vov.voR, i.a.aLC));
                  }
                  GMTrace.o(8602282622976L, 64092);
                }
              });
            }
            SnsSightPlayerUI.f(SnsSightPlayerUI.this).ch(true);
            com.tencent.mm.plugin.sns.a.b.a.a locala = SnsSightPlayerUI.k(SnsSightPlayerUI.this).pWP;
            locala.pXL += 1;
            SnsSightPlayerUI.a(SnsSightPlayerUI.this, false);
            GMTrace.o(8725091844096L, 65007);
          }
        });
        findViewById(i.f.cEe).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(8544032129024L, 63658);
            SnsSightPlayerUI.this.alb();
            GMTrace.o(8544032129024L, 63658);
          }
        });
        ((View)this.kwz).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(8767907299328L, 65326);
            SnsSightPlayerUI.this.alb();
            GMTrace.o(8767907299328L, 65326);
          }
        });
        this.jds = new GestureDetector(this.vov.voR, new GestureDetector.SimpleOnGestureListener()
        {
          public final void onLongPress(MotionEvent paramAnonymousMotionEvent)
          {
            GMTrace.i(8338544787456L, 62127);
            SnsSightPlayerUI.b(SnsSightPlayerUI.this, true);
            super.onLongPress(paramAnonymousMotionEvent);
            GMTrace.o(8338544787456L, 62127);
          }
          
          public final boolean onScroll(MotionEvent paramAnonymousMotionEvent1, MotionEvent paramAnonymousMotionEvent2, float paramAnonymousFloat1, float paramAnonymousFloat2)
          {
            GMTrace.i(8338410569728L, 62126);
            paramAnonymousFloat1 = ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).getTranslationX();
            paramAnonymousFloat2 = paramAnonymousMotionEvent2.getX();
            float f1 = paramAnonymousMotionEvent1.getX();
            float f2 = ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).getTranslationY();
            float f3 = paramAnonymousMotionEvent2.getY();
            float f4 = paramAnonymousMotionEvent1.getY();
            if (SnsSightPlayerUI.l(SnsSightPlayerUI.this))
            {
              ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).setTranslationX(paramAnonymousFloat1 + paramAnonymousFloat2 - f1);
              ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).setTranslationY(f2 + f3 - f4);
            }
            GMTrace.o(8338410569728L, 62126);
            return true;
          }
        });
        ((View)this.kwz).setOnTouchListener(new View.OnTouchListener()
        {
          public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
          {
            GMTrace.i(8582418399232L, 63944);
            SnsSightPlayerUI.m(SnsSightPlayerUI.this).onTouchEvent(paramAnonymousMotionEvent);
            if (SnsSightPlayerUI.n(SnsSightPlayerUI.this) == null) {
              SnsSightPlayerUI.a(SnsSightPlayerUI.this, VelocityTracker.obtain());
            }
            SnsSightPlayerUI.n(SnsSightPlayerUI.this).addMovement(paramAnonymousMotionEvent);
            switch (paramAnonymousMotionEvent.getAction() & 0xFF)
            {
            default: 
            case 0: 
            case 1: 
              for (;;)
              {
                GMTrace.o(8582418399232L, 63944);
                return false;
                SnsSightPlayerUI.a(SnsSightPlayerUI.this, paramAnonymousMotionEvent.getX());
                SnsSightPlayerUI.b(SnsSightPlayerUI.this, paramAnonymousMotionEvent.getY());
                continue;
                if (SnsSightPlayerUI.o(SnsSightPlayerUI.this))
                {
                  ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).setPivotX(SnsSightPlayerUI.this.pCP.getWidth() / 2);
                  ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).setPivotY(SnsSightPlayerUI.this.pCP.getHeight() / 2);
                  ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).setScaleX(1.0F);
                  ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).setScaleY(1.0F);
                  ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).setTranslationX(0.0F);
                  ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).setTranslationY(0.0F);
                  paramAnonymousView = SnsSightPlayerUI.this;
                  if (paramAnonymousView.kwF == null) {
                    paramAnonymousView.kwF = new l(paramAnonymousView.vov.voR);
                  }
                  paramAnonymousView.kwF.a((View)paramAnonymousView.kwz, paramAnonymousView.qOb, paramAnonymousView.nHl);
                  if (SnsSightPlayerUI.p(SnsSightPlayerUI.this) != null) {
                    SnsSightPlayerUI.p(SnsSightPlayerUI.this).setVisibility(0);
                  }
                  SnsSightPlayerUI.c(SnsSightPlayerUI.this, false);
                  SnsSightPlayerUI.b(SnsSightPlayerUI.this, false);
                }
                else
                {
                  if ((SnsSightPlayerUI.l(SnsSightPlayerUI.this)) && (!SnsSightPlayerUI.q(SnsSightPlayerUI.this)))
                  {
                    SnsSightPlayerUI.this.alb();
                    SnsSightPlayerUI.b(SnsSightPlayerUI.this, false);
                    GMTrace.o(8582418399232L, 63944);
                    return true;
                  }
                  SnsSightPlayerUI.b(SnsSightPlayerUI.this, false);
                }
              }
            }
            float f2 = ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).getTranslationX();
            float f3 = ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).getTranslationY();
            paramAnonymousView = SnsSightPlayerUI.n(SnsSightPlayerUI.this);
            paramAnonymousView.computeCurrentVelocity(1000);
            int i = (int)paramAnonymousView.getXVelocity();
            int j = (int)paramAnonymousView.getYVelocity();
            if (((Math.abs(f2) <= 250.0F) && (Math.abs(j) > Math.abs(i)) && (j > 0) && (!SnsSightPlayerUI.q(SnsSightPlayerUI.this))) || (SnsSightPlayerUI.l(SnsSightPlayerUI.this)))
            {
              float f1 = 1.0F - f3 / SnsSightPlayerUI.this.pCP.getHeight();
              if (f1 > 1.0F)
              {
                f1 = 1.0F;
                label528:
                if (((j > 0) && (f1 < SnsSightPlayerUI.r(SnsSightPlayerUI.this))) || ((j < 0) && (f1 >= 0.5D)))
                {
                  SnsSightPlayerUI.a(SnsSightPlayerUI.this, (int)f2);
                  SnsSightPlayerUI.b(SnsSightPlayerUI.this, (int)f3);
                  SnsSightPlayerUI.c(SnsSightPlayerUI.this, f1);
                  if (SnsSightPlayerUI.p(SnsSightPlayerUI.this) != null) {
                    SnsSightPlayerUI.p(SnsSightPlayerUI.this).setVisibility(8);
                  }
                  ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).setPivotX(SnsSightPlayerUI.this.pCP.getWidth() / 2);
                  ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).setPivotY(SnsSightPlayerUI.this.pCP.getHeight() / 2);
                  ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).setScaleX(f1);
                  ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).setScaleY(f1);
                  SnsSightPlayerUI.s(SnsSightPlayerUI.this).setAlpha(f1);
                }
                SnsSightPlayerUI.c(SnsSightPlayerUI.this, true);
                label712:
                if (f3 <= 200.0F) {
                  break label815;
                }
                SnsSightPlayerUI.d(SnsSightPlayerUI.this, false);
              }
            }
            for (;;)
            {
              if (f3 > 50.0F) {
                ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).setOnLongClickListener(null);
              }
              if (SnsSightPlayerUI.n(SnsSightPlayerUI.this) != null)
              {
                SnsSightPlayerUI.n(SnsSightPlayerUI.this).recycle();
                SnsSightPlayerUI.a(SnsSightPlayerUI.this, null);
              }
              if (!SnsSightPlayerUI.l(SnsSightPlayerUI.this)) {
                break;
              }
              GMTrace.o(8582418399232L, 63944);
              return true;
              break label528;
              SnsSightPlayerUI.c(SnsSightPlayerUI.this, false);
              break label712;
              label815:
              if (f3 > 10.0F) {
                SnsSightPlayerUI.d(SnsSightPlayerUI.this, true);
              }
            }
          }
        });
        if (!FileOp.aZ(this.hCR)) {
          break label1294;
        }
        if (this.hCR != null)
        {
          this.kwz.stop();
          this.kwz.setVideoPath(this.hCR);
        }
        this.qNX.setVisibility(8);
      }
    }
    for (this.qNU.pWI = 1;; this.qNU.pWI = 0)
    {
      w.d("MicroMsg.SnsSightPlayerUI", System.currentTimeMillis() - l + " initView end");
      paramBundle = new rb();
      paramBundle.fPb.type = 1;
      com.tencent.mm.sdk.b.a.uLm.m(paramBundle);
      if (this.kwF == null) {
        this.kwF = new l(this.vov.voR);
      }
      this.kwF.a((View)this.kwz, this.qOb, this.nHl);
      ((View)this.kwz).post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8334518255616L, 62097);
          DisplayMetrics localDisplayMetrics = new DisplayMetrics();
          SnsSightPlayerUI.this.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
          if ((SnsSightPlayerUI.f(SnsSightPlayerUI.this) instanceof VideoSightView)) {
            ((VideoSightView)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).tG(localDisplayMetrics.widthPixels);
          }
          ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).requestLayout();
          ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).postInvalidate();
          GMTrace.o(8334518255616L, 62097);
        }
      });
      GMTrace.o(8374649356288L, 62396);
      return;
      if (bg.mZ(this.fNf.uhH))
      {
        w.i("MicroMsg.SnsSightPlayerUI", "onCreate: there is no attachurl, show more info btn");
        paramBundle = this.qNY.bjL();
        final Object localObject2 = this.qNY.bjH();
        localObject1 = ((com.tencent.mm.plugin.sns.storage.b)localObject2).qlF;
        localObject2 = ((com.tencent.mm.plugin.sns.storage.b)localObject2).qlG;
        if ((!bg.mZ((String)localObject1)) && (!bg.mZ((String)localObject2)))
        {
          this.lVm.setVisibility(0);
          this.lVm.setText((CharSequence)localObject1);
          this.lVm.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(final View paramAnonymousView)
            {
              GMTrace.i(8315325120512L, 61954);
              Object localObject;
              String str;
              if (j.b.pXp.value != 0)
              {
                localObject = j.a.pXj;
                str = paramBundle.nas;
                if (SnsSightPlayerUI.a(SnsSightPlayerUI.this).bjJ() != null) {
                  break label214;
                }
              }
              label214:
              for (paramAnonymousView = "";; paramAnonymousView = SnsSightPlayerUI.a(SnsSightPlayerUI.this).bjJ().qhb)
              {
                com.tencent.mm.plugin.sns.a.b.j.a((j.a)localObject, str, paramAnonymousView, 1, j.b.pXp.value, paramBundle.jWW, null, paramBundle.nas, 0L, 0, 0);
                paramAnonymousView = new Intent();
                localObject = new Bundle();
                ((Bundle)localObject).putString("key_snsad_statextstr", paramBundle.qBT);
                paramAnonymousView.putExtra("jsapiargs", (Bundle)localObject);
                paramAnonymousView.putExtra("rawUrl", localObject2);
                paramAnonymousView.putExtra("useJs", true);
                localObject = new com.tencent.mm.plugin.sns.a.b.c(SnsSightPlayerUI.a(SnsSightPlayerUI.this).bkp(), 18, 5, "", 2, SnsSightPlayerUI.a(SnsSightPlayerUI.this).bjM());
                com.tencent.mm.kernel.h.xA();
                com.tencent.mm.kernel.h.xy().gQO.a((k)localObject, 0);
                new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper()).post(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(8736366133248L, 65091);
                    com.tencent.mm.plugin.sns.c.a.ifM.j(paramAnonymousView, SnsSightPlayerUI.this);
                    SnsSightPlayerUI.this.finish();
                    GMTrace.o(8736366133248L, 65091);
                  }
                });
                GMTrace.o(8315325120512L, 61954);
                return;
              }
            }
          });
          break;
        }
        this.lVm.setVisibility(8);
        break;
      }
      localObject1 = getResources().getString(i.j.eLr);
      paramBundle = (Bundle)localObject1;
      if (this.fNf.qTd / 60 > 0) {
        paramBundle = (String)localObject1 + getResources().getString(i.j.eLt, new Object[] { Integer.valueOf(this.fNf.qTd / 60) });
      }
      localObject1 = paramBundle;
      if (this.fNf.qTd % 60 > 0) {
        localObject1 = paramBundle + getResources().getString(i.j.eLu, new Object[] { Integer.valueOf(this.fNf.qTd % 60) });
      }
      paramBundle = (String)localObject1 + getResources().getString(i.j.eLs);
      this.lVm.setText(paramBundle);
      this.lVm.setVisibility(0);
      this.lVm.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8320962265088L, 61996);
          if (SnsSightPlayerUI.a(SnsSightPlayerUI.this).uF(32)) {
            com.tencent.mm.plugin.sns.a.b.j.a(j.b.pXp, j.a.pXi, SnsSightPlayerUI.a(SnsSightPlayerUI.this));
          }
          Intent localIntent = new Intent();
          paramAnonymousView = am.dt(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), SnsSightPlayerUI.b(SnsSightPlayerUI.this).nas);
          Object localObject = com.tencent.mm.plugin.sns.data.i.k(SnsSightPlayerUI.b(SnsSightPlayerUI.this));
          localIntent.setClass(SnsSightPlayerUI.this, VideoAdPlayerUI.class);
          localIntent.putExtra("KFullVideoPath", paramAnonymousView + (String)localObject);
          localIntent.putExtra("KThumbPath", SnsSightPlayerUI.c(SnsSightPlayerUI.this));
          localIntent.putExtra("IsAd", true);
          localIntent.putExtra("KStremVideoUrl", SnsSightPlayerUI.b(SnsSightPlayerUI.this).uhH);
          if (bg.mZ(SnsSightPlayerUI.b(SnsSightPlayerUI.this).uhK))
          {
            paramAnonymousView = SnsSightPlayerUI.b(SnsSightPlayerUI.this).uhA;
            localIntent.putExtra("KThumUrl", paramAnonymousView);
            localIntent.putExtra("KMediaId", SnsSightPlayerUI.b(SnsSightPlayerUI.this).nas);
            localIntent.putExtra("KUrl", SnsSightPlayerUI.b(SnsSightPlayerUI.this).mDo);
            localIntent.putExtra("KViewId", SnsSightPlayerUI.a(SnsSightPlayerUI.this).bkp());
            localObject = SnsSightPlayerUI.a(SnsSightPlayerUI.this).bjL();
            if (SnsSightPlayerUI.a(SnsSightPlayerUI.this).bjJ() != null) {
              break label682;
            }
            paramAnonymousView = "";
            label263:
            localIntent.putExtra("KSta_StremVideoAduxInfo", paramAnonymousView);
            localIntent.putExtra("KSta_StremVideoPublishId", ((bhc)localObject).nas);
            localIntent.putExtra("KSta_SourceType", 1);
            localIntent.putExtra("KSta_Scene", j.b.pXp.value);
            localIntent.putExtra("KSta_FromUserName", ((bhc)localObject).jWW);
            localIntent.putExtra("KSta_SnSId", ((bhc)localObject).nas);
            localIntent.putExtra("KSta_SnsStatExtStr", ((bhc)localObject).qBT);
            localIntent.putExtra("KMediaVideoTime", SnsSightPlayerUI.b(SnsSightPlayerUI.this).qTd);
            if (!bg.mZ(SnsSightPlayerUI.b(SnsSightPlayerUI.this).uhL)) {
              break label699;
            }
            paramAnonymousView = ((bhc)localObject).uyr;
            label374:
            localIntent.putExtra("KMediaTitle", paramAnonymousView);
            paramAnonymousView = SnsSightPlayerUI.a(SnsSightPlayerUI.this).bjH();
            if ((paramAnonymousView != null) && (paramAnonymousView.qlE == 0))
            {
              localIntent.putExtra("StreamWording", paramAnonymousView.qlF);
              localIntent.putExtra("StremWebUrl", paramAnonymousView.qlG);
            }
            localObject = com.tencent.mm.plugin.sns.model.ae.bhp().HA(SnsSightPlayerUI.d(SnsSightPlayerUI.this));
            if (SnsSightPlayerUI.e(SnsSightPlayerUI.this) != 0) {
              break label713;
            }
            paramAnonymousView = com.tencent.mm.modelsns.b.gM(747);
            label457:
            paramAnonymousView.lh(com.tencent.mm.plugin.sns.data.i.g((com.tencent.mm.plugin.sns.storage.m)localObject)).gP(((com.tencent.mm.plugin.sns.storage.m)localObject).field_type).bA(true).lh(((com.tencent.mm.plugin.sns.storage.m)localObject).bkq()).gP(SnsSightPlayerUI.b(SnsSightPlayerUI.this).qTd);
            paramAnonymousView.LJ();
            if (SnsSightPlayerUI.e(SnsSightPlayerUI.this) != 0) {
              break label723;
            }
          }
          label682:
          label699:
          label713:
          label723:
          for (paramAnonymousView = com.tencent.mm.modelsns.b.gM(748);; paramAnonymousView = com.tencent.mm.modelsns.b.gN(748))
          {
            paramAnonymousView.lh(com.tencent.mm.plugin.sns.data.i.g((com.tencent.mm.plugin.sns.storage.m)localObject)).gP(((com.tencent.mm.plugin.sns.storage.m)localObject).field_type).bA(true).lh(((com.tencent.mm.plugin.sns.storage.m)localObject).bkq()).gP(SnsSightPlayerUI.b(SnsSightPlayerUI.this).qTd);
            paramAnonymousView.b(localIntent, "intent_key_StatisticsOplog");
            SnsSightPlayerUI.this.startActivity(localIntent);
            paramAnonymousView = new com.tencent.mm.plugin.sns.a.b.c(SnsSightPlayerUI.a(SnsSightPlayerUI.this).bkp(), 14, 5, "", 2, SnsSightPlayerUI.a(SnsSightPlayerUI.this).bjM());
            com.tencent.mm.kernel.h.xA();
            com.tencent.mm.kernel.h.xy().gQO.a(paramAnonymousView, 0);
            if (SnsSightPlayerUI.e(SnsSightPlayerUI.this) == 0)
            {
              paramAnonymousView = new os();
              paramAnonymousView.fMQ.fGc = true;
              com.tencent.mm.sdk.b.a.uLm.m(paramAnonymousView);
            }
            GMTrace.o(8320962265088L, 61996);
            return;
            paramAnonymousView = SnsSightPlayerUI.b(SnsSightPlayerUI.this).uhK;
            break;
            paramAnonymousView = SnsSightPlayerUI.a(SnsSightPlayerUI.this).bjJ().qhb;
            break label263;
            paramAnonymousView = SnsSightPlayerUI.b(SnsSightPlayerUI.this).uhL;
            break label374;
            paramAnonymousView = com.tencent.mm.modelsns.b.gN(747);
            break label457;
          }
        }
      });
      break;
      this.lVm.setVisibility(8);
      break label675;
      label1294:
      com.tencent.mm.plugin.sns.model.ae.bhk().a(this.fNf, 6, null, an.vfb);
      this.qNX.setVisibility(0);
      this.qNX.cgd();
    }
  }
  
  public void onDestroy()
  {
    boolean bool = true;
    GMTrace.i(8375320444928L, 62401);
    super.onDestroy();
    Object localObject;
    int i;
    label51:
    int j;
    if (this.pYb)
    {
      if (this.qNY == null)
      {
        localObject = "";
        String str = this.qNU.bfT();
        if (this.qNY != null) {
          break label361;
        }
        i = 0;
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.ac.n localn = com.tencent.mm.kernel.h.xy().gQO;
        if (this.scene != 0) {
          break label372;
        }
        j = 1;
        label72:
        localn.a(new com.tencent.mm.plugin.sns.a.b.d((String)localObject, j, 2, this.qNU.pWJ, null, null, 2, str, -1, i), 0);
      }
    }
    else
    {
      w.d("MicroMsg.SnsSightPlayerUI", "on dismiss");
      if ((this.pYb) && (this.qNY != null) && (this.qNY.uF(32))) {
        com.tencent.mm.plugin.sns.a.b.j.a(j.b.pXp, j.a.pXk, this.qNY);
      }
      com.tencent.mm.plugin.sns.model.ae.bhk().b(this);
      localObject = com.tencent.mm.modelsns.b.q(getIntent());
      if (localObject != null)
      {
        if (!this.pYb) {
          break label382;
        }
        if (bg.mZ(this.fNf.uhH)) {
          break label377;
        }
        label193:
        ((com.tencent.mm.modelsns.b)localObject).bA(bool);
      }
    }
    for (;;)
    {
      ((com.tencent.mm.modelsns.b)localObject).update();
      ((com.tencent.mm.modelsns.b)localObject).LJ();
      if (com.tencent.mm.p.a.pF() != null) {
        com.tencent.mm.p.a.pF().rm();
      }
      if (this.kwz != null)
      {
        this.kwz.a(null);
        this.kwz.stop();
        this.kwz.onDetach();
      }
      if (!this.pCG)
      {
        localObject = new rb();
        ((rb)localObject).fPb.type = 0;
        ((rb)localObject).fPb.fPc = this.pBL;
        ((rb)localObject).fPb.fPd = this.lRC;
        ((rb)localObject).fPb.fPe = this.fPe;
        com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
      }
      this.jdd.bc(false);
      GMTrace.o(8375320444928L, 62401);
      return;
      localObject = this.qNY.bkp();
      break;
      label361:
      i = this.qNY.bkt();
      break label51;
      label372:
      j = 2;
      break label72;
      label377:
      bool = false;
      break label193;
      label382:
      ((com.tencent.mm.modelsns.b)localObject).bA(false);
    }
  }
  
  public void onPause()
  {
    GMTrace.i(8375723098112L, 62404);
    super.onPause();
    int i = getResources().getConfiguration().orientation;
    w.i("MicroMsg.SnsSightPlayerUI", "onpause  " + i);
    ve(i);
    if (!this.qMe)
    {
      bjj();
      w.v("check", "onclick");
      new com.tencent.mm.sdk.platformtools.ae().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8467930677248L, 63091);
          SnsSightPlayerUI.this.finish();
          GMTrace.o(8467930677248L, 63091);
        }
      });
      GMTrace.o(8375723098112L, 62404);
      return;
    }
    bjj();
    GMTrace.o(8375723098112L, 62404);
  }
  
  protected void onResume()
  {
    GMTrace.i(8375588880384L, 62403);
    super.onResume();
    if (!this.isInit)
    {
      int i = getResources().getConfiguration().orientation;
      w.i("MicroMsg.SnsSightPlayerUI", "initOrientation " + i);
      if (getResources().getConfiguration().orientation == 2) {
        K(getResources().getConfiguration().orientation, true);
      }
      this.isInit = true;
    }
    if ((this.pCY == 0) || (this.pCX == 0))
    {
      DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
      this.pCY = localDisplayMetrics.heightPixels;
      this.pCX = localDisplayMetrics.widthPixels;
    }
    if ((this.qMe) && (FileOp.aZ(this.hCR)))
    {
      ht(false);
      this.qMe = false;
    }
    GMTrace.o(8375588880384L, 62403);
  }
  
  public void onStart()
  {
    GMTrace.i(8375454662656L, 62402);
    Bundle localBundle = this.kvu;
    if (!this.kvv)
    {
      this.kvv = true;
      if (Build.VERSION.SDK_INT >= 12)
      {
        this.kvx = getIntent().getIntExtra("img_gallery_top", 0);
        this.kvy = getIntent().getIntExtra("img_gallery_left", 0);
        this.kvz = getIntent().getIntExtra("img_gallery_width", 0);
        this.kvA = getIntent().getIntExtra("img_gallery_height", 0);
        this.kvw.p(this.kvy, this.kvx, this.kvz, this.kvA);
        if (localBundle == null) {
          this.pCP.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
          {
            public final boolean onPreDraw()
            {
              GMTrace.i(8494774222848L, 63291);
              SnsSightPlayerUI.this.pCP.getViewTreeObserver().removeOnPreDrawListener(this);
              SnsSightPlayerUI.this.kvw.a(SnsSightPlayerUI.this.pCP, SnsSightPlayerUI.s(SnsSightPlayerUI.this), null);
              GMTrace.o(8494774222848L, 63291);
              return true;
            }
          });
        }
      }
    }
    super.onStart();
    GMTrace.o(8375454662656L, 62402);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */