package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.bdl;
import com.tencent.mm.protocal.c.bdm;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;
import java.util.Vector;

public final class p
  extends k
  implements j
{
  public static List<Long> qbf;
  public b gMC;
  public com.tencent.mm.ac.e gMF;
  private long pYd;
  
  static
  {
    GMTrace.i(8050781978624L, 59983);
    qbf = new Vector();
    GMTrace.o(8050781978624L, 59983);
  }
  
  public p(long paramLong)
  {
    GMTrace.i(8050245107712L, 59979);
    this.pYd = paramLong;
    b.a locala = new b.a();
    locala.hlX = new bdl();
    locala.hlY = new bdm();
    locala.uri = "/cgi-bin/micromsg-bin/mmsnsobjectdetail";
    locala.hlW = 210;
    locala.hlZ = 101;
    locala.hma = 1000000101;
    this.gMC = locala.DA();
    ((bdl)this.gMC.hlU.hmc).tDg = paramLong;
    w.d("MicroMsg.NetSceneSnsObjectDetial", "req snsId " + paramLong);
    GMTrace.o(8050245107712L, 59979);
  }
  
  public static boolean dt(long paramLong)
  {
    GMTrace.i(8049976672256L, 59977);
    if (qbf.contains(Long.valueOf(paramLong)))
    {
      GMTrace.o(8049976672256L, 59977);
      return false;
    }
    qbf.add(Long.valueOf(paramLong));
    GMTrace.o(8049976672256L, 59977);
    return true;
  }
  
  private static boolean du(long paramLong)
  {
    GMTrace.i(8050110889984L, 59978);
    qbf.remove(Long.valueOf(paramLong));
    GMTrace.o(8050110889984L, 59978);
    return true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(8050379325440L, 59980);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(8050379325440L, 59980);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(8050647760896L, 59982);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      du(this.pYd);
      GMTrace.o(8050647760896L, 59982);
      return;
    }
    paramp = ((bdm)this.gMC.hlV.hmc).uvA;
    if (paramp != null) {
      w.i("MicroMsg.NetSceneSnsObjectDetial", "snsdetail xml " + n.b(paramp.uve));
    }
    ai.d(paramp);
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    du(this.pYd);
    GMTrace.o(8050647760896L, 59982);
  }
  
  public final int getType()
  {
    GMTrace.i(8050513543168L, 59981);
    GMTrace.o(8050513543168L, 59981);
    return 210;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */