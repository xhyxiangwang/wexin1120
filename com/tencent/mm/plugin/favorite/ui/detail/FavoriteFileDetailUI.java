package com.tencent.mm.plugin.favorite.ui.detail;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.app.WorkerProfile;
import com.tencent.mm.plugin.favorite.b.ai;
import com.tencent.mm.plugin.favorite.b.b;
import com.tencent.mm.plugin.favorite.b.b.a;
import com.tencent.mm.plugin.favorite.b.r;
import com.tencent.mm.plugin.favorite.b.r.2;
import com.tencent.mm.plugin.favorite.b.r.3;
import com.tencent.mm.plugin.favorite.b.v;
import com.tencent.mm.plugin.favorite.b.v.a;
import com.tencent.mm.plugin.favorite.b.v.b;
import com.tencent.mm.plugin.favorite.b.v.c;
import com.tencent.mm.plugin.favorite.b.v.d;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.ui.FavTagEditUI;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.ss;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.base.m;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.o;
import com.tencent.mm.x.y;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FavoriteFileDetailUI
  extends MMActivity
  implements b.a, j.a
{
  private sp fBc;
  private boolean fHE;
  private long fwq;
  private ae ham;
  private ProgressBar jUz;
  private TextView jjS;
  private TextView kIZ;
  private com.tencent.mm.pluginsdk.ui.tools.f kwz;
  private com.tencent.mm.plugin.favorite.b.j lPM;
  private com.tencent.mm.plugin.favorite.b.q lSB;
  private Button lVf;
  private Button lVg;
  private Button lVh;
  private MMImageView lVi;
  private TextView lVj;
  private View lVk;
  private View lVl;
  private TextView lVm;
  private ImageView lVn;
  private TextView lVo;
  private boolean lVp;
  private boolean lVq;
  private String lVr;
  private String lVs;
  private boolean lVt;
  private boolean lVu;
  private boolean lVv;
  
  public FavoriteFileDetailUI()
  {
    GMTrace.i(6403930456064L, 47713);
    this.kwz = null;
    this.lSB = new com.tencent.mm.plugin.favorite.b.q();
    this.lVp = false;
    this.lVq = false;
    this.fHE = true;
    this.lVt = false;
    this.lVu = false;
    this.lVv = false;
    GMTrace.o(6403930456064L, 47713);
  }
  
  private void a(final float paramFloat, final String paramString)
  {
    GMTrace.i(6405943721984L, 47728);
    this.ham.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6412520390656L, 47777);
        FavoriteFileDetailUI.q(FavoriteFileDetailUI.this).setProgress((int)paramFloat);
        FavoriteFileDetailUI.r(FavoriteFileDetailUI.this).setText(paramString);
        GMTrace.o(6412520390656L, 47777);
      }
    });
    GMTrace.o(6405943721984L, 47728);
  }
  
  private void ayc()
  {
    GMTrace.i(6404333109248L, 47716);
    this.lVs = getIntent().getStringExtra("key_detail_data_id");
    Iterator localIterator = this.lPM.field_favProto.tQC.iterator();
    while (localIterator.hasNext())
    {
      sp localsp = (sp)localIterator.next();
      if (localsp.lUP.equals(this.lVs)) {
        this.fBc = localsp;
      }
    }
    if (this.fBc == null) {
      this.fBc = x.n(this.lPM);
    }
    GMTrace.o(6404333109248L, 47716);
  }
  
  private void ayd()
  {
    GMTrace.i(6404869980160L, 47720);
    this.lVi.setVisibility(8);
    this.kIZ.setVisibility(8);
    this.lVh.setVisibility(8);
    this.lVf.setVisibility(8);
    this.lVg.setVisibility(8);
    this.lVk.setVisibility(8);
    this.jjS.setVisibility(8);
    this.lVn.setVisibility(0);
    this.lVo.setVisibility(0);
    if (this.fBc.aHe == 4)
    {
      this.jjS.setGravity(17);
      this.jjS.setText(R.l.dXr);
      GMTrace.o(6404869980160L, 47720);
      return;
    }
    this.jjS.setGravity(17);
    this.jjS.setText(R.l.dXq);
    if (this.fBc.tPF == 2)
    {
      this.lVo.setText(R.l.dWf);
      GMTrace.o(6404869980160L, 47720);
      return;
    }
    this.lVo.setText(R.l.dWg);
    GMTrace.o(6404869980160L, 47720);
  }
  
  private void aye()
  {
    GMTrace.i(6405004197888L, 47721);
    this.lVh.setVisibility(8);
    this.lVf.setVisibility(8);
    this.lVg.setVisibility(8);
    this.jjS.setVisibility(8);
    this.lVk.setVisibility(0);
    com.tencent.mm.plugin.favorite.b.a locala = com.tencent.mm.plugin.favorite.h.awy().wZ(this.fBc.lUP);
    int j;
    int i;
    int k;
    if (locala != null)
    {
      j = (int)locala.getProgress();
      i = locala.field_offset;
      k = locala.field_totalLen;
    }
    while ((this.lPM.awL()) && (bg.mZ(this.fBc.tOx)))
    {
      a(j, getString(R.l.dYk, new Object[] { x.ab(i), x.ab(k) }));
      GMTrace.o(6405004197888L, 47721);
      return;
      k = (int)this.fBc.tOS;
      j = 0;
      i = 0;
    }
    a(j, getString(R.l.dWp, new Object[] { x.ab(i), x.ab(k) }));
    GMTrace.o(6405004197888L, 47721);
  }
  
  private void ayf()
  {
    GMTrace.i(6405138415616L, 47722);
    this.lVk.setVisibility(8);
    this.lVg.setVisibility(8);
    if (bg.mZ(this.fBc.tOE))
    {
      this.lVf.setVisibility(8);
      this.lVh.setVisibility(0);
      localObject = com.tencent.mm.plugin.favorite.h.awy().wZ(this.fBc.lUP);
      if ((localObject == null) || (((com.tencent.mm.plugin.favorite.b.a)localObject).field_offset <= 0)) {
        break label143;
      }
      localObject = this.lVh;
      if (!this.lPM.awM()) {
        break label136;
      }
    }
    label136:
    for (int i = R.l.dXd;; i = R.l.dXc)
    {
      ((Button)localObject).setText(i);
      this.jjS.setVisibility(8);
      GMTrace.o(6405138415616L, 47722);
      return;
      this.lVf.setVisibility(0);
      break;
    }
    label143:
    Object localObject = this.lVh;
    if (this.lPM.awM()) {}
    for (i = R.l.dXe;; i = R.l.dXa)
    {
      ((Button)localObject).setText(i);
      break;
    }
  }
  
  private void ayg()
  {
    GMTrace.i(6406212157440L, 47730);
    if (this.lVt)
    {
      GMTrace.o(6406212157440L, 47730);
      return;
    }
    this.lVt = true;
    Intent localIntent = new Intent();
    localIntent.putExtra("key_detail_fav_path", x.g(this.fBc));
    localIntent.putExtra("key_detail_fav_thumb_path", x.h(this.fBc));
    localIntent.putExtra("key_detail_fav_video_duration", this.fBc.duration);
    localIntent.putExtra("key_detail_statExtStr", this.fBc.fMi);
    com.tencent.mm.bi.d.b(this, "favorite", ".ui.detail.FavoriteVideoPlayUI", localIntent);
    finish();
    GMTrace.o(6406212157440L, 47730);
  }
  
  private void eC(boolean paramBoolean)
  {
    GMTrace.i(6404735762432L, 47719);
    boolean bool = x.d(this.fBc);
    w.i("MicroMsg.FavoriteFileDetailUI", "init status, info type %d, exist:%B path:%s", new Object[] { Integer.valueOf(this.lPM.field_itemStatus), Boolean.valueOf(bool), x.g(this.fBc) });
    if (this.fBc.tPF != 0)
    {
      ayd();
      GMTrace.o(6404735762432L, 47719);
      return;
    }
    int i;
    if ((this.lPM.isDone()) || (bool) || (!bg.mZ(this.fBc.tOx)))
    {
      if (bool)
      {
        if ((getType() == 15) && (this.fBc.tPx != null) && (!bg.mZ(this.fBc.tPx.hdc)) && (!bg.mZ(this.fBc.tPx.hdg)))
        {
          this.lVu = true;
          this.lVi.setVisibility(8);
          this.lVk.setVisibility(8);
          this.lVh.setVisibility(8);
          this.lVf.setVisibility(8);
          this.lVg.setVisibility(8);
          this.jjS.setVisibility(8);
          String str = x.g(this.fBc);
          w.d("MicroMsg.FavoriteFileDetailUI", com.tencent.mm.compatible.util.g.tG() + " initView: fullpath:" + str);
          ViewGroup localViewGroup = (ViewGroup)findViewById(R.h.cEe);
          this.kwz = com.tencent.mm.pluginsdk.ui.tools.n.dX(this.vov.voR);
          RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
          localLayoutParams.addRule(13);
          localViewGroup.addView((View)this.kwz, 0, localLayoutParams);
          this.kwz.a(new f.a()
          {
            public final void Xd()
            {
              GMTrace.i(6399367053312L, 47679);
              w.d("MicroMsg.FavoriteFileDetailUI", com.tencent.mm.compatible.util.g.tG() + " onPrepared");
              FavoriteFileDetailUI.m(FavoriteFileDetailUI.this).ch(true);
              FavoriteFileDetailUI.m(FavoriteFileDetailUI.this).start();
              GMTrace.o(6399367053312L, 47679);
            }
            
            public final int bL(int paramAnonymousInt1, int paramAnonymousInt2)
            {
              GMTrace.i(6399769706496L, 47682);
              GMTrace.o(6399769706496L, 47682);
              return 0;
            }
            
            public final void br(int paramAnonymousInt1, int paramAnonymousInt2)
            {
              GMTrace.i(6399903924224L, 47683);
              GMTrace.o(6399903924224L, 47683);
            }
            
            public final void onError(int paramAnonymousInt1, int paramAnonymousInt2)
            {
              GMTrace.i(6399501271040L, 47680);
              FavoriteFileDetailUI.m(FavoriteFileDetailUI.this).stop();
              if (FavoriteFileDetailUI.n(FavoriteFileDetailUI.this))
              {
                GMTrace.o(6399501271040L, 47680);
                return;
              }
              FavoriteFileDetailUI.o(FavoriteFileDetailUI.this);
              af.u(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(6391582425088L, 47621);
                  com.tencent.mm.ui.base.h.h(FavoriteFileDetailUI.this.vov.voR, R.l.eOR, R.l.dJz);
                  Bitmap localBitmap = com.tencent.mm.plugin.favorite.c.g.a(FavoriteFileDetailUI.a(FavoriteFileDetailUI.this), FavoriteFileDetailUI.b(FavoriteFileDetailUI.this));
                  ImageView localImageView = (ImageView)FavoriteFileDetailUI.this.findViewById(R.h.cEP);
                  if (localImageView != null)
                  {
                    localImageView.setImageBitmap(localBitmap);
                    localImageView.setVisibility(0);
                  }
                  GMTrace.o(6391582425088L, 47621);
                }
              });
              GMTrace.o(6399501271040L, 47680);
            }
            
            public final void qq()
            {
              GMTrace.i(6399635488768L, 47681);
              GMTrace.o(6399635488768L, 47681);
            }
          });
          w.d("MicroMsg.FavoriteFileDetailUI", com.tencent.mm.compatible.util.g.tG() + " initView :" + str);
          if (str != null)
          {
            this.kwz.stop();
            this.kwz.setVideoPath(str);
          }
          w.d("MicroMsg.FavoriteFileDetailUI", com.tencent.mm.compatible.util.g.tG() + " initView");
          if (ap.pF() != null) {
            ap.pF().rn();
          }
          com.tencent.mm.plugin.report.service.g.paX.i(11444, new Object[] { Integer.valueOf(4) });
        }
        if ((getType() == 15) || (getType() == 4))
        {
          if (!this.lVu)
          {
            this.lVk.setVisibility(8);
            this.lVh.setVisibility(8);
            this.lVf.setVisibility(8);
            this.lVg.setVisibility(0);
            this.lVg.setText(R.l.dXb);
            this.jjS.setVisibility(8);
            ayg();
          }
          ap.xC().C(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(6388092764160L, 47595);
              x.t(FavoriteFileDetailUI.b(FavoriteFileDetailUI.this));
              GMTrace.o(6388092764160L, 47595);
            }
          });
          GMTrace.o(6404735762432L, 47719);
          return;
        }
        if ((x.d(this.fBc)) && (x.e(this.fBc))) {}
        for (i = 1;; i = 0)
        {
          if (i == 0) {
            break label663;
          }
          this.lVk.setVisibility(8);
          this.lVh.setVisibility(8);
          this.lVf.setVisibility(0);
          this.lVg.setVisibility(8);
          this.jjS.setVisibility(8);
          this.lVf.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(6393461473280L, 47635);
              FavoriteFileDetailUI.p(FavoriteFileDetailUI.this);
              GMTrace.o(6393461473280L, 47635);
            }
          });
          break;
        }
        label663:
        this.lVk.setVisibility(8);
        this.lVh.setVisibility(8);
        if (bg.mZ(this.fBc.tOE)) {
          this.lVf.setVisibility(8);
        }
        for (;;)
        {
          this.lVg.setVisibility(0);
          this.jjS.setVisibility(0);
          break;
          this.lVf.setVisibility(0);
        }
      }
      if (bg.mZ(this.fBc.tOx))
      {
        ayd();
        GMTrace.o(6404735762432L, 47719);
        return;
      }
      w.w("MicroMsg.FavoriteFileDetailUI", "? info is done, source file not exist, cdn data url is not null");
      ayf();
      GMTrace.o(6404735762432L, 47719);
      return;
    }
    if (this.lPM.awN())
    {
      if (bg.mZ(this.fBc.tOx))
      {
        ayd();
        if (paramBoolean)
        {
          i = getType();
          if ((4 == i) || (15 == i)) {}
          for (i = R.l.dXI;; i = R.l.dXD)
          {
            com.tencent.mm.ui.base.h.bl(this.vov.voR, getString(i));
            GMTrace.o(6404735762432L, 47719);
            return;
          }
        }
      }
      else
      {
        ayf();
        if (paramBoolean)
        {
          com.tencent.mm.ui.base.h.bl(this.vov.voR, getString(R.l.dQj));
          GMTrace.o(6404735762432L, 47719);
        }
      }
    }
    else if (this.lPM.awM())
    {
      ayf();
      if (paramBoolean)
      {
        com.tencent.mm.ui.base.h.bl(this.vov.voR, getString(R.l.eNO));
        GMTrace.o(6404735762432L, 47719);
      }
    }
    else
    {
      if ((this.lPM.isDownloading()) || (this.lPM.awL()))
      {
        aye();
        GMTrace.o(6404735762432L, 47719);
        return;
      }
      w.w("MicroMsg.FavoriteFileDetailUI", "other status, not done, downloading, uploading, downloadfail, uploadfail");
      ayf();
    }
    GMTrace.o(6404735762432L, 47719);
  }
  
  private int getType()
  {
    GMTrace.i(6404601544704L, 47718);
    if (this.fBc == null)
    {
      w.w("MicroMsg.FavoriteFileDetailUI", "get type but data item is null");
      GMTrace.o(6404601544704L, 47718);
      return 8;
    }
    if (this.fBc.aHe == 0)
    {
      w.w("MicroMsg.FavoriteFileDetailUI", "get data type, but data item type is 0, info type %d", new Object[] { Integer.valueOf(this.lPM.field_type) });
      if (4 == this.lPM.field_type)
      {
        GMTrace.o(6404601544704L, 47718);
        return 4;
      }
      if (16 == this.lPM.field_type)
      {
        if ((this.fBc != null) && (this.fBc.tPx != null))
        {
          if (!bg.mZ(this.fBc.tPx.hdc))
          {
            GMTrace.o(6404601544704L, 47718);
            return 15;
          }
          if (!bg.mZ(this.fBc.tPx.hdg))
          {
            GMTrace.o(6404601544704L, 47718);
            return 15;
          }
        }
        GMTrace.o(6404601544704L, 47718);
        return 4;
      }
      GMTrace.o(6404601544704L, 47718);
      return 8;
    }
    if (this.fBc.aHe == 15)
    {
      if ((this.fBc != null) && (this.fBc.tPx != null))
      {
        if (!bg.mZ(this.fBc.tPx.hdc))
        {
          GMTrace.o(6404601544704L, 47718);
          return 15;
        }
        if (!bg.mZ(this.fBc.tPx.hdg))
        {
          GMTrace.o(6404601544704L, 47718);
          return 15;
        }
      }
      GMTrace.o(6404601544704L, 47718);
      return 4;
    }
    int i = this.fBc.aHe;
    GMTrace.o(6404601544704L, 47718);
    return i;
  }
  
  protected final int Qb()
  {
    GMTrace.i(6404198891520L, 47715);
    GMTrace.o(6404198891520L, 47715);
    return 1;
  }
  
  public final void a(String paramString, l paraml)
  {
    boolean bool2 = false;
    GMTrace.i(6406077939712L, 47729);
    w.i("MicroMsg.FavoriteFileDetailUI", "on favitem change, notifyId:%s, curId:%d", new Object[] { paramString, Long.valueOf(this.lPM.field_localId) });
    paramString = com.tencent.mm.plugin.favorite.h.awD().cc(this.lPM.field_localId);
    if ((paramString == null) && (!this.lVq))
    {
      w.w("MicroMsg.FavoriteFileDetailUI", "error, on notify change, cannot find info");
      finish();
      GMTrace.o(6406077939712L, 47729);
      return;
    }
    if (!this.lVq) {
      this.lPM = paramString;
    }
    ayc();
    paramString = com.tencent.mm.plugin.favorite.h.awy().wZ(this.fBc.lUP);
    boolean bool1;
    if (paramString == null) {
      bool1 = bool2;
    }
    while (bool1)
    {
      GMTrace.o(6406077939712L, 47729);
      return;
      if (paramString.field_status == 1)
      {
        bool1 = true;
      }
      else
      {
        bool1 = bool2;
        if (this.fBc.aHe != 8)
        {
          bool1 = bool2;
          if (!this.lVv)
          {
            if ((paramString.field_status == 4) && (com.tencent.mm.plugin.favorite.h.awy().wZ(this.fBc.lUP).field_extFlag != 0))
            {
              x.a(this.lPM, this.fBc, true);
              this.lVv = true;
            }
            w.i("MicroMsg.FavoriteFileDetailUI", "FavoriteFileDetail download, check retry, return %B", new Object[] { Boolean.valueOf(this.lVv) });
            bool1 = this.lVv;
          }
        }
      }
    }
    this.ham.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6393729908736L, 47637);
        FavoriteFileDetailUI.s(FavoriteFileDetailUI.this);
        GMTrace.o(6393729908736L, 47637);
      }
    });
    GMTrace.o(6406077939712L, 47729);
  }
  
  public final void b(com.tencent.mm.plugin.favorite.b.a parama)
  {
    GMTrace.i(6405809504256L, 47727);
    if ((parama == null) || (parama.field_dataId == null))
    {
      w.w("MicroMsg.FavoriteFileDetailUI", "on cdn status changed, item is null");
      GMTrace.o(6405809504256L, 47727);
      return;
    }
    w.d("MicroMsg.FavoriteFileDetailUI", "on cdn status changed, dataID is %s, field id is %s", new Object[] { this.fBc.lUP, parama.field_dataId });
    if (parama.field_dataId.equals(this.fBc.lUP))
    {
      if ((this.lPM.awL()) && (bg.mZ(this.fBc.tOx)))
      {
        a(parama.getProgress(), getString(R.l.dYk, new Object[] { x.ab(parama.field_offset), x.ab(parama.field_totalLen) }));
        GMTrace.o(6405809504256L, 47727);
        return;
      }
      a(parama.getProgress(), getString(R.l.dWp, new Object[] { x.ab(parama.field_offset), x.ab(parama.field_totalLen) }));
      if ((this.lVq) && (com.tencent.mm.a.e.aZ(parama.field_path)))
      {
        this.lPM.field_itemStatus = 10;
        a("", null);
      }
      GMTrace.o(6405809504256L, 47727);
      return;
    }
    GMTrace.o(6405809504256L, 47727);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6404064673792L, 47714);
    int i = R.i.cUy;
    GMTrace.o(6404064673792L, 47714);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6405675286528L, 47726);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    com.tencent.mm.pluginsdk.ui.tools.a.a(this, paramInt1, paramInt2, paramIntent, true, R.l.dQm, R.l.dQn, 2);
    if (paramInt2 != -1)
    {
      GMTrace.o(6405675286528L, 47726);
      return;
    }
    if (paramInt1 == 1)
    {
      Object localObject1;
      if (paramIntent == null)
      {
        localObject1 = null;
        if (paramIntent != null) {
          break label155;
        }
      }
      final Object localObject2;
      label155:
      for (paramIntent = null;; paramIntent = paramIntent.getStringExtra("custom_send_text"))
      {
        localObject2 = com.tencent.mm.ui.base.h.a(this.vov.voR, getString(R.l.dWT), false, null);
        w.d("MicroMsg.FavoriteFileDetailUI", "do share msg, fav msg type %d", new Object[] { Integer.valueOf(getType()) });
        localObject2 = new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6386213715968L, 47581);
            localObject2.dismiss();
            GMTrace.o(6386213715968L, 47581);
          }
        };
        paramInt2 = getType();
        if (!bg.mZ((String)localObject1)) {
          break label166;
        }
        GMTrace.o(6405675286528L, 47726);
        return;
        localObject1 = paramIntent.getStringExtra("Select_Conv_User");
        break;
      }
      label166:
      Iterator localIterator = bg.f(((String)localObject1).split(",")).iterator();
      label246:
      label263:
      label285:
      label383:
      label391:
      label419:
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject3;
        if ((paramInt2 == 4) || (paramInt2 == 15))
        {
          localObject1 = this.vov.voR;
          localObject3 = this.fBc;
          if (localObject1 == null)
          {
            w.w("MicroMsg.FavSendLogic", "want to send fav video, but context is null");
            boolean bool = o.dW(str);
            if (!bool) {
              break label383;
            }
            localObject1 = v.c.lPl;
            localObject3 = this.lPM;
            v.d locald = v.d.lPp;
            if (!bool) {
              break label391;
            }
            paramInt1 = com.tencent.mm.x.j.eU(str);
            v.a((v.c)localObject1, (com.tencent.mm.plugin.favorite.b.j)localObject3, locald, paramInt1);
          }
        }
        for (;;)
        {
          if (bg.mZ(paramIntent)) {
            break label419;
          }
          com.tencent.mm.plugin.messenger.a.d.aNb().A(str, paramIntent, o.fY(str));
          break;
          if (bg.mZ(str))
          {
            w.w("MicroMsg.FavSendLogic", "want to send fav video, but to user is null");
            break label246;
          }
          if (localObject3 == null)
          {
            w.w("MicroMsg.FavSendLogic", "want to send fav video, but dataItem is null");
            break label246;
          }
          ap.xC().C(new r.3((sp)localObject3, (Context)localObject1, str, (Runnable)localObject2));
          break label246;
          localObject1 = v.c.lPk;
          break label263;
          paramInt1 = 0;
          break label285;
          r.a(this.vov.voR, str, this.lPM, this.fBc, (Runnable)localObject2);
        }
      }
      com.tencent.mm.ui.snackbar.a.e(this, getString(R.l.dZv));
    }
    GMTrace.o(6405675286528L, 47726);
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    boolean bool2 = true;
    GMTrace.i(6404467326976L, 47717);
    super.onCreate(paramBundle);
    this.ham = new ae();
    this.fwq = getIntent().getLongExtra("key_detail_info_id", -1L);
    this.lVq = getIntent().getBooleanExtra("fav_open_from_wnnote", false);
    this.fHE = getIntent().getBooleanExtra("show_share", true);
    this.lVr = getIntent().getStringExtra("fav_note_xml");
    this.lPM = com.tencent.mm.plugin.favorite.h.awD().cc(this.fwq);
    if ((this.lVq) && (!bg.mZ(this.lVr))) {
      this.lPM = x.xo(this.lVr);
    }
    if (this.lPM == null)
    {
      w.w("MicroMsg.FavoriteFileDetailUI", "error, cannot find download info");
      finish();
      GMTrace.o(6404467326976L, 47717);
      return;
    }
    v.j(this.lPM);
    ayc();
    this.lVf = ((Button)findViewById(R.h.cko));
    this.lVg = ((Button)findViewById(R.h.chE));
    this.lVh = ((Button)findViewById(R.h.bCx));
    this.lVi = ((MMImageView)findViewById(R.h.bOX));
    this.kIZ = ((TextView)findViewById(R.h.ceD));
    this.jjS = ((TextView)findViewById(R.h.cBu));
    this.lVl = findViewById(R.h.bCP);
    this.lVk = findViewById(R.h.bCL);
    this.jUz = ((ProgressBar)findViewById(R.h.bCK));
    this.lVj = ((TextView)findViewById(R.h.bCM));
    this.lVm = ((TextView)findViewById(R.h.cxV));
    this.lVn = ((ImageView)findViewById(R.h.bGU));
    this.lVo = ((TextView)findViewById(R.h.bGV));
    final int i = getType();
    label386:
    ss localss;
    label423:
    final boolean bool3;
    final boolean bool1;
    if (4 == i)
    {
      oC(R.l.dYl);
      if (this.fBc.aHe != 4) {
        break label645;
      }
      this.lVi.setImageResource(R.k.dlh);
      this.kIZ.setText(this.fBc.title);
      localss = this.fBc.tPx;
      if (localss != null) {
        break label665;
      }
      this.lVm.setVisibility(8);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(6409567600640L, 47755);
          v.a(v.a.lPa, FavoriteFileDetailUI.b(FavoriteFileDetailUI.this));
          FavoriteFileDetailUI.this.finish();
          GMTrace.o(6409567600640L, 47755);
          return true;
        }
      });
      this.lVg.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6392924602368L, 47631);
          paramAnonymousView = x.g(FavoriteFileDetailUI.a(FavoriteFileDetailUI.this));
          if (4 == FavoriteFileDetailUI.c(FavoriteFileDetailUI.this))
          {
            FavoriteFileDetailUI.d(FavoriteFileDetailUI.this);
            FavoriteFileDetailUI.e(FavoriteFileDetailUI.this);
            GMTrace.o(6392924602368L, 47631);
            return;
          }
          FavoriteFileDetailUI.a(FavoriteFileDetailUI.this, paramAnonymousView);
          GMTrace.o(6392924602368L, 47631);
        }
      });
      paramBundle = this.fBc.tOE;
      if (!bg.mZ(paramBundle)) {
        this.lVf.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6394266779648L, 47641);
            w.d("MicroMsg.FavoriteFileDetailUI", "start video preview, fav id %d, fav local id %d", new Object[] { Integer.valueOf(FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).field_id), Long.valueOf(FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).field_localId) });
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("rawUrl", paramBundle);
            paramAnonymousView.putExtra("is_favorite_item", true);
            paramAnonymousView.putExtra("fav_local_id", FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).field_localId);
            paramAnonymousView.putExtra("geta8key_scene", 14);
            com.tencent.mm.plugin.favorite.c.j(paramAnonymousView, FavoriteFileDetailUI.this.vov.voR);
            GMTrace.o(6394266779648L, 47641);
          }
        });
      }
      this.lVh.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6409836036096L, 47757);
          w.i("MicroMsg.FavoriteFileDetailUI", "click item favid %d, localid %d, itemstatus %d", new Object[] { Integer.valueOf(FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).field_id), Long.valueOf(FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).field_localId), Integer.valueOf(FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).field_itemStatus) });
          if (!com.tencent.mm.compatible.util.f.tD())
          {
            com.tencent.mm.ui.base.h.h(FavoriteFileDetailUI.this.vov.voR, R.l.dXn, R.l.dVY);
            GMTrace.o(6409836036096L, 47757);
            return;
          }
          if ((FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).awM()) || (bg.mZ(FavoriteFileDetailUI.a(FavoriteFileDetailUI.this).tOx))) {
            x.l(FavoriteFileDetailUI.b(FavoriteFileDetailUI.this));
          }
          for (;;)
          {
            FavoriteFileDetailUI.g(FavoriteFileDetailUI.this);
            GMTrace.o(6409836036096L, 47757);
            return;
            if (!FavoriteFileDetailUI.f(FavoriteFileDetailUI.this))
            {
              x.a(FavoriteFileDetailUI.b(FavoriteFileDetailUI.this), FavoriteFileDetailUI.a(FavoriteFileDetailUI.this), true);
            }
            else
            {
              FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).field_itemStatus = 7;
              x.i(FavoriteFileDetailUI.a(FavoriteFileDetailUI.this));
            }
          }
        }
      });
      this.lVl.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6388361199616L, 47597);
          if (FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).isDownloading())
          {
            x.f(FavoriteFileDetailUI.a(FavoriteFileDetailUI.this));
            FavoriteFileDetailUI.h(FavoriteFileDetailUI.this).setText(R.l.dXc);
          }
          for (;;)
          {
            FavoriteFileDetailUI.i(FavoriteFileDetailUI.this);
            GMTrace.o(6388361199616L, 47597);
            return;
            x.o(FavoriteFileDetailUI.b(FavoriteFileDetailUI.this));
            FavoriteFileDetailUI.h(FavoriteFileDetailUI.this).setText(R.l.dXd);
          }
        }
      });
      if (this.fHE)
      {
        bool3 = getIntent().getBooleanExtra("key_detail_can_delete", true);
        i = getType();
        if (i != 8) {
          break label958;
        }
        bool1 = this.lPM.awJ();
      }
    }
    for (;;)
    {
      if ((bool1) || (bool3)) {
        a(0, R.l.eMR, R.g.baG, new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(6392656166912L, 47629);
            if (bool1)
            {
              FavoriteFileDetailUI.j(FavoriteFileDetailUI.this);
              if ((!com.tencent.mm.plugin.favorite.b.q.b(FavoriteFileDetailUI.a(FavoriteFileDetailUI.this))) && (FavoriteFileDetailUI.a(FavoriteFileDetailUI.this).tPF == 0)) {}
            }
            else if (!bool3)
            {
              GMTrace.o(6392656166912L, 47629);
              return false;
            }
            paramAnonymousMenuItem = new com.tencent.mm.ui.widget.e(FavoriteFileDetailUI.this.vov.voR, com.tencent.mm.ui.widget.e.wSP, false);
            paramAnonymousMenuItem.qQS = new o.c()
            {
              public final void a(m paramAnonymous2m)
              {
                GMTrace.i(6385676845056L, 47577);
                if (FavoriteFileDetailUI.13.this.lVC)
                {
                  FavoriteFileDetailUI.j(FavoriteFileDetailUI.this);
                  if ((!com.tencent.mm.plugin.favorite.b.q.b(FavoriteFileDetailUI.a(FavoriteFileDetailUI.this))) && (FavoriteFileDetailUI.a(FavoriteFileDetailUI.this).tPF == 0))
                  {
                    if (FavoriteFileDetailUI.13.this.iBV != 8) {
                      break label155;
                    }
                    paramAnonymous2m.e(0, FavoriteFileDetailUI.this.getString(R.l.dXS));
                  }
                }
                for (;;)
                {
                  if (FavoriteFileDetailUI.13.this.lVD)
                  {
                    paramAnonymous2m.e(3, FavoriteFileDetailUI.this.getString(R.l.dWs));
                    paramAnonymous2m.e(2, FavoriteFileDetailUI.this.vov.voR.getString(R.l.duY));
                  }
                  GMTrace.o(6385676845056L, 47577);
                  return;
                  label155:
                  if (FavoriteFileDetailUI.13.this.iBV == 15)
                  {
                    paramAnonymous2m.e(0, FavoriteFileDetailUI.this.getString(R.l.dXS));
                    paramAnonymous2m.e(4, FavoriteFileDetailUI.this.getString(R.l.dIU));
                  }
                  else if (FavoriteFileDetailUI.13.this.iBV == 4)
                  {
                    paramAnonymous2m.e(0, FavoriteFileDetailUI.this.getString(R.l.dXS));
                    paramAnonymous2m.e(4, FavoriteFileDetailUI.this.getString(R.l.dIU));
                  }
                  else
                  {
                    paramAnonymous2m.e(0, FavoriteFileDetailUI.this.getString(R.l.dXS));
                    if ((FavoriteFileDetailUI.13.this.lVD) && (FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).awK())) {
                      paramAnonymous2m.e(1, FavoriteFileDetailUI.this.getString(R.l.dXu));
                    }
                  }
                }
              }
            };
            paramAnonymousMenuItem.qQT = new o.d()
            {
              public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
              {
                GMTrace.i(6397219569664L, 47663);
                switch (paramAnonymous2MenuItem.getItemId())
                {
                }
                for (;;)
                {
                  GMTrace.o(6397219569664L, 47663);
                  return;
                  if (FavoriteFileDetailUI.c(FavoriteFileDetailUI.this) == 8)
                  {
                    paramAnonymous2MenuItem = x.g(FavoriteFileDetailUI.a(FavoriteFileDetailUI.this));
                    if (!com.tencent.mm.a.e.aZ(paramAnonymous2MenuItem))
                    {
                      w.e("MicroMsg.FavoriteFileDetailUI", "share file failed, file not exists");
                      Toast.makeText(FavoriteFileDetailUI.this, FavoriteFileDetailUI.this.getString(R.l.dXQ), 1).show();
                      GMTrace.o(6397219569664L, 47663);
                      return;
                    }
                    if (new File(paramAnonymous2MenuItem).length() > 10485760L)
                    {
                      w.e("MicroMsg.FavoriteFileDetailUI", "share file failed, file too large");
                      Toast.makeText(FavoriteFileDetailUI.this, FavoriteFileDetailUI.this.getString(R.l.dXR), 1).show();
                      GMTrace.o(6397219569664L, 47663);
                      return;
                    }
                  }
                  paramAnonymous2MenuItem = FavoriteFileDetailUI.this;
                  FavoriteFileDetailUI.b(FavoriteFileDetailUI.this);
                  FavoriteFileDetailUI.k(paramAnonymous2MenuItem);
                  GMTrace.o(6397219569664L, 47663);
                  return;
                  final Object localObject = com.tencent.mm.ui.base.h.a(FavoriteFileDetailUI.this.vov.voR, FavoriteFileDetailUI.this.getString(R.l.dWT), false, null);
                  paramAnonymous2MenuItem = FavoriteFileDetailUI.this.vov.voR;
                  com.tencent.mm.plugin.favorite.b.j localj = FavoriteFileDetailUI.b(FavoriteFileDetailUI.this);
                  localObject = new Runnable()
                  {
                    public final void run()
                    {
                      GMTrace.i(6399098617856L, 47677);
                      localObject.dismiss();
                      GMTrace.o(6399098617856L, 47677);
                    }
                  };
                  LinkedList localLinkedList = new LinkedList();
                  localLinkedList.add(Integer.valueOf(localj.field_id));
                  paramAnonymous2MenuItem = new ai("", localLinkedList, new r.2(localj, paramAnonymous2MenuItem, (Runnable)localObject));
                  ap.wT().a(paramAnonymous2MenuItem, 0);
                  GMTrace.o(6397219569664L, 47663);
                  return;
                  com.tencent.mm.ui.base.h.a(FavoriteFileDetailUI.this.vov.voR, FavoriteFileDetailUI.this.getString(R.l.duZ), "", new DialogInterface.OnClickListener()
                  {
                    public final void onClick(final DialogInterface paramAnonymous3DialogInterface, int paramAnonymous3Int)
                    {
                      GMTrace.i(6390911336448L, 47616);
                      paramAnonymous3DialogInterface = com.tencent.mm.ui.base.h.a(FavoriteFileDetailUI.this.vov.voR, FavoriteFileDetailUI.this.getString(R.l.duZ), false, null);
                      x.a(FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).field_localId, new Runnable()
                      {
                        public final void run()
                        {
                          GMTrace.i(6383797796864L, 47563);
                          paramAnonymous3DialogInterface.dismiss();
                          w.d("MicroMsg.FavoriteFileDetailUI", "do del fav file, local id %d, fav id %d", new Object[] { Long.valueOf(FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).field_localId), Integer.valueOf(FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).field_id) });
                          FavoriteFileDetailUI.this.finish();
                          GMTrace.o(6383797796864L, 47563);
                        }
                      });
                      GMTrace.o(6390911336448L, 47616);
                    }
                  }, null);
                  GMTrace.o(6397219569664L, 47663);
                  return;
                  paramAnonymous2MenuItem = new Intent(FavoriteFileDetailUI.this.vov.voR, FavTagEditUI.class);
                  paramAnonymous2MenuItem.putExtra("key_fav_scene", 2);
                  paramAnonymous2MenuItem.putExtra("key_fav_item_id", FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).field_localId);
                  FavoriteFileDetailUI.this.vov.voR.startActivity(paramAnonymous2MenuItem);
                  GMTrace.o(6397219569664L, 47663);
                  return;
                  FavoriteFileDetailUI.l(FavoriteFileDetailUI.this);
                }
              }
            };
            paramAnonymousMenuItem.bCV();
            GMTrace.o(6392656166912L, 47629);
            return true;
          }
        });
      }
      eC(false);
      GMTrace.o(6404467326976L, 47717);
      return;
      if (15 == i)
      {
        oC(R.l.dYl);
        findViewById(R.h.cEe).setBackgroundResource(R.e.black);
        this.kIZ.setVisibility(8);
        break;
      }
      oC(R.l.dWR);
      break;
      label645:
      this.lVi.setImageResource(com.tencent.mm.pluginsdk.model.q.Nw(this.fBc.tOM));
      break label386;
      label665:
      if (bg.mZ(localss.hdc))
      {
        w.i("MicroMsg.FavoriteFileDetailUI", " there is no attachurl, show more info btn");
        paramBundle = localss.hdf;
        localObject = localss.hdg;
        if ((!bg.mZ(paramBundle)) && (!bg.mZ((String)localObject)))
        {
          this.lVm.setText(paramBundle);
          this.lVm.setVisibility(0);
          this.lVm.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(final View paramAnonymousView)
            {
              GMTrace.i(6393193037824L, 47633);
              paramAnonymousView = new Intent();
              Object localObject = new Bundle();
              ((Bundle)localObject).putString("key_snsad_statextstr", FavoriteFileDetailUI.a(FavoriteFileDetailUI.this).fMi);
              paramAnonymousView.putExtra("jsapiargs", (Bundle)localObject);
              paramAnonymousView.putExtra("rawUrl", localObject);
              paramAnonymousView.putExtra("useJs", true);
              localObject = new com.tencent.mm.plugin.sns.a.b.c("", "");
              ap.wT().a((com.tencent.mm.ac.k)localObject, 0);
              new ae(Looper.getMainLooper()).post(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(6394535215104L, 47643);
                  WorkerProfile.pB().fmD.j(paramAnonymousView, FavoriteFileDetailUI.this);
                  FavoriteFileDetailUI.this.finish();
                  GMTrace.o(6394535215104L, 47643);
                }
              });
              GMTrace.o(6393193037824L, 47633);
            }
          });
          break label423;
        }
        this.lVm.setVisibility(8);
        break label423;
      }
      final Object localObject = getResources().getString(R.l.eLr);
      paramBundle = (Bundle)localObject;
      if (localss.tQo / 60 > 0) {
        paramBundle = (String)localObject + getResources().getString(R.l.eLt, new Object[] { Integer.valueOf(localss.tQo / 60) });
      }
      localObject = paramBundle;
      if (localss.tQo % 60 > 0) {
        localObject = paramBundle + getResources().getString(R.l.eLu, new Object[] { Integer.valueOf(localss.tQo % 60) });
      }
      paramBundle = (String)localObject + getResources().getString(R.l.eLs);
      this.lVm.setText(paramBundle);
      this.lVm.setVisibility(0);
      this.lVm.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6386750586880L, 47585);
          v.a(v.a.lOY, FavoriteFileDetailUI.b(FavoriteFileDetailUI.this));
          paramAnonymousView = FavoriteFileDetailUI.a(FavoriteFileDetailUI.this).tPx;
          String str = x.h(FavoriteFileDetailUI.a(FavoriteFileDetailUI.this));
          Intent localIntent = new Intent();
          localIntent.putExtra("IsAd", false);
          localIntent.putExtra("KStremVideoUrl", paramAnonymousView.hdc);
          localIntent.putExtra("StreamWording", paramAnonymousView.hdf);
          localIntent.putExtra("StremWebUrl", paramAnonymousView.hdg);
          localIntent.putExtra("KBlockFav", true);
          localIntent.putExtra("KThumUrl", paramAnonymousView.hdh);
          localIntent.putExtra("KThumbPath", str);
          localIntent.putExtra("KMediaId", "fakeid_" + FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).field_id);
          localIntent.putExtra("KMediaVideoTime", paramAnonymousView.tQo);
          localIntent.putExtra("KMediaTitle", FavoriteFileDetailUI.a(FavoriteFileDetailUI.this).title);
          localIntent.putExtra("KSta_StremVideoAduxInfo", paramAnonymousView.hdi);
          localIntent.putExtra("KSta_StremVideoPublishId", paramAnonymousView.hdj);
          localIntent.putExtra("KSta_SourceType", 1);
          localIntent.putExtra("KSta_Scene", v.b.lPi.value);
          localIntent.putExtra("KSta_FromUserName", FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).field_fromUser);
          localIntent.putExtra("KSta_FavID", FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).field_id);
          localIntent.putExtra("KSta_SnsStatExtStr", FavoriteFileDetailUI.a(FavoriteFileDetailUI.this).fMi);
          com.tencent.mm.bi.d.b(FavoriteFileDetailUI.this, "sns", ".ui.VideoAdPlayerUI", localIntent);
          GMTrace.o(6386750586880L, 47585);
        }
      });
      break label423;
      label958:
      if (i == 15)
      {
        paramBundle = com.tencent.mm.k.g.uz().getValue("SIGHTCannotTransmitForFav");
        if ((this.lPM.awJ()) && (bg.RF(paramBundle) == 0)) {
          bool1 = true;
        } else {
          bool1 = false;
        }
      }
      else
      {
        bool1 = bool2;
        if (!this.lPM.awK())
        {
          bool1 = bool2;
          if (!this.lPM.awJ()) {
            bool1 = false;
          }
        }
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6405272633344L, 47723);
    if (this.kwz != null)
    {
      this.kwz.a(null);
      this.kwz.stop();
      this.kwz.onDetach();
      if (ap.pF() != null) {
        ap.pF().rm();
      }
    }
    super.onDestroy();
    GMTrace.o(6405272633344L, 47723);
  }
  
  protected void onPause()
  {
    GMTrace.i(6405541068800L, 47725);
    super.onPause();
    com.tencent.mm.plugin.favorite.h.awD().j(this);
    com.tencent.mm.plugin.favorite.h.awy().b(this);
    if (this.kwz != null) {
      this.kwz.stop();
    }
    GMTrace.o(6405541068800L, 47725);
  }
  
  protected void onResume()
  {
    GMTrace.i(6405406851072L, 47724);
    super.onResume();
    com.tencent.mm.plugin.favorite.h.awD().c(this);
    com.tencent.mm.plugin.favorite.h.awy().a(this);
    if (this.kwz != null) {
      this.kwz.start();
    }
    GMTrace.o(6405406851072L, 47724);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/detail/FavoriteFileDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */