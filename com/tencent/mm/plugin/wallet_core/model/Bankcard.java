package com.tencent.mm.plugin.wallet_core.model;

import android.content.Context;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.dl;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;

public class Bankcard
  extends dl
  implements Parcelable
{
  public static final Parcelable.Creator<Bankcard> CREATOR;
  public static c.a gLR;
  public static int rMO;
  public static int rMP;
  public static int rMQ;
  public static int rMR;
  public static int rMS;
  public static int rMT;
  public static int rMU;
  public String rMV;
  public String rMW;
  public String rMX;
  public String rMY;
  public String rMZ;
  public int rMx;
  public String rMz;
  public double rNa;
  public String rNb;
  public double rNc;
  public String rNd;
  public String rNe;
  public String rNf;
  public String rNg;
  public boolean rNh;
  public e rNi;
  
  static
  {
    GMTrace.i(6899462307840L, 51405);
    rMO = 1;
    rMP = 2;
    rMQ = 4;
    rMR = 8;
    rMS = 16;
    rMT = 32;
    rMU = 64;
    c.a locala = new c.a();
    locala.hRR = new Field[36];
    locala.columns = new String[37];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "bindSerial";
    locala.uQH.put("bindSerial", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" bindSerial TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.uQG = "bindSerial";
    locala.columns[1] = "cardType";
    locala.uQH.put("cardType", "INTEGER");
    localStringBuilder.append(" cardType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "bankcardState";
    locala.uQH.put("bankcardState", "INTEGER");
    localStringBuilder.append(" bankcardState INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "forbidWord";
    locala.uQH.put("forbidWord", "TEXT");
    localStringBuilder.append(" forbidWord TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "bankName";
    locala.uQH.put("bankName", "TEXT");
    localStringBuilder.append(" bankName TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "bankcardType";
    locala.uQH.put("bankcardType", "TEXT");
    localStringBuilder.append(" bankcardType TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "bankcardTypeName";
    locala.uQH.put("bankcardTypeName", "TEXT");
    localStringBuilder.append(" bankcardTypeName TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "bankcardTag";
    locala.uQH.put("bankcardTag", "INTEGER");
    localStringBuilder.append(" bankcardTag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[8] = "bankcardTail";
    locala.uQH.put("bankcardTail", "TEXT");
    localStringBuilder.append(" bankcardTail TEXT");
    localStringBuilder.append(", ");
    locala.columns[9] = "supportTag";
    locala.uQH.put("supportTag", "INTEGER");
    localStringBuilder.append(" supportTag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "mobile";
    locala.uQH.put("mobile", "TEXT");
    localStringBuilder.append(" mobile TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "trueName";
    locala.uQH.put("trueName", "TEXT");
    localStringBuilder.append(" trueName TEXT");
    localStringBuilder.append(", ");
    locala.columns[12] = "desc";
    locala.uQH.put("desc", "TEXT");
    localStringBuilder.append(" desc TEXT");
    localStringBuilder.append(", ");
    locala.columns[13] = "bankPhone";
    locala.uQH.put("bankPhone", "TEXT");
    localStringBuilder.append(" bankPhone TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "bizUsername";
    locala.uQH.put("bizUsername", "TEXT");
    localStringBuilder.append(" bizUsername TEXT");
    localStringBuilder.append(", ");
    locala.columns[15] = "onceQuotaKind";
    locala.uQH.put("onceQuotaKind", "DOUBLE");
    localStringBuilder.append(" onceQuotaKind DOUBLE");
    localStringBuilder.append(", ");
    locala.columns[16] = "onceQuotaVirtual";
    locala.uQH.put("onceQuotaVirtual", "DOUBLE");
    localStringBuilder.append(" onceQuotaVirtual DOUBLE");
    localStringBuilder.append(", ");
    locala.columns[17] = "dayQuotaKind";
    locala.uQH.put("dayQuotaKind", "DOUBLE");
    localStringBuilder.append(" dayQuotaKind DOUBLE");
    localStringBuilder.append(", ");
    locala.columns[18] = "dayQuotaVirtual";
    locala.uQH.put("dayQuotaVirtual", "DOUBLE");
    localStringBuilder.append(" dayQuotaVirtual DOUBLE");
    localStringBuilder.append(", ");
    locala.columns[19] = "fetchArriveTime";
    locala.uQH.put("fetchArriveTime", "LONG");
    localStringBuilder.append(" fetchArriveTime LONG");
    localStringBuilder.append(", ");
    locala.columns[20] = "fetchArriveTimeWording";
    locala.uQH.put("fetchArriveTimeWording", "TEXT");
    localStringBuilder.append(" fetchArriveTimeWording TEXT");
    localStringBuilder.append(", ");
    locala.columns[21] = "repay_url";
    locala.uQH.put("repay_url", "TEXT");
    localStringBuilder.append(" repay_url TEXT");
    localStringBuilder.append(", ");
    locala.columns[22] = "wxcreditState";
    locala.uQH.put("wxcreditState", "INTEGER");
    localStringBuilder.append(" wxcreditState INTEGER");
    localStringBuilder.append(", ");
    locala.columns[23] = "bankcardClientType";
    locala.uQH.put("bankcardClientType", "INTEGER");
    localStringBuilder.append(" bankcardClientType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[24] = "ext_msg";
    locala.uQH.put("ext_msg", "TEXT");
    localStringBuilder.append(" ext_msg TEXT");
    localStringBuilder.append(", ");
    locala.columns[25] = "support_micropay";
    locala.uQH.put("support_micropay", "INTEGER");
    localStringBuilder.append(" support_micropay INTEGER");
    localStringBuilder.append(", ");
    locala.columns[26] = "arrive_type";
    locala.uQH.put("arrive_type", "TEXT");
    localStringBuilder.append(" arrive_type TEXT");
    localStringBuilder.append(", ");
    locala.columns[27] = "avail_save_wording";
    locala.uQH.put("avail_save_wording", "TEXT");
    localStringBuilder.append(" avail_save_wording TEXT");
    localStringBuilder.append(", ");
    locala.columns[28] = "fetch_charge_rate";
    locala.uQH.put("fetch_charge_rate", "DOUBLE");
    localStringBuilder.append(" fetch_charge_rate DOUBLE");
    localStringBuilder.append(", ");
    locala.columns[29] = "full_fetch_charge_fee";
    locala.uQH.put("full_fetch_charge_fee", "DOUBLE");
    localStringBuilder.append(" full_fetch_charge_fee DOUBLE");
    localStringBuilder.append(", ");
    locala.columns[30] = "fetch_charge_info";
    locala.uQH.put("fetch_charge_info", "TEXT");
    localStringBuilder.append(" fetch_charge_info TEXT");
    localStringBuilder.append(", ");
    locala.columns[31] = "tips";
    locala.uQH.put("tips", "TEXT");
    localStringBuilder.append(" tips TEXT");
    localStringBuilder.append(", ");
    locala.columns[32] = "forbid_title";
    locala.uQH.put("forbid_title", "TEXT");
    localStringBuilder.append(" forbid_title TEXT");
    localStringBuilder.append(", ");
    locala.columns[33] = "forbid_url";
    locala.uQH.put("forbid_url", "TEXT");
    localStringBuilder.append(" forbid_url TEXT");
    localStringBuilder.append(", ");
    locala.columns[34] = "no_micro_word";
    locala.uQH.put("no_micro_word", "TEXT");
    localStringBuilder.append(" no_micro_word TEXT");
    localStringBuilder.append(", ");
    locala.columns[35] = "card_bottom_wording";
    locala.uQH.put("card_bottom_wording", "TEXT");
    localStringBuilder.append(" card_bottom_wording TEXT");
    locala.columns[36] = "rowid";
    locala.uQI = localStringBuilder.toString();
    gLR = locala;
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(6899462307840L, 51405);
  }
  
  public Bankcard()
  {
    GMTrace.i(6897449041920L, 51390);
    this.rMZ = null;
    this.rNg = null;
    this.rNh = false;
    GMTrace.o(6897449041920L, 51390);
  }
  
  public Bankcard(byte paramByte)
  {
    GMTrace.i(6897583259648L, 51391);
    this.rMZ = null;
    this.rNg = null;
    this.rNh = false;
    this.field_bankcardTag = 1;
    GMTrace.o(6897583259648L, 51391);
  }
  
  public Bankcard(Parcel paramParcel)
  {
    GMTrace.i(6899059654656L, 51402);
    this.rMZ = null;
    this.rNg = null;
    this.rNh = false;
    this.field_bankName = paramParcel.readString();
    this.field_desc = paramParcel.readString();
    this.field_bankcardType = paramParcel.readString();
    this.field_bindSerial = paramParcel.readString();
    this.field_cardType = paramParcel.readInt();
    if (paramParcel.readInt() == 1)
    {
      bool1 = true;
      this.rNh = bool1;
      this.field_mobile = paramParcel.readString();
      this.field_onceQuotaKind = paramParcel.readDouble();
      this.field_onceQuotaVirtual = paramParcel.readDouble();
      this.field_dayQuotaKind = paramParcel.readDouble();
      this.field_dayQuotaVirtual = paramParcel.readDouble();
      this.field_bankcardTail = paramParcel.readString();
      this.field_bankPhone = paramParcel.readString();
      this.field_bankcardTag = paramParcel.readInt();
      this.field_bankcardState = paramParcel.readInt();
      this.rMZ = paramParcel.readString();
      this.rMx = paramParcel.readInt();
      this.rNg = paramParcel.readString();
      this.field_bankcardClientType = paramParcel.readInt();
      this.field_ext_msg = paramParcel.readString();
      if (paramParcel.readInt() != 1) {
        break label267;
      }
    }
    label267:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.field_support_micropay = bool1;
      this.field_arrive_type = paramParcel.readString();
      this.field_fetch_charge_rate = paramParcel.readDouble();
      this.field_full_fetch_charge_fee = paramParcel.readDouble();
      this.field_no_micro_word = paramParcel.readString();
      this.field_card_bottom_wording = paramParcel.readString();
      GMTrace.o(6899059654656L, 51402);
      return;
      bool1 = false;
      break;
    }
  }
  
  public static String I(Context paramContext, int paramInt)
  {
    GMTrace.i(6898120130560L, 51395);
    switch (paramInt)
    {
    default: 
      paramContext = paramContext.getString(R.l.eXi);
      GMTrace.o(6898120130560L, 51395);
      return paramContext;
    case 1: 
      paramContext = paramContext.getString(R.l.eXb);
      GMTrace.o(6898120130560L, 51395);
      return paramContext;
    case 4: 
      paramContext = paramContext.getString(R.l.eXd);
      GMTrace.o(6898120130560L, 51395);
      return paramContext;
    case 2: 
      paramContext = paramContext.getString(R.l.eXh);
      GMTrace.o(6898120130560L, 51395);
      return paramContext;
    case 5: 
      paramContext = paramContext.getString(R.l.eWZ);
      GMTrace.o(6898120130560L, 51395);
      return paramContext;
    case 6: 
      paramContext = paramContext.getString(R.l.eXf);
      GMTrace.o(6898120130560L, 51395);
      return paramContext;
    case 3: 
      paramContext = paramContext.getString(R.l.eXm);
      GMTrace.o(6898120130560L, 51395);
      return paramContext;
    }
    paramContext = paramContext.getString(R.l.eXk);
    GMTrace.o(6898120130560L, 51395);
    return paramContext;
  }
  
  public static boolean dv(int paramInt1, int paramInt2)
  {
    GMTrace.i(6897717477376L, 51392);
    w.d("MicroMsg.Bankcard", "supportBankcardTag : " + paramInt1 + ", bankcardTag : " + paramInt2);
    if ((paramInt1 & paramInt2) > 0)
    {
      GMTrace.o(6897717477376L, 51392);
      return true;
    }
    GMTrace.o(6897717477376L, 51392);
    return false;
  }
  
  public static boolean wx(int paramInt)
  {
    GMTrace.i(6897851695104L, 51393);
    if ((paramInt & 0x2) > 0)
    {
      GMTrace.o(6897851695104L, 51393);
      return true;
    }
    GMTrace.o(6897851695104L, 51393);
    return false;
  }
  
  public final int a(int paramInt, Orders paramOrders)
  {
    GMTrace.i(6897985912832L, 51394);
    if (this.field_bankcardState != 0)
    {
      w.d("MicroMsg.Bankcard", " bankcardState : " + this.field_bankcardState);
      paramInt = this.field_bankcardState;
      GMTrace.o(6897985912832L, 51394);
      return paramInt;
    }
    if ((paramOrders != null) && (paramOrders.fAF.equals(this.rMZ)))
    {
      GMTrace.o(6897985912832L, 51394);
      return 4;
    }
    if ((this.field_bankcardTag & paramInt) > 0) {
      paramInt = 1;
    }
    while (paramInt == 0) {
      if (bwp())
      {
        GMTrace.o(6897985912832L, 51394);
        return 5;
        paramInt = 0;
      }
      else
      {
        GMTrace.o(6897985912832L, 51394);
        return 6;
      }
    }
    if ((paramOrders != null) && (!paramOrders.rPg.isEmpty()) && (!paramOrders.rPg.contains(this.field_bankcardType)))
    {
      GMTrace.o(6897985912832L, 51394);
      return 7;
    }
    GMTrace.o(6897985912832L, 51394);
    return 0;
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(6899328090112L, 51404);
    super.b(paramCursor);
    GMTrace.o(6899328090112L, 51404);
  }
  
  public final boolean bwl()
  {
    GMTrace.i(6898254348288L, 51396);
    if ((this.field_cardType & rMQ) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.Bankcard", "isWXCredit, ret = " + bool);
      GMTrace.o(6898254348288L, 51396);
      return bool;
    }
  }
  
  public final boolean bwm()
  {
    GMTrace.i(6898388566016L, 51397);
    if ((this.field_cardType & rMR) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.Bankcard", "isWXCredit, ret = " + bool);
      GMTrace.o(6898388566016L, 51397);
      return bool;
    }
  }
  
  public final boolean bwn()
  {
    GMTrace.i(18041278562304L, 134418);
    if ((this.field_cardType & rMU) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.Bankcard", "isLqtCard, ret = " + bool);
      GMTrace.o(18041278562304L, 134418);
      return bool;
    }
  }
  
  public final boolean bwo()
  {
    GMTrace.i(6898522783744L, 51398);
    if ((this.field_cardType & rMP) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.Bankcard", "isCredit, ret = " + bool);
      GMTrace.o(6898522783744L, 51398);
      return bool;
    }
  }
  
  public final boolean bwp()
  {
    GMTrace.i(6898657001472L, 51399);
    if ((this.field_cardType & rMO) <= 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.Bankcard", "isDomestic, ret = " + bool);
      GMTrace.o(6898657001472L, 51399);
      return bool;
    }
  }
  
  public int describeContents()
  {
    GMTrace.i(6898925436928L, 51401);
    GMTrace.o(6898925436928L, 51401);
    return 0;
  }
  
  protected final c.a uC()
  {
    GMTrace.i(6898791219200L, 51400);
    c.a locala = gLR;
    GMTrace.o(6898791219200L, 51400);
    return locala;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    GMTrace.i(6899193872384L, 51403);
    paramParcel.writeString(this.field_bankName);
    paramParcel.writeString(this.field_desc);
    paramParcel.writeString(this.field_bankcardType);
    paramParcel.writeString(this.field_bindSerial);
    paramParcel.writeInt(this.field_cardType);
    if (this.rNh)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.field_mobile);
      paramParcel.writeDouble(this.field_onceQuotaKind);
      paramParcel.writeDouble(this.field_onceQuotaVirtual);
      paramParcel.writeDouble(this.field_dayQuotaKind);
      paramParcel.writeDouble(this.field_dayQuotaVirtual);
      paramParcel.writeString(this.field_bankcardTail);
      paramParcel.writeString(this.field_bankPhone);
      paramParcel.writeInt(this.field_bankcardTag);
      paramParcel.writeInt(this.field_bankcardState);
      paramParcel.writeString(this.rMZ);
      paramParcel.writeInt(this.rMx);
      paramParcel.writeString(this.rNg);
      paramParcel.writeInt(this.field_bankcardClientType);
      paramParcel.writeString(this.field_ext_msg);
      if (!this.field_support_micropay) {
        break label246;
      }
    }
    label246:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.field_arrive_type);
      paramParcel.writeDouble(this.field_fetch_charge_rate);
      paramParcel.writeDouble(this.field_full_fetch_charge_fee);
      paramParcel.writeString(this.field_no_micro_word);
      paramParcel.writeString(this.field_card_bottom_wording);
      GMTrace.o(6899193872384L, 51403);
      return;
      paramInt = 0;
      break;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/Bankcard.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */