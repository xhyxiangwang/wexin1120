package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class cx
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fZR;
  private static final int grg;
  private static final int gtQ;
  private static final int gtR;
  private static final int gtS;
  private boolean fZy;
  public String field_card_id;
  public int field_retryCount;
  public long field_seq;
  public int field_state_flag;
  public long field_update_time;
  private boolean gre;
  private boolean gtN;
  private boolean gtO;
  private boolean gtP;
  
  static
  {
    GMTrace.i(4144240787456L, 30877);
    fSf = new String[0];
    fZR = "card_id".hashCode();
    gtQ = "state_flag".hashCode();
    gtR = "update_time".hashCode();
    gtS = "seq".hashCode();
    grg = "retryCount".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4144240787456L, 30877);
  }
  
  public cx()
  {
    GMTrace.i(4143838134272L, 30874);
    this.fZy = true;
    this.gtN = true;
    this.gtO = true;
    this.gtP = true;
    this.gre = true;
    GMTrace.o(4143838134272L, 30874);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4143972352000L, 30875);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4143972352000L, 30875);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fZR == k)
      {
        this.field_card_id = paramCursor.getString(i);
        this.fZy = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (gtQ == k) {
          this.field_state_flag = paramCursor.getInt(i);
        } else if (gtR == k) {
          this.field_update_time = paramCursor.getLong(i);
        } else if (gtS == k) {
          this.field_seq = paramCursor.getLong(i);
        } else if (grg == k) {
          this.field_retryCount = paramCursor.getInt(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4143972352000L, 30875);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4144106569728L, 30876);
    ContentValues localContentValues = new ContentValues();
    if (this.fZy) {
      localContentValues.put("card_id", this.field_card_id);
    }
    if (this.gtN) {
      localContentValues.put("state_flag", Integer.valueOf(this.field_state_flag));
    }
    if (this.gtO) {
      localContentValues.put("update_time", Long.valueOf(this.field_update_time));
    }
    if (this.gtP) {
      localContentValues.put("seq", Long.valueOf(this.field_seq));
    }
    if (this.gre) {
      localContentValues.put("retryCount", Integer.valueOf(this.field_retryCount));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4144106569728L, 30876);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/cx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */