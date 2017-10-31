package com.tencent.mm.plugin.appbrand.canvas.widget;

import android.graphics.Canvas;
import com.tencent.mm.plugin.appbrand.collector.d;
import org.json.JSONArray;

public abstract interface a
  extends b, d
{
  public abstract void TC();
  
  public abstract void TD();
  
  public abstract void d(JSONArray paramJSONArray);
  
  public abstract boolean d(Canvas paramCanvas);
  
  public abstract void e(JSONArray paramJSONArray);
  
  public abstract int getType();
  
  public abstract void j(Runnable paramRunnable);
  
  public abstract void os(String paramString);
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/widget/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */