package com.tencent.mm.plugin.appbrand.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.d.d;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bb;
import com.tencent.mm.sdk.platformtools.w;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public abstract class c
  extends h
{
  public final String TAG;
  public final ae iCQ;
  public final d iCR;
  public final a iCS;
  public final e iCT;
  public final c iCU;
  public final b iCV;
  public final AtomicBoolean iCW;
  private final AtomicBoolean iCX;
  private final AtomicReference<com.tencent.mm.sdk.d.c> iCY;
  private final AtomicReference<com.tencent.mm.sdk.d.c> iCZ;
  public final com.tencent.mm.plugin.appbrand.f irS;
  
  c(com.tencent.mm.plugin.appbrand.f paramf)
  {
    super("MicroMsg.AppBrand.AppRunningStateMachine[" + paramf.iqL + "]", Looper.getMainLooper());
    GMTrace.i(18872488951808L, 140611);
    this.iCQ = new ae(Looper.getMainLooper());
    this.iCW = new AtomicBoolean(false);
    this.iCX = new AtomicBoolean(false);
    this.iCY = new AtomicReference(null);
    this.iCZ = new AtomicReference(null);
    this.TAG = this.mName;
    this.irS = paramf;
    Object localObject = new c(this);
    this.iCU = ((c)localObject);
    b((com.tencent.mm.sdk.d.c)localObject);
    localObject = new b(this);
    this.iCV = ((b)localObject);
    b((com.tencent.mm.sdk.d.c)localObject);
    paramf = new a(this, paramf);
    this.iCS = paramf;
    b(paramf);
    paramf = new d(this);
    this.iCR = paramf;
    b(paramf);
    paramf = new e();
    this.iCT = paramf;
    b(paramf);
    c(this.iCR);
    start();
    GMTrace.o(18872488951808L, 140611);
  }
  
  private a a(com.tencent.mm.sdk.d.a parama)
  {
    GMTrace.i(18873160040448L, 140616);
    if ((parama == this.iCS) || (parama == this.iCU) || (parama == this.iCV))
    {
      parama = a.iCH;
      GMTrace.o(18873160040448L, 140616);
      return parama;
    }
    if (parama == this.iCT)
    {
      parama = a.iCI;
      GMTrace.o(18873160040448L, 140616);
      return parama;
    }
    if (parama == this.iCR)
    {
      parama = a.iCG;
      GMTrace.o(18873160040448L, 140616);
      return parama;
    }
    parama = a.iCG;
    GMTrace.o(18873160040448L, 140616);
    return parama;
  }
  
  abstract void SQ();
  
  public final a SR()
  {
    GMTrace.i(18872891604992L, 140614);
    if ((this.iCX.get()) && (!af.isMainThread()))
    {
      locala = (a)new bb() {}.b(this.iCQ);
      GMTrace.o(18872891604992L, 140614);
      return locala;
    }
    a locala = SS();
    GMTrace.o(18872891604992L, 140614);
    return locala;
  }
  
  public final a SS()
  {
    GMTrace.i(18873025822720L, 140615);
    if (this.iCW.get())
    {
      localObject = a.iCJ;
      GMTrace.o(18873025822720L, 140615);
      return (a)localObject;
    }
    Object localObject = (com.tencent.mm.sdk.d.c)this.iCY.get();
    if (localObject != null)
    {
      localObject = a((com.tencent.mm.sdk.d.a)localObject);
      GMTrace.o(18873025822720L, 140615);
      return (a)localObject;
    }
    localObject = (com.tencent.mm.sdk.d.c)this.iCZ.get();
    if (localObject != null)
    {
      localObject = a((com.tencent.mm.sdk.d.a)localObject);
      GMTrace.o(18873025822720L, 140615);
      return (a)localObject;
    }
    if (!af.isMainThread()) {}
    for (localObject = (com.tencent.mm.sdk.d.a)new bb() {}.b(this.iCQ);; localObject = super.bOm())
    {
      localObject = a((com.tencent.mm.sdk.d.a)localObject);
      GMTrace.o(18873025822720L, 140615);
      return (a)localObject;
    }
  }
  
  final void a(g paramg)
  {
    GMTrace.i(18872757387264L, 140613);
    this.iCY.set(null);
    this.iCZ.set(paramg);
    Message localMessage = bOl();
    if ((localMessage != null) && (localMessage.what == -2))
    {
      GMTrace.o(18872757387264L, 140613);
      return;
    }
    b(a(paramg));
    GMTrace.o(18872757387264L, 140613);
  }
  
  public final void a(com.tencent.mm.sdk.d.c paramc)
  {
    GMTrace.i(18873294258176L, 140617);
    this.iCX.set(false);
    this.iCY.set(paramc);
    this.iCZ.set(null);
    super.b(paramc);
    GMTrace.o(18873294258176L, 140617);
  }
  
  public abstract void b(a parama);
  
  protected final boolean d(Message paramMessage)
  {
    GMTrace.i(18873562693632L, 140619);
    if (paramMessage.what != 1000)
    {
      GMTrace.o(18873562693632L, 140619);
      return true;
    }
    GMTrace.o(18873562693632L, 140619);
    return false;
  }
  
  protected final void e(Message paramMessage)
  {
    GMTrace.i(18873696911360L, 140620);
    super.e(paramMessage);
    this.iCX.set(false);
    GMTrace.o(18873696911360L, 140620);
  }
  
  public final void hN(int paramInt)
  {
    GMTrace.i(18873428475904L, 140618);
    this.iCX.set(true);
    if (bOl() == null)
    {
      super.zG(paramInt);
      GMTrace.o(18873428475904L, 140618);
      return;
    }
    super.zH(paramInt);
    GMTrace.o(18873428475904L, 140618);
  }
  
  public final void start()
  {
    GMTrace.i(18872623169536L, 140612);
    if (this.iCW.get())
    {
      GMTrace.o(18872623169536L, 140612);
      return;
    }
    super.start();
    GMTrace.o(18872623169536L, 140612);
  }
  
  private final class a
    extends f
  {
    a(h paramh, com.tencent.mm.plugin.appbrand.f paramf)
    {
      super(paramf);
      GMTrace.i(18876783919104L, 140643);
      GMTrace.o(18876783919104L, 140643);
    }
    
    final void ST()
    {
      GMTrace.i(18877455007744L, 140648);
      if (c.this.bOm() == this)
      {
        c.this.a(c.this.iCU);
        c.this.hN(1000);
      }
      GMTrace.o(18877455007744L, 140648);
    }
    
    public final void enter()
    {
      GMTrace.i(18877186572288L, 140646);
      super.enter();
      GMTrace.o(18877186572288L, 140646);
    }
    
    public final void exit()
    {
      GMTrace.i(18877320790016L, 140647);
      super.exit();
      GMTrace.o(18877320790016L, 140647);
    }
    
    public final boolean f(Message paramMessage)
    {
      GMTrace.i(18877052354560L, 140645);
      switch (paramMessage.what)
      {
      default: 
        boolean bool = super.f(paramMessage);
        GMTrace.o(18877052354560L, 140645);
        return bool;
      case 3: 
        c.this.a(c.this.iCR);
        GMTrace.o(18877052354560L, 140645);
        return true;
      }
      hP(16);
      GMTrace.o(18877052354560L, 140645);
      return true;
    }
    
    public final String getName()
    {
      GMTrace.i(18876918136832L, 140644);
      String str = c.this.mName + "|Background";
      GMTrace.o(18876918136832L, 140644);
      return str;
    }
  }
  
  private final class b
    extends g
  {
    b(h paramh)
    {
      super();
      GMTrace.i(18876381265920L, 140640);
      GMTrace.o(18876381265920L, 140640);
    }
    
    public final boolean f(Message paramMessage)
    {
      GMTrace.i(18876649701376L, 140642);
      switch (paramMessage.what)
      {
      default: 
        boolean bool = super.f(paramMessage);
        GMTrace.o(18876649701376L, 140642);
        return bool;
      }
      c.this.a(c.this.iCR);
      GMTrace.o(18876649701376L, 140642);
      return true;
    }
    
    public final String getName()
    {
      GMTrace.i(18876515483648L, 140641);
      String str = c.this.mName + "|BackgroundByScreenOff";
      GMTrace.o(18876515483648L, 140641);
      return str;
    }
  }
  
  private final class c
    extends g
  {
    c(h paramh)
    {
      super();
      GMTrace.i(18879736709120L, 140665);
      GMTrace.o(18879736709120L, 140665);
    }
    
    public final void enter()
    {
      GMTrace.i(18880139362304L, 140668);
      super.enter();
      c.this.uPX.sendEmptyMessageDelayed(4, c.this.irS.iqO.iIY * 1000L);
      GMTrace.o(18880139362304L, 140668);
    }
    
    public final void exit()
    {
      GMTrace.i(18880273580032L, 140669);
      super.exit();
      c.this.uPX.removeMessages(4);
      GMTrace.o(18880273580032L, 140669);
    }
    
    public final boolean f(Message paramMessage)
    {
      GMTrace.i(18880005144576L, 140667);
      switch (paramMessage.what)
      {
      default: 
        boolean bool = super.f(paramMessage);
        GMTrace.o(18880005144576L, 140667);
        return bool;
      case 4: 
        c.this.a(c.this.iCT);
        GMTrace.o(18880005144576L, 140667);
        return true;
      case 10: 
        c.this.a(c.this.iCV);
        GMTrace.o(18880005144576L, 140667);
        return true;
      }
      c.this.a(c.this.iCR);
      GMTrace.o(18880005144576L, 140667);
      return true;
    }
    
    public final String getName()
    {
      GMTrace.i(18879870926848L, 140666);
      String str = c.this.mName + "|BackgroundTemporary";
      GMTrace.o(18879870926848L, 140666);
      return str;
    }
  }
  
  private final class d
    extends g
  {
    d(h paramh)
    {
      super();
      GMTrace.i(18873965346816L, 140622);
      GMTrace.o(18873965346816L, 140622);
    }
    
    public final void enter()
    {
      GMTrace.i(18874368000000L, 140625);
      super.enter();
      GMTrace.o(18874368000000L, 140625);
    }
    
    public final void exit()
    {
      GMTrace.i(18874502217728L, 140626);
      super.exit();
      GMTrace.o(18874502217728L, 140626);
    }
    
    public final boolean f(Message paramMessage)
    {
      GMTrace.i(18874233782272L, 140624);
      switch (paramMessage.what)
      {
      default: 
        boolean bool = super.f(paramMessage);
        GMTrace.o(18874233782272L, 140624);
        return bool;
      }
      c.this.a(c.this.iCS);
      GMTrace.o(18874233782272L, 140624);
      return true;
    }
    
    public final String getName()
    {
      GMTrace.i(18874099564544L, 140623);
      String str = c.this.mName + "|Foreground";
      GMTrace.o(18874099564544L, 140623);
      return str;
    }
  }
  
  private final class e
    extends com.tencent.mm.plugin.appbrand.report.c
  {
    public e()
    {
      GMTrace.i(18875441741824L, 140633);
      GMTrace.o(18875441741824L, 140633);
    }
    
    public final void enter()
    {
      GMTrace.i(18875710177280L, 140635);
      super.enter();
      c.this.uPX.sendEmptyMessageDelayed(11, c.this.irS.iqO.iIZ * 1000L);
      c.this.irS.iqQ.irU.pause();
      GMTrace.o(18875710177280L, 140635);
    }
    
    public final void exit()
    {
      GMTrace.i(18875844395008L, 140636);
      super.exit();
      c.this.uPX.removeMessages(11);
      c.this.irS.iqQ.irU.resume();
      GMTrace.o(18875844395008L, 140636);
    }
    
    public final boolean f(Message paramMessage)
    {
      GMTrace.i(18875978612736L, 140637);
      switch (paramMessage.what)
      {
      default: 
        boolean bool = super.f(paramMessage);
        GMTrace.o(18875978612736L, 140637);
        return bool;
      case 3: 
        c.this.a(c.this.iCR);
        GMTrace.o(18875978612736L, 140637);
        return true;
      }
      w.i(c.this.TAG, "suspend timeout");
      c.this.SQ();
      GMTrace.o(18875978612736L, 140637);
      return true;
    }
    
    public final String getName()
    {
      GMTrace.i(18875575959552L, 140634);
      String str = c.this.mName + "|Suspend";
      GMTrace.o(18875575959552L, 140634);
      return str;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */