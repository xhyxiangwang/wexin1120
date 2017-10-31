package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AncsNotificationParcelable
  implements SafeParcelable
{
  public static final Parcelable.Creator<AncsNotificationParcelable> CREATOR = new av();
  final String aBh;
  final String aBi;
  final String aBj;
  final String aBk;
  byte aBl;
  byte aBm;
  byte aBn;
  byte aBo;
  final String avC;
  String axO;
  int mId;
  final int mVersionCode;
  
  AncsNotificationParcelable(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4)
  {
    this.mId = paramInt2;
    this.mVersionCode = paramInt1;
    this.avC = paramString1;
    this.aBh = paramString2;
    this.aBi = paramString3;
    this.aBj = paramString4;
    this.aBk = paramString5;
    this.axO = paramString6;
    this.aBl = paramByte1;
    this.aBm = paramByte2;
    this.aBn = paramByte3;
    this.aBo = paramByte4;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      paramObject = (AncsNotificationParcelable)paramObject;
      if (this.aBo != ((AncsNotificationParcelable)paramObject).aBo) {
        return false;
      }
      if (this.aBn != ((AncsNotificationParcelable)paramObject).aBn) {
        return false;
      }
      if (this.aBm != ((AncsNotificationParcelable)paramObject).aBm) {
        return false;
      }
      if (this.aBl != ((AncsNotificationParcelable)paramObject).aBl) {
        return false;
      }
      if (this.mId != ((AncsNotificationParcelable)paramObject).mId) {
        return false;
      }
      if (this.mVersionCode != ((AncsNotificationParcelable)paramObject).mVersionCode) {
        return false;
      }
      if (!this.avC.equals(((AncsNotificationParcelable)paramObject).avC)) {
        return false;
      }
      if (this.aBh != null)
      {
        if (this.aBh.equals(((AncsNotificationParcelable)paramObject).aBh)) {}
      }
      else {
        while (((AncsNotificationParcelable)paramObject).aBh != null) {
          return false;
        }
      }
      if (!this.axO.equals(((AncsNotificationParcelable)paramObject).axO)) {
        return false;
      }
      if (!this.aBi.equals(((AncsNotificationParcelable)paramObject).aBi)) {
        return false;
      }
      if (!this.aBk.equals(((AncsNotificationParcelable)paramObject).aBk)) {
        return false;
      }
    } while (this.aBj.equals(((AncsNotificationParcelable)paramObject).aBj));
    return false;
  }
  
  public int hashCode()
  {
    int j = this.mVersionCode;
    int k = this.mId;
    int m = this.avC.hashCode();
    if (this.aBh != null) {}
    for (int i = this.aBh.hashCode();; i = 0) {
      return ((((((((i + ((j * 31 + k) * 31 + m) * 31) * 31 + this.aBi.hashCode()) * 31 + this.aBj.hashCode()) * 31 + this.aBk.hashCode()) * 31 + this.axO.hashCode()) * 31 + this.aBl) * 31 + this.aBm) * 31 + this.aBn) * 31 + this.aBo;
    }
  }
  
  public String toString()
  {
    return "AncsNotificationParcelable{mVersionCode=" + this.mVersionCode + ", mId=" + this.mId + ", mAppId='" + this.avC + '\'' + ", mDateTime='" + this.aBh + '\'' + ", mNotificationText='" + this.aBi + '\'' + ", mTitle='" + this.aBj + '\'' + ", mSubtitle='" + this.aBk + '\'' + ", mDisplayName='" + this.axO + '\'' + ", mEventId=" + this.aBl + ", mEventFlags=" + this.aBm + ", mCategoryId=" + this.aBn + ", mCategoryCount=" + this.aBo + '}';
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    av.a(this, paramParcel);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/wearable/internal/AncsNotificationParcelable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */