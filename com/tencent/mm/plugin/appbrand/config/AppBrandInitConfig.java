package com.tencent.mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import org.json.JSONException;
import org.json.JSONObject;

public final class AppBrandInitConfig
  implements Parcelable
{
  public static final Parcelable.Creator<AppBrandInitConfig> CREATOR;
  public String appId;
  public String fxq;
  public String hjt;
  public String hju;
  public int iCo;
  public final AppBrandLaunchReferrer iIA;
  public boolean iIw;
  public boolean iIx;
  public String iIy;
  public boolean iIz;
  public String iconUrl;
  public long startTime;
  
  static
  {
    GMTrace.i(10585483771904L, 78868);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10585483771904L, 78868);
  }
  
  public AppBrandInitConfig()
  {
    GMTrace.i(10584812683264L, 78863);
    this.iIA = new AppBrandLaunchReferrer();
    GMTrace.o(10584812683264L, 78863);
  }
  
  public AppBrandInitConfig(Parcel paramParcel)
  {
    GMTrace.i(10585215336448L, 78866);
    this.iIA = new AppBrandLaunchReferrer();
    this.appId = paramParcel.readString();
    this.fxq = paramParcel.readString();
    this.iconUrl = paramParcel.readString();
    this.iCo = paramParcel.readInt();
    if (paramParcel.readByte() != 0)
    {
      bool1 = true;
      this.iIw = bool1;
      if (paramParcel.readByte() == 0) {
        break label153;
      }
      bool1 = true;
      label80:
      this.iIx = bool1;
      this.iIy = paramParcel.readString();
      this.hjt = paramParcel.readString();
      this.hju = paramParcel.readString();
      if (paramParcel.readByte() == 0) {
        break label158;
      }
    }
    label153:
    label158:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.iIz = bool1;
      this.startTime = paramParcel.readLong();
      this.iIA.g(paramParcel);
      GMTrace.o(10585215336448L, 78866);
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label80;
    }
  }
  
  public final JSONObject Uk()
  {
    GMTrace.i(18346087022592L, 136689);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("shareKey", this.hju);
      localJSONObject.put("shareName", this.hjt);
      if (localJSONObject.length() == 0)
      {
        GMTrace.o(18346087022592L, 136689);
        return null;
      }
    }
    catch (JSONException localJSONException)
    {
      GMTrace.o(18346087022592L, 136689);
      return null;
    }
    GMTrace.o(18346087022592L, 136689);
    return localJSONException;
  }
  
  public final int describeContents()
  {
    GMTrace.i(10584946900992L, 78864);
    GMTrace.o(10584946900992L, 78864);
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    byte b2 = 1;
    GMTrace.i(10585081118720L, 78865);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.fxq);
    paramParcel.writeString(this.iconUrl);
    paramParcel.writeInt(this.iCo);
    if (this.iIw)
    {
      b1 = 1;
      paramParcel.writeByte(b1);
      if (!this.iIx) {
        break label141;
      }
      b1 = 1;
      label66:
      paramParcel.writeByte(b1);
      paramParcel.writeString(this.iIy);
      paramParcel.writeString(this.hjt);
      paramParcel.writeString(this.hju);
      if (!this.iIz) {
        break label146;
      }
    }
    label141:
    label146:
    for (byte b1 = b2;; b1 = 0)
    {
      paramParcel.writeByte(b1);
      paramParcel.writeLong(this.startTime);
      this.iIA.writeToParcel(paramParcel, paramInt);
      GMTrace.o(10585081118720L, 78865);
      return;
      b1 = 0;
      break;
      b1 = 0;
      break label66;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/AppBrandInitConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */