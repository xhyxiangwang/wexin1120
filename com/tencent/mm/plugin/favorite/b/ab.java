package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.k.b;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.er;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.protocal.c.ol;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class ab
  extends k
  implements j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  private LinkedList<Integer> lPG;
  private int lPH;
  
  public ab(LinkedList<Integer> paramLinkedList)
  {
    GMTrace.i(6263136059392L, 46664);
    this.gMF = null;
    this.lPH = 0;
    b.a locala = new b.a();
    locala.hlX = new er();
    locala.hlY = new es();
    locala.uri = "/cgi-bin/micromsg-bin/batchdelfavitem";
    locala.hlW = 403;
    locala.hlZ = 194;
    locala.hma = 1000000194;
    this.gMC = locala.DA();
    this.lPG = paramLinkedList;
    GMTrace.o(6263136059392L, 46664);
  }
  
  private boolean axp()
  {
    GMTrace.i(6263270277120L, 46665);
    if ((this.lPG != null) && (this.lPH < this.lPG.size())) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.NetSceneBatchDelFavItem", "check need continue, indexOK %B", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(6263270277120L, 46665);
      return bool;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(6263404494848L, 46666);
    if ((this.lPG == null) || (this.lPG.isEmpty()) || (this.lPH >= this.lPG.size()))
    {
      w.e("MicroMsg.NetSceneBatchDelFavItem", "klem doScene idList null, begIndex %d", new Object[] { Integer.valueOf(this.lPH) });
      GMTrace.o(6263404494848L, 46666);
      return -1;
    }
    this.gMF = parame1;
    w.i("MicroMsg.NetSceneBatchDelFavItem", "ashutest::do netscene size %d, begIndex %d, total %s", new Object[] { Integer.valueOf(this.lPG.size()), Integer.valueOf(this.lPH), this.lPG });
    parame1 = (er)this.gMC.hlU.hmc;
    parame1.tyV.clear();
    int j = this.lPH;
    int i = 0;
    if (j < this.lPG.size())
    {
      int k = ((Integer)this.lPG.get(j)).intValue();
      if (k <= 0) {
        break label279;
      }
      parame1.tyV.add(Integer.valueOf(k));
      i += 1;
    }
    label279:
    for (;;)
    {
      if (i < 20)
      {
        j += 1;
        break;
      }
      this.lPH = (j + 1);
      parame1.jWQ = parame1.tyV.size();
      w.i("MicroMsg.NetSceneBatchDelFavItem", "ashutest::do netscene checkd size %d, %s", new Object[] { Integer.valueOf(parame1.jWQ), parame1.tyV });
      i = a(parame, this.gMC, this);
      GMTrace.o(6263404494848L, 46666);
      return i;
    }
  }
  
  protected final int a(p paramp)
  {
    GMTrace.i(6263672930304L, 46668);
    int i = k.b.hmE;
    GMTrace.o(6263672930304L, 46668);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(6263538712576L, 46667);
    w.i("MicroMsg.NetSceneBatchDelFavItem", "netId %d errType %d errCode %d begIndex %d idListSize %d errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(this.lPH), Integer.valueOf(this.lPG.size()), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      if (axp())
      {
        a(this.hmo, this.gMF);
        GMTrace.o(6263538712576L, 46667);
        return;
      }
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(6263538712576L, 46667);
      return;
    }
    paramp = ((es)((b)paramp).hlV.hmc).jWR;
    if ((paramp == null) || (paramp.size() == 0))
    {
      w.e("MicroMsg.NetSceneBatchDelFavItem", "klem onGYNet resp list null");
      if (axp())
      {
        a(this.hmo, this.gMF);
        GMTrace.o(6263538712576L, 46667);
        return;
      }
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(6263538712576L, 46667);
      return;
    }
    paramArrayOfByte = new ArrayList();
    w.i("MicroMsg.NetSceneBatchDelFavItem", "klem onGYNet respList size:%d", new Object[] { Integer.valueOf(paramp.size()) });
    paramInt1 = 0;
    if (paramInt1 < paramp.size())
    {
      ol localol = (ol)paramp.get(paramInt1);
      if (localol.tyi < 0) {
        w.w("MicroMsg.NetSceneBatchDelFavItem", "klem onGYNet favId:%d, delete failed", new Object[] { Integer.valueOf(localol.tvd) });
      }
      for (;;)
      {
        paramInt1 += 1;
        break;
        paramArrayOfByte.add(Integer.valueOf(localol.tvd));
        w.i("MicroMsg.NetSceneBatchDelFavItem", "klem onGYNet favId:%d deleted", new Object[] { Integer.valueOf(localol.tvd) });
      }
    }
    x.aw(paramArrayOfByte);
    if (axp())
    {
      a(this.hmo, this.gMF);
      GMTrace.o(6263538712576L, 46667);
      return;
    }
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(6263538712576L, 46667);
  }
  
  public final int getType()
  {
    GMTrace.i(6263941365760L, 46670);
    GMTrace.o(6263941365760L, 46670);
    return 403;
  }
  
  protected final int vG()
  {
    GMTrace.i(6263807148032L, 46669);
    GMTrace.o(6263807148032L, 46669);
    return 10;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/b/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */