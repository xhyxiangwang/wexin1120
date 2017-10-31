package com.tencent.mm.plugin.favorite.ui.detail;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.favorite.b.r.5;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.ui.base.FavVideoView;
import com.tencent.mm.plugin.favorite.ui.base.FavVideoView.5;
import com.tencent.mm.pluginsdk.ui.tools.f;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.m;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.g.b;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.o;
import java.io.File;
import java.util.Iterator;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class FavoriteVideoPlayUI
  extends MMActivity
{
  private String fBx;
  private boolean fHE;
  private String hCR;
  private int kvA;
  private Bundle kvu;
  private boolean kvv;
  private com.tencent.mm.ui.tools.g kvw;
  private int kvx;
  private int kvy;
  private int kvz;
  private View.OnClickListener lTT;
  private String lUP;
  private View.OnLongClickListener lVS;
  private int lWB;
  private String lWC;
  private RelativeLayout lWD;
  private ImageView lWE;
  private FavVideoView lWF;
  private LinearLayout lWG;
  private boolean lWH;
  private int lWI;
  private boolean lWJ;
  private boolean lWk;
  
  public FavoriteVideoPlayUI()
  {
    GMTrace.i(6381247660032L, 47544);
    this.lWk = true;
    this.kvv = false;
    this.kvx = 0;
    this.kvy = 0;
    this.kvz = 0;
    this.kvA = 0;
    this.lWH = true;
    this.fHE = true;
    this.lWJ = false;
    this.lUP = "";
    this.lTT = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6409299165184L, 47753);
        FavoriteVideoPlayUI.this.alb();
        GMTrace.o(6409299165184L, 47753);
      }
    };
    this.lVS = new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(6391850860544L, 47623);
        paramAnonymousView.getTag();
        paramAnonymousView = new l(FavoriteVideoPlayUI.this.vov.voR);
        paramAnonymousView.qQS = new o.c()
        {
          public final void a(m paramAnonymous2m)
          {
            GMTrace.i(6403527802880L, 47710);
            if (FavoriteVideoPlayUI.a(FavoriteVideoPlayUI.this))
            {
              if (com.tencent.mm.a.e.aZ(FavoriteVideoPlayUI.b(FavoriteVideoPlayUI.this))) {
                paramAnonymous2m.add(0, 1, 0, FavoriteVideoPlayUI.this.getString(R.l.dXS));
              }
              paramAnonymous2m.add(0, 2, 0, FavoriteVideoPlayUI.this.getString(R.l.dIU));
            }
            GMTrace.o(6403527802880L, 47710);
          }
        };
        paramAnonymousView.qQT = new o.d()
        {
          public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
          {
            GMTrace.i(6380576571392L, 47539);
            switch (paramAnonymous2MenuItem.getItemId())
            {
            }
            for (;;)
            {
              GMTrace.o(6380576571392L, 47539);
              return;
              paramAnonymous2MenuItem = new Intent();
              paramAnonymous2MenuItem.putExtra("Select_Conv_Type", 3);
              paramAnonymous2MenuItem.putExtra("select_is_ret", true);
              paramAnonymous2MenuItem.putExtra("mutil_select_is_ret", true);
              if (com.tencent.mm.a.e.aZ(FavoriteVideoPlayUI.b(FavoriteVideoPlayUI.this))) {
                paramAnonymous2MenuItem.putExtra("image_path", FavoriteVideoPlayUI.b(FavoriteVideoPlayUI.this));
              }
              for (;;)
              {
                paramAnonymous2MenuItem.putExtra("Retr_Msg_Type", 1);
                com.tencent.mm.bi.d.a(FavoriteVideoPlayUI.this.vov.voR, ".ui.transmit.SelectConversationUI", paramAnonymous2MenuItem, 1);
                if (FavoriteVideoPlayUI.d(FavoriteVideoPlayUI.this) != 0) {
                  break;
                }
                com.tencent.mm.plugin.report.service.g.paX.i(10651, new Object[] { Integer.valueOf(4), Integer.valueOf(1), Integer.valueOf(0) });
                GMTrace.o(6380576571392L, 47539);
                return;
                paramAnonymous2MenuItem.putExtra("image_path", FavoriteVideoPlayUI.c(FavoriteVideoPlayUI.this));
              }
              x.e(FavoriteVideoPlayUI.c(FavoriteVideoPlayUI.this), FavoriteVideoPlayUI.this);
            }
          }
        };
        paramAnonymousView.bnM();
        GMTrace.o(6391850860544L, 47623);
        return true;
      }
    };
    GMTrace.o(6381247660032L, 47544);
  }
  
  private void b(ImageView paramImageView)
  {
    GMTrace.i(16934116524032L, 126169);
    FavVideoView localFavVideoView = this.lWF;
    String str1 = this.hCR;
    boolean bool = this.lWJ;
    String str2 = this.lUP;
    localFavVideoView.hCR = str1;
    if (bool)
    {
      localFavVideoView.kvt.post(new FavVideoView.5(localFavVideoView));
      localFavVideoView.lUP = str2;
    }
    if (paramImageView != null)
    {
      if (!com.tencent.mm.a.e.aZ(this.fBx)) {
        break label104;
      }
      paramImageView.setImageBitmap(BackwardSupportUtil.b.c(this.fBx, 1.0F));
    }
    for (;;)
    {
      w.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay: fullPath is not null,but not exist videoView.setVideoData(null)");
      GMTrace.o(16934116524032L, 126169);
      return;
      label104:
      paramImageView.setImageResource(R.g.aXE);
    }
  }
  
  public final void alb()
  {
    GMTrace.i(6382455619584L, 47553);
    this.lWG.setVisibility(8);
    int k = this.lWD.getWidth();
    int j = this.lWD.getHeight();
    int i = j;
    if (this.kvz != 0)
    {
      i = j;
      if (this.kvA != 0) {
        i = (int)(k / this.kvz * this.kvA);
      }
    }
    this.kvw.ex(k, i);
    this.kvw.p(this.kvy, this.kvx, this.kvz, this.kvA);
    this.kvw.a(this.lWF, this.lWE, new g.b()
    {
      public final void onAnimationEnd()
      {
        GMTrace.i(6391313989632L, 47619);
        new ae().post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6384066232320L, 47565);
            FavoriteVideoPlayUI.this.finish();
            FavoriteVideoPlayUI.this.overridePendingTransition(0, 0);
            GMTrace.o(6384066232320L, 47565);
          }
        });
        GMTrace.o(6391313989632L, 47619);
      }
      
      public final void onAnimationStart()
      {
        GMTrace.i(6391179771904L, 47618);
        GMTrace.o(6391179771904L, 47618);
      }
    }, null);
    GMTrace.o(6382455619584L, 47553);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(6382187184128L, 47551);
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(6382187184128L, 47551);
    return bool;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6381516095488L, 47546);
    int i = R.i.cUv;
    GMTrace.o(6381516095488L, 47546);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6382321401856L, 47552);
    if ((paramInt1 == 1) && (-1 == paramInt2))
    {
      if (paramIntent == null)
      {
        localObject = null;
        if (paramIntent != null) {
          break label91;
        }
      }
      Runnable local3;
      label91:
      for (paramIntent = null;; paramIntent = paramIntent.getStringExtra("custom_send_text"))
      {
        local3 = new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6381113442304L, 47543);
            this.lRz.dismiss();
            GMTrace.o(6381113442304L, 47543);
          }
        };
        if (!bg.mZ((String)localObject)) {
          break label102;
        }
        GMTrace.o(6382321401856L, 47552);
        return;
        localObject = paramIntent.getStringExtra("Select_Conv_User");
        break;
      }
      label102:
      Object localObject = bg.f(((String)localObject).split(",")).iterator();
      label301:
      while (((Iterator)localObject).hasNext())
      {
        String str1 = (String)((Iterator)localObject).next();
        ActionBarActivity localActionBarActivity = this.vov.voR;
        String str2 = this.hCR;
        String str3 = this.fBx;
        paramInt1 = this.lWB;
        String str4 = this.lWC;
        if (localActionBarActivity == null) {
          w.w("MicroMsg.FavSendLogic", "want to send fav video, but context is null");
        }
        for (;;)
        {
          if (bg.mZ(paramIntent)) {
            break label301;
          }
          com.tencent.mm.plugin.messenger.a.d.aNb().A(str1, paramIntent, o.fY(str1));
          break;
          if (bg.mZ(str1))
          {
            w.w("MicroMsg.FavSendLogic", "want to send fav video, but to user is null");
          }
          else
          {
            File localFile = new File(str2);
            if ((bg.mZ(str2)) && (!localFile.exists())) {
              w.w("MicroMsg.FavSendLogic", "want to send fav video, but datapath is null or is not exist ");
            } else {
              ap.xC().C(new r.5(localActionBarActivity, str1, str2, str3, paramInt1, str4, local3));
            }
          }
        }
      }
      com.tencent.mm.ui.snackbar.a.e(this, getString(R.l.dZv));
      GMTrace.o(6382321401856L, 47552);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(6382321401856L, 47552);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(6382589837312L, 47554);
    alb();
    GMTrace.o(6382589837312L, 47554);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6381381877760L, 47545);
    super.onCreate(paramBundle);
    this.vov.bUK();
    if (com.tencent.mm.compatible.util.d.et(19)) {
      getWindow().setFlags(201327616, 201327616);
    }
    for (;;)
    {
      this.kvu = paramBundle;
      getWindow().addFlags(128);
      this.lWH = getIntent().getBooleanExtra("key_detail_data_valid", true);
      this.hCR = getIntent().getStringExtra("key_detail_fav_path");
      this.fBx = getIntent().getStringExtra("key_detail_fav_thumb_path");
      this.lWB = getIntent().getIntExtra("key_detail_fav_video_duration", 0);
      this.lWC = getIntent().getStringExtra("key_detail_statExtStr");
      this.lWI = getIntent().getIntExtra("key_detail_fav_video_scene_from", 0);
      this.fHE = getIntent().getBooleanExtra("show_share", true);
      this.lWJ = getIntent().getBooleanExtra("key_detail_fav_video_show_download_status", false);
      this.lUP = getIntent().getStringExtra("key_detail_data_id");
      if (!com.tencent.mm.a.e.aZ(this.fBx))
      {
        paramBundle = com.tencent.mm.pluginsdk.model.c.Nq(this.hCR);
        if (paramBundle == null) {}
      }
      try
      {
        w.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay: create thumbpath bitmap, saveBitmapToImage ");
        com.tencent.mm.pluginsdk.l.e.a(paramBundle, Bitmap.CompressFormat.JPEG, this.fBx);
        boolean bool = this.lWH;
        if (bg.mZ(this.fBx))
        {
          paramBundle = "";
          if (!bg.mZ(this.hCR)) {
            break label522;
          }
          str = "";
          w.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay: init data, isVideoValid: %B. thumbPath: %s, fullPath: %s", new Object[] { Boolean.valueOf(bool), paramBundle, str });
          this.lWD = ((RelativeLayout)findViewById(R.h.cEL));
          this.lWF = ((FavVideoView)findViewById(R.h.cEM));
          paramBundle = (ImageView)findViewById(R.h.cEH);
          this.lWE = ((ImageView)findViewById(R.h.bKT));
          this.lWG = ((LinearLayout)findViewById(R.h.bGS));
          if ((!this.lWH) && (this.lWG != null)) {
            this.lWG.setVisibility(0);
          }
          if (this.lWE != null) {
            this.lWE.setLayerType(2, null);
          }
          if (bg.mZ(this.hCR)) {
            break label538;
          }
          if (!FileOp.aZ(this.hCR)) {
            break label530;
          }
          this.lWF.hCR = this.hCR;
          w.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay:  videoView.setVideoData(fullPath)");
          this.lWF.setOnClickListener(this.lTT);
          if (this.fHE) {
            this.lWF.setOnLongClickListener(this.lVS);
          }
          this.kvw = new com.tencent.mm.ui.tools.g(null);
          GMTrace.o(6381381877760L, 47545);
          return;
          getWindow().setFlags(1024, 1024);
        }
      }
      catch (Exception paramBundle)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.FavoriteVideoPlayUI", paramBundle, "", new Object[0]);
          continue;
          paramBundle = this.fBx;
          continue;
          label522:
          String str = this.hCR;
          continue;
          label530:
          b(paramBundle);
          continue;
          label538:
          b(paramBundle);
        }
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6382052966400L, 47550);
    FavVideoView localFavVideoView = this.lWF;
    w.i("MicroMsg.FavVideoView", "VideoPlay:   onDestroy()");
    localFavVideoView.kwz.stop();
    com.tencent.mm.sdk.b.a.uLm.c(localFavVideoView.lUR);
    getWindow().clearFlags(128);
    super.onDestroy();
    GMTrace.o(6382052966400L, 47550);
  }
  
  protected void onPause()
  {
    GMTrace.i(6381918748672L, 47549);
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().setFlags(2048, 2048);
    }
    FavVideoView localFavVideoView = this.lWF;
    w.i("MicroMsg.FavVideoView", "VideoPlay:   onPause()");
    if (localFavVideoView.kwz.isPlaying())
    {
      w.i("MicroMsg.FavVideoView", "VideoPlay: pausePlay()");
      localFavVideoView.kwz.pause();
    }
    super.onPause();
    GMTrace.o(6381918748672L, 47549);
  }
  
  protected void onResume()
  {
    GMTrace.i(6381784530944L, 47548);
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().clearFlags(2048);
    }
    w.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay:  onResume,hadOnStart is %B", new Object[] { Boolean.valueOf(this.lWk) });
    if (!this.lWk) {
      this.lWF.onResume();
    }
    this.lWk = false;
    super.onResume();
    GMTrace.o(6381784530944L, 47548);
  }
  
  public void onStart()
  {
    GMTrace.i(6381650313216L, 47547);
    Bundle localBundle = this.kvu;
    if (!this.kvv)
    {
      this.kvv = true;
      if (Build.VERSION.SDK_INT >= 12)
      {
        this.kvx = getIntent().getIntExtra("img_gallery_top", 0);
        this.kvy = getIntent().getIntExtra("img_gallery_left", 0);
        this.kvz = getIntent().getIntExtra("img_gallery_width", 0);
        this.kvA = getIntent().getIntExtra("img_gallery_height", 0);
        this.kvw.p(this.kvy, this.kvx, this.kvz, this.kvA);
        if (localBundle == null) {
          this.lWF.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
          {
            public final boolean onPreDraw()
            {
              GMTrace.i(6387287457792L, 47589);
              FavoriteVideoPlayUI.e(FavoriteVideoPlayUI.this).getViewTreeObserver().removeOnPreDrawListener(this);
              FavoriteVideoPlayUI.g(FavoriteVideoPlayUI.this).a(FavoriteVideoPlayUI.e(FavoriteVideoPlayUI.this), FavoriteVideoPlayUI.f(FavoriteVideoPlayUI.this), new g.b()
              {
                public final void onAnimationEnd()
                {
                  GMTrace.i(6411715084288L, 47771);
                  GMTrace.o(6411715084288L, 47771);
                }
                
                public final void onAnimationStart()
                {
                  GMTrace.i(6411580866560L, 47770);
                  if (FavoriteVideoPlayUI.e(FavoriteVideoPlayUI.this) != null) {
                    FavoriteVideoPlayUI.e(FavoriteVideoPlayUI.this).onResume();
                  }
                  GMTrace.o(6411580866560L, 47770);
                }
              });
              GMTrace.o(6387287457792L, 47589);
              return true;
            }
          });
        }
      }
    }
    super.onStart();
    GMTrace.o(6381650313216L, 47547);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/detail/FavoriteVideoPlayUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */