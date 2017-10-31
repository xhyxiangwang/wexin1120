package com.tencent.mm.plugin.offline.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wallet_core.model.h;
import com.tencent.mm.protocal.c.apk;
import com.tencent.mm.protocal.c.apl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.k;
import org.json.JSONObject;

public final class e
  extends k
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  public int kKx;
  private String kKy;
  public RealnameGuideHelper onA;
  private String onB;
  private String onC;
  private String onD;
  private String onE;
  private String onF;
  public String onw;
  public int onx;
  public String ony;
  public int onz;
  
  public e(int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(6193611276288L, 46146);
    this.onw = "";
    this.kKx = -1;
    this.kKy = "";
    this.onx = -1;
    this.ony = "";
    this.onz = 1;
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new apk();
    ((b.a)localObject).hlY = new apl();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/offlinepayconfirm";
    ((b.a)localObject).hlW = 609;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (apk)this.gMC.hlU.hmc;
    ((apk)localObject).ulM = paramInt;
    ((apk)localObject).nas = paramString1;
    ((apk)localObject).rQC = paramString2;
    ((apk)localObject).tEh = h.bww();
    this.onz = paramInt;
    GMTrace.o(6193611276288L, 46146);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(6193879711744L, 46148);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(6193879711744L, 46148);
    return i;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, p paramp)
  {
    GMTrace.i(6194013929472L, 46149);
    if (paramInt1 != 0) {
      w.e("MicroMsg.NetSceneOfflinePayConfirm", "Cmd : 609" + ", errType = " + paramInt1 + ", errCode = " + paramInt2 + ", errMsg = " + paramString);
    }
    Object localObject = (apl)((b)paramp).hlV.hmc;
    i = paramInt1;
    j = paramInt2;
    paramp = paramString;
    if (paramInt1 == 0)
    {
      i = paramInt1;
      j = paramInt2;
      paramp = paramString;
      if (paramInt2 == 0)
      {
        i = paramInt1;
        j = paramInt2;
        paramp = paramString;
      }
    }
    try
    {
      if (((apl)localObject).tXf != null)
      {
        localObject = new JSONObject(((apl)localObject).tXf);
        this.onw = ((JSONObject)localObject).optString("transaction_id");
        this.kKx = ((JSONObject)localObject).optInt("retcode");
        this.kKy = ((JSONObject)localObject).optString("retmsg");
        this.onx = ((JSONObject)localObject).optInt("wx_error_type");
        this.ony = ((JSONObject)localObject).optString("wx_error_msg");
        w.d("MicroMsg.NetSceneOfflinePayConfirm", "onGYNetEnd %s", new Object[] { ((JSONObject)localObject).toString() });
        i = paramInt1;
        j = paramInt2;
        paramp = paramString;
        if (((JSONObject)localObject).has("real_name_info"))
        {
          paramp = ((JSONObject)localObject).optJSONObject("real_name_info");
          this.onB = paramp.optString("guide_flag");
          this.onC = paramp.optString("guide_wording");
          this.onD = paramp.optString("left_button_wording");
          this.onE = paramp.optString("right_button_wording");
          this.onF = paramp.optString("upload_credit_url");
          if (!"1".equals(this.onB))
          {
            i = paramInt1;
            j = paramInt2;
            paramp = paramString;
            if (!"2".equals(this.onB)) {}
          }
          else
          {
            this.onA = new RealnameGuideHelper();
            this.onA.a(this.onB, this.onC, this.onD, this.onE, this.onF, 0);
            paramp = paramString;
            j = paramInt2;
            i = paramInt1;
          }
        }
      }
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.NetSceneOfflinePayConfirm", paramString, "", new Object[0]);
        i = 1000;
        j = 2;
        paramp = ab.getContext().getString(R.l.eUe);
      }
    }
    if (this.gMF != null) {
      this.gMF.a(i, j, paramp, this);
    }
    GMTrace.o(6194013929472L, 46149);
  }
  
  public final int getType()
  {
    GMTrace.i(6193745494016L, 46147);
    GMTrace.o(6193745494016L, 46147);
    return 609;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/offline/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */