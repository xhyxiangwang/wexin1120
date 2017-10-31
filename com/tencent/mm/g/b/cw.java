package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class cw
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fSu;
  private static final int fUM;
  private static final int fZR;
  private static final int fZS;
  private static final int geZ;
  private static final int ghd;
  private static final int gtA;
  private static final int gtB;
  private static final int gtC;
  private static final int gtD;
  private static final int gtE;
  private static final int gtF;
  private static final int gtG;
  private static final int gtH;
  private static final int gtI;
  private static final int gtJ;
  private static final int gtK;
  private static final int gtL;
  private static final int gtM;
  private boolean fSr;
  private boolean fUI;
  private boolean fZy;
  private boolean fZz;
  public String field_app_id;
  public long field_begin_time;
  public long field_block_mask;
  public byte[] field_cardTpInfoData;
  public String field_card_id;
  public String field_card_tp_id;
  public int field_categoryType;
  public String field_consumer;
  public byte[] field_dataInfoData;
  public long field_end_time;
  public String field_from_username;
  public int field_itemIndex;
  public long field_local_updateTime;
  public byte[] field_shareInfoData;
  public long field_share_time;
  public byte[] field_shopInfoData;
  public int field_status;
  public long field_updateSeq;
  public long field_updateTime;
  private boolean geA;
  private boolean ggP;
  private boolean gtn;
  private boolean gto;
  private boolean gtp;
  private boolean gtq;
  private boolean gtr;
  private boolean gts;
  private boolean gtt;
  private boolean gtu;
  private boolean gtv;
  private boolean gtw;
  private boolean gtx;
  private boolean gty;
  private boolean gtz;
  
  static
  {
    GMTrace.i(4114041798656L, 30652);
    fSf = new String[] { "CREATE INDEX IF NOT EXISTS ShareCardInfo_card_tp_id_index ON ShareCardInfo(card_tp_id)" };
    fZR = "card_id".hashCode();
    fZS = "card_tp_id".hashCode();
    gtA = "from_username".hashCode();
    gtB = "consumer".hashCode();
    geZ = "app_id".hashCode();
    fSu = "status".hashCode();
    gtC = "share_time".hashCode();
    gtD = "local_updateTime".hashCode();
    fUM = "updateTime".hashCode();
    gtE = "begin_time".hashCode();
    gtF = "end_time".hashCode();
    ghd = "updateSeq".hashCode();
    gtG = "block_mask".hashCode();
    gtH = "dataInfoData".hashCode();
    gtI = "cardTpInfoData".hashCode();
    gtJ = "shareInfoData".hashCode();
    gtK = "shopInfoData".hashCode();
    gtL = "categoryType".hashCode();
    gtM = "itemIndex".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4114041798656L, 30652);
  }
  
  public cw()
  {
    GMTrace.i(4113639145472L, 30649);
    this.fZy = true;
    this.fZz = true;
    this.gtn = true;
    this.gto = true;
    this.geA = true;
    this.fSr = true;
    this.gtp = true;
    this.gtq = true;
    this.fUI = true;
    this.gtr = true;
    this.gts = true;
    this.ggP = true;
    this.gtt = true;
    this.gtu = true;
    this.gtv = true;
    this.gtw = true;
    this.gtx = true;
    this.gty = true;
    this.gtz = true;
    GMTrace.o(4113639145472L, 30649);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4113773363200L, 30650);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4113773363200L, 30650);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fZR == k)
      {
        this.field_card_id = paramCursor.getString(i);
        this.fZy = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fZS == k) {
          this.field_card_tp_id = paramCursor.getString(i);
        } else if (gtA == k) {
          this.field_from_username = paramCursor.getString(i);
        } else if (gtB == k) {
          this.field_consumer = paramCursor.getString(i);
        } else if (geZ == k) {
          this.field_app_id = paramCursor.getString(i);
        } else if (fSu == k) {
          this.field_status = paramCursor.getInt(i);
        } else if (gtC == k) {
          this.field_share_time = paramCursor.getLong(i);
        } else if (gtD == k) {
          this.field_local_updateTime = paramCursor.getLong(i);
        } else if (fUM == k) {
          this.field_updateTime = paramCursor.getLong(i);
        } else if (gtE == k) {
          this.field_begin_time = paramCursor.getLong(i);
        } else if (gtF == k) {
          this.field_end_time = paramCursor.getLong(i);
        } else if (ghd == k) {
          this.field_updateSeq = paramCursor.getLong(i);
        } else if (gtG == k) {
          this.field_block_mask = paramCursor.getLong(i);
        } else if (gtH == k) {
          this.field_dataInfoData = paramCursor.getBlob(i);
        } else if (gtI == k) {
          this.field_cardTpInfoData = paramCursor.getBlob(i);
        } else if (gtJ == k) {
          this.field_shareInfoData = paramCursor.getBlob(i);
        } else if (gtK == k) {
          this.field_shopInfoData = paramCursor.getBlob(i);
        } else if (gtL == k) {
          this.field_categoryType = paramCursor.getInt(i);
        } else if (gtM == k) {
          this.field_itemIndex = paramCursor.getInt(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4113773363200L, 30650);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4113907580928L, 30651);
    ContentValues localContentValues = new ContentValues();
    if (this.fZy) {
      localContentValues.put("card_id", this.field_card_id);
    }
    if (this.fZz) {
      localContentValues.put("card_tp_id", this.field_card_tp_id);
    }
    if (this.gtn) {
      localContentValues.put("from_username", this.field_from_username);
    }
    if (this.gto) {
      localContentValues.put("consumer", this.field_consumer);
    }
    if (this.geA) {
      localContentValues.put("app_id", this.field_app_id);
    }
    if (this.fSr) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.gtp) {
      localContentValues.put("share_time", Long.valueOf(this.field_share_time));
    }
    if (this.gtq) {
      localContentValues.put("local_updateTime", Long.valueOf(this.field_local_updateTime));
    }
    if (this.fUI) {
      localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
    }
    if (this.gtr) {
      localContentValues.put("begin_time", Long.valueOf(this.field_begin_time));
    }
    if (this.gts) {
      localContentValues.put("end_time", Long.valueOf(this.field_end_time));
    }
    if (this.ggP) {
      localContentValues.put("updateSeq", Long.valueOf(this.field_updateSeq));
    }
    if (this.gtt) {
      localContentValues.put("block_mask", Long.valueOf(this.field_block_mask));
    }
    if (this.gtu) {
      localContentValues.put("dataInfoData", this.field_dataInfoData);
    }
    if (this.gtv) {
      localContentValues.put("cardTpInfoData", this.field_cardTpInfoData);
    }
    if (this.gtw) {
      localContentValues.put("shareInfoData", this.field_shareInfoData);
    }
    if (this.gtx) {
      localContentValues.put("shopInfoData", this.field_shopInfoData);
    }
    if (this.gty) {
      localContentValues.put("categoryType", Integer.valueOf(this.field_categoryType));
    }
    if (this.gtz) {
      localContentValues.put("itemIndex", Integer.valueOf(this.field_itemIndex));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4113907580928L, 30651);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/cw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */