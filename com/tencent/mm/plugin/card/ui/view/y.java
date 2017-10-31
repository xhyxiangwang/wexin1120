package com.tencent.mm.plugin.card.ui.view;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.protocal.c.jf;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;

public final class y
  extends i
{
  private MMActivity jFp;
  private View kAA;
  private b kmJ;
  
  public y()
  {
    GMTrace.i(4997462884352L, 37234);
    GMTrace.o(4997462884352L, 37234);
  }
  
  public final void MH()
  {
    GMTrace.i(4997597102080L, 37235);
    this.jFp = this.kzR.akO();
    GMTrace.o(4997597102080L, 37235);
  }
  
  public final void amb()
  {
    GMTrace.i(4997865537536L, 37237);
    if (this.kAA != null) {
      this.kAA.setVisibility(8);
    }
    GMTrace.o(4997865537536L, 37237);
  }
  
  public final void update()
  {
    GMTrace.i(4997731319808L, 37236);
    this.kmJ = this.kzR.akL();
    if (this.kAA == null) {
      this.kAA = ((ViewStub)findViewById(R.h.brh)).inflate();
    }
    if (this.kmJ.ait()) {
      this.kAA.setBackgroundDrawable(l.v(this.jFp, this.jFp.getResources().getColor(R.e.aNL)));
    }
    TextView localTextView = (TextView)this.kAA.findViewById(R.h.bri);
    if (this.kmJ.aiL() == null)
    {
      w.e("MicroMsg.CardStatusView", "updateState() mCardInfo.getDataInfo() == null");
      localTextView.setVisibility(8);
      GMTrace.o(4997731319808L, 37236);
      return;
    }
    localTextView.setVisibility(0);
    localTextView.setTextColor(this.jFp.getResources().getColor(R.e.aOz));
    if (!TextUtils.isEmpty(this.kmJ.aiK().tFu))
    {
      localTextView.setText(this.kmJ.aiK().tFu);
      GMTrace.o(4997731319808L, 37236);
      return;
    }
    com.tencent.mm.plugin.card.b.m.b(localTextView, this.kmJ.aiL().status);
    GMTrace.o(4997731319808L, 37236);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */