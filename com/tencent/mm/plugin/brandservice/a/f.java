package com.tencent.mm.plugin.brandservice.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.brandservice.a;
import com.tencent.mm.protocal.c.ag;
import com.tencent.mm.protocal.c.ux;
import com.tencent.mm.protocal.c.uy;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.Iterator;
import java.util.LinkedList;

public final class f
  extends k
  implements j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  LinkedList<String> kiV;
  
  public f()
  {
    GMTrace.i(10844658204672L, 80799);
    Object localObject1 = new b.a();
    ((b.a)localObject1).hlX = new ux();
    ((b.a)localObject1).hlY = new uy();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/getapplist";
    ((b.a)localObject1).hlW = 387;
    ((b.a)localObject1).hlZ = 0;
    ((b.a)localObject1).hma = 0;
    this.gMC = ((b.a)localObject1).DA();
    this.kiV = new LinkedList();
    ux localux = (ux)this.gMC.hlU.hmc;
    ap.AS();
    Object localObject2 = c.xi().get(196610, null);
    if (localObject2 == null) {}
    for (localObject1 = "null";; localObject1 = localObject2.toString())
    {
      w.i("MicroMsg.BrandService.BrandServiceApplication", "get config, key[%d], value[%s]", new Object[] { Integer.valueOf(196610), localObject1 });
      localux.tTq = bg.a((Integer)localObject2, 0);
      w.i("MicroMsg.BrandService.NetSceneGetAppList", "info: request hash code %d", new Object[] { Integer.valueOf(localux.tTq) });
      GMTrace.o(10844658204672L, 80799);
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(10845060857856L, 80802);
    this.gMF = parame1;
    w.i("MicroMsg.BrandService.NetSceneGetAppList", "do scene");
    int i = a(parame, this.gMC, this);
    GMTrace.o(10845060857856L, 80802);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(10844792422400L, 80800);
    w.w("MicroMsg.BrandService.NetSceneGetAppList", "on scene end code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramp = (uy)this.gMC.hlV.hmc;
      w.i("MicroMsg.BrandService.NetSceneGetAppList", "ok, hash code is %d, count is %d", new Object[] { Integer.valueOf(paramp.tTq), Integer.valueOf(paramp.jWQ) });
      w.i("MicroMsg.BrandService.NetSceneGetAppList", "result list is %s", new Object[] { paramp.jWR.toString() });
      a.d(196610, Integer.valueOf(paramp.tTq));
      paramp = paramp.jWR.iterator();
      while (paramp.hasNext())
      {
        paramArrayOfByte = (ag)paramp.next();
        this.kiV.add(paramArrayOfByte.jWW);
      }
    }
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(10844792422400L, 80800);
  }
  
  public final int getType()
  {
    GMTrace.i(10844926640128L, 80801);
    GMTrace.o(10844926640128L, 80801);
    return 387;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/brandservice/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */