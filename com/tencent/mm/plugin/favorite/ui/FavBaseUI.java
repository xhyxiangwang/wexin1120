package com.tencent.mm.plugin.favorite.ui;

import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewStub;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ac.n;
import com.tencent.mm.g.b.ed;
import com.tencent.mm.plugin.favorite.b.ag;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.c.b;
import com.tencent.mm.plugin.favorite.c.f;
import com.tencent.mm.plugin.favorite.ui.a.a;
import com.tencent.mm.plugin.favorite.ui.base.c.a;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.v;
import com.tencent.mm.x.ap;

public abstract class FavBaseUI
  extends MMActivity
  implements AdapterView.OnItemClickListener
{
  protected ae ham;
  protected com.tencent.mm.plugin.favorite.c.g lNK;
  private boolean lQQ;
  protected boolean lQR;
  private boolean lQS;
  private long lQT;
  protected ListView lQU;
  protected TextView lQV;
  private HandlerThread lQW;
  protected ae lQX;
  protected View lQY;
  private View lQZ;
  protected com.tencent.mm.plugin.favorite.ui.base.c lRa;
  protected c.a lRb;
  private com.tencent.mm.ac.e lRc;
  private com.tencent.mm.ac.e lRd;
  private Runnable lRe;
  protected Runnable lRf;
  private Runnable lRg;
  private j.a lRh;
  
  public FavBaseUI()
  {
    GMTrace.i(6363396702208L, 47411);
    this.lQQ = false;
    this.lQR = false;
    this.lQS = false;
    this.lQT = 0L;
    this.ham = new ae(Looper.getMainLooper());
    this.lRb = null;
    this.lRc = new com.tencent.mm.ac.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.k paramAnonymousk)
      {
        GMTrace.i(6439766589440L, 47980);
        w.i("MicroMsg.FavoriteBaseUI", "on fav sync end");
        if (((com.tencent.mm.plugin.favorite.b.af)paramAnonymousk).lPU)
        {
          w.i("MicroMsg.FavoriteBaseUI", "need batch get return");
          GMTrace.o(6439766589440L, 47980);
          return;
        }
        w.i("MicroMsg.FavoriteBaseUI", "dismiss loading dialog");
        if (FavBaseUI.c(FavBaseUI.this)) {
          FavBaseUI.d(FavBaseUI.this);
        }
        FavBaseUI.this.eu(false);
        FavBaseUI.this.axE();
        GMTrace.o(6439766589440L, 47980);
      }
    };
    this.lRd = new com.tencent.mm.ac.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.k paramAnonymousk)
      {
        GMTrace.i(6439498153984L, 47978);
        w.i("MicroMsg.FavoriteBaseUI", "on batch get end");
        if (FavBaseUI.c(FavBaseUI.this))
        {
          w.i("MicroMsg.FavoriteBaseUI", "init currently, dismiss dialog");
          FavBaseUI.d(FavBaseUI.this);
          FavBaseUI.this.eu(false);
        }
        GMTrace.o(6439498153984L, 47978);
      }
    };
    this.lRe = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6318165327872L, 47074);
        a locala = FavBaseUI.this.axA();
        locala.axS();
        locala.axT();
        FavBaseUI.this.axE();
        GMTrace.o(6318165327872L, 47074);
      }
    };
    this.lRf = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6319910158336L, 47087);
        a locala = FavBaseUI.this.axA();
        if ((!locala.isEmpty()) && (SystemClock.elapsedRealtime() - FavBaseUI.e(FavBaseUI.this) < 1000L))
        {
          w.d("MicroMsg.FavoriteBaseUI", "try refresh, time limit, now %d last %d delay %d", new Object[] { Long.valueOf(SystemClock.elapsedRealtime()), Long.valueOf(FavBaseUI.e(FavBaseUI.this)), Integer.valueOf(1000) });
          FavBaseUI.this.ham.postDelayed(this, 500L);
          GMTrace.o(6319910158336L, 47087);
          return;
        }
        FavBaseUI.f(FavBaseUI.this);
        FavBaseUI.a(FavBaseUI.this, SystemClock.elapsedRealtime());
        w.v("MicroMsg.FavoriteBaseUI", "do refresh job");
        locala.notifyDataSetChanged();
        FavBaseUI.this.a(locala);
        if (FavBaseUI.this.lQR)
        {
          w.v("MicroMsg.FavoriteBaseUI", "do scroll to first");
          FavBaseUI.this.lQU.setSelection(0);
          FavBaseUI.this.lQR = false;
        }
        GMTrace.o(6319910158336L, 47087);
      }
    };
    this.lRg = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6441645637632L, 47994);
        FavBaseUI.this.axB();
        FavBaseUI.this.axA().axT();
        FavBaseUI.this.axE();
        GMTrace.o(6441645637632L, 47994);
      }
    };
    this.lRh = new j.a()
    {
      long lRj;
      long lRk;
      long lRl;
      int lRm;
      
      public final void a(String paramAnonymousString, l paramAnonymousl)
      {
        GMTrace.i(6413594132480L, 47785);
        if (bg.aG(this.lRl) < 1000L) {
          this.lRm += 1;
        }
        for (;;)
        {
          w.d("MicroMsg.FavoriteBaseUI", "on fav item info storage changed, postDelay %d", new Object[] { Long.valueOf(this.lRk) });
          this.lRl = bg.Pq();
          if (5 < this.lRm)
          {
            this.lRm = 0;
            this.lRk += 1000L;
            this.lRk = Math.min(this.lRk, 5000L);
          }
          FavBaseUI.this.lQX.removeCallbacks(FavBaseUI.g(FavBaseUI.this));
          if (bg.aG(this.lRj) <= this.lRk) {
            break;
          }
          this.lRj = bg.Pq();
          FavBaseUI.this.lQX.post(FavBaseUI.g(FavBaseUI.this));
          GMTrace.o(6413594132480L, 47785);
          return;
          this.lRm = 0;
          this.lRk = 1000L;
        }
        FavBaseUI.this.lQX.postDelayed(FavBaseUI.g(FavBaseUI.this), this.lRk);
        GMTrace.o(6413594132480L, 47785);
      }
    };
    GMTrace.o(6363396702208L, 47411);
  }
  
  private void ev(boolean paramBoolean)
  {
    GMTrace.i(6365007314944L, 47423);
    if (paramBoolean)
    {
      if (this.lQV == null) {
        this.lQV = ((TextView)((ViewStub)findViewById(R.h.bEB)).inflate().findViewById(R.h.bEo));
      }
      this.lQV.setVisibility(0);
      GMTrace.o(6365007314944L, 47423);
      return;
    }
    if (this.lQV != null) {
      this.lQV.setVisibility(8);
    }
    GMTrace.o(6365007314944L, 47423);
  }
  
  protected final void MH()
  {
    GMTrace.i(6364738879488L, 47421);
    long l = System.currentTimeMillis();
    this.lQU = ((ListView)findViewById(R.h.bHI));
    this.lQU.setDrawingCacheEnabled(false);
    new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6322057641984L, 47103);
        BackwardSupportUtil.c.a(FavBaseUI.this.lQU);
        GMTrace.o(6322057641984L, 47103);
      }
    };
    initHeaderView();
    this.lQY = v.fa(this).inflate(R.i.cUi, null);
    this.lQU.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(6374939426816L, 47497);
        GMTrace.o(6374939426816L, 47497);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(6374805209088L, 47496);
        if (paramAnonymousInt == 0)
        {
          if (com.tencent.mm.plugin.favorite.h.awD().n(FavBaseUI.this.axA().axQ(), FavBaseUI.this.axA().getType()))
          {
            w.v("MicroMsg.FavoriteBaseUI", "has shown all, do not load data");
            GMTrace.o(6374805209088L, 47496);
            return;
          }
          if (FavBaseUI.a(FavBaseUI.this))
          {
            w.i("MicroMsg.FavoriteBaseUI", "force bottom load data");
            FavBaseUI.b(FavBaseUI.this);
          }
        }
        GMTrace.o(6374805209088L, 47496);
      }
    });
    this.lQU.setOnItemClickListener(this);
    this.lQU.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(6320447029248L, 47091);
        FavBaseUI.this.aKl();
        GMTrace.o(6320447029248L, 47091);
        return false;
      }
    });
    this.lQU.setAdapter(axA());
    a(axA());
    w.d("MicroMsg.FavoriteBaseUI", "init view use %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    GMTrace.o(6364738879488L, 47421);
  }
  
  protected final void a(a parama)
  {
    GMTrace.i(6365409968128L, 47426);
    if (parama == null)
    {
      w.w("MicroMsg.FavoriteBaseUI", "handle empty view fail, adapter is null");
      GMTrace.o(6365409968128L, 47426);
      return;
    }
    if (parama.isEmpty()) {
      if (axC())
      {
        eu(true);
        ev(false);
      }
    }
    while ((parama.isEmpty()) || (com.tencent.mm.plugin.favorite.h.awD().n(parama.axQ(), parama.getType())))
    {
      this.lQU.removeFooterView(this.lQY);
      GMTrace.o(6365409968128L, 47426);
      return;
      eu(false);
      ev(true);
      axD();
      continue;
      eu(false);
      ev(false);
    }
    if (this.lQU.getFooterViewsCount() == 0) {
      this.lQU.addFooterView(this.lQY);
    }
    GMTrace.o(6365409968128L, 47426);
  }
  
  public abstract a axA();
  
  protected abstract void axB();
  
  protected abstract boolean axC();
  
  protected abstract void axD();
  
  protected void axE()
  {
    GMTrace.i(6365275750400L, 47425);
    w.i("MicroMsg.FavoriteBaseUI", "on storage change, try refresh job");
    this.ham.removeCallbacks(this.lRf);
    this.ham.post(this.lRf);
    GMTrace.o(6365275750400L, 47425);
  }
  
  protected final void eu(boolean paramBoolean)
  {
    GMTrace.i(6364873097216L, 47422);
    if (paramBoolean)
    {
      if (this.lQZ == null) {
        this.lQZ = ((ViewStub)findViewById(R.h.bEq)).inflate();
      }
      this.lQZ.setVisibility(0);
      GMTrace.o(6364873097216L, 47422);
      return;
    }
    if (this.lQZ != null) {
      this.lQZ.setVisibility(8);
    }
    GMTrace.o(6364873097216L, 47422);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6363530919936L, 47412);
    int i = R.i.cUx;
    GMTrace.o(6363530919936L, 47412);
    return i;
  }
  
  protected void initHeaderView()
  {
    GMTrace.i(6365141532672L, 47424);
    this.lRa = new com.tencent.mm.plugin.favorite.ui.base.c(this.vov.voR);
    this.lRa.lUh = this.lRb;
    this.lRa.ez(false);
    this.lRa.lUf.setVisibility(8);
    this.lRa.lUg.setVisibility(8);
    w.d("MicroMsg.FavoriteBaseUI", "padding %s, %s", new Object[] { Integer.valueOf(this.lRa.getPaddingTop()), Integer.valueOf(this.lRa.getPaddingBottom()) });
    this.lQU.addHeaderView(this.lRa);
    GMTrace.o(6365141532672L, 47424);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6364202008576L, 47417);
    long l = System.currentTimeMillis();
    super.onCreate(paramBundle);
    if (com.tencent.mm.plugin.favorite.h.awD().gMB == null)
    {
      com.tencent.mm.plugin.favorite.h.aws().lOc = ed.rj();
      finish();
      GMTrace.o(6364202008576L, 47417);
      return;
    }
    w.i("MicroMsg.FavoriteBaseUI", "onCreate MMCore.accHasReady[%b]", new Object[] { Boolean.valueOf(ap.AV()) });
    paramBundle = new ag();
    ap.wT().a(paramBundle, 0);
    com.tencent.mm.plugin.favorite.h.awD().c(this.lRh);
    ap.wT().a(400, this.lRc);
    ap.wT().a(402, this.lRd);
    this.lQW = com.tencent.mm.sdk.f.e.Sc(getClass().getName() + "_handlerThread_" + System.currentTimeMillis());
    this.lQW.start();
    this.lQX = new ae(this.lQW.getLooper());
    this.lNK = new com.tencent.mm.plugin.favorite.c.g(this.vov.voR, 64);
    MH();
    ap.AS();
    if (bg.e((Integer)com.tencent.mm.x.c.xi().get(8217, null)) == 0)
    {
      w.i("MicroMsg.FavoriteBaseUI", "do init data for first time");
      this.lQS = true;
      paramBundle = new com.tencent.mm.plugin.favorite.b.af();
      ap.wT().a(paramBundle, 0);
      if (this.lQS)
      {
        w.i("MicroMsg.FavoriteBaseUI", "show loading dialog");
        if ((axA() == null) || (axA().isEmpty())) {
          eu(true);
        }
        ev(false);
      }
    }
    for (;;)
    {
      com.tencent.mm.plugin.favorite.h.awx().run();
      com.tencent.mm.plugin.favorite.h.awu().run();
      com.tencent.mm.plugin.favorite.h.awt().run();
      com.tencent.mm.plugin.favorite.h.awv().run();
      ap.xC().C(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6357491122176L, 47367);
          x.axe();
          GMTrace.o(6357491122176L, 47367);
        }
      });
      w.d("MicroMsg.FavoriteBaseUI", "on create use %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      GMTrace.o(6364202008576L, 47417);
      return;
      x.startSync();
      if (axA().isEmpty())
      {
        eu(true);
        ev(false);
        this.lQY.setVisibility(8);
      }
      else
      {
        eu(false);
        ev(false);
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6364604661760L, 47420);
    super.onDestroy();
    if (com.tencent.mm.plugin.favorite.h.awD().gMB == null)
    {
      GMTrace.o(6364604661760L, 47420);
      return;
    }
    this.lNK.destory();
    this.lNK = null;
    this.lQW.quit();
    com.tencent.mm.plugin.favorite.h.awD().j(this.lRh);
    ap.wT().b(400, this.lRc);
    ap.wT().b(402, this.lRd);
    GMTrace.o(6364604661760L, 47420);
  }
  
  protected void onPause()
  {
    GMTrace.i(6364470444032L, 47419);
    super.onPause();
    axA();
    GMTrace.o(6364470444032L, 47419);
  }
  
  protected void onResume()
  {
    GMTrace.i(6364336226304L, 47418);
    super.onResume();
    com.tencent.mm.pluginsdk.wallet.g.zc(5);
    GMTrace.o(6364336226304L, 47418);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/FavBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */