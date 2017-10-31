package com.tencent.mm.plugin.game.ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.plugin.game.model.SubCoreGameCenter;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.as;
import com.tencent.mm.plugin.game.model.z;
import com.tencent.mm.pluginsdk.h;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.ap;
import java.util.HashMap;
import java.util.LinkedList;

public class GameLibraryUI
  extends MMActivity
  implements com.tencent.mm.ac.e
{
  private View jJt;
  private Dialog lou;
  private int mBs;
  private int mBx;
  private ListView mHW;
  private k mHX;
  private boolean mHY;
  private boolean mHZ;
  private boolean mIT;
  private j mIc;
  private l.a mIe;
  private AbsListView.OnScrollListener mIf;
  private View.OnClickListener mJb;
  private GameBannerView mMM;
  private GameLibraryCategoriesView mMN;
  private View mMO;
  private TextView mMP;
  private View mMQ;
  private GameDropdownView mMR;
  private HashMap<Integer, String> mMS;
  private int mMT;
  private View mMU;
  private Button mMV;
  private boolean mMW;
  private int mMX;
  private int mMY;
  private View.OnClickListener mMZ;
  private GameDropdownView.a mNa;
  private boolean mlH;
  
  public GameLibraryUI()
  {
    GMTrace.i(12710150406144L, 94698);
    this.mMT = 0;
    this.mlH = false;
    this.mHY = false;
    this.mBx = 0;
    this.mHZ = true;
    this.mMW = false;
    this.mIT = true;
    this.mBs = 0;
    this.mMX = 990;
    this.mMY = 0;
    this.mIc = new j();
    this.mIe = new l.a()
    {
      public final void oB(int paramAnonymousInt)
      {
        GMTrace.i(12689883529216L, 94547);
        int i = GameLibraryUI.b(GameLibraryUI.this).getFirstVisiblePosition() - GameLibraryUI.c(GameLibraryUI.this);
        int j = GameLibraryUI.b(GameLibraryUI.this).getLastVisiblePosition();
        int k = GameLibraryUI.c(GameLibraryUI.this);
        if ((paramAnonymousInt >= i) && (paramAnonymousInt <= j - k))
        {
          View localView = GameLibraryUI.b(GameLibraryUI.this).getChildAt(paramAnonymousInt - i);
          GameLibraryUI.d(GameLibraryUI.this).w(localView, paramAnonymousInt);
        }
        GMTrace.o(12689883529216L, 94547);
      }
    };
    this.mMZ = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12730417283072L, 94849);
        c.a(paramAnonymousView, GameLibraryUI.this);
        ai.a(GameLibraryUI.this, 11, 1110, 999, 7, GameLibraryUI.e(GameLibraryUI.this), null);
        GMTrace.o(12730417283072L, 94849);
      }
    };
    this.mJb = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12694446931968L, 94581);
        int i = 6;
        if ((paramAnonymousView.getTag() instanceof String))
        {
          c.a(paramAnonymousView, GameLibraryUI.this);
          i = 7;
        }
        for (;;)
        {
          ai.a(GameLibraryUI.this, 11, 1113, 1, i, GameLibraryUI.e(GameLibraryUI.this), null);
          GMTrace.o(12694446931968L, 94581);
          return;
          paramAnonymousView = new Intent(GameLibraryUI.this, GameCategoryUI.class);
          paramAnonymousView.putExtra("extra_type", 2);
          paramAnonymousView.putExtra("extra_category_name", GameLibraryUI.this.getString(R.l.edn));
          paramAnonymousView.putExtra("game_report_from_scene", 1113);
          GameLibraryUI.this.startActivity(paramAnonymousView);
        }
      }
    };
    this.mNa = new GameDropdownView.a()
    {
      public final void oG(int paramAnonymousInt)
      {
        GMTrace.i(12659684540416L, 94322);
        LinkedList localLinkedList = new LinkedList();
        localLinkedList.addAll(GameLibraryUI.f(GameLibraryUI.this).keySet());
        if (paramAnonymousInt > localLinkedList.size() - 1)
        {
          GMTrace.o(12659684540416L, 94322);
          return;
        }
        GameLibraryUI.a(GameLibraryUI.this, ((Integer)localLinkedList.get(paramAnonymousInt)).intValue());
        w.i("MicroMsg.GameLibraryUI", "Selected SortType: %d", new Object[] { Integer.valueOf(GameLibraryUI.g(GameLibraryUI.this)) });
        GameLibraryUI.b(GameLibraryUI.this, 0);
        GameLibraryUI.h(GameLibraryUI.this);
        ai.a(GameLibraryUI.this, 11, 1111, GameLibraryUI.g(GameLibraryUI.this) + GameLibraryUI.i(GameLibraryUI.this), 2, GameLibraryUI.e(GameLibraryUI.this), null);
        GMTrace.o(12659684540416L, 94322);
      }
    };
    this.mIf = new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(12719411429376L, 94767);
        GMTrace.o(12719411429376L, 94767);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(12719277211648L, 94766);
        if ((paramAnonymousInt == 0) && (paramAnonymousAbsListView.getLastVisiblePosition() == paramAnonymousAbsListView.getCount() - 1))
        {
          if ((!GameLibraryUI.j(GameLibraryUI.this)) || (GameLibraryUI.k(GameLibraryUI.this)))
          {
            GMTrace.o(12719277211648L, 94766);
            return;
          }
          GameLibraryUI.l(GameLibraryUI.this).setVisibility(0);
          GameLibraryUI.h(GameLibraryUI.this);
        }
        GMTrace.o(12719277211648L, 94766);
      }
    };
    GMTrace.o(12710150406144L, 94698);
  }
  
  private void aFB()
  {
    GMTrace.i(12711492583424L, 94708);
    Object localObject = com.tencent.mm.plugin.game.model.e.aEe();
    int i = this.mBx;
    int j = this.mMT;
    if (this.mBx == 0) {}
    for (boolean bool = true;; bool = false)
    {
      localObject = new as(i, (LinkedList)localObject, j, bool);
      ap.wT().a((com.tencent.mm.ac.k)localObject, 0);
      this.mHY = true;
      GMTrace.o(12711492583424L, 94708);
      return;
    }
  }
  
  private void goBack()
  {
    GMTrace.i(12711358365696L, 94707);
    Object localObject = getIntent().getStringExtra("jump_game_center");
    if ((!bg.mZ((String)localObject)) && (((String)localObject).equals("jump_game_center")))
    {
      localObject = new Intent(this, GameCenterUI.class);
      ((Intent)localObject).putExtra("jump_find_more_friends", "jump_find_more_friends");
      startActivity((Intent)localObject);
    }
    finish();
    GMTrace.o(12711358365696L, 94707);
  }
  
  protected final void MH()
  {
    GMTrace.i(12711224147968L, 94706);
    oC(R.l.cWv);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12767058722816L, 95122);
        GameLibraryUI.a(GameLibraryUI.this);
        GMTrace.o(12767058722816L, 95122);
        return true;
      }
    });
    if (!bg.mZ(SubCoreGameCenter.aFc())) {
      a(0, R.l.eMS, R.k.dkM, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(12696325980160L, 94595);
          paramAnonymousMenuItem = new Intent(GameLibraryUI.this, GameSearchUI.class);
          paramAnonymousMenuItem.putExtra("game_report_from_scene", 1109);
          GameLibraryUI.this.startActivity(paramAnonymousMenuItem);
          GMTrace.o(12696325980160L, 94595);
          return true;
        }
      });
    }
    this.mHW = ((ListView)findViewById(R.h.bMR));
    this.mHW.setOnItemClickListener(this.mIc);
    this.mIc.oz(this.mBs);
    this.mHW.setOnScrollListener(this.mIf);
    this.mHX = new k(this);
    this.mHX.oz(this.mBs);
    this.mHX.a(this.mIe);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.vov.voR.getSystemService("layout_inflater");
    Object localObject = localLayoutInflater.inflate(R.i.bMU, this.mHW, false);
    this.mMM = ((GameBannerView)((View)localObject).findViewById(R.h.bMU));
    this.mMM.mBs = this.mBs;
    this.mHW.addHeaderView((View)localObject);
    this.mMY += 1;
    this.mMN = ((GameLibraryCategoriesView)localLayoutInflater.inflate(R.i.cWx, this.mHW, false));
    localObject = new LinearLayout(this);
    ((LinearLayout)localObject).addView(this.mMN);
    this.mHW.addHeaderView((View)localObject);
    this.mMY += 1;
    this.mMO = localLayoutInflater.inflate(R.i.cWB, this.mHW, false);
    this.mMO.setOnClickListener(this.mMZ);
    this.mMP = ((TextView)this.mMO.findViewById(R.h.bMT));
    this.mMQ = localLayoutInflater.inflate(R.i.cWw, this.mHW, false);
    this.mMQ.setOnClickListener(null);
    this.mMR = ((GameDropdownView)this.mMQ.findViewById(R.h.bMP));
    this.mMR.mLw = this.mMQ;
    this.mMR.mLv = this.mNa;
    this.jJt = localLayoutInflater.inflate(R.i.cWC, this.mHW, false);
    this.jJt.setVisibility(8);
    localObject = new LinearLayout(this);
    ((LinearLayout)localObject).addView(this.jJt);
    this.mHW.addFooterView((View)localObject);
    this.mMU = localLayoutInflater.inflate(R.i.cWA, this.mHW, false);
    this.mMU.setVisibility(8);
    this.mMV = ((Button)this.mMU.findViewById(R.h.bMS));
    this.mMV.setOnClickListener(this.mJb);
    this.mHW.addFooterView(this.mMU);
    this.mHW.setAdapter(this.mHX);
    GMTrace.o(12711224147968L, 94706);
  }
  
  protected final int Qb()
  {
    GMTrace.i(12711089930240L, 94705);
    GMTrace.o(12711089930240L, 94705);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, final String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(12711626801152L, 94709);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      switch (paramk.getType())
      {
      }
      for (;;)
      {
        GMTrace.o(12711626801152L, 94709);
        return;
        paramString = ((as)paramk).lnP.hlV.hmc;
        ap.xC().C(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(12700486729728L, 94626);
            final Object localObject = paramString;
            if ((GameLibraryUI.m(GameLibraryUI.this) == 0) && (!GameLibraryUI.n(GameLibraryUI.this))) {}
            for (boolean bool = true;; bool = false)
            {
              localObject = new com.tencent.mm.plugin.game.model.af((com.tencent.mm.bl.a)localObject, bool, GameLibraryUI.m(GameLibraryUI.this));
              GameLibraryUI.o(GameLibraryUI.this);
              com.tencent.mm.sdk.platformtools.af.u(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(12662100459520L, 94340);
                  GameLibraryUI localGameLibraryUI = GameLibraryUI.this;
                  com.tencent.mm.plugin.game.model.af localaf = localObject;
                  if (GameLibraryUI.m(GameLibraryUI.this) != 0) {}
                  for (boolean bool = true;; bool = false)
                  {
                    GameLibraryUI.a(localGameLibraryUI, localaf, bool);
                    GameLibraryUI.p(GameLibraryUI.this);
                    GameLibraryUI.l(GameLibraryUI.this).setVisibility(8);
                    GameLibraryUI.b(GameLibraryUI.this, GameLibraryUI.m(GameLibraryUI.this) + 15);
                    if (GameLibraryUI.q(GameLibraryUI.this) != null) {
                      GameLibraryUI.q(GameLibraryUI.this).dismiss();
                    }
                    GMTrace.o(12662100459520L, 94340);
                    return;
                  }
                }
              });
              GMTrace.o(12700486729728L, 94626);
              return;
            }
          }
        });
      }
    }
    if (!com.tencent.mm.plugin.game.a.a.ifN.a(this, paramInt1, paramInt2, paramString)) {
      Toast.makeText(this, getString(R.l.edv, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
    }
    if (this.lou != null) {
      this.lou.cancel();
    }
    GMTrace.o(12711626801152L, 94709);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12710955712512L, 94704);
    int i = R.i.cWv;
    GMTrace.o(12710955712512L, 94704);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(12711761018880L, 94710);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    w.i("MicroMsg.GameLibraryUI", "requestCode = %d, resultCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 != 1)
    {
      w.e("MicroMsg.GameLibraryUI", "error request code");
      GMTrace.o(12711761018880L, 94710);
      return;
    }
    GMTrace.o(12711761018880L, 94710);
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    GMTrace.i(12710284623872L, 94699);
    super.onCreate(paramBundle);
    if (!ap.AV())
    {
      w.e("MicroMsg.GameLibraryUI", "account not ready");
      finish();
      GMTrace.o(12710284623872L, 94699);
      return;
    }
    this.mBs = getIntent().getIntExtra("game_report_from_scene", 0);
    ap.wT().a(1218, this);
    MH();
    paramBundle = SubCoreGameCenter.aFi().zd("pb_library");
    if (paramBundle == null) {
      w.i("MicroMsg.GameLibraryUI", "No cache found");
    }
    for (int i = 0;; i = 1)
    {
      if (i == 0)
      {
        this.lou = c.cD(this);
        this.lou.show();
      }
      aFB();
      ai.a(this, 11, 1100, 0, 1, this.mBs, null);
      GMTrace.o(12710284623872L, 94699);
      return;
      ap.xC().C(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12772964302848L, 95166);
          com.tencent.mm.sdk.platformtools.af.u(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(12719008776192L, 94764);
              GameLibraryUI.a(GameLibraryUI.this, this.mNc, false);
              GMTrace.o(12719008776192L, 94764);
            }
          });
          GMTrace.o(12772964302848L, 95166);
        }
      });
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12710687277056L, 94702);
    w.i("MicroMsg.GameLibraryUI", "onDestroy");
    super.onDestroy();
    ap.wT().b(1218, this);
    this.mHX.clear();
    if (this.mMM != null) {
      this.mMM.mHP.MM();
    }
    GMTrace.o(12710687277056L, 94702);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(12710821494784L, 94703);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      GMTrace.o(12710821494784L, 94703);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(12710821494784L, 94703);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(12710553059328L, 94701);
    super.onPause();
    if (this.mMM != null)
    {
      GameBannerView localGameBannerView = this.mMM;
      if (localGameBannerView.mHP != null)
      {
        localGameBannerView.mHP.MM();
        w.i("MicroMsg.GameBannerView", "Auto scroll stopped");
      }
    }
    GMTrace.o(12710553059328L, 94701);
  }
  
  protected void onResume()
  {
    GMTrace.i(12710418841600L, 94700);
    super.onResume();
    if (!ap.AV())
    {
      w.e("MicroMsg.GameLibraryUI", "account not ready");
      GMTrace.o(12710418841600L, 94700);
      return;
    }
    this.mHX.refresh();
    if ((!this.mIT) && (this.mMM != null))
    {
      GameBannerView localGameBannerView = this.mMM;
      if ((localGameBannerView.mHP != null) && (localGameBannerView.mHP.bNt()) && (localGameBannerView.mHO.size() > 1))
      {
        localGameBannerView.mHP.w(5000L, 5000L);
        w.i("MicroMsg.GameBannerView", "Auto scroll restarted");
      }
    }
    if (this.mIT) {
      this.mIT = false;
    }
    GMTrace.o(12710418841600L, 94700);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameLibraryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */