package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class q
  implements Parcelable.Creator<GetConnectedNodesResponse>
{
  static void a(GetConnectedNodesResponse paramGetConnectedNodesResponse, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramGetConnectedNodesResponse.versionCode);
    b.c(paramParcel, 2, paramGetConnectedNodesResponse.statusCode);
    b.b(paramParcel, 3, paramGetConnectedNodesResponse.aBJ);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/wearable/internal/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */