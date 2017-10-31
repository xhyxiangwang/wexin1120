package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class al
  implements Parcelable.Creator<StorageInfoResponse>
{
  static void a(StorageInfoResponse paramStorageInfoResponse, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramStorageInfoResponse.versionCode);
    b.c(paramParcel, 2, paramStorageInfoResponse.statusCode);
    b.a(paramParcel, 3, paramStorageInfoResponse.aBQ);
    b.b(paramParcel, 4, paramStorageInfoResponse.aBR);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/wearable/internal/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */