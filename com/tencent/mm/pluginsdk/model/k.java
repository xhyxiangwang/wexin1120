package com.tencent.mm.pluginsdk.model;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import junit.framework.Assert;

public abstract class k<Params, Progress, Result>
{
  private boolean fGc;
  public ae handler;
  
  public k()
  {
    GMTrace.i(772288806912L, 5754);
    this.fGc = false;
    this.handler = new ae(Looper.getMainLooper());
    GMTrace.o(772288806912L, 5754);
  }
  
  public abstract ae bgG();
  
  public abstract Result bgH();
  
  public final boolean m(final Params... paramVarArgs)
  {
    GMTrace.i(772423024640L, 5755);
    if (this.fGc) {
      Assert.assertTrue("MicroMsg.MMAsyncTask Should construct a new Task", false);
    }
    this.fGc = true;
    n(paramVarArgs);
    ae localae = bgG();
    if (localae == null)
    {
      GMTrace.o(772423024640L, 5755);
      return false;
    }
    localae.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(767993839616L, 5722);
        final Object localObject = k.this.bgH();
        k.this.handler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(768530710528L, 5726);
            k.this.onPostExecute(localObject);
            GMTrace.o(768530710528L, 5726);
          }
        });
        GMTrace.o(767993839616L, 5722);
      }
    });
    GMTrace.o(772423024640L, 5755);
    return true;
  }
  
  public void n(Params... paramVarArgs)
  {
    GMTrace.i(772557242368L, 5756);
    GMTrace.o(772557242368L, 5756);
  }
  
  public void onPostExecute(Result paramResult)
  {
    GMTrace.i(772825677824L, 5758);
    GMTrace.o(772825677824L, 5758);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/model/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */