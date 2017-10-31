package com.tencent.mm.plugin.appbrand.report;

import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.d.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends d
{
  public long jod;
  public long joe;
  private final c jof;
  public final b jog;
  public final a joh;
  public boolean pl;
  
  public e(String paramString)
  {
    super("MicroMsg.StayingRecorder[" + paramString + "]", Looper.getMainLooper());
    GMTrace.i(18353737433088L, 136746);
    this.jof = new c();
    this.jog = new b();
    this.joh = new a();
    this.pl = false;
    b(this.jog);
    b(this.joh);
    b(this.jof);
    c(this.jof);
    start();
    GMTrace.o(18353737433088L, 136746);
  }
  
  private void hN(int paramInt)
  {
    GMTrace.i(18354140086272L, 136749);
    if (bOl() == null)
    {
      zG(paramInt);
      GMTrace.o(18354140086272L, 136749);
      return;
    }
    zH(paramInt);
    GMTrace.o(18354140086272L, 136749);
  }
  
  public final void ZF()
  {
    GMTrace.i(18353871650816L, 136747);
    w.d(this.mName, "toForeground");
    hN(2);
    GMTrace.o(18353871650816L, 136747);
  }
  
  public final void ZG()
  {
    GMTrace.i(18354005868544L, 136748);
    w.d(this.mName, "toBackground");
    hN(1);
    GMTrace.o(18354005868544L, 136748);
  }
  
  public final void start()
  {
    GMTrace.i(18354274304000L, 136750);
    if (this.pl)
    {
      GMTrace.o(18354274304000L, 136750);
      return;
    }
    super.start();
    GMTrace.o(18354274304000L, 136750);
  }
  
  private final class a
    extends c
  {
    private long joi;
    
    public a()
    {
      GMTrace.i(18351992602624L, 136733);
      GMTrace.o(18351992602624L, 136733);
    }
    
    public final void enter()
    {
      GMTrace.i(18352395255808L, 136736);
      super.enter();
      this.joi = bg.Pp();
      GMTrace.o(18352395255808L, 136736);
    }
    
    public final void exit()
    {
      GMTrace.i(18352529473536L, 136737);
      super.exit();
      e.this.jod = (bg.Pp() - this.joi);
      GMTrace.o(18352529473536L, 136737);
    }
    
    public final boolean f(Message paramMessage)
    {
      GMTrace.i(18352261038080L, 136735);
      if (2 == paramMessage.what)
      {
        e.this.b(e.this.jog);
        GMTrace.o(18352261038080L, 136735);
        return true;
      }
      boolean bool = super.f(paramMessage);
      GMTrace.o(18352261038080L, 136735);
      return bool;
    }
    
    public final String getName()
    {
      GMTrace.i(18352126820352L, 136734);
      String str = e.this.mName + "|Background";
      GMTrace.o(18352126820352L, 136734);
      return str;
    }
  }
  
  private final class b
    extends c
  {
    private long jok;
    
    public b()
    {
      GMTrace.i(18354408521728L, 136751);
      GMTrace.o(18354408521728L, 136751);
    }
    
    public final void enter()
    {
      GMTrace.i(18354811174912L, 136754);
      super.enter();
      this.jok = bg.Pp();
      GMTrace.o(18354811174912L, 136754);
    }
    
    public final void exit()
    {
      GMTrace.i(18354945392640L, 136755);
      super.exit();
      e.this.joe = (bg.Pp() - this.jok);
      GMTrace.o(18354945392640L, 136755);
    }
    
    public final boolean f(Message paramMessage)
    {
      GMTrace.i(18354676957184L, 136753);
      if (1 == paramMessage.what)
      {
        e.this.b(e.this.joh);
        GMTrace.o(18354676957184L, 136753);
        return true;
      }
      boolean bool = super.f(paramMessage);
      GMTrace.o(18354676957184L, 136753);
      return bool;
    }
    
    public final String getName()
    {
      GMTrace.i(18354542739456L, 136752);
      String str = e.this.mName + "|Foreground";
      GMTrace.o(18354542739456L, 136752);
      return str;
    }
  }
  
  private final class c
    extends c
  {
    public c()
    {
      GMTrace.i(18352932126720L, 136740);
      GMTrace.o(18352932126720L, 136740);
    }
    
    public final boolean f(Message paramMessage)
    {
      GMTrace.i(18353200562176L, 136742);
      if (2 == paramMessage.what)
      {
        e.this.b(e.this.jog);
        GMTrace.o(18353200562176L, 136742);
        return true;
      }
      if (1 == paramMessage.what)
      {
        e.this.b(e.this.joh);
        GMTrace.o(18353200562176L, 136742);
        return true;
      }
      boolean bool = super.f(paramMessage);
      GMTrace.o(18353200562176L, 136742);
      return bool;
    }
    
    public final String getName()
    {
      GMTrace.i(18353066344448L, 136741);
      String str = e.this.mName + "|Init";
      GMTrace.o(18353066344448L, 136741);
      return str;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/report/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */