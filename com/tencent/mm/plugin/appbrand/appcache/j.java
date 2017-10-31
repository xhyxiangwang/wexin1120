package com.tencent.mm.plugin.appbrand.appcache;

import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.a.a;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public final class j
  implements w.a
{
  private final CountDownLatch iAW;
  private final AtomicInteger iAX;
  
  public j()
  {
    GMTrace.i(19993206980608L, 148961);
    this.iAW = new CountDownLatch(1);
    this.iAX = new AtomicInteger(0);
    GMTrace.o(19993206980608L, 148961);
  }
  
  public final void a(String paramString, w.a.b paramb, w.a.a parama)
  {
    GMTrace.i(19993475416064L, 148963);
    this.iAW.countDown();
    GMTrace.o(19993475416064L, 148963);
  }
  
  public final WxaPkgWrappingInfo bU(boolean paramBoolean)
  {
    GMTrace.i(19993341198336L, 148962);
    Object localObject = q.bW(paramBoolean);
    if (((Pair)localObject).second != null)
    {
      localObject = (WxaPkgWrappingInfo)((Pair)localObject).second;
      GMTrace.o(19993341198336L, 148962);
      return (WxaPkgWrappingInfo)localObject;
    }
    if (((Pair)localObject).first == q.a.iBK)
    {
      localObject = ((a)h.h(a.class)).RT();
      int i;
      if (paramBoolean)
      {
        i = 0;
        label68:
        localObject = ((v)localObject).a("@LibraryAppId", i, new String[] { "downloadURL", "version" });
        if ((localObject == null) || (bg.mZ(((r)localObject).field_downloadURL)) || (this.iAX.getAndIncrement() > 0)) {
          break label193;
        }
        if (!paramBoolean) {
          break label181;
        }
        w.a(((r)localObject).field_downloadURL, ((r)localObject).field_version, this);
      }
      for (;;)
      {
        try
        {
          this.iAW.await();
        }
        catch (Exception localException)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ReadOrDownloadLibrary", "downloadSemaphore await failed, release %b, e %s", new Object[] { Boolean.valueOf(paramBoolean), localException });
          GMTrace.o(19993341198336L, 148962);
          return null;
        }
        i = 999;
        break label68;
        label181:
        w.a(localException.field_downloadURL, this);
      }
    }
    label193:
    GMTrace.o(19993341198336L, 148962);
    return null;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */