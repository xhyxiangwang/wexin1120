package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class dh
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fSu;
  private static final int fUM;
  private static final int fZO;
  private static final int fZR;
  private static final int fZS;
  private static final int ghd;
  private static final int gtA;
  private static final int gtD;
  private static final int gtE;
  private static final int gtF;
  private static final int gtG;
  private static final int gtH;
  private static final int gtI;
  private static final int gtJ;
  private static final int gtK;
  private static final int gvI;
  private static final int gvJ;
  private static final int gvK;
  private static final int gvL;
  private static final int gvM;
  private static final int gvN;
  private static final int gvO;
  private boolean fSr;
  private boolean fUI;
  private boolean fZv;
  private boolean fZy;
  private boolean fZz;
  public long field_begin_time;
  public String field_block_mask;
  public byte[] field_cardTpInfoData;
  public String field_card_id;
  public String field_card_tp_id;
  public int field_card_type;
  public long field_create_time;
  public byte[] field_dataInfoData;
  public int field_delete_state_flag;
  public long field_end_time;
  public String field_from_username;
  public boolean field_is_dynamic;
  public String field_label_wording;
  public long field_local_updateTime;
  public byte[] field_shareInfoData;
  public byte[] field_shopInfoData;
  public int field_status;
  public String field_stickyAnnouncement;
  public int field_stickyEndTime;
  public int field_stickyIndex;
  public long field_updateSeq;
  public long field_updateTime;
  private boolean ggP;
  private boolean gtn;
  private boolean gtq;
  private boolean gtr;
  private boolean gts;
  private boolean gtt;
  private boolean gtu;
  private boolean gtv;
  private boolean gtw;
  private boolean gtx;
  private boolean gvB;
  private boolean gvC;
  private boolean gvD;
  private boolean gvE;
  private boolean gvF;
  private boolean gvG;
  private boolean gvH;
  
  static
  {
    GMTrace.i(4120081596416L, 30697);
    fSf = new String[] { "CREATE INDEX IF NOT EXISTS UserCardInfo_card_type_index ON UserCardInfo(card_type)" };
    fZR = "card_id".hashCode();
    fZS = "card_tp_id".hashCode();
    gtA = "from_username".hashCode();
    fSu = "status".hashCode();
    gvI = "delete_state_flag".hashCode();
    gtD = "local_updateTime".hashCode();
    fUM = "updateTime".hashCode();
    ghd = "updateSeq".hashCode();
    gvJ = "create_time".hashCode();
    gtE = "begin_time".hashCode();
    gtF = "end_time".hashCode();
    gtG = "block_mask".hashCode();
    gtH = "dataInfoData".hashCode();
    gtI = "cardTpInfoData".hashCode();
    gtJ = "shareInfoData".hashCode();
    gtK = "shopInfoData".hashCode();
    gvK = "stickyIndex".hashCode();
    gvL = "stickyEndTime".hashCode();
    gvM = "stickyAnnouncement".hashCode();
    fZO = "card_type".hashCode();
    gvN = "label_wording".hashCode();
    gvO = "is_dynamic".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4120081596416L, 30697);
  }
  
  public dh()
  {
    GMTrace.i(4119678943232L, 30694);
    this.fZy = true;
    this.fZz = true;
    this.gtn = true;
    this.fSr = true;
    this.gvB = true;
    this.gtq = true;
    this.fUI = true;
    this.ggP = true;
    this.gvC = true;
    this.gtr = true;
    this.gts = true;
    this.gtt = true;
    this.gtu = true;
    this.gtv = true;
    this.gtw = true;
    this.gtx = true;
    this.gvD = true;
    this.gvE = true;
    this.gvF = true;
    this.fZv = true;
    this.gvG = true;
    this.gvH = true;
    GMTrace.o(4119678943232L, 30694);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4119813160960L, 30695);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4119813160960L, 30695);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
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
        if (fZS == k)
        {
          this.field_card_tp_id = paramCursor.getString(i);
        }
        else if (gtA == k)
        {
          this.field_from_username = paramCursor.getString(i);
        }
        else if (fSu == k)
        {
          this.field_status = paramCursor.getInt(i);
        }
        else if (gvI == k)
        {
          this.field_delete_state_flag = paramCursor.getInt(i);
        }
        else if (gtD == k)
        {
          this.field_local_updateTime = paramCursor.getLong(i);
        }
        else if (fUM == k)
        {
          this.field_updateTime = paramCursor.getLong(i);
        }
        else if (ghd == k)
        {
          this.field_updateSeq = paramCursor.getLong(i);
        }
        else if (gvJ == k)
        {
          this.field_create_time = paramCursor.getLong(i);
        }
        else if (gtE == k)
        {
          this.field_begin_time = paramCursor.getLong(i);
        }
        else if (gtF == k)
        {
          this.field_end_time = paramCursor.getLong(i);
        }
        else if (gtG == k)
        {
          this.field_block_mask = paramCursor.getString(i);
        }
        else if (gtH == k)
        {
          this.field_dataInfoData = paramCursor.getBlob(i);
        }
        else if (gtI == k)
        {
          this.field_cardTpInfoData = paramCursor.getBlob(i);
        }
        else if (gtJ == k)
        {
          this.field_shareInfoData = paramCursor.getBlob(i);
        }
        else if (gtK == k)
        {
          this.field_shopInfoData = paramCursor.getBlob(i);
        }
        else if (gvK == k)
        {
          this.field_stickyIndex = paramCursor.getInt(i);
        }
        else if (gvL == k)
        {
          this.field_stickyEndTime = paramCursor.getInt(i);
        }
        else if (gvM == k)
        {
          this.field_stickyAnnouncement = paramCursor.getString(i);
        }
        else if (fZO == k)
        {
          this.field_card_type = paramCursor.getInt(i);
        }
        else if (gvN == k)
        {
          this.field_label_wording = paramCursor.getString(i);
        }
        else
        {
          if (gvO == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (boolean bool = true;; bool = false)
            {
              this.field_is_dynamic = bool;
              break;
            }
          }
          if (fSo == k) {
            this.uQF = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(4119813160960L, 30695);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4119947378688L, 30696);
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
    if (this.fSr) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.gvB) {
      localContentValues.put("delete_state_flag", Integer.valueOf(this.field_delete_state_flag));
    }
    if (this.gtq) {
      localContentValues.put("local_updateTime", Long.valueOf(this.field_local_updateTime));
    }
    if (this.fUI) {
      localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
    }
    if (this.ggP) {
      localContentValues.put("updateSeq", Long.valueOf(this.field_updateSeq));
    }
    if (this.gvC) {
      localContentValues.put("create_time", Long.valueOf(this.field_create_time));
    }
    if (this.gtr) {
      localContentValues.put("begin_time", Long.valueOf(this.field_begin_time));
    }
    if (this.gts) {
      localContentValues.put("end_time", Long.valueOf(this.field_end_time));
    }
    if (this.gtt) {
      localContentValues.put("block_mask", this.field_block_mask);
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
    if (this.gvD) {
      localContentValues.put("stickyIndex", Integer.valueOf(this.field_stickyIndex));
    }
    if (this.gvE) {
      localContentValues.put("stickyEndTime", Integer.valueOf(this.field_stickyEndTime));
    }
    if (this.gvF) {
      localContentValues.put("stickyAnnouncement", this.field_stickyAnnouncement);
    }
    if (this.fZv) {
      localContentValues.put("card_type", Integer.valueOf(this.field_card_type));
    }
    if (this.gvG) {
      localContentValues.put("label_wording", this.field_label_wording);
    }
    if (this.gvH) {
      localContentValues.put("is_dynamic", Boolean.valueOf(this.field_is_dynamic));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4119947378688L, 30696);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/dh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */