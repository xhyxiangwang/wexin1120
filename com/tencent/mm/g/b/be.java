package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class be
  extends c
{
  private static final int fSE;
  public static final String[] fSf;
  private static final int fSo;
  private static final int fUy;
  private static final int fWf;
  private boolean fSw;
  private boolean fUx;
  private boolean fVJ;
  public String field_key;
  public long field_modifyTime;
  public String field_value;
  
  static
  {
    GMTrace.i(4128000442368L, 30756);
    fSf = new String[0];
    fUy = "key".hashCode();
    fSE = "value".hashCode();
    fWf = "modifyTime".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4128000442368L, 30756);
  }
  
  public be()
  {
    GMTrace.i(4127597789184L, 30753);
    this.fUx = true;
    this.fSw = true;
    this.fVJ = true;
    GMTrace.o(4127597789184L, 30753);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4127732006912L, 30754);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4127732006912L, 30754);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fUy == k)
      {
        this.field_key = paramCursor.getString(i);
        this.fUx = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fSE == k) {
          this.field_value = paramCursor.getString(i);
        } else if (fWf == k) {
          this.field_modifyTime = paramCursor.getLong(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4127732006912L, 30754);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4127866224640L, 30755);
    ContentValues localContentValues = new ContentValues();
    if (this.fUx) {
      localContentValues.put("key", this.field_key);
    }
    if (this.fSw) {
      localContentValues.put("value", this.field_value);
    }
    if (this.fVJ) {
      localContentValues.put("modifyTime", Long.valueOf(this.field_modifyTime));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4127866224640L, 30755);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */