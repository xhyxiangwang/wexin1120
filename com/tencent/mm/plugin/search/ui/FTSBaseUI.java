package com.tencent.mm.plugin.search.ui;

import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.fts.d.f;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.fts.widget.FTSEditTextView;
import com.tencent.mm.ui.fts.widget.FTSEditTextView.a;
import com.tencent.mm.ui.fts.widget.FTSEditTextView.b;
import com.tencent.mm.ui.fts.widget.a.a;
import com.tencent.mm.ui.fts.widget.a.b;
import java.util.List;

public abstract class FTSBaseUI
  extends MMActivity
  implements b.a, c, FTSEditTextView.a, a.a
{
  String fIW;
  private TextView mPV;
  private ae plB;
  ListView pmd;
  private b pme;
  private boolean pmf;
  com.tencent.mm.ui.fts.widget.a pmg;
  
  public FTSBaseUI()
  {
    GMTrace.i(11838003609600L, 88200);
    this.pmf = false;
    this.plB = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(15616501088256L, 116352);
        if ((paramAnonymousMessage.what == 1) && (!bg.mZ(FTSBaseUI.b(FTSBaseUI.this)))) {
          FTSBaseUI.this.bbS();
        }
        GMTrace.o(15616501088256L, 116352);
      }
    };
    GMTrace.o(11838003609600L, 88200);
  }
  
  public final void D(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(11841493270528L, 88226);
    w.i("MicroMsg.FTS.FTSBaseUI", "onEnd resultCount=%d | isFinished=%b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    if (paramBoolean) {
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
      GMTrace.o(11841493270528L, 88226);
      return;
      bcb();
      continue;
      if (paramInt > 0) {
        bcc();
      } else {
        bca();
      }
    }
  }
  
  protected abstract b a(c paramc);
  
  public void a(String paramString1, String paramString2, List<a.b> paramList, FTSEditTextView.b paramb)
  {
    GMTrace.i(17433540689920L, 129890);
    if (paramb == FTSEditTextView.b.wGg)
    {
      paramString1 = com.tencent.mm.plugin.fts.a.d.yk(paramString1);
      if ((!bg.mZ(this.fIW)) && (this.fIW.equals(paramString1)))
      {
        w.i("MicroMsg.FTS.FTSBaseUI", "Same query %s %s", new Object[] { this.fIW, paramString1 });
        GMTrace.o(17433540689920L, 129890);
        return;
      }
      if (!bg.mZ(paramString1))
      {
        this.fIW = paramString1;
        this.plB.removeMessages(1);
        this.plB.sendEmptyMessageDelayed(1, 300L);
        GMTrace.o(17433540689920L, 129890);
        return;
      }
      stopSearch();
    }
    GMTrace.o(17433540689920L, 129890);
  }
  
  public boolean aaj()
  {
    GMTrace.i(16483547611136L, 122812);
    aKl();
    this.pmg.wGw.vNy.clearFocus();
    GMTrace.o(16483547611136L, 122812);
    return false;
  }
  
  public void b(com.tencent.mm.plugin.fts.d.a.a parama)
  {
    GMTrace.i(16482608087040L, 122805);
    GMTrace.o(16482608087040L, 122805);
  }
  
  protected void bbS()
  {
    GMTrace.i(11839882657792L, 88214);
    this.pmf = true;
    this.pme.Fp(this.fIW);
    bca();
    GMTrace.o(11839882657792L, 88214);
  }
  
  public void bbV()
  {
    GMTrace.i(16483413393408L, 122811);
    stopSearch();
    this.pmg.wGw.cez();
    aKp();
    GMTrace.o(16483413393408L, 122811);
  }
  
  protected void bbX()
  {
    GMTrace.i(11838272045056L, 88202);
    GMTrace.o(11838272045056L, 88202);
  }
  
  public final void bbY()
  {
    GMTrace.i(16482742304768L, 122806);
    finish();
    GMTrace.o(16482742304768L, 122806);
  }
  
  public final void bbZ()
  {
    GMTrace.i(17433406472192L, 129889);
    GMTrace.o(17433406472192L, 129889);
  }
  
  protected void bca()
  {
    GMTrace.i(11840285310976L, 88217);
    this.mPV.setVisibility(8);
    this.pmd.setVisibility(8);
    GMTrace.o(11840285310976L, 88217);
  }
  
  protected void bcb()
  {
    GMTrace.i(11840419528704L, 88218);
    this.mPV.setVisibility(0);
    this.mPV.setText(f.a(getString(R.l.eEl), getString(R.l.eEk), com.tencent.mm.plugin.fts.d.b.a.d(this.fIW, this.fIW)).mok);
    this.pmd.setVisibility(8);
    GMTrace.o(11840419528704L, 88218);
  }
  
  protected void bcc()
  {
    GMTrace.i(11840553746432L, 88219);
    this.mPV.setVisibility(8);
    this.pmd.setVisibility(0);
    GMTrace.o(11840553746432L, 88219);
  }
  
  protected void bcd()
  {
    GMTrace.i(11840687964160L, 88220);
    this.mPV.setVisibility(8);
    this.pmd.setVisibility(8);
    GMTrace.o(11840687964160L, 88220);
  }
  
  public String getHint()
  {
    GMTrace.i(16482473869312L, 122804);
    String str = getString(R.l.dwX);
    GMTrace.o(16482473869312L, 122804);
    return str;
  }
  
  public final void hc(boolean paramBoolean)
  {
    GMTrace.i(16483279175680L, 122810);
    GMTrace.o(16483279175680L, 122810);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11838137827328L, 88201);
    super.onCreate(paramBundle);
    bUC();
    rV("");
    bbX();
    this.pmg = new com.tencent.mm.ui.fts.widget.a(this);
    this.pmg.wGx = this;
    this.pmg.wGw.Il(getHint());
    this.pmg.wGw.wGd = this;
    this.pmg.wGw.wGb = false;
    cO().cP().setCustomView(this.pmg);
    this.pmd = ((ListView)findViewById(R.h.ctP));
    this.pme = a(this);
    this.pme.pmc = this;
    this.pmd.setAdapter(this.pme);
    this.pmd.setOnScrollListener(this.pme);
    this.pmd.setOnItemClickListener(this.pme);
    this.pmd.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(11867397292032L, 88419);
        FTSBaseUI.a(FTSBaseUI.this).wGw.vNy.clearFocus();
        FTSBaseUI.this.aKl();
        GMTrace.o(11867397292032L, 88419);
        return false;
      }
    });
    this.mPV = ((TextView)findViewById(R.h.cgC));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11866591985664L, 88413);
        FTSBaseUI.this.finish();
        GMTrace.o(11866591985664L, 88413);
        return true;
      }
    });
    GMTrace.o(11838137827328L, 88201);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11841090617344L, 88223);
    this.plB.removeMessages(1);
    this.pme.finish();
    super.onDestroy();
    GMTrace.o(11841090617344L, 88223);
  }
  
  protected void stopSearch()
  {
    GMTrace.i(11840822181888L, 88221);
    this.fIW = "";
    this.plB.removeMessages(1);
    this.pmf = false;
    this.pme.stopSearch();
    this.pmg.wGw.Il(getHint());
    bcd();
    GMTrace.o(11840822181888L, 88221);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/FTSBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */