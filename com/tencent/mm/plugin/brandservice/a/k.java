package com.tencent.mm.plugin.brandservice.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.brandservice.a;
import com.tencent.mm.protocal.c.ag;
import com.tencent.mm.protocal.c.bam;
import com.tencent.mm.protocal.c.ban;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class k
  extends com.tencent.mm.ac.k
  implements j
{
  private final com.tencent.mm.ac.b gMC;
  private com.tencent.mm.ac.e gMF;
  
  public k(List<b> paramList)
  {
    GMTrace.i(10846939906048L, 80816);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new bam();
    ((b.a)localObject).hlY = new ban();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/setapplist";
    ((b.a)localObject).hlW = 386;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (bam)this.gMC.hlU.hmc;
    LinkedList localLinkedList = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      b localb = (b)paramList.next();
      ag localag = new ag();
      localag.jWW = localb.userName;
      localLinkedList.add(localag);
    }
    ((bam)localObject).jWQ = localLinkedList.size();
    ((bam)localObject).jWR = localLinkedList;
    w.i("MicroMsg.BrandService.NetSceneSetAppList", "info: upload size %d, toString %s", new Object[] { Integer.valueOf(localLinkedList.size()), localLinkedList.toString() });
    GMTrace.o(10846939906048L, 80816);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(10847342559232L, 80819);
    this.gMF = parame1;
    w.i("MicroMsg.BrandService.NetSceneSetAppList", "do scene");
    int i = a(parame, this.gMC, this);
    GMTrace.o(10847342559232L, 80819);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(10847074123776L, 80817);
    w.i("MicroMsg.BrandService.NetSceneSetAppList", "on scene end code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramp = (ban)this.gMC.hlV.hmc;
      w.i("MicroMsg.BrandService.NetSceneSetAppList", "ok, hash code is %d", new Object[] { Integer.valueOf(paramp.tTq) });
      a.d(196610, Integer.valueOf(paramp.tTq));
      a.d(196611, Boolean.valueOf(false));
    }
    for (;;)
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(10847074123776L, 80817);
      return;
      a.d(196611, Boolean.valueOf(true));
    }
  }
  
  public final int getType()
  {
    GMTrace.i(10847208341504L, 80818);
    GMTrace.o(10847208341504L, 80818);
    return 386;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/brandservice/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */