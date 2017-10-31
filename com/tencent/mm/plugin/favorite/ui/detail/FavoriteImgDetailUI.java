package com.tencent.mm.plugin.favorite.ui.detail;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.bi.d;
import com.tencent.mm.g.a.by;
import com.tencent.mm.g.a.me;
import com.tencent.mm.plugin.favorite.b.b;
import com.tencent.mm.plugin.favorite.b.b.a;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.k;
import com.tencent.mm.plugin.favorite.b.r;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.ui.FavImgGalleryUI;
import com.tencent.mm.plugin.favorite.ui.FavTagEditUI;
import com.tencent.mm.plugin.favorite.ui.base.FavDetailFooterView;
import com.tencent.mm.plugin.favorite.ui.base.FavDetailTitleView;
import com.tencent.mm.plugin.favorite.ui.base.FavTagEntrance;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.m;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.x.ap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

public class FavoriteImgDetailUI
  extends MMActivity
  implements b.a
{
  private com.tencent.mm.sdk.b.c lRF;
  private View.OnClickListener lTT;
  private LinearLayout lVJ;
  private FavDetailTitleView lVK;
  private FavDetailFooterView lVL;
  private FavTagEntrance lVM;
  private int lVN;
  private j lVO;
  private HashMap<String, a> lVP;
  private Bitmap lVQ;
  private boolean lVR;
  private View.OnLongClickListener lVS;
  
  public FavoriteImgDetailUI()
  {
    GMTrace.i(6388763852800L, 47600);
    this.lVN = 0;
    this.lVP = new HashMap();
    this.lVR = true;
    this.lTT = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6393998344192L, 47639);
        Intent localIntent = new Intent(FavoriteImgDetailUI.this.vov.voR, FavImgGalleryUI.class);
        localIntent.putExtra("key_detail_info_id", FavoriteImgDetailUI.b(FavoriteImgDetailUI.this).field_localId);
        localIntent.putExtra("key_detail_data_id", ((sp)paramAnonymousView.getTag()).lUP);
        FavoriteImgDetailUI.this.startActivity(localIntent);
        GMTrace.o(6393998344192L, 47639);
      }
    };
    this.lVS = new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(6387019022336L, 47587);
        paramAnonymousView = (sp)paramAnonymousView.getTag();
        paramAnonymousView = (FavoriteImgDetailUI.a)FavoriteImgDetailUI.c(FavoriteImgDetailUI.this).get(paramAnonymousView.lUP);
        FavoriteImgDetailUI.a(FavoriteImgDetailUI.this, paramAnonymousView);
        if (!paramAnonymousView.lWa) {
          FavoriteImgDetailUI.b(paramAnonymousView);
        }
        GMTrace.o(6387019022336L, 47587);
        return true;
      }
    };
    this.lRF = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(6388763852800L, 47600);
  }
  
  private void a(final a parama)
  {
    GMTrace.i(6389569159168L, 47606);
    ap.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6380039700480L, 47535);
        Bitmap localBitmap2 = com.tencent.mm.plugin.favorite.c.g.a(parama.fBc, FavoriteImgDetailUI.b(FavoriteImgDetailUI.this), false);
        final Bitmap localBitmap1 = localBitmap2;
        if (localBitmap2 == null)
        {
          w.d("MicroMsg.FavoriteImgDetailUI", "get big img fail");
          localBitmap1 = FavoriteImgDetailUI.a(FavoriteImgDetailUI.this, parama.fBc);
        }
        af.u(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6410372907008L, 47761);
            FavoriteImgDetailUI.a(FavoriteImgDetailUI.this, FavoriteImgDetailUI.3.this.lVX, localBitmap1);
            GMTrace.o(6410372907008L, 47761);
          }
          
          public final String toString()
          {
            GMTrace.i(6410507124736L, 47762);
            String str = super.toString() + "|renderView";
            GMTrace.o(6410507124736L, 47762);
            return str;
          }
        });
        GMTrace.o(6380039700480L, 47535);
      }
    });
    GMTrace.o(6389569159168L, 47606);
  }
  
  private void ayh()
  {
    GMTrace.i(6389300723712L, 47604);
    if (ab.getResources() != null) {}
    for (DisplayMetrics localDisplayMetrics = ab.getResources().getDisplayMetrics();; localDisplayMetrics = getResources().getDisplayMetrics())
    {
      this.lVN = (localDisplayMetrics.widthPixels - getResources().getDimensionPixelOffset(R.f.aRG) * 2);
      this.lVN = Math.max(this.lVN, 0);
      w.d("MicroMsg.FavoriteImgDetailUI", "update display width %d", new Object[] { Integer.valueOf(this.lVN) });
      GMTrace.o(6389300723712L, 47604);
      return;
    }
  }
  
  private Bitmap k(sp paramsp)
  {
    boolean bool = true;
    GMTrace.i(6389703376896L, 47607);
    paramsp = com.tencent.mm.plugin.favorite.c.g.a(paramsp, this.lVO);
    if (paramsp != null) {}
    for (;;)
    {
      w.d("MicroMsg.FavoriteImgDetailUI", "get thumb ok ? %B", new Object[] { Boolean.valueOf(bool) });
      if (paramsp == null) {
        break;
      }
      GMTrace.o(6389703376896L, 47607);
      return paramsp;
      bool = false;
    }
    if (this.lVQ == null) {
      this.lVQ = com.tencent.mm.compatible.f.a.decodeResource(getResources(), R.k.dol);
    }
    paramsp = this.lVQ;
    GMTrace.o(6389703376896L, 47607);
    return paramsp;
  }
  
  public final void b(com.tencent.mm.plugin.favorite.b.a parama)
  {
    GMTrace.i(6389837594624L, 47608);
    if ((parama == null) || (!parama.isFinished()))
    {
      GMTrace.o(6389837594624L, 47608);
      return;
    }
    w.d("MicroMsg.FavoriteImgDetailUI", "on cdn status change, dataid[%s]", new Object[] { parama.field_dataId });
    parama = (a)this.lVP.get(parama.field_dataId);
    if (parama != null) {
      a(parama);
    }
    GMTrace.o(6389837594624L, 47608);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6388898070528L, 47601);
    int i = R.i.cUz;
    GMTrace.o(6388898070528L, 47601);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6389971812352L, 47609);
    if (1 == paramInt1)
    {
      if (-1 != paramInt2)
      {
        GMTrace.o(6389971812352L, 47609);
        return;
      }
      new com.tencent.mm.plugin.favorite.b.q();
      if (com.tencent.mm.plugin.favorite.b.q.h(this.lVO))
      {
        com.tencent.mm.ui.base.h.bl(this.vov.voR, getString(R.l.drQ));
        GMTrace.o(6389971812352L, 47609);
        return;
      }
      String str1 = paramIntent.getStringExtra("Select_Conv_User");
      String str2 = paramIntent.getStringExtra("custom_send_text");
      w.d("MicroMsg.FavoriteImgDetailUI", "select %s for sending", new Object[] { str1 });
      final com.tencent.mm.ui.base.q localq = com.tencent.mm.ui.base.h.a(this.vov.voR, getString(R.l.dWT), false, null);
      r.a(this.vov.voR, str1, str2, this.lVO, new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16140218662912L, 120254);
          localq.dismiss();
          com.tencent.mm.ui.snackbar.a.e(FavoriteImgDetailUI.this, FavoriteImgDetailUI.this.getString(R.l.dZv));
          GMTrace.o(16140218662912L, 120254);
        }
      });
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(6389971812352L, 47609);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(6389434941440L, 47605);
    super.onConfigurationChanged(paramConfiguration);
    ayh();
    paramConfiguration = this.lVP.entrySet().iterator();
    while (paramConfiguration.hasNext()) {
      a((a)((Map.Entry)paramConfiguration.next()).getValue());
    }
    GMTrace.o(6389434941440L, 47605);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6389032288256L, 47602);
    com.tencent.mm.pluginsdk.e.g(this);
    super.onCreate(paramBundle);
    ayh();
    this.lVJ = ((LinearLayout)findViewById(R.h.bHc));
    this.lVK = ((FavDetailTitleView)findViewById(R.h.bGN));
    this.lVL = ((FavDetailFooterView)findViewById(R.h.bGM));
    this.lVM = ((FavTagEntrance)findViewById(R.h.bHs));
    long l = getIntent().getLongExtra("key_detail_info_id", -1L);
    this.lVO = com.tencent.mm.plugin.favorite.h.awD().cc(l);
    if (this.lVO == null)
    {
      finish();
      GMTrace.o(6389032288256L, 47602);
      return;
    }
    this.lVK.z(this.lVO);
    this.lVL.z(this.lVO);
    paramBundle = this.lVO.field_favProto.tQC.iterator();
    int i = 0;
    while (paramBundle.hasNext())
    {
      sp localsp = (sp)paramBundle.next();
      w.d("MicroMsg.FavoriteImgDetailUI", "index[%d], dataid[%s]", new Object[] { Integer.valueOf(i), localsp.lUP });
      a locala = new a();
      locala.fBc = localsp;
      ImageView localImageView = new ImageView(this.vov.voR);
      int j = getResources().getDimensionPixelSize(R.f.aSq);
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
      if (i > 0) {
        localLayoutParams.topMargin = j;
      }
      this.lVJ.addView(localImageView, localLayoutParams);
      localImageView.setTag(localsp);
      j /= 2;
      localImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
      localImageView.setPadding(j, j, j, j);
      localImageView.setMinimumWidth(com.tencent.mm.bq.a.fromDPToPix(this.vov.voR, 50));
      localImageView.setMinimumHeight(com.tencent.mm.bq.a.fromDPToPix(this.vov.voR, 50));
      localImageView.setImageResource(R.k.dol);
      localImageView.setOnClickListener(this.lTT);
      localImageView.setOnLongClickListener(this.lVS);
      locala.fBd = localImageView;
      this.lVP.put(localsp.lUP, locala);
      a(locala);
      if (localsp.tPF != 0) {
        this.lVR = false;
      }
      i += 1;
    }
    this.lVM.ct(this.lVO.field_localId);
    this.lVM.ay(this.lVO.field_tagProto.tQM);
    rV(getString(R.l.dWe));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6402990931968L, 47706);
        FavoriteImgDetailUI.this.finish();
        GMTrace.o(6402990931968L, 47706);
        return true;
      }
    });
    a(0, R.l.eMR, R.k.dkJ, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6411983519744L, 47773);
        paramAnonymousMenuItem = new com.tencent.mm.ui.widget.e(FavoriteImgDetailUI.this.vov.voR, com.tencent.mm.ui.widget.e.wSP, false);
        paramAnonymousMenuItem.qQS = new o.c()
        {
          public final void a(m paramAnonymous2m)
          {
            GMTrace.i(6392119296000L, 47625);
            if (FavoriteImgDetailUI.a(FavoriteImgDetailUI.this)) {
              paramAnonymous2m.e(2, FavoriteImgDetailUI.this.getString(R.l.dXS));
            }
            paramAnonymous2m.e(0, FavoriteImgDetailUI.this.getString(R.l.dWs));
            paramAnonymous2m.e(1, FavoriteImgDetailUI.this.vov.voR.getString(R.l.duY));
            GMTrace.o(6392119296000L, 47625);
          }
        };
        paramAnonymousMenuItem.qQT = new o.d()
        {
          public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
          {
            GMTrace.i(6384871538688L, 47571);
            switch (paramAnonymous2MenuItem.getItemId())
            {
            }
            for (;;)
            {
              GMTrace.o(6384871538688L, 47571);
              return;
              paramAnonymous2MenuItem = new Intent(FavoriteImgDetailUI.this.vov.voR, FavTagEditUI.class);
              paramAnonymous2MenuItem.putExtra("key_fav_scene", 2);
              paramAnonymous2MenuItem.putExtra("key_fav_item_id", FavoriteImgDetailUI.b(FavoriteImgDetailUI.this).field_localId);
              FavoriteImgDetailUI.this.vov.voR.startActivity(paramAnonymous2MenuItem);
              GMTrace.o(6384871538688L, 47571);
              return;
              com.tencent.mm.ui.base.h.a(FavoriteImgDetailUI.this.vov.voR, FavoriteImgDetailUI.this.getString(R.l.duZ), "", new DialogInterface.OnClickListener()
              {
                public final void onClick(final DialogInterface paramAnonymous3DialogInterface, int paramAnonymous3Int)
                {
                  GMTrace.i(6394803650560L, 47645);
                  paramAnonymous3DialogInterface = com.tencent.mm.ui.base.h.a(FavoriteImgDetailUI.this.vov.voR, FavoriteImgDetailUI.this.getString(R.l.duZ), false, null);
                  x.a(FavoriteImgDetailUI.b(FavoriteImgDetailUI.this).field_localId, new Runnable()
                  {
                    public final void run()
                    {
                      GMTrace.i(6388629635072L, 47599);
                      paramAnonymous3DialogInterface.dismiss();
                      w.d("MicroMsg.FavoriteImgDetailUI", "do del, local id %d", new Object[] { Long.valueOf(FavoriteImgDetailUI.b(FavoriteImgDetailUI.this).field_localId) });
                      FavoriteImgDetailUI.this.finish();
                      GMTrace.o(6388629635072L, 47599);
                    }
                  });
                  GMTrace.o(6394803650560L, 47645);
                }
              }, null);
              GMTrace.o(6384871538688L, 47571);
              return;
              paramAnonymous2MenuItem = new Intent();
              paramAnonymous2MenuItem.putExtra("Select_Conv_Type", 3);
              paramAnonymous2MenuItem.putExtra("scene_from", 1);
              paramAnonymous2MenuItem.putExtra("mutil_select_is_ret", true);
              paramAnonymous2MenuItem.putExtra("select_fav_local_id", FavoriteImgDetailUI.b(FavoriteImgDetailUI.this).field_localId);
              d.a(FavoriteImgDetailUI.this, ".ui.transmit.SelectConversationUI", paramAnonymous2MenuItem, 1);
              com.tencent.mm.plugin.report.service.g.paX.i(10651, new Object[] { Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(0) });
            }
          }
        };
        paramAnonymousMenuItem.bCV();
        GMTrace.o(6411983519744L, 47773);
        return true;
      }
    });
    com.tencent.mm.pluginsdk.e.h(this);
    com.tencent.mm.plugin.favorite.h.awD().c(this.lVM);
    com.tencent.mm.plugin.favorite.h.awy().a(this);
    com.tencent.mm.sdk.b.a.uLm.b(this.lRF);
    GMTrace.o(6389032288256L, 47602);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6389166505984L, 47603);
    com.tencent.mm.plugin.favorite.h.awD().j(this.lVM);
    com.tencent.mm.plugin.favorite.h.awy().b(this);
    com.tencent.mm.sdk.b.a.uLm.c(this.lRF);
    super.onDestroy();
    GMTrace.o(6389166505984L, 47603);
  }
  
  protected void onResume()
  {
    GMTrace.i(6390106030080L, 47610);
    super.onResume();
    Iterator localIterator = this.lVP.entrySet().iterator();
    while (localIterator.hasNext()) {
      a((a)((Map.Entry)localIterator.next()).getValue());
    }
    GMTrace.o(6390106030080L, 47610);
  }
  
  private final class a
  {
    sp fBc;
    ImageView fBd;
    int fwh;
    int fwi;
    l iYs;
    boolean lWa;
    String lWb;
    
    public a()
    {
      GMTrace.i(16141560840192L, 120264);
      this.iYs = new l(FavoriteImgDetailUI.this.vov.voR);
      this.lWa = false;
      this.lWb = null;
      this.fwh = 0;
      this.fwi = 0;
      GMTrace.o(16141560840192L, 120264);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/detail/FavoriteImgDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */