package com.tencent.mm.wallet_core.b.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.network.p;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.age;
import com.tencent.mm.protocal.c.agf;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.k;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public abstract class a
  extends k
{
  private b gMC;
  private com.tencent.mm.ac.e gMF;
  
  public a()
  {
    GMTrace.i(16863249563648L, 125641);
    GMTrace.o(16863249563648L, 125641);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(16863920652288L, 125646);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(16863920652288L, 125646);
    return i;
  }
  
  public abstract void a(int paramInt, String paramString, JSONObject paramJSONObject);
  
  public abstract String anH();
  
  public abstract int anI();
  
  public boolean anJ()
  {
    GMTrace.i(16864054870016L, 125647);
    GMTrace.o(16864054870016L, 125647);
    return false;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, p paramp)
  {
    GMTrace.i(16863786434560L, 125645);
    w.i("MiroMsg.NetSceneTenpayH5TransferBase", "Cmd : " + anI() + ", errType = " + paramInt1 + ", errCode = " + paramInt2 + ", errMsg = " + paramString + " " + getType());
    agf localagf = (agf)((b)paramp).hlV.hmc;
    int i;
    int j;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      i = localagf.ubJ;
      paramp = n.b(localagf.ubI);
      if ((i == 0) && (!bg.mZ(paramp))) {
        j = localagf.fwz;
      }
    }
    for (;;)
    {
      try
      {
        localJSONObject = new JSONObject(paramp);
        i = localJSONObject.getInt("retcode");
        String str = localJSONObject.optString("retmsg");
        paramp = str;
        if (!bg.mZ(str)) {
          break label401;
        }
        paramp = localagf.errorMsg;
      }
      catch (Exception paramString)
      {
        JSONObject localJSONObject;
        w.printErrStackTrace("MiroMsg.NetSceneTenpayH5TransferBase", paramString, "", new Object[0]);
        paramInt1 = 1000;
        paramInt2 = 2;
        paramString = ab.getContext().getString(R.l.eUe);
        continue;
      }
      if (anJ())
      {
        a(i, paramp, localJSONObject);
        if (paramInt1 != 0) {
          w.e("MiroMsg.NetSceneTenpayH5TransferBase", "Cmd : " + anI() + ", errType = " + paramInt1 + ", errCode = " + paramInt2 + ", errMsg = " + paramString);
        }
        this.gMF.a(paramInt1, paramInt2, paramString, this);
        GMTrace.o(16863786434560L, 125645);
        return;
      }
      i = 1000;
      if (j == 0)
      {
        paramInt1 = 64536;
        paramString = paramp;
        paramInt2 = paramInt1;
        paramInt1 = i;
        continue;
        paramInt1 = 1000;
        paramInt2 = 2;
        paramString = localagf.ubK;
        continue;
        paramString = bh.p(paramString, "e");
        if (paramString != null)
        {
          w.d("MiroMsg.NetSceneTenpayH5TransferBase", "CDN error!");
          paramString = (String)paramString.get(".e.Content");
        }
        else
        {
          paramString = ab.getContext().getString(R.l.eUe);
        }
      }
      else
      {
        paramInt1 = j;
        continue;
        label401:
        if (i == 0) {
          if (j == 0) {}
        }
      }
    }
  }
  
  public final void x(Map<String, String> paramMap)
  {
    GMTrace.i(16863652216832L, 125644);
    if (this.gMC == null)
    {
      localObject1 = new b.a();
      ((b.a)localObject1).hlX = new age();
      ((b.a)localObject1).hlY = new agf();
      ((b.a)localObject1).uri = anH();
      ((b.a)localObject1).hlW = getType();
      ((b.a)localObject1).hlZ = 0;
      ((b.a)localObject1).hma = 0;
      this.gMC = ((b.a)localObject1).DA();
      this.gMC.hml = true;
    }
    Object localObject1 = (age)this.gMC.hlU.hmc;
    ((age)localObject1).ubF = anI();
    ((age)localObject1).ubG = 1;
    Object[] arrayOfObject = paramMap.keySet().toArray();
    Arrays.sort(arrayOfObject);
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    int k;
    for (int j = 0; i < arrayOfObject.length; j = k)
    {
      Object localObject2 = arrayOfObject[i];
      String str = (String)paramMap.get(localObject2);
      k = j;
      if (!bg.mZ(str))
      {
        if (j != 0) {
          localStringBuilder.append("&");
        }
        localStringBuilder.append(localObject2);
        localStringBuilder.append("=");
        localStringBuilder.append(str);
        k = 1;
      }
      i += 1;
    }
    w.i("MiroMsg.NetSceneTenpayH5TransferBase", "Cmd : " + ((age)localObject1).ubF + ", req = " + localStringBuilder.toString());
    paramMap = localStringBuilder.toString().getBytes();
    ((age)localObject1).ubH = new axs().bd(paramMap);
    GMTrace.o(16863652216832L, 125644);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/b/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */