package com.tencent.mm.plugin.search.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.fts.d.a.a;
import com.tencent.mm.plugin.fts.d.g;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.contact.u;
import com.tencent.mm.x.o;

public class FTSChattingTalkerUI
  extends FTSBaseUI
  implements View.OnClickListener
{
  private String fAJ;
  private LinearLayout pml;
  private LinearLayout pmm;
  private View pmn;
  private View pmo;
  private View pmp;
  private View pmq;
  private View pmr;
  private View pms;
  private View pmt;
  private d pmu;
  
  public FTSChattingTalkerUI()
  {
    GMTrace.i(11835453472768L, 88181);
    GMTrace.o(11835453472768L, 88181);
  }
  
  protected final void MH()
  {
    GMTrace.i(11835721908224L, 88183);
    super.MH();
    this.pmt = findViewById(R.h.ctM);
    this.pml = ((LinearLayout)this.pmt.findViewById(R.h.bKK));
    this.pmm = ((LinearLayout)this.pmt.findViewById(R.h.bKL));
    this.pmn = this.pmt.findViewById(R.h.ctd);
    this.pmo = this.pmt.findViewById(R.h.ctg);
    this.pmp = this.pmt.findViewById(R.h.ctf);
    this.pmq = this.pmt.findViewById(R.h.cte);
    this.pmr = this.pmt.findViewById(R.h.cti);
    this.pms = this.pmt.findViewById(R.h.cth);
    if (!o.dW(this.fAJ))
    {
      this.pml.removeView(this.pmo);
      this.pmm.removeView(this.pmq);
      this.pml.addView(this.pmq);
      this.pmm.addView(this.pmo);
      this.pmo.setVisibility(4);
      this.pmt.findViewById(R.h.bCf).setVisibility(8);
      this.pmt.findViewById(R.h.bCi).setVisibility(0);
      this.pmt.findViewById(R.h.bCh).setVisibility(8);
    }
    this.pmt.setVisibility(0);
    this.pmo.setOnClickListener(this);
    this.pmn.setOnClickListener(this);
    this.pmp.setOnClickListener(this);
    this.pmq.setOnClickListener(this);
    this.pmr.setOnClickListener(this);
    this.pms.setOnClickListener(this);
    GMTrace.o(11835721908224L, 88183);
  }
  
  protected final b a(c paramc)
  {
    GMTrace.i(11835990343680L, 88185);
    if (this.pmu == null) {
      this.pmu = new d(paramc, this.fAJ);
    }
    paramc = this.pmu;
    GMTrace.o(11835990343680L, 88185);
    return paramc;
  }
  
  public final void b(a parama)
  {
    GMTrace.i(16486903054336L, 122837);
    if (o.dW(this.fAJ))
    {
      u.j(this.fIW, 10, 5, parama.position + 1);
      GMTrace.o(16486903054336L, 122837);
      return;
    }
    u.j(this.fIW, 11, 5, parama.position + 1);
    GMTrace.o(16486903054336L, 122837);
  }
  
  protected final void bbX()
  {
    GMTrace.i(11835856125952L, 88184);
    this.fAJ = getIntent().getStringExtra("detail_username");
    w.i("MicroMsg.FTS.FTSChattingTalkerUI", "initSearchData talker=%s", new Object[] { this.fAJ });
    GMTrace.o(11835856125952L, 88184);
  }
  
  protected final void bca()
  {
    GMTrace.i(11836661432320L, 88190);
    super.bca();
    this.pmt.setVisibility(8);
    GMTrace.o(11836661432320L, 88190);
  }
  
  protected final void bcb()
  {
    GMTrace.i(11836392996864L, 88188);
    super.bcb();
    this.pmt.setVisibility(8);
    GMTrace.o(11836392996864L, 88188);
  }
  
  protected final void bcc()
  {
    GMTrace.i(11836527214592L, 88189);
    super.bcc();
    this.pmt.setVisibility(8);
    GMTrace.o(11836527214592L, 88189);
  }
  
  protected final void bcd()
  {
    GMTrace.i(11836258779136L, 88187);
    super.bcd();
    this.pmt.setVisibility(0);
    GMTrace.o(11836258779136L, 88187);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11836795650048L, 88191);
    int i = R.i.cVu;
    GMTrace.o(11836795650048L, 88191);
    return i;
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(15076408950784L, 112328);
    if (paramView.getId() == R.h.ctg)
    {
      w.i("MicroMsg.FTS.FTSChattingTalkerUI", "onSearchMemberDetail");
      paramView = new Intent();
      paramView.putExtra("frome_scene", 1);
      paramView.putExtra("RoomInfo_Id", this.fAJ);
      paramView.putExtra("title", getResources().getString(R.l.eEU));
      com.tencent.mm.bi.d.b(this, "chatroom", ".ui.SelectMemberUI", paramView);
      GMTrace.o(15076408950784L, 112328);
      return;
    }
    if (paramView.getId() == R.h.ctd)
    {
      w.i("MicroMsg.FTS.FTSChattingTalkerUI", "onSearchDateDetail");
      paramView = new Intent();
      paramView.putExtra("detail_username", this.fAJ);
      com.tencent.mm.bi.d.b(this, "chatroom", ".ui.SelectDateUI", paramView);
      GMTrace.o(15076408950784L, 112328);
      return;
    }
    if (paramView.getId() == R.h.ctf)
    {
      w.i("MicroMsg.FTS.FTSChattingTalkerUI", "onSeeImageVideoHistory");
      paramView = new Intent();
      paramView.putExtra("kintent_talker", this.fAJ);
      paramView.putExtra("key_media_type", 1);
      com.tencent.mm.bi.d.a(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI", paramView);
      GMTrace.o(15076408950784L, 112328);
      return;
    }
    if (paramView.getId() == R.h.cte)
    {
      w.i("MicroMsg.FTS.FTSChattingTalkerUI", "onSeeFileHistory");
      paramView = new Intent();
      paramView.putExtra("kintent_talker", this.fAJ);
      paramView.putExtra("key_media_type", 2);
      com.tencent.mm.bi.d.a(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", paramView);
      GMTrace.o(15076408950784L, 112328);
      return;
    }
    if (paramView.getId() == R.h.cti)
    {
      w.i("MicroMsg.FTS.FTSChattingTalkerUI", "onSeeUrlHistory");
      paramView = new Intent();
      paramView.putExtra("kintent_talker", this.fAJ);
      paramView.putExtra("key_media_type", 3);
      com.tencent.mm.bi.d.a(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", paramView);
      GMTrace.o(15076408950784L, 112328);
      return;
    }
    if (paramView.getId() == R.h.cth)
    {
      w.i("MicroMsg.FTS.FTSChattingTalkerUI", "onSeeUrlHistory");
      paramView = new Intent();
      paramView.putExtra("kintent_talker", this.fAJ);
      paramView.putExtra("key_media_type", 4);
      com.tencent.mm.bi.d.a(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", paramView);
    }
    GMTrace.o(15076408950784L, 112328);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11835587690496L, 88182);
    super.onCreate(paramBundle);
    MH();
    paramBundle = com.tencent.mm.plugin.search.a.c.bbO();
    if (paramBundle != null) {
      paramBundle.aBB();
    }
    GMTrace.o(11835587690496L, 88182);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11837198303232L, 88194);
    super.onDestroy();
    this.pmu.finish();
    g localg = com.tencent.mm.plugin.search.a.c.bbO();
    if (localg != null) {
      localg.aBz();
    }
    GMTrace.o(11837198303232L, 88194);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/FTSChattingTalkerUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */