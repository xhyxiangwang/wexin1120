package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class ab
  implements Parcelable.Creator<AddListenerRequest>
{
  static void a(AddListenerRequest paramAddListenerRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramAddListenerRequest.mVersionCode);
    if (paramAddListenerRequest.aBb == null) {}
    for (IBinder localIBinder = null;; localIBinder = paramAddListenerRequest.aBb.asBinder())
    {
      b.a(paramParcel, 2, localIBinder);
      b.a(paramParcel, 3, paramAddListenerRequest.aBc, paramInt);
      b.a(paramParcel, 4, paramAddListenerRequest.aBd);
      b.a(paramParcel, 5, paramAddListenerRequest.aBe);
      b.u(paramParcel, i);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/wearable/internal/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */