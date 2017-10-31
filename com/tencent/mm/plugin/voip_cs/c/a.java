package com.tencent.mm.plugin.voip_cs.c;

import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  public aj ilg;
  public TextView jW;
  public int[] rtP;
  public int rtQ;
  public int rtR;
  
  public a()
  {
    GMTrace.i(11282610651136L, 84062);
    this.ilg = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(11282476433408L, 84061);
        int i = a.this.rtP[(a.this.rtR % a.this.rtP.length)];
        if (a.this.jW != null)
        {
          if (-1 != i) {
            break label84;
          }
          a.this.jW.setText(null);
        }
        for (;;)
        {
          a locala = a.this;
          locala.rtR += 1;
          GMTrace.o(11282476433408L, 84061);
          return true;
          label84:
          a.this.jW.setText(i);
        }
      }
    }, true);
    GMTrace.o(11282610651136L, 84062);
  }
  
  public final void btF()
  {
    GMTrace.i(11282744868864L, 84063);
    if (this.ilg != null) {
      this.ilg.MM();
    }
    w.j("MicroMsg.DynamicTextWrap", "stop textview: " + this.jW, new Object[0]);
    this.jW = null;
    GMTrace.o(11282744868864L, 84063);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/voip_cs/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */