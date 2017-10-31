package com.tencent.mm.modelsimple;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.aiz;
import com.tencent.mm.protocal.c.aja;
import com.tencent.mm.sdk.platformtools.w;

public final class z
  extends k
  implements j
{
  private com.tencent.mm.ac.e gMF;
  private final b hEw;
  
  public z(String paramString)
  {
    GMTrace.i(1367678648320L, 10190);
    b.a locala = new b.a();
    locala.hlX = new aiz();
    locala.hlY = new aja();
    locala.uri = "/cgi-bin/micromsg-bin/jumpemotiondetail";
    locala.hlW = 666;
    locala.hlZ = 0;
    locala.hma = 0;
    this.hEw = locala.DA();
    ((aiz)this.hEw.hlU.hmc).mDo = paramString;
    GMTrace.o(1367678648320L, 10190);
  }
  
  public final aja LA()
  {
    GMTrace.i(1368215519232L, 10194);
    aja localaja = (aja)this.hEw.hlV.hmc;
    GMTrace.o(1368215519232L, 10194);
    return localaja;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(1367947083776L, 10192);
    this.gMF = parame1;
    int i = a(parame, this.hEw, this);
    GMTrace.o(1367947083776L, 10192);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(1368081301504L, 10193);
    w.d("MicroMsg.NetSceneScanEmoji", "[oneliang][NetSceneScanEmoji]:netId:%s,errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      w.d("MicroMsg.NetSceneScanEmoji", "[oneliang][NetSceneScanEmoji]:net end ok");
    }
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(1368081301504L, 10193);
  }
  
  public final int getType()
  {
    GMTrace.i(1367812866048L, 10191);
    GMTrace.o(1367812866048L, 10191);
    return 666;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/modelsimple/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */