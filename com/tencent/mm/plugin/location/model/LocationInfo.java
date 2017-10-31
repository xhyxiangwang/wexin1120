package com.tencent.mm.plugin.location.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.location.ui.d;
import com.tencent.mm.sdk.platformtools.bg;

public class LocationInfo
  implements Parcelable
{
  public static final Parcelable.Creator<LocationInfo> CREATOR;
  public String fJh;
  public String nkh;
  public double nki;
  public double nkj;
  public String nkk;
  public String nkl;
  String nkm;
  public int nkn;
  public int zoom;
  
  static
  {
    GMTrace.i(9632001032192L, 71764);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(9632001032192L, 71764);
  }
  
  public LocationInfo()
  {
    GMTrace.i(9631061508096L, 71757);
    this.nkh = "";
    this.nki = -85.0D;
    this.nkj = -1000.0D;
    this.nkk = "";
    this.nkl = "zh-cn";
    this.nkm = "";
    this.nkn = 0;
    GMTrace.o(9631061508096L, 71757);
  }
  
  public LocationInfo(byte paramByte)
  {
    GMTrace.i(9631195725824L, 71758);
    this.nkh = "";
    this.nki = -85.0D;
    this.nkj = -1000.0D;
    this.nkk = "";
    this.nkl = "zh-cn";
    this.nkm = "";
    this.nkn = 0;
    this.nkh = (toString() + " " + System.nanoTime());
    this.zoom = d.fF(false);
    GMTrace.o(9631195725824L, 71758);
  }
  
  public final boolean aJa()
  {
    GMTrace.i(9631464161280L, 71760);
    if ((this.nki != -85.0D) && (this.nkj != -1000.0D))
    {
      GMTrace.o(9631464161280L, 71760);
      return true;
    }
    GMTrace.o(9631464161280L, 71760);
    return false;
  }
  
  public final boolean aJb()
  {
    GMTrace.i(9631598379008L, 71761);
    if ((bg.mZ(this.nkk)) && (bg.mZ(this.fJh)))
    {
      GMTrace.o(9631598379008L, 71761);
      return false;
    }
    GMTrace.o(9631598379008L, 71761);
    return true;
  }
  
  public int describeContents()
  {
    GMTrace.i(9631866814464L, 71763);
    GMTrace.o(9631866814464L, 71763);
    return 0;
  }
  
  public String toString()
  {
    GMTrace.i(9631732596736L, 71762);
    String str = this.nki + " " + this.nkj + " " + this.nkk + " " + this.fJh + "  " + this.nkh;
    GMTrace.o(9631732596736L, 71762);
    return str;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(9631329943552L, 71759);
    paramParcel.writeString(this.nkh);
    paramParcel.writeDouble(this.nki);
    paramParcel.writeDouble(this.nkj);
    paramParcel.writeInt(this.zoom);
    paramParcel.writeString(this.nkk);
    paramParcel.writeString(this.nkl);
    paramParcel.writeString(this.fJh);
    paramParcel.writeString(this.nkm);
    paramParcel.writeInt(this.nkn);
    GMTrace.o(9631329943552L, 71759);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/location/model/LocationInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */