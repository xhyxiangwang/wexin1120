package com.tencent.mm.plugin.webview.modeltools;

import android.content.Context;
import android.view.OrientationEventListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends OrientationEventListener
{
  private a snn;
  private int sno;
  private b snp;
  
  public e(Context paramContext, b paramb)
  {
    super(paramContext);
    GMTrace.i(14346130292736L, 106887);
    this.snn = a.snq;
    this.sno = 45;
    this.snp = paramb;
    GMTrace.o(14346130292736L, 106887);
  }
  
  public final void disable()
  {
    GMTrace.i(14346398728192L, 106889);
    super.disable();
    this.snn = a.snq;
    GMTrace.o(14346398728192L, 106889);
  }
  
  public final void enable()
  {
    GMTrace.i(14346264510464L, 106888);
    super.enable();
    GMTrace.o(14346264510464L, 106888);
  }
  
  public final void onOrientationChanged(int paramInt)
  {
    GMTrace.i(14346532945920L, 106890);
    if (paramInt == -1)
    {
      GMTrace.o(14346532945920L, 106890);
      return;
    }
    a locala2 = this.snn;
    a locala1;
    if (((paramInt >= 360 - this.sno) && (paramInt < 360)) || ((paramInt >= 0) && (paramInt <= this.sno + 0))) {
      locala1 = a.snr;
    }
    for (;;)
    {
      if (locala1 != this.snn)
      {
        if ((this.snp != null) && (this.snn != a.snq)) {
          this.snp.a(this.snn, locala1);
        }
        this.snn = locala1;
      }
      w.i("MicroMsg.OrientationListenerHelper", "OrientationListener onOrientationChanged:" + paramInt);
      GMTrace.o(14346532945920L, 106890);
      return;
      if ((paramInt >= 270 - this.sno) && (paramInt <= this.sno + 270))
      {
        locala1 = a.sns;
      }
      else if ((paramInt >= 180 - this.sno) && (paramInt <= this.sno + 180))
      {
        locala1 = a.snt;
      }
      else
      {
        locala1 = locala2;
        if (paramInt >= 90 - this.sno)
        {
          locala1 = locala2;
          if (paramInt <= this.sno + 90) {
            locala1 = a.snu;
          }
        }
      }
    }
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(14345861857280L, 106885);
      snq = new a("NONE", 0);
      snr = new a("PORTRAIT", 1);
      sns = new a("LANDSCAPE", 2);
      snt = new a("REVERSE_PORTRAIT", 3);
      snu = new a("REVERSE_LANDSCAPE", 4);
      snv = new a[] { snq, snr, sns, snt, snu };
      GMTrace.o(14345861857280L, 106885);
    }
    
    private a()
    {
      GMTrace.i(14345727639552L, 106884);
      GMTrace.o(14345727639552L, 106884);
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(e.a parama1, e.a parama2);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/modeltools/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */