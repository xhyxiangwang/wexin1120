package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class i
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fUC;
  private static final int fUD;
  private static final int fUE;
  private static final int fUy;
  private boolean fUA;
  private boolean fUB;
  private boolean fUx;
  private boolean fUz;
  public String field_data;
  public String field_dataType;
  public String field_key;
  public int field_size;
  
  static
  {
    GMTrace.i(4119007854592L, 30689);
    fSf = new String[0];
    fUy = "key".hashCode();
    fUC = "data".hashCode();
    fUD = "dataType".hashCode();
    fUE = "size".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4119007854592L, 30689);
  }
  
  public i()
  {
    GMTrace.i(4118605201408L, 30686);
    this.fUx = true;
    this.fUz = true;
    this.fUA = true;
    this.fUB = true;
    GMTrace.o(4118605201408L, 30686);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4118739419136L, 30687);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4118739419136L, 30687);
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
        if (fUC == k) {
          this.field_data = paramCursor.getString(i);
        } else if (fUD == k) {
          this.field_dataType = paramCursor.getString(i);
        } else if (fUE == k) {
          this.field_size = paramCursor.getInt(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4118739419136L, 30687);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4118873636864L, 30688);
    ContentValues localContentValues = new ContentValues();
    if (this.fUx) {
      localContentValues.put("key", this.field_key);
    }
    if (this.fUz) {
      localContentValues.put("data", this.field_data);
    }
    if (this.fUA) {
      localContentValues.put("dataType", this.field_dataType);
    }
    if (this.fUB) {
      localContentValues.put("size", Integer.valueOf(this.field_size));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4118873636864L, 30688);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */