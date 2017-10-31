package com.tencent.mm.plugin.wallet_core.model.mall;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;

public class MallFunction
  implements Parcelable
{
  public static final Parcelable.Creator<MallFunction> CREATOR;
  public String fOl;
  public String fQY;
  public String mPK;
  public String nFl;
  public String nFm;
  public String oQy;
  public String rRG;
  public ArrayList<String> rRH;
  public MallNews rRI;
  public String rRJ;
  public int rRK;
  public int type;
  
  static
  {
    GMTrace.i(6883624615936L, 51287);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(6883624615936L, 51287);
  }
  
  public MallFunction()
  {
    GMTrace.i(6883087745024L, 51283);
    this.rRK = 0;
    GMTrace.o(6883087745024L, 51283);
  }
  
  public MallFunction(Parcel paramParcel)
  {
    GMTrace.i(6883356180480L, 51285);
    this.rRK = 0;
    this.oQy = paramParcel.readString();
    this.fOl = paramParcel.readString();
    this.rRG = paramParcel.readString();
    this.nFl = paramParcel.readString();
    this.nFm = paramParcel.readString();
    this.fQY = paramParcel.readString();
    this.mPK = paramParcel.readString();
    this.rRH = new ArrayList();
    paramParcel.readStringList(this.rRH);
    this.rRI = ((MallNews)paramParcel.readParcelable(MallNews.class.getClassLoader()));
    this.type = paramParcel.readInt();
    this.rRJ = paramParcel.readString();
    this.rRK = paramParcel.readInt();
    GMTrace.o(6883356180480L, 51285);
  }
  
  public int describeContents()
  {
    GMTrace.i(6883221962752L, 51284);
    GMTrace.o(6883221962752L, 51284);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(6883490398208L, 51286);
    paramParcel.writeString(this.oQy);
    paramParcel.writeString(this.fOl);
    paramParcel.writeString(this.rRG);
    paramParcel.writeString(this.nFl);
    paramParcel.writeString(this.nFm);
    paramParcel.writeString(this.fQY);
    paramParcel.writeString(this.mPK);
    paramParcel.writeStringList(this.rRH);
    paramParcel.writeParcelable(this.rRI, paramInt);
    paramParcel.writeInt(this.type);
    paramParcel.writeString(this.rRJ);
    paramParcel.writeInt(this.rRK);
    GMTrace.o(6883490398208L, 51286);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/mall/MallFunction.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */