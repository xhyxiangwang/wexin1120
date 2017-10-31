package com.tencent.mm.plugin.favorite.ui.detail;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.ClipboardManager;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.k.b;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.k;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.c;
import com.tencent.mm.plugin.favorite.ui.FavTagEditUI;
import com.tencent.mm.plugin.favorite.ui.FavTextEditUI;
import com.tencent.mm.plugin.favorite.ui.base.FavDetailFooterView;
import com.tencent.mm.plugin.favorite.ui.base.FavDetailTitleView;
import com.tencent.mm.plugin.favorite.ui.base.FavTagEntrance;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.m;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.base.q;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.ui.widget.e;

public class FavoriteTextDetailUI
  extends MMActivity
{
  private static final int lWs;
  private l kwF;
  private j lVO;
  private FavDetailTitleView lWc;
  private FavDetailFooterView lWd;
  private FavTagEntrance lWe;
  private long lWj;
  private TextView lWt;
  private ClipboardManager lWu;
  private j lWv;
  private o.d lWw;
  
  static
  {
    GMTrace.i(6402722496512L, 47704);
    lWs = b.ud();
    GMTrace.o(6402722496512L, 47704);
  }
  
  public FavoriteTextDetailUI()
  {
    GMTrace.i(6400843448320L, 47690);
    this.lWw = new o.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(6395340521472L, 47649);
        switch (paramAnonymousMenuItem.getItemId())
        {
        }
        for (;;)
        {
          GMTrace.o(6395340521472L, 47649);
          return;
          FavoriteTextDetailUI.c(FavoriteTextDetailUI.this).setText(FavoriteTextDetailUI.a(FavoriteTextDetailUI.this).field_favProto.desc);
          com.tencent.mm.ui.base.h.bl(FavoriteTextDetailUI.this.vov.voR, FavoriteTextDetailUI.this.vov.voR.getString(R.l.duV));
        }
      }
    };
    GMTrace.o(6400843448320L, 47690);
  }
  
  private void ayj()
  {
    GMTrace.i(6401648754688L, 47696);
    this.lVO = com.tencent.mm.plugin.favorite.h.awD().cc(this.lWj);
    if (this.lVO == null)
    {
      w.w("MicroMsg.FavoriteTextDetailUI", "id[%d] info is null, return", new Object[] { Long.valueOf(this.lWj) });
      GMTrace.o(6401648754688L, 47696);
      return;
    }
    this.lWe.ct(this.lVO.field_localId);
    this.lWe.ay(this.lVO.field_tagProto.tQM);
    if ((this.lWv != null) && (this.lWv.field_edittime == this.lVO.field_edittime))
    {
      w.w("MicroMsg.FavoriteTextDetailUI", "not change, return");
      GMTrace.o(6401648754688L, 47696);
      return;
    }
    this.lWv = this.lVO;
    this.lWc.z(this.lVO);
    this.lWd.z(this.lVO);
    this.lWt.setText(this.lVO.field_favProto.desc);
    com.tencent.mm.pluginsdk.ui.d.h.d(this.lWt, 1);
    GMTrace.o(6401648754688L, 47696);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6400977666048L, 47691);
    int i = R.i.cUB;
    GMTrace.o(6400977666048L, 47691);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6401917190144L, 47698);
    if ((1 == paramInt1) && (-1 == paramInt2))
    {
      com.tencent.mm.ui.base.h.bl(this.vov.voR, getString(R.l.dwW));
      new ae().postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6412251955200L, 47775);
          FavoriteTextDetailUI.d(FavoriteTextDetailUI.this);
          GMTrace.o(6412251955200L, 47775);
        }
      }, 250L);
      GMTrace.o(6401917190144L, 47698);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(6401917190144L, 47698);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6401111883776L, 47692);
    super.onCreate(paramBundle);
    this.lWt = ((TextView)findViewById(R.h.brM));
    this.lWc = ((FavDetailTitleView)findViewById(R.h.bGN));
    this.lWd = ((FavDetailFooterView)findViewById(R.h.bGM));
    this.lWe = ((FavTagEntrance)findViewById(R.h.bHs));
    this.lWu = ((ClipboardManager)getSystemService("clipboard"));
    this.lWj = getIntent().getLongExtra("key_detail_info_id", -1L);
    com.tencent.mm.pluginsdk.wallet.g.zc(5);
    this.kwF = new l(this.vov.voR);
    this.kwF.a(this.lWt, this, this.lWw);
    rV(getString(R.l.dWe));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6380845006848L, 47541);
        FavoriteTextDetailUI.this.finish();
        GMTrace.o(6380845006848L, 47541);
        return true;
      }
    });
    a(0, R.l.eMR, R.g.baG, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6387824328704L, 47593);
        paramAnonymousMenuItem = new e(FavoriteTextDetailUI.this.vov.voR, e.wSP, false);
        paramAnonymousMenuItem.qQS = new o.c()
        {
          public final void a(m paramAnonymous2m)
          {
            GMTrace.i(6384603103232L, 47569);
            if (FavoriteTextDetailUI.this.getIntent().getBooleanExtra("key_detail_can_share_to_friend", true)) {
              paramAnonymous2m.e(2, FavoriteTextDetailUI.this.getString(R.l.dXS));
            }
            paramAnonymous2m.e(0, FavoriteTextDetailUI.this.getString(R.l.dWq));
            paramAnonymous2m.e(3, FavoriteTextDetailUI.this.getString(R.l.dWs));
            paramAnonymous2m.e(4, FavoriteTextDetailUI.this.getString(R.l.duY));
            GMTrace.o(6384603103232L, 47569);
          }
        };
        paramAnonymousMenuItem.qQT = new o.d()
        {
          public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
          {
            GMTrace.i(6385139974144L, 47573);
            switch (paramAnonymous2MenuItem.getItemId())
            {
            }
            for (;;)
            {
              GMTrace.o(6385139974144L, 47573);
              return;
              paramAnonymous2MenuItem = new Intent(FavoriteTextDetailUI.this, FavTextEditUI.class);
              paramAnonymous2MenuItem.putExtra("key_value", FavoriteTextDetailUI.a(FavoriteTextDetailUI.this).field_favProto.desc);
              paramAnonymous2MenuItem.putExtra("key_max_count", FavoriteTextDetailUI.aev());
              paramAnonymous2MenuItem.putExtra("key_show_confirm", true);
              paramAnonymous2MenuItem.putExtra("key_fav_item_id", FavoriteTextDetailUI.a(FavoriteTextDetailUI.this).field_id);
              FavoriteTextDetailUI.this.startActivityForResult(paramAnonymous2MenuItem, 1);
              GMTrace.o(6385139974144L, 47573);
              return;
              paramAnonymous2MenuItem = FavoriteTextDetailUI.a(FavoriteTextDetailUI.this).field_favProto.desc;
              FavoriteTextDetailUI localFavoriteTextDetailUI = FavoriteTextDetailUI.this;
              if (bg.mZ(paramAnonymous2MenuItem)) {
                w.e("MicroMsg.FavApplication", "shareTextToFriend content null");
              }
              for (;;)
              {
                com.tencent.mm.plugin.report.service.g.paX.i(10651, new Object[] { Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(0) });
                GMTrace.o(6385139974144L, 47573);
                return;
                Intent localIntent = new Intent();
                localIntent.putExtra("Retr_Msg_content", paramAnonymous2MenuItem);
                localIntent.putExtra("Retr_Msg_Type", 4);
                localIntent.putExtra("mutil_select_is_ret", true);
                c.ifM.l(localIntent, localFavoriteTextDetailUI);
              }
              paramAnonymous2MenuItem = new Intent(FavoriteTextDetailUI.this.vov.voR, FavTagEditUI.class);
              paramAnonymous2MenuItem.putExtra("key_fav_scene", 2);
              paramAnonymous2MenuItem.putExtra("key_fav_item_id", FavoriteTextDetailUI.a(FavoriteTextDetailUI.this).field_localId);
              FavoriteTextDetailUI.this.vov.voR.startActivity(paramAnonymous2MenuItem);
              GMTrace.o(6385139974144L, 47573);
              return;
              com.tencent.mm.ui.base.h.a(FavoriteTextDetailUI.this.vov.voR, FavoriteTextDetailUI.this.getString(R.l.duZ), "", new DialogInterface.OnClickListener()
              {
                public final void onClick(final DialogInterface paramAnonymous3DialogInterface, int paramAnonymous3Int)
                {
                  GMTrace.i(6384334667776L, 47567);
                  paramAnonymous3DialogInterface = com.tencent.mm.ui.base.h.a(FavoriteTextDetailUI.this.vov.voR, FavoriteTextDetailUI.this.getString(R.l.duZ), false, null);
                  x.a(FavoriteTextDetailUI.b(FavoriteTextDetailUI.this), new Runnable()
                  {
                    public final void run()
                    {
                      GMTrace.i(6385408409600L, 47575);
                      paramAnonymous3DialogInterface.dismiss();
                      w.d("MicroMsg.FavoriteTextDetailUI", "do del, local id %d", new Object[] { Long.valueOf(FavoriteTextDetailUI.b(FavoriteTextDetailUI.this)) });
                      FavoriteTextDetailUI.this.finish();
                      GMTrace.o(6385408409600L, 47575);
                    }
                  });
                  GMTrace.o(6384334667776L, 47567);
                }
              }, null);
            }
          }
        };
        paramAnonymousMenuItem.bCV();
        GMTrace.o(6387824328704L, 47593);
        return true;
      }
    });
    com.tencent.mm.plugin.favorite.h.awD().c(this.lWe);
    GMTrace.o(6401111883776L, 47692);
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    GMTrace.i(6401782972416L, 47697);
    paramContextMenu.add(0, 1, 0, getString(R.l.duU));
    GMTrace.o(6401782972416L, 47697);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6401246101504L, 47693);
    com.tencent.mm.plugin.favorite.h.awD().j(this.lWe);
    super.onDestroy();
    GMTrace.o(6401246101504L, 47693);
  }
  
  protected void onPause()
  {
    GMTrace.i(6401514536960L, 47695);
    super.onPause();
    GMTrace.o(6401514536960L, 47695);
  }
  
  protected void onResume()
  {
    GMTrace.i(6401380319232L, 47694);
    super.onResume();
    ayj();
    GMTrace.o(6401380319232L, 47694);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/detail/FavoriteTextDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */