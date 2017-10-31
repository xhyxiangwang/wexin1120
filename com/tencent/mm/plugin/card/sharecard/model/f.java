package com.tencent.mm.plugin.card.sharecard.model;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.amg;
import com.tencent.mm.protocal.c.amh;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
  extends k
  implements j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  public String knc;
  public int knd;
  public String kne;
  public int knf;
  public String kng;
  public String kqJ;
  
  public f(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(5060947869696L, 37707);
    this.knd = 0;
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new amg();
    ((b.a)localObject).hlY = new amh();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/marksharecard";
    ((b.a)localObject).hlW = 907;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (amg)this.gMC.hlU.hmc;
    ((amg)localObject).fMv = paramString;
    ((amg)localObject).uhc = paramInt2;
    ((amg)localObject).uhb = paramInt1;
    ((amg)localObject).scene = paramInt3;
    this.kqJ = paramString;
    GMTrace.o(5060947869696L, 37707);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(5061350522880L, 37710);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(5061350522880L, 37710);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(5061082087424L, 37708);
    w.i("MicroMsg.NetSceneMarkShareCard", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(907), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramp = (amh)this.gMC.hlV.hmc;
      w.i("MicroMsg.NetSceneMarkShareCard", "json_ret:" + paramp.kpq);
      paramp = paramp.kpq;
      if (!TextUtils.isEmpty(paramp)) {
        break label135;
      }
      w.e("MicroMsg.NetSceneMarkShareCard", "parseJson json_ret is empty!");
    }
    for (;;)
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(5061082087424L, 37708);
      return;
      try
      {
        label135:
        paramp = new JSONObject(paramp);
        this.knc = paramp.optString("mark_user");
        this.knd = paramp.optInt("mark_succ", 0);
        this.kne = paramp.optString("mark_card_id");
        this.knf = paramp.optInt("expire_time", 0);
        this.kng = paramp.optString("pay_qrcode_wording");
      }
      catch (JSONException paramp)
      {
        w.printErrStackTrace("MicroMsg.NetSceneMarkShareCard", paramp, "", new Object[0]);
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(15361084751872L, 114449);
    GMTrace.o(15361084751872L, 114449);
    return 907;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/model/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */