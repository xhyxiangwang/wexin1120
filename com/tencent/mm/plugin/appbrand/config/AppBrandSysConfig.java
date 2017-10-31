package com.tencent.mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle;
import com.tencent.mm.protocal.c.cw;
import java.util.ArrayList;

public class AppBrandSysConfig
  implements Parcelable
{
  public static final Parcelable.Creator<AppBrandSysConfig> CREATOR;
  public String appId;
  public String ftu;
  public String fxq;
  public String iIF;
  public String iIG;
  public boolean iIH;
  public boolean iII;
  public AppRuntimeApiPermissionBundle iIJ;
  public int iIK;
  public int iIL;
  public int iIM;
  public int iIN;
  public int iIO;
  public long iIP;
  public int iIQ;
  public boolean iIR;
  public boolean iIS;
  public ArrayList<String> iIT;
  public ArrayList<String> iIU;
  public ArrayList<String> iIV;
  public ArrayList<String> iIW;
  public boolean iIX;
  public int iIY;
  public int iIZ;
  public final WxaPkgWrappingInfo iJa;
  public final WxaPkgWrappingInfo iJb;
  public AppBrandGlobalSystemConfig iJc;
  cw iJd;
  public transient int iJe;
  public transient String iJf;
  public int uin;
  
  static
  {
    GMTrace.i(10591389351936L, 78912);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10591389351936L, 78912);
  }
  
  public AppBrandSysConfig()
  {
    GMTrace.i(10590718263296L, 78907);
    this.iIH = false;
    this.iII = false;
    this.iJa = new WxaPkgWrappingInfo();
    this.iJb = new WxaPkgWrappingInfo();
    GMTrace.o(10590718263296L, 78907);
  }
  
  protected AppBrandSysConfig(Parcel paramParcel)
  {
    GMTrace.i(10591255134208L, 78911);
    this.iIH = false;
    this.iII = false;
    this.uin = paramParcel.readInt();
    this.ftu = paramParcel.readString();
    this.fxq = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.iIF = paramParcel.readString();
    this.iIG = paramParcel.readString();
    if (paramParcel.readByte() != 0)
    {
      bool1 = true;
      this.iIH = bool1;
      if (paramParcel.readByte() == 0) {
        break label340;
      }
      bool1 = true;
      label95:
      this.iII = bool1;
      this.iIJ = ((AppRuntimeApiPermissionBundle)paramParcel.readParcelable(AppRuntimeApiPermissionBundle.class.getClassLoader()));
      this.iIK = paramParcel.readInt();
      this.iIL = paramParcel.readInt();
      this.iIM = paramParcel.readInt();
      this.iIN = paramParcel.readInt();
      this.iIO = paramParcel.readInt();
      this.iIP = paramParcel.readLong();
      this.iIQ = paramParcel.readInt();
      if (paramParcel.readByte() == 0) {
        break label345;
      }
      bool1 = true;
      label181:
      this.iIR = bool1;
      if (paramParcel.readByte() == 0) {
        break label350;
      }
      bool1 = true;
      label195:
      this.iIS = bool1;
      this.iIT = paramParcel.createStringArrayList();
      this.iIU = paramParcel.createStringArrayList();
      this.iIV = paramParcel.createStringArrayList();
      this.iIW = paramParcel.createStringArrayList();
      this.iJa = ((WxaPkgWrappingInfo)paramParcel.readParcelable(WxaPkgWrappingInfo.class.getClassLoader()));
      this.iJb = ((WxaPkgWrappingInfo)paramParcel.readParcelable(WxaPkgWrappingInfo.class.getClassLoader()));
      this.iJc = ((AppBrandGlobalSystemConfig)paramParcel.readParcelable(AppBrandGlobalSystemConfig.class.getClassLoader()));
      if (paramParcel.readByte() <= 0) {
        break label355;
      }
    }
    label340:
    label345:
    label350:
    label355:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.iIX = bool1;
      this.iIY = paramParcel.readInt();
      this.iIZ = paramParcel.readInt();
      this.iJd = ((cw)com.tencent.mm.ipcinvoker.extension.c.a(com.tencent.mm.ipcinvoker.wx_extension.c.class.getName(), paramParcel));
      GMTrace.o(10591255134208L, 78911);
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label95;
      bool1 = false;
      break label181;
      bool1 = false;
      break label195;
    }
  }
  
  public final long Un()
  {
    GMTrace.i(10590584045568L, 78906);
    if (this.iJd == null)
    {
      GMTrace.o(10590584045568L, 78906);
      return 0L;
    }
    long l = this.iJd.two;
    GMTrace.o(10590584045568L, 78906);
    return l;
  }
  
  public int describeContents()
  {
    GMTrace.i(10590986698752L, 78909);
    GMTrace.o(10590986698752L, 78909);
    return 0;
  }
  
  public String toString()
  {
    GMTrace.i(10590852481024L, 78908);
    String str = "AppBrandSysConfig{uin=" + this.uin + ", brandId='" + this.ftu + '\'' + ", brandName='" + this.fxq + '\'' + ", appId='" + this.appId + '\'' + ", appIconUrl='" + this.iIF + '\'' + ", debugEnabled=" + this.iIH + ", performancePanelEnabled=" + this.iII + ", maxWebViewDepth=" + this.iIK + ", maxBackgroundLifeSpan=" + this.iIL + ", maxRequestConcurrent=" + this.iIM + ", maxUploadConcurrent=" + this.iIN + ", maxDownloadConcurrent=" + this.iIO + ", requestDomains=" + this.iIT + ", socketDomains=" + this.iIU + ", uploadDomains=" + this.iIV + ", downloadDomains=" + this.iIW + ", appPkgInfo=" + this.iJa + ", libPkgInfo=" + this.iJb + ", systemSettings=" + this.iJc + ", runningFlag=" + SysConfigUtil.a(this.iJd) + '}';
    GMTrace.o(10590852481024L, 78908);
    return str;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    byte b2 = 1;
    GMTrace.i(10591120916480L, 78910);
    paramParcel.writeInt(this.uin);
    paramParcel.writeString(this.ftu);
    paramParcel.writeString(this.fxq);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.iIF);
    paramParcel.writeString(this.iIG);
    if (this.iIH)
    {
      b1 = 1;
      paramParcel.writeByte(b1);
      if (!this.iII) {
        break label294;
      }
      b1 = 1;
      label83:
      paramParcel.writeByte(b1);
      paramParcel.writeParcelable(this.iIJ, paramInt);
      paramParcel.writeInt(this.iIK);
      paramParcel.writeInt(this.iIL);
      paramParcel.writeInt(this.iIM);
      paramParcel.writeInt(this.iIN);
      paramParcel.writeInt(this.iIO);
      paramParcel.writeLong(this.iIP);
      paramParcel.writeInt(this.iIQ);
      if (!this.iIR) {
        break label299;
      }
      b1 = 1;
      label162:
      paramParcel.writeByte(b1);
      if (!this.iIS) {
        break label304;
      }
      b1 = 1;
      label176:
      paramParcel.writeByte(b1);
      paramParcel.writeStringList(this.iIT);
      paramParcel.writeStringList(this.iIU);
      paramParcel.writeStringList(this.iIV);
      paramParcel.writeStringList(this.iIW);
      paramParcel.writeParcelable(this.iJa, paramInt);
      paramParcel.writeParcelable(this.iJb, paramInt);
      paramParcel.writeParcelable(this.iJc, paramInt);
      if (!this.iIX) {
        break label309;
      }
    }
    label294:
    label299:
    label304:
    label309:
    for (byte b1 = b2;; b1 = 0)
    {
      paramParcel.writeByte(b1);
      paramParcel.writeInt(this.iIY);
      paramParcel.writeInt(this.iIZ);
      com.tencent.mm.ipcinvoker.extension.c.a(this.iJd, paramParcel);
      GMTrace.o(10591120916480L, 78910);
      return;
      b1 = 0;
      break;
      b1 = 0;
      break label83;
      b1 = 0;
      break label162;
      b1 = 0;
      break label176;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/AppBrandSysConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */