package com.tencent.mm.plugin.sns.ui;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager.e;
import android.support.v4.view.ViewPager.h;
import android.support.v4.view.u;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.c.f;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.a;
import com.tencent.mm.plugin.sns.model.AdlandingRemoteServiceConnectedReceiver;
import com.tencent.mm.plugin.sns.model.am;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.DummyViewPager;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.j;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.widget.e.a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class SnsAdNativeLandingPagesUI
  extends MMActivity
{
  public static boolean qFO;
  int cyK;
  String fMT;
  private long gCB;
  String iMY;
  private boolean jNN;
  private long jor;
  private ImageView khp;
  private int kid;
  private int kvA;
  private int kvx;
  private int kvy;
  private int kvz;
  private com.tencent.mm.remoteservice.d lFI;
  private ImageView lWE;
  String lpQ;
  String lpR;
  protected com.tencent.mm.ui.snackbar.b.b myp;
  public LinkedList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c> qFD;
  private ImageView qFE;
  private ImageView qFF;
  Bundle qFG;
  b qFH;
  private boolean qFI;
  String qFJ;
  String qFK;
  private ImageView qFL;
  String qFM;
  String qFN;
  com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g qFP;
  boolean qFQ;
  private int qFR;
  int qFS;
  String qFT;
  String qFU;
  String qFV;
  private AdlandingDummyViewPager qFW;
  int qFX;
  private ae qFY;
  private LinkedList<View> qFZ;
  private boolean qGa;
  private View qGb;
  com.tencent.mm.plugin.sns.storage.m qGc;
  private volatile int qGd;
  private BroadcastReceiver qGe;
  private BroadcastReceiver qGf;
  private b.a qGg;
  private ViewPager.e qGh;
  private Map<Integer, Fragment> qGi;
  private BroadcastReceiver qGj;
  String qhb;
  private int qlR;
  String qlp;
  private int qnB;
  private int qqw;
  private int qqx;
  private int qqy;
  com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w qth;
  private View qtx;
  private long startTime;
  Map<String, String> values;
  
  static
  {
    GMTrace.i(17146448969728L, 127751);
    qFO = false;
    GMTrace.o(17146448969728L, 127751);
  }
  
  public SnsAdNativeLandingPagesUI()
  {
    GMTrace.i(8524704776192L, 63514);
    this.qFD = new LinkedList();
    this.kvx = 0;
    this.kvy = 0;
    this.kvz = 0;
    this.kvA = 0;
    this.qFI = false;
    this.qqw = 1000;
    this.qqx = 700;
    this.qqy = 250;
    this.jor = 0L;
    this.gCB = 0L;
    this.qFP = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g();
    this.qFQ = false;
    this.qFR = 0;
    this.qFY = new ae();
    this.lFI = new com.tencent.mm.remoteservice.d(com.tencent.mm.sdk.platformtools.ab.getContext());
    this.qGa = true;
    this.jNN = false;
    this.qGd = 2;
    this.qGe = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(17146717405184L, 127753);
        int i = paramAnonymousIntent.getIntExtra("show", 0);
        paramAnonymousContext = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)((android.support.v4.app.n)SnsAdNativeLandingPagesUI.a(SnsAdNativeLandingPagesUI.this).xM).I(SnsAdNativeLandingPagesUI.a(SnsAdNativeLandingPagesUI.this).xN);
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SnsAdNativeLandingPagesUI", "recv videoProgressbarStatusChangeReceiver show %d", new Object[] { Integer.valueOf(i) });
        if (paramAnonymousContext.bjA())
        {
          paramAnonymousContext.bjz();
          GMTrace.o(17146717405184L, 127753);
          return;
        }
        paramAnonymousContext.bjy();
        GMTrace.o(17146717405184L, 127753);
      }
    };
    this.qGf = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(17138530123776L, 127692);
        SnsAdNativeLandingPagesUI.b(SnsAdNativeLandingPagesUI.this);
        GMTrace.o(17138530123776L, 127692);
      }
    };
    this.qGg = new b.a()
    {
      public final void a(final com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b paramAnonymousb)
      {
        GMTrace.i(17147254276096L, 127757);
        paramAnonymousb = paramAnonymousb.bjw();
        if (paramAnonymousb != null) {
          paramAnonymousb.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
          {
            public final boolean onPreDraw()
            {
              GMTrace.i(17137859035136L, 127687);
              paramAnonymousb.getViewTreeObserver().removeOnPreDrawListener(this);
              SnsAdNativeLandingPagesUI.c(SnsAdNativeLandingPagesUI.this);
              SnsAdNativeLandingPagesUI.d(SnsAdNativeLandingPagesUI.this);
              GMTrace.o(17137859035136L, 127687);
              return true;
            }
          });
        }
        GMTrace.o(17147254276096L, 127757);
      }
    };
    this.qGh = new ViewPager.h()
    {
      public final void V(int paramAnonymousInt)
      {
        GMTrace.i(17139066994688L, 127696);
        super.V(paramAnonymousInt);
        int i = 0;
        if (i < SnsAdNativeLandingPagesUI.this.qFD.size())
        {
          Object localObject = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)SnsAdNativeLandingPagesUI.this.qFD.get(i);
          localObject = (Fragment)SnsAdNativeLandingPagesUI.f(SnsAdNativeLandingPagesUI.this).get(Integer.valueOf(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)localObject).id));
          if (localObject != null)
          {
            if (i != paramAnonymousInt) {
              break label90;
            }
            ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localObject).bjz();
          }
          for (;;)
          {
            i += 1;
            break;
            label90:
            ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localObject).bjy();
          }
        }
        GMTrace.o(17139066994688L, 127696);
      }
      
      public final void W(int paramAnonymousInt)
      {
        GMTrace.i(17138932776960L, 127695);
        super.W(paramAnonymousInt);
        SnsAdNativeLandingPagesUI.e(SnsAdNativeLandingPagesUI.this).qtl = paramAnonymousInt;
        Object localObject;
        if (paramAnonymousInt == 1)
        {
          paramAnonymousInt = 0;
          while (paramAnonymousInt < SnsAdNativeLandingPagesUI.this.qFD.size())
          {
            localObject = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)SnsAdNativeLandingPagesUI.this.qFD.get(paramAnonymousInt);
            localObject = (Fragment)SnsAdNativeLandingPagesUI.f(SnsAdNativeLandingPagesUI.this).get(Integer.valueOf(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)localObject).id));
            if (localObject != null) {
              ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localObject).bjy();
            }
            paramAnonymousInt += 1;
          }
          com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ab.df(SnsAdNativeLandingPagesUI.this.vov.voR);
          GMTrace.o(17138932776960L, 127695);
          return;
        }
        if (paramAnonymousInt == 0)
        {
          localObject = (Fragment)SnsAdNativeLandingPagesUI.f(SnsAdNativeLandingPagesUI.this).get(Integer.valueOf(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)SnsAdNativeLandingPagesUI.this.qFD.get(SnsAdNativeLandingPagesUI.a(SnsAdNativeLandingPagesUI.this).xN)).id));
          if (localObject != null) {
            ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localObject).bjz();
          }
        }
        GMTrace.o(17138932776960L, 127695);
      }
      
      public final void a(int paramAnonymousInt1, float paramAnonymousFloat, int paramAnonymousInt2)
      {
        GMTrace.i(17138798559232L, 127694);
        super.a(paramAnonymousInt1, paramAnonymousFloat, paramAnonymousInt2);
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b localb = SnsAdNativeLandingPagesUI.e(SnsAdNativeLandingPagesUI.this);
        if (localb.qtg != null) {
          localb.qtg.biM();
        }
        GMTrace.o(17138798559232L, 127694);
      }
    };
    this.qGi = new HashMap();
    this.myp = new com.tencent.mm.ui.snackbar.b.b()
    {
      public final void aDU()
      {
        GMTrace.i(17148596453376L, 127767);
        try
        {
          AdLandingPagesProxy.getInstance().favEditTag();
          GMTrace.o(17148596453376L, 127767);
          return;
        }
        catch (Exception localException)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SnsAdNativeLandingPagesUI", "favorite edittag fail, ex = " + localException.getMessage());
          GMTrace.o(17148596453376L, 127767);
        }
      }
    };
    this.qGj = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(17132892979200L, 127650);
        if (paramAnonymousIntent.getAction().equals("android.intent.action.SCREEN_OFF"))
        {
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SnsAdNativeLandingPagesUI", "android.intent.action.SCREEN_OFF");
          GMTrace.o(17132892979200L, 127650);
          return;
        }
        if (paramAnonymousIntent.getAction().equals("android.intent.action.SCREEN_ON"))
        {
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SnsAdNativeLandingPagesUI", "android.intent.action.SCREEN_ON");
          SnsAdNativeLandingPagesUI.b(SnsAdNativeLandingPagesUI.this);
        }
        GMTrace.o(17132892979200L, 127650);
      }
    };
    GMTrace.o(8524704776192L, 63514);
  }
  
  private void bmn()
  {
    GMTrace.i(17142019784704L, 127718);
    if (this.qFD == null)
    {
      GMTrace.o(17142019784704L, 127718);
      return;
    }
    Iterator localIterator = this.qFD.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)localIterator.next();
      localObject = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)this.qGi.get(Integer.valueOf(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)localObject).id));
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localObject).qtj = true;
      if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localObject).qti) {
        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localObject).bjt();
      }
    }
    ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)this.qGi.get(Integer.valueOf(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)this.qFD.getFirst()).id))).bjz();
    GMTrace.o(17142019784704L, 127718);
  }
  
  private void bmo()
  {
    GMTrace.i(17142154002432L, 127719);
    Iterator localIterator = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.c)this.qFW.xM).pu.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b localb = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localIterator.next();
      if ((localb.qtg != null) && (localb.getUserVisibleHint())) {
        localb.qtg.bjo();
      }
    }
    GMTrace.o(17142154002432L, 127719);
  }
  
  private void bmp()
  {
    GMTrace.i(8525778518016L, 63522);
    Object localObject2;
    label64:
    Object localObject3;
    int i;
    if (this.qFD != null)
    {
      localObject1 = this.qFD.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)((Iterator)localObject1).next()).qtX;
        if (localObject2 != null)
        {
          localObject2 = ((List)localObject2).iterator();
          if (((Iterator)localObject2).hasNext())
          {
            localObject3 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p)((Iterator)localObject2).next();
            if (this.qnB != 0) {
              break label124;
            }
          }
          label124:
          for (i = this.cyK;; i = this.qnB)
          {
            ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p)localObject3).ur(i);
            ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p)localObject3).hS(qFO);
            ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p)localObject3).Ho(this.qhb);
            break label64;
            break;
          }
        }
      }
    }
    Object localObject1 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.c)this.qFW.xM;
    if (localObject1 == null)
    {
      localObject1 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.c(aR(), new ArrayList());
      this.qFW.a((u)localObject1);
    }
    for (;;)
    {
      i = 0;
      if (i < this.qFD.size())
      {
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c localc = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)this.qFD.get(i);
        Object localObject4;
        boolean bool;
        if (localc.qnz)
        {
          localObject3 = (Fragment)this.qGi.get(Integer.valueOf(localc.id));
          if (localObject3 != null) {
            break label372;
          }
          localObject3 = this.qFW;
          localObject4 = this.qth;
          if (i != this.qFD.size() - 1) {
            break label361;
          }
          bool = true;
          label266:
          if (i != 0) {
            break label366;
          }
          localObject2 = this.qGg;
          label276:
          localObject2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b.a(localc, (DummyViewPager)localObject3, (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w)localObject4, bool, (b.a)localObject2, this.qFI);
          this.qGi.put(Integer.valueOf(localc.id), localObject2);
          label314:
          ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.c)localObject1).pu.remove(localObject2);
          if (i < ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.c)localObject1).pu.size()) {
            break label412;
          }
          ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.c)localObject1).pu.add(localObject2);
        }
        for (;;)
        {
          i += 1;
          break;
          label361:
          bool = false;
          break label266;
          label366:
          localObject2 = null;
          break label276;
          label372:
          localObject4 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localObject3;
          localObject2 = localObject3;
          if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localObject4).qtb == localc) {
            break label314;
          }
          ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localObject4).qtb = localc;
          ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localObject4).ayb();
          localObject2 = localObject3;
          break label314;
          label412:
          ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.c)localObject1).pu.add(i, localObject2);
        }
      }
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.c)localObject1).notifyDataSetChanged();
      localObject1 = this.qFW;
      int j = this.qFD.size();
      i = j;
      if (j <= 0)
      {
        new StringBuilder("Requested offscreen page limit ").append(j).append(" too small; defaulting to 1");
        i = 1;
      }
      if (i != ((AdLandingViewPager)localObject1).ye)
      {
        ((AdLandingViewPager)localObject1).ye = i;
        ((AdLandingViewPager)localObject1).populate();
      }
      GMTrace.o(8525778518016L, 63522);
      return;
    }
  }
  
  private List<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i> bmq()
  {
    GMTrace.i(18573586071552L, 138384);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.c)this.qFW.xM).pu.iterator();
    while (localIterator.hasNext()) {
      localArrayList.addAll(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localIterator.next()).bjx());
    }
    GMTrace.o(18573586071552L, 138384);
    return localArrayList;
  }
  
  private List<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i> bmr()
  {
    GMTrace.i(17839549317120L, 132915);
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)this.qGi.get(Integer.valueOf(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)this.qFD.getFirst()).id))).bjx());
    GMTrace.o(17839549317120L, 132915);
    return localArrayList;
  }
  
  private void bms()
  {
    GMTrace.i(16257524957184L, 121128);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsAdNativeLandingPagesUI", "setFullScreen");
    int i = 4102;
    getWindow().getAttributes();
    if (isFullScreen())
    {
      i = 5126;
      getWindow().setFlags(1024, 1024);
    }
    for (;;)
    {
      getWindow().getDecorView().setSystemUiVisibility(i);
      GMTrace.o(16257524957184L, 121128);
      return;
      getWindow().clearFlags(1024);
    }
  }
  
  private boolean bmt()
  {
    GMTrace.i(8526315388928L, 63526);
    if (this.qFX != 0)
    {
      if (((this.qFX & 0x4) == 0) || ((this.qFX & 0x2) == 0) || ((this.qFX & 0x1) == 0))
      {
        GMTrace.o(8526315388928L, 63526);
        return true;
      }
      GMTrace.o(8526315388928L, 63526);
      return false;
    }
    GMTrace.o(8526315388928L, 63526);
    return true;
  }
  
  private void bmu()
  {
    GMTrace.i(17142422437888L, 127721);
    Object localObject2 = bmr();
    Object localObject1 = new LinkedList();
    localObject2 = ((List)localObject2).iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((LinkedList)localObject1).add((View)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i)((Iterator)localObject2).next()).getView().getParent());
    }
    this.qGb = null;
    if (this.qFZ != null) {
      this.qFZ.clear();
    }
    if (!((LinkedList)localObject1).isEmpty())
    {
      this.qGb = ((View)((LinkedList)localObject1).removeFirst());
      if (this.qFZ == null) {
        this.qFZ = new LinkedList();
      }
      this.qFZ.clear();
      int i = this.qGb.getHeight();
      localObject1 = ((LinkedList)localObject1).iterator();
      int j;
      do
      {
        if (!((Iterator)localObject1).hasNext()) {
          break;
        }
        localObject2 = (View)((Iterator)localObject1).next();
        j = i + ((View)localObject2).getHeight();
        this.qFZ.add(localObject2);
        i = j;
      } while (j < this.kid);
    }
    GMTrace.o(17142422437888L, 127721);
  }
  
  private boolean isFullScreen()
  {
    GMTrace.i(16257390739456L, 121127);
    if (this.qFD != null)
    {
      Iterator localIterator1 = this.qFD.iterator();
      int i = 0;
      for (;;)
      {
        j = i;
        if (!localIterator1.hasNext()) {
          break label89;
        }
        Iterator localIterator2 = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)localIterator1.next()).qtX.iterator();
        if (localIterator2.hasNext())
        {
          if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p)localIterator2.next()).type != 82) {
            break;
          }
          i = 1;
        }
      }
    }
    int j = 0;
    label89:
    if (j == 0)
    {
      GMTrace.o(16257390739456L, 121127);
      return true;
    }
    GMTrace.o(16257390739456L, 121127);
    return false;
  }
  
  private void rB()
  {
    GMTrace.i(17142288220160L, 127720);
    Object localObject3 = bmq();
    this.jor += System.currentTimeMillis() - this.startTime;
    this.qFP.quC = ((int)this.jor);
    Object localObject1 = this.qFP;
    int j;
    if (this.qFD == null)
    {
      j = 0;
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)localObject1).quB = j;
      localObject1 = this.qFP;
      localObject2 = new JSONArray();
      localObject3 = ((List)localObject3).iterator();
      while (((Iterator)localObject3).hasNext())
      {
        Object localObject4 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i)((Iterator)localObject3).next();
        if (!((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i)localObject4).biV().qnA)
        {
          JSONObject localJSONObject = new JSONObject();
          if (!((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i)localObject4).s((JSONArray)localObject2))
          {
            if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i)localObject4).L(localJSONObject)) {
              ((JSONArray)localObject2).put(localJSONObject);
            }
            if ((localObject4 instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.n))
            {
              localObject4 = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.n)localObject4).bje().iterator();
              while (((Iterator)localObject4).hasNext()) {
                ((JSONArray)localObject2).put((JSONObject)((Iterator)localObject4).next());
              }
            }
          }
        }
      }
    }
    Object localObject2 = this.qFD.iterator();
    for (int i = 0;; i = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)((Iterator)localObject2).next()).qtX.size() + i)
    {
      j = i;
      if (!((Iterator)localObject2).hasNext()) {
        break;
      }
    }
    ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)localObject1).quF = ((JSONArray)localObject2).toString();
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AdLandingPagesReportInfo", "componentsStatStr:%s", new Object[] { ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)localObject1).quF });
    if (!bg.mZ(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)localObject1).quF)) {}
    try
    {
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)localObject1).quF = URLEncoder.encode(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)localObject1).quF, "UTF-8");
      localObject1 = this.qFP.bjF();
      if (AdLandingPagesProxy.getInstance().isRecExpAd(this.qFP.fMT))
      {
        com.tencent.mm.plugin.report.service.g.paX.z(14650, (String)localObject1);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsAdNativeLandingPagesUI", "post kv stat 14650 data: " + (String)localObject1);
        GMTrace.o(17142288220160L, 127720);
        return;
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AdLandingPagesReportInfo", "not support encode " + localUnsupportedEncodingException.toString());
      }
      com.tencent.mm.plugin.report.service.g.paX.z(13387, localUnsupportedEncodingException);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsAdNativeLandingPagesUI", "post kv stat 13387 data: " + localUnsupportedEncodingException);
      GMTrace.o(17142288220160L, 127720);
    }
  }
  
  @TargetApi(16)
  protected final void MH()
  {
    GMTrace.i(8526046953472L, 63524);
    super.MH();
    this.qtx = findViewById(i.f.cse);
    this.qFW = ((AdlandingDummyViewPager)findViewById(i.f.pNE));
    AdlandingDummyViewPager localAdlandingDummyViewPager = this.qFW;
    ViewPager.e locale = this.qGh;
    localAdlandingDummyViewPager.qsV.add(locale);
    this.lWE = ((ImageView)findViewById(i.f.bKT));
    this.qFF = ((ImageView)findViewById(i.f.pLp));
    this.khp = ((ImageView)findViewById(i.f.pLo));
    this.khp.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(15293841670144L, 113948);
        SnsAdNativeLandingPagesUI.this.alb();
        GMTrace.o(15293841670144L, 113948);
      }
    });
    this.qFE = ((ImageView)findViewById(i.f.pLD));
    if (bmt()) {
      this.qFE.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(final View paramAnonymousView)
        {
          GMTrace.i(17138395906048L, 127691);
          paramAnonymousView = new com.tencent.mm.ui.widget.e(SnsAdNativeLandingPagesUI.this, com.tencent.mm.ui.widget.e.wSP, false);
          paramAnonymousView.qQS = new o.c()
          {
            public final void a(com.tencent.mm.ui.base.m paramAnonymous2m)
            {
              GMTrace.i(17137322164224L, 127683);
              if ((SnsAdNativeLandingPagesUI.s(SnsAdNativeLandingPagesUI.this) == 0) || ((SnsAdNativeLandingPagesUI.s(SnsAdNativeLandingPagesUI.this) & 0x2) == 0)) {
                paramAnonymous2m.a(1, SnsAdNativeLandingPagesUI.this.getString(i.j.eAv), i.i.dmx);
              }
              if ((SnsAdNativeLandingPagesUI.s(SnsAdNativeLandingPagesUI.this) == 0) || ((SnsAdNativeLandingPagesUI.s(SnsAdNativeLandingPagesUI.this) & 0x1) == 0)) {
                paramAnonymous2m.a(2, SnsAdNativeLandingPagesUI.this.getString(i.j.pRE), i.i.dmn);
              }
              if (((SnsAdNativeLandingPagesUI.s(SnsAdNativeLandingPagesUI.this) == 0) || ((SnsAdNativeLandingPagesUI.s(SnsAdNativeLandingPagesUI.this) & 0x4) == 0)) && (SnsAdNativeLandingPagesUI.t(SnsAdNativeLandingPagesUI.this) != 7)) {
                paramAnonymous2m.a(3, SnsAdNativeLandingPagesUI.this.getString(i.j.dHP), i.i.dmg);
              }
              GMTrace.o(17137322164224L, 127683);
            }
          };
          paramAnonymousView.wTa = new e.a()
          {
            public final void onDismiss()
            {
              GMTrace.i(17138127470592L, 127689);
              SnsAdNativeLandingPagesUI.b(SnsAdNativeLandingPagesUI.this);
              GMTrace.o(17138127470592L, 127689);
            }
          };
          paramAnonymousView.qQT = new o.d()
          {
            public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
            {
              GMTrace.i(17132624543744L, 127648);
              SnsAdNativeLandingPagesUI.b(SnsAdNativeLandingPagesUI.this);
              if (paramAnonymous2MenuItem != null) {
                switch (paramAnonymous2MenuItem.getItemId())
                {
                }
              }
              for (;;)
              {
                GMTrace.o(17132624543744L, 127648);
                return;
                SnsAdNativeLandingPagesUI.u(SnsAdNativeLandingPagesUI.this);
                GMTrace.o(17132624543744L, 127648);
                return;
                SnsAdNativeLandingPagesUI.v(SnsAdNativeLandingPagesUI.this);
                GMTrace.o(17132624543744L, 127648);
                return;
                SnsAdNativeLandingPagesUI.w(SnsAdNativeLandingPagesUI.this);
              }
            }
          };
          paramAnonymousView.sxT = true;
          if (!SnsAdNativeLandingPagesUI.x(SnsAdNativeLandingPagesUI.this))
          {
            SnsAdNativeLandingPagesUI.this.aKl();
            SnsAdNativeLandingPagesUI.y(SnsAdNativeLandingPagesUI.this).postDelayed(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(17148328017920L, 127765);
                paramAnonymousView.bCV();
                GMTrace.o(17148328017920L, 127765);
              }
            }, 300L);
            GMTrace.o(17138395906048L, 127691);
            return;
          }
          paramAnonymousView.bCV();
          GMTrace.o(17138395906048L, 127691);
        }
      });
    }
    for (;;)
    {
      this.qFL = ((ImageView)findViewById(i.f.pMF));
      if ((this.qFD != null) && (this.qFD.size() != 0)) {
        break;
      }
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SnsAdNativeLandingPagesUI", "landingPages is null");
      GMTrace.o(8526046953472L, 63524);
      return;
      this.qFE.setVisibility(8);
    }
    bmp();
    this.qFH = new b(this.vov.voR);
    this.qtx.addOnLayoutChangeListener(new View.OnLayoutChangeListener()
    {
      public final void onLayoutChange(View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5, int paramAnonymousInt6, int paramAnonymousInt7, int paramAnonymousInt8)
      {
        GMTrace.i(17139335430144L, 127698);
        if (SnsAdNativeLandingPagesUI.z(SnsAdNativeLandingPagesUI.this).getHeight() == SnsAdNativeLandingPagesUI.A(SnsAdNativeLandingPagesUI.this))
        {
          SnsAdNativeLandingPagesUI.z(SnsAdNativeLandingPagesUI.this).removeOnLayoutChangeListener(this);
          SnsAdNativeLandingPagesUI.c(SnsAdNativeLandingPagesUI.this);
          SnsAdNativeLandingPagesUI.d(SnsAdNativeLandingPagesUI.this);
        }
        GMTrace.o(17139335430144L, 127698);
      }
    });
    GMTrace.o(8526046953472L, 63524);
  }
  
  protected final int Qb()
  {
    GMTrace.i(8524973211648L, 63516);
    GMTrace.o(8524973211648L, 63516);
    return 1;
  }
  
  public final void YW()
  {
    GMTrace.i(8525644300288L, 63521);
    this.qFP.gCh = 2;
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g localg = this.qFP;
    localg.quA += 1;
    super.YW();
    GMTrace.o(8525644300288L, 63521);
  }
  
  public final void alb()
  {
    GMTrace.i(8526986477568L, 63531);
    bmo();
    rB();
    this.qFQ = true;
    if (!this.qFI)
    {
      finish();
      GMTrace.o(8526986477568L, 63531);
      return;
    }
    try
    {
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i)bmr().get(0)).biX();
      this.qFW.c(0, false);
      LinearLayoutManager localLinearLayoutManager = (LinearLayoutManager)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)this.qGi.get(Integer.valueOf(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)this.qFD.getFirst()).id))).bjw().Tc;
      localLinearLayoutManager.Rs = 0;
      localLinearLayoutManager.Rt = 0;
      if (localLinearLayoutManager.Rv != null) {
        localLinearLayoutManager.Rv.RH = -1;
      }
      localLinearLayoutManager.requestLayout();
      bmo();
      if (this.qGb != null)
      {
        this.qGb.postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(17133027196928L, 127651);
            SnsAdNativeLandingPagesUI.F(SnsAdNativeLandingPagesUI.this);
            SnsAdNativeLandingPagesUI.G(SnsAdNativeLandingPagesUI.this);
            SnsAdNativeLandingPagesUI.this.qFH.p(SnsAdNativeLandingPagesUI.H(SnsAdNativeLandingPagesUI.this), SnsAdNativeLandingPagesUI.I(SnsAdNativeLandingPagesUI.this), SnsAdNativeLandingPagesUI.J(SnsAdNativeLandingPagesUI.this), SnsAdNativeLandingPagesUI.K(SnsAdNativeLandingPagesUI.this));
            Object localObject1 = SnsAdNativeLandingPagesUI.this.qFH;
            View localView = SnsAdNativeLandingPagesUI.L(SnsAdNativeLandingPagesUI.this);
            LinkedList localLinkedList = SnsAdNativeLandingPagesUI.M(SnsAdNativeLandingPagesUI.this);
            Object localObject2 = SnsAdNativeLandingPagesUI.N(SnsAdNativeLandingPagesUI.this);
            b.b local1 = new b.b()
            {
              public final void onAnimationEnd()
              {
                GMTrace.i(17139738083328L, 127701);
                new ae().post(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(17132087672832L, 127644);
                    SnsAdNativeLandingPagesUI.this.finish();
                    SnsAdNativeLandingPagesUI.this.overridePendingTransition(0, 0);
                    GMTrace.o(17132087672832L, 127644);
                  }
                });
                GMTrace.o(17139738083328L, 127701);
              }
              
              public final void onAnimationStart()
              {
                GMTrace.i(17139603865600L, 127700);
                SnsAdNativeLandingPagesUI.B(SnsAdNativeLandingPagesUI.this).setVisibility(8);
                GMTrace.o(17139603865600L, 127700);
              }
            };
            if ((Build.VERSION.SDK_INT < 12) || (localView == null) || (((b)localObject1).qwi == ((b)localObject1).qwf) || (((b)localObject1).qwi == ((b)localObject1).qwh) || (((b)localObject1).qwi == ((b)localObject1).qwe))
            {
              GMTrace.o(17133027196928L, 127651);
              return;
            }
            localView.getLocationOnScreen(new int[2]);
            ((b)localObject1).k(localView, true);
            if (localObject2 != null) {
              ((View)localObject2).animate().setDuration(300L).setInterpolator(new DecelerateInterpolator(1.2F)).alpha(0.0F);
            }
            localObject2 = new AnimationSet(true);
            Object localObject3 = new b.3((b)localObject1, ((b)localObject1).qvV, ((b)localObject1).qvV, localView, null);
            ((ScaleAnimation)localObject3).setDuration(300L);
            ((ScaleAnimation)localObject3).setInterpolator(new DecelerateInterpolator(1.2F));
            ((AnimationSet)localObject2).addAnimation((Animation)localObject3);
            localObject3 = new TranslateAnimation(0.0F, ((b)localObject1).qvR, 0.0F, ((b)localObject1).qvS);
            ((TranslateAnimation)localObject3).setDuration(300L);
            ((TranslateAnimation)localObject3).setInterpolator(new DecelerateInterpolator(1.2F));
            ((AnimationSet)localObject2).addAnimation((Animation)localObject3);
            ((AnimationSet)localObject2).setFillAfter(true);
            ((AnimationSet)localObject2).setAnimationListener(new b.4((b)localObject1, local1));
            localView.startAnimation((Animation)localObject2);
            localObject1 = localLinkedList.iterator();
            while (((Iterator)localObject1).hasNext()) {
              ((View)((Iterator)localObject1).next()).setAlpha(0.0F);
            }
            GMTrace.o(17133027196928L, 127651);
          }
        }, 10L);
        GMTrace.o(8526986477568L, 63531);
        return;
      }
      finish();
      overridePendingTransition(0, 0);
      GMTrace.o(8526986477568L, 63531);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public final void anR()
  {
    GMTrace.i(16257659174912L, 121129);
    super.anR();
    if (this.qFW != null) {
      this.qFW.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17146985840640L, 127755);
          if (SnsAdNativeLandingPagesUI.this.vov.vpj != 1) {
            SnsAdNativeLandingPagesUI.b(SnsAdNativeLandingPagesUI.this);
          }
          new ArrayList();
          Iterator localIterator = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.c)SnsAdNativeLandingPagesUI.a(SnsAdNativeLandingPagesUI.this).xM).pu.iterator();
          while (localIterator.hasNext())
          {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b localb = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localIterator.next();
            int i = SnsAdNativeLandingPagesUI.this.vov.vpj;
            localb.bjs();
          }
          GMTrace.o(17146985840640L, 127755);
        }
      }, 500L);
    }
    GMTrace.o(16257659174912L, 121129);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8526181171200L, 63525);
    int i = i.g.pOA;
    GMTrace.o(8526181171200L, 63525);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8527657566208L, 63536);
    if (paramInt1 == 1) {
      if (paramInt2 == -1) {
        com.tencent.mm.ui.base.h.bl(this.vov.voR, this.vov.voR.getString(i.j.dxe));
      }
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      GMTrace.o(8527657566208L, 63536);
      return;
      int i;
      if (paramInt1 == 2)
      {
        if (paramIntent.getBooleanExtra("kfavorite", false))
        {
          i = AdLandingPagesProxy.getInstance().doFav(paramIntent, 42);
          ((com.tencent.mm.plugin.fav.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.fav.a.a.class)).a(i, 42, this, this.myp);
        }
      }
      else if (paramInt1 == v.qrF) {
        try
        {
          Object localObject = paramIntent.getStringExtra("KComponentCid");
          Iterator localIterator = bmq().iterator();
          com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i locali;
          do
          {
            if (!localIterator.hasNext()) {
              break;
            }
            locali = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i)localIterator.next();
          } while (!locali.biW().equals(localObject));
          localObject = (v)locali;
          i = paramIntent.getIntExtra("KStreamVideoPlayCount", 0);
          int j = paramIntent.getIntExtra("KStreamVideoPlayCompleteCount", 0);
          int k = paramIntent.getIntExtra("KStreamVideoTotalPlayTimeInMs", 0);
          ((v)localObject).pWM = (i + ((v)localObject).pWM);
          ((v)localObject).pWN += j;
          ((v)localObject).pWO += k;
        }
        catch (Exception localException) {}
      }
    }
  }
  
  public void onBackPressed()
  {
    GMTrace.i(8527120695296L, 63532);
    alb();
    GMTrace.o(8527120695296L, 63532);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8524838993920L, 63515);
    super.onCreate(paramBundle);
    this.startTime = System.currentTimeMillis();
    this.gCB = System.currentTimeMillis();
    this.qFP.gCB = this.gCB;
    new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b.a(this);
    bms();
    this.kid = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ab.de(this)[1];
    this.qFG = paramBundle;
    this.vov.bUK();
    getWindow().addFlags(128);
    AdLandingPagesProxy.create(this.lFI);
    this.lFI.E(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17137187946496L, 127682);
        AdlandingRemoteServiceConnectedReceiver.a(android.support.v4.content.d.l(SnsAdNativeLandingPagesUI.this));
        Object localObject3 = SnsAdNativeLandingPagesUI.this;
        ((SnsAdNativeLandingPagesUI)localObject3).qGc = AdLandingPagesProxy.getInstance().getSnsInfo(((SnsAdNativeLandingPagesUI)localObject3).fMT);
        AdLandingPagesProxy.getInstance().asyncCacheXml(((SnsAdNativeLandingPagesUI)localObject3).fMT);
        if (((SnsAdNativeLandingPagesUI)localObject3).values == null)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SnsAdNativeLandingPagesUI", "parse landingpagexml is error,landingpagexml is " + ((SnsAdNativeLandingPagesUI)localObject3).qFJ);
          SnsAdNativeLandingPagesUI.b(SnsAdNativeLandingPagesUI.this);
          SnsAdNativeLandingPagesUI.this.MH();
          SnsAdNativeLandingPagesUI.g(SnsAdNativeLandingPagesUI.this);
          if (SnsAdNativeLandingPagesUI.h(SnsAdNativeLandingPagesUI.this) == 1) {
            AdLandingPagesProxy.getInstance().doDynamicUpdateScene(SnsAdNativeLandingPagesUI.i(SnsAdNativeLandingPagesUI.this), SnsAdNativeLandingPagesUI.j(SnsAdNativeLandingPagesUI.this), SnsAdNativeLandingPagesUI.k(SnsAdNativeLandingPagesUI.this), new AdLandingPagesProxy.a()
            {
              public final void al(final Object paramAnonymous2Object)
              {
                GMTrace.i(17141482913792L, 127714);
                SnsAdNativeLandingPagesUI.l(SnsAdNativeLandingPagesUI.this).removeCallbacksAndMessages(null);
                SnsAdNativeLandingPagesUI.l(SnsAdNativeLandingPagesUI.this).post(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(17148059582464L, 127763);
                    SnsAdNativeLandingPagesUI.this.qFD = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.c(SnsAdNativeLandingPagesUI.m(SnsAdNativeLandingPagesUI.this), SnsAdNativeLandingPagesUI.n(SnsAdNativeLandingPagesUI.this), (String)paramAnonymous2Object, SnsAdNativeLandingPagesUI.o(SnsAdNativeLandingPagesUI.this), SnsAdNativeLandingPagesUI.p(SnsAdNativeLandingPagesUI.this));
                    af.u(new Runnable()
                    {
                      public final void run()
                      {
                        GMTrace.i(17147522711552L, 127759);
                        SnsAdNativeLandingPagesUI.q(SnsAdNativeLandingPagesUI.this);
                        GMTrace.o(17147522711552L, 127759);
                      }
                    });
                    GMTrace.o(17148059582464L, 127763);
                  }
                });
                GMTrace.o(17141482913792L, 127714);
              }
              
              public final void f(int paramAnonymous2Int1, int paramAnonymous2Int2, Object paramAnonymous2Object)
              {
                GMTrace.i(17839280881664L, 132913);
                GMTrace.o(17839280881664L, 132913);
              }
            });
          }
          SnsAdNativeLandingPagesUI.r(SnsAdNativeLandingPagesUI.this);
          GMTrace.o(17137187946496L, 127682);
          return;
        }
        if ((((SnsAdNativeLandingPagesUI)localObject3).cyK == 1) || (((SnsAdNativeLandingPagesUI)localObject3).cyK == 2) || (((SnsAdNativeLandingPagesUI)localObject3).cyK == 14) || (((SnsAdNativeLandingPagesUI)localObject3).cyK == 9) || (((SnsAdNativeLandingPagesUI)localObject3).cyK == 10))
        {
          long l1 = 0L;
          if (((SnsAdNativeLandingPagesUI)localObject3).qGc != null)
          {
            long l2 = ((SnsAdNativeLandingPagesUI)localObject3).qGc.field_snsId;
            if (TextUtils.isEmpty(((SnsAdNativeLandingPagesUI)localObject3).qlp)) {
              ((SnsAdNativeLandingPagesUI)localObject3).qlp = AdLandingPagesProxy.getInstance().getSnsAid(((SnsAdNativeLandingPagesUI)localObject3).fMT);
            }
            l1 = l2;
            if (TextUtils.isEmpty(((SnsAdNativeLandingPagesUI)localObject3).iMY))
            {
              ((SnsAdNativeLandingPagesUI)localObject3).iMY = AdLandingPagesProxy.getInstance().getSnsTraceid(((SnsAdNativeLandingPagesUI)localObject3).fMT);
              l1 = l2;
            }
          }
          ((SnsAdNativeLandingPagesUI)localObject3).values.put("." + ((SnsAdNativeLandingPagesUI)localObject3).qFK + ".originSnsId", String.valueOf(l1));
          ((SnsAdNativeLandingPagesUI)localObject3).values.put("." + ((SnsAdNativeLandingPagesUI)localObject3).qFK + ".originUxInfo", ((SnsAdNativeLandingPagesUI)localObject3).qhb);
          ((SnsAdNativeLandingPagesUI)localObject3).qFJ = ((SnsAdNativeLandingPagesUI)localObject3).qFJ.replace("<" + ((SnsAdNativeLandingPagesUI)localObject3).qFK + ">", "<" + ((SnsAdNativeLandingPagesUI)localObject3).qFK + ">\n<originSnsId>" + l1 + "</originSnsId>\n<originUxInfo>" + ((SnsAdNativeLandingPagesUI)localObject3).qhb + "</originUxInfo>");
          ((SnsAdNativeLandingPagesUI)localObject3).qFP.qhb = ((SnsAdNativeLandingPagesUI)localObject3).qhb;
          ((SnsAdNativeLandingPagesUI)localObject3).qFP.fMT = String.valueOf(l1);
        }
        Object localObject1;
        Object localObject2;
        Object localObject4;
        for (;;)
        {
          ((SnsAdNativeLandingPagesUI)localObject3).qFP.quG = AdLandingPagesProxy.getInstance().getSnsStatExtBySnsId(bg.RG(((SnsAdNativeLandingPagesUI)localObject3).qFP.fMT));
          ((SnsAdNativeLandingPagesUI)localObject3).lpR = bg.ap((String)((SnsAdNativeLandingPagesUI)localObject3).values.get("." + ((SnsAdNativeLandingPagesUI)localObject3).qFK + ".adCanvasInfo.shareTitle"), "");
          ((SnsAdNativeLandingPagesUI)localObject3).lpQ = bg.ap((String)((SnsAdNativeLandingPagesUI)localObject3).values.get("." + ((SnsAdNativeLandingPagesUI)localObject3).qFK + ".adCanvasInfo.shareWebUrl"), "");
          ((SnsAdNativeLandingPagesUI)localObject3).qFN = bg.ap((String)((SnsAdNativeLandingPagesUI)localObject3).values.get("." + ((SnsAdNativeLandingPagesUI)localObject3).qFK + ".adCanvasInfo.shareDesc"), "");
          ((SnsAdNativeLandingPagesUI)localObject3).qFS = bg.RF(bg.ap((String)((SnsAdNativeLandingPagesUI)localObject3).values.get("." + ((SnsAdNativeLandingPagesUI)localObject3).qFK + ".adCanvasInfo.bizId"), ""));
          ((SnsAdNativeLandingPagesUI)localObject3).qFT = bg.ap((String)((SnsAdNativeLandingPagesUI)localObject3).values.get("." + ((SnsAdNativeLandingPagesUI)localObject3).qFK + ".adCanvasInfo.shareAppId"), "");
          ((SnsAdNativeLandingPagesUI)localObject3).qFU = bg.ap((String)((SnsAdNativeLandingPagesUI)localObject3).values.get("." + ((SnsAdNativeLandingPagesUI)localObject3).qFK + ".adCanvasInfo.shareType"), "");
          ((SnsAdNativeLandingPagesUI)localObject3).qFV = bg.ap((String)((SnsAdNativeLandingPagesUI)localObject3).values.get("." + ((SnsAdNativeLandingPagesUI)localObject3).qFK + ".adCanvasInfo.userInfo"), "");
          ((SnsAdNativeLandingPagesUI)localObject3).qFX = bg.RF(bg.ap((String)((SnsAdNativeLandingPagesUI)localObject3).values.get("." + ((SnsAdNativeLandingPagesUI)localObject3).qFK + ".adCanvasInfo.disableShareBitSet"), ""));
          localObject1 = ((SnsAdNativeLandingPagesUI)localObject3).values;
          localObject2 = "." + ((SnsAdNativeLandingPagesUI)localObject3).qFK;
          localObject4 = (String)((Map)localObject1).get((String)localObject2 + ".adCanvasInfo.arrowDownIconStyle.iconUrl");
          if (!TextUtils.isEmpty((CharSequence)localObject4)) {
            break label1393;
          }
          ((SnsAdNativeLandingPagesUI)localObject3).qth = null;
          label989:
          ((SnsAdNativeLandingPagesUI)localObject3).qFD = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.k(((SnsAdNativeLandingPagesUI)localObject3).qFJ, ((SnsAdNativeLandingPagesUI)localObject3).qFK, ((SnsAdNativeLandingPagesUI)localObject3).qlp, ((SnsAdNativeLandingPagesUI)localObject3).iMY);
          if (((SnsAdNativeLandingPagesUI)localObject3).qFD.size() <= 0) {
            break;
          }
          localObject2 = "";
          localObject4 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)((SnsAdNativeLandingPagesUI)localObject3).qFD.get(0);
          localObject1 = localObject2;
          if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)localObject4).qtX.size() > 0)
          {
            localObject4 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)localObject4).qtX.get(0);
            if (!(localObject4 instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m)) {
              break label1701;
            }
            ((SnsAdNativeLandingPagesUI)localObject3).qFM = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m)localObject4).qne;
            localObject1 = localObject2;
          }
          label1100:
          if (((SnsAdNativeLandingPagesUI)localObject3).qGc == null) {
            break label1868;
          }
          localObject2 = ((SnsAdNativeLandingPagesUI)localObject3).qGc.bjL();
          if ((localObject2 == null) || (((bhc)localObject2).uyu == null) || (((bhc)localObject2).uyu.tKd == null) || (((bhc)localObject2).uyu.tKd.isEmpty())) {
            break;
          }
          localObject3 = (amn)((bhc)localObject2).uyu.tKd.getFirst();
          localObject2 = am.dt(AdLandingPagesProxy.getInstance().getAccSnsPath(), ((amn)localObject3).nas) + com.tencent.mm.plugin.sns.data.i.j((amn)localObject3);
          localObject3 = ((amn)localObject3).mDo;
          if (!((String)localObject1).equals(localObject3)) {
            break;
          }
          localObject1 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.dA("adId", (String)localObject3);
          if ((FileOp.aZ((String)localObject1)) || (!FileOp.aZ((String)localObject2))) {
            break;
          }
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsAdNativeLandingPagesUI", "copy outsideFiel:%s->%s", new Object[] { localObject2, localObject1 });
          FileOp.o((String)localObject2, (String)localObject1);
          break;
          ((SnsAdNativeLandingPagesUI)localObject3).qFP.fMT = ((String)((SnsAdNativeLandingPagesUI)localObject3).values.get("." + ((SnsAdNativeLandingPagesUI)localObject3).qFK + ".originSnsId"));
          ((SnsAdNativeLandingPagesUI)localObject3).qFP.qhb = ((String)((SnsAdNativeLandingPagesUI)localObject3).values.get("." + ((SnsAdNativeLandingPagesUI)localObject3).qFK + ".originUxInfo"));
          ((SnsAdNativeLandingPagesUI)localObject3).qhb = ((SnsAdNativeLandingPagesUI)localObject3).qFP.qhb;
        }
        label1393:
        if (((SnsAdNativeLandingPagesUI)localObject3).qth == null) {
          ((SnsAdNativeLandingPagesUI)localObject3).qth = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w();
        }
        ((SnsAdNativeLandingPagesUI)localObject3).qth.iconUrl = ((String)localObject4);
        int k = bg.RF((String)((Map)localObject1).get((String)localObject2 + ".adCanvasInfo.sizeType"));
        int i = bg.RF((String)((Map)localObject1).get((String)localObject2 + ".adCanvasInfo.basicRootFontSize"));
        int j = bg.RF((String)((Map)localObject1).get((String)localObject2 + ".adCanvasInfo.basicWidth"));
        if ((i == 0) && (k == 1)) {
          i = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.qui;
        }
        for (;;)
        {
          if ((j == 0) && (k == 1)) {
            j = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.quh;
          }
          for (;;)
          {
            ((SnsAdNativeLandingPagesUI)localObject3).qth.qnr = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(bg.RH((String)((Map)localObject1).get((String)localObject2 + ".adCanvasInfo.arrowDownIconStyle.paddingBottom")), k, j, i);
            ((SnsAdNativeLandingPagesUI)localObject3).qth.width = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(bg.RH((String)((Map)localObject1).get((String)localObject2 + ".adCanvasInfo.arrowDownIconStyle.layoutWidth")), k, j, i);
            ((SnsAdNativeLandingPagesUI)localObject3).qth.height = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(bg.RH((String)((Map)localObject1).get((String)localObject2 + ".adCanvasInfo.arrowDownIconStyle.layoutHeight")), k, j, i);
            break label989;
            label1701:
            if ((localObject4 instanceof l))
            {
              ((SnsAdNativeLandingPagesUI)localObject3).qFM = ((l)localObject4).qne;
              localObject1 = localObject2;
              break label1100;
            }
            if ((localObject4 instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n))
            {
              ((SnsAdNativeLandingPagesUI)localObject3).qFM = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject4).qng;
              localObject1 = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject4).qnf;
              break label1100;
            }
            localObject1 = localObject2;
            if (!(localObject4 instanceof k)) {
              break label1100;
            }
            localObject4 = (k)localObject4;
            localObject1 = localObject2;
            if (((k)localObject4).qna.isEmpty()) {
              break label1100;
            }
            localObject4 = (j)((k)localObject4).qna.getFirst();
            localObject1 = localObject2;
            if (((j)localObject4).qna.isEmpty()) {
              break label1100;
            }
            localObject4 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p)((j)localObject4).qna.getFirst();
            localObject1 = localObject2;
            if (!(localObject4 instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m)) {
              break label1100;
            }
            ((SnsAdNativeLandingPagesUI)localObject3).qFM = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m)localObject4).qne;
            localObject1 = localObject2;
            break label1100;
            label1868:
            break;
          }
        }
      }
    });
    this.cyK = getIntent().getIntExtra("sns_landig_pages_from_source", 1);
    this.qnB = getIntent().getIntExtra("sns_landig_pages_origin_from_source", 0);
    this.qFJ = getIntent().getStringExtra("sns_landing_pages_xml");
    this.qFJ = this.qFJ.replaceAll("</*RecXml[\\s|\\S]*?>", "");
    this.qFP.qhe = getIntent().getStringExtra("sns_landing_pages_expid");
    this.qFK = getIntent().getStringExtra("sns_landing_pages_xml_prefix");
    this.fMT = getIntent().getStringExtra("sns_landing_pages_share_sns_id");
    this.qhb = getIntent().getStringExtra("sns_landing_pages_ux_info");
    this.qlp = getIntent().getStringExtra("sns_landing_pages_aid");
    this.iMY = getIntent().getStringExtra("sns_landing_pages_traceid");
    paramBundle = getIntent().getStringExtra("sns_landing_pages_extra");
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g localg = this.qFP;
    if (!TextUtils.isEmpty(paramBundle)) {
      localg.extra = (localg.extra + "&extra1=" + URLEncoder.encode(paramBundle));
    }
    qFO = getIntent().getBooleanExtra("sns_landing_is_native_sight_ad", false);
    this.qlR = getIntent().getIntExtra("sns_landing_pages_rec_src", 0);
    this.qFR = getIntent().getIntExtra("sns_landing_pages_from_outer_index", 0);
    this.qFI = getIntent().getBooleanExtra("sns_landing_pages_need_enter_and_exit_animation", false);
    if (this.qFI) {
      this.qFP.quv = 0;
    }
    for (this.qFP.gCh = 0;; this.qFP.gCh = 1)
    {
      this.qFP.quw = this.cyK;
      this.qFP.qux = 0;
      this.qFP.quy = 0;
      this.qFP.quz = 1;
      this.qFP.quA = 0;
      this.qFP.qnB = this.qnB;
      if ((this.qFK == null) || ("".equals(this.qFJ))) {
        this.qFK = "adxml";
      }
      if ((!bg.mZ(this.qFJ)) && (!bg.mZ(this.qFK))) {
        break;
      }
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SnsAdNativeLandingPagesUI", "landingPagesXml is " + this.qFJ + ",landingPagesXmlPrex is " + this.qFK);
      GMTrace.o(8524838993920L, 63515);
      return;
      this.qFP.quv = 1;
    }
    this.values = f.p(this.qFJ, this.qFK);
    this.qFP.quH = bg.ap((String)this.values.get("." + this.qFK + ".adCanvasInfo.canvasId"), "");
    GMTrace.o(8524838993920L, 63515);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(8525107429376L, 63517);
    getWindow().clearFlags(128);
    if (this.jNN)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsAdNativeLandingPagesUI", "the SnsAdNativeLadingPagesUI is destroy");
      if (!this.qFQ)
      {
        bmo();
        rB();
      }
    }
    unregisterReceiver(this.qGj);
    if (this.vov.vpj == 1) {
      aKl();
    }
    super.onDestroy();
    GMTrace.o(8525107429376L, 63517);
  }
  
  protected void onPause()
  {
    GMTrace.i(8525375864832L, 63519);
    super.onPause();
    if (this.jNN) {
      this.jor += System.currentTimeMillis() - this.startTime;
    }
    android.support.v4.content.d.l(this).unregisterReceiver(this.qGe);
    android.support.v4.content.d.l(this).unregisterReceiver(this.qGf);
    GMTrace.o(8525375864832L, 63519);
  }
  
  protected void onResume()
  {
    GMTrace.i(8525241647104L, 63518);
    super.onResume();
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsAdNativeLandingPagesUI", "onResume");
    bms();
    android.support.v4.content.d.l(this).a(this.qGe, new IntentFilter("com.tencent.mm.adlanding.video_progressbar_change"));
    android.support.v4.content.d.l(this).a(this.qGf, new IntentFilter("com.tencent.mm.adlanding.set_uioption"));
    if (this.jNN) {
      this.startTime = System.currentTimeMillis();
    }
    registerReceiver(this.qGj, new IntentFilter("android.intent.action.SCREEN_ON"));
    GMTrace.o(8525241647104L, 63518);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */