package com.tencent.mm.plugin.game.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.bq.a;
import com.tencent.mm.plugin.game.c.af;
import com.tencent.mm.plugin.game.c.ag;
import com.tencent.mm.plugin.game.model.SubCoreGameCenter;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.al;
import com.tencent.mm.pluginsdk.model.app.aj;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.t;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.ap;
import java.util.ArrayList;
import java.util.Map;

public class GameSettingsUI
  extends MMActivity
  implements e, t
{
  private String appId;
  private ProgressDialog ilL;
  private int mBs;
  private ImageView mGS;
  private TextView mGT;
  private f mHS;
  private TextView mQj;
  private TextView mQk;
  private CheckBox mQl;
  private View mQm;
  private View mQn;
  private CheckBox mQo;
  private AuthorizationInfoLayout mQp;
  private ArrayList<String> mQq;
  private boolean mQr;
  
  public GameSettingsUI()
  {
    GMTrace.i(12681830465536L, 94487);
    this.ilL = null;
    this.mBs = 0;
    GMTrace.o(12681830465536L, 94487);
  }
  
  private boolean ci(int paramInt1, int paramInt2)
  {
    GMTrace.i(12682904207360L, 94495);
    if ((this.ilL != null) && (this.ilL.isShowing()))
    {
      this.ilL.dismiss();
      this.ilL = null;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      Toast.makeText(this, getString(R.l.edo, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      GMTrace.o(12682904207360L, 94495);
      return true;
    }
    GMTrace.o(12682904207360L, 94495);
    return false;
  }
  
  private void g(final k paramk)
  {
    GMTrace.i(12682501554176L, 94492);
    ap.wT().a(paramk, 0);
    getString(R.l.dxm);
    this.ilL = h.a(this, getString(R.l.dxB), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(12667737604096L, 94382);
        ap.wT().c(paramk);
        GMTrace.o(12667737604096L, 94382);
      }
    });
    GMTrace.o(12682501554176L, 94492);
  }
  
  protected final void MH()
  {
    int i = 0;
    GMTrace.i(12682367336448L, 94491);
    this.mGS = ((ImageView)findViewById(R.h.bMC));
    this.mGT = ((TextView)findViewById(R.h.bNj));
    this.mQj = ((TextView)findViewById(R.h.bMr));
    this.mQp = ((AuthorizationInfoLayout)findViewById(R.h.bLd));
    if (this.mHS != null)
    {
      Object localObject = g.b(this.mHS.field_appId, 1, a.getDensity(this));
      Map localMap;
      label236:
      StringBuilder localStringBuilder;
      if (localObject == null)
      {
        this.mGS.setImageResource(R.g.aVT);
        if (!bg.mZ(this.mHS.field_appName)) {
          this.mGT.setText(g.a(this, this.mHS, null));
        }
        if (!bg.mZ(this.mHS.fWw)) {
          this.mQj.setText(this.mHS.fWw);
        }
        localObject = this.mHS.fWv;
        if (bg.mZ((String)localObject)) {
          break label424;
        }
        localMap = bh.p((String)localObject, "ScopeList");
        if ((localMap == null) || (localMap.size() <= 0)) {
          break label396;
        }
        int j = bg.getInt((String)localMap.get(".ScopeList.Count"), 0);
        if (j <= 0) {
          break label354;
        }
        this.mQq = new ArrayList();
        if (i >= j) {
          break label396;
        }
        localStringBuilder = new StringBuilder(".ScopeList.List.item");
        if (i != 0) {
          break label345;
        }
      }
      label345:
      for (localObject = "";; localObject = Integer.valueOf(i))
      {
        localObject = localObject + ".Scope";
        if (!bg.mZ((String)localMap.get(localObject))) {
          this.mQq.add(localMap.get(localObject));
        }
        i += 1;
        break label236;
        localObject = com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject, true, 5.0F);
        this.mGS.setImageBitmap((Bitmap)localObject);
        break;
      }
      label354:
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.GameSettingsUI", "auth info is null :" + this.mHS.field_appName + ", " + this.appId);
      label396:
      if ((this.mQq == null) || (this.mQq.size() <= 0)) {
        break label577;
      }
      this.mQp.F(this.mQq);
    }
    for (;;)
    {
      label424:
      this.mQk = ((TextView)findViewById(R.h.bBX));
      this.mQk.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(12747865587712L, 94979);
          h.a(GameSettingsUI.this, R.l.edc, R.l.edb, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(12775648657408L, 95186);
              GameSettingsUI.a(GameSettingsUI.this);
              GMTrace.o(12775648657408L, 95186);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(12667469168640L, 94380);
              GMTrace.o(12667469168640L, 94380);
            }
          });
          GMTrace.o(12747865587712L, 94979);
        }
      });
      this.mQl = ((CheckBox)findViewById(R.h.bgd));
      boolean bool = g.Ny(this.appId);
      this.mQl.setChecked(bool);
      this.mQm = findViewById(R.h.bfV);
      this.mQm.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(12662368894976L, 94342);
          if (GameSettingsUI.b(GameSettingsUI.this).isChecked())
          {
            GameSettingsUI.b(GameSettingsUI.this).setChecked(false);
            GameSettingsUI.a(GameSettingsUI.this, false);
            GMTrace.o(12662368894976L, 94342);
            return;
          }
          GameSettingsUI.b(GameSettingsUI.this).setChecked(true);
          GameSettingsUI.a(GameSettingsUI.this, true);
          GMTrace.o(12662368894976L, 94342);
        }
      });
      this.mQo = ((CheckBox)findViewById(R.h.cxU));
      this.mQn = findViewById(R.h.cxT);
      this.mQn.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(12780212060160L, 95220);
          if (GameSettingsUI.c(GameSettingsUI.this).isChecked())
          {
            GameSettingsUI.c(GameSettingsUI.this).setChecked(false);
            GameSettingsUI.b(GameSettingsUI.this, false);
            GMTrace.o(12780212060160L, 95220);
            return;
          }
          GameSettingsUI.c(GameSettingsUI.this).setChecked(true);
          GameSettingsUI.b(GameSettingsUI.this, true);
          GMTrace.o(12780212060160L, 95220);
        }
      });
      oC(R.l.eea);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(12717532381184L, 94753);
          GameSettingsUI.this.setResult(0);
          GameSettingsUI.this.finish();
          GMTrace.o(12717532381184L, 94753);
          return true;
        }
      });
      GMTrace.o(12682367336448L, 94491);
      return;
      label577:
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.GameSettingsUI", "this game's authinfo is null " + this.appId);
      this.mQp.setVisibility(8);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(12682769989632L, 94494);
    if (ci(paramInt1, paramInt2))
    {
      GMTrace.o(12682769989632L, 94494);
      return;
    }
    switch (paramk.getType())
    {
    }
    for (;;)
    {
      GMTrace.o(12682769989632L, 94494);
      return;
      paramInt2 = ((af)((al)paramk).lnP.hlU.hmc).mEf;
      paramString = (ag)((al)paramk).lnP.hlV.hmc;
      if ((paramString == null) || ((paramString.mEg & 0x1) <= 0)) {
        break;
      }
      paramInt1 = 1;
      switch (paramInt2)
      {
      }
    }
    paramString = this.mQo;
    if (paramInt1 == 0) {}
    for (boolean bool = true;; bool = false)
    {
      paramString.setChecked(bool);
      GMTrace.o(12682769989632L, 94494);
      return;
      paramInt1 = 0;
      break;
    }
    if (this.mQr) {}
    for (paramInt1 = 20;; paramInt1 = 21)
    {
      ai.a(this.vov.voR, 10, 1008, AuthorizedGameListUI.mHd, paramInt1, 1, this.appId, this.mBs, 0, null, null, null);
      break;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.pluginsdk.model.app.w paramw)
  {
    GMTrace.i(12682635771904L, 94493);
    if (ci(paramInt1, paramInt2))
    {
      GMTrace.o(12682635771904L, 94493);
      return;
    }
    paramString = (aj)paramw;
    if (paramString.cmdId == 0)
    {
      boolean bool = g.Ny(this.appId);
      if (this.mQl != null) {
        this.mQl.setChecked(bool);
      }
      if (bool)
      {
        ai.a(this.vov.voR, 10, 1008, AuthorizedGameListUI.mHc, 20, 1, this.appId, this.mBs, 0, null, null, null);
        GMTrace.o(12682635771904L, 94493);
        return;
      }
      ai.a(this.vov.voR, 10, 1008, AuthorizedGameListUI.mHc, 21, 1, this.appId, this.mBs, 0, null, null, null);
      GMTrace.o(12682635771904L, 94493);
      return;
    }
    if (paramString.cmdId == 1)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameSettingsUI", "relieve app authorization ok");
      paramString = new Intent();
      paramString.putExtra("game_app_id", this.appId);
      setResult(-1, paramString);
      finish();
    }
    GMTrace.o(12682635771904L, 94493);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12682098900992L, 94489);
    int i = R.i.cMF;
    GMTrace.o(12682098900992L, 94489);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12681964683264L, 94488);
    super.onCreate(paramBundle);
    this.mBs = getIntent().getIntExtra("game_report_from_scene", 0);
    SubCoreGameCenter.aFj().a(2, this);
    ap.wT().a(1221, this);
    this.appId = getIntent().getStringExtra("game_app_id");
    if (bg.mZ(this.appId)) {
      com.tencent.mm.sdk.platformtools.w.f("MicroMsg.GameSettingsUI", "appid is null or nill");
    }
    for (;;)
    {
      MH();
      g(new al(this.appId));
      GMTrace.o(12681964683264L, 94488);
      return;
      this.mHS = g.aM(this.appId, true);
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12682233118720L, 94490);
    super.onDestroy();
    SubCoreGameCenter.aFj().b(2, this);
    ap.wT().b(1221, this);
    GMTrace.o(12682233118720L, 94490);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(12683038425088L, 94496);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      setResult(0);
      finish();
      GMTrace.o(12683038425088L, 94496);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(12683038425088L, 94496);
    return bool;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameSettingsUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */