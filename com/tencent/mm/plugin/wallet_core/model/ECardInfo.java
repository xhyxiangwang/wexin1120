package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;

public class ECardInfo
  implements Parcelable
{
  public static final Parcelable.Creator<ECardInfo> CREATOR;
  public String fQu;
  public String fwJ;
  public int rNC;
  public int rND;
  public int rNE;
  public String rNF;
  public String rNG;
  public String rNH;
  public int rNI;
  public ArrayList<String> rNJ;
  public String rNK;
  public String rNL;
  public String rNM;
  public String rNN;
  public String title;
  
  static
  {
    GMTrace.i(19319970856960L, 143945);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(19319970856960L, 143945);
  }
  
  public ECardInfo()
  {
    GMTrace.i(19319433986048L, 143941);
    this.rNJ = new ArrayList();
    GMTrace.o(19319433986048L, 143941);
  }
  
  public ECardInfo(Parcel paramParcel)
  {
    GMTrace.i(19319568203776L, 143942);
    this.rNJ = new ArrayList();
    this.rNC = paramParcel.readInt();
    this.fwJ = paramParcel.readString();
    this.rND = paramParcel.readInt();
    this.rNE = paramParcel.readInt();
    this.rNF = paramParcel.readString();
    this.rNG = paramParcel.readString();
    this.rNH = paramParcel.readString();
    this.rNI = paramParcel.readInt();
    this.title = paramParcel.readString();
    paramParcel.readStringList(this.rNJ);
    this.rNK = paramParcel.readString();
    this.rNL = paramParcel.readString();
    this.rNM = paramParcel.readString();
    this.rNN = paramParcel.readString();
    GMTrace.o(19319568203776L, 143942);
  }
  
  public int describeContents()
  {
    GMTrace.i(19319702421504L, 143943);
    GMTrace.o(19319702421504L, 143943);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(19319836639232L, 143944);
    paramParcel.writeInt(this.rNC);
    paramParcel.writeString(this.fwJ);
    paramParcel.writeInt(this.rND);
    paramParcel.writeInt(this.rNE);
    paramParcel.writeString(this.rNF);
    paramParcel.writeString(this.rNG);
    paramParcel.writeString(this.rNH);
    paramParcel.writeInt(this.rNI);
    paramParcel.writeString(this.title);
    paramParcel.writeStringList(this.rNJ);
    paramParcel.writeString(this.rNK);
    paramParcel.writeString(this.rNL);
    paramParcel.writeString(this.rNM);
    paramParcel.writeString(this.rNN);
    GMTrace.o(19319836639232L, 143944);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/ECardInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */