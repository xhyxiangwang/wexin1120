package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class aa
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fTs;
  private static final int fZt;
  private static final int fZu;
  private boolean fSW;
  private boolean fZr;
  private boolean fZs;
  public long field_canvasId;
  public String field_canvasXml;
  public long field_createTime;
  
  static
  {
    GMTrace.i(16688498081792L, 124339);
    fSf = new String[0];
    fZt = "canvasId".hashCode();
    fZu = "canvasXml".hashCode();
    fTs = "createTime".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(16688498081792L, 124339);
  }
  
  public aa()
  {
    GMTrace.i(16688095428608L, 124336);
    this.fZr = true;
    this.fZs = true;
    this.fSW = true;
    GMTrace.o(16688095428608L, 124336);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(16688229646336L, 124337);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(16688229646336L, 124337);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fZt == k)
      {
        this.field_canvasId = paramCursor.getLong(i);
        this.fZr = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fZu == k) {
          this.field_canvasXml = paramCursor.getString(i);
        } else if (fTs == k) {
          this.field_createTime = paramCursor.getLong(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(16688229646336L, 124337);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(16688363864064L, 124338);
    ContentValues localContentValues = new ContentValues();
    if (this.fZr) {
      localContentValues.put("canvasId", Long.valueOf(this.field_canvasId));
    }
    if (this.fZs) {
      localContentValues.put("canvasXml", this.field_canvasXml);
    }
    if (this.fSW) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(16688363864064L, 124338);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */