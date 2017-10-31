package com.tencent.mm.plugin.appbrand.dynamic.jsapi.core;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.b;
import com.tencent.mm.ipcinvoker.e;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.dynamic.debugger.DebuggerInfo;
import com.tencent.mm.plugin.appbrand.dynamic.i.a;
import com.tencent.mm.plugin.appbrand.dynamic.i.a.2;
import com.tencent.mm.plugin.appbrand.dynamic.i.a.d;
import com.tencent.mm.plugin.appbrand.dynamic.i.a.e;
import com.tencent.mm.plugin.appbrand.dynamic.i.a.f;
import com.tencent.mm.plugin.appbrand.dynamic.i.d;
import com.tencent.mm.plugin.appbrand.dynamic.launching.WidgetRuntimeConfig;
import com.tencent.mm.plugin.appbrand.dynamic.launching.WidgetSysConfig;
import com.tencent.mm.protocal.c.brv;
import com.tencent.mm.protocal.c.lq;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import junit.framework.Assert;

public final class MiniJsApiFramework
{
  public static MiniJsApiFwContextImpl a(String paramString1, String paramString2, WxaPkgWrappingInfo paramWxaPkgWrappingInfo, d paramd)
  {
    GMTrace.i(19932809003008L, 148511);
    w.i("MicroMsg.MiniJsApiFramework", "prepare(%s)", new Object[] { paramString1 });
    WxaPkgWrappingInfo localWxaPkgWrappingInfo = (WxaPkgWrappingInfo)e.a("com.tencent.mm", null, a.d.class);
    if (localWxaPkgWrappingInfo == null)
    {
      w.e("MicroMsg.MiniJsApiFramework", "getLibPkgInfo return null.");
      GMTrace.o(19932809003008L, 148511);
      return null;
    }
    paramWxaPkgWrappingInfo = new MiniJsApiFwContextImpl(localWxaPkgWrappingInfo, paramWxaPkgWrappingInfo);
    paramWxaPkgWrappingInfo.gQf = paramString1;
    paramWxaPkgWrappingInfo.iqL = paramString2;
    paramWxaPkgWrappingInfo.iLX = paramd.iNc;
    if (paramWxaPkgWrappingInfo.iLX == null) {
      paramWxaPkgWrappingInfo.iLX = new DebuggerInfo();
    }
    paramWxaPkgWrappingInfo.iLY = paramd.iNd;
    paramWxaPkgWrappingInfo.iLZ = paramd.iNe;
    for (;;)
    {
      try
      {
        if ((paramd.iNg == null) || (paramd.iNg.tId == null)) {
          continue;
        }
        paramString1 = paramd.iNg.tId.toByteArray();
        paramWxaPkgWrappingInfo.iLV = paramString1;
      }
      catch (Exception paramString1)
      {
        w.e("MicroMsg.MiniJsApiFramework", bg.f(paramString1));
        continue;
        if (paramd.iNf == null) {
          continue;
        }
        int i = paramd.iNf.tsx;
        continue;
        i = 1;
        continue;
      }
      if (!paramWxaPkgWrappingInfo.iLX.iLg) {
        continue;
      }
      i = 2;
      paramWxaPkgWrappingInfo.iLW = i;
      GMTrace.o(19932809003008L, 148511);
      return paramWxaPkgWrappingInfo;
      paramString1 = new byte[0];
    }
  }
  
  public static String aU(String paramString1, String paramString2)
  {
    GMTrace.i(19932943220736L, 148512);
    paramString1 = paramString1 + "#" + paramString2;
    GMTrace.o(19932943220736L, 148512);
    return paramString1;
  }
  
  private static class MiniJsApiFwContextImpl
    implements MiniJsApiFwContext
  {
    public static final Parcelable.Creator<MiniJsApiFwContextImpl> CREATOR;
    String gQf;
    WxaPkgWrappingInfo iLT;
    WxaPkgWrappingInfo iLU;
    byte[] iLV;
    int iLW;
    DebuggerInfo iLX;
    WidgetSysConfig iLY;
    WidgetRuntimeConfig iLZ;
    String iqL;
    
    static
    {
      GMTrace.i(19939117236224L, 148558);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19939117236224L, 148558);
    }
    
    public MiniJsApiFwContextImpl(Parcel paramParcel)
    {
      GMTrace.i(19937103970304L, 148543);
      ClassLoader localClassLoader = getClass().getClassLoader();
      this.gQf = paramParcel.readString();
      this.iqL = paramParcel.readString();
      this.iLU = ((WxaPkgWrappingInfo)paramParcel.readParcelable(localClassLoader));
      this.iLT = ((WxaPkgWrappingInfo)paramParcel.readParcelable(localClassLoader));
      this.iLV = paramParcel.createByteArray();
      this.iLW = paramParcel.readInt();
      this.iLX = ((DebuggerInfo)paramParcel.readParcelable(localClassLoader));
      this.iLY = ((WidgetSysConfig)paramParcel.readParcelable(localClassLoader));
      this.iLZ = ((WidgetRuntimeConfig)paramParcel.readParcelable(localClassLoader));
      GMTrace.o(19937103970304L, 148543);
    }
    
    public MiniJsApiFwContextImpl(WxaPkgWrappingInfo paramWxaPkgWrappingInfo1, WxaPkgWrappingInfo paramWxaPkgWrappingInfo2)
    {
      GMTrace.i(19937238188032L, 148544);
      Assert.assertNotNull(paramWxaPkgWrappingInfo1);
      Assert.assertNotNull(paramWxaPkgWrappingInfo2);
      this.iLU = paramWxaPkgWrappingInfo1;
      this.iLT = paramWxaPkgWrappingInfo2;
      GMTrace.o(19937238188032L, 148544);
    }
    
    public final WxaPkgWrappingInfo UJ()
    {
      GMTrace.i(19937372405760L, 148545);
      WxaPkgWrappingInfo localWxaPkgWrappingInfo = this.iLT;
      GMTrace.o(19937372405760L, 148545);
      return localWxaPkgWrappingInfo;
    }
    
    public final WxaPkgWrappingInfo UK()
    {
      GMTrace.i(19937506623488L, 148546);
      WxaPkgWrappingInfo localWxaPkgWrappingInfo = this.iLU;
      GMTrace.o(19937506623488L, 148546);
      return localWxaPkgWrappingInfo;
    }
    
    public final int UL()
    {
      GMTrace.i(19937909276672L, 148549);
      if (this.iLT != null)
      {
        int i = this.iLT.iCx;
        GMTrace.o(19937909276672L, 148549);
        return i;
      }
      GMTrace.o(19937909276672L, 148549);
      return 0;
    }
    
    public final int UM()
    {
      GMTrace.i(19938043494400L, 148550);
      if (this.iLT != null)
      {
        int i = this.iLT.iCy;
        GMTrace.o(19938043494400L, 148550);
        return i;
      }
      GMTrace.o(19938043494400L, 148550);
      return 0;
    }
    
    public final byte[] UN()
    {
      GMTrace.i(19938177712128L, 148551);
      byte[] arrayOfByte = this.iLV;
      GMTrace.o(19938177712128L, 148551);
      return arrayOfByte;
    }
    
    public final int UO()
    {
      GMTrace.i(19938311929856L, 148552);
      int i = this.iLW;
      GMTrace.o(19938311929856L, 148552);
      return i;
    }
    
    public final DebuggerInfo UP()
    {
      GMTrace.i(19938446147584L, 148553);
      DebuggerInfo localDebuggerInfo = this.iLX;
      GMTrace.o(19938446147584L, 148553);
      return localDebuggerInfo;
    }
    
    public final WidgetSysConfig UQ()
    {
      GMTrace.i(19938580365312L, 148554);
      WidgetSysConfig localWidgetSysConfig = this.iLY;
      GMTrace.o(19938580365312L, 148554);
      return localWidgetSysConfig;
    }
    
    public final WidgetRuntimeConfig UR()
    {
      GMTrace.i(19938714583040L, 148555);
      WidgetRuntimeConfig localWidgetRuntimeConfig = this.iLZ;
      GMTrace.o(19938714583040L, 148555);
      return localWidgetRuntimeConfig;
    }
    
    public int describeContents()
    {
      GMTrace.i(19938848800768L, 148556);
      GMTrace.o(19938848800768L, 148556);
      return 0;
    }
    
    public final String getAppId()
    {
      GMTrace.i(19937775058944L, 148548);
      String str = this.iqL;
      GMTrace.o(19937775058944L, 148548);
      return str;
    }
    
    public final String getId()
    {
      GMTrace.i(19937640841216L, 148547);
      String str = this.gQf;
      GMTrace.o(19937640841216L, 148547);
      return str;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19938983018496L, 148557);
      paramParcel.writeString(this.gQf);
      paramParcel.writeString(this.iqL);
      paramParcel.writeParcelable(this.iLU, paramInt);
      paramParcel.writeParcelable(this.iLT, paramInt);
      paramParcel.writeByteArray(this.iLV);
      paramParcel.writeInt(this.iLW);
      paramParcel.writeParcelable(this.iLX, paramInt);
      paramParcel.writeParcelable(this.iLY, paramInt);
      paramParcel.writeParcelable(this.iLZ, paramInt);
      GMTrace.o(19938983018496L, 148557);
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(String paramString1, String paramString2, boolean paramBoolean, MiniJsApiFwContext paramMiniJsApiFwContext);
    
    public abstract void aR(String paramString1, String paramString2);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/jsapi/core/MiniJsApiFramework.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */