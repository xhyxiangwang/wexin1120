package com.tencent.mm.plugin.wallet_core.model.mall;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class MallNews
  implements Parcelable
{
  public static final Parcelable.Creator<MallNews> CREATOR;
  public String fxT;
  public int rPM;
  public String rRO;
  public String rRP;
  public String rRQ;
  public String rRR;
  public String rRS;
  public String rRT;
  public int rRU;
  public String rRV;
  public int rRW;
  public String rRX;
  public String rRY;
  public String ran;
  public int showType;
  public String type;
  
  static
  {
    GMTrace.i(6880269172736L, 51262);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(6880269172736L, 51262);
  }
  
  public MallNews(Parcel paramParcel)
  {
    GMTrace.i(6879732301824L, 51258);
    this.rRO = "0";
    this.rRP = "0";
    this.rRQ = paramParcel.readString();
    this.ran = paramParcel.readString();
    this.fxT = paramParcel.readString();
    this.rRR = paramParcel.readString();
    this.rRS = paramParcel.readString();
    this.rRT = paramParcel.readString();
    this.rRU = paramParcel.readInt();
    this.rRV = paramParcel.readString();
    this.rRO = paramParcel.readString();
    this.rRP = paramParcel.readString();
    this.showType = paramParcel.readInt();
    this.rRX = paramParcel.readString();
    this.rPM = paramParcel.readInt();
    this.rRY = paramParcel.readString();
    GMTrace.o(6879732301824L, 51258);
  }
  
  public MallNews(String paramString)
  {
    GMTrace.i(6879463866368L, 51256);
    this.rRO = "0";
    this.rRP = "0";
    this.rRQ = paramString;
    GMTrace.o(6879463866368L, 51256);
  }
  
  public int describeContents()
  {
    GMTrace.i(6880000737280L, 51260);
    GMTrace.o(6880000737280L, 51260);
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    GMTrace.i(6879598084096L, 51257);
    if ((paramObject instanceof MallNews))
    {
      paramObject = (MallNews)paramObject;
      if ((this.rRQ == null) || (!this.rRQ.equals(((MallNews)paramObject).rRQ)))
      {
        GMTrace.o(6879598084096L, 51257);
        return false;
      }
      if ((this.ran == null) || (!this.ran.equals(((MallNews)paramObject).ran)))
      {
        GMTrace.o(6879598084096L, 51257);
        return false;
      }
      GMTrace.o(6879598084096L, 51257);
      return true;
    }
    GMTrace.o(6879598084096L, 51257);
    return false;
  }
  
  public String toString()
  {
    GMTrace.i(6880134955008L, 51261);
    String str = String.format("functionId : %s, activityId : %s, ticket : %s, activityMsg : %s, activityLink : %s, activityIconLink : %s, showFlag : %s, orgStr : %s, activityTips: %s, activityType: %d, activityUrl: %s", new Object[] { this.rRQ, this.ran, this.fxT, this.rRR, this.rRS, this.rRT, this.rRO, this.rRX, this.rRV, Integer.valueOf(this.rPM), this.rRY });
    GMTrace.o(6880134955008L, 51261);
    return str;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(6879866519552L, 51259);
    paramParcel.writeString(this.rRQ);
    paramParcel.writeString(this.ran);
    paramParcel.writeString(this.fxT);
    paramParcel.writeString(this.rRR);
    paramParcel.writeString(this.rRS);
    paramParcel.writeString(this.rRT);
    paramParcel.writeInt(this.rRU);
    paramParcel.writeString(this.rRV);
    paramParcel.writeString(this.rRO);
    paramParcel.writeString(this.rRP);
    paramParcel.writeInt(this.showType);
    paramParcel.writeString(this.rRX);
    paramParcel.writeInt(this.rPM);
    paramParcel.writeString(this.rRY);
    GMTrace.o(6879866519552L, 51259);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/mall/MallNews.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */