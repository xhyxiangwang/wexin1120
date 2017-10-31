package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class dn
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int gxQ;
  private static final int gxR;
  private static final int gxS;
  private static final int gxT;
  private static final int gxU;
  public String field_banner_list;
  public String field_function_list;
  public String field_new_list;
  public String field_type_name_list;
  public int field_wallet_region;
  private boolean gxL;
  private boolean gxM;
  private boolean gxN;
  private boolean gxO;
  private boolean gxP;
  
  static
  {
    GMTrace.i(4125852958720L, 30740);
    fSf = new String[0];
    gxQ = "wallet_region".hashCode();
    gxR = "function_list".hashCode();
    gxS = "new_list".hashCode();
    gxT = "banner_list".hashCode();
    gxU = "type_name_list".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4125852958720L, 30740);
  }
  
  public dn()
  {
    GMTrace.i(4125450305536L, 30737);
    this.gxL = true;
    this.gxM = true;
    this.gxN = true;
    this.gxO = true;
    this.gxP = true;
    GMTrace.o(4125450305536L, 30737);
  }
  
  public void b(Cursor paramCursor)
  {
    GMTrace.i(4125584523264L, 30738);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4125584523264L, 30738);
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
        if (gxR == k) {
          this.field_function_list = paramCursor.getString(i);
        } else if (gxS == k) {
          this.field_new_list = paramCursor.getString(i);
        } else if (gxT == k) {
          this.field_banner_list = paramCursor.getString(i);
        } else if (gxU == k) {
          this.field_type_name_list = paramCursor.getString(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4125584523264L, 30738);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4125718740992L, 30739);
    ContentValues localContentValues = new ContentValues();
    if (this.gxL) {
      localContentValues.put("wallet_region", Integer.valueOf(this.field_wallet_region));
    }
    if (this.gxM) {
      localContentValues.put("function_list", this.field_function_list);
    }
    if (this.gxN) {
      localContentValues.put("new_list", this.field_new_list);
    }
    if (this.gxO) {
      localContentValues.put("banner_list", this.field_banner_list);
    }
    if (this.gxP) {
      localContentValues.put("type_name_list", this.field_type_name_list);
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4125718740992L, 30739);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/dn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */