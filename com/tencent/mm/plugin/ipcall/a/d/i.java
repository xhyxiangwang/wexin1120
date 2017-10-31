package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.ipcall.b.c;
import com.tencent.mm.protocal.c.atj;
import com.tencent.mm.protocal.c.atk;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.m;

public final class i
  extends k
  implements j
{
  private b gMC;
  private com.tencent.mm.ac.e gMF;
  public atj mZo;
  public atk mZp;
  
  public i(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(11585137410048L, 86316);
    this.gMC = null;
    this.mZo = null;
    this.mZp = null;
    this.gMF = null;
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new atj();
    ((b.a)localObject).hlY = new atk();
    ((b.a)localObject).hlW = 991;
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/pstninvite";
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    long l = System.currentTimeMillis();
    int i = c.aIC();
    localObject = (atj)this.gMC.hlU.hmc;
    ((atj)localObject).mGB = m.zF();
    ((atj)localObject).uoL = paramString2;
    ((atj)localObject).mGA = paramString1;
    ((atj)localObject).uoK = paramInt1;
    ((atj)localObject).tIM = i;
    ((atj)localObject).uoT = 1;
    ((atj)localObject).uoJ = l;
    ((atj)localObject).uoS = paramInt2;
    ((atj)localObject).uoU = paramInt3;
    this.mZo = ((atj)localObject);
    w.i("MicroMsg.NetSceneIPCallInvite", "toUsername: %s, phoneNumber: %s, invitedId: %s, netType: %d, dialScene: %d, countryType: %d", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(i), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    GMTrace.o(11585137410048L, 86316);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(11585405845504L, 86318);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(11585405845504L, 86318);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(11585540063232L, 86319);
    w.i("MicroMsg.NetSceneIPCallInvite", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mZp = ((atk)((b)paramp).hlV.hmc);
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      if (this.gMF != null) {
        this.gMF.a(paramInt2, paramInt3, paramString, this);
      }
      GMTrace.o(11585540063232L, 86319);
      return;
    }
    if (this.gMF != null) {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(11585540063232L, 86319);
  }
  
  public final int getType()
  {
    GMTrace.i(11585271627776L, 86317);
    GMTrace.o(11585271627776L, 86317);
    return 991;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/d/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */