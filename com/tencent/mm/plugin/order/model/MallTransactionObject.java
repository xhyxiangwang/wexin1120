package com.tencent.mm.plugin.order.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class MallTransactionObject
  implements Parcelable
{
  public static final Parcelable.Creator<MallTransactionObject> CREATOR;
  public String desc;
  public String fKK;
  public int fpF;
  public int fvu;
  public int hzl;
  public String iIF;
  public double kKX;
  public List<MallOrderDetailObject.HelpCenter> oqI;
  public int oqJ;
  public String oqL;
  public int oqT;
  public String oqU;
  public String oqV;
  public String oqW;
  public String oqX;
  public String oqY;
  public String oqZ;
  public int orA;
  public int orB;
  public int orC;
  public String orD;
  public String orE;
  public String orF;
  public String orG;
  public String orH;
  public String orI;
  public double orJ;
  public String orK;
  public String ora;
  public String orb;
  public String orc;
  public String ord;
  public int ore;
  public String orf;
  public String org;
  public String orh;
  public String ori;
  public String orj;
  public String ork;
  public String orl;
  public String orm;
  public String orn;
  public double oro;
  public String orp;
  public String orq;
  public String orr;
  public String ors;
  public String ort;
  public int oru;
  public int orv;
  public double orw;
  public String orx;
  public int ory;
  public String orz;
  public int type;
  
  static
  {
    GMTrace.i(6628610932736L, 49387);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(6628610932736L, 49387);
  }
  
  public MallTransactionObject()
  {
    GMTrace.i(6627939844096L, 49382);
    this.kKX = 0.0D;
    this.oqI = new LinkedList();
    this.oqJ = -1;
    GMTrace.o(6627939844096L, 49382);
  }
  
  public MallTransactionObject(Parcel paramParcel)
  {
    GMTrace.i(6628074061824L, 49383);
    this.kKX = 0.0D;
    this.oqI = new LinkedList();
    this.oqJ = -1;
    this.fvu = paramParcel.readInt();
    this.oqT = paramParcel.readInt();
    this.fpF = paramParcel.readInt();
    this.oqU = paramParcel.readString();
    this.oqV = paramParcel.readString();
    this.oqW = paramParcel.readString();
    this.oqX = paramParcel.readString();
    this.desc = paramParcel.readString();
    this.oqY = paramParcel.readString();
    this.oqZ = paramParcel.readString();
    this.kKX = paramParcel.readDouble();
    this.ora = paramParcel.readString();
    this.orb = paramParcel.readString();
    this.orc = paramParcel.readString();
    this.ord = paramParcel.readString();
    this.hzl = paramParcel.readInt();
    this.ore = paramParcel.readInt();
    this.fKK = paramParcel.readString();
    this.orf = paramParcel.readString();
    this.org = paramParcel.readString();
    this.ori = paramParcel.readString();
    this.orj = paramParcel.readString();
    this.oqL = paramParcel.readString();
    this.ork = paramParcel.readString();
    this.iIF = paramParcel.readString();
    this.orl = paramParcel.readString();
    this.orm = paramParcel.readString();
    this.orn = paramParcel.readString();
    this.oro = paramParcel.readDouble();
    this.orp = paramParcel.readString();
    this.orq = paramParcel.readString();
    this.orr = paramParcel.readString();
    this.ors = paramParcel.readString();
    this.oru = paramParcel.readInt();
    this.orA = paramParcel.readInt();
    this.orw = paramParcel.readDouble();
    this.orx = paramParcel.readString();
    this.ory = paramParcel.readInt();
    this.orz = paramParcel.readString();
    this.orA = paramParcel.readInt();
    this.orB = paramParcel.readInt();
    this.orC = paramParcel.readInt();
    this.orD = paramParcel.readString();
    this.orE = paramParcel.readString();
    this.orF = paramParcel.readString();
    this.orG = paramParcel.readString();
    this.orH = paramParcel.readString();
    this.orI = paramParcel.readString();
    this.orJ = paramParcel.readDouble();
    this.orK = paramParcel.readString();
    this.ort = paramParcel.readString();
    this.oqJ = paramParcel.readInt();
    int j = paramParcel.readInt();
    this.oqI = new LinkedList();
    int i = 0;
    while (i < j)
    {
      MallOrderDetailObject.HelpCenter localHelpCenter = (MallOrderDetailObject.HelpCenter)paramParcel.readParcelable(MallOrderDetailObject.HelpCenter.class.getClassLoader());
      this.oqI.add(localHelpCenter);
      i += 1;
    }
    GMTrace.o(6628074061824L, 49383);
  }
  
  public static MallTransactionObject I(JSONObject paramJSONObject)
  {
    GMTrace.i(6628342497280L, 49385);
    if (paramJSONObject != null)
    {
      MallTransactionObject localMallTransactionObject = new MallTransactionObject();
      localMallTransactionObject.type = paramJSONObject.optInt("rec_type", 1);
      localMallTransactionObject.fvu = paramJSONObject.optInt("sub_pay_type", 0);
      localMallTransactionObject.oqT = paramJSONObject.optInt("pay_scene");
      localMallTransactionObject.fpF = paramJSONObject.optInt("user_type");
      localMallTransactionObject.oqU = paramJSONObject.optString("buy_uin");
      localMallTransactionObject.oqV = paramJSONObject.optString("buy_name");
      localMallTransactionObject.oqW = paramJSONObject.optString("sale_uin");
      localMallTransactionObject.oqX = paramJSONObject.optString("sale_name");
      localMallTransactionObject.fKK = paramJSONObject.optString("trans_id");
      localMallTransactionObject.orf = paramJSONObject.optString("sp_billno");
      localMallTransactionObject.desc = paramJSONObject.optString("goods_name");
      localMallTransactionObject.oqY = paramJSONObject.optString("goods_detail");
      localMallTransactionObject.kKX = (paramJSONObject.optDouble("fee") / 100.0D);
      localMallTransactionObject.ora = paramJSONObject.optString("fee_color");
      localMallTransactionObject.orb = paramJSONObject.optString("trade_state");
      localMallTransactionObject.orc = paramJSONObject.optString("trade_state_name");
      localMallTransactionObject.ord = paramJSONObject.optString("trade_state_color");
      localMallTransactionObject.org = paramJSONObject.optString("buy_bank_name");
      localMallTransactionObject.orh = paramJSONObject.optString("card_tail");
      localMallTransactionObject.hzl = paramJSONObject.optInt("create_timestamp");
      localMallTransactionObject.ore = paramJSONObject.optInt("modify_timestamp");
      localMallTransactionObject.ori = paramJSONObject.optString("fee_type");
      JSONObject localJSONObject = paramJSONObject.optJSONObject("appinfo");
      if (localJSONObject != null)
      {
        localMallTransactionObject.orj = localJSONObject.optString("app_username");
        localMallTransactionObject.oqL = localJSONObject.optString("app_telephone");
        localMallTransactionObject.ork = localJSONObject.optString("app_nickname");
        localMallTransactionObject.iIF = localJSONObject.optString("app_icon_url");
        localMallTransactionObject.ors = localJSONObject.optString("safeguard_url");
        localMallTransactionObject.ort = localJSONObject.optString("display_name");
      }
      localMallTransactionObject.orl = paramJSONObject.optString("deliver_price");
      localMallTransactionObject.orm = paramJSONObject.optString("preferential_price");
      localMallTransactionObject.orn = paramJSONObject.optString("discount");
      localMallTransactionObject.oro = (paramJSONObject.optDouble("original_total_fee") / 100.0D);
      localMallTransactionObject.orp = paramJSONObject.optString("total_price");
      localMallTransactionObject.orq = paramJSONObject.optString("receipt_company");
      localMallTransactionObject.orr = paramJSONObject.optString("biz_pledge");
      localMallTransactionObject.oru = paramJSONObject.optInt("pre_fetch_timestamp");
      localMallTransactionObject.orv = paramJSONObject.optInt("arrived_timestamp");
      localMallTransactionObject.orw = (paramJSONObject.optDouble("transfer_fee") / 100.0D);
      localMallTransactionObject.orx = paramJSONObject.optString("receiver_name");
      localMallTransactionObject.ory = paramJSONObject.optInt("allow_resend_msg");
      localMallTransactionObject.orz = paramJSONObject.optString("charge_fee");
      localMallTransactionObject.orA = paramJSONObject.optInt("receive_timestamp");
      localMallTransactionObject.orB = paramJSONObject.optInt("refund_timestamp");
      localMallTransactionObject.orC = paramJSONObject.optInt("create_timestamp");
      localMallTransactionObject.orD = paramJSONObject.optString("buy_bank_type");
      localMallTransactionObject.orE = paramJSONObject.optString("payer_name");
      localMallTransactionObject.orF = paramJSONObject.optString("true_name");
      localMallTransactionObject.orG = paramJSONObject.optString("refund_bank_type");
      localMallTransactionObject.orH = paramJSONObject.optString("rateinfo");
      localMallTransactionObject.orI = paramJSONObject.optString("original_feeinfo");
      localMallTransactionObject.orJ = (paramJSONObject.optDouble("fetch_total_fee") / 100.0D);
      localMallTransactionObject.orK = paramJSONObject.optString("fetch_total_fee_color");
      localMallTransactionObject.oqJ = paramJSONObject.optInt("userroll_type");
      localMallTransactionObject.oqI = J(paramJSONObject);
      GMTrace.o(6628342497280L, 49385);
      return localMallTransactionObject;
    }
    GMTrace.o(6628342497280L, 49385);
    return null;
  }
  
  private static List<MallOrderDetailObject.HelpCenter> J(JSONObject paramJSONObject)
  {
    GMTrace.i(6628476715008L, 49386);
    localLinkedList = new LinkedList();
    try
    {
      paramJSONObject = paramJSONObject.getJSONArray("help_center");
      int i = 0;
      while (i < paramJSONObject.length())
      {
        MallOrderDetailObject.HelpCenter localHelpCenter = new MallOrderDetailObject.HelpCenter();
        JSONObject localJSONObject = paramJSONObject.getJSONObject(i);
        localHelpCenter.fvj = localJSONObject.optBoolean("is_show_button");
        localHelpCenter.name = localJSONObject.optString("name");
        localHelpCenter.url = localJSONObject.optString("url");
        localLinkedList.add(localHelpCenter);
        i += 1;
      }
      return localLinkedList;
    }
    catch (Exception paramJSONObject)
    {
      w.printErrStackTrace("MicroMsg.MallTransactionObject", paramJSONObject, "", new Object[0]);
      w.e("MicroMsg.MallTransactionObject", "parseHelpCenter error %s", new Object[] { paramJSONObject.getMessage() });
      GMTrace.o(6628476715008L, 49386);
    }
  }
  
  public int describeContents()
  {
    GMTrace.i(6627805626368L, 49381);
    GMTrace.o(6627805626368L, 49381);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(6628208279552L, 49384);
    paramParcel.writeInt(this.fvu);
    paramParcel.writeInt(this.oqT);
    paramParcel.writeInt(this.fpF);
    paramParcel.writeString(this.oqU);
    paramParcel.writeString(this.oqV);
    paramParcel.writeString(this.oqW);
    paramParcel.writeString(this.oqX);
    paramParcel.writeString(this.desc);
    paramParcel.writeString(this.oqY);
    paramParcel.writeString(this.oqZ);
    paramParcel.writeDouble(this.kKX);
    paramParcel.writeString(this.ora);
    paramParcel.writeString(this.orb);
    paramParcel.writeString(this.orc);
    paramParcel.writeString(this.ord);
    paramParcel.writeInt(this.hzl);
    paramParcel.writeInt(this.ore);
    paramParcel.writeString(this.fKK);
    paramParcel.writeString(this.orf);
    paramParcel.writeString(this.org);
    paramParcel.writeString(this.ori);
    paramParcel.writeString(this.orj);
    paramParcel.writeString(this.oqL);
    paramParcel.writeString(this.ork);
    paramParcel.writeString(this.iIF);
    paramParcel.writeString(this.orl);
    paramParcel.writeString(this.orm);
    paramParcel.writeString(this.orn);
    paramParcel.writeDouble(this.oro);
    paramParcel.writeString(this.orp);
    paramParcel.writeString(this.orq);
    paramParcel.writeString(this.orr);
    paramParcel.writeString(this.ors);
    paramParcel.writeInt(this.oru);
    paramParcel.writeInt(this.orA);
    paramParcel.writeDouble(this.orw);
    paramParcel.writeString(this.orx);
    paramParcel.writeInt(this.ory);
    paramParcel.writeString(this.orz);
    paramParcel.writeInt(this.orA);
    paramParcel.writeInt(this.orB);
    paramParcel.writeInt(this.orC);
    paramParcel.writeString(this.orD);
    paramParcel.writeString(this.orE);
    paramParcel.writeString(this.orF);
    paramParcel.writeString(this.orG);
    paramParcel.writeString(this.orH);
    paramParcel.writeString(this.orI);
    paramParcel.writeDouble(this.orJ);
    paramParcel.writeString(this.orK);
    paramParcel.writeString(this.ort);
    paramParcel.writeInt(this.oqJ);
    paramParcel.writeInt(this.oqI.size());
    Iterator localIterator = this.oqI.iterator();
    while (localIterator.hasNext()) {
      paramParcel.writeParcelable((MallOrderDetailObject.HelpCenter)localIterator.next(), paramInt);
    }
    GMTrace.o(6628208279552L, 49384);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/order/model/MallTransactionObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */