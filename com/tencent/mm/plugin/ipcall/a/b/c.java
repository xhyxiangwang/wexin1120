package com.tencent.mm.plugin.ipcall.a.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.ipcall.a.f;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.sdk.platformtools.w;

public final class c
{
  public boolean fGc;
  public boolean kwx;
  public com.tencent.mm.e.b.c mYd;
  public final Object mYe;
  public int mYf;
  boolean mYg;
  int mYh;
  public boolean mYi;
  com.tencent.mm.e.b.c.a mYj;
  
  public c()
  {
    GMTrace.i(11607014899712L, 86479);
    this.mYd = null;
    this.mYe = new Object();
    this.fGc = false;
    this.kwx = false;
    this.mYf = 92;
    this.mYg = true;
    this.mYh = 0;
    this.mYi = true;
    this.mYj = new com.tencent.mm.e.b.c.a()
    {
      public final void aw(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(11604196327424L, 86458);
        GMTrace.o(11604196327424L, 86458);
      }
      
      public final void d(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
      {
        int j = 0;
        GMTrace.i(11604062109696L, 86457);
        synchronized (c.this.mYe)
        {
          c localc = c.this;
          if (localc.mYf <= 10) {
            localc.mYf = 92;
          }
          a locala = i.aHo().mXT;
          if (locala.mXN != null) {}
          for (int i = locala.mXN.brH();; i = 0)
          {
            localc.mYf = ((i + 24 + localc.mYf * 3) / 4);
            if (!localc.mYg) {
              break;
            }
            w.i("MicroMsg.IPCallRecorder", "preprocessForEcho FirstRefEcho");
            locala = i.aHo().mXT;
            i = j;
            if (locala.mXN != null) {
              i = locala.mXN.brE();
            }
            localc.mYh = i;
            if (localc.mYh >= localc.mYf) {
              localc.mYh -= localc.mYf;
            }
            localc.mYf = localc.mYh;
            localc.mYg = false;
            if (i.aHp().mWi == 5)
            {
              if (c.this.mYi)
              {
                w.i("MicroMsg.IPCallRecorder", "isFirstRecordCallback");
                c.this.mYi = false;
              }
              i.aHm().mYp.recordCallback(paramAnonymousArrayOfByte, paramAnonymousInt, c.this.mYf);
            }
            GMTrace.o(11604062109696L, 86457);
            return;
          }
          localc.mYf = 0;
        }
      }
    };
    this.fGc = false;
    GMTrace.o(11607014899712L, 86479);
  }
  
  public final void ck(boolean paramBoolean)
  {
    GMTrace.i(11607149117440L, 86480);
    w.i("MicroMsg.IPCallRecorder", "setMute: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if ((this.fGc) && (this.mYd != null)) {
      this.mYd.aC(paramBoolean);
    }
    this.kwx = paramBoolean;
    GMTrace.o(11607149117440L, 86480);
  }
  
  private final class a
    implements Runnable
  {
    private com.tencent.mm.e.b.c mYl;
    
    public a(com.tencent.mm.e.b.c paramc)
    {
      GMTrace.i(11605941157888L, 86471);
      this.mYl = null;
      this.mYl = paramc;
      GMTrace.o(11605941157888L, 86471);
    }
    
    public final void run()
    {
      GMTrace.i(11606075375616L, 86472);
      w.d("MicroMsg.IPCallRecorder", "do stopRecord");
      if (this.mYl != null)
      {
        this.mYl.qr();
        this.mYl = null;
        c localc = c.this;
        localc.mYf = 92;
        localc.mYg = true;
        localc.mYh = 0;
      }
      GMTrace.o(11606075375616L, 86472);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */