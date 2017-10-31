package com.tencent.mm.plugin.wallet_core.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.wallet_core.model.h;
import com.tencent.mm.protocal.c.lv;
import com.tencent.mm.protocal.c.lw;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.k;
import com.tencent.mm.wallet_core.c.n;

public final class a
  extends k
{
  private b gMC;
  private com.tencent.mm.ac.e gMF;
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    this(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, 1);
    GMTrace.i(7032337858560L, 52395);
    GMTrace.o(7032337858560L, 52395);
  }
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, int paramInt)
  {
    GMTrace.i(7032203640832L, 52394);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new lv();
    ((b.a)localObject).hlY = new lw();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/checkpayjsapi";
    ((b.a)localObject).hlW = 580;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (lv)this.gMC.hlU.hmc;
    ((lv)localObject).mDD = paramString1;
    ((lv)localObject).tzN = paramString2;
    ((lv)localObject).tIo = paramString3;
    ((lv)localObject).tIp = paramString4;
    ((lv)localObject).tIr = paramString5;
    ((lv)localObject).tIq = paramString6;
    ((lv)localObject).tHE = paramString7;
    ((lv)localObject).tIs = paramInt;
    ((lv)localObject).tEh = h.bww();
    if (n.ciK()) {
      ((lv)localObject).tIt = n.ciM();
    }
    GMTrace.o(7032203640832L, 52394);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(7032606294016L, 52397);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(7032606294016L, 52397);
    return i;
  }
  
  public final String aUD()
  {
    GMTrace.i(7032874729472L, 52399);
    String str = ((lw)this.gMC.hlV.hmc).token;
    GMTrace.o(7032874729472L, 52399);
    return str;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, p paramp)
  {
    GMTrace.i(7032740511744L, 52398);
    w.d("MicroMsg.NetSceneCheckPayJsapi", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    String str = paramString;
    if (paramInt1 == 0)
    {
      str = paramString;
      if (paramInt2 == 0)
      {
        paramString = (lw)((b)paramp).hlV.hmc;
        w.i("MicroMsg.NetSceneCheckPayJsapi", "NetSceneCheckPayJsapi resp.ErrCode is " + paramString.lpk + " resp.ErrMsg is " + paramString.lpl);
        str = paramString.lpl;
      }
    }
    this.gMF.a(paramInt1, paramInt2, str, this);
    GMTrace.o(7032740511744L, 52398);
  }
  
  public final int getType()
  {
    GMTrace.i(7032472076288L, 52396);
    GMTrace.o(7032472076288L, 52396);
    return 580;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */