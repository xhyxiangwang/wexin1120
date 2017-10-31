package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class dr
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int gxQ;
  private static final int gyy;
  public byte[] field_wallet_grey_item_buf;
  public int field_wallet_region;
  private boolean gxL;
  private boolean gyx;
  
  static
  {
    GMTrace.i(4152293851136L, 30937);
    fSf = new String[0];
    gxQ = "wallet_region".hashCode();
    gyy = "wallet_grey_item_buf".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4152293851136L, 30937);
  }
  
  public dr()
  {
    GMTrace.i(4151891197952L, 30934);
    this.gxL = true;
    this.gyx = true;
    GMTrace.o(4151891197952L, 30934);
  }
  
  public void b(Cursor paramCursor)
  {
    GMTrace.i(4152025415680L, 30935);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4152025415680L, 30935);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (gxQ == k)
      {
        this.field_wallet_region = paramCursor.getInt(i);
        this.gxL = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (gyy == k) {
          this.field_wallet_grey_item_buf = paramCursor.getBlob(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4152025415680L, 30935);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4152159633408L, 30936);
    ContentValues localContentValues = new ContentValues();
    if (this.gxL) {
      localContentValues.put("wallet_region", Integer.valueOf(this.field_wallet_region));
    }
    if (this.gyx) {
      localContentValues.put("wallet_grey_item_buf", this.field_wallet_grey_item_buf);
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4152159633408L, 30936);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/dr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */