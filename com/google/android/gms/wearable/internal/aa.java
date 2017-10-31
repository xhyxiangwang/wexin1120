package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class aa
  implements Parcelable.Creator<MessageEventParcelable>
{
  static void a(MessageEventParcelable paramMessageEventParcelable, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramMessageEventParcelable.mVersionCode);
    b.c(paramParcel, 2, paramMessageEventParcelable.aBN);
    b.a(paramParcel, 3, paramMessageEventParcelable.aBv);
    b.a(paramParcel, 4, paramMessageEventParcelable.aAn);
    b.a(paramParcel, 5, paramMessageEventParcelable.avE);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/wearable/internal/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */