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
import com.tencent.mm.plugin.card.ui.a.g;
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

public final class a
  extends i
{
  private View kzy;
  
  public a()
  {
    GMTrace.i(4996926013440L, 37230);
    GMTrace.o(4996926013440L, 37230);
  }
  
  public final void MH()
  {
    GMTrace.i(4997060231168L, 37231);
    this.kzy = findViewById(R.h.boE);
    GMTrace.o(4997060231168L, 37231);
  }
  
  public final void amb()
  {
    GMTrace.i(4997328666624L, 37233);
    this.kzy.setVisibility(8);
    GMTrace.o(4997328666624L, 37233);
  }
  
  public final void update()
  {
    GMTrace.i(4997194448896L, 37232);
    Object localObject = this.kzR.akQ();
    b localb = this.kzR.akL();
    MMActivity localMMActivity = this.kzR.akO();
    e.a locala = this.kzR.akS();
    f localf = this.kzR.akT();
    if (((g)localObject).alL())
    {
      this.kzy.setVisibility(0);
      findViewById(R.h.bga).setVisibility(0);
      localObject = (ImageView)findViewById(R.h.bfZ);
      TextView localTextView1 = (TextView)findViewById(R.h.bgb);
      TextView localTextView2 = (TextView)findViewById(R.h.bge);
      if (locala.ktT != null)
      {
        ap.AS();
        localTextView1.setText(h.b(localMMActivity, c.yL().SL(locala.ktT).vp(), localTextView1.getTextSize()));
      }
      if (locala.kjz == 23) {
        if (!TextUtils.isEmpty(localb.aiK().tFw)) {
          localTextView2.setText(localb.aiK().tFw);
        }
      }
      for (;;)
      {
        a.b.a((ImageView)localObject, locala.ktT, 0.15F, false);
        ((ImageView)localObject).setOnClickListener(this.kzR.akP());
        GMTrace.o(4997194448896L, 37232);
        return;
        if (!TextUtils.isEmpty(localb.aiK().koC))
        {
          localTextView2.setText(localMMActivity.getString(R.l.dFW, new Object[] { localb.aiK().koC }));
        }
        else
        {
          localTextView2.setText(localMMActivity.getString(R.l.dFW, new Object[] { localf.getTitle() }));
          continue;
          if ((localb.aiM() != null) && (!TextUtils.isEmpty(localb.aiM().uuc))) {
            localTextView2.setText(localb.aiM().uuc);
          } else if (!TextUtils.isEmpty(localb.aiK().koC)) {
            localTextView2.setText(localMMActivity.getString(R.l.dFq, new Object[] { localb.aiK().koC }));
          } else {
            localTextView2.setText(localMMActivity.getString(R.l.dFq, new Object[] { localf.getTitle() }));
          }
        }
      }
    }
    if (((g)localObject).alM())
    {
      if (!TextUtils.isEmpty(localb.aiK().tFw))
      {
        this.kzy.setVisibility(0);
        findViewById(R.h.bga).setVisibility(8);
        ((TextView)findViewById(R.h.bge)).setText(localb.aiK().tFw);
        GMTrace.o(4997194448896L, 37232);
        return;
      }
      this.kzy.setVisibility(8);
      GMTrace.o(4997194448896L, 37232);
      return;
    }
    amb();
    GMTrace.o(4997194448896L, 37232);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */