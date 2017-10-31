package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class bw
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int gmf;
  private static final int gmg;
  private static final int gmh;
  public long field_callTimeCount;
  public int field_countryCode;
  public long field_lastCallTime;
  private boolean gmc;
  private boolean gmd;
  private boolean gme;
  
  static
  {
    GMTrace.i(4144777658368L, 30881);
    fSf = new String[0];
    gmf = "countryCode".hashCode();
    gmg = "callTimeCount".hashCode();
    gmh = "lastCallTime".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4144777658368L, 30881);
  }
  
  public bw()
  {
    GMTrace.i(4144375005184L, 30878);
    this.gmc = true;
    this.gmd = true;
    this.gme = true;
    GMTrace.o(4144375005184L, 30878);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4144509222912L, 30879);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4144509222912L, 30879);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (gmf == k)
      {
        this.field_countryCode = paramCursor.getInt(i);
        this.gmc = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (gmg == k) {
          this.field_callTimeCount = paramCursor.getLong(i);
        } else if (gmh == k) {
          this.field_lastCallTime = paramCursor.getLong(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4144509222912L, 30879);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4144643440640L, 30880);
    ContentValues localContentValues = new ContentValues();
    if (this.gmc) {
      localContentValues.put("countryCode", Integer.valueOf(this.field_countryCode));
    }
    if (this.gmd) {
      localContentValues.put("callTimeCount", Long.valueOf(this.field_callTimeCount));
    }
    if (this.gme) {
      localContentValues.put("lastCallTime", Long.valueOf(this.field_lastCallTime));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4144643440640L, 30880);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/bw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */