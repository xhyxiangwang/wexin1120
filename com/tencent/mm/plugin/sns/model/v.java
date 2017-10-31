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
import com.tencent.mm.protocal.c.axt;
import com.tencent.mm.protocal.c.bee;
import com.tencent.mm.protocal.c.beh;
import com.tencent.mm.protocal.c.bei;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class v
  extends k
  implements j
{
  private int fAy;
  private b gMC;
  public com.tencent.mm.ac.e gMF;
  private long qbX;
  private int scene;
  
  public v(int paramInt1, long paramLong, String paramString, int paramInt2, List<String> paramList, int paramInt3)
  {
    GMTrace.i(8049305583616L, 59972);
    this.scene = 0;
    w.d("MicroMsg.NetSceneSnsTagMemberOption", "opCode " + paramInt1 + " tagName " + paramString + " memberList " + paramList.size() + " scene " + paramInt3);
    this.fAy = paramInt1;
    this.qbX = paramLong;
    this.scene = paramInt3;
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new beh();
    ((b.a)localObject).hlY = new bei();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnstagmemberoption";
    ((b.a)localObject).hlW = 291;
    ((b.a)localObject).hlZ = 115;
    ((b.a)localObject).hma = 1000000115;
    this.gMC = ((b.a)localObject).DA();
    localObject = (beh)this.gMC.hlU.hmc;
    ((beh)localObject).tsp = paramInt1;
    ((beh)localObject).uwl = paramLong;
    ((beh)localObject).mFu = paramString;
    ((beh)localObject).jWQ = paramInt2;
    ((beh)localObject).ttY = this.scene;
    paramString = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      paramString.add(new axt().Qx(str));
    }
    ((beh)localObject).jWR = paramString;
    w.d("MicroMsg.NetSceneSnsTagMemberOption", "rr.req.rImpl " + localObject.toString());
    GMTrace.o(8049305583616L, 59972);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(8049439801344L, 59973);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(8049439801344L, 59973);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(8049708236800L, 59975);
    w.d("MicroMsg.NetSceneSnsTagMemberOption", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8049708236800L, 59975);
      return;
    }
    paramp = ((bei)((b)paramp).hlV.hmc).uwn;
    w.d("MicroMsg.NetSceneSnsTagMemberOption", "Resp.rImpl " + paramp.toString());
    paramArrayOfByte = ae.bhu().dR(paramp.uwl);
    paramArrayOfByte.field_tagId = paramp.uwl;
    paramArrayOfByte.field_tagName = bg.ap(paramp.mFu, "");
    switch (this.fAy)
    {
    }
    for (;;)
    {
      ae.bhu().a(paramArrayOfByte);
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8049708236800L, 59975);
      return;
      paramArrayOfByte.field_count = paramp.jWQ;
      paramArrayOfByte.bv(paramp.jWR);
    }
  }
  
  public final int getType()
  {
    GMTrace.i(8049574019072L, 59974);
    GMTrace.o(8049574019072L, 59974);
    return 291;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */