package com.tencent.mm.plugin.appbrand.media.record;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.e.b.c;
import com.tencent.mm.e.b.c.a;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  public int fqE;
  public c fqh;
  public RecordParam jhQ;
  public int jhR;
  public long jhS;
  public a jhT;
  public c.a jhU;
  public int sampleRate;
  
  public a(RecordParam paramRecordParam)
  {
    GMTrace.i(19854425849856L, 147927);
    this.fqh = null;
    this.sampleRate = 0;
    this.jhR = 0;
    this.jhS = 0L;
    this.fqE = -1;
    this.jhU = new c.a()
    {
      public final void aw(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(19854962720768L, 147931);
        w.e("MicroMsg.AppBrandRecorder", "state:%d, detailState:%d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        if (a.this.jhT != null) {
          a.this.jhT.aw(paramAnonymousInt1, paramAnonymousInt2);
        }
        GMTrace.o(19854962720768L, 147931);
      }
      
      public final void d(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
      {
        GMTrace.i(19854828503040L, 147930);
        w.i("MicroMsg.AppBrandRecorder", "onRecPcmDataReady()");
        if (a.this.jhT != null) {
          a.this.jhT.d(paramAnonymousArrayOfByte, paramAnonymousInt);
        }
        GMTrace.o(19854828503040L, 147930);
      }
    };
    RecordParam localRecordParam = paramRecordParam;
    if (paramRecordParam == null) {
      localRecordParam = new RecordParam();
    }
    this.sampleRate = localRecordParam.sampleRate;
    this.jhR = localRecordParam.jhW;
    this.fqE = localRecordParam.scene;
    this.jhQ = localRecordParam;
    GMTrace.o(19854425849856L, 147927);
  }
  
  public final boolean qr()
  {
    GMTrace.i(19854560067584L, 147928);
    w.i("MicroMsg.AppBrandRecorder", "stopRecord");
    if (this.fqh != null) {}
    for (boolean bool = this.fqh.qr();; bool = false)
    {
      long l = System.currentTimeMillis();
      this.jhS -= l;
      w.i("MicroMsg.AppBrandRecorder", "stop time ticket:%d, costTimeInMs:%d", new Object[] { Long.valueOf(l), Long.valueOf(this.jhS) });
      GMTrace.o(19854560067584L, 147928);
      return bool;
    }
  }
  
  public static abstract interface a
  {
    public abstract void aw(int paramInt1, int paramInt2);
    
    public abstract void d(byte[] paramArrayOfByte, int paramInt);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/media/record/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */