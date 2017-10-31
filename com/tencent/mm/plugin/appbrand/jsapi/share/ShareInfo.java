package com.tencent.mm.plugin.appbrand.jsapi.share;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

class ShareInfo
  implements Parcelable
{
  public static final Parcelable.Creator<ShareInfo> CREATOR;
  public String hjt;
  public String hju;
  
  static
  {
    GMTrace.i(18232270389248L, 135841);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(18232270389248L, 135841);
  }
  
  public ShareInfo(Parcel paramParcel)
  {
    GMTrace.i(18232136171520L, 135840);
    this.hju = paramParcel.readString();
    this.hjt = paramParcel.readString();
    GMTrace.o(18232136171520L, 135840);
  }
  
  public ShareInfo(String paramString1, String paramString2)
  {
    GMTrace.i(18232001953792L, 135839);
    this.hju = paramString1;
    this.hjt = paramString2;
    GMTrace.o(18232001953792L, 135839);
  }
  
  public int describeContents()
  {
    GMTrace.i(18231733518336L, 135837);
    GMTrace.o(18231733518336L, 135837);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(18231867736064L, 135838);
    paramParcel.writeString(this.hju);
    paramParcel.writeString(this.hjt);
    GMTrace.o(18231867736064L, 135838);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/share/ShareInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */