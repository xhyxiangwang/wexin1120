package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import android.database.Cursor;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.u;
import com.tencent.mm.ac.u.a;
import com.tencent.mm.plugin.sns.storage.d;
import com.tencent.mm.protocal.c.uz;
import com.tencent.mm.protocal.c.va;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;

public final class i
{
  private static final i quJ;
  public Map<Long, String> mcX;
  public d quK;
  
  static
  {
    GMTrace.i(16641790312448L, 123991);
    quJ = new i();
    GMTrace.o(16641790312448L, 123991);
  }
  
  private i()
  {
    GMTrace.i(16641656094720L, 123990);
    this.quK = com.tencent.mm.plugin.sns.model.ae.bhq();
    this.mcX = new HashMap();
    HandlerThread localHandlerThread = e.Sc("OpenCanvasMgr");
    localHandlerThread.start();
    new com.tencent.mm.sdk.platformtools.ae(localHandlerThread.getLooper()).postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16642461401088L, 123996);
        i locali = i.this;
        w.i("OpenCanvasMgr", "clearing old canvasInfo cache");
        Cursor localCursor = locali.quK.Mp();
        if (localCursor != null)
        {
          long l = System.currentTimeMillis();
          while (localCursor.moveToNext())
          {
            com.tencent.mm.plugin.sns.storage.c localc = new com.tencent.mm.plugin.sns.storage.c();
            localc.b(localCursor);
            if (localc.field_createTime < l - 777600000L)
            {
              w.i("OpenCanvasMgr", "eliminate %d " + localc.field_canvasId);
              locali.quK.a(localc, new String[0]);
            }
          }
          localCursor.close();
        }
        GMTrace.o(16642461401088L, 123996);
      }
    }, 5000L);
    GMTrace.o(16641656094720L, 123990);
  }
  
  public static i bjG()
  {
    GMTrace.i(16641521876992L, 123989);
    i locali = quJ;
    GMTrace.o(16641521876992L, 123989);
    return locali;
  }
  
  public final String e(final long paramLong, int paramInt1, int paramInt2)
  {
    GMTrace.i(18581639135232L, 138444);
    w.i("OpenCanvasMgr", "open pageId %d, preLoad %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1) });
    if (paramLong <= 0L)
    {
      GMTrace.o(18581639135232L, 138444);
      return "";
    }
    final Object localObject1 = "";
    if (paramInt2 != 1)
    {
      if (!this.mcX.containsKey(Long.valueOf(paramLong))) {
        break label110;
      }
      localObject1 = (String)this.mcX.get(Long.valueOf(paramLong));
    }
    while (paramInt1 != 1)
    {
      GMTrace.o(18581639135232L, 138444);
      return (String)localObject1;
      label110:
      localObject1 = new com.tencent.mm.plugin.sns.storage.c();
      ((com.tencent.mm.plugin.sns.storage.c)localObject1).field_canvasId = paramLong;
      this.quK.b((com.tencent.mm.sdk.e.c)localObject1, new String[0]);
      if (!TextUtils.isEmpty(((com.tencent.mm.plugin.sns.storage.c)localObject1).field_canvasXml))
      {
        this.mcX.put(Long.valueOf(paramLong), ((com.tencent.mm.plugin.sns.storage.c)localObject1).field_canvasXml);
        localObject1 = ((com.tencent.mm.plugin.sns.storage.c)localObject1).field_canvasXml;
      }
      else
      {
        localObject1 = "";
      }
    }
    if (TextUtils.isEmpty((CharSequence)localObject1))
    {
      localObject1 = new com.tencent.mm.plugin.sns.storage.c();
      ((com.tencent.mm.plugin.sns.storage.c)localObject1).field_canvasId = paramLong;
      Object localObject2 = new b.a();
      ((b.a)localObject2).hlX = new uz();
      ((b.a)localObject2).hlY = new va();
      ((b.a)localObject2).uri = "/cgi-bin/mmoc-bin/adplayinfo/get_adcanvasinfo";
      ((b.a)localObject2).hlW = 1286;
      localObject2 = ((b.a)localObject2).DA();
      ((uz)((b)localObject2).hlU.hmc).tTr = paramLong;
      u.a((b)localObject2, new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb, k paramAnonymousk)
        {
          GMTrace.i(16641387659264L, 123988);
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            w.e("OpenCanvasMgr", "cgi fail page id %d,preLoad %d, errType %d,errCode %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(localObject1), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
            GMTrace.o(16641387659264L, 123988);
            return 0;
          }
          paramAnonymousString = (va)paramAnonymousb.hlV.hmc;
          w.i("OpenCanvasMgr", "getCanvasInfo pageid %d ,xml %s", new Object[] { Long.valueOf(paramLong), paramAnonymousString.tTs });
          if (!TextUtils.isEmpty(paramAnonymousString.tTs))
          {
            i.this.mcX.put(Long.valueOf(paramLong), paramAnonymousString.tTs);
            this.quO.field_canvasXml = paramAnonymousString.tTs;
            i.this.quK.a(this.quO);
          }
          GMTrace.o(16641387659264L, 123988);
          return 0;
        }
      });
      GMTrace.o(18581639135232L, 138444);
      return "";
    }
    GMTrace.o(18581639135232L, 138444);
    return (String)localObject1;
  }
  
  public final void o(long paramLong, String paramString)
  {
    GMTrace.i(18581773352960L, 138445);
    if ((!TextUtils.isEmpty(paramString)) && (paramLong > 0L))
    {
      this.mcX.put(Long.valueOf(paramLong), paramString);
      com.tencent.mm.plugin.sns.storage.c localc = new com.tencent.mm.plugin.sns.storage.c();
      localc.field_canvasId = paramLong;
      localc.field_canvasXml = paramString;
      this.quK.a(localc);
    }
    GMTrace.o(18581773352960L, 138445);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */