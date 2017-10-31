package com.tencent.mm.plugin.appbrand.dynamic.jsapi.core;

import android.os.Parcelable;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.dynamic.debugger.DebuggerInfo;
import com.tencent.mm.plugin.appbrand.dynamic.launching.WidgetRuntimeConfig;
import com.tencent.mm.plugin.appbrand.dynamic.launching.WidgetSysConfig;

public abstract interface MiniJsApiFwContext
  extends Parcelable
{
  public abstract WxaPkgWrappingInfo UJ();
  
  public abstract WxaPkgWrappingInfo UK();
  
  public abstract int UL();
  
  public abstract int UM();
  
  public abstract byte[] UN();
  
  public abstract int UO();
  
  public abstract DebuggerInfo UP();
  
  public abstract WidgetSysConfig UQ();
  
  public abstract WidgetRuntimeConfig UR();
  
  public abstract String getAppId();
  
  public abstract String getId();
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/jsapi/core/MiniJsApiFwContext.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */