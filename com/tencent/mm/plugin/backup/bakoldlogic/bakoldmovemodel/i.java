package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel;

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

public final class i
  extends k
  implements j
{
  public com.tencent.mm.ac.b gMC;
  protected com.tencent.mm.ac.e gMF;
  
  public i(LinkedList<nh> paramLinkedList, String paramString)
  {
    GMTrace.i(14751333613568L, 109906);
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
    GMTrace.o(14751333613568L, 109906);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(14751467831296L, 109907);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(14751467831296L, 109907);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(14751602049024L, 109908);
    w.i("MicroMsg.NetSceneBakChatCreateQRCode", "err: %d, %d, %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(14751602049024L, 109908);
      return;
    }
    paramp = (eg)this.gMC.hlV.hmc;
    w.i("MicroMsg.NetSceneBakChatCreateQRCode", "onGYNetEnd QRCodeUrl:%s", new Object[] { paramp.tyk });
    a.aft().jKZ = "";
    a.aft().jLa = paramp.tym;
    a.aft().jLb = paramp.tyn;
    com.tencent.mm.plugin.backup.a.e.P(paramp.txQ.ush.toK);
    a.aft().jTw = paramp.tyh;
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(14751602049024L, 109908);
  }
  
  public final int getType()
  {
    GMTrace.i(14751736266752L, 109909);
    GMTrace.o(14751736266752L, 109909);
    return 704;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */