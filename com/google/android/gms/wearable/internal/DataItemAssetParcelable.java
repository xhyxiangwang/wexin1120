package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.wearable.g;

public class DataItemAssetParcelable
  implements SafeParcelable, g
{
  public static final Parcelable.Creator<DataItemAssetParcelable> CREATOR = new b();
  final String abS;
  final String auC;
  final int mVersionCode;
  
  DataItemAssetParcelable(int paramInt, String paramString1, String paramString2)
  {
    this.mVersionCode = paramInt;
    this.abS = paramString1;
    this.auC = paramString2;
  }
  
  public DataItemAssetParcelable(g paramg)
  {
    this.mVersionCode = 1;
    this.abS = ((String)w.aa(paramg.getId()));
    this.auC = ((String)w.aa(paramg.nf()));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final String getId()
  {
    return this.abS;
  }
  
  public final String nf()
  {
    return this.auC;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DataItemAssetParcelable[");
    localStringBuilder.append("@");
    localStringBuilder.append(Integer.toHexString(hashCode()));
    if (this.abS == null) {
      localStringBuilder.append(",noid");
    }
    for (;;)
    {
      localStringBuilder.append(", key=");
      localStringBuilder.append(this.auC);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
      localStringBuilder.append(",");
      localStringBuilder.append(this.abS);
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/wearable/internal/DataItemAssetParcelable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */