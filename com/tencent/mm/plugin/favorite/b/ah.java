package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.anp;
import com.tencent.mm.protocal.c.anq;
import com.tencent.mm.protocal.c.anr;
import com.tencent.mm.protocal.c.ans;
import com.tencent.mm.protocal.c.st;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class ah
  extends k
  implements j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  public int lPZ;
  public g lQa;
  private LinkedList<ans> lQb;
  private LinkedList<anp> lQc;
  public String lQd;
  public int type;
  
  public ah(int paramInt, g paramg)
  {
    this(paramInt, paramg.field_modItem.lQc, paramg.field_modItem.tQp, 1);
    GMTrace.i(6298703757312L, 46929);
    this.lQa = paramg;
    GMTrace.o(6298703757312L, 46929);
  }
  
  public ah(int paramInt, LinkedList<anp> paramLinkedList, LinkedList<ans> paramLinkedList1)
  {
    this(paramInt, paramLinkedList, paramLinkedList1, 0);
    GMTrace.i(6298569539584L, 46928);
    GMTrace.o(6298569539584L, 46928);
  }
  
  private ah(int paramInt1, LinkedList<anp> paramLinkedList, LinkedList<ans> paramLinkedList1, int paramInt2)
  {
    GMTrace.i(6298435321856L, 46927);
    this.gMF = null;
    b.a locala = new b.a();
    locala.hlX = new anq();
    locala.hlY = new anr();
    locala.uri = "/cgi-bin/micromsg-bin/modfavitem";
    locala.hlW = 426;
    locala.hlZ = 216;
    locala.hma = 1000000216;
    this.gMC = locala.DA();
    this.lQb = paramLinkedList1;
    this.lQc = paramLinkedList;
    this.lPZ = paramInt1;
    this.type = paramInt2;
    GMTrace.o(6298435321856L, 46927);
  }
  
  public ah(int paramInt, LinkedList<anp> paramLinkedList, LinkedList<ans> paramLinkedList1, String paramString)
  {
    this(paramInt, paramLinkedList, paramLinkedList1, 0);
    GMTrace.i(6298837975040L, 46930);
    this.lQd = paramString;
    GMTrace.o(6298837975040L, 46930);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(6298972192768L, 46931);
    if ((this.lQc == null) || (this.lQc.size() == 0))
    {
      GMTrace.o(6298972192768L, 46931);
      return -1;
    }
    anq localanq = (anq)this.gMC.hlU.hmc;
    localanq.ujA = this.lQc.size();
    if (this.lQb != null) {
      localanq.ujC = this.lQb.size();
    }
    for (localanq.tze = this.lQb;; localanq.tze = new LinkedList())
    {
      if (!bg.mZ(this.lQd)) {
        localanq.ujD = this.lQd;
      }
      localanq.ujA = this.lQc.size();
      localanq.ujB = this.lQc;
      localanq.tvd = this.lPZ;
      this.gMF = parame1;
      int i = a(parame, this.gMC, this);
      GMTrace.o(6298972192768L, 46931);
      return i;
      localanq.ujC = 0;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(6299374845952L, 46934);
    w.d("MicroMsg.NetSceneModFavItem", "favId: " + this.lPZ + ", netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(6299374845952L, 46934);
  }
  
  public final long axu()
  {
    GMTrace.i(6299106410496L, 46932);
    if (this.lQa == null)
    {
      GMTrace.o(6299106410496L, 46932);
      return -1L;
    }
    long l = this.lQa.field_localId;
    GMTrace.o(6299106410496L, 46932);
    return l;
  }
  
  public final int axv()
  {
    GMTrace.i(6299240628224L, 46933);
    if (this.lQa == null)
    {
      GMTrace.o(6299240628224L, 46933);
      return -1;
    }
    int i = this.lQa.field_type;
    GMTrace.o(6299240628224L, 46933);
    return i;
  }
  
  public final int getType()
  {
    GMTrace.i(6299509063680L, 46935);
    GMTrace.o(6299509063680L, 46935);
    return 426;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/b/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */