package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class ba
  implements Parcelable.Creator<ChannelEventParcelable>
{
  static void a(ChannelEventParcelable paramChannelEventParcelable, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramChannelEventParcelable.mVersionCode);
    b.a(paramParcel, 2, paramChannelEventParcelable.aBr, paramInt);
    b.c(paramParcel, 3, paramChannelEventParcelable.type);
    b.c(paramParcel, 4, paramChannelEventParcelable.aBs);
    b.c(paramParcel, 5, paramChannelEventParcelable.aBt);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/wearable/internal/ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */