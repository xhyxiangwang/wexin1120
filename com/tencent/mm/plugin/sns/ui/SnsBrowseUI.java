package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.gh.b;
import com.tencent.mm.g.a.gi;
import com.tencent.mm.plugin.sns.a.b.c;
import com.tencent.mm.plugin.sns.a.b.f;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.pluginsdk.model.v;
import com.tencent.mm.pluginsdk.model.v.a;
import com.tencent.mm.protocal.c.aq;
import com.tencent.mm.protocal.c.as;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMPageControlView;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.MMGestureGallery;
import com.tencent.mm.ui.tools.MMGestureGallery.b;
import com.tencent.mm.ui.tools.g.a;
import com.tencent.mm.ui.tools.g.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@com.tencent.mm.ui.base.a(3)
public class SnsBrowseUI
  extends SnsBaseGalleryUI
  implements t.a
{
  private String fAx;
  private int fCv;
  private int kic;
  private int kid;
  private int kvA;
  Bundle kvu;
  private boolean kvv;
  com.tencent.mm.ui.tools.g kvw;
  private int kvx;
  private int kvy;
  private int kvz;
  private ImageView lWE;
  private com.tencent.mm.sdk.platformtools.ae mHandler;
  private int qGO;
  private boolean qGP;
  private boolean qGQ;
  private boolean qGR;
  private v qGS;
  private int qGT;
  private int qGU;
  private int qGV;
  private float qGW;
  private int qGX;
  private int qGY;
  
  public SnsBrowseUI()
  {
    GMTrace.i(8760256888832L, 65269);
    this.qGO = 0;
    this.fCv = 0;
    this.qGP = false;
    this.qGQ = false;
    this.qGR = false;
    this.kvv = false;
    this.kic = 0;
    this.kid = 0;
    this.kvx = 0;
    this.kvy = 0;
    this.kvz = 0;
    this.kvA = 0;
    this.mHandler = new com.tencent.mm.sdk.platformtools.ae();
    this.qGV = 0;
    this.qGW = 1.0F;
    this.qGX = 0;
    this.qGY = 0;
    GMTrace.o(8760256888832L, 65269);
  }
  
  protected final void MH()
  {
    GMTrace.i(8761464848384L, 65278);
    this.kvw = new com.tencent.mm.ui.tools.g(this.vov.voR);
    this.kvv = false;
    final Object localObject1 = bg.ap(getIntent().getStringExtra("sns_gallery_userName"), "");
    this.fAx = bg.ap(getIntent().getStringExtra("sns_gallery_localId"), "");
    this.qGO = getIntent().getIntExtra("sns_gallery_position", 0);
    this.fCv = getIntent().getIntExtra("sns_position", 0);
    this.qGP = getIntent().getBooleanExtra("k_is_from_sns_main_timeline", false);
    this.qGQ = getIntent().getBooleanExtra("k_is_from_sns_msg_ui", false);
    this.qGR = getIntent().getBooleanExtra("sns_soon_enter_photoedit_ui", false);
    com.tencent.mm.plugin.sns.storage.m localm = com.tencent.mm.plugin.sns.model.ae.bhp().HA(this.fAx);
    this.lWE = ((ImageView)findViewById(i.f.bKT));
    this.lWE.setLayerType(2, null);
    this.qGM = new SnsInfoFlip(this);
    this.qGM.setLayerType(2, null);
    this.qGM.qGP = this.qGP;
    this.qGM.qAU = true;
    final Object localObject2 = ai.GG(this.fAx);
    this.qGM.qJG = true;
    this.qGM.qJI = true;
    this.qGM.uV(localm.field_type);
    this.qGM.qGR = this.qGR;
    this.qGM.a((List)localObject2, (String)localObject1, this.qGO, this.qGH, this);
    localObject1 = this.qGM;
    localObject2 = an.bQu();
    ((an)localObject2).time = localm.field_createTime;
    ((SnsInfoFlip)localObject1).pYm = ((an)localObject2);
    addView(this.qGM);
    if ((localm != null) && (localm.uF(32))) {
      this.qGM.pYb = true;
    }
    this.qGN = ((Button)findViewById(i.f.pJR));
    localObject2 = localm.bjL();
    if (localObject2 != null)
    {
      localObject1 = ((bhc)localObject2).qfM;
      ay localay = new ay();
      ag.a(this, localay, ((bhc)localObject2).qfM);
      if (!localay.qQO) {
        break label479;
      }
      this.qGN.setVisibility(0);
      this.qGN.setText(localay.qQP);
      this.qGN.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(15055470985216L, 112172);
          if (localObject1.tuc == null)
          {
            GMTrace.o(15055470985216L, 112172);
            return;
          }
          paramAnonymousView = com.tencent.mm.plugin.sns.c.a.ifN.bC(localObject1.tuc.mDD);
          int i = 0;
          if (localObject2.uyu.tKc == 1) {
            i = 2;
          }
          while (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(localObject2, SnsBrowseUI.this))
          {
            com.tencent.mm.plugin.sns.c.a.ifN.a(SnsBrowseUI.this, localObject1.tuc.mDD, paramAnonymousView, localObject2.jWW, i, 18, 9, localObject1.tuc.ttV, localObject2.nas);
            GMTrace.o(15055470985216L, 112172);
            return;
            if (localObject2.uyu.tKc == 3) {
              i = 5;
            } else if (localObject2.uyu.tKc == 15) {
              i = 4;
            }
          }
          switch (localObject1.jXP)
          {
          }
          for (;;)
          {
            GMTrace.o(15055470985216L, 112172);
            return;
            Object localObject = new Intent();
            ((Intent)localObject).putExtra("rawUrl", localObject1.mDo);
            com.tencent.mm.plugin.sns.c.a.ifM.j((Intent)localObject, SnsBrowseUI.this);
            com.tencent.mm.plugin.sns.c.a.ifN.a(SnsBrowseUI.this, localObject1.tuc.mDD, paramAnonymousView, localObject2.jWW, i, 18, 1, localObject1.tuc.ttV, localObject2.nas);
            GMTrace.o(15055470985216L, 112172);
            return;
            if (localObject1.ttY == 1)
            {
              localObject = new gi();
              ((gi)localObject).fCx.actionCode = 2;
              ((gi)localObject).fCx.scene = 3;
              ((gi)localObject).fCx.appId = localObject1.tuc.mDD;
              ((gi)localObject).fCx.context = SnsBrowseUI.this;
              com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
              com.tencent.mm.plugin.sns.c.a.ifN.a(SnsBrowseUI.this, localObject1.tuc.mDD, paramAnonymousView, localObject2.jWW, i, 18, 6, localObject1.tuc.ttV, localObject2.nas);
              GMTrace.o(15055470985216L, 112172);
              return;
              int j = ag.a(SnsBrowseUI.this, localObject1);
              if (j == 1)
              {
                localObject = new gi();
                ((gi)localObject).fCx.context = SnsBrowseUI.this;
                ((gi)localObject).fCx.actionCode = 2;
                ((gi)localObject).fCx.appId = localObject1.tuc.mDD;
                ((gi)localObject).fCx.messageAction = localObject1.tuc.ttX;
                ((gi)localObject).fCx.messageExt = localObject1.tuc.ttW;
                ((gi)localObject).fCx.scene = 3;
                com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
                com.tencent.mm.plugin.sns.c.a.ifN.a(SnsBrowseUI.this, localObject1.tuc.mDD, paramAnonymousView, localObject2.jWW, i, 18, 6, localObject1.tuc.ttV, localObject2.nas);
                GMTrace.o(15055470985216L, 112172);
                return;
              }
              if (j == 2)
              {
                localObject = new gi();
                ((gi)localObject).fCx.context = SnsBrowseUI.this;
                ((gi)localObject).fCx.actionCode = 1;
                ((gi)localObject).fCx.appId = localObject1.tuc.mDD;
                ((gi)localObject).fCx.messageAction = localObject1.tuc.ttX;
                ((gi)localObject).fCx.messageExt = localObject1.tuc.ttW;
                ((gi)localObject).fCx.scene = 3;
                com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
                com.tencent.mm.plugin.sns.c.a.ifN.a(SnsBrowseUI.this, localObject1.tuc.mDD, paramAnonymousView, localObject2.jWW, i, 18, 3, localObject1.tuc.ttV, localObject2.nas);
              }
            }
          }
        }
      });
    }
    for (;;)
    {
      if (com.tencent.mm.plugin.sns.lucky.a.m.h(localm)) {
        break label491;
      }
      w.e("MicroMsg.SnsPopMediasUI", "error see photo !! " + localm.field_userName + " " + localm.field_snsId);
      finish();
      GMTrace.o(8761464848384L, 65278);
      return;
      localObject1 = null;
      break;
      label479:
      this.qGN.setVisibility(8);
    }
    label491:
    if ((localm.field_type == 21) && (!localm.field_userName.equals(com.tencent.mm.x.m.zF())))
    {
      this.qGS = new v(com.tencent.mm.compatible.util.e.gZR + "/Pictures/Screenshots/", new v.a()
      {
        public final void bmC()
        {
          GMTrace.i(8543361040384L, 63653);
          com.tencent.mm.plugin.sns.lucky.a.b.nK(44);
          com.tencent.mm.plugin.sns.lucky.b.a.a(4, com.tencent.mm.plugin.sns.model.ae.bhp().HA(SnsBrowseUI.a(SnsBrowseUI.this)));
          GMTrace.o(8543361040384L, 63653);
        }
      });
      this.qGS.start();
    }
    GMTrace.o(8761464848384L, 65278);
  }
  
  protected final int Qb()
  {
    GMTrace.i(8762135937024L, 65283);
    GMTrace.o(8762135937024L, 65283);
    return 2;
  }
  
  public final void aha()
  {
    GMTrace.i(8761196412928L, 65276);
    GMTrace.o(8761196412928L, 65276);
  }
  
  public final void alb()
  {
    GMTrace.i(8761599066112L, 65279);
    int n = this.kvz;
    int i = this.kvA;
    int m = this.kvy;
    int k = this.kvx;
    if (!this.qGQ)
    {
      localObject = new gh();
      ((gh)localObject).fCt.fCw = this.qGM.qJB.getSelectedItemPosition();
      ((gh)localObject).fCt.fCv = this.fCv;
      com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
      n = ((gh)localObject).fCu.fuW;
      i = ((gh)localObject).fCu.fuX;
      m = ((gh)localObject).fCu.fuU;
      k = ((gh)localObject).fCu.fuV;
    }
    this.qGT = this.qGM.getWidth();
    this.qGU = this.qGM.getHeight();
    com.tencent.mm.plugin.sns.model.ae.bhm();
    Object localObject = com.tencent.mm.plugin.sns.model.g.B(this.qGM.blC());
    int j = i;
    if (localObject != null)
    {
      localObject = d.QI((String)localObject);
      float f = this.qGT / ((BitmapFactory.Options)localObject).outWidth;
      this.qGU = ((int)(((BitmapFactory.Options)localObject).outHeight * f));
      j = i;
      if (this.qGU > this.qGM.getHeight())
      {
        j = i;
        if (this.qGU < this.qGM.getHeight() * 2.5D)
        {
          this.qGV = (this.qGU - this.qGM.getHeight());
          j = i;
          if (this.qGM.getCount() == 1)
          {
            j = i * this.qGM.getHeight() / this.qGU;
            this.qGV = 0;
          }
        }
        this.qGU = this.qGM.getHeight();
      }
    }
    this.kvw.ex(this.qGT, this.qGU);
    this.kvw.p(m, k, n, j);
    if (this.qGW != 1.0D)
    {
      this.kvw.wKp = (1.0F / this.qGW);
      if ((this.qGX != 0) || (this.qGY != 0))
      {
        i = (int)(this.qGM.getWidth() / 2 * (1.0F - this.qGW));
        j = this.qGX;
        k = (int)(this.qGM.getHeight() / 2 + this.qGY - this.qGU / 2 * this.qGW);
        this.kvw.ey(i + j, k);
      }
    }
    this.kvw.qvX = this.qGV;
    this.kvw.a(this.qGM, this.lWE, new g.b()new g.a
    {
      public final void onAnimationEnd()
      {
        GMTrace.i(15056007856128L, 112176);
        SnsBrowseUI.e(SnsBrowseUI.this).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(15055202549760L, 112170);
            SnsBrowseUI.this.finish();
            SnsBrowseUI.this.overridePendingTransition(0, 0);
            GMTrace.o(15055202549760L, 112170);
          }
        });
        GMTrace.o(15056007856128L, 112176);
      }
      
      public final void onAnimationStart()
      {
        GMTrace.i(15055873638400L, 112175);
        SnsInfoFlip localSnsInfoFlip = SnsBrowseUI.this.qGM;
        if (localSnsInfoFlip.qJO != null) {
          localSnsInfoFlip.qJO.setVisibility(8);
        }
        SnsBrowseUI.e(SnsBrowseUI.this).postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(15054128807936L, 112162);
            Object localObject = SnsBrowseUI.this.qGM;
            if (((SnsInfoFlip)localObject).qJB != null)
            {
              localObject = ((SnsInfoFlip)localObject).qJB.getSelectedView();
              if ((localObject instanceof MultiTouchImageView)) {
                ((MultiTouchImageView)localObject).bXG();
              }
            }
            GMTrace.o(15054128807936L, 112162);
          }
        }, 20L);
        GMTrace.o(15055873638400L, 112175);
      }
    }, new g.a()
    {
      public final void q(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4)
      {
        GMTrace.i(15055739420672L, 112174);
        if ((SnsBrowseUI.this.qGM.qJB != null) && (Build.VERSION.SDK_INT >= 18)) {
          SnsBrowseUI.this.qGM.qJB.setClipBounds(new Rect(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4));
        }
        GMTrace.o(15055739420672L, 112174);
      }
    });
    GMTrace.o(8761599066112L, 65279);
  }
  
  public final void bU(String paramString, int paramInt)
  {
    GMTrace.i(8761867501568L, 65281);
    w.i("MicroMsg.SnsPopMediasUI", "[notifyData] opType:%s reset:%s localId;%s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(true), paramString });
    if (this.qGM != null) {
      this.qGM.awa();
    }
    GMTrace.o(8761867501568L, 65281);
  }
  
  public final void bV(String paramString, int paramInt)
  {
    GMTrace.i(8762270154752L, 65284);
    this.qGO = paramInt;
    GMTrace.o(8762270154752L, 65284);
  }
  
  public final void bmB()
  {
    GMTrace.i(8761733283840L, 65280);
    final Gallery localGallery = this.qGM.qJB;
    if ((localGallery instanceof MMGestureGallery)) {
      ((MMGestureGallery)localGallery).wKM = new MMGestureGallery.b()
      {
        public final void C(float paramAnonymousFloat1, float paramAnonymousFloat2)
        {
          GMTrace.i(15054531461120L, 112165);
          if (((SnsBrowseUI.f(SnsBrowseUI.this) == 0) || (SnsBrowseUI.g(SnsBrowseUI.this) == 0)) && (SnsBrowseUI.this.qGM != null))
          {
            SnsBrowseUI.b(SnsBrowseUI.this, SnsBrowseUI.this.qGM.getHeight());
            SnsBrowseUI.a(SnsBrowseUI.this, SnsBrowseUI.this.qGM.getWidth());
          }
          if (SnsBrowseUI.f(SnsBrowseUI.this) != 0)
          {
            float f2 = 1.0F - paramAnonymousFloat2 / SnsBrowseUI.f(SnsBrowseUI.this);
            float f1 = f2;
            if (f2 > 1.0F) {
              f1 = 1.0F;
            }
            SnsBrowseUI.a(SnsBrowseUI.this, f1);
            View localView = ((MMGestureGallery)localGallery).getSelectedView();
            if ((localView instanceof MultiTouchImageView))
            {
              localView.setPivotX(SnsBrowseUI.g(SnsBrowseUI.this) / 2);
              localView.setPivotY(SnsBrowseUI.f(SnsBrowseUI.this) / 2);
              localView.setScaleX(f1);
              localView.setScaleY(f1);
              localView.setTranslationX(paramAnonymousFloat1);
              localView.setTranslationY(paramAnonymousFloat2);
              SnsBrowseUI.d(SnsBrowseUI.this).setAlpha(f1);
            }
          }
          GMTrace.o(15054531461120L, 112165);
        }
        
        public final void D(float paramAnonymousFloat1, float paramAnonymousFloat2)
        {
          GMTrace.i(15054665678848L, 112166);
          SnsBrowseUI.e(SnsBrowseUI.this, (int)paramAnonymousFloat1);
          SnsBrowseUI.f(SnsBrowseUI.this, (int)paramAnonymousFloat2);
          GMTrace.o(15054665678848L, 112166);
        }
      };
    }
    GMTrace.o(8761733283840L, 65280);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(8761330630656L, 65277);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      w.d("MicroMsg.SnsPopMediasUI", "dispatchKeyEvent");
      setResult(-1, new Intent());
      alb();
      GMTrace.o(8761330630656L, 65277);
      return true;
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(8761330630656L, 65277);
    return bool;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8760927977472L, 65274);
    int i = i.g.pOF;
    GMTrace.o(8760927977472L, 65274);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8762001719296L, 65282);
    w.i("MicroMsg.SnsPopMediasUI", "onAcvityResult requestCode:" + paramInt1);
    if (paramInt2 != -1)
    {
      GMTrace.o(8762001719296L, 65282);
      return;
    }
    GMTrace.o(8762001719296L, 65282);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8760391106560L, 65270);
    super.onCreate(paramBundle);
    this.vov.bUK();
    if (getIntent().getExtras() != null) {
      getIntent().getExtras().setClassLoader(getClass().getClassLoader());
    }
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().setFlags(1024, 1024);
    }
    MH();
    this.kvu = paramBundle;
    GMTrace.o(8760391106560L, 65270);
  }
  
  public void onDestroy()
  {
    GMTrace.i(8760525324288L, 65271);
    int j;
    SnsInfoFlip localSnsInfoFlip;
    if (this.qGM != null)
    {
      j = getIntent().getIntExtra("K_ad_scene", -1);
      localSnsInfoFlip = this.qGM;
      localObject1 = this.fAx;
      if (localSnsInfoFlip.pYb)
      {
        if (j >= 0) {
          break label199;
        }
        w.i("MicroMsg.SnsInfoFlip", "pass by scene " + j);
      }
    }
    int i;
    label199:
    com.tencent.mm.plugin.sns.storage.m localm;
    do
    {
      localObject1 = com.tencent.mm.modelsns.b.q(getIntent());
      if (localObject1 != null)
      {
        this.qGM.qKd.size();
        i = this.qGM.bnc();
        ((com.tencent.mm.modelsns.b)localObject1).gP(this.qGM.getCount()).gP(i);
        ((com.tencent.mm.modelsns.b)localObject1).update();
        ((com.tencent.mm.modelsns.b)localObject1).LJ();
      }
      this.qGM.bna();
      this.qGM.onDestroy();
      com.tencent.mm.plugin.sns.model.ae.bhm().I(this);
      if (this.qGP) {
        this.qGM.bne();
      }
      if (this.qGS != null) {
        this.qGS.stop();
      }
      super.onDestroy();
      GMTrace.o(8760525324288L, 65271);
      return;
      localm = com.tencent.mm.plugin.sns.model.ae.bhp().HA((String)localObject1);
    } while (localm == null);
    long l1;
    long l2;
    if (localSnsInfoFlip.qKc >= 0)
    {
      if (!localSnsInfoFlip.qJE.containsKey(Integer.valueOf(localSnsInfoFlip.qKc))) {
        break label613;
      }
      l1 = ((Long)localSnsInfoFlip.qJE.get(Integer.valueOf(localSnsInfoFlip.qKc))).longValue();
      if (l1 > 0L)
      {
        if (!localSnsInfoFlip.qJF.containsKey(Integer.valueOf(localSnsInfoFlip.qKc))) {
          break label619;
        }
        l2 = ((Long)localSnsInfoFlip.qJF.get(Integer.valueOf(localSnsInfoFlip.qKc))).longValue();
        label315:
        l1 = bg.aG(l1);
        l2 += l1;
        localSnsInfoFlip.qJF.put(Integer.valueOf(localSnsInfoFlip.qKc), Long.valueOf(l2));
        w.i("MicroMsg.SnsInfoFlip", "lastSelectPosition " + localSnsInfoFlip.qKc + " curtime " + l2 + " passtime " + l1);
      }
    }
    Object localObject2 = localm.bkr();
    StringBuffer localStringBuffer = new StringBuffer();
    Object localObject1 = new StringBuffer();
    localStringBuffer.append("<desc>");
    Iterator localIterator = localSnsInfoFlip.qJD.keySet().iterator();
    label449:
    if (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      int k = ((Integer)localSnsInfoFlip.qJD.get(localInteger)).intValue();
      if (localSnsInfoFlip.qJF.containsKey(localInteger)) {}
      for (i = (int)(((Long)localSnsInfoFlip.qJF.get(localInteger)).longValue() * 1L);; i = 0)
      {
        localStringBuffer.append(String.format("<item><id>%d</id><duration>%d</duration><count>%d</count></item>", new Object[] { localInteger, Integer.valueOf(i), Integer.valueOf(k) }));
        ((StringBuffer)localObject1).append(String.format("%d|%d|%d", new Object[] { localInteger, Integer.valueOf(i), Integer.valueOf(k) }) + "&");
        break label449;
        label613:
        l1 = 0L;
        break;
        label619:
        l2 = 0L;
        break label315;
      }
    }
    localStringBuffer.append("</desc>");
    localObject1 = ((StringBuffer)localObject1).toString();
    if (((String)localObject1).endsWith("&")) {
      localObject1 = ((String)localObject1).substring(0, ((String)localObject1).length() - 1);
    }
    for (;;)
    {
      if ((localm == null) || (!localm.bir())) {
        com.tencent.mm.plugin.sns.model.ae.bhj().i(12014, new Object[] { f.a(localm.field_snsId, new Object[] { com.tencent.mm.plugin.sns.data.i.jdMethod_do(localm.field_snsId), localm.bkq(), Integer.valueOf(j), Long.valueOf(localSnsInfoFlip.qJU), Long.valueOf(System.currentTimeMillis()), localObject1, Integer.valueOf(localSnsInfoFlip.getCount()) }) });
      }
      if (((com.tencent.mm.plugin.sns.storage.e)localObject2).bjH().qmi != 1)
      {
        localObject2 = new c(localm.bkp(), 6, j, localStringBuffer.toString(), localm.bku(), localm.bjM());
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.a((k)localObject2, 0);
      }
      localObject2 = com.tencent.mm.modelsns.b.gM(729);
      ((com.tencent.mm.modelsns.b)localObject2).lh(com.tencent.mm.plugin.sns.data.i.jdMethod_do(localm.field_snsId)).lh(localm.bkq()).gP(j).lh(localSnsInfoFlip.qJU).lh(System.currentTimeMillis()).lh((String)localObject1).gP(localSnsInfoFlip.getCount());
      ((com.tencent.mm.modelsns.b)localObject2).LJ();
      break;
    }
  }
  
  protected void onPause()
  {
    GMTrace.i(8760659542016L, 65272);
    if (this.qGM != null) {
      this.qGM.onPause();
    }
    super.onPause();
    GMTrace.o(8760659542016L, 65272);
  }
  
  public void onResume()
  {
    GMTrace.i(8760793759744L, 65273);
    super.onResume();
    if (this.qGM != null) {
      this.qGM.awa();
    }
    GMTrace.o(8760793759744L, 65273);
  }
  
  public void onStart()
  {
    GMTrace.i(8761062195200L, 65275);
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
          this.qGM.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
          {
            public final boolean onPreDraw()
            {
              GMTrace.i(15054263025664L, 112163);
              SnsBrowseUI.this.qGM.getViewTreeObserver().removeOnPreDrawListener(this);
              SnsBrowseUI.a(SnsBrowseUI.this, SnsBrowseUI.this.qGM.getWidth());
              SnsBrowseUI.b(SnsBrowseUI.this, SnsBrowseUI.this.qGM.getHeight());
              SnsBrowseUI.c(SnsBrowseUI.this, SnsBrowseUI.this.qGM.getWidth());
              SnsBrowseUI.d(SnsBrowseUI.this, SnsBrowseUI.this.qGM.getHeight());
              com.tencent.mm.plugin.sns.model.ae.bhm();
              Object localObject = com.tencent.mm.plugin.sns.model.g.B(SnsBrowseUI.this.qGM.blC());
              if (localObject != null)
              {
                localObject = d.QI((String)localObject);
                SnsBrowseUI localSnsBrowseUI = SnsBrowseUI.this;
                float f = SnsBrowseUI.b(SnsBrowseUI.this) / ((BitmapFactory.Options)localObject).outWidth;
                SnsBrowseUI.d(localSnsBrowseUI, (int)(((BitmapFactory.Options)localObject).outHeight * f));
                if (SnsBrowseUI.c(SnsBrowseUI.this) > SnsBrowseUI.this.qGM.getHeight()) {
                  SnsBrowseUI.d(SnsBrowseUI.this, SnsBrowseUI.this.qGM.getHeight());
                }
              }
              SnsBrowseUI.this.kvw.ex(SnsBrowseUI.b(SnsBrowseUI.this), SnsBrowseUI.c(SnsBrowseUI.this));
              SnsBrowseUI.this.kvw.a(SnsBrowseUI.this.qGM, SnsBrowseUI.d(SnsBrowseUI.this), null);
              SnsBrowseUI.this.bmB();
              GMTrace.o(15054263025664L, 112163);
              return true;
            }
          });
        }
      }
    }
    super.onStart();
    w.d("MicroMsg.SnsPopMediasUI", "onStart ");
    GMTrace.o(8761062195200L, 65275);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsBrowseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */