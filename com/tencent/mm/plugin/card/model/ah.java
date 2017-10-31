package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.aqh;
import com.tencent.mm.protocal.c.aws;
import com.tencent.mm.protocal.c.awt;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;

public final class ah
  extends k
  implements j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  
  public ah(LinkedList<aqh> paramLinkedList)
  {
    GMTrace.i(18908056649728L, 140876);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new aws();
    ((b.a)localObject).hlY = new awt();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/reportdynamiccardcodeaction";
    ((b.a)localObject).hlW = 1275;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    ((aws)this.gMC.hlU.hmc).uro = paramLinkedList;
    if (paramLinkedList != null)
    {
      paramLinkedList = paramLinkedList.iterator();
      while (paramLinkedList.hasNext())
      {
        localObject = (aqh)paramLinkedList.next();
        w.d("MicroMsg.NetSceneReportDynamicCardCodeAction", "ReportDynamicCardCodeActionReq operate card_id=%s,code_id=%s,operate_timestamp=%d,operate_type=%d", new Object[] { ((aqh)localObject).fMv, ((aqh)localObject).kpf, Integer.valueOf(((aqh)localObject).umy), Integer.valueOf(((aqh)localObject).umz) });
      }
    }
    GMTrace.o(18908056649728L, 140876);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(18908459302912L, 140879);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(18908459302912L, 140879);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(18908190867456L, 140877);
    w.i("MicroMsg.NetSceneReportDynamicCardCodeAction", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(18908190867456L, 140877);
  }
  
  public final int getType()
  {
    GMTrace.i(18908325085184L, 140878);
    GMTrace.o(18908325085184L, 140878);
    return 1275;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/model/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */