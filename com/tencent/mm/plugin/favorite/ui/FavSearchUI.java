package com.tencent.mm.plugin.favorite.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.view.m;
import android.support.v4.view.m.e;
import android.support.v7.widget.Toolbar.LayoutParams;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.k;
import com.tencent.mm.plugin.favorite.b.r;
import com.tencent.mm.plugin.favorite.b.t;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.b.x.a;
import com.tencent.mm.plugin.favorite.ui.a.b;
import com.tencent.mm.plugin.favorite.ui.a.c;
import com.tencent.mm.plugin.favorite.ui.base.FavCapacityPanel;
import com.tencent.mm.plugin.favorite.ui.base.FavSearchActionView;
import com.tencent.mm.plugin.favorite.ui.base.FavSearchActionView.a;
import com.tencent.mm.plugin.favorite.ui.base.FavTagPanel;
import com.tencent.mm.plugin.favorite.ui.base.FavTypePanel;
import com.tencent.mm.plugin.favorite.ui.base.FavTypePanel.a;
import com.tencent.mm.plugin.favorite.ui.c.a.b;
import com.tencent.mm.plugin.favorite.ui.c.e;
import com.tencent.mm.pluginsdk.ui.applet.d.a;
import com.tencent.mm.pluginsdk.ui.applet.k.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMTagPanel.d;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.ap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@com.tencent.mm.ui.base.a(19)
public class FavSearchUI
  extends MMActivity
{
  private String frE;
  private int hWX;
  private ListView kjQ;
  private String lRW;
  private Set<Integer> lRX;
  private x.a lRY;
  private c lRZ;
  private com.tencent.mm.plugin.favorite.c.g lRn;
  private b lRo;
  private FavSearchActionView lSa;
  private FavTypePanel lSb;
  private ListView lSc;
  private View lSd;
  private FavCapacityPanel lSe;
  private Animation lSf;
  private Animation lSg;
  private List<Integer> lSh;
  private List<String> lSi;
  private List<String> lSj;
  private Set<String> lSk;
  private View lSl;
  private ImageButton lSm;
  private MenuItem lSn;
  private List<Long> lSo;
  private ae mHandler;
  
  public FavSearchUI()
  {
    GMTrace.i(6313870360576L, 47042);
    this.lSk = new HashSet();
    this.lSo = new ArrayList();
    GMTrace.o(6313870360576L, 47042);
  }
  
  private void axI()
  {
    GMTrace.i(6314541449216L, 47047);
    if (this.lSa != null)
    {
      GMTrace.o(6314541449216L, 47047);
      return;
    }
    this.lSa = ((FavSearchActionView)View.inflate(this.vov.voR, R.i.cUm, null));
    this.lSl = this.lSa.findViewById(R.h.bfR);
    this.lSl.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6321252335616L, 47097);
        FavSearchUI.this.finish();
        GMTrace.o(6321252335616L, 47097);
      }
    });
    this.lSm = ((ImageButton)this.lSa.findViewById(R.h.ctj));
    this.lSm.setVisibility(8);
    this.lSa.lUq = new FavSearchActionView.a()
    {
      public final void Qu()
      {
        GMTrace.i(6440840331264L, 47988);
        w.d("MicroMsg.FavSearchUI", "on enter search, show tag panel");
        FavSearchUI.c(FavSearchUI.this);
        GMTrace.o(6440840331264L, 47988);
      }
      
      public final void a(final List<Integer> paramAnonymousList, final List<String> paramAnonymousList1, final List<String> paramAnonymousList2)
      {
        GMTrace.i(6441108766720L, 47990);
        FavSearchUI.a(FavSearchUI.this).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6443256250368L, 48006);
            FavSearchUI.a(FavSearchUI.this, paramAnonymousList, paramAnonymousList1, paramAnonymousList2);
            w.d("MicroMsg.FavSearchUI", "on text changed, types %s keys %s tags %s", new Object[] { paramAnonymousList, paramAnonymousList1, paramAnonymousList2 });
            FavSearchUI.b(FavSearchUI.this, paramAnonymousList1);
            FavSearchUI.c(FavSearchUI.this, paramAnonymousList2);
            FavSearchUI.d(FavSearchUI.this, paramAnonymousList);
            FavSearchUI.d(FavSearchUI.this).ax(paramAnonymousList2);
            FavSearchUI.e(FavSearchUI.this).az(paramAnonymousList);
            FavSearchUI.f(FavSearchUI.this).b(paramAnonymousList, paramAnonymousList1, paramAnonymousList2);
            FavSearchUI.a(FavSearchUI.this, false);
            GMTrace.o(6443256250368L, 48006);
          }
        });
        GMTrace.o(6441108766720L, 47990);
      }
      
      public final void a(List<Integer> paramAnonymousList, List<String> paramAnonymousList1, List<String> paramAnonymousList2, boolean paramAnonymousBoolean)
      {
        GMTrace.i(6440974548992L, 47989);
        w.d("MicroMsg.FavSearchUI", "on search, types %s keys %s tags %s", new Object[] { paramAnonymousList, paramAnonymousList1, paramAnonymousList2 });
        FavSearchUI.b(FavSearchUI.this, paramAnonymousList1);
        FavSearchUI.c(FavSearchUI.this, paramAnonymousList2);
        FavSearchUI.d(FavSearchUI.this, paramAnonymousList);
        FavSearchUI.d(FavSearchUI.this).ax(paramAnonymousList2);
        FavSearchUI.e(FavSearchUI.this).az(paramAnonymousList);
        if (paramAnonymousBoolean)
        {
          FavSearchUI.c(FavSearchUI.this);
          FavSearchUI.a(FavSearchUI.this, paramAnonymousList, paramAnonymousList1, paramAnonymousList2);
          GMTrace.o(6440974548992L, 47989);
          return;
        }
        FavSearchUI.f(FavSearchUI.this).b(paramAnonymousList, paramAnonymousList1, paramAnonymousList2);
        FavSearchUI.a(FavSearchUI.this, true);
        FavSearchUI.a(FavSearchUI.this, paramAnonymousList, paramAnonymousList1, paramAnonymousList2);
        GMTrace.o(6440974548992L, 47989);
      }
    };
    GMTrace.o(6314541449216L, 47047);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6314004578304L, 47043);
    int i = R.i.cUn;
    GMTrace.o(6314004578304L, 47043);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6314138796032L, 47044);
    super.onCreate(paramBundle);
    this.mHandler = new ae();
    rV("");
    this.hWX = getIntent().getIntExtra("key_search_type", 0);
    if (1 == this.hWX)
    {
      this.frE = getIntent().getStringExtra("key_to_user");
      this.lRW = getIntent().getStringExtra("key_fav_item_id");
    }
    this.lSc = ((ListView)findViewById(R.h.czM));
    this.kjQ = ((ListView)findViewById(R.h.ctO));
    this.lSd = findViewById(R.h.ctv);
    this.lSf = AnimationUtils.loadAnimation(this.vov.voR, R.a.aLN);
    this.lSg = AnimationUtils.loadAnimation(this.vov.voR, R.a.aLO);
    axI();
    this.lSb = ((FavTypePanel)View.inflate(this.vov.voR, R.i.cUt, null));
    this.lSb.lUF = new FavTypePanel.a()
    {
      public final void y(int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        GMTrace.i(6374536773632L, 47494);
        FavSearchActionView localFavSearchActionView;
        if (paramAnonymousBoolean)
        {
          localFavSearchActionView = FavSearchUI.a(FavSearchUI.this);
          localFavSearchActionView.lTy.add(Integer.valueOf(paramAnonymousInt));
          if (localFavSearchActionView.lSI != null)
          {
            localFavSearchActionView.axZ();
            FavTagPanel localFavTagPanel = localFavSearchActionView.lSI;
            String str = x.x(localFavSearchActionView.getContext(), paramAnonymousInt);
            if (bg.mZ(str)) {
              w.w("MicroMsg.FavTagPanel", "want to add type, but it is null or empty");
            }
            while (localFavSearchActionView.lUq != null)
            {
              localFavSearchActionView.xy(localFavSearchActionView.lSI.bXq());
              localFavSearchActionView.lUq.a(localFavSearchActionView.lTy, localFavSearchActionView.lUp, localFavSearchActionView.lUo, false);
              com.tencent.mm.plugin.report.service.g.paX.i(11126, new Object[] { Integer.valueOf(1) });
              GMTrace.o(6374536773632L, 47494);
              return;
              str = str.trim();
              Object localObject = localFavTagPanel.lUv.iterator();
              for (;;)
              {
                if (((Iterator)localObject).hasNext()) {
                  if (str.equals(((MMTagPanel.d)((Iterator)localObject).next()).vJu))
                  {
                    w.w("MicroMsg.FavTagPanel", "want to add type %s, but it exsited!", new Object[] { str });
                    break;
                  }
                }
              }
              localObject = localFavTagPanel.bXw();
              localFavTagPanel.lUv.add(localObject);
              localFavTagPanel.a((MMTagPanel.d)localObject, str, true);
              ((MMTagPanel.d)localObject).vJv.setOnClickListener(localFavTagPanel.lUx);
              localFavTagPanel.addView(((MMTagPanel.d)localObject).vJv, localFavTagPanel.lUv.size() - 1);
              localFavTagPanel.bXx();
            }
          }
        }
        else
        {
          localFavSearchActionView = FavSearchUI.a(FavSearchUI.this);
          localFavSearchActionView.lTy.remove(Integer.valueOf(paramAnonymousInt));
          if (localFavSearchActionView.lSI == null)
          {
            GMTrace.o(6374536773632L, 47494);
            return;
          }
          localFavSearchActionView.axZ();
          localFavSearchActionView.lSI.xB(x.x(localFavSearchActionView.getContext(), paramAnonymousInt));
          if (localFavSearchActionView.lUq == null)
          {
            GMTrace.o(6374536773632L, 47494);
            return;
          }
          localFavSearchActionView.xy(localFavSearchActionView.lSI.bXq());
          localFavSearchActionView.lUq.a(localFavSearchActionView.lTy, localFavSearchActionView.lUp, localFavSearchActionView.lUo, true);
        }
        GMTrace.o(6374536773632L, 47494);
      }
    };
    this.lSe = ((FavCapacityPanel)View.inflate(this.vov.voR, R.i.cTU, null));
    this.lSe.lTR = getIntent().getIntExtra("key_enter_fav_search_from", 0);
    this.lRZ = new c(this.vov.voR)
    {
      protected final void xu(String paramAnonymousString)
      {
        GMTrace.i(6372523507712L, 47479);
        FavSearchActionView localFavSearchActionView = FavSearchUI.a(FavSearchUI.this);
        localFavSearchActionView.lUo.add(paramAnonymousString);
        if (localFavSearchActionView.lSI == null)
        {
          GMTrace.o(6372523507712L, 47479);
          return;
        }
        localFavSearchActionView.lSI.UK("");
        localFavSearchActionView.lSI.aX(paramAnonymousString, true);
        if (localFavSearchActionView.lUq == null)
        {
          GMTrace.o(6372523507712L, 47479);
          return;
        }
        localFavSearchActionView.xy(localFavSearchActionView.lSI.bXq());
        localFavSearchActionView.lUq.a(localFavSearchActionView.lTy, localFavSearchActionView.lUp, localFavSearchActionView.lUo, false);
        com.tencent.mm.plugin.report.service.g.paX.i(11126, new Object[] { Integer.valueOf(2) });
        GMTrace.o(6372523507712L, 47479);
      }
      
      protected final void xv(String paramAnonymousString)
      {
        GMTrace.i(6372657725440L, 47480);
        FavSearchActionView localFavSearchActionView = FavSearchUI.a(FavSearchUI.this);
        localFavSearchActionView.lUo.remove(paramAnonymousString);
        if (localFavSearchActionView.lSI == null)
        {
          GMTrace.o(6372657725440L, 47480);
          return;
        }
        if (localFavSearchActionView.lUo.isEmpty()) {
          localFavSearchActionView.lSI.UK(localFavSearchActionView.getResources().getString(R.l.dwX));
        }
        localFavSearchActionView.lSI.removeTag(paramAnonymousString);
        if (localFavSearchActionView.lUq == null)
        {
          GMTrace.o(6372657725440L, 47480);
          return;
        }
        localFavSearchActionView.xy(localFavSearchActionView.lSI.bXq());
        localFavSearchActionView.lUq.a(localFavSearchActionView.lTy, localFavSearchActionView.lUp, localFavSearchActionView.lUo, true);
        GMTrace.o(6372657725440L, 47480);
      }
    };
    this.lSc.addHeaderView(this.lSb);
    if (com.tencent.mm.plugin.favorite.h.aww().awT() > 0)
    {
      paramBundle = (TextView)View.inflate(this.vov.voR, R.i.cUq, null);
      this.lSc.addHeaderView(paramBundle);
    }
    this.lSc.addFooterView(this.lSe);
    this.lSc.setAdapter(this.lRZ);
    this.lSc.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(6317896892416L, 47072);
        switch (paramAnonymousMotionEvent.getAction())
        {
        }
        for (;;)
        {
          GMTrace.o(6317896892416L, 47072);
          return false;
          FavSearchUI.this.aKl();
        }
      }
    });
    this.lRn = new com.tencent.mm.plugin.favorite.c.g(this.vov.voR, 16);
    this.lRo = new b(this.lRn, false);
    if (1 == this.hWX)
    {
      this.lRX = new HashSet();
      this.lRY = new com.tencent.mm.plugin.favorite.b.q();
      if (!bg.mZ(this.lRW))
      {
        paramBundle = this.lRW.split(",");
        int j = paramBundle.length;
        int i = 0;
        while (i < j)
        {
          int k = bg.getInt(paramBundle[i], Integer.MAX_VALUE);
          if (Integer.MAX_VALUE != k) {
            this.lRX.add(Integer.valueOf(k));
          }
          i += 1;
        }
      }
      this.lRo.e(this.lRX);
      this.lRo.a(this.lRY);
    }
    this.kjQ.setAdapter(this.lRo);
    this.kjQ.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, final int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(6372255072256L, 47477);
        final a.b localb = (a.b)paramAnonymousView.getTag();
        if (1 == FavSearchUI.g(FavSearchUI.this))
        {
          if (localb == null)
          {
            w.w("MicroMsg.FavSearchUI", "on item click, holder is null");
            GMTrace.o(6372255072256L, 47477);
            return;
          }
          if (localb.lPM == null)
          {
            w.w("MicroMsg.FavSearchUI", "on item click, info is null");
            GMTrace.o(6372255072256L, 47477);
            return;
          }
          paramAnonymousAdapterView = new d.a(FavSearchUI.this.vov.voR);
          paramAnonymousAdapterView.bx(FavSearchUI.h(FavSearchUI.this));
          e.a(paramAnonymousAdapterView, FavSearchUI.this.vov.voR, localb.lPM);
          e.b(paramAnonymousAdapterView, FavSearchUI.this.vov.voR, localb.lPM);
          {
            public final void a(boolean paramAnonymous2Boolean, String paramAnonymous2String, int paramAnonymous2Int)
            {
              GMTrace.i(6320715464704L, 47093);
              FavSearchUI.this.aKl();
              if (paramAnonymous2Boolean)
              {
                final com.tencent.mm.ui.base.q localq = com.tencent.mm.ui.base.h.a(FavSearchUI.this.vov.voR, FavSearchUI.this.getString(R.l.dWT), false, null);
                r.a(FavSearchUI.this.vov.voR, FavSearchUI.h(FavSearchUI.this), paramAnonymous2String, localb.lPM, new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(6325681520640L, 47130);
                    if (localq != null) {
                      localq.dismiss();
                    }
                    com.tencent.mm.ui.snackbar.a.e(FavSearchUI.this, FavSearchUI.this.getString(R.l.dZv));
                    af.i(new Runnable()
                    {
                      public final void run()
                      {
                        GMTrace.i(6312930836480L, 47035);
                        FavSearchUI.this.finish();
                        GMTrace.o(6312930836480L, 47035);
                      }
                    }, 1800L);
                    GMTrace.o(6325681520640L, 47130);
                  }
                });
              }
              GMTrace.o(6320715464704L, 47093);
            }
          }.show();
          GMTrace.o(6372255072256L, 47477);
          return;
        }
        if (2 == FavSearchUI.g(FavSearchUI.this))
        {
          if (localb == null)
          {
            w.w("MicroMsg.FavSearchUI", "on item click, holder is null");
            GMTrace.o(6372255072256L, 47477);
            return;
          }
          if (localb.lPM == null)
          {
            w.w("MicroMsg.FavSearchUI", "on item click, info is null");
            GMTrace.o(6372255072256L, 47477);
            return;
          }
          paramAnonymousAdapterView = new Intent();
          paramAnonymousAdapterView.putExtra("key_fav_result_local_id", localb.lPM.field_localId);
          FavSearchUI.this.setResult(-1, paramAnonymousAdapterView);
          FavSearchUI.this.finish();
          GMTrace.o(6372255072256L, 47477);
          return;
        }
        FavSearchUI.f(FavSearchUI.this).onItemClick(paramAnonymousAdapterView, paramAnonymousView, paramAnonymousInt, paramAnonymousLong);
        if (localb.lPM != null) {
          ap.xC().C(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(6370510241792L, 47464);
              w.d("MicroMsg.FavSearchUI", "type %s", new Object[] { Integer.valueOf(localb.lPM.field_type) });
              long l = localb.lPM.field_localId;
              if (FavSearchUI.i(FavSearchUI.this).size() == 0) {
                FavSearchUI.a(FavSearchUI.this, com.tencent.mm.plugin.favorite.h.awD().awS());
              }
              if (FavSearchUI.i(FavSearchUI.this).size() != 0)
              {
                localObject = FavSearchUI.i(FavSearchUI.this).iterator();
                j = 1;
                for (;;)
                {
                  i = j;
                  if (!((Iterator)localObject).hasNext()) {
                    break;
                  }
                  i = j;
                  if (((Long)((Iterator)localObject).next()).longValue() == l) {
                    break;
                  }
                  j += 1;
                }
              }
              int i = 1;
              Object localObject = com.tencent.mm.plugin.report.service.g.paX;
              int j = localb.lPM.field_type;
              int k = FavSearchUI.j(FavSearchUI.this);
              if (FavSearchUI.i(FavSearchUI.this).size() == 0) {
                i = paramAnonymousInt;
              }
              ((com.tencent.mm.plugin.report.service.g)localObject).i(12746, new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i) });
              GMTrace.o(6370510241792L, 47464);
            }
          });
        }
        GMTrace.o(6372255072256L, 47477);
      }
    });
    this.kjQ.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(6376415821824L, 47508);
        switch (paramAnonymousMotionEvent.getAction())
        {
        }
        for (;;)
        {
          GMTrace.o(6376415821824L, 47508);
          return false;
          FavSearchUI.this.aKl();
        }
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6415338962944L, 47798);
        FavSearchUI.this.finish();
        GMTrace.o(6415338962944L, 47798);
        return true;
      }
    });
    com.tencent.mm.plugin.favorite.h.aww().a(this.lRZ);
    ap.xC().h(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6362457178112L, 47404);
        FavSearchUI.a(FavSearchUI.this, com.tencent.mm.plugin.favorite.h.awD().awS());
        GMTrace.o(6362457178112L, 47404);
      }
    }, 1000L);
    GMTrace.o(6314138796032L, 47044);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(6314407231488L, 47046);
    w.d("MicroMsg.FavSearchUI", "on create options menu");
    axI();
    this.lSn = paramMenu.add(0, R.h.cca, 0, R.l.dvl);
    m.a(this.lSn, this.lSa);
    m.a(this.lSn, 9);
    this.lSa.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6467952312320L, 48190);
        FavSearchActionView localFavSearchActionView = FavSearchUI.a(FavSearchUI.this);
        if (localFavSearchActionView.lSI != null) {
          localFavSearchActionView.lSI.bXt();
        }
        FavSearchUI.this.aKp();
        GMTrace.o(6467952312320L, 48190);
      }
    });
    m.a(this.lSn, new m.e()
    {
      public final boolean onMenuItemActionCollapse(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6325413085184L, 47128);
        FavSearchUI.this.finish();
        GMTrace.o(6325413085184L, 47128);
        return true;
      }
      
      public final boolean onMenuItemActionExpand(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6325278867456L, 47127);
        GMTrace.o(6325278867456L, 47127);
        return true;
      }
    });
    this.mHandler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6366752145408L, 47436);
        if (FavSearchUI.b(FavSearchUI.this) != null)
        {
          m.b(FavSearchUI.b(FavSearchUI.this));
          Toolbar.LayoutParams localLayoutParams = (Toolbar.LayoutParams)FavSearchUI.a(FavSearchUI.this).getLayoutParams();
          if (localLayoutParams != null)
          {
            localLayoutParams.height = -1;
            localLayoutParams.width = -1;
          }
          FavSearchUI.a(FavSearchUI.this).setLayoutParams(localLayoutParams);
        }
        GMTrace.o(6366752145408L, 47436);
      }
    });
    GMTrace.o(6314407231488L, 47046);
    return true;
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6314273013760L, 47045);
    super.onDestroy();
    this.lRn.destory();
    this.lRn = null;
    com.tencent.mm.plugin.favorite.h.aww().a(this.lRZ);
    com.tencent.mm.plugin.favorite.h.aww().c(this.lSk);
    if (this.lRo != null) {
      this.lRo.finish();
    }
    GMTrace.o(6314273013760L, 47045);
  }
  
  protected void onResume()
  {
    GMTrace.i(6314675666944L, 47048);
    this.lRo.axT();
    this.lRo.notifyDataSetChanged();
    FavCapacityPanel localFavCapacityPanel = this.lSe;
    TextView localTextView;
    Context localContext;
    int i;
    if (localFavCapacityPanel.lTP != x.axg() / 1048576L)
    {
      localFavCapacityPanel.lTP = (x.axg() / 1048576L);
      localTextView = localFavCapacityPanel.lTQ;
      localContext = localFavCapacityPanel.lTQ.getContext();
      i = R.l.dVR;
      if (localFavCapacityPanel.lTS - localFavCapacityPanel.lTP <= 0L) {
        break label153;
      }
    }
    label153:
    for (long l = localFavCapacityPanel.lTS - localFavCapacityPanel.lTP;; l = 0L)
    {
      localTextView.setText(localContext.getString(i, new Object[] { Long.valueOf(l), Long.valueOf(localFavCapacityPanel.lTP) }));
      super.onResume();
      GMTrace.o(6314675666944L, 47048);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/FavSearchUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */