package com.tencent.mm.plugin.sns.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kiss.widget.textview.a.b;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
{
  private static a qXm;
  private com.tencent.mm.kiss.widget.textview.a.a qXk;
  public int qXl;
  
  static
  {
    GMTrace.i(8329954852864L, 62063);
    qXm = new a();
    GMTrace.o(8329954852864L, 62063);
  }
  
  public a()
  {
    GMTrace.i(8329552199680L, 62060);
    this.qXk = null;
    this.qXl = 0;
    GMTrace.o(8329552199680L, 62060);
  }
  
  public static a bot()
  {
    GMTrace.i(8329686417408L, 62061);
    a locala = qXm;
    GMTrace.o(8329686417408L, 62061);
    return locala;
  }
  
  public final com.tencent.mm.kiss.widget.textview.a.a bou()
  {
    GMTrace.i(8329820635136L, 62062);
    int i = com.tencent.mm.bq.a.fromDPToPix(ab.getContext(), (int)(14.0F * com.tencent.mm.bq.a.dZ(ab.getContext())));
    if ((this.qXk == null) || ((int)this.qXk.gUs != i)) {
      this.qXk = b.xX().K(i).eZ(ab.getContext().getResources().getColor(i.c.pGl)).eY(16).gUb;
    }
    com.tencent.mm.kiss.widget.textview.a.a locala = this.qXk;
    GMTrace.o(8329820635136L, 62062);
    return locala;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/widget/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */