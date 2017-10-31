package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AddListenerRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<AddListenerRequest> CREATOR = new ab();
  public final w aBb;
  public final IntentFilter[] aBc;
  public final String aBd;
  public final String aBe;
  final int mVersionCode;
  
  AddListenerRequest(int paramInt, IBinder paramIBinder, IntentFilter[] paramArrayOfIntentFilter, String paramString1, String paramString2)
  {
    this.mVersionCode = paramInt;
    if (paramIBinder != null) {}
    for (this.aBb = w.a.s(paramIBinder);; this.aBb = null)
    {
      this.aBc = paramArrayOfIntentFilter;
      this.aBd = paramString1;
      this.aBe = paramString2;
      return;
    }
  }
  
  public AddListenerRequest(ap paramap)
  {
    this.mVersionCode = 1;
    this.aBb = paramap;
    this.aBc = paramap.aCx;
    this.aBd = paramap.aCy;
    this.aBe = paramap.aCz;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ab.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/wearable/internal/AddListenerRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */