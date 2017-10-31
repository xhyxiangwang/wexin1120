package com.tencent.mm.plugin.sns.a.b;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.bb;
import com.tencent.mm.protocal.c.bc;
import com.tencent.mm.protocal.c.bd;
import com.tencent.mm.protocal.c.be;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends k
  implements j
{
  private b gMC;
  public com.tencent.mm.ac.e gMF;
  
  public d(String paramString1, int paramInt1, int paramInt2, int paramInt3, bb parambb, be parambe, int paramInt4, String paramString2, int paramInt5, int paramInt6)
  {
    GMTrace.i(20053336522752L, 149409);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new bc();
    ((b.a)localObject).hlY = new bd();
    if (paramInt6 != 2) {
      ((b.a)localObject).uri = "/cgi-bin/mmoc-bin/ad/exposure";
    }
    for (((b.a)localObject).hlW = 1231;; ((b.a)localObject).hlW = 1875)
    {
      ((b.a)localObject).hlZ = 0;
      ((b.a)localObject).hma = 0;
      this.gMC = ((b.a)localObject).DA();
      w.i("MicroMsg.NetSceneAdExposure", "uri %s", new Object[] { this.gMC.uri });
      localObject = (bc)this.gMC.hlU.hmc;
      ((bc)localObject).tuK = paramInt3;
      ((bc)localObject).type = paramInt2;
      ((bc)localObject).scene = paramInt1;
      ((bc)localObject).hNw = paramString1;
      ((bc)localObject).tuN = paramInt5;
      if (parambb != null)
      {
        ((bc)localObject).tuL = parambb;
        w.i("MicroMsg.NetSceneAdExposure", "exposure_info " + parambb.tuI);
      }
      if (parambe != null)
      {
        ((bc)localObject).tuM = parambe;
        w.i("MicroMsg.NetSceneAdExposure", "social_info " + parambe.tuO + " " + parambe.bTH);
      }
      parambb = (WifiManager)ab.getContext().getSystemService("wifi");
      if (parambb != null)
      {
        parambb = parambb.getConnectionInfo();
        if (parambb != null)
        {
          ((bc)localObject).bssid = bg.ap(parambb.getBSSID(), "");
          ((bc)localObject).ssid = bg.ap(parambb.getSSID(), "");
        }
      }
      ((bc)localObject).tux = System.currentTimeMillis();
      ((bc)localObject).tuz = paramInt4;
      if (paramString2 != null) {
        ((bc)localObject).tuw = paramString2;
      }
      w.i("MicroMsg.NetSceneAdExposure", "##time viewid " + paramString1 + " sceneType " + paramInt1 + " type: " + paramInt2 + " duration " + paramInt3 + " ad_type " + paramInt4 + " exposureCount " + paramInt5 + " descXml:" + paramString2);
      GMTrace.o(20053336522752L, 149409);
      return;
      ((b.a)localObject).uri = "/cgi-bin/mmux-bin/adexposure";
    }
  }
  
  public d(String paramString, int paramInt1, be parambe, int paramInt2, int paramInt3, int paramInt4)
  {
    this(paramString, paramInt1, 1, 0, null, parambe, paramInt2, "", paramInt3, paramInt4);
    GMTrace.i(20053202305024L, 149408);
    GMTrace.o(20053202305024L, 149408);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(8167014531072L, 60849);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(8167014531072L, 60849);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(8167282966528L, 60851);
    w.i("MicroMsg.NetSceneAdExposure", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramp = (bd)this.gMC.hlV.hmc;
    w.i("MicroMsg.NetSceneAdExposure", "resp " + paramp.ret + " msg: " + paramp.fvk);
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(8167282966528L, 60851);
  }
  
  public final int getType()
  {
    GMTrace.i(8167148748800L, 60850);
    GMTrace.o(8167148748800L, 60850);
    return 1231;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/a/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */