package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.plugin.sns.storage.t;
import com.tencent.mm.protocal.c.bee;
import com.tencent.mm.protocal.c.bej;
import com.tencent.mm.protocal.c.bek;
import com.tencent.mm.sdk.platformtools.bg;

public final class w
  extends k
  implements j
{
  private int fAy;
  private b gMC;
  public com.tencent.mm.ac.e gMF;
  private long qbY;
  
  public w(long paramLong, String paramString)
  {
    GMTrace.i(8047560753152L, 59959);
    this.qbY = 0L;
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneSnsTagOption", "opcode 3" + " snsTagId " + paramLong + " tagName " + paramString);
    this.qbY = paramLong;
    this.fAy = 3;
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new bej();
    ((b.a)localObject).hlY = new bek();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnstagoption";
    ((b.a)localObject).hlW = 290;
    ((b.a)localObject).hlZ = 114;
    ((b.a)localObject).hma = 1000000114;
    this.gMC = ((b.a)localObject).DA();
    localObject = (bej)this.gMC.hlU.hmc;
    ((bej)localObject).tsp = 3;
    ((bej)localObject).uwl = paramLong;
    ((bej)localObject).mFu = paramString;
    GMTrace.o(8047560753152L, 59959);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(8047829188608L, 59961);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(8047829188608L, 59961);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(8047963406336L, 59962);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneSnsTagOption", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8047963406336L, 59962);
      return;
    }
    paramp = ((bek)((b)paramp).hlV.hmc).uwn;
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneSnsTagOption", paramp.toString());
    switch (this.fAy)
    {
    }
    for (;;)
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8047963406336L, 59962);
      return;
      paramArrayOfByte = ae.bhu().dR(paramp.uwl);
      paramArrayOfByte.field_tagId = paramp.uwl;
      paramArrayOfByte.field_tagName = bg.ap(paramp.mFu, "");
      paramArrayOfByte.field_count = paramp.jWQ;
      paramArrayOfByte.bv(paramp.jWR);
      ae.bhu().a(paramArrayOfByte);
      continue;
      paramInt1 = ae.bhu().dS(this.qbY);
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneSnsTagOption", "MM_SNS_TAG_DEL " + paramInt1);
    }
  }
  
  public final int getType()
  {
    GMTrace.i(8047694970880L, 59960);
    GMTrace.o(8047694970880L, 59960);
    return 290;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */