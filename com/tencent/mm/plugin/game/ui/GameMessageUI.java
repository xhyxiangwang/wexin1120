package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.game.a.a;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.plugin.game.model.SubCoreGameCenter;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.q;
import com.tencent.mm.plugin.game.model.q.d;
import com.tencent.mm.plugin.game.model.r;
import com.tencent.mm.plugin.game.model.t;
import com.tencent.mm.plugin.game.model.u;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.ap;
import java.util.HashMap;

public class GameMessageUI
  extends GameCenterActivity
  implements AdapterView.OnItemClickListener, com.tencent.mm.ac.e
{
  private int gDo;
  private int kjz;
  private AbsListView.OnScrollListener mIf;
  private ListView mOg;
  private m mOh;
  private TextView mOi;
  private View mOj;
  private int mOk;
  private boolean mOl;
  private boolean mOm;
  private String mOn;
  private DialogInterface.OnClickListener mOo;
  private DialogInterface.OnClickListener mOp;
  
  public GameMessageUI()
  {
    GMTrace.i(12759274094592L, 95064);
    this.mOk = 1;
    this.mOl = false;
    this.mOm = false;
    this.gDo = 0;
    this.mOn = "";
    this.mIf = new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(12729611976704L, 94843);
        GMTrace.o(12729611976704L, 94843);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(12729477758976L, 94842);
        if ((paramAnonymousInt == 0) && (paramAnonymousAbsListView.getLastVisiblePosition() == paramAnonymousAbsListView.getCount() - 1) && (!GameMessageUI.b(GameMessageUI.this).alk()))
        {
          paramAnonymousAbsListView = GameMessageUI.b(GameMessageUI.this);
          if (!paramAnonymousAbsListView.alk()) {
            break label90;
          }
          if (paramAnonymousAbsListView.voo != null) {
            paramAnonymousAbsListView.voo.Qx();
          }
        }
        for (;;)
        {
          GameMessageUI.b(GameMessageUI.this).a(null, null);
          GMTrace.o(12729477758976L, 94842);
          return;
          label90:
          paramAnonymousAbsListView.kye += 15;
          if (paramAnonymousAbsListView.kye > paramAnonymousAbsListView.hIP) {
            paramAnonymousAbsListView.kye = paramAnonymousAbsListView.hIP;
          }
        }
      }
    };
    GMTrace.o(12759274094592L, 95064);
  }
  
  private void goBack()
  {
    GMTrace.i(12760079400960L, 95070);
    SubCoreGameCenter.aFe().aEA();
    finish();
    GMTrace.o(12760079400960L, 95070);
  }
  
  private void oJ(int paramInt)
  {
    GMTrace.i(12759810965504L, 95068);
    if (this.mOi == null) {
      this.mOi = ((TextView)findViewById(R.h.bNf));
    }
    this.mOi.setVisibility(paramInt);
    GMTrace.o(12759810965504L, 95068);
  }
  
  protected final void MH()
  {
    GMTrace.i(12759676747776L, 95067);
    oC(R.l.cWM);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12723706396672L, 94799);
        GameMessageUI.a(GameMessageUI.this);
        GMTrace.o(12723706396672L, 94799);
        return true;
      }
    });
    a(0, getString(R.l.duQ), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12668006039552L, 94384);
        GameMessageUI.a(GameMessageUI.this, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(12773232738304L, 95168);
            SubCoreGameCenter.aFe().eL("GameRawMessage", "delete from GameRawMessage");
            GameMessageUI.b(GameMessageUI.this).QB();
            GameMessageUI.b(GameMessageUI.this).notifyDataSetChanged();
            GMTrace.o(12773232738304L, 95168);
          }
        });
        GameMessageUI.b(GameMessageUI.this, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(12681696247808L, 94486);
            GMTrace.o(12681696247808L, 94486);
          }
        });
        com.tencent.mm.ui.base.h.a(GameMessageUI.this.vov.voR, R.l.ecQ, 0, GameMessageUI.c(GameMessageUI.this), GameMessageUI.d(GameMessageUI.this));
        GMTrace.o(12668006039552L, 94384);
        return false;
      }
    });
    this.kjz = getIntent().getIntExtra("game_report_from_scene", 0);
    this.mOg = ((ListView)findViewById(R.h.bNh));
    this.mOg.setOnItemClickListener(this);
    if (this.gDo > 20)
    {
      if (!getSharedPreferences("game_center_pref", 0).getBoolean("show_message_tips", true)) {
        break label298;
      }
      this.mOj = View.inflate(this, R.i.cWP, null);
      this.mOj.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(12756723957760L, 95045);
          if (!bg.mZ(GameMessageUI.f(GameMessageUI.this)))
          {
            int i = c.aa(GameMessageUI.this.vov.voR, GameMessageUI.f(GameMessageUI.this));
            ai.a(GameMessageUI.this.vov.voR, 13, 1302, 1, i, GameMessageUI.g(GameMessageUI.this), null);
          }
          GameMessageUI.h(GameMessageUI.this);
          GMTrace.o(12756723957760L, 95045);
        }
      });
      this.mOg.addHeaderView(this.mOj);
      this.mOj.setVisibility(0);
      getSharedPreferences("game_center_pref", 0).edit().putBoolean("show_message_tips", false).apply();
    }
    for (;;)
    {
      q localq = new q();
      localq.mBb = true;
      this.mOh = new m(this, localq, this.kjz);
      this.mOh.kP(true);
      oJ(8);
      this.mOh.voo = new o.a()
      {
        public final void Qx()
        {
          GMTrace.i(12766253416448L, 95116);
          if (GameMessageUI.b(GameMessageUI.this).getCount() == 0)
          {
            GameMessageUI.e(GameMessageUI.this).setVisibility(8);
            GameMessageUI.a(GameMessageUI.this, 0);
            GameMessageUI.this.kS(false);
            GMTrace.o(12766253416448L, 95116);
            return;
          }
          GameMessageUI.e(GameMessageUI.this).setVisibility(0);
          GameMessageUI.a(GameMessageUI.this, 8);
          GameMessageUI.this.kS(true);
          GMTrace.o(12766253416448L, 95116);
        }
        
        public final void Qy()
        {
          GMTrace.i(12766119198720L, 95115);
          GMTrace.o(12766119198720L, 95115);
        }
      };
      this.mOg.setOnScrollListener(this.mIf);
      this.mOg.setAdapter(this.mOh);
      ai.a(this.vov.voR, 13, 1300, 0, 1, 0, null, this.kjz, 0, null, null, null);
      GMTrace.o(12759676747776L, 95067);
      return;
      label298:
      if (this.mOj != null) {
        this.mOj.setVisibility(8);
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(12760616271872L, 95074);
    w.i("MicroMsg.GameMessageUI", "onSceneEnd: errType:[%d], errCode:[%d], type:[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramk.getType()) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (paramk.getType() == 573)
      {
        oJ(8);
        this.mOh.a(null, null);
        GMTrace.o(12760616271872L, 95074);
      }
    }
    else
    {
      if (this.mOh.getCount() > 0)
      {
        w.i("MicroMsg.GameMessageUI", "has local message, do not show error tips");
        GMTrace.o(12760616271872L, 95074);
        return;
      }
      if (a.ifN.a(this, paramInt1, paramInt2, paramString))
      {
        GMTrace.o(12760616271872L, 95074);
        return;
      }
      Toast.makeText(this, getString(R.l.edj, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
    }
    GMTrace.o(12760616271872L, 95074);
  }
  
  public final int aFr()
  {
    GMTrace.i(19276886966272L, 143624);
    GMTrace.o(19276886966272L, 143624);
    return 13;
  }
  
  public final int aFs()
  {
    GMTrace.i(19277021184000L, 143625);
    GMTrace.o(19277021184000L, 143625);
    return 1300;
  }
  
  public final int aFt()
  {
    GMTrace.i(19277155401728L, 143626);
    int i = this.kjz;
    GMTrace.o(19277155401728L, 143626);
    return i;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12760213618688L, 95071);
    int i = R.i.cWM;
    GMTrace.o(12760213618688L, 95071);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12759408312320L, 95065);
    super.onCreate(paramBundle);
    ap.wT().a(573, this);
    this.gDo = getIntent().getIntExtra("game_unread_msg_count", 0);
    this.mOn = getIntent().getStringExtra("game_manage_url");
    MH();
    SubCoreGameCenter.aFf();
    t.aEw();
    GMTrace.o(12759408312320L, 95065);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12760347836416L, 95072);
    super.onDestroy();
    if (this.mOh != null) {
      this.mOh.aIb();
    }
    ap.wT().b(573, this);
    u localu = SubCoreGameCenter.aFe();
    String str = "delete from GameRawMessage where createTime < (" + "select createTime from GameRawMessage order by createTime desc limit 9999,1" + ")";
    w.i("MicroMsg.GameMessageStorage", "clearMessageStorage: [%b], [%s]", new Object[] { Boolean.valueOf(localu.eL("GameRawMessage", str)), str });
    SubCoreGameCenter.aFe().aEA();
    GMTrace.o(12760347836416L, 95072);
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(12760482054144L, 95073);
    paramAdapterView = (q)paramAdapterView.getAdapter().getItem(paramInt);
    if (paramAdapterView == null)
    {
      w.e("MicroMsg.GameMessageUI", "get message null: position:[%d]", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(12760482054144L, 95073);
      return;
    }
    paramAdapterView.aEq();
    if (paramAdapterView.field_msgType == 100)
    {
      if (!bg.mZ(paramAdapterView.mAN))
      {
        paramView = (q.d)paramAdapterView.mAt.get(paramAdapterView.mAN);
        if (paramView == null)
        {
          GMTrace.o(12760482054144L, 95073);
          return;
        }
        paramInt = r.a(this, paramAdapterView, paramView, paramAdapterView.field_appId, 1301);
        if (paramInt != 0) {
          ai.a(this.vov.voR, 13, 1301, 4, paramInt, 0, paramAdapterView.field_appId, this.kjz, paramAdapterView.mAX, paramAdapterView.field_gameMsgId, paramAdapterView.mAY, null);
        }
      }
      GMTrace.o(12760482054144L, 95073);
      return;
    }
    if (paramAdapterView.mAZ == 0)
    {
      switch (paramAdapterView.field_msgType)
      {
      case 3: 
      case 4: 
      case 7: 
      case 8: 
      case 9: 
      default: 
      case 10: 
      case 11: 
        do
        {
          GMTrace.o(12760482054144L, 95073);
          return;
        } while (bg.mZ(paramAdapterView.mAg));
        paramInt = c.aa(this, paramAdapterView.mAg);
      }
      for (;;)
      {
        ai.a(this.vov.voR, 13, 1301, 4, paramInt, 0, paramAdapterView.field_appId, this.kjz, paramAdapterView.field_msgType, paramAdapterView.field_gameMsgId, paramAdapterView.mAY, null);
        break;
        if (bg.mZ(paramAdapterView.mAI)) {
          break;
        }
        paramInt = c.aa(this, paramAdapterView.mAI);
        continue;
        if (g.n(this, paramAdapterView.field_appId))
        {
          com.tencent.mm.plugin.game.model.e.V(this, paramAdapterView.field_appId);
          paramInt = 3;
        }
        else
        {
          paramView = new Bundle();
          paramView.putCharSequence("game_app_id", paramAdapterView.field_appId);
          paramView.putInt("game_report_from_scene", 1301);
          paramInt = c.a(this, paramAdapterView.field_appId, null, paramView);
        }
      }
    }
    switch (paramAdapterView.mAZ)
    {
    default: 
      w.e("MicroMsg.GameMessageUI", "unknowed jumptype : " + paramAdapterView.mAZ);
      GMTrace.o(12760482054144L, 95073);
      return;
    case 1: 
      if (bg.mZ(paramAdapterView.field_appId))
      {
        w.e("MicroMsg.GameMessageUI", "appid is null");
        GMTrace.o(12760482054144L, 95073);
        return;
      }
      paramView = new Bundle();
      paramView.putCharSequence("game_app_id", paramAdapterView.field_appId);
      paramView.putInt("game_report_from_scene", 1301);
      paramInt = c.a(this, paramAdapterView.field_appId, null, paramView);
      ai.a(this.vov.voR, 13, 1301, 4, paramInt, 0, paramAdapterView.field_appId, this.kjz, paramAdapterView.field_msgType, paramAdapterView.field_gameMsgId, paramAdapterView.mAY, null);
      GMTrace.o(12760482054144L, 95073);
      return;
    case 2: 
      if (g.n(this, paramAdapterView.field_appId)) {
        com.tencent.mm.plugin.game.model.e.V(this, paramAdapterView.field_appId);
      }
      for (paramInt = 3;; paramInt = c.a(this, paramAdapterView.field_appId, null, paramView))
      {
        ai.a(this.vov.voR, 13, 1301, 4, paramInt, 0, paramAdapterView.field_appId, this.kjz, paramAdapterView.field_msgType, paramAdapterView.field_gameMsgId, paramAdapterView.mAY, null);
        GMTrace.o(12760482054144L, 95073);
        return;
        paramView = new Bundle();
        paramView.putCharSequence("game_app_id", paramAdapterView.field_appId);
        paramView.putInt("game_report_from_scene", 1301);
      }
    }
    if (!bg.mZ(paramAdapterView.mBa))
    {
      paramInt = c.aa(this, paramAdapterView.mBa);
      ai.a(this.vov.voR, 13, 1301, 4, paramInt, 0, paramAdapterView.field_appId, this.kjz, paramAdapterView.field_msgType, paramAdapterView.field_gameMsgId, paramAdapterView.mAY, null);
      GMTrace.o(12760482054144L, 95073);
      return;
    }
    w.e("MicroMsg.GameMessageUI", "jumpurl is null");
    GMTrace.o(12760482054144L, 95073);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(12759945183232L, 95069);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      GMTrace.o(12759945183232L, 95069);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(12759945183232L, 95069);
    return bool;
  }
  
  protected void onResume()
  {
    GMTrace.i(12759542530048L, 95066);
    super.onResume();
    this.mOh.notifyDataSetChanged();
    if ((this.mOm) && (this.mOj != null)) {
      this.mOg.removeHeaderView(this.mOj);
    }
    GMTrace.o(12759542530048L, 95066);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameMessageUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */