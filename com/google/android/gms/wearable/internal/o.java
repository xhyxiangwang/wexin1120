package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class o
  implements Parcelable.Creator<GetConfigResponse>
{
  static void a(GetConfigResponse paramGetConfigResponse, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramGetConfigResponse.versionCode);
    b.c(paramParcel, 2, paramGetConfigResponse.statusCode);
    b.a(paramParcel, 3, paramGetConfigResponse.aBH, paramInt);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/wearable/internal/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */