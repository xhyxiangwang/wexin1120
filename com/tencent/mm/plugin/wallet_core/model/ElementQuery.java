package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class ElementQuery
  implements Parcelable
{
  public static final Parcelable.Creator<ElementQuery> CREATOR;
  public static String rNO;
  public JSONObject hoi;
  public String mVv;
  public String oql;
  public String oqm;
  public int rKN;
  public String rMC;
  public String rNP;
  public boolean rNQ;
  public boolean rNR;
  public boolean rNS;
  public boolean rNT;
  public String rNU;
  public boolean rNV;
  public int rNW;
  public int rNX;
  public String rNY;
  public String rNZ;
  public String rOa;
  public String rOb;
  public String rOc;
  public String rOd;
  public boolean rOe;
  public boolean rOf;
  public boolean rOg;
  public boolean rOh;
  public boolean rOi;
  public boolean rOj;
  public boolean rOk;
  public boolean rOl;
  public boolean rOm;
  public String rOn;
  private List<Integer> rOo;
  public boolean rOp;
  public boolean rOq;
  
  static
  {
    GMTrace.i(6897314824192L, 51389);
    rNO = "bind_serial";
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(6897314824192L, 51389);
  }
  
  public ElementQuery()
  {
    GMTrace.i(6896777953280L, 51385);
    this.rOo = null;
    this.rOq = false;
    GMTrace.o(6896777953280L, 51385);
  }
  
  public ElementQuery(Parcel paramParcel)
  {
    GMTrace.i(6896912171008L, 51386);
    this.rOo = null;
    this.rOq = false;
    this.oqm = paramParcel.readString();
    this.mVv = paramParcel.readString();
    this.rNP = paramParcel.readString();
    if (1 == paramParcel.readInt())
    {
      bool1 = true;
      this.rNQ = bool1;
      if (1 != paramParcel.readInt()) {
        break label414;
      }
      bool1 = true;
      label73:
      this.rNR = bool1;
      if (1 != paramParcel.readInt()) {
        break label419;
      }
      bool1 = true;
      label88:
      this.rNS = bool1;
      if (1 != paramParcel.readInt()) {
        break label424;
      }
      bool1 = true;
      label103:
      this.rNT = bool1;
      this.rNU = paramParcel.readString();
      this.oqm = paramParcel.readString();
      if (1 != paramParcel.readInt()) {
        break label429;
      }
      bool1 = true;
      label134:
      this.rNV = bool1;
      this.rNW = paramParcel.readInt();
      this.rNX = paramParcel.readInt();
      this.oql = paramParcel.readString();
      this.rNY = paramParcel.readString();
      this.rNZ = paramParcel.readString();
      this.rOa = paramParcel.readString();
      this.rOd = paramParcel.readString();
      this.rOc = paramParcel.readString();
      this.rOb = paramParcel.readString();
      if (1 != paramParcel.readInt()) {
        break label434;
      }
      bool1 = true;
      label221:
      this.rOe = bool1;
      if (1 != paramParcel.readInt()) {
        break label439;
      }
      bool1 = true;
      label236:
      this.rOf = bool1;
      if (1 != paramParcel.readInt()) {
        break label444;
      }
      bool1 = true;
      label251:
      this.rOg = bool1;
      if (1 != paramParcel.readInt()) {
        break label449;
      }
      bool1 = true;
      label266:
      this.rOh = bool1;
      if (1 != paramParcel.readInt()) {
        break label454;
      }
      bool1 = true;
      label281:
      this.rOi = bool1;
      if (1 != paramParcel.readInt()) {
        break label459;
      }
      bool1 = true;
      label296:
      this.rOj = bool1;
      if (1 != paramParcel.readInt()) {
        break label464;
      }
      bool1 = true;
      label311:
      this.rOl = bool1;
      if (1 != paramParcel.readInt()) {
        break label469;
      }
      bool1 = true;
      label326:
      this.rOk = bool1;
      if (1 != paramParcel.readInt()) {
        break label474;
      }
      bool1 = true;
      label341:
      this.rOm = bool1;
      this.rKN = paramParcel.readInt();
      this.rOn = paramParcel.readString();
      if (1 != paramParcel.readInt()) {
        break label479;
      }
      bool1 = true;
      label372:
      this.rOq = bool1;
      this.rMC = paramParcel.readString();
      if (1 != paramParcel.readInt()) {
        break label484;
      }
    }
    label414:
    label419:
    label424:
    label429:
    label434:
    label439:
    label444:
    label449:
    label454:
    label459:
    label464:
    label469:
    label474:
    label479:
    label484:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.rOp = bool1;
      GMTrace.o(6896912171008L, 51386);
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label73;
      bool1 = false;
      break label88;
      bool1 = false;
      break label103;
      bool1 = false;
      break label134;
      bool1 = false;
      break label221;
      bool1 = false;
      break label236;
      bool1 = false;
      break label251;
      bool1 = false;
      break label266;
      bool1 = false;
      break label281;
      bool1 = false;
      break label296;
      bool1 = false;
      break label311;
      bool1 = false;
      break label326;
      bool1 = false;
      break label341;
      bool1 = false;
      break label372;
    }
  }
  
  public final boolean bwt()
  {
    GMTrace.i(6896509517824L, 51383);
    if (1 == this.rNX)
    {
      GMTrace.o(6896509517824L, 51383);
      return true;
    }
    GMTrace.o(6896509517824L, 51383);
    return false;
  }
  
  public final List<Integer> bwu()
  {
    GMTrace.i(6896643735552L, 51384);
    this.rOn = "1|2|5|9";
    Object localObject;
    if (this.rOo != null)
    {
      localObject = this.rOo;
      GMTrace.o(6896643735552L, 51384);
      return (List<Integer>)localObject;
    }
    if (!bg.mZ(this.rOn))
    {
      this.rOo = new ArrayList();
      localObject = this.rOn.split("\\|");
      int j = localObject.length;
      int i = 0;
      while (i < j)
      {
        int k = bg.getInt(localObject[i], 0);
        if (k > 0) {
          this.rOo.add(Integer.valueOf(k));
        }
        i += 1;
      }
      localObject = this.rOo;
      GMTrace.o(6896643735552L, 51384);
      return (List<Integer>)localObject;
    }
    GMTrace.o(6896643735552L, 51384);
    return null;
  }
  
  public int describeContents()
  {
    GMTrace.i(6897046388736L, 51387);
    GMTrace.o(6897046388736L, 51387);
    return 0;
  }
  
  public final boolean isError()
  {
    GMTrace.i(6896375300096L, 51382);
    boolean bool = "0".equals(bg.ap(this.rNZ, "").trim());
    GMTrace.o(6896375300096L, 51382);
    return bool;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    GMTrace.i(6897180606464L, 51388);
    paramParcel.writeString(bg.ap(this.oqm, ""));
    paramParcel.writeString(bg.ap(this.mVv, ""));
    paramParcel.writeString(bg.ap(this.rNP, ""));
    if (this.rNQ)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      if (!this.rNR) {
        break label444;
      }
      paramInt = 1;
      label72:
      paramParcel.writeInt(paramInt);
      if (!this.rNS) {
        break label449;
      }
      paramInt = 1;
      label86:
      paramParcel.writeInt(paramInt);
      if (!this.rNT) {
        break label454;
      }
      paramInt = 1;
      label100:
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(bg.ap(this.rNU, ""));
      paramParcel.writeString(bg.ap(this.oqm, ""));
      if (!this.rNV) {
        break label459;
      }
      paramInt = 1;
      label140:
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.rNW);
      paramParcel.writeInt(this.rNX);
      paramParcel.writeString(bg.ap(this.oql, ""));
      paramParcel.writeString(bg.ap(this.rNY, ""));
      paramParcel.writeString(bg.ap(this.rNZ, ""));
      paramParcel.writeString(bg.ap(this.rOa, ""));
      paramParcel.writeString(bg.ap(this.rOd, ""));
      paramParcel.writeString(bg.ap(this.rOc, ""));
      paramParcel.writeString(bg.ap(this.rOb, ""));
      if (!this.rOe) {
        break label464;
      }
      paramInt = 1;
      label261:
      paramParcel.writeInt(paramInt);
      if (!this.rOf) {
        break label469;
      }
      paramInt = 1;
      label275:
      paramParcel.writeInt(paramInt);
      if (!this.rOg) {
        break label474;
      }
      paramInt = 1;
      label289:
      paramParcel.writeInt(paramInt);
      if (!this.rOh) {
        break label479;
      }
      paramInt = 1;
      label303:
      paramParcel.writeInt(paramInt);
      if (!this.rOi) {
        break label484;
      }
      paramInt = 1;
      label317:
      paramParcel.writeInt(paramInt);
      if (!this.rOj) {
        break label489;
      }
      paramInt = 1;
      label331:
      paramParcel.writeInt(paramInt);
      if (!this.rOl) {
        break label494;
      }
      paramInt = 1;
      label345:
      paramParcel.writeInt(paramInt);
      if (!this.rOk) {
        break label499;
      }
      paramInt = 1;
      label359:
      paramParcel.writeInt(paramInt);
      if (!this.rOm) {
        break label504;
      }
      paramInt = 1;
      label373:
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.rKN);
      paramParcel.writeString(this.rOn);
      if (!this.rOq) {
        break label509;
      }
      paramInt = 1;
      label403:
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.rMC);
      if (!this.rOp) {
        break label514;
      }
    }
    label444:
    label449:
    label454:
    label459:
    label464:
    label469:
    label474:
    label479:
    label484:
    label489:
    label494:
    label499:
    label504:
    label509:
    label514:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      GMTrace.o(6897180606464L, 51388);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label72;
      paramInt = 0;
      break label86;
      paramInt = 0;
      break label100;
      paramInt = 0;
      break label140;
      paramInt = 0;
      break label261;
      paramInt = 0;
      break label275;
      paramInt = 0;
      break label289;
      paramInt = 0;
      break label303;
      paramInt = 0;
      break label317;
      paramInt = 0;
      break label331;
      paramInt = 0;
      break label345;
      paramInt = 0;
      break label359;
      paramInt = 0;
      break label373;
      paramInt = 0;
      break label403;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/ElementQuery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */