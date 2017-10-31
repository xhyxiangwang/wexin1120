package com.tencent.mm.plugin.game.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.game.model.SubCoreGameCenter;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.ao;
import com.tencent.mm.pluginsdk.model.app.d;
import com.tencent.mm.pluginsdk.model.app.t;
import com.tencent.mm.pluginsdk.model.app.x;
import com.tencent.mm.protocal.c.dp;
import com.tencent.mm.protocal.c.vp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.ap;
import java.util.LinkedList;

public class AuthorizedGameListUI
  extends MMActivity
  implements AdapterView.OnItemClickListener, t
{
  public static int mGZ;
  public static int mHa;
  public static int mHb;
  public static int mHc;
  public static int mHd;
  private ProgressDialog ilL;
  private int mBs;
  private ListView mGV;
  private a mGW;
  private View mGX;
  private int mGY;
  
  static
  {
    GMTrace.i(12686259650560L, 94520);
    mGZ = 1;
    mHa = 2;
    mHb = 4;
    mHc = 5;
    mHd = 6;
    GMTrace.o(12686259650560L, 94520);
  }
  
  public AuthorizedGameListUI()
  {
    GMTrace.i(12684783255552L, 94509);
    this.ilL = null;
    this.mGY = -1;
    this.mBs = 0;
    GMTrace.o(12684783255552L, 94509);
  }
  
  protected final void MH()
  {
    GMTrace.i(12685320126464L, 94513);
    this.mGV = ((ListView)findViewById(R.h.bMW));
    this.mGX = findViewById(R.h.bEp);
    this.mGW = new a(this);
    this.mGW.mHg = new b.a()
    {
      public final void oy(int paramAnonymousInt)
      {
        GMTrace.i(12758200352768L, 95056);
        if (paramAnonymousInt <= 0)
        {
          AuthorizedGameListUI.a(AuthorizedGameListUI.this).setVisibility(8);
          AuthorizedGameListUI.b(AuthorizedGameListUI.this).setVisibility(0);
          GMTrace.o(12758200352768L, 95056);
          return;
        }
        AuthorizedGameListUI.a(AuthorizedGameListUI.this).setVisibility(0);
        AuthorizedGameListUI.b(AuthorizedGameListUI.this).setVisibility(8);
        GMTrace.o(12758200352768L, 95056);
      }
    };
    this.mGV.setVerticalScrollBarEnabled(false);
    this.mGV.setOnItemClickListener(this);
    this.mGV.setAdapter(this.mGW);
    oC(R.l.edx);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12664516378624L, 94358);
        AuthorizedGameListUI.this.finish();
        GMTrace.o(12664516378624L, 94358);
        return true;
      }
    });
    GMTrace.o(12685320126464L, 94513);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.pluginsdk.model.app.w paramw)
  {
    GMTrace.i(12685856997376L, 94517);
    if ((this.ilL != null) && (this.ilL.isShowing())) {
      this.ilL.dismiss();
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = ((vp)((ao)paramw).lnP.hlV.hmc).tTE;
      if ((paramString == null) || (paramString.size() == 0)) {
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AuthorizedGameListUI", "no authapp");
      }
      this.mGW.P(paramString);
      GMTrace.o(12685856997376L, 94517);
      return;
    }
    Toast.makeText(this, getString(R.l.edv, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
    GMTrace.o(12685856997376L, 94517);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12685185908736L, 94512);
    int i = R.i.bMV;
    GMTrace.o(12685185908736L, 94512);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(12685722779648L, 94516);
    if (paramInt1 != 0)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AuthorizedGameListUI", "invaild requestcode" + paramInt1);
      GMTrace.o(12685722779648L, 94516);
      return;
    }
    if (paramInt2 == -1)
    {
      this.mGW.remove(this.mGY);
      paramIntent = paramIntent.getStringExtra("game_app_id");
      ai.a(this.vov.voR, 10, 1008, mHb, 21, 1, paramIntent, this.mBs, 0, null, null, null);
    }
    if (this.mGW != null) {
      this.mGW.notifyDataSetChanged();
    }
    GMTrace.o(12685722779648L, 94516);
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    GMTrace.i(12684917473280L, 94510);
    super.onCreate(paramBundle);
    this.mBs = getIntent().getIntExtra("game_report_from_scene", 0);
    SubCoreGameCenter.aFj().a(3, this);
    MH();
    paramBundle = new x(3, new ao(v.d(getSharedPreferences(ab.bNa(), 0))));
    ap.wT().a(paramBundle, 0);
    getString(R.l.dxm);
    this.ilL = h.a(this, getString(R.l.dxB), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(12702097342464L, 94638);
        ap.wT().c(paramBundle);
        GMTrace.o(12702097342464L, 94638);
      }
    });
    GMTrace.o(12684917473280L, 94510);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12685454344192L, 94514);
    super.onDestroy();
    SubCoreGameCenter.aFj().b(3, this);
    if (this.mGW != null) {
      this.mGW.clear();
    }
    GMTrace.o(12685454344192L, 94514);
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(12685588561920L, 94515);
    paramAdapterView = new Intent(this, GameSettingsUI.class);
    this.mGY = paramInt;
    paramAdapterView.putExtra("game_app_id", ((dp)this.mGW.getItem(paramInt)).mCH);
    paramAdapterView.putExtra("game_report_from_scene", this.mBs);
    startActivityForResult(paramAdapterView, 0);
    ai.a(this, 10, 1008, mHa, 6, this.mBs, null);
    GMTrace.o(12685588561920L, 94515);
  }
  
  protected void onResume()
  {
    GMTrace.i(12685051691008L, 94511);
    super.onResume();
    GMTrace.o(12685051691008L, 94511);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/AuthorizedGameListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */