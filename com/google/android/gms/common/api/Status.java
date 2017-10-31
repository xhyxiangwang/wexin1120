package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.internal.v.a;
import java.util.Arrays;

public final class Status
  implements g, SafeParcelable
{
  public static final Parcelable.Creator<Status> CREATOR = new t();
  public static final Status ahu = new Status(0);
  public static final Status ahv = new Status(14);
  public static final Status ahw = new Status(8);
  public static final Status ahx = new Status(15);
  public static final Status ahy = new Status(16);
  public final int agH;
  final PendingIntent agI;
  public final String ahz;
  final int mVersionCode;
  
  public Status(int paramInt)
  {
    this(paramInt, null);
  }
  
  Status(int paramInt1, int paramInt2, String paramString, PendingIntent paramPendingIntent)
  {
    this.mVersionCode = paramInt1;
    this.agH = paramInt2;
    this.ahz = paramString;
    this.agI = paramPendingIntent;
  }
  
  public Status(int paramInt, String paramString)
  {
    this(1, paramInt, paramString, null);
  }
  
  public Status(String paramString)
  {
    this(1, 8, paramString, null);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof Status)) {}
    do
    {
      return false;
      paramObject = (Status)paramObject;
    } while ((this.mVersionCode != ((Status)paramObject).mVersionCode) || (this.agH != ((Status)paramObject).agH) || (!v.d(this.ahz, ((Status)paramObject).ahz)) || (!v.d(this.agI, ((Status)paramObject).agI)));
    return true;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.mVersionCode), Integer.valueOf(this.agH), this.ahz, this.agI });
  }
  
  public final boolean isSuccess()
  {
    return this.agH <= 0;
  }
  
  public final Status jW()
  {
    return this;
  }
  
  public final String toString()
  {
    v.a locala = v.Z(this);
    if (this.ahz != null) {}
    for (String str = this.ahz;; str = b.bT(this.agH)) {
      return locala.g("statusCode", str).g("resolution", this.agI).toString();
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    t.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/common/api/Status.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */