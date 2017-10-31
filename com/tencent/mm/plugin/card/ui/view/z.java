package com.tencent.mm.plugin.card.ui.view;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.a.g;
import com.tencent.mm.plugin.card.ui.m;
import com.tencent.mm.protocal.c.jf;
import com.tencent.mm.protocal.c.nc;
import com.tencent.mm.ui.MMActivity;

public final class z
  extends i
{
  private View kAB;
  
  public z()
  {
    GMTrace.i(4997999755264L, 37238);
    GMTrace.o(4997999755264L, 37238);
  }
  
  public final void MH()
  {
    GMTrace.i(4998133972992L, 37239);
    GMTrace.o(4998133972992L, 37239);
  }
  
  public final void amb()
  {
    GMTrace.i(4998402408448L, 37241);
    if (this.kAB != null) {
      this.kAB.setVisibility(8);
    }
    GMTrace.o(4998402408448L, 37241);
  }
  
  public final void update()
  {
    GMTrace.i(4998268190720L, 37240);
    if (this.kAB == null) {
      this.kAB = ((ViewStub)findViewById(R.h.brm)).inflate();
    }
    nc localnc = this.kzR.akL().aiL().tEy;
    if (this.kAB != null)
    {
      ((TextView)this.kAB.findViewById(R.h.cAA)).setText(localnc.title);
      ((TextView)this.kAB.findViewById(R.h.cAz)).setText(localnc.kns);
      if ((!this.kzR.akQ().alu()) || (!this.kzR.akQ().alv())) {}
      for (int i = 1; i != 0; i = 0)
      {
        ((LinearLayout.LayoutParams)((LinearLayout)this.kAB).getLayoutParams()).bottomMargin = 0;
        GMTrace.o(4998268190720L, 37240);
        return;
      }
      ((LinearLayout.LayoutParams)((LinearLayout)this.kAB).getLayoutParams()).bottomMargin = this.kzR.akO().getResources().getDimensionPixelSize(R.f.aSn);
    }
    GMTrace.o(4998268190720L, 37240);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */