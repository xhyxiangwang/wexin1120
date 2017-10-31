package com.tencent.mm.plugin.card.ui.view;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.a.f;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.e.a;
import com.tencent.mm.plugin.card.ui.m;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.bbx;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;

public final class o
  extends i
{
  private View kAi;
  private ImageView kAj;
  private TextView kAk;
  private TextView kAl;
  
  public o()
  {
    GMTrace.i(4996120707072L, 37224);
    GMTrace.o(4996120707072L, 37224);
  }
  
  public final void MH()
  {
    GMTrace.i(4996254924800L, 37225);
    this.kAi = findViewById(R.h.bKF);
    this.kAj = ((ImageView)findViewById(R.h.bKD));
    this.kAk = ((TextView)findViewById(R.h.bKH));
    this.kAl = ((TextView)findViewById(R.h.bKG));
    this.kAi.setVisibility(8);
    GMTrace.o(4996254924800L, 37225);
  }
  
  public final void amb()
  {
    GMTrace.i(4996523360256L, 37227);
    this.kAi.setVisibility(8);
    GMTrace.o(4996523360256L, 37227);
  }
  
  public final void update()
  {
    GMTrace.i(4996389142528L, 37226);
    b localb = this.kzR.akL();
    MMActivity localMMActivity = this.kzR.akO();
    e.a locala = this.kzR.akS();
    this.kAi.setVisibility(0);
    TextView localTextView = this.kAk;
    ap.AS();
    localTextView.setText(h.b(localMMActivity, c.yL().SL(locala.ktT).vp(), this.kAk.getTextSize()));
    if ((localb.aiM() != null) && (!TextUtils.isEmpty(localb.aiM().uuc))) {
      this.kAl.setText(h.b(localMMActivity, localb.aiM().uuc, this.kAl.getTextSize()));
    }
    for (;;)
    {
      a.b.a(this.kAj, locala.ktT);
      this.kAj.setOnClickListener(this.kzR.akP());
      GMTrace.o(4996389142528L, 37226);
      return;
      if (!TextUtils.isEmpty(localb.aiK().koC)) {
        this.kAl.setText(localMMActivity.getString(R.l.dFq, new Object[] { localb.aiK().koC }));
      } else {
        this.kAl.setText(localMMActivity.getString(R.l.dFq, new Object[] { this.kzR.akT().getTitle() }));
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */