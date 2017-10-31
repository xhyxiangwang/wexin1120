package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class av
  implements Parcelable.Creator<AncsNotificationParcelable>
{
  static void a(AncsNotificationParcelable paramAncsNotificationParcelable, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramAncsNotificationParcelable.mVersionCode);
    b.c(paramParcel, 2, paramAncsNotificationParcelable.mId);
    b.a(paramParcel, 3, paramAncsNotificationParcelable.avC);
    b.a(paramParcel, 4, paramAncsNotificationParcelable.aBh);
    b.a(paramParcel, 5, paramAncsNotificationParcelable.aBi);
    b.a(paramParcel, 6, paramAncsNotificationParcelable.aBj);
    b.a(paramParcel, 7, paramAncsNotificationParcelable.aBk);
    if (paramAncsNotificationParcelable.axO == null) {}
    for (String str = paramAncsNotificationParcelable.avC;; str = paramAncsNotificationParcelable.axO)
    {
      b.a(paramParcel, 8, str);
      b.a(paramParcel, 9, paramAncsNotificationParcelable.aBl);
      b.a(paramParcel, 10, paramAncsNotificationParcelable.aBm);
      b.a(paramParcel, 11, paramAncsNotificationParcelable.aBn);
      b.a(paramParcel, 12, paramAncsNotificationParcelable.aBo);
      b.u(paramParcel, i);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/wearable/internal/av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */