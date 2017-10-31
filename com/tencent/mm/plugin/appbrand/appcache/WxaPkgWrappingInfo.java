package com.tencent.mm.plugin.appbrand.appcache;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class WxaPkgWrappingInfo
  implements Parcelable
{
  public static final Parcelable.Creator<WxaPkgWrappingInfo> CREATOR;
  public boolean iCA;
  public String iCB;
  public volatile transient Map<String, WxaPkgItemInfo> iCC;
  public ArrayList<WxaPkgItemInfo> iCD;
  public boolean iCE;
  public String iCF;
  public int iCx;
  public int iCy;
  public long iCz;
  
  static
  {
    GMTrace.i(10613669494784L, 79078);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10613669494784L, 79078);
  }
  
  public WxaPkgWrappingInfo()
  {
    GMTrace.i(10612729970688L, 79071);
    this.iCC = null;
    this.iCD = null;
    this.iCE = false;
    GMTrace.o(10612729970688L, 79071);
  }
  
  public WxaPkgWrappingInfo(Parcel paramParcel)
  {
    GMTrace.i(10613401059328L, 79076);
    this.iCC = null;
    this.iCD = null;
    this.iCE = false;
    this.iCx = paramParcel.readInt();
    this.iCy = paramParcel.readInt();
    this.iCz = paramParcel.readLong();
    if (paramParcel.readByte() != 0)
    {
      bool1 = true;
      this.iCA = bool1;
      this.iCB = paramParcel.readString();
      this.iCD = paramParcel.createTypedArrayList(WxaPkgItemInfo.CREATOR);
      if (paramParcel.readByte() == 0) {
        break label122;
      }
    }
    label122:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.iCE = bool1;
      this.iCF = paramParcel.readString();
      GMTrace.o(10613401059328L, 79076);
      return;
      bool1 = false;
      break;
    }
  }
  
  public static WxaPkgWrappingInfo of(String paramString)
  {
    GMTrace.i(10612595752960L, 79070);
    if (bg.mZ(paramString))
    {
      GMTrace.o(10612595752960L, 79070);
      return null;
    }
    Object localObject = new n(new File(paramString));
    if (!((n)localObject).iBl)
    {
      w.e("MicroMsg.WxaPkgWrappingInfo#obtain", "wxPkg invalid, path = %s ", new Object[] { paramString });
      ((n)localObject).close();
      GMTrace.o(10612595752960L, 79070);
      return null;
    }
    if (!((n)localObject).Sx())
    {
      w.e("MicroMsg.WxaPkgWrappingInfo#obtain", "wxPkg read info failed, path = %s ", new Object[] { paramString });
      ((n)localObject).close();
      GMTrace.o(10612595752960L, 79070);
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = ((n)localObject).Sy().iterator();
    while (localIterator.hasNext())
    {
      n.a locala = (n.a)localIterator.next();
      localLinkedList.add(new WxaPkgItemInfo(locala.fnP, locala.iBr, locala.iBq));
    }
    ((n)localObject).close();
    localObject = new WxaPkgWrappingInfo();
    ((WxaPkgWrappingInfo)localObject).iCE = true;
    ((WxaPkgWrappingInfo)localObject).iCD = new ArrayList(localLinkedList);
    ((WxaPkgWrappingInfo)localObject).iCF = paramString;
    ((WxaPkgWrappingInfo)localObject).iCA = false;
    GMTrace.o(10612595752960L, 79070);
    return (WxaPkgWrappingInfo)localObject;
  }
  
  public final void a(WxaPkgWrappingInfo paramWxaPkgWrappingInfo)
  {
    GMTrace.i(10612864188416L, 79072);
    this.iCx = paramWxaPkgWrappingInfo.iCx;
    this.iCy = paramWxaPkgWrappingInfo.iCy;
    this.iCz = paramWxaPkgWrappingInfo.iCz;
    if (!paramWxaPkgWrappingInfo.iCE)
    {
      GMTrace.o(10612864188416L, 79072);
      return;
    }
    this.iCA = paramWxaPkgWrappingInfo.iCA;
    this.iCE = true;
    this.iCD = paramWxaPkgWrappingInfo.iCD;
    this.iCF = paramWxaPkgWrappingInfo.iCF;
    GMTrace.o(10612864188416L, 79072);
  }
  
  public final int describeContents()
  {
    GMTrace.i(10613132623872L, 79074);
    GMTrace.o(10613132623872L, 79074);
    return 0;
  }
  
  public final String toString()
  {
    GMTrace.i(10612998406144L, 79073);
    StringBuilder localStringBuilder = new StringBuilder("WxaPkgWrappingInfo{pkgDebugType=").append(this.iCx).append(", pkgVersion=").append(this.iCy).append(", pkgCreateTime=").append(this.iCz).append(", localPkg=").append(this.iCA).append(", pkgMd5='").append(this.iCB).append('\'').append(", pkgFileInfoList.size=");
    if (this.iCD == null) {}
    for (Object localObject = "null";; localObject = Integer.valueOf(this.iCD.size()))
    {
      localObject = localObject + ", hasPkgFileInfoList=" + this.iCE + ", pkgPath='" + this.iCF + '\'' + '}';
      GMTrace.o(10612998406144L, 79073);
      return (String)localObject;
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    byte b2 = 1;
    GMTrace.i(10613266841600L, 79075);
    paramParcel.writeInt(this.iCx);
    paramParcel.writeInt(this.iCy);
    paramParcel.writeLong(this.iCz);
    if (this.iCA)
    {
      b1 = 1;
      paramParcel.writeByte(b1);
      paramParcel.writeString(this.iCB);
      paramParcel.writeTypedList(this.iCD);
      if (!this.iCE) {
        break label104;
      }
    }
    label104:
    for (byte b1 = b2;; b1 = 0)
    {
      paramParcel.writeByte(b1);
      paramParcel.writeString(this.iCF);
      GMTrace.o(10613266841600L, 79075);
      return;
      b1 = 0;
      break;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/WxaPkgWrappingInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */