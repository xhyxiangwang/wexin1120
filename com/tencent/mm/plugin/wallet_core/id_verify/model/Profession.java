package com.tencent.mm.plugin.wallet_core.id_verify.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class Profession
  implements Parcelable
{
  public static final Parcelable.Creator<Profession> CREATOR;
  public String rMg;
  public int rMh;
  
  static
  {
    GMTrace.i(6841882902528L, 50976);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(6841882902528L, 50976);
  }
  
  protected Profession(Parcel paramParcel)
  {
    GMTrace.i(6841480249344L, 50973);
    this.rMg = paramParcel.readString();
    this.rMh = paramParcel.readInt();
    GMTrace.o(6841480249344L, 50973);
  }
  
  public Profession(String paramString, int paramInt)
  {
    GMTrace.i(6841346031616L, 50972);
    this.rMg = paramString;
    this.rMh = paramInt;
    GMTrace.o(6841346031616L, 50972);
  }
  
  public int describeContents()
  {
    GMTrace.i(6841614467072L, 50974);
    GMTrace.o(6841614467072L, 50974);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(6841748684800L, 50975);
    paramParcel.writeString(this.rMg);
    paramParcel.writeInt(this.rMh);
    GMTrace.o(6841748684800L, 50975);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/id_verify/model/Profession.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */