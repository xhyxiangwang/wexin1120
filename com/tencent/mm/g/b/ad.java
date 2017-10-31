package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class ad
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fSu;
  private static final int fZR;
  private static final int gav;
  private static final int gaw;
  private boolean fSr;
  private boolean fZy;
  public String field_card_id;
  public String field_code;
  public String field_code_id;
  public int field_status;
  private boolean gat;
  private boolean gau;
  
  static
  {
    GMTrace.i(18825378529280L, 140260);
    fSf = new String[] { "CREATE INDEX IF NOT EXISTS CardQrCodeDataInfo_card_id_index ON CardQrCodeDataInfo(card_id)" };
    gav = "code_id".hashCode();
    fZR = "card_id".hashCode();
    gaw = "code".hashCode();
    fSu = "status".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(18825378529280L, 140260);
  }
  
  public ad()
  {
    GMTrace.i(18824975876096L, 140257);
    this.gat = true;
    this.fZy = true;
    this.gau = true;
    this.fSr = true;
    GMTrace.o(18824975876096L, 140257);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(18825110093824L, 140258);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(18825110093824L, 140258);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (gav == k) {
        this.field_code_id = paramCursor.getString(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fZR == k) {
          this.field_card_id = paramCursor.getString(i);
        } else if (gaw == k) {
          this.field_code = paramCursor.getString(i);
        } else if (fSu == k) {
          this.field_status = paramCursor.getInt(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(18825110093824L, 140258);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(18825244311552L, 140259);
    ContentValues localContentValues = new ContentValues();
    if (this.gat) {
      localContentValues.put("code_id", this.field_code_id);
    }
    if (this.fZy) {
      localContentValues.put("card_id", this.field_card_id);
    }
    if (this.gau) {
      localContentValues.put("code", this.field_code);
    }
    if (this.fSr) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(18825244311552L, 140259);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */