package com.tencent.mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.widget.input.l;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Constructor;

public abstract class b
{
  public a jHf;
  
  public b()
  {
    GMTrace.i(10120821997568L, 75406);
    GMTrace.o(10120821997568L, 75406);
  }
  
  public abstract View WR();
  
  public final a cW(boolean paramBoolean)
  {
    GMTrace.i(17285632753664L, 128788);
    if (this.jHf != null)
    {
      localObject = this.jHf;
      GMTrace.o(17285632753664L, 128788);
      return (a)localObject;
    }
    if (WR() == null)
    {
      GMTrace.o(17285632753664L, 128788);
      return null;
    }
    l locall = l.bQ(WR());
    if (locall == null)
    {
      GMTrace.o(17285632753664L, 128788);
      return null;
    }
    a locala = a.cc(locall);
    Object localObject = locala;
    if (locala == null)
    {
      localObject = locala;
      if (paramBoolean)
      {
        localObject = new a(WR().getContext());
        locall.h((View)localObject, true);
      }
    }
    GMTrace.o(17285632753664L, 128788);
    return (a)localObject;
  }
  
  public final <T extends i> T q(Class<T> paramClass)
  {
    GMTrace.i(17285498535936L, 128787);
    a locala = cW(true);
    this.jHf = locala;
    if (locala == null)
    {
      GMTrace.o(17285498535936L, 128787);
      return null;
    }
    if (!paramClass.isInstance(locala.jHD)) {}
    try
    {
      Object localObject = (i)paramClass.getDeclaredConstructor(new Class[] { Context.class }).newInstance(new Object[] { locala.getContext() });
      if ((locala.jHD == null) || (localObject == null) || (localObject.getClass() != locala.jHD.getClass()))
      {
        if (locala.jHD != null) {
          locala.jHD.adg();
        }
        locala.jHD = ((i)localObject);
        if (locala.jHD != null) {
          locala.jHD.b(locala);
        }
        if ((locala.jHE != null) && (locala.jHD != null))
        {
          localObject = locala.jHD.getView();
          if (localObject != null) {
            break label181;
          }
        }
      }
      for (;;)
      {
        paramClass = locala.jHD;
        GMTrace.o(17285498535936L, 128787);
        return paramClass;
        label181:
        locala.jHE.removeAllViews();
        locala.adk();
        localObject = new FrameLayout.LayoutParams(-1, -2);
        ((FrameLayout.LayoutParams)localObject).gravity = 17;
        locala.jHE.addView(locala.jHD.getView(), (ViewGroup.LayoutParams)localObject);
      }
      return null;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.AppBrandBottomPickerInvokeHandler", "newInstance class[%s], exp[%s]", new Object[] { paramClass.getSimpleName(), localException });
      GMTrace.o(17285498535936L, 128787);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/picker/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */