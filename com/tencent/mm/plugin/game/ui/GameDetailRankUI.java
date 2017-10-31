package com.tencent.mm.plugin.game.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.game.model.ad;
import com.tencent.mm.plugin.game.model.c;
import com.tencent.mm.plugin.game.model.l;
import com.tencent.mm.plugin.game.model.m;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.q;
import com.tencent.mm.x.q.b;

public class GameDetailRankUI
  extends MMActivity
{
  public static String EXTRA_SESSION_ID;
  public static String mKi;
  private String appId;
  private ListView mKf;
  private GameRankHeadView mKg;
  private h mKh;
  
  static
  {
    GMTrace.i(12666261209088L, 94371);
    EXTRA_SESSION_ID = "extra_session_id";
    mKi = "gameDetailRankDataKey";
    GMTrace.o(12666261209088L, 94371);
  }
  
  public GameDetailRankUI()
  {
    GMTrace.i(12665187467264L, 94363);
    GMTrace.o(12665187467264L, 94363);
  }
  
  protected final void MH()
  {
    GMTrace.i(12665858555904L, 94368);
    rV(g.m(this.vov.voR, this.appId));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12770414166016L, 95147);
        GameDetailRankUI.this.finish();
        GMTrace.o(12770414166016L, 95147);
        return true;
      }
    });
    GMTrace.o(12665858555904L, 94368);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12665724338176L, 94367);
    int i = R.i.cWh;
    GMTrace.o(12665724338176L, 94367);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12665321684992L, 94364);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra(EXTRA_SESSION_ID);
    paramBundle = q.Aw().gh(paramBundle);
    if (paramBundle == null)
    {
      finish();
      GMTrace.o(12665321684992L, 94364);
      return;
    }
    paramBundle = (a)paramBundle.get(mKi);
    this.mKf = ((ListView)findViewById(R.h.bMj));
    Object localObject;
    if ((!bg.mZ(paramBundle.mKk)) && (!bg.mZ(paramBundle.mKl)))
    {
      localObject = ((LayoutInflater)this.vov.voR.getSystemService("layout_inflater")).inflate(R.i.cWo, this.mKf, false);
      this.mKg = ((GameRankHeadView)((View)localObject).findViewById(R.h.bNp));
      this.mKf.addHeaderView((View)localObject);
      localObject = this.mKg;
      ((GameRankHeadView)localObject).jaE.setText(paramBundle.mKk);
      ((GameRankHeadView)localObject).mOO.setText(paramBundle.mKl);
      ((GameRankHeadView)localObject).mBO = paramBundle.mKm;
      ((GameRankHeadView)localObject).mBO.fKV = 1203;
      ((GameRankHeadView)localObject).mBO.position = 2;
      if (((GameRankHeadView)localObject).mKt == null) {
        ((GameRankHeadView)localObject).mKt = new m(((GameRankHeadView)localObject).mBO);
      }
      ((GameRankHeadView)localObject).mKt.cA(((GameRankHeadView)localObject).getContext());
      ((GameRankHeadView)localObject).mKt.aEn();
      ((GameRankHeadView)localObject).aFI();
      if (((GameRankHeadView)localObject).mKr == null) {
        break label329;
      }
      l.a(((GameRankHeadView)localObject).mKr);
    }
    for (;;)
    {
      ((GameRankHeadView)localObject).mJP.setOnClickListener((View.OnClickListener)localObject);
      this.mKh = new h(this);
      this.mKh.CM = R.i.cWi;
      this.mKf.setAdapter(this.mKh);
      this.appId = paramBundle.mKm.field_appId;
      if (!bg.mZ(this.appId)) {
        break;
      }
      finish();
      GMTrace.o(12665321684992L, 94364);
      return;
      label329:
      ((GameRankHeadView)localObject).mKr = new GameRankHeadView.1((GameRankHeadView)localObject);
      l.a(((GameRankHeadView)localObject).mKr);
    }
    MH();
    ap.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12744107491328L, 94951);
        ad localad = new ad(GameDetailRankUI.a(GameDetailRankUI.this));
        GameDetailRankUI.b(GameDetailRankUI.this).a(localad);
        GMTrace.o(12744107491328L, 94951);
      }
    });
    GMTrace.o(12665321684992L, 94364);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12665590120448L, 94366);
    super.onDestroy();
    l.b(this.mKg.mKr);
    GMTrace.o(12665590120448L, 94366);
  }
  
  public void onResume()
  {
    GMTrace.i(12665455902720L, 94365);
    super.onResume();
    GMTrace.o(12665455902720L, 94365);
  }
  
  public static final class a
  {
    public String mKk;
    public String mKl;
    c mKm;
    
    public a()
    {
      GMTrace.i(12705587003392L, 94664);
      GMTrace.o(12705587003392L, 94664);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameDetailRankUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */