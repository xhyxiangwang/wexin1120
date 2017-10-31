package com.tencent.mm.plugin.card.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.g.a.ht;
import com.tencent.mm.g.a.ht.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.card.b.g;
import com.tencent.mm.plugin.card.model.af;
import com.tencent.mm.plugin.card.model.d;
import com.tencent.mm.storage.au;
import com.tencent.mm.w.f.a;
import com.tencent.mm.x.ap;

public final class n
  extends com.tencent.mm.sdk.b.c<ht>
  implements e
{
  private long fvM;
  
  public n()
  {
    GMTrace.i(5124030201856L, 38177);
    this.fvM = 0L;
    this.uLu = ht.class.getName().hashCode();
    GMTrace.o(5124030201856L, 38177);
  }
  
  private boolean a(ht paramht)
  {
    GMTrace.i(5124298637312L, 38179);
    if ((paramht instanceof ht))
    {
      Object localObject = paramht.fEj.fEk;
      this.fvM = paramht.fEj.fvM;
      String str = paramht.fEj.fEl;
      localObject = g.uf((String)localObject);
      ap.AS();
      au localau = com.tencent.mm.x.c.yN().cI(this.fvM);
      localau.dB(1);
      ap.AS();
      com.tencent.mm.x.c.yN().a(this.fvM, localau);
      paramht = (ht)localObject;
      if (localObject == null) {
        paramht = g.uf(localau.field_content);
      }
      if (paramht != null)
      {
        ap.wT().a(652, this);
        paramht = new af(paramht.fMv, str, 17);
        ap.wT().a(paramht, 0);
      }
      GMTrace.o(5124298637312L, 38179);
      return true;
    }
    GMTrace.o(5124298637312L, 38179);
    return false;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5124164419584L, 38178);
    if ((paramk instanceof af))
    {
      paramString = ((af)paramk).fMw;
      ap.AS();
      paramk = com.tencent.mm.x.c.yN().cI(this.fvM);
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label154;
      }
      paramk.dB(2);
    }
    for (;;)
    {
      f.a locala = f.a.eC(paramk.field_content);
      d locald = g.uf(paramk.field_content);
      locald.fMw = paramString;
      locala.hbX = g.a(locald);
      locala.fEk = f.a.a(locala, null, null);
      paramk.setContent(f.a.a(locala, null, null));
      ap.AS();
      com.tencent.mm.x.c.yN().a(this.fvM, paramk);
      ap.wT().b(652, this);
      GMTrace.o(5124164419584L, 38178);
      return;
      label154:
      paramk.dB(5);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/a/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */