package com.tencent.mm.plugin.appbrand.canvas.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.b;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;

public class MHardwareAccelerateDrawableView
  extends View
  implements a
{
  public final b iGc;
  private final Set<View.OnAttachStateChangeListener> iGd;
  
  public MHardwareAccelerateDrawableView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(17697815396352L, 131859);
    this.iGc = new b(this);
    this.iGd = new LinkedHashSet();
    setLayerType(2, null);
    GMTrace.o(17697815396352L, 131859);
  }
  
  public MHardwareAccelerateDrawableView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(17697949614080L, 131860);
    this.iGc = new b(this);
    this.iGd = new LinkedHashSet();
    setLayerType(2, null);
    GMTrace.o(17697949614080L, 131860);
  }
  
  public MHardwareAccelerateDrawableView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(17698083831808L, 131861);
    this.iGc = new b(this);
    this.iGd = new LinkedHashSet();
    setLayerType(2, null);
    GMTrace.o(17698083831808L, 131861);
  }
  
  public final void TC()
  {
    GMTrace.i(17698352267264L, 131863);
    postInvalidate();
    GMTrace.o(17698352267264L, 131863);
  }
  
  public final void TD()
  {
    GMTrace.i(18859201396736L, 140512);
    this.iGc.TD();
    GMTrace.o(18859201396736L, 140512);
  }
  
  public final int TE()
  {
    GMTrace.i(18967917756416L, 141322);
    GMTrace.o(18967917756416L, 141322);
    return 667;
  }
  
  public final int TF()
  {
    GMTrace.i(18968051974144L, 141323);
    GMTrace.o(18968051974144L, 141323);
    return 668;
  }
  
  public final void TG()
  {
    GMTrace.i(18860409356288L, 140521);
    this.iGc.TG();
    GMTrace.o(18860409356288L, 140521);
  }
  
  public void addOnAttachStateChangeListener(View.OnAttachStateChangeListener paramOnAttachStateChangeListener)
  {
    GMTrace.i(18859469832192L, 140514);
    if (this.iGd.contains(paramOnAttachStateChangeListener))
    {
      GMTrace.o(18859469832192L, 140514);
      return;
    }
    this.iGd.add(paramOnAttachStateChangeListener);
    super.addOnAttachStateChangeListener(paramOnAttachStateChangeListener);
    GMTrace.o(18859469832192L, 140514);
  }
  
  public final void d(JSONArray paramJSONArray)
  {
    GMTrace.i(18858932961280L, 140510);
    this.iGc.d(paramJSONArray);
    GMTrace.o(18858932961280L, 140510);
  }
  
  public final boolean d(Canvas paramCanvas)
  {
    GMTrace.i(18858798743552L, 140509);
    boolean bool = this.iGc.d(paramCanvas);
    GMTrace.o(18858798743552L, 140509);
    return bool;
  }
  
  public final void e(JSONArray paramJSONArray)
  {
    GMTrace.i(18859067179008L, 140511);
    this.iGc.e(paramJSONArray);
    GMTrace.o(18859067179008L, 140511);
  }
  
  public final int getType()
  {
    GMTrace.i(20000857391104L, 149018);
    GMTrace.o(20000857391104L, 149018);
    return 0;
  }
  
  public final boolean isPaused()
  {
    GMTrace.i(18860006703104L, 140518);
    boolean bool = this.iGc.iFx;
    GMTrace.o(18860006703104L, 140518);
    return bool;
  }
  
  public final void j(Runnable paramRunnable)
  {
    GMTrace.i(17698486484992L, 131864);
    post(paramRunnable);
    GMTrace.o(17698486484992L, 131864);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(17698218049536L, 131862);
    d(paramCanvas);
    GMTrace.o(17698218049536L, 131862);
  }
  
  public final void onPause()
  {
    GMTrace.i(18859738267648L, 140516);
    this.iGc.onPause();
    GMTrace.o(18859738267648L, 140516);
  }
  
  public final void onResume()
  {
    GMTrace.i(18859872485376L, 140517);
    this.iGc.onResume();
    GMTrace.o(18859872485376L, 140517);
  }
  
  public final void os(String paramString)
  {
    GMTrace.i(18859335614464L, 140513);
    this.iGc.os(paramString);
    GMTrace.o(18859335614464L, 140513);
  }
  
  public final void ot(String paramString)
  {
    GMTrace.i(18860140920832L, 140519);
    this.iGc.iFw = paramString;
    GMTrace.o(18860140920832L, 140519);
  }
  
  public void removeOnAttachStateChangeListener(View.OnAttachStateChangeListener paramOnAttachStateChangeListener)
  {
    GMTrace.i(18859604049920L, 140515);
    this.iGd.remove(paramOnAttachStateChangeListener);
    super.removeOnAttachStateChangeListener(paramOnAttachStateChangeListener);
    GMTrace.o(18859604049920L, 140515);
  }
  
  public final void setStartTime(long paramLong)
  {
    GMTrace.i(18860275138560L, 140520);
    this.iGc.iFA = paramLong;
    GMTrace.o(18860275138560L, 140520);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/widget/MHardwareAccelerateDrawableView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */