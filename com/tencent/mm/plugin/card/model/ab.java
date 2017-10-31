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
import com.tencent.mm.protocal.c.jg;
import com.tencent.mm.protocal.c.xi;
import com.tencent.mm.protocal.c.xj;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

public final class ab
  extends k
  implements j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  public int kpC;
  public String kpD;
  public int kpE;
  public String kpF;
  public String kpq;
  
  public ab(LinkedList<jg> paramLinkedList, int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2)
  {
    GMTrace.i(4909416054784L, 36578);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new xi();
    ((b.a)localObject).hlY = new xj();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getcardlistfromapp";
    ((b.a)localObject).hlW = 690;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (xi)this.gMC.hlU.hmc;
    ((xi)localObject).tte = paramLinkedList;
    ((xi)localObject).fMx = paramInt1;
    ((xi)localObject).tvL = paramString1;
    ((xi)localObject).sign = paramString2;
    ((xi)localObject).tta = paramString3;
    ((xi)localObject).tsZ = paramString4;
    ((xi)localObject).tUq = paramString5;
    ((xi)localObject).ttb = paramInt2;
    GMTrace.o(4909416054784L, 36578);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(4909684490240L, 36580);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(4909684490240L, 36580);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(4909818707968L, 36581);
    w.i("MicroMsg.NetSceneGetCardListFromApp", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3 + " netType = 690");
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.kpq = ((xj)this.gMC.hlV.hmc).kpq;
      if (!TextUtils.isEmpty(this.kpq)) {
        break label111;
      }
      w.e("MicroMsg.NetSceneGetCardListFromApp", "parseRespData json_ret is empty!");
    }
    for (;;)
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4909818707968L, 36581);
      return;
      try
      {
        label111:
        paramp = new JSONObject(this.kpq);
        this.kpC = paramp.optInt("accept_button_status", 0);
        this.kpD = paramp.optString("accept_button_wording");
        this.kpE = paramp.optInt("private_status", 0);
        this.kpF = paramp.optString("private_wording");
      }
      catch (JSONException paramp)
      {
        w.printErrStackTrace("MicroMsg.NetSceneGetCardListFromApp", paramp, "", new Object[0]);
        w.e("MicroMsg.NetSceneGetCardListFromApp", "parseRespData:" + paramp.getMessage());
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(4909550272512L, 36579);
    GMTrace.o(4909550272512L, 36579);
    return 690;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/model/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */