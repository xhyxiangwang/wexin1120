package com.tencent.mm.plugin.card.model;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.card.b.t;
import com.tencent.mm.protocal.c.ji;
import com.tencent.mm.protocal.c.jj;
import com.tencent.mm.protocal.c.jk;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;

public final class v
  extends k
  implements j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  public String kpy;
  public ArrayList<ji> kpz;
  
  public v(String paramString1, float paramFloat1, float paramFloat2, String paramString2)
  {
    GMTrace.i(4905657958400L, 36550);
    this.kpy = paramString1;
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new jj();
    ((b.a)localObject).hlY = new jk();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/cardshoplbs";
    ((b.a)localObject).hlW = 563;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (jj)this.gMC.hlU.hmc;
    ((jj)localObject).knp = paramString1;
    ((jj)localObject).fGL = paramFloat1;
    ((jj)localObject).fFh = paramFloat2;
    ((jj)localObject).fMv = paramString2;
    w.d("MicroMsg.NetSceneCardShopLBS", "<init>, cardId = %s, longtitude = %f, latitude = %f, card_id = %s", new Object[] { paramString1, Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), paramString2 });
    GMTrace.o(4905657958400L, 36550);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(4905926393856L, 36552);
    if (bg.mZ(((jj)this.gMC.hlU.hmc).knp))
    {
      w.e("MicroMsg.NetSceneCardShopLBS", "doScene fail, cardId is null");
      GMTrace.o(4905926393856L, 36552);
      return -1;
    }
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(4905926393856L, 36552);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(4906060611584L, 36553);
    w.i("MicroMsg.NetSceneCardShopLBS", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramp = ((jk)this.gMC.hlV.hmc).kpq;
      if (TextUtils.isEmpty(paramp)) {
        w.e("MicroMsg.NetSceneCardShopLBS", "onGYNetEnd fail, json_ret is empty");
      }
      this.kpz = t.ux(paramp);
      if (this.kpz != null) {
        w.d("MicroMsg.NetSceneCardShopLBS", "onGYNetEnd, respList size = %d", new Object[] { Integer.valueOf(this.kpz.size()) });
      }
    }
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4906060611584L, 36553);
  }
  
  public final int getType()
  {
    GMTrace.i(4905792176128L, 36551);
    GMTrace.o(4905792176128L, 36551);
    return 563;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/model/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */