package com.tencent.mm.plugin.search.ui;

import android.os.Bundle;
import android.os.Message;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.plugin.fts.d.f;
import com.tencent.mm.pluginsdk.ui.VoiceSearchLayout;
import com.tencent.mm.pluginsdk.ui.tools.p;
import com.tencent.mm.pluginsdk.ui.tools.p.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;

@com.tencent.mm.ui.base.a(19)
public abstract class FTSBaseVoiceSearchUI
  extends MMActivity
  implements b.a, c, p.a
{
  String fIW;
  private p kkn;
  TextView mPV;
  private ae plB;
  ListView pmd;
  private b pme;
  private boolean pmf;
  private VoiceSearchLayout pmi;
  private RelativeLayout pmj;
  
  public FTSBaseVoiceSearchUI()
  {
    GMTrace.i(16477373595648L, 122766);
    this.pmf = false;
    this.plB = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(16481936998400L, 122800);
        if ((paramAnonymousMessage.what == 1) && (!bg.mZ(FTSBaseVoiceSearchUI.b(FTSBaseVoiceSearchUI.this)))) {
          FTSBaseVoiceSearchUI.this.bbS();
        }
        GMTrace.o(16481936998400L, 122800);
      }
    };
    GMTrace.o(16477373595648L, 122766);
  }
  
  public void D(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(16480729038848L, 122791);
    w.i("MicroMsg.FTS.FTSBaseMainUI", "onEnd resultCount=%d | isFinished=%b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      bci();
      if (paramInt > 0) {
        bcc();
      }
    }
    for (;;)
    {
      if (this.pmf)
      {
        this.pmf = false;
        this.pmd.setSelection(0);
      }
      GMTrace.o(16480729038848L, 122791);
      return;
      bcb();
      continue;
      if (paramInt > 0)
      {
        bcc();
        bch();
      }
      else
      {
        bca();
        bci();
      }
    }
  }
  
  public final void Qt()
  {
    GMTrace.i(16478715772928L, 122776);
    w.d("MicroMsg.FTS.FTSBaseMainUI", "onQuitSearch");
    finish();
    GMTrace.o(16478715772928L, 122776);
  }
  
  public final void Qu()
  {
    GMTrace.i(16478581555200L, 122775);
    w.d("MicroMsg.FTS.FTSBaseMainUI", "onEnterSearch");
    GMTrace.o(16478581555200L, 122775);
  }
  
  public final void Qv()
  {
    GMTrace.i(16478984208384L, 122778);
    GMTrace.o(16478984208384L, 122778);
  }
  
  public final void Qw()
  {
    GMTrace.i(17433138036736L, 129887);
    GMTrace.o(17433138036736L, 129887);
  }
  
  protected abstract b a(c paramc);
  
  public void a(boolean paramBoolean, String[] paramArrayOfString, long paramLong, int paramInt)
  {
    GMTrace.i(16478447337472L, 122774);
    w.d("MicroMsg.FTS.FTSBaseMainUI", "onVoiceReturn");
    bcg();
    GMTrace.o(16478447337472L, 122774);
  }
  
  public final void ahK()
  {
    GMTrace.i(16478178902016L, 122772);
    w.d("MicroMsg.FTS.FTSBaseMainUI", "onVoiceSearchStart");
    bcf();
    GMTrace.o(16478178902016L, 122772);
  }
  
  public final void ahL()
  {
    GMTrace.i(16478313119744L, 122773);
    w.d("MicroMsg.FTS.FTSBaseMainUI", "onVoiceSearchCancel");
    bcg();
    GMTrace.o(16478313119744L, 122773);
  }
  
  protected View akx()
  {
    GMTrace.i(16478044684288L, 122771);
    GMTrace.o(16478044684288L, 122771);
    return null;
  }
  
  protected void bbS()
  {
    GMTrace.i(16479252643840L, 122780);
    this.pmf = true;
    this.pme.Fp(this.fIW);
    bca();
    GMTrace.o(16479252643840L, 122780);
  }
  
  protected void bbX()
  {
    GMTrace.i(16477642031104L, 122768);
    GMTrace.o(16477642031104L, 122768);
  }
  
  protected void bca()
  {
    GMTrace.i(16479655297024L, 122783);
    this.mPV.setVisibility(8);
    if (this.pmj != null) {
      this.pmj.setVisibility(8);
    }
    this.pmd.setVisibility(8);
    GMTrace.o(16479655297024L, 122783);
  }
  
  protected void bcb()
  {
    GMTrace.i(16479789514752L, 122784);
    this.mPV.setVisibility(0);
    this.mPV.setText(f.a(getString(R.l.eEl), getString(R.l.eEk), com.tencent.mm.plugin.fts.d.b.a.d(this.fIW, this.fIW)).mok);
    if (this.pmj != null) {
      this.pmj.setVisibility(8);
    }
    this.pmd.setVisibility(8);
    GMTrace.o(16479789514752L, 122784);
  }
  
  protected void bcc()
  {
    GMTrace.i(16479923732480L, 122785);
    this.mPV.setVisibility(8);
    if (this.pmj != null) {
      this.pmj.setVisibility(8);
    }
    this.pmd.setVisibility(0);
    GMTrace.o(16479923732480L, 122785);
  }
  
  protected void bcd()
  {
    GMTrace.i(16480057950208L, 122786);
    this.mPV.setVisibility(8);
    if (this.pmj != null) {
      this.pmj.setVisibility(8);
    }
    this.pmd.setVisibility(8);
    GMTrace.o(16480057950208L, 122786);
  }
  
  protected abstract boolean bce();
  
  protected void bcf()
  {
    GMTrace.i(16479386861568L, 122781);
    this.mPV.setVisibility(8);
    if (this.pmj != null) {
      this.pmj.setVisibility(0);
    }
    this.pmd.setVisibility(8);
    GMTrace.o(16479386861568L, 122781);
  }
  
  protected void bcg()
  {
    GMTrace.i(16479521079296L, 122782);
    this.mPV.setVisibility(8);
    if (this.pmj != null) {
      this.pmj.setVisibility(8);
    }
    this.pmd.setVisibility(8);
    GMTrace.o(16479521079296L, 122782);
  }
  
  protected void bch()
  {
    GMTrace.i(16480863256576L, 122792);
    GMTrace.o(16480863256576L, 122792);
  }
  
  protected void bci()
  {
    GMTrace.i(16480997474304L, 122793);
    GMTrace.o(16480997474304L, 122793);
  }
  
  public boolean np(String paramString)
  {
    GMTrace.i(16479118426112L, 122779);
    w.d("MicroMsg.FTS.FTSBaseMainUI", "onSearchKeyDown %s", new Object[] { paramString });
    aKl();
    if (this.kkn != null) {
      this.kkn.clearFocus();
    }
    GMTrace.o(16479118426112L, 122779);
    return false;
  }
  
  public final void nq(String paramString)
  {
    GMTrace.i(16478849990656L, 122777);
    w.d("MicroMsg.FTS.FTSBaseMainUI", "onSearchChange %s", new Object[] { paramString });
    if (bg.mZ(paramString))
    {
      if (!this.kkn.ceW())
      {
        this.kkn.ceX();
        aKp();
      }
      bcd();
    }
    paramString = d.yk(paramString);
    if ((!bg.mZ(this.fIW)) && (this.fIW.equals(paramString)))
    {
      w.i("MicroMsg.FTS.FTSBaseMainUI", "Same query %s %s", new Object[] { this.fIW, paramString });
      GMTrace.o(16478849990656L, 122777);
      return;
    }
    this.fIW = paramString;
    if (!bg.mZ(this.fIW))
    {
      this.plB.removeMessages(1);
      this.plB.sendEmptyMessageDelayed(1, 300L);
      GMTrace.o(16478849990656L, 122777);
      return;
    }
    this.plB.removeMessages(1);
    this.pmf = false;
    this.pme.stopSearch();
    bcd();
    GMTrace.o(16478849990656L, 122777);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(16477507813376L, 122767);
    super.onCreate(paramBundle);
    bUC();
    rV("");
    bbX();
    this.kkn = new p();
    this.kkn.mp(true);
    this.kkn.a(this);
    this.kkn.tnt = bce();
    this.pmd = ((ListView)findViewById(R.h.ctP));
    if (akx() != null)
    {
      w.i("MicroMsg.FTS.FTSBaseMainUI", "searchResultLV addFooterView");
      this.pmd.addFooterView(akx());
    }
    this.pme = a(this);
    this.pme.pmc = this;
    this.pmd.setAdapter(this.pme);
    this.pmd.setOnScrollListener(this.pme);
    this.pmd.setOnItemClickListener(this.pme);
    this.pmd.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(16476836724736L, 122762);
        FTSBaseVoiceSearchUI.a(FTSBaseVoiceSearchUI.this).clearFocus();
        FTSBaseVoiceSearchUI.this.aKl();
        GMTrace.o(16476836724736L, 122762);
        return false;
      }
    });
    if (bce())
    {
      this.pmi = new VoiceSearchLayout(this);
      paramBundle = new RelativeLayout.LayoutParams(-1, -1);
      paramBundle.addRule(14);
      this.pmi.setLayoutParams(paramBundle);
      this.pmi.yx(BackwardSupportUtil.b.a(this, 100.0F));
      this.pmi.lxk.findViewById(R.h.cFW).setBackgroundResource(0);
      this.pmi.setVisibility(8);
      this.kkn.o(this.pmi);
      this.pmj = ((RelativeLayout)findViewById(R.h.cGb));
      this.pmj.addView(this.pmi);
    }
    this.mPV = ((TextView)findViewById(R.h.cgC));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(16476031418368L, 122756);
        FTSBaseVoiceSearchUI.this.finish();
        GMTrace.o(16476031418368L, 122756);
        return true;
      }
    });
    GMTrace.o(16477507813376L, 122767);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(16480460603392L, 122789);
    this.kkn.a(this, paramMenu);
    GMTrace.o(16480460603392L, 122789);
    return true;
  }
  
  protected void onDestroy()
  {
    GMTrace.i(16480326385664L, 122788);
    this.plB.removeMessages(1);
    this.pme.finish();
    super.onDestroy();
    GMTrace.o(16480326385664L, 122788);
  }
  
  protected void onPause()
  {
    GMTrace.i(16480192167936L, 122787);
    super.onPause();
    this.kkn.cancel();
    this.kkn.clearFocus();
    GMTrace.o(16480192167936L, 122787);
  }
  
  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(16480594821120L, 122790);
    this.kkn.a(this, paramMenu);
    GMTrace.o(16480594821120L, 122790);
    return true;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/FTSBaseVoiceSearchUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */