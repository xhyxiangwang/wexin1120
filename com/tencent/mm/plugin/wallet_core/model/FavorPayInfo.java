package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;
import java.util.List;

public class FavorPayInfo
  implements Parcelable
{
  public static final Parcelable.Creator<FavorPayInfo> CREATOR;
  public String rOr;
  public int rOs;
  public String rOt;
  public String rOu;
  public String rOv;
  public List<String> rOw;
  
  static
  {
    GMTrace.i(6911005032448L, 51491);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(6911005032448L, 51491);
  }
  
  public FavorPayInfo()
  {
    GMTrace.i(6910468161536L, 51487);
    this.rOw = new LinkedList();
    GMTrace.o(6910468161536L, 51487);
  }
  
  public FavorPayInfo(Parcel paramParcel)
  {
    GMTrace.i(6910602379264L, 51488);
    this.rOw = new LinkedList();
    this.rOr = paramParcel.readString();
    this.rOs = paramParcel.readInt();
    this.rOt = paramParcel.readString();
    this.rOu = paramParcel.readString();
    this.rOv = paramParcel.readString();
    this.rOw = paramParcel.createStringArrayList();
    GMTrace.o(6910602379264L, 51488);
  }
  
  public int describeContents()
  {
    GMTrace.i(6910736596992L, 51489);
    GMTrace.o(6910736596992L, 51489);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(6910870814720L, 51490);
    paramParcel.writeString(this.rOr);
    paramParcel.writeInt(this.rOs);
    paramParcel.writeString(this.rOt);
    paramParcel.writeString(this.rOu);
    paramParcel.writeString(this.rOv);
    paramParcel.writeStringList(this.rOw);
    GMTrace.o(6910870814720L, 51490);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/FavorPayInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */