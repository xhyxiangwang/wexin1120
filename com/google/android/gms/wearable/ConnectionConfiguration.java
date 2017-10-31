package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.v;
import java.util.Arrays;

public class ConnectionConfiguration
  implements SafeParcelable
{
  public static final Parcelable.Creator<ConnectionConfiguration> CREATOR = new u();
  final String aAq;
  final int aAr;
  final boolean aAs;
  String aAt;
  boolean aAu;
  String aAv;
  boolean acu;
  final int aji;
  final String mName;
  final int mVersionCode;
  
  ConnectionConfiguration(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, String paramString3, boolean paramBoolean3, String paramString4)
  {
    this.mVersionCode = paramInt1;
    this.mName = paramString1;
    this.aAq = paramString2;
    this.aji = paramInt2;
    this.aAr = paramInt3;
    this.aAs = paramBoolean1;
    this.acu = paramBoolean2;
    this.aAt = paramString3;
    this.aAu = paramBoolean3;
    this.aAv = paramString4;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof ConnectionConfiguration)) {}
    do
    {
      return false;
      paramObject = (ConnectionConfiguration)paramObject;
    } while ((!v.d(Integer.valueOf(this.mVersionCode), Integer.valueOf(((ConnectionConfiguration)paramObject).mVersionCode))) || (!v.d(this.mName, ((ConnectionConfiguration)paramObject).mName)) || (!v.d(this.aAq, ((ConnectionConfiguration)paramObject).aAq)) || (!v.d(Integer.valueOf(this.aji), Integer.valueOf(((ConnectionConfiguration)paramObject).aji))) || (!v.d(Integer.valueOf(this.aAr), Integer.valueOf(((ConnectionConfiguration)paramObject).aAr))) || (!v.d(Boolean.valueOf(this.aAs), Boolean.valueOf(((ConnectionConfiguration)paramObject).aAs))) || (!v.d(Boolean.valueOf(this.aAu), Boolean.valueOf(((ConnectionConfiguration)paramObject).aAu))));
    return true;
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.mVersionCode), this.mName, this.aAq, Integer.valueOf(this.aji), Integer.valueOf(this.aAr), Boolean.valueOf(this.aAs), Boolean.valueOf(this.aAu) });
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("ConnectionConfiguration[ ");
    localStringBuilder.append("mName=" + this.mName);
    localStringBuilder.append(", mAddress=" + this.aAq);
    localStringBuilder.append(", mType=" + this.aji);
    localStringBuilder.append(", mRole=" + this.aAr);
    localStringBuilder.append(", mEnabled=" + this.aAs);
    localStringBuilder.append(", mIsConnected=" + this.acu);
    localStringBuilder.append(", mPeerNodeId=" + this.aAt);
    localStringBuilder.append(", mBtlePriority=" + this.aAu);
    localStringBuilder.append(", mNodeId=" + this.aAv);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    u.a(this, paramParcel);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/wearable/ConnectionConfiguration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */