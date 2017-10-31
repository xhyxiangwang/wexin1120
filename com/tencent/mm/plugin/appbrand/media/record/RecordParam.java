package com.tencent.mm.plugin.appbrand.media.record;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class RecordParam
  implements Parcelable
{
  public static final Parcelable.Creator<RecordParam> CREATOR;
  public int duration;
  public String gKm;
  public String iSt;
  public int jhW;
  public int jhX;
  public int jhY;
  public int sampleRate;
  public int scene;
  
  static
  {
    GMTrace.i(19855633809408L, 147936);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(19855633809408L, 147936);
  }
  
  public RecordParam()
  {
    GMTrace.i(19855096938496L, 147932);
    this.duration = 0;
    this.sampleRate = 0;
    this.jhW = 0;
    this.jhX = 0;
    this.scene = 0;
    this.jhY = 0;
    GMTrace.o(19855096938496L, 147932);
  }
  
  public RecordParam(Parcel paramParcel)
  {
    GMTrace.i(19855365373952L, 147934);
    this.duration = 0;
    this.sampleRate = 0;
    this.jhW = 0;
    this.jhX = 0;
    this.scene = 0;
    this.jhY = 0;
    this.duration = paramParcel.readInt();
    this.sampleRate = paramParcel.readInt();
    this.jhW = paramParcel.readInt();
    this.jhX = paramParcel.readInt();
    this.iSt = paramParcel.readString();
    this.gKm = paramParcel.readString();
    this.scene = paramParcel.readInt();
    this.jhY = paramParcel.readInt();
    GMTrace.o(19855365373952L, 147934);
  }
  
  public int describeContents()
  {
    GMTrace.i(19855231156224L, 147933);
    GMTrace.o(19855231156224L, 147933);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(19855499591680L, 147935);
    paramParcel.writeInt(this.duration);
    paramParcel.writeInt(this.sampleRate);
    paramParcel.writeInt(this.jhW);
    paramParcel.writeInt(this.jhX);
    paramParcel.writeString(this.iSt);
    paramParcel.writeString(this.gKm);
    paramParcel.writeInt(this.scene);
    paramParcel.writeInt(this.jhY);
    GMTrace.o(19855499591680L, 147935);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/media/record/RecordParam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */