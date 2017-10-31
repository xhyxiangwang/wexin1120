package com.tencent.mm.plugin.appbrand.appcache;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public final class WxaPkgItemInfo
  implements Parcelable
{
  public static final Parcelable.Creator<WxaPkgItemInfo> CREATOR;
  public final String fRG;
  public final String fnP;
  public final int iBN;
  public final int iBO;
  
  static
  {
    GMTrace.i(10619575074816L, 79122);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10619575074816L, 79122);
  }
  
  public WxaPkgItemInfo(Parcel paramParcel)
  {
    GMTrace.i(10619306639360L, 79120);
    this.fnP = paramParcel.readString();
    this.fRG = paramParcel.readString();
    this.iBN = paramParcel.readInt();
    this.iBO = paramParcel.readInt();
    GMTrace.o(10619306639360L, 79120);
  }
  
  WxaPkgItemInfo(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(10618903986176L, 79117);
    this.fnP = paramString;
    this.fRG = null;
    this.iBN = paramInt1;
    this.iBO = paramInt2;
    GMTrace.o(10618903986176L, 79117);
  }
  
  public final int describeContents()
  {
    GMTrace.i(10619038203904L, 79118);
    GMTrace.o(10619038203904L, 79118);
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(10619172421632L, 79119);
    paramParcel.writeString(this.fnP);
    paramParcel.writeString(this.fRG);
    paramParcel.writeInt(this.iBN);
    paramParcel.writeInt(this.iBO);
    GMTrace.o(10619172421632L, 79119);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/WxaPkgItemInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */