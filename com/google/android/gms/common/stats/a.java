package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class a
  implements Parcelable.Creator<ConnectionEvent>
{
  static void a(ConnectionEvent paramConnectionEvent, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramConnectionEvent.mVersionCode);
    b.a(paramParcel, 2, paramConnectionEvent.amu);
    b.a(paramParcel, 4, paramConnectionEvent.amw);
    b.a(paramParcel, 5, paramConnectionEvent.amx);
    b.a(paramParcel, 6, paramConnectionEvent.amy);
    b.a(paramParcel, 7, paramConnectionEvent.amz);
    b.a(paramParcel, 8, paramConnectionEvent.amA);
    b.a(paramParcel, 10, paramConnectionEvent.amC);
    b.a(paramParcel, 11, paramConnectionEvent.amD);
    b.c(paramParcel, 12, paramConnectionEvent.amv);
    b.a(paramParcel, 13, paramConnectionEvent.amB);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/common/stats/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */