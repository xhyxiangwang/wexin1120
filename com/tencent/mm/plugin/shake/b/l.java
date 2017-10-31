package com.tencent.mm.plugin.shake.b;

import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.shake.c.a.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ae.a;
import java.util.List;

public final class l
{
  protected static long pvA;
  protected static int pvB;
  public int pvC;
  public b pvD;
  
  static
  {
    GMTrace.i(6516002258944L, 48548);
    pvA = 16000L;
    pvB = 54158;
    GMTrace.o(6516002258944L, 48548);
  }
  
  public l()
  {
    GMTrace.i(6515868041216L, 48547);
    GMTrace.o(6515868041216L, 48547);
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt, e parame, long paramLong);
    
    public abstract void d(List<d> paramList, long paramLong);
  }
  
  public static abstract class b
  {
    public l.a pvE;
    protected boolean pvF;
    protected long pvG;
    private ae pvH;
    
    public b(l.a parama)
    {
      GMTrace.i(6506070147072L, 48474);
      this.pvF = false;
      this.pvG = l.pvA;
      this.pvH = new ae(new ae.a()
      {
        public final boolean handleMessage(Message paramAnonymousMessage)
        {
          GMTrace.i(6516539129856L, 48552);
          if ((paramAnonymousMessage.what == l.pvB) && (!l.b.this.pvF) && (l.b.this.pvE != null)) {
            l.b.this.pvE.d(null, 5L);
          }
          GMTrace.o(6516539129856L, 48552);
          return false;
        }
      });
      this.pvE = parama;
      GMTrace.o(6506070147072L, 48474);
    }
    
    public void bdj()
    {
      GMTrace.i(6506875453440L, 48480);
      reset();
      this.pvE = null;
      GMTrace.o(6506875453440L, 48480);
    }
    
    public abstract void init();
    
    public abstract void pause();
    
    public abstract void reset();
    
    public abstract void resume();
    
    public abstract void start();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/b/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */