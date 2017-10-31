package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.kt;
import com.tencent.mm.protocal.c.ku;
import com.tencent.mm.sdk.platformtools.bg;

public final class a
  extends k
  implements j
{
  private b gMC;
  private com.tencent.mm.ac.e gMF;
  
  public a(String paramString1, String paramString2)
  {
    GMTrace.i(8219091009536L, 61237);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new kt();
    ((b.a)localObject).hlY = new ku();
    ((b.a)localObject).uri = "/cgi-bin/mmoc-bin/adplayinfo/channelpkginfo";
    ((b.a)localObject).hlW = 1210;
    this.gMC = ((b.a)localObject).DA();
    localObject = (kt)this.gMC.hlU.hmc;
    ((kt)localObject).tHa = paramString2;
    ((kt)localObject).tGX = paramString1;
    ((kt)localObject).tHb = bg.bOi();
    GMTrace.o(8219091009536L, 61237);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(8219493662720L, 61240);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(8219493662720L, 61240);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(8219225227264L, 61238);
    if (this.gMF != null) {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(8219225227264L, 61238);
  }
  
  public final int getType()
  {
    GMTrace.i(8219359444992L, 61239);
    int i = this.gMC.hlW;
    GMTrace.o(8219359444992L, 61239);
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */