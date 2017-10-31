package com.tencent.mm.plugin.backup.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.protocal.c.ee;
import com.tencent.mm.protocal.c.eg;
import com.tencent.mm.protocal.c.nh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.m;
import java.util.LinkedList;

public final class b
  extends k
  implements j
{
  public com.tencent.mm.ac.b gMC;
  protected com.tencent.mm.ac.e gMF;
  
  public b(LinkedList<nh> paramLinkedList, String paramString)
  {
    GMTrace.i(9574690062336L, 71337);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new ee();
    ((b.a)localObject).hlY = new eg();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/bakchatcreateqrcode";
    ((b.a)localObject).hlW = 704;
    this.gMC = ((b.a)localObject).DA();
    localObject = (ee)this.gMC.hlU.hmc;
    ((ee)localObject).tyc = paramLinkedList.size();
    ((ee)localObject).tyd = paramLinkedList;
    ((ee)localObject).tyf = m.zF();
    ((ee)localObject).tye = com.tencent.mm.compatible.d.p.getDeviceID(ab.getContext());
    ((ee)localObject).tyg = paramString;
    ((ee)localObject).jXk = 0L;
    ((ee)localObject).ttY = 2;
    GMTrace.o(9574690062336L, 71337);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(9574824280064L, 71338);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(9574824280064L, 71338);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(9574958497792L, 71339);
    w.i("MicroMsg.BackupCreateQRCodeScene", "err: %d, %d, %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(9574958497792L, 71339);
      return;
    }
    paramp = (eg)this.gMC.hlV.hmc;
    w.i("MicroMsg.BackupCreateQRCodeScene", "onGYNetEnd QRCodeUrl:%s", new Object[] { paramp.tyk });
    com.tencent.mm.plugin.backup.a.e.P(paramp.txQ.ush.toK);
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(9574958497792L, 71339);
  }
  
  public final int getType()
  {
    GMTrace.i(9575092715520L, 71340);
    GMTrace.o(9575092715520L, 71340);
    return 704;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */