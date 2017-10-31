package com.tencent.mm.plugin.favorite.ui.detail;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.k;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.ui.FavTagEditUI;
import com.tencent.mm.plugin.favorite.ui.base.FavDetailFooterView;
import com.tencent.mm.plugin.favorite.ui.base.FavDetailTitleView;
import com.tencent.mm.plugin.favorite.ui.base.FavTagEntrance;
import com.tencent.mm.plugin.favorite.ui.base.FavVoiceBaseView;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.m;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.base.q;
import com.tencent.mm.ui.p;
import java.util.LinkedList;

public class FavoriteVoiceDetailUI
  extends MMActivity
  implements j.a
{
  private j lPM;
  private com.tencent.mm.plugin.favorite.b.w lQh;
  private FavDetailTitleView lVK;
  private FavDetailFooterView lVL;
  private FavTagEntrance lVM;
  private FavVoiceBaseView lWO;
  private long lWj;
  
  public FavoriteVoiceDetailUI()
  {
    GMTrace.i(6395474739200L, 47650);
    GMTrace.o(6395474739200L, 47650);
  }
  
  public final void a(String paramString, l paraml)
  {
    GMTrace.i(6396280045568L, 47656);
    this.lPM = com.tencent.mm.plugin.favorite.h.awD().cc(this.lWj);
    if (this.lPM == null)
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.FavoriteDetailUI", "on notify changed, get fav item info error");
      finish();
      GMTrace.o(6396280045568L, 47656);
      return;
    }
    if (this.lPM.field_itemStatus != 10)
    {
      GMTrace.o(6396280045568L, 47656);
      return;
    }
    if ((paraml == null) || (paraml.uQV == null))
    {
      GMTrace.o(6396280045568L, 47656);
      return;
    }
    if (this.lPM.field_favProto.tQC.size() > 0)
    {
      paramString = x.n(this.lPM);
      paraml = x.g(paramString);
      int i = x.xn(paramString.tOM);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.FavoriteDetailUI", "on notify changed, favVoiceView.updateInfo");
      this.lWO.C(paraml, i, paramString.duration);
    }
    GMTrace.o(6396280045568L, 47656);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6395608956928L, 47651);
    int i = R.i.cUC;
    GMTrace.o(6395608956928L, 47651);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6395743174656L, 47652);
    super.onCreate(paramBundle);
    rV(getString(R.l.dWe));
    this.lWj = getIntent().getLongExtra("key_detail_info_id", -1L);
    this.lPM = com.tencent.mm.plugin.favorite.h.awD().cc(this.lWj);
    if (this.lPM == null)
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.FavoriteDetailUI", "get fav item info error");
      finish();
    }
    for (;;)
    {
      com.tencent.mm.plugin.favorite.h.awD().c(this);
      if (this.lVM != null) {
        com.tencent.mm.plugin.favorite.h.awD().c(this.lVM);
      }
      GMTrace.o(6395743174656L, 47652);
      return;
      this.lVK = ((FavDetailTitleView)findViewById(R.h.bGN));
      this.lVK.z(this.lPM);
      this.lVL = ((FavDetailFooterView)findViewById(R.h.bGM));
      this.lVL.z(this.lPM);
      this.lQh = new com.tencent.mm.plugin.favorite.b.w();
      this.lWO = ((FavVoiceBaseView)findViewById(R.h.cFx));
      paramBundle = this.lWO;
      paramBundle.lQh = this.lQh;
      paramBundle.lQh.a(paramBundle);
      paramBundle = x.n(this.lPM);
      String str = x.g(paramBundle);
      int i = x.xn(paramBundle.tOM);
      if (!com.tencent.mm.a.e.aZ(str)) {
        x.m(this.lPM);
      }
      this.lWO.C(str, i, paramBundle.duration);
      this.lVM = ((FavTagEntrance)findViewById(R.h.bHs));
      this.lVM.ct(this.lPM.field_localId);
      this.lVM.ay(this.lPM.field_tagProto.tQM);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(6409030729728L, 47751);
          FavoriteVoiceDetailUI.this.finish();
          GMTrace.o(6409030729728L, 47751);
          return true;
        }
      });
      a(0, R.l.eMR, R.g.baG, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(6400172359680L, 47685);
          paramAnonymousMenuItem = new com.tencent.mm.ui.widget.e(FavoriteVoiceDetailUI.this.vov.voR, com.tencent.mm.ui.widget.e.wSP, false);
          paramAnonymousMenuItem.qQS = new o.c()
          {
            public final void a(m paramAnonymous2m)
            {
              GMTrace.i(6412788826112L, 47779);
              paramAnonymous2m.e(0, FavoriteVoiceDetailUI.this.getString(R.l.dWs));
              paramAnonymous2m.e(1, FavoriteVoiceDetailUI.this.vov.voR.getString(R.l.duY));
              GMTrace.o(6412788826112L, 47779);
            }
          };
          paramAnonymousMenuItem.qQT = new o.d()
          {
            public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
            {
              GMTrace.i(6380308135936L, 47537);
              switch (paramAnonymous2MenuItem.getItemId())
              {
              }
              for (;;)
              {
                GMTrace.o(6380308135936L, 47537);
                return;
                paramAnonymous2MenuItem = new Intent(FavoriteVoiceDetailUI.this.vov.voR, FavTagEditUI.class);
                paramAnonymous2MenuItem.putExtra("key_fav_scene", 2);
                paramAnonymous2MenuItem.putExtra("key_fav_item_id", FavoriteVoiceDetailUI.a(FavoriteVoiceDetailUI.this).field_localId);
                FavoriteVoiceDetailUI.this.vov.voR.startActivity(paramAnonymous2MenuItem);
                GMTrace.o(6380308135936L, 47537);
                return;
                com.tencent.mm.ui.base.h.a(FavoriteVoiceDetailUI.this.vov.voR, FavoriteVoiceDetailUI.this.getString(R.l.duZ), "", new DialogInterface.OnClickListener()
                {
                  public final void onClick(final DialogInterface paramAnonymous3DialogInterface, int paramAnonymous3Int)
                  {
                    GMTrace.i(6410775560192L, 47764);
                    paramAnonymous3DialogInterface = com.tencent.mm.ui.base.h.a(FavoriteVoiceDetailUI.this.vov.voR, FavoriteVoiceDetailUI.this.getString(R.l.duZ), false, null);
                    final long l1 = FavoriteVoiceDetailUI.a(FavoriteVoiceDetailUI.this).field_localId;
                    long l2 = FavoriteVoiceDetailUI.a(FavoriteVoiceDetailUI.this).field_id;
                    x.a(FavoriteVoiceDetailUI.a(FavoriteVoiceDetailUI.this).field_localId, new Runnable()
                    {
                      public final void run()
                      {
                        GMTrace.i(6387555893248L, 47591);
                        paramAnonymous3DialogInterface.dismiss();
                        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.FavoriteDetailUI", "do del fav voice, local id %d, fav id %d", new Object[] { Long.valueOf(l1), Long.valueOf(this.lWT) });
                        FavoriteVoiceDetailUI.this.finish();
                        GMTrace.o(6387555893248L, 47591);
                      }
                    });
                    GMTrace.o(6410775560192L, 47764);
                  }
                }, null);
              }
            }
          };
          paramAnonymousMenuItem.bCV();
          GMTrace.o(6400172359680L, 47685);
          return true;
        }
      });
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6395877392384L, 47653);
    super.onDestroy();
    this.lWO.ahm();
    this.lQh.destroy();
    com.tencent.mm.plugin.favorite.h.awD().j(this);
    if (this.lVM != null) {
      com.tencent.mm.plugin.favorite.h.awD().j(this.lVM);
    }
    GMTrace.o(6395877392384L, 47653);
  }
  
  protected void onPause()
  {
    GMTrace.i(6396145827840L, 47655);
    super.onPause();
    this.lWO.awY();
    this.lQh.pause();
    GMTrace.o(6396145827840L, 47655);
  }
  
  protected void onResume()
  {
    GMTrace.i(6396011610112L, 47654);
    super.onResume();
    GMTrace.o(6396011610112L, 47654);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/detail/FavoriteVoiceDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */