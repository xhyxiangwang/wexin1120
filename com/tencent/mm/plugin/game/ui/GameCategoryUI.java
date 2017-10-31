package com.tencent.mm.plugin.game.ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.n;
import com.tencent.mm.bl.a;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.plugin.game.model.SubCoreGameCenter;
import com.tencent.mm.plugin.game.model.ab;
import com.tencent.mm.plugin.game.model.at;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.ap;

public class GameCategoryUI
  extends MMActivity
  implements e
{
  private View jJt;
  private Dialog jrO;
  private int mBs;
  private int mBx;
  private ListView mHW;
  private k mHX;
  private boolean mHY;
  private boolean mHZ;
  private int mIa;
  private String mIb;
  private j mIc;
  private l.a mIe;
  private AbsListView.OnScrollListener mIf;
  private int mType;
  
  public GameCategoryUI()
  {
    GMTrace.i(12679011893248L, 94466);
    this.mHY = false;
    this.mBx = 0;
    this.mHZ = false;
    this.mBs = 0;
    this.mIc = new j();
    this.mIe = new l.a()
    {
      public final void oB(int paramAnonymousInt)
      {
        GMTrace.i(12731088371712L, 94854);
        int i = GameCategoryUI.b(GameCategoryUI.this).getFirstVisiblePosition();
        int j = GameCategoryUI.b(GameCategoryUI.this).getLastVisiblePosition();
        if ((paramAnonymousInt >= i) && (paramAnonymousInt <= j))
        {
          View localView = GameCategoryUI.b(GameCategoryUI.this).getChildAt(paramAnonymousInt - i);
          GameCategoryUI.c(GameCategoryUI.this).w(localView, paramAnonymousInt);
        }
        GMTrace.o(12731088371712L, 94854);
      }
    };
    this.mIf = new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(12694178496512L, 94579);
        GMTrace.o(12694178496512L, 94579);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(12694044278784L, 94578);
        if ((paramAnonymousInt == 0) && (paramAnonymousAbsListView.getLastVisiblePosition() == paramAnonymousAbsListView.getCount() - 1))
        {
          if ((!GameCategoryUI.d(GameCategoryUI.this)) || (GameCategoryUI.e(GameCategoryUI.this)))
          {
            GMTrace.o(12694044278784L, 94578);
            return;
          }
          GameCategoryUI.f(GameCategoryUI.this).setVisibility(0);
          GameCategoryUI.g(GameCategoryUI.this);
        }
        GMTrace.o(12694044278784L, 94578);
      }
    };
    GMTrace.o(12679011893248L, 94466);
  }
  
  private void aFu()
  {
    GMTrace.i(12679548764160L, 94470);
    at localat = new at(this.mBx, this.mType, this.mIa);
    ap.wT().a(localat, 0);
    this.mHY = true;
    GMTrace.o(12679548764160L, 94470);
  }
  
  public final void a(int paramInt1, int paramInt2, final String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(12679682981888L, 94471);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      w.e("MicroMsg.GameCategoryUI", "errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      GMTrace.o(12679682981888L, 94471);
      return;
    }
    paramString = ((at)paramk).lnP.hlV.hmc;
    ap.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12688809787392L, 94539);
        af.u(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(12759139876864L, 95063);
            GameCategoryUI localGameCategoryUI = GameCategoryUI.this;
            ab localab = this.mIi;
            if (GameCategoryUI.h(GameCategoryUI.this) != 0) {}
            for (boolean bool = true;; bool = false)
            {
              GameCategoryUI.a(localGameCategoryUI, localab, bool);
              GameCategoryUI.i(GameCategoryUI.this);
              GameCategoryUI.f(GameCategoryUI.this).setVisibility(8);
              GameCategoryUI.a(GameCategoryUI.this, GameCategoryUI.h(GameCategoryUI.this) + 15);
              if (GameCategoryUI.j(GameCategoryUI.this) != null) {
                GameCategoryUI.j(GameCategoryUI.this).dismiss();
              }
              GMTrace.o(12759139876864L, 95063);
              return;
            }
          }
        });
        GMTrace.o(12688809787392L, 94539);
      }
    });
    GMTrace.o(12679682981888L, 94471);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12679414546432L, 94469);
    int i = R.i.cVQ;
    GMTrace.o(12679414546432L, 94469);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(12679817199616L, 94472);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    w.i("MicroMsg.GameCategoryUI", "requestCode = %d, resultCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 != 1)
    {
      w.e("MicroMsg.GameCategoryUI", "error request code");
      GMTrace.o(12679817199616L, 94472);
      return;
    }
    String str = null;
    if (paramIntent != null) {
      str = paramIntent.getStringExtra("game_app_id");
    }
    switch (paramInt2)
    {
    }
    for (;;)
    {
      GMTrace.o(12679817199616L, 94472);
      return;
      if (bg.mZ(str))
      {
        GMTrace.o(12679817199616L, 94472);
        return;
      }
      this.mHX.zm(str);
      GMTrace.o(12679817199616L, 94472);
      return;
      if (bg.mZ(str))
      {
        GMTrace.o(12679817199616L, 94472);
        return;
      }
      this.mHX.zl(str);
      this.mHX.zn(str);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12679146110976L, 94467);
    super.onCreate(paramBundle);
    this.mType = getIntent().getIntExtra("extra_type", 0);
    this.mIa = getIntent().getIntExtra("extra_category_id", 0);
    this.mIb = getIntent().getStringExtra("extra_category_name");
    this.mBs = getIntent().getIntExtra("game_report_from_scene", 0);
    ap.wT().a(1220, this);
    rV(this.mIb);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12729880412160L, 94845);
        GameCategoryUI.this.finish();
        GMTrace.o(12729880412160L, 94845);
        return true;
      }
    });
    if (!bg.mZ(SubCoreGameCenter.aFc())) {
      a(0, R.l.eMS, R.k.dkM, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(12690151964672L, 94549);
          paramAnonymousMenuItem = new Intent(GameCategoryUI.this, GameSearchUI.class);
          switch (GameCategoryUI.a(GameCategoryUI.this))
          {
          }
          for (;;)
          {
            GameCategoryUI.this.startActivity(paramAnonymousMenuItem);
            GMTrace.o(12690151964672L, 94549);
            return true;
            paramAnonymousMenuItem.putExtra("game_report_from_scene", 1602);
            continue;
            paramAnonymousMenuItem.putExtra("game_report_from_scene", 1502);
          }
        }
      });
    }
    this.mHW = ((ListView)findViewById(R.h.bLf));
    this.mHW.setOnItemClickListener(this.mIc);
    this.mIc.oz(this.mBs);
    this.mHW.setOnScrollListener(this.mIf);
    this.mHX = new k(this);
    this.mHX.oz(this.mBs);
    this.mHX.a(this.mIe);
    this.jJt = ((LayoutInflater)this.vov.voR.getSystemService("layout_inflater")).inflate(R.i.cWC, this.mHW, false);
    this.jJt.setVisibility(8);
    this.mHW.addFooterView(this.jJt);
    this.mHW.setAdapter(this.mHX);
    this.jrO = c.cD(this);
    this.jrO.show();
    aFu();
    GMTrace.o(12679146110976L, 94467);
  }
  
  public void onDestroy()
  {
    GMTrace.i(12679280328704L, 94468);
    super.onDestroy();
    ap.wT().b(1220, this);
    this.mHX.clear();
    GMTrace.o(12679280328704L, 94468);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameCategoryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */