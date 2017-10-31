package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class do
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int gyb;
  private static final int gyc;
  private static final int gyd;
  private static final int gye;
  private static final int gyf;
  private static final int gyg;
  public int field_wallet_balance;
  public String field_wallet_name;
  public int field_wallet_selected;
  public String field_wallet_tpa_country;
  public int field_wallet_tpa_country_mask;
  public int field_wallet_type;
  private boolean gxV;
  private boolean gxW;
  private boolean gxX;
  private boolean gxY;
  private boolean gxZ;
  private boolean gya;
  
  static
  {
    GMTrace.i(4145851400192L, 30889);
    fSf = new String[0];
    gyb = "wallet_tpa_country".hashCode();
    gyc = "wallet_type".hashCode();
    gyd = "wallet_name".hashCode();
    gye = "wallet_selected".hashCode();
    gyf = "wallet_balance".hashCode();
    gyg = "wallet_tpa_country_mask".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4145851400192L, 30889);
  }
  
  public do()
  {
    GMTrace.i(4145448747008L, 30886);
    this.gxV = true;
    this.gxW = true;
    this.gxX = true;
    this.gxY = true;
    this.gxZ = true;
    this.gya = true;
    GMTrace.o(4145448747008L, 30886);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4145582964736L, 30887);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4145582964736L, 30887);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (gyb == k)
      {
        this.field_wallet_tpa_country = paramCursor.getString(i);
        this.gxV = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (gyc == k) {
          this.field_wallet_type = paramCursor.getInt(i);
        } else if (gyd == k) {
          this.field_wallet_name = paramCursor.getString(i);
        } else if (gye == k) {
          this.field_wallet_selected = paramCursor.getInt(i);
        } else if (gyf == k) {
          this.field_wallet_balance = paramCursor.getInt(i);
        } else if (gyg == k) {
          this.field_wallet_tpa_country_mask = paramCursor.getInt(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4145582964736L, 30887);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4145717182464L, 30888);
    ContentValues localContentValues = new ContentValues();
    if (this.gxV) {
      localContentValues.put("wallet_tpa_country", this.field_wallet_tpa_country);
    }
    if (this.gxW) {
      localContentValues.put("wallet_type", Integer.valueOf(this.field_wallet_type));
    }
    if (this.gxX) {
      localContentValues.put("wallet_name", this.field_wallet_name);
    }
    if (this.gxY) {
      localContentValues.put("wallet_selected", Integer.valueOf(this.field_wallet_selected));
    }
    if (this.gxZ) {
      localContentValues.put("wallet_balance", Integer.valueOf(this.field_wallet_balance));
    }
    if (this.gya) {
      localContentValues.put("wallet_tpa_country_mask", Integer.valueOf(this.field_wallet_tpa_country_mask));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4145717182464L, 30888);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/do.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */