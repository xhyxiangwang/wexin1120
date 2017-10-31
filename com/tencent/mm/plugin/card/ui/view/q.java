package com.tencent.mm.plugin.card.ui.view;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.b.c;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.protocal.c.jf;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.protocal.c.nc;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.pb.common.c.h;

public final class q
  extends g
{
  public String kyD;
  
  public q()
  {
    GMTrace.i(18895171747840L, 140780);
    this.kyD = "";
    GMTrace.o(18895171747840L, 140780);
  }
  
  public final aa amg()
  {
    GMTrace.i(18945100742656L, 141152);
    s locals = new s(this, this.jFp);
    GMTrace.o(18945100742656L, 141152);
    return locals;
  }
  
  public final aa amh()
  {
    GMTrace.i(18945234960384L, 141153);
    p localp = new p(this, this.jFp);
    GMTrace.o(18945234960384L, 141153);
    return localp;
  }
  
  public final aa ami()
  {
    GMTrace.i(18945369178112L, 141154);
    r localr = new r(this, this.jFp);
    GMTrace.o(18945369178112L, 141154);
    return localr;
  }
  
  public final String e(c paramc)
  {
    GMTrace.i(18895440183296L, 140782);
    if (!h.isNullOrEmpty(this.kmJ.aiL().tEG))
    {
      paramc = this.kmJ.aiL().tEG;
      GMTrace.o(18895440183296L, 140782);
      return paramc;
    }
    if ((this.kmJ.aiE()) && (!h.isNullOrEmpty(this.kyD)))
    {
      paramc = this.kyD;
      GMTrace.o(18895440183296L, 140782);
      return paramc;
    }
    paramc = this.kmJ.aiL().code;
    GMTrace.o(18895440183296L, 140782);
    return paramc;
  }
  
  public final boolean h(b paramb)
  {
    GMTrace.i(18895305965568L, 140781);
    if (this.kmJ == null)
    {
      w.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain mCardInfo is null！");
      GMTrace.o(18895305965568L, 140781);
      return true;
    }
    if (paramb == null)
    {
      w.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain false  newCardInfo null！");
      GMTrace.o(18895305965568L, 140781);
      return false;
    }
    Object localObject = this.kmJ.aiL().code;
    String str = paramb.aiL().code;
    if ((!h.xJ((String)localObject)) && (!h.xJ(str)) && (!((String)localObject).equals(str)))
    {
      w.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain   code  is diffrent！");
      GMTrace.o(18895305965568L, 140781);
      return true;
    }
    localObject = this.kmJ.aiK().tFA;
    paramb = paramb.aiK().tFA;
    if (((localObject == null) && (paramb != null)) || ((localObject != null) && (paramb == null)))
    {
      w.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field  is diffrent！");
      GMTrace.o(18895305965568L, 140781);
      return true;
    }
    if ((localObject != null) && (paramb != null) && (((nc)localObject).title != null) && (paramb.title != null) && (!((nc)localObject).title.equals(paramb.title)))
    {
      w.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field title is diffrent！");
      GMTrace.o(18895305965568L, 140781);
      return true;
    }
    if ((localObject != null) && (paramb != null) && (((nc)localObject).knt != null) && (paramb.knt != null) && (!((nc)localObject).knt.equals(paramb.knt)))
    {
      w.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field aux_title  is diffrent！");
      GMTrace.o(18895305965568L, 140781);
      return true;
    }
    if ((this.kmJ.aiE()) && (!h.isNullOrEmpty(this.kyD)))
    {
      w.i("MicroMsg.CardCodeView", "dynamicCode updated！");
      GMTrace.o(18895305965568L, 140781);
      return true;
    }
    GMTrace.o(18895305965568L, 140781);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */