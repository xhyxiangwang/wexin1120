package com.tencent.mm.plugin.card.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.card.b.i;
import com.tencent.mm.plugin.card.base.CardBaseUI;
import com.tencent.mm.plugin.card.model.ad;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.model.f;
import com.tencent.mm.plugin.card.model.n.a;
import com.tencent.mm.plugin.card.model.x;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.s.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.x.ap;

public class CardIndexUI
  extends CardBaseUI
{
  private final String TAG;
  int fromScene;
  private View kxa;
  private TextView kxb;
  private f kxc;
  private TextView kxd;
  private TextView kxe;
  private ImageView kxf;
  private LinearLayout kxg;
  int kxh;
  private long mStartTime;
  
  public CardIndexUI()
  {
    GMTrace.i(4925522182144L, 36698);
    this.TAG = "MicroMsg.CardIndexUI";
    this.mStartTime = 0L;
    this.fromScene = 0;
    this.kxh = -1;
    GMTrace.o(4925522182144L, 36698);
  }
  
  protected final void MH()
  {
    GMTrace.i(4925924835328L, 36701);
    if (getIntent() != null) {
      this.kxh = getIntent().getIntExtra("key_card_type", -1);
    }
    super.MH();
    GMTrace.o(4925924835328L, 36701);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(4926595923968L, 36706);
    super.a(paramInt1, paramInt2, paramString, paramk);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof x))
      {
        ap.AS();
        this.kxc = i.ui((String)com.tencent.mm.x.c.xi().get(282885, ""));
        if (this.kxc == null) {
          this.kxc = new f();
        }
        if ((this.kxc != null) && (!TextUtils.isEmpty(this.kxc.koG))) {
          this.kxd.setText(this.kxc.koG);
        }
        if ((this.kxc == null) || (!this.kxc.koJ))
        {
          this.kxa.setVisibility(8);
          GMTrace.o(4926595923968L, 36706);
          return;
        }
        this.kxb.setText(this.kxc.koH);
        if ((!TextUtils.isEmpty(this.kxc.koH)) && (!TextUtils.isEmpty(this.kxc.koI)))
        {
          this.kxa.setVisibility(0);
          GMTrace.o(4926595923968L, 36706);
          return;
        }
        this.kxa.setVisibility(8);
        GMTrace.o(4926595923968L, 36706);
        return;
      }
      if (((paramk instanceof ad)) && (((ad)paramk).kpG) && ((this.kme instanceof c)))
      {
        ((c)this.kme).kP(false);
        ((c)this.kme).kP(true);
        ((c)this.kme).QA();
      }
    }
    GMTrace.o(4926595923968L, 36706);
  }
  
  protected final void aib()
  {
    GMTrace.i(4926059053056L, 36702);
    if (1 == this.kxh)
    {
      oC(R.l.dFI);
      this.kxd = ((TextView)findViewById(R.h.cgv));
      this.kxe = ((TextView)findViewById(R.h.cgw));
      this.kxf = ((ImageView)findViewById(R.h.cgt));
      this.kxa = findViewById(R.h.bpE);
      this.kxb = ((TextView)findViewById(R.h.bpF));
      this.kxg = ((LinearLayout)findViewById(R.h.cgu));
      this.kxa.setVisibility(8);
      this.kxe.setVisibility(0);
      this.kxd.setVisibility(0);
      this.kxf.setVisibility(8);
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.kxg.getLayoutParams();
      localLayoutParams.topMargin = BackwardSupportUtil.b.a(this, 100.0F);
      this.kxg.setLayoutParams(localLayoutParams);
      if (1 != this.kxh) {
        break label255;
      }
      this.kxe.setText(getString(R.l.dFA));
      this.kxd.setText(getString(R.l.dFz));
    }
    for (;;)
    {
      this.kxb.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(4974243217408L, 37061);
          if (!TextUtils.isEmpty(CardIndexUI.a(CardIndexUI.this).koI)) {
            com.tencent.mm.plugin.card.b.b.a(CardIndexUI.this, CardIndexUI.a(CardIndexUI.this).koI, 0);
          }
          GMTrace.o(4974243217408L, 37061);
        }
      });
      GMTrace.o(4926059053056L, 36702);
      return;
      if (3 == this.kxh)
      {
        oC(R.l.dGO);
        break;
      }
      oC(R.l.eHw);
      break;
      label255:
      if (3 == this.kxh)
      {
        this.kxe.setText(getString(R.l.dFE));
        this.kxd.setText(getString(R.l.dFD));
      }
      else
      {
        this.kxe.setText(getString(R.l.dFZ));
        this.kxd.setText(getString(R.l.dGh));
      }
    }
  }
  
  protected final int aic()
  {
    GMTrace.i(4926461706240L, 36705);
    if (1 == this.kxh)
    {
      i = n.a.kpn;
      GMTrace.o(4926461706240L, 36705);
      return i;
    }
    if (3 == this.kxh)
    {
      i = n.a.kpm;
      GMTrace.o(4926461706240L, 36705);
      return i;
    }
    int i = n.a.kpj;
    GMTrace.o(4926461706240L, 36705);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(4926730141696L, 36707);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(4926730141696L, 36707);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4925656399872L, 36699);
    super.onCreate(paramBundle);
    w.i("MicroMsg.CardIndexUI", "oncreate");
    this.mStartTime = System.currentTimeMillis();
    MH();
    ap.wT().a(984, this);
    al.ajB();
    com.tencent.mm.plugin.card.a.b.lt(1);
    int i = al.ajG().kni;
    if ((com.tencent.mm.s.c.vP().aC(262152, 266256)) || (i > 0))
    {
      g.paX.i(11324, new Object[] { "CardPackageListView", Integer.valueOf(0), "", "", Integer.valueOf(1), Integer.valueOf(this.fromScene), "", Integer.valueOf(0), "" });
      GMTrace.o(4925656399872L, 36699);
      return;
    }
    g.paX.i(11324, new Object[] { "CardPackageListView", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(this.fromScene), "", Integer.valueOf(0), "" });
    GMTrace.o(4925656399872L, 36699);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(4925790617600L, 36700);
    ap.wT().b(984, this);
    long l1 = System.currentTimeMillis();
    long l2 = this.mStartTime;
    g.paX.i(13219, new Object[] { "CardPackageListView", Integer.valueOf(this.fromScene), "", "", Long.valueOf(l1 - l2) });
    super.onDestroy();
    GMTrace.o(4925790617600L, 36700);
  }
  
  protected void onResume()
  {
    GMTrace.i(4926193270784L, 36703);
    super.onResume();
    GMTrace.o(4926193270784L, 36703);
  }
  
  protected void onStop()
  {
    GMTrace.i(4926327488512L, 36704);
    super.onStop();
    GMTrace.o(4926327488512L, 36704);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/CardIndexUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */