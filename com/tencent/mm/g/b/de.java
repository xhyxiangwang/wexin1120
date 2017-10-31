package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class de
  extends c
{
  private static final int fSE;
  public static final String[] fSf;
  private static final int fSo;
  private static final int fUm;
  private static final int gvm;
  private static final int gvn;
  private static final int gvo;
  private boolean fSw;
  private boolean fTV;
  public int field_errorcount;
  public int field_logsize;
  public long field_logtime;
  public int field_offset;
  public byte[] field_value;
  private boolean gvj;
  private boolean gvk;
  private boolean gvl;
  
  static
  {
    GMTrace.i(4131758538752L, 30784);
    fSf = new String[] { "CREATE INDEX IF NOT EXISTS snsreport_kv_logtime ON SnsReportKv(logtime)" };
    gvm = "logtime".hashCode();
    fUm = "offset".hashCode();
    gvn = "logsize".hashCode();
    gvo = "errorcount".hashCode();
    fSE = "value".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4131758538752L, 30784);
  }
  
  public de()
  {
    GMTrace.i(4131355885568L, 30781);
    this.gvj = true;
    this.fTV = true;
    this.gvk = true;
    this.gvl = true;
    this.fSw = true;
    GMTrace.o(4131355885568L, 30781);
  }
  
  public void b(Cursor paramCursor)
  {
    GMTrace.i(4131490103296L, 30782);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4131490103296L, 30782);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (gvm == k) {
        this.field_logtime = paramCursor.getLong(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fUm == k) {
          this.field_offset = paramCursor.getInt(i);
        } else if (gvn == k) {
          this.field_logsize = paramCursor.getInt(i);
        } else if (gvo == k) {
          this.field_errorcount = paramCursor.getInt(i);
        } else if (fSE == k) {
          this.field_value = paramCursor.getBlob(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4131490103296L, 30782);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4131624321024L, 30783);
    ContentValues localContentValues = new ContentValues();
    if (this.gvj) {
      localContentValues.put("logtime", Long.valueOf(this.field_logtime));
    }
    if (this.fTV) {
      localContentValues.put("offset", Integer.valueOf(this.field_offset));
    }
    if (this.gvk) {
      localContentValues.put("logsize", Integer.valueOf(this.field_logsize));
    }
    if (this.gvl) {
      localContentValues.put("errorcount", Integer.valueOf(this.field_errorcount));
    }
    if (this.fSw) {
      localContentValues.put("value", this.field_value);
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4131624321024L, 30783);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/de.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */