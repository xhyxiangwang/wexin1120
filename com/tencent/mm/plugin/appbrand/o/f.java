package com.tencent.mm.plugin.appbrand.o;

import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.report.c;
import com.tencent.mm.sdk.d.d;
import java.util.LinkedList;
import java.util.Queue;

public abstract class f<Task>
  extends d
{
  public final f<Task>.b jwm;
  private final f<Task>.a jwn;
  public final String jwo;
  public final Queue<Task> jwp;
  
  public f(String paramString, Looper paramLooper)
  {
    super(paramString, paramLooper);
    GMTrace.i(18185159966720L, 135490);
    this.jwm = new b();
    this.jwn = new a();
    this.jwp = new LinkedList();
    this.jwo = paramString;
    b(this.jwm);
    b(this.jwn);
    c(this.jwm);
    start();
    GMTrace.o(18185159966720L, 135490);
  }
  
  public abstract boolean VW();
  
  public abstract void aM(Task paramTask);
  
  protected final void aaY()
  {
    GMTrace.i(18185562619904L, 135493);
    super.aaY();
    synchronized (this.jwp)
    {
      this.jwp.clear();
      GMTrace.o(18185562619904L, 135493);
      return;
    }
  }
  
  public final void aaZ()
  {
    GMTrace.i(18185696837632L, 135494);
    synchronized (this.jwp)
    {
      Object localObject1 = this.jwp.poll();
      if (localObject1 != null)
      {
        b(this.jwn);
        aM(localObject1);
      }
      GMTrace.o(18185696837632L, 135494);
      return;
    }
  }
  
  private final class a
    extends c
  {
    public a()
    {
      GMTrace.i(18184757313536L, 135487);
      GMTrace.o(18184757313536L, 135487);
    }
    
    public final boolean f(Message paramMessage)
    {
      GMTrace.i(18184891531264L, 135488);
      if (2 == paramMessage.what)
      {
        f.this.b(f.this.jwm);
        GMTrace.o(18184891531264L, 135488);
        return true;
      }
      boolean bool = super.f(paramMessage);
      GMTrace.o(18184891531264L, 135488);
      return bool;
    }
    
    public final String getName()
    {
      GMTrace.i(18185025748992L, 135489);
      String str = f.this.jwo + "|StateExecuting";
      GMTrace.o(18185025748992L, 135489);
      return str;
    }
  }
  
  private final class b
    extends c
  {
    public b()
    {
      GMTrace.i(18183683571712L, 135479);
      GMTrace.o(18183683571712L, 135479);
    }
    
    public final void enter()
    {
      GMTrace.i(18183817789440L, 135480);
      super.enter();
      f.this.aaZ();
      GMTrace.o(18183817789440L, 135480);
    }
    
    public final boolean f(Message paramMessage)
    {
      GMTrace.i(18183952007168L, 135481);
      if ((1 == paramMessage.what) || (2 == paramMessage.what))
      {
        f.this.aaZ();
        GMTrace.o(18183952007168L, 135481);
        return true;
      }
      boolean bool = super.f(paramMessage);
      GMTrace.o(18183952007168L, 135481);
      return bool;
    }
    
    public final String getName()
    {
      GMTrace.i(18184086224896L, 135482);
      String str = f.this.jwo + "|StateIdle";
      GMTrace.o(18184086224896L, 135482);
      return str;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/o/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */