package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class c
  implements Parcelable.Creator<CheckServerAuthResult>
{
  static void a(CheckServerAuthResult paramCheckServerAuthResult, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramCheckServerAuthResult.mVersionCode);
    b.a(paramParcel, 2, paramCheckServerAuthResult.axQ);
    b.b(paramParcel, 3, paramCheckServerAuthResult.axR);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/signin/internal/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */