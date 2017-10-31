package com.tencent.mm.plugin.appbrand.jsapi.video.danmu;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DanmuView
  extends View
{
  public int jdR;
  public int jdS;
  public int jdT;
  public float jdU;
  public float jdV;
  private boolean jdW;
  private boolean jdX;
  public c jdY;
  public HashMap<Integer, ArrayList<d>> jdZ;
  public final Deque<d> jea;
  public List<d> jeb;
  private int[] jec;
  private volatile boolean jed;
  private LinkedList<Long> jee;
  private Paint jef;
  private long jeg;
  private LinkedList<Float> jeh;
  private final Context mContext;
  public volatile int status;
  
  public DanmuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(17350728351744L, 129273);
    GMTrace.o(17350728351744L, 129273);
  }
  
  public DanmuView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(17350862569472L, 129274);
    this.jdR = 5;
    this.jdS = 500;
    this.jdT = 10;
    this.jdU = 0.0F;
    this.jdV = 0.6F;
    this.jdW = false;
    this.jdX = false;
    this.jea = new LinkedList();
    this.jeb = new LinkedList();
    this.status = 3;
    this.jeg = 0L;
    this.mContext = paramContext;
    GMTrace.o(17350862569472L, 129274);
  }
  
  private void XE()
  {
    int j = 0;
    GMTrace.i(17351265222656L, 129277);
    this.jec = new int[this.jdR];
    float f1 = b.bM(this.mContext);
    float f2 = getHeight();
    f2 = this.jdU * f2;
    int i = 0;
    while (i < this.jdR)
    {
      this.jec[i] = ((int)((i + 1) * f1 + f2 - 3.0F * f1 / 4.0F));
      i += 1;
    }
    if (this.jdX)
    {
      this.jeh.clear();
      this.jeh.add(Float.valueOf(f2));
      i = j;
      while (i < this.jdR)
      {
        this.jeh.add(Float.valueOf((i + 1) * f1 + f2));
        i += 1;
      }
    }
    GMTrace.o(17351265222656L, 129277);
  }
  
  private double XI()
  {
    GMTrace.i(17352607399936L, 129287);
    long l = System.nanoTime();
    this.jee.addLast(Long.valueOf(l));
    double d = (l - ((Long)this.jee.getFirst()).longValue()) / 1.0E9D;
    if (this.jee.size() > 100) {
      this.jee.removeFirst();
    }
    if (d > 0.0D)
    {
      d = this.jee.size() / d;
      GMTrace.o(17352607399936L, 129287);
      return d;
    }
    GMTrace.o(17352607399936L, 129287);
    return 0.0D;
  }
  
  private int b(d paramd)
  {
    GMTrace.i(17351533658112L, 129279);
    int i = 0;
    try
    {
      while (i < this.jdR)
      {
        int j = (i + 0) % this.jdR;
        ArrayList localArrayList = (ArrayList)this.jdZ.get(Integer.valueOf(j));
        int k = localArrayList.size();
        if (k == 0)
        {
          GMTrace.o(17351533658112L, 129279);
          return j;
        }
        if (localArrayList.size() <= this.jdT)
        {
          boolean bool = paramd.a((d)localArrayList.get(localArrayList.size() - 1));
          if (!bool)
          {
            GMTrace.o(17351533658112L, 129279);
            return j;
          }
        }
        i += 1;
      }
      return -1;
    }
    catch (Exception paramd)
    {
      w.w("MicroMsg.DanmuView", "findVacant,Exception:" + paramd.getMessage());
      GMTrace.o(17351533658112L, 129279);
    }
  }
  
  private static boolean isMainThread()
  {
    GMTrace.i(17352741617664L, 129288);
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      GMTrace.o(17352741617664L, 129288);
      return true;
    }
    GMTrace.o(17352741617664L, 129288);
    return false;
  }
  
  public final void XD()
  {
    GMTrace.i(17351131004928L, 129276);
    this.jdZ = new HashMap(this.jdR);
    int i = 0;
    while (i < this.jdR)
    {
      ArrayList localArrayList = new ArrayList(this.jdT);
      this.jdZ.put(Integer.valueOf(i), localArrayList);
      i += 1;
    }
    XE();
    GMTrace.o(17351131004928L, 129276);
  }
  
  public final void XF()
  {
    GMTrace.i(17351802093568L, 129281);
    if (isMainThread())
    {
      this.jed = true;
      GMTrace.o(17351802093568L, 129281);
      return;
    }
    post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17349923045376L, 129267);
        DanmuView.a(DanmuView.this, true);
        GMTrace.o(17349923045376L, 129267);
      }
    });
    GMTrace.o(17351802093568L, 129281);
  }
  
  public final void XG()
  {
    GMTrace.i(17351936311296L, 129282);
    if (isMainThread())
    {
      this.jed = false;
      invalidate();
      GMTrace.o(17351936311296L, 129282);
      return;
    }
    post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17350594134016L, 129272);
        DanmuView.a(DanmuView.this, false);
        DanmuView.this.invalidate();
        GMTrace.o(17350594134016L, 129272);
      }
    });
    GMTrace.o(17351936311296L, 129282);
  }
  
  public final void XH()
  {
    GMTrace.i(17352473182208L, 129286);
    if ((this.jdZ != null) && (!this.jdZ.isEmpty())) {
      this.jdZ.clear();
    }
    synchronized (this.jea)
    {
      if (!this.jea.isEmpty()) {
        this.jea.clear();
      }
      GMTrace.o(17352473182208L, 129286);
      return;
    }
  }
  
  public final void hide()
  {
    GMTrace.i(17352338964480L, 129285);
    this.status = 4;
    invalidate();
    GMTrace.o(17352338964480L, 129285);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(17351399440384L, 129278);
    super.onDraw(paramCanvas);
    if (this.jed)
    {
      w.i("MicroMsg.DanmuView", "inTransition");
      GMTrace.o(17351399440384L, 129278);
      return;
    }
    if (this.status == 1) {}
    for (;;)
    {
      int i;
      Object localObject1;
      try
      {
        paramCanvas.drawColor(0);
        i = 0;
        if (i >= this.jdZ.size()) {
          break label169;
        }
        localObject1 = ((ArrayList)this.jdZ.get(Integer.valueOf(i))).iterator();
        if (!((Iterator)localObject1).hasNext()) {
          break label722;
        }
        ??? = (d)((Iterator)localObject1).next();
        if (((d)???).XA())
        {
          ((Iterator)localObject1).remove();
          continue;
        }
        ((d)???).b(paramCanvas, false);
      }
      catch (Exception paramCanvas)
      {
        w.w("MicroMsg.DanmuView", "STATUS_RUNNING onDraw e=%s", new Object[] { paramCanvas });
        invalidate();
        GMTrace.o(17351399440384L, 129278);
        return;
      }
      continue;
      label169:
      if (System.currentTimeMillis() - this.jeg > this.jdS) {
        this.jeg = System.currentTimeMillis();
      }
      float f;
      synchronized (this.jea)
      {
        if (this.jea.size() > 0)
        {
          localObject1 = (d)this.jea.getFirst();
          i = this.jdY.Gn();
          while ((localObject1 != null) && (((d)localObject1).iK(i)))
          {
            this.jea.pollFirst();
            localObject1 = (d)this.jea.getFirst();
          }
          if ((localObject1 != null) && (((d)localObject1).iJ(i)))
          {
            i = b((d)localObject1);
            if (i >= 0)
            {
              ((d)localObject1).bs(paramCanvas.getWidth() - 2, this.jec[i]);
              ((d)localObject1).b(paramCanvas, false);
              ((ArrayList)this.jdZ.get(Integer.valueOf(i))).add(localObject1);
              this.jea.pollFirst();
            }
          }
        }
        if ((this.jdW) && (this.jee != null))
        {
          i = (int)XI();
          paramCanvas.drawText("FPS:" + i, 5.0F, 20.0F, this.jef);
        }
        if ((!this.jdX) || (this.jeh == null)) {
          continue;
        }
        localObject1 = this.jeh.iterator();
        if (!((Iterator)localObject1).hasNext()) {
          continue;
        }
        f = ((Float)((Iterator)localObject1).next()).floatValue();
        paramCanvas.drawLine(0.0F, f, getWidth(), f, this.jef);
      }
      if (this.status == 2) {
        try
        {
          paramCanvas.drawColor(0);
          i = 0;
          if (i < this.jdZ.size())
          {
            localObject1 = ((ArrayList)this.jdZ.get(Integer.valueOf(i))).iterator();
            while (((Iterator)localObject1).hasNext())
            {
              ((d)((Iterator)localObject1).next()).b(paramCanvas, true);
              continue;
              invalidate();
            }
          }
        }
        catch (Exception paramCanvas)
        {
          w.w("MicroMsg.DanmuView", "STATUS_PAUSE onDraw e=%s", new Object[] { paramCanvas });
        }
      }
      for (;;)
      {
        GMTrace.o(17351399440384L, 129278);
        return;
        i += 1;
        break;
        if ((this.jdW) && (this.jee != null))
        {
          i = (int)XI();
          paramCanvas.drawText("FPS:" + i, 5.0F, 20.0F, this.jef);
        }
        if ((this.jdX) && (this.jeh != null))
        {
          localObject1 = this.jeh.iterator();
          while (((Iterator)localObject1).hasNext())
          {
            f = ((Float)((Iterator)localObject1).next()).floatValue();
            paramCanvas.drawLine(0.0F, f, getWidth(), f, this.jef);
          }
        }
      }
      label722:
      i += 1;
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(17351667875840L, 129280);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    XE();
    GMTrace.o(17351667875840L, 129280);
  }
  
  public final void pause()
  {
    GMTrace.i(17352204746752L, 129284);
    this.status = 2;
    invalidate();
    GMTrace.o(17352204746752L, 129284);
  }
  
  public final void prepare()
  {
    GMTrace.i(17350996787200L, 129275);
    float f1 = this.jdU;
    float f2 = this.jdV;
    if (f1 >= f2) {
      throw new IllegalArgumentException("start_Y_offset must < end_Y_offset");
    }
    if ((f1 < 0.0F) || (f1 >= 1.0F) || (f2 < 0.0F) || (f2 > 1.0F)) {
      throw new IllegalArgumentException("start_Y_offset and end_Y_offset must between 0 and 1)");
    }
    setBackgroundColor(0);
    setDrawingCacheBackgroundColor(0);
    XD();
    GMTrace.o(17350996787200L, 129275);
  }
  
  public final void show()
  {
    GMTrace.i(17352070529024L, 129283);
    this.status = 1;
    invalidate();
    GMTrace.o(17352070529024L, 129283);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/video/danmu/DanmuView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */