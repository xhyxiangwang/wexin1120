package com.tencent.mm.ac;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.axk;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.vending.g.c.a;
import com.tencent.mm.vending.g.g;
import junit.framework.Assert;

public class a<_Resp extends axk>
{
  public b gMC;
  public b<_Resp> hlK;
  private com.tencent.mm.by.e<a<_Resp>> hlL;
  
  public a()
  {
    GMTrace.i(13392110682112L, 99779);
    this.hlK = new b(this);
    GMTrace.o(13392110682112L, 99779);
  }
  
  public final com.tencent.mm.by.e<a<_Resp>> Dy()
  {
    try
    {
      GMTrace.i(13392244899840L, 99780);
      Assert.assertNotNull("You should set a CommReqResp!", this.gMC);
      Assert.assertTrue("RunCgi NetSceneQueue not ready!", u.Eu());
      if (this.hlL == null)
      {
        localObject1 = new c.a() {};
        this.hlL = new com.tencent.mm.by.e().b((c.a)localObject1);
      }
      Object localObject1 = this.hlL;
      GMTrace.o(13392244899840L, 99780);
      return (com.tencent.mm.by.e<a<_Resp>>)localObject1;
    }
    finally {}
  }
  
  public void a(int paramInt1, int paramInt2, String paramString, _Resp param_Resp, k paramk)
  {
    GMTrace.i(13392379117568L, 99781);
    GMTrace.o(13392379117568L, 99781);
  }
  
  public static class a<T extends axk>
  {
    public int errCode;
    public int errType;
    public T fPm;
    public String ftU;
    public k fxe;
    public a hlN;
    
    public a()
    {
      GMTrace.i(13389292109824L, 99758);
      GMTrace.o(13389292109824L, 99758);
    }
    
    public static <T extends axk> a<T> a(int paramInt1, int paramInt2, String paramString, T paramT, k paramk, a parama)
    {
      GMTrace.i(13389426327552L, 99759);
      a locala = new a();
      locala.errType = paramInt1;
      locala.errCode = paramInt2;
      locala.ftU = paramString;
      locala.fPm = paramT;
      locala.fxe = paramk;
      locala.hlN = parama;
      if (parama != null) {
        parama.a(paramInt1, paramInt2, paramString, paramT, paramk);
      }
      GMTrace.o(13389426327552L, 99759);
      return locala;
    }
  }
  
  private static final class b<_Resp extends axk>
    extends k
  {
    public e gPR;
    public final k hlO;
    public b hlP;
    public com.tencent.mm.vending.g.b hlQ;
    public a hlR;
    private j hlS;
    public final long mStartTime;
    
    public b(a parama)
    {
      GMTrace.i(13396674084864L, 99813);
      this.gPR = null;
      this.hlO = this;
      this.mStartTime = bg.Pp();
      this.hlS = new j()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, String paramAnonymousString, p paramAnonymousp, byte[] paramAnonymousArrayOfByte)
        {
          GMTrace.i(13389828980736L, 99762);
          g.a(a.b.this.hlQ, new Object[] { a.a.a(paramAnonymousInt2, paramAnonymousInt3, paramAnonymousString, (axk)a.b.this.hlP.hlV.hmc, a.b.this, a.b.this.hlR) });
          a.b.this.gPR.a(paramAnonymousInt2, paramAnonymousInt3, paramAnonymousString, a.b.this.hlO);
          w.i("MicroMsg.Cgi", "onGYNetEnd:%d func:%d time:%d [%d,%d,%s]", new Object[] { Integer.valueOf(a.b.this.hlO.hashCode()), Integer.valueOf(a.b.this.getType()), Long.valueOf(bg.Pp() - a.b.this.mStartTime), Integer.valueOf(paramAnonymousInt2), Integer.valueOf(paramAnonymousInt3), paramAnonymousString });
          GMTrace.o(13389828980736L, 99762);
        }
      };
      this.hlR = parama;
      GMTrace.o(13396674084864L, 99813);
    }
    
    public final int a(com.tencent.mm.network.e parame, e parame1)
    {
      GMTrace.i(13397076738048L, 99816);
      this.gPR = parame1;
      int i = a(parame, this.hlP, this.hlS);
      w.i("MicroMsg.Cgi", "Start doScene:%d func:%d netid:%d time:%d", new Object[] { Integer.valueOf(this.hlO.hashCode()), Integer.valueOf(this.hlP.hlW), Integer.valueOf(i), Long.valueOf(bg.Pp() - this.mStartTime) });
      if (i < 0) {
        g.a(this.hlQ, new Object[] { a.a.a(3, -1, "", (axk)this.hlP.hlV.hmc, this, this.hlR) });
      }
      GMTrace.o(13397076738048L, 99816);
      return i;
    }
    
    public final int getType()
    {
      GMTrace.i(13396942520320L, 99815);
      int i = this.hlP.hlW;
      GMTrace.o(13396942520320L, 99815);
      return i;
    }
    
    protected final int vG()
    {
      GMTrace.i(13396808302592L, 99814);
      GMTrace.o(13396808302592L, 99814);
      return 1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/ac/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */