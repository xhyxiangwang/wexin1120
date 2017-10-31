package com.tencent.mm.plugin.appbrand.task;

import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedHashMap;

final class c
{
  final String jpU;
  final Class jpV;
  private final Class jpW;
  final LinkedHashMap<String, Integer> jpX;
  final LinkedHashMap<String, AppBrandRemoteTaskController> jpY;
  
  c(Class paramClass1, Class paramClass2)
  {
    GMTrace.i(17273687375872L, 128699);
    this.jpX = new LinkedHashMap();
    this.jpY = new LinkedHashMap();
    this.jpU = paramClass1.getName();
    this.jpV = paramClass1;
    this.jpW = paramClass2;
    GMTrace.o(17273687375872L, 128699);
  }
  
  final void a(String paramString, int paramInt, AppBrandRemoteTaskController paramAppBrandRemoteTaskController)
  {
    GMTrace.i(17273955811328L, 128701);
    this.jpX.put(paramString, Integer.valueOf(paramInt));
    this.jpY.put(paramString, paramAppBrandRemoteTaskController);
    GMTrace.o(17273955811328L, 128701);
  }
  
  final AppBrandRemoteTaskController rU(String paramString)
  {
    GMTrace.i(17274090029056L, 128702);
    paramString = (AppBrandRemoteTaskController)this.jpY.get(paramString);
    GMTrace.o(17274090029056L, 128702);
    return paramString;
  }
  
  final void yh()
  {
    GMTrace.i(17273821593600L, 128700);
    if (this.jpW == null)
    {
      GMTrace.o(17273821593600L, 128700);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.setClass(ab.getContext(), this.jpW);
    ab.getContext().sendBroadcast(localIntent);
    GMTrace.o(17273821593600L, 128700);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/task/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */