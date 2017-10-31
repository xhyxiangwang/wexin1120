package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class dc
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fTq;
  private static final int geP;
  private static final int guV;
  private static final int guW;
  private static final int guX;
  private static final int guY;
  private static final int guZ;
  private static final int gva;
  private static final int gvb;
  private static final int gvc;
  private static final int gvd;
  private static final int gve;
  private static final int gvf;
  private static final int gvg;
  private static final int gvh;
  private static final int gvi;
  private boolean fSU;
  public byte[] field_adsession;
  public String field_bgId;
  public String field_bgUrl;
  public byte[] field_faultS;
  public int field_iFlag;
  public int field_icount;
  public int field_istyle;
  public int field_lastFirstPageRequestErrCode;
  public int field_lastFirstPageRequestErrType;
  public int field_local_flag;
  public String field_md5;
  public String field_newerIds;
  public String field_older_bgId;
  public long field_snsBgId;
  public byte[] field_snsuser;
  public String field_userName;
  private boolean geq;
  private boolean guH;
  private boolean guI;
  private boolean guJ;
  private boolean guK;
  private boolean guL;
  private boolean guM;
  private boolean guN;
  private boolean guO;
  private boolean guP;
  private boolean guQ;
  private boolean guR;
  private boolean guS;
  private boolean guT;
  private boolean guU;
  
  static
  {
    GMTrace.i(4126926700544L, 30748);
    fSf = new String[0];
    fTq = "userName".hashCode();
    geP = "md5".hashCode();
    guV = "newerIds".hashCode();
    guW = "bgId".hashCode();
    guX = "bgUrl".hashCode();
    guY = "older_bgId".hashCode();
    guZ = "local_flag".hashCode();
    gva = "istyle".hashCode();
    gvb = "iFlag".hashCode();
    gvc = "icount".hashCode();
    gvd = "faultS".hashCode();
    gve = "snsBgId".hashCode();
    gvf = "snsuser".hashCode();
    gvg = "adsession".hashCode();
    gvh = "lastFirstPageRequestErrCode".hashCode();
    gvi = "lastFirstPageRequestErrType".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4126926700544L, 30748);
  }
  
  public dc()
  {
    GMTrace.i(4126524047360L, 30745);
    this.fSU = true;
    this.geq = true;
    this.guH = true;
    this.guI = true;
    this.guJ = true;
    this.guK = true;
    this.guL = true;
    this.guM = true;
    this.guN = true;
    this.guO = true;
    this.guP = true;
    this.guQ = true;
    this.guR = true;
    this.guS = true;
    this.guT = true;
    this.guU = true;
    GMTrace.o(4126524047360L, 30745);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4126658265088L, 30746);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4126658265088L, 30746);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fTq == k)
      {
        this.field_userName = paramCursor.getString(i);
        this.fSU = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (geP == k) {
          this.field_md5 = paramCursor.getString(i);
        } else if (guV == k) {
          this.field_newerIds = paramCursor.getString(i);
        } else if (guW == k) {
          this.field_bgId = paramCursor.getString(i);
        } else if (guX == k) {
          this.field_bgUrl = paramCursor.getString(i);
        } else if (guY == k) {
          this.field_older_bgId = paramCursor.getString(i);
        } else if (guZ == k) {
          this.field_local_flag = paramCursor.getInt(i);
        } else if (gva == k) {
          this.field_istyle = paramCursor.getInt(i);
        } else if (gvb == k) {
          this.field_iFlag = paramCursor.getInt(i);
        } else if (gvc == k) {
          this.field_icount = paramCursor.getInt(i);
        } else if (gvd == k) {
          this.field_faultS = paramCursor.getBlob(i);
        } else if (gve == k) {
          this.field_snsBgId = paramCursor.getLong(i);
        } else if (gvf == k) {
          this.field_snsuser = paramCursor.getBlob(i);
        } else if (gvg == k) {
          this.field_adsession = paramCursor.getBlob(i);
        } else if (gvh == k) {
          this.field_lastFirstPageRequestErrCode = paramCursor.getInt(i);
        } else if (gvi == k) {
          this.field_lastFirstPageRequestErrType = paramCursor.getInt(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4126658265088L, 30746);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4126792482816L, 30747);
    ContentValues localContentValues = new ContentValues();
    if (this.field_userName == null) {
      this.field_userName = "";
    }
    if (this.fSU) {
      localContentValues.put("userName", this.field_userName);
    }
    if (this.geq) {
      localContentValues.put("md5", this.field_md5);
    }
    if (this.guH) {
      localContentValues.put("newerIds", this.field_newerIds);
    }
    if (this.guI) {
      localContentValues.put("bgId", this.field_bgId);
    }
    if (this.guJ) {
      localContentValues.put("bgUrl", this.field_bgUrl);
    }
    if (this.guK) {
      localContentValues.put("older_bgId", this.field_older_bgId);
    }
    if (this.guL) {
      localContentValues.put("local_flag", Integer.valueOf(this.field_local_flag));
    }
    if (this.guM) {
      localContentValues.put("istyle", Integer.valueOf(this.field_istyle));
    }
    if (this.guN) {
      localContentValues.put("iFlag", Integer.valueOf(this.field_iFlag));
    }
    if (this.guO) {
      localContentValues.put("icount", Integer.valueOf(this.field_icount));
    }
    if (this.guP) {
      localContentValues.put("faultS", this.field_faultS);
    }
    if (this.guQ) {
      localContentValues.put("snsBgId", Long.valueOf(this.field_snsBgId));
    }
    if (this.guR) {
      localContentValues.put("snsuser", this.field_snsuser);
    }
    if (this.guS) {
      localContentValues.put("adsession", this.field_adsession);
    }
    if (this.guT) {
      localContentValues.put("lastFirstPageRequestErrCode", Integer.valueOf(this.field_lastFirstPageRequestErrCode));
    }
    if (this.guU) {
      localContentValues.put("lastFirstPageRequestErrType", Integer.valueOf(this.field_lastFirstPageRequestErrType));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4126792482816L, 30747);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/dc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */