package com.tencent.mm.plugin.search.ui;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.d.i;
import com.tencent.mm.plugin.fts.d.i.b;
import com.tencent.mm.sdk.platformtools.ae;
import java.util.HashSet;

public final class a
  extends b
  implements i.b
{
  protected boolean plA;
  private ae plB;
  private com.tencent.mm.plugin.search.ui.c.a plz;
  
  public a(c paramc)
  {
    super(paramc);
    GMTrace.i(11822434353152L, 88084);
    this.plB = new ae(Looper.getMainLooper());
    this.plz = new com.tencent.mm.plugin.search.ui.c.a(paramc.getContext(), this, 0);
    GMTrace.o(11822434353152L, 88084);
  }
  
  public final void a(i parami, String paramString)
  {
    GMTrace.i(16476568289280L, 122760);
    int i = this.plz.nQ(0);
    tp(i);
    notifyDataSetChanged();
    C(i, true);
    GMTrace.o(16476568289280L, 122760);
  }
  
  protected final boolean a(com.tencent.mm.plugin.fts.d.a.a parama)
  {
    GMTrace.i(16476434071552L, 122759);
    GMTrace.o(16476434071552L, 122759);
    return false;
  }
  
  protected final void bbR()
  {
    GMTrace.i(11822702788608L, 88086);
    this.plA = false;
    this.plz.a(this.fIW, this.plB, new HashSet());
    GMTrace.o(11822702788608L, 88086);
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a nR(int paramInt)
  {
    GMTrace.i(16476299853824L, 122758);
    com.tencent.mm.plugin.fts.d.a.a locala = this.plz.nR(paramInt);
    GMTrace.o(16476299853824L, 122758);
    return locala;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */