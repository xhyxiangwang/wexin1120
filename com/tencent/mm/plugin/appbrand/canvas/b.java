package com.tencent.mm.plugin.appbrand.canvas;

import android.graphics.Canvas;
import android.graphics.Paint.Style;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.plugin.appbrand.collector.f;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b
  implements com.tencent.mm.plugin.appbrand.canvas.widget.a
{
  public volatile long iFA;
  protected long iFB;
  protected long iFC;
  protected volatile long iFD;
  public volatile boolean iFr;
  public JSONArray iFs;
  public d iFt;
  private c iFu;
  public com.tencent.mm.plugin.appbrand.canvas.widget.a iFv;
  public volatile String iFw;
  public volatile boolean iFx;
  private Runnable iFy;
  private Runnable iFz;
  protected int mCount;
  
  public b(com.tencent.mm.plugin.appbrand.canvas.widget.a parama)
  {
    GMTrace.i(17706271113216L, 131922);
    this.iFy = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17719290232832L, 132019);
        b.this.iFD = 0L;
        b.this.iFx = true;
        GMTrace.o(17719290232832L, 132019);
      }
    };
    this.iFz = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17707613290496L, 131932);
        boolean bool = b.this.iFx;
        b.this.iFx = false;
        if ((bool) && (b.this.iFr)) {
          b.this.iFv.TC();
        }
        GMTrace.o(17707613290496L, 131932);
      }
    };
    this.iFv = parama;
    this.iFt = new d(new a(parama));
    this.iFu = new c();
    GMTrace.o(17706271113216L, 131922);
  }
  
  public final void TC()
  {
    GMTrace.i(17706673766400L, 131925);
    GMTrace.o(17706673766400L, 131925);
  }
  
  public final void TD()
  {
    GMTrace.i(17707076419584L, 131928);
    this.iFv.j(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18855711735808L, 140486);
        b.this.iFs = null;
        b.this.iFr = true;
        GMTrace.o(18855711735808L, 140486);
      }
    });
    GMTrace.o(17707076419584L, 131928);
  }
  
  public final int TE()
  {
    GMTrace.i(18967380885504L, 141318);
    if (equals(this.iFv))
    {
      GMTrace.o(18967380885504L, 141318);
      return 0;
    }
    int i = this.iFv.TE();
    GMTrace.o(18967380885504L, 141318);
    return i;
  }
  
  public final int TF()
  {
    GMTrace.i(18967515103232L, 141319);
    if (equals(this.iFv))
    {
      GMTrace.o(18967515103232L, 141319);
      return 0;
    }
    int i = this.iFv.TF();
    GMTrace.o(18967515103232L, 141319);
    return i;
  }
  
  public final void TG()
  {
    GMTrace.i(18855443300352L, 140484);
    int j = this.mCount;
    long l1 = this.iFC;
    long l2 = this.iFB;
    if ((j <= 0) || (l1 <= 0L) || (l2 <= 0L))
    {
      GMTrace.o(18855443300352L, 140484);
      return;
    }
    int k = this.iFv.TE();
    long l3 = l1 / j;
    if (l3 <= 500000L)
    {
      i = 0;
      g.paX.a(k, i, 1L, false);
      k = this.iFv.TF();
      l3 = l2 / j;
      if (l3 > 20000000L) {
        break label240;
      }
      i = 0;
    }
    for (;;)
    {
      g.paX.a(k, i, 1L, false);
      k = getType();
      if ((l1 > 0L) && (l2 > 0L) && (j > 0)) {
        break label361;
      }
      GMTrace.o(18855443300352L, 140484);
      return;
      if (l3 <= 1000000L)
      {
        i = 1;
        break;
      }
      if (l3 <= 2000000L)
      {
        i = 2;
        break;
      }
      if (l3 <= 3000000L)
      {
        i = 3;
        break;
      }
      if (l3 <= 4000000L)
      {
        i = 4;
        break;
      }
      if (l3 <= 5000000L)
      {
        i = 5;
        break;
      }
      i = 6;
      break;
      label240:
      if (l3 <= 25000000L) {
        i = 1;
      } else if (l3 <= 30000000L) {
        i = 2;
      } else if (l3 <= 35000000L) {
        i = 3;
      } else if (l3 <= 40000000L) {
        i = 4;
      } else if (l3 <= 50000000L) {
        i = 5;
      } else if (l3 <= 60000000L) {
        i = 6;
      } else if (l3 <= 70000000L) {
        i = 7;
      } else if (l3 <= 80000000L) {
        i = 8;
      } else {
        i = 9;
      }
    }
    label361:
    ArrayList localArrayList = new ArrayList();
    IDKey localIDKey = new IDKey();
    localIDKey.SetID(703);
    if (k == 1)
    {
      i = 3;
      localIDKey.SetID(i);
      localIDKey.SetValue(l1);
      localIDKey = new IDKey();
      localIDKey.SetID(703);
      if (k != 1) {
        break label512;
      }
      i = 4;
      label431:
      localIDKey.SetID(i);
      localIDKey.SetValue(l2);
      localIDKey = new IDKey();
      localIDKey.SetID(703);
      if (k != 1) {
        break label517;
      }
    }
    label512:
    label517:
    for (int i = 5;; i = 2)
    {
      localIDKey.SetID(i);
      localIDKey.SetValue(j);
      localArrayList.add(localIDKey);
      g.paX.b(localArrayList, false);
      GMTrace.o(18855443300352L, 140484);
      return;
      i = 0;
      break;
      i = 1;
      break label431;
    }
  }
  
  public final void d(final JSONArray paramJSONArray)
  {
    GMTrace.i(17706807984128L, 131926);
    this.iFv.j(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17708284379136L, 131937);
        b.this.iFs = paramJSONArray;
        b.this.iFr = true;
        GMTrace.o(17708284379136L, 131937);
      }
    });
    GMTrace.o(17706807984128L, 131926);
  }
  
  public final boolean d(Canvas paramCanvas)
  {
    GMTrace.i(17843575848960L, 132945);
    this.iFr = false;
    if ((this.iFs == null) || (this.iFs.length() == 0))
    {
      GMTrace.o(17843575848960L, 132945);
      return false;
    }
    long l1 = this.iFA;
    long l2 = System.nanoTime();
    String str1 = this.iFw;
    if (l1 != 0L) {
      com.tencent.mm.plugin.appbrand.collector.c.aL(str1, "before_draw_actions");
    }
    d locald = this.iFt;
    locald.iFK.clear();
    locald.iFL.clear();
    locald.iFI.reset();
    locald.iFJ.reset();
    locald.iFI.setStyle(Paint.Style.STROKE);
    locald.iFJ.setStyle(Paint.Style.FILL);
    locald.iFI.setAntiAlias(true);
    locald.iFJ.setAntiAlias(true);
    locald.iFI.setStrokeWidth(com.tencent.mm.plugin.appbrand.n.c.jF(1));
    locald.iFJ.setStrokeWidth(com.tencent.mm.plugin.appbrand.n.c.jF(1));
    int i = 0;
    while (i < this.iFs.length())
    {
      Object localObject2 = this.iFs.optJSONObject(i);
      if (localObject2 != null) {}
      try
      {
        Object localObject1 = this.iFu;
        locald = this.iFt;
        String str2 = ((JSONObject)localObject2).optString("method");
        localObject2 = ((JSONObject)localObject2).optJSONArray("data");
        localObject1 = (com.tencent.mm.plugin.appbrand.canvas.a.d)((c)localObject1).iFH.get(str2);
        if (localObject1 != null) {
          ((com.tencent.mm.plugin.appbrand.canvas.a.d)localObject1).a(locald, paramCanvas, (JSONArray)localObject2);
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.DrawActionDelegateImpl", "drawAction error, exception : %s", new Object[] { localException });
        }
      }
      i += 1;
    }
    if (l1 != 0L)
    {
      com.tencent.mm.plugin.appbrand.collector.c.aL(str1, "after_draw_actions");
      com.tencent.mm.plugin.appbrand.collector.c.print(str1);
      long l3 = System.nanoTime();
      this.iFC = (l3 - l2 + this.iFC);
      this.iFB = (l3 - l1 + this.iFB);
      this.mCount += 1;
    }
    l1 = this.iFD;
    l2 = System.currentTimeMillis();
    if (l1 != 0L) {
      f.aI(l2 - l1);
    }
    if (!this.iFx) {
      this.iFD = l2;
    }
    GMTrace.o(17843575848960L, 132945);
    return true;
  }
  
  public final void e(final JSONArray paramJSONArray)
  {
    GMTrace.i(17706942201856L, 131927);
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0))
    {
      GMTrace.o(17706942201856L, 131927);
      return;
    }
    this.iFv.j(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18867925549056L, 140577);
        if (b.this.iFs == null) {
          b.this.iFs = paramJSONArray;
        }
        for (;;)
        {
          b.this.iFr = true;
          GMTrace.o(18867925549056L, 140577);
          return;
          int i = 0;
          while (i < paramJSONArray.length())
          {
            b.this.iFs.put(paramJSONArray.opt(i));
            i += 1;
          }
        }
      }
    });
    GMTrace.o(17706942201856L, 131927);
  }
  
  public final int getType()
  {
    GMTrace.i(19999649431552L, 149009);
    int i = this.iFv.getType();
    GMTrace.o(19999649431552L, 149009);
    return i;
  }
  
  public final boolean isPaused()
  {
    GMTrace.i(18855040647168L, 140481);
    boolean bool = this.iFx;
    GMTrace.o(18855040647168L, 140481);
    return bool;
  }
  
  public final void j(Runnable paramRunnable)
  {
    GMTrace.i(17707344855040L, 131930);
    if (equals(this.iFv))
    {
      GMTrace.o(17707344855040L, 131930);
      return;
    }
    this.iFv.j(paramRunnable);
    GMTrace.o(17707344855040L, 131930);
  }
  
  public final void onPause()
  {
    GMTrace.i(18854772211712L, 140479);
    this.iFA = 0L;
    this.iFv.j(this.iFy);
    GMTrace.o(18854772211712L, 140479);
  }
  
  public final void onResume()
  {
    GMTrace.i(18854906429440L, 140480);
    this.iFv.j(this.iFz);
    GMTrace.o(18854906429440L, 140480);
  }
  
  public final void os(String paramString)
  {
    GMTrace.i(17707210637312L, 131929);
    this.iFt.gQf = paramString;
    GMTrace.o(17707210637312L, 131929);
  }
  
  public final void ot(String paramString)
  {
    GMTrace.i(18855174864896L, 140482);
    this.iFw = paramString;
    GMTrace.o(18855174864896L, 140482);
  }
  
  public final void setStartTime(long paramLong)
  {
    GMTrace.i(18855309082624L, 140483);
    this.iFA = paramLong;
    GMTrace.o(18855309082624L, 140483);
  }
  
  private static final class a
    implements a
  {
    private WeakReference<com.tencent.mm.plugin.appbrand.canvas.widget.a> iFG;
    
    a(com.tencent.mm.plugin.appbrand.canvas.widget.a parama)
    {
      GMTrace.i(19999917867008L, 149011);
      this.iFG = new WeakReference(parama);
      GMTrace.o(19999917867008L, 149011);
    }
    
    public final void invalidate()
    {
      GMTrace.i(20000052084736L, 149012);
      com.tencent.mm.plugin.appbrand.canvas.widget.a locala = (com.tencent.mm.plugin.appbrand.canvas.widget.a)this.iFG.get();
      if (locala == null)
      {
        GMTrace.o(20000052084736L, 149012);
        return;
      }
      locala.TC();
      GMTrace.o(20000052084736L, 149012);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */