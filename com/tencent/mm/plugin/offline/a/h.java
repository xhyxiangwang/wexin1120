package com.tencent.mm.plugin.offline.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.protocal.c.bgy;
import com.tencent.mm.protocal.c.bgz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tenpay.android.wechat.TenpayUtil;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public abstract class h
  extends k
  implements j
{
  private b gMC;
  private com.tencent.mm.ac.e gMF;
  
  public h()
  {
    GMTrace.i(6190658486272L, 46124);
    GMTrace.o(6190658486272L, 46124);
  }
  
  public int Bc()
  {
    GMTrace.i(6191732228096L, 46132);
    GMTrace.o(6191732228096L, 46132);
    return 385;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(6191329574912L, 46129);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(6191329574912L, 46129);
    return i;
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(6191463792640L, 46130);
    w.i("MicroMsg.NetSceneTenpayOfflineBase", "Cmd : " + anK() + ", errType = " + paramInt2 + ", errCode = " + paramInt3 + ", errMsg = " + paramString);
    bgz localbgz = (bgz)((b)paramp).hlV.hmc;
    int i;
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      if (localbgz.ubJ == 0)
      {
        paramp = n.b(localbgz.ubI);
        try
        {
          JSONObject localJSONObject = new JSONObject(paramp);
          paramInt1 = localJSONObject.getInt("retcode");
          paramArrayOfByte = localbgz.unJ;
          paramp = paramArrayOfByte;
          if (bg.mZ(paramArrayOfByte)) {
            paramp = localJSONObject.optString("retmsg");
          }
          i = localbgz.unI;
          if ((paramInt1 != 0) || (i != 0)) {
            break label313;
          }
          a(paramInt1, paramp, localJSONObject);
          i = paramInt3;
          paramInt1 = paramInt2;
        }
        catch (Exception paramString)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.NetSceneTenpayOfflineBase", paramString, "", new Object[0]);
            paramInt1 = 1000;
            i = 2;
            paramString = ab.getContext().getString(R.l.eUe);
          }
        }
        if (paramInt1 != 0) {
          w.e("MicroMsg.NetSceneTenpayOfflineBase", "Cmd : " + anK() + ", errType = " + paramInt1 + ", errCode = " + i + ", errMsg = " + paramString);
        }
        this.gMF.a(paramInt1, i, paramString, this);
        w.d("MicroMsg.NetSceneTenpayOfflineBase", "Cmd : " + anK() + ", errType = " + paramInt1 + ", errCode = " + i + ", errMsg = " + paramString);
        GMTrace.o(6191463792640L, 46130);
        return;
        label313:
        w.i("MicroMsg.NetSceneTenpayOfflineBase", "ErrCode tenpayErrType : " + i);
        paramInt1 = 1000;
        if (i != 0) {
          break label479;
        }
        i = 64536;
      }
    }
    label479:
    for (;;)
    {
      w.d("MicroMsg.NetSceneTenpayOfflineBase", "ErrCode errMsg : " + paramp);
      paramString = paramp;
      break;
      paramInt1 = 1000;
      i = 2;
      paramString = localbgz.ubK;
      break;
      paramp = bh.p(paramString, "e");
      paramInt1 = paramInt2;
      i = paramInt3;
      if (paramp == null) {
        break;
      }
      w.d("MicroMsg.NetSceneTenpayOfflineBase", "CDN error!");
      paramString = (String)paramp.get(".e.Content");
      paramInt1 = paramInt2;
      i = paramInt3;
      break;
    }
  }
  
  public abstract void a(int paramInt, String paramString, JSONObject paramJSONObject);
  
  public abstract int anK();
  
  public final int getType()
  {
    GMTrace.i(6191195357184L, 46128);
    GMTrace.o(6191195357184L, 46128);
    return 385;
  }
  
  public String getUri()
  {
    GMTrace.i(6191598010368L, 46131);
    GMTrace.o(6191598010368L, 46131);
    return "/cgi-bin/micromsg-bin/tenpay";
  }
  
  public final void x(Map<String, String> paramMap)
  {
    int m = 0;
    GMTrace.i(6191061139456L, 46127);
    if (this.gMC == null)
    {
      localObject1 = new b.a();
      ((b.a)localObject1).hlX = new bgy();
      ((b.a)localObject1).hlY = new bgz();
      localObject2 = getUri();
      i = Bc();
      ((b.a)localObject1).uri = ((String)localObject2);
      ((b.a)localObject1).hlW = i;
      ((b.a)localObject1).hlZ = 185;
      ((b.a)localObject1).hma = 1000000185;
      this.gMC = ((b.a)localObject1).DA();
    }
    Object localObject1 = (bgy)this.gMC.hlU.hmc;
    ((bgy)localObject1).ubF = anK();
    ((bgy)localObject1).ubG = 1;
    Object localObject2 = paramMap.keySet().toArray();
    Arrays.sort((Object[])localObject2);
    Object localObject3 = new StringBuilder();
    int i = 0;
    String str1;
    int k;
    for (int j = 0; i < localObject2.length; j = k)
    {
      localObject4 = localObject2[i];
      str1 = (String)paramMap.get(localObject4);
      k = j;
      if (!bg.mZ(str1))
      {
        if (j != 0) {
          ((StringBuilder)localObject3).append("&");
        }
        ((StringBuilder)localObject3).append(localObject4);
        ((StringBuilder)localObject3).append("=");
        ((StringBuilder)localObject3).append(str1);
        k = 1;
      }
      i += 1;
    }
    localObject3 = TenpayUtil.signWith3Des(((StringBuilder)localObject3).toString());
    Object localObject4 = new StringBuilder();
    i = 0;
    j = m;
    if (j < localObject2.length)
    {
      str1 = localObject2[j];
      String str2 = (String)paramMap.get(str1);
      if (bg.mZ(str2)) {
        break label440;
      }
      if (i != 0) {
        ((StringBuilder)localObject4).append("&");
      }
      ((StringBuilder)localObject4).append(str1);
      ((StringBuilder)localObject4).append("=");
      ((StringBuilder)localObject4).append(com.tencent.mm.compatible.util.p.encode(str2));
      i = 1;
    }
    label440:
    for (;;)
    {
      j += 1;
      break;
      if (i != 0) {}
      for (paramMap = "&";; paramMap = "")
      {
        ((StringBuilder)localObject4).append(paramMap);
        ((StringBuilder)localObject4).append("WCPaySign");
        ((StringBuilder)localObject4).append("=");
        ((StringBuilder)localObject4).append((String)localObject3);
        paramMap = ((StringBuilder)localObject4).toString().getBytes();
        ((bgy)localObject1).ubH = new axs().bd(paramMap);
        GMTrace.o(6191061139456L, 46127);
        return;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/offline/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */