package com.tencent.mm.plugin.wallet_core.id_verify.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.i;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.protocal.c.bgy;
import com.tencent.mm.protocal.c.bgz;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.g;
import com.tencent.mm.wallet_core.c.l;
import com.tenpay.android.wechat.TenpayUtil;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d
  extends g
{
  public String token;
  
  public d(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(6842017120256L, 50977);
    HashMap localHashMap = new HashMap();
    localHashMap.put("flag", "1");
    localHashMap.put("true_name", paramString1);
    localHashMap.put("identify_card", paramString2);
    localHashMap.put("cre_type", "1");
    localHashMap.put("realname_scene", String.valueOf(paramInt));
    w.i("MicroMsg.NetSceneRealNameVerify", "realname_scene=%d", new Object[] { Integer.valueOf(paramInt) });
    x(localHashMap);
    GMTrace.o(6842017120256L, 50977);
  }
  
  public final String Jj(String paramString)
  {
    GMTrace.i(6842553991168L, 50981);
    paramString = TenpayUtil.signWith3Des(paramString);
    GMTrace.o(6842553991168L, 50981);
    return paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(6843225079808L, 50986);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(6843225079808L, 50986);
    return i;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(6842285555712L, 50979);
    if (paramInt == 0) {
      this.token = paramJSONObject.optString("token");
    }
    GMTrace.o(6842285555712L, 50979);
  }
  
  public final void a(b paramb, axs paramaxs)
  {
    GMTrace.i(6842688208896L, 50982);
    ((bgy)paramb.hlU.hmc).ubH = paramaxs;
    GMTrace.o(6842688208896L, 50982);
  }
  
  public final void b(b paramb, axs paramaxs)
  {
    GMTrace.i(6842822426624L, 50983);
    ((bgy)paramb.hlU.hmc).unH = paramaxs;
    GMTrace.o(6842822426624L, 50983);
  }
  
  public final int bvT()
  {
    GMTrace.i(6842151337984L, 50978);
    GMTrace.o(6842151337984L, 50978);
    return 0;
  }
  
  public final l c(b paramb)
  {
    GMTrace.i(6842956644352L, 50984);
    paramb = (bgz)paramb.hlV.hmc;
    l locall = new l();
    locall.ubL = paramb.ubL;
    locall.ubK = paramb.ubK;
    locall.ubJ = paramb.ubJ;
    locall.ubI = paramb.ubI;
    locall.lpl = paramb.unJ;
    locall.xgg = paramb.unI;
    GMTrace.o(6842956644352L, 50984);
    return locall;
  }
  
  public final int getType()
  {
    GMTrace.i(6843090862080L, 50985);
    GMTrace.o(6843090862080L, 50985);
    return 1616;
  }
  
  public final void z(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(6842419773440L, 50980);
    Object localObject2 = this.gMC;
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = new b.a();
      ((b.a)localObject1).hlX = new bgy();
      ((b.a)localObject1).hlY = new bgz();
      ((b.a)localObject1).uri = "/cgi-bin/mmpay-bin/tenpay/realnameauthen";
      ((b.a)localObject1).hlW = 1616;
      ((b.a)localObject1).hlZ = 185;
      ((b.a)localObject1).hma = 1000000185;
      localObject1 = ((b.a)localObject1).DA();
      ((i)localObject1).hml = true;
    }
    localObject2 = (bgy)((b)localObject1).hlU.hmc;
    if (paramBoolean2) {
      ((bgy)localObject2).ubG = 1;
    }
    this.gMC = ((b)localObject1);
    GMTrace.o(6842419773440L, 50980);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/id_verify/model/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */