package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.l;

public class MessageEventParcelable
  implements SafeParcelable, l
{
  public static final Parcelable.Creator<MessageEventParcelable> CREATOR = new aa();
  final byte[] aAn;
  final int aBN;
  final String aBv;
  final String avE;
  final int mVersionCode;
  
  MessageEventParcelable(int paramInt1, int paramInt2, String paramString1, byte[] paramArrayOfByte, String paramString2)
  {
    this.mVersionCode = paramInt1;
    this.aBN = paramInt2;
    this.aBv = paramString1;
    this.aAn = paramArrayOfByte;
    this.avE = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final byte[] getData()
  {
    return this.aAn;
  }
  
  public final String getPath()
  {
    return this.aBv;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("MessageEventParcelable[").append(this.aBN).append(",").append(this.aBv).append(", size=");
    if (this.aAn == null) {}
    for (Object localObject = "null";; localObject = Integer.valueOf(this.aAn.length)) {
      return localObject + "]";
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    aa.a(this, paramParcel);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/wearable/internal/MessageEventParcelable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */