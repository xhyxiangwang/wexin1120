package com.tencent.mm.plugin.favorite.ui.detail;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.bi.d;
import com.tencent.mm.plugin.favorite.b.b;
import com.tencent.mm.plugin.favorite.b.b.a;
import com.tencent.mm.plugin.favorite.b.k;
import com.tencent.mm.plugin.favorite.b.r;
import com.tencent.mm.plugin.favorite.b.v;
import com.tencent.mm.plugin.favorite.b.v.a;
import com.tencent.mm.plugin.favorite.b.v.c;
import com.tencent.mm.plugin.favorite.b.v.d;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.c.c;
import com.tencent.mm.plugin.favorite.ui.FavTagEditUI;
import com.tencent.mm.plugin.favorite.ui.base.FavDetailFooterView;
import com.tencent.mm.plugin.favorite.ui.base.FavDetailTitleView;
import com.tencent.mm.plugin.favorite.ui.base.FavTagEntrance;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.m;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.x.o;

public class FavoriteSightDetailUI
  extends MMActivity
  implements b.a, j.a
{
  private sp fBc;
  private com.tencent.mm.plugin.favorite.b.q lSB;
  private com.tencent.mm.plugin.favorite.b.j lSF;
  private ImageView lUH;
  private boolean lUM;
  private boolean lVp;
  private boolean lVv;
  private FavDetailTitleView lWc;
  private FavDetailFooterView lWd;
  private FavTagEntrance lWe;
  private View lWf;
  private ImageView lWg;
  private MMPinProgressBtn lWh;
  private VideoPlayerTextureView lWi;
  private long lWj;
  private boolean lWk;
  private boolean lWl;
  
  public FavoriteSightDetailUI()
  {
    GMTrace.i(6376550039552L, 47509);
    this.lWk = true;
    this.lVp = false;
    this.lUM = false;
    this.lVv = false;
    this.lSB = new com.tencent.mm.plugin.favorite.b.q();
    this.lWl = false;
    GMTrace.o(6376550039552L, 47509);
  }
  
  private void ayi()
  {
    GMTrace.i(6378026434560L, 47520);
    String str = x.g(this.fBc);
    if (!com.tencent.mm.a.e.aZ(str))
    {
      GMTrace.o(6378026434560L, 47520);
      return;
    }
    this.lWi.stop();
    this.lWi.ck(true);
    this.lWi.setVideoPath(str);
    GMTrace.o(6378026434560L, 47520);
  }
  
  private void eD(boolean paramBoolean)
  {
    GMTrace.i(6377489563648L, 47516);
    if (this.lSF.isDone())
    {
      if (x.d(this.fBc))
      {
        this.lWg.setVisibility(8);
        this.lWh.setVisibility(8);
        ayi();
        GMTrace.o(6377489563648L, 47516);
        return;
      }
      if (bg.mZ(this.fBc.tOx)) {
        this.lWg.setImageResource(R.k.dqL);
      }
    }
    for (;;)
    {
      this.lWg.setVisibility(0);
      this.lWh.setVisibility(8);
      this.lUH.setVisibility(0);
      GMTrace.o(6377489563648L, 47516);
      return;
      w.w("MicroMsg.FavoriteSightDetailUI", "? info is done, source file not exist, cdn data url is not null");
      this.lWg.setImageResource(R.k.dqL);
      continue;
      if (this.lSF.awN())
      {
        if (bg.mZ(this.fBc.tOx))
        {
          this.lWg.setImageResource(R.k.dqL);
          if (!paramBoolean) {}
        }
        else
        {
          this.lWg.setImageResource(R.k.dqL);
          if (paramBoolean) {
            com.tencent.mm.ui.base.h.bl(this.vov.voR, getString(R.l.dQj));
          }
        }
      }
      else if (this.lSF.awM())
      {
        this.lWg.setImageResource(R.k.dqL);
        if (paramBoolean) {
          com.tencent.mm.ui.base.h.bl(this.vov.voR, getString(R.l.eNO));
        }
      }
      else
      {
        if ((this.lSF.isDownloading()) || (this.lSF.awL()))
        {
          this.lWg.setVisibility(8);
          this.lWh.setVisibility(0);
          com.tencent.mm.plugin.favorite.b.a locala = com.tencent.mm.plugin.favorite.h.awy().wZ(this.fBc.lUP);
          if (locala != null) {
            this.lWh.setProgress((int)locala.getProgress());
          }
          for (;;)
          {
            this.lUH.setVisibility(0);
            GMTrace.o(6377489563648L, 47516);
            return;
            this.lWh.setProgress(0);
          }
        }
        w.w("MicroMsg.FavoriteSightDetailUI", "other status, not done, downloading, uploading, downloadfail, uploadfail");
        this.lWg.setImageResource(R.k.dqL);
      }
    }
  }
  
  protected final int Qb()
  {
    GMTrace.i(6376818475008L, 47511);
    GMTrace.o(6376818475008L, 47511);
    return 1;
  }
  
  public final void a(String paramString, l paraml)
  {
    boolean bool = false;
    GMTrace.i(6377623781376L, 47517);
    w.i("MicroMsg.FavoriteSightDetailUI", "on favitem change, notifyId:%s, curId:%d", new Object[] { paramString, Long.valueOf(this.lSF.field_localId) });
    paramString = com.tencent.mm.plugin.favorite.h.awD().cc(this.lSF.field_localId);
    if (paramString == null)
    {
      w.w("MicroMsg.FavoriteSightDetailUI", "error, on notify change, cannot find info");
      finish();
      GMTrace.o(6377623781376L, 47517);
      return;
    }
    this.lSF = paramString;
    this.fBc = x.n(paramString);
    paramString = com.tencent.mm.plugin.favorite.h.awy().wZ(this.fBc.lUP);
    if (paramString == null) {}
    while (bool)
    {
      GMTrace.o(6377623781376L, 47517);
      return;
      if (!this.lVv)
      {
        if ((paramString.field_status == 4) && (com.tencent.mm.plugin.favorite.h.awy().wZ(this.fBc.lUP).field_extFlag != 0))
        {
          x.a(this.lSF, this.fBc, true);
          this.lVv = true;
        }
        w.i("MicroMsg.FavoriteSightDetailUI", "FavoriteFileDetail download, check retry, return %B", new Object[] { Boolean.valueOf(this.lVv) });
        bool = this.lVv;
      }
    }
    af.u(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6403796238336L, 47712);
        FavoriteSightDetailUI.a(FavoriteSightDetailUI.this, true);
        GMTrace.o(6403796238336L, 47712);
      }
    });
    GMTrace.o(6377623781376L, 47517);
  }
  
  public final void b(com.tencent.mm.plugin.favorite.b.a parama)
  {
    GMTrace.i(6377757999104L, 47518);
    if ((parama == null) || (parama.field_dataId == null))
    {
      w.w("MicroMsg.FavoriteSightDetailUI", "on cdn status changed, item is null");
      GMTrace.o(6377757999104L, 47518);
      return;
    }
    w.i("MicroMsg.FavoriteSightDetailUI", "on cdn status changed, dataID is %s, field id is %s,offset is %d, total is %d,cdn status is %d, cdn type is %d (send or recieve)", new Object[] { this.fBc.lUP, parama.field_dataId, Integer.valueOf(parama.field_offset), Integer.valueOf(parama.field_totalLen), Integer.valueOf(parama.field_status), Integer.valueOf(parama.field_type) });
    if (parama.field_offset > parama.field_totalLen)
    {
      w.e("MicroMsg.FavoriteSightDetailUI", "on cdn status changed, cdn offset length > cdn total length, do cdnLengthError()");
      if (1 != parama.field_type) {
        break label225;
      }
    }
    label225:
    for (parama.field_status = 2;; parama.field_status = 4)
    {
      com.tencent.mm.plugin.favorite.h.awy().a(parama, new String[0]);
      if (parama.field_type == 0) {
        c.e(parama);
      }
      if (parama.field_type == 1) {
        c.f(parama);
      }
      if (parama.field_dataId.equals(this.fBc.lUP))
      {
        final int i = (int)parama.getProgress();
        this.lWh.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6410104471552L, 47759);
            FavoriteSightDetailUI.c(FavoriteSightDetailUI.this).setProgress(i);
            GMTrace.o(6410104471552L, 47759);
          }
        });
      }
      GMTrace.o(6377757999104L, 47518);
      return;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6376684257280L, 47510);
    int i = R.i.cUA;
    GMTrace.o(6376684257280L, 47510);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6377892216832L, 47519);
    if ((paramInt1 == 1) && (-1 == paramInt2))
    {
      String str;
      label32:
      Object localObject;
      label96:
      v.d locald;
      if (paramIntent == null)
      {
        str = null;
        if (paramIntent != null) {
          break label160;
        }
        paramIntent = null;
        localObject = new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6411312431104L, 47768);
            this.lRz.dismiss();
            GMTrace.o(6411312431104L, 47768);
          }
        };
        r.a(this.vov.voR, str, paramIntent, this.lSF, (Runnable)localObject);
        boolean bool = o.dW(str);
        if (!bool) {
          break label171;
        }
        paramIntent = v.c.lPl;
        localObject = this.lSF;
        locald = v.d.lPo;
        if (!bool) {
          break label178;
        }
      }
      label160:
      label171:
      label178:
      for (paramInt1 = com.tencent.mm.x.j.eU(str);; paramInt1 = 0)
      {
        v.a(paramIntent, (com.tencent.mm.plugin.favorite.b.j)localObject, locald, paramInt1);
        com.tencent.mm.ui.snackbar.a.e(this, getString(R.l.dZv));
        GMTrace.o(6377892216832L, 47519);
        return;
        str = paramIntent.getStringExtra("Select_Conv_User");
        break;
        paramIntent = paramIntent.getStringExtra("custom_send_text");
        break label32;
        paramIntent = v.c.lPk;
        break label96;
      }
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(6377892216832L, 47519);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6376952692736L, 47512);
    com.tencent.mm.pluginsdk.e.g(this);
    super.onCreate(paramBundle);
    this.lWj = getIntent().getLongExtra("key_detail_info_id", -1L);
    this.lSF = com.tencent.mm.plugin.favorite.h.awD().cc(this.lWj);
    if (this.lSF == null)
    {
      w.w("MicroMsg.FavoriteSightDetailUI", "id[%d] info is null, return", new Object[] { Long.valueOf(this.lWj) });
      finish();
      GMTrace.o(6376952692736L, 47512);
      return;
    }
    v.j(this.lSF);
    this.fBc = x.n(this.lSF);
    this.lWc = ((FavDetailTitleView)findViewById(R.h.bGN));
    this.lWd = ((FavDetailFooterView)findViewById(R.h.bGM));
    this.lWe = ((FavTagEntrance)findViewById(R.h.bHs));
    this.lWg = ((ImageView)findViewById(R.h.cyW));
    this.lWh = ((MMPinProgressBtn)findViewById(R.h.cEw));
    this.lWf = findViewById(R.h.bvl);
    this.lWi = ((VideoPlayerTextureView)findViewById(R.h.cEM));
    this.lUH = ((ImageView)findViewById(R.h.cEH));
    this.lWe.ct(this.lSF.field_localId);
    this.lWe.ay(this.lSF.field_tagProto.tQM);
    this.lWc.z(this.lSF);
    this.lWd.z(this.lSF);
    this.lWf.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6400709230592L, 47689);
        if ((com.tencent.mm.p.a.aQ(paramAnonymousView.getContext())) || (com.tencent.mm.p.a.aO(paramAnonymousView.getContext())))
        {
          GMTrace.o(6400709230592L, 47689);
          return;
        }
        w.i("MicroMsg.FavoriteSightDetailUI", "click item favid %d, localid %d, itemstatus %d", new Object[] { Integer.valueOf(FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).field_id), Long.valueOf(FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).field_localId), Integer.valueOf(FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).field_itemStatus) });
        if (FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).isDone())
        {
          if (x.d(FavoriteSightDetailUI.b(FavoriteSightDetailUI.this)))
          {
            v.a(v.a.lOX, FavoriteSightDetailUI.a(FavoriteSightDetailUI.this));
            FavoriteSightDetailUI.a(FavoriteSightDetailUI.this, true, paramAnonymousView.getContext());
            GMTrace.o(6400709230592L, 47689);
            return;
          }
          if (bg.mZ(FavoriteSightDetailUI.b(FavoriteSightDetailUI.this).tOx))
          {
            FavoriteSightDetailUI.a(FavoriteSightDetailUI.this, false, paramAnonymousView.getContext());
            GMTrace.o(6400709230592L, 47689);
            return;
          }
          w.w("MicroMsg.FavoriteSightDetailUI", "? info is done, source file not exist, cdn data url is not null");
          if (!FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).awM()) {
            break label348;
          }
          x.l(FavoriteSightDetailUI.a(FavoriteSightDetailUI.this));
        }
        for (;;)
        {
          FavoriteSightDetailUI.a(FavoriteSightDetailUI.this, false);
          GMTrace.o(6400709230592L, 47689);
          return;
          if (FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).awN())
          {
            if (!bg.mZ(FavoriteSightDetailUI.b(FavoriteSightDetailUI.this).tOx)) {
              break;
            }
            FavoriteSightDetailUI.a(FavoriteSightDetailUI.this, false, paramAnonymousView.getContext());
            GMTrace.o(6400709230592L, 47689);
            return;
          }
          if ((!FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).isDownloading()) && (!FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).awL())) {
            break;
          }
          if (FavoriteSightDetailUI.c(FavoriteSightDetailUI.this).getVisibility() == 8) {
            FavoriteSightDetailUI.a(FavoriteSightDetailUI.this, false);
          }
          GMTrace.o(6400709230592L, 47689);
          return;
          label348:
          x.m(FavoriteSightDetailUI.a(FavoriteSightDetailUI.this));
        }
      }
    });
    this.lWi.pCt = new f.a()
    {
      public final void Xd()
      {
        GMTrace.i(6397756440576L, 47667);
        w.i("MicroMsg.FavoriteSightDetailUI", " onPrepared");
        FavoriteSightDetailUI.d(FavoriteSightDetailUI.this);
        FavoriteSightDetailUI.b(FavoriteSightDetailUI.this, FavoriteSightDetailUI.d(FavoriteSightDetailUI.this).start());
        af.u(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6386482151424L, 47583);
            FavoriteSightDetailUI.e(FavoriteSightDetailUI.this).setVisibility(8);
            GMTrace.o(6386482151424L, 47583);
          }
        });
        GMTrace.o(6397756440576L, 47667);
      }
      
      public final int bL(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(6398159093760L, 47670);
        GMTrace.o(6398159093760L, 47670);
        return 0;
      }
      
      public final void br(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(6398293311488L, 47671);
        GMTrace.o(6398293311488L, 47671);
      }
      
      public final void onError(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(6397890658304L, 47668);
        w.e("MicroMsg.FavoriteSightDetailUI", "VideoPlay: on play video error what %d extra %d.", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        if (paramAnonymousInt1 == -1)
        {
          FavoriteSightDetailUI.d(FavoriteSightDetailUI.this).stop();
          if (com.tencent.mm.a.e.aZ(x.g(FavoriteSightDetailUI.b(FavoriteSightDetailUI.this))))
          {
            FavoriteSightDetailUI.f(FavoriteSightDetailUI.this);
            GMTrace.o(6397890658304L, 47668);
            return;
          }
          if (com.tencent.mm.a.e.aZ(x.h(FavoriteSightDetailUI.b(FavoriteSightDetailUI.this)))) {
            FavoriteSightDetailUI.e(FavoriteSightDetailUI.this).setVisibility(0);
          }
          GMTrace.o(6397890658304L, 47668);
          return;
        }
        if (FavoriteSightDetailUI.g(FavoriteSightDetailUI.this))
        {
          qq();
          GMTrace.o(6397890658304L, 47668);
          return;
        }
        FavoriteSightDetailUI.d(FavoriteSightDetailUI.this).stop();
        if (FavoriteSightDetailUI.h(FavoriteSightDetailUI.this))
        {
          GMTrace.o(6397890658304L, 47668);
          return;
        }
        FavoriteSightDetailUI.i(FavoriteSightDetailUI.this);
        af.u(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6403259367424L, 47708);
            com.tencent.mm.ui.base.h.h(FavoriteSightDetailUI.this.vov.voR, R.l.eOR, R.l.dJz);
            GMTrace.o(6403259367424L, 47708);
          }
        });
        GMTrace.o(6397890658304L, 47668);
      }
      
      public final void qq()
      {
        GMTrace.i(6398024876032L, 47669);
        FavoriteSightDetailUI.d(FavoriteSightDetailUI.this).o(0.0D);
        GMTrace.o(6398024876032L, 47669);
      }
    };
    rV(getString(R.l.dWe));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6400440795136L, 47687);
        FavoriteSightDetailUI.this.finish();
        GMTrace.o(6400440795136L, 47687);
        return true;
      }
    });
    a(0, R.l.eMR, R.g.baG, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6398830182400L, 47675);
        paramAnonymousMenuItem = new com.tencent.mm.ui.widget.e(FavoriteSightDetailUI.this.vov.voR, com.tencent.mm.ui.widget.e.wSP, false);
        paramAnonymousMenuItem.qQS = new o.c()
        {
          public final void a(m paramAnonymous2m)
          {
            GMTrace.i(6398561746944L, 47673);
            if ((FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).awJ()) && (!FavoriteSightDetailUI.j(FavoriteSightDetailUI.this).g(FavoriteSightDetailUI.a(FavoriteSightDetailUI.this)))) {}
            for (int i = 1;; i = 0)
            {
              if ((i != 0) && (FavoriteSightDetailUI.b(FavoriteSightDetailUI.this).tPF == 0)) {
                paramAnonymous2m.e(0, FavoriteSightDetailUI.this.getString(R.l.dXS));
              }
              paramAnonymous2m.e(3, FavoriteSightDetailUI.this.getString(R.l.dWs));
              paramAnonymous2m.e(2, FavoriteSightDetailUI.this.vov.voR.getString(R.l.duY));
              GMTrace.o(6398561746944L, 47673);
              return;
            }
          }
        };
        paramAnonymousMenuItem.qQT = new o.d()
        {
          public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
          {
            GMTrace.i(6396951134208L, 47661);
            switch (paramAnonymous2MenuItem.getItemId())
            {
            }
            for (;;)
            {
              GMTrace.o(6396951134208L, 47661);
              return;
              com.tencent.mm.plugin.report.service.g.paX.i(10651, new Object[] { Integer.valueOf(FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).field_type), Integer.valueOf(1), Integer.valueOf(0) });
              paramAnonymous2MenuItem = new Intent();
              paramAnonymous2MenuItem.putExtra("Select_Conv_Type", 3);
              paramAnonymous2MenuItem.putExtra("scene_from", 1);
              paramAnonymous2MenuItem.putExtra("mutil_select_is_ret", true);
              paramAnonymous2MenuItem.putExtra("select_fav_local_id", FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).field_localId);
              d.a(FavoriteSightDetailUI.this.vov.voR, ".ui.transmit.SelectConversationUI", paramAnonymous2MenuItem, 1);
              GMTrace.o(6396951134208L, 47661);
              return;
              com.tencent.mm.ui.base.h.a(FavoriteSightDetailUI.this.vov.voR, FavoriteSightDetailUI.this.getString(R.l.duZ), "", new DialogInterface.OnClickListener()
              {
                public final void onClick(final DialogInterface paramAnonymous3DialogInterface, int paramAnonymous3Int)
                {
                  GMTrace.i(6395072086016L, 47647);
                  paramAnonymous3DialogInterface = com.tencent.mm.ui.base.h.a(FavoriteSightDetailUI.this.vov.voR, FavoriteSightDetailUI.this.getString(R.l.duZ), false, null);
                  x.a(FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).field_localId, new Runnable()
                  {
                    public final void run()
                    {
                      GMTrace.i(6385945280512L, 47579);
                      paramAnonymous3DialogInterface.dismiss();
                      w.i("MicroMsg.FavoriteSightDetailUI", "do del fav file, local id %d, fav id %d", new Object[] { Long.valueOf(FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).field_localId), Integer.valueOf(FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).field_id) });
                      FavoriteSightDetailUI.this.finish();
                      GMTrace.o(6385945280512L, 47579);
                    }
                  });
                  GMTrace.o(6395072086016L, 47647);
                }
              }, null);
              GMTrace.o(6396951134208L, 47661);
              return;
              paramAnonymous2MenuItem = new Intent(FavoriteSightDetailUI.this.vov.voR, FavTagEditUI.class);
              paramAnonymous2MenuItem.putExtra("key_fav_scene", 2);
              paramAnonymous2MenuItem.putExtra("key_fav_item_id", FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).field_localId);
              FavoriteSightDetailUI.this.vov.voR.startActivity(paramAnonymous2MenuItem);
            }
          }
        };
        paramAnonymousMenuItem.bCV();
        GMTrace.o(6398830182400L, 47675);
        return true;
      }
    });
    if (!com.tencent.mm.a.e.aZ(x.h(this.fBc))) {
      if (!bg.mZ(this.fBc.haX)) {
        x.b(this.lSF, this.fBc, true);
      }
    }
    do
    {
      eD(false);
      com.tencent.mm.plugin.favorite.h.awD().c(this.lWe);
      com.tencent.mm.plugin.favorite.h.awD().c(this);
      com.tencent.mm.plugin.favorite.h.awy().a(this);
      com.tencent.mm.pluginsdk.e.h(this);
      GMTrace.o(6376952692736L, 47512);
      return;
      paramBundle = com.tencent.mm.plugin.favorite.c.g.a(this.fBc, this.lSF);
    } while (paramBundle == null);
    int i = paramBundle.getWidth();
    int j = paramBundle.getHeight();
    DisplayMetrics localDisplayMetrics;
    float f;
    ViewGroup.LayoutParams localLayoutParams;
    if (!this.lWl)
    {
      this.lWl = true;
      localDisplayMetrics = this.lWf.getResources().getDisplayMetrics();
      f = localDisplayMetrics.density;
      localLayoutParams = this.lWf.getLayoutParams();
      if (localLayoutParams != null) {
        break label522;
      }
      w.e("MicroMsg.FavoriteSightDetailUI", "setViewResize, but params is null");
    }
    for (;;)
    {
      this.lUH.setImageBitmap(paramBundle);
      this.lUH.setVisibility(0);
      break;
      label522:
      localLayoutParams.width = (localDisplayMetrics.widthPixels - (int)(f * 36.0F + 0.5F));
      localLayoutParams.height = (j * localLayoutParams.width / i);
      this.lWf.setLayoutParams(localLayoutParams);
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6377086910464L, 47513);
    if (this.lWi != null)
    {
      this.lWi.pCt = null;
      this.lWi.stop();
    }
    if (this.lWe != null) {
      com.tencent.mm.plugin.favorite.h.awD().j(this.lWe);
    }
    com.tencent.mm.plugin.favorite.h.awD().j(this);
    com.tencent.mm.plugin.favorite.h.awy().b(this);
    super.onDestroy();
    GMTrace.o(6377086910464L, 47513);
  }
  
  protected void onPause()
  {
    GMTrace.i(6377355345920L, 47515);
    if (this.lWi != null) {
      this.lWi.stop();
    }
    super.onPause();
    GMTrace.o(6377355345920L, 47515);
  }
  
  protected void onResume()
  {
    GMTrace.i(6377221128192L, 47514);
    super.onResume();
    if (this.lWi != null)
    {
      if (this.lWk) {
        break label46;
      }
      ayi();
    }
    for (;;)
    {
      this.lWk = false;
      GMTrace.o(6377221128192L, 47514);
      return;
      label46:
      if (!this.lWi.isPlaying()) {
        this.lWi.start();
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/detail/FavoriteSightDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */