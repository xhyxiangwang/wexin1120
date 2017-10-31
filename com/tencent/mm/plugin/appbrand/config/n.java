package com.tencent.mm.plugin.appbrand.config;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.k.b;
import com.tencent.mm.plugin.appbrand.k.b.a;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.List;

public final class n
  implements b
{
  public n()
  {
    GMTrace.i(17267379142656L, 128652);
    GMTrace.o(17267379142656L, 128652);
  }
  
  public final void S(final List<String> paramList)
  {
    GMTrace.i(20369687707648L, 151766);
    if (bg.bX(paramList))
    {
      GMTrace.o(20369687707648L, 151766);
      return;
    }
    e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20369956143104L, 151768);
        if (paramList.size() > 0) {
          q.S(paramList);
        }
        GMTrace.o(20369956143104L, 151768);
      }
    }, "batchSyncWxaContanctThread");
    GMTrace.o(20369687707648L, 151766);
  }
  
  public final void a(String paramString, final b.a parama)
  {
    GMTrace.i(18345281716224L, 136683);
    q.a(paramString, new q.b() {});
    GMTrace.o(18345281716224L, 136683);
  }
  
  public final WxaAttributes oU(String paramString)
  {
    GMTrace.i(17267513360384L, 128653);
    paramString = f.Sa().d(paramString, new String[0]);
    GMTrace.o(17267513360384L, 128653);
    return paramString;
  }
  
  public final void oV(final String paramString)
  {
    GMTrace.i(18345415933952L, 136684);
    if (bg.mZ(paramString))
    {
      GMTrace.o(18345415933952L, 136684);
      return;
    }
    final af localaf = new af();
    new ae(localaf.nTP.getLooper()).post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18345952804864L, 136688);
        if (q.pg(paramString)) {
          q.a(paramString, new q.b() {});
        }
        for (;;)
        {
          Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler()
          {
            public final boolean queueIdle()
            {
              GMTrace.i(18345684369408L, 136686);
              n.2.this.iJs.nTP.quit();
              GMTrace.o(18345684369408L, 136686);
              return false;
            }
          });
          GMTrace.o(18345952804864L, 136688);
          return;
          if (this.iJq != null) {
            this.iJq.c(n.this.oU(paramString));
          }
        }
      }
    });
    GMTrace.o(18345415933952L, 136684);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */