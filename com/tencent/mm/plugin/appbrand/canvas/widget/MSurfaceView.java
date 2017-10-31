package com.tencent.mm.plugin.appbrand.canvas.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View.OnAttachStateChangeListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.b;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;

public class MSurfaceView
  extends SurfaceView
  implements SurfaceHolder.Callback, a
{
  public final b iGc;
  private final Set<View.OnAttachStateChangeListener> iGd;
  private SurfaceHolder iGe;
  private ae iGf;
  private Runnable iGg;
  private volatile boolean pR;
  
  public MSurfaceView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(18855845953536L, 140487);
    this.iGc = new b(this);
    this.iGd = new LinkedHashSet();
    this.iGg = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17701707710464L, 131888);
        if (MSurfaceView.a(MSurfaceView.this))
        {
          GMTrace.o(17701707710464L, 131888);
          return;
        }
        Canvas localCanvas = MSurfaceView.b(MSurfaceView.this).lockCanvas();
        if (localCanvas == null)
        {
          GMTrace.o(17701707710464L, 131888);
          return;
        }
        localCanvas.drawColor(-1);
        MSurfaceView.this.d(localCanvas);
        MSurfaceView.b(MSurfaceView.this).unlockCanvasAndPost(localCanvas);
        GMTrace.o(17701707710464L, 131888);
      }
    };
    init();
    GMTrace.o(18855845953536L, 140487);
  }
  
  public MSurfaceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(17702244581376L, 131892);
    this.iGc = new b(this);
    this.iGd = new LinkedHashSet();
    this.iGg = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17701707710464L, 131888);
        if (MSurfaceView.a(MSurfaceView.this))
        {
          GMTrace.o(17701707710464L, 131888);
          return;
        }
        Canvas localCanvas = MSurfaceView.b(MSurfaceView.this).lockCanvas();
        if (localCanvas == null)
        {
          GMTrace.o(17701707710464L, 131888);
          return;
        }
        localCanvas.drawColor(-1);
        MSurfaceView.this.d(localCanvas);
        MSurfaceView.b(MSurfaceView.this).unlockCanvasAndPost(localCanvas);
        GMTrace.o(17701707710464L, 131888);
      }
    };
    init();
    GMTrace.o(17702244581376L, 131892);
  }
  
  public MSurfaceView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(17702378799104L, 131893);
    this.iGc = new b(this);
    this.iGd = new LinkedHashSet();
    this.iGg = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17701707710464L, 131888);
        if (MSurfaceView.a(MSurfaceView.this))
        {
          GMTrace.o(17701707710464L, 131888);
          return;
        }
        Canvas localCanvas = MSurfaceView.b(MSurfaceView.this).lockCanvas();
        if (localCanvas == null)
        {
          GMTrace.o(17701707710464L, 131888);
          return;
        }
        localCanvas.drawColor(-1);
        MSurfaceView.this.d(localCanvas);
        MSurfaceView.b(MSurfaceView.this).unlockCanvasAndPost(localCanvas);
        GMTrace.o(17701707710464L, 131888);
      }
    };
    init();
    GMTrace.o(17702378799104L, 131893);
  }
  
  private void init()
  {
    GMTrace.i(17702513016832L, 131894);
    this.iGe = getHolder();
    this.iGe.addCallback(this);
    this.iGe.setFormat(-3);
    Paint localPaint = new Paint();
    localPaint.setColor(-1);
    this.iGc.iFt.iFN = localPaint;
    GMTrace.o(17702513016832L, 131894);
  }
  
  public final void TC()
  {
    GMTrace.i(18856382824448L, 140491);
    j(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18860677791744L, 140523);
        if (MSurfaceView.a(MSurfaceView.this))
        {
          GMTrace.o(18860677791744L, 140523);
          return;
        }
        Canvas localCanvas = MSurfaceView.b(MSurfaceView.this).lockCanvas();
        if (localCanvas == null)
        {
          GMTrace.o(18860677791744L, 140523);
          return;
        }
        localCanvas.drawColor(-1);
        MSurfaceView.this.d(localCanvas);
        MSurfaceView.b(MSurfaceView.this).unlockCanvasAndPost(localCanvas);
        GMTrace.o(18860677791744L, 140523);
      }
    });
    GMTrace.o(18856382824448L, 140491);
  }
  
  public final void TD()
  {
    GMTrace.i(18857053913088L, 140496);
    this.iGc.TD();
    GMTrace.o(18857053913088L, 140496);
  }
  
  public final int TE()
  {
    GMTrace.i(18967649320960L, 141320);
    GMTrace.o(18967649320960L, 141320);
    return 667;
  }
  
  public final int TF()
  {
    GMTrace.i(18967783538688L, 141321);
    GMTrace.o(18967783538688L, 141321);
    return 668;
  }
  
  public final void TG()
  {
    GMTrace.i(18858261872640L, 140505);
    this.iGc.TG();
    GMTrace.o(18858261872640L, 140505);
  }
  
  public void addOnAttachStateChangeListener(View.OnAttachStateChangeListener paramOnAttachStateChangeListener)
  {
    GMTrace.i(18857322348544L, 140498);
    if (this.iGd.contains(paramOnAttachStateChangeListener))
    {
      GMTrace.o(18857322348544L, 140498);
      return;
    }
    this.iGd.add(paramOnAttachStateChangeListener);
    super.addOnAttachStateChangeListener(paramOnAttachStateChangeListener);
    GMTrace.o(18857322348544L, 140498);
  }
  
  public final void d(JSONArray paramJSONArray)
  {
    GMTrace.i(18856785477632L, 140494);
    this.iGc.d(paramJSONArray);
    GMTrace.o(18856785477632L, 140494);
  }
  
  public final boolean d(Canvas paramCanvas)
  {
    GMTrace.i(18856651259904L, 140493);
    boolean bool = this.iGc.d(paramCanvas);
    GMTrace.o(18856651259904L, 140493);
    return bool;
  }
  
  public void draw(Canvas paramCanvas)
  {
    GMTrace.i(17702647234560L, 131895);
    w.i("MicroMsg.MSurfaceView", "draw(%s)", new Object[] { Integer.valueOf(hashCode()) });
    paramCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
    super.draw(paramCanvas);
    GMTrace.o(17702647234560L, 131895);
  }
  
  public final void e(JSONArray paramJSONArray)
  {
    GMTrace.i(18856919695360L, 140495);
    this.iGc.e(paramJSONArray);
    GMTrace.o(18856919695360L, 140495);
  }
  
  public final int getType()
  {
    GMTrace.i(20000723173376L, 149017);
    GMTrace.o(20000723173376L, 149017);
    return 2;
  }
  
  public final boolean isPaused()
  {
    GMTrace.i(18857859219456L, 140502);
    boolean bool = this.iGc.iFx;
    GMTrace.o(18857859219456L, 140502);
    return bool;
  }
  
  public final void j(Runnable paramRunnable)
  {
    GMTrace.i(18856517042176L, 140492);
    if (this.iGf == null)
    {
      GMTrace.o(18856517042176L, 140492);
      return;
    }
    this.iGf.post(paramRunnable);
    GMTrace.o(18856517042176L, 140492);
  }
  
  public final void onPause()
  {
    GMTrace.i(18857590784000L, 140500);
    this.iGc.onPause();
    GMTrace.o(18857590784000L, 140500);
  }
  
  public final void onResume()
  {
    GMTrace.i(18857725001728L, 140501);
    this.iGc.onResume();
    GMTrace.o(18857725001728L, 140501);
  }
  
  public final void os(String paramString)
  {
    GMTrace.i(18857188130816L, 140497);
    this.iGc.os(paramString);
    GMTrace.o(18857188130816L, 140497);
  }
  
  public final void ot(String paramString)
  {
    GMTrace.i(18857993437184L, 140503);
    this.iGc.iFw = paramString;
    GMTrace.o(18857993437184L, 140503);
  }
  
  public void removeOnAttachStateChangeListener(View.OnAttachStateChangeListener paramOnAttachStateChangeListener)
  {
    GMTrace.i(18857456566272L, 140499);
    this.iGd.remove(paramOnAttachStateChangeListener);
    super.removeOnAttachStateChangeListener(paramOnAttachStateChangeListener);
    GMTrace.o(18857456566272L, 140499);
  }
  
  public final void setStartTime(long paramLong)
  {
    GMTrace.i(18858127654912L, 140504);
    this.iGc.iFA = paramLong;
    GMTrace.o(18858127654912L, 140504);
  }
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(18856114388992L, 140489);
    w.i("MicroMsg.MSurfaceView", "surfaceChanged(%s)", new Object[] { Integer.valueOf(hashCode()) });
    GMTrace.o(18856114388992L, 140489);
  }
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    GMTrace.i(18855980171264L, 140488);
    w.i("MicroMsg.MSurfaceView", "surfaceCreated(%s)", new Object[] { Integer.valueOf(hashCode()) });
    this.pR = false;
    if (this.iGf == null)
    {
      paramSurfaceHolder = e.cJ("MSurfaceView#Rending-Thread", -19);
      paramSurfaceHolder.start();
      this.iGf = new ae(paramSurfaceHolder.getLooper());
    }
    GMTrace.o(18855980171264L, 140488);
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    GMTrace.i(18856248606720L, 140490);
    w.i("MicroMsg.MSurfaceView", "surfaceDestroyed(%s)", new Object[] { Integer.valueOf(hashCode()) });
    this.pR = true;
    this.iGf.getLooper().quit();
    this.iGf = null;
    GMTrace.o(18856248606720L, 140490);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/widget/MSurfaceView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */