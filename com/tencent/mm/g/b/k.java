package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class k
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fUL;
  private static final int fUM;
  private static final int fUO;
  private boolean fUH;
  private boolean fUI;
  private boolean fUN;
  public long field_updateTime;
  public String field_username;
  public int field_versionType;
  
  static
  {
    GMTrace.i(4139140513792L, 30839);
    fSf = new String[] { "CREATE INDEX IF NOT EXISTS AppBrandStarAppUpdateTimeIndex ON AppBrandStarApp(updateTime)" };
    fUO = "username".hashCode();
    fUL = "versionType".hashCode();
    fUM = "updateTime".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4139140513792L, 30839);
  }
  
  public k()
  {
    GMTrace.i(4138737860608L, 30836);
    this.fUN = true;
    this.fUH = true;
    this.fUI = true;
    GMTrace.o(4138737860608L, 30836);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4138872078336L, 30837);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4138872078336L, 30837);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fUO == k) {
        this.field_username = paramCursor.getString(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fUL == k) {
          this.field_versionType = paramCursor.getInt(i);
        } else if (fUM == k) {
          this.field_updateTime = paramCursor.getLong(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4138872078336L, 30837);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4139006296064L, 30838);
    ContentValues localContentValues = new ContentValues();
    if (this.fUN) {
      localContentValues.put("username", this.field_username);
    }
    if (this.fUH) {
      localContentValues.put("versionType", Integer.valueOf(this.field_versionType));
    }
    if (this.fUI) {
      localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4139006296064L, 30838);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */