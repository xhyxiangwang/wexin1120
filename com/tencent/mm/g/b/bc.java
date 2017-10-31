package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class bc
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fWY;
  private static final int fZW;
  private static final int ghE;
  private static final int ghF;
  private static final int ghG;
  private static final int ghH;
  private static final int ghI;
  private static final int ghJ;
  private static final int ghK;
  private static final int ghL;
  private static final int ghM;
  private static final int ghN;
  private boolean fWU;
  private boolean fZD;
  public int field_actionType;
  public String field_androidUrl;
  public int field_featureId;
  public String field_helpUrl;
  public String field_iconPath;
  public String field_tag;
  public long field_timestamp;
  public String field_title;
  public String field_titlePY;
  public String field_titleShortPY;
  public String field_updateUrl;
  public String field_url;
  private boolean ghA;
  private boolean ghB;
  private boolean ghC;
  private boolean ghD;
  private boolean ghu;
  private boolean ghv;
  private boolean ghw;
  private boolean ghx;
  private boolean ghy;
  private boolean ghz;
  
  static
  {
    GMTrace.i(4161286438912L, 31004);
    fSf = new String[0];
    ghE = "featureId".hashCode();
    fWY = "title".hashCode();
    ghF = "titlePY".hashCode();
    ghG = "titleShortPY".hashCode();
    ghH = "tag".hashCode();
    ghI = "actionType".hashCode();
    fZW = "url".hashCode();
    ghJ = "helpUrl".hashCode();
    ghK = "updateUrl".hashCode();
    ghL = "androidUrl".hashCode();
    ghM = "iconPath".hashCode();
    ghN = "timestamp".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4161286438912L, 31004);
  }
  
  public bc()
  {
    GMTrace.i(4160883785728L, 31001);
    this.ghu = true;
    this.fWU = true;
    this.ghv = true;
    this.ghw = true;
    this.ghx = true;
    this.ghy = true;
    this.fZD = true;
    this.ghz = true;
    this.ghA = true;
    this.ghB = true;
    this.ghC = true;
    this.ghD = true;
    GMTrace.o(4160883785728L, 31001);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4161018003456L, 31002);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4161018003456L, 31002);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (ghE == k)
      {
        this.field_featureId = paramCursor.getInt(i);
        this.ghu = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fWY == k) {
          this.field_title = paramCursor.getString(i);
        } else if (ghF == k) {
          this.field_titlePY = paramCursor.getString(i);
        } else if (ghG == k) {
          this.field_titleShortPY = paramCursor.getString(i);
        } else if (ghH == k) {
          this.field_tag = paramCursor.getString(i);
        } else if (ghI == k) {
          this.field_actionType = paramCursor.getInt(i);
        } else if (fZW == k) {
          this.field_url = paramCursor.getString(i);
        } else if (ghJ == k) {
          this.field_helpUrl = paramCursor.getString(i);
        } else if (ghK == k) {
          this.field_updateUrl = paramCursor.getString(i);
        } else if (ghL == k) {
          this.field_androidUrl = paramCursor.getString(i);
        } else if (ghM == k) {
          this.field_iconPath = paramCursor.getString(i);
        } else if (ghN == k) {
          this.field_timestamp = paramCursor.getLong(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4161018003456L, 31002);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4161152221184L, 31003);
    ContentValues localContentValues = new ContentValues();
    if (this.ghu) {
      localContentValues.put("featureId", Integer.valueOf(this.field_featureId));
    }
    if (this.fWU) {
      localContentValues.put("title", this.field_title);
    }
    if (this.ghv) {
      localContentValues.put("titlePY", this.field_titlePY);
    }
    if (this.ghw) {
      localContentValues.put("titleShortPY", this.field_titleShortPY);
    }
    if (this.ghx) {
      localContentValues.put("tag", this.field_tag);
    }
    if (this.ghy) {
      localContentValues.put("actionType", Integer.valueOf(this.field_actionType));
    }
    if (this.fZD) {
      localContentValues.put("url", this.field_url);
    }
    if (this.ghz) {
      localContentValues.put("helpUrl", this.field_helpUrl);
    }
    if (this.ghA) {
      localContentValues.put("updateUrl", this.field_updateUrl);
    }
    if (this.ghB) {
      localContentValues.put("androidUrl", this.field_androidUrl);
    }
    if (this.ghC) {
      localContentValues.put("iconPath", this.field_iconPath);
    }
    if (this.ghD) {
      localContentValues.put("timestamp", Long.valueOf(this.field_timestamp));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4161152221184L, 31003);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */