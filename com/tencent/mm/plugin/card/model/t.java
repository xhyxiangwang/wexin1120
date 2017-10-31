package com.tencent.mm.plugin.card.model;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.card.b.f;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.protocal.c.bfe;
import com.tencent.mm.protocal.c.ex;
import com.tencent.mm.protocal.c.ey;
import com.tencent.mm.protocal.c.jo;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class t
  extends k
  implements j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  public LinkedList<CardInfo> kpx;
  
  public t(LinkedList<jo> paramLinkedList, bfe parambfe, int paramInt)
  {
    GMTrace.i(4893846798336L, 36462);
    this.kpx = new LinkedList();
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new ex();
    ((b.a)localObject).hlY = new ey();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/batchgetcarditembytpinfo";
    ((b.a)localObject).hlW = 699;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (ex)this.gMC.hlU.hmc;
    ((ex)localObject).hdL = paramLinkedList;
    ((ex)localObject).ttd = parambfe;
    ((ex)localObject).fMx = paramInt;
    GMTrace.o(4893846798336L, 36462);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(4894115233792L, 36464);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(4894115233792L, 36464);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(4894249451520L, 36465);
    w.i("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd, batch get fail, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4894249451520L, 36465);
      return;
    }
    paramp = ((ey)this.gMC.hlV.hmc).kpq;
    if (TextUtils.isEmpty(paramp))
    {
      w.e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd fail, resp json_ret is null");
      this.gMF.a(4, -1, null, this);
      GMTrace.o(4894249451520L, 36465);
      return;
    }
    paramp = f.ud(paramp);
    if (paramp != null)
    {
      l.amj();
      this.kpx.addAll(paramp);
    }
    this.gMF.a(0, 0, paramString, this);
    GMTrace.o(4894249451520L, 36465);
  }
  
  public final int getType()
  {
    GMTrace.i(4893981016064L, 36463);
    GMTrace.o(4893981016064L, 36463);
    return 699;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/model/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */