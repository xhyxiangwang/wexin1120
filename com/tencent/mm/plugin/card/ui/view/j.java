package com.tencent.mm.plugin.card.ui.view;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.b.c;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.protocal.c.jf;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.pb.common.c.h;

public final class j
  extends g
{
  public j()
  {
    GMTrace.i(4994241658880L, 37210);
    GMTrace.o(4994241658880L, 37210);
  }
  
  public final aa amg()
  {
    GMTrace.i(18944698089472L, 141149);
    v localv = new v(this, this.jFp);
    GMTrace.o(18944698089472L, 141149);
    return localv;
  }
  
  public final aa amh()
  {
    GMTrace.i(18944832307200L, 141150);
    f localf = new f(this, this.jFp);
    GMTrace.o(18944832307200L, 141150);
    return localf;
  }
  
  public final aa ami()
  {
    GMTrace.i(18944966524928L, 141151);
    t localt = new t(this, this.jFp);
    GMTrace.o(18944966524928L, 141151);
    return localt;
  }
  
  public final String e(c paramc)
  {
    GMTrace.i(18894366441472L, 140774);
    paramc = this.kmJ.aiL().code;
    GMTrace.o(18894366441472L, 140774);
    return paramc;
  }
  
  public final boolean h(b paramb)
  {
    GMTrace.i(18894232223744L, 140773);
    if (this.kmJ == null)
    {
      w.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain mCardInfo is null！");
      GMTrace.o(18894232223744L, 140773);
      return true;
    }
    if (paramb == null)
    {
      w.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain false  newCardInfo null！");
      GMTrace.o(18894232223744L, 140773);
      return false;
    }
    String str = this.kmJ.aiL().code;
    paramb = paramb.aiL().code;
    if ((!h.xJ(str)) && (!h.xJ(paramb)) && (!str.equals(paramb)))
    {
      w.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain   code  is diffrent！");
      GMTrace.o(18894232223744L, 140773);
      return true;
    }
    GMTrace.o(18894232223744L, 140773);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */