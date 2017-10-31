package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class a
  implements Parcelable.Creator<Credential>
{
  static void a(Credential paramCredential, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.a(paramParcel, 1001, paramCredential.afI);
    b.a(paramParcel, 1, paramCredential.abS);
    b.c(paramParcel, 1000, paramCredential.mVersionCode);
    b.a(paramParcel, 2, paramCredential.mName);
    b.a(paramParcel, 3, paramCredential.afK, paramInt);
    b.a(paramParcel, 1002, paramCredential.afJ);
    b.b(paramParcel, 4, paramCredential.afL);
    b.a(paramParcel, 5, paramCredential.afM);
    b.a(paramParcel, 6, paramCredential.afN);
    b.a(paramParcel, 7, paramCredential.afO);
    b.a(paramParcel, 8, paramCredential.afP);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/auth/api/credentials/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */