package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.protocal.c.nc;
import java.util.LinkedList;

public final class c
  extends a
{
  protected TextView kBt;
  protected TextView kBu;
  
  public c(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(4887538565120L, 36415);
    GMTrace.o(4887538565120L, 36415);
  }
  
  protected final void amt()
  {
    GMTrace.i(4887672782848L, 36416);
    this.kBu = ((TextView)ams().findViewById(R.h.boN));
    this.kBt = ((TextView)ams().findViewById(R.h.brj));
    GMTrace.o(4887672782848L, 36416);
  }
  
  protected final void amu()
  {
    GMTrace.i(4887807000576L, 36417);
    if ((this.kmJ.aiK().tEW != null) && (this.kmJ.aiK().tEW.size() > 0))
    {
      nc localnc = (nc)this.kmJ.aiK().tEW.get(0);
      if (this.kBk != null) {
        this.kBk.setText(localnc.title);
      }
      if (this.kBt != null)
      {
        if (TextUtils.isEmpty(localnc.kns)) {
          break label144;
        }
        this.kBt.setText(localnc.kns);
      }
      while (this.kBu != null) {
        if (!TextUtils.isEmpty(localnc.knt))
        {
          this.kBu.setText(localnc.knt);
          GMTrace.o(4887807000576L, 36417);
          return;
          label144:
          this.kBt.setVisibility(8);
        }
        else
        {
          this.kBu.setVisibility(8);
        }
      }
    }
    GMTrace.o(4887807000576L, 36417);
  }
  
  public final void l(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(4887941218304L, 36418);
    GMTrace.o(4887941218304L, 36418);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/widget/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */