package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class bg
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fTs;
  private static final int gdn;
  private static final int gjc;
  private static final int gjd;
  private boolean fSW;
  public long field_createTime;
  public String field_id;
  public String field_logContent;
  public int field_protocolNumber;
  private boolean gdk;
  private boolean gja;
  private boolean gjb;
  
  static
  {
    GMTrace.i(4120618467328L, 30701);
    fSf = new String[0];
    gdn = "id".hashCode();
    gjc = "protocolNumber".hashCode();
    gjd = "logContent".hashCode();
    fTs = "createTime".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4120618467328L, 30701);
  }
  
  public bg()
  {
    GMTrace.i(4120215814144L, 30698);
    this.gdk = true;
    this.gja = true;
    this.gjb = true;
    this.fSW = true;
    GMTrace.o(4120215814144L, 30698);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4120350031872L, 30699);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4120350031872L, 30699);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (gdn == k)
      {
        this.field_id = paramCursor.getString(i);
        this.gdk = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (gjc == k) {
          this.field_protocolNumber = paramCursor.getInt(i);
        } else if (gjd == k) {
          this.field_logContent = paramCursor.getString(i);
        } else if (fTs == k) {
          this.field_createTime = paramCursor.getLong(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4120350031872L, 30699);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4120484249600L, 30700);
    ContentValues localContentValues = new ContentValues();
    if (this.gdk) {
      localContentValues.put("id", this.field_id);
    }
    if (this.gja) {
      localContentValues.put("protocolNumber", Integer.valueOf(this.field_protocolNumber));
    }
    if (this.gjb) {
      localContentValues.put("logContent", this.field_logContent);
    }
    if (this.fSW) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4120484249600L, 30700);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */