package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.game.d.a;
import com.tencent.mm.plugin.game.d.a.a;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.p.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class GameRegionSelectUI
  extends MMPreference
{
  private f ilZ;
  private GameRegionPreference.a mOY;
  private Map<String, GameRegionPreference.a> mPd;
  
  public GameRegionSelectUI()
  {
    GMTrace.i(12733638508544L, 94873);
    GMTrace.o(12733638508544L, 94873);
  }
  
  protected final void MH()
  {
    GMTrace.i(12734175379456L, 94877);
    oC(R.l.edV);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12661295153152L, 94334);
        GameRegionSelectUI.this.setResult(0);
        GameRegionSelectUI.this.aKl();
        GameRegionSelectUI.this.finish();
        GMTrace.o(12661295153152L, 94334);
        return true;
      }
    });
    a(0, getString(R.l.edU), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        int i = 0;
        GMTrace.i(12732027895808L, 94861);
        if (GameRegionSelectUI.this.getSharedPreferences("game_center_pref", 0).getInt("game_region_confirm_mark", 0) == 1) {}
        while (i != 0)
        {
          h.a(GameRegionSelectUI.this, true, GameRegionSelectUI.this.getString(R.l.edS), "", GameRegionSelectUI.this.getString(R.l.edT), GameRegionSelectUI.this.getString(R.l.edR), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(12683977949184L, 94503);
              GameRegionSelectUI.this.getSharedPreferences("game_center_pref", 0).edit().putInt("game_region_confirm_mark", 1).commit();
              if (GameRegionSelectUI.a(GameRegionSelectUI.this) != null)
              {
                e.X(GameRegionSelectUI.this, GameRegionSelectUI.a(GameRegionSelectUI.this).gcc);
                a.a.mRl.mRk = true;
              }
              paramAnonymous2DialogInterface = new Intent();
              GameRegionPreference.a locala = e.cx(GameRegionSelectUI.this);
              if (locala != null)
              {
                paramAnonymous2DialogInterface.putExtra("gameRegionName", e.a(locala));
                GameRegionSelectUI.this.setResult(-1, paramAnonymous2DialogInterface);
              }
              for (;;)
              {
                GameRegionSelectUI.this.finish();
                GMTrace.o(12683977949184L, 94503);
                return;
                GameRegionSelectUI.this.setResult(1);
              }
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(12730148847616L, 94847);
              GMTrace.o(12730148847616L, 94847);
            }
          });
          GMTrace.o(12732027895808L, 94861);
          return true;
          i = 1;
        }
        if (GameRegionSelectUI.a(GameRegionSelectUI.this) != null)
        {
          e.X(GameRegionSelectUI.this, GameRegionSelectUI.a(GameRegionSelectUI.this).gcc);
          a.a.mRl.mRk = true;
        }
        paramAnonymousMenuItem = new Intent();
        GameRegionPreference.a locala = e.cx(GameRegionSelectUI.this);
        if (locala != null)
        {
          paramAnonymousMenuItem.putExtra("gameRegionName", e.a(locala));
          GameRegionSelectUI.this.setResult(-1, paramAnonymousMenuItem);
        }
        for (;;)
        {
          GameRegionSelectUI.this.finish();
          break;
          GameRegionSelectUI.this.setResult(1);
        }
      }
    }, p.b.vpB);
    this.ilZ.removeAll();
    this.mPd = a.a.mRl.aFN();
    Object localObject = e.cx(this);
    if (localObject != null) {
      ((GameRegionPreference.a)localObject).mPc = true;
    }
    localObject = this.mPd.values().iterator();
    while (((Iterator)localObject).hasNext())
    {
      GameRegionPreference.a locala = (GameRegionPreference.a)((Iterator)localObject).next();
      if (locala != null)
      {
        GameRegionPreference localGameRegionPreference = new GameRegionPreference(this);
        if ((locala == null) || (bg.mZ(locala.gcc))) {
          w.e("MicroMsg.GameRegionPreference", "setData region error");
        }
        for (;;)
        {
          if (!locala.isDefault) {
            break label188;
          }
          this.ilZ.a(localGameRegionPreference, 0);
          break;
          localGameRegionPreference.mOY = locala;
          localGameRegionPreference.setKey(locala.gcc);
        }
        label188:
        this.ilZ.a(localGameRegionPreference);
      }
    }
    localObject = new PreferenceCategory(this);
    this.ilZ.a((Preference)localObject);
    this.ilZ.notifyDataSetChanged();
    GMTrace.o(12734175379456L, 94877);
  }
  
  public final int QD()
  {
    GMTrace.i(12734041161728L, 94876);
    GMTrace.o(12734041161728L, 94876);
    return -1;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(12734309597184L, 94878);
    if ((paramPreference instanceof GameRegionPreference))
    {
      paramPreference = ((GameRegionPreference)paramPreference).mOY;
      if (paramPreference == null)
      {
        GMTrace.o(12734309597184L, 94878);
        return false;
      }
      this.mOY = paramPreference;
      Iterator localIterator = this.mPd.values().iterator();
      while (localIterator.hasNext()) {
        ((GameRegionPreference.a)localIterator.next()).mPc = false;
      }
      paramPreference.mPc = true;
      paramf.notifyDataSetChanged();
      GMTrace.o(12734309597184L, 94878);
      return true;
    }
    GMTrace.o(12734309597184L, 94878);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12733772726272L, 94874);
    super.onCreate(paramBundle);
    this.ilZ = this.vOv;
    MH();
    GMTrace.o(12733772726272L, 94874);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12733906944000L, 94875);
    a.a.mRl.aFL();
    super.onDestroy();
    GMTrace.o(12733906944000L, 94875);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameRegionSelectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */