package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.az;
import com.tencent.mm.protocal.c.ba;
import com.tencent.mm.protocal.c.bf;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class k
  extends com.tencent.mm.ac.k
  implements j
{
  private b gMC;
  public com.tencent.mm.ac.e gMF;
  private LinkedList<bf> qbe;
  
  public k(LinkedList<bf> paramLinkedList)
  {
    GMTrace.i(16639508611072L, 123974);
    b.a locala = new b.a();
    locala.hlX = new az();
    locala.hlY = new ba();
    locala.uri = "/cgi-bin/mmoc-bin/ad/addatareport";
    locala.hlW = 1295;
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    ((az)this.gMC.hlU.hmc).tuC = paramLinkedList;
    this.qbe = paramLinkedList;
    GMTrace.o(16639508611072L, 123974);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(16639777046528L, 123976);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(16639777046528L, 123976);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(16639911264256L, 123977);
    w.d("MicroMsg.NetSceneSnsAdDataReport", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(16639911264256L, 123977);
  }
  
  public final int getType()
  {
    GMTrace.i(16639642828800L, 123975);
    GMTrace.o(16639642828800L, 123975);
    return 1295;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */