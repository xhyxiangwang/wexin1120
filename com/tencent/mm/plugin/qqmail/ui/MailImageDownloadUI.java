package com.tencent.mm.plugin.qqmail.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.an.j;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.x.ap;

public class MailImageDownloadUI
  extends MMActivity
  implements com.tencent.mm.ac.e, com.tencent.mm.ac.f
{
  private long fLa;
  private long fxK;
  private ae handler;
  private int hzi;
  private ProgressBar oKe;
  private TextView oKf;
  private TextView oKg;
  private TextView oKh;
  private TextView oKi;
  private RelativeLayout oKj;
  private com.tencent.mm.an.d oKk;
  private j oKl;
  private ImageView oKm;
  private LinearLayout oKn;
  private String username;
  
  public MailImageDownloadUI()
  {
    GMTrace.i(5543460601856L, 41302);
    this.handler = new ae(Looper.getMainLooper());
    this.fxK = 0L;
    this.fLa = 0L;
    GMTrace.o(5543460601856L, 41302);
  }
  
  private void sI(int paramInt)
  {
    GMTrace.i(5544265908224L, 41308);
    this.oKf.setText(getString(R.l.eaf, new Object[] { Integer.valueOf(paramInt) }));
    if (paramInt < this.oKe.getMax())
    {
      GMTrace.o(5544265908224L, 41308);
      return;
    }
    com.tencent.mm.an.d locald = com.tencent.mm.an.n.IW().b(Long.valueOf(this.oKl.hAz));
    if (this.hzi == 1) {
      com.tencent.mm.an.e.c(locald);
    }
    finish();
    startActivity(getIntent());
    GMTrace.o(5544265908224L, 41308);
  }
  
  protected final void MH()
  {
    GMTrace.i(5544131690496L, 41307);
    this.oKf = ((TextView)findViewById(R.h.bPg));
    this.oKg = ((TextView)findViewById(R.h.bPg));
    this.oKh = ((TextView)findViewById(R.h.bPh));
    this.oKi = ((TextView)findViewById(R.h.bPe));
    this.oKm = ((ImageView)findViewById(R.h.bZb));
    this.oKf.setVisibility(0);
    this.oKn = ((LinearLayout)findViewById(R.h.bPd));
    this.oKj = ((RelativeLayout)findViewById(R.h.bZc));
    this.oKg.setVisibility(8);
    this.oKh.setVisibility(8);
    this.oKi.setVisibility(8);
    An(8);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5547889786880L, 41335);
        ap.wT().c(MailImageDownloadUI.a(MailImageDownloadUI.this));
        MailImageDownloadUI.this.finish();
        GMTrace.o(5547889786880L, 41335);
        return true;
      }
    });
    this.oKe = ((ProgressBar)findViewById(R.h.bPf));
    GMTrace.o(5544131690496L, 41307);
  }
  
  public final void a(int paramInt1, int paramInt2, k paramk)
  {
    GMTrace.i(5544400125952L, 41309);
    w.d("MicroMsg.MailImageDownloadUI", "offset " + paramInt1 + "totaolLen  " + paramInt2);
    if (paramk.getType() == 109) {
      if (paramInt2 == 0) {
        break label78;
      }
    }
    label78:
    for (paramInt1 = paramInt1 * 100 / paramInt2 - 1;; paramInt1 = 0)
    {
      sI(Math.max(0, paramInt1));
      GMTrace.o(5544400125952L, 41309);
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5544534343680L, 41310);
    if (paramk.getType() != 109)
    {
      GMTrace.o(5544534343680L, 41310);
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      sI(this.oKe.getMax());
      GMTrace.o(5544534343680L, 41310);
      return;
    }
    w.e("MicroMsg.MailImageDownloadUI", "onSceneEnd : fail, errType = " + paramInt1 + ", errCode = " + paramInt2);
    Toast.makeText(this, R.l.egt, 1).show();
    GMTrace.o(5544534343680L, 41310);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5543729037312L, 41304);
    int i = R.i.cZs;
    GMTrace.o(5543729037312L, 41304);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5543594819584L, 41303);
    super.onCreate(paramBundle);
    this.fxK = getIntent().getLongExtra("img_msg_id", 0L);
    this.fLa = getIntent().getLongExtra("img_server_id", 0L);
    this.hzi = getIntent().getIntExtra("img_download_compress_type", 0);
    this.username = getIntent().getStringExtra("img_download_username");
    MH();
    if (this.fxK > 0L) {
      this.oKk = com.tencent.mm.an.n.IW().ao(this.fxK);
    }
    if (((this.oKk == null) || (this.oKk.hze <= 0L)) && (this.fLa > 0L)) {
      this.oKk = com.tencent.mm.an.n.IW().an(this.fLa);
    }
    if ((this.oKk == null) || (this.oKk.hze <= 0L))
    {
      w.e("MicroMsg.MailImageDownloadUI", "onCreate : on such imginfo, with msgLocalId = " + this.fxK + ", or msgSvrId = " + this.fLa);
      GMTrace.o(5543594819584L, 41303);
      return;
    }
    if ((this.fxK <= 0L) && (this.fLa > 0L))
    {
      ap.AS();
      this.fxK = com.tencent.mm.x.c.yN().A(this.username, this.fLa).field_msgId;
    }
    paramBundle = this.oKk.hzf;
    String str = com.tencent.mm.an.n.IW().l(paramBundle, null, null);
    if ((!bg.mZ(paramBundle)) && (com.tencent.mm.a.e.aZ(str)))
    {
      w.i("MicroMsg.MailImageDownloadUI", "has big image, bigImgPath = %s, hasHDImg = %b, fullPath = %s", new Object[] { paramBundle, Boolean.valueOf(this.oKk.IF()), str });
      if ((str == null) || (str.equals("")) || (!com.tencent.mm.a.e.aZ(str)))
      {
        w.d("MicroMsg.MailImageDownloadUI", "showImg : imgPath is null");
        GMTrace.o(5543594819584L, 41303);
        return;
      }
      this.oKn.setVisibility(8);
      this.oKe.setVisibility(8);
      this.oKm.setVisibility(0);
      paramBundle = com.tencent.mm.sdk.platformtools.d.QK(str);
      this.oKm.setImageBitmap(paramBundle);
      this.oKj.invalidate();
      GMTrace.o(5543594819584L, 41303);
      return;
    }
    this.oKl = new j(this.oKk.hze, this.fxK, this.hzi, this);
    ap.wT().a(this.oKl, 0);
    GMTrace.o(5543594819584L, 41303);
  }
  
  protected void onPause()
  {
    GMTrace.i(5543863255040L, 41305);
    super.onPause();
    ap.wT().b(109, this);
    GMTrace.o(5543863255040L, 41305);
  }
  
  protected void onResume()
  {
    GMTrace.i(5543997472768L, 41306);
    super.onResume();
    ap.wT().a(109, this);
    GMTrace.o(5543997472768L, 41306);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/ui/MailImageDownloadUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */