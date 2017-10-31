package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class cd
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fWY;
  private static final int goG;
  private static final int goH;
  private static final int goI;
  private static final int goJ;
  private static final int goK;
  private static final int goL;
  private boolean fWU;
  public String field_available_otb;
  public int field_is_overdue;
  public int field_is_show_entry;
  public String field_loan_jump_url;
  public int field_red_dot_index;
  public String field_tips;
  public String field_title;
  private boolean goA;
  private boolean goB;
  private boolean goC;
  private boolean goD;
  private boolean goE;
  private boolean goF;
  
  static
  {
    GMTrace.i(4147462012928L, 30901);
    fSf = new String[0];
    fWY = "title".hashCode();
    goG = "loan_jump_url".hashCode();
    goH = "red_dot_index".hashCode();
    goI = "is_show_entry".hashCode();
    goJ = "tips".hashCode();
    goK = "is_overdue".hashCode();
    goL = "available_otb".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4147462012928L, 30901);
  }
  
  public cd()
  {
    GMTrace.i(4147059359744L, 30898);
    this.fWU = true;
    this.goA = true;
    this.goB = true;
    this.goC = true;
    this.goD = true;
    this.goE = true;
    this.goF = true;
    GMTrace.o(4147059359744L, 30898);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4147193577472L, 30899);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4147193577472L, 30899);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fWY == k)
      {
        this.field_title = paramCursor.getString(i);
        this.fWU = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (goG == k) {
          this.field_loan_jump_url = paramCursor.getString(i);
        } else if (goH == k) {
          this.field_red_dot_index = paramCursor.getInt(i);
        } else if (goI == k) {
          this.field_is_show_entry = paramCursor.getInt(i);
        } else if (goJ == k) {
          this.field_tips = paramCursor.getString(i);
        } else if (goK == k) {
          this.field_is_overdue = paramCursor.getInt(i);
        } else if (goL == k) {
          this.field_available_otb = paramCursor.getString(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4147193577472L, 30899);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4147327795200L, 30900);
    ContentValues localContentValues = new ContentValues();
    if (this.fWU) {
      localContentValues.put("title", this.field_title);
    }
    if (this.goA) {
      localContentValues.put("loan_jump_url", this.field_loan_jump_url);
    }
    if (this.goB) {
      localContentValues.put("red_dot_index", Integer.valueOf(this.field_red_dot_index));
    }
    if (this.goC) {
      localContentValues.put("is_show_entry", Integer.valueOf(this.field_is_show_entry));
    }
    if (this.goD) {
      localContentValues.put("tips", this.field_tips);
    }
    if (this.goE) {
      localContentValues.put("is_overdue", Integer.valueOf(this.field_is_overdue));
    }
    if (this.goF) {
      localContentValues.put("available_otb", this.field_available_otb);
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4147327795200L, 30900);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/cd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */