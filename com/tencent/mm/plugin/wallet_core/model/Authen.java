package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;

public class Authen
  implements Parcelable
{
  public static final Parcelable.Creator<Authen> CREATOR;
  public String country;
  public int fJg;
  public String gbP;
  public String gbW;
  public String gbX;
  public String hwK;
  public String imw;
  public String mVx;
  public PayInfo oRb;
  public String oql;
  public String oqm;
  public String rEu;
  public String rKI;
  public String rMA;
  public String rMB;
  public String rMC;
  public String rMD;
  public String rME;
  public String rMF;
  public String rMG;
  public String rMH;
  public String rMI;
  public String rMJ;
  public String rMK;
  public int rMt;
  public String rMu;
  public String rMv;
  public String rMw;
  public int rMx;
  public String rMy;
  public String rMz;
  public String token;
  
  static
  {
    GMTrace.i(6909394419712L, 51479);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(6909394419712L, 51479);
  }
  
  public Authen()
  {
    GMTrace.i(6909125984256L, 51477);
    this.rMt = 0;
    this.oRb = new PayInfo();
    GMTrace.o(6909125984256L, 51477);
  }
  
  public Authen(Parcel paramParcel)
  {
    GMTrace.i(6909260201984L, 51478);
    this.rMt = 0;
    this.oRb = new PayInfo();
    this.fJg = paramParcel.readInt();
    this.rMu = paramParcel.readString();
    this.oql = paramParcel.readString();
    this.oqm = paramParcel.readString();
    this.rMv = paramParcel.readString();
    this.rMw = paramParcel.readString();
    this.rMx = paramParcel.readInt();
    this.rKI = paramParcel.readString();
    this.rMy = paramParcel.readString();
    this.rMz = paramParcel.readString();
    this.rMA = paramParcel.readString();
    this.token = paramParcel.readString();
    this.rMD = paramParcel.readString();
    this.rME = paramParcel.readString();
    this.country = paramParcel.readString();
    this.gbW = paramParcel.readString();
    this.gbX = paramParcel.readString();
    this.hwK = paramParcel.readString();
    this.mVx = paramParcel.readString();
    this.imw = paramParcel.readString();
    this.gbP = paramParcel.readString();
    this.rEu = paramParcel.readString();
    this.rMF = paramParcel.readString();
    this.rMG = paramParcel.readString();
    this.rMC = paramParcel.readString();
    this.rMH = paramParcel.readString();
    this.rMI = paramParcel.readString();
    this.rMJ = paramParcel.readString();
    this.rMK = paramParcel.readString();
    GMTrace.o(6909260201984L, 51478);
  }
  
  public int describeContents()
  {
    GMTrace.i(6908857548800L, 51475);
    GMTrace.o(6908857548800L, 51475);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(6908991766528L, 51476);
    paramParcel.writeInt(this.fJg);
    paramParcel.writeString(bg.ap(this.rMu, ""));
    paramParcel.writeString(bg.ap(this.oql, ""));
    paramParcel.writeString(bg.ap(this.oqm, ""));
    paramParcel.writeString(bg.ap(this.rMv, ""));
    paramParcel.writeString(bg.ap(this.rMw, ""));
    paramParcel.writeInt(this.rMx);
    paramParcel.writeString(bg.ap(this.rKI, ""));
    paramParcel.writeString(bg.ap(this.rMy, ""));
    paramParcel.writeString(bg.ap(this.rMz, ""));
    paramParcel.writeString(bg.ap(this.rMA, ""));
    paramParcel.writeString(bg.ap(this.token, ""));
    paramParcel.writeString(bg.ap(this.rMD, ""));
    paramParcel.writeString(bg.ap(this.rME, ""));
    paramParcel.writeString(bg.ap(this.country, ""));
    paramParcel.writeString(bg.ap(this.gbW, ""));
    paramParcel.writeString(bg.ap(this.gbX, ""));
    paramParcel.writeString(bg.ap(this.hwK, ""));
    paramParcel.writeString(bg.ap(this.mVx, ""));
    paramParcel.writeString(bg.ap(this.imw, ""));
    paramParcel.writeString(bg.ap(this.gbP, ""));
    paramParcel.writeString(bg.ap(this.rEu, ""));
    paramParcel.writeString(bg.ap(this.rMF, ""));
    paramParcel.writeString(bg.ap(this.rMG, ""));
    paramParcel.writeString(bg.ap(this.rMC, ""));
    paramParcel.writeString(bg.ap(this.rMH, ""));
    paramParcel.writeString(bg.ap(this.rMI, ""));
    paramParcel.writeString(bg.ap(this.rMJ, ""));
    paramParcel.writeString(bg.ap(this.rMK, ""));
    GMTrace.o(6908991766528L, 51476);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/Authen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */