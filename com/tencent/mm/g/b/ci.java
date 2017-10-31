package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class ci
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fSu;
  private static final int gqS;
  private static final int gqT;
  private static final int gqU;
  private boolean fSr;
  public String field_ack_key;
  public long field_receive_time;
  public String field_reqkey;
  public int field_status;
  private boolean gqP;
  private boolean gqQ;
  private boolean gqR;
  
  static
  {
    GMTrace.i(15355044954112L, 114404);
    fSf = new String[0];
    gqS = "reqkey".hashCode();
    gqT = "ack_key".hashCode();
    fSu = "status".hashCode();
    gqU = "receive_time".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(15355044954112L, 114404);
  }
  
  public ci()
  {
    GMTrace.i(15354642300928L, 114401);
    this.gqP = true;
    this.gqQ = true;
    this.fSr = true;
    this.gqR = true;
    GMTrace.o(15354642300928L, 114401);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(15354776518656L, 114402);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(15354776518656L, 114402);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (gqS == k)
      {
        this.field_reqkey = paramCursor.getString(i);
        this.gqP = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (gqT == k) {
          this.field_ack_key = paramCursor.getString(i);
        } else if (fSu == k) {
          this.field_status = paramCursor.getInt(i);
        } else if (gqU == k) {
          this.field_receive_time = paramCursor.getLong(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(15354776518656L, 114402);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(15354910736384L, 114403);
    ContentValues localContentValues = new ContentValues();
    if (this.gqP) {
      localContentValues.put("reqkey", this.field_reqkey);
    }
    if (this.gqQ) {
      localContentValues.put("ack_key", this.field_ack_key);
    }
    if (this.fSr) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.gqR) {
      localContentValues.put("receive_time", Long.valueOf(this.field_receive_time));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(15354910736384L, 114403);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/ci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */