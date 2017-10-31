package com.tencent.mm.plugin.game.model;

import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.protocal.c.ayt;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

public final class p
  implements e
{
  private static boolean aDR;
  public static int mAb;
  public static LinkedList<j> mAc;
  private static af mAd;
  public int offset;
  
  static
  {
    GMTrace.i(12594320506880L, 93835);
    mAb = 20;
    aDR = false;
    mAc = new LinkedList();
    GMTrace.o(12594320506880L, 93835);
  }
  
  public p()
  {
    GMTrace.i(12593112547328L, 93826);
    this.offset = 0;
    GMTrace.o(12593112547328L, 93826);
  }
  
  public static void update()
  {
    GMTrace.i(12593246765056L, 93827);
    ap.AS();
    long l = ((Long)c.xi().get(w.a.uUk, Long.valueOf(0L))).longValue();
    if (System.currentTimeMillis() - l > 86400000L) {}
    for (int i = 1; i == 0; i = 0)
    {
      w.i("MicroMsg.GameListUpdater", "No need to update");
      GMTrace.o(12593246765056L, 93827);
      return;
    }
    if (aDR)
    {
      w.e("MicroMsg.GameListUpdater", "Already running");
      GMTrace.o(12593246765056L, 93827);
      return;
    }
    mAd = new af("GameListUpdate");
    mAc.clear();
    p localp = new p();
    ap.wT().a(1215, localp);
    ap.wT().a(new aw(localp.offset, mAb), 0);
    aDR = true;
    GMTrace.o(12593246765056L, 93827);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, final k paramk)
  {
    GMTrace.i(12593380982784L, 93828);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      aEp();
      GMTrace.o(12593380982784L, 93828);
      return;
    }
    mAd.C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12620224528384L, 94028);
        p.this.offset += p.mAb;
        Object localObject = (ayt)((aw)paramk).lnP.hlV.hmc;
        if (localObject == null) {
          w.e("MicroMsg.NetSceneSearchGameList", "resp == null");
        }
        for (localObject = null;; localObject = ((ayt)localObject).tSf)
        {
          localObject = new j((String)localObject);
          ((j)localObject).aEl();
          p.mAc.add(localObject);
          int i = ((i)localObject).mzN.optInt("remainingCount");
          w.i("MicroMsg.GameListUpdater", "remainingCount: %d", new Object[] { Integer.valueOf(i) });
          if (i <= 0) {
            break;
          }
          ap.wT().a(new aw(p.this.offset, p.mAb), 0);
          GMTrace.o(12620224528384L, 94028);
          return;
        }
        p.this.aEp();
        ap.AS();
        c.xi().a(w.a.uUk, Long.valueOf(System.currentTimeMillis()));
        localObject = p.mAc;
        if (!bg.bX((List)localObject)) {
          ap.xC().C(new j.1((LinkedList)localObject));
        }
        GMTrace.o(12620224528384L, 94028);
      }
    });
    GMTrace.o(12593380982784L, 93828);
  }
  
  public final void aEp()
  {
    GMTrace.i(12593515200512L, 93829);
    aDR = false;
    mAd.nTP.quit();
    ap.wT().b(1215, this);
    GMTrace.o(12593515200512L, 93829);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */