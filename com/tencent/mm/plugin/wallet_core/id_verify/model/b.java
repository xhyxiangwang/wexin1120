package com.tencent.mm.plugin.wallet_core.id_verify.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.wallet_core.model.h;
import com.tencent.mm.protocal.c.aby;
import com.tencent.mm.protocal.c.abz;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  extends k
  implements j
{
  private com.tencent.mm.ac.b gMC;
  private com.tencent.mm.ac.e gMF;
  private long rLT;
  
  public b()
  {
    GMTrace.i(6844030386176L, 50992);
    this.rLT = 10L;
    w.i("MicroMsg.NetSceneGetRealnameWording", "NetSceneGetRealnameWording call");
    b.a locala = new b.a();
    aby localaby = new aby();
    localaby.tEh = h.bww();
    locala.hlX = localaby;
    locala.hlY = new abz();
    locala.uri = "/cgi-bin/mmpay-bin/getrealnamewording";
    locala.hlW = 1666;
    this.gMC = locala.DA();
    this.gMC.hml = true;
    GMTrace.o(6844030386176L, 50992);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(6844298821632L, 50994);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(6844298821632L, 50994);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(6844433039360L, 50995);
    w.i("MicroMsg.NetSceneGetRealnameWording", "onGYNetEnd,errType=" + paramInt2 + "errCode=" + paramInt3);
    Object localObject;
    long l;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      localObject = (abz)((com.tencent.mm.ac.b)paramp).hlV.hmc;
      if (((abz)localObject).tYd <= 0L) {
        l = this.rLT;
      }
    }
    for (;;)
    {
      paramp = new JSONObject();
      try
      {
        paramp.put("bindcardTitle", ((abz)localObject).tXW);
        paramp.put("bindcardSubTitle", ((abz)localObject).tXX);
        paramp.put("bindIdTitle", ((abz)localObject).tXY);
        paramp.put("bindIdSubTitle", ((abz)localObject).tXZ);
        paramp.put("extral_wording", ((abz)localObject).tYa);
        paramp.put("question_answer_switch", ((abz)localObject).tYb);
        paramp.put("question_answer_url", ((abz)localObject).tYc);
        paramp.put("cache_time", l);
        paramp.put("timestamp", Long.valueOf(System.currentTimeMillis() / 1000L));
        paramp.put("isShowBindCard", ((abz)localObject).tYe);
        paramp.put("isShowBindCardVerify", ((abz)localObject).tYg);
        paramp.put("isShowBindId", ((abz)localObject).tYf);
        paramp.put("bindCardVerifyTitle", ((abz)localObject).tYh);
        paramp.put("bindCardVerifySubtitle", ((abz)localObject).tYi);
        paramp.put("bindCardVerifyAlertViewRightBtnTxt", ((abz)localObject).tYj);
        paramp.put("bindCardVerifyAlertViewContent", ((abz)localObject).tYk);
        paramp.put("isShowBindCardVerifyAlertView", ((abz)localObject).tYl);
        if ((((abz)localObject).tYm != null) && (((abz)localObject).tYm.size() > 0))
        {
          paramArrayOfByte = new StringBuffer();
          paramInt1 = 0;
          localObject = ((abz)localObject).tYm.iterator();
          for (;;)
          {
            if (((Iterator)localObject).hasNext())
            {
              String str = (String)((Iterator)localObject).next();
              if (paramInt1 != 0) {
                paramArrayOfByte.append("\n");
              }
              paramArrayOfByte.append(str);
              paramInt1 = 1;
              continue;
              l = ((abz)localObject).tYd;
              break;
            }
          }
          paramp.put("cache_header_titles", paramArrayOfByte.toString());
        }
        ap.AS();
        c.xi().a(w.a.uYs, paramp.toString());
        ap.AS();
        c.xi().kz(true);
      }
      catch (JSONException paramp)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.NetSceneGetRealnameWording", paramp, "", new Object[0]);
        }
      }
    }
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(6844433039360L, 50995);
  }
  
  public final int getType()
  {
    GMTrace.i(15394639183872L, 114699);
    GMTrace.o(15394639183872L, 114699);
    return 1666;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/id_verify/model/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */