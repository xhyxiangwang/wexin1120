package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.network.p;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.storage.f;
import com.tencent.mm.protocal.c.bcp;
import com.tencent.mm.protocal.c.bcq;
import com.tencent.mm.protocal.c.bcr;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class l
  extends k
  implements com.tencent.mm.network.j
{
  public static List<Long> qbf;
  private b gMC;
  public com.tencent.mm.ac.e gMF;
  private String hSn;
  private long pYd;
  
  static
  {
    GMTrace.i(8105811247104L, 60393);
    qbf = Collections.synchronizedList(new LinkedList());
    GMTrace.o(8105811247104L, 60393);
  }
  
  public l(long paramLong, int paramInt)
  {
    GMTrace.i(8105274376192L, 60389);
    this.pYd = paramLong;
    Object localObject1 = new b.a();
    ((b.a)localObject1).hlX = new bcq();
    ((b.a)localObject1).hlY = new bcr();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/mmsnsadobjectdetail";
    ((b.a)localObject1).hlW = 683;
    Object localObject2 = new StringBuilder();
    h.xA();
    this.hSn = (h.xz().cachePath + "ad_detail_session");
    localObject2 = FileOp.c(this.hSn, 0, -1);
    this.gMC = ((b.a)localObject1).DA();
    ((bcq)this.gMC.hlU.hmc).tDg = paramLong;
    ((bcq)this.gMC.hlU.hmc).uuy = n.H((byte[])localObject2);
    ((bcq)this.gMC.hlU.hmc).ttY = paramInt;
    localObject1 = new StringBuilder("req snsId ").append(paramLong).append(" ").append(i.jdMethod_do(paramLong)).append(" scene ").append(paramInt).append(" buf is null? ");
    if (localObject2 == null) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.NetSceneSnsAdObjectDetial", bool);
      GMTrace.o(8105274376192L, 60389);
      return;
    }
  }
  
  public static boolean dt(long paramLong)
  {
    GMTrace.i(8105005940736L, 60387);
    if (qbf.contains(Long.valueOf(paramLong)))
    {
      GMTrace.o(8105005940736L, 60387);
      return false;
    }
    qbf.add(Long.valueOf(paramLong));
    GMTrace.o(8105005940736L, 60387);
    return true;
  }
  
  private static boolean du(long paramLong)
  {
    GMTrace.i(8105140158464L, 60388);
    qbf.remove(Long.valueOf(paramLong));
    GMTrace.o(8105140158464L, 60388);
    return true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(8105408593920L, 60390);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(8105408593920L, 60390);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(8105677029376L, 60392);
    w.i("MicroMsg.NetSceneSnsAdObjectDetial", "errType " + paramInt2 + " errCode " + paramInt3);
    int i = 0;
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      paramInt1 = 1;
    }
    while (paramInt1 == 0)
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      du(this.pYd);
      GMTrace.o(8105677029376L, 60392);
      return;
      paramInt1 = i;
      if (paramInt2 == 4)
      {
        paramInt1 = i;
        if (paramInt3 == 1)
        {
          paramp = n.a(((bcr)this.gMC.hlV.hmc).uuy);
          if (paramp != null)
          {
            FileOp.deleteFile(this.hSn);
            FileOp.b(this.hSn, paramp, paramp.length);
          }
          paramInt1 = 0;
        }
      }
    }
    paramp = n.a(((bcr)this.gMC.hlV.hmc).uuy);
    FileOp.deleteFile(this.hSn);
    FileOp.b(this.hSn, paramp, paramp.length);
    paramp = ((bcr)this.gMC.hlV.hmc).uuz;
    if (paramp != null)
    {
      w.i("MicroMsg.NetSceneSnsAdObjectDetial", "snsdetail xml " + n.b(paramp.uuw.uve));
      w.i("MicroMsg.NetSceneSnsAdObjectDetial", "adxml " + paramp.uux);
    }
    if ((paramp != null) && (paramp.uuw != null) && (paramp.uuw.ujq > 0))
    {
      w.i("MicroMsg.NetSceneSnsAdObjectDetial", paramp.uuw.tDg + " will remove by get detail ");
      du(this.pYd);
      ae.bhr().delete(paramp.uuw.tDg);
      ae.bht().dK(paramp.uuw.tDg);
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8105677029376L, 60392);
      return;
    }
    if ((paramp != null) && (paramp.uuw != null)) {
      w.i("MicroMsg.NetSceneSnsAdObjectDetial", "detail comment:" + paramp.uuw.uvl.size() + " like: " + paramp.uuw.uvi.size());
    }
    a.a(paramp);
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    du(this.pYd);
    GMTrace.o(8105677029376L, 60392);
  }
  
  public final int getType()
  {
    GMTrace.i(8105542811648L, 60391);
    GMTrace.o(8105542811648L, 60391);
    return 683;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */