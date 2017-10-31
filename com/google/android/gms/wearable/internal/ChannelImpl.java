package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.wearable.Channel;

public class ChannelImpl
  implements SafeParcelable, Channel
{
  public static final Parcelable.Creator<ChannelImpl> CREATOR = new bb();
  final String aAv;
  public final String aBu;
  final String aBv;
  final int mVersionCode;
  
  ChannelImpl(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    this.mVersionCode = paramInt;
    this.aBu = ((String)w.aa(paramString1));
    this.aAv = ((String)w.aa(paramString2));
    this.aBv = ((String)w.aa(paramString3));
  }
  
  public final e<Status> a(c paramc, final Uri paramUri)
  {
    w.h(paramc, "client is null");
    w.h(paramUri, "uri is null");
    paramc.b(new aw(paramc) {});
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof ChannelImpl)) {
        return false;
      }
      paramObject = (ChannelImpl)paramObject;
    } while ((this.aBu.equals(((ChannelImpl)paramObject).aBu)) && (v.d(((ChannelImpl)paramObject).aAv, this.aAv)) && (v.d(((ChannelImpl)paramObject).aBv, this.aBv)) && (((ChannelImpl)paramObject).mVersionCode == this.mVersionCode));
    return false;
  }
  
  public final String getPath()
  {
    return this.aBv;
  }
  
  public int hashCode()
  {
    return this.aBu.hashCode();
  }
  
  public final String nc()
  {
    return this.aAv;
  }
  
  public String toString()
  {
    return "ChannelImpl{versionCode=" + this.mVersionCode + ", token='" + this.aBu + '\'' + ", nodeId='" + this.aAv + '\'' + ", path='" + this.aBv + '\'' + "}";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bb.a(this, paramParcel);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/wearable/internal/ChannelImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */