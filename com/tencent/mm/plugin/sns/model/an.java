package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.n;
import com.tencent.mm.g.a.as;
import com.tencent.mm.g.a.f;
import com.tencent.mm.g.a.pi;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Date;

public final class an
{
  public boolean hTw;
  public boolean hTx;
  long qeE;
  private boolean qeF;
  int qeG;
  int qeH;
  c<pi> qeI;
  c qeJ;
  c qeK;
  
  an()
  {
    GMTrace.i(17152757202944L, 127798);
    this.qeE = 0L;
    this.hTw = false;
    this.hTx = false;
    this.qeF = false;
    this.qeG = 0;
    this.qeH = 1440;
    this.qeI = new c()
    {
      private boolean bhQ()
      {
        int i = 1200;
        GMTrace.i(17153965162496L, 127807);
        an localan = an.this;
        int j;
        try
        {
          if (localan.bhP())
          {
            Date localDate = new Date();
            j = localDate.getHours();
            j = localDate.getMinutes() + j * 60;
            if ((j >= localan.qeG) && (j <= localan.qeH))
            {
              w.i("MicroMsg.SnsPreTimelineService", "newObjectSync blocked,  %d in [%d, %d]", new Object[] { Integer.valueOf(j), Integer.valueOf(localan.qeG), Integer.valueOf(localan.qeH) });
              GMTrace.o(17153965162496L, 127807);
              return false;
            }
          }
        }
        catch (Exception localException)
        {
          int k;
          int m;
          int n;
          do
          {
            k = g.uz().getInt("SnsImgPreLoadingSmallImage", 1);
            m = g.uz().getInt("SnsImgPreLoadingBigImage", 1);
            n = g.uz().getInt("SnsPreLoadingVideo", 1);
            j = g.uz().getInt("SnsImgPreLoadingInterval", 1200);
            w.i("MicroMsg.SnsPreTimelineService", " preloadingSamllImage %d preloadingBigImage %d preloadingVideo %d preloadingInterval %d", new Object[] { Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(j) });
          } while ((k <= 0) && (m <= 0) && (n <= 0));
          if (j > 0) {}
        }
        for (;;)
        {
          if ((localan.hTw) || (localan.hTx) || (bg.aE(localan.qeE) < i))
          {
            w.i("MicroMsg.SnsPreTimelineService", "newObjectSync blocked,  isInChatting:%b, isInSnsTimeline:%b", new Object[] { Boolean.valueOf(localan.hTw), Boolean.valueOf(localan.hTx) });
            break;
          }
          if (!x.Gu("@__weixintimtline"))
          {
            w.i("MicroMsg.SnsPreTimelineService", "newObjectSync blocked: doing timeline");
            break;
          }
          h.xA();
          if (!h.xy().gQO.a(new s(), 0))
          {
            w.i("MicroMsg.SnsPreTimelineService", "newObjectSync triggered");
            x.Gv("@__weixintimtline");
          }
          localan.qeE = bg.Po();
          break;
          i = j;
        }
      }
    };
    this.qeJ = new c() {};
    this.qeK = new c() {};
    GMTrace.o(17152757202944L, 127798);
  }
  
  final boolean bhP()
  {
    GMTrace.i(17152891420672L, 127799);
    Object localObject = g.uz().getValue("SnsImgPreLoadingTimeLimit");
    w.i("MicroMsg.SnsPreTimelineService", "preloadLimit:%s", new Object[] { localObject });
    if (bg.mZ((String)localObject))
    {
      GMTrace.o(17152891420672L, 127799);
      return false;
    }
    try
    {
      localObject = ((String)localObject).split("-");
      String[] arrayOfString = localObject[0].split(":");
      int i = bg.RF(arrayOfString[0]);
      this.qeG = (bg.RF(arrayOfString[1]) + i * 60);
      localObject = localObject[1].split(":");
      i = bg.RF(localObject[0]);
      this.qeH = (bg.RF(localObject[1]) + i * 60);
      w.d("MicroMsg.SnsPreTimelineService", "preloadLimit:%d-%d", new Object[] { Integer.valueOf(this.qeG), Integer.valueOf(this.qeH) });
      GMTrace.o(17152891420672L, 127799);
      return true;
    }
    catch (Exception localException)
    {
      GMTrace.o(17152891420672L, 127799);
    }
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */