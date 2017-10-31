package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class ck
  extends c
{
  public static final String[] fSf;
  private static final int fSn;
  private static final int fSo;
  private static final int gjP;
  private static final int grc;
  private boolean fSj;
  public String field_isRead;
  public String field_msgContentXml;
  public String field_msgId;
  private boolean gjG;
  private boolean grb;
  
  static
  {
    GMTrace.i(4112968056832L, 30644);
    fSf = new String[0];
    fSn = "msgId".hashCode();
    grc = "msgContentXml".hashCode();
    gjP = "isRead".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4112968056832L, 30644);
  }
  
  public ck()
  {
    GMTrace.i(4112565403648L, 30641);
    this.fSj = true;
    this.grb = true;
    this.gjG = true;
    GMTrace.o(4112565403648L, 30641);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4112699621376L, 30642);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4112699621376L, 30642);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fSn == k)
      {
        this.field_msgId = paramCursor.getString(i);
        this.fSj = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (grc == k) {
          this.field_msgContentXml = paramCursor.getString(i);
        } else if (gjP == k) {
          this.field_isRead = paramCursor.getString(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4112699621376L, 30642);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4112833839104L, 30643);
    ContentValues localContentValues = new ContentValues();
    if (this.fSj) {
      localContentValues.put("msgId", this.field_msgId);
    }
    if (this.grb) {
      localContentValues.put("msgContentXml", this.field_msgContentXml);
    }
    if (this.gjG) {
      localContentValues.put("isRead", this.field_isRead);
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4112833839104L, 30643);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/ck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */