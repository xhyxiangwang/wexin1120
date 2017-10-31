package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class cl
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int grf;
  private static final int grg;
  public String field_cardUserId;
  public int field_retryCount;
  private boolean grd;
  private boolean gre;
  
  static
  {
    GMTrace.i(4146925142016L, 30897);
    fSf = new String[0];
    grf = "cardUserId".hashCode();
    grg = "retryCount".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4146925142016L, 30897);
  }
  
  public cl()
  {
    GMTrace.i(4146522488832L, 30894);
    this.grd = true;
    this.gre = true;
    GMTrace.o(4146522488832L, 30894);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4146656706560L, 30895);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4146656706560L, 30895);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (grf == k)
      {
        this.field_cardUserId = paramCursor.getString(i);
        this.grd = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (grg == k) {
          this.field_retryCount = paramCursor.getInt(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4146656706560L, 30895);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4146790924288L, 30896);
    ContentValues localContentValues = new ContentValues();
    if (this.grd) {
      localContentValues.put("cardUserId", this.field_cardUserId);
    }
    if (this.gre) {
      localContentValues.put("retryCount", Integer.valueOf(this.field_retryCount));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4146790924288L, 30896);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/cl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */