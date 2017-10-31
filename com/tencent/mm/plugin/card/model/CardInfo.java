package com.tencent.mm.plugin.card.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.dh;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.protocal.c.bbx;
import com.tencent.mm.protocal.c.jf;
import com.tencent.mm.protocal.c.jh;
import com.tencent.mm.protocal.c.ji;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.util.Map;

public class CardInfo
  extends dh
  implements Parcelable, b
{
  public static final Parcelable.Creator<CardInfo> CREATOR;
  protected static c.a gLR;
  public String knu;
  public jn kov;
  public jf kow;
  public bbx kox;
  public ji koy;
  public boolean koz;
  
  static
  {
    GMTrace.i(4900155031552L, 36509);
    c.a locala = new c.a();
    locala.hRR = new Field[22];
    locala.columns = new String[23];
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
    locala.columns[3] = "status";
    locala.uQH.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "delete_state_flag";
    locala.uQH.put("delete_state_flag", "INTEGER");
    localStringBuilder.append(" delete_state_flag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "local_updateTime";
    locala.uQH.put("local_updateTime", "LONG");
    localStringBuilder.append(" local_updateTime LONG");
    localStringBuilder.append(", ");
    locala.columns[6] = "updateTime";
    locala.uQH.put("updateTime", "LONG");
    localStringBuilder.append(" updateTime LONG");
    localStringBuilder.append(", ");
    locala.columns[7] = "updateSeq";
    locala.uQH.put("updateSeq", "LONG");
    localStringBuilder.append(" updateSeq LONG");
    localStringBuilder.append(", ");
    locala.columns[8] = "create_time";
    locala.uQH.put("create_time", "LONG");
    localStringBuilder.append(" create_time LONG");
    localStringBuilder.append(", ");
    locala.columns[9] = "begin_time";
    locala.uQH.put("begin_time", "LONG");
    localStringBuilder.append(" begin_time LONG");
    localStringBuilder.append(", ");
    locala.columns[10] = "end_time";
    locala.uQH.put("end_time", "LONG");
    localStringBuilder.append(" end_time LONG");
    localStringBuilder.append(", ");
    locala.columns[11] = "block_mask";
    locala.uQH.put("block_mask", "TEXT");
    localStringBuilder.append(" block_mask TEXT");
    localStringBuilder.append(", ");
    locala.columns[12] = "dataInfoData";
    locala.uQH.put("dataInfoData", "BLOB");
    localStringBuilder.append(" dataInfoData BLOB");
    localStringBuilder.append(", ");
    locala.columns[13] = "cardTpInfoData";
    locala.uQH.put("cardTpInfoData", "BLOB");
    localStringBuilder.append(" cardTpInfoData BLOB");
    localStringBuilder.append(", ");
    locala.columns[14] = "shareInfoData";
    locala.uQH.put("shareInfoData", "BLOB");
    localStringBuilder.append(" shareInfoData BLOB");
    localStringBuilder.append(", ");
    locala.columns[15] = "shopInfoData";
    locala.uQH.put("shopInfoData", "BLOB");
    localStringBuilder.append(" shopInfoData BLOB");
    localStringBuilder.append(", ");
    locala.columns[16] = "stickyIndex";
    locala.uQH.put("stickyIndex", "INTEGER");
    localStringBuilder.append(" stickyIndex INTEGER");
    localStringBuilder.append(", ");
    locala.columns[17] = "stickyEndTime";
    locala.uQH.put("stickyEndTime", "INTEGER");
    localStringBuilder.append(" stickyEndTime INTEGER");
    localStringBuilder.append(", ");
    locala.columns[18] = "stickyAnnouncement";
    locala.uQH.put("stickyAnnouncement", "TEXT");
    localStringBuilder.append(" stickyAnnouncement TEXT");
    localStringBuilder.append(", ");
    locala.columns[19] = "card_type";
    locala.uQH.put("card_type", "INTEGER default '-1' ");
    localStringBuilder.append(" card_type INTEGER default '-1' ");
    localStringBuilder.append(", ");
    locala.columns[20] = "label_wording";
    locala.uQH.put("label_wording", "TEXT");
    localStringBuilder.append(" label_wording TEXT");
    localStringBuilder.append(", ");
    locala.columns[21] = "is_dynamic";
    locala.uQH.put("is_dynamic", "INTEGER");
    localStringBuilder.append(" is_dynamic INTEGER");
    locala.columns[22] = "rowid";
    locala.uQI = localStringBuilder.toString();
    gLR = locala;
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(4900155031552L, 36509);
  }
  
  public CardInfo()
  {
    GMTrace.i(4894383669248L, 36466);
    this.koz = true;
    this.knu = "";
    this.field_card_type = -1;
    GMTrace.o(4894383669248L, 36466);
  }
  
  public CardInfo(Parcel paramParcel)
  {
    GMTrace.i(4898007547904L, 36493);
    this.koz = true;
    this.knu = "";
    this.field_card_id = paramParcel.readString();
    this.field_card_tp_id = paramParcel.readString();
    this.field_from_username = paramParcel.readString();
    this.field_status = paramParcel.readInt();
    this.field_delete_state_flag = paramParcel.readInt();
    this.field_local_updateTime = paramParcel.readLong();
    this.field_updateTime = paramParcel.readLong();
    this.field_updateSeq = paramParcel.readLong();
    this.field_create_time = paramParcel.readLong();
    this.field_begin_time = paramParcel.readLong();
    this.field_end_time = paramParcel.readLong();
    this.field_block_mask = paramParcel.readString();
    this.field_stickyIndex = paramParcel.readInt();
    this.field_stickyEndTime = paramParcel.readInt();
    this.field_stickyAnnouncement = paramParcel.readString();
    this.field_card_type = paramParcel.readInt();
    this.field_label_wording = paramParcel.readString();
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
    GMTrace.o(4898007547904L, 36493);
  }
  
  public final void a(jf paramjf)
  {
    GMTrace.i(4897470676992L, 36489);
    this.kow = paramjf;
    if (this.kow != null)
    {
      this.field_status = this.kow.status;
      try
      {
        this.field_dataInfoData = paramjf.toByteArray();
        GMTrace.o(4897470676992L, 36489);
        return;
      }
      catch (Exception paramjf)
      {
        w.e("MicroMsg.CardInfo", "setDataInfo fail, ex = %s", new Object[] { paramjf.getMessage() });
        w.printErrStackTrace("MicroMsg.CardInfo", paramjf, "", new Object[0]);
      }
    }
    GMTrace.o(4897470676992L, 36489);
  }
  
  public final void a(ji paramji)
  {
    GMTrace.i(4897873330176L, 36492);
    this.koy = paramji;
    try
    {
      this.field_shopInfoData = paramji.toByteArray();
      GMTrace.o(4897873330176L, 36492);
      return;
    }
    catch (Exception paramji)
    {
      w.e("MicroMsg.CardInfo", "setShopInfo fail, ex = %s", new Object[] { paramji.getMessage() });
      w.printErrStackTrace("MicroMsg.CardInfo", paramji, "", new Object[0]);
      GMTrace.o(4897873330176L, 36492);
    }
  }
  
  public final boolean aiA()
  {
    GMTrace.i(4895860064256L, 36477);
    if ((aiK().tFg & 0x10) == 0L)
    {
      GMTrace.o(4895860064256L, 36477);
      return true;
    }
    GMTrace.o(4895860064256L, 36477);
    return false;
  }
  
  public final boolean aiB()
  {
    GMTrace.i(4895994281984L, 36478);
    if ((aiK().tFg & 0x2) > 0L)
    {
      GMTrace.o(4895994281984L, 36478);
      return true;
    }
    GMTrace.o(4895994281984L, 36478);
    return false;
  }
  
  public final boolean aiC()
  {
    GMTrace.i(4896128499712L, 36479);
    if ((aiK().tFg & 0x20) > 0L)
    {
      GMTrace.o(4896128499712L, 36479);
      return true;
    }
    GMTrace.o(4896128499712L, 36479);
    return false;
  }
  
  public final boolean aiD()
  {
    GMTrace.i(4896262717440L, 36480);
    if ((aiK().tFg & 0x4) > 0L)
    {
      GMTrace.o(4896262717440L, 36480);
      return true;
    }
    GMTrace.o(4896262717440L, 36480);
    return false;
  }
  
  public final boolean aiE()
  {
    GMTrace.i(4896396935168L, 36481);
    if ((aiK().tFg & 0x8) > 0L)
    {
      GMTrace.o(4896396935168L, 36481);
      return true;
    }
    GMTrace.o(4896396935168L, 36481);
    return false;
  }
  
  public final boolean aiF()
  {
    GMTrace.i(4900020813824L, 36508);
    if ((aiK() != null) && (aiK().tFs == 1))
    {
      GMTrace.o(4900020813824L, 36508);
      return true;
    }
    GMTrace.o(4900020813824L, 36508);
    return false;
  }
  
  public final boolean aiG()
  {
    GMTrace.i(4896531152896L, 36482);
    if ((this.kow != null) && (this.kow.status == 0))
    {
      GMTrace.o(4896531152896L, 36482);
      return true;
    }
    GMTrace.o(4896531152896L, 36482);
    return false;
  }
  
  public final boolean aiH()
  {
    GMTrace.i(4896799588352L, 36484);
    if (!aiG())
    {
      GMTrace.o(4896799588352L, 36484);
      return false;
    }
    if (this.kov != null) {
      w.i("MicroMsg.CardInfo", "is_acceptable:" + this.kov.tFt);
    }
    w.i("MicroMsg.CardInfo", "avail_num:" + this.kow.tEs);
    if ((this.kov != null) && (this.kov.tFt == 1))
    {
      GMTrace.o(4896799588352L, 36484);
      return true;
    }
    if (this.kow.tEs > 0)
    {
      GMTrace.o(4896799588352L, 36484);
      return true;
    }
    if ((this.kov != null) && (this.kov.tFt == 0))
    {
      GMTrace.o(4896799588352L, 36484);
      return false;
    }
    if (this.kow.tEs == 0)
    {
      GMTrace.o(4896799588352L, 36484);
      return false;
    }
    GMTrace.o(4896799588352L, 36484);
    return false;
  }
  
  public final boolean aiI()
  {
    GMTrace.i(4896933806080L, 36485);
    if ((this.kov == null) || (this.kov.tFk == null) || (TextUtils.isEmpty(this.kov.tFk.text)))
    {
      GMTrace.o(4896933806080L, 36485);
      return false;
    }
    jh localjh = this.kov.tFk;
    int i = (int)(System.currentTimeMillis() / 1000L);
    int j = localjh.pwk;
    if ((localjh.pwk > 0) && (j - i > 0))
    {
      GMTrace.o(4896933806080L, 36485);
      return true;
    }
    GMTrace.o(4896933806080L, 36485);
    return false;
  }
  
  public final boolean aiJ()
  {
    GMTrace.i(4897068023808L, 36486);
    if ((this.kov != null) && (this.kov.tFx == 1))
    {
      GMTrace.o(4897068023808L, 36486);
      return true;
    }
    GMTrace.o(4897068023808L, 36486);
    return false;
  }
  
  public final jn aiK()
  {
    GMTrace.i(4897202241536L, 36487);
    jn localjn1;
    if (this.kov != null)
    {
      localjn1 = this.kov;
      GMTrace.o(4897202241536L, 36487);
      return localjn1;
    }
    try
    {
      this.kov = ((jn)new jn().aC(this.field_cardTpInfoData));
      localjn1 = this.kov;
      GMTrace.o(4897202241536L, 36487);
      return localjn1;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.CardInfo", "getCardTpInfo fail, ex = %s", new Object[] { localException.getMessage() });
      w.printErrStackTrace("MicroMsg.CardInfo", localException, "", new Object[0]);
      jn localjn2 = new jn();
      GMTrace.o(4897202241536L, 36487);
      return localjn2;
    }
  }
  
  public final jf aiL()
  {
    GMTrace.i(4897336459264L, 36488);
    jf localjf1;
    if (this.kow != null)
    {
      localjf1 = this.kow;
      GMTrace.o(4897336459264L, 36488);
      return localjf1;
    }
    try
    {
      this.kow = ((jf)new jf().aC(this.field_dataInfoData));
      localjf1 = this.kow;
      GMTrace.o(4897336459264L, 36488);
      return localjf1;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.CardInfo", "getDataInfo fail, ex = %s", new Object[] { localException.getMessage() });
      w.printErrStackTrace("MicroMsg.CardInfo", localException, "", new Object[0]);
      jf localjf2 = new jf();
      GMTrace.o(4897336459264L, 36488);
      return localjf2;
    }
  }
  
  public final bbx aiM()
  {
    GMTrace.i(4897604894720L, 36490);
    bbx localbbx1;
    if (this.kox != null)
    {
      localbbx1 = this.kox;
      GMTrace.o(4897604894720L, 36490);
      return localbbx1;
    }
    try
    {
      this.kox = ((bbx)new bbx().aC(this.field_shareInfoData));
      localbbx1 = this.kox;
      GMTrace.o(4897604894720L, 36490);
      return localbbx1;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.CardInfo", "getShareInfo fail, ex = %s", new Object[] { localException.getMessage() });
      w.printErrStackTrace("MicroMsg.CardInfo", localException, "", new Object[0]);
      bbx localbbx2 = new bbx();
      GMTrace.o(4897604894720L, 36490);
      return localbbx2;
    }
  }
  
  public final ji aiN()
  {
    GMTrace.i(4897739112448L, 36491);
    ji localji;
    if (this.koy != null)
    {
      localji = this.koy;
      GMTrace.o(4897739112448L, 36491);
      return localji;
    }
    try
    {
      this.koy = ((ji)new ji().aC(this.field_shopInfoData));
      localji = this.koy;
      GMTrace.o(4897739112448L, 36491);
      return localji;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.CardInfo", "getShopInfo fail ex = %s", new Object[] { localException.getMessage() });
      w.printErrStackTrace("MicroMsg.CardInfo", localException, "", new Object[0]);
      GMTrace.o(4897739112448L, 36491);
    }
    return null;
  }
  
  public final String aiO()
  {
    GMTrace.i(4898544418816L, 36497);
    String str = this.field_card_id;
    GMTrace.o(4898544418816L, 36497);
    return str;
  }
  
  public final String aiP()
  {
    GMTrace.i(4898678636544L, 36498);
    String str = this.field_card_tp_id;
    GMTrace.o(4898678636544L, 36498);
    return str;
  }
  
  public final String aiQ()
  {
    GMTrace.i(4898812854272L, 36499);
    String str = this.field_from_username;
    GMTrace.o(4898812854272L, 36499);
    return str;
  }
  
  public final long aiR()
  {
    GMTrace.i(4899081289728L, 36501);
    long l = this.field_local_updateTime;
    GMTrace.o(4899081289728L, 36501);
    return l;
  }
  
  public final String aiS()
  {
    GMTrace.i(4899618160640L, 36505);
    GMTrace.o(4899618160640L, 36505);
    return null;
  }
  
  public final int aiT()
  {
    GMTrace.i(4899752378368L, 36506);
    GMTrace.o(4899752378368L, 36506);
    return 0;
  }
  
  public final String aiU()
  {
    GMTrace.i(4899886596096L, 36507);
    w.d("MicroMsg.CardInfo", "encrypt_code:" + this.knu);
    String str = this.knu;
    GMTrace.o(4899886596096L, 36507);
    return str;
  }
  
  public final boolean aip()
  {
    GMTrace.i(4899215507456L, 36502);
    if ((aiK() != null) && (aiK().tFn == 0))
    {
      GMTrace.o(4899215507456L, 36502);
      return true;
    }
    GMTrace.o(4899215507456L, 36502);
    return false;
  }
  
  public final boolean aiq()
  {
    GMTrace.i(4899349725184L, 36503);
    if ((aiK() != null) && (aiK().tFn == 1))
    {
      GMTrace.o(4899349725184L, 36503);
      return true;
    }
    GMTrace.o(4899349725184L, 36503);
    return false;
  }
  
  public final boolean air()
  {
    GMTrace.i(4894652104704L, 36468);
    if ((aiK() != null) && (aiK().knq == 10))
    {
      GMTrace.o(4894652104704L, 36468);
      return true;
    }
    GMTrace.o(4894652104704L, 36468);
    return false;
  }
  
  public final boolean ais()
  {
    GMTrace.i(4894786322432L, 36469);
    if ((aiK() != null) && (aiK().knq == 0))
    {
      GMTrace.o(4894786322432L, 36469);
      return true;
    }
    GMTrace.o(4894786322432L, 36469);
    return false;
  }
  
  public final boolean ait()
  {
    GMTrace.i(4894920540160L, 36470);
    if ((aiK() != null) && (aiK().knq == 20))
    {
      GMTrace.o(4894920540160L, 36470);
      return true;
    }
    GMTrace.o(4894920540160L, 36470);
    return false;
  }
  
  public final boolean aiu()
  {
    GMTrace.i(4895054757888L, 36471);
    if ((aiK() != null) && (aiK().knq == 11))
    {
      GMTrace.o(4895054757888L, 36471);
      return true;
    }
    GMTrace.o(4895054757888L, 36471);
    return false;
  }
  
  public final boolean aiv()
  {
    GMTrace.i(4895188975616L, 36472);
    if ((aiK() != null) && (aiK().knq == 30))
    {
      GMTrace.o(4895188975616L, 36472);
      return true;
    }
    GMTrace.o(4895188975616L, 36472);
    return false;
  }
  
  public final boolean aiw()
  {
    GMTrace.i(4895323193344L, 36473);
    boolean bool = l.lu(aiK().knq);
    GMTrace.o(4895323193344L, 36473);
    return bool;
  }
  
  public final boolean aix()
  {
    GMTrace.i(4895457411072L, 36474);
    if ((aiK().tFd & 0x2) == 0)
    {
      GMTrace.o(4895457411072L, 36474);
      return true;
    }
    GMTrace.o(4895457411072L, 36474);
    return false;
  }
  
  public final boolean aiy()
  {
    GMTrace.i(4895591628800L, 36475);
    if ((aiK().tFd & 0x1) == 0)
    {
      GMTrace.o(4895591628800L, 36475);
      return true;
    }
    GMTrace.o(4895591628800L, 36475);
    return false;
  }
  
  public final boolean aiz()
  {
    GMTrace.i(4895725846528L, 36476);
    if ((aiK().tFg & 1L) == 0L)
    {
      GMTrace.o(4895725846528L, 36476);
      return true;
    }
    GMTrace.o(4895725846528L, 36476);
    return false;
  }
  
  public int describeContents()
  {
    GMTrace.i(4898141765632L, 36494);
    GMTrace.o(4898141765632L, 36494);
    return 0;
  }
  
  public final long getEndTime()
  {
    GMTrace.i(4898410201088L, 36496);
    long l = this.field_end_time;
    GMTrace.o(4898410201088L, 36496);
    return l;
  }
  
  public final boolean isAcceptable()
  {
    GMTrace.i(4896665370624L, 36483);
    if (!aiG())
    {
      GMTrace.o(4896665370624L, 36483);
      return false;
    }
    if (this.kov != null) {
      w.i("MicroMsg.CardInfo", "is_acceptable:" + this.kov.tFt);
    }
    w.i("MicroMsg.CardInfo", "stock_num:" + this.kow.tEv + " limit_num:" + this.kow.tEw);
    if ((this.kov != null) && (this.kov.tFt == 1))
    {
      GMTrace.o(4896665370624L, 36483);
      return true;
    }
    if ((this.kov != null) && (this.kov.tFt == 0))
    {
      GMTrace.o(4896665370624L, 36483);
      return false;
    }
    if ((this.kow.tEv == 0L) || (this.kow.tEw == 0))
    {
      GMTrace.o(4896665370624L, 36483);
      return false;
    }
    GMTrace.o(4896665370624L, 36483);
    return false;
  }
  
  public final String ls(int paramInt)
  {
    GMTrace.i(4899483942912L, 36504);
    GMTrace.o(4899483942912L, 36504);
    return null;
  }
  
  public final void tp(String paramString)
  {
    GMTrace.i(4898947072000L, 36500);
    this.field_from_username = paramString;
    GMTrace.o(4898947072000L, 36500);
  }
  
  protected final c.a uC()
  {
    GMTrace.i(4894517886976L, 36467);
    c.a locala = gLR;
    GMTrace.o(4894517886976L, 36467);
    return locala;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 0;
    GMTrace.i(4898275983360L, 36495);
    paramParcel.writeString(this.field_card_id);
    paramParcel.writeString(this.field_card_tp_id);
    paramParcel.writeString(this.field_from_username);
    paramParcel.writeInt(this.field_status);
    paramParcel.writeInt(this.field_delete_state_flag);
    paramParcel.writeLong(this.field_local_updateTime);
    paramParcel.writeLong(this.field_updateTime);
    paramParcel.writeLong(this.field_updateSeq);
    paramParcel.writeLong(this.field_create_time);
    paramParcel.writeLong(this.field_begin_time);
    paramParcel.writeLong(this.field_end_time);
    paramParcel.writeString(this.field_block_mask);
    paramParcel.writeInt(this.field_stickyIndex);
    paramParcel.writeInt(this.field_stickyEndTime);
    paramParcel.writeString(this.field_stickyAnnouncement);
    paramParcel.writeInt(this.field_card_type);
    paramParcel.writeString(this.field_label_wording);
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
    paramParcel.writeInt(0);
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
    paramParcel.writeInt(0);
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
    paramParcel.writeInt(0);
    if (this.field_shopInfoData != null)
    {
      paramParcel.writeInt(this.field_shopInfoData.length);
      paramInt = i;
      while (paramInt < this.field_shopInfoData.length)
      {
        paramParcel.writeByte(this.field_shopInfoData[paramInt]);
        paramInt += 1;
      }
      GMTrace.o(4898275983360L, 36495);
      return;
    }
    paramParcel.writeInt(0);
    GMTrace.o(4898275983360L, 36495);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/model/CardInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */