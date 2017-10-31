package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import junit.framework.Assert;

public abstract class h<Params, Progress, Result>
{
  private boolean fGc;
  public com.tencent.mm.sdk.platformtools.ae handler;
  
  public h()
  {
    GMTrace.i(8150505750528L, 60726);
    this.fGc = false;
    this.handler = ae.aCa();
    GMTrace.o(8150505750528L, 60726);
  }
  
  public abstract com.tencent.mm.sdk.platformtools.ae bgG();
  
  public abstract Result bgH();
  
  public final boolean m(final Params... paramVarArgs)
  {
    GMTrace.i(8150639968256L, 60727);
    if (this.fGc) {
      Assert.assertTrue("MicroMsg.MMAsyncTask Should construct a new Task", false);
    }
    this.fGc = true;
    com.tencent.mm.sdk.platformtools.ae localae = bgG();
    if (localae == null)
    {
      GMTrace.o(8150639968256L, 60727);
      return false;
    }
    localae.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8111314173952L, 60434);
        final Object localObject = h.this.bgH();
        h.this.handler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8121648939008L, 60511);
            h.this.onPostExecute(localObject);
            GMTrace.o(8121648939008L, 60511);
          }
        });
        GMTrace.o(8111314173952L, 60434);
      }
    });
    GMTrace.o(8150639968256L, 60727);
    return true;
  }
  
  public void onPostExecute(Result paramResult)
  {
    GMTrace.i(8150908403712L, 60729);
    GMTrace.o(8150908403712L, 60729);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */