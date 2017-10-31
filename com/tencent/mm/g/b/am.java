package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class am
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fUC;
  private static final int fUM;
  private static final int fUg;
  private static final int gdn;
  private static final int gdo;
  private static final int gdp;
  private boolean fTP;
  private boolean fUI;
  private boolean fUz;
  public String field_appId;
  public String field_cacheKey;
  public String field_data;
  public String field_id;
  public int field_interval;
  public long field_updateTime;
  private boolean gdk;
  private boolean gdl;
  private boolean gdm;
  
  static
  {
    GMTrace.i(17763313647616L, 132347);
    fSf = new String[0];
    gdn = "id".hashCode();
    gdo = "cacheKey".hashCode();
    fUg = "appId".hashCode();
    fUC = "data".hashCode();
    gdp = "interval".hashCode();
    fUM = "updateTime".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(17763313647616L, 132347);
  }
  
  public am()
  {
    GMTrace.i(17762910994432L, 132344);
    this.gdk = true;
    this.gdl = true;
    this.fTP = true;
    this.fUz = true;
    this.gdm = true;
    this.fUI = true;
    GMTrace.o(17762910994432L, 132344);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(17763045212160L, 132345);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(17763045212160L, 132345);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (gdn == k) {
        this.field_id = paramCursor.getString(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (gdo == k) {
          this.field_cacheKey = paramCursor.getString(i);
        } else if (fUg == k) {
          this.field_appId = paramCursor.getString(i);
        } else if (fUC == k) {
          this.field_data = paramCursor.getString(i);
        } else if (gdp == k) {
          this.field_interval = paramCursor.getInt(i);
        } else if (fUM == k) {
          this.field_updateTime = paramCursor.getLong(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(17763045212160L, 132345);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(17763179429888L, 132346);
    ContentValues localContentValues = new ContentValues();
    if (this.gdk) {
      localContentValues.put("id", this.field_id);
    }
    if (this.gdl) {
      localContentValues.put("cacheKey", this.field_cacheKey);
    }
    if (this.fTP) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.fUz) {
      localContentValues.put("data", this.field_data);
    }
    if (this.gdm) {
      localContentValues.put("interval", Integer.valueOf(this.field_interval));
    }
    if (this.fUI) {
      localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(17763179429888L, 132346);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */