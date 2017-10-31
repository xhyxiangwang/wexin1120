package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.ClipboardManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsoluteLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.bt;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.jq;
import com.tencent.mm.g.a.ju;
import com.tencent.mm.g.a.kb;
import com.tencent.mm.g.a.kc;
import com.tencent.mm.g.a.ki;
import com.tencent.mm.g.a.na;
import com.tencent.mm.g.a.os;
import com.tencent.mm.g.a.ov;
import com.tencent.mm.g.a.ow;
import com.tencent.mm.g.a.pa;
import com.tencent.mm.g.a.pb;
import com.tencent.mm.g.a.pc;
import com.tencent.mm.g.a.ph;
import com.tencent.mm.g.a.pj;
import com.tencent.mm.g.a.pt;
import com.tencent.mm.g.a.rb;
import com.tencent.mm.g.a.rl;
import com.tencent.mm.kiss.WxPresenterActivity;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.sns.a.b.i.5;
import com.tencent.mm.plugin.sns.b.h.a;
import com.tencent.mm.plugin.sns.h.a.a;
import com.tencent.mm.plugin.sns.h.b.2;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.j.b.b;
import com.tencent.mm.plugin.sns.j.c.a;
import com.tencent.mm.plugin.sns.j.c.b;
import com.tencent.mm.plugin.sns.model.al.a;
import com.tencent.mm.plugin.sns.model.as;
import com.tencent.mm.plugin.sns.model.at;
import com.tencent.mm.plugin.sns.model.au;
import com.tencent.mm.plugin.sns.model.x;
import com.tencent.mm.plugin.sns.ui.a.a.c;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.s;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.MMPullDownView.f;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.QFadeImageView;
import com.tencent.mm.ui.widget.QImageView;
import com.tencent.mm.ui.widget.QImageView.a;
import com.tencent.mm.x.ak;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class En_424b8e16
  extends WxPresenterActivity
  implements com.tencent.mm.ac.e, h.a, u, ak
{
  private static final Set<Activity> qzC;
  private ActionBar FR;
  private String jqc;
  private long khj;
  private int mScreenHeight;
  private int mScreenWidth;
  private int ogw;
  private com.tencent.mm.sdk.b.c qeJ;
  private boolean qin;
  private boolean qxS;
  private final long qyE;
  private long qyF;
  private com.tencent.mm.plugin.sns.j.b qyG;
  private com.tencent.mm.plugin.sns.j.a qyH;
  private ax qyI;
  private LinearLayout qyJ;
  private QFadeImageView qyK;
  private boolean qyL;
  private boolean qyM;
  private j qyN;
  private a qyO;
  private TestTimeForSns qyP;
  private int qyQ;
  private boolean qyR;
  private String qyS;
  private com.tencent.mm.plugin.sns.h.a qyT;
  protected com.tencent.mm.plugin.sns.a.b.g qyU;
  private au qyV;
  private as qyW;
  private String qyX;
  private boolean qyY;
  private boolean qyZ;
  private com.tencent.mm.vending.app.a.b qzA;
  boolean qzB;
  private MenuItem.OnMenuItemClickListener qzD;
  private View qzE;
  private ImageView qzF;
  private View qzG;
  private MenuItem qzH;
  private ba qzI;
  private View.OnClickListener qzJ;
  private boolean qzK;
  private int qza;
  private bb qzb;
  private Runnable qzc;
  private com.tencent.mm.sdk.b.c qzd;
  private boolean qze;
  private com.tencent.mm.sdk.b.c qzf;
  private com.tencent.mm.sdk.b.c qzg;
  private com.tencent.mm.sdk.b.c qzh;
  private com.tencent.mm.sdk.b.c qzi;
  private com.tencent.mm.sdk.b.c qzj;
  private com.tencent.mm.sdk.b.c qzk;
  private com.tencent.mm.sdk.b.c qzl;
  private com.tencent.mm.sdk.b.c qzm;
  private com.tencent.mm.sdk.b.c qzn;
  private com.tencent.mm.sdk.b.c qzo;
  private com.tencent.mm.sdk.b.c qzp;
  private com.tencent.mm.sdk.b.c qzq;
  private com.tencent.mm.sdk.b.c qzr;
  private com.tencent.mm.sdk.b.c qzs;
  private long qzt;
  boolean qzu;
  Runnable qzv;
  Runnable qzw;
  private Handler qzx;
  private Runnable qzy;
  private bb.a qzz;
  
  static
  {
    GMTrace.i(8463098839040L, 63055);
    qzC = new HashSet();
    GMTrace.o(8463098839040L, 63055);
  }
  
  public En_424b8e16()
  {
    GMTrace.i(8452495638528L, 62976);
    this.qyE = 300L;
    this.qyF = SystemClock.elapsedRealtime();
    this.qyG = ((com.tencent.mm.plugin.sns.j.b)m(com.tencent.mm.plugin.sns.j.b.class));
    if (this.qyG != null) {}
    for (com.tencent.mm.plugin.sns.j.a locala = this.qyG.boz();; locala = null)
    {
      this.qyH = locala;
      this.qyL = false;
      this.qyM = false;
      this.qxS = false;
      this.qyQ = 0;
      this.qyR = false;
      this.qyS = "";
      this.qyT = new com.tencent.mm.plugin.sns.h.a();
      this.qyU = new com.tencent.mm.plugin.sns.a.b.g(1);
      this.qyV = new au();
      this.qyW = new as();
      this.qzc = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8395184668672L, 62549);
          ax localax = En_424b8e16.a(En_424b8e16.this);
          if (localax != null)
          {
            localax.qPL.bnt();
            localax.qPL.notifyVendingDataChange();
          }
          GMTrace.o(8395184668672L, 62549);
        }
      };
      this.qzd = new com.tencent.mm.sdk.b.c() {};
      this.qze = false;
      this.qin = false;
      this.qzf = new com.tencent.mm.sdk.b.c() {};
      this.qzg = new com.tencent.mm.sdk.b.c() {};
      this.qzh = new com.tencent.mm.sdk.b.c() {};
      this.qzi = new com.tencent.mm.sdk.b.c() {};
      this.qzj = new com.tencent.mm.sdk.b.c() {};
      this.qzk = new com.tencent.mm.sdk.b.c() {};
      this.qzl = new com.tencent.mm.sdk.b.c() {};
      this.qzm = new com.tencent.mm.sdk.b.c() {};
      this.qzn = new com.tencent.mm.sdk.b.c() {};
      this.qeJ = new com.tencent.mm.sdk.b.c() {};
      this.qzo = new com.tencent.mm.sdk.b.c() {};
      this.qzp = new com.tencent.mm.sdk.b.c() {};
      this.qzq = new com.tencent.mm.sdk.b.c() {};
      this.qzr = new com.tencent.mm.sdk.b.c() {};
      this.qzs = new com.tencent.mm.sdk.b.c() {};
      this.qzt = 0L;
      this.qzu = false;
      this.ogw = 0;
      this.qzv = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8466722717696L, 63082);
          if (En_424b8e16.a(En_424b8e16.this) == null)
          {
            GMTrace.o(8466722717696L, 63082);
            return;
          }
          if (En_424b8e16.m(En_424b8e16.this)) {
            com.tencent.mm.plugin.sns.model.ae.bhm().pause();
          }
          GMTrace.o(8466722717696L, 63082);
        }
      };
      this.qzw = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8326062538752L, 62034);
          if (En_424b8e16.a(En_424b8e16.this) == null)
          {
            GMTrace.o(8326062538752L, 62034);
            return;
          }
          if (!En_424b8e16.m(En_424b8e16.this))
          {
            w.v("MicroMsg.SnsTimeLineUI", "zeustest update onFling notify resume %s", new Object[] { Integer.valueOf(En_424b8e16.h(En_424b8e16.this).nep.getFirstVisiblePosition() - En_424b8e16.h(En_424b8e16.this).nep.getHeaderViewsCount()) });
            com.tencent.mm.plugin.sns.model.ae.bhm().start();
            En_424b8e16.a(En_424b8e16.this).qPK.bnH();
          }
          GMTrace.o(8326062538752L, 62034);
        }
      };
      this.qzx = ((com.tencent.mm.vending.h.b)com.tencent.mm.vending.h.d.xbz.xbF).mHandler;
      this.qzy = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8392634531840L, 62530);
          En_424b8e16.this.bUD();
          En_424b8e16.n(En_424b8e16.this);
          En_424b8e16.this.rV(En_424b8e16.this.getString(i.j.pTZ));
          En_424b8e16.o(En_424b8e16.this);
          En_424b8e16.b(En_424b8e16.this, En_424b8e16.h(En_424b8e16.this).nep.getFirstVisiblePosition());
          GMTrace.o(8392634531840L, 62530);
        }
      };
      this.qzz = new bb.a()
      {
        private int qzP;
        private int qzQ;
        
        public final void H(int paramAnonymousInt, boolean paramAnonymousBoolean)
        {
          GMTrace.i(8432899850240L, 62830);
          if (En_424b8e16.a(En_424b8e16.this) != null) {
            En_424b8e16.a(En_424b8e16.this).qPL.notifyVendingDataChange();
          }
          if (!paramAnonymousBoolean) {
            En_424b8e16.this.xJ().C(c.b.class);
          }
          GMTrace.o(8432899850240L, 62830);
        }
        
        public final void a(int paramAnonymousInt, List<Integer> paramAnonymousList1, List<Integer> paramAnonymousList2)
        {
          int j = 1;
          GMTrace.i(8432228761600L, 62825);
          int i = j;
          if (paramAnonymousInt > 0)
          {
            paramAnonymousList1 = com.tencent.mm.plugin.sns.model.ae.bhp().uI(paramAnonymousInt);
            i = j;
            if (paramAnonymousList1 != null)
            {
              if (paramAnonymousList1.field_pravited > 0) {
                Toast.makeText(En_424b8e16.this, i.j.pSz, 1).show();
              }
              i = j;
              if (paramAnonymousList1.field_pravited == 1) {
                i = 0;
              }
            }
          }
          if (i != 0) {
            BackwardSupportUtil.c.a(En_424b8e16.h(En_424b8e16.this).nep);
          }
          if (En_424b8e16.a(En_424b8e16.this) != null) {
            En_424b8e16.a(En_424b8e16.this).qPL.notifyVendingDataChange();
          }
          GMTrace.o(8432228761600L, 62825);
        }
        
        public final void blk()
        {
          GMTrace.i(8431691890688L, 62821);
          En_424b8e16.k(En_424b8e16.this).qXw.b(En_424b8e16.p(En_424b8e16.this), En_424b8e16.i(En_424b8e16.this), false, En_424b8e16.q(En_424b8e16.this));
          w.d("MicroMsg.SnsTimeLineUI", "onLoadingMore here");
          if (En_424b8e16.r(En_424b8e16.this) == null)
          {
            w.e("MicroMsg.SnsTimeLineUI", "mLogicHandler handler null");
            GMTrace.o(8431691890688L, 62821);
            return;
          }
          if (En_424b8e16.g(En_424b8e16.this) != null)
          {
            En_424b8e16.r(En_424b8e16.this).removeCallbacks(En_424b8e16.s(En_424b8e16.this));
            En_424b8e16.r(En_424b8e16.this).postDelayed(En_424b8e16.s(En_424b8e16.this), 3000L);
          }
          GMTrace.o(8431691890688L, 62821);
        }
        
        public final ListView bll()
        {
          GMTrace.i(8431826108416L, 62822);
          if (En_424b8e16.g(En_424b8e16.this).nep == null) {
            En_424b8e16.g(En_424b8e16.this).nep = ((ListView)En_424b8e16.this.findViewById(i.f.pMO));
          }
          ListView localListView = En_424b8e16.g(En_424b8e16.this).nep;
          GMTrace.o(8431826108416L, 62822);
          return localListView;
        }
        
        public final MMPullDownView blm()
        {
          GMTrace.i(8431960326144L, 62823);
          MMPullDownView localMMPullDownView = (MMPullDownView)En_424b8e16.this.findViewById(i.f.pMV);
          GMTrace.o(8431960326144L, 62823);
          return localMMPullDownView;
        }
        
        public final boolean bln()
        {
          GMTrace.i(8432362979328L, 62826);
          boolean bool = En_424b8e16.t(En_424b8e16.this);
          GMTrace.o(8432362979328L, 62826);
          return bool;
        }
        
        public final void blo()
        {
          GMTrace.i(8432497197056L, 62827);
          En_424b8e16.this.blj();
          if (En_424b8e16.l(En_424b8e16.this) != null)
          {
            w.d("MicroMsg.SnsTimeLineUI", "refreshIv onLoadingTap");
            En_424b8e16.l(En_424b8e16.this).setVisibility(0);
          }
          En_424b8e16.k(En_424b8e16.this).qXv.b(En_424b8e16.p(En_424b8e16.this), En_424b8e16.i(En_424b8e16.this), En_424b8e16.j(En_424b8e16.this), En_424b8e16.q(En_424b8e16.this));
          GMTrace.o(8432497197056L, 62827);
        }
        
        public final void blp()
        {
          GMTrace.i(8432631414784L, 62828);
          En_424b8e16.this.blj();
          GMTrace.o(8432631414784L, 62828);
        }
        
        public final void blq()
        {
          GMTrace.i(8432765632512L, 62829);
          int i = En_424b8e16.h(En_424b8e16.this).nep.getFirstVisiblePosition();
          int j = En_424b8e16.h(En_424b8e16.this).nep.getLastVisiblePosition();
          if ((i == this.qzP) && (j == this.qzQ))
          {
            GMTrace.o(8432765632512L, 62829);
            return;
          }
          this.qzP = i;
          this.qzQ = j;
          w.i("MicroMsg.SnsTimeLineUI", "onListViewScoll %s %s ", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          com.tencent.mm.plugin.sns.h.a locala1 = En_424b8e16.f(En_424b8e16.this);
          av localav = En_424b8e16.a(En_424b8e16.this).qPK;
          i = com.tencent.mm.modelsns.c.hNP;
          final a.a locala;
          if (i == 2) {
            locala = null;
          }
          for (;;)
          {
            com.tencent.mm.vending.g.g.chn().b(new com.tencent.mm.vending.c.a() {});
            GMTrace.o(8432765632512L, 62829);
            return;
            if ((i == 4) && (!locala1.qin))
            {
              locala = null;
            }
            else
            {
              long l = System.nanoTime();
              locala = new a.a();
              locala.qio = System.currentTimeMillis();
              locala.mScreenHeight = locala1.mScreenHeight;
              locala.mScreenWidth = locala1.mScreenWidth;
              int k = locala1.qim.getTop();
              j = locala1.qim.getHeight();
              i = j;
              if (k < 0) {
                i = j + k;
              }
              locala.qiq = i;
              j = locala1.inK.getFirstVisiblePosition() - 1;
              int m = locala1.inK.getLastVisiblePosition() - 1;
              locala.qip = j;
              locala.mrK = m;
              int n = localav.getCount();
              boolean bool = false;
              if (locala1.inK.getChildAt(0) != null) {
                bool = locala1.inK.getChildAt(0) instanceof SnsHeader;
              }
              w.v("MicroMsg.CaptureSnsHelper", "first last %s %s isHeaderExist %s", new Object[] { Integer.valueOf(j), Integer.valueOf(m), Boolean.valueOf(bool) });
              if (bool)
              {
                i = 1;
                int i1 = locala1.inK.getChildCount();
                label381:
                if (j > m) {
                  break label885;
                }
                k = i;
                if (j < n)
                {
                  k = i;
                  if (j >= 0)
                  {
                    if (i < i1) {
                      break label451;
                    }
                    w.e("MicroMsg.CaptureSnsHelper", "childPos biger than childCount %d %d", new Object[] { Integer.valueOf(i), Integer.valueOf(i1) });
                    k = i;
                  }
                }
              }
              for (;;)
              {
                j += 1;
                i = k;
                break label381;
                i = 0;
                break;
                label451:
                if (locala.qir == null) {
                  locala.qir = new LinkedList();
                }
                com.tencent.mm.plugin.sns.h.a.b localb = new com.tencent.mm.plugin.sns.h.a.b();
                locala.qir.add(localb);
                Object localObject = locala1.inK.getChildAt(i);
                k = i + 1;
                int i2;
                int i3;
                int i4;
                if (localObject != null)
                {
                  i = ((View)localObject).getTop();
                  i2 = ((View)localObject).getLeft();
                  i3 = ((View)localObject).getHeight();
                  i4 = ((View)localObject).getWidth();
                  com.tencent.mm.plugin.sns.storage.m localm = localav.uN(j);
                  localb.qiw = com.tencent.mm.plugin.sns.data.i.g(localm);
                  localb.qiu = localm.field_type;
                  localb.qiv = localm.uF(32);
                  localb.qis = i;
                  localb.qit = i2;
                  localb.jIY = i3;
                  localb.jIX = i4;
                }
                if ((localObject != null) && (((View)localObject).getTag() != null) && ((((View)localObject).getTag() instanceof a.c)))
                {
                  localObject = (a.c)((View)localObject).getTag();
                  if ((((a.c)localObject).qUh) && (((a.c)localObject).qwY != null))
                  {
                    i = ((a.c)localObject).qwY.getTop();
                    i2 = ((a.c)localObject).qwY.getLeft();
                    i3 = ((a.c)localObject).qTZ.getHeight();
                    i4 = ((a.c)localObject).qTZ.getWidth();
                    int i5 = ((a.c)localObject).qUa.getTop();
                    int i6 = ((a.c)localObject).qUa.getLeft();
                    int i7 = ((a.c)localObject).qUa.getHeight();
                    int i8 = ((a.c)localObject).qUa.getWidth();
                    w.v("MicroMsg.CaptureSnsHelper", "holder position %s %s index %s", new Object[] { Integer.valueOf(((a.c)localObject).position), Integer.valueOf(j), Integer.valueOf(k) });
                    if (((a.c)localObject).pVG.uvg != 0)
                    {
                      localb.qiy = ((a.c)localObject).pVG.uvg;
                      localb.qiz = i;
                      localb.qiA = i2;
                      localb.qiB = i4;
                      localb.qiC = i3;
                    }
                    if (((a.c)localObject).pVG.uvj != 0)
                    {
                      localb.qix = ((a.c)localObject).pVG.uvj;
                      localb.qiE = (i6 + i2);
                      localb.qiD = (i5 + i);
                      localb.qiF = i8;
                      localb.qiG = i7;
                    }
                  }
                }
              }
              label885:
              w.i("MicroMsg.CaptureSnsHelper", "end cap: " + (System.nanoTime() - l));
            }
          }
        }
        
        public final int getType()
        {
          GMTrace.i(8432094543872L, 62824);
          GMTrace.o(8432094543872L, 62824);
          return 1;
        }
        
        public final void hV(boolean paramAnonymousBoolean)
        {
          GMTrace.i(8433034067968L, 62831);
          En_424b8e16 localEn_424b8e16 = En_424b8e16.this;
          localEn_424b8e16.qzu = paramAnonymousBoolean;
          com.tencent.mm.sdk.platformtools.ae localae = com.tencent.mm.plugin.sns.model.ae.aCa();
          com.tencent.mm.plugin.sns.model.g localg = com.tencent.mm.plugin.sns.model.ae.bhm();
          com.tencent.mm.plugin.sns.model.b localb = com.tencent.mm.plugin.sns.model.ae.bhk();
          if (paramAnonymousBoolean)
          {
            if ((localg.pZX) || (localb.pZX))
            {
              localae.removeCallbacks(localEn_424b8e16.qzv);
              localae.removeCallbacks(localEn_424b8e16.qzw);
              localae.postDelayed(localEn_424b8e16.qzv, 0L);
              GMTrace.o(8433034067968L, 62831);
            }
          }
          else if ((!localg.pZX) || (!localb.pZX))
          {
            localae.removeCallbacks(localEn_424b8e16.qzv);
            localae.removeCallbacks(localEn_424b8e16.qzw);
            localae.postDelayed(localEn_424b8e16.qzw, 0L);
          }
          GMTrace.o(8433034067968L, 62831);
        }
      };
      this.qzA = new com.tencent.mm.vending.app.a.b() {};
      this.mScreenWidth = 0;
      this.mScreenHeight = 0;
      this.qzB = true;
      this.khj = 0L;
      this.qzD = new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(8591947857920L, 64015);
          En_424b8e16.this.aKl();
          En_424b8e16.this.finish();
          GMTrace.o(8591947857920L, 64015);
          return false;
        }
      };
      this.qzI = null;
      this.qzJ = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(17838341357568L, 132906);
          if (SystemClock.elapsedRealtime() - En_424b8e16.G(En_424b8e16.this) < 300L) {
            En_424b8e16.D(En_424b8e16.this);
          }
          En_424b8e16.a(En_424b8e16.this, SystemClock.elapsedRealtime());
          com.tencent.mm.plugin.sns.model.ae.aCa().removeCallbacks(En_424b8e16.H(En_424b8e16.this));
          En_424b8e16.H(En_424b8e16.this).run();
          GMTrace.o(17838341357568L, 132906);
        }
      };
      this.qzK = false;
      GMTrace.o(8452495638528L, 62976);
      return;
    }
  }
  
  private void ble()
  {
    GMTrace.i(8454508904448L, 62991);
    Y(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8753009131520L, 65215);
        En_424b8e16.D(En_424b8e16.this);
        GMTrace.o(8753009131520L, 65215);
      }
    });
    GMTrace.o(8454508904448L, 62991);
  }
  
  private void blg()
  {
    GMTrace.i(8454777339904L, 62993);
    ble();
    a(this.qzD, i.e.aVv);
    GMTrace.o(8454777339904L, 62993);
  }
  
  private void blh()
  {
    GMTrace.i(8455045775360L, 62995);
    if (this.qzG != null) {
      this.qzG.setVisibility(8);
    }
    GMTrace.o(8455045775360L, 62995);
  }
  
  private void bli()
  {
    GMTrace.i(8455314210816L, 62997);
    if (com.tencent.mm.p.a.aO(this))
    {
      GMTrace.o(8455314210816L, 62997);
      return;
    }
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.CAMERA", 18, "", "");
    w.i("MicroMsg.SnsTimeLineUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bOd(), this });
    if (!bool)
    {
      GMTrace.o(8455314210816L, 62997);
      return;
    }
    bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.RECORD_AUDIO", 18, "", "");
    w.i("MicroMsg.SnsTimeLineUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bOd(), this });
    if (!bool)
    {
      GMTrace.o(8455314210816L, 62997);
      return;
    }
    com.tencent.mm.plugin.report.service.g.paX.i(13822, new Object[] { Integer.valueOf(1), Integer.valueOf(2) });
    Intent localIntent = new Intent();
    com.tencent.mm.pluginsdk.ui.tools.k.x(this.vov.voR, localIntent);
    GMTrace.o(8455314210816L, 62997);
  }
  
  public final void AF()
  {
    GMTrace.i(8455716864000L, 63000);
    xJ().C(c.b.class);
    GMTrace.o(8455716864000L, 63000);
  }
  
  public final void AG()
  {
    GMTrace.i(8455851081728L, 63001);
    GMTrace.o(8455851081728L, 63001);
  }
  
  public final void AH()
  {
    GMTrace.i(8455985299456L, 63002);
    if (this.qzK)
    {
      GMTrace.o(8455985299456L, 63002);
      return;
    }
    w.v("MicroMsg.SnsTimeLineUI", "notifyHbReward imp");
    this.qzK = true;
    com.tencent.mm.plugin.sns.model.ae.aCa().postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8368609558528L, 62351);
        if (En_424b8e16.a(En_424b8e16.this) != null) {
          En_424b8e16.a(En_424b8e16.this).qPL.notifyVendingDataChange();
        }
        En_424b8e16.I(En_424b8e16.this);
        GMTrace.o(8368609558528L, 62351);
      }
    }, 1000L);
    GMTrace.o(8455985299456L, 63002);
  }
  
  public final void AI()
  {
    GMTrace.i(8456387952640L, 63005);
    xJ().C(c.b.class);
    GMTrace.o(8456387952640L, 63005);
  }
  
  protected final void MH()
  {
    GMTrace.i(8454240468992L, 62989);
    this.qzb.qim.setDrawingCacheEnabled(false);
    this.qyN.qgE = ((FrameLayout)findViewById(i.f.pNv));
    oC(i.j.pTZ);
    int i = com.tencent.mm.plugin.sns.model.ae.bhv().position;
    Object localObject = (AdListView)this.qzb.bll();
    ((AdListView)localObject).qwp = this.qyU;
    ((AdListView)localObject).qwq = this.qyV;
    ((AdListView)localObject).qwr = this.qyW;
    this.qyW.a(com.tencent.mm.plugin.sns.model.ae.bhg());
    w.i("MicroMsg.SnsTimeLineUI", "oncreate firstPosition %d isToResume: " + this.qxS, new Object[] { Integer.valueOf(i) });
    this.qyK = ((QFadeImageView)findViewById(i.f.pMW));
    this.qyK.setImageResource(i.i.pQp);
    this.qyO = new a(this.qzb.bll());
    this.qyO.setInterpolator(new LinearInterpolator());
    this.qyO.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8374380920832L, 62394);
        w.i("MicroMsg.SnsTimeLineUI", "refreshAnim end");
        GMTrace.o(8374380920832L, 62394);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8374246703104L, 62393);
        w.i("MicroMsg.SnsTimeLineUI", "refreshAnim repeat");
        GMTrace.o(8374246703104L, 62393);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8374112485376L, 62392);
        w.i("MicroMsg.SnsTimeLineUI", "refreshAnim start");
        GMTrace.o(8374112485376L, 62392);
      }
    });
    this.qyI = new ax(this, this.qzb.bll(), this.qyN.qxX, this.qyN, this.qyX);
    this.qyN.qxX.qVI = new av.a()
    {
      public final boolean blr()
      {
        GMTrace.i(8589397721088L, 63996);
        En_424b8e16.this.xJ().C(c.b.class);
        GMTrace.o(8589397721088L, 63996);
        return false;
      }
    };
    this.qyN.qhj = this.qyI.qPK;
    this.qyI.qPL.wZy = new com.tencent.mm.vending.a.b.a()
    {
      public final void bls()
      {
        GMTrace.i(8742137495552L, 65134);
        com.tencent.mm.plugin.report.service.f.ta(14);
        GMTrace.o(8742137495552L, 65134);
      }
      
      public final void blt()
      {
        GMTrace.i(8742271713280L, 65135);
        com.tencent.mm.plugin.report.service.f.tb(14);
        GMTrace.o(8742271713280L, 65135);
      }
    };
    this.qyP = ((TestTimeForSns)this.qyN.qgE);
    this.qyP.setListener(new TestTimeForSns.a()
    {
      public final void aCr()
      {
        GMTrace.i(8394916233216L, 62547);
        w.i("MicroMsg.SnsTimeLineUI", "sns has drawed");
        En_424b8e16.v(En_424b8e16.this).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8448871759872L, 62949);
            if ((En_424b8e16.a(En_424b8e16.this) == null) || (En_424b8e16.v(En_424b8e16.this) == null))
            {
              w.i("MicroMsg.SnsTimeLineUI", "onViewDrawed is error");
              GMTrace.o(8448871759872L, 62949);
              return;
            }
            En_424b8e16.v(En_424b8e16.this).setListener(null);
            En_424b8e16.a(En_424b8e16.this, En_424b8e16.z(En_424b8e16.this));
            if (En_424b8e16.A(En_424b8e16.this))
            {
              w.w("MicroMsg.SnsTimeLineUI", "too fast that it finish");
              GMTrace.o(8448871759872L, 62949);
              return;
            }
            if (En_424b8e16.t(En_424b8e16.this)) {
              com.tencent.mm.plugin.sns.model.ae.bhf().w(com.tencent.mm.plugin.sns.model.ae.bhv().qey, -1);
            }
            if (!En_424b8e16.t(En_424b8e16.this)) {
              En_424b8e16.k(En_424b8e16.this).qXv.b(En_424b8e16.p(En_424b8e16.this), En_424b8e16.i(En_424b8e16.this), En_424b8e16.j(En_424b8e16.this), En_424b8e16.q(En_424b8e16.this));
            }
            En_424b8e16.a(En_424b8e16.this, false);
            GMTrace.o(8448871759872L, 62949);
          }
        });
        GMTrace.o(8394916233216L, 62547);
      }
    });
    this.qzb.nep.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(8704824967168L, 64856);
        if (paramAnonymousMotionEvent.getAction() == 1)
        {
          En_424b8e16.this.blj();
          if ((En_424b8e16.h(En_424b8e16.this).nep != null) && (En_424b8e16.h(En_424b8e16.this).nep.getFirstVisiblePosition() == 0))
          {
            w.d("MicroMsg.SnsTimeLineUI", "refreshIv onTouch set refreshIv visible");
            En_424b8e16.l(En_424b8e16.this).setVisibility(0);
          }
          En_424b8e16.y(En_424b8e16.this).blw();
        }
        if (paramAnonymousMotionEvent.getAction() == 0)
        {
          if ((En_424b8e16.h(En_424b8e16.this).nep != null) && (En_424b8e16.h(En_424b8e16.this).nep.getFirstVisiblePosition() == 0)) {
            En_424b8e16.l(En_424b8e16.this).setVisibility(0);
          }
          En_424b8e16.g(En_424b8e16.this).bkV();
          En_424b8e16.g(En_424b8e16.this).qxO.boa();
        }
        if (En_424b8e16.this.qyU != null) {
          En_424b8e16.this.qyU.bfS();
        }
        GMTrace.o(8704824967168L, 64856);
        return false;
      }
    });
    this.qzb.nep.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8720260005888L, 64971);
        if (En_424b8e16.g(En_424b8e16.this) == null)
        {
          GMTrace.o(8720260005888L, 64971);
          return;
        }
        En_424b8e16.g(En_424b8e16.this).qxO.qHs = En_424b8e16.h(En_424b8e16.this).nep.getBottom();
        En_424b8e16.g(En_424b8e16.this).qxO.qSO = En_424b8e16.h(En_424b8e16.this).nHi.getTop();
        En_424b8e16.y(En_424b8e16.this).qAd = En_424b8e16.h(En_424b8e16.this).qim.getTop();
        GMTrace.o(8720260005888L, 64971);
      }
    });
    this.qzb.nHi.vIa = new MMPullDownView.f()
    {
      public final void aq(float paramAnonymousFloat)
      {
        GMTrace.i(8506316947456L, 63377);
        En_424b8e16.B(En_424b8e16.this);
        En_424b8e16.a locala;
        float f1;
        if ((En_424b8e16.h(En_424b8e16.this).qim.getTop() >= En_424b8e16.y(En_424b8e16.this).qAd) || (paramAnonymousFloat > 0.0F))
        {
          locala = En_424b8e16.y(En_424b8e16.this);
          if (locala.nep != null)
          {
            if (locala.nep.getFirstVisiblePosition() != 0) {
              break label336;
            }
            En_424b8e16.l(locala.qzL).setVisibility(0);
          }
          if (En_424b8e16.l(locala.qzL).getVisibility() == 0)
          {
            En_424b8e16.l(locala.qzL).clearAnimation();
            locala.init();
            locala.qAa -= paramAnonymousFloat / 2.0F;
            float f2 = locala.qAa;
            f1 = f2;
            if (f2 < locala.qzZ)
            {
              f1 = locala.qzZ;
              locala.qAa = locala.qzZ;
            }
            if (f1 <= locala.qzY) {
              break label360;
            }
            f1 = locala.qzY;
          }
        }
        label336:
        label360:
        for (;;)
        {
          if (f1 == locala.qzY) {}
          for (paramAnonymousFloat *= 2.0F;; paramAnonymousFloat = 5.0F * paramAnonymousFloat)
          {
            En_424b8e16.l(locala.qzL).a(QImageView.a.wVn);
            En_424b8e16.l(locala.qzL).mMatrix.postRotate(paramAnonymousFloat, locala.qzW, locala.qzX);
            En_424b8e16.l(locala.qzL).setImageResource(i.i.pQp);
            AbsoluteLayout.LayoutParams localLayoutParams = (AbsoluteLayout.LayoutParams)En_424b8e16.l(locala.qzL).getLayoutParams();
            localLayoutParams.y = ((int)f1);
            En_424b8e16.l(locala.qzL).setLayoutParams(localLayoutParams);
            En_424b8e16.l(locala.qzL).invalidate();
            En_424b8e16.g(En_424b8e16.this).bkV();
            En_424b8e16.this.blj();
            En_424b8e16.g(En_424b8e16.this).qxO.boa();
            GMTrace.o(8506316947456L, 63377);
            return;
            En_424b8e16.l(locala.qzL).setVisibility(8);
            break;
          }
        }
      }
      
      public final void blu()
      {
        GMTrace.i(8506451165184L, 63378);
        En_424b8e16.y(En_424b8e16.this).blw();
        GMTrace.o(8506451165184L, 63378);
      }
    };
    this.qyN.qxN = ((SnsCommentFooter)findViewById(i.f.pJn));
    this.qyN.qxN.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8564701659136L, 63812);
        com.tencent.mm.compatible.util.j.g(En_424b8e16.this);
        GMTrace.o(8564701659136L, 63812);
      }
    });
    this.qyN.qxO = new bi(this.qzb.nep, this.qyN.qxN);
    this.qyJ = ((LinearLayout)this.qzb.qim.findViewById(i.f.pMK));
    this.qyJ.findViewById(i.f.pMI).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8368877993984L, 62353);
        if ((En_424b8e16.g(En_424b8e16.this) != null) && (En_424b8e16.g(En_424b8e16.this).qxL != null)) {
          En_424b8e16.g(En_424b8e16.this).qxL.qek.hF(true);
        }
        paramAnonymousView = (c.b)En_424b8e16.this.xJ().B(c.b.class);
        com.tencent.mm.modelsns.b localb = com.tencent.mm.modelsns.b.gM(725);
        localb.gP(paramAnonymousView.qXz);
        localb.LJ();
        paramAnonymousView = new Intent();
        paramAnonymousView.setClass(En_424b8e16.this, SnsMsgUI.class);
        En_424b8e16.this.startActivityForResult(paramAnonymousView, 13);
        GMTrace.o(8368877993984L, 62353);
      }
    });
    localObject = this.qzb.qim;
    View.OnClickListener local32 = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8491821432832L, 63269);
        paramAnonymousView = new Intent();
        paramAnonymousView.setClass(En_424b8e16.this, SnsUserUI.class);
        paramAnonymousView = com.tencent.mm.plugin.sns.model.ae.bhf().f(paramAnonymousView, En_424b8e16.C(En_424b8e16.this));
        if (paramAnonymousView == null)
        {
          En_424b8e16.this.finish();
          GMTrace.o(8491821432832L, 63269);
          return;
        }
        com.tencent.mm.kernel.h.xA();
        int i = bg.a((Integer)com.tencent.mm.kernel.h.xz().xi().get(68388, null), 0);
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xz().xi().set(68388, Integer.valueOf(i + 1));
        En_424b8e16.this.startActivity(paramAnonymousView);
        if ((paramAnonymousView.getFlags() & 0x4000000) != 0) {
          En_424b8e16.this.finish();
        }
        GMTrace.o(8491821432832L, 63269);
      }
    };
    if ((((SnsHeader)localObject).qJm != null) && (((SnsHeader)localObject).qJm.iil != null)) {
      ((SnsHeader)localObject).qJm.iil.setOnClickListener(local32);
    }
    this.qyN.qxP = new ao(this);
    blg();
    GMTrace.o(8454240468992L, 62989);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(8456119517184L, 63003);
    w.i("MicroMsg.SnsTimeLineUI", "uionSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " type = " + paramk.getType());
    if (paramk.getType() == 218)
    {
      paramString = (com.tencent.mm.plugin.sns.model.q)paramk;
      if (((paramString.type == 1) || (paramString.type == 6) || (paramString.type == 4)) && (this.qyN.qxY != null)) {
        this.qyN.qxY.dismiss();
      }
      if (paramString.type == 11)
      {
        if (this.qzb.ikZ != null) {
          this.qzb.ikZ.dismiss();
        }
        if (this.qzF != null) {
          this.qzF.setImageResource(i.i.dmP);
        }
      }
    }
    if (this.qyI != null) {
      this.qyI.qPL.notifyVendingDataChange();
    }
    if (paramk.getType() == 211)
    {
      paramString = (x)paramk;
      if (!paramString.qbg) {
        break label387;
      }
      paramk = com.tencent.mm.modelsns.b.gM(727);
      paramk.gP(this.qyI.getCount()).gP(paramString.Oh);
      paramk.LJ();
    }
    for (;;)
    {
      if (this.qyO != null)
      {
        this.qyM = false;
        paramString = this.qyO;
        w.i("MicroMsg.SnsTimeLineUI", "play end vis: %d, sumY %f MAX_Y %f", new Object[] { Integer.valueOf(paramString.qzL.qyK.getVisibility()), Float.valueOf(paramString.qAa), Float.valueOf(paramString.qzY) });
        if (paramString.qzL.qyK.getVisibility() == 0)
        {
          paramString.init();
          if (paramString.qAa >= paramString.qzY)
          {
            paramString.qzL.qyK.clearAnimation();
            paramString.qzL.qyK.startAnimation(paramString);
            paramString.setDuration(1200L);
            paramString.qAc = false;
          }
        }
      }
      GMTrace.o(8456119517184L, 63003);
      return;
      label387:
      paramk = com.tencent.mm.modelsns.b.gM(728);
      paramk.gP(this.qyI.getCount()).gP(paramString.Oh).gP(0);
      paramk.LJ();
    }
  }
  
  public final void a(final boolean paramBoolean1, final String paramString, boolean paramBoolean2, boolean paramBoolean3, int paramInt, long paramLong)
  {
    GMTrace.i(8452764073984L, 62978);
    this.qzx.removeCallbacks(this.qzc);
    com.tencent.mm.vending.g.g.chn().b(new com.tencent.mm.vending.c.a() {}).d(new com.tencent.mm.vending.c.a() {});
    GMTrace.o(8452764073984L, 62978);
  }
  
  public final void a(final boolean paramBoolean1, final boolean paramBoolean2, final String paramString, boolean paramBoolean3, boolean paramBoolean4, int paramInt, long paramLong)
  {
    GMTrace.i(8452629856256L, 62977);
    this.qzx.removeCallbacks(this.qzc);
    com.tencent.mm.vending.g.g.chn().b(new com.tencent.mm.vending.c.a() {}).d(new com.tencent.mm.vending.c.a() {});
    GMTrace.o(8452629856256L, 62977);
  }
  
  public final void anR()
  {
    GMTrace.i(8454374686720L, 62990);
    super.anR();
    com.tencent.mm.sdk.platformtools.af.u(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8546984919040L, 63680);
        En_424b8e16.this.blj();
        GMTrace.o(8546984919040L, 63680);
      }
    });
    if (this.vov.vpj == 2)
    {
      if ((this.qyN != null) && (this.qyN.qxN != null) && (!this.qyN.qxN.bmP()))
      {
        w.i("MicroMsg.SnsTimeLineUI", "onKeyBoardStateChange find");
        GMTrace.o(8454374686720L, 62990);
      }
    }
    else if ((this.vov.vpj == 1) && (this.qyN != null))
    {
      j localj = this.qyN;
      if (localj.qxM)
      {
        localj.qxM = false;
        localj.qxO.bnZ();
      }
    }
    GMTrace.o(8454374686720L, 62990);
  }
  
  public final boolean blf()
  {
    GMTrace.i(8454643122176L, 62992);
    boolean bool = super.blf();
    GMTrace.o(8454643122176L, 62992);
    return bool;
  }
  
  public final boolean blj()
  {
    GMTrace.i(8455582646272L, 62999);
    if ((this.qyN == null) || (this.qyN.qxU == null))
    {
      GMTrace.o(8455582646272L, 62999);
      return false;
    }
    if ((this.qyN == null) || (this.qyN.qxV == null)) {}
    for (;;)
    {
      com.tencent.mm.plugin.sns.abtest.a.bfJ();
      boolean bool = this.qyN.qxU.blj();
      GMTrace.o(8455582646272L, 62999);
      return bool;
      this.qyN.qxV.bif();
    }
  }
  
  public final boolean cB(View paramView)
  {
    GMTrace.i(8455448428544L, 62998);
    this.qyN.qxV.bif();
    bh localbh = this.qyN.qxU;
    if (!(paramView.getTag() instanceof a.c))
    {
      w.e("MicroMsg.TimeLineCommentHelper", "showCommentBtn err2");
      GMTrace.o(8455448428544L, 62998);
      return false;
    }
    a.c localc = (a.c)paramView.getTag();
    Object localObject1 = localc.fxL;
    if (localbh.qSJ != null)
    {
      if ((localbh.qSJ.getTag() instanceof bh.a))
      {
        localObject2 = (bh.a)localbh.qSJ.getTag();
        if (((bh.a)localObject2).qgY.equals(localObject1))
        {
          localbh.cD(((bh.a)localObject2).pVI);
          GMTrace.o(8455448428544L, 62998);
          return true;
        }
        localbh.blj();
      }
      localbh.qSJ = null;
    }
    localbh.qSJ = new SnsCommentShowAbLayout(localbh.mContext);
    com.tencent.mm.sdk.platformtools.k.bC(localbh.qSJ);
    localbh.qSJ.setId(i.f.cMc);
    new FrameLayout.LayoutParams(-1, -1);
    localbh.qgE.addView(localbh.qSJ);
    int i = BackwardSupportUtil.b.a(localbh.mContext, 192.0F);
    int j = BackwardSupportUtil.b.a(localbh.mContext, 76.0F);
    BackwardSupportUtil.b.a(localbh.mContext, 20.0F);
    int k = BackwardSupportUtil.b.a(localbh.mContext, 12.0F);
    int m = BackwardSupportUtil.b.a(localbh.mContext, 40.0F);
    Object localObject2 = v.fa(localbh.mContext).inflate(i.g.pOH, null);
    new Rect();
    Object localObject3 = new int[2];
    int n = com.tencent.mm.pluginsdk.e.dG(localbh.mContext);
    paramView.getLocationInWindow((int[])localObject3);
    localbh.pWC = com.tencent.mm.pluginsdk.e.dH(localbh.mContext);
    w.d("MicroMsg.TimeLineCommentHelper", "addCommentView getLocationInWindow " + localObject3[0] + "  " + localObject3[1] + " height: " + n + " height_hardcode:" + j + " statusBarHeight: " + localbh.pWC);
    localObject3 = new AbsoluteLayout.LayoutParams(-2, -2, localObject3[0] - i + k, localObject3[1] - localbh.pWC - n - (m / 2 - paramView.getMeasuredHeight() / 2));
    localObject1 = new bh.a(localbh, (String)localObject1, (View)localObject2);
    localbh.qSJ.setTag(localObject1);
    localbh.qSJ.addView((View)localObject2, (ViewGroup.LayoutParams)localObject3);
    if (localc.kxh == 11) {
      ((View)localObject2).findViewById(i.f.pIl).setBackgroundResource(i.e.pGP);
    }
    ((View)localObject2).setVisibility(8);
    new com.tencent.mm.sdk.platformtools.ae().post(new bh.1(localbh, paramView, (View)localObject2));
    GMTrace.o(8455448428544L, 62998);
    return true;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    int j = 0;
    GMTrace.i(8452898291712L, 62979);
    w.i("MicroMsg.SnsTimeLineUI", "dispatchKeyEvent %s", new Object[] { paramKeyEvent.toString() });
    int k = this.vov.vpj;
    j localj = this.qyN;
    int i = j;
    if (paramKeyEvent.getKeyCode() == 4)
    {
      i = j;
      if (localj.qxN.getVisibility() == 0)
      {
        localj.qxN.setVisibility(8);
        i = 1;
      }
    }
    if ((i != 0) && (k == 2))
    {
      GMTrace.o(8452898291712L, 62979);
      return true;
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(8452898291712L, 62979);
    return bool;
  }
  
  protected void finalize()
  {
    GMTrace.i(8456253734912L, 63004);
    w.d("MicroMsg.SnsTimeLineUI", "finalize");
    super.finalize();
    GMTrace.o(8456253734912L, 63004);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8454106251264L, 62988);
    int i = i.g.pPI;
    GMTrace.o(8454106251264L, 62988);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8456656388096L, 63007);
    w.v("MicroMsg.SnsTimeLineUI", "on ActivityResult, requestCode %d, resultCode %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 15)
    {
      if ((this.qyN != null) && (this.qyN.qxX != null) && (this.qyN.qxX.qVc != null))
      {
        this.qyN.qxX.qVc.onActivityResult(paramInt1, paramInt2, paramIntent);
        com.tencent.mm.sdk.platformtools.af.i(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8687779315712L, 64729);
            En_424b8e16.this.aKl();
            GMTrace.o(8687779315712L, 64729);
          }
        }, 300L);
      }
      GMTrace.o(8456656388096L, 63007);
      return;
    }
    if (paramInt1 == 16)
    {
      w.i("MicroMsg.SnsTimeLineUI", "REQUEST_CODE_FOR_FULLSCREEN");
      GMTrace.o(8456656388096L, 63007);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    this.qzb.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 11)
    {
      this.qyG.qXv.b(this.jqc, this.qyY, this.qyZ, this.qza);
      GMTrace.o(8456656388096L, 63007);
      return;
    }
    GMTrace.o(8456656388096L, 63007);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(8456522170368L, 63006);
    finish();
    GMTrace.o(8456522170368L, 63006);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(8453166727168L, 62981);
    super.onConfigurationChanged(paramConfiguration);
    w.i("MicroMsg.SnsTimeLineUI", "onConfigurationChanged");
    com.tencent.mm.sdk.b.a.uLm.m(new bt());
    com.tencent.mm.pluginsdk.e.h(this);
    com.tencent.mm.plugin.sns.ui.widget.c.bov().qXl = 0;
    com.tencent.mm.plugin.sns.ui.widget.a.bot().qXl = 0;
    com.tencent.mm.kiss.widget.textview.c.gTt.xO();
    this.qyI.qPK.bnC();
    this.qyI.qPL.resolvedClear();
    GMTrace.o(8453166727168L, 62981);
  }
  
  public void onCreate(Bundle arg1)
  {
    int j = 1;
    GMTrace.i(8453032509440L, 62980);
    if (this.vov != null) {
      this.vov.Y(2, true);
    }
    getIntent().setExtrasClassLoader(getClass().getClassLoader());
    com.tencent.mm.pluginsdk.e.g(this);
    super.onCreate(???);
    int i = com.tencent.mm.x.c.c.Cv().cK("Sns_Private_Recent_Setting_Guide", 0);
    w.i("MicroMsg.SnsTimeLineUI", "Sns_Private_Recent_Setting_Guide abtestvalue = " + i);
    if (i == 1)
    {
      com.tencent.mm.kernel.h.xA();
      if (!com.tencent.mm.kernel.h.xz().xi().c(w.a.vaO, false))
      {
        ??? = getIntent();
        ???.setClass(this.vov.voR, SnsSettingIntroduceUI.class);
        startActivity(???);
        overridePendingTransition(0, 0);
        finish();
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xz().xi().a(w.a.vaO, Boolean.valueOf(true));
      }
    }
    com.tencent.mm.bv.b.bSL();
    this.qyH.a(c.b.class, this.qzA);
    this.qyH.a(this);
    Object localObject1 = (c.a)this.qyH.B(c.a.class);
    this.jqc = ((c.a)localObject1).jqc;
    this.qyX = ((c.a)localObject1).qyX;
    this.qyY = ((c.a)localObject1).qyY;
    this.qyZ = ((c.a)localObject1).qyZ;
    this.qza = ((c.a)localObject1).qza;
    ??? = ((c.a)localObject1).mHB;
    localObject1 = ((c.a)localObject1).qRz;
    this.qzb = new bb(this);
    this.qzb.qRy = this.qzz;
    ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.notification.b.a.class)).getNotification().dV(2);
    com.tencent.mm.plugin.sns.ui.widget.c.bov().qXl = 0;
    com.tencent.mm.plugin.sns.ui.widget.a.bot().qXl = 0;
    Object localObject3 = com.tencent.mm.modelsns.c.hNQ;
    com.tencent.mm.modelsns.c.LK();
    label409:
    label658:
    int k;
    if (getIntent().getBooleanExtra("is_sns_notify_open", true))
    {
      i = 1;
      this.qyN = new j(this, i, bg.ap(getIntent().getStringExtra("new_feed_id"), ""), getIntent().getIntExtra("sns_unread_count", 0));
      this.qxS = getIntent().getBooleanExtra("sns_resume_state", true);
      if (!com.tencent.mm.plugin.sns.model.ae.bgY()) {
        break label1686;
      }
      this.qxS = false;
      this.qyL = this.qxS;
      this.qzb.a(this.qyX, this.jqc, ???, (String)localObject1, this.qyY, this.qyZ, this.qza);
      this.qzb.onCreate();
      com.tencent.mm.plugin.sns.model.ae.bhg().init();
      this.FR = cO().cP();
      com.tencent.mm.kernel.h.xA();
      com.tencent.mm.kernel.h.xy().gQO.a(213, this);
      com.tencent.mm.kernel.h.xA();
      com.tencent.mm.kernel.h.xy().gQO.a(682, this);
      com.tencent.mm.kernel.h.xA();
      com.tencent.mm.kernel.h.xy().gQO.a(218, this);
      com.tencent.mm.kernel.h.xA();
      com.tencent.mm.kernel.h.xy().gQO.a(211, this);
      com.tencent.mm.kernel.h.xA();
      com.tencent.mm.kernel.h.xy().gQO.a(683, this);
      MH();
      ??? = com.tencent.mm.plugin.sns.model.ae.bhg();
      localObject1 = this.qzb.nep;
      localObject3 = this.qyI.qPK;
      ???.qhi = ((ListView)localObject1);
      ???.qhj = ((av)localObject3);
      ??? = com.tencent.mm.plugin.sns.model.ae.bhg();
      com.tencent.mm.kernel.h.xA();
      com.tencent.mm.kernel.h.xy().gQO.a(291, ???);
      this.qyM = getIntent().getBooleanExtra("sns_timeline_NeedFirstLoadint", false);
      this.qyN.lWu = ((ClipboardManager)getSystemService("clipboard"));
      if (!com.tencent.mm.plugin.sns.model.ae.bgY()) {
        break label1706;
      }
      this.qxS = false;
      ??? = this.qyH;
      ???.qPL = this.qyI.qPL;
      localObject1 = ???.qPL;
      ???.wZB.a((com.tencent.mm.vending.e.a)localObject1);
      if (!this.qxS) {
        break label1733;
      }
      this.qyM = false;
      k = com.tencent.mm.plugin.sns.model.ae.bhv().position;
      localObject1 = this.qyI.qPL;
      localObject3 = com.tencent.mm.plugin.sns.model.ae.bhv().lBB;
    }
    for (;;)
    {
      synchronized (((aw)localObject1).qPF)
      {
        ((aw)localObject1).lBB = ((String)localObject3);
        this.qyI.qPL.qEP = com.tencent.mm.plugin.sns.model.ae.bhv().qEP;
        this.qyI.qPL.qPE = true;
        this.qyI.up();
        i = k;
        if (k >= this.qyI.getCount())
        {
          i = this.qyI.getCount() - 1;
          w.e("MicroMsg.SnsTimeLineUI", "error position %s", new Object[] { Integer.valueOf(this.qyI.getCount()) });
        }
        this.qzb.nep.setAdapter(this.qyI);
        w.d("MicroMsg.SnsTimeLineUI", "resume position %s", new Object[] { Integer.valueOf(com.tencent.mm.plugin.sns.model.ae.bhv().qEQ) });
        this.qzb.nep.setSelectionFromTop(i, com.tencent.mm.plugin.sns.model.ae.bhv().qEQ);
        this.qyK.setVisibility(4);
        i = this.qyI.getCount();
        k = this.qzb.nep.getFirstVisiblePosition();
        if (k < i) {
          this.qyS = com.tencent.mm.plugin.sns.data.i.g(this.qyI.uN(k));
        }
        com.tencent.mm.kernel.h.xA();
        this.qyQ = ((Integer)com.tencent.mm.kernel.h.xz().xi().get(327776, Integer.valueOf(0))).intValue();
        this.qyN.qxU = new bh(this, this.qyI.qPK, this.qyN.qgE);
        this.qyN.qxW = new com.tencent.mm.plugin.sns.f.b(this, this.qyI.qPK.qgD, this.qyN.qgE);
        this.qyN.qxV = new c(this, this.qyI.qPK.qgD, this.qyN.qgE, this.qyN.qxW);
        if (this.qyW != null) {
          this.qyW.a(this.qyN.qxW);
        }
        if (i > 0)
        {
          ??? = this.qyI.uN(0);
          if ((this.qyN.qxL != null) && (this.qyN.qxL.qek != null)) {
            this.qyN.qxL.qek.qiI = ???.field_snsId;
          }
          ??? = com.tencent.mm.plugin.sns.h.d.qkP;
          if (???.gNq != 0)
          {
            if (???.qkQ.isEmpty()) {
              ???.gCo.setLong(2, bg.Po());
            }
            w.i("MicroMsg.SnsReportHelper", "enterTimeLine exposureFeedSize %d", new Object[] { Integer.valueOf(???.qkQ.size()) });
          }
        }
        com.tencent.mm.plugin.report.service.g.paX.z(13312, "1," + bg.Pp());
        com.tencent.mm.sdk.b.a.uLm.b(this.qzd);
        if (getIntent().getBooleanExtra("is_need_resend_sns", false))
        {
          com.tencent.mm.sdk.platformtools.af.i(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(8663754342400L, 64550);
              com.tencent.mm.ui.base.h.a(En_424b8e16.this, En_424b8e16.this.getString(i.j.esB), "", En_424b8e16.this.getString(i.j.esC), En_424b8e16.this.getString(i.j.duP), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                  GMTrace.i(8321499136000L, 62000);
                  paramAnonymous2DialogInterface = new na();
                  com.tencent.mm.sdk.b.a.uLm.m(paramAnonymous2DialogInterface);
                  GMTrace.o(8321499136000L, 62000);
                }
              }, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                  GMTrace.i(8617583443968L, 64206);
                  paramAnonymous2DialogInterface = new ki();
                  com.tencent.mm.sdk.b.a.uLm.m(paramAnonymous2DialogInterface);
                  GMTrace.o(8617583443968L, 64206);
                }
              });
              GMTrace.o(8663754342400L, 64550);
            }
          }, 500L);
          getIntent().putExtra("is_need_resend_sns", false);
        }
        com.tencent.mm.kernel.h.xA();
        if (com.tencent.mm.kernel.h.xx().wM())
        {
          com.tencent.mm.kernel.h.xA();
          com.tencent.mm.kernel.h.xz().xi().set(589825, Boolean.valueOf(false));
        }
        this.qyN.qxK = this.qyU;
        ??? = this.qyU;
        i = this.qzb.pVL;
        localObject1 = this.FR.getCustomView();
        ???.pVL = i;
        ???.pWA = ((View)localObject1);
        ???.activity = this;
        com.tencent.mm.sdk.b.a.uLm.b(this.qzh);
        com.tencent.mm.sdk.b.a.uLm.b(this.qzi);
        com.tencent.mm.sdk.b.a.uLm.b(this.qzj);
        com.tencent.mm.sdk.b.a.uLm.b(this.qzk);
        com.tencent.mm.sdk.b.a.uLm.b(this.qzl);
        com.tencent.mm.sdk.b.a.uLm.b(this.qzn);
        com.tencent.mm.sdk.b.a.uLm.b(this.qzm);
        com.tencent.mm.sdk.b.a.uLm.b(this.qeJ);
        com.tencent.mm.sdk.b.a.uLm.b(this.qzo);
        com.tencent.mm.sdk.b.a.uLm.b(this.qzp);
        com.tencent.mm.sdk.b.a.uLm.b(this.qzr);
        com.tencent.mm.sdk.b.a.uLm.b(this.qzq);
        com.tencent.mm.sdk.b.a.uLm.b(this.qzs);
        com.tencent.mm.plugin.sns.abtest.c.bfO();
        com.tencent.mm.plugin.sns.abtest.a.d(this, this.qyN.qgE);
        if (this.qyT != null)
        {
          ??? = this.qyT;
          localObject1 = this.qzb.nep;
          localObject3 = this.qzb.qim;
          ???.inK = ((ListView)localObject1);
          ???.qim = ((SnsHeader)localObject3);
        }
        if ((this.qyN != null) && (this.qyN.qxL != null))
        {
          ??? = this.qyN.qxL.qek;
          w.i("MicroMsg.SnsBrowseInfoHelper", "onTimelineCreate");
          ???.qiH = true;
          ???.qkE = System.currentTimeMillis();
        }
        boolean bool = getIntent().getBooleanExtra("enter_by_red", false);
        if ((this.qyN != null) && (this.qyN.qxL != null))
        {
          ??? = this.qyN.qxL.qek;
          if (!bool) {
            break label1765;
          }
          i = j;
          ???.qiU = i;
        }
        com.tencent.mm.plugin.sns.model.ae.bhm().qar.clear();
        com.tencent.mm.pluginsdk.e.h(this);
        GMTrace.o(8453032509440L, 62980);
        return;
        i = 0;
        break;
        label1686:
        if (!this.qxS) {
          break label409;
        }
        this.qxS = com.tencent.mm.plugin.sns.model.ae.bhv().bmm();
        break label409;
        label1706:
        if (!this.qxS) {
          break label658;
        }
        this.qxS = com.tencent.mm.plugin.sns.model.ae.bhv().bmm();
      }
      label1733:
      this.qzb.nep.setAdapter(this.qyI);
      this.qyK.setVisibility(0);
      this.qyI.up();
      continue;
      label1765:
      i = 0;
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(8454911557632L, 62994);
    boolean bool = super.onCreateOptionsMenu(paramMenu);
    this.qzH = paramMenu.add(0, 0, 0, i.j.pRt);
    int i;
    if (this.qzE == null)
    {
      i = cO().cP().getHeight();
      if (i != 0) {
        break label309;
      }
      paramMenu = getResources().getDisplayMetrics();
      if (paramMenu.widthPixels <= paramMenu.heightPixels) {
        break label295;
      }
      i = getResources().getDimensionPixelSize(i.d.aRn);
    }
    label295:
    label309:
    for (;;)
    {
      int j = com.tencent.mm.bq.a.fromDPToPix(this, 56);
      paramMenu = new ViewGroup.LayoutParams(j, i);
      this.qzE = View.inflate(this, i.g.pPB, null);
      this.qzF = ((ImageView)this.qzE.findViewById(i.f.icon));
      this.qzG = this.qzE.findViewById(i.f.cBp);
      this.qzE.setLayoutParams(paramMenu);
      this.qzE.setBackgroundResource(i.e.aVx);
      this.qzE.setMinimumHeight(i);
      this.qzE.setMinimumWidth(j);
      this.qzF.setImageResource(i.i.dmP);
      this.qzE.setContentDescription(getString(i.j.eMR));
      this.qzE.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8688584622080L, 64735);
          En_424b8e16.E(En_424b8e16.this);
          GMTrace.o(8688584622080L, 64735);
        }
      });
      this.qzE.setOnLongClickListener(new View.OnLongClickListener()
      {
        public final boolean onLongClick(View paramAnonymousView)
        {
          GMTrace.i(8388473782272L, 62499);
          if ((En_424b8e16.g(En_424b8e16.this) != null) && (En_424b8e16.g(En_424b8e16.this).qxL != null)) {
            En_424b8e16.g(En_424b8e16.this).qxL.qek.hG(true);
          }
          com.tencent.mm.kernel.h.xA();
          if (!((Boolean)com.tencent.mm.kernel.h.xz().xi().get(7490, Boolean.valueOf(true))).booleanValue())
          {
            paramAnonymousView = new Intent();
            paramAnonymousView.setClass(En_424b8e16.this, En_c4f742e5.class);
            paramAnonymousView.putExtra("KSnsPostManu", true);
            paramAnonymousView.putExtra("KTouchCameraTime", bg.Po());
            paramAnonymousView.putExtra("sns_comment_type", 1);
            paramAnonymousView.putExtra("Ksnsupload_type", 9);
            com.tencent.mm.modelsns.b localb = com.tencent.mm.modelsns.b.gM(705);
            localb.gQ(localb.hNE).li(System.currentTimeMillis()).gQ(localb.hNG).gQ(1);
            localb = com.tencent.mm.plugin.sns.h.e.qkT.a(localb);
            localb.LJ();
            localb.b(paramAnonymousView, "intent_key_StatisticsOplog");
            En_424b8e16.this.startActivityForResult(paramAnonymousView, 9);
          }
          for (;;)
          {
            GMTrace.o(8388473782272L, 62499);
            return true;
            En_424b8e16.this.startActivity(new Intent().setClass(En_424b8e16.this, SnsLongMsgUI.class));
            com.tencent.mm.kernel.h.xA();
            com.tencent.mm.kernel.h.xz().xi().set(7490, Boolean.valueOf(false));
          }
        }
      });
      this.qzE.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8502693068800L, 63350);
          En_424b8e16.this.aQ();
          GMTrace.o(8502693068800L, 63350);
        }
        
        public final String toString()
        {
          GMTrace.i(8502827286528L, 63351);
          String str = super.toString() + "|supportInvalidateOptionsMenu";
          GMTrace.o(8502827286528L, 63351);
          return str;
        }
      });
      android.support.v4.view.m.a(this.qzH, this.qzE);
      android.support.v4.view.m.a(this.qzH, 2);
      this.qzH.setVisible(true);
      blh();
      GMTrace.o(8454911557632L, 62994);
      return bool;
      i = getResources().getDimensionPixelSize(i.d.aRo);
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(8453300944896L, 62982);
    this.qyR = true;
    w.i("MicroMsg.SnsTimeLineUI", "timeline on destory");
    com.tencent.mm.sdk.b.a.uLm.c(this.qzh);
    com.tencent.mm.sdk.b.a.uLm.c(this.qzi);
    com.tencent.mm.sdk.b.a.uLm.c(this.qzj);
    com.tencent.mm.sdk.b.a.uLm.c(this.qzk);
    com.tencent.mm.sdk.b.a.uLm.c(this.qzl);
    com.tencent.mm.sdk.b.a.uLm.c(this.qzn);
    com.tencent.mm.sdk.b.a.uLm.c(this.qzm);
    com.tencent.mm.sdk.b.a.uLm.c(this.qeJ);
    com.tencent.mm.sdk.b.a.uLm.c(this.qzo);
    com.tencent.mm.sdk.b.a.uLm.c(this.qzp);
    com.tencent.mm.sdk.b.a.uLm.c(this.qzq);
    com.tencent.mm.sdk.b.a.uLm.c(this.qzr);
    com.tencent.mm.sdk.b.a.uLm.c(this.qzs);
    if ((this.qyN != null) && (this.qyN.qxL != null))
    {
      localObject1 = this.qyN.qxL.qek;
      if (!this.qze) {
        break label399;
      }
    }
    long l;
    Object localObject4;
    label399:
    for (int i = 1;; i = 0)
    {
      ((com.tencent.mm.plugin.sns.h.b)localObject1).qiV = i;
      localObject1 = com.tencent.mm.plugin.sns.h.d.qkP;
      if (((com.tencent.mm.plugin.sns.h.d)localObject1).gNq == 0) {
        break label517;
      }
      w.i("MicroMsg.SnsReportHelper", "exitTimeline exposureFeedSize %d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.sns.h.d)localObject1).qkQ.size()) });
      l = ((com.tencent.mm.plugin.sns.h.d)localObject1).gCo.getLong(2, 0L);
      if ((((com.tencent.mm.plugin.sns.h.d)localObject1).qkQ.isEmpty()) || ((((com.tencent.mm.plugin.sns.h.d)localObject1).qkQ.size() <= ((com.tencent.mm.plugin.sns.h.d)localObject1).qkR) && (bg.aE(l) <= ((com.tencent.mm.plugin.sns.h.d)localObject1).qkS))) {
        break label1274;
      }
      localObject2 = new StringBuffer();
      localObject3 = ((com.tencent.mm.plugin.sns.h.d)localObject1).qkQ.keySet().iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject4 = (String)((Iterator)localObject3).next();
        ((StringBuffer)localObject2).append((String)localObject4 + "#" + ((com.tencent.mm.plugin.sns.h.d)localObject1).qkQ.get(localObject4) + "|");
      }
    }
    ((StringBuffer)localObject2).append("," + l + "," + bg.Po() + ",1");
    w.v("MicroMsg.SnsReportHelper", "report(13226) %d: %s", new Object[] { Integer.valueOf(13226), localObject2 });
    com.tencent.mm.plugin.report.service.g.paX.z(13226, ((StringBuffer)localObject2).toString());
    ((com.tencent.mm.plugin.sns.h.d)localObject1).gCo.set(3, null);
    ((com.tencent.mm.plugin.sns.h.d)localObject1).qkQ.clear();
    ((com.tencent.mm.plugin.sns.h.d)localObject1).gCo.setLong(2, bg.Po());
    label517:
    com.tencent.mm.kernel.h.xA();
    Object localObject3 = (String)com.tencent.mm.kernel.h.xz().xi().get(68377, null);
    i = this.qyI.getCount();
    Object localObject1 = "";
    Object localObject2 = null;
    if (i > 0)
    {
      localObject2 = this.qyI.uN(i - 1);
      localObject1 = com.tencent.mm.plugin.sns.data.i.g((com.tencent.mm.plugin.sns.storage.m)localObject2);
    }
    if ((this.qyN != null) && (this.qyN.qxL != null))
    {
      localObject4 = this.qyN.qxL.qek;
      if (localObject2 == null)
      {
        i = -1;
        label614:
        w.i("MicroMsg.SnsBrowseInfoHelper", "onTimelineDestroy");
        l = System.currentTimeMillis() - ((com.tencent.mm.plugin.sns.h.b)localObject4).qkE;
        ((com.tencent.mm.plugin.sns.h.b)localObject4).qiJ += l;
        w.i("MicroMsg.SnsBrowseInfoHelper", "onTimelineEns passedtime: " + l + " BrowseTime: " + ((com.tencent.mm.plugin.sns.h.b)localObject4).qiJ + "BackgroundTime: " + ((com.tencent.mm.plugin.sns.h.b)localObject4).qjs);
        com.tencent.mm.sdk.f.e.b(new b.2((com.tencent.mm.plugin.sns.h.b)localObject4, i), "onTimelineDestroy_report", 1);
        ((com.tencent.mm.plugin.sns.h.b)localObject4).qiH = false;
      }
    }
    else
    {
      localObject2 = com.tencent.mm.modelsns.b.gM(704);
      if (((com.tencent.mm.modelsns.b)localObject2).LF())
      {
        ((com.tencent.mm.modelsns.b)localObject2).bA(this.qze);
        if (bg.mZ((String)localObject3)) {
          break label1300;
        }
      }
    }
    int m;
    label1274:
    label1300:
    for (boolean bool = true;; bool = false)
    {
      ((com.tencent.mm.modelsns.b)localObject2).bA(bool);
      ((com.tencent.mm.modelsns.b)localObject2).lh(this.qyS);
      ((com.tencent.mm.modelsns.b)localObject2).lh((String)localObject1);
      ((com.tencent.mm.modelsns.b)localObject2).lh((String)localObject1);
      ((com.tencent.mm.modelsns.b)localObject2).gP(this.qzb.qRx);
      ((com.tencent.mm.modelsns.b)localObject2).lh("");
      com.tencent.mm.modelsns.b.LI();
      ((com.tencent.mm.modelsns.b)localObject2).LJ();
      localObject1 = (AdListView)this.qzb.bll();
      this.qyW.qfc.clear();
      com.tencent.mm.plugin.sns.model.ae.bhg().clean();
      localObject2 = com.tencent.mm.plugin.sns.model.ae.bhj();
      com.tencent.mm.plugin.sns.model.ae.bhc().post(new i.5((com.tencent.mm.plugin.sns.a.b.i)localObject2));
      ((AdListView)localObject1).qwp.clear();
      ((AdListView)localObject1).qwp = null;
      ((AdListView)localObject1).qwq.bgD();
      ((AdListView)localObject1).qwq = null;
      com.tencent.mm.plugin.sns.model.t.bgJ();
      if (!com.tencent.mm.plugin.sns.model.ae.bgY()) {
        this.qzx.removeCallbacks(this.qzc);
      }
      com.tencent.mm.kernel.h.xA();
      if (com.tencent.mm.kernel.h.xx().wM())
      {
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.b(213, this);
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.b(682, this);
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.b(218, this);
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.b(211, this);
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.b(683, this);
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xz().xi().set(327776, Integer.valueOf(this.qyQ));
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xz().xi().set(589825, Boolean.valueOf(false));
      }
      if (this.qyN != null)
      {
        localObject1 = this.qyN;
        ((j)localObject1).qxX.aqA();
        if (((j)localObject1).qxN != null) {
          ((j)localObject1).qxN.aLQ();
        }
        com.tencent.mm.sdk.b.a.uLm.c(((j)localObject1).qxZ);
      }
      com.tencent.mm.plugin.sns.model.ae.aCa().removeCallbacks(this.qzy);
      if (this.qyI == null) {
        break label1593;
      }
      m = this.qzb.nep.getFirstVisiblePosition();
      i = 0;
      j = 0;
      while (j < this.qzb.nep.getCount())
      {
        localObject1 = this.qzb.nep.getChildAt(j);
        int k = i;
        if (localObject1 != null)
        {
          int n = this.qzb.nep.getPositionForView((View)localObject1);
          k = i;
          if (n == m)
          {
            localObject2 = new int[2];
            ((View)localObject1).getLocationInWindow((int[])localObject2);
            w.d("MicroMsg.SnsTimeLineUI", "this is the pos for view %d x %d y %d", new Object[] { Integer.valueOf(n), Integer.valueOf(localObject2[0]), Integer.valueOf(localObject2[1]) });
            k = localObject2[1];
          }
        }
        j += 1;
        i = k;
      }
      ((com.tencent.mm.plugin.sns.h.d)localObject1).gCo.set(3, ((com.tencent.mm.plugin.sns.h.d)localObject1).qkQ);
      break;
      i = ((com.tencent.mm.plugin.sns.storage.m)localObject2).field_createTime;
      break label614;
    }
    int j = BackwardSupportUtil.b.a(this, 50.0F);
    if ((!com.tencent.mm.plugin.sns.model.ae.bgY()) && (this.qyH.bhf() != null))
    {
      localObject1 = com.tencent.mm.plugin.sns.model.ae.bhv();
      localObject2 = this.qyI.qPL.lBB;
      localObject3 = this.qyI.qPL.qEP;
      l = this.qyH.bhf().qey;
      ((aj)localObject1).qEO = bg.Pq();
      ((aj)localObject1).lBB = ((String)localObject2);
      ((aj)localObject1).qEP = ((String)localObject3);
      ((aj)localObject1).qey = l;
      ((aj)localObject1).position = m;
      ((aj)localObject1).qEQ = (i - j);
      w.i("MicroMsg.ResumeSnsControl", "lastSnsTime %s limitSeq %s respMinSeq %s timeLastId %s position %s topy %s", new Object[] { Long.valueOf(((aj)localObject1).qEO), localObject2, localObject3, Long.valueOf(l), Integer.valueOf(m), Integer.valueOf(((aj)localObject1).qEQ) });
    }
    w.d("MicroMsg.SnsTimeLineUI", "top h %d", new Object[] { Integer.valueOf(i - j) });
    localObject1 = this.qyI.qPK;
    com.tencent.mm.sdk.b.a.uLm.c(((av)localObject1).iSb);
    if (com.tencent.mm.plugin.sns.model.ae.bgY()) {
      w.e("MicroMsg.SnsTimeLineBaseAdapter", "is invalid to getSnsInfoStorage");
    }
    for (;;)
    {
      localObject1 = this.qyI.qPK;
      if (((av)localObject1).qHz != null) {
        ((av)localObject1).qHz.activity = null;
      }
      localObject1 = this.qyI.qPK;
      com.tencent.mm.sdk.b.a.uLm.c(((av)localObject1).iSb);
      this.qyI.qPK.bnF();
      label1593:
      az.clean();
      com.tencent.mm.sdk.b.a.uLm.c(this.qzd);
      com.tencent.mm.kernel.h.xA();
      if (com.tencent.mm.kernel.h.xx().wM()) {
        com.tencent.mm.plugin.sns.model.ae.bhm().qar.clear();
      }
      this.qyI = null;
      this.qyN = null;
      ax.bnK();
      com.tencent.mm.plugin.sns.abtest.c.bfP();
      localObject1 = com.tencent.mm.plugin.sns.model.ae.bhg();
      com.tencent.mm.kernel.h.xA();
      com.tencent.mm.kernel.h.xy().gQO.b(291, (com.tencent.mm.ac.e)localObject1);
      com.tencent.mm.plugin.sns.abtest.a.clean();
      this.qzb.onDestroy();
      super.onDestroy();
      com.tencent.mm.kiss.widget.textview.c.gTt.xO();
      GMTrace.o(8453300944896L, 62982);
      return;
      com.tencent.mm.plugin.sns.model.ae.bhm();
    }
  }
  
  public void onPause()
  {
    GMTrace.i(8453972033536L, 62987);
    this.qyK.clearAnimation();
    com.tencent.mm.plugin.sns.model.t.b(this);
    com.tencent.mm.plugin.sns.model.ae.bhm().qat = null;
    Object localObject = new rb();
    ((rb)localObject).fPb.type = 1;
    com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
    if (this.qyI != null)
    {
      localObject = this.qyI.qPK;
      com.tencent.mm.sdk.b.a.uLm.c(((av)localObject).qHO);
      com.tencent.mm.sdk.b.a.uLm.c(((av)localObject).qHN);
      com.tencent.mm.sdk.b.a.uLm.c(((av)localObject).qHP);
    }
    if ((this.qyN != null) && (this.qyN.qxK != null)) {
      this.qyN.qxK.khj = bg.Pq();
    }
    if ((this.qyN != null) && (this.qyN.qxL != null)) {
      this.qyN.qxL.qek.hC(false);
    }
    com.tencent.mm.modelstat.d.e("En_424b8e16", this.khj, bg.Po());
    bb.onPause();
    super.onPause();
    com.tencent.mm.sdk.b.a.uLm.c(this.qzg);
    com.tencent.mm.sdk.b.a.uLm.c(this.qzf);
    GMTrace.o(8453972033536L, 62987);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(8456790605824L, 63008);
    w.i("MicroMsg.SnsTimeLineUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    label176:
    for (;;)
    {
      GMTrace.o(8456790605824L, 63008);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        bli();
        GMTrace.o(8456790605824L, 63008);
        return;
      }
      if ("android.permission.CAMERA".equals(paramArrayOfString[0])) {}
      for (paramInt = i.j.etQ;; paramInt = i.j.etT)
      {
        if (paramArrayOfInt[0] == 0) {
          break label176;
        }
        com.tencent.mm.ui.base.h.a(this, getString(paramInt), getString(i.j.etW), getString(i.j.ejv), getString(i.j.duP), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(17837401833472L, 132899);
            paramAnonymousDialogInterface.dismiss();
            En_424b8e16.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
            GMTrace.o(17837401833472L, 132899);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(8478533877760L, 63170);
            paramAnonymousDialogInterface.dismiss();
            GMTrace.o(8478533877760L, 63170);
          }
        });
        break;
      }
    }
  }
  
  public void onResume()
  {
    GMTrace.i(8453435162624L, 62983);
    if ((com.tencent.mm.sdk.a.b.bMv()) && (com.tencent.mm.sdk.a.b.bMt())) {
      qzC.add(this);
    }
    bb.onResume();
    super.onResume();
    this.khj = bg.Po();
    int i;
    Object localObject2;
    com.tencent.mm.plugin.sns.storage.m localm;
    Object localObject1;
    if (this.qzB)
    {
      this.qzB = false;
      i = this.qyI.getCount();
      if (getIntent().getBooleanExtra("is_from_find_more", false))
      {
        localObject2 = com.tencent.mm.modelsns.b.c(getIntent(), "enter_log");
        if (localObject2 != null)
        {
          if (i <= 0) {
            break label670;
          }
          localm = this.qyI.uN(0);
          if (localm != null) {
            break label636;
          }
          localObject1 = "0";
          ((com.tencent.mm.modelsns.b)localObject2).lh((String)localObject1);
          if (localm != null) {
            break label648;
          }
          localObject1 = "0";
          label135:
          ((com.tencent.mm.modelsns.b)localObject2).lh((String)localObject1);
          ((com.tencent.mm.modelsns.b)localObject2).lh(String.valueOf(i));
          label152:
          ((com.tencent.mm.modelsns.b)localObject2).LJ();
        }
      }
    }
    if (this.mScreenWidth == 0)
    {
      localObject1 = new DisplayMetrics();
      getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject1);
      this.mScreenWidth = ((DisplayMetrics)localObject1).widthPixels;
      this.mScreenHeight = ((DisplayMetrics)localObject1).heightPixels;
      localObject1 = this.qyT;
      i = this.mScreenWidth;
      int j = this.mScreenHeight;
      ((com.tencent.mm.plugin.sns.h.a)localObject1).mScreenWidth = i;
      ((com.tencent.mm.plugin.sns.h.a)localObject1).mScreenHeight = j;
    }
    if (com.tencent.mm.plugin.sns.model.ae.bgY()) {
      finish();
    }
    com.tencent.mm.plugin.sns.model.ae.bhm().qat = this.qyI.qPK;
    xJ().C(c.b.class);
    com.tencent.mm.plugin.sns.model.t.a(this);
    if (this.qyM) {
      this.qyK.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8506048512000L, 63375);
          w.i("MicroMsg.SnsTimeLineUI", "onResume go to playAnim " + En_424b8e16.w(En_424b8e16.this));
          if (En_424b8e16.w(En_424b8e16.this))
          {
            En_424b8e16.x(En_424b8e16.this);
            En_424b8e16.y(En_424b8e16.this).blv();
          }
          GMTrace.o(8506048512000L, 63375);
        }
      });
    }
    for (;;)
    {
      localObject1 = new rb();
      ((rb)localObject1).fPb.fPc = this.qzb.nep.getFirstVisiblePosition();
      ((rb)localObject1).fPb.fPd = this.qzb.nep.getLastVisiblePosition();
      ((rb)localObject1).fPb.fPe = this.qzb.nep.getHeaderViewsCount();
      ((rb)localObject1).fPb.type = 0;
      com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject1);
      if ((this.qyN != null) && (this.qyN.qxK != null)) {
        this.qyN.qxK.onResume();
      }
      if (this.qyI != null)
      {
        localObject1 = this.qyI.qPK;
        com.tencent.mm.sdk.b.a.uLm.b(((av)localObject1).qHO);
        com.tencent.mm.sdk.b.a.uLm.b(((av)localObject1).qHN);
        com.tencent.mm.sdk.b.a.uLm.b(((av)localObject1).qHP);
      }
      if ((this.qyN != null) && (this.qyN.qxL != null))
      {
        this.qyN.qxL.qek.hC(true);
        this.qyN.qxL.qek.hD(false);
        this.qyN.qxL.qek.hE(false);
        this.qyN.qxL.qek.hF(false);
        this.qyN.qxL.qek.hP(false);
        localObject1 = this.qyN.qxL.qek;
        ((com.tencent.mm.plugin.sns.h.b)localObject1).hN(false);
        ((com.tencent.mm.plugin.sns.h.b)localObject1).hO(false);
        ((com.tencent.mm.plugin.sns.h.b)localObject1).hH(false);
        ((com.tencent.mm.plugin.sns.h.b)localObject1).hM(false);
        ((com.tencent.mm.plugin.sns.h.b)localObject1).hK(false);
        ((com.tencent.mm.plugin.sns.h.b)localObject1).hM(false);
        ((com.tencent.mm.plugin.sns.h.b)localObject1).hQ(false);
        ((com.tencent.mm.plugin.sns.h.b)localObject1).hL(false);
        ((com.tencent.mm.plugin.sns.h.b)localObject1).hM(false);
        ((com.tencent.mm.plugin.sns.h.b)localObject1).hI(false);
        ((com.tencent.mm.plugin.sns.h.b)localObject1).hJ(false);
      }
      localObject1 = com.tencent.mm.plugin.sns.model.ae.bhm();
      ((com.tencent.mm.plugin.sns.model.g)localObject1).qau = 0L;
      ((com.tencent.mm.plugin.sns.model.g)localObject1).qav = 0L;
      com.tencent.mm.sdk.b.a.uLm.b(this.qzg);
      com.tencent.mm.sdk.b.a.uLm.b(this.qzf);
      GMTrace.o(8453435162624L, 62983);
      return;
      label636:
      localObject1 = com.tencent.mm.plugin.sns.data.i.jdMethod_do(localm.field_snsId);
      break;
      label648:
      localObject1 = localm.field_createTime;
      break label135;
      label670:
      ((com.tencent.mm.modelsns.b)localObject2).lh("");
      ((com.tencent.mm.modelsns.b)localObject2).lh("");
      ((com.tencent.mm.modelsns.b)localObject2).lh("0");
      break label152;
      localObject1 = this.qyO;
      if (((a)localObject1).qzL.qyK.getVisibility() == 0)
      {
        ((a)localObject1).init();
        localObject2 = (AbsoluteLayout.LayoutParams)((a)localObject1).qzL.qyK.getLayoutParams();
        ((AbsoluteLayout.LayoutParams)localObject2).y = ((int)((a)localObject1).qzZ);
        ((a)localObject1).qzL.qyK.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        ((a)localObject1).qzL.qyK.invalidate();
      }
    }
  }
  
  public void onStart()
  {
    GMTrace.i(8453703598080L, 62985);
    super.onStart();
    GMTrace.o(8453703598080L, 62985);
  }
  
  public void onStop()
  {
    GMTrace.i(8453837815808L, 62986);
    super.onStop();
    GMTrace.o(8453837815808L, 62986);
  }
  
  final class a
    extends Animation
  {
    ListView nep;
    float qAa;
    private float qAb;
    boolean qAc;
    int qAd;
    boolean qAe;
    int qAf;
    float qAg;
    float qAh;
    float qzW;
    float qzX;
    float qzY;
    float qzZ;
    
    public a(ListView paramListView)
    {
      GMTrace.i(8542153080832L, 63644);
      this.qzY = -1.0F;
      this.qAa = 0.0F;
      this.qAe = false;
      this.qAf = 0;
      this.qAg = 0.0F;
      this.qAh = 0.0F;
      this.nep = paramListView;
      GMTrace.o(8542153080832L, 63644);
    }
    
    protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
    {
      GMTrace.i(8542689951744L, 63648);
      if (En_424b8e16.l(En_424b8e16.this).getVisibility() != 0)
      {
        GMTrace.o(8542689951744L, 63648);
        return;
      }
      float f = this.qAb;
      f = (float)getDuration() * (paramFloat - f);
      if (f < 2.0F)
      {
        GMTrace.o(8542689951744L, 63648);
        return;
      }
      this.qAb = paramFloat;
      En_424b8e16.l(En_424b8e16.this).setImageResource(i.i.pQp);
      En_424b8e16.l(En_424b8e16.this).a(QImageView.a.wVn);
      if (((float)getDuration() * paramFloat >= (float)(getDuration() - 600L)) || (this.qAc))
      {
        paramTransformation = (AbsoluteLayout.LayoutParams)En_424b8e16.l(En_424b8e16.this).getLayoutParams();
        this.qAa = (paramTransformation.y - f / 3.0F);
        paramTransformation.y = ((int)this.qAa);
        En_424b8e16.l(En_424b8e16.this).setLayoutParams(paramTransformation);
      }
      for (;;)
      {
        En_424b8e16.l(En_424b8e16.this).invalidate();
        GMTrace.o(8542689951744L, 63648);
        return;
        En_424b8e16.l(En_424b8e16.this).mMatrix.postRotate(f / 2.5F, this.qzW, this.qzX);
      }
    }
    
    public final void blv()
    {
      GMTrace.i(8542287298560L, 63645);
      w.d("MicroMsg.SnsTimeLineUI", "animtest playLoading");
      if (En_424b8e16.l(En_424b8e16.this).getVisibility() != 0)
      {
        GMTrace.o(8542287298560L, 63645);
        return;
      }
      init();
      this.qAa = (this.qzY + 20.0F);
      AbsoluteLayout.LayoutParams localLayoutParams = (AbsoluteLayout.LayoutParams)En_424b8e16.l(En_424b8e16.this).getLayoutParams();
      localLayoutParams.y = ((int)this.qzY);
      En_424b8e16.l(En_424b8e16.this).setLayoutParams(localLayoutParams);
      blw();
      GMTrace.o(8542287298560L, 63645);
    }
    
    public final void blw()
    {
      GMTrace.i(8542421516288L, 63646);
      if (En_424b8e16.l(En_424b8e16.this).getVisibility() != 0)
      {
        GMTrace.o(8542421516288L, 63646);
        return;
      }
      init();
      En_424b8e16.l(En_424b8e16.this).clearAnimation();
      En_424b8e16.l(En_424b8e16.this).startAnimation(this);
      if (this.qAa >= this.qzY)
      {
        setDuration(20000L);
        this.qAc = false;
        GMTrace.o(8542421516288L, 63646);
        return;
      }
      setDuration(600L);
      this.qAc = true;
      GMTrace.o(8542421516288L, 63646);
    }
    
    final void init()
    {
      GMTrace.i(8542555734016L, 63647);
      if ((this.qzY == -1.0F) || (this.qzX < 0.1D))
      {
        this.qzY = BackwardSupportUtil.b.a(En_424b8e16.this, 25.0F);
        this.qzW = (En_424b8e16.l(En_424b8e16.this).getWidth() / 2);
        this.qzX = (En_424b8e16.l(En_424b8e16.this).getHeight() / 2);
        this.qzZ = (this.qzX * -2.0F - 3.0F);
        w.d("MicroMsg.SnsTimeLineUI", "MIN_Y" + this.qzZ);
        this.qAa = this.qzZ;
        if (!this.qAe)
        {
          w.i("MicroMsg.SnsTimeLineUI", "initState");
          this.qAf = ((AbsoluteLayout.LayoutParams)En_424b8e16.l(En_424b8e16.this).getLayoutParams()).y;
          this.qAg = this.qzY;
          this.qAh = this.qAa;
        }
        this.qAe = true;
      }
      GMTrace.o(8542555734016L, 63647);
    }
    
    public final void initialize(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      GMTrace.i(8542824169472L, 63649);
      super.initialize(paramInt1, paramInt2, paramInt3, paramInt4);
      this.qAb = 0.0F;
      this.qAa = this.qzY;
      GMTrace.o(8542824169472L, 63649);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/En_424b8e16.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */