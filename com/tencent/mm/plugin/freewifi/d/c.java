package com.tencent.mm.plugin.freewifi.d;

import android.app.Activity;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.x.ap;

public abstract class c
  extends k
  implements j
{
  protected Activity activity;
  protected b gMC;
  protected com.tencent.mm.ac.e gMF;
  protected com.tencent.mm.ac.e mer;
  
  public c()
  {
    GMTrace.i(7252589150208L, 54036);
    GMTrace.o(7252589150208L, 54036);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(7253260238848L, 54041);
    this.mer = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(7253260238848L, 54041);
    return i;
  }
  
  public final void a(final int paramInt1, final int paramInt2, final int paramInt3, final String paramString, final p paramp, final byte[] paramArrayOfByte)
  {
    GMTrace.i(7252723367936L, 54037);
    m.xP("netscene " + getClass().getSimpleName() + '@' + Integer.toHexString(hashCode()) + " returns [" + paramInt2 + "," + paramInt3 + "]");
    if (this.mer != null) {
      this.mer.a(paramInt2, paramInt3, paramString, this);
    }
    if ((this.activity != null) && (this.activity.isFinishing()))
    {
      GMTrace.o(7252723367936L, 54037);
      return;
    }
    if (this.gMF != null) {
      af.u(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7247488876544L, 53998);
          c.this.b(paramInt1, paramInt2, paramInt3, paramString);
          if (c.this.gMF != null) {
            c.this.gMF.a(paramInt2, paramInt3, paramString, c.this);
          }
          GMTrace.o(7247488876544L, 53998);
        }
      });
    }
    GMTrace.o(7252723367936L, 54037);
  }
  
  protected abstract void aAl();
  
  protected void b(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    GMTrace.i(7252857585664L, 54038);
    GMTrace.o(7252857585664L, 54038);
  }
  
  public final void b(com.tencent.mm.ac.e parame)
  {
    GMTrace.i(7253126021120L, 54040);
    this.gMF = parame;
    m.xP("netscene " + getClass().getSimpleName() + '@' + Integer.toHexString(hashCode()) + " is started.");
    ap.wT().a(this, 0);
    GMTrace.o(7253126021120L, 54040);
  }
  
  public final c u(Activity paramActivity)
  {
    GMTrace.i(7253394456576L, 54042);
    this.activity = paramActivity;
    GMTrace.o(7253394456576L, 54042);
    return this;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */