package com.tencent.mm.plugin.appbrand.appstorage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class AppBrandLocalMediaObject
  implements Parcelable
{
  public static final Parcelable.Creator<AppBrandLocalMediaObject> CREATOR;
  public String fAx;
  public String hhT;
  public String iDv;
  public boolean iDw;
  public long iDx;
  public long ieX;
  public String mimeType;
  
  static
  {
    GMTrace.i(10636083855360L, 79245);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10636083855360L, 79245);
  }
  
  protected AppBrandLocalMediaObject()
  {
    GMTrace.i(10635546984448L, 79241);
    GMTrace.o(10635546984448L, 79241);
  }
  
  protected AppBrandLocalMediaObject(Parcel paramParcel)
  {
    GMTrace.i(10635949637632L, 79244);
    this.fAx = paramParcel.readString();
    this.hhT = paramParcel.readString();
    this.mimeType = paramParcel.readString();
    this.iDv = paramParcel.readString();
    if (paramParcel.readByte() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.iDw = bool;
      this.ieX = paramParcel.readLong();
      this.iDx = paramParcel.readLong();
      GMTrace.o(10635949637632L, 79244);
      return;
    }
  }
  
  public int describeContents()
  {
    GMTrace.i(10635681202176L, 79242);
    GMTrace.o(10635681202176L, 79242);
    return 0;
  }
  
  public String toString()
  {
    GMTrace.i(10635412766720L, 79240);
    String str = "AppBrandLocalMediaObject{localId='" + this.fAx + '\'' + ", fileFullPath='" + this.hhT + '\'' + ", mimeType='" + this.mimeType + '\'' + ", fileExt='" + this.iDv + '\'' + '}';
    GMTrace.o(10635412766720L, 79240);
    return str;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(10635815419904L, 79243);
    paramParcel.writeString(this.fAx);
    paramParcel.writeString(this.hhT);
    paramParcel.writeString(this.mimeType);
    paramParcel.writeString(this.iDv);
    if (this.iDw) {}
    for (byte b = 1;; b = 0)
    {
      paramParcel.writeByte(b);
      paramParcel.writeLong(this.ieX);
      paramParcel.writeLong(this.iDx);
      GMTrace.o(10635815419904L, 79243);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appstorage/AppBrandLocalMediaObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */