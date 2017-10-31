package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class h
  extends c
{
  private static final int fSE;
  public static final String[] fSf;
  private static final int fSo;
  private static final int fUy;
  private boolean fSw;
  private boolean fUx;
  public String field_key;
  public String field_value;
  
  static
  {
    GMTrace.i(4164507664384L, 31028);
    fSf = new String[0];
    fUy = "key".hashCode();
    fSE = "value".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4164507664384L, 31028);
  }
  
  public h()
  {
    GMTrace.i(4164105011200L, 31025);
    this.fUx = true;
    this.fSw = true;
    GMTrace.o(4164105011200L, 31025);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4164239228928L, 31026);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4164239228928L, 31026);
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
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4164239228928L, 31026);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4164373446656L, 31027);
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
    GMTrace.o(4164373446656L, 31027);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */