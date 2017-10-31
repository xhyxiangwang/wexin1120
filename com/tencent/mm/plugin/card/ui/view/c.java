package com.tencent.mm.plugin.card.ui.view;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.m;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.protocal.c.pd;

public final class c
  extends i
{
  private View kzE;
  private TextView kzF;
  
  public c()
  {
    GMTrace.i(4995046965248L, 37216);
    GMTrace.o(4995046965248L, 37216);
  }
  
  public final void MH()
  {
    GMTrace.i(4995181182976L, 37217);
    GMTrace.o(4995181182976L, 37217);
  }
  
  public final void amb()
  {
    GMTrace.i(4995449618432L, 37219);
    if (this.kzE != null) {
      this.kzE.setVisibility(8);
    }
    GMTrace.o(4995449618432L, 37219);
  }
  
  public final void update()
  {
    GMTrace.i(4995315400704L, 37218);
    if (this.kzE == null)
    {
      this.kzE = ((ViewStub)findViewById(R.h.boI)).inflate();
      this.kzF = ((TextView)this.kzE.findViewById(R.h.boJ));
    }
    this.kzE.setVisibility(0);
    this.kzE.setOnClickListener(this.kzR.akP());
    b localb = this.kzR.akL();
    if (!TextUtils.isEmpty(localb.aiK().tFo.tKW))
    {
      this.kzF.setText(localb.aiK().tFo.tKW);
      GMTrace.o(4995315400704L, 37218);
      return;
    }
    this.kzF.setText(getString(R.l.dFL));
    GMTrace.o(4995315400704L, 37218);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */