package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GetCapabilityResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator<GetCapabilityResponse> CREATOR = new i();
  public final CapabilityInfoParcelable aBC;
  public final int statusCode;
  public final int versionCode;
  
  GetCapabilityResponse(int paramInt1, int paramInt2, CapabilityInfoParcelable paramCapabilityInfoParcelable)
  {
    this.versionCode = paramInt1;
    this.statusCode = paramInt2;
    this.aBC = paramCapabilityInfoParcelable;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    i.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/wearable/internal/GetCapabilityResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */