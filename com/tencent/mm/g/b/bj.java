package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class bj
  extends c
{
  private static final int fSE;
  public static final String[] fSf;
  private static final int fSo;
  private static final int fUy;
  private boolean fSw;
  private boolean fUx;
  public String field_key;
  public byte[] field_value;
  
  static
  {
    GMTrace.i(4151220109312L, 30929);
    fSf = new String[0];
    fUy = "key".hashCode();
    fSE = "value".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4151220109312L, 30929);
  }
  
  public bj()
  {
    GMTrace.i(4150817456128L, 30926);
    this.fUx = true;
    this.fSw = true;
    GMTrace.o(4150817456128L, 30926);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4150951673856L, 30927);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4150951673856L, 30927);
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
          this.field_value = paramCursor.getBlob(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4150951673856L, 30927);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4151085891584L, 30928);
    ContentValues localContentValues = new ContentValues();
    if (this.fUx) {
      localContentValues.put("key", this.field_key);
    }
    if (this.fSw) {
      localContentValues.put("value", this.field_value);
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4151085891584L, 30928);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */