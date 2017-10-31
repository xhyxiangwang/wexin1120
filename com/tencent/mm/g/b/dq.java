package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class dq
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int gyt;
  private static final int gyu;
  private static final int gyv;
  private static final int gyw;
  public int field_is_show;
  public String field_pref_key;
  public String field_pref_title;
  public String field_pref_url;
  private boolean gyp;
  private boolean gyq;
  private boolean gyr;
  private boolean gys;
  
  static
  {
    GMTrace.i(4167863107584L, 31053);
    fSf = new String[0];
    gyt = "pref_key".hashCode();
    gyu = "pref_title".hashCode();
    gyv = "pref_url".hashCode();
    gyw = "is_show".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4167863107584L, 31053);
  }
  
  public dq()
  {
    GMTrace.i(4167460454400L, 31050);
    this.gyp = true;
    this.gyq = true;
    this.gyr = true;
    this.gys = true;
    GMTrace.o(4167460454400L, 31050);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4167594672128L, 31051);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4167594672128L, 31051);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (gyt == k)
      {
        this.field_pref_key = paramCursor.getString(i);
        this.gyp = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (gyu == k) {
          this.field_pref_title = paramCursor.getString(i);
        } else if (gyv == k) {
          this.field_pref_url = paramCursor.getString(i);
        } else if (gyw == k) {
          this.field_is_show = paramCursor.getInt(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4167594672128L, 31051);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4167728889856L, 31052);
    ContentValues localContentValues = new ContentValues();
    if (this.gyp) {
      localContentValues.put("pref_key", this.field_pref_key);
    }
    if (this.gyq) {
      localContentValues.put("pref_title", this.field_pref_title);
    }
    if (this.gyr) {
      localContentValues.put("pref_url", this.field_pref_url);
    }
    if (this.gys) {
      localContentValues.put("is_show", Integer.valueOf(this.field_is_show));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4167728889856L, 31052);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/dq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */