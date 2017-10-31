package com.tencent.mm.plugin.appbrand.canvas.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.b;
import com.tencent.mm.plugin.appbrand.canvas.f;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;

public class MCanvasView
  extends View
  implements a
{
  public final b iGc;
  private final Set<View.OnAttachStateChangeListener> iGd;
  private Bitmap mBitmap;
  
  public MCanvasView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(17703855194112L, 131904);
    this.iGc = new b(this);
    this.iGd = new LinkedHashSet();
    GMTrace.o(17703855194112L, 131904);
  }
  
  public MCanvasView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(17703989411840L, 131905);
    this.iGc = new b(this);
    this.iGd = new LinkedHashSet();
    GMTrace.o(17703989411840L, 131905);
  }
  
  public MCanvasView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(17704123629568L, 131906);
    this.iGc = new b(this);
    this.iGd = new LinkedHashSet();
    GMTrace.o(17704123629568L, 131906);
  }
  
  public final void TC()
  {
    GMTrace.i(17704526282752L, 131909);
    postInvalidate();
    GMTrace.o(17704526282752L, 131909);
  }
  
  public final void TD()
  {
    GMTrace.i(18863362146304L, 140543);
    this.iGc.TD();
    GMTrace.o(18863362146304L, 140543);
  }
  
  public final int TE()
  {
    GMTrace.i(18968454627328L, 141326);
    GMTrace.o(18968454627328L, 141326);
    return 685;
  }
  
  public final int TF()
  {
    GMTrace.i(18968588845056L, 141327);
    GMTrace.o(18968588845056L, 141327);
    return 684;
  }
  
  public final void TG()
  {
    GMTrace.i(18864570105856L, 140552);
    this.iGc.TG();
    GMTrace.o(18864570105856L, 140552);
  }
  
  public void addOnAttachStateChangeListener(View.OnAttachStateChangeListener paramOnAttachStateChangeListener)
  {
    GMTrace.i(18863630581760L, 140545);
    if (this.iGd.contains(paramOnAttachStateChangeListener))
    {
      GMTrace.o(18863630581760L, 140545);
      return;
    }
    this.iGd.add(paramOnAttachStateChangeListener);
    super.addOnAttachStateChangeListener(paramOnAttachStateChangeListener);
    GMTrace.o(18863630581760L, 140545);
  }
  
  public final void d(JSONArray paramJSONArray)
  {
    GMTrace.i(18863093710848L, 140541);
    this.iGc.d(paramJSONArray);
    GMTrace.o(18863093710848L, 140541);
  }
  
  public final boolean d(Canvas paramCanvas)
  {
    GMTrace.i(18862959493120L, 140540);
    boolean bool = this.iGc.d(paramCanvas);
    GMTrace.o(18862959493120L, 140540);
    return bool;
  }
  
  public final void e(JSONArray paramJSONArray)
  {
    GMTrace.i(18863227928576L, 140542);
    this.iGc.e(paramJSONArray);
    GMTrace.o(18863227928576L, 140542);
  }
  
  public final int getType()
  {
    GMTrace.i(20001260044288L, 149021);
    GMTrace.o(20001260044288L, 149021);
    return 3;
  }
  
  public final boolean isPaused()
  {
    GMTrace.i(18864167452672L, 140549);
    boolean bool = this.iGc.iFx;
    GMTrace.o(18864167452672L, 140549);
    return bool;
  }
  
  public final void j(Runnable paramRunnable)
  {
    GMTrace.i(17704660500480L, 131910);
    post(paramRunnable);
    GMTrace.o(17704660500480L, 131910);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(17704257847296L, 131907);
    int i = getMeasuredWidth();
    int j = getMeasuredHeight();
    if ((i <= 0) || (j <= 0))
    {
      GMTrace.o(17704257847296L, 131907);
      return;
    }
    if ((this.mBitmap == null) || (this.mBitmap.isRecycled()) || (this.mBitmap.getWidth() != i) || (this.mBitmap.getHeight() != j))
    {
      if ((this.mBitmap != null) && (!this.mBitmap.isRecycled())) {
        this.mBitmap.recycle();
      }
      this.mBitmap = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
      w.v("MicroMsg.MCanvasView", "create a new bitmap(id : %s, w : %s, h : %s)", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(j) });
    }
    if (this.mBitmap == null)
    {
      w.d("MicroMsg.MCanvasView", "bitmap is null.");
      GMTrace.o(17704257847296L, 131907);
      return;
    }
    this.mBitmap.eraseColor(0);
    f localf = new f(this.mBitmap);
    d(localf);
    paramCanvas.drawBitmap(localf.mBitmap, 0.0F, 0.0F, null);
    GMTrace.o(17704257847296L, 131907);
  }
  
  public final void onPause()
  {
    GMTrace.i(18863899017216L, 140547);
    this.iGc.onPause();
    GMTrace.o(18863899017216L, 140547);
  }
  
  public final void onResume()
  {
    GMTrace.i(18864033234944L, 140548);
    this.iGc.onResume();
    GMTrace.o(18864033234944L, 140548);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(17704392065024L, 131908);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.mBitmap != null) && (!this.mBitmap.isRecycled())) {
      this.mBitmap.recycle();
    }
    paramInt1 = getMeasuredWidth();
    paramInt2 = getMeasuredHeight();
    if ((paramInt1 > 0) && (paramInt2 > 0))
    {
      this.mBitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
      w.v("MicroMsg.MCanvasView", "onSizeChanged, create a new bitmap(id : %s, w : %s, h : %s)", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    }
    GMTrace.o(17704392065024L, 131908);
  }
  
  public final void os(String paramString)
  {
    GMTrace.i(18863496364032L, 140544);
    this.iGc.os(paramString);
    GMTrace.o(18863496364032L, 140544);
  }
  
  public final void ot(String paramString)
  {
    GMTrace.i(18864301670400L, 140550);
    this.iGc.iFw = paramString;
    GMTrace.o(18864301670400L, 140550);
  }
  
  public void removeOnAttachStateChangeListener(View.OnAttachStateChangeListener paramOnAttachStateChangeListener)
  {
    GMTrace.i(18863764799488L, 140546);
    this.iGd.remove(paramOnAttachStateChangeListener);
    super.removeOnAttachStateChangeListener(paramOnAttachStateChangeListener);
    GMTrace.o(18863764799488L, 140546);
  }
  
  public final void setStartTime(long paramLong)
  {
    GMTrace.i(18864435888128L, 140551);
    this.iGc.iFA = paramLong;
    GMTrace.o(18864435888128L, 140551);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/widget/MCanvasView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */