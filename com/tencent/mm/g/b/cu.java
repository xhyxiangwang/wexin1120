package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class cu
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fTv;
  private static final int fUO;
  private static final int fUu;
  private static final int fZp;
  private static final int geV;
  private static final int geW;
  private static final int geX;
  private static final int geY;
  private static final int gll;
  private static final int gtc;
  private static final int gtd;
  private static final int gte;
  private static final int gtf;
  private static final int gtg;
  private static final int gth;
  private static final int gti;
  private static final int gtj;
  private static final int gtk;
  private static final int gtl;
  private static final int gtm;
  private boolean fSZ;
  private boolean fUN;
  private boolean fUd;
  private boolean fZl;
  public String field_city;
  public String field_distance;
  public int field_hasHDImg;
  public int field_imgstatus;
  public int field_insertBatch;
  public byte[] field_lvbuffer;
  public String field_nickname;
  public String field_province;
  public String field_regionCode;
  public int field_reserved1;
  public int field_reserved2;
  public String field_reserved3;
  public String field_reserved4;
  public int field_sex;
  public int field_shakeItemID;
  public String field_signature;
  public int field_snsFlag;
  public String field_sns_bgurl;
  public int field_type;
  public String field_username;
  private boolean gew;
  private boolean gex;
  private boolean gey;
  private boolean gez;
  private boolean gkZ;
  private boolean gsR;
  private boolean gsS;
  private boolean gsT;
  private boolean gsU;
  private boolean gsV;
  private boolean gsW;
  private boolean gsX;
  private boolean gsY;
  private boolean gsZ;
  private boolean gta;
  private boolean gtb;
  
  static
  {
    GMTrace.i(4150146367488L, 30921);
    fSf = new String[0];
    gtc = "shakeItemID".hashCode();
    fUO = "username".hashCode();
    fZp = "nickname".hashCode();
    gtd = "province".hashCode();
    gte = "city".hashCode();
    fUu = "signature".hashCode();
    gtf = "distance".hashCode();
    gtg = "sex".hashCode();
    gth = "imgstatus".hashCode();
    gti = "hasHDImg".hashCode();
    gtj = "insertBatch".hashCode();
    geV = "reserved1".hashCode();
    geW = "reserved2".hashCode();
    geX = "reserved3".hashCode();
    geY = "reserved4".hashCode();
    fTv = "type".hashCode();
    gll = "lvbuffer".hashCode();
    gtk = "regionCode".hashCode();
    gtl = "snsFlag".hashCode();
    gtm = "sns_bgurl".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4150146367488L, 30921);
  }
  
  public cu()
  {
    GMTrace.i(4149743714304L, 30918);
    this.gsR = true;
    this.fUN = true;
    this.fZl = true;
    this.gsS = true;
    this.gsT = true;
    this.fUd = true;
    this.gsU = true;
    this.gsV = true;
    this.gsW = true;
    this.gsX = true;
    this.gsY = true;
    this.gew = true;
    this.gex = true;
    this.gey = true;
    this.gez = true;
    this.fSZ = true;
    this.gkZ = true;
    this.gsZ = true;
    this.gta = true;
    this.gtb = true;
    GMTrace.o(4149743714304L, 30918);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4149877932032L, 30919);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4149877932032L, 30919);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (gtc == k)
      {
        this.field_shakeItemID = paramCursor.getInt(i);
        this.gsR = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fUO == k) {
          this.field_username = paramCursor.getString(i);
        } else if (fZp == k) {
          this.field_nickname = paramCursor.getString(i);
        } else if (gtd == k) {
          this.field_province = paramCursor.getString(i);
        } else if (gte == k) {
          this.field_city = paramCursor.getString(i);
        } else if (fUu == k) {
          this.field_signature = paramCursor.getString(i);
        } else if (gtf == k) {
          this.field_distance = paramCursor.getString(i);
        } else if (gtg == k) {
          this.field_sex = paramCursor.getInt(i);
        } else if (gth == k) {
          this.field_imgstatus = paramCursor.getInt(i);
        } else if (gti == k) {
          this.field_hasHDImg = paramCursor.getInt(i);
        } else if (gtj == k) {
          this.field_insertBatch = paramCursor.getInt(i);
        } else if (geV == k) {
          this.field_reserved1 = paramCursor.getInt(i);
        } else if (geW == k) {
          this.field_reserved2 = paramCursor.getInt(i);
        } else if (geX == k) {
          this.field_reserved3 = paramCursor.getString(i);
        } else if (geY == k) {
          this.field_reserved4 = paramCursor.getString(i);
        } else if (fTv == k) {
          this.field_type = paramCursor.getInt(i);
        } else if (gll == k) {
          this.field_lvbuffer = paramCursor.getBlob(i);
        } else if (gtk == k) {
          this.field_regionCode = paramCursor.getString(i);
        } else if (gtl == k) {
          this.field_snsFlag = paramCursor.getInt(i);
        } else if (gtm == k) {
          this.field_sns_bgurl = paramCursor.getString(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4149877932032L, 30919);
  }
  
  public ContentValues qQ()
  {
    GMTrace.i(4150012149760L, 30920);
    ContentValues localContentValues = new ContentValues();
    if (this.gsR) {
      localContentValues.put("shakeItemID", Integer.valueOf(this.field_shakeItemID));
    }
    if (this.fUN) {
      localContentValues.put("username", this.field_username);
    }
    if (this.fZl) {
      localContentValues.put("nickname", this.field_nickname);
    }
    if (this.gsS) {
      localContentValues.put("province", this.field_province);
    }
    if (this.gsT) {
      localContentValues.put("city", this.field_city);
    }
    if (this.fUd) {
      localContentValues.put("signature", this.field_signature);
    }
    if (this.gsU) {
      localContentValues.put("distance", this.field_distance);
    }
    if (this.gsV) {
      localContentValues.put("sex", Integer.valueOf(this.field_sex));
    }
    if (this.gsW) {
      localContentValues.put("imgstatus", Integer.valueOf(this.field_imgstatus));
    }
    if (this.gsX) {
      localContentValues.put("hasHDImg", Integer.valueOf(this.field_hasHDImg));
    }
    if (this.gsY) {
      localContentValues.put("insertBatch", Integer.valueOf(this.field_insertBatch));
    }
    if (this.gew) {
      localContentValues.put("reserved1", Integer.valueOf(this.field_reserved1));
    }
    if (this.gex) {
      localContentValues.put("reserved2", Integer.valueOf(this.field_reserved2));
    }
    if (this.gey) {
      localContentValues.put("reserved3", this.field_reserved3);
    }
    if (this.gez) {
      localContentValues.put("reserved4", this.field_reserved4);
    }
    if (this.fSZ) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.gkZ) {
      localContentValues.put("lvbuffer", this.field_lvbuffer);
    }
    if (this.gsZ) {
      localContentValues.put("regionCode", this.field_regionCode);
    }
    if (this.gta) {
      localContentValues.put("snsFlag", Integer.valueOf(this.field_snsFlag));
    }
    if (this.gtb) {
      localContentValues.put("sns_bgurl", this.field_sns_bgurl);
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4150012149760L, 30920);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/cu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */