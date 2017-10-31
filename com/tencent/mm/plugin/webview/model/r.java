package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.aph;
import com.tencent.mm.protocal.c.api;

public final class r
  extends k
  implements j
{
  public final b gMC;
  private com.tencent.mm.ac.e gPR;
  public String skZ;
  
  public r(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(18181133434880L, 135460);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new aph();
    ((b.a)localObject).hlY = new api();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/oauth_authorize";
    ((b.a)localObject).hlW = 1254;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.skZ = paramString1;
    this.gMC = ((b.a)localObject).DA();
    localObject = (aph)this.gMC.hlU.hmc;
    ((aph)localObject).ulC = paramString1;
    ((aph)localObject).ulF = paramString2;
    ((aph)localObject).scene = paramInt;
    GMTrace.o(18181133434880L, 135460);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(18181536088064L, 135463);
    this.gPR = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(18181536088064L, 135463);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(18181267652608L, 135461);
    this.gPR.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(18181267652608L, 135461);
  }
  
  public final int getType()
  {
    GMTrace.i(18181401870336L, 135462);
    GMTrace.o(18181401870336L, 135462);
    return 1254;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/model/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */