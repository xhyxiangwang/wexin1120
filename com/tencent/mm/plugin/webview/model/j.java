package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.abw;
import com.tencent.mm.protocal.c.abx;
import com.tencent.mm.sdk.platformtools.w;

public final class j
  extends k
  implements com.tencent.mm.network.j
{
  public final b gMC;
  private com.tencent.mm.ac.e gPR;
  
  public j(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    GMTrace.i(11999601754112L, 89404);
    w.d("MicroMsg.NetSceneGetReadingModeInfoProxy", "NetSceneSetOAuthScope doScene url[%s], userAgent[%s], width[%d], height[%d]", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new abw();
    ((b.a)localObject).hlY = new abx();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getreadingmodeinfo";
    ((b.a)localObject).hlW = 673;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (abw)this.gMC.hlU.hmc;
    ((abw)localObject).URL = paramString1;
    ((abw)localObject).tXV = paramString2;
    ((abw)localObject).Width = paramInt1;
    ((abw)localObject).Height = paramInt2;
    GMTrace.o(11999601754112L, 89404);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(12000004407296L, 89407);
    w.i("MicroMsg.NetSceneGetReadingModeInfoProxy", "doScene");
    this.gPR = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(12000004407296L, 89407);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(11999735971840L, 89405);
    w.i("MicroMsg.NetSceneGetReadingModeInfoProxy", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.gPR.a(paramInt2, paramInt3, paramString, this);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneGetReadingModeInfoProxy", "errType = " + paramInt2 + ", errCode = " + paramInt3);
      GMTrace.o(11999735971840L, 89405);
      return;
    }
    GMTrace.o(11999735971840L, 89405);
  }
  
  public final int getType()
  {
    GMTrace.i(11999870189568L, 89406);
    GMTrace.o(11999870189568L, 89406);
    return 673;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/model/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */