package com.tencent.mm.plugin.card.sharecard.model;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.cw;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.protocal.c.bbx;
import com.tencent.mm.protocal.c.jf;
import com.tencent.mm.protocal.c.jh;
import com.tencent.mm.protocal.c.ji;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.util.Map;

public class ShareCardInfo
  extends cw
  implements Parcelable, com.tencent.mm.plugin.card.base.b
{
  public static final Parcelable.Creator<ShareCardInfo> CREATOR;
  protected static c.a gLR;
  public String knu;
  public jn kov;
  public jf kow;
  public bbx kox;
  public ji koy;
  public boolean koz;
  
  static
  {
    GMTrace.i(5067256102912L, 37754);
    c.a locala = new c.a();
    locala.hRR = new Field[19];
    locala.columns = new String[20];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "card_id";
    locala.uQH.put("card_id", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" card_id TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.uQG = "card_id";
    locala.columns[1] = "card_tp_id";
    locala.uQH.put("card_tp_id", "TEXT");
    localStringBuilder.append(" card_tp_id TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "from_username";
    locala.uQH.put("from_username", "TEXT");
    localStringBuilder.append(" from_username TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "consumer";
    locala.uQH.put("consumer", "TEXT");
    localStringBuilder.append(" consumer TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "app_id";
    locala.uQH.put("app_id", "TEXT");
    localStringBuilder.append(" app_id TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "status";
    locala.uQH.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "share_time";
    locala.uQH.put("share_time", "LONG");
    localStringBuilder.append(" share_time LONG");
    localStringBuilder.append(", ");
    locala.columns[7] = "local_updateTime";
    locala.uQH.put("local_updateTime", "LONG");
    localStringBuilder.append(" local_updateTime LONG");
    localStringBuilder.append(", ");
    locala.columns[8] = "updateTime";
    locala.uQH.put("updateTime", "LONG");
    localStringBuilder.append(" updateTime LONG");
    localStringBuilder.append(", ");
    locala.columns[9] = "begin_time";
    locala.uQH.put("begin_time", "LONG");
    localStringBuilder.append(" begin_time LONG");
    localStringBuilder.append(", ");
    locala.columns[10] = "end_time";
    locala.uQH.put("end_time", "LONG");
    localStringBuilder.append(" end_time LONG");
    localStringBuilder.append(", ");
    locala.columns[11] = "updateSeq";
    locala.uQH.put("updateSeq", "LONG");
    localStringBuilder.append(" updateSeq LONG");
    localStringBuilder.append(", ");
    locala.columns[12] = "block_mask";
    locala.uQH.put("block_mask", "LONG");
    localStringBuilder.append(" block_mask LONG");
    localStringBuilder.append(", ");
    locala.columns[13] = "dataInfoData";
    locala.uQH.put("dataInfoData", "BLOB");
    localStringBuilder.append(" dataInfoData BLOB");
    localStringBuilder.append(", ");
    locala.columns[14] = "cardTpInfoData";
    locala.uQH.put("cardTpInfoData", "BLOB");
    localStringBuilder.append(" cardTpInfoData BLOB");
    localStringBuilder.append(", ");
    locala.columns[15] = "shareInfoData";
    locala.uQH.put("shareInfoData", "BLOB");
    localStringBuilder.append(" shareInfoData BLOB");
    localStringBuilder.append(", ");
    locala.columns[16] = "shopInfoData";
    locala.uQH.put("shopInfoData", "BLOB");
    localStringBuilder.append(" shopInfoData BLOB");
    localStringBuilder.append(", ");
    locala.columns[17] = "categoryType";
    locala.uQH.put("categoryType", "INTEGER default '0' ");
    localStringBuilder.append(" categoryType INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[18] = "itemIndex";
    locala.uQH.put("itemIndex", "INTEGER default '0' ");
    localStringBuilder.append(" itemIndex INTEGER default '0' ");
    locala.columns[19] = "rowid";
    locala.uQI = localStringBuilder.toString();
    gLR = locala;
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(5067256102912L, 37754);
  }
  
  public ShareCardInfo()
  {
    GMTrace.i(5061484740608L, 37711);
    this.koz = true;
    this.knu = "";
    GMTrace.o(5061484740608L, 37711);
  }
  
  public ShareCardInfo(Parcel paramParcel)
  {
    GMTrace.i(5065108619264L, 37738);
    this.koz = true;
    this.knu = "";
    this.field_card_id = paramParcel.readString();
    this.field_card_tp_id = paramParcel.readString();
    this.field_from_username = paramParcel.readString();
    this.field_status = paramParcel.readInt();
    this.field_share_time = paramParcel.readLong();
    this.field_local_updateTime = paramParcel.readLong();
    this.field_updateTime = paramParcel.readLong();
    this.field_updateSeq = paramParcel.readLong();
    this.field_block_mask = paramParcel.readLong();
    this.field_end_time = paramParcel.readLong();
    this.field_categoryType = paramParcel.readInt();
    this.field_itemIndex = paramParcel.readInt();
    int k = paramParcel.readInt();
    int i;
    if (k > 0)
    {
      this.field_dataInfoData = new byte[k];
      i = 0;
      while (i < k)
      {
        this.field_dataInfoData[i] = paramParcel.readByte();
        i += 1;
      }
    }
    k = paramParcel.readInt();
    if (k > 0)
    {
      this.field_cardTpInfoData = new byte[k];
      i = 0;
      while (i < k)
      {
        this.field_cardTpInfoData[i] = paramParcel.readByte();
        i += 1;
      }
    }
    k = paramParcel.readInt();
    if (k > 0)
    {
      this.field_shareInfoData = new byte[k];
      i = 0;
      while (i < k)
      {
        this.field_shareInfoData[i] = paramParcel.readByte();
        i += 1;
      }
    }
    k = paramParcel.readInt();
    if (k > 0)
    {
      this.field_shopInfoData = new byte[k];
      i = j;
      while (i < k)
      {
        this.field_shopInfoData[i] = paramParcel.readByte();
        i += 1;
      }
    }
    GMTrace.o(5065108619264L, 37738);
  }
  
  public final void a(jf paramjf)
  {
    GMTrace.i(5064571748352L, 37734);
    this.kow = paramjf;
    if (this.kow != null) {
      try
      {
        this.field_dataInfoData = paramjf.toByteArray();
        GMTrace.o(5064571748352L, 37734);
        return;
      }
      catch (Exception paramjf)
      {
        w.e("MicroMsg.ShareCardInfo", "setDataInfo fail, ex = %s", new Object[] { paramjf.getMessage() });
        w.printErrStackTrace("MicroMsg.ShareCardInfo", paramjf, "", new Object[0]);
      }
    }
    GMTrace.o(5064571748352L, 37734);
  }
  
  public final void a(ji paramji)
  {
    GMTrace.i(5064974401536L, 37737);
    this.koy = paramji;
    try
    {
      this.field_shopInfoData = paramji.toByteArray();
      GMTrace.o(5064974401536L, 37737);
      return;
    }
    catch (Exception paramji)
    {
      w.e("MicroMsg.ShareCardInfo", "setShopInfo fail, ex = %s", new Object[] { paramji.getMessage() });
      w.printErrStackTrace("MicroMsg.ShareCardInfo", paramji, "", new Object[0]);
      GMTrace.o(5064974401536L, 37737);
    }
  }
  
  public final boolean aiA()
  {
    GMTrace.i(5062961135616L, 37722);
    if ((aiK().tFg & 0x10) == 0L)
    {
      GMTrace.o(5062961135616L, 37722);
      return true;
    }
    GMTrace.o(5062961135616L, 37722);
    return false;
  }
  
  public final boolean aiB()
  {
    GMTrace.i(5063095353344L, 37723);
    if ((aiK().tFg & 0x2) > 0L)
    {
      GMTrace.o(5063095353344L, 37723);
      return true;
    }
    GMTrace.o(5063095353344L, 37723);
    return false;
  }
  
  public final boolean aiC()
  {
    GMTrace.i(5063229571072L, 37724);
    GMTrace.o(5063229571072L, 37724);
    return false;
  }
  
  public final boolean aiD()
  {
    GMTrace.i(5063363788800L, 37725);
    if ((aiK().tFg & 0x4) > 0L)
    {
      GMTrace.o(5063363788800L, 37725);
      return true;
    }
    GMTrace.o(5063363788800L, 37725);
    return false;
  }
  
  public final boolean aiE()
  {
    GMTrace.i(5063498006528L, 37726);
    if ((aiK().tFg & 0x8) > 0L)
    {
      GMTrace.o(5063498006528L, 37726);
      return true;
    }
    GMTrace.o(5063498006528L, 37726);
    return false;
  }
  
  public final boolean aiF()
  {
    GMTrace.i(5067121885184L, 37753);
    if ((aiK() != null) && (aiK().tFs == 1))
    {
      GMTrace.o(5067121885184L, 37753);
      return true;
    }
    GMTrace.o(5067121885184L, 37753);
    return false;
  }
  
  public final boolean aiG()
  {
    GMTrace.i(5063632224256L, 37727);
    if ((this.kow != null) && (this.kow.status == 0))
    {
      GMTrace.o(5063632224256L, 37727);
      return true;
    }
    GMTrace.o(5063632224256L, 37727);
    return false;
  }
  
  public final boolean aiH()
  {
    GMTrace.i(5063900659712L, 37729);
    if (!aiG())
    {
      GMTrace.o(5063900659712L, 37729);
      return false;
    }
    if (this.kov != null) {
      w.i("MicroMsg.ShareCardInfo", "is_acceptable:" + this.kov.tFt);
    }
    w.i("MicroMsg.ShareCardInfo", "avail_num:" + this.kow.tEs);
    if ((this.kov != null) && (this.kov.tFt == 1))
    {
      GMTrace.o(5063900659712L, 37729);
      return true;
    }
    if (this.kow.tEs > 0)
    {
      GMTrace.o(5063900659712L, 37729);
      return true;
    }
    if ((this.kov != null) && (this.kov.tFt == 0))
    {
      GMTrace.o(5063900659712L, 37729);
      return false;
    }
    if (this.kow.tEs == 0)
    {
      GMTrace.o(5063900659712L, 37729);
      return false;
    }
    GMTrace.o(5063900659712L, 37729);
    return false;
  }
  
  public final boolean aiI()
  {
    GMTrace.i(5064034877440L, 37730);
    if ((this.kov == null) || (this.kov.tFk == null) || (TextUtils.isEmpty(this.kov.tFk.text)))
    {
      GMTrace.o(5064034877440L, 37730);
      return false;
    }
    jh localjh = this.kov.tFk;
    int i = (int)(System.currentTimeMillis() / 1000L);
    int j = localjh.pwk;
    if ((localjh.pwk > 0) && (j - i > 0))
    {
      GMTrace.o(5064034877440L, 37730);
      return true;
    }
    GMTrace.o(5064034877440L, 37730);
    return false;
  }
  
  public final boolean aiJ()
  {
    GMTrace.i(5064169095168L, 37731);
    if ((this.kov != null) && (this.kov.tFx == 1))
    {
      GMTrace.o(5064169095168L, 37731);
      return true;
    }
    GMTrace.o(5064169095168L, 37731);
    return false;
  }
  
  public final jn aiK()
  {
    GMTrace.i(5064303312896L, 37732);
    jn localjn1;
    if (this.kov != null)
    {
      localjn1 = this.kov;
      GMTrace.o(5064303312896L, 37732);
      return localjn1;
    }
    try
    {
      this.kov = ((jn)new jn().aC(this.field_cardTpInfoData));
      localjn1 = this.kov;
      GMTrace.o(5064303312896L, 37732);
      return localjn1;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.ShareCardInfo", "getCardTpInfo fail, ex = %s", new Object[] { localException.getMessage() });
      w.printErrStackTrace("MicroMsg.ShareCardInfo", localException, "", new Object[0]);
      jn localjn2 = new jn();
      GMTrace.o(5064303312896L, 37732);
      return localjn2;
    }
  }
  
  public final jf aiL()
  {
    GMTrace.i(5064437530624L, 37733);
    jf localjf1;
    if (this.kow != null)
    {
      localjf1 = this.kow;
      GMTrace.o(5064437530624L, 37733);
      return localjf1;
    }
    try
    {
      this.kow = ((jf)new jf().aC(this.field_dataInfoData));
      localjf1 = this.kow;
      GMTrace.o(5064437530624L, 37733);
      return localjf1;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.ShareCardInfo", "getDataInfo fail, ex = %s", new Object[] { localException.getMessage() });
      w.printErrStackTrace("MicroMsg.ShareCardInfo", localException, "", new Object[0]);
      jf localjf2 = new jf();
      GMTrace.o(5064437530624L, 37733);
      return localjf2;
    }
  }
  
  public final bbx aiM()
  {
    GMTrace.i(5064705966080L, 37735);
    bbx localbbx1;
    if (this.kox != null)
    {
      localbbx1 = this.kox;
      GMTrace.o(5064705966080L, 37735);
      return localbbx1;
    }
    try
    {
      this.kox = ((bbx)new bbx().aC(this.field_shareInfoData));
      localbbx1 = this.kox;
      GMTrace.o(5064705966080L, 37735);
      return localbbx1;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.ShareCardInfo", "getShareInfo fail, ex = %s", new Object[] { localException.getMessage() });
      w.printErrStackTrace("MicroMsg.ShareCardInfo", localException, "", new Object[0]);
      bbx localbbx2 = new bbx();
      GMTrace.o(5064705966080L, 37735);
      return localbbx2;
    }
  }
  
  public final ji aiN()
  {
    GMTrace.i(5064840183808L, 37736);
    ji localji;
    if (this.koy != null)
    {
      localji = this.koy;
      GMTrace.o(5064840183808L, 37736);
      return localji;
    }
    try
    {
      this.koy = ((ji)new ji().aC(this.field_shopInfoData));
      localji = this.koy;
      GMTrace.o(5064840183808L, 37736);
      return localji;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.ShareCardInfo", "getShopInfo fail ex = %s", new Object[] { localException.getMessage() });
      w.printErrStackTrace("MicroMsg.ShareCardInfo", localException, "", new Object[0]);
      GMTrace.o(5064840183808L, 37736);
    }
    return null;
  }
  
  public final String aiO()
  {
    GMTrace.i(5065645490176L, 37742);
    String str = this.field_card_id;
    GMTrace.o(5065645490176L, 37742);
    return str;
  }
  
  public final String aiP()
  {
    GMTrace.i(5065779707904L, 37743);
    String str = this.field_card_tp_id;
    GMTrace.o(5065779707904L, 37743);
    return str;
  }
  
  public final String aiQ()
  {
    GMTrace.i(5065913925632L, 37744);
    String str = this.field_from_username;
    GMTrace.o(5065913925632L, 37744);
    return str;
  }
  
  public final long aiR()
  {
    GMTrace.i(5066182361088L, 37746);
    long l = this.field_local_updateTime;
    GMTrace.o(5066182361088L, 37746);
    return l;
  }
  
  public final String aiS()
  {
    GMTrace.i(5066719232000L, 37750);
    GMTrace.o(5066719232000L, 37750);
    return "";
  }
  
  public final int aiT()
  {
    GMTrace.i(5066853449728L, 37751);
    int i = this.field_categoryType;
    GMTrace.o(5066853449728L, 37751);
    return i;
  }
  
  public final String aiU()
  {
    GMTrace.i(5066987667456L, 37752);
    w.d("MicroMsg.ShareCardInfo", "encrypt_code:" + this.knu);
    String str = this.knu;
    GMTrace.o(5066987667456L, 37752);
    return str;
  }
  
  public final boolean aip()
  {
    GMTrace.i(5066316578816L, 37747);
    if ((aiK() != null) && (aiK().tFn == 0))
    {
      GMTrace.o(5066316578816L, 37747);
      return true;
    }
    GMTrace.o(5066316578816L, 37747);
    return false;
  }
  
  public final boolean aiq()
  {
    GMTrace.i(5066450796544L, 37748);
    if ((aiK() != null) && (aiK().tFn == 1))
    {
      GMTrace.o(5066450796544L, 37748);
      return true;
    }
    GMTrace.o(5066450796544L, 37748);
    return false;
  }
  
  public final boolean air()
  {
    GMTrace.i(5061753176064L, 37713);
    if ((aiK() != null) && (aiK().knq == 10))
    {
      GMTrace.o(5061753176064L, 37713);
      return true;
    }
    GMTrace.o(5061753176064L, 37713);
    return false;
  }
  
  public final boolean ais()
  {
    GMTrace.i(5061887393792L, 37714);
    if ((aiK() != null) && (aiK().knq == 0))
    {
      GMTrace.o(5061887393792L, 37714);
      return true;
    }
    GMTrace.o(5061887393792L, 37714);
    return false;
  }
  
  public final boolean ait()
  {
    GMTrace.i(5062021611520L, 37715);
    if ((aiK() != null) && (aiK().knq == 20))
    {
      GMTrace.o(5062021611520L, 37715);
      return true;
    }
    GMTrace.o(5062021611520L, 37715);
    return false;
  }
  
  public final boolean aiu()
  {
    GMTrace.i(5062155829248L, 37716);
    if ((aiK() != null) && (aiK().knq == 11))
    {
      GMTrace.o(5062155829248L, 37716);
      return true;
    }
    GMTrace.o(5062155829248L, 37716);
    return false;
  }
  
  public final boolean aiv()
  {
    GMTrace.i(5062290046976L, 37717);
    if ((aiK() != null) && (aiK().knq == 30))
    {
      GMTrace.o(5062290046976L, 37717);
      return true;
    }
    GMTrace.o(5062290046976L, 37717);
    return false;
  }
  
  public final boolean aiw()
  {
    GMTrace.i(5062424264704L, 37718);
    boolean bool = l.lu(aiK().knq);
    GMTrace.o(5062424264704L, 37718);
    return bool;
  }
  
  public final boolean aix()
  {
    GMTrace.i(5062558482432L, 37719);
    if ((aiK().tFd & 0x2) == 0)
    {
      GMTrace.o(5062558482432L, 37719);
      return true;
    }
    GMTrace.o(5062558482432L, 37719);
    return false;
  }
  
  public final boolean aiy()
  {
    GMTrace.i(5062692700160L, 37720);
    if ((aiK().tFd & 0x1) == 0)
    {
      GMTrace.o(5062692700160L, 37720);
      return true;
    }
    GMTrace.o(5062692700160L, 37720);
    return false;
  }
  
  public final boolean aiz()
  {
    GMTrace.i(5062826917888L, 37721);
    if ((aiK().tFg & 1L) == 0L)
    {
      GMTrace.o(5062826917888L, 37721);
      return true;
    }
    GMTrace.o(5062826917888L, 37721);
    return false;
  }
  
  public int describeContents()
  {
    GMTrace.i(5065242836992L, 37739);
    GMTrace.o(5065242836992L, 37739);
    return 0;
  }
  
  public final long getEndTime()
  {
    GMTrace.i(5065511272448L, 37741);
    long l = this.field_end_time;
    GMTrace.o(5065511272448L, 37741);
    return l;
  }
  
  public final boolean isAcceptable()
  {
    GMTrace.i(5063766441984L, 37728);
    if (!aiG())
    {
      GMTrace.o(5063766441984L, 37728);
      return false;
    }
    if (this.kov != null) {
      w.i("MicroMsg.ShareCardInfo", "is_acceptable:" + this.kov.tFt);
    }
    w.i("MicroMsg.ShareCardInfo", "stock_num:" + this.kow.tEv + " limit_num:" + this.kow.tEw);
    if ((this.kov != null) && (this.kov.tFt == 1))
    {
      GMTrace.o(5063766441984L, 37728);
      return true;
    }
    if ((this.kov != null) && (this.kov.tFt == 0))
    {
      GMTrace.o(5063766441984L, 37728);
      return false;
    }
    if ((this.kow.tEv == 0L) || (this.kow.tEw == 0))
    {
      GMTrace.o(5063766441984L, 37728);
      return false;
    }
    GMTrace.o(5063766441984L, 37728);
    return false;
  }
  
  public final String ls(int paramInt)
  {
    GMTrace.i(5066585014272L, 37749);
    String str;
    if (paramInt == 10)
    {
      str = (String)al.ajH().getValue("key_share_card_local_city");
      GMTrace.o(5066585014272L, 37749);
      return str;
    }
    if (paramInt == 0)
    {
      if (com.tencent.mm.plugin.card.sharecard.a.b.ajY())
      {
        str = ab.getResources().getString(R.l.dGb);
        GMTrace.o(5066585014272L, 37749);
        return str;
      }
      GMTrace.o(5066585014272L, 37749);
      return "";
    }
    GMTrace.o(5066585014272L, 37749);
    return "";
  }
  
  public final void tp(String paramString)
  {
    GMTrace.i(5066048143360L, 37745);
    this.field_from_username = paramString;
    GMTrace.o(5066048143360L, 37745);
  }
  
  protected final c.a uC()
  {
    GMTrace.i(5061618958336L, 37712);
    c.a locala = gLR;
    GMTrace.o(5061618958336L, 37712);
    return locala;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 0;
    GMTrace.i(5065377054720L, 37740);
    paramParcel.writeString(this.field_card_id);
    paramParcel.writeString(this.field_card_tp_id);
    paramParcel.writeString(this.field_from_username);
    paramParcel.writeInt(this.field_status);
    paramParcel.writeLong(this.field_share_time);
    paramParcel.writeLong(this.field_local_updateTime);
    paramParcel.writeLong(this.field_updateTime);
    paramParcel.writeLong(this.field_updateSeq);
    paramParcel.writeLong(this.field_block_mask);
    paramParcel.writeLong(this.field_end_time);
    paramParcel.writeInt(this.field_categoryType);
    paramParcel.writeInt(this.field_itemIndex);
    if (this.field_dataInfoData != null)
    {
      paramParcel.writeInt(this.field_dataInfoData.length);
      paramInt = 0;
      while (paramInt < this.field_dataInfoData.length)
      {
        paramParcel.writeByte(this.field_dataInfoData[paramInt]);
        paramInt += 1;
      }
    }
    if (this.field_cardTpInfoData != null)
    {
      paramParcel.writeInt(this.field_cardTpInfoData.length);
      paramInt = 0;
      while (paramInt < this.field_cardTpInfoData.length)
      {
        paramParcel.writeByte(this.field_cardTpInfoData[paramInt]);
        paramInt += 1;
      }
    }
    if (this.field_shareInfoData != null)
    {
      paramParcel.writeInt(this.field_shareInfoData.length);
      paramInt = 0;
      while (paramInt < this.field_shareInfoData.length)
      {
        paramParcel.writeByte(this.field_shareInfoData[paramInt]);
        paramInt += 1;
      }
    }
    if (this.field_shopInfoData != null)
    {
      paramParcel.writeInt(this.field_shopInfoData.length);
      paramInt = i;
      while (paramInt < this.field_shopInfoData.length)
      {
        paramParcel.writeByte(this.field_shopInfoData[paramInt]);
        paramInt += 1;
      }
    }
    GMTrace.o(5065377054720L, 37740);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/model/ShareCardInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */